package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each client stream
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: client_streams.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientStreamsServiceGrpc {

  private ClientStreamsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.ClientStreamsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceCreateRequest,
      com.scailo.sdk.IdentifierUUID> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.ClientStreamsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceCreateRequest,
      com.scailo.sdk.IdentifierUUID> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceCreateRequest, com.scailo.sdk.IdentifierUUID> getCreateMethod;
    if ((getCreateMethod = ClientStreamsServiceGrpc.getCreateMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getCreateMethod = ClientStreamsServiceGrpc.getCreateMethod) == null) {
          ClientStreamsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceCreateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceUpdateRequest,
      com.scailo.sdk.IdentifierUUID> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.scailo.sdk.ClientStreamsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceUpdateRequest,
      com.scailo.sdk.IdentifierUUID> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceUpdateRequest, com.scailo.sdk.IdentifierUUID> getUpdateMethod;
    if ((getUpdateMethod = ClientStreamsServiceGrpc.getUpdateMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getUpdateMethod = ClientStreamsServiceGrpc.getUpdateMethod) == null) {
          ClientStreamsServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceUpdateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("Update"))
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
    if ((getCancelMethod = ClientStreamsServiceGrpc.getCancelMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getCancelMethod = ClientStreamsServiceGrpc.getCancelMethod) == null) {
          ClientStreamsServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("Cancel"))
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
    if ((getCompleteMethod = ClientStreamsServiceGrpc.getCompleteMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getCompleteMethod = ClientStreamsServiceGrpc.getCompleteMethod) == null) {
          ClientStreamsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("Complete"))
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
    if ((getReopenMethod = ClientStreamsServiceGrpc.getReopenMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getReopenMethod = ClientStreamsServiceGrpc.getReopenMethod) == null) {
          ClientStreamsServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getRepeatMethod = ClientStreamsServiceGrpc.getRepeatMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getRepeatMethod = ClientStreamsServiceGrpc.getRepeatMethod) == null) {
          ClientStreamsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getCommentAddMethod = ClientStreamsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getCommentAddMethod = ClientStreamsServiceGrpc.getCommentAddMethod) == null) {
          ClientStreamsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("CommentAdd"))
              .build();
        }
      }
    }
    return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceMessageCreateRequest,
      com.scailo.sdk.IdentifierUUID> getAddMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMessage",
      requestType = com.scailo.sdk.ClientStreamsServiceMessageCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceMessageCreateRequest,
      com.scailo.sdk.IdentifierUUID> getAddMessageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceMessageCreateRequest, com.scailo.sdk.IdentifierUUID> getAddMessageMethod;
    if ((getAddMessageMethod = ClientStreamsServiceGrpc.getAddMessageMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getAddMessageMethod = ClientStreamsServiceGrpc.getAddMessageMethod) == null) {
          ClientStreamsServiceGrpc.getAddMessageMethod = getAddMessageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceMessageCreateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceMessageCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("AddMessage"))
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
    if ((getSaveMessageForLaterMethod = ClientStreamsServiceGrpc.getSaveMessageForLaterMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getSaveMessageForLaterMethod = ClientStreamsServiceGrpc.getSaveMessageForLaterMethod) == null) {
          ClientStreamsServiceGrpc.getSaveMessageForLaterMethod = getSaveMessageForLaterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveMessageForLater"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("SaveMessageForLater"))
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
    if ((getDeleteMessageMethod = ClientStreamsServiceGrpc.getDeleteMessageMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getDeleteMessageMethod = ClientStreamsServiceGrpc.getDeleteMessageMethod) == null) {
          ClientStreamsServiceGrpc.getDeleteMessageMethod = getDeleteMessageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("DeleteMessage"))
              .build();
        }
      }
    }
    return getDeleteMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamMessage> getViewMessageByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMessageByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ClientStreamMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamMessage> getViewMessageByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamMessage> getViewMessageByUUIDMethod;
    if ((getViewMessageByUUIDMethod = ClientStreamsServiceGrpc.getViewMessageByUUIDMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewMessageByUUIDMethod = ClientStreamsServiceGrpc.getViewMessageByUUIDMethod) == null) {
          ClientStreamsServiceGrpc.getViewMessageByUUIDMethod = getViewMessageByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMessageByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewMessageByUUID"))
              .build();
        }
      }
    }
    return getViewMessageByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamMessagesList> getViewMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMessages",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ClientStreamMessagesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamMessagesList> getViewMessagesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamMessagesList> getViewMessagesMethod;
    if ((getViewMessagesMethod = ClientStreamsServiceGrpc.getViewMessagesMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewMessagesMethod = ClientStreamsServiceGrpc.getViewMessagesMethod) == null) {
          ClientStreamsServiceGrpc.getViewMessagesMethod = getViewMessagesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamMessagesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamMessagesList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewMessages"))
              .build();
        }
      }
    }
    return getViewMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamMessagesSearchRequest,
      com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> getViewPaginatedMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedMessages",
      requestType = com.scailo.sdk.ClientStreamMessagesSearchRequest.class,
      responseType = com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamMessagesSearchRequest,
      com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> getViewPaginatedMessagesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamMessagesSearchRequest, com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> getViewPaginatedMessagesMethod;
    if ((getViewPaginatedMessagesMethod = ClientStreamsServiceGrpc.getViewPaginatedMessagesMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewPaginatedMessagesMethod = ClientStreamsServiceGrpc.getViewPaginatedMessagesMethod) == null) {
          ClientStreamsServiceGrpc.getViewPaginatedMessagesMethod = getViewPaginatedMessagesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamMessagesSearchRequest, com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamMessagesSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewPaginatedMessages"))
              .build();
        }
      }
    }
    return getViewPaginatedMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamMessagesSearchRequest,
      com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> getSearchMessagesWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchMessagesWithPagination",
      requestType = com.scailo.sdk.ClientStreamMessagesSearchRequest.class,
      responseType = com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamMessagesSearchRequest,
      com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> getSearchMessagesWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamMessagesSearchRequest, com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> getSearchMessagesWithPaginationMethod;
    if ((getSearchMessagesWithPaginationMethod = ClientStreamsServiceGrpc.getSearchMessagesWithPaginationMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getSearchMessagesWithPaginationMethod = ClientStreamsServiceGrpc.getSearchMessagesWithPaginationMethod) == null) {
          ClientStreamsServiceGrpc.getSearchMessagesWithPaginationMethod = getSearchMessagesWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamMessagesSearchRequest, com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchMessagesWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamMessagesSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("SearchMessagesWithPagination"))
              .build();
        }
      }
    }
    return getSearchMessagesWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamMessageReceiptsList> getViewMessageReceiptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewMessageReceipts",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ClientStreamMessageReceiptsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamMessageReceiptsList> getViewMessageReceiptsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamMessageReceiptsList> getViewMessageReceiptsMethod;
    if ((getViewMessageReceiptsMethod = ClientStreamsServiceGrpc.getViewMessageReceiptsMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewMessageReceiptsMethod = ClientStreamsServiceGrpc.getViewMessageReceiptsMethod) == null) {
          ClientStreamsServiceGrpc.getViewMessageReceiptsMethod = getViewMessageReceiptsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamMessageReceiptsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewMessageReceipts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamMessageReceiptsList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewMessageReceipts"))
              .build();
        }
      }
    }
    return getViewMessageReceiptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInternalSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddInternalSubscriber",
      requestType = com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInternalSubscriberMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse> getAddInternalSubscriberMethod;
    if ((getAddInternalSubscriberMethod = ClientStreamsServiceGrpc.getAddInternalSubscriberMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getAddInternalSubscriberMethod = ClientStreamsServiceGrpc.getAddInternalSubscriberMethod) == null) {
          ClientStreamsServiceGrpc.getAddInternalSubscriberMethod = getAddInternalSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddInternalSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("AddInternalSubscriber"))
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
    if ((getDeleteInternalSubscriberMethod = ClientStreamsServiceGrpc.getDeleteInternalSubscriberMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getDeleteInternalSubscriberMethod = ClientStreamsServiceGrpc.getDeleteInternalSubscriberMethod) == null) {
          ClientStreamsServiceGrpc.getDeleteInternalSubscriberMethod = getDeleteInternalSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInternalSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("DeleteInternalSubscriber"))
              .build();
        }
      }
    }
    return getDeleteInternalSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ClientStreamInternalSubscriber> getViewInternalSubscriberByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInternalSubscriberByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ClientStreamInternalSubscriber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ClientStreamInternalSubscriber> getViewInternalSubscriberByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ClientStreamInternalSubscriber> getViewInternalSubscriberByIDMethod;
    if ((getViewInternalSubscriberByIDMethod = ClientStreamsServiceGrpc.getViewInternalSubscriberByIDMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewInternalSubscriberByIDMethod = ClientStreamsServiceGrpc.getViewInternalSubscriberByIDMethod) == null) {
          ClientStreamsServiceGrpc.getViewInternalSubscriberByIDMethod = getViewInternalSubscriberByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ClientStreamInternalSubscriber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInternalSubscriberByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamInternalSubscriber.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewInternalSubscriberByID"))
              .build();
        }
      }
    }
    return getViewInternalSubscriberByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamInternalSubscribersList> getViewInternalSubscribersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInternalSubscribers",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ClientStreamInternalSubscribersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamInternalSubscribersList> getViewInternalSubscribersMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamInternalSubscribersList> getViewInternalSubscribersMethod;
    if ((getViewInternalSubscribersMethod = ClientStreamsServiceGrpc.getViewInternalSubscribersMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewInternalSubscribersMethod = ClientStreamsServiceGrpc.getViewInternalSubscribersMethod) == null) {
          ClientStreamsServiceGrpc.getViewInternalSubscribersMethod = getViewInternalSubscribersMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamInternalSubscribersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInternalSubscribers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamInternalSubscribersList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewInternalSubscribers"))
              .build();
        }
      }
    }
    return getViewInternalSubscribersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportInternalSubscribersFromTeam",
      requestType = com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromTeamMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromTeamMethod;
    if ((getImportInternalSubscribersFromTeamMethod = ClientStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getImportInternalSubscribersFromTeamMethod = ClientStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod) == null) {
          ClientStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod = getImportInternalSubscribersFromTeamMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportInternalSubscribersFromTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ImportInternalSubscribersFromTeam"))
              .build();
        }
      }
    }
    return getImportInternalSubscribersFromTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportInternalSubscribersFromDepartment",
      requestType = com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest,
      com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromDepartmentMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse> getImportInternalSubscribersFromDepartmentMethod;
    if ((getImportInternalSubscribersFromDepartmentMethod = ClientStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getImportInternalSubscribersFromDepartmentMethod = ClientStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod) == null) {
          ClientStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod = getImportInternalSubscribersFromDepartmentMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportInternalSubscribersFromDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ImportInternalSubscribersFromDepartment"))
              .build();
        }
      }
    }
    return getImportInternalSubscribersFromDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddClientSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddClientSubscriber",
      requestType = com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddClientSubscriberMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse> getAddClientSubscriberMethod;
    if ((getAddClientSubscriberMethod = ClientStreamsServiceGrpc.getAddClientSubscriberMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getAddClientSubscriberMethod = ClientStreamsServiceGrpc.getAddClientSubscriberMethod) == null) {
          ClientStreamsServiceGrpc.getAddClientSubscriberMethod = getAddClientSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddClientSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("AddClientSubscriber"))
              .build();
        }
      }
    }
    return getAddClientSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteClientSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClientSubscriber",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteClientSubscriberMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteClientSubscriberMethod;
    if ((getDeleteClientSubscriberMethod = ClientStreamsServiceGrpc.getDeleteClientSubscriberMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getDeleteClientSubscriberMethod = ClientStreamsServiceGrpc.getDeleteClientSubscriberMethod) == null) {
          ClientStreamsServiceGrpc.getDeleteClientSubscriberMethod = getDeleteClientSubscriberMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteClientSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("DeleteClientSubscriber"))
              .build();
        }
      }
    }
    return getDeleteClientSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ClientStreamClientSubscriber> getViewClientSubscriberByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewClientSubscriberByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ClientStreamClientSubscriber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ClientStreamClientSubscriber> getViewClientSubscriberByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ClientStreamClientSubscriber> getViewClientSubscriberByIDMethod;
    if ((getViewClientSubscriberByIDMethod = ClientStreamsServiceGrpc.getViewClientSubscriberByIDMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewClientSubscriberByIDMethod = ClientStreamsServiceGrpc.getViewClientSubscriberByIDMethod) == null) {
          ClientStreamsServiceGrpc.getViewClientSubscriberByIDMethod = getViewClientSubscriberByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ClientStreamClientSubscriber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewClientSubscriberByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamClientSubscriber.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewClientSubscriberByID"))
              .build();
        }
      }
    }
    return getViewClientSubscriberByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamClientSubscribersList> getViewClientSubscribersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewClientSubscribers",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ClientStreamClientSubscribersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamClientSubscribersList> getViewClientSubscribersMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamClientSubscribersList> getViewClientSubscribersMethod;
    if ((getViewClientSubscribersMethod = ClientStreamsServiceGrpc.getViewClientSubscribersMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewClientSubscribersMethod = ClientStreamsServiceGrpc.getViewClientSubscribersMethod) == null) {
          ClientStreamsServiceGrpc.getViewClientSubscribersMethod = getViewClientSubscribersMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamClientSubscribersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewClientSubscribers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamClientSubscribersList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewClientSubscribers"))
              .build();
        }
      }
    }
    return getViewClientSubscribersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ClientStream> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ClientStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ClientStream> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ClientStream> getViewByIDMethod;
    if ((getViewByIDMethod = ClientStreamsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewByIDMethod = ClientStreamsServiceGrpc.getViewByIDMethod) == null) {
          ClientStreamsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ClientStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStream.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStream> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ClientStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStream> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStream> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = ClientStreamsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewByUUIDMethod = ClientStreamsServiceGrpc.getViewByUUIDMethod) == null) {
          ClientStreamsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStream.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ClientStream> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ClientStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ClientStream> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ClientStream> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = ClientStreamsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = ClientStreamsServiceGrpc.getViewEssentialByIDMethod) == null) {
          ClientStreamsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ClientStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStream.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStream> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ClientStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStream> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStream> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = ClientStreamsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = ClientStreamsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          ClientStreamsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStream.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.ClientStreamsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.ClientStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.ClientStreamsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.ClientStreamsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = ClientStreamsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewFromIDsMethod = ClientStreamsServiceGrpc.getViewFromIDsMethod) == null) {
          ClientStreamsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.ClientStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.ClientStreamsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.ClientStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.ClientStreamsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.ClientStreamsList> getViewAllMethod;
    if ((getViewAllMethod = ClientStreamsServiceGrpc.getViewAllMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewAllMethod = ClientStreamsServiceGrpc.getViewAllMethod) == null) {
          ClientStreamsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.ClientStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ClientStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ClientStreamsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = ClientStreamsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = ClientStreamsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          ClientStreamsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ClientStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServicePaginationReq,
      com.scailo.sdk.ClientStreamsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.ClientStreamsServicePaginationReq.class,
      responseType = com.scailo.sdk.ClientStreamsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServicePaginationReq,
      com.scailo.sdk.ClientStreamsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServicePaginationReq, com.scailo.sdk.ClientStreamsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = ClientStreamsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = ClientStreamsServiceGrpc.getViewWithPaginationMethod) == null) {
          ClientStreamsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServicePaginationReq, com.scailo.sdk.ClientStreamsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceSearchAllReq,
      com.scailo.sdk.ClientStreamsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.ClientStreamsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.ClientStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceSearchAllReq,
      com.scailo.sdk.ClientStreamsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceSearchAllReq, com.scailo.sdk.ClientStreamsList> getSearchAllMethod;
    if ((getSearchAllMethod = ClientStreamsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getSearchAllMethod = ClientStreamsServiceGrpc.getSearchAllMethod) == null) {
          ClientStreamsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceSearchAllReq, com.scailo.sdk.ClientStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceFilterReq,
      com.scailo.sdk.ClientStreamsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.ClientStreamsServiceFilterReq.class,
      responseType = com.scailo.sdk.ClientStreamsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceFilterReq,
      com.scailo.sdk.ClientStreamsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceFilterReq, com.scailo.sdk.ClientStreamsList> getFilterMethod;
    if ((getFilterMethod = ClientStreamsServiceGrpc.getFilterMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getFilterMethod = ClientStreamsServiceGrpc.getFilterMethod) == null) {
          ClientStreamsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceFilterReq, com.scailo.sdk.ClientStreamsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.ClientStreamsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = ClientStreamsServiceGrpc.getCountMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getCountMethod = ClientStreamsServiceGrpc.getCountMethod) == null) {
          ClientStreamsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.ClientStreamsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ClientStreamsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = ClientStreamsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (ClientStreamsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = ClientStreamsServiceGrpc.getDownloadAsCSVMethod) == null) {
          ClientStreamsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ClientStreamsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientStreamsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ClientStreamsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientStreamsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientStreamsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientStreamsServiceStub>() {
        @java.lang.Override
        public ClientStreamsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientStreamsServiceStub(channel, callOptions);
        }
      };
    return ClientStreamsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientStreamsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientStreamsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientStreamsServiceBlockingStub>() {
        @java.lang.Override
        public ClientStreamsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientStreamsServiceBlockingStub(channel, callOptions);
        }
      };
    return ClientStreamsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientStreamsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientStreamsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientStreamsServiceFutureStub>() {
        @java.lang.Override
        public ClientStreamsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientStreamsServiceFutureStub(channel, callOptions);
        }
      };
    return ClientStreamsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each client stream
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create
     * </pre>
     */
    default void create(com.scailo.sdk.ClientStreamsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    default void update(com.scailo.sdk.ClientStreamsServiceUpdateRequest request,
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
     * Add a message to an client stream
     * </pre>
     */
    default void addMessage(com.scailo.sdk.ClientStreamsServiceMessageCreateRequest request,
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
     * Delete a message in an client stream
     * </pre>
     */
    default void deleteMessage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Client Stream Message by UUID
     * </pre>
     */
    default void viewMessageByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMessageByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all messages for given client stream UUID
     * </pre>
     */
    default void viewMessages(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamMessagesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View client stream messages for given client stream ID with pagination
     * </pre>
     */
    default void viewPaginatedMessages(com.scailo.sdk.ClientStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through client stream messages with pagination
     * </pre>
     */
    default void searchMessagesWithPagination(com.scailo.sdk.ClientStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMessagesWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    default void viewMessageReceipts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamMessageReceiptsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMessageReceiptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    default void addInternalSubscriber(com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest request,
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
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamInternalSubscriber> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInternalSubscriberByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all internal subscribers for given client stream UUID
     * </pre>
     */
    default void viewInternalSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamInternalSubscribersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInternalSubscribersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the client stream
     * </pre>
     */
    default void importInternalSubscribersFromTeam(com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportInternalSubscribersFromTeamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the client stream
     * </pre>
     */
    default void importInternalSubscribersFromDepartment(com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportInternalSubscribersFromDepartmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a client subscriber
     * </pre>
     */
    default void addClientSubscriber(com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddClientSubscriberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a client subscriber
     * </pre>
     */
    default void deleteClientSubscriber(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteClientSubscriberMethod(), responseObserver);
    }

    /**
     * <pre>
     * View client subscriber for the given ID
     * </pre>
     */
    default void viewClientSubscriberByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamClientSubscriber> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewClientSubscriberByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all client subscribers for given client stream UUID
     * </pre>
     */
    default void viewClientSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamClientSubscribersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewClientSubscribersMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.ClientStreamsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.ClientStreamsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.ClientStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    default void count(com.scailo.sdk.ClientStreamsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.ClientStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClientStreamsService.
   * <pre>
   *Describes the common methods applicable on each client stream
   * </pre>
   */
  public static abstract class ClientStreamsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClientStreamsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClientStreamsService.
   * <pre>
   *Describes the common methods applicable on each client stream
   * </pre>
   */
  public static final class ClientStreamsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClientStreamsServiceStub> {
    private ClientStreamsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStreamsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientStreamsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public void create(com.scailo.sdk.ClientStreamsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public void update(com.scailo.sdk.ClientStreamsServiceUpdateRequest request,
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
     * Add a message to an client stream
     * </pre>
     */
    public void addMessage(com.scailo.sdk.ClientStreamsServiceMessageCreateRequest request,
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
     * Delete a message in an client stream
     * </pre>
     */
    public void deleteMessage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Client Stream Message by UUID
     * </pre>
     */
    public void viewMessageByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMessageByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all messages for given client stream UUID
     * </pre>
     */
    public void viewMessages(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamMessagesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View client stream messages for given client stream ID with pagination
     * </pre>
     */
    public void viewPaginatedMessages(com.scailo.sdk.ClientStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through client stream messages with pagination
     * </pre>
     */
    public void searchMessagesWithPagination(com.scailo.sdk.ClientStreamMessagesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMessagesWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    public void viewMessageReceipts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamMessageReceiptsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMessageReceiptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    public void addInternalSubscriber(com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest request,
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
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamInternalSubscriber> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInternalSubscriberByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all internal subscribers for given client stream UUID
     * </pre>
     */
    public void viewInternalSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamInternalSubscribersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInternalSubscribersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the client stream
     * </pre>
     */
    public void importInternalSubscribersFromTeam(com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the client stream
     * </pre>
     */
    public void importInternalSubscribersFromDepartment(com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a client subscriber
     * </pre>
     */
    public void addClientSubscriber(com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddClientSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a client subscriber
     * </pre>
     */
    public void deleteClientSubscriber(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteClientSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View client subscriber for the given ID
     * </pre>
     */
    public void viewClientSubscriberByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamClientSubscriber> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewClientSubscriberByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all client subscribers for given client stream UUID
     * </pre>
     */
    public void viewClientSubscribers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamClientSubscribersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewClientSubscribersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.ClientStreamsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.ClientStreamsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.ClientStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public void count(com.scailo.sdk.ClientStreamsServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.ClientStreamsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClientStreamsService.
   * <pre>
   *Describes the common methods applicable on each client stream
   * </pre>
   */
  public static final class ClientStreamsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClientStreamsServiceBlockingStub> {
    private ClientStreamsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStreamsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientStreamsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID create(com.scailo.sdk.ClientStreamsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID update(com.scailo.sdk.ClientStreamsServiceUpdateRequest request) {
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
     * Add a message to an client stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID addMessage(com.scailo.sdk.ClientStreamsServiceMessageCreateRequest request) {
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
     * Delete a message in an client stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID deleteMessage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Client Stream Message by UUID
     * </pre>
     */
    public com.scailo.sdk.ClientStreamMessage viewMessageByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMessageByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all messages for given client stream UUID
     * </pre>
     */
    public com.scailo.sdk.ClientStreamMessagesList viewMessages(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View client stream messages for given client stream ID with pagination
     * </pre>
     */
    public com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse viewPaginatedMessages(com.scailo.sdk.ClientStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through client stream messages with pagination
     * </pre>
     */
    public com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse searchMessagesWithPagination(com.scailo.sdk.ClientStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMessagesWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    public com.scailo.sdk.ClientStreamMessageReceiptsList viewMessageReceipts(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMessageReceiptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an internal subscriber
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addInternalSubscriber(com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest request) {
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
    public com.scailo.sdk.ClientStreamInternalSubscriber viewInternalSubscriberByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInternalSubscriberByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all internal subscribers for given client stream UUID
     * </pre>
     */
    public com.scailo.sdk.ClientStreamInternalSubscribersList viewInternalSubscribers(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInternalSubscribersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the client stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importInternalSubscribersFromTeam(com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportInternalSubscribersFromTeamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the client stream
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importInternalSubscribersFromDepartment(com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportInternalSubscribersFromDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a client subscriber
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addClientSubscriber(com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddClientSubscriberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a client subscriber
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteClientSubscriber(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteClientSubscriberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View client subscriber for the given ID
     * </pre>
     */
    public com.scailo.sdk.ClientStreamClientSubscriber viewClientSubscriberByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewClientSubscriberByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all client subscribers for given client stream UUID
     * </pre>
     */
    public com.scailo.sdk.ClientStreamClientSubscribersList viewClientSubscribers(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewClientSubscribersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.ClientStream viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.ClientStream viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.ClientStream viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.ClientStream viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.ClientStreamsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.ClientStreamsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.ClientStreamsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.ClientStreamsServicePaginationResponse viewWithPagination(com.scailo.sdk.ClientStreamsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.ClientStreamsList searchAll(com.scailo.sdk.ClientStreamsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.ClientStreamsList filter(com.scailo.sdk.ClientStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.ClientStreamsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.ClientStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClientStreamsService.
   * <pre>
   *Describes the common methods applicable on each client stream
   * </pre>
   */
  public static final class ClientStreamsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClientStreamsServiceFutureStub> {
    private ClientStreamsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStreamsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientStreamsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> create(
        com.scailo.sdk.ClientStreamsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> update(
        com.scailo.sdk.ClientStreamsServiceUpdateRequest request) {
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
     * Add a message to an client stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> addMessage(
        com.scailo.sdk.ClientStreamsServiceMessageCreateRequest request) {
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
     * Delete a message in an client stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> deleteMessage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Client Stream Message by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamMessage> viewMessageByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMessageByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all messages for given client stream UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamMessagesList> viewMessages(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View client stream messages for given client stream ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> viewPaginatedMessages(
        com.scailo.sdk.ClientStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through client stream messages with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse> searchMessagesWithPagination(
        com.scailo.sdk.ClientStreamMessagesSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMessagesWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all receipts for the given message UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamMessageReceiptsList> viewMessageReceipts(
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
        com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamInternalSubscriber> viewInternalSubscriberByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInternalSubscriberByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all internal subscribers for given client stream UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamInternalSubscribersList> viewInternalSubscribers(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInternalSubscribersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from team and returns the ID of the client stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importInternalSubscribersFromTeam(
        com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromTeamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import users as internal subscribers from department and returns the ID of the client stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importInternalSubscribersFromDepartment(
        com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportInternalSubscribersFromDepartmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a client subscriber
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addClientSubscriber(
        com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddClientSubscriberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a client subscriber
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteClientSubscriber(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteClientSubscriberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View client subscriber for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamClientSubscriber> viewClientSubscriberByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewClientSubscriberByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all client subscribers for given client stream UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamClientSubscribersList> viewClientSubscribers(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewClientSubscribersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStream> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStream> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStream> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStream> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.ClientStreamsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamsList> searchAll(
        com.scailo.sdk.ClientStreamsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientStreamsList> filter(
        com.scailo.sdk.ClientStreamsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.ClientStreamsServiceCountReq request) {
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
        com.scailo.sdk.ClientStreamsServiceFilterReq request) {
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
  private static final int METHODID_ADD_CLIENT_SUBSCRIBER = 21;
  private static final int METHODID_DELETE_CLIENT_SUBSCRIBER = 22;
  private static final int METHODID_VIEW_CLIENT_SUBSCRIBER_BY_ID = 23;
  private static final int METHODID_VIEW_CLIENT_SUBSCRIBERS = 24;
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
          serviceImpl.create((com.scailo.sdk.ClientStreamsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.scailo.sdk.ClientStreamsServiceUpdateRequest) request,
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
          serviceImpl.addMessage((com.scailo.sdk.ClientStreamsServiceMessageCreateRequest) request,
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
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamMessage>) responseObserver);
          break;
        case METHODID_VIEW_MESSAGES:
          serviceImpl.viewMessages((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamMessagesList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_MESSAGES:
          serviceImpl.viewPaginatedMessages((com.scailo.sdk.ClientStreamMessagesSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse>) responseObserver);
          break;
        case METHODID_SEARCH_MESSAGES_WITH_PAGINATION:
          serviceImpl.searchMessagesWithPagination((com.scailo.sdk.ClientStreamMessagesSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse>) responseObserver);
          break;
        case METHODID_VIEW_MESSAGE_RECEIPTS:
          serviceImpl.viewMessageReceipts((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamMessageReceiptsList>) responseObserver);
          break;
        case METHODID_ADD_INTERNAL_SUBSCRIBER:
          serviceImpl.addInternalSubscriber((com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_INTERNAL_SUBSCRIBER:
          serviceImpl.deleteInternalSubscriber((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_INTERNAL_SUBSCRIBER_BY_ID:
          serviceImpl.viewInternalSubscriberByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamInternalSubscriber>) responseObserver);
          break;
        case METHODID_VIEW_INTERNAL_SUBSCRIBERS:
          serviceImpl.viewInternalSubscribers((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamInternalSubscribersList>) responseObserver);
          break;
        case METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_TEAM:
          serviceImpl.importInternalSubscribersFromTeam((com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_DEPARTMENT:
          serviceImpl.importInternalSubscribersFromDepartment((com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_CLIENT_SUBSCRIBER:
          serviceImpl.addClientSubscriber((com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT_SUBSCRIBER:
          serviceImpl.deleteClientSubscriber((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_CLIENT_SUBSCRIBER_BY_ID:
          serviceImpl.viewClientSubscriberByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamClientSubscriber>) responseObserver);
          break;
        case METHODID_VIEW_CLIENT_SUBSCRIBERS:
          serviceImpl.viewClientSubscribers((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamClientSubscribersList>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStream>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.ClientStreamsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.ClientStreamsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.ClientStreamsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientStreamsList>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.ClientStreamsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.ClientStreamsServiceFilterReq) request,
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
              com.scailo.sdk.ClientStreamsServiceCreateRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServiceUpdateRequest,
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
              com.scailo.sdk.ClientStreamsServiceMessageCreateRequest,
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
              com.scailo.sdk.ClientStreamMessage>(
                service, METHODID_VIEW_MESSAGE_BY_UUID)))
        .addMethod(
          getViewMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ClientStreamMessagesList>(
                service, METHODID_VIEW_MESSAGES)))
        .addMethod(
          getViewPaginatedMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamMessagesSearchRequest,
              com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse>(
                service, METHODID_VIEW_PAGINATED_MESSAGES)))
        .addMethod(
          getSearchMessagesWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamMessagesSearchRequest,
              com.scailo.sdk.ClientStreamsServicePaginatedMessagesResponse>(
                service, METHODID_SEARCH_MESSAGES_WITH_PAGINATION)))
        .addMethod(
          getViewMessageReceiptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ClientStreamMessageReceiptsList>(
                service, METHODID_VIEW_MESSAGE_RECEIPTS)))
        .addMethod(
          getAddInternalSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServiceInternalSubscriberCreateRequest,
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
              com.scailo.sdk.ClientStreamInternalSubscriber>(
                service, METHODID_VIEW_INTERNAL_SUBSCRIBER_BY_ID)))
        .addMethod(
          getViewInternalSubscribersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ClientStreamInternalSubscribersList>(
                service, METHODID_VIEW_INTERNAL_SUBSCRIBERS)))
        .addMethod(
          getImportInternalSubscribersFromTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_TEAM)))
        .addMethod(
          getImportInternalSubscribersFromDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServiceImportInternalSubscribersRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_INTERNAL_SUBSCRIBERS_FROM_DEPARTMENT)))
        .addMethod(
          getAddClientSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServiceClientSubscriberCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_CLIENT_SUBSCRIBER)))
        .addMethod(
          getDeleteClientSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_CLIENT_SUBSCRIBER)))
        .addMethod(
          getViewClientSubscriberByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ClientStreamClientSubscriber>(
                service, METHODID_VIEW_CLIENT_SUBSCRIBER_BY_ID)))
        .addMethod(
          getViewClientSubscribersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ClientStreamClientSubscribersList>(
                service, METHODID_VIEW_CLIENT_SUBSCRIBERS)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ClientStream>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ClientStream>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ClientStream>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ClientStream>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.ClientStreamsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.ClientStreamsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ClientStreamsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServicePaginationReq,
              com.scailo.sdk.ClientStreamsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServiceSearchAllReq,
              com.scailo.sdk.ClientStreamsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServiceFilterReq,
              com.scailo.sdk.ClientStreamsList>(
                service, METHODID_FILTER)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ClientStreamsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class ClientStreamsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientStreamsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.ClientStreamsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientStreamsService");
    }
  }

  private static final class ClientStreamsServiceFileDescriptorSupplier
      extends ClientStreamsServiceBaseDescriptorSupplier {
    ClientStreamsServiceFileDescriptorSupplier() {}
  }

  private static final class ClientStreamsServiceMethodDescriptorSupplier
      extends ClientStreamsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClientStreamsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClientStreamsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientStreamsServiceFileDescriptorSupplier())
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
              .addMethod(getAddClientSubscriberMethod())
              .addMethod(getDeleteClientSubscriberMethod())
              .addMethod(getViewClientSubscriberByIDMethod())
              .addMethod(getViewClientSubscribersMethod())
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
