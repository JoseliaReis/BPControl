package com.proto.EmergencyUnary;

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
    comments = "Source: Emergency.proto")
public final class EmergencyServiceGrpc {

  private EmergencyServiceGrpc() {}

  public static final String SERVICE_NAME = "Emergency.EmergencyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.EmergencyUnary.EmergencyRequest,
      com.proto.EmergencyUnary.EmergencyResponse> getEmergencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Emergency",
      requestType = com.proto.EmergencyUnary.EmergencyRequest.class,
      responseType = com.proto.EmergencyUnary.EmergencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.EmergencyUnary.EmergencyRequest,
      com.proto.EmergencyUnary.EmergencyResponse> getEmergencyMethod() {
    io.grpc.MethodDescriptor<com.proto.EmergencyUnary.EmergencyRequest, com.proto.EmergencyUnary.EmergencyResponse> getEmergencyMethod;
    if ((getEmergencyMethod = EmergencyServiceGrpc.getEmergencyMethod) == null) {
      synchronized (EmergencyServiceGrpc.class) {
        if ((getEmergencyMethod = EmergencyServiceGrpc.getEmergencyMethod) == null) {
          EmergencyServiceGrpc.getEmergencyMethod = getEmergencyMethod = 
              io.grpc.MethodDescriptor.<com.proto.EmergencyUnary.EmergencyRequest, com.proto.EmergencyUnary.EmergencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Emergency.EmergencyService", "Emergency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyUnary.EmergencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyUnary.EmergencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmergencyServiceMethodDescriptorSupplier("Emergency"))
                  .build();
          }
        }
     }
     return getEmergencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.EmergencyUnary.ErrorHandlingRequest,
      com.proto.EmergencyUnary.ErrorHandlingResponse> getErrorHandlingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ErrorHandling",
      requestType = com.proto.EmergencyUnary.ErrorHandlingRequest.class,
      responseType = com.proto.EmergencyUnary.ErrorHandlingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.EmergencyUnary.ErrorHandlingRequest,
      com.proto.EmergencyUnary.ErrorHandlingResponse> getErrorHandlingMethod() {
    io.grpc.MethodDescriptor<com.proto.EmergencyUnary.ErrorHandlingRequest, com.proto.EmergencyUnary.ErrorHandlingResponse> getErrorHandlingMethod;
    if ((getErrorHandlingMethod = EmergencyServiceGrpc.getErrorHandlingMethod) == null) {
      synchronized (EmergencyServiceGrpc.class) {
        if ((getErrorHandlingMethod = EmergencyServiceGrpc.getErrorHandlingMethod) == null) {
          EmergencyServiceGrpc.getErrorHandlingMethod = getErrorHandlingMethod = 
              io.grpc.MethodDescriptor.<com.proto.EmergencyUnary.ErrorHandlingRequest, com.proto.EmergencyUnary.ErrorHandlingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Emergency.EmergencyService", "ErrorHandling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyUnary.ErrorHandlingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyUnary.ErrorHandlingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmergencyServiceMethodDescriptorSupplier("ErrorHandling"))
                  .build();
          }
        }
     }
     return getErrorHandlingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmergencyServiceStub newStub(io.grpc.Channel channel) {
    return new EmergencyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmergencyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmergencyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmergencyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmergencyServiceFutureStub(channel);
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static abstract class EmergencyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary API
     * </pre>
     */
    public void emergency(com.proto.EmergencyUnary.EmergencyRequest request,
        io.grpc.stub.StreamObserver<com.proto.EmergencyUnary.EmergencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyMethod(), responseObserver);
    }

    /**
     * <pre>
     *error handling
     *will trow an exception is the message sent arent correct.
     * </pre>
     */
    public void errorHandling(com.proto.EmergencyUnary.ErrorHandlingRequest request,
        io.grpc.stub.StreamObserver<com.proto.EmergencyUnary.ErrorHandlingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getErrorHandlingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmergencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.EmergencyUnary.EmergencyRequest,
                com.proto.EmergencyUnary.EmergencyResponse>(
                  this, METHODID_EMERGENCY)))
          .addMethod(
            getErrorHandlingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.EmergencyUnary.ErrorHandlingRequest,
                com.proto.EmergencyUnary.ErrorHandlingResponse>(
                  this, METHODID_ERROR_HANDLING)))
          .build();
    }
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static final class EmergencyServiceStub extends io.grpc.stub.AbstractStub<EmergencyServiceStub> {
    private EmergencyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary API
     * </pre>
     */
    public void emergency(com.proto.EmergencyUnary.EmergencyRequest request,
        io.grpc.stub.StreamObserver<com.proto.EmergencyUnary.EmergencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmergencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *error handling
     *will trow an exception is the message sent arent correct.
     * </pre>
     */
    public void errorHandling(com.proto.EmergencyUnary.ErrorHandlingRequest request,
        io.grpc.stub.StreamObserver<com.proto.EmergencyUnary.ErrorHandlingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getErrorHandlingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static final class EmergencyServiceBlockingStub extends io.grpc.stub.AbstractStub<EmergencyServiceBlockingStub> {
    private EmergencyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary API
     * </pre>
     */
    public com.proto.EmergencyUnary.EmergencyResponse emergency(com.proto.EmergencyUnary.EmergencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmergencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *error handling
     *will trow an exception is the message sent arent correct.
     * </pre>
     */
    public com.proto.EmergencyUnary.ErrorHandlingResponse errorHandling(com.proto.EmergencyUnary.ErrorHandlingRequest request) {
      return blockingUnaryCall(
          getChannel(), getErrorHandlingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static final class EmergencyServiceFutureStub extends io.grpc.stub.AbstractStub<EmergencyServiceFutureStub> {
    private EmergencyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.EmergencyUnary.EmergencyResponse> emergency(
        com.proto.EmergencyUnary.EmergencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmergencyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *error handling
     *will trow an exception is the message sent arent correct.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.EmergencyUnary.ErrorHandlingResponse> errorHandling(
        com.proto.EmergencyUnary.ErrorHandlingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getErrorHandlingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EMERGENCY = 0;
  private static final int METHODID_ERROR_HANDLING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmergencyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmergencyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMERGENCY:
          serviceImpl.emergency((com.proto.EmergencyUnary.EmergencyRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.EmergencyUnary.EmergencyResponse>) responseObserver);
          break;
        case METHODID_ERROR_HANDLING:
          serviceImpl.errorHandling((com.proto.EmergencyUnary.ErrorHandlingRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.EmergencyUnary.ErrorHandlingResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmergencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmergencyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.EmergencyUnary.EmergencyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmergencyService");
    }
  }

  private static final class EmergencyServiceFileDescriptorSupplier
      extends EmergencyServiceBaseDescriptorSupplier {
    EmergencyServiceFileDescriptorSupplier() {}
  }

  private static final class EmergencyServiceMethodDescriptorSupplier
      extends EmergencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmergencyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmergencyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmergencyServiceFileDescriptorSupplier())
              .addMethod(getEmergencyMethod())
              .addMethod(getErrorHandlingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
