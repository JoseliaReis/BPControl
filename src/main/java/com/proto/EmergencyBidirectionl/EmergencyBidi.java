// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmergencyBidi.proto

package com.proto.EmergencyBidirectionl;

public final class EmergencyBidi {
  private EmergencyBidi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmergencyBidirectionl_Emergency_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmergencyBidirectionl_Emergency_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmergencyBidirectionl_EmergencyMultiRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmergencyBidirectionl_EmergencyMultiRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmergencyBidirectionl_EmergencyMultiResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmergencyBidirectionl_EmergencyMultiResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmergencyBidirectionl_ErrorHandlingBidiRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmergencyBidirectionl_ErrorHandlingBidiRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmergencyBidirectionl_ErrorHandlingBidiResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmergencyBidirectionl_ErrorHandlingBidiResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023EmergencyBidi.proto\022\025EmergencyBidirect" +
      "ionl\";\n\tEmergencyUnary\022\033\n\023high_Blood_pressure" +
      "\030\001 \001(\t\022\021\n\tTreatment\030\002 \001(\t\"L\n\025EmergencyMu" +
      "ltiRequest\0223\n\temergency\030\001 \001(\0132 .Emergenc" +
      "yBidirectionl.EmergencyUnary\"(\n\026EmergencyMult" +
      "iResponse\022\016\n\006result\030\001 \001(\t\"-\n\030ErrorHandli" +
      "ngBidiRequest\022\021\n\tTreatment\030\001 \001(\t\"+\n\031Erro" +
      "rHandlingBidiResponse\022\016\n\006result\030\001 \001(\t2\205\002" +
      "\n\024EmergencyServiceBidi\022s\n\016EmergencyMulti" +
      "\022,.EmergencyBidirectionl.EmergencyMultiR" +
      "equest\032-.EmergencyBidirectionl.EmergencyUnary" +
      "MultiResponse\"\000(\0010\001\022x\n\021ErrorHandlingBidi" +
      "\022/.EmergencyBidirectionl.ErrorHandlingBi" +
      "diRequest\0320.EmergencyBidirectionl.ErrorH" +
      "andlingBidiResponse\"\000B#\n\037com.proto.Emerg" +
      "encyBidirectionlP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_EmergencyBidirectionl_Emergency_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EmergencyBidirectionl_Emergency_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmergencyBidirectionl_Emergency_descriptor,
        new java.lang.String[] { "HighBloodPressure", "Treatment", });
    internal_static_EmergencyBidirectionl_EmergencyMultiRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EmergencyBidirectionl_EmergencyMultiRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmergencyBidirectionl_EmergencyMultiRequest_descriptor,
        new java.lang.String[] { "EmergencyUnary", });
    internal_static_EmergencyBidirectionl_EmergencyMultiResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_EmergencyBidirectionl_EmergencyMultiResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmergencyBidirectionl_EmergencyMultiResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_EmergencyBidirectionl_ErrorHandlingBidiRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_EmergencyBidirectionl_ErrorHandlingBidiRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmergencyBidirectionl_ErrorHandlingBidiRequest_descriptor,
        new java.lang.String[] { "Treatment", });
    internal_static_EmergencyBidirectionl_ErrorHandlingBidiResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_EmergencyBidirectionl_ErrorHandlingBidiResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmergencyBidirectionl_ErrorHandlingBidiResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}