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

public class aeropuerto_carrier implements org.apache.thrift.TBase<aeropuerto_carrier, aeropuerto_carrier._Fields>, java.io.Serializable, Cloneable, Comparable<aeropuerto_carrier> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("aeropuerto_carrier");

  private static final org.apache.thrift.protocol.TField AERO_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("aeroCode", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CARRIER_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("carrierCode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TS_FIELD_DESC = new org.apache.thrift.protocol.TField("ts", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new aeropuerto_carrierStandardSchemeFactory());
    schemes.put(TupleScheme.class, new aeropuerto_carrierTupleSchemeFactory());
  }

  public String aeroCode; // required
  public String carrierCode; // required
  public String ts; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AERO_CODE((short)1, "aeroCode"),
    CARRIER_CODE((short)2, "carrierCode"),
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
        case 2: // CARRIER_CODE
          return CARRIER_CODE;
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
    tmpMap.put(_Fields.CARRIER_CODE, new org.apache.thrift.meta_data.FieldMetaData("carrierCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TS, new org.apache.thrift.meta_data.FieldMetaData("ts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(aeropuerto_carrier.class, metaDataMap);
  }

  public aeropuerto_carrier() {
  }

  public aeropuerto_carrier(
    String aeroCode,
    String carrierCode,
    String ts)
  {
    this();
    this.aeroCode = aeroCode;
    this.carrierCode = carrierCode;
    this.ts = ts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public aeropuerto_carrier(aeropuerto_carrier other) {
    if (other.isSetAeroCode()) {
      this.aeroCode = other.aeroCode;
    }
    if (other.isSetCarrierCode()) {
      this.carrierCode = other.carrierCode;
    }
    if (other.isSetTs()) {
      this.ts = other.ts;
    }
  }

  public aeropuerto_carrier deepCopy() {
    return new aeropuerto_carrier(this);
  }

  @Override
  public void clear() {
    this.aeroCode = null;
    this.carrierCode = null;
    this.ts = null;
  }

  public String getAeroCode() {
    return this.aeroCode;
  }

  public aeropuerto_carrier setAeroCode(String aeroCode) {
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

  public String getCarrierCode() {
    return this.carrierCode;
  }

  public aeropuerto_carrier setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

  public void unsetCarrierCode() {
    this.carrierCode = null;
  }

  /** Returns true if field carrierCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCarrierCode() {
    return this.carrierCode != null;
  }

  public void setCarrierCodeIsSet(boolean value) {
    if (!value) {
      this.carrierCode = null;
    }
  }

  public String getTs() {
    return this.ts;
  }

  public aeropuerto_carrier setTs(String ts) {
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

    case CARRIER_CODE:
      if (value == null) {
        unsetCarrierCode();
      } else {
        setCarrierCode((String)value);
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

    case CARRIER_CODE:
      return getCarrierCode();

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
    case CARRIER_CODE:
      return isSetCarrierCode();
    case TS:
      return isSetTs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof aeropuerto_carrier)
      return this.equals((aeropuerto_carrier)that);
    return false;
  }

  public boolean equals(aeropuerto_carrier that) {
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

    boolean this_present_carrierCode = true && this.isSetCarrierCode();
    boolean that_present_carrierCode = true && that.isSetCarrierCode();
    if (this_present_carrierCode || that_present_carrierCode) {
      if (!(this_present_carrierCode && that_present_carrierCode))
        return false;
      if (!this.carrierCode.equals(that.carrierCode))
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
  public int compareTo(aeropuerto_carrier other) {
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
    lastComparison = Boolean.valueOf(isSetCarrierCode()).compareTo(other.isSetCarrierCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCarrierCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.carrierCode, other.carrierCode);
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
    StringBuilder sb = new StringBuilder("aeropuerto_carrier(");
    boolean first = true;

    sb.append("aeroCode:");
    if (this.aeroCode == null) {
      sb.append("null");
    } else {
      sb.append(this.aeroCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("carrierCode:");
    if (this.carrierCode == null) {
      sb.append("null");
    } else {
      sb.append(this.carrierCode);
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

  private static class aeropuerto_carrierStandardSchemeFactory implements SchemeFactory {
    public aeropuerto_carrierStandardScheme getScheme() {
      return new aeropuerto_carrierStandardScheme();
    }
  }

  private static class aeropuerto_carrierStandardScheme extends StandardScheme<aeropuerto_carrier> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, aeropuerto_carrier struct) throws org.apache.thrift.TException {
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
          case 2: // CARRIER_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.carrierCode = iprot.readString();
              struct.setCarrierCodeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, aeropuerto_carrier struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.aeroCode != null) {
        oprot.writeFieldBegin(AERO_CODE_FIELD_DESC);
        oprot.writeString(struct.aeroCode);
        oprot.writeFieldEnd();
      }
      if (struct.carrierCode != null) {
        oprot.writeFieldBegin(CARRIER_CODE_FIELD_DESC);
        oprot.writeString(struct.carrierCode);
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

  private static class aeropuerto_carrierTupleSchemeFactory implements SchemeFactory {
    public aeropuerto_carrierTupleScheme getScheme() {
      return new aeropuerto_carrierTupleScheme();
    }
  }

  private static class aeropuerto_carrierTupleScheme extends TupleScheme<aeropuerto_carrier> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, aeropuerto_carrier struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAeroCode()) {
        optionals.set(0);
      }
      if (struct.isSetCarrierCode()) {
        optionals.set(1);
      }
      if (struct.isSetTs()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAeroCode()) {
        oprot.writeString(struct.aeroCode);
      }
      if (struct.isSetCarrierCode()) {
        oprot.writeString(struct.carrierCode);
      }
      if (struct.isSetTs()) {
        oprot.writeString(struct.ts);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, aeropuerto_carrier struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.aeroCode = iprot.readString();
        struct.setAeroCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.carrierCode = iprot.readString();
        struct.setCarrierCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ts = iprot.readString();
        struct.setTsIsSet(true);
      }
    }
  }

}

