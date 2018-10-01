/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vibe.model;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

public class aeropuerto implements org.apache.thrift.TBase<aeropuerto, aeropuerto._Fields>, java.io.Serializable, Cloneable, Comparable<aeropuerto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("aeropuerto");

  private static final org.apache.thrift.protocol.TField AERO_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("aeroCode", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AERO_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("aeroName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TS_FIELD_DESC = new org.apache.thrift.protocol.TField("ts", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new aeropuertoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new aeropuertoTupleSchemeFactory());
  }

  public String aeroCode; // required
  public String aeroName; // required
  public String ts; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AERO_CODE((short)1, "aeroCode"),
    AERO_NAME((short)2, "aeroName"),
    TS((short)3, "ts");

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
        case 1: // AERO_CODE
          return AERO_CODE;
        case 2: // AERO_NAME
          return AERO_NAME;
        case 3: // TS
          return TS;
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
    tmpMap.put(_Fields.AERO_CODE, new org.apache.thrift.meta_data.FieldMetaData("aeroCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AERO_NAME, new org.apache.thrift.meta_data.FieldMetaData("aeroName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TS, new org.apache.thrift.meta_data.FieldMetaData("ts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(aeropuerto.class, metaDataMap);
  }

  public aeropuerto() {
  }

  public aeropuerto(
    String aeroCode,
    String aeroName,
    String ts)
  {
    this();
    this.aeroCode = aeroCode;
    this.aeroName = aeroName;
    this.ts = ts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public aeropuerto(aeropuerto other) {
    if (other.isSetAeroCode()) {
      this.aeroCode = other.aeroCode;
    }
    if (other.isSetAeroName()) {
      this.aeroName = other.aeroName;
    }
    if (other.isSetTs()) {
      this.ts = other.ts;
    }
  }

  public aeropuerto deepCopy() {
    return new aeropuerto(this);
  }

  @Override
  public void clear() {
    this.aeroCode = null;
    this.aeroName = null;
    this.ts = null;
  }

  public String getAeroCode() {
    return this.aeroCode;
  }

  public aeropuerto setAeroCode(String aeroCode) {
    this.aeroCode = aeroCode;
    return this;
  }

  public void unsetAeroCode() {
    this.aeroCode = null;
  }

  /** Returns true if field aeroCode is set (has been assigned a value) and false otherwise */
  public boolean isSetAeroCode() {
    return this.aeroCode != null;
  }

  public void setAeroCodeIsSet(boolean value) {
    if (!value) {
      this.aeroCode = null;
    }
  }

  public String getAeroName() {
    return this.aeroName;
  }

  public aeropuerto setAeroName(String aeroName) {
    this.aeroName = aeroName;
    return this;
  }

  public void unsetAeroName() {
    this.aeroName = null;
  }

  /** Returns true if field aeroName is set (has been assigned a value) and false otherwise */
  public boolean isSetAeroName() {
    return this.aeroName != null;
  }

  public void setAeroNameIsSet(boolean value) {
    if (!value) {
      this.aeroName = null;
    }
  }

  public String getTs() {
    return this.ts;
  }

  public aeropuerto setTs(String ts) {
    this.ts = ts;
    return this;
  }

  public void unsetTs() {
    this.ts = null;
  }

  /** Returns true if field ts is set (has been assigned a value) and false otherwise */
  public boolean isSetTs() {
    return this.ts != null;
  }

  public void setTsIsSet(boolean value) {
    if (!value) {
      this.ts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AERO_CODE:
      if (value == null) {
        unsetAeroCode();
      } else {
        setAeroCode((String)value);
      }
      break;

    case AERO_NAME:
      if (value == null) {
        unsetAeroName();
      } else {
        setAeroName((String)value);
      }
      break;

    case TS:
      if (value == null) {
        unsetTs();
      } else {
        setTs((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AERO_CODE:
      return getAeroCode();

    case AERO_NAME:
      return getAeroName();

    case TS:
      return getTs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AERO_CODE:
      return isSetAeroCode();
    case AERO_NAME:
      return isSetAeroName();
    case TS:
      return isSetTs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof aeropuerto)
      return this.equals((aeropuerto)that);
    return false;
  }

  public boolean equals(aeropuerto that) {
    if (that == null)
      return false;

    boolean this_present_aeroCode = true && this.isSetAeroCode();
    boolean that_present_aeroCode = true && that.isSetAeroCode();
    if (this_present_aeroCode || that_present_aeroCode) {
      if (!(this_present_aeroCode && that_present_aeroCode))
        return false;
      if (!this.aeroCode.equals(that.aeroCode))
        return false;
    }

    boolean this_present_aeroName = true && this.isSetAeroName();
    boolean that_present_aeroName = true && that.isSetAeroName();
    if (this_present_aeroName || that_present_aeroName) {
      if (!(this_present_aeroName && that_present_aeroName))
        return false;
      if (!this.aeroName.equals(that.aeroName))
        return false;
    }

    boolean this_present_ts = true && this.isSetTs();
    boolean that_present_ts = true && that.isSetTs();
    if (this_present_ts || that_present_ts) {
      if (!(this_present_ts && that_present_ts))
        return false;
      if (!this.ts.equals(that.ts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(aeropuerto other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAeroCode()).compareTo(other.isSetAeroCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAeroCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aeroCode, other.aeroCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAeroName()).compareTo(other.isSetAeroName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAeroName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aeroName, other.aeroName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTs()).compareTo(other.isSetTs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ts, other.ts);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("aeropuerto(");
    boolean first = true;

    sb.append("aeroCode:");
    if (this.aeroCode == null) {
      sb.append("null");
    } else {
      sb.append(this.aeroCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("aeroName:");
    if (this.aeroName == null) {
      sb.append("null");
    } else {
      sb.append(this.aeroName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ts:");
    if (this.ts == null) {
      sb.append("null");
    } else {
      sb.append(this.ts);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class aeropuertoStandardSchemeFactory implements SchemeFactory {
    public aeropuertoStandardScheme getScheme() {
      return new aeropuertoStandardScheme();
    }
  }

  private static class aeropuertoStandardScheme extends StandardScheme<aeropuerto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, aeropuerto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AERO_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.aeroCode = iprot.readString();
              struct.setAeroCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AERO_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.aeroName = iprot.readString();
              struct.setAeroNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ts = iprot.readString();
              struct.setTsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, aeropuerto struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.aeroCode != null) {
        oprot.writeFieldBegin(AERO_CODE_FIELD_DESC);
        oprot.writeString(struct.aeroCode);
        oprot.writeFieldEnd();
      }
      if (struct.aeroName != null) {
        oprot.writeFieldBegin(AERO_NAME_FIELD_DESC);
        oprot.writeString(struct.aeroName);
        oprot.writeFieldEnd();
      }
      if (struct.ts != null) {
        oprot.writeFieldBegin(TS_FIELD_DESC);
        oprot.writeString(struct.ts);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class aeropuertoTupleSchemeFactory implements SchemeFactory {
    public aeropuertoTupleScheme getScheme() {
      return new aeropuertoTupleScheme();
    }
  }

  private static class aeropuertoTupleScheme extends TupleScheme<aeropuerto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, aeropuerto struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAeroCode()) {
        optionals.set(0);
      }
      if (struct.isSetAeroName()) {
        optionals.set(1);
      }
      if (struct.isSetTs()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAeroCode()) {
        oprot.writeString(struct.aeroCode);
      }
      if (struct.isSetAeroName()) {
        oprot.writeString(struct.aeroName);
      }
      if (struct.isSetTs()) {
        oprot.writeString(struct.ts);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, aeropuerto struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.aeroCode = iprot.readString();
        struct.setAeroCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.aeroName = iprot.readString();
        struct.setAeroNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ts = iprot.readString();
        struct.setTsIsSet(true);
      }
    }
  }

}

