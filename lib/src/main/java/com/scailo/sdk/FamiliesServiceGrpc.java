package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each family
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: families.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FamiliesServiceGrpc {

  private FamiliesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.FamiliesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.FamiliesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = FamiliesServiceGrpc.getCreateMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getCreateMethod = FamiliesServiceGrpc.getCreateMethod) == null) {
          FamiliesServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.FamiliesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = FamiliesServiceGrpc.getDraftMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getDraftMethod = FamiliesServiceGrpc.getDraftMethod) == null) {
          FamiliesServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.FamiliesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = FamiliesServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getDraftUpdateMethod = FamiliesServiceGrpc.getDraftUpdateMethod) == null) {
          FamiliesServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = FamiliesServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSendForVerificationMethod = FamiliesServiceGrpc.getSendForVerificationMethod) == null) {
          FamiliesServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = FamiliesServiceGrpc.getVerifyMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getVerifyMethod = FamiliesServiceGrpc.getVerifyMethod) == null) {
          FamiliesServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = FamiliesServiceGrpc.getApproveMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getApproveMethod = FamiliesServiceGrpc.getApproveMethod) == null) {
          FamiliesServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = FamiliesServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSendForRevisionMethod = FamiliesServiceGrpc.getSendForRevisionMethod) == null) {
          FamiliesServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.FamiliesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = FamiliesServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getRevisionUpdateMethod = FamiliesServiceGrpc.getRevisionUpdateMethod) == null) {
          FamiliesServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = FamiliesServiceGrpc.getHaltMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getHaltMethod = FamiliesServiceGrpc.getHaltMethod) == null) {
          FamiliesServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = FamiliesServiceGrpc.getDiscardMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getDiscardMethod = FamiliesServiceGrpc.getDiscardMethod) == null) {
          FamiliesServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = FamiliesServiceGrpc.getRestoreMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getRestoreMethod = FamiliesServiceGrpc.getRestoreMethod) == null) {
          FamiliesServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Restore"))
              .build();
        }
      }
    }
    return getRestoreMethod;
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
    if ((getCommentAddMethod = FamiliesServiceGrpc.getCommentAddMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getCommentAddMethod = FamiliesServiceGrpc.getCommentAddMethod) == null) {
          FamiliesServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("CommentAdd"))
              .build();
        }
      }
    }
    return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getAmendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Amend",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getAmendMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getAmendMethod;
    if ((getAmendMethod = FamiliesServiceGrpc.getAmendMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getAmendMethod = FamiliesServiceGrpc.getAmendMethod) == null) {
          FamiliesServiceGrpc.getAmendMethod = getAmendMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Amend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Amend"))
              .build();
        }
      }
    }
    return getAmendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdatePriceRequest,
      com.scailo.sdk.IdentifierResponse> getUpdatePriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePrice",
      requestType = com.scailo.sdk.FamiliesServiceUpdatePriceRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdatePriceRequest,
      com.scailo.sdk.IdentifierResponse> getUpdatePriceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdatePriceRequest, com.scailo.sdk.IdentifierResponse> getUpdatePriceMethod;
    if ((getUpdatePriceMethod = FamiliesServiceGrpc.getUpdatePriceMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getUpdatePriceMethod = FamiliesServiceGrpc.getUpdatePriceMethod) == null) {
          FamiliesServiceGrpc.getUpdatePriceMethod = getUpdatePriceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceUpdatePriceRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceUpdatePriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("UpdatePrice"))
              .build();
        }
      }
    }
    return getUpdatePriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.IdentifierUUIDsList> getUploadPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadPrices",
      requestType = com.scailo.sdk.StandardFile.class,
      responseType = com.scailo.sdk.IdentifierUUIDsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.IdentifierUUIDsList> getUploadPricesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList> getUploadPricesMethod;
    if ((getUploadPricesMethod = FamiliesServiceGrpc.getUploadPricesMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getUploadPricesMethod = FamiliesServiceGrpc.getUploadPricesMethod) == null) {
          FamiliesServiceGrpc.getUploadPricesMethod = getUploadPricesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDsList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("UploadPrices"))
              .build();
        }
      }
    }
    return getUploadPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest,
      com.scailo.sdk.IdentifierResponse> getUpdateMinStockToMaintainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMinStockToMaintain",
      requestType = com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest,
      com.scailo.sdk.IdentifierResponse> getUpdateMinStockToMaintainMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest, com.scailo.sdk.IdentifierResponse> getUpdateMinStockToMaintainMethod;
    if ((getUpdateMinStockToMaintainMethod = FamiliesServiceGrpc.getUpdateMinStockToMaintainMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getUpdateMinStockToMaintainMethod = FamiliesServiceGrpc.getUpdateMinStockToMaintainMethod) == null) {
          FamiliesServiceGrpc.getUpdateMinStockToMaintainMethod = getUpdateMinStockToMaintainMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMinStockToMaintain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("UpdateMinStockToMaintain"))
              .build();
        }
      }
    }
    return getUpdateMinStockToMaintainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.IdentifierUUIDsList> getUploadMinStockToMaintainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadMinStockToMaintain",
      requestType = com.scailo.sdk.StandardFile.class,
      responseType = com.scailo.sdk.IdentifierUUIDsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.IdentifierUUIDsList> getUploadMinStockToMaintainMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList> getUploadMinStockToMaintainMethod;
    if ((getUploadMinStockToMaintainMethod = FamiliesServiceGrpc.getUploadMinStockToMaintainMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getUploadMinStockToMaintainMethod = FamiliesServiceGrpc.getUploadMinStockToMaintainMethod) == null) {
          FamiliesServiceGrpc.getUploadMinStockToMaintainMethod = getUploadMinStockToMaintainMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadMinStockToMaintain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDsList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("UploadMinStockToMaintain"))
              .build();
        }
      }
    }
    return getUploadMinStockToMaintainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.FamiliesServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = FamiliesServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = FamiliesServiceGrpc.getDownloadAsCSVMethod) == null) {
          FamiliesServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("DownloadAsCSV"))
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
    if ((getImportFromCSVMethod = FamiliesServiceGrpc.getImportFromCSVMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getImportFromCSVMethod = FamiliesServiceGrpc.getImportFromCSVMethod) == null) {
          FamiliesServiceGrpc.getImportFromCSVMethod = getImportFromCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportFromCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDsList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ImportFromCSV"))
              .build();
        }
      }
    }
    return getImportFromCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceStorageCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStorage",
      requestType = com.scailo.sdk.FamiliesServiceStorageCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceStorageCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddStorageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceStorageCreateRequest, com.scailo.sdk.IdentifierResponse> getAddStorageMethod;
    if ((getAddStorageMethod = FamiliesServiceGrpc.getAddStorageMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getAddStorageMethod = FamiliesServiceGrpc.getAddStorageMethod) == null) {
          FamiliesServiceGrpc.getAddStorageMethod = getAddStorageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceStorageCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceStorageCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("AddStorage"))
              .build();
        }
      }
    }
    return getAddStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveStorage",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveStorageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveStorageMethod;
    if ((getApproveStorageMethod = FamiliesServiceGrpc.getApproveStorageMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getApproveStorageMethod = FamiliesServiceGrpc.getApproveStorageMethod) == null) {
          FamiliesServiceGrpc.getApproveStorageMethod = getApproveStorageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ApproveStorage"))
              .build();
        }
      }
    }
    return getApproveStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStorage",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteStorageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteStorageMethod;
    if ((getDeleteStorageMethod = FamiliesServiceGrpc.getDeleteStorageMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getDeleteStorageMethod = FamiliesServiceGrpc.getDeleteStorageMethod) == null) {
          FamiliesServiceGrpc.getDeleteStorageMethod = getDeleteStorageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("DeleteStorage"))
              .build();
        }
      }
    }
    return getDeleteStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyStorage> getViewStorageByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewStorageByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyStorage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyStorage> getViewStorageByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyStorage> getViewStorageByIDMethod;
    if ((getViewStorageByIDMethod = FamiliesServiceGrpc.getViewStorageByIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewStorageByIDMethod = FamiliesServiceGrpc.getViewStorageByIDMethod) == null) {
          FamiliesServiceGrpc.getViewStorageByIDMethod = getViewStorageByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyStorage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewStorageByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyStorage.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewStorageByID"))
              .build();
        }
      }
    }
    return getViewStorageByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyStoragesList> getViewStoragesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewStorages",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyStoragesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyStoragesList> getViewStoragesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyStoragesList> getViewStoragesMethod;
    if ((getViewStoragesMethod = FamiliesServiceGrpc.getViewStoragesMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewStoragesMethod = FamiliesServiceGrpc.getViewStoragesMethod) == null) {
          FamiliesServiceGrpc.getViewStoragesMethod = getViewStoragesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyStoragesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewStorages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyStoragesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewStorages"))
              .build();
        }
      }
    }
    return getViewStoragesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceLabelCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLabel",
      requestType = com.scailo.sdk.FamiliesServiceLabelCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceLabelCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddLabelMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceLabelCreateRequest, com.scailo.sdk.IdentifierResponse> getAddLabelMethod;
    if ((getAddLabelMethod = FamiliesServiceGrpc.getAddLabelMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getAddLabelMethod = FamiliesServiceGrpc.getAddLabelMethod) == null) {
          FamiliesServiceGrpc.getAddLabelMethod = getAddLabelMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceLabelCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceLabelCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("AddLabel"))
              .build();
        }
      }
    }
    return getAddLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveLabel",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveLabelMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveLabelMethod;
    if ((getApproveLabelMethod = FamiliesServiceGrpc.getApproveLabelMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getApproveLabelMethod = FamiliesServiceGrpc.getApproveLabelMethod) == null) {
          FamiliesServiceGrpc.getApproveLabelMethod = getApproveLabelMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ApproveLabel"))
              .build();
        }
      }
    }
    return getApproveLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLabel",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteLabelMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteLabelMethod;
    if ((getDeleteLabelMethod = FamiliesServiceGrpc.getDeleteLabelMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getDeleteLabelMethod = FamiliesServiceGrpc.getDeleteLabelMethod) == null) {
          FamiliesServiceGrpc.getDeleteLabelMethod = getDeleteLabelMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("DeleteLabel"))
              .build();
        }
      }
    }
    return getDeleteLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyLabel> getViewLabelByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewLabelByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyLabel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyLabel> getViewLabelByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyLabel> getViewLabelByIDMethod;
    if ((getViewLabelByIDMethod = FamiliesServiceGrpc.getViewLabelByIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewLabelByIDMethod = FamiliesServiceGrpc.getViewLabelByIDMethod) == null) {
          FamiliesServiceGrpc.getViewLabelByIDMethod = getViewLabelByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyLabel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewLabelByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyLabel.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewLabelByID"))
              .build();
        }
      }
    }
    return getViewLabelByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyLabelsList> getViewLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewLabels",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyLabelsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyLabelsList> getViewLabelsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyLabelsList> getViewLabelsMethod;
    if ((getViewLabelsMethod = FamiliesServiceGrpc.getViewLabelsMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewLabelsMethod = FamiliesServiceGrpc.getViewLabelsMethod) == null) {
          FamiliesServiceGrpc.getViewLabelsMethod = getViewLabelsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyLabelsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyLabelsList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewLabels"))
              .build();
        }
      }
    }
    return getViewLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.FamilyLabelsList> getViewLabelsForFamilyIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewLabelsForFamilyIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.FamilyLabelsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.FamilyLabelsList> getViewLabelsForFamilyIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.FamilyLabelsList> getViewLabelsForFamilyIDsMethod;
    if ((getViewLabelsForFamilyIDsMethod = FamiliesServiceGrpc.getViewLabelsForFamilyIDsMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewLabelsForFamilyIDsMethod = FamiliesServiceGrpc.getViewLabelsForFamilyIDsMethod) == null) {
          FamiliesServiceGrpc.getViewLabelsForFamilyIDsMethod = getViewLabelsForFamilyIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.FamilyLabelsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewLabelsForFamilyIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyLabelsList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewLabelsForFamilyIDs"))
              .build();
        }
      }
    }
    return getViewLabelsForFamilyIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddUnitConversionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUnitConversion",
      requestType = com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddUnitConversionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest, com.scailo.sdk.IdentifierResponse> getAddUnitConversionMethod;
    if ((getAddUnitConversionMethod = FamiliesServiceGrpc.getAddUnitConversionMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getAddUnitConversionMethod = FamiliesServiceGrpc.getAddUnitConversionMethod) == null) {
          FamiliesServiceGrpc.getAddUnitConversionMethod = getAddUnitConversionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUnitConversion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("AddUnitConversion"))
              .build();
        }
      }
    }
    return getAddUnitConversionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveUnitConversionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveUnitConversion",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveUnitConversionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveUnitConversionMethod;
    if ((getApproveUnitConversionMethod = FamiliesServiceGrpc.getApproveUnitConversionMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getApproveUnitConversionMethod = FamiliesServiceGrpc.getApproveUnitConversionMethod) == null) {
          FamiliesServiceGrpc.getApproveUnitConversionMethod = getApproveUnitConversionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveUnitConversion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ApproveUnitConversion"))
              .build();
        }
      }
    }
    return getApproveUnitConversionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteUnitConversionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUnitConversion",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteUnitConversionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteUnitConversionMethod;
    if ((getDeleteUnitConversionMethod = FamiliesServiceGrpc.getDeleteUnitConversionMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getDeleteUnitConversionMethod = FamiliesServiceGrpc.getDeleteUnitConversionMethod) == null) {
          FamiliesServiceGrpc.getDeleteUnitConversionMethod = getDeleteUnitConversionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUnitConversion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("DeleteUnitConversion"))
              .build();
        }
      }
    }
    return getDeleteUnitConversionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyUnitConversion> getViewUnitConversionByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnitConversionByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyUnitConversion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyUnitConversion> getViewUnitConversionByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyUnitConversion> getViewUnitConversionByIDMethod;
    if ((getViewUnitConversionByIDMethod = FamiliesServiceGrpc.getViewUnitConversionByIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewUnitConversionByIDMethod = FamiliesServiceGrpc.getViewUnitConversionByIDMethod) == null) {
          FamiliesServiceGrpc.getViewUnitConversionByIDMethod = getViewUnitConversionByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyUnitConversion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnitConversionByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyUnitConversion.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewUnitConversionByID"))
              .build();
        }
      }
    }
    return getViewUnitConversionByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyUnitConversionsList> getViewUnitConversionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnitConversions",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyUnitConversionsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyUnitConversionsList> getViewUnitConversionsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyUnitConversionsList> getViewUnitConversionsMethod;
    if ((getViewUnitConversionsMethod = FamiliesServiceGrpc.getViewUnitConversionsMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewUnitConversionsMethod = FamiliesServiceGrpc.getViewUnitConversionsMethod) == null) {
          FamiliesServiceGrpc.getViewUnitConversionsMethod = getViewUnitConversionsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyUnitConversionsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnitConversions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyUnitConversionsList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewUnitConversions"))
              .build();
        }
      }
    }
    return getViewUnitConversionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest,
      com.scailo.sdk.FamilyUnitConversion> getViewUnitConversionForMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnitConversionFor",
      requestType = com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest.class,
      responseType = com.scailo.sdk.FamilyUnitConversion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest,
      com.scailo.sdk.FamilyUnitConversion> getViewUnitConversionForMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest, com.scailo.sdk.FamilyUnitConversion> getViewUnitConversionForMethod;
    if ((getViewUnitConversionForMethod = FamiliesServiceGrpc.getViewUnitConversionForMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewUnitConversionForMethod = FamiliesServiceGrpc.getViewUnitConversionForMethod) == null) {
          FamiliesServiceGrpc.getViewUnitConversionForMethod = getViewUnitConversionForMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest, com.scailo.sdk.FamilyUnitConversion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnitConversionFor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyUnitConversion.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewUnitConversionFor"))
              .build();
        }
      }
    }
    return getViewUnitConversionForMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceQCGroupCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddQCGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddQCGroup",
      requestType = com.scailo.sdk.FamiliesServiceQCGroupCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceQCGroupCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddQCGroupMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceQCGroupCreateRequest, com.scailo.sdk.IdentifierResponse> getAddQCGroupMethod;
    if ((getAddQCGroupMethod = FamiliesServiceGrpc.getAddQCGroupMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getAddQCGroupMethod = FamiliesServiceGrpc.getAddQCGroupMethod) == null) {
          FamiliesServiceGrpc.getAddQCGroupMethod = getAddQCGroupMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceQCGroupCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddQCGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceQCGroupCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("AddQCGroup"))
              .build();
        }
      }
    }
    return getAddQCGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveQCGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveQCGroup",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveQCGroupMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveQCGroupMethod;
    if ((getApproveQCGroupMethod = FamiliesServiceGrpc.getApproveQCGroupMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getApproveQCGroupMethod = FamiliesServiceGrpc.getApproveQCGroupMethod) == null) {
          FamiliesServiceGrpc.getApproveQCGroupMethod = getApproveQCGroupMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveQCGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ApproveQCGroup"))
              .build();
        }
      }
    }
    return getApproveQCGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteQCGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteQCGroup",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteQCGroupMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteQCGroupMethod;
    if ((getDeleteQCGroupMethod = FamiliesServiceGrpc.getDeleteQCGroupMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getDeleteQCGroupMethod = FamiliesServiceGrpc.getDeleteQCGroupMethod) == null) {
          FamiliesServiceGrpc.getDeleteQCGroupMethod = getDeleteQCGroupMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteQCGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("DeleteQCGroup"))
              .build();
        }
      }
    }
    return getDeleteQCGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyQCGroup> getViewQCGroupByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewQCGroupByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyQCGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyQCGroup> getViewQCGroupByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyQCGroup> getViewQCGroupByIDMethod;
    if ((getViewQCGroupByIDMethod = FamiliesServiceGrpc.getViewQCGroupByIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewQCGroupByIDMethod = FamiliesServiceGrpc.getViewQCGroupByIDMethod) == null) {
          FamiliesServiceGrpc.getViewQCGroupByIDMethod = getViewQCGroupByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyQCGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewQCGroupByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyQCGroup.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewQCGroupByID"))
              .build();
        }
      }
    }
    return getViewQCGroupByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyQCGroupsList> getViewQCGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewQCGroups",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyQCGroupsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyQCGroupsList> getViewQCGroupsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyQCGroupsList> getViewQCGroupsMethod;
    if ((getViewQCGroupsMethod = FamiliesServiceGrpc.getViewQCGroupsMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewQCGroupsMethod = FamiliesServiceGrpc.getViewQCGroupsMethod) == null) {
          FamiliesServiceGrpc.getViewQCGroupsMethod = getViewQCGroupsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyQCGroupsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewQCGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyQCGroupsList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewQCGroups"))
              .build();
        }
      }
    }
    return getViewQCGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceImageCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddImage",
      requestType = com.scailo.sdk.FamiliesServiceImageCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceImageCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceImageCreateRequest, com.scailo.sdk.IdentifierResponse> getAddImageMethod;
    if ((getAddImageMethod = FamiliesServiceGrpc.getAddImageMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getAddImageMethod = FamiliesServiceGrpc.getAddImageMethod) == null) {
          FamiliesServiceGrpc.getAddImageMethod = getAddImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceImageCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceImageCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("AddImage"))
              .build();
        }
      }
    }
    return getAddImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceImageUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getUpdateImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateImage",
      requestType = com.scailo.sdk.FamiliesServiceImageUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceImageUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getUpdateImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceImageUpdateRequest, com.scailo.sdk.IdentifierResponse> getUpdateImageMethod;
    if ((getUpdateImageMethod = FamiliesServiceGrpc.getUpdateImageMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getUpdateImageMethod = FamiliesServiceGrpc.getUpdateImageMethod) == null) {
          FamiliesServiceGrpc.getUpdateImageMethod = getUpdateImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceImageUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceImageUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("UpdateImage"))
              .build();
        }
      }
    }
    return getUpdateImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveImage",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveImageMethod;
    if ((getApproveImageMethod = FamiliesServiceGrpc.getApproveImageMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getApproveImageMethod = FamiliesServiceGrpc.getApproveImageMethod) == null) {
          FamiliesServiceGrpc.getApproveImageMethod = getApproveImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ApproveImage"))
              .build();
        }
      }
    }
    return getApproveImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteImage",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteImageMethod;
    if ((getDeleteImageMethod = FamiliesServiceGrpc.getDeleteImageMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getDeleteImageMethod = FamiliesServiceGrpc.getDeleteImageMethod) == null) {
          FamiliesServiceGrpc.getDeleteImageMethod = getDeleteImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("DeleteImage"))
              .build();
        }
      }
    }
    return getDeleteImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyImage> getViewImageByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewImageByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyImage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyImage> getViewImageByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyImage> getViewImageByIDMethod;
    if ((getViewImageByIDMethod = FamiliesServiceGrpc.getViewImageByIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewImageByIDMethod = FamiliesServiceGrpc.getViewImageByIDMethod) == null) {
          FamiliesServiceGrpc.getViewImageByIDMethod = getViewImageByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyImage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewImageByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyImage.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewImageByID"))
              .build();
        }
      }
    }
    return getViewImageByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyImagesList> getViewImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewImages",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyImagesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyImagesList> getViewImagesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyImagesList> getViewImagesMethod;
    if ((getViewImagesMethod = FamiliesServiceGrpc.getViewImagesMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewImagesMethod = FamiliesServiceGrpc.getViewImagesMethod) == null) {
          FamiliesServiceGrpc.getViewImagesMethod = getViewImagesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyImagesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyImagesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewImages"))
              .build();
        }
      }
    }
    return getViewImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyImagesList> getViewPublicImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPublicImages",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.FamilyImagesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.FamilyImagesList> getViewPublicImagesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyImagesList> getViewPublicImagesMethod;
    if ((getViewPublicImagesMethod = FamiliesServiceGrpc.getViewPublicImagesMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewPublicImagesMethod = FamiliesServiceGrpc.getViewPublicImagesMethod) == null) {
          FamiliesServiceGrpc.getViewPublicImagesMethod = getViewPublicImagesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.FamilyImagesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPublicImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyImagesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewPublicImages"))
              .build();
        }
      }
    }
    return getViewPublicImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Family> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Family.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Family> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Family> getViewByIDMethod;
    if ((getViewByIDMethod = FamiliesServiceGrpc.getViewByIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewByIDMethod = FamiliesServiceGrpc.getViewByIDMethod) == null) {
          FamiliesServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Family>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Family.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Family> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Family.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Family> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Family> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = FamiliesServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewByUUIDMethod = FamiliesServiceGrpc.getViewByUUIDMethod) == null) {
          FamiliesServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Family>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Family.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Family> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Family.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Family> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Family> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = FamiliesServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = FamiliesServiceGrpc.getViewEssentialByIDMethod) == null) {
          FamiliesServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Family>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Family.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.Family> getViewEssentialByCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByCode",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.Family.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.Family> getViewEssentialByCodeMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.Family> getViewEssentialByCodeMethod;
    if ((getViewEssentialByCodeMethod = FamiliesServiceGrpc.getViewEssentialByCodeMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewEssentialByCodeMethod = FamiliesServiceGrpc.getViewEssentialByCodeMethod) == null) {
          FamiliesServiceGrpc.getViewEssentialByCodeMethod = getViewEssentialByCodeMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.Family>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Family.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewEssentialByCode"))
              .build();
        }
      }
    }
    return getViewEssentialByCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Family> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Family.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Family> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Family> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = FamiliesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = FamiliesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          FamiliesServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Family>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Family.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.FamiliesList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.FamiliesList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.FamiliesList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = FamiliesServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewFromIDsMethod = FamiliesServiceGrpc.getViewFromIDsMethod) == null) {
          FamiliesServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.FamiliesList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.FamiliesList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.FamiliesList> getViewAllMethod;
    if ((getViewAllMethod = FamiliesServiceGrpc.getViewAllMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewAllMethod = FamiliesServiceGrpc.getViewAllMethod) == null) {
          FamiliesServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.FamiliesList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.FamiliesList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.FamiliesList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = FamiliesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = FamiliesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          FamiliesServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServicePaginationReq,
      com.scailo.sdk.FamiliesServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.FamiliesServicePaginationReq.class,
      responseType = com.scailo.sdk.FamiliesServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServicePaginationReq,
      com.scailo.sdk.FamiliesServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServicePaginationReq, com.scailo.sdk.FamiliesServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = FamiliesServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewWithPaginationMethod = FamiliesServiceGrpc.getViewWithPaginationMethod) == null) {
          FamiliesServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServicePaginationReq, com.scailo.sdk.FamiliesServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamilyTypesList,
      com.scailo.sdk.FamiliesList> getViewAllRequirableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllRequirable",
      requestType = com.scailo.sdk.FamilyTypesList.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamilyTypesList,
      com.scailo.sdk.FamiliesList> getViewAllRequirableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamilyTypesList, com.scailo.sdk.FamiliesList> getViewAllRequirableMethod;
    if ((getViewAllRequirableMethod = FamiliesServiceGrpc.getViewAllRequirableMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewAllRequirableMethod = FamiliesServiceGrpc.getViewAllRequirableMethod) == null) {
          FamiliesServiceGrpc.getViewAllRequirableMethod = getViewAllRequirableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamilyTypesList, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllRequirable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamilyTypesList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewAllRequirable"))
              .build();
        }
      }
    }
    return getViewAllRequirableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.AmendmentLogsList> getViewAmendmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAmendments",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.AmendmentLogsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.AmendmentLogsList> getViewAmendmentsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.AmendmentLogsList> getViewAmendmentsMethod;
    if ((getViewAmendmentsMethod = FamiliesServiceGrpc.getViewAmendmentsMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getViewAmendmentsMethod = FamiliesServiceGrpc.getViewAmendmentsMethod) == null) {
          FamiliesServiceGrpc.getViewAmendmentsMethod = getViewAmendmentsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.AmendmentLogsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAmendments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AmendmentLogsList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("ViewAmendments"))
              .build();
        }
      }
    }
    return getViewAmendmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceSearchAllReq,
      com.scailo.sdk.FamiliesList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.FamiliesServiceSearchAllReq.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceSearchAllReq,
      com.scailo.sdk.FamiliesList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceSearchAllReq, com.scailo.sdk.FamiliesList> getSearchAllMethod;
    if ((getSearchAllMethod = FamiliesServiceGrpc.getSearchAllMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSearchAllMethod = FamiliesServiceGrpc.getSearchAllMethod) == null) {
          FamiliesServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceSearchAllReq, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceFilterReq,
      com.scailo.sdk.FamiliesList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.FamiliesServiceFilterReq.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceFilterReq,
      com.scailo.sdk.FamiliesList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceFilterReq, com.scailo.sdk.FamiliesList> getFilterMethod;
    if ((getFilterMethod = FamiliesServiceGrpc.getFilterMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getFilterMethod = FamiliesServiceGrpc.getFilterMethod) == null) {
          FamiliesServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceFilterReq, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForPurchaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchForPurchase",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForPurchaseMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList> getSearchForPurchaseMethod;
    if ((getSearchForPurchaseMethod = FamiliesServiceGrpc.getSearchForPurchaseMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSearchForPurchaseMethod = FamiliesServiceGrpc.getSearchForPurchaseMethod) == null) {
          FamiliesServiceGrpc.getSearchForPurchaseMethod = getSearchForPurchaseMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchForPurchase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SearchForPurchase"))
              .build();
        }
      }
    }
    return getSearchForPurchaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForSaleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchForSale",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForSaleMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList> getSearchForSaleMethod;
    if ((getSearchForSaleMethod = FamiliesServiceGrpc.getSearchForSaleMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSearchForSaleMethod = FamiliesServiceGrpc.getSearchForSaleMethod) == null) {
          FamiliesServiceGrpc.getSearchForSaleMethod = getSearchForSaleMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchForSale"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SearchForSale"))
              .build();
        }
      }
    }
    return getSearchForSaleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchForProduction",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForProductionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList> getSearchForProductionMethod;
    if ((getSearchForProductionMethod = FamiliesServiceGrpc.getSearchForProductionMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSearchForProductionMethod = FamiliesServiceGrpc.getSearchForProductionMethod) == null) {
          FamiliesServiceGrpc.getSearchForProductionMethod = getSearchForProductionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchForProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SearchForProduction"))
              .build();
        }
      }
    }
    return getSearchForProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForReplaceablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchForReplaceables",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForReplaceablesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList> getSearchForReplaceablesMethod;
    if ((getSearchForReplaceablesMethod = FamiliesServiceGrpc.getSearchForReplaceablesMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSearchForReplaceablesMethod = FamiliesServiceGrpc.getSearchForReplaceablesMethod) == null) {
          FamiliesServiceGrpc.getSearchForReplaceablesMethod = getSearchForReplaceablesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchForReplaceables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SearchForReplaceables"))
              .build();
        }
      }
    }
    return getSearchForReplaceablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForEquationFamilyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchForEquationFamily",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForEquationFamilyMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList> getSearchForEquationFamilyMethod;
    if ((getSearchForEquationFamilyMethod = FamiliesServiceGrpc.getSearchForEquationFamilyMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSearchForEquationFamilyMethod = FamiliesServiceGrpc.getSearchForEquationFamilyMethod) == null) {
          FamiliesServiceGrpc.getSearchForEquationFamilyMethod = getSearchForEquationFamilyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchForEquationFamily"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SearchForEquationFamily"))
              .build();
        }
      }
    }
    return getSearchForEquationFamilyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForEquationReplaceableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchForEquationReplaceable",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForEquationReplaceableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList> getSearchForEquationReplaceableMethod;
    if ((getSearchForEquationReplaceableMethod = FamiliesServiceGrpc.getSearchForEquationReplaceableMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSearchForEquationReplaceableMethod = FamiliesServiceGrpc.getSearchForEquationReplaceableMethod) == null) {
          FamiliesServiceGrpc.getSearchForEquationReplaceableMethod = getSearchForEquationReplaceableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchForEquationReplaceable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SearchForEquationReplaceable"))
              .build();
        }
      }
    }
    return getSearchForEquationReplaceableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForEquationSalesBundleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchForEquationSalesBundle",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.FamiliesList> getSearchForEquationSalesBundleMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList> getSearchForEquationSalesBundleMethod;
    if ((getSearchForEquationSalesBundleMethod = FamiliesServiceGrpc.getSearchForEquationSalesBundleMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getSearchForEquationSalesBundleMethod = FamiliesServiceGrpc.getSearchForEquationSalesBundleMethod) == null) {
          FamiliesServiceGrpc.getSearchForEquationSalesBundleMethod = getSearchForEquationSalesBundleMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchForEquationSalesBundle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("SearchForEquationSalesBundle"))
              .build();
        }
      }
    }
    return getSearchForEquationSalesBundleMethod;
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
    if ((getCountInStatusMethod = FamiliesServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getCountInStatusMethod = FamiliesServiceGrpc.getCountInStatusMethod) == null) {
          FamiliesServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.FamiliesServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FamiliesServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = FamiliesServiceGrpc.getCountMethod) == null) {
      synchronized (FamiliesServiceGrpc.class) {
        if ((getCountMethod = FamiliesServiceGrpc.getCountMethod) == null) {
          FamiliesServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FamiliesServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FamiliesServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FamiliesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FamiliesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FamiliesServiceStub>() {
        @java.lang.Override
        public FamiliesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FamiliesServiceStub(channel, callOptions);
        }
      };
    return FamiliesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FamiliesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FamiliesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FamiliesServiceBlockingStub>() {
        @java.lang.Override
        public FamiliesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FamiliesServiceBlockingStub(channel, callOptions);
        }
      };
    return FamiliesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FamiliesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FamiliesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FamiliesServiceFutureStub>() {
        @java.lang.Override
        public FamiliesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FamiliesServiceFutureStub(channel, callOptions);
        }
      };
    return FamiliesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each family
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.FamiliesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.FamiliesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.FamiliesServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.FamiliesServiceUpdateRequest request,
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
     * Add comment
     * </pre>
     */
    default void commentAdd(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommentAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * Amend the family and send for revision
     * </pre>
     */
    default void amend(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAmendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the price of the family with the given UUID
     * </pre>
     */
    default void updatePrice(com.scailo.sdk.FamiliesServiceUpdatePriceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the price of all the families mentioned in the file
     * </pre>
     */
    default void uploadPrices(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadPricesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the minimim stock to maintain for the family with the given UUID
     * </pre>
     */
    default void updateMinStockToMaintain(com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMinStockToMaintainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the minimum stock to maintain for all the families mentioned in the file
     * </pre>
     */
    default void uploadMinStockToMaintain(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMinStockToMaintainMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of families according to the given filter request. The same file could also be used as a template for uploading families
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.FamiliesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import families using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    default void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportFromCSVMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a storage
     * </pre>
     */
    default void addStorage(com.scailo.sdk.FamiliesServiceStorageCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a storage
     * </pre>
     */
    default void approveStorage(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a storage
     * </pre>
     */
    default void deleteStorage(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a storage for the given ID
     * </pre>
     */
    default void viewStorageByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyStorage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewStorageByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all storages for given family ID
     * </pre>
     */
    default void viewStorages(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyStoragesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewStoragesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a label
     * </pre>
     */
    default void addLabel(com.scailo.sdk.FamiliesServiceLabelCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a label
     * </pre>
     */
    default void approveLabel(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a label
     * </pre>
     */
    default void deleteLabel(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a label for the given ID
     * </pre>
     */
    default void viewLabelByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyLabel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewLabelByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all labels for given family ID
     * </pre>
     */
    default void viewLabels(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyLabelsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all labels for given family IDs
     * </pre>
     */
    default void viewLabelsForFamilyIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyLabelsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewLabelsForFamilyIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a unit conversion
     * </pre>
     */
    default void addUnitConversion(com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUnitConversionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a unit conversion
     * </pre>
     */
    default void approveUnitConversion(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveUnitConversionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a unit conversion
     * </pre>
     */
    default void deleteUnitConversion(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUnitConversionMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a unit conversion for the given ID
     * </pre>
     */
    default void viewUnitConversionByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyUnitConversion> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnitConversionByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all unit conversions for given family ID
     * </pre>
     */
    default void viewUnitConversions(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyUnitConversionsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnitConversionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the unit conversion for the given family ID and the given uom ID
     * </pre>
     */
    default void viewUnitConversionFor(com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyUnitConversion> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnitConversionForMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a qc group
     * </pre>
     */
    default void addQCGroup(com.scailo.sdk.FamiliesServiceQCGroupCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddQCGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a qc group
     * </pre>
     */
    default void approveQCGroup(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveQCGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a qc group
     * </pre>
     */
    default void deleteQCGroup(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteQCGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a qc group for the given ID
     * </pre>
     */
    default void viewQCGroupByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyQCGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewQCGroupByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all qc groups for given family ID
     * </pre>
     */
    default void viewQCGroups(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyQCGroupsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewQCGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a image
     * </pre>
     */
    default void addImage(com.scailo.sdk.FamiliesServiceImageCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an image
     * </pre>
     */
    default void updateImage(com.scailo.sdk.FamiliesServiceImageUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a image
     * </pre>
     */
    default void approveImage(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a image
     * </pre>
     */
    default void deleteImage(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a image for the given ID
     * </pre>
     */
    default void viewImageByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyImage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewImageByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all images for given family ID
     * </pre>
     */
    default void viewImages(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyImagesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewImagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View public images for given family ID
     * </pre>
     */
    default void viewPublicImages(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyImagesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPublicImagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs) that matches the given code
     * </pre>
     */
    default void viewEssentialByCode(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all families with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.FamiliesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all families with required quantity greater than 0 from the given family types
     * </pre>
     */
    default void viewAllRequirable(com.scailo.sdk.FamilyTypesList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllRequirableMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all the amendments made
     * </pre>
     */
    default void viewAmendments(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AmendmentLogsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAmendmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.FamiliesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.FamiliesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all families for purchase that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    default void searchForPurchase(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchForPurchaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all families for sale that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    default void searchForSale(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchForSaleMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all families for production that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    default void searchForProduction(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchForProductionMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all families for replaceables that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    default void searchForReplaceables(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchForReplaceablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all families for equation family that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    default void searchForEquationFamily(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchForEquationFamilyMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all families for equation replaceable that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    default void searchForEquationReplaceable(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchForEquationReplaceableMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all families for equation sales bundle that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    default void searchForEquationSalesBundle(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchForEquationSalesBundleMethod(), responseObserver);
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
    default void count(com.scailo.sdk.FamiliesServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FamiliesService.
   * <pre>
   *Describes the common methods applicable on each family
   * </pre>
   */
  public static abstract class FamiliesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FamiliesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FamiliesService.
   * <pre>
   *Describes the common methods applicable on each family
   * </pre>
   */
  public static final class FamiliesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FamiliesServiceStub> {
    private FamiliesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FamiliesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FamiliesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.FamiliesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.FamiliesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.FamiliesServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.FamiliesServiceUpdateRequest request,
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
     * Amend the family and send for revision
     * </pre>
     */
    public void amend(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAmendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the price of the family with the given UUID
     * </pre>
     */
    public void updatePrice(com.scailo.sdk.FamiliesServiceUpdatePriceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the price of all the families mentioned in the file
     * </pre>
     */
    public void uploadPrices(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the minimim stock to maintain for the family with the given UUID
     * </pre>
     */
    public void updateMinStockToMaintain(com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMinStockToMaintainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the minimum stock to maintain for all the families mentioned in the file
     * </pre>
     */
    public void uploadMinStockToMaintain(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMinStockToMaintainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of families according to the given filter request. The same file could also be used as a template for uploading families
     * </pre>
     */
    public void downloadAsCSV(com.scailo.sdk.FamiliesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import families using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    public void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a storage
     * </pre>
     */
    public void addStorage(com.scailo.sdk.FamiliesServiceStorageCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a storage
     * </pre>
     */
    public void approveStorage(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a storage
     * </pre>
     */
    public void deleteStorage(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a storage for the given ID
     * </pre>
     */
    public void viewStorageByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyStorage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewStorageByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all storages for given family ID
     * </pre>
     */
    public void viewStorages(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyStoragesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewStoragesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a label
     * </pre>
     */
    public void addLabel(com.scailo.sdk.FamiliesServiceLabelCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a label
     * </pre>
     */
    public void approveLabel(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a label
     * </pre>
     */
    public void deleteLabel(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a label for the given ID
     * </pre>
     */
    public void viewLabelByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyLabel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewLabelByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all labels for given family ID
     * </pre>
     */
    public void viewLabels(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyLabelsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all labels for given family IDs
     * </pre>
     */
    public void viewLabelsForFamilyIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyLabelsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewLabelsForFamilyIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a unit conversion
     * </pre>
     */
    public void addUnitConversion(com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUnitConversionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a unit conversion
     * </pre>
     */
    public void approveUnitConversion(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveUnitConversionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a unit conversion
     * </pre>
     */
    public void deleteUnitConversion(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUnitConversionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a unit conversion for the given ID
     * </pre>
     */
    public void viewUnitConversionByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyUnitConversion> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnitConversionByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all unit conversions for given family ID
     * </pre>
     */
    public void viewUnitConversions(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyUnitConversionsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnitConversionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the unit conversion for the given family ID and the given uom ID
     * </pre>
     */
    public void viewUnitConversionFor(com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyUnitConversion> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnitConversionForMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a qc group
     * </pre>
     */
    public void addQCGroup(com.scailo.sdk.FamiliesServiceQCGroupCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddQCGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a qc group
     * </pre>
     */
    public void approveQCGroup(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveQCGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a qc group
     * </pre>
     */
    public void deleteQCGroup(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteQCGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a qc group for the given ID
     * </pre>
     */
    public void viewQCGroupByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyQCGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewQCGroupByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all qc groups for given family ID
     * </pre>
     */
    public void viewQCGroups(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyQCGroupsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewQCGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a image
     * </pre>
     */
    public void addImage(com.scailo.sdk.FamiliesServiceImageCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an image
     * </pre>
     */
    public void updateImage(com.scailo.sdk.FamiliesServiceImageUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a image
     * </pre>
     */
    public void approveImage(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a image
     * </pre>
     */
    public void deleteImage(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a image for the given ID
     * </pre>
     */
    public void viewImageByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyImage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewImageByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all images for given family ID
     * </pre>
     */
    public void viewImages(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyImagesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View public images for given family ID
     * </pre>
     */
    public void viewPublicImages(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyImagesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPublicImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs) that matches the given code
     * </pre>
     */
    public void viewEssentialByCode(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Family> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all families with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.FamiliesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all families with required quantity greater than 0 from the given family types
     * </pre>
     */
    public void viewAllRequirable(com.scailo.sdk.FamilyTypesList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllRequirableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all the amendments made
     * </pre>
     */
    public void viewAmendments(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AmendmentLogsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAmendmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.FamiliesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.FamiliesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all families for purchase that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public void searchForPurchase(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchForPurchaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all families for sale that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public void searchForSale(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchForSaleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all families for production that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public void searchForProduction(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchForProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all families for replaceables that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public void searchForReplaceables(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchForReplaceablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all families for equation family that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public void searchForEquationFamily(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchForEquationFamilyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all families for equation replaceable that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public void searchForEquationReplaceable(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchForEquationReplaceableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all families for equation sales bundle that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public void searchForEquationSalesBundle(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchForEquationSalesBundleMethod(), getCallOptions()), request, responseObserver);
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
    public void count(com.scailo.sdk.FamiliesServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FamiliesService.
   * <pre>
   *Describes the common methods applicable on each family
   * </pre>
   */
  public static final class FamiliesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FamiliesServiceBlockingStub> {
    private FamiliesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FamiliesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FamiliesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.FamiliesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.FamiliesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.FamiliesServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.FamiliesServiceUpdateRequest request) {
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
     * Add comment
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse commentAdd(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommentAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Amend the family and send for revision
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse amend(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAmendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the price of the family with the given UUID
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse updatePrice(com.scailo.sdk.FamiliesServiceUpdatePriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the price of all the families mentioned in the file
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUIDsList uploadPrices(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadPricesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the minimim stock to maintain for the family with the given UUID
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse updateMinStockToMaintain(com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMinStockToMaintainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the minimum stock to maintain for all the families mentioned in the file
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUIDsList uploadMinStockToMaintain(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMinStockToMaintainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of families according to the given filter request. The same file could also be used as a template for uploading families
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.FamiliesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import families using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUIDsList importFromCSV(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportFromCSVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a storage
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addStorage(com.scailo.sdk.FamiliesServiceStorageCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a storage
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveStorage(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a storage
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteStorage(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a storage for the given ID
     * </pre>
     */
    public com.scailo.sdk.FamilyStorage viewStorageByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewStorageByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all storages for given family ID
     * </pre>
     */
    public com.scailo.sdk.FamilyStoragesList viewStorages(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewStoragesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a label
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addLabel(com.scailo.sdk.FamiliesServiceLabelCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a label
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveLabel(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a label
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteLabel(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a label for the given ID
     * </pre>
     */
    public com.scailo.sdk.FamilyLabel viewLabelByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewLabelByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all labels for given family ID
     * </pre>
     */
    public com.scailo.sdk.FamilyLabelsList viewLabels(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all labels for given family IDs
     * </pre>
     */
    public com.scailo.sdk.FamilyLabelsList viewLabelsForFamilyIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewLabelsForFamilyIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a unit conversion
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addUnitConversion(com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUnitConversionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a unit conversion
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveUnitConversion(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveUnitConversionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a unit conversion
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteUnitConversion(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUnitConversionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a unit conversion for the given ID
     * </pre>
     */
    public com.scailo.sdk.FamilyUnitConversion viewUnitConversionByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnitConversionByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all unit conversions for given family ID
     * </pre>
     */
    public com.scailo.sdk.FamilyUnitConversionsList viewUnitConversions(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnitConversionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the unit conversion for the given family ID and the given uom ID
     * </pre>
     */
    public com.scailo.sdk.FamilyUnitConversion viewUnitConversionFor(com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnitConversionForMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a qc group
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addQCGroup(com.scailo.sdk.FamiliesServiceQCGroupCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddQCGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a qc group
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveQCGroup(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveQCGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a qc group
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteQCGroup(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteQCGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a qc group for the given ID
     * </pre>
     */
    public com.scailo.sdk.FamilyQCGroup viewQCGroupByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewQCGroupByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all qc groups for given family ID
     * </pre>
     */
    public com.scailo.sdk.FamilyQCGroupsList viewQCGroups(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewQCGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a image
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addImage(com.scailo.sdk.FamiliesServiceImageCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an image
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse updateImage(com.scailo.sdk.FamiliesServiceImageUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a image
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveImage(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a image
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteImage(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a image for the given ID
     * </pre>
     */
    public com.scailo.sdk.FamilyImage viewImageByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewImageByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all images for given family ID
     * </pre>
     */
    public com.scailo.sdk.FamilyImagesList viewImages(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewImagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View public images for given family ID
     * </pre>
     */
    public com.scailo.sdk.FamilyImagesList viewPublicImages(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPublicImagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.Family viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.Family viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs)
     * </pre>
     */
    public com.scailo.sdk.Family viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs) that matches the given code
     * </pre>
     */
    public com.scailo.sdk.Family viewEssentialByCode(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.Family viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all families with the given IDs
     * </pre>
     */
    public com.scailo.sdk.FamiliesList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.FamiliesList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.FamiliesList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.FamiliesServicePaginationResponse viewWithPagination(com.scailo.sdk.FamiliesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all families with required quantity greater than 0 from the given family types
     * </pre>
     */
    public com.scailo.sdk.FamiliesList viewAllRequirable(com.scailo.sdk.FamilyTypesList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllRequirableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all the amendments made
     * </pre>
     */
    public com.scailo.sdk.AmendmentLogsList viewAmendments(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAmendmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.FamiliesList searchAll(com.scailo.sdk.FamiliesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.FamiliesList filter(com.scailo.sdk.FamiliesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all families for purchase that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.FamiliesList searchForPurchase(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchForPurchaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all families for sale that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.FamiliesList searchForSale(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchForSaleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all families for production that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.FamiliesList searchForProduction(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchForProductionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all families for replaceables that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.FamiliesList searchForReplaceables(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchForReplaceablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all families for equation family that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.FamiliesList searchForEquationFamily(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchForEquationFamilyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all families for equation replaceable that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.FamiliesList searchForEquationReplaceable(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchForEquationReplaceableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all families for equation sales bundle that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.FamiliesList searchForEquationSalesBundle(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchForEquationSalesBundleMethod(), getCallOptions(), request);
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.FamiliesServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FamiliesService.
   * <pre>
   *Describes the common methods applicable on each family
   * </pre>
   */
  public static final class FamiliesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FamiliesServiceFutureStub> {
    private FamiliesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FamiliesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FamiliesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.FamiliesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.FamiliesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.FamiliesServiceUpdateRequest request) {
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
        com.scailo.sdk.FamiliesServiceUpdateRequest request) {
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
     * Amend the family and send for revision
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> amend(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAmendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the price of the family with the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> updatePrice(
        com.scailo.sdk.FamiliesServiceUpdatePriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the price of all the families mentioned in the file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUIDsList> uploadPrices(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadPricesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the minimim stock to maintain for the family with the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> updateMinStockToMaintain(
        com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMinStockToMaintainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the minimum stock to maintain for all the families mentioned in the file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUIDsList> uploadMinStockToMaintain(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMinStockToMaintainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of families according to the given filter request. The same file could also be used as a template for uploading families
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadAsCSV(
        com.scailo.sdk.FamiliesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import families using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUIDsList> importFromCSV(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addStorage(
        com.scailo.sdk.FamiliesServiceStorageCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStorageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveStorage(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveStorageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteStorage(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStorageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a storage for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyStorage> viewStorageByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewStorageByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all storages for given family ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyStoragesList> viewStorages(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewStoragesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a label
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addLabel(
        com.scailo.sdk.FamiliesServiceLabelCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a label
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveLabel(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a label
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteLabel(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a label for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyLabel> viewLabelByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewLabelByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all labels for given family ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyLabelsList> viewLabels(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all labels for given family IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyLabelsList> viewLabelsForFamilyIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewLabelsForFamilyIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a unit conversion
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addUnitConversion(
        com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUnitConversionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a unit conversion
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveUnitConversion(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveUnitConversionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a unit conversion
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteUnitConversion(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUnitConversionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a unit conversion for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyUnitConversion> viewUnitConversionByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnitConversionByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all unit conversions for given family ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyUnitConversionsList> viewUnitConversions(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnitConversionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the unit conversion for the given family ID and the given uom ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyUnitConversion> viewUnitConversionFor(
        com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnitConversionForMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a qc group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addQCGroup(
        com.scailo.sdk.FamiliesServiceQCGroupCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddQCGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a qc group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveQCGroup(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveQCGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a qc group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteQCGroup(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteQCGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a qc group for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyQCGroup> viewQCGroupByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewQCGroupByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all qc groups for given family ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyQCGroupsList> viewQCGroups(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewQCGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addImage(
        com.scailo.sdk.FamiliesServiceImageCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> updateImage(
        com.scailo.sdk.FamiliesServiceImageUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveImage(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteImage(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a image for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyImage> viewImageByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewImageByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all images for given family ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyImagesList> viewImages(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewImagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View public images for given family ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamilyImagesList> viewPublicImages(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPublicImagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Family> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Family> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Family> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs) that matches the given code
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Family> viewEssentialByCode(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components of the family (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Family> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all families with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.FamiliesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all families with required quantity greater than 0 from the given family types
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> viewAllRequirable(
        com.scailo.sdk.FamilyTypesList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllRequirableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all the amendments made
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.AmendmentLogsList> viewAmendments(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAmendmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> searchAll(
        com.scailo.sdk.FamiliesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> filter(
        com.scailo.sdk.FamiliesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all families for purchase that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> searchForPurchase(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchForPurchaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all families for sale that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> searchForSale(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchForSaleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all families for production that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> searchForProduction(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchForProductionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all families for replaceables that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> searchForReplaceables(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchForReplaceablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all families for equation family that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> searchForEquationFamily(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchForEquationFamilyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all families for equation replaceable that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> searchForEquationReplaceable(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchForEquationReplaceableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all families for equation sales bundle that match the given search key
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> searchForEquationSalesBundle(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchForEquationSalesBundleMethod(), getCallOptions()), request);
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
        com.scailo.sdk.FamiliesServiceCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
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
  private static final int METHODID_COMMENT_ADD = 11;
  private static final int METHODID_AMEND = 12;
  private static final int METHODID_UPDATE_PRICE = 13;
  private static final int METHODID_UPLOAD_PRICES = 14;
  private static final int METHODID_UPDATE_MIN_STOCK_TO_MAINTAIN = 15;
  private static final int METHODID_UPLOAD_MIN_STOCK_TO_MAINTAIN = 16;
  private static final int METHODID_DOWNLOAD_AS_CSV = 17;
  private static final int METHODID_IMPORT_FROM_CSV = 18;
  private static final int METHODID_ADD_STORAGE = 19;
  private static final int METHODID_APPROVE_STORAGE = 20;
  private static final int METHODID_DELETE_STORAGE = 21;
  private static final int METHODID_VIEW_STORAGE_BY_ID = 22;
  private static final int METHODID_VIEW_STORAGES = 23;
  private static final int METHODID_ADD_LABEL = 24;
  private static final int METHODID_APPROVE_LABEL = 25;
  private static final int METHODID_DELETE_LABEL = 26;
  private static final int METHODID_VIEW_LABEL_BY_ID = 27;
  private static final int METHODID_VIEW_LABELS = 28;
  private static final int METHODID_VIEW_LABELS_FOR_FAMILY_IDS = 29;
  private static final int METHODID_ADD_UNIT_CONVERSION = 30;
  private static final int METHODID_APPROVE_UNIT_CONVERSION = 31;
  private static final int METHODID_DELETE_UNIT_CONVERSION = 32;
  private static final int METHODID_VIEW_UNIT_CONVERSION_BY_ID = 33;
  private static final int METHODID_VIEW_UNIT_CONVERSIONS = 34;
  private static final int METHODID_VIEW_UNIT_CONVERSION_FOR = 35;
  private static final int METHODID_ADD_QCGROUP = 36;
  private static final int METHODID_APPROVE_QCGROUP = 37;
  private static final int METHODID_DELETE_QCGROUP = 38;
  private static final int METHODID_VIEW_QCGROUP_BY_ID = 39;
  private static final int METHODID_VIEW_QCGROUPS = 40;
  private static final int METHODID_ADD_IMAGE = 41;
  private static final int METHODID_UPDATE_IMAGE = 42;
  private static final int METHODID_APPROVE_IMAGE = 43;
  private static final int METHODID_DELETE_IMAGE = 44;
  private static final int METHODID_VIEW_IMAGE_BY_ID = 45;
  private static final int METHODID_VIEW_IMAGES = 46;
  private static final int METHODID_VIEW_PUBLIC_IMAGES = 47;
  private static final int METHODID_VIEW_BY_ID = 48;
  private static final int METHODID_VIEW_BY_UUID = 49;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 50;
  private static final int METHODID_VIEW_ESSENTIAL_BY_CODE = 51;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 52;
  private static final int METHODID_VIEW_FROM_IDS = 53;
  private static final int METHODID_VIEW_ALL = 54;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 55;
  private static final int METHODID_VIEW_WITH_PAGINATION = 56;
  private static final int METHODID_VIEW_ALL_REQUIRABLE = 57;
  private static final int METHODID_VIEW_AMENDMENTS = 58;
  private static final int METHODID_SEARCH_ALL = 59;
  private static final int METHODID_FILTER = 60;
  private static final int METHODID_SEARCH_FOR_PURCHASE = 61;
  private static final int METHODID_SEARCH_FOR_SALE = 62;
  private static final int METHODID_SEARCH_FOR_PRODUCTION = 63;
  private static final int METHODID_SEARCH_FOR_REPLACEABLES = 64;
  private static final int METHODID_SEARCH_FOR_EQUATION_FAMILY = 65;
  private static final int METHODID_SEARCH_FOR_EQUATION_REPLACEABLE = 66;
  private static final int METHODID_SEARCH_FOR_EQUATION_SALES_BUNDLE = 67;
  private static final int METHODID_COUNT_IN_STATUS = 68;
  private static final int METHODID_COUNT = 69;

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
          serviceImpl.create((com.scailo.sdk.FamiliesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.FamiliesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.FamiliesServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.FamiliesServiceUpdateRequest) request,
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
        case METHODID_COMMENT_ADD:
          serviceImpl.commentAdd((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_AMEND:
          serviceImpl.amend((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRICE:
          serviceImpl.updatePrice((com.scailo.sdk.FamiliesServiceUpdatePriceRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_PRICES:
          serviceImpl.uploadPrices((com.scailo.sdk.StandardFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList>) responseObserver);
          break;
        case METHODID_UPDATE_MIN_STOCK_TO_MAINTAIN:
          serviceImpl.updateMinStockToMaintain((com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_MIN_STOCK_TO_MAINTAIN:
          serviceImpl.uploadMinStockToMaintain((com.scailo.sdk.StandardFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.FamiliesServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_IMPORT_FROM_CSV:
          serviceImpl.importFromCSV((com.scailo.sdk.StandardFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList>) responseObserver);
          break;
        case METHODID_ADD_STORAGE:
          serviceImpl.addStorage((com.scailo.sdk.FamiliesServiceStorageCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_STORAGE:
          serviceImpl.approveStorage((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_STORAGE:
          serviceImpl.deleteStorage((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_STORAGE_BY_ID:
          serviceImpl.viewStorageByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyStorage>) responseObserver);
          break;
        case METHODID_VIEW_STORAGES:
          serviceImpl.viewStorages((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyStoragesList>) responseObserver);
          break;
        case METHODID_ADD_LABEL:
          serviceImpl.addLabel((com.scailo.sdk.FamiliesServiceLabelCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_LABEL:
          serviceImpl.approveLabel((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_LABEL:
          serviceImpl.deleteLabel((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_LABEL_BY_ID:
          serviceImpl.viewLabelByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyLabel>) responseObserver);
          break;
        case METHODID_VIEW_LABELS:
          serviceImpl.viewLabels((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyLabelsList>) responseObserver);
          break;
        case METHODID_VIEW_LABELS_FOR_FAMILY_IDS:
          serviceImpl.viewLabelsForFamilyIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyLabelsList>) responseObserver);
          break;
        case METHODID_ADD_UNIT_CONVERSION:
          serviceImpl.addUnitConversion((com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_UNIT_CONVERSION:
          serviceImpl.approveUnitConversion((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_UNIT_CONVERSION:
          serviceImpl.deleteUnitConversion((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_UNIT_CONVERSION_BY_ID:
          serviceImpl.viewUnitConversionByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyUnitConversion>) responseObserver);
          break;
        case METHODID_VIEW_UNIT_CONVERSIONS:
          serviceImpl.viewUnitConversions((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyUnitConversionsList>) responseObserver);
          break;
        case METHODID_VIEW_UNIT_CONVERSION_FOR:
          serviceImpl.viewUnitConversionFor((com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyUnitConversion>) responseObserver);
          break;
        case METHODID_ADD_QCGROUP:
          serviceImpl.addQCGroup((com.scailo.sdk.FamiliesServiceQCGroupCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_QCGROUP:
          serviceImpl.approveQCGroup((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_QCGROUP:
          serviceImpl.deleteQCGroup((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_QCGROUP_BY_ID:
          serviceImpl.viewQCGroupByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyQCGroup>) responseObserver);
          break;
        case METHODID_VIEW_QCGROUPS:
          serviceImpl.viewQCGroups((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyQCGroupsList>) responseObserver);
          break;
        case METHODID_ADD_IMAGE:
          serviceImpl.addImage((com.scailo.sdk.FamiliesServiceImageCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_UPDATE_IMAGE:
          serviceImpl.updateImage((com.scailo.sdk.FamiliesServiceImageUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_IMAGE:
          serviceImpl.approveImage((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_IMAGE:
          serviceImpl.deleteImage((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_IMAGE_BY_ID:
          serviceImpl.viewImageByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyImage>) responseObserver);
          break;
        case METHODID_VIEW_IMAGES:
          serviceImpl.viewImages((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyImagesList>) responseObserver);
          break;
        case METHODID_VIEW_PUBLIC_IMAGES:
          serviceImpl.viewPublicImages((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamilyImagesList>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Family>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Family>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Family>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_CODE:
          serviceImpl.viewEssentialByCode((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Family>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Family>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.FamiliesServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_ALL_REQUIRABLE:
          serviceImpl.viewAllRequirable((com.scailo.sdk.FamilyTypesList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_AMENDMENTS:
          serviceImpl.viewAmendments((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.AmendmentLogsList>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.FamiliesServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.FamiliesServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_SEARCH_FOR_PURCHASE:
          serviceImpl.searchForPurchase((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_SEARCH_FOR_SALE:
          serviceImpl.searchForSale((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_SEARCH_FOR_PRODUCTION:
          serviceImpl.searchForProduction((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_SEARCH_FOR_REPLACEABLES:
          serviceImpl.searchForReplaceables((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_SEARCH_FOR_EQUATION_FAMILY:
          serviceImpl.searchForEquationFamily((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_SEARCH_FOR_EQUATION_REPLACEABLE:
          serviceImpl.searchForEquationReplaceable((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_SEARCH_FOR_EQUATION_SALES_BUNDLE:
          serviceImpl.searchForEquationSalesBundle((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.FamiliesServiceCountReq) request,
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
              com.scailo.sdk.FamiliesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceUpdateRequest,
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
              com.scailo.sdk.FamiliesServiceUpdateRequest,
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
          getCommentAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_COMMENT_ADD)))
        .addMethod(
          getAmendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_AMEND)))
        .addMethod(
          getUpdatePriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceUpdatePriceRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE_PRICE)))
        .addMethod(
          getUploadPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.IdentifierUUIDsList>(
                service, METHODID_UPLOAD_PRICES)))
        .addMethod(
          getUpdateMinStockToMaintainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceUpdateMinStockToMaintainRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE_MIN_STOCK_TO_MAINTAIN)))
        .addMethod(
          getUploadMinStockToMaintainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.IdentifierUUIDsList>(
                service, METHODID_UPLOAD_MIN_STOCK_TO_MAINTAIN)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .addMethod(
          getImportFromCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.IdentifierUUIDsList>(
                service, METHODID_IMPORT_FROM_CSV)))
        .addMethod(
          getAddStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceStorageCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_STORAGE)))
        .addMethod(
          getApproveStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_STORAGE)))
        .addMethod(
          getDeleteStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_STORAGE)))
        .addMethod(
          getViewStorageByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyStorage>(
                service, METHODID_VIEW_STORAGE_BY_ID)))
        .addMethod(
          getViewStoragesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyStoragesList>(
                service, METHODID_VIEW_STORAGES)))
        .addMethod(
          getAddLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceLabelCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_LABEL)))
        .addMethod(
          getApproveLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_LABEL)))
        .addMethod(
          getDeleteLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_LABEL)))
        .addMethod(
          getViewLabelByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyLabel>(
                service, METHODID_VIEW_LABEL_BY_ID)))
        .addMethod(
          getViewLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyLabelsList>(
                service, METHODID_VIEW_LABELS)))
        .addMethod(
          getViewLabelsForFamilyIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.FamilyLabelsList>(
                service, METHODID_VIEW_LABELS_FOR_FAMILY_IDS)))
        .addMethod(
          getAddUnitConversionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceUnitConversionCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_UNIT_CONVERSION)))
        .addMethod(
          getApproveUnitConversionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_UNIT_CONVERSION)))
        .addMethod(
          getDeleteUnitConversionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_UNIT_CONVERSION)))
        .addMethod(
          getViewUnitConversionByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyUnitConversion>(
                service, METHODID_VIEW_UNIT_CONVERSION_BY_ID)))
        .addMethod(
          getViewUnitConversionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyUnitConversionsList>(
                service, METHODID_VIEW_UNIT_CONVERSIONS)))
        .addMethod(
          getViewUnitConversionForMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceUnitConversionPresenceRequest,
              com.scailo.sdk.FamilyUnitConversion>(
                service, METHODID_VIEW_UNIT_CONVERSION_FOR)))
        .addMethod(
          getAddQCGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceQCGroupCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_QCGROUP)))
        .addMethod(
          getApproveQCGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_QCGROUP)))
        .addMethod(
          getDeleteQCGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_QCGROUP)))
        .addMethod(
          getViewQCGroupByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyQCGroup>(
                service, METHODID_VIEW_QCGROUP_BY_ID)))
        .addMethod(
          getViewQCGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyQCGroupsList>(
                service, METHODID_VIEW_QCGROUPS)))
        .addMethod(
          getAddImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceImageCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_IMAGE)))
        .addMethod(
          getUpdateImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceImageUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE_IMAGE)))
        .addMethod(
          getApproveImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_IMAGE)))
        .addMethod(
          getDeleteImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_IMAGE)))
        .addMethod(
          getViewImageByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyImage>(
                service, METHODID_VIEW_IMAGE_BY_ID)))
        .addMethod(
          getViewImagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyImagesList>(
                service, METHODID_VIEW_IMAGES)))
        .addMethod(
          getViewPublicImagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.FamilyImagesList>(
                service, METHODID_VIEW_PUBLIC_IMAGES)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Family>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Family>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Family>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.Family>(
                service, METHODID_VIEW_ESSENTIAL_BY_CODE)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Family>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServicePaginationReq,
              com.scailo.sdk.FamiliesServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewAllRequirableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamilyTypesList,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_VIEW_ALL_REQUIRABLE)))
        .addMethod(
          getViewAmendmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.AmendmentLogsList>(
                service, METHODID_VIEW_AMENDMENTS)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceSearchAllReq,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FamiliesServiceFilterReq,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_FILTER)))
        .addMethod(
          getSearchForPurchaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_SEARCH_FOR_PURCHASE)))
        .addMethod(
          getSearchForSaleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_SEARCH_FOR_SALE)))
        .addMethod(
          getSearchForProductionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_SEARCH_FOR_PRODUCTION)))
        .addMethod(
          getSearchForReplaceablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_SEARCH_FOR_REPLACEABLES)))
        .addMethod(
          getSearchForEquationFamilyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_SEARCH_FOR_EQUATION_FAMILY)))
        .addMethod(
          getSearchForEquationReplaceableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_SEARCH_FOR_EQUATION_REPLACEABLE)))
        .addMethod(
          getSearchForEquationSalesBundleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_SEARCH_FOR_EQUATION_SALES_BUNDLE)))
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
              com.scailo.sdk.FamiliesServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .build();
  }

  private static abstract class FamiliesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FamiliesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.FamiliesScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FamiliesService");
    }
  }

  private static final class FamiliesServiceFileDescriptorSupplier
      extends FamiliesServiceBaseDescriptorSupplier {
    FamiliesServiceFileDescriptorSupplier() {}
  }

  private static final class FamiliesServiceMethodDescriptorSupplier
      extends FamiliesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FamiliesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FamiliesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FamiliesServiceFileDescriptorSupplier())
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
              .addMethod(getCommentAddMethod())
              .addMethod(getAmendMethod())
              .addMethod(getUpdatePriceMethod())
              .addMethod(getUploadPricesMethod())
              .addMethod(getUpdateMinStockToMaintainMethod())
              .addMethod(getUploadMinStockToMaintainMethod())
              .addMethod(getDownloadAsCSVMethod())
              .addMethod(getImportFromCSVMethod())
              .addMethod(getAddStorageMethod())
              .addMethod(getApproveStorageMethod())
              .addMethod(getDeleteStorageMethod())
              .addMethod(getViewStorageByIDMethod())
              .addMethod(getViewStoragesMethod())
              .addMethod(getAddLabelMethod())
              .addMethod(getApproveLabelMethod())
              .addMethod(getDeleteLabelMethod())
              .addMethod(getViewLabelByIDMethod())
              .addMethod(getViewLabelsMethod())
              .addMethod(getViewLabelsForFamilyIDsMethod())
              .addMethod(getAddUnitConversionMethod())
              .addMethod(getApproveUnitConversionMethod())
              .addMethod(getDeleteUnitConversionMethod())
              .addMethod(getViewUnitConversionByIDMethod())
              .addMethod(getViewUnitConversionsMethod())
              .addMethod(getViewUnitConversionForMethod())
              .addMethod(getAddQCGroupMethod())
              .addMethod(getApproveQCGroupMethod())
              .addMethod(getDeleteQCGroupMethod())
              .addMethod(getViewQCGroupByIDMethod())
              .addMethod(getViewQCGroupsMethod())
              .addMethod(getAddImageMethod())
              .addMethod(getUpdateImageMethod())
              .addMethod(getApproveImageMethod())
              .addMethod(getDeleteImageMethod())
              .addMethod(getViewImageByIDMethod())
              .addMethod(getViewImagesMethod())
              .addMethod(getViewPublicImagesMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByCodeMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewAllForEntityUUIDMethod())
              .addMethod(getViewWithPaginationMethod())
              .addMethod(getViewAllRequirableMethod())
              .addMethod(getViewAmendmentsMethod())
              .addMethod(getSearchAllMethod())
              .addMethod(getFilterMethod())
              .addMethod(getSearchForPurchaseMethod())
              .addMethod(getSearchForSaleMethod())
              .addMethod(getSearchForProductionMethod())
              .addMethod(getSearchForReplaceablesMethod())
              .addMethod(getSearchForEquationFamilyMethod())
              .addMethod(getSearchForEquationReplaceableMethod())
              .addMethod(getSearchForEquationSalesBundleMethod())
              .addMethod(getCountInStatusMethod())
              .addMethod(getCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
