// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmergencyServerClient.proto

package com.proto.EmergencyServerClient;

/**
 * <pre>
 *create the message
 * </pre>
 *
 * Protobuf type {@code EmergencyServerClient.EmergencyUnary}
 */
public  final class Emergency extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EmergencyServerClient.EmergencyUnary)
    EmergencyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmergencyUnary.newBuilder() to construct.
  private Emergency(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Emergency() {
    patientFirstName_ = "";
    patientLastName_ = "";
    age_ = 0;
    address_ = "";
    highBloodPressure_ = "";
    medication_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Emergency(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            patientFirstName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            patientLastName_ = s;
            break;
          }
          case 24: {

            age_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            address_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            highBloodPressure_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            medication_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.EmergencyServerClient.EmergencyServerClientOuterClass.internal_static_EmergencyServerClient_Emergency_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.EmergencyServerClient.EmergencyServerClientOuterClass.internal_static_EmergencyServerClient_Emergency_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.EmergencyServerClient.Emergency.class, com.proto.EmergencyServerClient.Emergency.Builder.class);
  }

  public static final int PATIENTFIRST_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object patientFirstName_;
  /**
   * <code>string PatientFirst_name = 1;</code>
   */
  public java.lang.String getPatientFirstName() {
    java.lang.Object ref = patientFirstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      patientFirstName_ = s;
      return s;
    }
  }
  /**
   * <code>string PatientFirst_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPatientFirstNameBytes() {
    java.lang.Object ref = patientFirstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      patientFirstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATIENTLAST_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object patientLastName_;
  /**
   * <code>string PatientLast_name = 2;</code>
   */
  public java.lang.String getPatientLastName() {
    java.lang.Object ref = patientLastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      patientLastName_ = s;
      return s;
    }
  }
  /**
   * <code>string PatientLast_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPatientLastNameBytes() {
    java.lang.Object ref = patientLastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      patientLastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 3;
  private int age_;
  /**
   * <code>int32 age = 3;</code>
   */
  public int getAge() {
    return age_;
  }

  public static final int ADDRESS_FIELD_NUMBER = 4;
  private volatile java.lang.Object address_;
  /**
   * <code>string Address = 4;</code>
   */
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string Address = 4;</code>
   */
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HIGH_BLOOD_PRESSURE_FIELD_NUMBER = 5;
  private volatile java.lang.Object highBloodPressure_;
  /**
   * <code>string high_Blood_pressure = 5;</code>
   */
  public java.lang.String getHighBloodPressure() {
    java.lang.Object ref = highBloodPressure_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      highBloodPressure_ = s;
      return s;
    }
  }
  /**
   * <code>string high_Blood_pressure = 5;</code>
   */
  public com.google.protobuf.ByteString
      getHighBloodPressureBytes() {
    java.lang.Object ref = highBloodPressure_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      highBloodPressure_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEDICATION_FIELD_NUMBER = 6;
  private volatile java.lang.Object medication_;
  /**
   * <code>string Medication = 6;</code>
   */
  public java.lang.String getMedication() {
    java.lang.Object ref = medication_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      medication_ = s;
      return s;
    }
  }
  /**
   * <code>string Medication = 6;</code>
   */
  public com.google.protobuf.ByteString
      getMedicationBytes() {
    java.lang.Object ref = medication_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      medication_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPatientFirstNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, patientFirstName_);
    }
    if (!getPatientLastNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, patientLastName_);
    }
    if (age_ != 0) {
      output.writeInt32(3, age_);
    }
    if (!getAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, address_);
    }
    if (!getHighBloodPressureBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, highBloodPressure_);
    }
    if (!getMedicationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, medication_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPatientFirstNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, patientFirstName_);
    }
    if (!getPatientLastNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, patientLastName_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, age_);
    }
    if (!getAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, address_);
    }
    if (!getHighBloodPressureBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, highBloodPressure_);
    }
    if (!getMedicationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, medication_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.EmergencyServerClient.Emergency)) {
      return super.equals(obj);
    }
    com.proto.EmergencyServerClient.Emergency other = (com.proto.EmergencyServerClient.Emergency) obj;

    boolean result = true;
    result = result && getPatientFirstName()
        .equals(other.getPatientFirstName());
    result = result && getPatientLastName()
        .equals(other.getPatientLastName());
    result = result && (getAge()
        == other.getAge());
    result = result && getAddress()
        .equals(other.getAddress());
    result = result && getHighBloodPressure()
        .equals(other.getHighBloodPressure());
    result = result && getMedication()
        .equals(other.getMedication());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PATIENTFIRST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPatientFirstName().hashCode();
    hash = (37 * hash) + PATIENTLAST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPatientLastName().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + HIGH_BLOOD_PRESSURE_FIELD_NUMBER;
    hash = (53 * hash) + getHighBloodPressure().hashCode();
    hash = (37 * hash) + MEDICATION_FIELD_NUMBER;
    hash = (53 * hash) + getMedication().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.EmergencyServerClient.Emergency parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.EmergencyServerClient.Emergency parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.EmergencyServerClient.Emergency parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.EmergencyServerClient.Emergency parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.EmergencyServerClient.Emergency parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.EmergencyServerClient.Emergency parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.EmergencyServerClient.Emergency parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.EmergencyServerClient.Emergency parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.EmergencyServerClient.Emergency parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.EmergencyServerClient.Emergency parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.EmergencyServerClient.Emergency parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.EmergencyServerClient.Emergency parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.EmergencyServerClient.Emergency prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *create the message
   * </pre>
   *
   * Protobuf type {@code EmergencyServerClient.EmergencyUnary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EmergencyServerClient.EmergencyUnary)
      com.proto.EmergencyServerClient.EmergencyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.EmergencyServerClient.EmergencyServerClientOuterClass.internal_static_EmergencyServerClient_Emergency_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.EmergencyServerClient.EmergencyServerClientOuterClass.internal_static_EmergencyServerClient_Emergency_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.EmergencyServerClient.Emergency.class, com.proto.EmergencyServerClient.Emergency.Builder.class);
    }

    // Construct using com.proto.EmergencyServerClient.EmergencyUnary.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      patientFirstName_ = "";

      patientLastName_ = "";

      age_ = 0;

      address_ = "";

      highBloodPressure_ = "";

      medication_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.EmergencyServerClient.EmergencyServerClientOuterClass.internal_static_EmergencyServerClient_Emergency_descriptor;
    }

    @java.lang.Override
    public com.proto.EmergencyServerClient.Emergency getDefaultInstanceForType() {
      return com.proto.EmergencyServerClient.Emergency.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.EmergencyServerClient.Emergency build() {
      com.proto.EmergencyServerClient.Emergency result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.EmergencyServerClient.Emergency buildPartial() {
      com.proto.EmergencyServerClient.Emergency result = new com.proto.EmergencyServerClient.Emergency(this);
      result.patientFirstName_ = patientFirstName_;
      result.patientLastName_ = patientLastName_;
      result.age_ = age_;
      result.address_ = address_;
      result.highBloodPressure_ = highBloodPressure_;
      result.medication_ = medication_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.EmergencyServerClient.Emergency) {
        return mergeFrom((com.proto.EmergencyServerClient.Emergency)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.EmergencyServerClient.Emergency other) {
      if (other == com.proto.EmergencyServerClient.Emergency.getDefaultInstance()) return this;
      if (!other.getPatientFirstName().isEmpty()) {
        patientFirstName_ = other.patientFirstName_;
        onChanged();
      }
      if (!other.getPatientLastName().isEmpty()) {
        patientLastName_ = other.patientLastName_;
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (!other.getHighBloodPressure().isEmpty()) {
        highBloodPressure_ = other.highBloodPressure_;
        onChanged();
      }
      if (!other.getMedication().isEmpty()) {
        medication_ = other.medication_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.EmergencyServerClient.Emergency parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.EmergencyServerClient.Emergency) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object patientFirstName_ = "";
    /**
     * <code>string PatientFirst_name = 1;</code>
     */
    public java.lang.String getPatientFirstName() {
      java.lang.Object ref = patientFirstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        patientFirstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PatientFirst_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPatientFirstNameBytes() {
      java.lang.Object ref = patientFirstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        patientFirstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PatientFirst_name = 1;</code>
     */
    public Builder setPatientFirstName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      patientFirstName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PatientFirst_name = 1;</code>
     */
    public Builder clearPatientFirstName() {
      
      patientFirstName_ = getDefaultInstance().getPatientFirstName();
      onChanged();
      return this;
    }
    /**
     * <code>string PatientFirst_name = 1;</code>
     */
    public Builder setPatientFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      patientFirstName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object patientLastName_ = "";
    /**
     * <code>string PatientLast_name = 2;</code>
     */
    public java.lang.String getPatientLastName() {
      java.lang.Object ref = patientLastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        patientLastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PatientLast_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPatientLastNameBytes() {
      java.lang.Object ref = patientLastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        patientLastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PatientLast_name = 2;</code>
     */
    public Builder setPatientLastName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      patientLastName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PatientLast_name = 2;</code>
     */
    public Builder clearPatientLastName() {
      
      patientLastName_ = getDefaultInstance().getPatientLastName();
      onChanged();
      return this;
    }
    /**
     * <code>string PatientLast_name = 2;</code>
     */
    public Builder setPatientLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      patientLastName_ = value;
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <code>int32 age = 3;</code>
     */
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 3;</code>
     */
    public Builder setAge(int value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 age = 3;</code>
     */
    public Builder clearAge() {
      
      age_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string Address = 4;</code>
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Address = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Address = 4;</code>
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Address = 4;</code>
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string Address = 4;</code>
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      address_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object highBloodPressure_ = "";
    /**
     * <code>string high_Blood_pressure = 5;</code>
     */
    public java.lang.String getHighBloodPressure() {
      java.lang.Object ref = highBloodPressure_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        highBloodPressure_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string high_Blood_pressure = 5;</code>
     */
    public com.google.protobuf.ByteString
        getHighBloodPressureBytes() {
      java.lang.Object ref = highBloodPressure_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        highBloodPressure_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string high_Blood_pressure = 5;</code>
     */
    public Builder setHighBloodPressure(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      highBloodPressure_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string high_Blood_pressure = 5;</code>
     */
    public Builder clearHighBloodPressure() {
      
      highBloodPressure_ = getDefaultInstance().getHighBloodPressure();
      onChanged();
      return this;
    }
    /**
     * <code>string high_Blood_pressure = 5;</code>
     */
    public Builder setHighBloodPressureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      highBloodPressure_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object medication_ = "";
    /**
     * <code>string Medication = 6;</code>
     */
    public java.lang.String getMedication() {
      java.lang.Object ref = medication_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        medication_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Medication = 6;</code>
     */
    public com.google.protobuf.ByteString
        getMedicationBytes() {
      java.lang.Object ref = medication_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        medication_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Medication = 6;</code>
     */
    public Builder setMedication(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      medication_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Medication = 6;</code>
     */
    public Builder clearMedication() {
      
      medication_ = getDefaultInstance().getMedication();
      onChanged();
      return this;
    }
    /**
     * <code>string Medication = 6;</code>
     */
    public Builder setMedicationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      medication_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:EmergencyServerClient.EmergencyUnary)
  }

  // @@protoc_insertion_point(class_scope:EmergencyServerClient.EmergencyUnary)
  private static final com.proto.EmergencyServerClient.Emergency DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.EmergencyServerClient.Emergency();
  }

  public static com.proto.EmergencyServerClient.Emergency getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Emergency>
      PARSER = new com.google.protobuf.AbstractParser<Emergency>() {
    @java.lang.Override
    public Emergency parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Emergency(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Emergency> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Emergency> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.EmergencyServerClient.Emergency getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

