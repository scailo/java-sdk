package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each sales return
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: sales_returns.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SalesReturnsServiceGrpc {

  private SalesReturnsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.SalesReturnsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.SalesReturnsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = SalesReturnsServiceGrpc.getCreateMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getCreateMethod = SalesReturnsServiceGrpc.getCreateMethod) == null) {
          SalesReturnsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.SalesReturnsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = SalesReturnsServiceGrpc.getDraftMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getDraftMethod = SalesReturnsServiceGrpc.getDraftMethod) == null) {
          SalesReturnsServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.SalesReturnsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = SalesReturnsServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getDraftUpdateMethod = SalesReturnsServiceGrpc.getDraftUpdateMethod) == null) {
          SalesReturnsServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = SalesReturnsServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getSendForVerificationMethod = SalesReturnsServiceGrpc.getSendForVerificationMethod) == null) {
          SalesReturnsServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = SalesReturnsServiceGrpc.getVerifyMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getVerifyMethod = SalesReturnsServiceGrpc.getVerifyMethod) == null) {
          SalesReturnsServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = SalesReturnsServiceGrpc.getApproveMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getApproveMethod = SalesReturnsServiceGrpc.getApproveMethod) == null) {
          SalesReturnsServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = SalesReturnsServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getSendForRevisionMethod = SalesReturnsServiceGrpc.getSendForRevisionMethod) == null) {
          SalesReturnsServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.SalesReturnsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = SalesReturnsServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getRevisionUpdateMethod = SalesReturnsServiceGrpc.getRevisionUpdateMethod) == null) {
          SalesReturnsServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = SalesReturnsServiceGrpc.getHaltMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getHaltMethod = SalesReturnsServiceGrpc.getHaltMethod) == null) {
          SalesReturnsServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = SalesReturnsServiceGrpc.getDiscardMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getDiscardMethod = SalesReturnsServiceGrpc.getDiscardMethod) == null) {
          SalesReturnsServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = SalesReturnsServiceGrpc.getRestoreMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getRestoreMethod = SalesReturnsServiceGrpc.getRestoreMethod) == null) {
          SalesReturnsServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = SalesReturnsServiceGrpc.getCompleteMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getCompleteMethod = SalesReturnsServiceGrpc.getCompleteMethod) == null) {
          SalesReturnsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = SalesReturnsServiceGrpc.getRepeatMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getRepeatMethod = SalesReturnsServiceGrpc.getRepeatMethod) == null) {
          SalesReturnsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getReopenMethod = SalesReturnsServiceGrpc.getReopenMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getReopenMethod = SalesReturnsServiceGrpc.getReopenMethod) == null) {
          SalesReturnsServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getCommentAddMethod = SalesReturnsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getCommentAddMethod = SalesReturnsServiceGrpc.getCommentAddMethod) == null) {
          SalesReturnsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getSendEmailMethod = SalesReturnsServiceGrpc.getSendEmailMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getSendEmailMethod = SalesReturnsServiceGrpc.getSendEmailMethod) == null) {
          SalesReturnsServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
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
    if ((getIsCompletableMethod = SalesReturnsServiceGrpc.getIsCompletableMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getIsCompletableMethod = SalesReturnsServiceGrpc.getIsCompletableMethod) == null) {
          SalesReturnsServiceGrpc.getIsCompletableMethod = getIsCompletableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsCompletable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("IsCompletable"))
              .build();
        }
      }
    }
    return getIsCompletableMethod;
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
    if ((getCreateMagicLinkMethod = SalesReturnsServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = SalesReturnsServiceGrpc.getCreateMagicLinkMethod) == null) {
          SalesReturnsServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("CreateMagicLink"))
              .build();
        }
      }
    }
    return getCreateMagicLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSalesReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSalesReturnItem",
      requestType = com.scailo.sdk.SalesReturnsServiceItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSalesReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddSalesReturnItemMethod;
    if ((getAddSalesReturnItemMethod = SalesReturnsServiceGrpc.getAddSalesReturnItemMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getAddSalesReturnItemMethod = SalesReturnsServiceGrpc.getAddSalesReturnItemMethod) == null) {
          SalesReturnsServiceGrpc.getAddSalesReturnItemMethod = getAddSalesReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSalesReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("AddSalesReturnItem"))
              .build();
        }
      }
    }
    return getAddSalesReturnItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySalesReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifySalesReturnItem",
      requestType = com.scailo.sdk.SalesReturnsServiceItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySalesReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifySalesReturnItemMethod;
    if ((getModifySalesReturnItemMethod = SalesReturnsServiceGrpc.getModifySalesReturnItemMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getModifySalesReturnItemMethod = SalesReturnsServiceGrpc.getModifySalesReturnItemMethod) == null) {
          SalesReturnsServiceGrpc.getModifySalesReturnItemMethod = getModifySalesReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifySalesReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ModifySalesReturnItem"))
              .build();
        }
      }
    }
    return getModifySalesReturnItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSalesReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveSalesReturnItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSalesReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveSalesReturnItemMethod;
    if ((getApproveSalesReturnItemMethod = SalesReturnsServiceGrpc.getApproveSalesReturnItemMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getApproveSalesReturnItemMethod = SalesReturnsServiceGrpc.getApproveSalesReturnItemMethod) == null) {
          SalesReturnsServiceGrpc.getApproveSalesReturnItemMethod = getApproveSalesReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveSalesReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ApproveSalesReturnItem"))
              .build();
        }
      }
    }
    return getApproveSalesReturnItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSalesReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSalesReturnItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSalesReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteSalesReturnItemMethod;
    if ((getDeleteSalesReturnItemMethod = SalesReturnsServiceGrpc.getDeleteSalesReturnItemMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getDeleteSalesReturnItemMethod = SalesReturnsServiceGrpc.getDeleteSalesReturnItemMethod) == null) {
          SalesReturnsServiceGrpc.getDeleteSalesReturnItemMethod = getDeleteSalesReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSalesReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("DeleteSalesReturnItem"))
              .build();
        }
      }
    }
    return getDeleteSalesReturnItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSalesReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderSalesReturnItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSalesReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderSalesReturnItemsMethod;
    if ((getReorderSalesReturnItemsMethod = SalesReturnsServiceGrpc.getReorderSalesReturnItemsMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getReorderSalesReturnItemsMethod = SalesReturnsServiceGrpc.getReorderSalesReturnItemsMethod) == null) {
          SalesReturnsServiceGrpc.getReorderSalesReturnItemsMethod = getReorderSalesReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderSalesReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ReorderSalesReturnItems"))
              .build();
        }
      }
    }
    return getReorderSalesReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalesReturnItem> getViewSalesReturnItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSalesReturnItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.SalesReturnItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalesReturnItem> getViewSalesReturnItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.SalesReturnItem> getViewSalesReturnItemByIDMethod;
    if ((getViewSalesReturnItemByIDMethod = SalesReturnsServiceGrpc.getViewSalesReturnItemByIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewSalesReturnItemByIDMethod = SalesReturnsServiceGrpc.getViewSalesReturnItemByIDMethod) == null) {
          SalesReturnsServiceGrpc.getViewSalesReturnItemByIDMethod = getViewSalesReturnItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.SalesReturnItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSalesReturnItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnItem.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewSalesReturnItemByID"))
              .build();
        }
      }
    }
    return getViewSalesReturnItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.SalesReturnItem> getViewSalesReturnItemByInventoryHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSalesReturnItemByInventoryHash",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.SalesReturnItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.SalesReturnItem> getViewSalesReturnItemByInventoryHashMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.SalesReturnItem> getViewSalesReturnItemByInventoryHashMethod;
    if ((getViewSalesReturnItemByInventoryHashMethod = SalesReturnsServiceGrpc.getViewSalesReturnItemByInventoryHashMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewSalesReturnItemByInventoryHashMethod = SalesReturnsServiceGrpc.getViewSalesReturnItemByInventoryHashMethod) == null) {
          SalesReturnsServiceGrpc.getViewSalesReturnItemByInventoryHashMethod = getViewSalesReturnItemByInventoryHashMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.SalesReturnItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSalesReturnItemByInventoryHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnItem.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewSalesReturnItemByInventoryHash"))
              .build();
        }
      }
    }
    return getViewSalesReturnItemByInventoryHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalesReturnsItemsList> getViewApprovedSalesReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedSalesReturnItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SalesReturnsItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalesReturnsItemsList> getViewApprovedSalesReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalesReturnsItemsList> getViewApprovedSalesReturnItemsMethod;
    if ((getViewApprovedSalesReturnItemsMethod = SalesReturnsServiceGrpc.getViewApprovedSalesReturnItemsMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewApprovedSalesReturnItemsMethod = SalesReturnsServiceGrpc.getViewApprovedSalesReturnItemsMethod) == null) {
          SalesReturnsServiceGrpc.getViewApprovedSalesReturnItemsMethod = getViewApprovedSalesReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalesReturnsItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedSalesReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewApprovedSalesReturnItems"))
              .build();
        }
      }
    }
    return getViewApprovedSalesReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalesReturnsItemsList> getViewUnapprovedSalesReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedSalesReturnItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SalesReturnsItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalesReturnsItemsList> getViewUnapprovedSalesReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalesReturnsItemsList> getViewUnapprovedSalesReturnItemsMethod;
    if ((getViewUnapprovedSalesReturnItemsMethod = SalesReturnsServiceGrpc.getViewUnapprovedSalesReturnItemsMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewUnapprovedSalesReturnItemsMethod = SalesReturnsServiceGrpc.getViewUnapprovedSalesReturnItemsMethod) == null) {
          SalesReturnsServiceGrpc.getViewUnapprovedSalesReturnItemsMethod = getViewUnapprovedSalesReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalesReturnsItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedSalesReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewUnapprovedSalesReturnItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedSalesReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemHistoryRequest,
      com.scailo.sdk.SalesReturnsItemsList> getViewSalesReturnItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSalesReturnItemHistory",
      requestType = com.scailo.sdk.SalesReturnItemHistoryRequest.class,
      responseType = com.scailo.sdk.SalesReturnsItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemHistoryRequest,
      com.scailo.sdk.SalesReturnsItemsList> getViewSalesReturnItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemHistoryRequest, com.scailo.sdk.SalesReturnsItemsList> getViewSalesReturnItemHistoryMethod;
    if ((getViewSalesReturnItemHistoryMethod = SalesReturnsServiceGrpc.getViewSalesReturnItemHistoryMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewSalesReturnItemHistoryMethod = SalesReturnsServiceGrpc.getViewSalesReturnItemHistoryMethod) == null) {
          SalesReturnsServiceGrpc.getViewSalesReturnItemHistoryMethod = getViewSalesReturnItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnItemHistoryRequest, com.scailo.sdk.SalesReturnsItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSalesReturnItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewSalesReturnItemHistory"))
              .build();
        }
      }
    }
    return getViewSalesReturnItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemsSearchRequest,
      com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> getViewPaginatedApprovedSalesReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedSalesReturnItems",
      requestType = com.scailo.sdk.SalesReturnItemsSearchRequest.class,
      responseType = com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemsSearchRequest,
      com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> getViewPaginatedApprovedSalesReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemsSearchRequest, com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> getViewPaginatedApprovedSalesReturnItemsMethod;
    if ((getViewPaginatedApprovedSalesReturnItemsMethod = SalesReturnsServiceGrpc.getViewPaginatedApprovedSalesReturnItemsMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewPaginatedApprovedSalesReturnItemsMethod = SalesReturnsServiceGrpc.getViewPaginatedApprovedSalesReturnItemsMethod) == null) {
          SalesReturnsServiceGrpc.getViewPaginatedApprovedSalesReturnItemsMethod = getViewPaginatedApprovedSalesReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnItemsSearchRequest, com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedSalesReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewPaginatedApprovedSalesReturnItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedSalesReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemsSearchRequest,
      com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> getViewPaginatedUnapprovedSalesReturnItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedSalesReturnItems",
      requestType = com.scailo.sdk.SalesReturnItemsSearchRequest.class,
      responseType = com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemsSearchRequest,
      com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> getViewPaginatedUnapprovedSalesReturnItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemsSearchRequest, com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> getViewPaginatedUnapprovedSalesReturnItemsMethod;
    if ((getViewPaginatedUnapprovedSalesReturnItemsMethod = SalesReturnsServiceGrpc.getViewPaginatedUnapprovedSalesReturnItemsMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedSalesReturnItemsMethod = SalesReturnsServiceGrpc.getViewPaginatedUnapprovedSalesReturnItemsMethod) == null) {
          SalesReturnsServiceGrpc.getViewPaginatedUnapprovedSalesReturnItemsMethod = getViewPaginatedUnapprovedSalesReturnItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnItemsSearchRequest, com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedSalesReturnItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedSalesReturnItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedSalesReturnItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemsSearchRequest,
      com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchItemsWithPagination",
      requestType = com.scailo.sdk.SalesReturnItemsSearchRequest.class,
      responseType = com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemsSearchRequest,
      com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemsSearchRequest, com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;
    if ((getSearchItemsWithPaginationMethod = SalesReturnsServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getSearchItemsWithPaginationMethod = SalesReturnsServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
          SalesReturnsServiceGrpc.getSearchItemsWithPaginationMethod = getSearchItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnItemsSearchRequest, com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("SearchItemsWithPagination"))
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
    if ((getDownloadItemsAsCSVMethod = SalesReturnsServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getDownloadItemsAsCSVMethod = SalesReturnsServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
          SalesReturnsServiceGrpc.getDownloadItemsAsCSVMethod = getDownloadItemsAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("DownloadItemsAsCSV"))
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
    if ((getDownloadItemsTemplateAsCSVMethod = SalesReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getDownloadItemsTemplateAsCSVMethod = SalesReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
          SalesReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod = getDownloadItemsTemplateAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsTemplateAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("DownloadItemsTemplateAsCSV"))
              .build();
        }
      }
    }
    return getDownloadItemsTemplateAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalesReturn> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.SalesReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalesReturn> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.SalesReturn> getViewByIDMethod;
    if ((getViewByIDMethod = SalesReturnsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewByIDMethod = SalesReturnsServiceGrpc.getViewByIDMethod) == null) {
          SalesReturnsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.SalesReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturn.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalesReturn> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.SalesReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalesReturn> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalesReturn> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = SalesReturnsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewByUUIDMethod = SalesReturnsServiceGrpc.getViewByUUIDMethod) == null) {
          SalesReturnsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalesReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturn.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.SalesReturn> getViewByReferenceIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByReferenceID",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.SalesReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.SalesReturn> getViewByReferenceIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.SalesReturn> getViewByReferenceIDMethod;
    if ((getViewByReferenceIDMethod = SalesReturnsServiceGrpc.getViewByReferenceIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewByReferenceIDMethod = SalesReturnsServiceGrpc.getViewByReferenceIDMethod) == null) {
          SalesReturnsServiceGrpc.getViewByReferenceIDMethod = getViewByReferenceIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.SalesReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByReferenceID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturn.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewByReferenceID"))
              .build();
        }
      }
    }
    return getViewByReferenceIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalesReturn> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.SalesReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalesReturn> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.SalesReturn> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = SalesReturnsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = SalesReturnsServiceGrpc.getViewEssentialByIDMethod) == null) {
          SalesReturnsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.SalesReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturn.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalesReturn> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.SalesReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalesReturn> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalesReturn> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = SalesReturnsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = SalesReturnsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          SalesReturnsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalesReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturn.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.SalesReturnsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.SalesReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.SalesReturnsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.SalesReturnsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = SalesReturnsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewFromIDsMethod = SalesReturnsServiceGrpc.getViewFromIDsMethod) == null) {
          SalesReturnsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.SalesReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalesReturnAncillaryParameters> getViewAncillaryParametersByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAncillaryParametersByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.SalesReturnAncillaryParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalesReturnAncillaryParameters> getViewAncillaryParametersByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalesReturnAncillaryParameters> getViewAncillaryParametersByUUIDMethod;
    if ((getViewAncillaryParametersByUUIDMethod = SalesReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewAncillaryParametersByUUIDMethod = SalesReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
          SalesReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod = getViewAncillaryParametersByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalesReturnAncillaryParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAncillaryParametersByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnAncillaryParameters.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewAncillaryParametersByUUID"))
              .build();
        }
      }
    }
    return getViewAncillaryParametersByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.SalesReturnsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.SalesReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.SalesReturnsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.SalesReturnsList> getViewAllMethod;
    if ((getViewAllMethod = SalesReturnsServiceGrpc.getViewAllMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewAllMethod = SalesReturnsServiceGrpc.getViewAllMethod) == null) {
          SalesReturnsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.SalesReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalesReturnsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.SalesReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalesReturnsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalesReturnsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = SalesReturnsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = SalesReturnsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          SalesReturnsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalesReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServicePaginationReq,
      com.scailo.sdk.SalesReturnsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.SalesReturnsServicePaginationReq.class,
      responseType = com.scailo.sdk.SalesReturnsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServicePaginationReq,
      com.scailo.sdk.SalesReturnsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServicePaginationReq, com.scailo.sdk.SalesReturnsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = SalesReturnsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = SalesReturnsServiceGrpc.getViewWithPaginationMethod) == null) {
          SalesReturnsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServicePaginationReq, com.scailo.sdk.SalesReturnsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewWithPagination"))
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
    if ((getViewProspectiveFamiliesMethod = SalesReturnsServiceGrpc.getViewProspectiveFamiliesMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewProspectiveFamiliesMethod = SalesReturnsServiceGrpc.getViewProspectiveFamiliesMethod) == null) {
          SalesReturnsServiceGrpc.getViewProspectiveFamiliesMethod = getViewProspectiveFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewProspectiveFamilies"))
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
    if ((getFilterProspectiveFamiliesMethod = SalesReturnsServiceGrpc.getFilterProspectiveFamiliesMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getFilterProspectiveFamiliesMethod = SalesReturnsServiceGrpc.getFilterProspectiveFamiliesMethod) == null) {
          SalesReturnsServiceGrpc.getFilterProspectiveFamiliesMethod = getFilterProspectiveFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterProspectiveFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterFamiliesReqForIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("FilterProspectiveFamilies"))
              .build();
        }
      }
    }
    return getFilterProspectiveFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemProspectiveInfoRequest,
      com.scailo.sdk.SalesReturnsServiceItemCreateRequest> getViewProspectiveSalesReturnItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveSalesReturnItem",
      requestType = com.scailo.sdk.SalesReturnItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.SalesReturnsServiceItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemProspectiveInfoRequest,
      com.scailo.sdk.SalesReturnsServiceItemCreateRequest> getViewProspectiveSalesReturnItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnItemProspectiveInfoRequest, com.scailo.sdk.SalesReturnsServiceItemCreateRequest> getViewProspectiveSalesReturnItemMethod;
    if ((getViewProspectiveSalesReturnItemMethod = SalesReturnsServiceGrpc.getViewProspectiveSalesReturnItemMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewProspectiveSalesReturnItemMethod = SalesReturnsServiceGrpc.getViewProspectiveSalesReturnItemMethod) == null) {
          SalesReturnsServiceGrpc.getViewProspectiveSalesReturnItemMethod = getViewProspectiveSalesReturnItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnItemProspectiveInfoRequest, com.scailo.sdk.SalesReturnsServiceItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveSalesReturnItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewProspectiveSalesReturnItem"))
              .build();
        }
      }
    }
    return getViewProspectiveSalesReturnItemMethod;
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
    if ((getSearchReturnableInventoryMethod = SalesReturnsServiceGrpc.getSearchReturnableInventoryMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getSearchReturnableInventoryMethod = SalesReturnsServiceGrpc.getSearchReturnableInventoryMethod) == null) {
          SalesReturnsServiceGrpc.getSearchReturnableInventoryMethod = getSearchReturnableInventoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchReturnableInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("SearchReturnableInventory"))
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
    if ((getFilterReturnableInventoryMethod = SalesReturnsServiceGrpc.getFilterReturnableInventoryMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getFilterReturnableInventoryMethod = SalesReturnsServiceGrpc.getFilterReturnableInventoryMethod) == null) {
          SalesReturnsServiceGrpc.getFilterReturnableInventoryMethod = getFilterReturnableInventoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterReturnableInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("FilterReturnableInventory"))
              .build();
        }
      }
    }
    return getFilterReturnableInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getViewAssociatedCreditNoteInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAssociatedCreditNoteInfo",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getViewAssociatedCreditNoteInfoMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse> getViewAssociatedCreditNoteInfoMethod;
    if ((getViewAssociatedCreditNoteInfoMethod = SalesReturnsServiceGrpc.getViewAssociatedCreditNoteInfoMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewAssociatedCreditNoteInfoMethod = SalesReturnsServiceGrpc.getViewAssociatedCreditNoteInfoMethod) == null) {
          SalesReturnsServiceGrpc.getViewAssociatedCreditNoteInfoMethod = getViewAssociatedCreditNoteInfoMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAssociatedCreditNoteInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewAssociatedCreditNoteInfo"))
              .build();
        }
      }
    }
    return getViewAssociatedCreditNoteInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsBilledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsBilled",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsBilledMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getIsBilledMethod;
    if ((getIsBilledMethod = SalesReturnsServiceGrpc.getIsBilledMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getIsBilledMethod = SalesReturnsServiceGrpc.getIsBilledMethod) == null) {
          SalesReturnsServiceGrpc.getIsBilledMethod = getIsBilledMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsBilled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("IsBilled"))
              .build();
        }
      }
    }
    return getIsBilledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest,
      com.scailo.sdk.DualQuantitiesResponse> getViewAddedFamilyQuantityForSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAddedFamilyQuantityForSource",
      requestType = com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest.class,
      responseType = com.scailo.sdk.DualQuantitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest,
      com.scailo.sdk.DualQuantitiesResponse> getViewAddedFamilyQuantityForSourceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest, com.scailo.sdk.DualQuantitiesResponse> getViewAddedFamilyQuantityForSourceMethod;
    if ((getViewAddedFamilyQuantityForSourceMethod = SalesReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getViewAddedFamilyQuantityForSourceMethod = SalesReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod) == null) {
          SalesReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod = getViewAddedFamilyQuantityForSourceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest, com.scailo.sdk.DualQuantitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAddedFamilyQuantityForSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.DualQuantitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("ViewAddedFamilyQuantityForSource"))
              .build();
        }
      }
    }
    return getViewAddedFamilyQuantityForSourceMethod;
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
    if ((getIsDownloadableMethod = SalesReturnsServiceGrpc.getIsDownloadableMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getIsDownloadableMethod = SalesReturnsServiceGrpc.getIsDownloadableMethod) == null) {
          SalesReturnsServiceGrpc.getIsDownloadableMethod = getIsDownloadableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDownloadable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("IsDownloadable"))
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
    if ((getDownloadByUUIDMethod = SalesReturnsServiceGrpc.getDownloadByUUIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getDownloadByUUIDMethod = SalesReturnsServiceGrpc.getDownloadByUUIDMethod) == null) {
          SalesReturnsServiceGrpc.getDownloadByUUIDMethod = getDownloadByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("DownloadByUUID"))
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
    if ((getDownloadLabelByUUIDMethod = SalesReturnsServiceGrpc.getDownloadLabelByUUIDMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getDownloadLabelByUUIDMethod = SalesReturnsServiceGrpc.getDownloadLabelByUUIDMethod) == null) {
          SalesReturnsServiceGrpc.getDownloadLabelByUUIDMethod = getDownloadLabelByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadLabelByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("DownloadLabelByUUID"))
              .build();
        }
      }
    }
    return getDownloadLabelByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceSearchAllReq,
      com.scailo.sdk.SalesReturnsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.SalesReturnsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.SalesReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceSearchAllReq,
      com.scailo.sdk.SalesReturnsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceSearchAllReq, com.scailo.sdk.SalesReturnsList> getSearchAllMethod;
    if ((getSearchAllMethod = SalesReturnsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getSearchAllMethod = SalesReturnsServiceGrpc.getSearchAllMethod) == null) {
          SalesReturnsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceSearchAllReq, com.scailo.sdk.SalesReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceFilterReq,
      com.scailo.sdk.SalesReturnsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.SalesReturnsServiceFilterReq.class,
      responseType = com.scailo.sdk.SalesReturnsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceFilterReq,
      com.scailo.sdk.SalesReturnsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceFilterReq, com.scailo.sdk.SalesReturnsList> getFilterMethod;
    if ((getFilterMethod = SalesReturnsServiceGrpc.getFilterMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getFilterMethod = SalesReturnsServiceGrpc.getFilterMethod) == null) {
          SalesReturnsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceFilterReq, com.scailo.sdk.SalesReturnsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = SalesReturnsServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getCountInStatusMethod = SalesReturnsServiceGrpc.getCountInStatusMethod) == null) {
          SalesReturnsServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.SalesReturnsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = SalesReturnsServiceGrpc.getCountMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getCountMethod = SalesReturnsServiceGrpc.getCountMethod) == null) {
          SalesReturnsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.SalesReturnsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalesReturnsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = SalesReturnsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (SalesReturnsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = SalesReturnsServiceGrpc.getDownloadAsCSVMethod) == null) {
          SalesReturnsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalesReturnsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalesReturnsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SalesReturnsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SalesReturnsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalesReturnsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalesReturnsServiceStub>() {
        @java.lang.Override
        public SalesReturnsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalesReturnsServiceStub(channel, callOptions);
        }
      };
    return SalesReturnsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SalesReturnsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalesReturnsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalesReturnsServiceBlockingStub>() {
        @java.lang.Override
        public SalesReturnsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalesReturnsServiceBlockingStub(channel, callOptions);
        }
      };
    return SalesReturnsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SalesReturnsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalesReturnsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalesReturnsServiceFutureStub>() {
        @java.lang.Override
        public SalesReturnsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalesReturnsServiceFutureStub(channel, callOptions);
        }
      };
    return SalesReturnsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each sales return
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.SalesReturnsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.SalesReturnsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.SalesReturnsServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.SalesReturnsServiceUpdateRequest request,
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
     * Checks if the Sales Return can be marked as completed
     * </pre>
     */
    default void isCompletable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsCompletableMethod(), responseObserver);
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
     * Add an item to a sales return
     * </pre>
     */
    default void addSalesReturnItem(com.scailo.sdk.SalesReturnsServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSalesReturnItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a sales return
     * </pre>
     */
    default void modifySalesReturnItem(com.scailo.sdk.SalesReturnsServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifySalesReturnItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a sales return
     * </pre>
     */
    default void approveSalesReturnItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveSalesReturnItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a sales return
     * </pre>
     */
    default void deleteSalesReturnItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSalesReturnItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a sales return
     * </pre>
     */
    default void reorderSalesReturnItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderSalesReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Sales Return Item by ID
     * </pre>
     */
    default void viewSalesReturnItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSalesReturnItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Sales Return Item by Inventory Hash
     * </pre>
     */
    default void viewSalesReturnItemByInventoryHash(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSalesReturnItemByInventoryHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved sales return items for given sales return ID
     * </pre>
     */
    default void viewApprovedSalesReturnItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedSalesReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved sales return items for given sales return ID
     * </pre>
     */
    default void viewUnapprovedSalesReturnItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedSalesReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the sales return item
     * </pre>
     */
    default void viewSalesReturnItemHistory(com.scailo.sdk.SalesReturnItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSalesReturnItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved sales return items for given sales return ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedSalesReturnItems(com.scailo.sdk.SalesReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedSalesReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved sales return items for given sales return ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedSalesReturnItems(com.scailo.sdk.SalesReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedSalesReturnItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through sales return items with pagination
     * </pre>
     */
    default void searchItemsWithPagination(com.scailo.sdk.SalesReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    default void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByReferenceIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    default void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnAncillaryParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAncillaryParametersByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.SalesReturnsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective families for the given sales return
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
     * View prospective sales return item info for the given family ID and sales return ID
     * </pre>
     */
    default void viewProspectiveSalesReturnItem(com.scailo.sdk.SalesReturnItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServiceItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveSalesReturnItemMethod(), responseObserver);
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
     * Other view operations
     * View the associated credit note information that is denoted by the identifier in the response for the goods dispatch that is denoted by the identifier UUID in the request
     * </pre>
     */
    default void viewAssociatedCreditNoteInfo(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAssociatedCreditNoteInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if the Sales Return has been billed
     * </pre>
     */
    default void isBilled(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsBilledMethod(), responseObserver);
    }

    /**
     * <pre>
     * View already added quantities
     * </pre>
     */
    default void viewAddedFamilyQuantityForSource(com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.DualQuantitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAddedFamilyQuantityForSourceMethod(), responseObserver);
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
     * Download sales return with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    default void downloadByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download the label for the sales return with the given IdentifierUUID
     * </pre>
     */
    default void downloadLabelByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadLabelByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.SalesReturnsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.SalesReturnsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
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
    default void count(com.scailo.sdk.SalesReturnsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.SalesReturnsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SalesReturnsService.
   * <pre>
   *Describes the common methods applicable on each sales return
   * </pre>
   */
  public static abstract class SalesReturnsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SalesReturnsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SalesReturnsService.
   * <pre>
   *Describes the common methods applicable on each sales return
   * </pre>
   */
  public static final class SalesReturnsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SalesReturnsServiceStub> {
    private SalesReturnsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesReturnsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalesReturnsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.SalesReturnsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.SalesReturnsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.SalesReturnsServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.SalesReturnsServiceUpdateRequest request,
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
     * Checks if the Sales Return can be marked as completed
     * </pre>
     */
    public void isCompletable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsCompletableMethod(), getCallOptions()), request, responseObserver);
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
     * Add an item to a sales return
     * </pre>
     */
    public void addSalesReturnItem(com.scailo.sdk.SalesReturnsServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSalesReturnItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a sales return
     * </pre>
     */
    public void modifySalesReturnItem(com.scailo.sdk.SalesReturnsServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifySalesReturnItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a sales return
     * </pre>
     */
    public void approveSalesReturnItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveSalesReturnItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a sales return
     * </pre>
     */
    public void deleteSalesReturnItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSalesReturnItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a sales return
     * </pre>
     */
    public void reorderSalesReturnItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderSalesReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Sales Return Item by ID
     * </pre>
     */
    public void viewSalesReturnItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSalesReturnItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Sales Return Item by Inventory Hash
     * </pre>
     */
    public void viewSalesReturnItemByInventoryHash(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSalesReturnItemByInventoryHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved sales return items for given sales return ID
     * </pre>
     */
    public void viewApprovedSalesReturnItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedSalesReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved sales return items for given sales return ID
     * </pre>
     */
    public void viewUnapprovedSalesReturnItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedSalesReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the sales return item
     * </pre>
     */
    public void viewSalesReturnItemHistory(com.scailo.sdk.SalesReturnItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSalesReturnItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved sales return items for given sales return ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedSalesReturnItems(com.scailo.sdk.SalesReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedSalesReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved sales return items for given sales return ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedSalesReturnItems(com.scailo.sdk.SalesReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedSalesReturnItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through sales return items with pagination
     * </pre>
     */
    public void searchItemsWithPagination(com.scailo.sdk.SalesReturnItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnAncillaryParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.SalesReturnsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective families for the given sales return
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
     * View prospective sales return item info for the given family ID and sales return ID
     * </pre>
     */
    public void viewProspectiveSalesReturnItem(com.scailo.sdk.SalesReturnItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServiceItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveSalesReturnItemMethod(), getCallOptions()), request, responseObserver);
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
     * Other view operations
     * View the associated credit note information that is denoted by the identifier in the response for the goods dispatch that is denoted by the identifier UUID in the request
     * </pre>
     */
    public void viewAssociatedCreditNoteInfo(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAssociatedCreditNoteInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if the Sales Return has been billed
     * </pre>
     */
    public void isBilled(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsBilledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View already added quantities
     * </pre>
     */
    public void viewAddedFamilyQuantityForSource(com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.DualQuantitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAddedFamilyQuantityForSourceMethod(), getCallOptions()), request, responseObserver);
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
     * Download sales return with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public void downloadByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download the label for the sales return with the given IdentifierUUID
     * </pre>
     */
    public void downloadLabelByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadLabelByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.SalesReturnsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.SalesReturnsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList> responseObserver) {
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
    public void count(com.scailo.sdk.SalesReturnsServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.SalesReturnsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SalesReturnsService.
   * <pre>
   *Describes the common methods applicable on each sales return
   * </pre>
   */
  public static final class SalesReturnsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SalesReturnsServiceBlockingStub> {
    private SalesReturnsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesReturnsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalesReturnsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.SalesReturnsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.SalesReturnsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.SalesReturnsServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.SalesReturnsServiceUpdateRequest request) {
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
     * Checks if the Sales Return can be marked as completed
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isCompletable(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsCompletableMethod(), getCallOptions(), request);
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
     * Add an item to a sales return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addSalesReturnItem(com.scailo.sdk.SalesReturnsServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSalesReturnItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an item in a sales return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifySalesReturnItem(com.scailo.sdk.SalesReturnsServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifySalesReturnItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an item in a sales return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveSalesReturnItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveSalesReturnItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an item in a sales return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteSalesReturnItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSalesReturnItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a sales return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderSalesReturnItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderSalesReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Sales Return Item by ID
     * </pre>
     */
    public com.scailo.sdk.SalesReturnItem viewSalesReturnItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSalesReturnItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Sales Return Item by Inventory Hash
     * </pre>
     */
    public com.scailo.sdk.SalesReturnItem viewSalesReturnItemByInventoryHash(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSalesReturnItemByInventoryHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved sales return items for given sales return ID
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsItemsList viewApprovedSalesReturnItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedSalesReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved sales return items for given sales return ID
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsItemsList viewUnapprovedSalesReturnItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedSalesReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the sales return item
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsItemsList viewSalesReturnItemHistory(com.scailo.sdk.SalesReturnItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSalesReturnItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved sales return items for given sales return ID with pagination
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse viewPaginatedApprovedSalesReturnItems(com.scailo.sdk.SalesReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedSalesReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved sales return items for given sales return ID with pagination
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse viewPaginatedUnapprovedSalesReturnItems(com.scailo.sdk.SalesReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedSalesReturnItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through sales return items with pagination
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse searchItemsWithPagination(com.scailo.sdk.SalesReturnItemsSearchRequest request) {
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
    public com.scailo.sdk.SalesReturn viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.SalesReturn viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.scailo.sdk.SalesReturn viewByReferenceID(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByReferenceIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.SalesReturn viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.SalesReturn viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.scailo.sdk.SalesReturnAncillaryParameters viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAncillaryParametersByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsServicePaginationResponse viewWithPagination(com.scailo.sdk.SalesReturnsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective families for the given sales return
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
     * View prospective sales return item info for the given family ID and sales return ID
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsServiceItemCreateRequest viewProspectiveSalesReturnItem(com.scailo.sdk.SalesReturnItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveSalesReturnItemMethod(), getCallOptions(), request);
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
     * Other view operations
     * View the associated credit note information that is denoted by the identifier in the response for the goods dispatch that is denoted by the identifier UUID in the request
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse viewAssociatedCreditNoteInfo(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAssociatedCreditNoteInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if the Sales Return has been billed
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isBilled(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsBilledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View already added quantities
     * </pre>
     */
    public com.scailo.sdk.DualQuantitiesResponse viewAddedFamilyQuantityForSource(com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAddedFamilyQuantityForSourceMethod(), getCallOptions(), request);
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
     * Download sales return with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download the label for the sales return with the given IdentifierUUID
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadLabelByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadLabelByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsList searchAll(com.scailo.sdk.SalesReturnsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.SalesReturnsList filter(com.scailo.sdk.SalesReturnsServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.SalesReturnsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.SalesReturnsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SalesReturnsService.
   * <pre>
   *Describes the common methods applicable on each sales return
   * </pre>
   */
  public static final class SalesReturnsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SalesReturnsServiceFutureStub> {
    private SalesReturnsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesReturnsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalesReturnsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.SalesReturnsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.SalesReturnsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.SalesReturnsServiceUpdateRequest request) {
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
        com.scailo.sdk.SalesReturnsServiceUpdateRequest request) {
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
     * Checks if the Sales Return can be marked as completed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isCompletable(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsCompletableMethod(), getCallOptions()), request);
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
     * Add an item to a sales return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addSalesReturnItem(
        com.scailo.sdk.SalesReturnsServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSalesReturnItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an item in a sales return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifySalesReturnItem(
        com.scailo.sdk.SalesReturnsServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifySalesReturnItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an item in a sales return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveSalesReturnItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveSalesReturnItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an item in a sales return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteSalesReturnItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSalesReturnItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a sales return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderSalesReturnItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderSalesReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Sales Return Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnItem> viewSalesReturnItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSalesReturnItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Sales Return Item by Inventory Hash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnItem> viewSalesReturnItemByInventoryHash(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSalesReturnItemByInventoryHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved sales return items for given sales return ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsItemsList> viewApprovedSalesReturnItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedSalesReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved sales return items for given sales return ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsItemsList> viewUnapprovedSalesReturnItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedSalesReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the sales return item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsItemsList> viewSalesReturnItemHistory(
        com.scailo.sdk.SalesReturnItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSalesReturnItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved sales return items for given sales return ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> viewPaginatedApprovedSalesReturnItems(
        com.scailo.sdk.SalesReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedSalesReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved sales return items for given sales return ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> viewPaginatedUnapprovedSalesReturnItems(
        com.scailo.sdk.SalesReturnItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedSalesReturnItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through sales return items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse> searchItemsWithPagination(
        com.scailo.sdk.SalesReturnItemsSearchRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturn> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturn> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturn> viewByReferenceID(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturn> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturn> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnAncillaryParameters> viewAncillaryParametersByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.SalesReturnsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective families for the given sales return
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
     * View prospective sales return item info for the given family ID and sales return ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsServiceItemCreateRequest> viewProspectiveSalesReturnItem(
        com.scailo.sdk.SalesReturnItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveSalesReturnItemMethod(), getCallOptions()), request);
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
     * Other view operations
     * View the associated credit note information that is denoted by the identifier in the response for the goods dispatch that is denoted by the identifier UUID in the request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> viewAssociatedCreditNoteInfo(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAssociatedCreditNoteInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if the Sales Return has been billed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isBilled(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsBilledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View already added quantities
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.DualQuantitiesResponse> viewAddedFamilyQuantityForSource(
        com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAddedFamilyQuantityForSourceMethod(), getCallOptions()), request);
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
     * Download sales return with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download the label for the sales return with the given IdentifierUUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadLabelByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadLabelByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsList> searchAll(
        com.scailo.sdk.SalesReturnsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalesReturnsList> filter(
        com.scailo.sdk.SalesReturnsServiceFilterReq request) {
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
        com.scailo.sdk.SalesReturnsServiceCountReq request) {
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
        com.scailo.sdk.SalesReturnsServiceFilterReq request) {
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
  private static final int METHODID_IS_COMPLETABLE = 16;
  private static final int METHODID_CREATE_MAGIC_LINK = 17;
  private static final int METHODID_ADD_SALES_RETURN_ITEM = 18;
  private static final int METHODID_MODIFY_SALES_RETURN_ITEM = 19;
  private static final int METHODID_APPROVE_SALES_RETURN_ITEM = 20;
  private static final int METHODID_DELETE_SALES_RETURN_ITEM = 21;
  private static final int METHODID_REORDER_SALES_RETURN_ITEMS = 22;
  private static final int METHODID_VIEW_SALES_RETURN_ITEM_BY_ID = 23;
  private static final int METHODID_VIEW_SALES_RETURN_ITEM_BY_INVENTORY_HASH = 24;
  private static final int METHODID_VIEW_APPROVED_SALES_RETURN_ITEMS = 25;
  private static final int METHODID_VIEW_UNAPPROVED_SALES_RETURN_ITEMS = 26;
  private static final int METHODID_VIEW_SALES_RETURN_ITEM_HISTORY = 27;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_SALES_RETURN_ITEMS = 28;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_SALES_RETURN_ITEMS = 29;
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
  private static final int METHODID_VIEW_PROSPECTIVE_SALES_RETURN_ITEM = 45;
  private static final int METHODID_SEARCH_RETURNABLE_INVENTORY = 46;
  private static final int METHODID_FILTER_RETURNABLE_INVENTORY = 47;
  private static final int METHODID_VIEW_ASSOCIATED_CREDIT_NOTE_INFO = 48;
  private static final int METHODID_IS_BILLED = 49;
  private static final int METHODID_VIEW_ADDED_FAMILY_QUANTITY_FOR_SOURCE = 50;
  private static final int METHODID_IS_DOWNLOADABLE = 51;
  private static final int METHODID_DOWNLOAD_BY_UUID = 52;
  private static final int METHODID_DOWNLOAD_LABEL_BY_UUID = 53;
  private static final int METHODID_SEARCH_ALL = 54;
  private static final int METHODID_FILTER = 55;
  private static final int METHODID_COUNT_IN_STATUS = 56;
  private static final int METHODID_COUNT = 57;
  private static final int METHODID_DOWNLOAD_AS_CSV = 58;

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
          serviceImpl.create((com.scailo.sdk.SalesReturnsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.SalesReturnsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.SalesReturnsServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.SalesReturnsServiceUpdateRequest) request,
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
        case METHODID_IS_COMPLETABLE:
          serviceImpl.isCompletable((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_CREATE_MAGIC_LINK:
          serviceImpl.createMagicLink((com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink>) responseObserver);
          break;
        case METHODID_ADD_SALES_RETURN_ITEM:
          serviceImpl.addSalesReturnItem((com.scailo.sdk.SalesReturnsServiceItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_SALES_RETURN_ITEM:
          serviceImpl.modifySalesReturnItem((com.scailo.sdk.SalesReturnsServiceItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_SALES_RETURN_ITEM:
          serviceImpl.approveSalesReturnItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_SALES_RETURN_ITEM:
          serviceImpl.deleteSalesReturnItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_SALES_RETURN_ITEMS:
          serviceImpl.reorderSalesReturnItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_SALES_RETURN_ITEM_BY_ID:
          serviceImpl.viewSalesReturnItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnItem>) responseObserver);
          break;
        case METHODID_VIEW_SALES_RETURN_ITEM_BY_INVENTORY_HASH:
          serviceImpl.viewSalesReturnItemByInventoryHash((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_SALES_RETURN_ITEMS:
          serviceImpl.viewApprovedSalesReturnItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_SALES_RETURN_ITEMS:
          serviceImpl.viewUnapprovedSalesReturnItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsItemsList>) responseObserver);
          break;
        case METHODID_VIEW_SALES_RETURN_ITEM_HISTORY:
          serviceImpl.viewSalesReturnItemHistory((com.scailo.sdk.SalesReturnItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_SALES_RETURN_ITEMS:
          serviceImpl.viewPaginatedApprovedSalesReturnItems((com.scailo.sdk.SalesReturnItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_SALES_RETURN_ITEMS:
          serviceImpl.viewPaginatedUnapprovedSalesReturnItems((com.scailo.sdk.SalesReturnItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ITEMS_WITH_PAGINATION:
          serviceImpl.searchItemsWithPagination((com.scailo.sdk.SalesReturnItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn>) responseObserver);
          break;
        case METHODID_VIEW_BY_REFERENCE_ID:
          serviceImpl.viewByReferenceID((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturn>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList>) responseObserver);
          break;
        case METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID:
          serviceImpl.viewAncillaryParametersByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnAncillaryParameters>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.SalesReturnsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_FAMILIES:
          serviceImpl.viewProspectiveFamilies((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER_PROSPECTIVE_FAMILIES:
          serviceImpl.filterProspectiveFamilies((com.scailo.sdk.FilterFamiliesReqForIdentifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_SALES_RETURN_ITEM:
          serviceImpl.viewProspectiveSalesReturnItem((com.scailo.sdk.SalesReturnItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsServiceItemCreateRequest>) responseObserver);
          break;
        case METHODID_SEARCH_RETURNABLE_INVENTORY:
          serviceImpl.searchReturnableInventory((com.scailo.sdk.SearchReturnableInventoryForIdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_FILTER_RETURNABLE_INVENTORY:
          serviceImpl.filterReturnableInventory((com.scailo.sdk.FilterReturnableInventoryForIdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_ASSOCIATED_CREDIT_NOTE_INFO:
          serviceImpl.viewAssociatedCreditNoteInfo((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_IS_BILLED:
          serviceImpl.isBilled((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_VIEW_ADDED_FAMILY_QUANTITY_FOR_SOURCE:
          serviceImpl.viewAddedFamilyQuantityForSource((com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.DualQuantitiesResponse>) responseObserver);
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
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.SalesReturnsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.SalesReturnsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalesReturnsList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.SalesReturnsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.SalesReturnsServiceFilterReq) request,
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
              com.scailo.sdk.SalesReturnsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnsServiceUpdateRequest,
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
              com.scailo.sdk.SalesReturnsServiceUpdateRequest,
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
          getIsCompletableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_IS_COMPLETABLE)))
        .addMethod(
          getCreateMagicLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
              com.scailo.sdk.MagicLink>(
                service, METHODID_CREATE_MAGIC_LINK)))
        .addMethod(
          getAddSalesReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnsServiceItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_SALES_RETURN_ITEM)))
        .addMethod(
          getModifySalesReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnsServiceItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_SALES_RETURN_ITEM)))
        .addMethod(
          getApproveSalesReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_SALES_RETURN_ITEM)))
        .addMethod(
          getDeleteSalesReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_SALES_RETURN_ITEM)))
        .addMethod(
          getReorderSalesReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_SALES_RETURN_ITEMS)))
        .addMethod(
          getViewSalesReturnItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.SalesReturnItem>(
                service, METHODID_VIEW_SALES_RETURN_ITEM_BY_ID)))
        .addMethod(
          getViewSalesReturnItemByInventoryHashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.SalesReturnItem>(
                service, METHODID_VIEW_SALES_RETURN_ITEM_BY_INVENTORY_HASH)))
        .addMethod(
          getViewApprovedSalesReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SalesReturnsItemsList>(
                service, METHODID_VIEW_APPROVED_SALES_RETURN_ITEMS)))
        .addMethod(
          getViewUnapprovedSalesReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SalesReturnsItemsList>(
                service, METHODID_VIEW_UNAPPROVED_SALES_RETURN_ITEMS)))
        .addMethod(
          getViewSalesReturnItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnItemHistoryRequest,
              com.scailo.sdk.SalesReturnsItemsList>(
                service, METHODID_VIEW_SALES_RETURN_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedSalesReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnItemsSearchRequest,
              com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_SALES_RETURN_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedSalesReturnItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnItemsSearchRequest,
              com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_SALES_RETURN_ITEMS)))
        .addMethod(
          getSearchItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnItemsSearchRequest,
              com.scailo.sdk.SalesReturnsServicePaginatedItemsResponse>(
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
              com.scailo.sdk.SalesReturn>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.SalesReturn>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewByReferenceIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.SalesReturn>(
                service, METHODID_VIEW_BY_REFERENCE_ID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.SalesReturn>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.SalesReturn>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.SalesReturnsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAncillaryParametersByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.SalesReturnAncillaryParameters>(
                service, METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.SalesReturnsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.SalesReturnsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnsServicePaginationReq,
              com.scailo.sdk.SalesReturnsServicePaginationResponse>(
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
          getViewProspectiveSalesReturnItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnItemProspectiveInfoRequest,
              com.scailo.sdk.SalesReturnsServiceItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_SALES_RETURN_ITEM)))
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
          getViewAssociatedCreditNoteInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_VIEW_ASSOCIATED_CREDIT_NOTE_INFO)))
        .addMethod(
          getIsBilledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_IS_BILLED)))
        .addMethod(
          getViewAddedFamilyQuantityForSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnsServiceAlreadyAddedQuantityForSourceRequest,
              com.scailo.sdk.DualQuantitiesResponse>(
                service, METHODID_VIEW_ADDED_FAMILY_QUANTITY_FOR_SOURCE)))
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
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnsServiceSearchAllReq,
              com.scailo.sdk.SalesReturnsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnsServiceFilterReq,
              com.scailo.sdk.SalesReturnsList>(
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
              com.scailo.sdk.SalesReturnsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalesReturnsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class SalesReturnsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SalesReturnsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.SalesReturnsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SalesReturnsService");
    }
  }

  private static final class SalesReturnsServiceFileDescriptorSupplier
      extends SalesReturnsServiceBaseDescriptorSupplier {
    SalesReturnsServiceFileDescriptorSupplier() {}
  }

  private static final class SalesReturnsServiceMethodDescriptorSupplier
      extends SalesReturnsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SalesReturnsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SalesReturnsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SalesReturnsServiceFileDescriptorSupplier())
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
              .addMethod(getIsCompletableMethod())
              .addMethod(getCreateMagicLinkMethod())
              .addMethod(getAddSalesReturnItemMethod())
              .addMethod(getModifySalesReturnItemMethod())
              .addMethod(getApproveSalesReturnItemMethod())
              .addMethod(getDeleteSalesReturnItemMethod())
              .addMethod(getReorderSalesReturnItemsMethod())
              .addMethod(getViewSalesReturnItemByIDMethod())
              .addMethod(getViewSalesReturnItemByInventoryHashMethod())
              .addMethod(getViewApprovedSalesReturnItemsMethod())
              .addMethod(getViewUnapprovedSalesReturnItemsMethod())
              .addMethod(getViewSalesReturnItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedSalesReturnItemsMethod())
              .addMethod(getViewPaginatedUnapprovedSalesReturnItemsMethod())
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
              .addMethod(getViewProspectiveSalesReturnItemMethod())
              .addMethod(getSearchReturnableInventoryMethod())
              .addMethod(getFilterReturnableInventoryMethod())
              .addMethod(getViewAssociatedCreditNoteInfoMethod())
              .addMethod(getIsBilledMethod())
              .addMethod(getViewAddedFamilyQuantityForSourceMethod())
              .addMethod(getIsDownloadableMethod())
              .addMethod(getDownloadByUUIDMethod())
              .addMethod(getDownloadLabelByUUIDMethod())
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
