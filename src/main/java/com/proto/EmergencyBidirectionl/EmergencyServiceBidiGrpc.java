package com.proto.EmergencyBidirectionl;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *create the service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: EmergencyBidi.proto")
public final class EmergencyServiceBidiGrpc {

  private EmergencyServiceBidiGrpc() {}

  public static final String SERVICE_NAME = "EmergencyBidirectionl.EmergencyServiceBidi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.EmergencyBidirectionl.EmergencyMultiRequest,
      com.proto.EmergencyBidirectionl.EmergencyMultiResponse> getEmergencyMultiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmergencyMulti",
      requestType = com.proto.EmergencyBidirectionl.EmergencyMultiRequest.class,
      responseType = com.proto.EmergencyBidirectionl.EmergencyMultiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.EmergencyBidirectionl.EmergencyMultiRequest,
      com.proto.EmergencyBidirectionl.EmergencyMultiResponse> getEmergencyMultiMethod() {
    io.grpc.MethodDescriptor<com.proto.EmergencyBidirectionl.EmergencyMultiRequest, com.proto.EmergencyBidirectionl.EmergencyMultiResponse> getEmergencyMultiMethod;
    if ((getEmergencyMultiMethod = EmergencyServiceBidiGrpc.getEmergencyMultiMethod) == null) {
      synchronized (EmergencyServiceBidiGrpc.class) {
        if ((getEmergencyMultiMethod = EmergencyServiceBidiGrpc.getEmergencyMultiMethod) == null) {
          EmergencyServiceBidiGrpc.getEmergencyMultiMethod = getEmergencyMultiMethod = 
              io.grpc.MethodDescriptor.<com.proto.EmergencyBidirectionl.EmergencyMultiRequest, com.proto.EmergencyBidirectionl.EmergencyMultiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmergencyBidirectionl.EmergencyServiceBidi", "EmergencyMulti"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyBidirectionl.EmergencyMultiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyBidirectionl.EmergencyMultiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmergencyServiceBidiMethodDescriptorSupplier("EmergencyMulti"))
                  .build();
          }
        }
     }
     return getEmergencyMultiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest,
      com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse> getErrorHandlingBidiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ErrorHandlingBidi",
      requestType = com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest.class,
      responseType = com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest,
      com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse> getErrorHandlingBidiMethod() {
    io.grpc.MethodDescriptor<com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest, com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse> getErrorHandlingBidiMethod;
    if ((getErrorHandlingBidiMethod = EmergencyServiceBidiGrpc.getErrorHandlingBidiMethod) == null) {
      synchronized (EmergencyServiceBidiGrpc.class) {
        if ((getErrorHandlingBidiMethod = EmergencyServiceBidiGrpc.getErrorHandlingBidiMethod) == null) {
          EmergencyServiceBidiGrpc.getErrorHandlingBidiMethod = getErrorHandlingBidiMethod = 
              io.grpc.MethodDescriptor.<com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest, com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmergencyBidirectionl.EmergencyServiceBidi", "ErrorHandlingBidi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmergencyServiceBidiMethodDescriptorSupplier("ErrorHandlingBidi"))
                  .build();
          }
        }
     }
     return getErrorHandlingBidiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmergencyServiceBidiStub newStub(io.grpc.Channel channel) {
    return new EmergencyServiceBidiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmergencyServiceBidiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmergencyServiceBidiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmergencyServiceBidiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmergencyServiceBidiFutureStub(channel);
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static abstract class EmergencyServiceBidiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Bi Directional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.EmergencyBidirectionl.EmergencyMultiRequest> emergencyMulti(
        io.grpc.stub.StreamObserver<com.proto.EmergencyBidirectionl.EmergencyMultiResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getEmergencyMultiMethod(), responseObserver);
    }

    /**
     * <pre>
     *will trow an exception is the message sent arent correct.
     * </pre>
     */
    public void errorHandlingBidi(com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest request,
        io.grpc.stub.StreamObserver<com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getErrorHandlingBidiMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmergencyMultiMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.EmergencyBidirectionl.EmergencyMultiRequest,
                com.proto.EmergencyBidirectionl.EmergencyMultiResponse>(
                  this, METHODID_EMERGENCY_MULTI)))
          .addMethod(
            getErrorHandlingBidiMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest,
                com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse>(
                  this, METHODID_ERROR_HANDLING_BIDI)))
          .build();
    }
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static final class EmergencyServiceBidiStub extends io.grpc.stub.AbstractStub<EmergencyServiceBidiStub> {
    private EmergencyServiceBidiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServiceBidiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServiceBidiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServiceBidiStub(channel, callOptions);
    }

    /**
     * <pre>
     *Bi Directional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.EmergencyBidirectionl.EmergencyMultiRequest> emergencyMulti(
        io.grpc.stub.StreamObserver<com.proto.EmergencyBidirectionl.EmergencyMultiResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getEmergencyMultiMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *will trow an exception is the message sent arent correct.
     * </pre>
     */
    public void errorHandlingBidi(com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest request,
        io.grpc.stub.StreamObserver<com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getErrorHandlingBidiMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static final class EmergencyServiceBidiBlockingStub extends io.grpc.stub.AbstractStub<EmergencyServiceBidiBlockingStub> {
    private EmergencyServiceBidiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServiceBidiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServiceBidiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServiceBidiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *will trow an exception is the message sent arent correct.
     * </pre>
     */
    public com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse errorHandlingBidi(com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest request) {
      return blockingUnaryCall(
          getChannel(), getErrorHandlingBidiMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static final class EmergencyServiceBidiFutureStub extends io.grpc.stub.AbstractStub<EmergencyServiceBidiFutureStub> {
    private EmergencyServiceBidiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServiceBidiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServiceBidiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServiceBidiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *will trow an exception is the message sent arent correct.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse> errorHandlingBidi(
        com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getErrorHandlingBidiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ERROR_HANDLING_BIDI = 0;
  private static final int METHODID_EMERGENCY_MULTI = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmergencyServiceBidiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmergencyServiceBidiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ERROR_HANDLING_BIDI:
          serviceImpl.errorHandlingBidi((com.proto.EmergencyBidirectionl.ErrorHandlingBidiRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.EmergencyBidirectionl.ErrorHandlingBidiResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMERGENCY_MULTI:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.emergencyMulti(
              (io.grpc.stub.StreamObserver<com.proto.EmergencyBidirectionl.EmergencyMultiResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmergencyServiceBidiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmergencyServiceBidiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.EmergencyBidirectionl.EmergencyBidi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmergencyServiceBidi");
    }
  }

  private static final class EmergencyServiceBidiFileDescriptorSupplier
      extends EmergencyServiceBidiBaseDescriptorSupplier {
    EmergencyServiceBidiFileDescriptorSupplier() {}
  }

  private static final class EmergencyServiceBidiMethodDescriptorSupplier
      extends EmergencyServiceBidiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmergencyServiceBidiMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmergencyServiceBidiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmergencyServiceBidiFileDescriptorSupplier())
              .addMethod(getEmergencyMultiMethod())
              .addMethod(getErrorHandlingBidiMethod())
              .build();
        }
      }
    }
    return result;
  }
}