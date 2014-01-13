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

public class Iris_t {

  public interface Iface {

    public void getNotificationMessages(CustomerMetadata_t customerMetadata) throws IrisException_t, org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void getNotificationMessages(CustomerMetadata_t customerMetadata, org.apache.thrift.async.AsyncMethodCallback<AsyncClient.getNotificationMessages_call> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void getNotificationMessages(CustomerMetadata_t customerMetadata) throws IrisException_t, org.apache.thrift.TException
    {
      send_getNotificationMessages(customerMetadata);
      recv_getNotificationMessages();
    }

    public void send_getNotificationMessages(CustomerMetadata_t customerMetadata) throws org.apache.thrift.TException
    {
      getNotificationMessages_args args = new getNotificationMessages_args();
      args.setCustomerMetadata(customerMetadata);
      sendBase("getNotificationMessages", args);
    }

    public void recv_getNotificationMessages() throws IrisException_t, org.apache.thrift.TException
    {
      getNotificationMessages_result result = new getNotificationMessages_result();
      receiveBase(result, "getNotificationMessages");
      if (result.error != null) {
        throw result.error;
      }
      return;
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void getNotificationMessages(CustomerMetadata_t customerMetadata, org.apache.thrift.async.AsyncMethodCallback<getNotificationMessages_call> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      getNotificationMessages_call method_call = new getNotificationMessages_call(customerMetadata, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class getNotificationMessages_call extends org.apache.thrift.async.TAsyncMethodCall {
      private CustomerMetadata_t customerMetadata;
      public getNotificationMessages_call(CustomerMetadata_t customerMetadata, org.apache.thrift.async.AsyncMethodCallback<getNotificationMessages_call> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.customerMetadata = customerMetadata;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("getNotificationMessages", org.apache.thrift.protocol.TMessageType.CALL, 0));
        getNotificationMessages_args args = new getNotificationMessages_args();
        args.setCustomerMetadata(customerMetadata);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public void getResult() throws IrisException_t, org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        (new Client(prot)).recv_getNotificationMessages();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("getNotificationMessages", new getNotificationMessages());
      return processMap;
    }

    public static class getNotificationMessages<I extends Iface> extends org.apache.thrift.ProcessFunction<I, getNotificationMessages_args> {
      public getNotificationMessages() {
        super("getNotificationMessages");
      }

      public getNotificationMessages_args getEmptyArgsInstance() {
        return new getNotificationMessages_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public getNotificationMessages_result getResult(I iface, getNotificationMessages_args args) throws org.apache.thrift.TException {
        getNotificationMessages_result result = new getNotificationMessages_result();
        try {
          iface.getNotificationMessages(args.customerMetadata);
        } catch (IrisException_t error) {
          result.error = error;
        }
        return result;
      }
    }

  }

  public static class getNotificationMessages_args implements org.apache.thrift.TBase<getNotificationMessages_args, getNotificationMessages_args._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getNotificationMessages_args");

    private static final org.apache.thrift.protocol.TField CUSTOMER_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("customerMetadata", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getNotificationMessages_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new getNotificationMessages_argsTupleSchemeFactory());
    }

    public CustomerMetadata_t customerMetadata; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      CUSTOMER_METADATA((short)1, "customerMetadata");

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
          case 1: // CUSTOMER_METADATA
            return CUSTOMER_METADATA;
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
      tmpMap.put(_Fields.CUSTOMER_METADATA, new org.apache.thrift.meta_data.FieldMetaData("customerMetadata", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CustomerMetadata_t.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getNotificationMessages_args.class, metaDataMap);
    }

    public getNotificationMessages_args() {
    }

    public getNotificationMessages_args(
      CustomerMetadata_t customerMetadata)
    {
      this();
      this.customerMetadata = customerMetadata;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getNotificationMessages_args(getNotificationMessages_args other) {
      if (other.isSetCustomerMetadata()) {
        this.customerMetadata = new CustomerMetadata_t(other.customerMetadata);
      }
    }

    public getNotificationMessages_args deepCopy() {
      return new getNotificationMessages_args(this);
    }

    public void clear() {
      this.customerMetadata = null;
    }

    public CustomerMetadata_t getCustomerMetadata() {
      return this.customerMetadata;
    }

    public getNotificationMessages_args setCustomerMetadata(CustomerMetadata_t customerMetadata) {
      this.customerMetadata = customerMetadata;
      return this;
    }

    public void unsetCustomerMetadata() {
      this.customerMetadata = null;
    }

    /** Returns true if field customerMetadata is set (has been assigned a value) and false otherwise */
    public boolean isSetCustomerMetadata() {
      return this.customerMetadata != null;
    }

    public void setCustomerMetadataIsSet(boolean value) {
      if (!value) {
        this.customerMetadata = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case CUSTOMER_METADATA:
        if (value == null) {
          unsetCustomerMetadata();
        } else {
          setCustomerMetadata((CustomerMetadata_t)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case CUSTOMER_METADATA:
        return getCustomerMetadata();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case CUSTOMER_METADATA:
        return isSetCustomerMetadata();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof getNotificationMessages_args)
        return this.equals((getNotificationMessages_args)that);
      return false;
    }

    public boolean equals(getNotificationMessages_args that) {
      if (that == null)
        return false;

      boolean this_present_customerMetadata = true && this.isSetCustomerMetadata();
      boolean that_present_customerMetadata = true && that.isSetCustomerMetadata();
      if (this_present_customerMetadata || that_present_customerMetadata) {
        if (!(this_present_customerMetadata && that_present_customerMetadata))
          return false;
        if (!this.customerMetadata.equals(that.customerMetadata))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(getNotificationMessages_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      getNotificationMessages_args typedOther = (getNotificationMessages_args)other;

      lastComparison = Boolean.valueOf(isSetCustomerMetadata()).compareTo(typedOther.isSetCustomerMetadata());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetCustomerMetadata()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.customerMetadata, typedOther.customerMetadata);
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
      StringBuilder sb = new StringBuilder("getNotificationMessages_args(");
      boolean first = true;

      sb.append("customerMetadata:");
      if (this.customerMetadata == null) {
        sb.append("null");
      } else {
        sb.append(this.customerMetadata);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (customerMetadata != null) {
        customerMetadata.validate();
      }
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te.getMessage());
      }
    }

    private static class getNotificationMessages_argsStandardSchemeFactory implements SchemeFactory {
      public getNotificationMessages_argsStandardScheme getScheme() {
        return new getNotificationMessages_argsStandardScheme();
      }
    }

    private static class getNotificationMessages_argsStandardScheme extends StandardScheme<getNotificationMessages_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getNotificationMessages_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // CUSTOMER_METADATA
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.customerMetadata = new CustomerMetadata_t();
                struct.customerMetadata.read(iprot);
                struct.setCustomerMetadataIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getNotificationMessages_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.customerMetadata != null) {
          oprot.writeFieldBegin(CUSTOMER_METADATA_FIELD_DESC);
          struct.customerMetadata.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class getNotificationMessages_argsTupleSchemeFactory implements SchemeFactory {
      public getNotificationMessages_argsTupleScheme getScheme() {
        return new getNotificationMessages_argsTupleScheme();
      }
    }

    private static class getNotificationMessages_argsTupleScheme extends TupleScheme<getNotificationMessages_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, getNotificationMessages_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetCustomerMetadata()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetCustomerMetadata()) {
          struct.customerMetadata.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, getNotificationMessages_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.customerMetadata = new CustomerMetadata_t();
          struct.customerMetadata.read(iprot);
          struct.setCustomerMetadataIsSet(true);
        }
      }
    }

  }

  public static class getNotificationMessages_result implements org.apache.thrift.TBase<getNotificationMessages_result, getNotificationMessages_result._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getNotificationMessages_result");

    private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getNotificationMessages_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new getNotificationMessages_resultTupleSchemeFactory());
    }

    public IrisException_t error; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      ERROR((short)1, "error");

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
          case 1: // ERROR
            return ERROR;
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
      tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getNotificationMessages_result.class, metaDataMap);
    }

    public getNotificationMessages_result() {
    }

    public getNotificationMessages_result(
      IrisException_t error)
    {
      this();
      this.error = error;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getNotificationMessages_result(getNotificationMessages_result other) {
      if (other.isSetError()) {
        this.error = new IrisException_t(other.error);
      }
    }

    public getNotificationMessages_result deepCopy() {
      return new getNotificationMessages_result(this);
    }

    public void clear() {
      this.error = null;
    }

    public IrisException_t getError() {
      return this.error;
    }

    public getNotificationMessages_result setError(IrisException_t error) {
      this.error = error;
      return this;
    }

    public void unsetError() {
      this.error = null;
    }

    /** Returns true if field error is set (has been assigned a value) and false otherwise */
    public boolean isSetError() {
      return this.error != null;
    }

    public void setErrorIsSet(boolean value) {
      if (!value) {
        this.error = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case ERROR:
        if (value == null) {
          unsetError();
        } else {
          setError((IrisException_t)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case ERROR:
        return getError();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case ERROR:
        return isSetError();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof getNotificationMessages_result)
        return this.equals((getNotificationMessages_result)that);
      return false;
    }

    public boolean equals(getNotificationMessages_result that) {
      if (that == null)
        return false;

      boolean this_present_error = true && this.isSetError();
      boolean that_present_error = true && that.isSetError();
      if (this_present_error || that_present_error) {
        if (!(this_present_error && that_present_error))
          return false;
        if (!this.error.equals(that.error))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(getNotificationMessages_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      getNotificationMessages_result typedOther = (getNotificationMessages_result)other;

      lastComparison = Boolean.valueOf(isSetError()).compareTo(typedOther.isSetError());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetError()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, typedOther.error);
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
      StringBuilder sb = new StringBuilder("getNotificationMessages_result(");
      boolean first = true;

      sb.append("error:");
      if (this.error == null) {
        sb.append("null");
      } else {
        sb.append(this.error);
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
        throw new java.io.IOException(te.getMessage());
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te.getMessage());
      }
    }

    private static class getNotificationMessages_resultStandardSchemeFactory implements SchemeFactory {
      public getNotificationMessages_resultStandardScheme getScheme() {
        return new getNotificationMessages_resultStandardScheme();
      }
    }

    private static class getNotificationMessages_resultStandardScheme extends StandardScheme<getNotificationMessages_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getNotificationMessages_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // ERROR
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.error = new IrisException_t();
                struct.error.read(iprot);
                struct.setErrorIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getNotificationMessages_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.error != null) {
          oprot.writeFieldBegin(ERROR_FIELD_DESC);
          struct.error.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class getNotificationMessages_resultTupleSchemeFactory implements SchemeFactory {
      public getNotificationMessages_resultTupleScheme getScheme() {
        return new getNotificationMessages_resultTupleScheme();
      }
    }

    private static class getNotificationMessages_resultTupleScheme extends TupleScheme<getNotificationMessages_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, getNotificationMessages_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetError()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetError()) {
          struct.error.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, getNotificationMessages_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.error = new IrisException_t();
          struct.error.read(iprot);
          struct.setErrorIsSet(true);
        }
      }
    }

  }

}
