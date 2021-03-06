// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmergencyBidi.proto

package com.proto.EmergencyBidirectionl;

/**
 * <pre>
 *create the message
 * </pre>
 *
 * Protobuf type {@code EmergencyBidirectionl.Emergency}
 */
public  final class Emergency extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EmergencyBidirectionl.Emergency)
    EmergencyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Emergency.newBuilder() to construct.
  private Emergency(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Emergency() {
    highBloodPressure_ = "";
    treatment_ = "";
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

            highBloodPressure_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            treatment_ = s;
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
    return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_Emergency_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_Emergency_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.EmergencyBidirectionl.Emergency.class, com.proto.EmergencyBidirectionl.Emergency.Builder.class);
  }

  public static final int HIGH_BLOOD_PRESSURE_FIELD_NUMBER = 1;
  private volatile java.lang.Object highBloodPressure_;
  /**
   * <code>string high_Blood_pressure = 1;</code>
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
   * <code>string high_Blood_pressure = 1;</code>
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

  public static final int TREATMENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object treatment_;
  /**
   * <code>string Treatment = 2;</code>
   */
  public java.lang.String getTreatment() {
    java.lang.Object ref = treatment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      treatment_ = s;
      return s;
    }
  }
  /**
   * <code>string Treatment = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTreatmentBytes() {
    java.lang.Object ref = treatment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      treatment_ = b;
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
    if (!getHighBloodPressureBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, highBloodPressure_);
    }
    if (!getTreatmentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, treatment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHighBloodPressureBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, highBloodPressure_);
    }
    if (!getTreatmentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, treatment_);
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
    if (!(obj instanceof com.proto.EmergencyBidirectionl.Emergency)) {
      return super.equals(obj);
    }
    com.proto.EmergencyBidirectionl.Emergency other = (com.proto.EmergencyBidirectionl.Emergency) obj;

    boolean result = true;
    result = result && getHighBloodPressure()
        .equals(other.getHighBloodPressure());
    result = result && getTreatment()
        .equals(other.getTreatment());
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
    hash = (37 * hash) + HIGH_BLOOD_PRESSURE_FIELD_NUMBER;
    hash = (53 * hash) + getHighBloodPressure().hashCode();
    hash = (37 * hash) + TREATMENT_FIELD_NUMBER;
    hash = (53 * hash) + getTreatment().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.EmergencyBidirectionl.Emergency parseFrom(
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
  public static Builder newBuilder(com.proto.EmergencyBidirectionl.Emergency prototype) {
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
   * Protobuf type {@code EmergencyBidirectionl.Emergency}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EmergencyBidirectionl.Emergency)
      com.proto.EmergencyBidirectionl.EmergencyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_Emergency_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_Emergency_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.EmergencyBidirectionl.Emergency.class, com.proto.EmergencyBidirectionl.Emergency.Builder.class);
    }

    // Construct using com.proto.EmergencyBidirectionl.Emergency.newBuilder()
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
      highBloodPressure_ = "";

      treatment_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_Emergency_descriptor;
    }

    @java.lang.Override
    public com.proto.EmergencyBidirectionl.Emergency getDefaultInstanceForType() {
      return com.proto.EmergencyBidirectionl.Emergency.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.EmergencyBidirectionl.Emergency build() {
      com.proto.EmergencyBidirectionl.Emergency result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.EmergencyBidirectionl.Emergency buildPartial() {
      com.proto.EmergencyBidirectionl.Emergency result = new com.proto.EmergencyBidirectionl.Emergency(this);
      result.highBloodPressure_ = highBloodPressure_;
      result.treatment_ = treatment_;
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
      if (other instanceof com.proto.EmergencyBidirectionl.Emergency) {
        return mergeFrom((com.proto.EmergencyBidirectionl.Emergency)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.EmergencyBidirectionl.Emergency other) {
      if (other == com.proto.EmergencyBidirectionl.Emergency.getDefaultInstance()) return this;
      if (!other.getHighBloodPressure().isEmpty()) {
        highBloodPressure_ = other.highBloodPressure_;
        onChanged();
      }
      if (!other.getTreatment().isEmpty()) {
        treatment_ = other.treatment_;
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
      com.proto.EmergencyBidirectionl.Emergency parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.EmergencyBidirectionl.Emergency) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object highBloodPressure_ = "";
    /**
     * <code>string high_Blood_pressure = 1;</code>
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
     * <code>string high_Blood_pressure = 1;</code>
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
     * <code>string high_Blood_pressure = 1;</code>
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
     * <code>string high_Blood_pressure = 1;</code>
     */
    public Builder clearHighBloodPressure() {
      
      highBloodPressure_ = getDefaultInstance().getHighBloodPressure();
      onChanged();
      return this;
    }
    /**
     * <code>string high_Blood_pressure = 1;</code>
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

    private java.lang.Object treatment_ = "";
    /**
     * <code>string Treatment = 2;</code>
     */
    public java.lang.String getTreatment() {
      java.lang.Object ref = treatment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        treatment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Treatment = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTreatmentBytes() {
      java.lang.Object ref = treatment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        treatment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Treatment = 2;</code>
     */
    public Builder setTreatment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      treatment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Treatment = 2;</code>
     */
    public Builder clearTreatment() {
      
      treatment_ = getDefaultInstance().getTreatment();
      onChanged();
      return this;
    }
    /**
     * <code>string Treatment = 2;</code>
     */
    public Builder setTreatmentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      treatment_ = value;
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


    // @@protoc_insertion_point(builder_scope:EmergencyBidirectionl.Emergency)
  }

  // @@protoc_insertion_point(class_scope:EmergencyBidirectionl.Emergency)
  private static final com.proto.EmergencyBidirectionl.Emergency DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.EmergencyBidirectionl.Emergency();
  }

  public static com.proto.EmergencyBidirectionl.Emergency getDefaultInstance() {
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
  public com.proto.EmergencyBidirectionl.Emergency getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

