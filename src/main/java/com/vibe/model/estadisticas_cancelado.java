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

public class estadisticas_cancelado implements org.apache.thrift.TBase<estadisticas_cancelado, estadisticas_cancelado._Fields>, java.io.Serializable, Cloneable, Comparable<estadisticas_cancelado> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("estadisticas_cancelado");

  private static final org.apache.thrift.protocol.TField ESTADISTICA_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("estadisticaCode", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CANCELADO_FIELD_DESC = new org.apache.thrift.protocol.TField("cancelado", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TS_FIELD_DESC = new org.apache.thrift.protocol.TField("ts", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new estadisticas_canceladoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new estadisticas_canceladoTupleSchemeFactory());
  }

  public String estadisticaCode; // required
  public String cancelado; // required
  public String ts; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ESTADISTICA_CODE((short)1, "estadisticaCode"),
    CANCELADO((short)2, "cancelado"),
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
        case 1: // ESTADISTICA_CODE
          return ESTADISTICA_CODE;
        case 2: // CANCELADO
          return CANCELADO;
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
    tmpMap.put(_Fields.ESTADISTICA_CODE, new org.apache.thrift.meta_data.FieldMetaData("estadisticaCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CANCELADO, new org.apache.thrift.meta_data.FieldMetaData("cancelado", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TS, new org.apache.thrift.meta_data.FieldMetaData("ts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(estadisticas_cancelado.class, metaDataMap);
  }

  public estadisticas_cancelado() {
  }

  public estadisticas_cancelado(
    String estadisticaCode,
    String cancelado,
    String ts)
  {
    this();
    this.estadisticaCode = estadisticaCode;
    this.cancelado = cancelado;
    this.ts = ts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public estadisticas_cancelado(estadisticas_cancelado other) {
    if (other.isSetEstadisticaCode()) {
      this.estadisticaCode = other.estadisticaCode;
    }
    if (other.isSetCancelado()) {
      this.cancelado = other.cancelado;
    }
    if (other.isSetTs()) {
      this.ts = other.ts;
    }
  }

  public estadisticas_cancelado deepCopy() {
    return new estadisticas_cancelado(this);
  }

  @Override
  public void clear() {
    this.estadisticaCode = null;
    this.cancelado = null;
    this.ts = null;
  }

  public String getEstadisticaCode() {
    return this.estadisticaCode;
  }

  public estadisticas_cancelado setEstadisticaCode(String estadisticaCode) {
    this.estadisticaCode = estadisticaCode;
    return this;
  }

  public void unsetEstadisticaCode() {
    this.estadisticaCode = null;
  }

  /** Returns true if field estadisticaCode is set (has been assigned a value) and false otherwise */
  public boolean isSetEstadisticaCode() {
    return this.estadisticaCode != null;
  }

  public void setEstadisticaCodeIsSet(boolean value) {
    if (!value) {
      this.estadisticaCode = null;
    }
  }

  public String getCancelado() {
    return this.cancelado;
  }

  public estadisticas_cancelado setCancelado(String cancelado) {
    this.cancelado = cancelado;
    return this;
  }

  public void unsetCancelado() {
    this.cancelado = null;
  }

  /** Returns true if field cancelado is set (has been assigned a value) and false otherwise */
  public boolean isSetCancelado() {
    return this.cancelado != null;
  }

  public void setCanceladoIsSet(boolean value) {
    if (!value) {
      this.cancelado = null;
    }
  }

  public String getTs() {
    return this.ts;
  }

  public estadisticas_cancelado setTs(String ts) {
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
    case ESTADISTICA_CODE:
      if (value == null) {
        unsetEstadisticaCode();
      } else {
        setEstadisticaCode((String)value);
      }
      break;

    case CANCELADO:
      if (value == null) {
        unsetCancelado();
      } else {
        setCancelado((String)value);
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
    case ESTADISTICA_CODE:
      return getEstadisticaCode();

    case CANCELADO:
      return getCancelado();

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
    case ESTADISTICA_CODE:
      return isSetEstadisticaCode();
    case CANCELADO:
      return isSetCancelado();
    case TS:
      return isSetTs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof estadisticas_cancelado)
      return this.equals((estadisticas_cancelado)that);
    return false;
  }

  public boolean equals(estadisticas_cancelado that) {
    if (that == null)
      return false;

    boolean this_present_estadisticaCode = true && this.isSetEstadisticaCode();
    boolean that_present_estadisticaCode = true && that.isSetEstadisticaCode();
    if (this_present_estadisticaCode || that_present_estadisticaCode) {
      if (!(this_present_estadisticaCode && that_present_estadisticaCode))
        return false;
      if (!this.estadisticaCode.equals(that.estadisticaCode))
        return false;
    }

    boolean this_present_cancelado = true && this.isSetCancelado();
    boolean that_present_cancelado = true && that.isSetCancelado();
    if (this_present_cancelado || that_present_cancelado) {
      if (!(this_present_cancelado && that_present_cancelado))
        return false;
      if (!this.cancelado.equals(that.cancelado))
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
  public int compareTo(estadisticas_cancelado other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEstadisticaCode()).compareTo(other.isSetEstadisticaCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEstadisticaCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.estadisticaCode, other.estadisticaCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCancelado()).compareTo(other.isSetCancelado());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCancelado()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cancelado, other.cancelado);
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
    StringBuilder sb = new StringBuilder("estadisticas_cancelado(");
    boolean first = true;

    sb.append("estadisticaCode:");
    if (this.estadisticaCode == null) {
      sb.append("null");
    } else {
      sb.append(this.estadisticaCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cancelado:");
    if (this.cancelado == null) {
      sb.append("null");
    } else {
      sb.append(this.cancelado);
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

  private static class estadisticas_canceladoStandardSchemeFactory implements SchemeFactory {
    public estadisticas_canceladoStandardScheme getScheme() {
      return new estadisticas_canceladoStandardScheme();
    }
  }

  private static class estadisticas_canceladoStandardScheme extends StandardScheme<estadisticas_cancelado> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, estadisticas_cancelado struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ESTADISTICA_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.estadisticaCode = iprot.readString();
              struct.setEstadisticaCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CANCELADO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cancelado = iprot.readString();
              struct.setCanceladoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, estadisticas_cancelado struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.estadisticaCode != null) {
        oprot.writeFieldBegin(ESTADISTICA_CODE_FIELD_DESC);
        oprot.writeString(struct.estadisticaCode);
        oprot.writeFieldEnd();
      }
      if (struct.cancelado != null) {
        oprot.writeFieldBegin(CANCELADO_FIELD_DESC);
        oprot.writeString(struct.cancelado);
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

  private static class estadisticas_canceladoTupleSchemeFactory implements SchemeFactory {
    public estadisticas_canceladoTupleScheme getScheme() {
      return new estadisticas_canceladoTupleScheme();
    }
  }

  private static class estadisticas_canceladoTupleScheme extends TupleScheme<estadisticas_cancelado> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, estadisticas_cancelado struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEstadisticaCode()) {
        optionals.set(0);
      }
      if (struct.isSetCancelado()) {
        optionals.set(1);
      }
      if (struct.isSetTs()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetEstadisticaCode()) {
        oprot.writeString(struct.estadisticaCode);
      }
      if (struct.isSetCancelado()) {
        oprot.writeString(struct.cancelado);
      }
      if (struct.isSetTs()) {
        oprot.writeString(struct.ts);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, estadisticas_cancelado struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.estadisticaCode = iprot.readString();
        struct.setEstadisticaCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cancelado = iprot.readString();
        struct.setCanceladoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ts = iprot.readString();
        struct.setTsIsSet(true);
      }
    }
  }

}

