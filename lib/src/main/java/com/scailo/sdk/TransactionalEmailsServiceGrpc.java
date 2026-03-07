package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the methods applicable on each transactional email
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: transactional_emails.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransactionalEmailsServiceGrpc {

  private TransactionalEmailsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.TransactionalEmailsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceCreateRequest,
      com.scailo.sdk.TransactionalEmail> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.TransactionalEmailsServiceCreateRequest.class,
      responseType = com.scailo.sdk.TransactionalEmail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceCreateRequest,
      com.scailo.sdk.TransactionalEmail> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceCreateRequest, com.scailo.sdk.TransactionalEmail> getCreateMethod;
    if ((getCreateMethod = TransactionalEmailsServiceGrpc.getCreateMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getCreateMethod = TransactionalEmailsServiceGrpc.getCreateMethod) == null) {
          TransactionalEmailsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.TransactionalEmailsServiceCreateRequest, com.scailo.sdk.TransactionalEmail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmail.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.TransactionalEmail> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.TransactionalEmail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.TransactionalEmail> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.TransactionalEmail> getViewByIDMethod;
    if ((getViewByIDMethod = TransactionalEmailsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getViewByIDMethod = TransactionalEmailsServiceGrpc.getViewByIDMethod) == null) {
          TransactionalEmailsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.TransactionalEmail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmail.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.TransactionalEmail> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.TransactionalEmail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.TransactionalEmail> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.TransactionalEmail> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = TransactionalEmailsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getViewByUUIDMethod = TransactionalEmailsServiceGrpc.getViewByUUIDMethod) == null) {
          TransactionalEmailsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.TransactionalEmail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmail.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.TransactionalEmailsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.TransactionalEmailsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.TransactionalEmailsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.TransactionalEmailsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = TransactionalEmailsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getViewFromIDsMethod = TransactionalEmailsServiceGrpc.getViewFromIDsMethod) == null) {
          TransactionalEmailsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.TransactionalEmailsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailsList.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.TransactionalEmailRecipientsList> getViewRecipientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewRecipients",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.TransactionalEmailRecipientsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.TransactionalEmailRecipientsList> getViewRecipientsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.TransactionalEmailRecipientsList> getViewRecipientsMethod;
    if ((getViewRecipientsMethod = TransactionalEmailsServiceGrpc.getViewRecipientsMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getViewRecipientsMethod = TransactionalEmailsServiceGrpc.getViewRecipientsMethod) == null) {
          TransactionalEmailsServiceGrpc.getViewRecipientsMethod = getViewRecipientsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.TransactionalEmailRecipientsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewRecipients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailRecipientsList.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("ViewRecipients"))
              .build();
        }
      }
    }
    return getViewRecipientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.TransactionalEmailAttachmentsList> getViewAttachmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAttachments",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.TransactionalEmailAttachmentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.TransactionalEmailAttachmentsList> getViewAttachmentsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.TransactionalEmailAttachmentsList> getViewAttachmentsMethod;
    if ((getViewAttachmentsMethod = TransactionalEmailsServiceGrpc.getViewAttachmentsMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getViewAttachmentsMethod = TransactionalEmailsServiceGrpc.getViewAttachmentsMethod) == null) {
          TransactionalEmailsServiceGrpc.getViewAttachmentsMethod = getViewAttachmentsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.TransactionalEmailAttachmentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAttachments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailAttachmentsList.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("ViewAttachments"))
              .build();
        }
      }
    }
    return getViewAttachmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceSearchAllReq,
      com.scailo.sdk.TransactionalEmailsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.TransactionalEmailsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.TransactionalEmailsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceSearchAllReq,
      com.scailo.sdk.TransactionalEmailsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceSearchAllReq, com.scailo.sdk.TransactionalEmailsList> getSearchAllMethod;
    if ((getSearchAllMethod = TransactionalEmailsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getSearchAllMethod = TransactionalEmailsServiceGrpc.getSearchAllMethod) == null) {
          TransactionalEmailsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.TransactionalEmailsServiceSearchAllReq, com.scailo.sdk.TransactionalEmailsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailsList.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceFilterReq,
      com.scailo.sdk.TransactionalEmailsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.TransactionalEmailsServiceFilterReq.class,
      responseType = com.scailo.sdk.TransactionalEmailsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceFilterReq,
      com.scailo.sdk.TransactionalEmailsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceFilterReq, com.scailo.sdk.TransactionalEmailsList> getFilterMethod;
    if ((getFilterMethod = TransactionalEmailsServiceGrpc.getFilterMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getFilterMethod = TransactionalEmailsServiceGrpc.getFilterMethod) == null) {
          TransactionalEmailsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.TransactionalEmailsServiceFilterReq, com.scailo.sdk.TransactionalEmailsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailsList.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.TransactionalEmailsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = TransactionalEmailsServiceGrpc.getCountMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getCountMethod = TransactionalEmailsServiceGrpc.getCountMethod) == null) {
          TransactionalEmailsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.TransactionalEmailsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.TransactionalEmailsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.TransactionalEmailsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = TransactionalEmailsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (TransactionalEmailsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = TransactionalEmailsServiceGrpc.getDownloadAsCSVMethod) == null) {
          TransactionalEmailsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.TransactionalEmailsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.TransactionalEmailsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionalEmailsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionalEmailsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionalEmailsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionalEmailsServiceStub>() {
        @java.lang.Override
        public TransactionalEmailsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionalEmailsServiceStub(channel, callOptions);
        }
      };
    return TransactionalEmailsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionalEmailsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionalEmailsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionalEmailsServiceBlockingStub>() {
        @java.lang.Override
        public TransactionalEmailsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionalEmailsServiceBlockingStub(channel, callOptions);
        }
      };
    return TransactionalEmailsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionalEmailsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionalEmailsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionalEmailsServiceFutureStub>() {
        @java.lang.Override
        public TransactionalEmailsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionalEmailsServiceFutureStub(channel, callOptions);
        }
      };
    return TransactionalEmailsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the methods applicable on each transactional email
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a transactional email
     * </pre>
     */
    default void create(com.scailo.sdk.TransactionalEmailsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all recipients of the transactional email
     * </pre>
     */
    default void viewRecipients(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailRecipientsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewRecipientsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all attachments of the transactional email
     * </pre>
     */
    default void viewAttachments(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailAttachmentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAttachmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all transactional emails that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.TransactionalEmailsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.TransactionalEmailsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    default void count(com.scailo.sdk.TransactionalEmailsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.TransactionalEmailsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TransactionalEmailsService.
   * <pre>
   *Describes the methods applicable on each transactional email
   * </pre>
   */
  public static abstract class TransactionalEmailsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TransactionalEmailsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TransactionalEmailsService.
   * <pre>
   *Describes the methods applicable on each transactional email
   * </pre>
   */
  public static final class TransactionalEmailsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TransactionalEmailsServiceStub> {
    private TransactionalEmailsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionalEmailsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionalEmailsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a transactional email
     * </pre>
     */
    public void create(com.scailo.sdk.TransactionalEmailsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all recipients of the transactional email
     * </pre>
     */
    public void viewRecipients(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailRecipientsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewRecipientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all attachments of the transactional email
     * </pre>
     */
    public void viewAttachments(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailAttachmentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAttachmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all transactional emails that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.TransactionalEmailsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.TransactionalEmailsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public void count(com.scailo.sdk.TransactionalEmailsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public void downloadAsCSV(com.scailo.sdk.TransactionalEmailsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TransactionalEmailsService.
   * <pre>
   *Describes the methods applicable on each transactional email
   * </pre>
   */
  public static final class TransactionalEmailsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TransactionalEmailsServiceBlockingStub> {
    private TransactionalEmailsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionalEmailsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionalEmailsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a transactional email
     * </pre>
     */
    public com.scailo.sdk.TransactionalEmail create(com.scailo.sdk.TransactionalEmailsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.TransactionalEmail viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.TransactionalEmail viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.TransactionalEmailsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all recipients of the transactional email
     * </pre>
     */
    public com.scailo.sdk.TransactionalEmailRecipientsList viewRecipients(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewRecipientsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all attachments of the transactional email
     * </pre>
     */
    public com.scailo.sdk.TransactionalEmailAttachmentsList viewAttachments(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAttachmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all transactional emails that match the given search key
     * </pre>
     */
    public com.scailo.sdk.TransactionalEmailsList searchAll(com.scailo.sdk.TransactionalEmailsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.TransactionalEmailsList filter(com.scailo.sdk.TransactionalEmailsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.TransactionalEmailsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.TransactionalEmailsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TransactionalEmailsService.
   * <pre>
   *Describes the methods applicable on each transactional email
   * </pre>
   */
  public static final class TransactionalEmailsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TransactionalEmailsServiceFutureStub> {
    private TransactionalEmailsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionalEmailsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionalEmailsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a transactional email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.TransactionalEmail> create(
        com.scailo.sdk.TransactionalEmailsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.TransactionalEmail> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.TransactionalEmail> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.TransactionalEmailsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all recipients of the transactional email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.TransactionalEmailRecipientsList> viewRecipients(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewRecipientsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all attachments of the transactional email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.TransactionalEmailAttachmentsList> viewAttachments(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAttachmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all transactional emails that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.TransactionalEmailsList> searchAll(
        com.scailo.sdk.TransactionalEmailsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.TransactionalEmailsList> filter(
        com.scailo.sdk.TransactionalEmailsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.TransactionalEmailsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadAsCSV(
        com.scailo.sdk.TransactionalEmailsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_VIEW_BY_ID = 1;
  private static final int METHODID_VIEW_BY_UUID = 2;
  private static final int METHODID_VIEW_FROM_IDS = 3;
  private static final int METHODID_VIEW_RECIPIENTS = 4;
  private static final int METHODID_VIEW_ATTACHMENTS = 5;
  private static final int METHODID_SEARCH_ALL = 6;
  private static final int METHODID_FILTER = 7;
  private static final int METHODID_COUNT = 8;
  private static final int METHODID_DOWNLOAD_AS_CSV = 9;

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
          serviceImpl.create((com.scailo.sdk.TransactionalEmailsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmail>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmail>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmail>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailsList>) responseObserver);
          break;
        case METHODID_VIEW_RECIPIENTS:
          serviceImpl.viewRecipients((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailRecipientsList>) responseObserver);
          break;
        case METHODID_VIEW_ATTACHMENTS:
          serviceImpl.viewAttachments((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailAttachmentsList>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.TransactionalEmailsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.TransactionalEmailsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.TransactionalEmailsList>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.TransactionalEmailsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.TransactionalEmailsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
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
              com.scailo.sdk.TransactionalEmailsServiceCreateRequest,
              com.scailo.sdk.TransactionalEmail>(
                service, METHODID_CREATE)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.TransactionalEmail>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.TransactionalEmail>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.TransactionalEmailsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewRecipientsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.TransactionalEmailRecipientsList>(
                service, METHODID_VIEW_RECIPIENTS)))
        .addMethod(
          getViewAttachmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.TransactionalEmailAttachmentsList>(
                service, METHODID_VIEW_ATTACHMENTS)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.TransactionalEmailsServiceSearchAllReq,
              com.scailo.sdk.TransactionalEmailsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.TransactionalEmailsServiceFilterReq,
              com.scailo.sdk.TransactionalEmailsList>(
                service, METHODID_FILTER)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.TransactionalEmailsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.TransactionalEmailsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class TransactionalEmailsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionalEmailsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.TransactionalEmailsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionalEmailsService");
    }
  }

  private static final class TransactionalEmailsServiceFileDescriptorSupplier
      extends TransactionalEmailsServiceBaseDescriptorSupplier {
    TransactionalEmailsServiceFileDescriptorSupplier() {}
  }

  private static final class TransactionalEmailsServiceMethodDescriptorSupplier
      extends TransactionalEmailsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TransactionalEmailsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TransactionalEmailsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionalEmailsServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewRecipientsMethod())
              .addMethod(getViewAttachmentsMethod())
              .addMethod(getSearchAllMethod())
              .addMethod(getFilterMethod())
              .addMethod(getCountMethod())
              .addMethod(getDownloadAsCSVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
