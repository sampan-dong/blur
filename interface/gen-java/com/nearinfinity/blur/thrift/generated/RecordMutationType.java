/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.nearinfinity.blur.thrift.generated;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Specifies the type of Record mutation that should occur during a mutation of a given Record.<br/><br/>
 * DELETE_ENTIRE_RECORD -  Indicates the Record with the given recordId in the given Row is to be deleted.  If the target record does not exist, then no changes are made.<br/><br/>
 * REPLACE_ENTIRE_RECORD - Indicates the Record with the given recordId in the given Row is to be deleted, and a new Record with the same id is to be added. If the specified record does not exist the new record is still added.<br/><br/>
 * REPLACE_COLUMNS - Replace the columns that are specified in the Record mutation.  If the target record does not exist then this mutation will result in a BlurException.<br/><br/>
 * APPEND_COLUMN_VALUES - Append the columns in the Record mutation to the Record that could already exist.  If the target record does not exist then this mutation will result in a BlurException.<br/>
 */
public enum RecordMutationType implements org.apache.thrift.TEnum {
  DELETE_ENTIRE_RECORD(0),
  REPLACE_ENTIRE_RECORD(1),
  REPLACE_COLUMNS(2),
  APPEND_COLUMN_VALUES(3);

  private final int value;

  private RecordMutationType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static RecordMutationType findByValue(int value) { 
    switch (value) {
      case 0:
        return DELETE_ENTIRE_RECORD;
      case 1:
        return REPLACE_ENTIRE_RECORD;
      case 2:
        return REPLACE_COLUMNS;
      case 3:
        return APPEND_COLUMN_VALUES;
      default:
        return null;
    }
  }
}
