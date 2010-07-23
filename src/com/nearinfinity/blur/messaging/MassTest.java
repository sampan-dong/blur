package com.nearinfinity.blur.messaging;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.nearinfinity.blur.messaging.MasterController.MessageJoiner;
import com.nearinfinity.blur.search.SearchMessageHandler;

public class MassTest {

	public static void main(String[] args) throws Exception {
		
		int port = 3001;
		String hostname = "localhost/";
		List<String> hosts = new ArrayList<String>();
		List<BlurServer> servers = new ArrayList<BlurServer>();
		for (int i = 0; i < 30; i++) {
			servers.add(startServer(port+i));
			hosts.add(hostname + (port+i));
		}
		
		MessageJoiner joiner = new MessageJoiner() {
			@Override
			public byte[] join(Collection<byte[]> responses) {
				long total = 0;
				for (byte[] response : responses) {
					total += ByteBuffer.wrap(response).getLong();
				}
				return ByteBuffer.allocate(8).putLong(total).array();
			}
		};
		
		new MasterController(3000, hosts, joiner).start();
		
//		Thread.sleep(10000);
//		
//		System.out.println("Stoping server...");
//		
//		servers.get(0).stop();

	}

	private static BlurServer startServer(int port) throws Exception {
		BlurServer blurServer = new BlurServer(port, new SearchMessageHandler(new String[]{}));
		blurServer.start();
		return blurServer;
	}
	

}