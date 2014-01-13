/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.talool.iris.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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

public class Location_t implements org.apache.thrift.TBase<Location_t, Location_t._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Location_t");

  private static final org.apache.thrift.protocol.TField LONGITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("longitude", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField LATITUDE_FIELD_DESC = new org.apache.thrift.protocol.TField("latitude", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new Location_tStandardSchemeFactory());
    schemes.put(TupleScheme.class, new Location_tTupleSchemeFactory());
  }

  public double longitude; // required
  public double latitude; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LONGITUDE((short)1, "longitude"),
    LATITUDE((short)2, "latitude");

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
        case 1: // LONGITUDE
          return LONGITUDE;
        case 2: // LATITUDE
          return LATITUDE;
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
  private static final int __LONGITUDE_ISSET_ID = 0;
  private static final int __LATITUDE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LONGITUDE, new org.apache.thrift.meta_data.FieldMetaData("longitude", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LATITUDE, new org.apache.thrift.meta_data.FieldMetaData("latitude", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Location_t.class, metaDataMap);
  }

  public Location_t() {
  }

  public Location_t(
    double longitude,
    double latitude)
  {
    this();
    this.longitude = longitude;
    setLongitudeIsSet(true);
    this.latitude = latitude;
    setLatitudeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Location_t(Location_t other) {
    __isset_bitfield = other.__isset_bitfield;
    this.longitude = other.longitude;
    this.latitude = other.latitude;
  }

  public Location_t deepCopy() {
    return new Location_t(this);
  }

  public void clear() {
    setLongitudeIsSet(false);
    this.longitude = 0.0;
    setLatitudeIsSet(false);
    this.latitude = 0.0;
  }

  public double getLongitude() {
    return this.longitude;
  }

  public Location_t setLongitude(double longitude) {
    this.longitude = longitude;
    setLongitudeIsSet(true);
    return this;
  }

  public void unsetLongitude() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LONGITUDE_ISSET_ID);
  }

  /** Returns true if field longitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLongitude() {
    return EncodingUtils.testBit(__isset_bitfield, __LONGITUDE_ISSET_ID);
  }

  public void setLongitudeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LONGITUDE_ISSET_ID, value);
  }

  public double getLatitude() {
    return this.latitude;
  }

  public Location_t setLatitude(double latitude) {
    this.latitude = latitude;
    setLatitudeIsSet(true);
    return this;
  }

  public void unsetLatitude() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LATITUDE_ISSET_ID);
  }

  /** Returns true if field latitude is set (has been assigned a value) and false otherwise */
  public boolean isSetLatitude() {
    return EncodingUtils.testBit(__isset_bitfield, __LATITUDE_ISSET_ID);
  }

  public void setLatitudeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LATITUDE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LONGITUDE:
      if (value == null) {
        unsetLongitude();
      } else {
        setLongitude((Double)value);
      }
      break;

    case LATITUDE:
      if (value == null) {
        unsetLatitude();
      } else {
        setLatitude((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LONGITUDE:
      return Double.valueOf(getLongitude());

    case LATITUDE:
      return Double.valueOf(getLatitude());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LONGITUDE:
      return isSetLongitude();
    case LATITUDE:
      return isSetLatitude();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Location_t)
      return this.equals((Location_t)that);
    return false;
  }

  public boolean equals(Location_t that) {
    if (that == null)
      return false;

    boolean this_present_longitude = true;
    boolean that_present_longitude = true;
    if (this_present_longitude || that_present_longitude) {
      if (!(this_present_longitude && that_present_longitude))
        return false;
      if (this.longitude != that.longitude)
        return false;
    }

    boolean this_present_latitude = true;
    boolean that_present_latitude = true;
    if (this_present_latitude || that_present_latitude) {
      if (!(this_present_latitude && that_present_latitude))
        return false;
      if (this.latitude != that.latitude)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Location_t other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Location_t typedOther = (Location_t)other;

    lastComparison = Boolean.valueOf(isSetLongitude()).compareTo(typedOther.isSetLongitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longitude, typedOther.longitude);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLatitude()).compareTo(typedOther.isSetLatitude());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatitude()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latitude, typedOther.latitude);
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
    StringBuilder sb = new StringBuilder("Location_t(");
    boolean first = true;

    sb.append("longitude:");
    sb.append(this.longitude);
    first = false;
    if (!first) sb.append(", ");
    sb.append("latitude:");
    sb.append(this.latitude);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'longitude' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'latitude' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class Location_tStandardSchemeFactory implements SchemeFactory {
    public Location_tStandardScheme getScheme() {
      return new Location_tStandardScheme();
    }
  }

  private static class Location_tStandardScheme extends StandardScheme<Location_t> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Location_t struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LONGITUDE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.longitude = iprot.readDouble();
              struct.setLongitudeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LATITUDE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.latitude = iprot.readDouble();
              struct.setLatitudeIsSet(true);
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
      if (!struct.isSetLongitude()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'longitude' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLatitude()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'latitude' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Location_t struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LONGITUDE_FIELD_DESC);
      oprot.writeDouble(struct.longitude);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LATITUDE_FIELD_DESC);
      oprot.writeDouble(struct.latitude);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Location_tTupleSchemeFactory implements SchemeFactory {
    public Location_tTupleScheme getScheme() {
      return new Location_tTupleScheme();
    }
  }

  private static class Location_tTupleScheme extends TupleScheme<Location_t> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Location_t struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeDouble(struct.longitude);
      oprot.writeDouble(struct.latitude);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Location_t struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.longitude = iprot.readDouble();
      struct.setLongitudeIsSet(true);
      struct.latitude = iprot.readDouble();
      struct.setLatitudeIsSet(true);
    }
  }

}

