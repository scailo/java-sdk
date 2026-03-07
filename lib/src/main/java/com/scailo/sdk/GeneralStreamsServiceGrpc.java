package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each general stream
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: general_streams.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GeneralStreamsServiceGrpc {

  private GeneralStreamsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.GeneralStreamsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceCreateRequest,
      com.scailo.sdk.IdentifierUUID> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.GeneralStreamsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceCreateRequest,
      com.scailo.sdk.IdentifierUUID> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceCreateRequest, com.scailo.sdk.IdentifierUUID> getCreateMethod;
    if ((getCreateMethod = GeneralStreamsServiceGrpc.getCreateMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getCreateMethod = GeneralStreamsServiceGrpc.getCreateMethod) == null) {
          GeneralStreamsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceCreateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceUpdateRequest,
      com.scailo.sdk.IdentifierUUID> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.scailo.sdk.GeneralStreamsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceUpdateRequest,
      com.scailo.sdk.IdentifierUUID> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceUpdateRequest, com.scailo.sdk.IdentifierUUID> getUpdateMethod;
    if ((getUpdateMethod = GeneralStreamsServiceGrpc.getUpdateMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getUpdateMethod = GeneralStreamsServiceGrpc.getUpdateMethod) == null) {
          GeneralStreamsServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceUpdateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("Update"))
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
    if ((getCancelMethod = GeneralStreamsServiceGrpc.getCancelMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getCancelMethod = GeneralStreamsServiceGrpc.getCancelMethod) == null) {
          GeneralStreamsServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("Cancel"))
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
    if ((getCompleteMethod = GeneralStreamsServiceGrpc.getCompleteMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getCompleteMethod = GeneralStreamsServiceGrpc.getCompleteMethod) == null) {
          GeneralStreamsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("Complete"))
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
    if ((getReopenMethod = GeneralStreamsServiceGrpc.getReopenMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getReopenMethod = GeneralStreamsServiceGrpc.getReopenMethod) == null) {
          GeneralStreamsServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getRepeatMethod = GeneralStreamsServiceGrpc.getRepeatMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getRepeatMethod = GeneralStreamsServiceGrpc.getRepeatMethod) == null) {
          GeneralStreamsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getCommentAddMethod = GeneralStreamsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getCommentAddMethod = GeneralStreamsServiceGrpc.getCommentAddMethod) == null) {
          GeneralStreamsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("CommentAdd"))
              .build();
        }
      }
    }
    return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest,
      com.scailo.sdk.IdentifierUUID> getAddMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMessage",
      requestType = com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest,
      com.scailo.sdk.IdentifierUUID> getAddMessageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest, com.scailo.sdk.IdentifierUUID> getAddMessageMethod;
    if ((getAddMessageMethod = GeneralStreamsServiceGrpc.getAddMessageMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getAddMessageMethod = GeneralStreamsServiceGrpc.getAddMessageMethod) == null) {
          GeneralStreamsServiceGrpc.getAddMessageMethod = getAddMessageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("AddMessage"))
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
    if ((getSaveMessageForLaterMethod = GeneralStreamsServiceGrpc.getSaveMessageForLaterMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getSaveMessageForLaterMethod = GeneralStreamsServiceGrpc.getSaveMessageForLaterMethod) == null) {
          GeneralStreamsServiceGrpc.getSaveMessageForLaterMethod = getSaveMessageForLaterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveMessageForLater"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("SaveMessageForLater"))
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
    if ((getDeleteMessageMethod = GeneralStreamsServiceGrpc.getDeleteMessageMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getDeleteMessageMethod = GeneralStreamsServiceGrpc.getDeleteMessageMethod) == null) {
          GeneralStreamsServiceGrpc.getDeleteMessageMethod = getDeleteMessageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("DeleteMessage"))
              .build();
        }
      }
    }
    return getDeleteMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamMessage> getViewMessageByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMessageByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GeneralStreamMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamMessage> getViewMessageByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamMessage> getViewMessageByUUIDMethod;
    if ((getViewMessageByUUIDMethod = GeneralStreamsServiceGrpc.getViewMessageByUUIDMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewMessageByUUIDMethod = GeneralStreamsServiceGrpc.getViewMessageByUUIDMethod) == null) {
          GeneralStreamsServiceGrpc.getViewMessageByUUIDMethod = getViewMessageByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMessageByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamMessage.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewMessageByUUID"))
              .build();
        }
      }
    }
    return getViewMessageByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamMessagesList> getViewMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMessages",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GeneralStreamMessagesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamMessagesList> getViewMessagesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamMessagesList> getViewMessagesMethod;
    if ((getViewMessagesMethod = GeneralStreamsServiceGrpc.getViewMessagesMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewMessagesMethod = GeneralStreamsServiceGrpc.getViewMessagesMethod) == null) {
          GeneralStreamsServiceGrpc.getViewMessagesMethod = getViewMessagesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamMessagesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamMessagesList.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewMessages"))
              .build();
        }
      }
    }
    return getViewMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamMessagesSearchRequest,
      com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> getViewPaginatedMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedMessages",
      requestType = com.scailo.sdk.GeneralStreamMessagesSearchRequest.class,
      responseType = com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamMessagesSearchRequest,
      com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> getViewPaginatedMessagesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamMessagesSearchRequest, com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> getViewPaginatedMessagesMethod;
    if ((getViewPaginatedMessagesMethod = GeneralStreamsServiceGrpc.getViewPaginatedMessagesMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewPaginatedMessagesMethod = GeneralStreamsServiceGrpc.getViewPaginatedMessagesMethod) == null) {
          GeneralStreamsServiceGrpc.getViewPaginatedMessagesMethod = getViewPaginatedMessagesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamMessagesSearchRequest, com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamMessagesSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewPaginatedMessages"))
              .build();
        }
      }
    }
    return getViewPaginatedMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamMessagesSearchRequest,
      com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> getSearchMessagesWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchMessagesWithPagination",
      requestType = com.scailo.sdk.GeneralStreamMessagesSearchRequest.class,
      responseType = com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamMessagesSearchRequest,
      com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> getSearchMessagesWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamMessagesSearchRequest, com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> getSearchMessagesWithPaginationMethod;
    if ((getSearchMessagesWithPaginationMethod = GeneralStreamsServiceGrpc.getSearchMessagesWithPaginationMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getSearchMessagesWithPaginationMethod = GeneralStreamsServiceGrpc.getSearchMessagesWithPaginationMethod) == null) {
          GeneralStreamsServiceGrpc.getSearchMessagesWithPaginationMethod = getSearchMessagesWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamMessagesSearchRequest, com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchMessagesWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamMessagesSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("SearchMessagesWithPagination"))
              .build();
        }
      }
    }
    return getSearchMessagesWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamMessageReceiptsList> getViewMessageReceiptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMessageReceipts",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GeneralStreamMessageReceiptsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamMessageReceiptsList> getViewMessageReceiptsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamMessageReceiptsList> getViewMessageReceiptsMethod;
    if ((getViewMessageReceiptsMethod = GeneralStreamsServiceGrpc.getViewMessageReceiptsMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewMessageReceiptsMethod = GeneralStreamsServiceGrpc.getViewMessageReceiptsMethod) == null) {
          GeneralStreamsServiceGrpc.getViewMessageReceiptsMethod = getViewMessageReceiptsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamMessageReceiptsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMessageReceipts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamMessageReceiptsList.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewMessageReceipts"))
              .build();
        }
      }
    }
    return getViewMessageReceiptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInternalSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddInternalSubscriber",
      requestType = com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInternalSubscriberMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse> getAddInternalSubscriberMethod;
    if ((getAddInternalSubscriberMethod = GeneralStreamsServiceGrpc.getAddInternalSubscriberMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getAddInternalSubscriberMethod = GeneralStreamsServiceGrpc.getAddInternalSubscriberMethod) == null) {
          GeneralStreamsServiceGrpc.getAddInternalSubscriberMethod = getAddInternalSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddInternalSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("AddInternalSubscriber"))
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
    if ((getDeleteInternalSubscriberMethod = GeneralStreamsServiceGrpc.getDeleteInternalSubscriberMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getDeleteInternalSubscriberMethod = GeneralStreamsServiceGrpc.getDeleteInternalSubscriberMethod) == null) {
          GeneralStreamsServiceGrpc.getDeleteInternalSubscriberMethod = getDeleteInternalSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInternalSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("DeleteInternalSubscriber"))
              .build();
        }
      }
    }
    return getDeleteInternalSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GeneralStreamInternalSubscriber> getViewInternalSubscriberByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInternalSubscriberByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.GeneralStreamInternalSubscriber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GeneralStreamInternalSubscriber> getViewInternalSubscriberByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.GeneralStreamInternalSubscriber> getViewInternalSubscriberByIDMethod;
    if ((getViewInternalSubscriberByIDMethod = GeneralStreamsServiceGrpc.getViewInternalSubscriberByIDMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewInternalSubscriberByIDMethod = GeneralStreamsServiceGrpc.getViewInternalSubscriberByIDMethod) == null) {
          GeneralStreamsServiceGrpc.getViewInternalSubscriberByIDMethod = getViewInternalSubscriberByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.GeneralStreamInternalSubscriber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInternalSubscriberByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamInternalSubscriber.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewInternalSubscriberByID"))
              .build();
        }
      }
    }
    return getViewInternalSubscriberByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamInternalSubscribersList> getViewInternalSubscribersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInternalSubscribers",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GeneralStreamInternalSubscribersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamInternalSubscribersList> getViewInternalSubscribersMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamInternalSubscribersList> getViewInternalSubscribersMethod;
    if ((getViewInternalSubscribersMethod = GeneralStreamsServiceGrpc.getViewInternalSubscribersMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewInternalSubscribersMethod = GeneralStreamsServiceGrpc.getViewInternalSubscribersMethod) == null) {
          GeneralStreamsServiceGrpc.getViewInternalSubscribersMethod = getViewInternalSubscribersMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamInternalSubscribersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInternalSubscribers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamInternalSubscribersList.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewInternalSubscribers"))
              .build();
        }
      }
    }
    return getViewInternalSubscribersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportInternalSubscribersFromTeam",
      requestType = com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromTeamMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromTeamMethod;
    if ((getImportInternalSubscribersFromTeamMethod = GeneralStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getImportInternalSubscribersFromTeamMethod = GeneralStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod) == null) {
          GeneralStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod = getImportInternalSubscribersFromTeamMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportInternalSubscribersFromTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ImportInternalSubscribersFromTeam"))
              .build();
        }
      }
    }
    return getImportInternalSubscribersFromTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportInternalSubscribersFromDepartment",
      requestType = com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromDepartmentMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromDepartmentMethod;
    if ((getImportInternalSubscribersFromDepartmentMethod = GeneralStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getImportInternalSubscribersFromDepartmentMethod = GeneralStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod) == null) {
          GeneralStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod = getImportInternalSubscribersFromDepartmentMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportInternalSubscribersFromDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ImportInternalSubscribersFromDepartment"))
              .build();
        }
      }
    }
    return getImportInternalSubscribersFromDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GeneralStream> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.GeneralStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GeneralStream> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.GeneralStream> getViewByIDMethod;
    if ((getViewByIDMethod = GeneralStreamsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewByIDMethod = GeneralStreamsServiceGrpc.getViewByIDMethod) == null) {
          GeneralStreamsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.GeneralStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStream.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStream> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GeneralStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStream> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStream> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = GeneralStreamsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewByUUIDMethod = GeneralStreamsServiceGrpc.getViewByUUIDMethod) == null) {
          GeneralStreamsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStream.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GeneralStream> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.GeneralStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GeneralStream> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.GeneralStream> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = GeneralStreamsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = GeneralStreamsServiceGrpc.getViewEssentialByIDMethod) == null) {
          GeneralStreamsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.GeneralStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStream.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStream> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GeneralStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStream> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStream> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = GeneralStreamsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = GeneralStreamsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          GeneralStreamsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStream.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.GeneralStreamsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.GeneralStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.GeneralStreamsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.GeneralStreamsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = GeneralStreamsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewFromIDsMethod = GeneralStreamsServiceGrpc.getViewFromIDsMethod) == null) {
          GeneralStreamsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.GeneralStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.GeneralStreamsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.GeneralStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.GeneralStreamsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.GeneralStreamsList> getViewAllMethod;
    if ((getViewAllMethod = GeneralStreamsServiceGrpc.getViewAllMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewAllMethod = GeneralStreamsServiceGrpc.getViewAllMethod) == null) {
          GeneralStreamsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.GeneralStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GeneralStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GeneralStreamsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = GeneralStreamsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = GeneralStreamsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          GeneralStreamsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GeneralStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServicePaginationReq,
      com.scailo.sdk.GeneralStreamsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.GeneralStreamsServicePaginationReq.class,
      responseType = com.scailo.sdk.GeneralStreamsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServicePaginationReq,
      com.scailo.sdk.GeneralStreamsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServicePaginationReq, com.scailo.sdk.GeneralStreamsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = GeneralStreamsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = GeneralStreamsServiceGrpc.getViewWithPaginationMethod) == null) {
          GeneralStreamsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServicePaginationReq, com.scailo.sdk.GeneralStreamsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceSearchAllReq,
      com.scailo.sdk.GeneralStreamsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.GeneralStreamsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.GeneralStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceSearchAllReq,
      com.scailo.sdk.GeneralStreamsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceSearchAllReq, com.scailo.sdk.GeneralStreamsList> getSearchAllMethod;
    if ((getSearchAllMethod = GeneralStreamsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getSearchAllMethod = GeneralStreamsServiceGrpc.getSearchAllMethod) == null) {
          GeneralStreamsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceSearchAllReq, com.scailo.sdk.GeneralStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceFilterReq,
      com.scailo.sdk.GeneralStreamsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.GeneralStreamsServiceFilterReq.class,
      responseType = com.scailo.sdk.GeneralStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceFilterReq,
      com.scailo.sdk.GeneralStreamsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceFilterReq, com.scailo.sdk.GeneralStreamsList> getFilterMethod;
    if ((getFilterMethod = GeneralStreamsServiceGrpc.getFilterMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getFilterMethod = GeneralStreamsServiceGrpc.getFilterMethod) == null) {
          GeneralStreamsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceFilterReq, com.scailo.sdk.GeneralStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.GeneralStreamsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = GeneralStreamsServiceGrpc.getCountMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getCountMethod = GeneralStreamsServiceGrpc.getCountMethod) == null) {
          GeneralStreamsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.GeneralStreamsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GeneralStreamsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = GeneralStreamsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (GeneralStreamsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = GeneralStreamsServiceGrpc.getDownloadAsCSVMethod) == null) {
          GeneralStreamsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GeneralStreamsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GeneralStreamsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new GeneralStreamsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeneralStreamsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeneralStreamsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeneralStreamsServiceStub>() {
        @java.lang.Override
        public GeneralStreamsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeneralStreamsServiceStub(channel, callOptions);
        }
      };
    return GeneralStreamsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeneralStreamsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeneralStreamsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeneralStreamsServiceBlockingStub>() {
        @java.lang.Override
        public GeneralStreamsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeneralStreamsServiceBlockingStub(channel, callOptions);
        }
      };
    return GeneralStreamsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeneralStreamsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeneralStreamsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeneralStreamsServiceFutureStub>() {
        @java.lang.Override
        public GeneralStreamsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeneralStreamsServiceFutureStub(channel, callOptions);
        }
      };
    return GeneralStreamsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each general stream
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create
     * </pre>
     */
    default void create(com.scailo.sdk.GeneralStreamsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    default void update(com.scailo.sdk.GeneralStreamsServiceUpdateRequest request,
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
     * Add a message to an general stream
     * </pre>
     */
    default void addMessage(com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest request,
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
     * Delete a message in an general stream
     * </pre>
     */
    default void deleteMessage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View General Stream Message by UUID
     * </pre>
     */
    default void viewMessageByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMessageByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all messages for given general stream UUID
     * </pre>
     */
    default void viewMessages(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamMessagesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View general stream messages for given general stream ID with pagination
     * </pre>
     */
    default void viewPaginatedMessages(com.scailo.sdk.GeneralStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through general stream messages with pagination
     * </pre>
     */
    default void searchMessagesWithPagination(com.scailo.sdk.GeneralStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMessagesWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    default void viewMessageReceipts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamMessageReceiptsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMessageReceiptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    default void addInternalSubscriber(com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest request,
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
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamInternalSubscriber> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInternalSubscriberByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all internal subscribers for given general stream UUID
     * </pre>
     */
    default void viewInternalSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamInternalSubscribersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInternalSubscribersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the general stream
     * </pre>
     */
    default void importInternalSubscribersFromTeam(com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportInternalSubscribersFromTeamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the general stream
     * </pre>
     */
    default void importInternalSubscribersFromDepartment(com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportInternalSubscribersFromDepartmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.GeneralStreamsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.GeneralStreamsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.GeneralStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    default void count(com.scailo.sdk.GeneralStreamsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.GeneralStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GeneralStreamsService.
   * <pre>
   *Describes the common methods applicable on each general stream
   * </pre>
   */
  public static abstract class GeneralStreamsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GeneralStreamsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GeneralStreamsService.
   * <pre>
   *Describes the common methods applicable on each general stream
   * </pre>
   */
  public static final class GeneralStreamsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GeneralStreamsServiceStub> {
    private GeneralStreamsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeneralStreamsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeneralStreamsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public void create(com.scailo.sdk.GeneralStreamsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public void update(com.scailo.sdk.GeneralStreamsServiceUpdateRequest request,
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
     * Add a message to an general stream
     * </pre>
     */
    public void addMessage(com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest request,
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
     * Delete a message in an general stream
     * </pre>
     */
    public void deleteMessage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View General Stream Message by UUID
     * </pre>
     */
    public void viewMessageByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMessageByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all messages for given general stream UUID
     * </pre>
     */
    public void viewMessages(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamMessagesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View general stream messages for given general stream ID with pagination
     * </pre>
     */
    public void viewPaginatedMessages(com.scailo.sdk.GeneralStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through general stream messages with pagination
     * </pre>
     */
    public void searchMessagesWithPagination(com.scailo.sdk.GeneralStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMessagesWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    public void viewMessageReceipts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamMessageReceiptsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMessageReceiptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    public void addInternalSubscriber(com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest request,
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
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamInternalSubscriber> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInternalSubscriberByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all internal subscribers for given general stream UUID
     * </pre>
     */
    public void viewInternalSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamInternalSubscribersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInternalSubscribersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the general stream
     * </pre>
     */
    public void importInternalSubscribersFromTeam(com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the general stream
     * </pre>
     */
    public void importInternalSubscribersFromDepartment(com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.GeneralStreamsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.GeneralStreamsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.GeneralStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public void count(com.scailo.sdk.GeneralStreamsServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.GeneralStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GeneralStreamsService.
   * <pre>
   *Describes the common methods applicable on each general stream
   * </pre>
   */
  public static final class GeneralStreamsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GeneralStreamsServiceBlockingStub> {
    private GeneralStreamsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeneralStreamsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeneralStreamsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID create(com.scailo.sdk.GeneralStreamsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID update(com.scailo.sdk.GeneralStreamsServiceUpdateRequest request) {
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
     * Add a message to an general stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID addMessage(com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest request) {
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
     * Delete a message in an general stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID deleteMessage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View General Stream Message by UUID
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamMessage viewMessageByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMessageByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all messages for given general stream UUID
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamMessagesList viewMessages(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View general stream messages for given general stream ID with pagination
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse viewPaginatedMessages(com.scailo.sdk.GeneralStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through general stream messages with pagination
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse searchMessagesWithPagination(com.scailo.sdk.GeneralStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMessagesWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamMessageReceiptsList viewMessageReceipts(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMessageReceiptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addInternalSubscriber(com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest request) {
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
    public com.scailo.sdk.GeneralStreamInternalSubscriber viewInternalSubscriberByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInternalSubscriberByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all internal subscribers for given general stream UUID
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamInternalSubscribersList viewInternalSubscribers(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInternalSubscribersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the general stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importInternalSubscribersFromTeam(com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportInternalSubscribersFromTeamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the general stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importInternalSubscribersFromDepartment(com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportInternalSubscribersFromDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.GeneralStream viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.GeneralStream viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.GeneralStream viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.GeneralStream viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamsServicePaginationResponse viewWithPagination(com.scailo.sdk.GeneralStreamsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamsList searchAll(com.scailo.sdk.GeneralStreamsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.GeneralStreamsList filter(com.scailo.sdk.GeneralStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.GeneralStreamsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.GeneralStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GeneralStreamsService.
   * <pre>
   *Describes the common methods applicable on each general stream
   * </pre>
   */
  public static final class GeneralStreamsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GeneralStreamsServiceFutureStub> {
    private GeneralStreamsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeneralStreamsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeneralStreamsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> create(
        com.scailo.sdk.GeneralStreamsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> update(
        com.scailo.sdk.GeneralStreamsServiceUpdateRequest request) {
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
     * Add a message to an general stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> addMessage(
        com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest request) {
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
     * Delete a message in an general stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> deleteMessage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View General Stream Message by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamMessage> viewMessageByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMessageByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all messages for given general stream UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamMessagesList> viewMessages(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View general stream messages for given general stream ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> viewPaginatedMessages(
        com.scailo.sdk.GeneralStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through general stream messages with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse> searchMessagesWithPagination(
        com.scailo.sdk.GeneralStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMessagesWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamMessageReceiptsList> viewMessageReceipts(
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
        com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamInternalSubscriber> viewInternalSubscriberByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInternalSubscriberByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all internal subscribers for given general stream UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamInternalSubscribersList> viewInternalSubscribers(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInternalSubscribersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the general stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importInternalSubscribersFromTeam(
        com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromTeamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the general stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importInternalSubscribersFromDepartment(
        com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromDepartmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStream> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStream> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStream> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStream> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.GeneralStreamsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamsList> searchAll(
        com.scailo.sdk.GeneralStreamsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GeneralStreamsList> filter(
        com.scailo.sdk.GeneralStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.GeneralStreamsServiceCountReq request) {
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
        com.scailo.sdk.GeneralStreamsServiceFilterReq request) {
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
  private static final int METHODID_VIEW_BY_ID = 21;
  private static final int METHODID_VIEW_BY_UUID = 22;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 23;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 24;
  private static final int METHODID_VIEW_FROM_IDS = 25;
  private static final int METHODID_VIEW_ALL = 26;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 27;
  private static final int METHODID_VIEW_WITH_PAGINATION = 28;
  private static final int METHODID_SEARCH_ALL = 29;
  private static final int METHODID_FILTER = 30;
  private static final int METHODID_COUNT = 31;
  private static final int METHODID_DOWNLOAD_AS_CSV = 32;

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
          serviceImpl.create((com.scailo.sdk.GeneralStreamsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.scailo.sdk.GeneralStreamsServiceUpdateRequest) request,
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
          serviceImpl.addMessage((com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest) request,
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
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamMessage>) responseObserver);
          break;
        case METHODID_VIEW_MESSAGES:
          serviceImpl.viewMessages((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamMessagesList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_MESSAGES:
          serviceImpl.viewPaginatedMessages((com.scailo.sdk.GeneralStreamMessagesSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse>) responseObserver);
          break;
        case METHODID_SEARCH_MESSAGES_WITH_PAGINATION:
          serviceImpl.searchMessagesWithPagination((com.scailo.sdk.GeneralStreamMessagesSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse>) responseObserver);
          break;
        case METHODID_VIEW_MESSAGE_RECEIPTS:
          serviceImpl.viewMessageReceipts((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamMessageReceiptsList>) responseObserver);
          break;
        case METHODID_ADD_INTERNAL_SUBSCRIBER:
          serviceImpl.addInternalSubscriber((com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_INTERNAL_SUBSCRIBER:
          serviceImpl.deleteInternalSubscriber((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_INTERNAL_SUBSCRIBER_BY_ID:
          serviceImpl.viewInternalSubscriberByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamInternalSubscriber>) responseObserver);
          break;
        case METHODID_VIEW_INTERNAL_SUBSCRIBERS:
          serviceImpl.viewInternalSubscribers((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamInternalSubscribersList>) responseObserver);
          break;
        case METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_TEAM:
          serviceImpl.importInternalSubscribersFromTeam((com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_DEPARTMENT:
          serviceImpl.importInternalSubscribersFromDepartment((com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStream>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.GeneralStreamsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.GeneralStreamsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.GeneralStreamsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GeneralStreamsList>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.GeneralStreamsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.GeneralStreamsServiceFilterReq) request,
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
              com.scailo.sdk.GeneralStreamsServiceCreateRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamsServiceUpdateRequest,
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
              com.scailo.sdk.GeneralStreamsServiceMessageCreateRequest,
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
              com.scailo.sdk.GeneralStreamMessage>(
                service, METHODID_VIEW_MESSAGE_BY_UUID)))
        .addMethod(
          getViewMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GeneralStreamMessagesList>(
                service, METHODID_VIEW_MESSAGES)))
        .addMethod(
          getViewPaginatedMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamMessagesSearchRequest,
              com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse>(
                service, METHODID_VIEW_PAGINATED_MESSAGES)))
        .addMethod(
          getSearchMessagesWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamMessagesSearchRequest,
              com.scailo.sdk.GeneralStreamsServicePaginatedMessagesResponse>(
                service, METHODID_SEARCH_MESSAGES_WITH_PAGINATION)))
        .addMethod(
          getViewMessageReceiptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GeneralStreamMessageReceiptsList>(
                service, METHODID_VIEW_MESSAGE_RECEIPTS)))
        .addMethod(
          getAddInternalSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamsServiceInternalSubscriberCreateRequest,
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
              com.scailo.sdk.GeneralStreamInternalSubscriber>(
                service, METHODID_VIEW_INTERNAL_SUBSCRIBER_BY_ID)))
        .addMethod(
          getViewInternalSubscribersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GeneralStreamInternalSubscribersList>(
                service, METHODID_VIEW_INTERNAL_SUBSCRIBERS)))
        .addMethod(
          getImportInternalSubscribersFromTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_TEAM)))
        .addMethod(
          getImportInternalSubscribersFromDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamsServiceImportInternalSubscribersRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_DEPARTMENT)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.GeneralStream>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GeneralStream>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.GeneralStream>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GeneralStream>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.GeneralStreamsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.GeneralStreamsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GeneralStreamsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamsServicePaginationReq,
              com.scailo.sdk.GeneralStreamsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamsServiceSearchAllReq,
              com.scailo.sdk.GeneralStreamsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamsServiceFilterReq,
              com.scailo.sdk.GeneralStreamsList>(
                service, METHODID_FILTER)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GeneralStreamsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class GeneralStreamsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeneralStreamsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.GeneralStreamsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GeneralStreamsService");
    }
  }

  private static final class GeneralStreamsServiceFileDescriptorSupplier
      extends GeneralStreamsServiceBaseDescriptorSupplier {
    GeneralStreamsServiceFileDescriptorSupplier() {}
  }

  private static final class GeneralStreamsServiceMethodDescriptorSupplier
      extends GeneralStreamsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GeneralStreamsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GeneralStreamsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GeneralStreamsServiceFileDescriptorSupplier())
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
