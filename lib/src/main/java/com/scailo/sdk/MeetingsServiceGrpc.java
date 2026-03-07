package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each meeting
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: meetings.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MeetingsServiceGrpc {

  private MeetingsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.MeetingsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.MeetingsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = MeetingsServiceGrpc.getCreateMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getCreateMethod = MeetingsServiceGrpc.getCreateMethod) == null) {
          MeetingsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.scailo.sdk.MeetingsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getUpdateMethod;
    if ((getUpdateMethod = MeetingsServiceGrpc.getUpdateMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getUpdateMethod = MeetingsServiceGrpc.getUpdateMethod) == null) {
          MeetingsServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getCancelMethod;
    if ((getCancelMethod = MeetingsServiceGrpc.getCancelMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getCancelMethod = MeetingsServiceGrpc.getCancelMethod) == null) {
          MeetingsServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getCompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Complete",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getCompleteMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getCompleteMethod;
    if ((getCompleteMethod = MeetingsServiceGrpc.getCompleteMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getCompleteMethod = MeetingsServiceGrpc.getCompleteMethod) == null) {
          MeetingsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("Complete"))
              .build();
        }
      }
    }
    return getCompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getRepeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Repeat",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getRepeatMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getRepeatMethod;
    if ((getRepeatMethod = MeetingsServiceGrpc.getRepeatMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getRepeatMethod = MeetingsServiceGrpc.getRepeatMethod) == null) {
          MeetingsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("Repeat"))
              .build();
        }
      }
    }
    return getRepeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getCommentAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommentAdd",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getCommentAddMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getCommentAddMethod;
    if ((getCommentAddMethod = MeetingsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getCommentAddMethod = MeetingsServiceGrpc.getCommentAddMethod) == null) {
          MeetingsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("CommentAdd"))
              .build();
        }
      }
    }
    return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes,
      com.scailo.sdk.IdentifierResponse> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmail",
      requestType = com.scailo.sdk.IdentifierWithEmailAttributes.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes,
      com.scailo.sdk.IdentifierResponse> getSendEmailMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse> getSendEmailMethod;
    if ((getSendEmailMethod = MeetingsServiceGrpc.getSendEmailMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getSendEmailMethod = MeetingsServiceGrpc.getSendEmailMethod) == null) {
          MeetingsServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes,
      com.scailo.sdk.IdentifierResponse> getRequestRSVPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestRSVP",
      requestType = com.scailo.sdk.IdentifierWithEmailAttributes.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes,
      com.scailo.sdk.IdentifierResponse> getRequestRSVPMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse> getRequestRSVPMethod;
    if ((getRequestRSVPMethod = MeetingsServiceGrpc.getRequestRSVPMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getRequestRSVPMethod = MeetingsServiceGrpc.getRequestRSVPMethod) == null) {
          MeetingsServiceGrpc.getRequestRSVPMethod = getRequestRSVPMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestRSVP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("RequestRSVP"))
              .build();
        }
      }
    }
    return getRequestRSVPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes,
      com.scailo.sdk.IdentifierResponse> getSendActionablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendActionables",
      requestType = com.scailo.sdk.IdentifierWithEmailAttributes.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes,
      com.scailo.sdk.IdentifierResponse> getSendActionablesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse> getSendActionablesMethod;
    if ((getSendActionablesMethod = MeetingsServiceGrpc.getSendActionablesMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getSendActionablesMethod = MeetingsServiceGrpc.getSendActionablesMethod) == null) {
          MeetingsServiceGrpc.getSendActionablesMethod = getSendActionablesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendActionables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("SendActionables"))
              .build();
        }
      }
    }
    return getSendActionablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceActionableCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddActionableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddActionable",
      requestType = com.scailo.sdk.MeetingsServiceActionableCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceActionableCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddActionableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceActionableCreateRequest, com.scailo.sdk.IdentifierResponse> getAddActionableMethod;
    if ((getAddActionableMethod = MeetingsServiceGrpc.getAddActionableMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getAddActionableMethod = MeetingsServiceGrpc.getAddActionableMethod) == null) {
          MeetingsServiceGrpc.getAddActionableMethod = getAddActionableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceActionableCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddActionable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceActionableCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("AddActionable"))
              .build();
        }
      }
    }
    return getAddActionableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceActionableUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyActionableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyActionable",
      requestType = com.scailo.sdk.MeetingsServiceActionableUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceActionableUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyActionableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceActionableUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyActionableMethod;
    if ((getModifyActionableMethod = MeetingsServiceGrpc.getModifyActionableMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getModifyActionableMethod = MeetingsServiceGrpc.getModifyActionableMethod) == null) {
          MeetingsServiceGrpc.getModifyActionableMethod = getModifyActionableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceActionableUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyActionable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceActionableUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ModifyActionable"))
              .build();
        }
      }
    }
    return getModifyActionableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteActionableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteActionable",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteActionableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteActionableMethod;
    if ((getDeleteActionableMethod = MeetingsServiceGrpc.getDeleteActionableMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getDeleteActionableMethod = MeetingsServiceGrpc.getDeleteActionableMethod) == null) {
          MeetingsServiceGrpc.getDeleteActionableMethod = getDeleteActionableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteActionable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("DeleteActionable"))
              .build();
        }
      }
    }
    return getDeleteActionableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderActionablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderActionables",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderActionablesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderActionablesMethod;
    if ((getReorderActionablesMethod = MeetingsServiceGrpc.getReorderActionablesMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getReorderActionablesMethod = MeetingsServiceGrpc.getReorderActionablesMethod) == null) {
          MeetingsServiceGrpc.getReorderActionablesMethod = getReorderActionablesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderActionables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ReorderActionables"))
              .build();
        }
      }
    }
    return getReorderActionablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingActionable> getViewActionableByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewActionableByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.MeetingActionable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingActionable> getViewActionableByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingActionable> getViewActionableByIDMethod;
    if ((getViewActionableByIDMethod = MeetingsServiceGrpc.getViewActionableByIDMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewActionableByIDMethod = MeetingsServiceGrpc.getViewActionableByIDMethod) == null) {
          MeetingsServiceGrpc.getViewActionableByIDMethod = getViewActionableByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingActionable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewActionableByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingActionable.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewActionableByID"))
              .build();
        }
      }
    }
    return getViewActionableByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.MeetingActionablesList> getViewActionablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewActionables",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.MeetingActionablesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.MeetingActionablesList> getViewActionablesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.MeetingActionablesList> getViewActionablesMethod;
    if ((getViewActionablesMethod = MeetingsServiceGrpc.getViewActionablesMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewActionablesMethod = MeetingsServiceGrpc.getViewActionablesMethod) == null) {
          MeetingsServiceGrpc.getViewActionablesMethod = getViewActionablesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.MeetingActionablesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewActionables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingActionablesList.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewActionables"))
              .build();
        }
      }
    }
    return getViewActionablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingActionableHistoryRequest,
      com.scailo.sdk.MeetingActionablesList> getViewActionableHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewActionableHistory",
      requestType = com.scailo.sdk.MeetingActionableHistoryRequest.class,
      responseType = com.scailo.sdk.MeetingActionablesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingActionableHistoryRequest,
      com.scailo.sdk.MeetingActionablesList> getViewActionableHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingActionableHistoryRequest, com.scailo.sdk.MeetingActionablesList> getViewActionableHistoryMethod;
    if ((getViewActionableHistoryMethod = MeetingsServiceGrpc.getViewActionableHistoryMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewActionableHistoryMethod = MeetingsServiceGrpc.getViewActionableHistoryMethod) == null) {
          MeetingsServiceGrpc.getViewActionableHistoryMethod = getViewActionableHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingActionableHistoryRequest, com.scailo.sdk.MeetingActionablesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewActionableHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingActionableHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingActionablesList.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewActionableHistory"))
              .build();
        }
      }
    }
    return getViewActionableHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingActionablesSearchRequest,
      com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> getViewPaginatedActionablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedActionables",
      requestType = com.scailo.sdk.MeetingActionablesSearchRequest.class,
      responseType = com.scailo.sdk.MeetingsServicePaginatedActionablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingActionablesSearchRequest,
      com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> getViewPaginatedActionablesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingActionablesSearchRequest, com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> getViewPaginatedActionablesMethod;
    if ((getViewPaginatedActionablesMethod = MeetingsServiceGrpc.getViewPaginatedActionablesMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewPaginatedActionablesMethod = MeetingsServiceGrpc.getViewPaginatedActionablesMethod) == null) {
          MeetingsServiceGrpc.getViewPaginatedActionablesMethod = getViewPaginatedActionablesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingActionablesSearchRequest, com.scailo.sdk.MeetingsServicePaginatedActionablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedActionables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingActionablesSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServicePaginatedActionablesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewPaginatedActionables"))
              .build();
        }
      }
    }
    return getViewPaginatedActionablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingActionablesSearchRequest,
      com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> getSearchActionablesWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchActionablesWithPagination",
      requestType = com.scailo.sdk.MeetingActionablesSearchRequest.class,
      responseType = com.scailo.sdk.MeetingsServicePaginatedActionablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingActionablesSearchRequest,
      com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> getSearchActionablesWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingActionablesSearchRequest, com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> getSearchActionablesWithPaginationMethod;
    if ((getSearchActionablesWithPaginationMethod = MeetingsServiceGrpc.getSearchActionablesWithPaginationMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getSearchActionablesWithPaginationMethod = MeetingsServiceGrpc.getSearchActionablesWithPaginationMethod) == null) {
          MeetingsServiceGrpc.getSearchActionablesWithPaginationMethod = getSearchActionablesWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingActionablesSearchRequest, com.scailo.sdk.MeetingsServicePaginatedActionablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchActionablesWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingActionablesSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServicePaginatedActionablesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("SearchActionablesWithPagination"))
              .build();
        }
      }
    }
    return getSearchActionablesWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceEmployeeCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEmployee",
      requestType = com.scailo.sdk.MeetingsServiceEmployeeCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceEmployeeCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddEmployeeMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceEmployeeCreateRequest, com.scailo.sdk.IdentifierResponse> getAddEmployeeMethod;
    if ((getAddEmployeeMethod = MeetingsServiceGrpc.getAddEmployeeMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getAddEmployeeMethod = MeetingsServiceGrpc.getAddEmployeeMethod) == null) {
          MeetingsServiceGrpc.getAddEmployeeMethod = getAddEmployeeMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceEmployeeCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceEmployeeCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("AddEmployee"))
              .build();
        }
      }
    }
    return getAddEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEmployee",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteEmployeeMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteEmployeeMethod;
    if ((getDeleteEmployeeMethod = MeetingsServiceGrpc.getDeleteEmployeeMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getDeleteEmployeeMethod = MeetingsServiceGrpc.getDeleteEmployeeMethod) == null) {
          MeetingsServiceGrpc.getDeleteEmployeeMethod = getDeleteEmployeeMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("DeleteEmployee"))
              .build();
        }
      }
    }
    return getDeleteEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingEmployee> getViewEmployeeByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEmployeeByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.MeetingEmployee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingEmployee> getViewEmployeeByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingEmployee> getViewEmployeeByIDMethod;
    if ((getViewEmployeeByIDMethod = MeetingsServiceGrpc.getViewEmployeeByIDMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewEmployeeByIDMethod = MeetingsServiceGrpc.getViewEmployeeByIDMethod) == null) {
          MeetingsServiceGrpc.getViewEmployeeByIDMethod = getViewEmployeeByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingEmployee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEmployeeByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingEmployee.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewEmployeeByID"))
              .build();
        }
      }
    }
    return getViewEmployeeByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingEmployeesList> getViewEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEmployees",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.MeetingEmployeesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingEmployeesList> getViewEmployeesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingEmployeesList> getViewEmployeesMethod;
    if ((getViewEmployeesMethod = MeetingsServiceGrpc.getViewEmployeesMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewEmployeesMethod = MeetingsServiceGrpc.getViewEmployeesMethod) == null) {
          MeetingsServiceGrpc.getViewEmployeesMethod = getViewEmployeesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingEmployeesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingEmployeesList.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewEmployees"))
              .build();
        }
      }
    }
    return getViewEmployeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceSetRSVPRequest,
      com.scailo.sdk.IdentifierUUID> getSetEmployeeRSVPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetEmployeeRSVP",
      requestType = com.scailo.sdk.MeetingsServiceSetRSVPRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceSetRSVPRequest,
      com.scailo.sdk.IdentifierUUID> getSetEmployeeRSVPMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceSetRSVPRequest, com.scailo.sdk.IdentifierUUID> getSetEmployeeRSVPMethod;
    if ((getSetEmployeeRSVPMethod = MeetingsServiceGrpc.getSetEmployeeRSVPMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getSetEmployeeRSVPMethod = MeetingsServiceGrpc.getSetEmployeeRSVPMethod) == null) {
          MeetingsServiceGrpc.getSetEmployeeRSVPMethod = getSetEmployeeRSVPMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceSetRSVPRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetEmployeeRSVP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceSetRSVPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("SetEmployeeRSVP"))
              .build();
        }
      }
    }
    return getSetEmployeeRSVPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceImportEmployeesRequest,
      com.scailo.sdk.IdentifierResponse> getImportFromTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportFromTeam",
      requestType = com.scailo.sdk.MeetingsServiceImportEmployeesRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceImportEmployeesRequest,
      com.scailo.sdk.IdentifierResponse> getImportFromTeamMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceImportEmployeesRequest, com.scailo.sdk.IdentifierResponse> getImportFromTeamMethod;
    if ((getImportFromTeamMethod = MeetingsServiceGrpc.getImportFromTeamMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getImportFromTeamMethod = MeetingsServiceGrpc.getImportFromTeamMethod) == null) {
          MeetingsServiceGrpc.getImportFromTeamMethod = getImportFromTeamMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceImportEmployeesRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportFromTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceImportEmployeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ImportFromTeam"))
              .build();
        }
      }
    }
    return getImportFromTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceImportEmployeesRequest,
      com.scailo.sdk.IdentifierResponse> getImportFromDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportFromDepartment",
      requestType = com.scailo.sdk.MeetingsServiceImportEmployeesRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceImportEmployeesRequest,
      com.scailo.sdk.IdentifierResponse> getImportFromDepartmentMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceImportEmployeesRequest, com.scailo.sdk.IdentifierResponse> getImportFromDepartmentMethod;
    if ((getImportFromDepartmentMethod = MeetingsServiceGrpc.getImportFromDepartmentMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getImportFromDepartmentMethod = MeetingsServiceGrpc.getImportFromDepartmentMethod) == null) {
          MeetingsServiceGrpc.getImportFromDepartmentMethod = getImportFromDepartmentMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceImportEmployeesRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportFromDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceImportEmployeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ImportFromDepartment"))
              .build();
        }
      }
    }
    return getImportFromDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceAssociateCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddAssociateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAssociate",
      requestType = com.scailo.sdk.MeetingsServiceAssociateCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceAssociateCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddAssociateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceAssociateCreateRequest, com.scailo.sdk.IdentifierResponse> getAddAssociateMethod;
    if ((getAddAssociateMethod = MeetingsServiceGrpc.getAddAssociateMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getAddAssociateMethod = MeetingsServiceGrpc.getAddAssociateMethod) == null) {
          MeetingsServiceGrpc.getAddAssociateMethod = getAddAssociateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceAssociateCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAssociate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceAssociateCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("AddAssociate"))
              .build();
        }
      }
    }
    return getAddAssociateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteAssociateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAssociate",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteAssociateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteAssociateMethod;
    if ((getDeleteAssociateMethod = MeetingsServiceGrpc.getDeleteAssociateMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getDeleteAssociateMethod = MeetingsServiceGrpc.getDeleteAssociateMethod) == null) {
          MeetingsServiceGrpc.getDeleteAssociateMethod = getDeleteAssociateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAssociate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("DeleteAssociate"))
              .build();
        }
      }
    }
    return getDeleteAssociateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingAssociate> getViewAssociateByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAssociateByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.MeetingAssociate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingAssociate> getViewAssociateByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingAssociate> getViewAssociateByIDMethod;
    if ((getViewAssociateByIDMethod = MeetingsServiceGrpc.getViewAssociateByIDMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewAssociateByIDMethod = MeetingsServiceGrpc.getViewAssociateByIDMethod) == null) {
          MeetingsServiceGrpc.getViewAssociateByIDMethod = getViewAssociateByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingAssociate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAssociateByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingAssociate.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewAssociateByID"))
              .build();
        }
      }
    }
    return getViewAssociateByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingAssociatesList> getViewAssociatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAssociates",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.MeetingAssociatesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.MeetingAssociatesList> getViewAssociatesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingAssociatesList> getViewAssociatesMethod;
    if ((getViewAssociatesMethod = MeetingsServiceGrpc.getViewAssociatesMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewAssociatesMethod = MeetingsServiceGrpc.getViewAssociatesMethod) == null) {
          MeetingsServiceGrpc.getViewAssociatesMethod = getViewAssociatesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.MeetingAssociatesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAssociates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingAssociatesList.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewAssociates"))
              .build();
        }
      }
    }
    return getViewAssociatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceSetRSVPRequest,
      com.scailo.sdk.IdentifierUUID> getSetAssociateRSVPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAssociateRSVP",
      requestType = com.scailo.sdk.MeetingsServiceSetRSVPRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceSetRSVPRequest,
      com.scailo.sdk.IdentifierUUID> getSetAssociateRSVPMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceSetRSVPRequest, com.scailo.sdk.IdentifierUUID> getSetAssociateRSVPMethod;
    if ((getSetAssociateRSVPMethod = MeetingsServiceGrpc.getSetAssociateRSVPMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getSetAssociateRSVPMethod = MeetingsServiceGrpc.getSetAssociateRSVPMethod) == null) {
          MeetingsServiceGrpc.getSetAssociateRSVPMethod = getSetAssociateRSVPMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceSetRSVPRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAssociateRSVP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceSetRSVPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("SetAssociateRSVP"))
              .build();
        }
      }
    }
    return getSetAssociateRSVPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Meeting> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Meeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Meeting> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Meeting> getViewByIDMethod;
    if ((getViewByIDMethod = MeetingsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewByIDMethod = MeetingsServiceGrpc.getViewByIDMethod) == null) {
          MeetingsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Meeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Meeting.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Meeting> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Meeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Meeting> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Meeting> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = MeetingsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewByUUIDMethod = MeetingsServiceGrpc.getViewByUUIDMethod) == null) {
          MeetingsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Meeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Meeting.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Meeting> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Meeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Meeting> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Meeting> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = MeetingsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = MeetingsServiceGrpc.getViewEssentialByIDMethod) == null) {
          MeetingsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Meeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Meeting.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Meeting> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Meeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Meeting> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Meeting> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = MeetingsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = MeetingsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          MeetingsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Meeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Meeting.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.MeetingsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.MeetingsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.MeetingsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.MeetingsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = MeetingsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewFromIDsMethod = MeetingsServiceGrpc.getViewFromIDsMethod) == null) {
          MeetingsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.MeetingsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsList.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.MeetingsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.MeetingsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.MeetingsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.MeetingsList> getViewAllMethod;
    if ((getViewAllMethod = MeetingsServiceGrpc.getViewAllMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewAllMethod = MeetingsServiceGrpc.getViewAllMethod) == null) {
          MeetingsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.MeetingsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsList.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.MeetingsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.MeetingsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.MeetingsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.MeetingsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = MeetingsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = MeetingsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          MeetingsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.MeetingsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsList.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServicePaginationReq,
      com.scailo.sdk.MeetingsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.MeetingsServicePaginationReq.class,
      responseType = com.scailo.sdk.MeetingsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServicePaginationReq,
      com.scailo.sdk.MeetingsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServicePaginationReq, com.scailo.sdk.MeetingsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = MeetingsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = MeetingsServiceGrpc.getViewWithPaginationMethod) == null) {
          MeetingsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServicePaginationReq, com.scailo.sdk.MeetingsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceSearchAllReq,
      com.scailo.sdk.MeetingsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.MeetingsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.MeetingsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceSearchAllReq,
      com.scailo.sdk.MeetingsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceSearchAllReq, com.scailo.sdk.MeetingsList> getSearchAllMethod;
    if ((getSearchAllMethod = MeetingsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getSearchAllMethod = MeetingsServiceGrpc.getSearchAllMethod) == null) {
          MeetingsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceSearchAllReq, com.scailo.sdk.MeetingsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsList.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceFilterReq,
      com.scailo.sdk.MeetingsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.MeetingsServiceFilterReq.class,
      responseType = com.scailo.sdk.MeetingsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceFilterReq,
      com.scailo.sdk.MeetingsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceFilterReq, com.scailo.sdk.MeetingsList> getFilterMethod;
    if ((getFilterMethod = MeetingsServiceGrpc.getFilterMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getFilterMethod = MeetingsServiceGrpc.getFilterMethod) == null) {
          MeetingsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceFilterReq, com.scailo.sdk.MeetingsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsList.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.MeetingsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MeetingsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = MeetingsServiceGrpc.getCountMethod) == null) {
      synchronized (MeetingsServiceGrpc.class) {
        if ((getCountMethod = MeetingsServiceGrpc.getCountMethod) == null) {
          MeetingsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MeetingsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MeetingsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeetingsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeetingsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeetingsServiceStub>() {
        @java.lang.Override
        public MeetingsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeetingsServiceStub(channel, callOptions);
        }
      };
    return MeetingsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeetingsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeetingsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeetingsServiceBlockingStub>() {
        @java.lang.Override
        public MeetingsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeetingsServiceBlockingStub(channel, callOptions);
        }
      };
    return MeetingsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeetingsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeetingsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeetingsServiceFutureStub>() {
        @java.lang.Override
        public MeetingsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeetingsServiceFutureStub(channel, callOptions);
        }
      };
    return MeetingsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each meeting
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create
     * </pre>
     */
    default void create(com.scailo.sdk.MeetingsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    default void update(com.scailo.sdk.MeetingsServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    default void cancel(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Complete
     * </pre>
     */
    default void complete(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Repeat
     * </pre>
     */
    default void repeat(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepeatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add comment
     * </pre>
     */
    default void commentAdd(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommentAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send Email
     * </pre>
     */
    default void sendEmail(com.scailo.sdk.IdentifierWithEmailAttributes request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request RSVPs from all the participants
     * </pre>
     */
    default void requestRSVP(com.scailo.sdk.IdentifierWithEmailAttributes request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestRSVPMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send all the actionables in an email
     * </pre>
     */
    default void sendActionables(com.scailo.sdk.IdentifierWithEmailAttributes request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendActionablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an actionable to a meeting
     * </pre>
     */
    default void addActionable(com.scailo.sdk.MeetingsServiceActionableCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddActionableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an actionable in a meeting
     * </pre>
     */
    default void modifyActionable(com.scailo.sdk.MeetingsServiceActionableUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyActionableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an actionable in a meeting
     * </pre>
     */
    default void deleteActionable(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteActionableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder actionables in a meeting
     * </pre>
     */
    default void reorderActionables(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderActionablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Meeting Actionable by ID
     * </pre>
     */
    default void viewActionableByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingActionable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewActionableByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all actionables for given meeting ID
     * </pre>
     */
    default void viewActionables(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingActionablesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewActionablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the meeting actionable
     * </pre>
     */
    default void viewActionableHistory(com.scailo.sdk.MeetingActionableHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingActionablesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewActionableHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View meeting actionables for given meeting ID with pagination
     * </pre>
     */
    default void viewPaginatedActionables(com.scailo.sdk.MeetingActionablesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedActionablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through meeting actionables with pagination
     * </pre>
     */
    default void searchActionablesWithPagination(com.scailo.sdk.MeetingActionablesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchActionablesWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an employee
     * </pre>
     */
    default void addEmployee(com.scailo.sdk.MeetingsServiceEmployeeCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEmployeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an employee
     * </pre>
     */
    default void deleteEmployee(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmployeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * View an employee for the given ID
     * </pre>
     */
    default void viewEmployeeByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingEmployee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEmployeeByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all employees for given meeting ID
     * </pre>
     */
    default void viewEmployees(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingEmployeesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEmployeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the RSVP of the employee with the given meeting employee UUID
     * </pre>
     */
    default void setEmployeeRSVP(com.scailo.sdk.MeetingsServiceSetRSVPRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetEmployeeRSVPMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import employees from team and returns the ID of the meeting
     * </pre>
     */
    default void importFromTeam(com.scailo.sdk.MeetingsServiceImportEmployeesRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportFromTeamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import employees from department and returns the ID of the meeting
     * </pre>
     */
    default void importFromDepartment(com.scailo.sdk.MeetingsServiceImportEmployeesRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportFromDepartmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an associate
     * </pre>
     */
    default void addAssociate(com.scailo.sdk.MeetingsServiceAssociateCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAssociateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an associate
     * </pre>
     */
    default void deleteAssociate(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAssociateMethod(), responseObserver);
    }

    /**
     * <pre>
     * View an associate for the given ID
     * </pre>
     */
    default void viewAssociateByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingAssociate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAssociateByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all associates for given meeting ID
     * </pre>
     */
    default void viewAssociates(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingAssociatesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAssociatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the RSVP of the associate with the given meeting associate UUID
     * </pre>
     */
    default void setAssociateRSVP(com.scailo.sdk.MeetingsServiceSetRSVPRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAssociateRSVPMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.MeetingsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.MeetingsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.MeetingsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    default void count(com.scailo.sdk.MeetingsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MeetingsService.
   * <pre>
   *Describes the common methods applicable on each meeting
   * </pre>
   */
  public static abstract class MeetingsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MeetingsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MeetingsService.
   * <pre>
   *Describes the common methods applicable on each meeting
   * </pre>
   */
  public static final class MeetingsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MeetingsServiceStub> {
    private MeetingsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeetingsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public void create(com.scailo.sdk.MeetingsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public void update(com.scailo.sdk.MeetingsServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    public void cancel(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Complete
     * </pre>
     */
    public void complete(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Repeat
     * </pre>
     */
    public void repeat(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add comment
     * </pre>
     */
    public void commentAdd(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommentAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send Email
     * </pre>
     */
    public void sendEmail(com.scailo.sdk.IdentifierWithEmailAttributes request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request RSVPs from all the participants
     * </pre>
     */
    public void requestRSVP(com.scailo.sdk.IdentifierWithEmailAttributes request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestRSVPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send all the actionables in an email
     * </pre>
     */
    public void sendActionables(com.scailo.sdk.IdentifierWithEmailAttributes request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendActionablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an actionable to a meeting
     * </pre>
     */
    public void addActionable(com.scailo.sdk.MeetingsServiceActionableCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddActionableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an actionable in a meeting
     * </pre>
     */
    public void modifyActionable(com.scailo.sdk.MeetingsServiceActionableUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyActionableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an actionable in a meeting
     * </pre>
     */
    public void deleteActionable(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteActionableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder actionables in a meeting
     * </pre>
     */
    public void reorderActionables(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderActionablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Meeting Actionable by ID
     * </pre>
     */
    public void viewActionableByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingActionable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewActionableByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all actionables for given meeting ID
     * </pre>
     */
    public void viewActionables(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingActionablesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewActionablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the meeting actionable
     * </pre>
     */
    public void viewActionableHistory(com.scailo.sdk.MeetingActionableHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingActionablesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewActionableHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View meeting actionables for given meeting ID with pagination
     * </pre>
     */
    public void viewPaginatedActionables(com.scailo.sdk.MeetingActionablesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedActionablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through meeting actionables with pagination
     * </pre>
     */
    public void searchActionablesWithPagination(com.scailo.sdk.MeetingActionablesSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchActionablesWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an employee
     * </pre>
     */
    public void addEmployee(com.scailo.sdk.MeetingsServiceEmployeeCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an employee
     * </pre>
     */
    public void deleteEmployee(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View an employee for the given ID
     * </pre>
     */
    public void viewEmployeeByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingEmployee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEmployeeByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all employees for given meeting ID
     * </pre>
     */
    public void viewEmployees(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingEmployeesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEmployeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the RSVP of the employee with the given meeting employee UUID
     * </pre>
     */
    public void setEmployeeRSVP(com.scailo.sdk.MeetingsServiceSetRSVPRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetEmployeeRSVPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import employees from team and returns the ID of the meeting
     * </pre>
     */
    public void importFromTeam(com.scailo.sdk.MeetingsServiceImportEmployeesRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportFromTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import employees from department and returns the ID of the meeting
     * </pre>
     */
    public void importFromDepartment(com.scailo.sdk.MeetingsServiceImportEmployeesRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportFromDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an associate
     * </pre>
     */
    public void addAssociate(com.scailo.sdk.MeetingsServiceAssociateCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAssociateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an associate
     * </pre>
     */
    public void deleteAssociate(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAssociateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View an associate for the given ID
     * </pre>
     */
    public void viewAssociateByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingAssociate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAssociateByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all associates for given meeting ID
     * </pre>
     */
    public void viewAssociates(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingAssociatesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAssociatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the RSVP of the associate with the given meeting associate UUID
     * </pre>
     */
    public void setAssociateRSVP(com.scailo.sdk.MeetingsServiceSetRSVPRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAssociateRSVPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.MeetingsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.MeetingsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.MeetingsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public void count(com.scailo.sdk.MeetingsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MeetingsService.
   * <pre>
   *Describes the common methods applicable on each meeting
   * </pre>
   */
  public static final class MeetingsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MeetingsServiceBlockingStub> {
    private MeetingsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeetingsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.MeetingsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse update(com.scailo.sdk.MeetingsServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse cancel(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Complete
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse complete(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Repeat
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse repeat(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepeatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add comment
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse commentAdd(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommentAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send Email
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse sendEmail(com.scailo.sdk.IdentifierWithEmailAttributes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request RSVPs from all the participants
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse requestRSVP(com.scailo.sdk.IdentifierWithEmailAttributes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestRSVPMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send all the actionables in an email
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse sendActionables(com.scailo.sdk.IdentifierWithEmailAttributes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendActionablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an actionable to a meeting
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addActionable(com.scailo.sdk.MeetingsServiceActionableCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddActionableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an actionable in a meeting
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyActionable(com.scailo.sdk.MeetingsServiceActionableUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyActionableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an actionable in a meeting
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteActionable(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteActionableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder actionables in a meeting
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderActionables(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderActionablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Meeting Actionable by ID
     * </pre>
     */
    public com.scailo.sdk.MeetingActionable viewActionableByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewActionableByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all actionables for given meeting ID
     * </pre>
     */
    public com.scailo.sdk.MeetingActionablesList viewActionables(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewActionablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the meeting actionable
     * </pre>
     */
    public com.scailo.sdk.MeetingActionablesList viewActionableHistory(com.scailo.sdk.MeetingActionableHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewActionableHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View meeting actionables for given meeting ID with pagination
     * </pre>
     */
    public com.scailo.sdk.MeetingsServicePaginatedActionablesResponse viewPaginatedActionables(com.scailo.sdk.MeetingActionablesSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedActionablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through meeting actionables with pagination
     * </pre>
     */
    public com.scailo.sdk.MeetingsServicePaginatedActionablesResponse searchActionablesWithPagination(com.scailo.sdk.MeetingActionablesSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchActionablesWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an employee
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addEmployee(com.scailo.sdk.MeetingsServiceEmployeeCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEmployeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an employee
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteEmployee(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmployeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View an employee for the given ID
     * </pre>
     */
    public com.scailo.sdk.MeetingEmployee viewEmployeeByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEmployeeByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all employees for given meeting ID
     * </pre>
     */
    public com.scailo.sdk.MeetingEmployeesList viewEmployees(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEmployeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the RSVP of the employee with the given meeting employee UUID
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID setEmployeeRSVP(com.scailo.sdk.MeetingsServiceSetRSVPRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetEmployeeRSVPMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import employees from team and returns the ID of the meeting
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importFromTeam(com.scailo.sdk.MeetingsServiceImportEmployeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportFromTeamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import employees from department and returns the ID of the meeting
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse importFromDepartment(com.scailo.sdk.MeetingsServiceImportEmployeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportFromDepartmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an associate
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addAssociate(com.scailo.sdk.MeetingsServiceAssociateCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAssociateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an associate
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteAssociate(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAssociateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View an associate for the given ID
     * </pre>
     */
    public com.scailo.sdk.MeetingAssociate viewAssociateByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAssociateByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all associates for given meeting ID
     * </pre>
     */
    public com.scailo.sdk.MeetingAssociatesList viewAssociates(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAssociatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the RSVP of the associate with the given meeting associate UUID
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID setAssociateRSVP(com.scailo.sdk.MeetingsServiceSetRSVPRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAssociateRSVPMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.Meeting viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.Meeting viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.Meeting viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.Meeting viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.MeetingsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.MeetingsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.MeetingsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.MeetingsServicePaginationResponse viewWithPagination(com.scailo.sdk.MeetingsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.MeetingsList searchAll(com.scailo.sdk.MeetingsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.MeetingsList filter(com.scailo.sdk.MeetingsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.MeetingsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MeetingsService.
   * <pre>
   *Describes the common methods applicable on each meeting
   * </pre>
   */
  public static final class MeetingsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MeetingsServiceFutureStub> {
    private MeetingsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeetingsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.MeetingsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> update(
        com.scailo.sdk.MeetingsServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> cancel(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Complete
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> complete(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Repeat
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> repeat(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepeatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add comment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> commentAdd(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommentAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send Email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> sendEmail(
        com.scailo.sdk.IdentifierWithEmailAttributes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request RSVPs from all the participants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> requestRSVP(
        com.scailo.sdk.IdentifierWithEmailAttributes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestRSVPMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send all the actionables in an email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> sendActionables(
        com.scailo.sdk.IdentifierWithEmailAttributes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendActionablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an actionable to a meeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addActionable(
        com.scailo.sdk.MeetingsServiceActionableCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddActionableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an actionable in a meeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyActionable(
        com.scailo.sdk.MeetingsServiceActionableUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyActionableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an actionable in a meeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteActionable(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteActionableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder actionables in a meeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderActionables(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderActionablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Meeting Actionable by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingActionable> viewActionableByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewActionableByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all actionables for given meeting ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingActionablesList> viewActionables(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewActionablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the meeting actionable
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingActionablesList> viewActionableHistory(
        com.scailo.sdk.MeetingActionableHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewActionableHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View meeting actionables for given meeting ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> viewPaginatedActionables(
        com.scailo.sdk.MeetingActionablesSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedActionablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through meeting actionables with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingsServicePaginatedActionablesResponse> searchActionablesWithPagination(
        com.scailo.sdk.MeetingActionablesSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchActionablesWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an employee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addEmployee(
        com.scailo.sdk.MeetingsServiceEmployeeCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an employee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteEmployee(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View an employee for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingEmployee> viewEmployeeByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEmployeeByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all employees for given meeting ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingEmployeesList> viewEmployees(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEmployeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the RSVP of the employee with the given meeting employee UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> setEmployeeRSVP(
        com.scailo.sdk.MeetingsServiceSetRSVPRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetEmployeeRSVPMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import employees from team and returns the ID of the meeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importFromTeam(
        com.scailo.sdk.MeetingsServiceImportEmployeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportFromTeamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import employees from department and returns the ID of the meeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> importFromDepartment(
        com.scailo.sdk.MeetingsServiceImportEmployeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportFromDepartmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an associate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addAssociate(
        com.scailo.sdk.MeetingsServiceAssociateCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAssociateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an associate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteAssociate(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAssociateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View an associate for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingAssociate> viewAssociateByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAssociateByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all associates for given meeting ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingAssociatesList> viewAssociates(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAssociatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the RSVP of the associate with the given meeting associate UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> setAssociateRSVP(
        com.scailo.sdk.MeetingsServiceSetRSVPRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAssociateRSVPMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Meeting> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Meeting> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Meeting> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Meeting> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.MeetingsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingsList> searchAll(
        com.scailo.sdk.MeetingsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MeetingsList> filter(
        com.scailo.sdk.MeetingsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.MeetingsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_CANCEL = 2;
  private static final int METHODID_COMPLETE = 3;
  private static final int METHODID_REPEAT = 4;
  private static final int METHODID_COMMENT_ADD = 5;
  private static final int METHODID_SEND_EMAIL = 6;
  private static final int METHODID_REQUEST_RSVP = 7;
  private static final int METHODID_SEND_ACTIONABLES = 8;
  private static final int METHODID_ADD_ACTIONABLE = 9;
  private static final int METHODID_MODIFY_ACTIONABLE = 10;
  private static final int METHODID_DELETE_ACTIONABLE = 11;
  private static final int METHODID_REORDER_ACTIONABLES = 12;
  private static final int METHODID_VIEW_ACTIONABLE_BY_ID = 13;
  private static final int METHODID_VIEW_ACTIONABLES = 14;
  private static final int METHODID_VIEW_ACTIONABLE_HISTORY = 15;
  private static final int METHODID_VIEW_PAGINATED_ACTIONABLES = 16;
  private static final int METHODID_SEARCH_ACTIONABLES_WITH_PAGINATION = 17;
  private static final int METHODID_ADD_EMPLOYEE = 18;
  private static final int METHODID_DELETE_EMPLOYEE = 19;
  private static final int METHODID_VIEW_EMPLOYEE_BY_ID = 20;
  private static final int METHODID_VIEW_EMPLOYEES = 21;
  private static final int METHODID_SET_EMPLOYEE_RSVP = 22;
  private static final int METHODID_IMPORT_FROM_TEAM = 23;
  private static final int METHODID_IMPORT_FROM_DEPARTMENT = 24;
  private static final int METHODID_ADD_ASSOCIATE = 25;
  private static final int METHODID_DELETE_ASSOCIATE = 26;
  private static final int METHODID_VIEW_ASSOCIATE_BY_ID = 27;
  private static final int METHODID_VIEW_ASSOCIATES = 28;
  private static final int METHODID_SET_ASSOCIATE_RSVP = 29;
  private static final int METHODID_VIEW_BY_ID = 30;
  private static final int METHODID_VIEW_BY_UUID = 31;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 32;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 33;
  private static final int METHODID_VIEW_FROM_IDS = 34;
  private static final int METHODID_VIEW_ALL = 35;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 36;
  private static final int METHODID_VIEW_WITH_PAGINATION = 37;
  private static final int METHODID_SEARCH_ALL = 38;
  private static final int METHODID_FILTER = 39;
  private static final int METHODID_COUNT = 40;

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
          serviceImpl.create((com.scailo.sdk.MeetingsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.scailo.sdk.MeetingsServiceUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_COMPLETE:
          serviceImpl.complete((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REPEAT:
          serviceImpl.repeat((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_COMMENT_ADD:
          serviceImpl.commentAdd((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((com.scailo.sdk.IdentifierWithEmailAttributes) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REQUEST_RSVP:
          serviceImpl.requestRSVP((com.scailo.sdk.IdentifierWithEmailAttributes) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SEND_ACTIONABLES:
          serviceImpl.sendActionables((com.scailo.sdk.IdentifierWithEmailAttributes) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_ACTIONABLE:
          serviceImpl.addActionable((com.scailo.sdk.MeetingsServiceActionableCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_ACTIONABLE:
          serviceImpl.modifyActionable((com.scailo.sdk.MeetingsServiceActionableUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACTIONABLE:
          serviceImpl.deleteActionable((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_ACTIONABLES:
          serviceImpl.reorderActionables((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_ACTIONABLE_BY_ID:
          serviceImpl.viewActionableByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingActionable>) responseObserver);
          break;
        case METHODID_VIEW_ACTIONABLES:
          serviceImpl.viewActionables((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingActionablesList>) responseObserver);
          break;
        case METHODID_VIEW_ACTIONABLE_HISTORY:
          serviceImpl.viewActionableHistory((com.scailo.sdk.MeetingActionableHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingActionablesList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_ACTIONABLES:
          serviceImpl.viewPaginatedActionables((com.scailo.sdk.MeetingActionablesSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsServicePaginatedActionablesResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ACTIONABLES_WITH_PAGINATION:
          serviceImpl.searchActionablesWithPagination((com.scailo.sdk.MeetingActionablesSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsServicePaginatedActionablesResponse>) responseObserver);
          break;
        case METHODID_ADD_EMPLOYEE:
          serviceImpl.addEmployee((com.scailo.sdk.MeetingsServiceEmployeeCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE:
          serviceImpl.deleteEmployee((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_EMPLOYEE_BY_ID:
          serviceImpl.viewEmployeeByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingEmployee>) responseObserver);
          break;
        case METHODID_VIEW_EMPLOYEES:
          serviceImpl.viewEmployees((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingEmployeesList>) responseObserver);
          break;
        case METHODID_SET_EMPLOYEE_RSVP:
          serviceImpl.setEmployeeRSVP((com.scailo.sdk.MeetingsServiceSetRSVPRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_IMPORT_FROM_TEAM:
          serviceImpl.importFromTeam((com.scailo.sdk.MeetingsServiceImportEmployeesRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_IMPORT_FROM_DEPARTMENT:
          serviceImpl.importFromDepartment((com.scailo.sdk.MeetingsServiceImportEmployeesRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_ASSOCIATE:
          serviceImpl.addAssociate((com.scailo.sdk.MeetingsServiceAssociateCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_ASSOCIATE:
          serviceImpl.deleteAssociate((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_ASSOCIATE_BY_ID:
          serviceImpl.viewAssociateByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingAssociate>) responseObserver);
          break;
        case METHODID_VIEW_ASSOCIATES:
          serviceImpl.viewAssociates((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingAssociatesList>) responseObserver);
          break;
        case METHODID_SET_ASSOCIATE_RSVP:
          serviceImpl.setAssociateRSVP((com.scailo.sdk.MeetingsServiceSetRSVPRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Meeting>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.MeetingsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.MeetingsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.MeetingsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MeetingsList>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.MeetingsServiceCountReq) request,
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
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CANCEL)))
        .addMethod(
          getCompleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_COMPLETE)))
        .addMethod(
          getRepeatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REPEAT)))
        .addMethod(
          getCommentAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_COMMENT_ADD)))
        .addMethod(
          getSendEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithEmailAttributes,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_SEND_EMAIL)))
        .addMethod(
          getRequestRSVPMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithEmailAttributes,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REQUEST_RSVP)))
        .addMethod(
          getSendActionablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithEmailAttributes,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_SEND_ACTIONABLES)))
        .addMethod(
          getAddActionableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceActionableCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_ACTIONABLE)))
        .addMethod(
          getModifyActionableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceActionableUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_ACTIONABLE)))
        .addMethod(
          getDeleteActionableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_ACTIONABLE)))
        .addMethod(
          getReorderActionablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_ACTIONABLES)))
        .addMethod(
          getViewActionableByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.MeetingActionable>(
                service, METHODID_VIEW_ACTIONABLE_BY_ID)))
        .addMethod(
          getViewActionablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.MeetingActionablesList>(
                service, METHODID_VIEW_ACTIONABLES)))
        .addMethod(
          getViewActionableHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingActionableHistoryRequest,
              com.scailo.sdk.MeetingActionablesList>(
                service, METHODID_VIEW_ACTIONABLE_HISTORY)))
        .addMethod(
          getViewPaginatedActionablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingActionablesSearchRequest,
              com.scailo.sdk.MeetingsServicePaginatedActionablesResponse>(
                service, METHODID_VIEW_PAGINATED_ACTIONABLES)))
        .addMethod(
          getSearchActionablesWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingActionablesSearchRequest,
              com.scailo.sdk.MeetingsServicePaginatedActionablesResponse>(
                service, METHODID_SEARCH_ACTIONABLES_WITH_PAGINATION)))
        .addMethod(
          getAddEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceEmployeeCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_EMPLOYEE)))
        .addMethod(
          getDeleteEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_EMPLOYEE)))
        .addMethod(
          getViewEmployeeByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.MeetingEmployee>(
                service, METHODID_VIEW_EMPLOYEE_BY_ID)))
        .addMethod(
          getViewEmployeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.MeetingEmployeesList>(
                service, METHODID_VIEW_EMPLOYEES)))
        .addMethod(
          getSetEmployeeRSVPMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceSetRSVPRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_SET_EMPLOYEE_RSVP)))
        .addMethod(
          getImportFromTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceImportEmployeesRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_FROM_TEAM)))
        .addMethod(
          getImportFromDepartmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceImportEmployeesRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_IMPORT_FROM_DEPARTMENT)))
        .addMethod(
          getAddAssociateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceAssociateCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_ASSOCIATE)))
        .addMethod(
          getDeleteAssociateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_ASSOCIATE)))
        .addMethod(
          getViewAssociateByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.MeetingAssociate>(
                service, METHODID_VIEW_ASSOCIATE_BY_ID)))
        .addMethod(
          getViewAssociatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.MeetingAssociatesList>(
                service, METHODID_VIEW_ASSOCIATES)))
        .addMethod(
          getSetAssociateRSVPMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceSetRSVPRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_SET_ASSOCIATE_RSVP)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Meeting>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Meeting>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Meeting>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Meeting>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.MeetingsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.MeetingsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.MeetingsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServicePaginationReq,
              com.scailo.sdk.MeetingsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceSearchAllReq,
              com.scailo.sdk.MeetingsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceFilterReq,
              com.scailo.sdk.MeetingsList>(
                service, METHODID_FILTER)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MeetingsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .build();
  }

  private static abstract class MeetingsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeetingsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.MeetingsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeetingsService");
    }
  }

  private static final class MeetingsServiceFileDescriptorSupplier
      extends MeetingsServiceBaseDescriptorSupplier {
    MeetingsServiceFileDescriptorSupplier() {}
  }

  private static final class MeetingsServiceMethodDescriptorSupplier
      extends MeetingsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MeetingsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MeetingsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeetingsServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getCancelMethod())
              .addMethod(getCompleteMethod())
              .addMethod(getRepeatMethod())
              .addMethod(getCommentAddMethod())
              .addMethod(getSendEmailMethod())
              .addMethod(getRequestRSVPMethod())
              .addMethod(getSendActionablesMethod())
              .addMethod(getAddActionableMethod())
              .addMethod(getModifyActionableMethod())
              .addMethod(getDeleteActionableMethod())
              .addMethod(getReorderActionablesMethod())
              .addMethod(getViewActionableByIDMethod())
              .addMethod(getViewActionablesMethod())
              .addMethod(getViewActionableHistoryMethod())
              .addMethod(getViewPaginatedActionablesMethod())
              .addMethod(getSearchActionablesWithPaginationMethod())
              .addMethod(getAddEmployeeMethod())
              .addMethod(getDeleteEmployeeMethod())
              .addMethod(getViewEmployeeByIDMethod())
              .addMethod(getViewEmployeesMethod())
              .addMethod(getSetEmployeeRSVPMethod())
              .addMethod(getImportFromTeamMethod())
              .addMethod(getImportFromDepartmentMethod())
              .addMethod(getAddAssociateMethod())
              .addMethod(getDeleteAssociateMethod())
              .addMethod(getViewAssociateByIDMethod())
              .addMethod(getViewAssociatesMethod())
              .addMethod(getSetAssociateRSVPMethod())
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
              .build();
        }
      }
    }
    return result;
  }
}
