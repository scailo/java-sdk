package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each form
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: forms_fields_data.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FormsFieldsDataServiceGrpc {

  private FormsFieldsDataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.FormsFieldsDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FormFieldDatumHistoryRequest,
      com.scailo.sdk.FormFieldDatumList> getViewFormFieldDataHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFormFieldDataHistory",
      requestType = com.scailo.sdk.FormFieldDatumHistoryRequest.class,
      responseType = com.scailo.sdk.FormFieldDatumList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FormFieldDatumHistoryRequest,
      com.scailo.sdk.FormFieldDatumList> getViewFormFieldDataHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FormFieldDatumHistoryRequest, com.scailo.sdk.FormFieldDatumList> getViewFormFieldDataHistoryMethod;
    if ((getViewFormFieldDataHistoryMethod = FormsFieldsDataServiceGrpc.getViewFormFieldDataHistoryMethod) == null) {
      synchronized (FormsFieldsDataServiceGrpc.class) {
        if ((getViewFormFieldDataHistoryMethod = FormsFieldsDataServiceGrpc.getViewFormFieldDataHistoryMethod) == null) {
          FormsFieldsDataServiceGrpc.getViewFormFieldDataHistoryMethod = getViewFormFieldDataHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FormFieldDatumHistoryRequest, com.scailo.sdk.FormFieldDatumList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFormFieldDataHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FormFieldDatumHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FormFieldDatumList.getDefaultInstance()))
              .setSchemaDescriptor(new FormsFieldsDataServiceMethodDescriptorSupplier("ViewFormFieldDataHistory"))
              .build();
        }
      }
    }
    return getViewFormFieldDataHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FormsFieldsDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FormsFieldsDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FormsFieldsDataServiceStub>() {
        @java.lang.Override
        public FormsFieldsDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FormsFieldsDataServiceStub(channel, callOptions);
        }
      };
    return FormsFieldsDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FormsFieldsDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FormsFieldsDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FormsFieldsDataServiceBlockingStub>() {
        @java.lang.Override
        public FormsFieldsDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FormsFieldsDataServiceBlockingStub(channel, callOptions);
        }
      };
    return FormsFieldsDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FormsFieldsDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FormsFieldsDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FormsFieldsDataServiceFutureStub>() {
        @java.lang.Override
        public FormsFieldsDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FormsFieldsDataServiceFutureStub(channel, callOptions);
        }
      };
    return FormsFieldsDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each form
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * View the historical values of the given form data
     * </pre>
     */
    default void viewFormFieldDataHistory(com.scailo.sdk.FormFieldDatumHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FormFieldDatumList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFormFieldDataHistoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FormsFieldsDataService.
   * <pre>
   *Describes the common methods applicable on each form
   * </pre>
   */
  public static abstract class FormsFieldsDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FormsFieldsDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FormsFieldsDataService.
   * <pre>
   *Describes the common methods applicable on each form
   * </pre>
   */
  public static final class FormsFieldsDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FormsFieldsDataServiceStub> {
    private FormsFieldsDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormsFieldsDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FormsFieldsDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * View the historical values of the given form data
     * </pre>
     */
    public void viewFormFieldDataHistory(com.scailo.sdk.FormFieldDatumHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FormFieldDatumList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFormFieldDataHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FormsFieldsDataService.
   * <pre>
   *Describes the common methods applicable on each form
   * </pre>
   */
  public static final class FormsFieldsDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FormsFieldsDataServiceBlockingStub> {
    private FormsFieldsDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormsFieldsDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FormsFieldsDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * View the historical values of the given form data
     * </pre>
     */
    public com.scailo.sdk.FormFieldDatumList viewFormFieldDataHistory(com.scailo.sdk.FormFieldDatumHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFormFieldDataHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FormsFieldsDataService.
   * <pre>
   *Describes the common methods applicable on each form
   * </pre>
   */
  public static final class FormsFieldsDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FormsFieldsDataServiceFutureStub> {
    private FormsFieldsDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormsFieldsDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FormsFieldsDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * View the historical values of the given form data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FormFieldDatumList> viewFormFieldDataHistory(
        com.scailo.sdk.FormFieldDatumHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFormFieldDataHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VIEW_FORM_FIELD_DATA_HISTORY = 0;

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
        case METHODID_VIEW_FORM_FIELD_DATA_HISTORY:
          serviceImpl.viewFormFieldDataHistory((com.scailo.sdk.FormFieldDatumHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FormFieldDatumList>) responseObserver);
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
          getViewFormFieldDataHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FormFieldDatumHistoryRequest,
              com.scailo.sdk.FormFieldDatumList>(
                service, METHODID_VIEW_FORM_FIELD_DATA_HISTORY)))
        .build();
  }

  private static abstract class FormsFieldsDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FormsFieldsDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.FormsFieldsDataScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FormsFieldsDataService");
    }
  }

  private static final class FormsFieldsDataServiceFileDescriptorSupplier
      extends FormsFieldsDataServiceBaseDescriptorSupplier {
    FormsFieldsDataServiceFileDescriptorSupplier() {}
  }

  private static final class FormsFieldsDataServiceMethodDescriptorSupplier
      extends FormsFieldsDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FormsFieldsDataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FormsFieldsDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FormsFieldsDataServiceFileDescriptorSupplier())
              .addMethod(getViewFormFieldDataHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
