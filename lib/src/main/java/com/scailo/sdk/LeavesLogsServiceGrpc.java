package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each record
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: leaves_logs.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LeavesLogsServiceGrpc {

  private LeavesLogsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.LeavesLogsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesLogsServiceFilterReq,
      com.scailo.sdk.LeavesLogsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.LeavesLogsServiceFilterReq.class,
      responseType = com.scailo.sdk.LeavesLogsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesLogsServiceFilterReq,
      com.scailo.sdk.LeavesLogsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesLogsServiceFilterReq, com.scailo.sdk.LeavesLogsList> getFilterMethod;
    if ((getFilterMethod = LeavesLogsServiceGrpc.getFilterMethod) == null) {
      synchronized (LeavesLogsServiceGrpc.class) {
        if ((getFilterMethod = LeavesLogsServiceGrpc.getFilterMethod) == null) {
          LeavesLogsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesLogsServiceFilterReq, com.scailo.sdk.LeavesLogsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesLogsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesLogsList.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesLogsServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest,
      com.scailo.sdk.CountResponse> getCountEmployeeLeavesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountEmployeeLeaves",
      requestType = com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest,
      com.scailo.sdk.CountResponse> getCountEmployeeLeavesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest, com.scailo.sdk.CountResponse> getCountEmployeeLeavesMethod;
    if ((getCountEmployeeLeavesMethod = LeavesLogsServiceGrpc.getCountEmployeeLeavesMethod) == null) {
      synchronized (LeavesLogsServiceGrpc.class) {
        if ((getCountEmployeeLeavesMethod = LeavesLogsServiceGrpc.getCountEmployeeLeavesMethod) == null) {
          LeavesLogsServiceGrpc.getCountEmployeeLeavesMethod = getCountEmployeeLeavesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountEmployeeLeaves"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesLogsServiceMethodDescriptorSupplier("CountEmployeeLeaves"))
              .build();
        }
      }
    }
    return getCountEmployeeLeavesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesLogsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.LeavesLogsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesLogsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesLogsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = LeavesLogsServiceGrpc.getCountMethod) == null) {
      synchronized (LeavesLogsServiceGrpc.class) {
        if ((getCountMethod = LeavesLogsServiceGrpc.getCountMethod) == null) {
          LeavesLogsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesLogsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesLogsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesLogsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeavesLogsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeavesLogsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeavesLogsServiceStub>() {
        @java.lang.Override
        public LeavesLogsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeavesLogsServiceStub(channel, callOptions);
        }
      };
    return LeavesLogsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeavesLogsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeavesLogsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeavesLogsServiceBlockingStub>() {
        @java.lang.Override
        public LeavesLogsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeavesLogsServiceBlockingStub(channel, callOptions);
        }
      };
    return LeavesLogsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeavesLogsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeavesLogsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeavesLogsServiceFutureStub>() {
        @java.lang.Override
        public LeavesLogsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeavesLogsServiceFutureStub(channel, callOptions);
        }
      };
    return LeavesLogsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.LeavesLogsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesLogsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count leaves of employee
     * </pre>
     */
    default void countEmployeeLeaves(com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountEmployeeLeavesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    default void count(com.scailo.sdk.LeavesLogsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LeavesLogsService.
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public static abstract class LeavesLogsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LeavesLogsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LeavesLogsService.
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public static final class LeavesLogsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LeavesLogsServiceStub> {
    private LeavesLogsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeavesLogsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeavesLogsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.LeavesLogsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesLogsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count leaves of employee
     * </pre>
     */
    public void countEmployeeLeaves(com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountEmployeeLeavesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public void count(com.scailo.sdk.LeavesLogsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LeavesLogsService.
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public static final class LeavesLogsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LeavesLogsServiceBlockingStub> {
    private LeavesLogsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeavesLogsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeavesLogsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.LeavesLogsList filter(com.scailo.sdk.LeavesLogsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count leaves of employee
     * </pre>
     */
    public com.scailo.sdk.CountResponse countEmployeeLeaves(com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountEmployeeLeavesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.LeavesLogsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LeavesLogsService.
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public static final class LeavesLogsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LeavesLogsServiceFutureStub> {
    private LeavesLogsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeavesLogsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeavesLogsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesLogsList> filter(
        com.scailo.sdk.LeavesLogsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count leaves of employee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> countEmployeeLeaves(
        com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountEmployeeLeavesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.LeavesLogsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FILTER = 0;
  private static final int METHODID_COUNT_EMPLOYEE_LEAVES = 1;
  private static final int METHODID_COUNT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.LeavesLogsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesLogsList>) responseObserver);
          break;
        case METHODID_COUNT_EMPLOYEE_LEAVES:
          serviceImpl.countEmployeeLeaves((com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.LeavesLogsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesLogsServiceFilterReq,
              com.scailo.sdk.LeavesLogsList>(
                service, METHODID_FILTER)))
        .addMethod(
          getCountEmployeeLeavesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesLogsCountEmployeeLeavesRequest,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT_EMPLOYEE_LEAVES)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesLogsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .build();
  }

  private static abstract class LeavesLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeavesLogsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.LeavesLogsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeavesLogsService");
    }
  }

  private static final class LeavesLogsServiceFileDescriptorSupplier
      extends LeavesLogsServiceBaseDescriptorSupplier {
    LeavesLogsServiceFileDescriptorSupplier() {}
  }

  private static final class LeavesLogsServiceMethodDescriptorSupplier
      extends LeavesLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LeavesLogsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LeavesLogsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeavesLogsServiceFileDescriptorSupplier())
              .addMethod(getFilterMethod())
              .addMethod(getCountEmployeeLeavesMethod())
              .addMethod(getCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
