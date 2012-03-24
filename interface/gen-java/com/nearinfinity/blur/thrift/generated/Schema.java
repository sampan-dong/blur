/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.nearinfinity.blur.thrift.generated;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
public class Schema implements org.apache.thrift.TBase<Schema, Schema._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Schema");

  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_FAMILIES_FIELD_DESC = new org.apache.thrift.protocol.TField("columnFamilies", org.apache.thrift.protocol.TType.MAP, (short)2);

  /**
   * 
   */
  public String table; // required
  /**
   * 
   */
  public Map<String,Set<String>> columnFamilies; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     */
    TABLE((short)1, "table"),
    /**
     * 
     */
    COLUMN_FAMILIES((short)2, "columnFamilies");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLE
          return TABLE;
        case 2: // COLUMN_FAMILIES
          return COLUMN_FAMILIES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMN_FAMILIES, new org.apache.thrift.meta_data.FieldMetaData("columnFamilies", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Schema.class, metaDataMap);
  }

  public Schema() {
  }

  public Schema(
    String table,
    Map<String,Set<String>> columnFamilies)
  {
    this();
    this.table = table;
    this.columnFamilies = columnFamilies;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Schema(Schema other) {
    if (other.isSetTable()) {
      this.table = other.table;
    }
    if (other.isSetColumnFamilies()) {
      Map<String,Set<String>> __this__columnFamilies = new HashMap<String,Set<String>>();
      for (Map.Entry<String, Set<String>> other_element : other.columnFamilies.entrySet()) {

        String other_element_key = other_element.getKey();
        Set<String> other_element_value = other_element.getValue();

        String __this__columnFamilies_copy_key = other_element_key;

        Set<String> __this__columnFamilies_copy_value = new HashSet<String>();
        for (String other_element_value_element : other_element_value) {
          __this__columnFamilies_copy_value.add(other_element_value_element);
        }

        __this__columnFamilies.put(__this__columnFamilies_copy_key, __this__columnFamilies_copy_value);
      }
      this.columnFamilies = __this__columnFamilies;
    }
  }

  public Schema deepCopy() {
    return new Schema(this);
  }

  @Override
  public void clear() {
    this.table = null;
    this.columnFamilies = null;
  }

  /**
   * 
   */
  public String getTable() {
    return this.table;
  }

  /**
   * 
   */
  public Schema setTable(String table) {
    this.table = table;
    return this;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been assigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  public int getColumnFamiliesSize() {
    return (this.columnFamilies == null) ? 0 : this.columnFamilies.size();
  }

  public void putToColumnFamilies(String key, Set<String> val) {
    if (this.columnFamilies == null) {
      this.columnFamilies = new HashMap<String,Set<String>>();
    }
    this.columnFamilies.put(key, val);
  }

  /**
   * 
   */
  public Map<String,Set<String>> getColumnFamilies() {
    return this.columnFamilies;
  }

  /**
   * 
   */
  public Schema setColumnFamilies(Map<String,Set<String>> columnFamilies) {
    this.columnFamilies = columnFamilies;
    return this;
  }

  public void unsetColumnFamilies() {
    this.columnFamilies = null;
  }

  /** Returns true if field columnFamilies is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnFamilies() {
    return this.columnFamilies != null;
  }

  public void setColumnFamiliesIsSet(boolean value) {
    if (!value) {
      this.columnFamilies = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((String)value);
      }
      break;

    case COLUMN_FAMILIES:
      if (value == null) {
        unsetColumnFamilies();
      } else {
        setColumnFamilies((Map<String,Set<String>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE:
      return getTable();

    case COLUMN_FAMILIES:
      return getColumnFamilies();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE:
      return isSetTable();
    case COLUMN_FAMILIES:
      return isSetColumnFamilies();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Schema)
      return this.equals((Schema)that);
    return false;
  }

  public boolean equals(Schema that) {
    if (that == null)
      return false;

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    boolean this_present_columnFamilies = true && this.isSetColumnFamilies();
    boolean that_present_columnFamilies = true && that.isSetColumnFamilies();
    if (this_present_columnFamilies || that_present_columnFamilies) {
      if (!(this_present_columnFamilies && that_present_columnFamilies))
        return false;
      if (!this.columnFamilies.equals(that.columnFamilies))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Schema other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Schema typedOther = (Schema)other;

    lastComparison = Boolean.valueOf(isSetTable()).compareTo(typedOther.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table, typedOther.table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnFamilies()).compareTo(typedOther.isSetColumnFamilies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnFamilies()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnFamilies, typedOther.columnFamilies);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TABLE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.table = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // COLUMN_FAMILIES
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map51 = iprot.readMapBegin();
              this.columnFamilies = new HashMap<String,Set<String>>(2*_map51.size);
              for (int _i52 = 0; _i52 < _map51.size; ++_i52)
              {
                String _key53; // required
                Set<String> _val54; // required
                _key53 = iprot.readString();
                {
                  org.apache.thrift.protocol.TSet _set55 = iprot.readSetBegin();
                  _val54 = new HashSet<String>(2*_set55.size);
                  for (int _i56 = 0; _i56 < _set55.size; ++_i56)
                  {
                    String _elem57; // required
                    _elem57 = iprot.readString();
                    _val54.add(_elem57);
                  }
                  iprot.readSetEnd();
                }
                this.columnFamilies.put(_key53, _val54);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.table != null) {
      oprot.writeFieldBegin(TABLE_FIELD_DESC);
      oprot.writeString(this.table);
      oprot.writeFieldEnd();
    }
    if (this.columnFamilies != null) {
      oprot.writeFieldBegin(COLUMN_FAMILIES_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.SET, this.columnFamilies.size()));
        for (Map.Entry<String, Set<String>> _iter58 : this.columnFamilies.entrySet())
        {
          oprot.writeString(_iter58.getKey());
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, _iter58.getValue().size()));
            for (String _iter59 : _iter58.getValue())
            {
              oprot.writeString(_iter59);
            }
            oprot.writeSetEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Schema(");
    boolean first = true;

    sb.append("table:");
    if (this.table == null) {
      sb.append("null");
    } else {
      sb.append(this.table);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columnFamilies:");
    if (this.columnFamilies == null) {
      sb.append("null");
    } else {
      sb.append(this.columnFamilies);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

