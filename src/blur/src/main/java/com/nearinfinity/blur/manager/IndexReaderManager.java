package com.nearinfinity.blur.manager;

import java.util.Map;

import com.nearinfinity.blur.lucene.index.SuperIndexReader;


public interface IndexReaderManager extends UpdatableManager {
	
	Map<String,Map<String, SuperIndexReader>> getCurrentIndexReaders();

}