package com.proto.EmergencyServerClient;

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
    comments = "Source: EmergencyServerClient.proto")
public final class EmergencyServerClientGrpc {

  private EmergencyServerClientGrpc() {}

  public static final String SERVICE_NAME = "EmergencyServerClient.EmergencyServerClient";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.EmergencyServerClient.EmergencyManyTimesRequest,
      com.proto.EmergencyServerClient.EmergencyManyTimesResponse> getEmergencyManyTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmergencyManyTimes",
      requestType = com.proto.EmergencyServerClient.EmergencyManyTimesRequest.class,
      responseType = com.proto.EmergencyServerClient.EmergencyManyTimesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.EmergencyServerClient.EmergencyManyTimesRequest,
      com.proto.EmergencyServerClient.EmergencyManyTimesResponse> getEmergencyManyTimesMethod() {
    io.grpc.MethodDescriptor<com.proto.EmergencyServerClient.EmergencyManyTimesRequest, com.proto.EmergencyServerClient.EmergencyManyTimesResponse> getEmergencyManyTimesMethod;
    if ((getEmergencyManyTimesMethod = EmergencyServerClientGrpc.getEmergencyManyTimesMethod) == null) {
      synchronized (EmergencyServerClientGrpc.class) {
        if ((getEmergencyManyTimesMethod = EmergencyServerClientGrpc.getEmergencyManyTimesMethod) == null) {
          EmergencyServerClientGrpc.getEmergencyManyTimesMethod = getEmergencyManyTimesMethod = 
              io.grpc.MethodDescriptor.<com.proto.EmergencyServerClient.EmergencyManyTimesRequest, com.proto.EmergencyServerClient.EmergencyManyTimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmergencyServerClient.EmergencyServerClient", "EmergencyManyTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyServerClient.EmergencyManyTimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyServerClient.EmergencyManyTimesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmergencyServerClientMethodDescriptorSupplier("EmergencyManyTimes"))
                  .build();
          }
        }
     }
     return getEmergencyManyTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.EmergencyServerClient.LongEmergencyRequest,
      com.proto.EmergencyServerClient.LongEmergencyResponse> getLongEmergencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongEmergency",
      requestType = com.proto.EmergencyServerClient.LongEmergencyRequest.class,
      responseType = com.proto.EmergencyServerClient.LongEmergencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.EmergencyServerClient.LongEmergencyRequest,
      com.proto.EmergencyServerClient.LongEmergencyResponse> getLongEmergencyMethod() {
    io.grpc.MethodDescriptor<com.proto.EmergencyServerClient.LongEmergencyRequest, com.proto.EmergencyServerClient.LongEmergencyResponse> getLongEmergencyMethod;
    if ((getLongEmergencyMethod = EmergencyServerClientGrpc.getLongEmergencyMethod) == null) {
      synchronized (EmergencyServerClientGrpc.class) {
        if ((getLongEmergencyMethod = EmergencyServerClientGrpc.getLongEmergencyMethod) == null) {
          EmergencyServerClientGrpc.getLongEmergencyMethod = getLongEmergencyMethod = 
              io.grpc.MethodDescriptor.<com.proto.EmergencyServerClient.LongEmergencyRequest, com.proto.EmergencyServerClient.LongEmergencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmergencyServerClient.EmergencyServerClient", "LongEmergency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyServerClient.LongEmergencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.EmergencyServerClient.LongEmergencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmergencyServerClientMethodDescriptorSupplier("LongEmergency"))
                  .build();
          }
        }
     }
     return getLongEmergencyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmergencyServerClientStub newStub(io.grpc.Channel channel) {
    return new EmergencyServerClientStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmergencyServerClientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmergencyServerClientBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmergencyServerClientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmergencyServerClientFutureStub(channel);
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static abstract class EmergencyServerClientImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public void emergencyManyTimes(com.proto.EmergencyServerClient.EmergencyManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.proto.EmergencyServerClient.EmergencyManyTimesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyManyTimesMethod(), responseObserver);
    }

    /**
     * <pre>
     *Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.EmergencyServerClient.LongEmergencyRequest> longEmergency(
        io.grpc.stub.StreamObserver<com.proto.EmergencyServerClient.LongEmergencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLongEmergencyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmergencyManyTimesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.EmergencyServerClient.EmergencyManyTimesRequest,
                com.proto.EmergencyServerClient.EmergencyManyTimesResponse>(
                  this, METHODID_EMERGENCY_MANY_TIMES)))
          .addMethod(
            getLongEmergencyMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.EmergencyServerClient.LongEmergencyRequest,
                com.proto.EmergencyServerClient.LongEmergencyResponse>(
                  this, METHODID_LONG_EMERGENCY)))
          .build();
    }
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static final class EmergencyServerClientStub extends io.grpc.stub.AbstractStub<EmergencyServerClientStub> {
    private EmergencyServerClientStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServerClientStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServerClientStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServerClientStub(channel, callOptions);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public void emergencyManyTimes(com.proto.EmergencyServerClient.EmergencyManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.proto.EmergencyServerClient.EmergencyManyTimesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEmergencyManyTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.EmergencyServerClient.LongEmergencyRequest> longEmergency(
        io.grpc.stub.StreamObserver<com.proto.EmergencyServerClient.LongEmergencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLongEmergencyMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static final class EmergencyServerClientBlockingStub extends io.grpc.stub.AbstractStub<EmergencyServerClientBlockingStub> {
    private EmergencyServerClientBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServerClientBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServerClientBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServerClientBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public java.util.Iterator<com.proto.EmergencyServerClient.EmergencyManyTimesResponse> emergencyManyTimes(
        com.proto.EmergencyServerClient.EmergencyManyTimesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEmergencyManyTimesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *create the service
   * </pre>
   */
  public static final class EmergencyServerClientFutureStub extends io.grpc.stub.AbstractStub<EmergencyServerClientFutureStub> {
    private EmergencyServerClientFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServerClientFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServerClientFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServerClientFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EMERGENCY_MANY_TIMES = 0;
  private static final int METHODID_LONG_EMERGENCY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmergencyServerClientImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmergencyServerClientImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMERGENCY_MANY_TIMES:
          serviceImpl.emergencyManyTimes((com.proto.EmergencyServerClient.EmergencyManyTimesRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.EmergencyServerClient.EmergencyManyTimesResponse>) responseObserver);
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
        case METHODID_LONG_EMERGENCY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longEmergency(
              (io.grpc.stub.StreamObserver<com.proto.EmergencyServerClient.LongEmergencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmergencyServerClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmergencyServerClientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.EmergencyServerClient.EmergencyServerClientOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmergencyServerClient");
    }
  }

  private static final class EmergencyServerClientFileDescriptorSupplier
      extends EmergencyServerClientBaseDescriptorSupplier {
    EmergencyServerClientFileDescriptorSupplier() {}
  }

  private static final class EmergencyServerClientMethodDescriptorSupplier
      extends EmergencyServerClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmergencyServerClientMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmergencyServerClientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmergencyServerClientFileDescriptorSupplier())
              .addMethod(getEmergencyManyTimesMethod())
              .addMethod(getLongEmergencyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
