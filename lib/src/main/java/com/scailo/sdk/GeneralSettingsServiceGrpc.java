package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the methods applicable on each general settings
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: general_settings.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GeneralSettingsServiceGrpc {

  private GeneralSettingsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.GeneralSettingsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralSettingsServiceCreateRequest,
      com.scailo.sdk.GeneralSettings> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.GeneralSettingsServiceCreateRequest.class,
      responseType = com.scailo.sdk.GeneralSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralSettingsServiceCreateRequest,
      com.scailo.sdk.GeneralSettings> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralSettingsServiceCreateRequest, com.scailo.sdk.GeneralSettings> getCreateMethod;
    if ((getCreateMethod = GeneralSettingsServiceGrpc.getCreateMethod) == null) {
      synchronized (GeneralSettingsServiceGrpc.class) {
        if ((getCreateMethod = GeneralSettingsServiceGrpc.getCreateMethod) == null) {
          GeneralSettingsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralSettingsServiceCreateRequest, com.scailo.sdk.GeneralSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralSettingsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralSettings.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralSettingsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.IdentifierResponse> getUpdateOrganizationLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationLogo",
      requestType = com.scailo.sdk.StandardFile.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.IdentifierResponse> getUpdateOrganizationLogoMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierResponse> getUpdateOrganizationLogoMethod;
    if ((getUpdateOrganizationLogoMethod = GeneralSettingsServiceGrpc.getUpdateOrganizationLogoMethod) == null) {
      synchronized (GeneralSettingsServiceGrpc.class) {
        if ((getUpdateOrganizationLogoMethod = GeneralSettingsServiceGrpc.getUpdateOrganizationLogoMethod) == null) {
          GeneralSettingsServiceGrpc.getUpdateOrganizationLogoMethod = getUpdateOrganizationLogoMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralSettingsServiceMethodDescriptorSupplier("UpdateOrganizationLogo"))
              .build();
        }
      }
    }
    return getUpdateOrganizationLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.ImageResponse> getViewOrganizationLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOrganizationLogo",
      requestType = com.scailo.sdk.Empty.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.ImageResponse> getViewOrganizationLogoMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Empty, com.scailo.sdk.ImageResponse> getViewOrganizationLogoMethod;
    if ((getViewOrganizationLogoMethod = GeneralSettingsServiceGrpc.getViewOrganizationLogoMethod) == null) {
      synchronized (GeneralSettingsServiceGrpc.class) {
        if ((getViewOrganizationLogoMethod = GeneralSettingsServiceGrpc.getViewOrganizationLogoMethod) == null) {
          GeneralSettingsServiceGrpc.getViewOrganizationLogoMethod = getViewOrganizationLogoMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOrganizationLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralSettingsServiceMethodDescriptorSupplier("ViewOrganizationLogo"))
              .build();
        }
      }
    }
    return getViewOrganizationLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.GeneralSettings> getViewSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSettings",
      requestType = com.scailo.sdk.Empty.class,
      responseType = com.scailo.sdk.GeneralSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.GeneralSettings> getViewSettingsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Empty, com.scailo.sdk.GeneralSettings> getViewSettingsMethod;
    if ((getViewSettingsMethod = GeneralSettingsServiceGrpc.getViewSettingsMethod) == null) {
      synchronized (GeneralSettingsServiceGrpc.class) {
        if ((getViewSettingsMethod = GeneralSettingsServiceGrpc.getViewSettingsMethod) == null) {
          GeneralSettingsServiceGrpc.getViewSettingsMethod = getViewSettingsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.GeneralSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralSettings.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralSettingsServiceMethodDescriptorSupplier("ViewSettings"))
              .build();
        }
      }
    }
    return getViewSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.StandardFile> getDownloadImportTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadImportTemplate",
      requestType = com.scailo.sdk.Empty.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.StandardFile> getDownloadImportTemplateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile> getDownloadImportTemplateMethod;
    if ((getDownloadImportTemplateMethod = GeneralSettingsServiceGrpc.getDownloadImportTemplateMethod) == null) {
      synchronized (GeneralSettingsServiceGrpc.class) {
        if ((getDownloadImportTemplateMethod = GeneralSettingsServiceGrpc.getDownloadImportTemplateMethod) == null) {
          GeneralSettingsServiceGrpc.getDownloadImportTemplateMethod = getDownloadImportTemplateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadImportTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralSettingsServiceMethodDescriptorSupplier("DownloadImportTemplate"))
              .build();
        }
      }
    }
    return getDownloadImportTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.IdentifierUUIDsList> getImportFromCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportFromCSV",
      requestType = com.scailo.sdk.StandardFile.class,
      responseType = com.scailo.sdk.IdentifierUUIDsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.IdentifierUUIDsList> getImportFromCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList> getImportFromCSVMethod;
    if ((getImportFromCSVMethod = GeneralSettingsServiceGrpc.getImportFromCSVMethod) == null) {
      synchronized (GeneralSettingsServiceGrpc.class) {
        if ((getImportFromCSVMethod = GeneralSettingsServiceGrpc.getImportFromCSVMethod) == null) {
          GeneralSettingsServiceGrpc.getImportFromCSVMethod = getImportFromCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportFromCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDsList.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralSettingsServiceMethodDescriptorSupplier("ImportFromCSV"))
              .build();
        }
      }
    }
    return getImportFromCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeneralSettingsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeneralSettingsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeneralSettingsServiceStub>() {
        @java.lang.Override
        public GeneralSettingsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeneralSettingsServiceStub(channel, callOptions);
        }
      };
    return GeneralSettingsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeneralSettingsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeneralSettingsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeneralSettingsServiceBlockingStub>() {
        @java.lang.Override
        public GeneralSettingsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeneralSettingsServiceBlockingStub(channel, callOptions);
        }
      };
    return GeneralSettingsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeneralSettingsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeneralSettingsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeneralSettingsServiceFutureStub>() {
        @java.lang.Override
        public GeneralSettingsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeneralSettingsServiceFutureStub(channel, callOptions);
        }
      };
    return GeneralSettingsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the methods applicable on each general settings
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a general settings
     * </pre>
     */
    default void create(com.scailo.sdk.GeneralSettingsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralSettings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the logo of the organization
     * </pre>
     */
    default void updateOrganizationLogo(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationLogoMethod(), responseObserver);
    }

    /**
     * <pre>
     * View current logo of the organization
     * </pre>
     */
    default void viewOrganizationLogo(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOrganizationLogoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ------------------------------------------------------
     * All view operations are listed below
     * View the current settings
     * </pre>
     */
    default void viewSettings(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralSettings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV template that could be used to upload records
     * </pre>
     */
    default void downloadImportTemplate(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadImportTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import records using a CSV file
     * </pre>
     */
    default void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportFromCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GeneralSettingsService.
   * <pre>
   *Describes the methods applicable on each general settings
   * </pre>
   */
  public static abstract class GeneralSettingsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GeneralSettingsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GeneralSettingsService.
   * <pre>
   *Describes the methods applicable on each general settings
   * </pre>
   */
  public static final class GeneralSettingsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GeneralSettingsServiceStub> {
    private GeneralSettingsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeneralSettingsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeneralSettingsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a general settings
     * </pre>
     */
    public void create(com.scailo.sdk.GeneralSettingsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralSettings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the logo of the organization
     * </pre>
     */
    public void updateOrganizationLogo(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View current logo of the organization
     * </pre>
     */
    public void viewOrganizationLogo(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOrganizationLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ------------------------------------------------------
     * All view operations are listed below
     * View the current settings
     * </pre>
     */
    public void viewSettings(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralSettings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV template that could be used to upload records
     * </pre>
     */
    public void downloadImportTemplate(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadImportTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import records using a CSV file
     * </pre>
     */
    public void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GeneralSettingsService.
   * <pre>
   *Describes the methods applicable on each general settings
   * </pre>
   */
  public static final class GeneralSettingsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GeneralSettingsServiceBlockingStub> {
    private GeneralSettingsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeneralSettingsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeneralSettingsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a general settings
     * </pre>
     */
    public com.scailo.sdk.GeneralSettings create(com.scailo.sdk.GeneralSettingsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the logo of the organization
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse updateOrganizationLogo(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationLogoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View current logo of the organization
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewOrganizationLogo(com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOrganizationLogoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ------------------------------------------------------
     * All view operations are listed below
     * View the current settings
     * </pre>
     */
    public com.scailo.sdk.GeneralSettings viewSettings(com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV template that could be used to upload records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadImportTemplate(com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadImportTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import records using a CSV file
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUIDsList importFromCSV(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportFromCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GeneralSettingsService.
   * <pre>
   *Describes the methods applicable on each general settings
   * </pre>
   */
  public static final class GeneralSettingsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GeneralSettingsServiceFutureStub> {
    private GeneralSettingsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeneralSettingsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeneralSettingsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a general settings
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralSettings> create(
        com.scailo.sdk.GeneralSettingsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the logo of the organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> updateOrganizationLogo(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationLogoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View current logo of the organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewOrganizationLogo(
        com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOrganizationLogoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ------------------------------------------------------
     * All view operations are listed below
     * View the current settings
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralSettings> viewSettings(
        com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV template that could be used to upload records
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadImportTemplate(
        com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadImportTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import records using a CSV file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUIDsList> importFromCSV(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE_ORGANIZATION_LOGO = 1;
  private static final int METHODID_VIEW_ORGANIZATION_LOGO = 2;
  private static final int METHODID_VIEW_SETTINGS = 3;
  private static final int METHODID_DOWNLOAD_IMPORT_TEMPLATE = 4;
  private static final int METHODID_IMPORT_FROM_CSV = 5;

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
        case METHODID_CREATE:
          serviceImpl.create((com.scailo.sdk.GeneralSettingsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralSettings>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_LOGO:
          serviceImpl.updateOrganizationLogo((com.scailo.sdk.StandardFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_ORGANIZATION_LOGO:
          serviceImpl.viewOrganizationLogo((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_VIEW_SETTINGS:
          serviceImpl.viewSettings((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralSettings>) responseObserver);
          break;
        case METHODID_DOWNLOAD_IMPORT_TEMPLATE:
          serviceImpl.downloadImportTemplate((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_IMPORT_FROM_CSV:
          serviceImpl.importFromCSV((com.scailo.sdk.StandardFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList>) responseObserver);
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
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralSettingsServiceCreateRequest,
              com.scailo.sdk.GeneralSettings>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateOrganizationLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE_ORGANIZATION_LOGO)))
        .addMethod(
          getViewOrganizationLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Empty,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_ORGANIZATION_LOGO)))
        .addMethod(
          getViewSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Empty,
              com.scailo.sdk.GeneralSettings>(
                service, METHODID_VIEW_SETTINGS)))
        .addMethod(
          getDownloadImportTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Empty,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_IMPORT_TEMPLATE)))
        .addMethod(
          getImportFromCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.IdentifierUUIDsList>(
                service, METHODID_IMPORT_FROM_CSV)))
        .build();
  }

  private static abstract class GeneralSettingsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeneralSettingsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.GeneralSettingsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GeneralSettingsService");
    }
  }

  private static final class GeneralSettingsServiceFileDescriptorSupplier
      extends GeneralSettingsServiceBaseDescriptorSupplier {
    GeneralSettingsServiceFileDescriptorSupplier() {}
  }

  private static final class GeneralSettingsServiceMethodDescriptorSupplier
      extends GeneralSettingsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GeneralSettingsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GeneralSettingsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GeneralSettingsServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateOrganizationLogoMethod())
              .addMethod(getViewOrganizationLogoMethod())
              .addMethod(getViewSettingsMethod())
              .addMethod(getDownloadImportTemplateMethod())
              .addMethod(getImportFromCSVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
