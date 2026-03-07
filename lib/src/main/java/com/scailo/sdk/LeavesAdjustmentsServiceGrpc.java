package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each record
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: leaves_adjustments.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LeavesAdjustmentsServiceGrpc {

  private LeavesAdjustmentsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.LeavesAdjustmentsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = LeavesAdjustmentsServiceGrpc.getCreateMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getCreateMethod = LeavesAdjustmentsServiceGrpc.getCreateMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = LeavesAdjustmentsServiceGrpc.getDraftMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getDraftMethod = LeavesAdjustmentsServiceGrpc.getDraftMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = LeavesAdjustmentsServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getDraftUpdateMethod = LeavesAdjustmentsServiceGrpc.getDraftUpdateMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = LeavesAdjustmentsServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getSendForVerificationMethod = LeavesAdjustmentsServiceGrpc.getSendForVerificationMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = LeavesAdjustmentsServiceGrpc.getVerifyMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getVerifyMethod = LeavesAdjustmentsServiceGrpc.getVerifyMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = LeavesAdjustmentsServiceGrpc.getApproveMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getApproveMethod = LeavesAdjustmentsServiceGrpc.getApproveMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = LeavesAdjustmentsServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getSendForRevisionMethod = LeavesAdjustmentsServiceGrpc.getSendForRevisionMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = LeavesAdjustmentsServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getRevisionUpdateMethod = LeavesAdjustmentsServiceGrpc.getRevisionUpdateMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = LeavesAdjustmentsServiceGrpc.getHaltMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getHaltMethod = LeavesAdjustmentsServiceGrpc.getHaltMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = LeavesAdjustmentsServiceGrpc.getDiscardMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getDiscardMethod = LeavesAdjustmentsServiceGrpc.getDiscardMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = LeavesAdjustmentsServiceGrpc.getRestoreMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getRestoreMethod = LeavesAdjustmentsServiceGrpc.getRestoreMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = LeavesAdjustmentsServiceGrpc.getCompleteMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getCompleteMethod = LeavesAdjustmentsServiceGrpc.getCompleteMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = LeavesAdjustmentsServiceGrpc.getRepeatMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getRepeatMethod = LeavesAdjustmentsServiceGrpc.getRepeatMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getCommentAddMethod = LeavesAdjustmentsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getCommentAddMethod = LeavesAdjustmentsServiceGrpc.getCommentAddMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("CommentAdd"))
              .build();
        }
      }
    }
    return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddLeaveAdjustmentRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLeaveAdjustmentRecord",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddLeaveAdjustmentRecordMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest, com.scailo.sdk.IdentifierResponse> getAddLeaveAdjustmentRecordMethod;
    if ((getAddLeaveAdjustmentRecordMethod = LeavesAdjustmentsServiceGrpc.getAddLeaveAdjustmentRecordMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getAddLeaveAdjustmentRecordMethod = LeavesAdjustmentsServiceGrpc.getAddLeaveAdjustmentRecordMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getAddLeaveAdjustmentRecordMethod = getAddLeaveAdjustmentRecordMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLeaveAdjustmentRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("AddLeaveAdjustmentRecord"))
              .build();
        }
      }
    }
    return getAddLeaveAdjustmentRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyLeaveAdjustmentRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyLeaveAdjustmentRecord",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyLeaveAdjustmentRecordMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyLeaveAdjustmentRecordMethod;
    if ((getModifyLeaveAdjustmentRecordMethod = LeavesAdjustmentsServiceGrpc.getModifyLeaveAdjustmentRecordMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getModifyLeaveAdjustmentRecordMethod = LeavesAdjustmentsServiceGrpc.getModifyLeaveAdjustmentRecordMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getModifyLeaveAdjustmentRecordMethod = getModifyLeaveAdjustmentRecordMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyLeaveAdjustmentRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ModifyLeaveAdjustmentRecord"))
              .build();
        }
      }
    }
    return getModifyLeaveAdjustmentRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveLeaveAdjustmentRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveLeaveAdjustmentRecord",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveLeaveAdjustmentRecordMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveLeaveAdjustmentRecordMethod;
    if ((getApproveLeaveAdjustmentRecordMethod = LeavesAdjustmentsServiceGrpc.getApproveLeaveAdjustmentRecordMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getApproveLeaveAdjustmentRecordMethod = LeavesAdjustmentsServiceGrpc.getApproveLeaveAdjustmentRecordMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getApproveLeaveAdjustmentRecordMethod = getApproveLeaveAdjustmentRecordMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveLeaveAdjustmentRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ApproveLeaveAdjustmentRecord"))
              .build();
        }
      }
    }
    return getApproveLeaveAdjustmentRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteLeaveAdjustmentRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLeaveAdjustmentRecord",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteLeaveAdjustmentRecordMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteLeaveAdjustmentRecordMethod;
    if ((getDeleteLeaveAdjustmentRecordMethod = LeavesAdjustmentsServiceGrpc.getDeleteLeaveAdjustmentRecordMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getDeleteLeaveAdjustmentRecordMethod = LeavesAdjustmentsServiceGrpc.getDeleteLeaveAdjustmentRecordMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getDeleteLeaveAdjustmentRecordMethod = getDeleteLeaveAdjustmentRecordMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLeaveAdjustmentRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("DeleteLeaveAdjustmentRecord"))
              .build();
        }
      }
    }
    return getDeleteLeaveAdjustmentRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderLeaveAdjustmentRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderLeaveAdjustmentRecords",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderLeaveAdjustmentRecordsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderLeaveAdjustmentRecordsMethod;
    if ((getReorderLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getReorderLeaveAdjustmentRecordsMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getReorderLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getReorderLeaveAdjustmentRecordsMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getReorderLeaveAdjustmentRecordsMethod = getReorderLeaveAdjustmentRecordsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderLeaveAdjustmentRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ReorderLeaveAdjustmentRecords"))
              .build();
        }
      }
    }
    return getReorderLeaveAdjustmentRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.LeaveAdjustmentRecord> getViewLeaveAdjustmentRecordByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewLeaveAdjustmentRecordByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.LeaveAdjustmentRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.LeaveAdjustmentRecord> getViewLeaveAdjustmentRecordByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.LeaveAdjustmentRecord> getViewLeaveAdjustmentRecordByIDMethod;
    if ((getViewLeaveAdjustmentRecordByIDMethod = LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordByIDMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewLeaveAdjustmentRecordByIDMethod = LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordByIDMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordByIDMethod = getViewLeaveAdjustmentRecordByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.LeaveAdjustmentRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewLeaveAdjustmentRecordByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeaveAdjustmentRecord.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewLeaveAdjustmentRecordByID"))
              .build();
        }
      }
    }
    return getViewLeaveAdjustmentRecordByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.LeavesAdjustmentsRecordsList> getViewApprovedLeaveAdjustmentRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedLeaveAdjustmentRecords",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsRecordsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.LeavesAdjustmentsRecordsList> getViewApprovedLeaveAdjustmentRecordsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.LeavesAdjustmentsRecordsList> getViewApprovedLeaveAdjustmentRecordsMethod;
    if ((getViewApprovedLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getViewApprovedLeaveAdjustmentRecordsMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewApprovedLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getViewApprovedLeaveAdjustmentRecordsMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewApprovedLeaveAdjustmentRecordsMethod = getViewApprovedLeaveAdjustmentRecordsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.LeavesAdjustmentsRecordsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedLeaveAdjustmentRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsRecordsList.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewApprovedLeaveAdjustmentRecords"))
              .build();
        }
      }
    }
    return getViewApprovedLeaveAdjustmentRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.LeavesAdjustmentsRecordsList> getViewUnapprovedLeaveAdjustmentRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedLeaveAdjustmentRecords",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsRecordsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.LeavesAdjustmentsRecordsList> getViewUnapprovedLeaveAdjustmentRecordsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.LeavesAdjustmentsRecordsList> getViewUnapprovedLeaveAdjustmentRecordsMethod;
    if ((getViewUnapprovedLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getViewUnapprovedLeaveAdjustmentRecordsMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewUnapprovedLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getViewUnapprovedLeaveAdjustmentRecordsMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewUnapprovedLeaveAdjustmentRecordsMethod = getViewUnapprovedLeaveAdjustmentRecordsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.LeavesAdjustmentsRecordsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedLeaveAdjustmentRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsRecordsList.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewUnapprovedLeaveAdjustmentRecords"))
              .build();
        }
      }
    }
    return getViewUnapprovedLeaveAdjustmentRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest,
      com.scailo.sdk.LeavesAdjustmentsRecordsList> getViewLeaveAdjustmentRecordHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewLeaveAdjustmentRecordHistory",
      requestType = com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsRecordsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest,
      com.scailo.sdk.LeavesAdjustmentsRecordsList> getViewLeaveAdjustmentRecordHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest, com.scailo.sdk.LeavesAdjustmentsRecordsList> getViewLeaveAdjustmentRecordHistoryMethod;
    if ((getViewLeaveAdjustmentRecordHistoryMethod = LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordHistoryMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewLeaveAdjustmentRecordHistoryMethod = LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordHistoryMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordHistoryMethod = getViewLeaveAdjustmentRecordHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest, com.scailo.sdk.LeavesAdjustmentsRecordsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewLeaveAdjustmentRecordHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsRecordsList.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewLeaveAdjustmentRecordHistory"))
              .build();
        }
      }
    }
    return getViewLeaveAdjustmentRecordHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest,
      com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> getViewPaginatedApprovedLeaveAdjustmentRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedLeaveAdjustmentRecords",
      requestType = com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest,
      com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> getViewPaginatedApprovedLeaveAdjustmentRecordsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest, com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> getViewPaginatedApprovedLeaveAdjustmentRecordsMethod;
    if ((getViewPaginatedApprovedLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getViewPaginatedApprovedLeaveAdjustmentRecordsMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewPaginatedApprovedLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getViewPaginatedApprovedLeaveAdjustmentRecordsMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewPaginatedApprovedLeaveAdjustmentRecordsMethod = getViewPaginatedApprovedLeaveAdjustmentRecordsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest, com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedLeaveAdjustmentRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewPaginatedApprovedLeaveAdjustmentRecords"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedLeaveAdjustmentRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest,
      com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedLeaveAdjustmentRecords",
      requestType = com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest,
      com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest, com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod;
    if ((getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod = LeavesAdjustmentsServiceGrpc.getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod = getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest, com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedLeaveAdjustmentRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedLeaveAdjustmentRecords"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest,
      com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> getSearchRecordsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchRecordsWithPagination",
      requestType = com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest,
      com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> getSearchRecordsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest, com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> getSearchRecordsWithPaginationMethod;
    if ((getSearchRecordsWithPaginationMethod = LeavesAdjustmentsServiceGrpc.getSearchRecordsWithPaginationMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getSearchRecordsWithPaginationMethod = LeavesAdjustmentsServiceGrpc.getSearchRecordsWithPaginationMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getSearchRecordsWithPaginationMethod = getSearchRecordsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest, com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchRecordsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("SearchRecordsWithPagination"))
              .build();
        }
      }
    }
    return getSearchRecordsWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.LeaveAdjustment> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.LeaveAdjustment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.LeaveAdjustment> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.LeaveAdjustment> getViewByIDMethod;
    if ((getViewByIDMethod = LeavesAdjustmentsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewByIDMethod = LeavesAdjustmentsServiceGrpc.getViewByIDMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.LeaveAdjustment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeaveAdjustment.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.LeaveAdjustment> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.LeaveAdjustment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.LeaveAdjustment> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.LeaveAdjustment> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = LeavesAdjustmentsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewByUUIDMethod = LeavesAdjustmentsServiceGrpc.getViewByUUIDMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.LeaveAdjustment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeaveAdjustment.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.LeaveAdjustment> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.LeaveAdjustment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.LeaveAdjustment> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.LeaveAdjustment> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = LeavesAdjustmentsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = LeavesAdjustmentsServiceGrpc.getViewEssentialByIDMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.LeaveAdjustment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeaveAdjustment.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.LeaveAdjustment> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.LeaveAdjustment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.LeaveAdjustment> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.LeaveAdjustment> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = LeavesAdjustmentsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = LeavesAdjustmentsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.LeaveAdjustment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeaveAdjustment.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.LeavesAdjustmentsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.LeavesAdjustmentsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.LeavesAdjustmentsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = LeavesAdjustmentsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewFromIDsMethod = LeavesAdjustmentsServiceGrpc.getViewFromIDsMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.LeavesAdjustmentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsList.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.LeavesAdjustmentsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.LeavesAdjustmentsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.LeavesAdjustmentsList> getViewAllMethod;
    if ((getViewAllMethod = LeavesAdjustmentsServiceGrpc.getViewAllMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewAllMethod = LeavesAdjustmentsServiceGrpc.getViewAllMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.LeavesAdjustmentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsList.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.LeavesAdjustmentsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.LeavesAdjustmentsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.LeavesAdjustmentsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = LeavesAdjustmentsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = LeavesAdjustmentsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.LeavesAdjustmentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsList.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServicePaginationReq,
      com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.LeavesAdjustmentsServicePaginationReq.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServicePaginationReq,
      com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServicePaginationReq, com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = LeavesAdjustmentsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = LeavesAdjustmentsServiceGrpc.getViewWithPaginationMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServicePaginationReq, com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq,
      com.scailo.sdk.LeavesAdjustmentsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq,
      com.scailo.sdk.LeavesAdjustmentsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq, com.scailo.sdk.LeavesAdjustmentsList> getSearchAllMethod;
    if ((getSearchAllMethod = LeavesAdjustmentsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getSearchAllMethod = LeavesAdjustmentsServiceGrpc.getSearchAllMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq, com.scailo.sdk.LeavesAdjustmentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsList.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceFilterReq,
      com.scailo.sdk.LeavesAdjustmentsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceFilterReq.class,
      responseType = com.scailo.sdk.LeavesAdjustmentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceFilterReq,
      com.scailo.sdk.LeavesAdjustmentsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceFilterReq, com.scailo.sdk.LeavesAdjustmentsList> getFilterMethod;
    if ((getFilterMethod = LeavesAdjustmentsServiceGrpc.getFilterMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getFilterMethod = LeavesAdjustmentsServiceGrpc.getFilterMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceFilterReq, com.scailo.sdk.LeavesAdjustmentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsList.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = LeavesAdjustmentsServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getCountInStatusMethod = LeavesAdjustmentsServiceGrpc.getCountInStatusMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = LeavesAdjustmentsServiceGrpc.getCountMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getCountMethod = LeavesAdjustmentsServiceGrpc.getCountMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.LeavesAdjustmentsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LeavesAdjustmentsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = LeavesAdjustmentsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = LeavesAdjustmentsServiceGrpc.getDownloadAsCSVMethod) == null) {
          LeavesAdjustmentsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LeavesAdjustmentsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LeavesAdjustmentsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new LeavesAdjustmentsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeavesAdjustmentsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeavesAdjustmentsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeavesAdjustmentsServiceStub>() {
        @java.lang.Override
        public LeavesAdjustmentsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeavesAdjustmentsServiceStub(channel, callOptions);
        }
      };
    return LeavesAdjustmentsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeavesAdjustmentsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeavesAdjustmentsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeavesAdjustmentsServiceBlockingStub>() {
        @java.lang.Override
        public LeavesAdjustmentsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeavesAdjustmentsServiceBlockingStub(channel, callOptions);
        }
      };
    return LeavesAdjustmentsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeavesAdjustmentsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeavesAdjustmentsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeavesAdjustmentsServiceFutureStub>() {
        @java.lang.Override
        public LeavesAdjustmentsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeavesAdjustmentsServiceFutureStub(channel, callOptions);
        }
      };
    return LeavesAdjustmentsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest request,
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
     * Add a record to a record
     * </pre>
     */
    default void addLeaveAdjustmentRecord(com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLeaveAdjustmentRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify a record in a record
     * </pre>
     */
    default void modifyLeaveAdjustmentRecord(com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyLeaveAdjustmentRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a record in a record
     * </pre>
     */
    default void approveLeaveAdjustmentRecord(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveLeaveAdjustmentRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a record in a record
     * </pre>
     */
    default void deleteLeaveAdjustmentRecord(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLeaveAdjustmentRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder records
     * </pre>
     */
    default void reorderLeaveAdjustmentRecords(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderLeaveAdjustmentRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Leave Adjustment Record by ID
     * </pre>
     */
    default void viewLeaveAdjustmentRecordByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustmentRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewLeaveAdjustmentRecordByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved leave adjustment records for given record ID
     * </pre>
     */
    default void viewApprovedLeaveAdjustmentRecords(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsRecordsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedLeaveAdjustmentRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved leave adjustment records for given record ID
     * </pre>
     */
    default void viewUnapprovedLeaveAdjustmentRecords(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsRecordsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedLeaveAdjustmentRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the record
     * </pre>
     */
    default void viewLeaveAdjustmentRecordHistory(com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsRecordsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewLeaveAdjustmentRecordHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved leave adjustment records for given leave adjustment ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedLeaveAdjustmentRecords(com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedLeaveAdjustmentRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved leave adjustment records for given leave adjustment ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedLeaveAdjustmentRecords(com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through leave adjustment records with pagination
     * </pre>
     */
    default void searchRecordsWithPagination(com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchRecordsWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.LeavesAdjustmentsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.LeavesAdjustmentsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
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
    default void count(com.scailo.sdk.LeavesAdjustmentsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.LeavesAdjustmentsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LeavesAdjustmentsService.
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public static abstract class LeavesAdjustmentsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LeavesAdjustmentsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LeavesAdjustmentsService.
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public static final class LeavesAdjustmentsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LeavesAdjustmentsServiceStub> {
    private LeavesAdjustmentsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeavesAdjustmentsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeavesAdjustmentsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest request,
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
     * Add a record to a record
     * </pre>
     */
    public void addLeaveAdjustmentRecord(com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLeaveAdjustmentRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify a record in a record
     * </pre>
     */
    public void modifyLeaveAdjustmentRecord(com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyLeaveAdjustmentRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a record in a record
     * </pre>
     */
    public void approveLeaveAdjustmentRecord(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveLeaveAdjustmentRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a record in a record
     * </pre>
     */
    public void deleteLeaveAdjustmentRecord(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLeaveAdjustmentRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder records
     * </pre>
     */
    public void reorderLeaveAdjustmentRecords(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderLeaveAdjustmentRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Leave Adjustment Record by ID
     * </pre>
     */
    public void viewLeaveAdjustmentRecordByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustmentRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewLeaveAdjustmentRecordByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved leave adjustment records for given record ID
     * </pre>
     */
    public void viewApprovedLeaveAdjustmentRecords(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsRecordsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedLeaveAdjustmentRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved leave adjustment records for given record ID
     * </pre>
     */
    public void viewUnapprovedLeaveAdjustmentRecords(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsRecordsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedLeaveAdjustmentRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the record
     * </pre>
     */
    public void viewLeaveAdjustmentRecordHistory(com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsRecordsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewLeaveAdjustmentRecordHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved leave adjustment records for given leave adjustment ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedLeaveAdjustmentRecords(com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedLeaveAdjustmentRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved leave adjustment records for given leave adjustment ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedLeaveAdjustmentRecords(com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through leave adjustment records with pagination
     * </pre>
     */
    public void searchRecordsWithPagination(com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchRecordsWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.LeavesAdjustmentsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.LeavesAdjustmentsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList> responseObserver) {
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
    public void count(com.scailo.sdk.LeavesAdjustmentsServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.LeavesAdjustmentsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LeavesAdjustmentsService.
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public static final class LeavesAdjustmentsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LeavesAdjustmentsServiceBlockingStub> {
    private LeavesAdjustmentsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeavesAdjustmentsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeavesAdjustmentsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest request) {
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
     * Add a record to a record
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addLeaveAdjustmentRecord(com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLeaveAdjustmentRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify a record in a record
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyLeaveAdjustmentRecord(com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyLeaveAdjustmentRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a record in a record
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveLeaveAdjustmentRecord(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveLeaveAdjustmentRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a record in a record
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteLeaveAdjustmentRecord(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLeaveAdjustmentRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder records
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderLeaveAdjustmentRecords(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderLeaveAdjustmentRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Leave Adjustment Record by ID
     * </pre>
     */
    public com.scailo.sdk.LeaveAdjustmentRecord viewLeaveAdjustmentRecordByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewLeaveAdjustmentRecordByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved leave adjustment records for given record ID
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsRecordsList viewApprovedLeaveAdjustmentRecords(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedLeaveAdjustmentRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved leave adjustment records for given record ID
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsRecordsList viewUnapprovedLeaveAdjustmentRecords(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedLeaveAdjustmentRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the record
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsRecordsList viewLeaveAdjustmentRecordHistory(com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewLeaveAdjustmentRecordHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved leave adjustment records for given leave adjustment ID with pagination
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse viewPaginatedApprovedLeaveAdjustmentRecords(com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedLeaveAdjustmentRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved leave adjustment records for given leave adjustment ID with pagination
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse viewPaginatedUnapprovedLeaveAdjustmentRecords(com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through leave adjustment records with pagination
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse searchRecordsWithPagination(com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchRecordsWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.LeaveAdjustment viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.LeaveAdjustment viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.LeaveAdjustment viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.LeaveAdjustment viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse viewWithPagination(com.scailo.sdk.LeavesAdjustmentsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsList searchAll(com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.LeavesAdjustmentsList filter(com.scailo.sdk.LeavesAdjustmentsServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.LeavesAdjustmentsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.LeavesAdjustmentsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LeavesAdjustmentsService.
   * <pre>
   *Describes the common methods applicable on each record
   * </pre>
   */
  public static final class LeavesAdjustmentsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LeavesAdjustmentsServiceFutureStub> {
    private LeavesAdjustmentsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeavesAdjustmentsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeavesAdjustmentsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest request) {
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
        com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest request) {
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
     * Add a record to a record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addLeaveAdjustmentRecord(
        com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLeaveAdjustmentRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify a record in a record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyLeaveAdjustmentRecord(
        com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyLeaveAdjustmentRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a record in a record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveLeaveAdjustmentRecord(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveLeaveAdjustmentRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a record in a record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteLeaveAdjustmentRecord(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLeaveAdjustmentRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder records
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderLeaveAdjustmentRecords(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderLeaveAdjustmentRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Leave Adjustment Record by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeaveAdjustmentRecord> viewLeaveAdjustmentRecordByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewLeaveAdjustmentRecordByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved leave adjustment records for given record ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsRecordsList> viewApprovedLeaveAdjustmentRecords(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedLeaveAdjustmentRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved leave adjustment records for given record ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsRecordsList> viewUnapprovedLeaveAdjustmentRecords(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedLeaveAdjustmentRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsRecordsList> viewLeaveAdjustmentRecordHistory(
        com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewLeaveAdjustmentRecordHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved leave adjustment records for given leave adjustment ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> viewPaginatedApprovedLeaveAdjustmentRecords(
        com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedLeaveAdjustmentRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved leave adjustment records for given leave adjustment ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> viewPaginatedUnapprovedLeaveAdjustmentRecords(
        com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through leave adjustment records with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse> searchRecordsWithPagination(
        com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchRecordsWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeaveAdjustment> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeaveAdjustment> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeaveAdjustment> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeaveAdjustment> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.LeavesAdjustmentsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsList> searchAll(
        com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LeavesAdjustmentsList> filter(
        com.scailo.sdk.LeavesAdjustmentsServiceFilterReq request) {
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
        com.scailo.sdk.LeavesAdjustmentsServiceCountReq request) {
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
        com.scailo.sdk.LeavesAdjustmentsServiceFilterReq request) {
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
  private static final int METHODID_ADD_LEAVE_ADJUSTMENT_RECORD = 14;
  private static final int METHODID_MODIFY_LEAVE_ADJUSTMENT_RECORD = 15;
  private static final int METHODID_APPROVE_LEAVE_ADJUSTMENT_RECORD = 16;
  private static final int METHODID_DELETE_LEAVE_ADJUSTMENT_RECORD = 17;
  private static final int METHODID_REORDER_LEAVE_ADJUSTMENT_RECORDS = 18;
  private static final int METHODID_VIEW_LEAVE_ADJUSTMENT_RECORD_BY_ID = 19;
  private static final int METHODID_VIEW_APPROVED_LEAVE_ADJUSTMENT_RECORDS = 20;
  private static final int METHODID_VIEW_UNAPPROVED_LEAVE_ADJUSTMENT_RECORDS = 21;
  private static final int METHODID_VIEW_LEAVE_ADJUSTMENT_RECORD_HISTORY = 22;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_LEAVE_ADJUSTMENT_RECORDS = 23;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_LEAVE_ADJUSTMENT_RECORDS = 24;
  private static final int METHODID_SEARCH_RECORDS_WITH_PAGINATION = 25;
  private static final int METHODID_VIEW_BY_ID = 26;
  private static final int METHODID_VIEW_BY_UUID = 27;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 28;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 29;
  private static final int METHODID_VIEW_FROM_IDS = 30;
  private static final int METHODID_VIEW_ALL = 31;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 32;
  private static final int METHODID_VIEW_WITH_PAGINATION = 33;
  private static final int METHODID_SEARCH_ALL = 34;
  private static final int METHODID_FILTER = 35;
  private static final int METHODID_COUNT_IN_STATUS = 36;
  private static final int METHODID_COUNT = 37;
  private static final int METHODID_DOWNLOAD_AS_CSV = 38;

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
          serviceImpl.create((com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest) request,
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
        case METHODID_ADD_LEAVE_ADJUSTMENT_RECORD:
          serviceImpl.addLeaveAdjustmentRecord((com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_LEAVE_ADJUSTMENT_RECORD:
          serviceImpl.modifyLeaveAdjustmentRecord((com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_LEAVE_ADJUSTMENT_RECORD:
          serviceImpl.approveLeaveAdjustmentRecord((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_LEAVE_ADJUSTMENT_RECORD:
          serviceImpl.deleteLeaveAdjustmentRecord((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_LEAVE_ADJUSTMENT_RECORDS:
          serviceImpl.reorderLeaveAdjustmentRecords((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_LEAVE_ADJUSTMENT_RECORD_BY_ID:
          serviceImpl.viewLeaveAdjustmentRecordByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustmentRecord>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_LEAVE_ADJUSTMENT_RECORDS:
          serviceImpl.viewApprovedLeaveAdjustmentRecords((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsRecordsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_LEAVE_ADJUSTMENT_RECORDS:
          serviceImpl.viewUnapprovedLeaveAdjustmentRecords((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsRecordsList>) responseObserver);
          break;
        case METHODID_VIEW_LEAVE_ADJUSTMENT_RECORD_HISTORY:
          serviceImpl.viewLeaveAdjustmentRecordHistory((com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsRecordsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_LEAVE_ADJUSTMENT_RECORDS:
          serviceImpl.viewPaginatedApprovedLeaveAdjustmentRecords((com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_LEAVE_ADJUSTMENT_RECORDS:
          serviceImpl.viewPaginatedUnapprovedLeaveAdjustmentRecords((com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_RECORDS_WITH_PAGINATION:
          serviceImpl.searchRecordsWithPagination((com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeaveAdjustment>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.LeavesAdjustmentsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.LeavesAdjustmentsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LeavesAdjustmentsList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.LeavesAdjustmentsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.LeavesAdjustmentsServiceFilterReq) request,
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
              com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesAdjustmentsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest,
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
              com.scailo.sdk.LeavesAdjustmentsServiceUpdateRequest,
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
          getAddLeaveAdjustmentRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesAdjustmentsServiceRecordCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_LEAVE_ADJUSTMENT_RECORD)))
        .addMethod(
          getModifyLeaveAdjustmentRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesAdjustmentsServiceRecordUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_LEAVE_ADJUSTMENT_RECORD)))
        .addMethod(
          getApproveLeaveAdjustmentRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_LEAVE_ADJUSTMENT_RECORD)))
        .addMethod(
          getDeleteLeaveAdjustmentRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_LEAVE_ADJUSTMENT_RECORD)))
        .addMethod(
          getReorderLeaveAdjustmentRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_LEAVE_ADJUSTMENT_RECORDS)))
        .addMethod(
          getViewLeaveAdjustmentRecordByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.LeaveAdjustmentRecord>(
                service, METHODID_VIEW_LEAVE_ADJUSTMENT_RECORD_BY_ID)))
        .addMethod(
          getViewApprovedLeaveAdjustmentRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.LeavesAdjustmentsRecordsList>(
                service, METHODID_VIEW_APPROVED_LEAVE_ADJUSTMENT_RECORDS)))
        .addMethod(
          getViewUnapprovedLeaveAdjustmentRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.LeavesAdjustmentsRecordsList>(
                service, METHODID_VIEW_UNAPPROVED_LEAVE_ADJUSTMENT_RECORDS)))
        .addMethod(
          getViewLeaveAdjustmentRecordHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesAdjustmentsRecordsHistoryRequest,
              com.scailo.sdk.LeavesAdjustmentsRecordsList>(
                service, METHODID_VIEW_LEAVE_ADJUSTMENT_RECORD_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedLeaveAdjustmentRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest,
              com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_LEAVE_ADJUSTMENT_RECORDS)))
        .addMethod(
          getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest,
              com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_LEAVE_ADJUSTMENT_RECORDS)))
        .addMethod(
          getSearchRecordsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeaveAdjustmentRecordsSearchRequest,
              com.scailo.sdk.LeavesAdjustmentsServicePaginatedRecordsResponse>(
                service, METHODID_SEARCH_RECORDS_WITH_PAGINATION)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.LeaveAdjustment>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.LeaveAdjustment>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.LeaveAdjustment>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.LeaveAdjustment>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.LeavesAdjustmentsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.LeavesAdjustmentsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.LeavesAdjustmentsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesAdjustmentsServicePaginationReq,
              com.scailo.sdk.LeavesAdjustmentsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesAdjustmentsServiceSearchAllReq,
              com.scailo.sdk.LeavesAdjustmentsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesAdjustmentsServiceFilterReq,
              com.scailo.sdk.LeavesAdjustmentsList>(
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
              com.scailo.sdk.LeavesAdjustmentsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LeavesAdjustmentsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class LeavesAdjustmentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeavesAdjustmentsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.LeavesAdjustmentsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeavesAdjustmentsService");
    }
  }

  private static final class LeavesAdjustmentsServiceFileDescriptorSupplier
      extends LeavesAdjustmentsServiceBaseDescriptorSupplier {
    LeavesAdjustmentsServiceFileDescriptorSupplier() {}
  }

  private static final class LeavesAdjustmentsServiceMethodDescriptorSupplier
      extends LeavesAdjustmentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LeavesAdjustmentsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LeavesAdjustmentsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeavesAdjustmentsServiceFileDescriptorSupplier())
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
              .addMethod(getAddLeaveAdjustmentRecordMethod())
              .addMethod(getModifyLeaveAdjustmentRecordMethod())
              .addMethod(getApproveLeaveAdjustmentRecordMethod())
              .addMethod(getDeleteLeaveAdjustmentRecordMethod())
              .addMethod(getReorderLeaveAdjustmentRecordsMethod())
              .addMethod(getViewLeaveAdjustmentRecordByIDMethod())
              .addMethod(getViewApprovedLeaveAdjustmentRecordsMethod())
              .addMethod(getViewUnapprovedLeaveAdjustmentRecordsMethod())
              .addMethod(getViewLeaveAdjustmentRecordHistoryMethod())
              .addMethod(getViewPaginatedApprovedLeaveAdjustmentRecordsMethod())
              .addMethod(getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod())
              .addMethod(getSearchRecordsWithPaginationMethod())
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
