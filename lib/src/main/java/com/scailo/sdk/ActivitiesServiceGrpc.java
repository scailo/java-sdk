package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each activity
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: activities.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ActivitiesServiceGrpc {

  private ActivitiesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.ActivitiesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceCreateRequest,
      com.scailo.sdk.IdentifierUUID> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.ActivitiesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceCreateRequest,
      com.scailo.sdk.IdentifierUUID> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceCreateRequest, com.scailo.sdk.IdentifierUUID> getCreateMethod;
    if ((getCreateMethod = ActivitiesServiceGrpc.getCreateMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getCreateMethod = ActivitiesServiceGrpc.getCreateMethod) == null) {
          ActivitiesServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceCreateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceUpdateRequest,
      com.scailo.sdk.IdentifierUUID> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.scailo.sdk.ActivitiesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceUpdateRequest,
      com.scailo.sdk.IdentifierUUID> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceUpdateRequest, com.scailo.sdk.IdentifierUUID> getUpdateMethod;
    if ((getUpdateMethod = ActivitiesServiceGrpc.getUpdateMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getUpdateMethod = ActivitiesServiceGrpc.getUpdateMethod) == null) {
          ActivitiesServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceUpdateRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("Update"))
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
    if ((getCancelMethod = ActivitiesServiceGrpc.getCancelMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getCancelMethod = ActivitiesServiceGrpc.getCancelMethod) == null) {
          ActivitiesServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("Cancel"))
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
    if ((getCompleteMethod = ActivitiesServiceGrpc.getCompleteMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getCompleteMethod = ActivitiesServiceGrpc.getCompleteMethod) == null) {
          ActivitiesServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("Complete"))
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
    if ((getReopenMethod = ActivitiesServiceGrpc.getReopenMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getReopenMethod = ActivitiesServiceGrpc.getReopenMethod) == null) {
          ActivitiesServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getRepeatMethod = ActivitiesServiceGrpc.getRepeatMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getRepeatMethod = ActivitiesServiceGrpc.getRepeatMethod) == null) {
          ActivitiesServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getCommentAddMethod = ActivitiesServiceGrpc.getCommentAddMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getCommentAddMethod = ActivitiesServiceGrpc.getCommentAddMethod) == null) {
          ActivitiesServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("CommentAdd"))
              .build();
        }
      }
    }
    return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes,
      com.scailo.sdk.IdentifierUUID> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmail",
      requestType = com.scailo.sdk.IdentifierWithEmailAttributes.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes,
      com.scailo.sdk.IdentifierUUID> getSendEmailMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierUUID> getSendEmailMethod;
    if ((getSendEmailMethod = ActivitiesServiceGrpc.getSendEmailMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getSendEmailMethod = ActivitiesServiceGrpc.getSendEmailMethod) == null) {
          ActivitiesServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActionCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAction",
      requestType = com.scailo.sdk.ActivitiesServiceActionCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActionCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddActionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActionCreateRequest, com.scailo.sdk.IdentifierResponse> getAddActionMethod;
    if ((getAddActionMethod = ActivitiesServiceGrpc.getAddActionMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getAddActionMethod = ActivitiesServiceGrpc.getAddActionMethod) == null) {
          ActivitiesServiceGrpc.getAddActionMethod = getAddActionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceActionCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceActionCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("AddAction"))
              .build();
        }
      }
    }
    return getAddActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddActionWithTimerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddActionWithTimer",
      requestType = com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddActionWithTimerMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest, com.scailo.sdk.IdentifierResponse> getAddActionWithTimerMethod;
    if ((getAddActionWithTimerMethod = ActivitiesServiceGrpc.getAddActionWithTimerMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getAddActionWithTimerMethod = ActivitiesServiceGrpc.getAddActionWithTimerMethod) == null) {
          ActivitiesServiceGrpc.getAddActionWithTimerMethod = getAddActionWithTimerMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddActionWithTimer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("AddActionWithTimer"))
              .build();
        }
      }
    }
    return getAddActionWithTimerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActionUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyAction",
      requestType = com.scailo.sdk.ActivitiesServiceActionUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActionUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyActionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActionUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyActionMethod;
    if ((getModifyActionMethod = ActivitiesServiceGrpc.getModifyActionMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getModifyActionMethod = ActivitiesServiceGrpc.getModifyActionMethod) == null) {
          ActivitiesServiceGrpc.getModifyActionMethod = getModifyActionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceActionUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceActionUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ModifyAction"))
              .build();
        }
      }
    }
    return getModifyActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAction",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteActionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteActionMethod;
    if ((getDeleteActionMethod = ActivitiesServiceGrpc.getDeleteActionMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getDeleteActionMethod = ActivitiesServiceGrpc.getDeleteActionMethod) == null) {
          ActivitiesServiceGrpc.getDeleteActionMethod = getDeleteActionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("DeleteAction"))
              .build();
        }
      }
    }
    return getDeleteActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderActions",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderActionsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderActionsMethod;
    if ((getReorderActionsMethod = ActivitiesServiceGrpc.getReorderActionsMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getReorderActionsMethod = ActivitiesServiceGrpc.getReorderActionsMethod) == null) {
          ActivitiesServiceGrpc.getReorderActionsMethod = getReorderActionsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ReorderActions"))
              .build();
        }
      }
    }
    return getReorderActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityAction> getViewActionByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewActionByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ActivityAction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityAction> getViewActionByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityAction> getViewActionByIDMethod;
    if ((getViewActionByIDMethod = ActivitiesServiceGrpc.getViewActionByIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewActionByIDMethod = ActivitiesServiceGrpc.getViewActionByIDMethod) == null) {
          ActivitiesServiceGrpc.getViewActionByIDMethod = getViewActionByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityAction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewActionByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityAction.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewActionByID"))
              .build();
        }
      }
    }
    return getViewActionByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityActionStatistics> getViewActionStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewActionStatistics",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ActivityActionStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityActionStatistics> getViewActionStatisticsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityActionStatistics> getViewActionStatisticsMethod;
    if ((getViewActionStatisticsMethod = ActivitiesServiceGrpc.getViewActionStatisticsMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewActionStatisticsMethod = ActivitiesServiceGrpc.getViewActionStatisticsMethod) == null) {
          ActivitiesServiceGrpc.getViewActionStatisticsMethod = getViewActionStatisticsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityActionStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewActionStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityActionStatistics.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewActionStatistics"))
              .build();
        }
      }
    }
    return getViewActionStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityActionsList> getViewActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewActions",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ActivityActionsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityActionsList> getViewActionsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityActionsList> getViewActionsMethod;
    if ((getViewActionsMethod = ActivitiesServiceGrpc.getViewActionsMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewActionsMethod = ActivitiesServiceGrpc.getViewActionsMethod) == null) {
          ActivitiesServiceGrpc.getViewActionsMethod = getViewActionsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityActionsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityActionsList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewActions"))
              .build();
        }
      }
    }
    return getViewActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivityActionHistoryRequest,
      com.scailo.sdk.ActivityActionsList> getViewActionHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewActionHistory",
      requestType = com.scailo.sdk.ActivityActionHistoryRequest.class,
      responseType = com.scailo.sdk.ActivityActionsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivityActionHistoryRequest,
      com.scailo.sdk.ActivityActionsList> getViewActionHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivityActionHistoryRequest, com.scailo.sdk.ActivityActionsList> getViewActionHistoryMethod;
    if ((getViewActionHistoryMethod = ActivitiesServiceGrpc.getViewActionHistoryMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewActionHistoryMethod = ActivitiesServiceGrpc.getViewActionHistoryMethod) == null) {
          ActivitiesServiceGrpc.getViewActionHistoryMethod = getViewActionHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivityActionHistoryRequest, com.scailo.sdk.ActivityActionsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewActionHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityActionHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityActionsList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewActionHistory"))
              .build();
        }
      }
    }
    return getViewActionHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivityActionsSearchRequest,
      com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> getViewPaginatedActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedActions",
      requestType = com.scailo.sdk.ActivityActionsSearchRequest.class,
      responseType = com.scailo.sdk.ActivitiesServicePaginatedActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivityActionsSearchRequest,
      com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> getViewPaginatedActionsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivityActionsSearchRequest, com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> getViewPaginatedActionsMethod;
    if ((getViewPaginatedActionsMethod = ActivitiesServiceGrpc.getViewPaginatedActionsMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewPaginatedActionsMethod = ActivitiesServiceGrpc.getViewPaginatedActionsMethod) == null) {
          ActivitiesServiceGrpc.getViewPaginatedActionsMethod = getViewPaginatedActionsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivityActionsSearchRequest, com.scailo.sdk.ActivitiesServicePaginatedActionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityActionsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServicePaginatedActionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewPaginatedActions"))
              .build();
        }
      }
    }
    return getViewPaginatedActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivityActionsSearchRequest,
      com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> getSearchActionsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchActionsWithPagination",
      requestType = com.scailo.sdk.ActivityActionsSearchRequest.class,
      responseType = com.scailo.sdk.ActivitiesServicePaginatedActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivityActionsSearchRequest,
      com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> getSearchActionsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivityActionsSearchRequest, com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> getSearchActionsWithPaginationMethod;
    if ((getSearchActionsWithPaginationMethod = ActivitiesServiceGrpc.getSearchActionsWithPaginationMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getSearchActionsWithPaginationMethod = ActivitiesServiceGrpc.getSearchActionsWithPaginationMethod) == null) {
          ActivitiesServiceGrpc.getSearchActionsWithPaginationMethod = getSearchActionsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivityActionsSearchRequest, com.scailo.sdk.ActivitiesServicePaginatedActionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchActionsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityActionsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServicePaginatedActionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("SearchActionsWithPagination"))
              .build();
        }
      }
    }
    return getSearchActionsWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadActionsAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadActionsAsCSV",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadActionsAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadActionsAsCSVMethod;
    if ((getDownloadActionsAsCSVMethod = ActivitiesServiceGrpc.getDownloadActionsAsCSVMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getDownloadActionsAsCSVMethod = ActivitiesServiceGrpc.getDownloadActionsAsCSVMethod) == null) {
          ActivitiesServiceGrpc.getDownloadActionsAsCSVMethod = getDownloadActionsAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadActionsAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("DownloadActionsAsCSV"))
              .build();
        }
      }
    }
    return getDownloadActionsAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadActivityActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadActivityActions",
      requestType = com.scailo.sdk.IdentifierUUIDWithFile.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadActivityActionsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList> getUploadActivityActionsMethod;
    if ((getUploadActivityActionsMethod = ActivitiesServiceGrpc.getUploadActivityActionsMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getUploadActivityActionsMethod = ActivitiesServiceGrpc.getUploadActivityActionsMethod) == null) {
          ActivitiesServiceGrpc.getUploadActivityActionsMethod = getUploadActivityActionsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadActivityActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("UploadActivityActions"))
              .build();
        }
      }
    }
    return getUploadActivityActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddActivityTagAssociationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddActivityTagAssociation",
      requestType = com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddActivityTagAssociationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest, com.scailo.sdk.IdentifierResponse> getAddActivityTagAssociationMethod;
    if ((getAddActivityTagAssociationMethod = ActivitiesServiceGrpc.getAddActivityTagAssociationMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getAddActivityTagAssociationMethod = ActivitiesServiceGrpc.getAddActivityTagAssociationMethod) == null) {
          ActivitiesServiceGrpc.getAddActivityTagAssociationMethod = getAddActivityTagAssociationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddActivityTagAssociation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("AddActivityTagAssociation"))
              .build();
        }
      }
    }
    return getAddActivityTagAssociationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteActivityTagAssociationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteActivityTagAssociation",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteActivityTagAssociationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteActivityTagAssociationMethod;
    if ((getDeleteActivityTagAssociationMethod = ActivitiesServiceGrpc.getDeleteActivityTagAssociationMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getDeleteActivityTagAssociationMethod = ActivitiesServiceGrpc.getDeleteActivityTagAssociationMethod) == null) {
          ActivitiesServiceGrpc.getDeleteActivityTagAssociationMethod = getDeleteActivityTagAssociationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteActivityTagAssociation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("DeleteActivityTagAssociation"))
              .build();
        }
      }
    }
    return getDeleteActivityTagAssociationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityTagAssociation> getViewActivityTagAssociationByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewActivityTagAssociationByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ActivityTagAssociation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityTagAssociation> getViewActivityTagAssociationByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityTagAssociation> getViewActivityTagAssociationByIDMethod;
    if ((getViewActivityTagAssociationByIDMethod = ActivitiesServiceGrpc.getViewActivityTagAssociationByIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewActivityTagAssociationByIDMethod = ActivitiesServiceGrpc.getViewActivityTagAssociationByIDMethod) == null) {
          ActivitiesServiceGrpc.getViewActivityTagAssociationByIDMethod = getViewActivityTagAssociationByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityTagAssociation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewActivityTagAssociationByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityTagAssociation.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewActivityTagAssociationByID"))
              .build();
        }
      }
    }
    return getViewActivityTagAssociationByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityTagAssociationsList> getViewActivityTagAssociationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewActivityTagAssociations",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ActivityTagAssociationsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityTagAssociationsList> getViewActivityTagAssociationsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityTagAssociationsList> getViewActivityTagAssociationsMethod;
    if ((getViewActivityTagAssociationsMethod = ActivitiesServiceGrpc.getViewActivityTagAssociationsMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewActivityTagAssociationsMethod = ActivitiesServiceGrpc.getViewActivityTagAssociationsMethod) == null) {
          ActivitiesServiceGrpc.getViewActivityTagAssociationsMethod = getViewActivityTagAssociationsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityTagAssociationsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewActivityTagAssociations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityTagAssociationsList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewActivityTagAssociations"))
              .build();
        }
      }
    }
    return getViewActivityTagAssociationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceOwnerCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOwner",
      requestType = com.scailo.sdk.ActivitiesServiceOwnerCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceOwnerCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOwnerMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceOwnerCreateRequest, com.scailo.sdk.IdentifierResponse> getAddOwnerMethod;
    if ((getAddOwnerMethod = ActivitiesServiceGrpc.getAddOwnerMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getAddOwnerMethod = ActivitiesServiceGrpc.getAddOwnerMethod) == null) {
          ActivitiesServiceGrpc.getAddOwnerMethod = getAddOwnerMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceOwnerCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceOwnerCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("AddOwner"))
              .build();
        }
      }
    }
    return getAddOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOwner",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOwnerMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteOwnerMethod;
    if ((getDeleteOwnerMethod = ActivitiesServiceGrpc.getDeleteOwnerMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getDeleteOwnerMethod = ActivitiesServiceGrpc.getDeleteOwnerMethod) == null) {
          ActivitiesServiceGrpc.getDeleteOwnerMethod = getDeleteOwnerMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("DeleteOwner"))
              .build();
        }
      }
    }
    return getDeleteOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityOwner> getViewOwnerByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOwnerByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ActivityOwner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityOwner> getViewOwnerByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityOwner> getViewOwnerByIDMethod;
    if ((getViewOwnerByIDMethod = ActivitiesServiceGrpc.getViewOwnerByIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewOwnerByIDMethod = ActivitiesServiceGrpc.getViewOwnerByIDMethod) == null) {
          ActivitiesServiceGrpc.getViewOwnerByIDMethod = getViewOwnerByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityOwner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOwnerByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityOwner.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewOwnerByID"))
              .build();
        }
      }
    }
    return getViewOwnerByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityOwnersList> getViewOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOwners",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ActivityOwnersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityOwnersList> getViewOwnersMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityOwnersList> getViewOwnersMethod;
    if ((getViewOwnersMethod = ActivitiesServiceGrpc.getViewOwnersMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewOwnersMethod = ActivitiesServiceGrpc.getViewOwnersMethod) == null) {
          ActivitiesServiceGrpc.getViewOwnersMethod = getViewOwnersMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityOwnersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityOwnersList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewOwners"))
              .build();
        }
      }
    }
    return getViewOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceImportOwnersRequest,
      com.scailo.sdk.IdentifierResponse> getImportOwnersFromTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportOwnersFromTeam",
      requestType = com.scailo.sdk.ActivitiesServiceImportOwnersRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceImportOwnersRequest,
      com.scailo.sdk.IdentifierResponse> getImportOwnersFromTeamMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceImportOwnersRequest, com.scailo.sdk.IdentifierResponse> getImportOwnersFromTeamMethod;
    if ((getImportOwnersFromTeamMethod = ActivitiesServiceGrpc.getImportOwnersFromTeamMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getImportOwnersFromTeamMethod = ActivitiesServiceGrpc.getImportOwnersFromTeamMethod) == null) {
          ActivitiesServiceGrpc.getImportOwnersFromTeamMethod = getImportOwnersFromTeamMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceImportOwnersRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportOwnersFromTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceImportOwnersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ImportOwnersFromTeam"))
              .build();
        }
      }
    }
    return getImportOwnersFromTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceImportOwnersRequest,
      com.scailo.sdk.IdentifierResponse> getImportOwnersFromDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportOwnersFromDepartment",
      requestType = com.scailo.sdk.ActivitiesServiceImportOwnersRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceImportOwnersRequest,
      com.scailo.sdk.IdentifierResponse> getImportOwnersFromDepartmentMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceImportOwnersRequest, com.scailo.sdk.IdentifierResponse> getImportOwnersFromDepartmentMethod;
    if ((getImportOwnersFromDepartmentMethod = ActivitiesServiceGrpc.getImportOwnersFromDepartmentMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getImportOwnersFromDepartmentMethod = ActivitiesServiceGrpc.getImportOwnersFromDepartmentMethod) == null) {
          ActivitiesServiceGrpc.getImportOwnersFromDepartmentMethod = getImportOwnersFromDepartmentMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceImportOwnersRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportOwnersFromDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceImportOwnersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ImportOwnersFromDepartment"))
              .build();
        }
      }
    }
    return getImportOwnersFromDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSupervisorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSupervisor",
      requestType = com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSupervisorMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest, com.scailo.sdk.IdentifierResponse> getAddSupervisorMethod;
    if ((getAddSupervisorMethod = ActivitiesServiceGrpc.getAddSupervisorMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getAddSupervisorMethod = ActivitiesServiceGrpc.getAddSupervisorMethod) == null) {
          ActivitiesServiceGrpc.getAddSupervisorMethod = getAddSupervisorMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSupervisor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("AddSupervisor"))
              .build();
        }
      }
    }
    return getAddSupervisorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSupervisorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSupervisor",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSupervisorMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteSupervisorMethod;
    if ((getDeleteSupervisorMethod = ActivitiesServiceGrpc.getDeleteSupervisorMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getDeleteSupervisorMethod = ActivitiesServiceGrpc.getDeleteSupervisorMethod) == null) {
          ActivitiesServiceGrpc.getDeleteSupervisorMethod = getDeleteSupervisorMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSupervisor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("DeleteSupervisor"))
              .build();
        }
      }
    }
    return getDeleteSupervisorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivitySupervisor> getViewSupervisorByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSupervisorByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ActivitySupervisor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivitySupervisor> getViewSupervisorByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ActivitySupervisor> getViewSupervisorByIDMethod;
    if ((getViewSupervisorByIDMethod = ActivitiesServiceGrpc.getViewSupervisorByIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewSupervisorByIDMethod = ActivitiesServiceGrpc.getViewSupervisorByIDMethod) == null) {
          ActivitiesServiceGrpc.getViewSupervisorByIDMethod = getViewSupervisorByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ActivitySupervisor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSupervisorByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitySupervisor.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewSupervisorByID"))
              .build();
        }
      }
    }
    return getViewSupervisorByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivitySupervisorsList> getViewSupervisorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSupervisors",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ActivitySupervisorsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivitySupervisorsList> getViewSupervisorsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivitySupervisorsList> getViewSupervisorsMethod;
    if ((getViewSupervisorsMethod = ActivitiesServiceGrpc.getViewSupervisorsMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewSupervisorsMethod = ActivitiesServiceGrpc.getViewSupervisorsMethod) == null) {
          ActivitiesServiceGrpc.getViewSupervisorsMethod = getViewSupervisorsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivitySupervisorsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSupervisors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitySupervisorsList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewSupervisors"))
              .build();
        }
      }
    }
    return getViewSupervisorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceTimerCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddTimerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTimer",
      requestType = com.scailo.sdk.ActivitiesServiceTimerCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceTimerCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddTimerMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceTimerCreateRequest, com.scailo.sdk.IdentifierResponse> getAddTimerMethod;
    if ((getAddTimerMethod = ActivitiesServiceGrpc.getAddTimerMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getAddTimerMethod = ActivitiesServiceGrpc.getAddTimerMethod) == null) {
          ActivitiesServiceGrpc.getAddTimerMethod = getAddTimerMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceTimerCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTimer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceTimerCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("AddTimer"))
              .build();
        }
      }
    }
    return getAddTimerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceTimerEndRequest,
      com.scailo.sdk.IdentifierResponse> getEndTimerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndTimer",
      requestType = com.scailo.sdk.ActivitiesServiceTimerEndRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceTimerEndRequest,
      com.scailo.sdk.IdentifierResponse> getEndTimerMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceTimerEndRequest, com.scailo.sdk.IdentifierResponse> getEndTimerMethod;
    if ((getEndTimerMethod = ActivitiesServiceGrpc.getEndTimerMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getEndTimerMethod = ActivitiesServiceGrpc.getEndTimerMethod) == null) {
          ActivitiesServiceGrpc.getEndTimerMethod = getEndTimerMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceTimerEndRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndTimer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceTimerEndRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("EndTimer"))
              .build();
        }
      }
    }
    return getEndTimerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityTimer> getViewTimerByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewTimerByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ActivityTimer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ActivityTimer> getViewTimerByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityTimer> getViewTimerByIDMethod;
    if ((getViewTimerByIDMethod = ActivitiesServiceGrpc.getViewTimerByIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewTimerByIDMethod = ActivitiesServiceGrpc.getViewTimerByIDMethod) == null) {
          ActivitiesServiceGrpc.getViewTimerByIDMethod = getViewTimerByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ActivityTimer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewTimerByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityTimer.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewTimerByID"))
              .build();
        }
      }
    }
    return getViewTimerByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityTimersList> getViewTimersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewTimers",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ActivityTimersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityTimersList> getViewTimersMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityTimersList> getViewTimersMethod;
    if ((getViewTimersMethod = ActivitiesServiceGrpc.getViewTimersMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewTimersMethod = ActivitiesServiceGrpc.getViewTimersMethod) == null) {
          ActivitiesServiceGrpc.getViewTimersMethod = getViewTimersMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityTimersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewTimers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityTimersList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewTimers"))
              .build();
        }
      }
    }
    return getViewTimersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivityTimersSearchRequest,
      com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> getViewPaginatedTimersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedTimers",
      requestType = com.scailo.sdk.ActivityTimersSearchRequest.class,
      responseType = com.scailo.sdk.ActivitiesServicePaginatedTimersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivityTimersSearchRequest,
      com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> getViewPaginatedTimersMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivityTimersSearchRequest, com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> getViewPaginatedTimersMethod;
    if ((getViewPaginatedTimersMethod = ActivitiesServiceGrpc.getViewPaginatedTimersMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewPaginatedTimersMethod = ActivitiesServiceGrpc.getViewPaginatedTimersMethod) == null) {
          ActivitiesServiceGrpc.getViewPaginatedTimersMethod = getViewPaginatedTimersMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivityTimersSearchRequest, com.scailo.sdk.ActivitiesServicePaginatedTimersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedTimers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityTimersSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServicePaginatedTimersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewPaginatedTimers"))
              .build();
        }
      }
    }
    return getViewPaginatedTimersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivityTimersSearchRequest,
      com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> getSearchTimersWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchTimersWithPagination",
      requestType = com.scailo.sdk.ActivityTimersSearchRequest.class,
      responseType = com.scailo.sdk.ActivitiesServicePaginatedTimersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivityTimersSearchRequest,
      com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> getSearchTimersWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivityTimersSearchRequest, com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> getSearchTimersWithPaginationMethod;
    if ((getSearchTimersWithPaginationMethod = ActivitiesServiceGrpc.getSearchTimersWithPaginationMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getSearchTimersWithPaginationMethod = ActivitiesServiceGrpc.getSearchTimersWithPaginationMethod) == null) {
          ActivitiesServiceGrpc.getSearchTimersWithPaginationMethod = getSearchTimersWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivityTimersSearchRequest, com.scailo.sdk.ActivitiesServicePaginatedTimersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchTimersWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityTimersSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServicePaginatedTimersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("SearchTimersWithPagination"))
              .build();
        }
      }
    }
    return getSearchTimersWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadTimersAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadTimersAsCSV",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadTimersAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadTimersAsCSVMethod;
    if ((getDownloadTimersAsCSVMethod = ActivitiesServiceGrpc.getDownloadTimersAsCSVMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getDownloadTimersAsCSVMethod = ActivitiesServiceGrpc.getDownloadTimersAsCSVMethod) == null) {
          ActivitiesServiceGrpc.getDownloadTimersAsCSVMethod = getDownloadTimersAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadTimersAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("DownloadTimersAsCSV"))
              .build();
        }
      }
    }
    return getDownloadTimersAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Activity> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Activity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Activity> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Activity> getViewByIDMethod;
    if ((getViewByIDMethod = ActivitiesServiceGrpc.getViewByIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewByIDMethod = ActivitiesServiceGrpc.getViewByIDMethod) == null) {
          ActivitiesServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Activity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Activity.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Activity> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Activity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Activity> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Activity> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = ActivitiesServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewByUUIDMethod = ActivitiesServiceGrpc.getViewByUUIDMethod) == null) {
          ActivitiesServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Activity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Activity.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Activity> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Activity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Activity> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Activity> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = ActivitiesServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = ActivitiesServiceGrpc.getViewEssentialByIDMethod) == null) {
          ActivitiesServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Activity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Activity.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Activity> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Activity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Activity> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Activity> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = ActivitiesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = ActivitiesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          ActivitiesServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Activity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Activity.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.ActivitiesList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.ActivitiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.ActivitiesList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.ActivitiesList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = ActivitiesServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewFromIDsMethod = ActivitiesServiceGrpc.getViewFromIDsMethod) == null) {
          ActivitiesServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.ActivitiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.ActivitiesList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.ActivitiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.ActivitiesList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.ActivitiesList> getViewAllMethod;
    if ((getViewAllMethod = ActivitiesServiceGrpc.getViewAllMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewAllMethod = ActivitiesServiceGrpc.getViewAllMethod) == null) {
          ActivitiesServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.ActivitiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivitiesList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ActivitiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivitiesList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivitiesList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = ActivitiesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = ActivitiesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          ActivitiesServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivitiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServicePaginationReq,
      com.scailo.sdk.ActivitiesServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.ActivitiesServicePaginationReq.class,
      responseType = com.scailo.sdk.ActivitiesServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServicePaginationReq,
      com.scailo.sdk.ActivitiesServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServicePaginationReq, com.scailo.sdk.ActivitiesServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = ActivitiesServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewWithPaginationMethod = ActivitiesServiceGrpc.getViewWithPaginationMethod) == null) {
          ActivitiesServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServicePaginationReq, com.scailo.sdk.ActivitiesServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityStatistics> getViewStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewStatistics",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ActivityStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ActivityStatistics> getViewStatisticsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityStatistics> getViewStatisticsMethod;
    if ((getViewStatisticsMethod = ActivitiesServiceGrpc.getViewStatisticsMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getViewStatisticsMethod = ActivitiesServiceGrpc.getViewStatisticsMethod) == null) {
          ActivitiesServiceGrpc.getViewStatisticsMethod = getViewStatisticsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ActivityStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivityStatistics.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ViewStatistics"))
              .build();
        }
      }
    }
    return getViewStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceSearchAllReq,
      com.scailo.sdk.ActivitiesList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.ActivitiesServiceSearchAllReq.class,
      responseType = com.scailo.sdk.ActivitiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceSearchAllReq,
      com.scailo.sdk.ActivitiesList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceSearchAllReq, com.scailo.sdk.ActivitiesList> getSearchAllMethod;
    if ((getSearchAllMethod = ActivitiesServiceGrpc.getSearchAllMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getSearchAllMethod = ActivitiesServiceGrpc.getSearchAllMethod) == null) {
          ActivitiesServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceSearchAllReq, com.scailo.sdk.ActivitiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceFilterReq,
      com.scailo.sdk.ActivitiesList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.ActivitiesServiceFilterReq.class,
      responseType = com.scailo.sdk.ActivitiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceFilterReq,
      com.scailo.sdk.ActivitiesList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceFilterReq, com.scailo.sdk.ActivitiesList> getFilterMethod;
    if ((getFilterMethod = ActivitiesServiceGrpc.getFilterMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getFilterMethod = ActivitiesServiceGrpc.getFilterMethod) == null) {
          ActivitiesServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceFilterReq, com.scailo.sdk.ActivitiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.ActivitiesServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = ActivitiesServiceGrpc.getCountMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getCountMethod = ActivitiesServiceGrpc.getCountMethod) == null) {
          ActivitiesServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.ActivitiesServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActivitiesServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = ActivitiesServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = ActivitiesServiceGrpc.getDownloadAsCSVMethod) == null) {
          ActivitiesServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActivitiesServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActivitiesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
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
    if ((getImportFromCSVMethod = ActivitiesServiceGrpc.getImportFromCSVMethod) == null) {
      synchronized (ActivitiesServiceGrpc.class) {
        if ((getImportFromCSVMethod = ActivitiesServiceGrpc.getImportFromCSVMethod) == null) {
          ActivitiesServiceGrpc.getImportFromCSVMethod = getImportFromCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportFromCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDsList.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesServiceMethodDescriptorSupplier("ImportFromCSV"))
              .build();
        }
      }
    }
    return getImportFromCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ActivitiesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActivitiesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActivitiesServiceStub>() {
        @java.lang.Override
        public ActivitiesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActivitiesServiceStub(channel, callOptions);
        }
      };
    return ActivitiesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ActivitiesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActivitiesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActivitiesServiceBlockingStub>() {
        @java.lang.Override
        public ActivitiesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActivitiesServiceBlockingStub(channel, callOptions);
        }
      };
    return ActivitiesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ActivitiesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActivitiesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActivitiesServiceFutureStub>() {
        @java.lang.Override
        public ActivitiesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActivitiesServiceFutureStub(channel, callOptions);
        }
      };
    return ActivitiesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each activity
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create
     * </pre>
     */
    default void create(com.scailo.sdk.ActivitiesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    default void update(com.scailo.sdk.ActivitiesServiceUpdateRequest request,
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
     * Send Email
     * </pre>
     */
    default void sendEmail(com.scailo.sdk.IdentifierWithEmailAttributes request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an action to an activity
     * </pre>
     */
    default void addAction(com.scailo.sdk.ActivitiesServiceActionCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an action with an activity timer to an activity
     * </pre>
     */
    default void addActionWithTimer(com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddActionWithTimerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an action in an activity
     * </pre>
     */
    default void modifyAction(com.scailo.sdk.ActivitiesServiceActionUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an action in an activity
     * </pre>
     */
    default void deleteAction(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder actions in an activity
     * </pre>
     */
    default void reorderActions(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderActionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Activity Action by ID
     * </pre>
     */
    default void viewActionByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityAction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewActionByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Statistics of Activity Action by ID
     * </pre>
     */
    default void viewActionStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityActionStatistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewActionStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all actions for given activity UUID
     * </pre>
     */
    default void viewActions(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityActionsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewActionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the activity action
     * </pre>
     */
    default void viewActionHistory(com.scailo.sdk.ActivityActionHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityActionsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewActionHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View activity actions for given activity ID with pagination
     * </pre>
     */
    default void viewPaginatedActions(com.scailo.sdk.ActivityActionsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedActionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through activity actions with pagination
     * </pre>
     */
    default void searchActionsWithPagination(com.scailo.sdk.ActivityActionsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchActionsWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that could be used to upload actions from the filled CSV file. The same file can also be used as a template when there are no existing records
     * </pre>
     */
    default void downloadActionsAsCSV(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadActionsAsCSVMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload actions using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    default void uploadActivityActions(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadActivityActionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an activity tag
     * </pre>
     */
    default void addActivityTagAssociation(com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddActivityTagAssociationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an activity tag
     * </pre>
     */
    default void deleteActivityTagAssociation(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteActivityTagAssociationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View activity tag for the given ID
     * </pre>
     */
    default void viewActivityTagAssociationByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTagAssociation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewActivityTagAssociationByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all activities tags for given activity UUID
     * </pre>
     */
    default void viewActivityTagAssociations(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTagAssociationsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewActivityTagAssociationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an owner
     * </pre>
     */
    default void addOwner(com.scailo.sdk.ActivitiesServiceOwnerCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an owner
     * </pre>
     */
    default void deleteOwner(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * View an owner for the given ID
     * </pre>
     */
    default void viewOwnerByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityOwner> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOwnerByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all owners for given activity UUID
     * </pre>
     */
    default void viewOwners(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityOwnersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOwnersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import employees as owners from team and returns the ID of the activity
     * </pre>
     */
    default void importOwnersFromTeam(com.scailo.sdk.ActivitiesServiceImportOwnersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportOwnersFromTeamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import employees as owners from department and returns the ID of the activity
     * </pre>
     */
    default void importOwnersFromDepartment(com.scailo.sdk.ActivitiesServiceImportOwnersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportOwnersFromDepartmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a supervisor
     * </pre>
     */
    default void addSupervisor(com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSupervisorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a supervisor
     * </pre>
     */
    default void deleteSupervisor(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSupervisorMethod(), responseObserver);
    }

    /**
     * <pre>
     * View supervisor for the given ID
     * </pre>
     */
    default void viewSupervisorByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitySupervisor> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSupervisorByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all supervisors for given activity UUID
     * </pre>
     */
    default void viewSupervisors(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitySupervisorsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSupervisorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a timer
     * </pre>
     */
    default void addTimer(com.scailo.sdk.ActivitiesServiceTimerCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTimerMethod(), responseObserver);
    }

    /**
     * <pre>
     * End a timer
     * </pre>
     */
    default void endTimer(com.scailo.sdk.ActivitiesServiceTimerEndRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndTimerMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a timer for the given ID
     * </pre>
     */
    default void viewTimerByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTimer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewTimerByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all timers for given activity UUID
     * </pre>
     */
    default void viewTimers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTimersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewTimersMethod(), responseObserver);
    }

    /**
     * <pre>
     * View activity timers for given activity ID with pagination
     * </pre>
     */
    default void viewPaginatedTimers(com.scailo.sdk.ActivityTimersSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedTimersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through activity timers with pagination
     * </pre>
     */
    default void searchTimersWithPagination(com.scailo.sdk.ActivityTimersSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchTimersWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that could be used to upload timers from the filled CSV file. The same file can also be used as a template when there are no existing records
     * </pre>
     */
    default void downloadTimersAsCSV(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadTimersAsCSVMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Activity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Activity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Activity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Activity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.ActivitiesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Statistics of Activity
     * </pre>
     */
    default void viewStatistics(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityStatistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.ActivitiesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.ActivitiesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    default void count(com.scailo.sdk.ActivitiesServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.ActivitiesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import records using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    default void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportFromCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ActivitiesService.
   * <pre>
   *Describes the common methods applicable on each activity
   * </pre>
   */
  public static abstract class ActivitiesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ActivitiesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ActivitiesService.
   * <pre>
   *Describes the common methods applicable on each activity
   * </pre>
   */
  public static final class ActivitiesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ActivitiesServiceStub> {
    private ActivitiesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActivitiesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActivitiesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public void create(com.scailo.sdk.ActivitiesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public void update(com.scailo.sdk.ActivitiesServiceUpdateRequest request,
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
     * Send Email
     * </pre>
     */
    public void sendEmail(com.scailo.sdk.IdentifierWithEmailAttributes request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an action to an activity
     * </pre>
     */
    public void addAction(com.scailo.sdk.ActivitiesServiceActionCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an action with an activity timer to an activity
     * </pre>
     */
    public void addActionWithTimer(com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddActionWithTimerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an action in an activity
     * </pre>
     */
    public void modifyAction(com.scailo.sdk.ActivitiesServiceActionUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an action in an activity
     * </pre>
     */
    public void deleteAction(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder actions in an activity
     * </pre>
     */
    public void reorderActions(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Activity Action by ID
     * </pre>
     */
    public void viewActionByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityAction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewActionByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Statistics of Activity Action by ID
     * </pre>
     */
    public void viewActionStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityActionStatistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewActionStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all actions for given activity UUID
     * </pre>
     */
    public void viewActions(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityActionsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the activity action
     * </pre>
     */
    public void viewActionHistory(com.scailo.sdk.ActivityActionHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityActionsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewActionHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View activity actions for given activity ID with pagination
     * </pre>
     */
    public void viewPaginatedActions(com.scailo.sdk.ActivityActionsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through activity actions with pagination
     * </pre>
     */
    public void searchActionsWithPagination(com.scailo.sdk.ActivityActionsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchActionsWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that could be used to upload actions from the filled CSV file. The same file can also be used as a template when there are no existing records
     * </pre>
     */
    public void downloadActionsAsCSV(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadActionsAsCSVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload actions using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public void uploadActivityActions(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadActivityActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an activity tag
     * </pre>
     */
    public void addActivityTagAssociation(com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddActivityTagAssociationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an activity tag
     * </pre>
     */
    public void deleteActivityTagAssociation(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteActivityTagAssociationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View activity tag for the given ID
     * </pre>
     */
    public void viewActivityTagAssociationByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTagAssociation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewActivityTagAssociationByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all activities tags for given activity UUID
     * </pre>
     */
    public void viewActivityTagAssociations(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTagAssociationsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewActivityTagAssociationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an owner
     * </pre>
     */
    public void addOwner(com.scailo.sdk.ActivitiesServiceOwnerCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an owner
     * </pre>
     */
    public void deleteOwner(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View an owner for the given ID
     * </pre>
     */
    public void viewOwnerByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityOwner> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOwnerByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all owners for given activity UUID
     * </pre>
     */
    public void viewOwners(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityOwnersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import employees as owners from team and returns the ID of the activity
     * </pre>
     */
    public void importOwnersFromTeam(com.scailo.sdk.ActivitiesServiceImportOwnersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportOwnersFromTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import employees as owners from department and returns the ID of the activity
     * </pre>
     */
    public void importOwnersFromDepartment(com.scailo.sdk.ActivitiesServiceImportOwnersRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportOwnersFromDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a supervisor
     * </pre>
     */
    public void addSupervisor(com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSupervisorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a supervisor
     * </pre>
     */
    public void deleteSupervisor(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSupervisorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View supervisor for the given ID
     * </pre>
     */
    public void viewSupervisorByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitySupervisor> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSupervisorByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all supervisors for given activity UUID
     * </pre>
     */
    public void viewSupervisors(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitySupervisorsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSupervisorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a timer
     * </pre>
     */
    public void addTimer(com.scailo.sdk.ActivitiesServiceTimerCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTimerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * End a timer
     * </pre>
     */
    public void endTimer(com.scailo.sdk.ActivitiesServiceTimerEndRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndTimerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a timer for the given ID
     * </pre>
     */
    public void viewTimerByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTimer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewTimerByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all timers for given activity UUID
     * </pre>
     */
    public void viewTimers(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTimersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewTimersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View activity timers for given activity ID with pagination
     * </pre>
     */
    public void viewPaginatedTimers(com.scailo.sdk.ActivityTimersSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedTimersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through activity timers with pagination
     * </pre>
     */
    public void searchTimersWithPagination(com.scailo.sdk.ActivityTimersSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchTimersWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that could be used to upload timers from the filled CSV file. The same file can also be used as a template when there are no existing records
     * </pre>
     */
    public void downloadTimersAsCSV(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadTimersAsCSVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Activity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Activity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Activity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Activity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.ActivitiesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Statistics of Activity
     * </pre>
     */
    public void viewStatistics(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityStatistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.ActivitiesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.ActivitiesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public void count(com.scailo.sdk.ActivitiesServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.ActivitiesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import records using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    public void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ActivitiesService.
   * <pre>
   *Describes the common methods applicable on each activity
   * </pre>
   */
  public static final class ActivitiesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ActivitiesServiceBlockingStub> {
    private ActivitiesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActivitiesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActivitiesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID create(com.scailo.sdk.ActivitiesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID update(com.scailo.sdk.ActivitiesServiceUpdateRequest request) {
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
     * Send Email
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID sendEmail(com.scailo.sdk.IdentifierWithEmailAttributes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an action to an activity
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addAction(com.scailo.sdk.ActivitiesServiceActionCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an action with an activity timer to an activity
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addActionWithTimer(com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddActionWithTimerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an action in an activity
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyAction(com.scailo.sdk.ActivitiesServiceActionUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an action in an activity
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteAction(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder actions in an activity
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderActions(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderActionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Activity Action by ID
     * </pre>
     */
    public com.scailo.sdk.ActivityAction viewActionByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewActionByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Statistics of Activity Action by ID
     * </pre>
     */
    public com.scailo.sdk.ActivityActionStatistics viewActionStatistics(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewActionStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all actions for given activity UUID
     * </pre>
     */
    public com.scailo.sdk.ActivityActionsList viewActions(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewActionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the activity action
     * </pre>
     */
    public com.scailo.sdk.ActivityActionsList viewActionHistory(com.scailo.sdk.ActivityActionHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewActionHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View activity actions for given activity ID with pagination
     * </pre>
     */
    public com.scailo.sdk.ActivitiesServicePaginatedActionsResponse viewPaginatedActions(com.scailo.sdk.ActivityActionsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedActionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through activity actions with pagination
     * </pre>
     */
    public com.scailo.sdk.ActivitiesServicePaginatedActionsResponse searchActionsWithPagination(com.scailo.sdk.ActivityActionsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchActionsWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that could be used to upload actions from the filled CSV file. The same file can also be used as a template when there are no existing records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadActionsAsCSV(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadActionsAsCSVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upload actions using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public com.scailo.sdk.IdentifiersList uploadActivityActions(com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadActivityActionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an activity tag
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addActivityTagAssociation(com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddActivityTagAssociationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an activity tag
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteActivityTagAssociation(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteActivityTagAssociationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View activity tag for the given ID
     * </pre>
     */
    public com.scailo.sdk.ActivityTagAssociation viewActivityTagAssociationByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewActivityTagAssociationByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all activities tags for given activity UUID
     * </pre>
     */
    public com.scailo.sdk.ActivityTagAssociationsList viewActivityTagAssociations(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewActivityTagAssociationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an owner
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addOwner(com.scailo.sdk.ActivitiesServiceOwnerCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an owner
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteOwner(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View an owner for the given ID
     * </pre>
     */
    public com.scailo.sdk.ActivityOwner viewOwnerByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOwnerByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all owners for given activity UUID
     * </pre>
     */
    public com.scailo.sdk.ActivityOwnersList viewOwners(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOwnersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import employees as owners from team and returns the ID of the activity
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importOwnersFromTeam(com.scailo.sdk.ActivitiesServiceImportOwnersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportOwnersFromTeamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import employees as owners from department and returns the ID of the activity
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importOwnersFromDepartment(com.scailo.sdk.ActivitiesServiceImportOwnersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportOwnersFromDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a supervisor
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addSupervisor(com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSupervisorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a supervisor
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteSupervisor(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSupervisorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View supervisor for the given ID
     * </pre>
     */
    public com.scailo.sdk.ActivitySupervisor viewSupervisorByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSupervisorByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all supervisors for given activity UUID
     * </pre>
     */
    public com.scailo.sdk.ActivitySupervisorsList viewSupervisors(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSupervisorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a timer
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addTimer(com.scailo.sdk.ActivitiesServiceTimerCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTimerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * End a timer
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse endTimer(com.scailo.sdk.ActivitiesServiceTimerEndRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndTimerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a timer for the given ID
     * </pre>
     */
    public com.scailo.sdk.ActivityTimer viewTimerByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewTimerByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all timers for given activity UUID
     * </pre>
     */
    public com.scailo.sdk.ActivityTimersList viewTimers(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewTimersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View activity timers for given activity ID with pagination
     * </pre>
     */
    public com.scailo.sdk.ActivitiesServicePaginatedTimersResponse viewPaginatedTimers(com.scailo.sdk.ActivityTimersSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedTimersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through activity timers with pagination
     * </pre>
     */
    public com.scailo.sdk.ActivitiesServicePaginatedTimersResponse searchTimersWithPagination(com.scailo.sdk.ActivityTimersSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchTimersWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that could be used to upload timers from the filled CSV file. The same file can also be used as a template when there are no existing records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadTimersAsCSV(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadTimersAsCSVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.Activity viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.Activity viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.Activity viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.Activity viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.ActivitiesList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.ActivitiesList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.ActivitiesList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.ActivitiesServicePaginationResponse viewWithPagination(com.scailo.sdk.ActivitiesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Statistics of Activity
     * </pre>
     */
    public com.scailo.sdk.ActivityStatistics viewStatistics(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.ActivitiesList searchAll(com.scailo.sdk.ActivitiesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.ActivitiesList filter(com.scailo.sdk.ActivitiesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.ActivitiesServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.ActivitiesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import records using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUIDsList importFromCSV(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportFromCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ActivitiesService.
   * <pre>
   *Describes the common methods applicable on each activity
   * </pre>
   */
  public static final class ActivitiesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ActivitiesServiceFutureStub> {
    private ActivitiesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActivitiesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActivitiesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> create(
        com.scailo.sdk.ActivitiesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> update(
        com.scailo.sdk.ActivitiesServiceUpdateRequest request) {
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
     * Send Email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> sendEmail(
        com.scailo.sdk.IdentifierWithEmailAttributes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an action to an activity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addAction(
        com.scailo.sdk.ActivitiesServiceActionCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an action with an activity timer to an activity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addActionWithTimer(
        com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddActionWithTimerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an action in an activity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyAction(
        com.scailo.sdk.ActivitiesServiceActionUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an action in an activity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteAction(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder actions in an activity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderActions(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderActionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Activity Action by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityAction> viewActionByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewActionByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Statistics of Activity Action by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityActionStatistics> viewActionStatistics(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewActionStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all actions for given activity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityActionsList> viewActions(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewActionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the activity action
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityActionsList> viewActionHistory(
        com.scailo.sdk.ActivityActionHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewActionHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View activity actions for given activity ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> viewPaginatedActions(
        com.scailo.sdk.ActivityActionsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedActionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through activity actions with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesServicePaginatedActionsResponse> searchActionsWithPagination(
        com.scailo.sdk.ActivityActionsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchActionsWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that could be used to upload actions from the filled CSV file. The same file can also be used as a template when there are no existing records
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadActionsAsCSV(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadActionsAsCSVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upload actions using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> uploadActivityActions(
        com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadActivityActionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an activity tag
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addActivityTagAssociation(
        com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddActivityTagAssociationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an activity tag
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteActivityTagAssociation(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteActivityTagAssociationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View activity tag for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityTagAssociation> viewActivityTagAssociationByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewActivityTagAssociationByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all activities tags for given activity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityTagAssociationsList> viewActivityTagAssociations(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewActivityTagAssociationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addOwner(
        com.scailo.sdk.ActivitiesServiceOwnerCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteOwner(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View an owner for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityOwner> viewOwnerByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOwnerByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all owners for given activity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityOwnersList> viewOwners(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOwnersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import employees as owners from team and returns the ID of the activity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importOwnersFromTeam(
        com.scailo.sdk.ActivitiesServiceImportOwnersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportOwnersFromTeamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import employees as owners from department and returns the ID of the activity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importOwnersFromDepartment(
        com.scailo.sdk.ActivitiesServiceImportOwnersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportOwnersFromDepartmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a supervisor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addSupervisor(
        com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSupervisorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a supervisor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteSupervisor(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSupervisorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View supervisor for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitySupervisor> viewSupervisorByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSupervisorByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all supervisors for given activity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitySupervisorsList> viewSupervisors(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSupervisorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a timer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addTimer(
        com.scailo.sdk.ActivitiesServiceTimerCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTimerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * End a timer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> endTimer(
        com.scailo.sdk.ActivitiesServiceTimerEndRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndTimerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a timer for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityTimer> viewTimerByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewTimerByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all timers for given activity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityTimersList> viewTimers(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewTimersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View activity timers for given activity ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> viewPaginatedTimers(
        com.scailo.sdk.ActivityTimersSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedTimersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through activity timers with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesServicePaginatedTimersResponse> searchTimersWithPagination(
        com.scailo.sdk.ActivityTimersSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchTimersWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that could be used to upload timers from the filled CSV file. The same file can also be used as a template when there are no existing records
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadTimersAsCSV(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadTimersAsCSVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Activity> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Activity> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Activity> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Activity> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.ActivitiesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Statistics of Activity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivityStatistics> viewStatistics(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesList> searchAll(
        com.scailo.sdk.ActivitiesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ActivitiesList> filter(
        com.scailo.sdk.ActivitiesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.ActivitiesServiceCountReq request) {
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
        com.scailo.sdk.ActivitiesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import records using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUIDsList> importFromCSV(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_CANCEL = 2;
  private static final int METHODID_COMPLETE = 3;
  private static final int METHODID_REOPEN = 4;
  private static final int METHODID_REPEAT = 5;
  private static final int METHODID_COMMENT_ADD = 6;
  private static final int METHODID_SEND_EMAIL = 7;
  private static final int METHODID_ADD_ACTION = 8;
  private static final int METHODID_ADD_ACTION_WITH_TIMER = 9;
  private static final int METHODID_MODIFY_ACTION = 10;
  private static final int METHODID_DELETE_ACTION = 11;
  private static final int METHODID_REORDER_ACTIONS = 12;
  private static final int METHODID_VIEW_ACTION_BY_ID = 13;
  private static final int METHODID_VIEW_ACTION_STATISTICS = 14;
  private static final int METHODID_VIEW_ACTIONS = 15;
  private static final int METHODID_VIEW_ACTION_HISTORY = 16;
  private static final int METHODID_VIEW_PAGINATED_ACTIONS = 17;
  private static final int METHODID_SEARCH_ACTIONS_WITH_PAGINATION = 18;
  private static final int METHODID_DOWNLOAD_ACTIONS_AS_CSV = 19;
  private static final int METHODID_UPLOAD_ACTIVITY_ACTIONS = 20;
  private static final int METHODID_ADD_ACTIVITY_TAG_ASSOCIATION = 21;
  private static final int METHODID_DELETE_ACTIVITY_TAG_ASSOCIATION = 22;
  private static final int METHODID_VIEW_ACTIVITY_TAG_ASSOCIATION_BY_ID = 23;
  private static final int METHODID_VIEW_ACTIVITY_TAG_ASSOCIATIONS = 24;
  private static final int METHODID_ADD_OWNER = 25;
  private static final int METHODID_DELETE_OWNER = 26;
  private static final int METHODID_VIEW_OWNER_BY_ID = 27;
  private static final int METHODID_VIEW_OWNERS = 28;
  private static final int METHODID_IMPORT_OWNERS_FROM_TEAM = 29;
  private static final int METHODID_IMPORT_OWNERS_FROM_DEPARTMENT = 30;
  private static final int METHODID_ADD_SUPERVISOR = 31;
  private static final int METHODID_DELETE_SUPERVISOR = 32;
  private static final int METHODID_VIEW_SUPERVISOR_BY_ID = 33;
  private static final int METHODID_VIEW_SUPERVISORS = 34;
  private static final int METHODID_ADD_TIMER = 35;
  private static final int METHODID_END_TIMER = 36;
  private static final int METHODID_VIEW_TIMER_BY_ID = 37;
  private static final int METHODID_VIEW_TIMERS = 38;
  private static final int METHODID_VIEW_PAGINATED_TIMERS = 39;
  private static final int METHODID_SEARCH_TIMERS_WITH_PAGINATION = 40;
  private static final int METHODID_DOWNLOAD_TIMERS_AS_CSV = 41;
  private static final int METHODID_VIEW_BY_ID = 42;
  private static final int METHODID_VIEW_BY_UUID = 43;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 44;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 45;
  private static final int METHODID_VIEW_FROM_IDS = 46;
  private static final int METHODID_VIEW_ALL = 47;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 48;
  private static final int METHODID_VIEW_WITH_PAGINATION = 49;
  private static final int METHODID_VIEW_STATISTICS = 50;
  private static final int METHODID_SEARCH_ALL = 51;
  private static final int METHODID_FILTER = 52;
  private static final int METHODID_COUNT = 53;
  private static final int METHODID_DOWNLOAD_AS_CSV = 54;
  private static final int METHODID_IMPORT_FROM_CSV = 55;

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
          serviceImpl.create((com.scailo.sdk.ActivitiesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.scailo.sdk.ActivitiesServiceUpdateRequest) request,
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
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((com.scailo.sdk.IdentifierWithEmailAttributes) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_ADD_ACTION:
          serviceImpl.addAction((com.scailo.sdk.ActivitiesServiceActionCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_ACTION_WITH_TIMER:
          serviceImpl.addActionWithTimer((com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_ACTION:
          serviceImpl.modifyAction((com.scailo.sdk.ActivitiesServiceActionUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACTION:
          serviceImpl.deleteAction((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_ACTIONS:
          serviceImpl.reorderActions((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_ACTION_BY_ID:
          serviceImpl.viewActionByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityAction>) responseObserver);
          break;
        case METHODID_VIEW_ACTION_STATISTICS:
          serviceImpl.viewActionStatistics((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityActionStatistics>) responseObserver);
          break;
        case METHODID_VIEW_ACTIONS:
          serviceImpl.viewActions((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityActionsList>) responseObserver);
          break;
        case METHODID_VIEW_ACTION_HISTORY:
          serviceImpl.viewActionHistory((com.scailo.sdk.ActivityActionHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityActionsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_ACTIONS:
          serviceImpl.viewPaginatedActions((com.scailo.sdk.ActivityActionsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedActionsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ACTIONS_WITH_PAGINATION:
          serviceImpl.searchActionsWithPagination((com.scailo.sdk.ActivityActionsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedActionsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ACTIONS_AS_CSV:
          serviceImpl.downloadActionsAsCSV((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_UPLOAD_ACTIVITY_ACTIONS:
          serviceImpl.uploadActivityActions((com.scailo.sdk.IdentifierUUIDWithFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_ADD_ACTIVITY_TAG_ASSOCIATION:
          serviceImpl.addActivityTagAssociation((com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACTIVITY_TAG_ASSOCIATION:
          serviceImpl.deleteActivityTagAssociation((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_ACTIVITY_TAG_ASSOCIATION_BY_ID:
          serviceImpl.viewActivityTagAssociationByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTagAssociation>) responseObserver);
          break;
        case METHODID_VIEW_ACTIVITY_TAG_ASSOCIATIONS:
          serviceImpl.viewActivityTagAssociations((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTagAssociationsList>) responseObserver);
          break;
        case METHODID_ADD_OWNER:
          serviceImpl.addOwner((com.scailo.sdk.ActivitiesServiceOwnerCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_OWNER:
          serviceImpl.deleteOwner((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_OWNER_BY_ID:
          serviceImpl.viewOwnerByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityOwner>) responseObserver);
          break;
        case METHODID_VIEW_OWNERS:
          serviceImpl.viewOwners((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityOwnersList>) responseObserver);
          break;
        case METHODID_IMPORT_OWNERS_FROM_TEAM:
          serviceImpl.importOwnersFromTeam((com.scailo.sdk.ActivitiesServiceImportOwnersRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_IMPORT_OWNERS_FROM_DEPARTMENT:
          serviceImpl.importOwnersFromDepartment((com.scailo.sdk.ActivitiesServiceImportOwnersRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_SUPERVISOR:
          serviceImpl.addSupervisor((com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUPERVISOR:
          serviceImpl.deleteSupervisor((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_SUPERVISOR_BY_ID:
          serviceImpl.viewSupervisorByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitySupervisor>) responseObserver);
          break;
        case METHODID_VIEW_SUPERVISORS:
          serviceImpl.viewSupervisors((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitySupervisorsList>) responseObserver);
          break;
        case METHODID_ADD_TIMER:
          serviceImpl.addTimer((com.scailo.sdk.ActivitiesServiceTimerCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_END_TIMER:
          serviceImpl.endTimer((com.scailo.sdk.ActivitiesServiceTimerEndRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_TIMER_BY_ID:
          serviceImpl.viewTimerByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTimer>) responseObserver);
          break;
        case METHODID_VIEW_TIMERS:
          serviceImpl.viewTimers((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityTimersList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_TIMERS:
          serviceImpl.viewPaginatedTimers((com.scailo.sdk.ActivityTimersSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedTimersResponse>) responseObserver);
          break;
        case METHODID_SEARCH_TIMERS_WITH_PAGINATION:
          serviceImpl.searchTimersWithPagination((com.scailo.sdk.ActivityTimersSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginatedTimersResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_TIMERS_AS_CSV:
          serviceImpl.downloadTimersAsCSV((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Activity>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Activity>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Activity>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Activity>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.ActivitiesServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_STATISTICS:
          serviceImpl.viewStatistics((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivityStatistics>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.ActivitiesServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.ActivitiesServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ActivitiesList>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.ActivitiesServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.ActivitiesServiceFilterReq) request,
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
              com.scailo.sdk.ActivitiesServiceCreateRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceUpdateRequest,
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
          getSendEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithEmailAttributes,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_SEND_EMAIL)))
        .addMethod(
          getAddActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceActionCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_ACTION)))
        .addMethod(
          getAddActionWithTimerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceActionWithTimerCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_ACTION_WITH_TIMER)))
        .addMethod(
          getModifyActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceActionUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_ACTION)))
        .addMethod(
          getDeleteActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_ACTION)))
        .addMethod(
          getReorderActionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_ACTIONS)))
        .addMethod(
          getViewActionByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ActivityAction>(
                service, METHODID_VIEW_ACTION_BY_ID)))
        .addMethod(
          getViewActionStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ActivityActionStatistics>(
                service, METHODID_VIEW_ACTION_STATISTICS)))
        .addMethod(
          getViewActionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ActivityActionsList>(
                service, METHODID_VIEW_ACTIONS)))
        .addMethod(
          getViewActionHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivityActionHistoryRequest,
              com.scailo.sdk.ActivityActionsList>(
                service, METHODID_VIEW_ACTION_HISTORY)))
        .addMethod(
          getViewPaginatedActionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivityActionsSearchRequest,
              com.scailo.sdk.ActivitiesServicePaginatedActionsResponse>(
                service, METHODID_VIEW_PAGINATED_ACTIONS)))
        .addMethod(
          getSearchActionsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivityActionsSearchRequest,
              com.scailo.sdk.ActivitiesServicePaginatedActionsResponse>(
                service, METHODID_SEARCH_ACTIONS_WITH_PAGINATION)))
        .addMethod(
          getDownloadActionsAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_ACTIONS_AS_CSV)))
        .addMethod(
          getUploadActivityActionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithFile,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_UPLOAD_ACTIVITY_ACTIONS)))
        .addMethod(
          getAddActivityTagAssociationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceActivityTagAssociationCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_ACTIVITY_TAG_ASSOCIATION)))
        .addMethod(
          getDeleteActivityTagAssociationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_ACTIVITY_TAG_ASSOCIATION)))
        .addMethod(
          getViewActivityTagAssociationByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ActivityTagAssociation>(
                service, METHODID_VIEW_ACTIVITY_TAG_ASSOCIATION_BY_ID)))
        .addMethod(
          getViewActivityTagAssociationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ActivityTagAssociationsList>(
                service, METHODID_VIEW_ACTIVITY_TAG_ASSOCIATIONS)))
        .addMethod(
          getAddOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceOwnerCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_OWNER)))
        .addMethod(
          getDeleteOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_OWNER)))
        .addMethod(
          getViewOwnerByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ActivityOwner>(
                service, METHODID_VIEW_OWNER_BY_ID)))
        .addMethod(
          getViewOwnersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ActivityOwnersList>(
                service, METHODID_VIEW_OWNERS)))
        .addMethod(
          getImportOwnersFromTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceImportOwnersRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_OWNERS_FROM_TEAM)))
        .addMethod(
          getImportOwnersFromDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceImportOwnersRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_OWNERS_FROM_DEPARTMENT)))
        .addMethod(
          getAddSupervisorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceSupervisorCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_SUPERVISOR)))
        .addMethod(
          getDeleteSupervisorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_SUPERVISOR)))
        .addMethod(
          getViewSupervisorByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ActivitySupervisor>(
                service, METHODID_VIEW_SUPERVISOR_BY_ID)))
        .addMethod(
          getViewSupervisorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ActivitySupervisorsList>(
                service, METHODID_VIEW_SUPERVISORS)))
        .addMethod(
          getAddTimerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceTimerCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_TIMER)))
        .addMethod(
          getEndTimerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceTimerEndRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_END_TIMER)))
        .addMethod(
          getViewTimerByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ActivityTimer>(
                service, METHODID_VIEW_TIMER_BY_ID)))
        .addMethod(
          getViewTimersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ActivityTimersList>(
                service, METHODID_VIEW_TIMERS)))
        .addMethod(
          getViewPaginatedTimersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivityTimersSearchRequest,
              com.scailo.sdk.ActivitiesServicePaginatedTimersResponse>(
                service, METHODID_VIEW_PAGINATED_TIMERS)))
        .addMethod(
          getSearchTimersWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivityTimersSearchRequest,
              com.scailo.sdk.ActivitiesServicePaginatedTimersResponse>(
                service, METHODID_SEARCH_TIMERS_WITH_PAGINATION)))
        .addMethod(
          getDownloadTimersAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_TIMERS_AS_CSV)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Activity>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Activity>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Activity>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Activity>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.ActivitiesList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.ActivitiesList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ActivitiesList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServicePaginationReq,
              com.scailo.sdk.ActivitiesServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ActivityStatistics>(
                service, METHODID_VIEW_STATISTICS)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceSearchAllReq,
              com.scailo.sdk.ActivitiesList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceFilterReq,
              com.scailo.sdk.ActivitiesList>(
                service, METHODID_FILTER)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActivitiesServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .addMethod(
          getImportFromCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.IdentifierUUIDsList>(
                service, METHODID_IMPORT_FROM_CSV)))
        .build();
  }

  private static abstract class ActivitiesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ActivitiesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.ActivitiesScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ActivitiesService");
    }
  }

  private static final class ActivitiesServiceFileDescriptorSupplier
      extends ActivitiesServiceBaseDescriptorSupplier {
    ActivitiesServiceFileDescriptorSupplier() {}
  }

  private static final class ActivitiesServiceMethodDescriptorSupplier
      extends ActivitiesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ActivitiesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ActivitiesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ActivitiesServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getCancelMethod())
              .addMethod(getCompleteMethod())
              .addMethod(getReopenMethod())
              .addMethod(getRepeatMethod())
              .addMethod(getCommentAddMethod())
              .addMethod(getSendEmailMethod())
              .addMethod(getAddActionMethod())
              .addMethod(getAddActionWithTimerMethod())
              .addMethod(getModifyActionMethod())
              .addMethod(getDeleteActionMethod())
              .addMethod(getReorderActionsMethod())
              .addMethod(getViewActionByIDMethod())
              .addMethod(getViewActionStatisticsMethod())
              .addMethod(getViewActionsMethod())
              .addMethod(getViewActionHistoryMethod())
              .addMethod(getViewPaginatedActionsMethod())
              .addMethod(getSearchActionsWithPaginationMethod())
              .addMethod(getDownloadActionsAsCSVMethod())
              .addMethod(getUploadActivityActionsMethod())
              .addMethod(getAddActivityTagAssociationMethod())
              .addMethod(getDeleteActivityTagAssociationMethod())
              .addMethod(getViewActivityTagAssociationByIDMethod())
              .addMethod(getViewActivityTagAssociationsMethod())
              .addMethod(getAddOwnerMethod())
              .addMethod(getDeleteOwnerMethod())
              .addMethod(getViewOwnerByIDMethod())
              .addMethod(getViewOwnersMethod())
              .addMethod(getImportOwnersFromTeamMethod())
              .addMethod(getImportOwnersFromDepartmentMethod())
              .addMethod(getAddSupervisorMethod())
              .addMethod(getDeleteSupervisorMethod())
              .addMethod(getViewSupervisorByIDMethod())
              .addMethod(getViewSupervisorsMethod())
              .addMethod(getAddTimerMethod())
              .addMethod(getEndTimerMethod())
              .addMethod(getViewTimerByIDMethod())
              .addMethod(getViewTimersMethod())
              .addMethod(getViewPaginatedTimersMethod())
              .addMethod(getSearchTimersWithPaginationMethod())
              .addMethod(getDownloadTimersAsCSVMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewAllForEntityUUIDMethod())
              .addMethod(getViewWithPaginationMethod())
              .addMethod(getViewStatisticsMethod())
              .addMethod(getSearchAllMethod())
              .addMethod(getFilterMethod())
              .addMethod(getCountMethod())
              .addMethod(getDownloadAsCSVMethod())
              .addMethod(getImportFromCSVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
