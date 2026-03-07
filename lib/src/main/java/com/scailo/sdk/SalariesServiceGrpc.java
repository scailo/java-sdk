package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each salary
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: salaries.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SalariesServiceGrpc {

  private SalariesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.SalariesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.SalariesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = SalariesServiceGrpc.getCreateMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getCreateMethod = SalariesServiceGrpc.getCreateMethod) == null) {
          SalariesServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.SalariesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = SalariesServiceGrpc.getDraftMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getDraftMethod = SalariesServiceGrpc.getDraftMethod) == null) {
          SalariesServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.SalariesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = SalariesServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getDraftUpdateMethod = SalariesServiceGrpc.getDraftUpdateMethod) == null) {
          SalariesServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = SalariesServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getSendForVerificationMethod = SalariesServiceGrpc.getSendForVerificationMethod) == null) {
          SalariesServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = SalariesServiceGrpc.getVerifyMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getVerifyMethod = SalariesServiceGrpc.getVerifyMethod) == null) {
          SalariesServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = SalariesServiceGrpc.getApproveMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getApproveMethod = SalariesServiceGrpc.getApproveMethod) == null) {
          SalariesServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = SalariesServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getSendForRevisionMethod = SalariesServiceGrpc.getSendForRevisionMethod) == null) {
          SalariesServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.SalariesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = SalariesServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getRevisionUpdateMethod = SalariesServiceGrpc.getRevisionUpdateMethod) == null) {
          SalariesServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = SalariesServiceGrpc.getHaltMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getHaltMethod = SalariesServiceGrpc.getHaltMethod) == null) {
          SalariesServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = SalariesServiceGrpc.getDiscardMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getDiscardMethod = SalariesServiceGrpc.getDiscardMethod) == null) {
          SalariesServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = SalariesServiceGrpc.getRestoreMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getRestoreMethod = SalariesServiceGrpc.getRestoreMethod) == null) {
          SalariesServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = SalariesServiceGrpc.getCompleteMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getCompleteMethod = SalariesServiceGrpc.getCompleteMethod) == null) {
          SalariesServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = SalariesServiceGrpc.getRepeatMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getRepeatMethod = SalariesServiceGrpc.getRepeatMethod) == null) {
          SalariesServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getReopenMethod = SalariesServiceGrpc.getReopenMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getReopenMethod = SalariesServiceGrpc.getReopenMethod) == null) {
          SalariesServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getCommentAddMethod = SalariesServiceGrpc.getCommentAddMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getCommentAddMethod = SalariesServiceGrpc.getCommentAddMethod) == null) {
          SalariesServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getSendEmailMethod = SalariesServiceGrpc.getSendEmailMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getSendEmailMethod = SalariesServiceGrpc.getSendEmailMethod) == null) {
          SalariesServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Autofill",
      requestType = com.scailo.sdk.SalariesServiceAutofillRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceAutofillRequest, com.scailo.sdk.IdentifierResponse> getAutofillMethod;
    if ((getAutofillMethod = SalariesServiceGrpc.getAutofillMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getAutofillMethod = SalariesServiceGrpc.getAutofillMethod) == null) {
          SalariesServiceGrpc.getAutofillMethod = getAutofillMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceAutofillRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Autofill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceAutofillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Autofill"))
              .build();
        }
      }
    }
    return getAutofillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceAdditionItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSalaryAdditionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSalaryAdditionItem",
      requestType = com.scailo.sdk.SalariesServiceAdditionItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceAdditionItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSalaryAdditionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceAdditionItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddSalaryAdditionItemMethod;
    if ((getAddSalaryAdditionItemMethod = SalariesServiceGrpc.getAddSalaryAdditionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getAddSalaryAdditionItemMethod = SalariesServiceGrpc.getAddSalaryAdditionItemMethod) == null) {
          SalariesServiceGrpc.getAddSalaryAdditionItemMethod = getAddSalaryAdditionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceAdditionItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSalaryAdditionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceAdditionItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("AddSalaryAdditionItem"))
              .build();
        }
      }
    }
    return getAddSalaryAdditionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySalaryAdditionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifySalaryAdditionItem",
      requestType = com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySalaryAdditionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifySalaryAdditionItemMethod;
    if ((getModifySalaryAdditionItemMethod = SalariesServiceGrpc.getModifySalaryAdditionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getModifySalaryAdditionItemMethod = SalariesServiceGrpc.getModifySalaryAdditionItemMethod) == null) {
          SalariesServiceGrpc.getModifySalaryAdditionItemMethod = getModifySalaryAdditionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifySalaryAdditionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ModifySalaryAdditionItem"))
              .build();
        }
      }
    }
    return getModifySalaryAdditionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSalaryAdditionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveSalaryAdditionItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSalaryAdditionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveSalaryAdditionItemMethod;
    if ((getApproveSalaryAdditionItemMethod = SalariesServiceGrpc.getApproveSalaryAdditionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getApproveSalaryAdditionItemMethod = SalariesServiceGrpc.getApproveSalaryAdditionItemMethod) == null) {
          SalariesServiceGrpc.getApproveSalaryAdditionItemMethod = getApproveSalaryAdditionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveSalaryAdditionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ApproveSalaryAdditionItem"))
              .build();
        }
      }
    }
    return getApproveSalaryAdditionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSalaryAdditionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSalaryAdditionItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSalaryAdditionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteSalaryAdditionItemMethod;
    if ((getDeleteSalaryAdditionItemMethod = SalariesServiceGrpc.getDeleteSalaryAdditionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getDeleteSalaryAdditionItemMethod = SalariesServiceGrpc.getDeleteSalaryAdditionItemMethod) == null) {
          SalariesServiceGrpc.getDeleteSalaryAdditionItemMethod = getDeleteSalaryAdditionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSalaryAdditionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("DeleteSalaryAdditionItem"))
              .build();
        }
      }
    }
    return getDeleteSalaryAdditionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSalaryAdditionItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderSalaryAdditionItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSalaryAdditionItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderSalaryAdditionItemsMethod;
    if ((getReorderSalaryAdditionItemsMethod = SalariesServiceGrpc.getReorderSalaryAdditionItemsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getReorderSalaryAdditionItemsMethod = SalariesServiceGrpc.getReorderSalaryAdditionItemsMethod) == null) {
          SalariesServiceGrpc.getReorderSalaryAdditionItemsMethod = getReorderSalaryAdditionItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderSalaryAdditionItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ReorderSalaryAdditionItems"))
              .build();
        }
      }
    }
    return getReorderSalaryAdditionItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalaryAdditionItem> getViewSalaryAdditionItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSalaryAdditionItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.SalaryAdditionItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalaryAdditionItem> getViewSalaryAdditionItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.SalaryAdditionItem> getViewSalaryAdditionItemByIDMethod;
    if ((getViewSalaryAdditionItemByIDMethod = SalariesServiceGrpc.getViewSalaryAdditionItemByIDMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewSalaryAdditionItemByIDMethod = SalariesServiceGrpc.getViewSalaryAdditionItemByIDMethod) == null) {
          SalariesServiceGrpc.getViewSalaryAdditionItemByIDMethod = getViewSalaryAdditionItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.SalaryAdditionItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSalaryAdditionItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalaryAdditionItem.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewSalaryAdditionItemByID"))
              .build();
        }
      }
    }
    return getViewSalaryAdditionItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesAdditionItemsList> getViewApprovedSalaryAdditionItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedSalaryAdditionItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SalariesAdditionItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesAdditionItemsList> getViewApprovedSalaryAdditionItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesAdditionItemsList> getViewApprovedSalaryAdditionItemsMethod;
    if ((getViewApprovedSalaryAdditionItemsMethod = SalariesServiceGrpc.getViewApprovedSalaryAdditionItemsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewApprovedSalaryAdditionItemsMethod = SalariesServiceGrpc.getViewApprovedSalaryAdditionItemsMethod) == null) {
          SalariesServiceGrpc.getViewApprovedSalaryAdditionItemsMethod = getViewApprovedSalaryAdditionItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesAdditionItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedSalaryAdditionItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesAdditionItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewApprovedSalaryAdditionItems"))
              .build();
        }
      }
    }
    return getViewApprovedSalaryAdditionItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesAdditionItemsList> getViewUnapprovedSalaryAdditionItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedSalaryAdditionItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SalariesAdditionItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesAdditionItemsList> getViewUnapprovedSalaryAdditionItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesAdditionItemsList> getViewUnapprovedSalaryAdditionItemsMethod;
    if ((getViewUnapprovedSalaryAdditionItemsMethod = SalariesServiceGrpc.getViewUnapprovedSalaryAdditionItemsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewUnapprovedSalaryAdditionItemsMethod = SalariesServiceGrpc.getViewUnapprovedSalaryAdditionItemsMethod) == null) {
          SalariesServiceGrpc.getViewUnapprovedSalaryAdditionItemsMethod = getViewUnapprovedSalaryAdditionItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesAdditionItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedSalaryAdditionItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesAdditionItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewUnapprovedSalaryAdditionItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedSalaryAdditionItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalaryAdditionItemHistoryRequest,
      com.scailo.sdk.SalariesAdditionItemsList> getViewSalaryAdditionItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSalaryAdditionItemHistory",
      requestType = com.scailo.sdk.SalaryAdditionItemHistoryRequest.class,
      responseType = com.scailo.sdk.SalariesAdditionItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalaryAdditionItemHistoryRequest,
      com.scailo.sdk.SalariesAdditionItemsList> getViewSalaryAdditionItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalaryAdditionItemHistoryRequest, com.scailo.sdk.SalariesAdditionItemsList> getViewSalaryAdditionItemHistoryMethod;
    if ((getViewSalaryAdditionItemHistoryMethod = SalariesServiceGrpc.getViewSalaryAdditionItemHistoryMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewSalaryAdditionItemHistoryMethod = SalariesServiceGrpc.getViewSalaryAdditionItemHistoryMethod) == null) {
          SalariesServiceGrpc.getViewSalaryAdditionItemHistoryMethod = getViewSalaryAdditionItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalaryAdditionItemHistoryRequest, com.scailo.sdk.SalariesAdditionItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSalaryAdditionItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalaryAdditionItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesAdditionItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewSalaryAdditionItemHistory"))
              .build();
        }
      }
    }
    return getViewSalaryAdditionItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest,
      com.scailo.sdk.SalariesServiceAdditionItemCreateRequest> getViewProspectiveSalaryAdditionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveSalaryAdditionItem",
      requestType = com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.SalariesServiceAdditionItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest,
      com.scailo.sdk.SalariesServiceAdditionItemCreateRequest> getViewProspectiveSalaryAdditionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest, com.scailo.sdk.SalariesServiceAdditionItemCreateRequest> getViewProspectiveSalaryAdditionItemMethod;
    if ((getViewProspectiveSalaryAdditionItemMethod = SalariesServiceGrpc.getViewProspectiveSalaryAdditionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewProspectiveSalaryAdditionItemMethod = SalariesServiceGrpc.getViewProspectiveSalaryAdditionItemMethod) == null) {
          SalariesServiceGrpc.getViewProspectiveSalaryAdditionItemMethod = getViewProspectiveSalaryAdditionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest, com.scailo.sdk.SalariesServiceAdditionItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveSalaryAdditionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceAdditionItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewProspectiveSalaryAdditionItem"))
              .build();
        }
      }
    }
    return getViewProspectiveSalaryAdditionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceDeductionItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSalaryDeductionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSalaryDeductionItem",
      requestType = com.scailo.sdk.SalariesServiceDeductionItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceDeductionItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSalaryDeductionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceDeductionItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddSalaryDeductionItemMethod;
    if ((getAddSalaryDeductionItemMethod = SalariesServiceGrpc.getAddSalaryDeductionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getAddSalaryDeductionItemMethod = SalariesServiceGrpc.getAddSalaryDeductionItemMethod) == null) {
          SalariesServiceGrpc.getAddSalaryDeductionItemMethod = getAddSalaryDeductionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceDeductionItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSalaryDeductionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceDeductionItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("AddSalaryDeductionItem"))
              .build();
        }
      }
    }
    return getAddSalaryDeductionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySalaryDeductionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifySalaryDeductionItem",
      requestType = com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySalaryDeductionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifySalaryDeductionItemMethod;
    if ((getModifySalaryDeductionItemMethod = SalariesServiceGrpc.getModifySalaryDeductionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getModifySalaryDeductionItemMethod = SalariesServiceGrpc.getModifySalaryDeductionItemMethod) == null) {
          SalariesServiceGrpc.getModifySalaryDeductionItemMethod = getModifySalaryDeductionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifySalaryDeductionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ModifySalaryDeductionItem"))
              .build();
        }
      }
    }
    return getModifySalaryDeductionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSalaryDeductionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveSalaryDeductionItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSalaryDeductionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveSalaryDeductionItemMethod;
    if ((getApproveSalaryDeductionItemMethod = SalariesServiceGrpc.getApproveSalaryDeductionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getApproveSalaryDeductionItemMethod = SalariesServiceGrpc.getApproveSalaryDeductionItemMethod) == null) {
          SalariesServiceGrpc.getApproveSalaryDeductionItemMethod = getApproveSalaryDeductionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveSalaryDeductionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ApproveSalaryDeductionItem"))
              .build();
        }
      }
    }
    return getApproveSalaryDeductionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSalaryDeductionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSalaryDeductionItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSalaryDeductionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteSalaryDeductionItemMethod;
    if ((getDeleteSalaryDeductionItemMethod = SalariesServiceGrpc.getDeleteSalaryDeductionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getDeleteSalaryDeductionItemMethod = SalariesServiceGrpc.getDeleteSalaryDeductionItemMethod) == null) {
          SalariesServiceGrpc.getDeleteSalaryDeductionItemMethod = getDeleteSalaryDeductionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSalaryDeductionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("DeleteSalaryDeductionItem"))
              .build();
        }
      }
    }
    return getDeleteSalaryDeductionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSalaryDeductionItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderSalaryDeductionItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSalaryDeductionItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderSalaryDeductionItemsMethod;
    if ((getReorderSalaryDeductionItemsMethod = SalariesServiceGrpc.getReorderSalaryDeductionItemsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getReorderSalaryDeductionItemsMethod = SalariesServiceGrpc.getReorderSalaryDeductionItemsMethod) == null) {
          SalariesServiceGrpc.getReorderSalaryDeductionItemsMethod = getReorderSalaryDeductionItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderSalaryDeductionItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ReorderSalaryDeductionItems"))
              .build();
        }
      }
    }
    return getReorderSalaryDeductionItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalaryDeductionItem> getViewSalaryDeductionItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSalaryDeductionItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.SalaryDeductionItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalaryDeductionItem> getViewSalaryDeductionItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.SalaryDeductionItem> getViewSalaryDeductionItemByIDMethod;
    if ((getViewSalaryDeductionItemByIDMethod = SalariesServiceGrpc.getViewSalaryDeductionItemByIDMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewSalaryDeductionItemByIDMethod = SalariesServiceGrpc.getViewSalaryDeductionItemByIDMethod) == null) {
          SalariesServiceGrpc.getViewSalaryDeductionItemByIDMethod = getViewSalaryDeductionItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.SalaryDeductionItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSalaryDeductionItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalaryDeductionItem.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewSalaryDeductionItemByID"))
              .build();
        }
      }
    }
    return getViewSalaryDeductionItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesDeductionItemsList> getViewApprovedSalaryDeductionItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedSalaryDeductionItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SalariesDeductionItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesDeductionItemsList> getViewApprovedSalaryDeductionItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesDeductionItemsList> getViewApprovedSalaryDeductionItemsMethod;
    if ((getViewApprovedSalaryDeductionItemsMethod = SalariesServiceGrpc.getViewApprovedSalaryDeductionItemsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewApprovedSalaryDeductionItemsMethod = SalariesServiceGrpc.getViewApprovedSalaryDeductionItemsMethod) == null) {
          SalariesServiceGrpc.getViewApprovedSalaryDeductionItemsMethod = getViewApprovedSalaryDeductionItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesDeductionItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedSalaryDeductionItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesDeductionItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewApprovedSalaryDeductionItems"))
              .build();
        }
      }
    }
    return getViewApprovedSalaryDeductionItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesDeductionItemsList> getViewUnapprovedSalaryDeductionItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedSalaryDeductionItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SalariesDeductionItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesDeductionItemsList> getViewUnapprovedSalaryDeductionItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesDeductionItemsList> getViewUnapprovedSalaryDeductionItemsMethod;
    if ((getViewUnapprovedSalaryDeductionItemsMethod = SalariesServiceGrpc.getViewUnapprovedSalaryDeductionItemsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewUnapprovedSalaryDeductionItemsMethod = SalariesServiceGrpc.getViewUnapprovedSalaryDeductionItemsMethod) == null) {
          SalariesServiceGrpc.getViewUnapprovedSalaryDeductionItemsMethod = getViewUnapprovedSalaryDeductionItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesDeductionItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedSalaryDeductionItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesDeductionItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewUnapprovedSalaryDeductionItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedSalaryDeductionItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalaryDeductionItemHistoryRequest,
      com.scailo.sdk.SalariesDeductionItemsList> getViewSalaryDeductionItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSalaryDeductionItemHistory",
      requestType = com.scailo.sdk.SalaryDeductionItemHistoryRequest.class,
      responseType = com.scailo.sdk.SalariesDeductionItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalaryDeductionItemHistoryRequest,
      com.scailo.sdk.SalariesDeductionItemsList> getViewSalaryDeductionItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalaryDeductionItemHistoryRequest, com.scailo.sdk.SalariesDeductionItemsList> getViewSalaryDeductionItemHistoryMethod;
    if ((getViewSalaryDeductionItemHistoryMethod = SalariesServiceGrpc.getViewSalaryDeductionItemHistoryMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewSalaryDeductionItemHistoryMethod = SalariesServiceGrpc.getViewSalaryDeductionItemHistoryMethod) == null) {
          SalariesServiceGrpc.getViewSalaryDeductionItemHistoryMethod = getViewSalaryDeductionItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalaryDeductionItemHistoryRequest, com.scailo.sdk.SalariesDeductionItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSalaryDeductionItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalaryDeductionItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesDeductionItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewSalaryDeductionItemHistory"))
              .build();
        }
      }
    }
    return getViewSalaryDeductionItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest,
      com.scailo.sdk.SalariesServiceDeductionItemCreateRequest> getViewProspectiveSalaryDeductionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveSalaryDeductionItem",
      requestType = com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.SalariesServiceDeductionItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest,
      com.scailo.sdk.SalariesServiceDeductionItemCreateRequest> getViewProspectiveSalaryDeductionItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest, com.scailo.sdk.SalariesServiceDeductionItemCreateRequest> getViewProspectiveSalaryDeductionItemMethod;
    if ((getViewProspectiveSalaryDeductionItemMethod = SalariesServiceGrpc.getViewProspectiveSalaryDeductionItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewProspectiveSalaryDeductionItemMethod = SalariesServiceGrpc.getViewProspectiveSalaryDeductionItemMethod) == null) {
          SalariesServiceGrpc.getViewProspectiveSalaryDeductionItemMethod = getViewProspectiveSalaryDeductionItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest, com.scailo.sdk.SalariesServiceDeductionItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveSalaryDeductionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceDeductionItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewProspectiveSalaryDeductionItem"))
              .build();
        }
      }
    }
    return getViewProspectiveSalaryDeductionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSalaryReimbursementItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSalaryReimbursementItem",
      requestType = com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSalaryReimbursementItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddSalaryReimbursementItemMethod;
    if ((getAddSalaryReimbursementItemMethod = SalariesServiceGrpc.getAddSalaryReimbursementItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getAddSalaryReimbursementItemMethod = SalariesServiceGrpc.getAddSalaryReimbursementItemMethod) == null) {
          SalariesServiceGrpc.getAddSalaryReimbursementItemMethod = getAddSalaryReimbursementItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSalaryReimbursementItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("AddSalaryReimbursementItem"))
              .build();
        }
      }
    }
    return getAddSalaryReimbursementItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySalaryReimbursementItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifySalaryReimbursementItem",
      requestType = com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySalaryReimbursementItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifySalaryReimbursementItemMethod;
    if ((getModifySalaryReimbursementItemMethod = SalariesServiceGrpc.getModifySalaryReimbursementItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getModifySalaryReimbursementItemMethod = SalariesServiceGrpc.getModifySalaryReimbursementItemMethod) == null) {
          SalariesServiceGrpc.getModifySalaryReimbursementItemMethod = getModifySalaryReimbursementItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifySalaryReimbursementItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ModifySalaryReimbursementItem"))
              .build();
        }
      }
    }
    return getModifySalaryReimbursementItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSalaryReimbursementItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveSalaryReimbursementItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSalaryReimbursementItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveSalaryReimbursementItemMethod;
    if ((getApproveSalaryReimbursementItemMethod = SalariesServiceGrpc.getApproveSalaryReimbursementItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getApproveSalaryReimbursementItemMethod = SalariesServiceGrpc.getApproveSalaryReimbursementItemMethod) == null) {
          SalariesServiceGrpc.getApproveSalaryReimbursementItemMethod = getApproveSalaryReimbursementItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveSalaryReimbursementItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ApproveSalaryReimbursementItem"))
              .build();
        }
      }
    }
    return getApproveSalaryReimbursementItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSalaryReimbursementItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSalaryReimbursementItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSalaryReimbursementItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteSalaryReimbursementItemMethod;
    if ((getDeleteSalaryReimbursementItemMethod = SalariesServiceGrpc.getDeleteSalaryReimbursementItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getDeleteSalaryReimbursementItemMethod = SalariesServiceGrpc.getDeleteSalaryReimbursementItemMethod) == null) {
          SalariesServiceGrpc.getDeleteSalaryReimbursementItemMethod = getDeleteSalaryReimbursementItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSalaryReimbursementItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("DeleteSalaryReimbursementItem"))
              .build();
        }
      }
    }
    return getDeleteSalaryReimbursementItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSalaryReimbursementItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderSalaryReimbursementItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSalaryReimbursementItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderSalaryReimbursementItemsMethod;
    if ((getReorderSalaryReimbursementItemsMethod = SalariesServiceGrpc.getReorderSalaryReimbursementItemsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getReorderSalaryReimbursementItemsMethod = SalariesServiceGrpc.getReorderSalaryReimbursementItemsMethod) == null) {
          SalariesServiceGrpc.getReorderSalaryReimbursementItemsMethod = getReorderSalaryReimbursementItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderSalaryReimbursementItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ReorderSalaryReimbursementItems"))
              .build();
        }
      }
    }
    return getReorderSalaryReimbursementItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalaryReimbursementItem> getViewSalaryReimbursementItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSalaryReimbursementItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.SalaryReimbursementItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SalaryReimbursementItem> getViewSalaryReimbursementItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.SalaryReimbursementItem> getViewSalaryReimbursementItemByIDMethod;
    if ((getViewSalaryReimbursementItemByIDMethod = SalariesServiceGrpc.getViewSalaryReimbursementItemByIDMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewSalaryReimbursementItemByIDMethod = SalariesServiceGrpc.getViewSalaryReimbursementItemByIDMethod) == null) {
          SalariesServiceGrpc.getViewSalaryReimbursementItemByIDMethod = getViewSalaryReimbursementItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.SalaryReimbursementItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSalaryReimbursementItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalaryReimbursementItem.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewSalaryReimbursementItemByID"))
              .build();
        }
      }
    }
    return getViewSalaryReimbursementItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesReimbursementItemsList> getViewApprovedSalaryReimbursementItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedSalaryReimbursementItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SalariesReimbursementItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesReimbursementItemsList> getViewApprovedSalaryReimbursementItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesReimbursementItemsList> getViewApprovedSalaryReimbursementItemsMethod;
    if ((getViewApprovedSalaryReimbursementItemsMethod = SalariesServiceGrpc.getViewApprovedSalaryReimbursementItemsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewApprovedSalaryReimbursementItemsMethod = SalariesServiceGrpc.getViewApprovedSalaryReimbursementItemsMethod) == null) {
          SalariesServiceGrpc.getViewApprovedSalaryReimbursementItemsMethod = getViewApprovedSalaryReimbursementItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesReimbursementItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedSalaryReimbursementItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesReimbursementItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewApprovedSalaryReimbursementItems"))
              .build();
        }
      }
    }
    return getViewApprovedSalaryReimbursementItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesReimbursementItemsList> getViewUnapprovedSalaryReimbursementItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedSalaryReimbursementItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SalariesReimbursementItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SalariesReimbursementItemsList> getViewUnapprovedSalaryReimbursementItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesReimbursementItemsList> getViewUnapprovedSalaryReimbursementItemsMethod;
    if ((getViewUnapprovedSalaryReimbursementItemsMethod = SalariesServiceGrpc.getViewUnapprovedSalaryReimbursementItemsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewUnapprovedSalaryReimbursementItemsMethod = SalariesServiceGrpc.getViewUnapprovedSalaryReimbursementItemsMethod) == null) {
          SalariesServiceGrpc.getViewUnapprovedSalaryReimbursementItemsMethod = getViewUnapprovedSalaryReimbursementItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SalariesReimbursementItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedSalaryReimbursementItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesReimbursementItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewUnapprovedSalaryReimbursementItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedSalaryReimbursementItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalaryReimbursementItemHistoryRequest,
      com.scailo.sdk.SalariesReimbursementItemsList> getViewSalaryReimbursementItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSalaryReimbursementItemHistory",
      requestType = com.scailo.sdk.SalaryReimbursementItemHistoryRequest.class,
      responseType = com.scailo.sdk.SalariesReimbursementItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalaryReimbursementItemHistoryRequest,
      com.scailo.sdk.SalariesReimbursementItemsList> getViewSalaryReimbursementItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalaryReimbursementItemHistoryRequest, com.scailo.sdk.SalariesReimbursementItemsList> getViewSalaryReimbursementItemHistoryMethod;
    if ((getViewSalaryReimbursementItemHistoryMethod = SalariesServiceGrpc.getViewSalaryReimbursementItemHistoryMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewSalaryReimbursementItemHistoryMethod = SalariesServiceGrpc.getViewSalaryReimbursementItemHistoryMethod) == null) {
          SalariesServiceGrpc.getViewSalaryReimbursementItemHistoryMethod = getViewSalaryReimbursementItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalaryReimbursementItemHistoryRequest, com.scailo.sdk.SalariesReimbursementItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSalaryReimbursementItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalaryReimbursementItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesReimbursementItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewSalaryReimbursementItemHistory"))
              .build();
        }
      }
    }
    return getViewSalaryReimbursementItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest,
      com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest> getViewProspectiveSalaryReimbursementItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveSalaryReimbursementItem",
      requestType = com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest,
      com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest> getViewProspectiveSalaryReimbursementItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest, com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest> getViewProspectiveSalaryReimbursementItemMethod;
    if ((getViewProspectiveSalaryReimbursementItemMethod = SalariesServiceGrpc.getViewProspectiveSalaryReimbursementItemMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewProspectiveSalaryReimbursementItemMethod = SalariesServiceGrpc.getViewProspectiveSalaryReimbursementItemMethod) == null) {
          SalariesServiceGrpc.getViewProspectiveSalaryReimbursementItemMethod = getViewProspectiveSalaryReimbursementItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest, com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveSalaryReimbursementItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewProspectiveSalaryReimbursementItem"))
              .build();
        }
      }
    }
    return getViewProspectiveSalaryReimbursementItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Salary> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Salary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Salary> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Salary> getViewByIDMethod;
    if ((getViewByIDMethod = SalariesServiceGrpc.getViewByIDMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewByIDMethod = SalariesServiceGrpc.getViewByIDMethod) == null) {
          SalariesServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Salary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Salary.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Salary> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Salary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Salary> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Salary> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = SalariesServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewByUUIDMethod = SalariesServiceGrpc.getViewByUUIDMethod) == null) {
          SalariesServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Salary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Salary.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Salary> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Salary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Salary> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Salary> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = SalariesServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = SalariesServiceGrpc.getViewEssentialByIDMethod) == null) {
          SalariesServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Salary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Salary.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Salary> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Salary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Salary> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Salary> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = SalariesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = SalariesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          SalariesServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Salary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Salary.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.SalariesList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.SalariesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.SalariesList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.SalariesList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = SalariesServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewFromIDsMethod = SalariesServiceGrpc.getViewFromIDsMethod) == null) {
          SalariesServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.SalariesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.SalariesList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.SalariesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.SalariesList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.SalariesList> getViewAllMethod;
    if ((getViewAllMethod = SalariesServiceGrpc.getViewAllMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewAllMethod = SalariesServiceGrpc.getViewAllMethod) == null) {
          SalariesServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.SalariesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalariesList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.SalariesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SalariesList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalariesList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = SalariesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = SalariesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          SalariesServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SalariesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServicePaginationReq,
      com.scailo.sdk.SalariesServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.SalariesServicePaginationReq.class,
      responseType = com.scailo.sdk.SalariesServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServicePaginationReq,
      com.scailo.sdk.SalariesServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServicePaginationReq, com.scailo.sdk.SalariesServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = SalariesServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getViewWithPaginationMethod = SalariesServiceGrpc.getViewWithPaginationMethod) == null) {
          SalariesServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServicePaginationReq, com.scailo.sdk.SalariesServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceSearchAllReq,
      com.scailo.sdk.SalariesList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.SalariesServiceSearchAllReq.class,
      responseType = com.scailo.sdk.SalariesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceSearchAllReq,
      com.scailo.sdk.SalariesList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceSearchAllReq, com.scailo.sdk.SalariesList> getSearchAllMethod;
    if ((getSearchAllMethod = SalariesServiceGrpc.getSearchAllMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getSearchAllMethod = SalariesServiceGrpc.getSearchAllMethod) == null) {
          SalariesServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceSearchAllReq, com.scailo.sdk.SalariesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceFilterReq,
      com.scailo.sdk.SalariesList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.SalariesServiceFilterReq.class,
      responseType = com.scailo.sdk.SalariesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceFilterReq,
      com.scailo.sdk.SalariesList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceFilterReq, com.scailo.sdk.SalariesList> getFilterMethod;
    if ((getFilterMethod = SalariesServiceGrpc.getFilterMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getFilterMethod = SalariesServiceGrpc.getFilterMethod) == null) {
          SalariesServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceFilterReq, com.scailo.sdk.SalariesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesList.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = SalariesServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getCountInStatusMethod = SalariesServiceGrpc.getCountInStatusMethod) == null) {
          SalariesServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.SalariesServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = SalariesServiceGrpc.getCountMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getCountMethod = SalariesServiceGrpc.getCountMethod) == null) {
          SalariesServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.SalariesServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SalariesServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = SalariesServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (SalariesServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = SalariesServiceGrpc.getDownloadAsCSVMethod) == null) {
          SalariesServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SalariesServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SalariesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SalariesServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SalariesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalariesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalariesServiceStub>() {
        @java.lang.Override
        public SalariesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalariesServiceStub(channel, callOptions);
        }
      };
    return SalariesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SalariesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalariesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalariesServiceBlockingStub>() {
        @java.lang.Override
        public SalariesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalariesServiceBlockingStub(channel, callOptions);
        }
      };
    return SalariesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SalariesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalariesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalariesServiceFutureStub>() {
        @java.lang.Override
        public SalariesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalariesServiceFutureStub(channel, callOptions);
        }
      };
    return SalariesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each salary
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.SalariesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.SalariesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.SalariesServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.SalariesServiceUpdateRequest request,
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
     * Autofill the salary
     * </pre>
     */
    default void autofill(com.scailo.sdk.SalariesServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAutofillMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an addition item to a salary
     * </pre>
     */
    default void addSalaryAdditionItem(com.scailo.sdk.SalariesServiceAdditionItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSalaryAdditionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an addition item in a salary
     * </pre>
     */
    default void modifySalaryAdditionItem(com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifySalaryAdditionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an addition item in a salary
     * </pre>
     */
    default void approveSalaryAdditionItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveSalaryAdditionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an addition item in a salary
     * </pre>
     */
    default void deleteSalaryAdditionItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSalaryAdditionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder addition items in a salary
     * </pre>
     */
    default void reorderSalaryAdditionItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderSalaryAdditionItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Salary Addition Item by ID
     * </pre>
     */
    default void viewSalaryAdditionItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalaryAdditionItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSalaryAdditionItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved salary addition items for given salary ID
     * </pre>
     */
    default void viewApprovedSalaryAdditionItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesAdditionItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedSalaryAdditionItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved salary addition items for given salary ID
     * </pre>
     */
    default void viewUnapprovedSalaryAdditionItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesAdditionItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedSalaryAdditionItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the salary addition item
     * </pre>
     */
    default void viewSalaryAdditionItemHistory(com.scailo.sdk.SalaryAdditionItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesAdditionItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSalaryAdditionItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective addition item info
     * </pre>
     */
    default void viewProspectiveSalaryAdditionItem(com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServiceAdditionItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveSalaryAdditionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an deduction item to a salary
     * </pre>
     */
    default void addSalaryDeductionItem(com.scailo.sdk.SalariesServiceDeductionItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSalaryDeductionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an deduction item in a salary
     * </pre>
     */
    default void modifySalaryDeductionItem(com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifySalaryDeductionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an deduction item in a salary
     * </pre>
     */
    default void approveSalaryDeductionItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveSalaryDeductionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an deduction item in a salary
     * </pre>
     */
    default void deleteSalaryDeductionItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSalaryDeductionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder deduction items in a salary
     * </pre>
     */
    default void reorderSalaryDeductionItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderSalaryDeductionItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Salary Deduction Item by ID
     * </pre>
     */
    default void viewSalaryDeductionItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalaryDeductionItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSalaryDeductionItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved salary deduction items for given salary ID
     * </pre>
     */
    default void viewApprovedSalaryDeductionItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesDeductionItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedSalaryDeductionItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved salary deduction items for given salary ID
     * </pre>
     */
    default void viewUnapprovedSalaryDeductionItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesDeductionItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedSalaryDeductionItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the salary deduction item
     * </pre>
     */
    default void viewSalaryDeductionItemHistory(com.scailo.sdk.SalaryDeductionItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesDeductionItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSalaryDeductionItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective deduction item info
     * </pre>
     */
    default void viewProspectiveSalaryDeductionItem(com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServiceDeductionItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveSalaryDeductionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an reimbursement item to a salary
     * </pre>
     */
    default void addSalaryReimbursementItem(com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSalaryReimbursementItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an reimbursement item in a salary
     * </pre>
     */
    default void modifySalaryReimbursementItem(com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifySalaryReimbursementItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an reimbursement item in a salary
     * </pre>
     */
    default void approveSalaryReimbursementItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveSalaryReimbursementItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an reimbursement item in a salary
     * </pre>
     */
    default void deleteSalaryReimbursementItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSalaryReimbursementItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder reimbursement items in a salary
     * </pre>
     */
    default void reorderSalaryReimbursementItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderSalaryReimbursementItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Salary Reimbursement Item by ID
     * </pre>
     */
    default void viewSalaryReimbursementItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalaryReimbursementItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSalaryReimbursementItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved salary reimbursement items for given salary ID
     * </pre>
     */
    default void viewApprovedSalaryReimbursementItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesReimbursementItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedSalaryReimbursementItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved salary reimbursement items for given salary ID
     * </pre>
     */
    default void viewUnapprovedSalaryReimbursementItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesReimbursementItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedSalaryReimbursementItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the salary reimbursement item
     * </pre>
     */
    default void viewSalaryReimbursementItemHistory(com.scailo.sdk.SalaryReimbursementItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesReimbursementItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSalaryReimbursementItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective reimbursement item info
     * </pre>
     */
    default void viewProspectiveSalaryReimbursementItem(com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveSalaryReimbursementItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Salary> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Salary> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Salary> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Salary> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.SalariesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.SalariesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.SalariesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
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
    default void count(com.scailo.sdk.SalariesServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.SalariesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SalariesService.
   * <pre>
   *Describes the common methods applicable on each salary
   * </pre>
   */
  public static abstract class SalariesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SalariesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SalariesService.
   * <pre>
   *Describes the common methods applicable on each salary
   * </pre>
   */
  public static final class SalariesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SalariesServiceStub> {
    private SalariesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalariesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalariesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.SalariesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.SalariesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.SalariesServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.SalariesServiceUpdateRequest request,
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
     * Autofill the salary
     * </pre>
     */
    public void autofill(com.scailo.sdk.SalariesServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an addition item to a salary
     * </pre>
     */
    public void addSalaryAdditionItem(com.scailo.sdk.SalariesServiceAdditionItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSalaryAdditionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an addition item in a salary
     * </pre>
     */
    public void modifySalaryAdditionItem(com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifySalaryAdditionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an addition item in a salary
     * </pre>
     */
    public void approveSalaryAdditionItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveSalaryAdditionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an addition item in a salary
     * </pre>
     */
    public void deleteSalaryAdditionItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSalaryAdditionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder addition items in a salary
     * </pre>
     */
    public void reorderSalaryAdditionItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderSalaryAdditionItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Salary Addition Item by ID
     * </pre>
     */
    public void viewSalaryAdditionItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalaryAdditionItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSalaryAdditionItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved salary addition items for given salary ID
     * </pre>
     */
    public void viewApprovedSalaryAdditionItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesAdditionItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedSalaryAdditionItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved salary addition items for given salary ID
     * </pre>
     */
    public void viewUnapprovedSalaryAdditionItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesAdditionItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedSalaryAdditionItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the salary addition item
     * </pre>
     */
    public void viewSalaryAdditionItemHistory(com.scailo.sdk.SalaryAdditionItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesAdditionItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSalaryAdditionItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective addition item info
     * </pre>
     */
    public void viewProspectiveSalaryAdditionItem(com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServiceAdditionItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveSalaryAdditionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an deduction item to a salary
     * </pre>
     */
    public void addSalaryDeductionItem(com.scailo.sdk.SalariesServiceDeductionItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSalaryDeductionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an deduction item in a salary
     * </pre>
     */
    public void modifySalaryDeductionItem(com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifySalaryDeductionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an deduction item in a salary
     * </pre>
     */
    public void approveSalaryDeductionItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveSalaryDeductionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an deduction item in a salary
     * </pre>
     */
    public void deleteSalaryDeductionItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSalaryDeductionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder deduction items in a salary
     * </pre>
     */
    public void reorderSalaryDeductionItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderSalaryDeductionItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Salary Deduction Item by ID
     * </pre>
     */
    public void viewSalaryDeductionItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalaryDeductionItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSalaryDeductionItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved salary deduction items for given salary ID
     * </pre>
     */
    public void viewApprovedSalaryDeductionItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesDeductionItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedSalaryDeductionItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved salary deduction items for given salary ID
     * </pre>
     */
    public void viewUnapprovedSalaryDeductionItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesDeductionItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedSalaryDeductionItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the salary deduction item
     * </pre>
     */
    public void viewSalaryDeductionItemHistory(com.scailo.sdk.SalaryDeductionItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesDeductionItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSalaryDeductionItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective deduction item info
     * </pre>
     */
    public void viewProspectiveSalaryDeductionItem(com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServiceDeductionItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveSalaryDeductionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an reimbursement item to a salary
     * </pre>
     */
    public void addSalaryReimbursementItem(com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSalaryReimbursementItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an reimbursement item in a salary
     * </pre>
     */
    public void modifySalaryReimbursementItem(com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifySalaryReimbursementItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an reimbursement item in a salary
     * </pre>
     */
    public void approveSalaryReimbursementItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveSalaryReimbursementItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an reimbursement item in a salary
     * </pre>
     */
    public void deleteSalaryReimbursementItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSalaryReimbursementItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder reimbursement items in a salary
     * </pre>
     */
    public void reorderSalaryReimbursementItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderSalaryReimbursementItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Salary Reimbursement Item by ID
     * </pre>
     */
    public void viewSalaryReimbursementItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalaryReimbursementItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSalaryReimbursementItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved salary reimbursement items for given salary ID
     * </pre>
     */
    public void viewApprovedSalaryReimbursementItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesReimbursementItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedSalaryReimbursementItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved salary reimbursement items for given salary ID
     * </pre>
     */
    public void viewUnapprovedSalaryReimbursementItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesReimbursementItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedSalaryReimbursementItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the salary reimbursement item
     * </pre>
     */
    public void viewSalaryReimbursementItemHistory(com.scailo.sdk.SalaryReimbursementItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesReimbursementItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSalaryReimbursementItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective reimbursement item info
     * </pre>
     */
    public void viewProspectiveSalaryReimbursementItem(com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveSalaryReimbursementItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Salary> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Salary> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Salary> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Salary> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.SalariesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.SalariesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.SalariesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList> responseObserver) {
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
    public void count(com.scailo.sdk.SalariesServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.SalariesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SalariesService.
   * <pre>
   *Describes the common methods applicable on each salary
   * </pre>
   */
  public static final class SalariesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SalariesServiceBlockingStub> {
    private SalariesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalariesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalariesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.SalariesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.SalariesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.SalariesServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.SalariesServiceUpdateRequest request) {
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
     * Autofill the salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse autofill(com.scailo.sdk.SalariesServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAutofillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an addition item to a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addSalaryAdditionItem(com.scailo.sdk.SalariesServiceAdditionItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSalaryAdditionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an addition item in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifySalaryAdditionItem(com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifySalaryAdditionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an addition item in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveSalaryAdditionItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveSalaryAdditionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an addition item in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteSalaryAdditionItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSalaryAdditionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder addition items in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderSalaryAdditionItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderSalaryAdditionItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Salary Addition Item by ID
     * </pre>
     */
    public com.scailo.sdk.SalaryAdditionItem viewSalaryAdditionItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSalaryAdditionItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved salary addition items for given salary ID
     * </pre>
     */
    public com.scailo.sdk.SalariesAdditionItemsList viewApprovedSalaryAdditionItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedSalaryAdditionItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved salary addition items for given salary ID
     * </pre>
     */
    public com.scailo.sdk.SalariesAdditionItemsList viewUnapprovedSalaryAdditionItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedSalaryAdditionItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the salary addition item
     * </pre>
     */
    public com.scailo.sdk.SalariesAdditionItemsList viewSalaryAdditionItemHistory(com.scailo.sdk.SalaryAdditionItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSalaryAdditionItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective addition item info
     * </pre>
     */
    public com.scailo.sdk.SalariesServiceAdditionItemCreateRequest viewProspectiveSalaryAdditionItem(com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveSalaryAdditionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an deduction item to a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addSalaryDeductionItem(com.scailo.sdk.SalariesServiceDeductionItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSalaryDeductionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an deduction item in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifySalaryDeductionItem(com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifySalaryDeductionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an deduction item in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveSalaryDeductionItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveSalaryDeductionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an deduction item in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteSalaryDeductionItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSalaryDeductionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder deduction items in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderSalaryDeductionItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderSalaryDeductionItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Salary Deduction Item by ID
     * </pre>
     */
    public com.scailo.sdk.SalaryDeductionItem viewSalaryDeductionItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSalaryDeductionItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved salary deduction items for given salary ID
     * </pre>
     */
    public com.scailo.sdk.SalariesDeductionItemsList viewApprovedSalaryDeductionItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedSalaryDeductionItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved salary deduction items for given salary ID
     * </pre>
     */
    public com.scailo.sdk.SalariesDeductionItemsList viewUnapprovedSalaryDeductionItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedSalaryDeductionItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the salary deduction item
     * </pre>
     */
    public com.scailo.sdk.SalariesDeductionItemsList viewSalaryDeductionItemHistory(com.scailo.sdk.SalaryDeductionItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSalaryDeductionItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective deduction item info
     * </pre>
     */
    public com.scailo.sdk.SalariesServiceDeductionItemCreateRequest viewProspectiveSalaryDeductionItem(com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveSalaryDeductionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an reimbursement item to a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addSalaryReimbursementItem(com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSalaryReimbursementItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an reimbursement item in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifySalaryReimbursementItem(com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifySalaryReimbursementItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an reimbursement item in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveSalaryReimbursementItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveSalaryReimbursementItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an reimbursement item in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteSalaryReimbursementItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSalaryReimbursementItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder reimbursement items in a salary
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderSalaryReimbursementItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderSalaryReimbursementItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Salary Reimbursement Item by ID
     * </pre>
     */
    public com.scailo.sdk.SalaryReimbursementItem viewSalaryReimbursementItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSalaryReimbursementItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved salary reimbursement items for given salary ID
     * </pre>
     */
    public com.scailo.sdk.SalariesReimbursementItemsList viewApprovedSalaryReimbursementItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedSalaryReimbursementItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved salary reimbursement items for given salary ID
     * </pre>
     */
    public com.scailo.sdk.SalariesReimbursementItemsList viewUnapprovedSalaryReimbursementItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedSalaryReimbursementItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the salary reimbursement item
     * </pre>
     */
    public com.scailo.sdk.SalariesReimbursementItemsList viewSalaryReimbursementItemHistory(com.scailo.sdk.SalaryReimbursementItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSalaryReimbursementItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective reimbursement item info
     * </pre>
     */
    public com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest viewProspectiveSalaryReimbursementItem(com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveSalaryReimbursementItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.Salary viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.Salary viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.Salary viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.Salary viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.SalariesList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.SalariesList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.SalariesList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.SalariesServicePaginationResponse viewWithPagination(com.scailo.sdk.SalariesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.SalariesList searchAll(com.scailo.sdk.SalariesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.SalariesList filter(com.scailo.sdk.SalariesServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.SalariesServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.SalariesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SalariesService.
   * <pre>
   *Describes the common methods applicable on each salary
   * </pre>
   */
  public static final class SalariesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SalariesServiceFutureStub> {
    private SalariesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalariesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalariesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.SalariesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.SalariesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.SalariesServiceUpdateRequest request) {
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
        com.scailo.sdk.SalariesServiceUpdateRequest request) {
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
     * Autofill the salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> autofill(
        com.scailo.sdk.SalariesServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an addition item to a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addSalaryAdditionItem(
        com.scailo.sdk.SalariesServiceAdditionItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSalaryAdditionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an addition item in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifySalaryAdditionItem(
        com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifySalaryAdditionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an addition item in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveSalaryAdditionItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveSalaryAdditionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an addition item in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteSalaryAdditionItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSalaryAdditionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder addition items in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderSalaryAdditionItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderSalaryAdditionItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Salary Addition Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalaryAdditionItem> viewSalaryAdditionItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSalaryAdditionItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved salary addition items for given salary ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesAdditionItemsList> viewApprovedSalaryAdditionItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedSalaryAdditionItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved salary addition items for given salary ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesAdditionItemsList> viewUnapprovedSalaryAdditionItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedSalaryAdditionItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the salary addition item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesAdditionItemsList> viewSalaryAdditionItemHistory(
        com.scailo.sdk.SalaryAdditionItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSalaryAdditionItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective addition item info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesServiceAdditionItemCreateRequest> viewProspectiveSalaryAdditionItem(
        com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveSalaryAdditionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an deduction item to a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addSalaryDeductionItem(
        com.scailo.sdk.SalariesServiceDeductionItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSalaryDeductionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an deduction item in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifySalaryDeductionItem(
        com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifySalaryDeductionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an deduction item in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveSalaryDeductionItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveSalaryDeductionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an deduction item in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteSalaryDeductionItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSalaryDeductionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder deduction items in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderSalaryDeductionItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderSalaryDeductionItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Salary Deduction Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalaryDeductionItem> viewSalaryDeductionItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSalaryDeductionItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved salary deduction items for given salary ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesDeductionItemsList> viewApprovedSalaryDeductionItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedSalaryDeductionItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved salary deduction items for given salary ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesDeductionItemsList> viewUnapprovedSalaryDeductionItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedSalaryDeductionItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the salary deduction item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesDeductionItemsList> viewSalaryDeductionItemHistory(
        com.scailo.sdk.SalaryDeductionItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSalaryDeductionItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective deduction item info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesServiceDeductionItemCreateRequest> viewProspectiveSalaryDeductionItem(
        com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveSalaryDeductionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an reimbursement item to a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addSalaryReimbursementItem(
        com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSalaryReimbursementItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an reimbursement item in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifySalaryReimbursementItem(
        com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifySalaryReimbursementItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an reimbursement item in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveSalaryReimbursementItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveSalaryReimbursementItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an reimbursement item in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteSalaryReimbursementItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSalaryReimbursementItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder reimbursement items in a salary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderSalaryReimbursementItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderSalaryReimbursementItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Salary Reimbursement Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalaryReimbursementItem> viewSalaryReimbursementItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSalaryReimbursementItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved salary reimbursement items for given salary ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesReimbursementItemsList> viewApprovedSalaryReimbursementItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedSalaryReimbursementItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved salary reimbursement items for given salary ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesReimbursementItemsList> viewUnapprovedSalaryReimbursementItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedSalaryReimbursementItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the salary reimbursement item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesReimbursementItemsList> viewSalaryReimbursementItemHistory(
        com.scailo.sdk.SalaryReimbursementItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSalaryReimbursementItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective reimbursement item info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest> viewProspectiveSalaryReimbursementItem(
        com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveSalaryReimbursementItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Salary> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Salary> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Salary> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Salary> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.SalariesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesList> searchAll(
        com.scailo.sdk.SalariesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SalariesList> filter(
        com.scailo.sdk.SalariesServiceFilterReq request) {
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
        com.scailo.sdk.SalariesServiceCountReq request) {
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
        com.scailo.sdk.SalariesServiceFilterReq request) {
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
  private static final int METHODID_AUTOFILL = 16;
  private static final int METHODID_ADD_SALARY_ADDITION_ITEM = 17;
  private static final int METHODID_MODIFY_SALARY_ADDITION_ITEM = 18;
  private static final int METHODID_APPROVE_SALARY_ADDITION_ITEM = 19;
  private static final int METHODID_DELETE_SALARY_ADDITION_ITEM = 20;
  private static final int METHODID_REORDER_SALARY_ADDITION_ITEMS = 21;
  private static final int METHODID_VIEW_SALARY_ADDITION_ITEM_BY_ID = 22;
  private static final int METHODID_VIEW_APPROVED_SALARY_ADDITION_ITEMS = 23;
  private static final int METHODID_VIEW_UNAPPROVED_SALARY_ADDITION_ITEMS = 24;
  private static final int METHODID_VIEW_SALARY_ADDITION_ITEM_HISTORY = 25;
  private static final int METHODID_VIEW_PROSPECTIVE_SALARY_ADDITION_ITEM = 26;
  private static final int METHODID_ADD_SALARY_DEDUCTION_ITEM = 27;
  private static final int METHODID_MODIFY_SALARY_DEDUCTION_ITEM = 28;
  private static final int METHODID_APPROVE_SALARY_DEDUCTION_ITEM = 29;
  private static final int METHODID_DELETE_SALARY_DEDUCTION_ITEM = 30;
  private static final int METHODID_REORDER_SALARY_DEDUCTION_ITEMS = 31;
  private static final int METHODID_VIEW_SALARY_DEDUCTION_ITEM_BY_ID = 32;
  private static final int METHODID_VIEW_APPROVED_SALARY_DEDUCTION_ITEMS = 33;
  private static final int METHODID_VIEW_UNAPPROVED_SALARY_DEDUCTION_ITEMS = 34;
  private static final int METHODID_VIEW_SALARY_DEDUCTION_ITEM_HISTORY = 35;
  private static final int METHODID_VIEW_PROSPECTIVE_SALARY_DEDUCTION_ITEM = 36;
  private static final int METHODID_ADD_SALARY_REIMBURSEMENT_ITEM = 37;
  private static final int METHODID_MODIFY_SALARY_REIMBURSEMENT_ITEM = 38;
  private static final int METHODID_APPROVE_SALARY_REIMBURSEMENT_ITEM = 39;
  private static final int METHODID_DELETE_SALARY_REIMBURSEMENT_ITEM = 40;
  private static final int METHODID_REORDER_SALARY_REIMBURSEMENT_ITEMS = 41;
  private static final int METHODID_VIEW_SALARY_REIMBURSEMENT_ITEM_BY_ID = 42;
  private static final int METHODID_VIEW_APPROVED_SALARY_REIMBURSEMENT_ITEMS = 43;
  private static final int METHODID_VIEW_UNAPPROVED_SALARY_REIMBURSEMENT_ITEMS = 44;
  private static final int METHODID_VIEW_SALARY_REIMBURSEMENT_ITEM_HISTORY = 45;
  private static final int METHODID_VIEW_PROSPECTIVE_SALARY_REIMBURSEMENT_ITEM = 46;
  private static final int METHODID_VIEW_BY_ID = 47;
  private static final int METHODID_VIEW_BY_UUID = 48;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 49;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 50;
  private static final int METHODID_VIEW_FROM_IDS = 51;
  private static final int METHODID_VIEW_ALL = 52;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 53;
  private static final int METHODID_VIEW_WITH_PAGINATION = 54;
  private static final int METHODID_SEARCH_ALL = 55;
  private static final int METHODID_FILTER = 56;
  private static final int METHODID_COUNT_IN_STATUS = 57;
  private static final int METHODID_COUNT = 58;
  private static final int METHODID_DOWNLOAD_AS_CSV = 59;

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
          serviceImpl.create((com.scailo.sdk.SalariesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.SalariesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.SalariesServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.SalariesServiceUpdateRequest) request,
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
        case METHODID_AUTOFILL:
          serviceImpl.autofill((com.scailo.sdk.SalariesServiceAutofillRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_SALARY_ADDITION_ITEM:
          serviceImpl.addSalaryAdditionItem((com.scailo.sdk.SalariesServiceAdditionItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_SALARY_ADDITION_ITEM:
          serviceImpl.modifySalaryAdditionItem((com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_SALARY_ADDITION_ITEM:
          serviceImpl.approveSalaryAdditionItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_SALARY_ADDITION_ITEM:
          serviceImpl.deleteSalaryAdditionItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_SALARY_ADDITION_ITEMS:
          serviceImpl.reorderSalaryAdditionItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_SALARY_ADDITION_ITEM_BY_ID:
          serviceImpl.viewSalaryAdditionItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalaryAdditionItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_SALARY_ADDITION_ITEMS:
          serviceImpl.viewApprovedSalaryAdditionItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesAdditionItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_SALARY_ADDITION_ITEMS:
          serviceImpl.viewUnapprovedSalaryAdditionItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesAdditionItemsList>) responseObserver);
          break;
        case METHODID_VIEW_SALARY_ADDITION_ITEM_HISTORY:
          serviceImpl.viewSalaryAdditionItemHistory((com.scailo.sdk.SalaryAdditionItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesAdditionItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_SALARY_ADDITION_ITEM:
          serviceImpl.viewProspectiveSalaryAdditionItem((com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServiceAdditionItemCreateRequest>) responseObserver);
          break;
        case METHODID_ADD_SALARY_DEDUCTION_ITEM:
          serviceImpl.addSalaryDeductionItem((com.scailo.sdk.SalariesServiceDeductionItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_SALARY_DEDUCTION_ITEM:
          serviceImpl.modifySalaryDeductionItem((com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_SALARY_DEDUCTION_ITEM:
          serviceImpl.approveSalaryDeductionItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_SALARY_DEDUCTION_ITEM:
          serviceImpl.deleteSalaryDeductionItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_SALARY_DEDUCTION_ITEMS:
          serviceImpl.reorderSalaryDeductionItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_SALARY_DEDUCTION_ITEM_BY_ID:
          serviceImpl.viewSalaryDeductionItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalaryDeductionItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_SALARY_DEDUCTION_ITEMS:
          serviceImpl.viewApprovedSalaryDeductionItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesDeductionItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_SALARY_DEDUCTION_ITEMS:
          serviceImpl.viewUnapprovedSalaryDeductionItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesDeductionItemsList>) responseObserver);
          break;
        case METHODID_VIEW_SALARY_DEDUCTION_ITEM_HISTORY:
          serviceImpl.viewSalaryDeductionItemHistory((com.scailo.sdk.SalaryDeductionItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesDeductionItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_SALARY_DEDUCTION_ITEM:
          serviceImpl.viewProspectiveSalaryDeductionItem((com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServiceDeductionItemCreateRequest>) responseObserver);
          break;
        case METHODID_ADD_SALARY_REIMBURSEMENT_ITEM:
          serviceImpl.addSalaryReimbursementItem((com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_SALARY_REIMBURSEMENT_ITEM:
          serviceImpl.modifySalaryReimbursementItem((com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_SALARY_REIMBURSEMENT_ITEM:
          serviceImpl.approveSalaryReimbursementItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_SALARY_REIMBURSEMENT_ITEM:
          serviceImpl.deleteSalaryReimbursementItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_SALARY_REIMBURSEMENT_ITEMS:
          serviceImpl.reorderSalaryReimbursementItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_SALARY_REIMBURSEMENT_ITEM_BY_ID:
          serviceImpl.viewSalaryReimbursementItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalaryReimbursementItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_SALARY_REIMBURSEMENT_ITEMS:
          serviceImpl.viewApprovedSalaryReimbursementItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesReimbursementItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_SALARY_REIMBURSEMENT_ITEMS:
          serviceImpl.viewUnapprovedSalaryReimbursementItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesReimbursementItemsList>) responseObserver);
          break;
        case METHODID_VIEW_SALARY_REIMBURSEMENT_ITEM_HISTORY:
          serviceImpl.viewSalaryReimbursementItemHistory((com.scailo.sdk.SalaryReimbursementItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesReimbursementItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_SALARY_REIMBURSEMENT_ITEM:
          serviceImpl.viewProspectiveSalaryReimbursementItem((com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Salary>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Salary>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Salary>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Salary>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.SalariesServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesServicePaginationResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.SalariesServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.SalariesServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SalariesList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.SalariesServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.SalariesServiceFilterReq) request,
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
              com.scailo.sdk.SalariesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceUpdateRequest,
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
              com.scailo.sdk.SalariesServiceUpdateRequest,
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
          getAutofillMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceAutofillRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_AUTOFILL)))
        .addMethod(
          getAddSalaryAdditionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceAdditionItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_SALARY_ADDITION_ITEM)))
        .addMethod(
          getModifySalaryAdditionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceAdditionItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_SALARY_ADDITION_ITEM)))
        .addMethod(
          getApproveSalaryAdditionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_SALARY_ADDITION_ITEM)))
        .addMethod(
          getDeleteSalaryAdditionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_SALARY_ADDITION_ITEM)))
        .addMethod(
          getReorderSalaryAdditionItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_SALARY_ADDITION_ITEMS)))
        .addMethod(
          getViewSalaryAdditionItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.SalaryAdditionItem>(
                service, METHODID_VIEW_SALARY_ADDITION_ITEM_BY_ID)))
        .addMethod(
          getViewApprovedSalaryAdditionItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SalariesAdditionItemsList>(
                service, METHODID_VIEW_APPROVED_SALARY_ADDITION_ITEMS)))
        .addMethod(
          getViewUnapprovedSalaryAdditionItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SalariesAdditionItemsList>(
                service, METHODID_VIEW_UNAPPROVED_SALARY_ADDITION_ITEMS)))
        .addMethod(
          getViewSalaryAdditionItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalaryAdditionItemHistoryRequest,
              com.scailo.sdk.SalariesAdditionItemsList>(
                service, METHODID_VIEW_SALARY_ADDITION_ITEM_HISTORY)))
        .addMethod(
          getViewProspectiveSalaryAdditionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalaryAdditionItemProspectiveInfoRequest,
              com.scailo.sdk.SalariesServiceAdditionItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_SALARY_ADDITION_ITEM)))
        .addMethod(
          getAddSalaryDeductionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceDeductionItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_SALARY_DEDUCTION_ITEM)))
        .addMethod(
          getModifySalaryDeductionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceDeductionItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_SALARY_DEDUCTION_ITEM)))
        .addMethod(
          getApproveSalaryDeductionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_SALARY_DEDUCTION_ITEM)))
        .addMethod(
          getDeleteSalaryDeductionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_SALARY_DEDUCTION_ITEM)))
        .addMethod(
          getReorderSalaryDeductionItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_SALARY_DEDUCTION_ITEMS)))
        .addMethod(
          getViewSalaryDeductionItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.SalaryDeductionItem>(
                service, METHODID_VIEW_SALARY_DEDUCTION_ITEM_BY_ID)))
        .addMethod(
          getViewApprovedSalaryDeductionItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SalariesDeductionItemsList>(
                service, METHODID_VIEW_APPROVED_SALARY_DEDUCTION_ITEMS)))
        .addMethod(
          getViewUnapprovedSalaryDeductionItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SalariesDeductionItemsList>(
                service, METHODID_VIEW_UNAPPROVED_SALARY_DEDUCTION_ITEMS)))
        .addMethod(
          getViewSalaryDeductionItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalaryDeductionItemHistoryRequest,
              com.scailo.sdk.SalariesDeductionItemsList>(
                service, METHODID_VIEW_SALARY_DEDUCTION_ITEM_HISTORY)))
        .addMethod(
          getViewProspectiveSalaryDeductionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalaryDeductionItemProspectiveInfoRequest,
              com.scailo.sdk.SalariesServiceDeductionItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_SALARY_DEDUCTION_ITEM)))
        .addMethod(
          getAddSalaryReimbursementItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_SALARY_REIMBURSEMENT_ITEM)))
        .addMethod(
          getModifySalaryReimbursementItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceReimbursementItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_SALARY_REIMBURSEMENT_ITEM)))
        .addMethod(
          getApproveSalaryReimbursementItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_SALARY_REIMBURSEMENT_ITEM)))
        .addMethod(
          getDeleteSalaryReimbursementItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_SALARY_REIMBURSEMENT_ITEM)))
        .addMethod(
          getReorderSalaryReimbursementItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_SALARY_REIMBURSEMENT_ITEMS)))
        .addMethod(
          getViewSalaryReimbursementItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.SalaryReimbursementItem>(
                service, METHODID_VIEW_SALARY_REIMBURSEMENT_ITEM_BY_ID)))
        .addMethod(
          getViewApprovedSalaryReimbursementItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SalariesReimbursementItemsList>(
                service, METHODID_VIEW_APPROVED_SALARY_REIMBURSEMENT_ITEMS)))
        .addMethod(
          getViewUnapprovedSalaryReimbursementItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SalariesReimbursementItemsList>(
                service, METHODID_VIEW_UNAPPROVED_SALARY_REIMBURSEMENT_ITEMS)))
        .addMethod(
          getViewSalaryReimbursementItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalaryReimbursementItemHistoryRequest,
              com.scailo.sdk.SalariesReimbursementItemsList>(
                service, METHODID_VIEW_SALARY_REIMBURSEMENT_ITEM_HISTORY)))
        .addMethod(
          getViewProspectiveSalaryReimbursementItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalaryReimbursementItemProspectiveInfoRequest,
              com.scailo.sdk.SalariesServiceReimbursementItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_SALARY_REIMBURSEMENT_ITEM)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Salary>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Salary>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Salary>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Salary>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.SalariesList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.SalariesList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.SalariesList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServicePaginationReq,
              com.scailo.sdk.SalariesServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceSearchAllReq,
              com.scailo.sdk.SalariesList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceFilterReq,
              com.scailo.sdk.SalariesList>(
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
              com.scailo.sdk.SalariesServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SalariesServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class SalariesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SalariesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.SalariesScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SalariesService");
    }
  }

  private static final class SalariesServiceFileDescriptorSupplier
      extends SalariesServiceBaseDescriptorSupplier {
    SalariesServiceFileDescriptorSupplier() {}
  }

  private static final class SalariesServiceMethodDescriptorSupplier
      extends SalariesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SalariesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SalariesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SalariesServiceFileDescriptorSupplier())
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
              .addMethod(getAutofillMethod())
              .addMethod(getAddSalaryAdditionItemMethod())
              .addMethod(getModifySalaryAdditionItemMethod())
              .addMethod(getApproveSalaryAdditionItemMethod())
              .addMethod(getDeleteSalaryAdditionItemMethod())
              .addMethod(getReorderSalaryAdditionItemsMethod())
              .addMethod(getViewSalaryAdditionItemByIDMethod())
              .addMethod(getViewApprovedSalaryAdditionItemsMethod())
              .addMethod(getViewUnapprovedSalaryAdditionItemsMethod())
              .addMethod(getViewSalaryAdditionItemHistoryMethod())
              .addMethod(getViewProspectiveSalaryAdditionItemMethod())
              .addMethod(getAddSalaryDeductionItemMethod())
              .addMethod(getModifySalaryDeductionItemMethod())
              .addMethod(getApproveSalaryDeductionItemMethod())
              .addMethod(getDeleteSalaryDeductionItemMethod())
              .addMethod(getReorderSalaryDeductionItemsMethod())
              .addMethod(getViewSalaryDeductionItemByIDMethod())
              .addMethod(getViewApprovedSalaryDeductionItemsMethod())
              .addMethod(getViewUnapprovedSalaryDeductionItemsMethod())
              .addMethod(getViewSalaryDeductionItemHistoryMethod())
              .addMethod(getViewProspectiveSalaryDeductionItemMethod())
              .addMethod(getAddSalaryReimbursementItemMethod())
              .addMethod(getModifySalaryReimbursementItemMethod())
              .addMethod(getApproveSalaryReimbursementItemMethod())
              .addMethod(getDeleteSalaryReimbursementItemMethod())
              .addMethod(getReorderSalaryReimbursementItemsMethod())
              .addMethod(getViewSalaryReimbursementItemByIDMethod())
              .addMethod(getViewApprovedSalaryReimbursementItemsMethod())
              .addMethod(getViewUnapprovedSalaryReimbursementItemsMethod())
              .addMethod(getViewSalaryReimbursementItemHistoryMethod())
              .addMethod(getViewProspectiveSalaryReimbursementItemMethod())
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
