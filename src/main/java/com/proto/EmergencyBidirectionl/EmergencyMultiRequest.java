// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmergencyBidi.proto

package com.proto.EmergencyBidirectionl;

/**
 * <pre>
 *Message for the Bidirectional Request
 * </pre>
 *
 * Protobuf type {@code EmergencyBidirectionl.EmergencyMultiRequest}
 */
public  final class EmergencyMultiRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EmergencyBidirectionl.EmergencyMultiRequest)
    EmergencyMultiRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmergencyMultiRequest.newBuilder() to construct.
  private EmergencyMultiRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmergencyMultiRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EmergencyMultiRequest(
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
            com.proto.EmergencyBidirectionl.Emergency.Builder subBuilder = null;
            if (emergency_ != null) {
              subBuilder = emergency_.toBuilder();
            }
            emergency_ = input.readMessage(com.proto.EmergencyBidirectionl.Emergency.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(emergency_);
              emergency_ = subBuilder.buildPartial();
            }

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
    return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_EmergencyMultiRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_EmergencyMultiRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.EmergencyBidirectionl.EmergencyMultiRequest.class, com.proto.EmergencyBidirectionl.EmergencyMultiRequest.Builder.class);
  }

  public static final int EMERGENCY_FIELD_NUMBER = 1;
  private com.proto.EmergencyBidirectionl.Emergency emergency_;
  /**
   * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
   */
  public boolean hasEmergency() {
    return emergency_ != null;
  }
  /**
   * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
   */
  public com.proto.EmergencyBidirectionl.Emergency getEmergency() {
    return emergency_ == null ? com.proto.EmergencyBidirectionl.Emergency.getDefaultInstance() : emergency_;
  }
  /**
   * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
   */
  public com.proto.EmergencyBidirectionl.EmergencyOrBuilder getEmergencyOrBuilder() {
    return getEmergency();
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
    if (emergency_ != null) {
      output.writeMessage(1, getEmergency());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (emergency_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEmergency());
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
    if (!(obj instanceof com.proto.EmergencyBidirectionl.EmergencyMultiRequest)) {
      return super.equals(obj);
    }
    com.proto.EmergencyBidirectionl.EmergencyMultiRequest other = (com.proto.EmergencyBidirectionl.EmergencyMultiRequest) obj;

    boolean result = true;
    result = result && (hasEmergency() == other.hasEmergency());
    if (hasEmergency()) {
      result = result && getEmergency()
          .equals(other.getEmergency());
    }
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
    if (hasEmergency()) {
      hash = (37 * hash) + EMERGENCY_FIELD_NUMBER;
      hash = (53 * hash) + getEmergency().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest parseFrom(
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
  public static Builder newBuilder(com.proto.EmergencyBidirectionl.EmergencyMultiRequest prototype) {
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
   *Message for the Bidirectional Request
   * </pre>
   *
   * Protobuf type {@code EmergencyBidirectionl.EmergencyMultiRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EmergencyBidirectionl.EmergencyMultiRequest)
      com.proto.EmergencyBidirectionl.EmergencyMultiRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_EmergencyMultiRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_EmergencyMultiRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.EmergencyBidirectionl.EmergencyMultiRequest.class, com.proto.EmergencyBidirectionl.EmergencyMultiRequest.Builder.class);
    }

    // Construct using com.proto.EmergencyBidirectionl.EmergencyMultiRequest.newBuilder()
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
      if (emergencyBuilder_ == null) {
        emergency_ = null;
      } else {
        emergency_ = null;
        emergencyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.EmergencyBidirectionl.EmergencyBidi.internal_static_EmergencyBidirectionl_EmergencyMultiRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.EmergencyBidirectionl.EmergencyMultiRequest getDefaultInstanceForType() {
      return com.proto.EmergencyBidirectionl.EmergencyMultiRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.EmergencyBidirectionl.EmergencyMultiRequest build() {
      com.proto.EmergencyBidirectionl.EmergencyMultiRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.EmergencyBidirectionl.EmergencyMultiRequest buildPartial() {
      com.proto.EmergencyBidirectionl.EmergencyMultiRequest result = new com.proto.EmergencyBidirectionl.EmergencyMultiRequest(this);
      if (emergencyBuilder_ == null) {
        result.emergency_ = emergency_;
      } else {
        result.emergency_ = emergencyBuilder_.build();
      }
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
      if (other instanceof com.proto.EmergencyBidirectionl.EmergencyMultiRequest) {
        return mergeFrom((com.proto.EmergencyBidirectionl.EmergencyMultiRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.EmergencyBidirectionl.EmergencyMultiRequest other) {
      if (other == com.proto.EmergencyBidirectionl.EmergencyMultiRequest.getDefaultInstance()) return this;
      if (other.hasEmergency()) {
        mergeEmergency(other.getEmergency());
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
      com.proto.EmergencyBidirectionl.EmergencyMultiRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.EmergencyBidirectionl.EmergencyMultiRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.EmergencyBidirectionl.Emergency emergency_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.EmergencyBidirectionl.Emergency, com.proto.EmergencyBidirectionl.Emergency.Builder, com.proto.EmergencyBidirectionl.EmergencyOrBuilder> emergencyBuilder_;
    /**
     * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
     */
    public boolean hasEmergency() {
      return emergencyBuilder_ != null || emergency_ != null;
    }
    /**
     * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
     */
    public com.proto.EmergencyBidirectionl.Emergency getEmergency() {
      if (emergencyBuilder_ == null) {
        return emergency_ == null ? com.proto.EmergencyBidirectionl.Emergency.getDefaultInstance() : emergency_;
      } else {
        return emergencyBuilder_.getMessage();
      }
    }
    /**
     * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
     */
    public Builder setEmergency(com.proto.EmergencyBidirectionl.Emergency value) {
      if (emergencyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        emergency_ = value;
        onChanged();
      } else {
        emergencyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
     */
    public Builder setEmergency(
        com.proto.EmergencyBidirectionl.Emergency.Builder builderForValue) {
      if (emergencyBuilder_ == null) {
        emergency_ = builderForValue.build();
        onChanged();
      } else {
        emergencyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
     */
    public Builder mergeEmergency(com.proto.EmergencyBidirectionl.Emergency value) {
      if (emergencyBuilder_ == null) {
        if (emergency_ != null) {
          emergency_ =
            com.proto.EmergencyBidirectionl.Emergency.newBuilder(emergency_).mergeFrom(value).buildPartial();
        } else {
          emergency_ = value;
        }
        onChanged();
      } else {
        emergencyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
     */
    public Builder clearEmergency() {
      if (emergencyBuilder_ == null) {
        emergency_ = null;
        onChanged();
      } else {
        emergency_ = null;
        emergencyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
     */
    public com.proto.EmergencyBidirectionl.Emergency.Builder getEmergencyBuilder() {
      
      onChanged();
      return getEmergencyFieldBuilder().getBuilder();
    }
    /**
     * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
     */
    public com.proto.EmergencyBidirectionl.EmergencyOrBuilder getEmergencyOrBuilder() {
      if (emergencyBuilder_ != null) {
        return emergencyBuilder_.getMessageOrBuilder();
      } else {
        return emergency_ == null ?
            com.proto.EmergencyBidirectionl.Emergency.getDefaultInstance() : emergency_;
      }
    }
    /**
     * <code>.EmergencyBidirectionl.EmergencyUnary emergency = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.EmergencyBidirectionl.Emergency, com.proto.EmergencyBidirectionl.Emergency.Builder, com.proto.EmergencyBidirectionl.EmergencyOrBuilder> 
        getEmergencyFieldBuilder() {
      if (emergencyBuilder_ == null) {
        emergencyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.EmergencyBidirectionl.Emergency, com.proto.EmergencyBidirectionl.Emergency.Builder, com.proto.EmergencyBidirectionl.EmergencyOrBuilder>(
                getEmergency(),
                getParentForChildren(),
                isClean());
        emergency_ = null;
      }
      return emergencyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:EmergencyBidirectionl.EmergencyMultiRequest)
  }

  // @@protoc_insertion_point(class_scope:EmergencyBidirectionl.EmergencyMultiRequest)
  private static final com.proto.EmergencyBidirectionl.EmergencyMultiRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.EmergencyBidirectionl.EmergencyMultiRequest();
  }

  public static com.proto.EmergencyBidirectionl.EmergencyMultiRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmergencyMultiRequest>
      PARSER = new com.google.protobuf.AbstractParser<EmergencyMultiRequest>() {
    @java.lang.Override
    public EmergencyMultiRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EmergencyMultiRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmergencyMultiRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmergencyMultiRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.EmergencyBidirectionl.EmergencyMultiRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
