package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each vendor stream
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: vendor_streams.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VendorStreamsServiceGrpc {

  private VendorStreamsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.VendorStreamsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceCreateRequest,
      com.scailo.sdk.IdentifierUUID> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.VendorStreamsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceCreateRequest,
      com.scailo.sdk.IdentifierUUID> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceCreateRequest, com.scailo.sdk.IdentifierUUID> getCreateMethod;
    if ((getCreateMethod = VendorStreamsServiceGrpc.getCreateMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getCreateMethod = VendorStreamsServiceGrpc.getCreateMethod) == null) {
          VendorStreamsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceCreateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceUpdateRequest,
      com.scailo.sdk.IdentifierUUID> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.scailo.sdk.VendorStreamsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceUpdateRequest,
      com.scailo.sdk.IdentifierUUID> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceUpdateRequest, com.scailo.sdk.IdentifierUUID> getUpdateMethod;
    if ((getUpdateMethod = VendorStreamsServiceGrpc.getUpdateMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getUpdateMethod = VendorStreamsServiceGrpc.getUpdateMethod) == null) {
          VendorStreamsServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceUpdateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getCancelMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID> getCancelMethod;
    if ((getCancelMethod = VendorStreamsServiceGrpc.getCancelMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getCancelMethod = VendorStreamsServiceGrpc.getCancelMethod) == null) {
          VendorStreamsServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getCompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Complete",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getCompleteMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID> getCompleteMethod;
    if ((getCompleteMethod = VendorStreamsServiceGrpc.getCompleteMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getCompleteMethod = VendorStreamsServiceGrpc.getCompleteMethod) == null) {
          VendorStreamsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("Complete"))
              .build();
        }
      }
    }
    return getCompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getReopenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reopen",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getReopenMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID> getReopenMethod;
    if ((getReopenMethod = VendorStreamsServiceGrpc.getReopenMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getReopenMethod = VendorStreamsServiceGrpc.getReopenMethod) == null) {
          VendorStreamsServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("Reopen"))
              .build();
        }
      }
    }
    return getReopenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getRepeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Repeat",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getRepeatMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID> getRepeatMethod;
    if ((getRepeatMethod = VendorStreamsServiceGrpc.getRepeatMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getRepeatMethod = VendorStreamsServiceGrpc.getRepeatMethod) == null) {
          VendorStreamsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("Repeat"))
              .build();
        }
      }
    }
    return getRepeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getCommentAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommentAdd",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierUUID> getCommentAddMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID> getCommentAddMethod;
    if ((getCommentAddMethod = VendorStreamsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getCommentAddMethod = VendorStreamsServiceGrpc.getCommentAddMethod) == null) {
          VendorStreamsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("CommentAdd"))
              .build();
        }
      }
    }
    return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceMessageCreateRequest,
      com.scailo.sdk.IdentifierUUID> getAddMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMessage",
      requestType = com.scailo.sdk.VendorStreamsServiceMessageCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceMessageCreateRequest,
      com.scailo.sdk.IdentifierUUID> getAddMessageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceMessageCreateRequest, com.scailo.sdk.IdentifierUUID> getAddMessageMethod;
    if ((getAddMessageMethod = VendorStreamsServiceGrpc.getAddMessageMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getAddMessageMethod = VendorStreamsServiceGrpc.getAddMessageMethod) == null) {
          VendorStreamsServiceGrpc.getAddMessageMethod = getAddMessageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceMessageCreateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceMessageCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("AddMessage"))
              .build();
        }
      }
    }
    return getAddMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getSaveMessageForLaterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveMessageForLater",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getSaveMessageForLaterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getSaveMessageForLaterMethod;
    if ((getSaveMessageForLaterMethod = VendorStreamsServiceGrpc.getSaveMessageForLaterMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getSaveMessageForLaterMethod = VendorStreamsServiceGrpc.getSaveMessageForLaterMethod) == null) {
          VendorStreamsServiceGrpc.getSaveMessageForLaterMethod = getSaveMessageForLaterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveMessageForLater"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("SaveMessageForLater"))
              .build();
        }
      }
    }
    return getSaveMessageForLaterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMessage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteMessageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getDeleteMessageMethod;
    if ((getDeleteMessageMethod = VendorStreamsServiceGrpc.getDeleteMessageMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getDeleteMessageMethod = VendorStreamsServiceGrpc.getDeleteMessageMethod) == null) {
          VendorStreamsServiceGrpc.getDeleteMessageMethod = getDeleteMessageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("DeleteMessage"))
              .build();
        }
      }
    }
    return getDeleteMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamMessage> getViewMessageByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMessageByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VendorStreamMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamMessage> getViewMessageByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamMessage> getViewMessageByUUIDMethod;
    if ((getViewMessageByUUIDMethod = VendorStreamsServiceGrpc.getViewMessageByUUIDMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewMessageByUUIDMethod = VendorStreamsServiceGrpc.getViewMessageByUUIDMethod) == null) {
          VendorStreamsServiceGrpc.getViewMessageByUUIDMethod = getViewMessageByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMessageByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamMessage.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewMessageByUUID"))
              .build();
        }
      }
    }
    return getViewMessageByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamMessagesList> getViewMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMessages",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VendorStreamMessagesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamMessagesList> getViewMessagesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamMessagesList> getViewMessagesMethod;
    if ((getViewMessagesMethod = VendorStreamsServiceGrpc.getViewMessagesMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewMessagesMethod = VendorStreamsServiceGrpc.getViewMessagesMethod) == null) {
          VendorStreamsServiceGrpc.getViewMessagesMethod = getViewMessagesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamMessagesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamMessagesList.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewMessages"))
              .build();
        }
      }
    }
    return getViewMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamMessagesSearchRequest,
      com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> getViewPaginatedMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedMessages",
      requestType = com.scailo.sdk.VendorStreamMessagesSearchRequest.class,
      responseType = com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamMessagesSearchRequest,
      com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> getViewPaginatedMessagesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamMessagesSearchRequest, com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> getViewPaginatedMessagesMethod;
    if ((getViewPaginatedMessagesMethod = VendorStreamsServiceGrpc.getViewPaginatedMessagesMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewPaginatedMessagesMethod = VendorStreamsServiceGrpc.getViewPaginatedMessagesMethod) == null) {
          VendorStreamsServiceGrpc.getViewPaginatedMessagesMethod = getViewPaginatedMessagesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamMessagesSearchRequest, com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamMessagesSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewPaginatedMessages"))
              .build();
        }
      }
    }
    return getViewPaginatedMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamMessagesSearchRequest,
      com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> getSearchMessagesWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchMessagesWithPagination",
      requestType = com.scailo.sdk.VendorStreamMessagesSearchRequest.class,
      responseType = com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamMessagesSearchRequest,
      com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> getSearchMessagesWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamMessagesSearchRequest, com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> getSearchMessagesWithPaginationMethod;
    if ((getSearchMessagesWithPaginationMethod = VendorStreamsServiceGrpc.getSearchMessagesWithPaginationMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getSearchMessagesWithPaginationMethod = VendorStreamsServiceGrpc.getSearchMessagesWithPaginationMethod) == null) {
          VendorStreamsServiceGrpc.getSearchMessagesWithPaginationMethod = getSearchMessagesWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamMessagesSearchRequest, com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchMessagesWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamMessagesSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("SearchMessagesWithPagination"))
              .build();
        }
      }
    }
    return getSearchMessagesWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamMessageReceiptsList> getViewMessageReceiptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMessageReceipts",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VendorStreamMessageReceiptsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamMessageReceiptsList> getViewMessageReceiptsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamMessageReceiptsList> getViewMessageReceiptsMethod;
    if ((getViewMessageReceiptsMethod = VendorStreamsServiceGrpc.getViewMessageReceiptsMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewMessageReceiptsMethod = VendorStreamsServiceGrpc.getViewMessageReceiptsMethod) == null) {
          VendorStreamsServiceGrpc.getViewMessageReceiptsMethod = getViewMessageReceiptsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamMessageReceiptsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMessageReceipts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamMessageReceiptsList.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewMessageReceipts"))
              .build();
        }
      }
    }
    return getViewMessageReceiptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInternalSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddInternalSubscriber",
      requestType = com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInternalSubscriberMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse> getAddInternalSubscriberMethod;
    if ((getAddInternalSubscriberMethod = VendorStreamsServiceGrpc.getAddInternalSubscriberMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getAddInternalSubscriberMethod = VendorStreamsServiceGrpc.getAddInternalSubscriberMethod) == null) {
          VendorStreamsServiceGrpc.getAddInternalSubscriberMethod = getAddInternalSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddInternalSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("AddInternalSubscriber"))
              .build();
        }
      }
    }
    return getAddInternalSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteInternalSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInternalSubscriber",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteInternalSubscriberMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteInternalSubscriberMethod;
    if ((getDeleteInternalSubscriberMethod = VendorStreamsServiceGrpc.getDeleteInternalSubscriberMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getDeleteInternalSubscriberMethod = VendorStreamsServiceGrpc.getDeleteInternalSubscriberMethod) == null) {
          VendorStreamsServiceGrpc.getDeleteInternalSubscriberMethod = getDeleteInternalSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInternalSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("DeleteInternalSubscriber"))
              .build();
        }
      }
    }
    return getDeleteInternalSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VendorStreamInternalSubscriber> getViewInternalSubscriberByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInternalSubscriberByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.VendorStreamInternalSubscriber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VendorStreamInternalSubscriber> getViewInternalSubscriberByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.VendorStreamInternalSubscriber> getViewInternalSubscriberByIDMethod;
    if ((getViewInternalSubscriberByIDMethod = VendorStreamsServiceGrpc.getViewInternalSubscriberByIDMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewInternalSubscriberByIDMethod = VendorStreamsServiceGrpc.getViewInternalSubscriberByIDMethod) == null) {
          VendorStreamsServiceGrpc.getViewInternalSubscriberByIDMethod = getViewInternalSubscriberByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.VendorStreamInternalSubscriber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInternalSubscriberByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamInternalSubscriber.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewInternalSubscriberByID"))
              .build();
        }
      }
    }
    return getViewInternalSubscriberByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamInternalSubscribersList> getViewInternalSubscribersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInternalSubscribers",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VendorStreamInternalSubscribersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamInternalSubscribersList> getViewInternalSubscribersMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamInternalSubscribersList> getViewInternalSubscribersMethod;
    if ((getViewInternalSubscribersMethod = VendorStreamsServiceGrpc.getViewInternalSubscribersMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewInternalSubscribersMethod = VendorStreamsServiceGrpc.getViewInternalSubscribersMethod) == null) {
          VendorStreamsServiceGrpc.getViewInternalSubscribersMethod = getViewInternalSubscribersMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamInternalSubscribersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInternalSubscribers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamInternalSubscribersList.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewInternalSubscribers"))
              .build();
        }
      }
    }
    return getViewInternalSubscribersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportInternalSubscribersFromTeam",
      requestType = com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromTeamMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromTeamMethod;
    if ((getImportInternalSubscribersFromTeamMethod = VendorStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getImportInternalSubscribersFromTeamMethod = VendorStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod) == null) {
          VendorStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod = getImportInternalSubscribersFromTeamMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportInternalSubscribersFromTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ImportInternalSubscribersFromTeam"))
              .build();
        }
      }
    }
    return getImportInternalSubscribersFromTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportInternalSubscribersFromDepartment",
      requestType = com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromDepartmentMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromDepartmentMethod;
    if ((getImportInternalSubscribersFromDepartmentMethod = VendorStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getImportInternalSubscribersFromDepartmentMethod = VendorStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod) == null) {
          VendorStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod = getImportInternalSubscribersFromDepartmentMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportInternalSubscribersFromDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ImportInternalSubscribersFromDepartment"))
              .build();
        }
      }
    }
    return getImportInternalSubscribersFromDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddVendorSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddVendorSubscriber",
      requestType = com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddVendorSubscriberMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse> getAddVendorSubscriberMethod;
    if ((getAddVendorSubscriberMethod = VendorStreamsServiceGrpc.getAddVendorSubscriberMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getAddVendorSubscriberMethod = VendorStreamsServiceGrpc.getAddVendorSubscriberMethod) == null) {
          VendorStreamsServiceGrpc.getAddVendorSubscriberMethod = getAddVendorSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddVendorSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("AddVendorSubscriber"))
              .build();
        }
      }
    }
    return getAddVendorSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteVendorSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVendorSubscriber",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteVendorSubscriberMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteVendorSubscriberMethod;
    if ((getDeleteVendorSubscriberMethod = VendorStreamsServiceGrpc.getDeleteVendorSubscriberMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getDeleteVendorSubscriberMethod = VendorStreamsServiceGrpc.getDeleteVendorSubscriberMethod) == null) {
          VendorStreamsServiceGrpc.getDeleteVendorSubscriberMethod = getDeleteVendorSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVendorSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("DeleteVendorSubscriber"))
              .build();
        }
      }
    }
    return getDeleteVendorSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VendorStreamVendorSubscriber> getViewVendorSubscriberByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewVendorSubscriberByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.VendorStreamVendorSubscriber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VendorStreamVendorSubscriber> getViewVendorSubscriberByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.VendorStreamVendorSubscriber> getViewVendorSubscriberByIDMethod;
    if ((getViewVendorSubscriberByIDMethod = VendorStreamsServiceGrpc.getViewVendorSubscriberByIDMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewVendorSubscriberByIDMethod = VendorStreamsServiceGrpc.getViewVendorSubscriberByIDMethod) == null) {
          VendorStreamsServiceGrpc.getViewVendorSubscriberByIDMethod = getViewVendorSubscriberByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.VendorStreamVendorSubscriber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewVendorSubscriberByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamVendorSubscriber.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewVendorSubscriberByID"))
              .build();
        }
      }
    }
    return getViewVendorSubscriberByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamVendorSubscribersList> getViewVendorSubscribersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewVendorSubscribers",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VendorStreamVendorSubscribersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamVendorSubscribersList> getViewVendorSubscribersMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamVendorSubscribersList> getViewVendorSubscribersMethod;
    if ((getViewVendorSubscribersMethod = VendorStreamsServiceGrpc.getViewVendorSubscribersMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewVendorSubscribersMethod = VendorStreamsServiceGrpc.getViewVendorSubscribersMethod) == null) {
          VendorStreamsServiceGrpc.getViewVendorSubscribersMethod = getViewVendorSubscribersMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamVendorSubscribersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewVendorSubscribers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamVendorSubscribersList.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewVendorSubscribers"))
              .build();
        }
      }
    }
    return getViewVendorSubscribersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VendorStream> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.VendorStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VendorStream> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.VendorStream> getViewByIDMethod;
    if ((getViewByIDMethod = VendorStreamsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewByIDMethod = VendorStreamsServiceGrpc.getViewByIDMethod) == null) {
          VendorStreamsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.VendorStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStream.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStream> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VendorStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStream> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStream> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = VendorStreamsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewByUUIDMethod = VendorStreamsServiceGrpc.getViewByUUIDMethod) == null) {
          VendorStreamsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStream.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VendorStream> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.VendorStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VendorStream> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.VendorStream> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = VendorStreamsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = VendorStreamsServiceGrpc.getViewEssentialByIDMethod) == null) {
          VendorStreamsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.VendorStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStream.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStream> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VendorStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStream> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStream> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = VendorStreamsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = VendorStreamsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          VendorStreamsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStream.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.VendorStreamsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.VendorStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.VendorStreamsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.VendorStreamsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = VendorStreamsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewFromIDsMethod = VendorStreamsServiceGrpc.getViewFromIDsMethod) == null) {
          VendorStreamsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.VendorStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.VendorStreamsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.VendorStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.VendorStreamsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.VendorStreamsList> getViewAllMethod;
    if ((getViewAllMethod = VendorStreamsServiceGrpc.getViewAllMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewAllMethod = VendorStreamsServiceGrpc.getViewAllMethod) == null) {
          VendorStreamsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.VendorStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VendorStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VendorStreamsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = VendorStreamsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = VendorStreamsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          VendorStreamsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VendorStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServicePaginationReq,
      com.scailo.sdk.VendorStreamsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.VendorStreamsServicePaginationReq.class,
      responseType = com.scailo.sdk.VendorStreamsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServicePaginationReq,
      com.scailo.sdk.VendorStreamsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServicePaginationReq, com.scailo.sdk.VendorStreamsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = VendorStreamsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = VendorStreamsServiceGrpc.getViewWithPaginationMethod) == null) {
          VendorStreamsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServicePaginationReq, com.scailo.sdk.VendorStreamsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceSearchAllReq,
      com.scailo.sdk.VendorStreamsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.VendorStreamsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.VendorStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceSearchAllReq,
      com.scailo.sdk.VendorStreamsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceSearchAllReq, com.scailo.sdk.VendorStreamsList> getSearchAllMethod;
    if ((getSearchAllMethod = VendorStreamsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getSearchAllMethod = VendorStreamsServiceGrpc.getSearchAllMethod) == null) {
          VendorStreamsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceSearchAllReq, com.scailo.sdk.VendorStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceFilterReq,
      com.scailo.sdk.VendorStreamsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.VendorStreamsServiceFilterReq.class,
      responseType = com.scailo.sdk.VendorStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceFilterReq,
      com.scailo.sdk.VendorStreamsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceFilterReq, com.scailo.sdk.VendorStreamsList> getFilterMethod;
    if ((getFilterMethod = VendorStreamsServiceGrpc.getFilterMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getFilterMethod = VendorStreamsServiceGrpc.getFilterMethod) == null) {
          VendorStreamsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceFilterReq, com.scailo.sdk.VendorStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.VendorStreamsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = VendorStreamsServiceGrpc.getCountMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getCountMethod = VendorStreamsServiceGrpc.getCountMethod) == null) {
          VendorStreamsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.VendorStreamsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VendorStreamsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = VendorStreamsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (VendorStreamsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = VendorStreamsServiceGrpc.getDownloadAsCSVMethod) == null) {
          VendorStreamsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VendorStreamsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorStreamsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new VendorStreamsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VendorStreamsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VendorStreamsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VendorStreamsServiceStub>() {
        @java.lang.Override
        public VendorStreamsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VendorStreamsServiceStub(channel, callOptions);
        }
      };
    return VendorStreamsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VendorStreamsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VendorStreamsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VendorStreamsServiceBlockingStub>() {
        @java.lang.Override
        public VendorStreamsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VendorStreamsServiceBlockingStub(channel, callOptions);
        }
      };
    return VendorStreamsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VendorStreamsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VendorStreamsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VendorStreamsServiceFutureStub>() {
        @java.lang.Override
        public VendorStreamsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VendorStreamsServiceFutureStub(channel, callOptions);
        }
      };
    return VendorStreamsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each vendor stream
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create
     * </pre>
     */
    default void create(com.scailo.sdk.VendorStreamsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    default void update(com.scailo.sdk.VendorStreamsServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    default void cancel(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Complete
     * </pre>
     */
    default void complete(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reopen
     * </pre>
     */
    default void reopen(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReopenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Repeat
     * </pre>
     */
    default void repeat(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepeatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add comment
     * </pre>
     */
    default void commentAdd(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommentAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a message to an vendor stream
     * </pre>
     */
    default void addMessage(com.scailo.sdk.VendorStreamsServiceMessageCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Saves a message for viewing it later
     * </pre>
     */
    default void saveMessageForLater(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveMessageForLaterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a message in an vendor stream
     * </pre>
     */
    default void deleteMessage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Vendor Stream Message by UUID
     * </pre>
     */
    default void viewMessageByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMessageByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all messages for given vendor stream UUID
     * </pre>
     */
    default void viewMessages(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamMessagesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View vendor stream messages for given vendor stream ID with pagination
     * </pre>
     */
    default void viewPaginatedMessages(com.scailo.sdk.VendorStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through vendor stream messages with pagination
     * </pre>
     */
    default void searchMessagesWithPagination(com.scailo.sdk.VendorStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMessagesWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    default void viewMessageReceipts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamMessageReceiptsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMessageReceiptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    default void addInternalSubscriber(com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddInternalSubscriberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an internal subscriber
     * </pre>
     */
    default void deleteInternalSubscriber(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInternalSubscriberMethod(), responseObserver);
    }

    /**
     * <pre>
     * View an internal subscriber for the given ID
     * </pre>
     */
    default void viewInternalSubscriberByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamInternalSubscriber> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInternalSubscriberByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all internal subscribers for given vendor stream UUID
     * </pre>
     */
    default void viewInternalSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamInternalSubscribersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInternalSubscribersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the vendor stream
     * </pre>
     */
    default void importInternalSubscribersFromTeam(com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportInternalSubscribersFromTeamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the vendor stream
     * </pre>
     */
    default void importInternalSubscribersFromDepartment(com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportInternalSubscribersFromDepartmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a vendor subscriber
     * </pre>
     */
    default void addVendorSubscriber(com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddVendorSubscriberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a vendor subscriber
     * </pre>
     */
    default void deleteVendorSubscriber(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVendorSubscriberMethod(), responseObserver);
    }

    /**
     * <pre>
     * View vendor subscriber for the given ID
     * </pre>
     */
    default void viewVendorSubscriberByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamVendorSubscriber> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewVendorSubscriberByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all vendor subscribers for given vendor stream UUID
     * </pre>
     */
    default void viewVendorSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamVendorSubscribersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewVendorSubscribersMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.VendorStreamsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.VendorStreamsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.VendorStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    default void count(com.scailo.sdk.VendorStreamsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.VendorStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VendorStreamsService.
   * <pre>
   *Describes the common methods applicable on each vendor stream
   * </pre>
   */
  public static abstract class VendorStreamsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VendorStreamsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VendorStreamsService.
   * <pre>
   *Describes the common methods applicable on each vendor stream
   * </pre>
   */
  public static final class VendorStreamsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VendorStreamsServiceStub> {
    private VendorStreamsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VendorStreamsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VendorStreamsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public void create(com.scailo.sdk.VendorStreamsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public void update(com.scailo.sdk.VendorStreamsServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    public void cancel(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Complete
     * </pre>
     */
    public void complete(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reopen
     * </pre>
     */
    public void reopen(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReopenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Repeat
     * </pre>
     */
    public void repeat(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add comment
     * </pre>
     */
    public void commentAdd(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommentAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a message to an vendor stream
     * </pre>
     */
    public void addMessage(com.scailo.sdk.VendorStreamsServiceMessageCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Saves a message for viewing it later
     * </pre>
     */
    public void saveMessageForLater(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveMessageForLaterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a message in an vendor stream
     * </pre>
     */
    public void deleteMessage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Vendor Stream Message by UUID
     * </pre>
     */
    public void viewMessageByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMessageByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all messages for given vendor stream UUID
     * </pre>
     */
    public void viewMessages(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamMessagesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View vendor stream messages for given vendor stream ID with pagination
     * </pre>
     */
    public void viewPaginatedMessages(com.scailo.sdk.VendorStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through vendor stream messages with pagination
     * </pre>
     */
    public void searchMessagesWithPagination(com.scailo.sdk.VendorStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMessagesWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    public void viewMessageReceipts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamMessageReceiptsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMessageReceiptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    public void addInternalSubscriber(com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddInternalSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an internal subscriber
     * </pre>
     */
    public void deleteInternalSubscriber(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInternalSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View an internal subscriber for the given ID
     * </pre>
     */
    public void viewInternalSubscriberByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamInternalSubscriber> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInternalSubscriberByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all internal subscribers for given vendor stream UUID
     * </pre>
     */
    public void viewInternalSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamInternalSubscribersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInternalSubscribersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the vendor stream
     * </pre>
     */
    public void importInternalSubscribersFromTeam(com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the vendor stream
     * </pre>
     */
    public void importInternalSubscribersFromDepartment(com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a vendor subscriber
     * </pre>
     */
    public void addVendorSubscriber(com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddVendorSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a vendor subscriber
     * </pre>
     */
    public void deleteVendorSubscriber(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVendorSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View vendor subscriber for the given ID
     * </pre>
     */
    public void viewVendorSubscriberByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamVendorSubscriber> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewVendorSubscriberByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all vendor subscribers for given vendor stream UUID
     * </pre>
     */
    public void viewVendorSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamVendorSubscribersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewVendorSubscribersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.VendorStreamsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.VendorStreamsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.VendorStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public void count(com.scailo.sdk.VendorStreamsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    public void downloadAsCSV(com.scailo.sdk.VendorStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VendorStreamsService.
   * <pre>
   *Describes the common methods applicable on each vendor stream
   * </pre>
   */
  public static final class VendorStreamsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VendorStreamsServiceBlockingStub> {
    private VendorStreamsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VendorStreamsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VendorStreamsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID create(com.scailo.sdk.VendorStreamsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID update(com.scailo.sdk.VendorStreamsServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID cancel(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Complete
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID complete(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reopen
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID reopen(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReopenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Repeat
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID repeat(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepeatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add comment
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID commentAdd(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommentAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a message to an vendor stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID addMessage(com.scailo.sdk.VendorStreamsServiceMessageCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Saves a message for viewing it later
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID saveMessageForLater(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveMessageForLaterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a message in an vendor stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID deleteMessage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Vendor Stream Message by UUID
     * </pre>
     */
    public com.scailo.sdk.VendorStreamMessage viewMessageByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMessageByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all messages for given vendor stream UUID
     * </pre>
     */
    public com.scailo.sdk.VendorStreamMessagesList viewMessages(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View vendor stream messages for given vendor stream ID with pagination
     * </pre>
     */
    public com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse viewPaginatedMessages(com.scailo.sdk.VendorStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through vendor stream messages with pagination
     * </pre>
     */
    public com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse searchMessagesWithPagination(com.scailo.sdk.VendorStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMessagesWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    public com.scailo.sdk.VendorStreamMessageReceiptsList viewMessageReceipts(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMessageReceiptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addInternalSubscriber(com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddInternalSubscriberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an internal subscriber
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteInternalSubscriber(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInternalSubscriberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View an internal subscriber for the given ID
     * </pre>
     */
    public com.scailo.sdk.VendorStreamInternalSubscriber viewInternalSubscriberByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInternalSubscriberByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all internal subscribers for given vendor stream UUID
     * </pre>
     */
    public com.scailo.sdk.VendorStreamInternalSubscribersList viewInternalSubscribers(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInternalSubscribersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the vendor stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importInternalSubscribersFromTeam(com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportInternalSubscribersFromTeamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the vendor stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importInternalSubscribersFromDepartment(com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportInternalSubscribersFromDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a vendor subscriber
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addVendorSubscriber(com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddVendorSubscriberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a vendor subscriber
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteVendorSubscriber(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVendorSubscriberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View vendor subscriber for the given ID
     * </pre>
     */
    public com.scailo.sdk.VendorStreamVendorSubscriber viewVendorSubscriberByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewVendorSubscriberByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all vendor subscribers for given vendor stream UUID
     * </pre>
     */
    public com.scailo.sdk.VendorStreamVendorSubscribersList viewVendorSubscribers(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewVendorSubscribersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.VendorStream viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.VendorStream viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.VendorStream viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.VendorStream viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.VendorStreamsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.VendorStreamsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.VendorStreamsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.VendorStreamsServicePaginationResponse viewWithPagination(com.scailo.sdk.VendorStreamsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.VendorStreamsList searchAll(com.scailo.sdk.VendorStreamsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.VendorStreamsList filter(com.scailo.sdk.VendorStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.VendorStreamsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.VendorStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VendorStreamsService.
   * <pre>
   *Describes the common methods applicable on each vendor stream
   * </pre>
   */
  public static final class VendorStreamsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VendorStreamsServiceFutureStub> {
    private VendorStreamsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VendorStreamsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VendorStreamsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> create(
        com.scailo.sdk.VendorStreamsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> update(
        com.scailo.sdk.VendorStreamsServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> cancel(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Complete
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> complete(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reopen
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> reopen(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReopenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Repeat
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> repeat(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepeatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add comment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> commentAdd(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommentAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a message to an vendor stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> addMessage(
        com.scailo.sdk.VendorStreamsServiceMessageCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Saves a message for viewing it later
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> saveMessageForLater(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveMessageForLaterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a message in an vendor stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> deleteMessage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Vendor Stream Message by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamMessage> viewMessageByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMessageByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all messages for given vendor stream UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamMessagesList> viewMessages(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View vendor stream messages for given vendor stream ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> viewPaginatedMessages(
        com.scailo.sdk.VendorStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through vendor stream messages with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse> searchMessagesWithPagination(
        com.scailo.sdk.VendorStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMessagesWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamMessageReceiptsList> viewMessageReceipts(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMessageReceiptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addInternalSubscriber(
        com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddInternalSubscriberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an internal subscriber
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteInternalSubscriber(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInternalSubscriberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View an internal subscriber for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamInternalSubscriber> viewInternalSubscriberByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInternalSubscriberByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all internal subscribers for given vendor stream UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamInternalSubscribersList> viewInternalSubscribers(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInternalSubscribersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the vendor stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importInternalSubscribersFromTeam(
        com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromTeamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the vendor stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importInternalSubscribersFromDepartment(
        com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromDepartmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a vendor subscriber
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addVendorSubscriber(
        com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddVendorSubscriberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a vendor subscriber
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteVendorSubscriber(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVendorSubscriberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View vendor subscriber for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamVendorSubscriber> viewVendorSubscriberByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewVendorSubscriberByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all vendor subscribers for given vendor stream UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamVendorSubscribersList> viewVendorSubscribers(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewVendorSubscribersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStream> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStream> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStream> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStream> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.VendorStreamsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamsList> searchAll(
        com.scailo.sdk.VendorStreamsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorStreamsList> filter(
        com.scailo.sdk.VendorStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.VendorStreamsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadAsCSV(
        com.scailo.sdk.VendorStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_CANCEL = 2;
  private static final int METHODID_COMPLETE = 3;
  private static final int METHODID_REOPEN = 4;
  private static final int METHODID_REPEAT = 5;
  private static final int METHODID_COMMENT_ADD = 6;
  private static final int METHODID_ADD_MESSAGE = 7;
  private static final int METHODID_SAVE_MESSAGE_FOR_LATER = 8;
  private static final int METHODID_DELETE_MESSAGE = 9;
  private static final int METHODID_VIEW_MESSAGE_BY_UUID = 10;
  private static final int METHODID_VIEW_MESSAGES = 11;
  private static final int METHODID_VIEW_PAGINATED_MESSAGES = 12;
  private static final int METHODID_SEARCH_MESSAGES_WITH_PAGINATION = 13;
  private static final int METHODID_VIEW_MESSAGE_RECEIPTS = 14;
  private static final int METHODID_ADD_INTERNAL_SUBSCRIBER = 15;
  private static final int METHODID_DELETE_INTERNAL_SUBSCRIBER = 16;
  private static final int METHODID_VIEW_INTERNAL_SUBSCRIBER_BY_ID = 17;
  private static final int METHODID_VIEW_INTERNAL_SUBSCRIBERS = 18;
  private static final int METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_TEAM = 19;
  private static final int METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_DEPARTMENT = 20;
  private static final int METHODID_ADD_VENDOR_SUBSCRIBER = 21;
  private static final int METHODID_DELETE_VENDOR_SUBSCRIBER = 22;
  private static final int METHODID_VIEW_VENDOR_SUBSCRIBER_BY_ID = 23;
  private static final int METHODID_VIEW_VENDOR_SUBSCRIBERS = 24;
  private static final int METHODID_VIEW_BY_ID = 25;
  private static final int METHODID_VIEW_BY_UUID = 26;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 27;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 28;
  private static final int METHODID_VIEW_FROM_IDS = 29;
  private static final int METHODID_VIEW_ALL = 30;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 31;
  private static final int METHODID_VIEW_WITH_PAGINATION = 32;
  private static final int METHODID_SEARCH_ALL = 33;
  private static final int METHODID_FILTER = 34;
  private static final int METHODID_COUNT = 35;
  private static final int METHODID_DOWNLOAD_AS_CSV = 36;

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
          serviceImpl.create((com.scailo.sdk.VendorStreamsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.scailo.sdk.VendorStreamsServiceUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_COMPLETE:
          serviceImpl.complete((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_REOPEN:
          serviceImpl.reopen((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_REPEAT:
          serviceImpl.repeat((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_COMMENT_ADD:
          serviceImpl.commentAdd((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_ADD_MESSAGE:
          serviceImpl.addMessage((com.scailo.sdk.VendorStreamsServiceMessageCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_SAVE_MESSAGE_FOR_LATER:
          serviceImpl.saveMessageForLater((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGE:
          serviceImpl.deleteMessage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_VIEW_MESSAGE_BY_UUID:
          serviceImpl.viewMessageByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamMessage>) responseObserver);
          break;
        case METHODID_VIEW_MESSAGES:
          serviceImpl.viewMessages((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamMessagesList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_MESSAGES:
          serviceImpl.viewPaginatedMessages((com.scailo.sdk.VendorStreamMessagesSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse>) responseObserver);
          break;
        case METHODID_SEARCH_MESSAGES_WITH_PAGINATION:
          serviceImpl.searchMessagesWithPagination((com.scailo.sdk.VendorStreamMessagesSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse>) responseObserver);
          break;
        case METHODID_VIEW_MESSAGE_RECEIPTS:
          serviceImpl.viewMessageReceipts((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamMessageReceiptsList>) responseObserver);
          break;
        case METHODID_ADD_INTERNAL_SUBSCRIBER:
          serviceImpl.addInternalSubscriber((com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_INTERNAL_SUBSCRIBER:
          serviceImpl.deleteInternalSubscriber((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_INTERNAL_SUBSCRIBER_BY_ID:
          serviceImpl.viewInternalSubscriberByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamInternalSubscriber>) responseObserver);
          break;
        case METHODID_VIEW_INTERNAL_SUBSCRIBERS:
          serviceImpl.viewInternalSubscribers((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamInternalSubscribersList>) responseObserver);
          break;
        case METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_TEAM:
          serviceImpl.importInternalSubscribersFromTeam((com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_DEPARTMENT:
          serviceImpl.importInternalSubscribersFromDepartment((com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_VENDOR_SUBSCRIBER:
          serviceImpl.addVendorSubscriber((com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_VENDOR_SUBSCRIBER:
          serviceImpl.deleteVendorSubscriber((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_VENDOR_SUBSCRIBER_BY_ID:
          serviceImpl.viewVendorSubscriberByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamVendorSubscriber>) responseObserver);
          break;
        case METHODID_VIEW_VENDOR_SUBSCRIBERS:
          serviceImpl.viewVendorSubscribers((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamVendorSubscribersList>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStream>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.VendorStreamsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.VendorStreamsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.VendorStreamsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorStreamsList>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.VendorStreamsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.VendorStreamsServiceFilterReq) request,
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
              com.scailo.sdk.VendorStreamsServiceCreateRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceUpdateRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_UPDATE)))
        .addMethod(
          getCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_CANCEL)))
        .addMethod(
          getCompleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_COMPLETE)))
        .addMethod(
          getReopenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_REOPEN)))
        .addMethod(
          getRepeatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_REPEAT)))
        .addMethod(
          getCommentAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_COMMENT_ADD)))
        .addMethod(
          getAddMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceMessageCreateRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_ADD_MESSAGE)))
        .addMethod(
          getSaveMessageForLaterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_SAVE_MESSAGE_FOR_LATER)))
        .addMethod(
          getDeleteMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_DELETE_MESSAGE)))
        .addMethod(
          getViewMessageByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VendorStreamMessage>(
                service, METHODID_VIEW_MESSAGE_BY_UUID)))
        .addMethod(
          getViewMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VendorStreamMessagesList>(
                service, METHODID_VIEW_MESSAGES)))
        .addMethod(
          getViewPaginatedMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamMessagesSearchRequest,
              com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse>(
                service, METHODID_VIEW_PAGINATED_MESSAGES)))
        .addMethod(
          getSearchMessagesWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamMessagesSearchRequest,
              com.scailo.sdk.VendorStreamsServicePaginatedMessagesResponse>(
                service, METHODID_SEARCH_MESSAGES_WITH_PAGINATION)))
        .addMethod(
          getViewMessageReceiptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VendorStreamMessageReceiptsList>(
                service, METHODID_VIEW_MESSAGE_RECEIPTS)))
        .addMethod(
          getAddInternalSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceInternalSubscriberCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_INTERNAL_SUBSCRIBER)))
        .addMethod(
          getDeleteInternalSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_INTERNAL_SUBSCRIBER)))
        .addMethod(
          getViewInternalSubscriberByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.VendorStreamInternalSubscriber>(
                service, METHODID_VIEW_INTERNAL_SUBSCRIBER_BY_ID)))
        .addMethod(
          getViewInternalSubscribersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VendorStreamInternalSubscribersList>(
                service, METHODID_VIEW_INTERNAL_SUBSCRIBERS)))
        .addMethod(
          getImportInternalSubscribersFromTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_TEAM)))
        .addMethod(
          getImportInternalSubscribersFromDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceImportInternalSubscribersRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_DEPARTMENT)))
        .addMethod(
          getAddVendorSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceVendorSubscriberCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_VENDOR_SUBSCRIBER)))
        .addMethod(
          getDeleteVendorSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_VENDOR_SUBSCRIBER)))
        .addMethod(
          getViewVendorSubscriberByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.VendorStreamVendorSubscriber>(
                service, METHODID_VIEW_VENDOR_SUBSCRIBER_BY_ID)))
        .addMethod(
          getViewVendorSubscribersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VendorStreamVendorSubscribersList>(
                service, METHODID_VIEW_VENDOR_SUBSCRIBERS)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.VendorStream>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VendorStream>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.VendorStream>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VendorStream>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.VendorStreamsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.VendorStreamsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VendorStreamsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServicePaginationReq,
              com.scailo.sdk.VendorStreamsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceSearchAllReq,
              com.scailo.sdk.VendorStreamsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceFilterReq,
              com.scailo.sdk.VendorStreamsList>(
                service, METHODID_FILTER)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VendorStreamsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class VendorStreamsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VendorStreamsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.VendorStreamsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VendorStreamsService");
    }
  }

  private static final class VendorStreamsServiceFileDescriptorSupplier
      extends VendorStreamsServiceBaseDescriptorSupplier {
    VendorStreamsServiceFileDescriptorSupplier() {}
  }

  private static final class VendorStreamsServiceMethodDescriptorSupplier
      extends VendorStreamsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VendorStreamsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VendorStreamsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VendorStreamsServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getCancelMethod())
              .addMethod(getCompleteMethod())
              .addMethod(getReopenMethod())
              .addMethod(getRepeatMethod())
              .addMethod(getCommentAddMethod())
              .addMethod(getAddMessageMethod())
              .addMethod(getSaveMessageForLaterMethod())
              .addMethod(getDeleteMessageMethod())
              .addMethod(getViewMessageByUUIDMethod())
              .addMethod(getViewMessagesMethod())
              .addMethod(getViewPaginatedMessagesMethod())
              .addMethod(getSearchMessagesWithPaginationMethod())
              .addMethod(getViewMessageReceiptsMethod())
              .addMethod(getAddInternalSubscriberMethod())
              .addMethod(getDeleteInternalSubscriberMethod())
              .addMethod(getViewInternalSubscriberByIDMethod())
              .addMethod(getViewInternalSubscribersMethod())
              .addMethod(getImportInternalSubscribersFromTeamMethod())
              .addMethod(getImportInternalSubscribersFromDepartmentMethod())
              .addMethod(getAddVendorSubscriberMethod())
              .addMethod(getDeleteVendorSubscriberMethod())
              .addMethod(getViewVendorSubscriberByIDMethod())
              .addMethod(getViewVendorSubscribersMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewAllForEntityUUIDMethod())
              .addMethod(getViewWithPaginationMethod())
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
