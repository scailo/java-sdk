package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each onduty
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: on_duties.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OnDutiesServiceGrpc {

  private OnDutiesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.OnDutiesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.OnDutiesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = OnDutiesServiceGrpc.getCreateMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getCreateMethod = OnDutiesServiceGrpc.getCreateMethod) == null) {
          OnDutiesServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.OnDutiesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = OnDutiesServiceGrpc.getDraftMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getDraftMethod = OnDutiesServiceGrpc.getDraftMethod) == null) {
          OnDutiesServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.OnDutiesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = OnDutiesServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getDraftUpdateMethod = OnDutiesServiceGrpc.getDraftUpdateMethod) == null) {
          OnDutiesServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("DraftUpdate"))
              .build();
        }
      }
    }
    return getDraftUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSendForVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendForVerification",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSendForVerificationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getSendForVerificationMethod;
    if ((getSendForVerificationMethod = OnDutiesServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getSendForVerificationMethod = OnDutiesServiceGrpc.getSendForVerificationMethod) == null) {
          OnDutiesServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("SendForVerification"))
              .build();
        }
      }
    }
    return getSendForVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Verify",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getVerifyMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getVerifyMethod;
    if ((getVerifyMethod = OnDutiesServiceGrpc.getVerifyMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getVerifyMethod = OnDutiesServiceGrpc.getVerifyMethod) == null) {
          OnDutiesServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Verify"))
              .build();
        }
      }
    }
    return getVerifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Approve",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveMethod;
    if ((getApproveMethod = OnDutiesServiceGrpc.getApproveMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getApproveMethod = OnDutiesServiceGrpc.getApproveMethod) == null) {
          OnDutiesServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Approve"))
              .build();
        }
      }
    }
    return getApproveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSendForRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendForRevision",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSendForRevisionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getSendForRevisionMethod;
    if ((getSendForRevisionMethod = OnDutiesServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getSendForRevisionMethod = OnDutiesServiceGrpc.getSendForRevisionMethod) == null) {
          OnDutiesServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.OnDutiesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = OnDutiesServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getRevisionUpdateMethod = OnDutiesServiceGrpc.getRevisionUpdateMethod) == null) {
          OnDutiesServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("RevisionUpdate"))
              .build();
        }
      }
    }
    return getRevisionUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getHaltMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Halt",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getHaltMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getHaltMethod;
    if ((getHaltMethod = OnDutiesServiceGrpc.getHaltMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getHaltMethod = OnDutiesServiceGrpc.getHaltMethod) == null) {
          OnDutiesServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Halt"))
              .build();
        }
      }
    }
    return getHaltMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDiscardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Discard",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDiscardMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getDiscardMethod;
    if ((getDiscardMethod = OnDutiesServiceGrpc.getDiscardMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getDiscardMethod = OnDutiesServiceGrpc.getDiscardMethod) == null) {
          OnDutiesServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Discard"))
              .build();
        }
      }
    }
    return getDiscardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getRestoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Restore",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getRestoreMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getRestoreMethod;
    if ((getRestoreMethod = OnDutiesServiceGrpc.getRestoreMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getRestoreMethod = OnDutiesServiceGrpc.getRestoreMethod) == null) {
          OnDutiesServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Restore"))
              .build();
        }
      }
    }
    return getRestoreMethod;
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
    if ((getCompleteMethod = OnDutiesServiceGrpc.getCompleteMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getCompleteMethod = OnDutiesServiceGrpc.getCompleteMethod) == null) {
          OnDutiesServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = OnDutiesServiceGrpc.getRepeatMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getRepeatMethod = OnDutiesServiceGrpc.getRepeatMethod) == null) {
          OnDutiesServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getCommentAddMethod = OnDutiesServiceGrpc.getCommentAddMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getCommentAddMethod = OnDutiesServiceGrpc.getCommentAddMethod) == null) {
          OnDutiesServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("CommentAdd"))
              .build();
        }
      }
    }
    return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
      com.scailo.sdk.MagicLink> getCreateMagicLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMagicLink",
      requestType = com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.class,
      responseType = com.scailo.sdk.MagicLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
      com.scailo.sdk.MagicLink> getCreateMagicLinkMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink> getCreateMagicLinkMethod;
    if ((getCreateMagicLinkMethod = OnDutiesServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = OnDutiesServiceGrpc.getCreateMagicLinkMethod) == null) {
          OnDutiesServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("CreateMagicLink"))
              .build();
        }
      }
    }
    return getCreateMagicLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceImageEntryRequest,
      com.scailo.sdk.IdentifierResponse> getRecordImageEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordImageEntry",
      requestType = com.scailo.sdk.OnDutiesServiceImageEntryRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceImageEntryRequest,
      com.scailo.sdk.IdentifierResponse> getRecordImageEntryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceImageEntryRequest, com.scailo.sdk.IdentifierResponse> getRecordImageEntryMethod;
    if ((getRecordImageEntryMethod = OnDutiesServiceGrpc.getRecordImageEntryMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getRecordImageEntryMethod = OnDutiesServiceGrpc.getRecordImageEntryMethod) == null) {
          OnDutiesServiceGrpc.getRecordImageEntryMethod = getRecordImageEntryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceImageEntryRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordImageEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceImageEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("RecordImageEntry"))
              .build();
        }
      }
    }
    return getRecordImageEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceImageExitRequest,
      com.scailo.sdk.IdentifierResponse> getRecordImageExitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordImageExit",
      requestType = com.scailo.sdk.OnDutiesServiceImageExitRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceImageExitRequest,
      com.scailo.sdk.IdentifierResponse> getRecordImageExitMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceImageExitRequest, com.scailo.sdk.IdentifierResponse> getRecordImageExitMethod;
    if ((getRecordImageExitMethod = OnDutiesServiceGrpc.getRecordImageExitMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getRecordImageExitMethod = OnDutiesServiceGrpc.getRecordImageExitMethod) == null) {
          OnDutiesServiceGrpc.getRecordImageExitMethod = getRecordImageExitMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceImageExitRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordImageExit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceImageExitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("RecordImageExit"))
              .build();
        }
      }
    }
    return getRecordImageExitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OnDuty> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OnDuty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OnDuty> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OnDuty> getViewByIDMethod;
    if ((getViewByIDMethod = OnDutiesServiceGrpc.getViewByIDMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewByIDMethod = OnDutiesServiceGrpc.getViewByIDMethod) == null) {
          OnDutiesServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OnDuty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDuty.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OnDuty> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OnDuty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OnDuty> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OnDuty> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = OnDutiesServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewByUUIDMethod = OnDutiesServiceGrpc.getViewByUUIDMethod) == null) {
          OnDutiesServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OnDuty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDuty.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OnDuty> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OnDuty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OnDuty> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OnDuty> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = OnDutiesServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = OnDutiesServiceGrpc.getViewEssentialByIDMethod) == null) {
          OnDutiesServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OnDuty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDuty.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OnDuty> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OnDuty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OnDuty> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OnDuty> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = OnDutiesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = OnDutiesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          OnDutiesServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OnDuty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDuty.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.OnDutiesList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.OnDutiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.OnDutiesList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.OnDutiesList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = OnDutiesServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewFromIDsMethod = OnDutiesServiceGrpc.getViewFromIDsMethod) == null) {
          OnDutiesServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.OnDutiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesList.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.OnDutiesList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.OnDutiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.OnDutiesList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.OnDutiesList> getViewAllMethod;
    if ((getViewAllMethod = OnDutiesServiceGrpc.getViewAllMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewAllMethod = OnDutiesServiceGrpc.getViewAllMethod) == null) {
          OnDutiesServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.OnDutiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesList.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OnDutiesList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OnDutiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OnDutiesList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OnDutiesList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = OnDutiesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = OnDutiesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          OnDutiesServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OnDutiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesList.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServicePaginationReq,
      com.scailo.sdk.OnDutiesServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.OnDutiesServicePaginationReq.class,
      responseType = com.scailo.sdk.OnDutiesServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServicePaginationReq,
      com.scailo.sdk.OnDutiesServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServicePaginationReq, com.scailo.sdk.OnDutiesServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = OnDutiesServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewWithPaginationMethod = OnDutiesServiceGrpc.getViewWithPaginationMethod) == null) {
          OnDutiesServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServicePaginationReq, com.scailo.sdk.OnDutiesServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewEntryImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEntryImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewEntryImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewEntryImageMethod;
    if ((getViewEntryImageMethod = OnDutiesServiceGrpc.getViewEntryImageMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewEntryImageMethod = OnDutiesServiceGrpc.getViewEntryImageMethod) == null) {
          OnDutiesServiceGrpc.getViewEntryImageMethod = getViewEntryImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEntryImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewEntryImage"))
              .build();
        }
      }
    }
    return getViewEntryImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getConfirmEntryImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmEntryImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getConfirmEntryImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getConfirmEntryImageMethod;
    if ((getConfirmEntryImageMethod = OnDutiesServiceGrpc.getConfirmEntryImageMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getConfirmEntryImageMethod = OnDutiesServiceGrpc.getConfirmEntryImageMethod) == null) {
          OnDutiesServiceGrpc.getConfirmEntryImageMethod = getConfirmEntryImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmEntryImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ConfirmEntryImage"))
              .build();
        }
      }
    }
    return getConfirmEntryImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewExitImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewExitImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewExitImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewExitImageMethod;
    if ((getViewExitImageMethod = OnDutiesServiceGrpc.getViewExitImageMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewExitImageMethod = OnDutiesServiceGrpc.getViewExitImageMethod) == null) {
          OnDutiesServiceGrpc.getViewExitImageMethod = getViewExitImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewExitImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewExitImage"))
              .build();
        }
      }
    }
    return getViewExitImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getConfirmExitImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmExitImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getConfirmExitImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getConfirmExitImageMethod;
    if ((getConfirmExitImageMethod = OnDutiesServiceGrpc.getConfirmExitImageMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getConfirmExitImageMethod = OnDutiesServiceGrpc.getConfirmExitImageMethod) == null) {
          OnDutiesServiceGrpc.getConfirmExitImageMethod = getConfirmExitImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmExitImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ConfirmExitImage"))
              .build();
        }
      }
    }
    return getConfirmExitImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GPSCoordinatesResponse> getViewEntryGPSCoordinatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEntryGPSCoordinates",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GPSCoordinatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GPSCoordinatesResponse> getViewEntryGPSCoordinatesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GPSCoordinatesResponse> getViewEntryGPSCoordinatesMethod;
    if ((getViewEntryGPSCoordinatesMethod = OnDutiesServiceGrpc.getViewEntryGPSCoordinatesMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewEntryGPSCoordinatesMethod = OnDutiesServiceGrpc.getViewEntryGPSCoordinatesMethod) == null) {
          OnDutiesServiceGrpc.getViewEntryGPSCoordinatesMethod = getViewEntryGPSCoordinatesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GPSCoordinatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEntryGPSCoordinates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GPSCoordinatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewEntryGPSCoordinates"))
              .build();
        }
      }
    }
    return getViewEntryGPSCoordinatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GPSCoordinatesResponse> getViewExitGPSCoordinatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewExitGPSCoordinates",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GPSCoordinatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GPSCoordinatesResponse> getViewExitGPSCoordinatesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GPSCoordinatesResponse> getViewExitGPSCoordinatesMethod;
    if ((getViewExitGPSCoordinatesMethod = OnDutiesServiceGrpc.getViewExitGPSCoordinatesMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewExitGPSCoordinatesMethod = OnDutiesServiceGrpc.getViewExitGPSCoordinatesMethod) == null) {
          OnDutiesServiceGrpc.getViewExitGPSCoordinatesMethod = getViewExitGPSCoordinatesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GPSCoordinatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewExitGPSCoordinates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GPSCoordinatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewExitGPSCoordinates"))
              .build();
        }
      }
    }
    return getViewExitGPSCoordinatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewEntryGPSStaticImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEntryGPSStaticImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewEntryGPSStaticImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewEntryGPSStaticImageMethod;
    if ((getViewEntryGPSStaticImageMethod = OnDutiesServiceGrpc.getViewEntryGPSStaticImageMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewEntryGPSStaticImageMethod = OnDutiesServiceGrpc.getViewEntryGPSStaticImageMethod) == null) {
          OnDutiesServiceGrpc.getViewEntryGPSStaticImageMethod = getViewEntryGPSStaticImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEntryGPSStaticImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewEntryGPSStaticImage"))
              .build();
        }
      }
    }
    return getViewEntryGPSStaticImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewExitGPSStaticImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewExitGPSStaticImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewExitGPSStaticImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewExitGPSStaticImageMethod;
    if ((getViewExitGPSStaticImageMethod = OnDutiesServiceGrpc.getViewExitGPSStaticImageMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getViewExitGPSStaticImageMethod = OnDutiesServiceGrpc.getViewExitGPSStaticImageMethod) == null) {
          OnDutiesServiceGrpc.getViewExitGPSStaticImageMethod = getViewExitGPSStaticImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewExitGPSStaticImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("ViewExitGPSStaticImage"))
              .build();
        }
      }
    }
    return getViewExitGPSStaticImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceSearchAllReq,
      com.scailo.sdk.OnDutiesList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.OnDutiesServiceSearchAllReq.class,
      responseType = com.scailo.sdk.OnDutiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceSearchAllReq,
      com.scailo.sdk.OnDutiesList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceSearchAllReq, com.scailo.sdk.OnDutiesList> getSearchAllMethod;
    if ((getSearchAllMethod = OnDutiesServiceGrpc.getSearchAllMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getSearchAllMethod = OnDutiesServiceGrpc.getSearchAllMethod) == null) {
          OnDutiesServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceSearchAllReq, com.scailo.sdk.OnDutiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesList.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceFilterReq,
      com.scailo.sdk.OnDutiesList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.OnDutiesServiceFilterReq.class,
      responseType = com.scailo.sdk.OnDutiesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceFilterReq,
      com.scailo.sdk.OnDutiesList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceFilterReq, com.scailo.sdk.OnDutiesList> getFilterMethod;
    if ((getFilterMethod = OnDutiesServiceGrpc.getFilterMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getFilterMethod = OnDutiesServiceGrpc.getFilterMethod) == null) {
          OnDutiesServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceFilterReq, com.scailo.sdk.OnDutiesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesList.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.CountInSLCStatusRequest,
      com.scailo.sdk.CountResponse> getCountInStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountInStatus",
      requestType = com.scailo.sdk.CountInSLCStatusRequest.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.CountInSLCStatusRequest,
      com.scailo.sdk.CountResponse> getCountInStatusMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse> getCountInStatusMethod;
    if ((getCountInStatusMethod = OnDutiesServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getCountInStatusMethod = OnDutiesServiceGrpc.getCountInStatusMethod) == null) {
          OnDutiesServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.OnDutiesServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = OnDutiesServiceGrpc.getCountMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getCountMethod = OnDutiesServiceGrpc.getCountMethod) == null) {
          OnDutiesServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.OnDutiesServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OnDutiesServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = OnDutiesServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (OnDutiesServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = OnDutiesServiceGrpc.getDownloadAsCSVMethod) == null) {
          OnDutiesServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OnDutiesServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OnDutiesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OnDutiesServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OnDutiesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OnDutiesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OnDutiesServiceStub>() {
        @java.lang.Override
        public OnDutiesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OnDutiesServiceStub(channel, callOptions);
        }
      };
    return OnDutiesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OnDutiesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OnDutiesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OnDutiesServiceBlockingStub>() {
        @java.lang.Override
        public OnDutiesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OnDutiesServiceBlockingStub(channel, callOptions);
        }
      };
    return OnDutiesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OnDutiesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OnDutiesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OnDutiesServiceFutureStub>() {
        @java.lang.Override
        public OnDutiesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OnDutiesServiceFutureStub(channel, callOptions);
        }
      };
    return OnDutiesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each onduty
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.OnDutiesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.OnDutiesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.OnDutiesServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send for verification
     * </pre>
     */
    default void sendForVerification(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendForVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Verify
     * </pre>
     */
    default void verify(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve
     * </pre>
     */
    default void approve(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send For Revision
     * </pre>
     */
    default void sendForRevision(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendForRevisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update revision
     * </pre>
     */
    default void revisionUpdate(com.scailo.sdk.OnDutiesServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevisionUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Halt
     * </pre>
     */
    default void halt(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHaltMethod(), responseObserver);
    }

    /**
     * <pre>
     * Discard
     * </pre>
     */
    default void discard(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDiscardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Restore
     * </pre>
     */
    default void restore(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestoreMethod(), responseObserver);
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
     * rpc SendEmail (Identifier) returns (IdentifierResponse);
     * Create a magic link
     * </pre>
     */
    default void createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMagicLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Store entry time
     * </pre>
     */
    default void recordImageEntry(com.scailo.sdk.OnDutiesServiceImageEntryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordImageEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Store exit time
     * </pre>
     */
    default void recordImageExit(com.scailo.sdk.OnDutiesServiceImageExitRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordImageExitMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.OnDutiesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View entry image for onduty UUID
     * </pre>
     */
    default void viewEntryImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEntryImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Confirm that the entry image of the given onduty UUID belongs to the user
     * </pre>
     */
    default void confirmEntryImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmEntryImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View exit image for onduty UUID
     * </pre>
     */
    default void viewExitImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewExitImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Confirm that the exit image of the given onduty UUID belongs to the user
     * </pre>
     */
    default void confirmExitImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmExitImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View entry GPS coordinates for onduty UUID
     * </pre>
     */
    default void viewEntryGPSCoordinates(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEntryGPSCoordinatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View exit GPS coordinates for onduty UUID
     * </pre>
     */
    default void viewExitGPSCoordinates(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewExitGPSCoordinatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View entry GPS static image from Google Maps
     * </pre>
     */
    default void viewEntryGPSStaticImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEntryGPSStaticImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View exit GPS static image from Google Maps
     * </pre>
     */
    default void viewExitGPSStaticImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewExitGPSStaticImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.OnDutiesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.OnDutiesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count in status
     * </pre>
     */
    default void countInStatus(com.scailo.sdk.CountInSLCStatusRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountInStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    default void count(com.scailo.sdk.OnDutiesServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.OnDutiesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OnDutiesService.
   * <pre>
   *Describes the common methods applicable on each onduty
   * </pre>
   */
  public static abstract class OnDutiesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OnDutiesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OnDutiesService.
   * <pre>
   *Describes the common methods applicable on each onduty
   * </pre>
   */
  public static final class OnDutiesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OnDutiesServiceStub> {
    private OnDutiesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnDutiesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OnDutiesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.OnDutiesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.OnDutiesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.OnDutiesServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send for verification
     * </pre>
     */
    public void sendForVerification(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendForVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify
     * </pre>
     */
    public void verify(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve
     * </pre>
     */
    public void approve(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send For Revision
     * </pre>
     */
    public void sendForRevision(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendForRevisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update revision
     * </pre>
     */
    public void revisionUpdate(com.scailo.sdk.OnDutiesServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevisionUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Halt
     * </pre>
     */
    public void halt(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHaltMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Discard
     * </pre>
     */
    public void discard(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDiscardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Restore
     * </pre>
     */
    public void restore(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request, responseObserver);
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
     * rpc SendEmail (Identifier) returns (IdentifierResponse);
     * Create a magic link
     * </pre>
     */
    public void createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMagicLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Store entry time
     * </pre>
     */
    public void recordImageEntry(com.scailo.sdk.OnDutiesServiceImageEntryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordImageEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Store exit time
     * </pre>
     */
    public void recordImageExit(com.scailo.sdk.OnDutiesServiceImageExitRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordImageExitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.OnDutiesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View entry image for onduty UUID
     * </pre>
     */
    public void viewEntryImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEntryImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Confirm that the entry image of the given onduty UUID belongs to the user
     * </pre>
     */
    public void confirmEntryImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmEntryImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View exit image for onduty UUID
     * </pre>
     */
    public void viewExitImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewExitImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Confirm that the exit image of the given onduty UUID belongs to the user
     * </pre>
     */
    public void confirmExitImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmExitImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View entry GPS coordinates for onduty UUID
     * </pre>
     */
    public void viewEntryGPSCoordinates(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEntryGPSCoordinatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View exit GPS coordinates for onduty UUID
     * </pre>
     */
    public void viewExitGPSCoordinates(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewExitGPSCoordinatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View entry GPS static image from Google Maps
     * </pre>
     */
    public void viewEntryGPSStaticImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEntryGPSStaticImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View exit GPS static image from Google Maps
     * </pre>
     */
    public void viewExitGPSStaticImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewExitGPSStaticImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.OnDutiesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.OnDutiesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count in status
     * </pre>
     */
    public void countInStatus(com.scailo.sdk.CountInSLCStatusRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountInStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public void count(com.scailo.sdk.OnDutiesServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.OnDutiesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OnDutiesService.
   * <pre>
   *Describes the common methods applicable on each onduty
   * </pre>
   */
  public static final class OnDutiesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OnDutiesServiceBlockingStub> {
    private OnDutiesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnDutiesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OnDutiesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.OnDutiesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.OnDutiesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.OnDutiesServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse sendForVerification(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendForVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse verify(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approve(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send For Revision
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse sendForRevision(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendForRevisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update revision
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.OnDutiesServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevisionUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Halt
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse halt(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHaltMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Discard
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse discard(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDiscardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Restore
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse restore(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestoreMethod(), getCallOptions(), request);
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
     * rpc SendEmail (Identifier) returns (IdentifierResponse);
     * Create a magic link
     * </pre>
     */
    public com.scailo.sdk.MagicLink createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMagicLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Store entry time
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse recordImageEntry(com.scailo.sdk.OnDutiesServiceImageEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordImageEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Store exit time
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse recordImageExit(com.scailo.sdk.OnDutiesServiceImageExitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordImageExitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.OnDuty viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.OnDuty viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.OnDuty viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.OnDuty viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.OnDutiesList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.OnDutiesList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.OnDutiesList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.OnDutiesServicePaginationResponse viewWithPagination(com.scailo.sdk.OnDutiesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View entry image for onduty UUID
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewEntryImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEntryImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Confirm that the entry image of the given onduty UUID belongs to the user
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse confirmEntryImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmEntryImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View exit image for onduty UUID
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewExitImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewExitImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Confirm that the exit image of the given onduty UUID belongs to the user
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse confirmExitImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmExitImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View entry GPS coordinates for onduty UUID
     * </pre>
     */
    public com.scailo.sdk.GPSCoordinatesResponse viewEntryGPSCoordinates(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEntryGPSCoordinatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View exit GPS coordinates for onduty UUID
     * </pre>
     */
    public com.scailo.sdk.GPSCoordinatesResponse viewExitGPSCoordinates(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewExitGPSCoordinatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View entry GPS static image from Google Maps
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewEntryGPSStaticImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEntryGPSStaticImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View exit GPS static image from Google Maps
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewExitGPSStaticImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewExitGPSStaticImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.OnDutiesList searchAll(com.scailo.sdk.OnDutiesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.OnDutiesList filter(com.scailo.sdk.OnDutiesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count in status
     * </pre>
     */
    public com.scailo.sdk.CountResponse countInStatus(com.scailo.sdk.CountInSLCStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountInStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.OnDutiesServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.OnDutiesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OnDutiesService.
   * <pre>
   *Describes the common methods applicable on each onduty
   * </pre>
   */
  public static final class OnDutiesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OnDutiesServiceFutureStub> {
    private OnDutiesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnDutiesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OnDutiesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.OnDutiesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.OnDutiesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.OnDutiesServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> sendForVerification(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendForVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> verify(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approve(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send For Revision
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> sendForRevision(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendForRevisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update revision
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> revisionUpdate(
        com.scailo.sdk.OnDutiesServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevisionUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Halt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> halt(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHaltMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Discard
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> discard(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDiscardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Restore
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> restore(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request);
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
     * rpc SendEmail (Identifier) returns (IdentifierResponse);
     * Create a magic link
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MagicLink> createMagicLink(
        com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMagicLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Store entry time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> recordImageEntry(
        com.scailo.sdk.OnDutiesServiceImageEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordImageEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Store exit time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> recordImageExit(
        com.scailo.sdk.OnDutiesServiceImageExitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordImageExitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDuty> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDuty> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDuty> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDuty> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDutiesList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDutiesList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDutiesList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDutiesServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.OnDutiesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View entry image for onduty UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewEntryImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEntryImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Confirm that the entry image of the given onduty UUID belongs to the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> confirmEntryImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmEntryImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View exit image for onduty UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewExitImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewExitImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Confirm that the exit image of the given onduty UUID belongs to the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> confirmExitImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmExitImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View entry GPS coordinates for onduty UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GPSCoordinatesResponse> viewEntryGPSCoordinates(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEntryGPSCoordinatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View exit GPS coordinates for onduty UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GPSCoordinatesResponse> viewExitGPSCoordinates(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewExitGPSCoordinatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View entry GPS static image from Google Maps
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewEntryGPSStaticImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEntryGPSStaticImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View exit GPS static image from Google Maps
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewExitGPSStaticImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewExitGPSStaticImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDutiesList> searchAll(
        com.scailo.sdk.OnDutiesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OnDutiesList> filter(
        com.scailo.sdk.OnDutiesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count in status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> countInStatus(
        com.scailo.sdk.CountInSLCStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountInStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.OnDutiesServiceCountReq request) {
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
        com.scailo.sdk.OnDutiesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DRAFT = 1;
  private static final int METHODID_DRAFT_UPDATE = 2;
  private static final int METHODID_SEND_FOR_VERIFICATION = 3;
  private static final int METHODID_VERIFY = 4;
  private static final int METHODID_APPROVE = 5;
  private static final int METHODID_SEND_FOR_REVISION = 6;
  private static final int METHODID_REVISION_UPDATE = 7;
  private static final int METHODID_HALT = 8;
  private static final int METHODID_DISCARD = 9;
  private static final int METHODID_RESTORE = 10;
  private static final int METHODID_COMPLETE = 11;
  private static final int METHODID_REPEAT = 12;
  private static final int METHODID_COMMENT_ADD = 13;
  private static final int METHODID_CREATE_MAGIC_LINK = 14;
  private static final int METHODID_RECORD_IMAGE_ENTRY = 15;
  private static final int METHODID_RECORD_IMAGE_EXIT = 16;
  private static final int METHODID_VIEW_BY_ID = 17;
  private static final int METHODID_VIEW_BY_UUID = 18;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 19;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 20;
  private static final int METHODID_VIEW_FROM_IDS = 21;
  private static final int METHODID_VIEW_ALL = 22;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 23;
  private static final int METHODID_VIEW_WITH_PAGINATION = 24;
  private static final int METHODID_VIEW_ENTRY_IMAGE = 25;
  private static final int METHODID_CONFIRM_ENTRY_IMAGE = 26;
  private static final int METHODID_VIEW_EXIT_IMAGE = 27;
  private static final int METHODID_CONFIRM_EXIT_IMAGE = 28;
  private static final int METHODID_VIEW_ENTRY_GPSCOORDINATES = 29;
  private static final int METHODID_VIEW_EXIT_GPSCOORDINATES = 30;
  private static final int METHODID_VIEW_ENTRY_GPSSTATIC_IMAGE = 31;
  private static final int METHODID_VIEW_EXIT_GPSSTATIC_IMAGE = 32;
  private static final int METHODID_SEARCH_ALL = 33;
  private static final int METHODID_FILTER = 34;
  private static final int METHODID_COUNT_IN_STATUS = 35;
  private static final int METHODID_COUNT = 36;
  private static final int METHODID_DOWNLOAD_AS_CSV = 37;

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
          serviceImpl.create((com.scailo.sdk.OnDutiesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.OnDutiesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.OnDutiesServiceUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SEND_FOR_VERIFICATION:
          serviceImpl.sendForVerification((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VERIFY:
          serviceImpl.verify((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE:
          serviceImpl.approve((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SEND_FOR_REVISION:
          serviceImpl.sendForRevision((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REVISION_UPDATE:
          serviceImpl.revisionUpdate((com.scailo.sdk.OnDutiesServiceUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_HALT:
          serviceImpl.halt((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DISCARD:
          serviceImpl.discard((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_RESTORE:
          serviceImpl.restore((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
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
        case METHODID_CREATE_MAGIC_LINK:
          serviceImpl.createMagicLink((com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink>) responseObserver);
          break;
        case METHODID_RECORD_IMAGE_ENTRY:
          serviceImpl.recordImageEntry((com.scailo.sdk.OnDutiesServiceImageEntryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_RECORD_IMAGE_EXIT:
          serviceImpl.recordImageExit((com.scailo.sdk.OnDutiesServiceImageExitRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDuty>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.OnDutiesServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_ENTRY_IMAGE:
          serviceImpl.viewEntryImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_ENTRY_IMAGE:
          serviceImpl.confirmEntryImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_VIEW_EXIT_IMAGE:
          serviceImpl.viewExitImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_EXIT_IMAGE:
          serviceImpl.confirmExitImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_VIEW_ENTRY_GPSCOORDINATES:
          serviceImpl.viewEntryGPSCoordinates((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse>) responseObserver);
          break;
        case METHODID_VIEW_EXIT_GPSCOORDINATES:
          serviceImpl.viewExitGPSCoordinates((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse>) responseObserver);
          break;
        case METHODID_VIEW_ENTRY_GPSSTATIC_IMAGE:
          serviceImpl.viewEntryGPSStaticImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_VIEW_EXIT_GPSSTATIC_IMAGE:
          serviceImpl.viewExitGPSStaticImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.OnDutiesServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.OnDutiesServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OnDutiesList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.OnDutiesServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.OnDutiesServiceFilterReq) request,
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
              com.scailo.sdk.OnDutiesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServiceUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT_UPDATE)))
        .addMethod(
          getSendForVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_SEND_FOR_VERIFICATION)))
        .addMethod(
          getVerifyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_VERIFY)))
        .addMethod(
          getApproveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE)))
        .addMethod(
          getSendForRevisionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_SEND_FOR_REVISION)))
        .addMethod(
          getRevisionUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServiceUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REVISION_UPDATE)))
        .addMethod(
          getHaltMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_HALT)))
        .addMethod(
          getDiscardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DISCARD)))
        .addMethod(
          getRestoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_RESTORE)))
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
          getCreateMagicLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
              com.scailo.sdk.MagicLink>(
                service, METHODID_CREATE_MAGIC_LINK)))
        .addMethod(
          getRecordImageEntryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServiceImageEntryRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_RECORD_IMAGE_ENTRY)))
        .addMethod(
          getRecordImageExitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServiceImageExitRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_RECORD_IMAGE_EXIT)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OnDuty>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OnDuty>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OnDuty>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OnDuty>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.OnDutiesList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.OnDutiesList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OnDutiesList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServicePaginationReq,
              com.scailo.sdk.OnDutiesServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewEntryImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_ENTRY_IMAGE)))
        .addMethod(
          getConfirmEntryImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_CONFIRM_ENTRY_IMAGE)))
        .addMethod(
          getViewExitImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_EXIT_IMAGE)))
        .addMethod(
          getConfirmExitImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_CONFIRM_EXIT_IMAGE)))
        .addMethod(
          getViewEntryGPSCoordinatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GPSCoordinatesResponse>(
                service, METHODID_VIEW_ENTRY_GPSCOORDINATES)))
        .addMethod(
          getViewExitGPSCoordinatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GPSCoordinatesResponse>(
                service, METHODID_VIEW_EXIT_GPSCOORDINATES)))
        .addMethod(
          getViewEntryGPSStaticImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_ENTRY_GPSSTATIC_IMAGE)))
        .addMethod(
          getViewExitGPSStaticImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_EXIT_GPSSTATIC_IMAGE)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServiceSearchAllReq,
              com.scailo.sdk.OnDutiesList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServiceFilterReq,
              com.scailo.sdk.OnDutiesList>(
                service, METHODID_FILTER)))
        .addMethod(
          getCountInStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.CountInSLCStatusRequest,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT_IN_STATUS)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OnDutiesServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class OnDutiesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OnDutiesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.OnDutiesScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OnDutiesService");
    }
  }

  private static final class OnDutiesServiceFileDescriptorSupplier
      extends OnDutiesServiceBaseDescriptorSupplier {
    OnDutiesServiceFileDescriptorSupplier() {}
  }

  private static final class OnDutiesServiceMethodDescriptorSupplier
      extends OnDutiesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OnDutiesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OnDutiesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OnDutiesServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getDraftMethod())
              .addMethod(getDraftUpdateMethod())
              .addMethod(getSendForVerificationMethod())
              .addMethod(getVerifyMethod())
              .addMethod(getApproveMethod())
              .addMethod(getSendForRevisionMethod())
              .addMethod(getRevisionUpdateMethod())
              .addMethod(getHaltMethod())
              .addMethod(getDiscardMethod())
              .addMethod(getRestoreMethod())
              .addMethod(getCompleteMethod())
              .addMethod(getRepeatMethod())
              .addMethod(getCommentAddMethod())
              .addMethod(getCreateMagicLinkMethod())
              .addMethod(getRecordImageEntryMethod())
              .addMethod(getRecordImageExitMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewAllForEntityUUIDMethod())
              .addMethod(getViewWithPaginationMethod())
              .addMethod(getViewEntryImageMethod())
              .addMethod(getConfirmEntryImageMethod())
              .addMethod(getViewExitImageMethod())
              .addMethod(getConfirmExitImageMethod())
              .addMethod(getViewEntryGPSCoordinatesMethod())
              .addMethod(getViewExitGPSCoordinatesMethod())
              .addMethod(getViewEntryGPSStaticImageMethod())
              .addMethod(getViewExitGPSStaticImageMethod())
              .addMethod(getSearchAllMethod())
              .addMethod(getFilterMethod())
              .addMethod(getCountInStatusMethod())
              .addMethod(getCountMethod())
              .addMethod(getDownloadAsCSVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
