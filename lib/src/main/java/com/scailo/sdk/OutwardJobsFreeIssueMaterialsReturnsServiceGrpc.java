package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each outward job free issue material return
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: outward_jobs_free_issue_materials_returns.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OutwardJobsFreeIssueMaterialsReturnsServiceGrpc {

  private OutwardJobsFreeIssueMaterialsReturnsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.OutwardJobsFreeIssueMaterialsReturnsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getCreateMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getDraftMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getDraftUpdateMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftUpdateMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getSendForVerificationMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForVerificationMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getVerifyMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getVerifyMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getVerifyMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getApproveMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getSendForRevisionMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForRevisionMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getRevisionUpdateMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRevisionUpdateMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getHaltMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getHaltMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getHaltMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDiscardMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getDiscardMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDiscardMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRestoreMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getRestoreMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRestoreMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCompleteMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getCompleteMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCompleteMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRepeatMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getRepeatMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRepeatMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Repeat"))
              .build();
        }
      }
    }
    return getRepeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getReopenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reopen",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getReopenMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getReopenMethod;
    if ((getReopenMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReopenMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getReopenMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReopenMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Reopen"))
              .build();
        }
      }
    }
    return getReopenMethod;
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
    if ((getCommentAddMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getCommentAddMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCommentAddMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getSendEmailMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendEmailMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getSendEmailMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendEmailMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
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
    if ((getCreateMagicLinkMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMagicLinkMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("CreateMagicLink"))
              .build();
        }
      }
    }
    return getCreateMagicLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsCompletableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsCompletable",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsCompletableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getIsCompletableMethod;
    if ((getIsCompletableMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsCompletableMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getIsCompletableMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsCompletableMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsCompletableMethod = getIsCompletableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsCompletable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("IsCompletable"))
              .build();
        }
      }
    }
    return getIsCompletableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOutwardJobFreeIssueMaterialReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOutwardJobFreeIssueMaterialReturnItem",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOutwardJobFreeIssueMaterialReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddOutwardJobFreeIssueMaterialReturnItemMethod;
    if ((getAddOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getAddOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getAddOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getAddOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getAddOutwardJobFreeIssueMaterialReturnItemMethod = getAddOutwardJobFreeIssueMaterialReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOutwardJobFreeIssueMaterialReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("AddOutwardJobFreeIssueMaterialReturnItem"))
              .build();
        }
      }
    }
    return getAddOutwardJobFreeIssueMaterialReturnItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyOutwardJobFreeIssueMaterialReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyOutwardJobFreeIssueMaterialReturnItem",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyOutwardJobFreeIssueMaterialReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyOutwardJobFreeIssueMaterialReturnItemMethod;
    if ((getModifyOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getModifyOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getModifyOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getModifyOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getModifyOutwardJobFreeIssueMaterialReturnItemMethod = getModifyOutwardJobFreeIssueMaterialReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyOutwardJobFreeIssueMaterialReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ModifyOutwardJobFreeIssueMaterialReturnItem"))
              .build();
        }
      }
    }
    return getModifyOutwardJobFreeIssueMaterialReturnItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveOutwardJobFreeIssueMaterialReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveOutwardJobFreeIssueMaterialReturnItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveOutwardJobFreeIssueMaterialReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveOutwardJobFreeIssueMaterialReturnItemMethod;
    if ((getApproveOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getApproveOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveOutwardJobFreeIssueMaterialReturnItemMethod = getApproveOutwardJobFreeIssueMaterialReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveOutwardJobFreeIssueMaterialReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ApproveOutwardJobFreeIssueMaterialReturnItem"))
              .build();
        }
      }
    }
    return getApproveOutwardJobFreeIssueMaterialReturnItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobFreeIssueMaterialReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOutwardJobFreeIssueMaterialReturnItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobFreeIssueMaterialReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobFreeIssueMaterialReturnItemMethod;
    if ((getDeleteOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDeleteOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getDeleteOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDeleteOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDeleteOutwardJobFreeIssueMaterialReturnItemMethod = getDeleteOutwardJobFreeIssueMaterialReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOutwardJobFreeIssueMaterialReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("DeleteOutwardJobFreeIssueMaterialReturnItem"))
              .build();
        }
      }
    }
    return getDeleteOutwardJobFreeIssueMaterialReturnItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderOutwardJobFreeIssueMaterialReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderOutwardJobFreeIssueMaterialReturnItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderOutwardJobFreeIssueMaterialReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderOutwardJobFreeIssueMaterialReturnItemsMethod;
    if ((getReorderOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReorderOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getReorderOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReorderOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReorderOutwardJobFreeIssueMaterialReturnItemsMethod = getReorderOutwardJobFreeIssueMaterialReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderOutwardJobFreeIssueMaterialReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ReorderOutwardJobFreeIssueMaterialReturnItems"))
              .build();
        }
      }
    }
    return getReorderOutwardJobFreeIssueMaterialReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardJobFreeIssueMaterialReturnItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod;
    if ((getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod = getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardJobFreeIssueMaterialReturnItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewOutwardJobFreeIssueMaterialReturnItemByID"))
              .build();
        }
      }
    }
    return getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardJobFreeIssueMaterialReturnItemByInventoryHash",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod;
    if ((getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod = getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardJobFreeIssueMaterialReturnItemByInventoryHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewOutwardJobFreeIssueMaterialReturnItemByInventoryHash"))
              .build();
        }
      }
    }
    return getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedOutwardJobFreeIssueMaterialReturnItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod;
    if ((getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod = getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedOutwardJobFreeIssueMaterialReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewApprovedOutwardJobFreeIssueMaterialReturnItems"))
              .build();
        }
      }
    }
    return getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedOutwardJobFreeIssueMaterialReturnItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod;
    if ((getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod = getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedOutwardJobFreeIssueMaterialReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewUnapprovedOutwardJobFreeIssueMaterialReturnItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardJobFreeIssueMaterialReturnItemHistory",
      requestType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod;
    if ((getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod = getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardJobFreeIssueMaterialReturnItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewOutwardJobFreeIssueMaterialReturnItemHistory"))
              .build();
        }
      }
    }
    return getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems",
      requestType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod;
    if ((getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod = getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems",
      requestType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod;
    if ((getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod = getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchItemsWithPagination",
      requestType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;
    if ((getSearchItemsWithPaginationMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getSearchItemsWithPaginationMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchItemsWithPaginationMethod = getSearchItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("SearchItemsWithPagination"))
              .build();
        }
      }
    }
    return getSearchItemsWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadItemsAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadItemsAsCSV",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadItemsAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadItemsAsCSVMethod;
    if ((getDownloadItemsAsCSVMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getDownloadItemsAsCSVMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsAsCSVMethod = getDownloadItemsAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("DownloadItemsAsCSV"))
              .build();
        }
      }
    }
    return getDownloadItemsAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.StandardFile> getDownloadItemsTemplateAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadItemsTemplateAsCSV",
      requestType = com.scailo.sdk.Empty.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.StandardFile> getDownloadItemsTemplateAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile> getDownloadItemsTemplateAsCSVMethod;
    if ((getDownloadItemsTemplateAsCSVMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getDownloadItemsTemplateAsCSVMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod = getDownloadItemsTemplateAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsTemplateAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("DownloadItemsTemplateAsCSV"))
              .build();
        }
      }
    }
    return getDownloadItemsTemplateAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewByIDMethod;
    if ((getViewByIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewByIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByUUIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewByReferenceIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByReferenceID",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewByReferenceIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewByReferenceIDMethod;
    if ((getViewByReferenceIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByReferenceIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewByReferenceIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByReferenceIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByReferenceIDMethod = getViewByReferenceIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByReferenceID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewByReferenceID"))
              .build();
        }
      }
    }
    return getViewByReferenceIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturn.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewFromIDsMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewFromIDsMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters> getViewAncillaryParametersByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAncillaryParametersByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters> getViewAncillaryParametersByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters> getViewAncillaryParametersByUUIDMethod;
    if ((getViewAncillaryParametersByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewAncillaryParametersByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod = getViewAncillaryParametersByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAncillaryParametersByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewAncillaryParametersByUUID"))
              .build();
        }
      }
    }
    return getViewAncillaryParametersByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getViewAllMethod;
    if ((getViewAllMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewAllMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewWithPaginationMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.FamiliesList> getViewProspectiveFamiliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveFamilies",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.FamiliesList> getViewProspectiveFamiliesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList> getViewProspectiveFamiliesMethod;
    if ((getViewProspectiveFamiliesMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveFamiliesMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewProspectiveFamiliesMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveFamiliesMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveFamiliesMethod = getViewProspectiveFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewProspectiveFamilies"))
              .build();
        }
      }
    }
    return getViewProspectiveFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier,
      com.scailo.sdk.FamiliesList> getFilterProspectiveFamiliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FilterProspectiveFamilies",
      requestType = com.scailo.sdk.FilterFamiliesReqForIdentifier.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier,
      com.scailo.sdk.FamiliesList> getFilterProspectiveFamiliesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList> getFilterProspectiveFamiliesMethod;
    if ((getFilterProspectiveFamiliesMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterProspectiveFamiliesMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getFilterProspectiveFamiliesMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterProspectiveFamiliesMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterProspectiveFamiliesMethod = getFilterProspectiveFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterProspectiveFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterFamiliesReqForIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("FilterProspectiveFamilies"))
              .build();
        }
      }
    }
    return getFilterProspectiveFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest> getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveOutwardJobFreeIssueMaterialReturnItem",
      requestType = com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest> getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest> getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod;
    if ((getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod = getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveOutwardJobFreeIssueMaterialReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewProspectiveOutwardJobFreeIssueMaterialReturnItem"))
              .build();
        }
      }
    }
    return getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID,
      com.scailo.sdk.GenericInventoryList> getSearchReturnableInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchReturnableInventory",
      requestType = com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID,
      com.scailo.sdk.GenericInventoryList> getSearchReturnableInventoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID, com.scailo.sdk.GenericInventoryList> getSearchReturnableInventoryMethod;
    if ((getSearchReturnableInventoryMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchReturnableInventoryMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getSearchReturnableInventoryMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchReturnableInventoryMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchReturnableInventoryMethod = getSearchReturnableInventoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchReturnableInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("SearchReturnableInventory"))
              .build();
        }
      }
    }
    return getSearchReturnableInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID,
      com.scailo.sdk.GenericInventoryList> getFilterReturnableInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FilterReturnableInventory",
      requestType = com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID,
      com.scailo.sdk.GenericInventoryList> getFilterReturnableInventoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID, com.scailo.sdk.GenericInventoryList> getFilterReturnableInventoryMethod;
    if ((getFilterReturnableInventoryMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterReturnableInventoryMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getFilterReturnableInventoryMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterReturnableInventoryMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterReturnableInventoryMethod = getFilterReturnableInventoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterReturnableInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("FilterReturnableInventory"))
              .build();
        }
      }
    }
    return getFilterReturnableInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsDownloadableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsDownloadable",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsDownloadableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getIsDownloadableMethod;
    if ((getIsDownloadableMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsDownloadableMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getIsDownloadableMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsDownloadableMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsDownloadableMethod = getIsDownloadableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDownloadable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("IsDownloadable"))
              .build();
        }
      }
    }
    return getIsDownloadableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadByUUIDMethod;
    if ((getDownloadByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadByUUIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getDownloadByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadByUUIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadByUUIDMethod = getDownloadByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("DownloadByUUID"))
              .build();
        }
      }
    }
    return getDownloadByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadLabelByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadLabelByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadLabelByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadLabelByUUIDMethod;
    if ((getDownloadLabelByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadLabelByUUIDMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getDownloadLabelByUUIDMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadLabelByUUIDMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadLabelByUUIDMethod = getDownloadLabelByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadLabelByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("DownloadLabelByUUID"))
              .build();
        }
      }
    }
    return getDownloadLabelByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest,
      com.scailo.sdk.DualQuantitiesResponse> getViewAddedFamilyQuantityForSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAddedFamilyQuantityForSource",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest.class,
      responseType = com.scailo.sdk.DualQuantitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest,
      com.scailo.sdk.DualQuantitiesResponse> getViewAddedFamilyQuantityForSourceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest, com.scailo.sdk.DualQuantitiesResponse> getViewAddedFamilyQuantityForSourceMethod;
    if ((getViewAddedFamilyQuantityForSourceMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getViewAddedFamilyQuantityForSourceMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod = getViewAddedFamilyQuantityForSourceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest, com.scailo.sdk.DualQuantitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAddedFamilyQuantityForSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.DualQuantitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("ViewAddedFamilyQuantityForSource"))
              .build();
        }
      }
    }
    return getViewAddedFamilyQuantityForSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getSearchAllMethod;
    if ((getSearchAllMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getSearchAllMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchAllMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq.class,
      responseType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
      com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> getFilterMethod;
    if ((getFilterMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getFilterMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq, com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getCountInStatusMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountInStatusMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getCountMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadAsCSVMethod) == null) {
          OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OutwardJobsFreeIssueMaterialsReturnsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OutwardJobsFreeIssueMaterialsReturnsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OutwardJobsFreeIssueMaterialsReturnsServiceStub>() {
        @java.lang.Override
        public OutwardJobsFreeIssueMaterialsReturnsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OutwardJobsFreeIssueMaterialsReturnsServiceStub(channel, callOptions);
        }
      };
    return OutwardJobsFreeIssueMaterialsReturnsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub>() {
        @java.lang.Override
        public OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub(channel, callOptions);
        }
      };
    return OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub>() {
        @java.lang.Override
        public OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub(channel, callOptions);
        }
      };
    return OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each outward job free issue material return
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest request,
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
     * Reopen
     * </pre>
     */
    default void reopen(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReopenMethod(), responseObserver);
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
     * Create a magic link
     * </pre>
     */
    default void createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMagicLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if the Outward Job Free Issue Material Return can be marked as completed
     * </pre>
     */
    default void isCompletable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsCompletableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an item to a outward job free issue material return
     * </pre>
     */
    default void addOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOutwardJobFreeIssueMaterialReturnItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a outward job free issue material return
     * </pre>
     */
    default void modifyOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyOutwardJobFreeIssueMaterialReturnItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a outward job free issue material return
     * </pre>
     */
    default void approveOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveOutwardJobFreeIssueMaterialReturnItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a outward job free issue material return
     * </pre>
     */
    default void deleteOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOutwardJobFreeIssueMaterialReturnItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a outward job free issue material return
     * </pre>
     */
    default void reorderOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderOutwardJobFreeIssueMaterialReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Outward Job Free Issue Material Return Item by ID
     * </pre>
     */
    default void viewOutwardJobFreeIssueMaterialReturnItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Outward Job Free Issue Material Return Item by Inventory Hash
     * </pre>
     */
    default void viewOutwardJobFreeIssueMaterialReturnItemByInventoryHash(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved outward job free issue material return items for given outward job free issue material return ID
     * </pre>
     */
    default void viewApprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job free issue material return items for given outward job free issue material return ID
     * </pre>
     */
    default void viewUnapprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the outward job free issue material return item
     * </pre>
     */
    default void viewOutwardJobFreeIssueMaterialReturnItemHistory(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved outward job free issue material return items for given outward job free issue material return ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job free issue material return items for given outward job free issue material return ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through outward job free issue material return items with pagination
     * </pre>
     */
    default void searchItemsWithPagination(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchItemsWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file with the associated line items. The same file could then be used to upload line items.
     * </pre>
     */
    default void downloadItemsAsCSV(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadItemsAsCSVMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload items
     * </pre>
     */
    default void downloadItemsTemplateAsCSV(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadItemsTemplateAsCSVMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    default void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByReferenceIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    default void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAncillaryParametersByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective families for the given outward job free issue material return
     * </pre>
     */
    default void viewProspectiveFamilies(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveFamiliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Filter prospective families for the record represented by the given UUID identifier
     * </pre>
     */
    default void filterProspectiveFamilies(com.scailo.sdk.FilterFamiliesReqForIdentifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterProspectiveFamiliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective outward job free issue material return item info for the given family ID and outward job free issue material return ID
     * </pre>
     */
    default void viewProspectiveOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search for returnable inventory
     * </pre>
     */
    default void searchReturnableInventory(com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchReturnableInventoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Filter returnable inventory
     * </pre>
     */
    default void filterReturnableInventory(com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterReturnableInventoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if the record is downloadable (checks if the custom download function has been implemented)
     * </pre>
     */
    default void isDownloadable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsDownloadableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download outward job free issue material return with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    default void downloadByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download the label for the outward job free issue material return with the given IdentifierUUID
     * </pre>
     */
    default void downloadLabelByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadLabelByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View already added quantities
     * </pre>
     */
    default void viewAddedFamilyQuantityForSource(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.DualQuantitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAddedFamilyQuantityForSourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
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
    default void count(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OutwardJobsFreeIssueMaterialsReturnsService.
   * <pre>
   *Describes the common methods applicable on each outward job free issue material return
   * </pre>
   */
  public static abstract class OutwardJobsFreeIssueMaterialsReturnsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OutwardJobsFreeIssueMaterialsReturnsService.
   * <pre>
   *Describes the common methods applicable on each outward job free issue material return
   * </pre>
   */
  public static final class OutwardJobsFreeIssueMaterialsReturnsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OutwardJobsFreeIssueMaterialsReturnsServiceStub> {
    private OutwardJobsFreeIssueMaterialsReturnsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OutwardJobsFreeIssueMaterialsReturnsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OutwardJobsFreeIssueMaterialsReturnsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest request,
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
     * Reopen
     * </pre>
     */
    public void reopen(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReopenMethod(), getCallOptions()), request, responseObserver);
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
     * Checks if the Outward Job Free Issue Material Return can be marked as completed
     * </pre>
     */
    public void isCompletable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsCompletableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an item to a outward job free issue material return
     * </pre>
     */
    public void addOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a outward job free issue material return
     * </pre>
     */
    public void modifyOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a outward job free issue material return
     * </pre>
     */
    public void approveOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a outward job free issue material return
     * </pre>
     */
    public void deleteOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a outward job free issue material return
     * </pre>
     */
    public void reorderOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Outward Job Free Issue Material Return Item by ID
     * </pre>
     */
    public void viewOutwardJobFreeIssueMaterialReturnItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Outward Job Free Issue Material Return Item by Inventory Hash
     * </pre>
     */
    public void viewOutwardJobFreeIssueMaterialReturnItemByInventoryHash(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved outward job free issue material return items for given outward job free issue material return ID
     * </pre>
     */
    public void viewApprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job free issue material return items for given outward job free issue material return ID
     * </pre>
     */
    public void viewUnapprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the outward job free issue material return item
     * </pre>
     */
    public void viewOutwardJobFreeIssueMaterialReturnItemHistory(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved outward job free issue material return items for given outward job free issue material return ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job free issue material return items for given outward job free issue material return ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through outward job free issue material return items with pagination
     * </pre>
     */
    public void searchItemsWithPagination(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchItemsWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file with the associated line items. The same file could then be used to upload line items.
     * </pre>
     */
    public void downloadItemsAsCSV(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadItemsAsCSVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload items
     * </pre>
     */
    public void downloadItemsTemplateAsCSV(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadItemsTemplateAsCSVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective families for the given outward job free issue material return
     * </pre>
     */
    public void viewProspectiveFamilies(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveFamiliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Filter prospective families for the record represented by the given UUID identifier
     * </pre>
     */
    public void filterProspectiveFamilies(com.scailo.sdk.FilterFamiliesReqForIdentifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterProspectiveFamiliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective outward job free issue material return item info for the given family ID and outward job free issue material return ID
     * </pre>
     */
    public void viewProspectiveOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search for returnable inventory
     * </pre>
     */
    public void searchReturnableInventory(com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchReturnableInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Filter returnable inventory
     * </pre>
     */
    public void filterReturnableInventory(com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterReturnableInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if the record is downloadable (checks if the custom download function has been implemented)
     * </pre>
     */
    public void isDownloadable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsDownloadableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download outward job free issue material return with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public void downloadByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download the label for the outward job free issue material return with the given IdentifierUUID
     * </pre>
     */
    public void downloadLabelByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadLabelByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View already added quantities
     * </pre>
     */
    public void viewAddedFamilyQuantityForSource(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.DualQuantitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAddedFamilyQuantityForSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> responseObserver) {
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
    public void count(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OutwardJobsFreeIssueMaterialsReturnsService.
   * <pre>
   *Describes the common methods applicable on each outward job free issue material return
   * </pre>
   */
  public static final class OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub> {
    private OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OutwardJobsFreeIssueMaterialsReturnsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest request) {
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
     * Reopen
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reopen(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReopenMethod(), getCallOptions(), request);
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
     * Create a magic link
     * </pre>
     */
    public com.scailo.sdk.MagicLink createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMagicLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if the Outward Job Free Issue Material Return can be marked as completed
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isCompletable(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsCompletableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an item to a outward job free issue material return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an item in a outward job free issue material return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an item in a outward job free issue material return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an item in a outward job free issue material return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a outward job free issue material return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Outward Job Free Issue Material Return Item by ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem viewOutwardJobFreeIssueMaterialReturnItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Outward Job Free Issue Material Return Item by Inventory Hash
     * </pre>
     */
    public com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem viewOutwardJobFreeIssueMaterialReturnItemByInventoryHash(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved outward job free issue material return items for given outward job free issue material return ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList viewApprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved outward job free issue material return items for given outward job free issue material return ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList viewUnapprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the outward job free issue material return item
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList viewOutwardJobFreeIssueMaterialReturnItemHistory(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved outward job free issue material return items for given outward job free issue material return ID with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse viewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved outward job free issue material return items for given outward job free issue material return ID with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse viewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through outward job free issue material return items with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse searchItemsWithPagination(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchItemsWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file with the associated line items. The same file could then be used to upload line items.
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadItemsAsCSV(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadItemsAsCSVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload items
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadItemsTemplateAsCSV(com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadItemsTemplateAsCSVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobFreeIssueMaterialReturn viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobFreeIssueMaterialReturn viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.scailo.sdk.OutwardJobFreeIssueMaterialReturn viewByReferenceID(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByReferenceIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.OutwardJobFreeIssueMaterialReturn viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobFreeIssueMaterialReturn viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAncillaryParametersByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse viewWithPagination(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective families for the given outward job free issue material return
     * </pre>
     */
    public com.scailo.sdk.FamiliesList viewProspectiveFamilies(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveFamiliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Filter prospective families for the record represented by the given UUID identifier
     * </pre>
     */
    public com.scailo.sdk.FamiliesList filterProspectiveFamilies(com.scailo.sdk.FilterFamiliesReqForIdentifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterProspectiveFamiliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective outward job free issue material return item info for the given family ID and outward job free issue material return ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest viewProspectiveOutwardJobFreeIssueMaterialReturnItem(com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search for returnable inventory
     * </pre>
     */
    public com.scailo.sdk.GenericInventoryList searchReturnableInventory(com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchReturnableInventoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Filter returnable inventory
     * </pre>
     */
    public com.scailo.sdk.GenericInventoryList filterReturnableInventory(com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterReturnableInventoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if the record is downloadable (checks if the custom download function has been implemented)
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isDownloadable(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsDownloadableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download outward job free issue material return with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download the label for the outward job free issue material return with the given IdentifierUUID
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadLabelByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadLabelByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View already added quantities
     * </pre>
     */
    public com.scailo.sdk.DualQuantitiesResponse viewAddedFamilyQuantityForSource(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAddedFamilyQuantityForSourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList searchAll(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList filter(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OutwardJobsFreeIssueMaterialsReturnsService.
   * <pre>
   *Describes the common methods applicable on each outward job free issue material return
   * </pre>
   */
  public static final class OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub> {
    private OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OutwardJobsFreeIssueMaterialsReturnsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest request) {
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
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest request) {
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
     * Reopen
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reopen(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReopenMethod(), getCallOptions()), request);
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
     * Checks if the Outward Job Free Issue Material Return can be marked as completed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isCompletable(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsCompletableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an item to a outward job free issue material return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addOutwardJobFreeIssueMaterialReturnItem(
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an item in a outward job free issue material return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyOutwardJobFreeIssueMaterialReturnItem(
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an item in a outward job free issue material return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveOutwardJobFreeIssueMaterialReturnItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an item in a outward job free issue material return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteOutwardJobFreeIssueMaterialReturnItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a outward job free issue material return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderOutwardJobFreeIssueMaterialReturnItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Outward Job Free Issue Material Return Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> viewOutwardJobFreeIssueMaterialReturnItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Outward Job Free Issue Material Return Item by Inventory Hash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem> viewOutwardJobFreeIssueMaterialReturnItemByInventoryHash(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved outward job free issue material return items for given outward job free issue material return ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> viewApprovedOutwardJobFreeIssueMaterialReturnItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved outward job free issue material return items for given outward job free issue material return ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> viewUnapprovedOutwardJobFreeIssueMaterialReturnItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the outward job free issue material return item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList> viewOutwardJobFreeIssueMaterialReturnItemHistory(
        com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved outward job free issue material return items for given outward job free issue material return ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> viewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems(
        com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved outward job free issue material return items for given outward job free issue material return ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> viewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems(
        com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through outward job free issue material return items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse> searchItemsWithPagination(
        com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchItemsWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file with the associated line items. The same file could then be used to upload line items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadItemsAsCSV(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadItemsAsCSVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload items
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadItemsTemplateAsCSV(
        com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadItemsTemplateAsCSVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> viewByReferenceID(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters> viewAncillaryParametersByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective families for the given outward job free issue material return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> viewProspectiveFamilies(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveFamiliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Filter prospective families for the record represented by the given UUID identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> filterProspectiveFamilies(
        com.scailo.sdk.FilterFamiliesReqForIdentifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterProspectiveFamiliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective outward job free issue material return item info for the given family ID and outward job free issue material return ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest> viewProspectiveOutwardJobFreeIssueMaterialReturnItem(
        com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search for returnable inventory
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> searchReturnableInventory(
        com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchReturnableInventoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Filter returnable inventory
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> filterReturnableInventory(
        com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterReturnableInventoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if the record is downloadable (checks if the custom download function has been implemented)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isDownloadable(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsDownloadableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download outward job free issue material return with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download the label for the outward job free issue material return with the given IdentifierUUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadLabelByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadLabelByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View already added quantities
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.DualQuantitiesResponse> viewAddedFamilyQuantityForSource(
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAddedFamilyQuantityForSourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> searchAll(
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList> filter(
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq request) {
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
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq request) {
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
        com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq request) {
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
  private static final int METHODID_REOPEN = 13;
  private static final int METHODID_COMMENT_ADD = 14;
  private static final int METHODID_SEND_EMAIL = 15;
  private static final int METHODID_CREATE_MAGIC_LINK = 16;
  private static final int METHODID_IS_COMPLETABLE = 17;
  private static final int METHODID_ADD_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM = 18;
  private static final int METHODID_MODIFY_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM = 19;
  private static final int METHODID_APPROVE_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM = 20;
  private static final int METHODID_DELETE_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM = 21;
  private static final int METHODID_REORDER_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS = 22;
  private static final int METHODID_VIEW_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM_BY_ID = 23;
  private static final int METHODID_VIEW_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM_BY_INVENTORY_HASH = 24;
  private static final int METHODID_VIEW_APPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS = 25;
  private static final int METHODID_VIEW_UNAPPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS = 26;
  private static final int METHODID_VIEW_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM_HISTORY = 27;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS = 28;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS = 29;
  private static final int METHODID_SEARCH_ITEMS_WITH_PAGINATION = 30;
  private static final int METHODID_DOWNLOAD_ITEMS_AS_CSV = 31;
  private static final int METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV = 32;
  private static final int METHODID_VIEW_BY_ID = 33;
  private static final int METHODID_VIEW_BY_UUID = 34;
  private static final int METHODID_VIEW_BY_REFERENCE_ID = 35;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 36;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 37;
  private static final int METHODID_VIEW_FROM_IDS = 38;
  private static final int METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID = 39;
  private static final int METHODID_VIEW_ALL = 40;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 41;
  private static final int METHODID_VIEW_WITH_PAGINATION = 42;
  private static final int METHODID_VIEW_PROSPECTIVE_FAMILIES = 43;
  private static final int METHODID_FILTER_PROSPECTIVE_FAMILIES = 44;
  private static final int METHODID_VIEW_PROSPECTIVE_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM = 45;
  private static final int METHODID_SEARCH_RETURNABLE_INVENTORY = 46;
  private static final int METHODID_FILTER_RETURNABLE_INVENTORY = 47;
  private static final int METHODID_IS_DOWNLOADABLE = 48;
  private static final int METHODID_DOWNLOAD_BY_UUID = 49;
  private static final int METHODID_DOWNLOAD_LABEL_BY_UUID = 50;
  private static final int METHODID_VIEW_ADDED_FAMILY_QUANTITY_FOR_SOURCE = 51;
  private static final int METHODID_SEARCH_ALL = 52;
  private static final int METHODID_FILTER = 53;
  private static final int METHODID_COUNT_IN_STATUS = 54;
  private static final int METHODID_COUNT = 55;
  private static final int METHODID_DOWNLOAD_AS_CSV = 56;

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
          serviceImpl.create((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest) request,
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
        case METHODID_REOPEN:
          serviceImpl.reopen((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
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
        case METHODID_CREATE_MAGIC_LINK:
          serviceImpl.createMagicLink((com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink>) responseObserver);
          break;
        case METHODID_IS_COMPLETABLE:
          serviceImpl.isCompletable((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_ADD_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM:
          serviceImpl.addOutwardJobFreeIssueMaterialReturnItem((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM:
          serviceImpl.modifyOutwardJobFreeIssueMaterialReturnItem((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM:
          serviceImpl.approveOutwardJobFreeIssueMaterialReturnItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM:
          serviceImpl.deleteOutwardJobFreeIssueMaterialReturnItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS:
          serviceImpl.reorderOutwardJobFreeIssueMaterialReturnItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM_BY_ID:
          serviceImpl.viewOutwardJobFreeIssueMaterialReturnItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM_BY_INVENTORY_HASH:
          serviceImpl.viewOutwardJobFreeIssueMaterialReturnItemByInventoryHash((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS:
          serviceImpl.viewApprovedOutwardJobFreeIssueMaterialReturnItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS:
          serviceImpl.viewUnapprovedOutwardJobFreeIssueMaterialReturnItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM_HISTORY:
          serviceImpl.viewOutwardJobFreeIssueMaterialReturnItemHistory((com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS:
          serviceImpl.viewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems((com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS:
          serviceImpl.viewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems((com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ITEMS_WITH_PAGINATION:
          serviceImpl.searchItemsWithPagination((com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_AS_CSV:
          serviceImpl.downloadItemsAsCSV((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV:
          serviceImpl.downloadItemsTemplateAsCSV((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>) responseObserver);
          break;
        case METHODID_VIEW_BY_REFERENCE_ID:
          serviceImpl.viewByReferenceID((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>) responseObserver);
          break;
        case METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID:
          serviceImpl.viewAncillaryParametersByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_FAMILIES:
          serviceImpl.viewProspectiveFamilies((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER_PROSPECTIVE_FAMILIES:
          serviceImpl.filterProspectiveFamilies((com.scailo.sdk.FilterFamiliesReqForIdentifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM:
          serviceImpl.viewProspectiveOutwardJobFreeIssueMaterialReturnItem((com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest>) responseObserver);
          break;
        case METHODID_SEARCH_RETURNABLE_INVENTORY:
          serviceImpl.searchReturnableInventory((com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_FILTER_RETURNABLE_INVENTORY:
          serviceImpl.filterReturnableInventory((com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_IS_DOWNLOADABLE:
          serviceImpl.isDownloadable((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_BY_UUID:
          serviceImpl.downloadByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_LABEL_BY_UUID:
          serviceImpl.downloadLabelByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_VIEW_ADDED_FAMILY_QUANTITY_FOR_SOURCE:
          serviceImpl.viewAddedFamilyQuantityForSource((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.DualQuantitiesResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq) request,
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
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
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
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
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
          getReopenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REOPEN)))
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
          getCreateMagicLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
              com.scailo.sdk.MagicLink>(
                service, METHODID_CREATE_MAGIC_LINK)))
        .addMethod(
          getIsCompletableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_IS_COMPLETABLE)))
        .addMethod(
          getAddOutwardJobFreeIssueMaterialReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM)))
        .addMethod(
          getModifyOutwardJobFreeIssueMaterialReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM)))
        .addMethod(
          getApproveOutwardJobFreeIssueMaterialReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM)))
        .addMethod(
          getDeleteOutwardJobFreeIssueMaterialReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM)))
        .addMethod(
          getReorderOutwardJobFreeIssueMaterialReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS)))
        .addMethod(
          getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem>(
                service, METHODID_VIEW_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM_BY_ID)))
        .addMethod(
          getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItem>(
                service, METHODID_VIEW_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM_BY_INVENTORY_HASH)))
        .addMethod(
          getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList>(
                service, METHODID_VIEW_APPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS)))
        .addMethod(
          getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList>(
                service, METHODID_VIEW_UNAPPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS)))
        .addMethod(
          getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemHistoryRequest,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsItemsList>(
                service, METHODID_VIEW_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEMS)))
        .addMethod(
          getSearchItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>(
                service, METHODID_SEARCH_ITEMS_WITH_PAGINATION)))
        .addMethod(
          getDownloadItemsAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_ITEMS_AS_CSV)))
        .addMethod(
          getDownloadItemsTemplateAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Empty,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewByReferenceIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>(
                service, METHODID_VIEW_BY_REFERENCE_ID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturn>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAncillaryParametersByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturnAncillaryParameters>(
                service, METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewProspectiveFamiliesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_VIEW_PROSPECTIVE_FAMILIES)))
        .addMethod(
          getFilterProspectiveFamiliesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FilterFamiliesReqForIdentifier,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_FILTER_PROSPECTIVE_FAMILIES)))
        .addMethod(
          getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_OUTWARD_JOB_FREE_ISSUE_MATERIAL_RETURN_ITEM)))
        .addMethod(
          getSearchReturnableInventoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_SEARCH_RETURNABLE_INVENTORY)))
        .addMethod(
          getFilterReturnableInventoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_FILTER_RETURNABLE_INVENTORY)))
        .addMethod(
          getIsDownloadableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_IS_DOWNLOADABLE)))
        .addMethod(
          getDownloadByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_BY_UUID)))
        .addMethod(
          getDownloadLabelByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_LABEL_BY_UUID)))
        .addMethod(
          getViewAddedFamilyQuantityForSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest,
              com.scailo.sdk.DualQuantitiesResponse>(
                service, METHODID_VIEW_ADDED_FAMILY_QUANTITY_FOR_SOURCE)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsList>(
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
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class OutwardJobsFreeIssueMaterialsReturnsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OutwardJobsFreeIssueMaterialsReturnsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OutwardJobsFreeIssueMaterialsReturnsService");
    }
  }

  private static final class OutwardJobsFreeIssueMaterialsReturnsServiceFileDescriptorSupplier
      extends OutwardJobsFreeIssueMaterialsReturnsServiceBaseDescriptorSupplier {
    OutwardJobsFreeIssueMaterialsReturnsServiceFileDescriptorSupplier() {}
  }

  private static final class OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier
      extends OutwardJobsFreeIssueMaterialsReturnsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OutwardJobsFreeIssueMaterialsReturnsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OutwardJobsFreeIssueMaterialsReturnsServiceFileDescriptorSupplier())
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
              .addMethod(getReopenMethod())
              .addMethod(getCommentAddMethod())
              .addMethod(getSendEmailMethod())
              .addMethod(getCreateMagicLinkMethod())
              .addMethod(getIsCompletableMethod())
              .addMethod(getAddOutwardJobFreeIssueMaterialReturnItemMethod())
              .addMethod(getModifyOutwardJobFreeIssueMaterialReturnItemMethod())
              .addMethod(getApproveOutwardJobFreeIssueMaterialReturnItemMethod())
              .addMethod(getDeleteOutwardJobFreeIssueMaterialReturnItemMethod())
              .addMethod(getReorderOutwardJobFreeIssueMaterialReturnItemsMethod())
              .addMethod(getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod())
              .addMethod(getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod())
              .addMethod(getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod())
              .addMethod(getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod())
              .addMethod(getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod())
              .addMethod(getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod())
              .addMethod(getSearchItemsWithPaginationMethod())
              .addMethod(getDownloadItemsAsCSVMethod())
              .addMethod(getDownloadItemsTemplateAsCSVMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewByReferenceIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewAncillaryParametersByUUIDMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewAllForEntityUUIDMethod())
              .addMethod(getViewWithPaginationMethod())
              .addMethod(getViewProspectiveFamiliesMethod())
              .addMethod(getFilterProspectiveFamiliesMethod())
              .addMethod(getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod())
              .addMethod(getSearchReturnableInventoryMethod())
              .addMethod(getFilterReturnableInventoryMethod())
              .addMethod(getIsDownloadableMethod())
              .addMethod(getDownloadByUUIDMethod())
              .addMethod(getDownloadLabelByUUIDMethod())
              .addMethod(getViewAddedFamilyQuantityForSourceMethod())
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
