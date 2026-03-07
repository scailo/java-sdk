package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each outward job
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: outward_jobs.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OutwardJobsServiceGrpc {

  private OutwardJobsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.OutwardJobsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.OutwardJobsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = OutwardJobsServiceGrpc.getCreateMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getCreateMethod = OutwardJobsServiceGrpc.getCreateMethod) == null) {
          OutwardJobsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.OutwardJobsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = OutwardJobsServiceGrpc.getDraftMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDraftMethod = OutwardJobsServiceGrpc.getDraftMethod) == null) {
          OutwardJobsServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.OutwardJobsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = OutwardJobsServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDraftUpdateMethod = OutwardJobsServiceGrpc.getDraftUpdateMethod) == null) {
          OutwardJobsServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = OutwardJobsServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getSendForVerificationMethod = OutwardJobsServiceGrpc.getSendForVerificationMethod) == null) {
          OutwardJobsServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = OutwardJobsServiceGrpc.getVerifyMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getVerifyMethod = OutwardJobsServiceGrpc.getVerifyMethod) == null) {
          OutwardJobsServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = OutwardJobsServiceGrpc.getApproveMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getApproveMethod = OutwardJobsServiceGrpc.getApproveMethod) == null) {
          OutwardJobsServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = OutwardJobsServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getSendForRevisionMethod = OutwardJobsServiceGrpc.getSendForRevisionMethod) == null) {
          OutwardJobsServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.OutwardJobsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = OutwardJobsServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getRevisionUpdateMethod = OutwardJobsServiceGrpc.getRevisionUpdateMethod) == null) {
          OutwardJobsServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = OutwardJobsServiceGrpc.getHaltMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getHaltMethod = OutwardJobsServiceGrpc.getHaltMethod) == null) {
          OutwardJobsServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = OutwardJobsServiceGrpc.getDiscardMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDiscardMethod = OutwardJobsServiceGrpc.getDiscardMethod) == null) {
          OutwardJobsServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = OutwardJobsServiceGrpc.getRestoreMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getRestoreMethod = OutwardJobsServiceGrpc.getRestoreMethod) == null) {
          OutwardJobsServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = OutwardJobsServiceGrpc.getCompleteMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getCompleteMethod = OutwardJobsServiceGrpc.getCompleteMethod) == null) {
          OutwardJobsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Complete"))
              .build();
        }
      }
    }
    return getCompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.RepeatWithDeliveryDate,
      com.scailo.sdk.IdentifierResponse> getRepeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Repeat",
      requestType = com.scailo.sdk.RepeatWithDeliveryDate.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.RepeatWithDeliveryDate,
      com.scailo.sdk.IdentifierResponse> getRepeatMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.RepeatWithDeliveryDate, com.scailo.sdk.IdentifierResponse> getRepeatMethod;
    if ((getRepeatMethod = OutwardJobsServiceGrpc.getRepeatMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getRepeatMethod = OutwardJobsServiceGrpc.getRepeatMethod) == null) {
          OutwardJobsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.RepeatWithDeliveryDate, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.RepeatWithDeliveryDate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getReopenMethod = OutwardJobsServiceGrpc.getReopenMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getReopenMethod = OutwardJobsServiceGrpc.getReopenMethod) == null) {
          OutwardJobsServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getCommentAddMethod = OutwardJobsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getCommentAddMethod = OutwardJobsServiceGrpc.getCommentAddMethod) == null) {
          OutwardJobsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getSendEmailMethod = OutwardJobsServiceGrpc.getSendEmailMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getSendEmailMethod = OutwardJobsServiceGrpc.getSendEmailMethod) == null) {
          OutwardJobsServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Autofill",
      requestType = com.scailo.sdk.OutwardJobsServiceAutofillRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceAutofillRequest, com.scailo.sdk.IdentifierResponse> getAutofillMethod;
    if ((getAutofillMethod = OutwardJobsServiceGrpc.getAutofillMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getAutofillMethod = OutwardJobsServiceGrpc.getAutofillMethod) == null) {
          OutwardJobsServiceGrpc.getAutofillMethod = getAutofillMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceAutofillRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Autofill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceAutofillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Autofill"))
              .build();
        }
      }
    }
    return getAutofillMethod;
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
    if ((getCreateMagicLinkMethod = OutwardJobsServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = OutwardJobsServiceGrpc.getCreateMagicLinkMethod) == null) {
          OutwardJobsServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("CreateMagicLink"))
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
    if ((getIsCompletableMethod = OutwardJobsServiceGrpc.getIsCompletableMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getIsCompletableMethod = OutwardJobsServiceGrpc.getIsCompletableMethod) == null) {
          OutwardJobsServiceGrpc.getIsCompletableMethod = getIsCompletableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsCompletable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("IsCompletable"))
              .build();
        }
      }
    }
    return getIsCompletableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsOrderedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsOrdered",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsOrderedMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getIsOrderedMethod;
    if ((getIsOrderedMethod = OutwardJobsServiceGrpc.getIsOrderedMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getIsOrderedMethod = OutwardJobsServiceGrpc.getIsOrderedMethod) == null) {
          OutwardJobsServiceGrpc.getIsOrderedMethod = getIsOrderedMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsOrdered"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("IsOrdered"))
              .build();
        }
      }
    }
    return getIsOrderedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsDispatchedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsDispatched",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsDispatchedMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getIsDispatchedMethod;
    if ((getIsDispatchedMethod = OutwardJobsServiceGrpc.getIsDispatchedMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getIsDispatchedMethod = OutwardJobsServiceGrpc.getIsDispatchedMethod) == null) {
          OutwardJobsServiceGrpc.getIsDispatchedMethod = getIsDispatchedMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDispatched"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("IsDispatched"))
              .build();
        }
      }
    }
    return getIsDispatchedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultipleOutwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMultipleOutwardJobInwardItems",
      requestType = com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultipleOutwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest, com.scailo.sdk.IdentifierResponse> getAddMultipleOutwardJobInwardItemsMethod;
    if ((getAddMultipleOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getAddMultipleOutwardJobInwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getAddMultipleOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getAddMultipleOutwardJobInwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getAddMultipleOutwardJobInwardItemsMethod = getAddMultipleOutwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMultipleOutwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("AddMultipleOutwardJobInwardItems"))
              .build();
        }
      }
    }
    return getAddMultipleOutwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOutwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOutwardJobInwardItem",
      requestType = com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOutwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddOutwardJobInwardItemMethod;
    if ((getAddOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getAddOutwardJobInwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getAddOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getAddOutwardJobInwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getAddOutwardJobInwardItemMethod = getAddOutwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOutwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("AddOutwardJobInwardItem"))
              .build();
        }
      }
    }
    return getAddOutwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyOutwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyOutwardJobInwardItem",
      requestType = com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyOutwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyOutwardJobInwardItemMethod;
    if ((getModifyOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getModifyOutwardJobInwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getModifyOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getModifyOutwardJobInwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getModifyOutwardJobInwardItemMethod = getModifyOutwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyOutwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ModifyOutwardJobInwardItem"))
              .build();
        }
      }
    }
    return getModifyOutwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveOutwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveOutwardJobInwardItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveOutwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveOutwardJobInwardItemMethod;
    if ((getApproveOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getApproveOutwardJobInwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getApproveOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getApproveOutwardJobInwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getApproveOutwardJobInwardItemMethod = getApproveOutwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveOutwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ApproveOutwardJobInwardItem"))
              .build();
        }
      }
    }
    return getApproveOutwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOutwardJobInwardItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobInwardItemMethod;
    if ((getDeleteOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getDeleteOutwardJobInwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDeleteOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getDeleteOutwardJobInwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getDeleteOutwardJobInwardItemMethod = getDeleteOutwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOutwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("DeleteOutwardJobInwardItem"))
              .build();
        }
      }
    }
    return getDeleteOutwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderOutwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderOutwardJobInwardItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderOutwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderOutwardJobInwardItemsMethod;
    if ((getReorderOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getReorderOutwardJobInwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getReorderOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getReorderOutwardJobInwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getReorderOutwardJobInwardItemsMethod = getReorderOutwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderOutwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ReorderOutwardJobInwardItems"))
              .build();
        }
      }
    }
    return getReorderOutwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobInwardItem> getViewOutwardJobInwardItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardJobInwardItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OutwardJobInwardItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobInwardItem> getViewOutwardJobInwardItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobInwardItem> getViewOutwardJobInwardItemByIDMethod;
    if ((getViewOutwardJobInwardItemByIDMethod = OutwardJobsServiceGrpc.getViewOutwardJobInwardItemByIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewOutwardJobInwardItemByIDMethod = OutwardJobsServiceGrpc.getViewOutwardJobInwardItemByIDMethod) == null) {
          OutwardJobsServiceGrpc.getViewOutwardJobInwardItemByIDMethod = getViewOutwardJobInwardItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobInwardItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardJobInwardItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobInwardItem.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewOutwardJobInwardItemByID"))
              .build();
        }
      }
    }
    return getViewOutwardJobInwardItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsInwardItemsList> getViewApprovedOutwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedOutwardJobInwardItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.OutwardJobsInwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsInwardItemsList> getViewApprovedOutwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsInwardItemsList> getViewApprovedOutwardJobInwardItemsMethod;
    if ((getViewApprovedOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getViewApprovedOutwardJobInwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewApprovedOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getViewApprovedOutwardJobInwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getViewApprovedOutwardJobInwardItemsMethod = getViewApprovedOutwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsInwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedOutwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsInwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewApprovedOutwardJobInwardItems"))
              .build();
        }
      }
    }
    return getViewApprovedOutwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsInwardItemsList> getViewUnapprovedOutwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedOutwardJobInwardItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.OutwardJobsInwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsInwardItemsList> getViewUnapprovedOutwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsInwardItemsList> getViewUnapprovedOutwardJobInwardItemsMethod;
    if ((getViewUnapprovedOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobInwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewUnapprovedOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobInwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobInwardItemsMethod = getViewUnapprovedOutwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsInwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedOutwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsInwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewUnapprovedOutwardJobInwardItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedOutwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemHistoryRequest,
      com.scailo.sdk.OutwardJobsInwardItemsList> getViewOutwardJobInwardItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardJobInwardItemHistory",
      requestType = com.scailo.sdk.OutwardJobInwardItemHistoryRequest.class,
      responseType = com.scailo.sdk.OutwardJobsInwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemHistoryRequest,
      com.scailo.sdk.OutwardJobsInwardItemsList> getViewOutwardJobInwardItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemHistoryRequest, com.scailo.sdk.OutwardJobsInwardItemsList> getViewOutwardJobInwardItemHistoryMethod;
    if ((getViewOutwardJobInwardItemHistoryMethod = OutwardJobsServiceGrpc.getViewOutwardJobInwardItemHistoryMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewOutwardJobInwardItemHistoryMethod = OutwardJobsServiceGrpc.getViewOutwardJobInwardItemHistoryMethod) == null) {
          OutwardJobsServiceGrpc.getViewOutwardJobInwardItemHistoryMethod = getViewOutwardJobInwardItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobInwardItemHistoryRequest, com.scailo.sdk.OutwardJobsInwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardJobInwardItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobInwardItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsInwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewOutwardJobInwardItemHistory"))
              .build();
        }
      }
    }
    return getViewOutwardJobInwardItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedApprovedOutwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedOutwardJobInwardItems",
      requestType = com.scailo.sdk.OutwardJobInwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedApprovedOutwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedApprovedOutwardJobInwardItemsMethod;
    if ((getViewPaginatedApprovedOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobInwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewPaginatedApprovedOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobInwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobInwardItemsMethod = getViewPaginatedApprovedOutwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobInwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedOutwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobInwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewPaginatedApprovedOutwardJobInwardItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedOutwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedUnapprovedOutwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedOutwardJobInwardItems",
      requestType = com.scailo.sdk.OutwardJobInwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedUnapprovedOutwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedUnapprovedOutwardJobInwardItemsMethod;
    if ((getViewPaginatedUnapprovedOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobInwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobInwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobInwardItemsMethod = getViewPaginatedUnapprovedOutwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobInwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedOutwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobInwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedOutwardJobInwardItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedOutwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> getSearchInwardItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchInwardItemsWithPagination",
      requestType = com.scailo.sdk.OutwardJobInwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> getSearchInwardItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> getSearchInwardItemsWithPaginationMethod;
    if ((getSearchInwardItemsWithPaginationMethod = OutwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getSearchInwardItemsWithPaginationMethod = OutwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod) == null) {
          OutwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod = getSearchInwardItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobInwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchInwardItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobInwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("SearchInwardItemsWithPagination"))
              .build();
        }
      }
    }
    return getSearchInwardItemsWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadInwardItemsCSVTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadInwardItemsCSVTemplate",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadInwardItemsCSVTemplateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadInwardItemsCSVTemplateMethod;
    if ((getDownloadInwardItemsCSVTemplateMethod = OutwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDownloadInwardItemsCSVTemplateMethod = OutwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod) == null) {
          OutwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod = getDownloadInwardItemsCSVTemplateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadInwardItemsCSVTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("DownloadInwardItemsCSVTemplate"))
              .build();
        }
      }
    }
    return getDownloadInwardItemsCSVTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadOutwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadOutwardJobInwardItems",
      requestType = com.scailo.sdk.IdentifierUUIDWithFile.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadOutwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList> getUploadOutwardJobInwardItemsMethod;
    if ((getUploadOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getUploadOutwardJobInwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getUploadOutwardJobInwardItemsMethod = OutwardJobsServiceGrpc.getUploadOutwardJobInwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getUploadOutwardJobInwardItemsMethod = getUploadOutwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadOutwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("UploadOutwardJobInwardItems"))
              .build();
        }
      }
    }
    return getUploadOutwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultipleOutwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMultipleOutwardJobOutwardItems",
      requestType = com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultipleOutwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest, com.scailo.sdk.IdentifierResponse> getAddMultipleOutwardJobOutwardItemsMethod;
    if ((getAddMultipleOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getAddMultipleOutwardJobOutwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getAddMultipleOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getAddMultipleOutwardJobOutwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getAddMultipleOutwardJobOutwardItemsMethod = getAddMultipleOutwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMultipleOutwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("AddMultipleOutwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getAddMultipleOutwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOutwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOutwardJobOutwardItem",
      requestType = com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOutwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddOutwardJobOutwardItemMethod;
    if ((getAddOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getAddOutwardJobOutwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getAddOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getAddOutwardJobOutwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getAddOutwardJobOutwardItemMethod = getAddOutwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOutwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("AddOutwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getAddOutwardJobOutwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyOutwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyOutwardJobOutwardItem",
      requestType = com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyOutwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyOutwardJobOutwardItemMethod;
    if ((getModifyOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getModifyOutwardJobOutwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getModifyOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getModifyOutwardJobOutwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getModifyOutwardJobOutwardItemMethod = getModifyOutwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyOutwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ModifyOutwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getModifyOutwardJobOutwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveOutwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveOutwardJobOutwardItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveOutwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveOutwardJobOutwardItemMethod;
    if ((getApproveOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getApproveOutwardJobOutwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getApproveOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getApproveOutwardJobOutwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getApproveOutwardJobOutwardItemMethod = getApproveOutwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveOutwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ApproveOutwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getApproveOutwardJobOutwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOutwardJobOutwardItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobOutwardItemMethod;
    if ((getDeleteOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getDeleteOutwardJobOutwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDeleteOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getDeleteOutwardJobOutwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getDeleteOutwardJobOutwardItemMethod = getDeleteOutwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOutwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("DeleteOutwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getDeleteOutwardJobOutwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderOutwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderOutwardJobOutwardItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderOutwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderOutwardJobOutwardItemsMethod;
    if ((getReorderOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getReorderOutwardJobOutwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getReorderOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getReorderOutwardJobOutwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getReorderOutwardJobOutwardItemsMethod = getReorderOutwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderOutwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ReorderOutwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getReorderOutwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobOutwardItem> getViewOutwardJobOutwardItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardJobOutwardItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OutwardJobOutwardItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobOutwardItem> getViewOutwardJobOutwardItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobOutwardItem> getViewOutwardJobOutwardItemByIDMethod;
    if ((getViewOutwardJobOutwardItemByIDMethod = OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemByIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewOutwardJobOutwardItemByIDMethod = OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemByIDMethod) == null) {
          OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemByIDMethod = getViewOutwardJobOutwardItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobOutwardItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardJobOutwardItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobOutwardItem.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewOutwardJobOutwardItemByID"))
              .build();
        }
      }
    }
    return getViewOutwardJobOutwardItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsOutwardItemsList> getViewApprovedOutwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedOutwardJobOutwardItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.OutwardJobsOutwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsOutwardItemsList> getViewApprovedOutwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsOutwardItemsList> getViewApprovedOutwardJobOutwardItemsMethod;
    if ((getViewApprovedOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getViewApprovedOutwardJobOutwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewApprovedOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getViewApprovedOutwardJobOutwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getViewApprovedOutwardJobOutwardItemsMethod = getViewApprovedOutwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsOutwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedOutwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsOutwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewApprovedOutwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getViewApprovedOutwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsOutwardItemsList> getViewUnapprovedOutwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedOutwardJobOutwardItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.OutwardJobsOutwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.OutwardJobsOutwardItemsList> getViewUnapprovedOutwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsOutwardItemsList> getViewUnapprovedOutwardJobOutwardItemsMethod;
    if ((getViewUnapprovedOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobOutwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewUnapprovedOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobOutwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobOutwardItemsMethod = getViewUnapprovedOutwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.OutwardJobsOutwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedOutwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsOutwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewUnapprovedOutwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedOutwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemHistoryRequest,
      com.scailo.sdk.OutwardJobsOutwardItemsList> getViewOutwardJobOutwardItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardJobOutwardItemHistory",
      requestType = com.scailo.sdk.OutwardJobOutwardItemHistoryRequest.class,
      responseType = com.scailo.sdk.OutwardJobsOutwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemHistoryRequest,
      com.scailo.sdk.OutwardJobsOutwardItemsList> getViewOutwardJobOutwardItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemHistoryRequest, com.scailo.sdk.OutwardJobsOutwardItemsList> getViewOutwardJobOutwardItemHistoryMethod;
    if ((getViewOutwardJobOutwardItemHistoryMethod = OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemHistoryMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewOutwardJobOutwardItemHistoryMethod = OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemHistoryMethod) == null) {
          OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemHistoryMethod = getViewOutwardJobOutwardItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobOutwardItemHistoryRequest, com.scailo.sdk.OutwardJobsOutwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardJobOutwardItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobOutwardItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsOutwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewOutwardJobOutwardItemHistory"))
              .build();
        }
      }
    }
    return getViewOutwardJobOutwardItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedApprovedOutwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedOutwardJobOutwardItems",
      requestType = com.scailo.sdk.OutwardJobOutwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedApprovedOutwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedApprovedOutwardJobOutwardItemsMethod;
    if ((getViewPaginatedApprovedOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobOutwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewPaginatedApprovedOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobOutwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobOutwardItemsMethod = getViewPaginatedApprovedOutwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedOutwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobOutwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewPaginatedApprovedOutwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedOutwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedOutwardJobOutwardItems",
      requestType = com.scailo.sdk.OutwardJobOutwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod;
    if ((getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod = getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedOutwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobOutwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedOutwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> getSearchOutwardItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchOutwardItemsWithPagination",
      requestType = com.scailo.sdk.OutwardJobOutwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> getSearchOutwardItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> getSearchOutwardItemsWithPaginationMethod;
    if ((getSearchOutwardItemsWithPaginationMethod = OutwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getSearchOutwardItemsWithPaginationMethod = OutwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod) == null) {
          OutwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod = getSearchOutwardItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobOutwardItemsSearchRequest, com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchOutwardItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobOutwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("SearchOutwardItemsWithPagination"))
              .build();
        }
      }
    }
    return getSearchOutwardItemsWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadOutwardItemsCSVTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadOutwardItemsCSVTemplate",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadOutwardItemsCSVTemplateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadOutwardItemsCSVTemplateMethod;
    if ((getDownloadOutwardItemsCSVTemplateMethod = OutwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDownloadOutwardItemsCSVTemplateMethod = OutwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod) == null) {
          OutwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod = getDownloadOutwardItemsCSVTemplateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadOutwardItemsCSVTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("DownloadOutwardItemsCSVTemplate"))
              .build();
        }
      }
    }
    return getDownloadOutwardItemsCSVTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadOutwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadOutwardJobOutwardItems",
      requestType = com.scailo.sdk.IdentifierUUIDWithFile.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadOutwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList> getUploadOutwardJobOutwardItemsMethod;
    if ((getUploadOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getUploadOutwardJobOutwardItemsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getUploadOutwardJobOutwardItemsMethod = OutwardJobsServiceGrpc.getUploadOutwardJobOutwardItemsMethod) == null) {
          OutwardJobsServiceGrpc.getUploadOutwardJobOutwardItemsMethod = getUploadOutwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadOutwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("UploadOutwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getUploadOutwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceContactCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOutwardJobContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOutwardJobContact",
      requestType = com.scailo.sdk.OutwardJobsServiceContactCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceContactCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddOutwardJobContactMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceContactCreateRequest, com.scailo.sdk.IdentifierResponse> getAddOutwardJobContactMethod;
    if ((getAddOutwardJobContactMethod = OutwardJobsServiceGrpc.getAddOutwardJobContactMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getAddOutwardJobContactMethod = OutwardJobsServiceGrpc.getAddOutwardJobContactMethod) == null) {
          OutwardJobsServiceGrpc.getAddOutwardJobContactMethod = getAddOutwardJobContactMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceContactCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOutwardJobContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceContactCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("AddOutwardJobContact"))
              .build();
        }
      }
    }
    return getAddOutwardJobContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveOutwardJobContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveOutwardJobContact",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveOutwardJobContactMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveOutwardJobContactMethod;
    if ((getApproveOutwardJobContactMethod = OutwardJobsServiceGrpc.getApproveOutwardJobContactMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getApproveOutwardJobContactMethod = OutwardJobsServiceGrpc.getApproveOutwardJobContactMethod) == null) {
          OutwardJobsServiceGrpc.getApproveOutwardJobContactMethod = getApproveOutwardJobContactMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveOutwardJobContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ApproveOutwardJobContact"))
              .build();
        }
      }
    }
    return getApproveOutwardJobContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOutwardJobContact",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobContactMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteOutwardJobContactMethod;
    if ((getDeleteOutwardJobContactMethod = OutwardJobsServiceGrpc.getDeleteOutwardJobContactMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDeleteOutwardJobContactMethod = OutwardJobsServiceGrpc.getDeleteOutwardJobContactMethod) == null) {
          OutwardJobsServiceGrpc.getDeleteOutwardJobContactMethod = getDeleteOutwardJobContactMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOutwardJobContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("DeleteOutwardJobContact"))
              .build();
        }
      }
    }
    return getDeleteOutwardJobContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobContact> getViewOutwardJobContactByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardJobContactByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OutwardJobContact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJobContact> getViewOutwardJobContactByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobContact> getViewOutwardJobContactByIDMethod;
    if ((getViewOutwardJobContactByIDMethod = OutwardJobsServiceGrpc.getViewOutwardJobContactByIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewOutwardJobContactByIDMethod = OutwardJobsServiceGrpc.getViewOutwardJobContactByIDMethod) == null) {
          OutwardJobsServiceGrpc.getViewOutwardJobContactByIDMethod = getViewOutwardJobContactByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJobContact>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardJobContactByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobContact.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewOutwardJobContactByID"))
              .build();
        }
      }
    }
    return getViewOutwardJobContactByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobContactsList> getViewOutwardJobContactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardJobContacts",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJobContactsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobContactsList> getViewOutwardJobContactsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobContactsList> getViewOutwardJobContactsMethod;
    if ((getViewOutwardJobContactsMethod = OutwardJobsServiceGrpc.getViewOutwardJobContactsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewOutwardJobContactsMethod = OutwardJobsServiceGrpc.getViewOutwardJobContactsMethod) == null) {
          OutwardJobsServiceGrpc.getViewOutwardJobContactsMethod = getViewOutwardJobContactsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobContactsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardJobContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobContactsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewOutwardJobContacts"))
              .build();
        }
      }
    }
    return getViewOutwardJobContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJob> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OutwardJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJob> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJob> getViewByIDMethod;
    if ((getViewByIDMethod = OutwardJobsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewByIDMethod = OutwardJobsServiceGrpc.getViewByIDMethod) == null) {
          OutwardJobsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJob.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJob> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJob> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJob> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = OutwardJobsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewByUUIDMethod = OutwardJobsServiceGrpc.getViewByUUIDMethod) == null) {
          OutwardJobsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJob.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJob> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.OutwardJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.OutwardJob> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJob> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = OutwardJobsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = OutwardJobsServiceGrpc.getViewEssentialByIDMethod) == null) {
          OutwardJobsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.OutwardJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJob.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJob> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJob> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJob> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = OutwardJobsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = OutwardJobsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          OutwardJobsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJob.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.OutwardJobsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.OutwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.OutwardJobsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.OutwardJobsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = OutwardJobsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewFromIDsMethod = OutwardJobsServiceGrpc.getViewFromIDsMethod) == null) {
          OutwardJobsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.OutwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobAncillaryParameters> getViewAncillaryParametersByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAncillaryParametersByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJobAncillaryParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobAncillaryParameters> getViewAncillaryParametersByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobAncillaryParameters> getViewAncillaryParametersByUUIDMethod;
    if ((getViewAncillaryParametersByUUIDMethod = OutwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewAncillaryParametersByUUIDMethod = OutwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
          OutwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod = getViewAncillaryParametersByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobAncillaryParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAncillaryParametersByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobAncillaryParameters.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewAncillaryParametersByUUID"))
              .build();
        }
      }
    }
    return getViewAncillaryParametersByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.OutwardJobsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.OutwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.OutwardJobsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.OutwardJobsList> getViewAllMethod;
    if ((getViewAllMethod = OutwardJobsServiceGrpc.getViewAllMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewAllMethod = OutwardJobsServiceGrpc.getViewAllMethod) == null) {
          OutwardJobsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.OutwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = OutwardJobsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = OutwardJobsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          OutwardJobsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServicePaginationReq,
      com.scailo.sdk.OutwardJobsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.OutwardJobsServicePaginationReq.class,
      responseType = com.scailo.sdk.OutwardJobsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServicePaginationReq,
      com.scailo.sdk.OutwardJobsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServicePaginationReq, com.scailo.sdk.OutwardJobsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = OutwardJobsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = OutwardJobsServiceGrpc.getViewWithPaginationMethod) == null) {
          OutwardJobsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServicePaginationReq, com.scailo.sdk.OutwardJobsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifiersList> getViewAssociatedPurchaseOrderIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAssociatedPurchaseOrderIDs",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifiersList> getViewAssociatedPurchaseOrderIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifiersList> getViewAssociatedPurchaseOrderIDsMethod;
    if ((getViewAssociatedPurchaseOrderIDsMethod = OutwardJobsServiceGrpc.getViewAssociatedPurchaseOrderIDsMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewAssociatedPurchaseOrderIDsMethod = OutwardJobsServiceGrpc.getViewAssociatedPurchaseOrderIDsMethod) == null) {
          OutwardJobsServiceGrpc.getViewAssociatedPurchaseOrderIDsMethod = getViewAssociatedPurchaseOrderIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAssociatedPurchaseOrderIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewAssociatedPurchaseOrderIDs"))
              .build();
        }
      }
    }
    return getViewAssociatedPurchaseOrderIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.FamiliesList> getViewProspectiveInwardFamiliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveInwardFamilies",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.FamiliesList> getViewProspectiveInwardFamiliesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList> getViewProspectiveInwardFamiliesMethod;
    if ((getViewProspectiveInwardFamiliesMethod = OutwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewProspectiveInwardFamiliesMethod = OutwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod) == null) {
          OutwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod = getViewProspectiveInwardFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveInwardFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewProspectiveInwardFamilies"))
              .build();
        }
      }
    }
    return getViewProspectiveInwardFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier,
      com.scailo.sdk.FamiliesList> getFilterProspectiveInwardFamiliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FilterProspectiveInwardFamilies",
      requestType = com.scailo.sdk.FilterFamiliesReqForIdentifier.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier,
      com.scailo.sdk.FamiliesList> getFilterProspectiveInwardFamiliesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList> getFilterProspectiveInwardFamiliesMethod;
    if ((getFilterProspectiveInwardFamiliesMethod = OutwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getFilterProspectiveInwardFamiliesMethod = OutwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod) == null) {
          OutwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod = getFilterProspectiveInwardFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterProspectiveInwardFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterFamiliesReqForIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("FilterProspectiveInwardFamilies"))
              .build();
        }
      }
    }
    return getFilterProspectiveInwardFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest,
      com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest> getViewProspectiveOutwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveOutwardJobInwardItem",
      requestType = com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest,
      com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest> getViewProspectiveOutwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest, com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest> getViewProspectiveOutwardJobInwardItemMethod;
    if ((getViewProspectiveOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getViewProspectiveOutwardJobInwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewProspectiveOutwardJobInwardItemMethod = OutwardJobsServiceGrpc.getViewProspectiveOutwardJobInwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getViewProspectiveOutwardJobInwardItemMethod = getViewProspectiveOutwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest, com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveOutwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewProspectiveOutwardJobInwardItem"))
              .build();
        }
      }
    }
    return getViewProspectiveOutwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobInwardInventoryMatchList> getViewInwardInventoryMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInwardInventoryMatch",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJobInwardInventoryMatchList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobInwardInventoryMatchList> getViewInwardInventoryMatchMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobInwardInventoryMatchList> getViewInwardInventoryMatchMethod;
    if ((getViewInwardInventoryMatchMethod = OutwardJobsServiceGrpc.getViewInwardInventoryMatchMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewInwardInventoryMatchMethod = OutwardJobsServiceGrpc.getViewInwardInventoryMatchMethod) == null) {
          OutwardJobsServiceGrpc.getViewInwardInventoryMatchMethod = getViewInwardInventoryMatchMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobInwardInventoryMatchList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInwardInventoryMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobInwardInventoryMatchList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewInwardInventoryMatch"))
              .build();
        }
      }
    }
    return getViewInwardInventoryMatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.FamiliesList> getViewProspectiveOutwardFamiliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveOutwardFamilies",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.FamiliesList> getViewProspectiveOutwardFamiliesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList> getViewProspectiveOutwardFamiliesMethod;
    if ((getViewProspectiveOutwardFamiliesMethod = OutwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewProspectiveOutwardFamiliesMethod = OutwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod) == null) {
          OutwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod = getViewProspectiveOutwardFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveOutwardFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewProspectiveOutwardFamilies"))
              .build();
        }
      }
    }
    return getViewProspectiveOutwardFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier,
      com.scailo.sdk.FamiliesList> getFilterProspectiveOutwardFamiliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FilterProspectiveOutwardFamilies",
      requestType = com.scailo.sdk.FilterFamiliesReqForIdentifier.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier,
      com.scailo.sdk.FamiliesList> getFilterProspectiveOutwardFamiliesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList> getFilterProspectiveOutwardFamiliesMethod;
    if ((getFilterProspectiveOutwardFamiliesMethod = OutwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getFilterProspectiveOutwardFamiliesMethod = OutwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod) == null) {
          OutwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod = getFilterProspectiveOutwardFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterProspectiveOutwardFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterFamiliesReqForIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("FilterProspectiveOutwardFamilies"))
              .build();
        }
      }
    }
    return getFilterProspectiveOutwardFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest,
      com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest> getViewProspectiveOutwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveOutwardJobOutwardItem",
      requestType = com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest,
      com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest> getViewProspectiveOutwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest, com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest> getViewProspectiveOutwardJobOutwardItemMethod;
    if ((getViewProspectiveOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getViewProspectiveOutwardJobOutwardItemMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewProspectiveOutwardJobOutwardItemMethod = OutwardJobsServiceGrpc.getViewProspectiveOutwardJobOutwardItemMethod) == null) {
          OutwardJobsServiceGrpc.getViewProspectiveOutwardJobOutwardItemMethod = getViewProspectiveOutwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest, com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveOutwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewProspectiveOutwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getViewProspectiveOutwardJobOutwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobOutwardInventoryMatchList> getViewOutwardInventoryMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardInventoryMatch",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.OutwardJobOutwardInventoryMatchList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.OutwardJobOutwardInventoryMatchList> getViewOutwardInventoryMatchMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobOutwardInventoryMatchList> getViewOutwardInventoryMatchMethod;
    if ((getViewOutwardInventoryMatchMethod = OutwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getViewOutwardInventoryMatchMethod = OutwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod) == null) {
          OutwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod = getViewOutwardInventoryMatchMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.OutwardJobOutwardInventoryMatchList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardInventoryMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobOutwardInventoryMatchList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("ViewOutwardInventoryMatch"))
              .build();
        }
      }
    }
    return getViewOutwardInventoryMatchMethod;
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
    if ((getIsDownloadableMethod = OutwardJobsServiceGrpc.getIsDownloadableMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getIsDownloadableMethod = OutwardJobsServiceGrpc.getIsDownloadableMethod) == null) {
          OutwardJobsServiceGrpc.getIsDownloadableMethod = getIsDownloadableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDownloadable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("IsDownloadable"))
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
    if ((getDownloadByUUIDMethod = OutwardJobsServiceGrpc.getDownloadByUUIDMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDownloadByUUIDMethod = OutwardJobsServiceGrpc.getDownloadByUUIDMethod) == null) {
          OutwardJobsServiceGrpc.getDownloadByUUIDMethod = getDownloadByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("DownloadByUUID"))
              .build();
        }
      }
    }
    return getDownloadByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceSearchAllReq,
      com.scailo.sdk.OutwardJobsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.OutwardJobsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.OutwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceSearchAllReq,
      com.scailo.sdk.OutwardJobsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceSearchAllReq, com.scailo.sdk.OutwardJobsList> getSearchAllMethod;
    if ((getSearchAllMethod = OutwardJobsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getSearchAllMethod = OutwardJobsServiceGrpc.getSearchAllMethod) == null) {
          OutwardJobsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceSearchAllReq, com.scailo.sdk.OutwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceFilterReq,
      com.scailo.sdk.OutwardJobsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.OutwardJobsServiceFilterReq.class,
      responseType = com.scailo.sdk.OutwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceFilterReq,
      com.scailo.sdk.OutwardJobsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceFilterReq, com.scailo.sdk.OutwardJobsList> getFilterMethod;
    if ((getFilterMethod = OutwardJobsServiceGrpc.getFilterMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getFilterMethod = OutwardJobsServiceGrpc.getFilterMethod) == null) {
          OutwardJobsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceFilterReq, com.scailo.sdk.OutwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = OutwardJobsServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getCountInStatusMethod = OutwardJobsServiceGrpc.getCountInStatusMethod) == null) {
          OutwardJobsServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.OutwardJobsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = OutwardJobsServiceGrpc.getCountMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getCountMethod = OutwardJobsServiceGrpc.getCountMethod) == null) {
          OutwardJobsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.OutwardJobsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.OutwardJobsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = OutwardJobsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (OutwardJobsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = OutwardJobsServiceGrpc.getDownloadAsCSVMethod) == null) {
          OutwardJobsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.OutwardJobsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.OutwardJobsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new OutwardJobsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OutwardJobsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OutwardJobsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OutwardJobsServiceStub>() {
        @java.lang.Override
        public OutwardJobsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OutwardJobsServiceStub(channel, callOptions);
        }
      };
    return OutwardJobsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OutwardJobsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OutwardJobsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OutwardJobsServiceBlockingStub>() {
        @java.lang.Override
        public OutwardJobsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OutwardJobsServiceBlockingStub(channel, callOptions);
        }
      };
    return OutwardJobsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OutwardJobsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OutwardJobsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OutwardJobsServiceFutureStub>() {
        @java.lang.Override
        public OutwardJobsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OutwardJobsServiceFutureStub(channel, callOptions);
        }
      };
    return OutwardJobsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each outward job
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.OutwardJobsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.OutwardJobsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.OutwardJobsServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.OutwardJobsServiceUpdateRequest request,
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
    default void repeat(com.scailo.sdk.RepeatWithDeliveryDate request,
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
     * Autofill the outward job
     * </pre>
     */
    default void autofill(com.scailo.sdk.OutwardJobsServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAutofillMethod(), responseObserver);
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
     * Checks if the Outward Job can be marked as completed (is true when all the inward items have been ordered and all the outward items have been dispatched)
     * </pre>
     */
    default void isCompletable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsCompletableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if the Inward items within an Outward Job have been ordered (through a Purchase Order)
     * </pre>
     */
    default void isOrdered(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsOrderedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if the Outward items within an Outward Job have been dispatched (through Free Issue Material)
     * </pre>
     */
    default void isDispatched(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsDispatchedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add multiple items to a outward job
     * </pre>
     */
    default void addMultipleOutwardJobInwardItems(com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMultipleOutwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an inward item to a outward job
     * </pre>
     */
    default void addOutwardJobInwardItem(com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOutwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an inward item in a outward job
     * </pre>
     */
    default void modifyOutwardJobInwardItem(com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyOutwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an inward item in a outward job
     * </pre>
     */
    default void approveOutwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveOutwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an inward item in a outward job
     * </pre>
     */
    default void deleteOutwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOutwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a outward job
     * </pre>
     */
    default void reorderOutwardJobInwardItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderOutwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Outward Job Inward Item by ID
     * </pre>
     */
    default void viewOutwardJobInwardItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobInwardItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardJobInwardItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved outward job inward items for given outward job ID
     * </pre>
     */
    default void viewApprovedOutwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedOutwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job inward items for given outward job ID
     * </pre>
     */
    default void viewUnapprovedOutwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedOutwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the outward job inward item
     * </pre>
     */
    default void viewOutwardJobInwardItemHistory(com.scailo.sdk.OutwardJobInwardItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardJobInwardItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved outward job inward items for given outward job ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedOutwardJobInwardItems(com.scailo.sdk.OutwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedOutwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job inward items for given outward job ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedOutwardJobInwardItems(com.scailo.sdk.OutwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedOutwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through outward job inward items with pagination
     * </pre>
     */
    default void searchInwardItemsWithPagination(com.scailo.sdk.OutwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchInwardItemsWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload inward items from the filled CSV file
     * </pre>
     */
    default void downloadInwardItemsCSVTemplate(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadInwardItemsCSVTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload inward items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    default void uploadOutwardJobInwardItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadOutwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add multiple items to a outward job
     * </pre>
     */
    default void addMultipleOutwardJobOutwardItems(com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMultipleOutwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an outward item to a outward job
     * </pre>
     */
    default void addOutwardJobOutwardItem(com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOutwardJobOutwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an outward item in a outward job
     * </pre>
     */
    default void modifyOutwardJobOutwardItem(com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyOutwardJobOutwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an outward item in a outward job
     * </pre>
     */
    default void approveOutwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveOutwardJobOutwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an outward item in a outward job
     * </pre>
     */
    default void deleteOutwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOutwardJobOutwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a outward job
     * </pre>
     */
    default void reorderOutwardJobOutwardItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderOutwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Outward Job Outward Item by ID
     * </pre>
     */
    default void viewOutwardJobOutwardItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobOutwardItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardJobOutwardItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved outward job outward items for given outward job ID
     * </pre>
     */
    default void viewApprovedOutwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedOutwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job outward items for given outward job ID
     * </pre>
     */
    default void viewUnapprovedOutwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedOutwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the outward job outward item
     * </pre>
     */
    default void viewOutwardJobOutwardItemHistory(com.scailo.sdk.OutwardJobOutwardItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardJobOutwardItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved outward job outward items for given outward job ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedOutwardJobOutwardItems(com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedOutwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job outward items for given outward job ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedOutwardJobOutwardItems(com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through outward job outward items with pagination
     * </pre>
     */
    default void searchOutwardItemsWithPagination(com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchOutwardItemsWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload outward items from the filled CSV file
     * </pre>
     */
    default void downloadOutwardItemsCSVTemplate(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadOutwardItemsCSVTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload outward items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    default void uploadOutwardJobOutwardItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadOutwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    default void addOutwardJobContact(com.scailo.sdk.OutwardJobsServiceContactCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOutwardJobContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    default void approveOutwardJobContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveOutwardJobContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    default void deleteOutwardJobContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOutwardJobContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    default void viewOutwardJobContactByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobContact> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardJobContactByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all contacts for given outward job UUID
     * </pre>
     */
    default void viewOutwardJobContacts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobContactsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardJobContactsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    default void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobAncillaryParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAncillaryParametersByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.OutwardJobsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all purchase order IDs that are associated with the given outward job UUID
     * </pre>
     */
    default void viewAssociatedPurchaseOrderIDs(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAssociatedPurchaseOrderIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective inward items for the given outward job
     * </pre>
     */
    default void viewProspectiveInwardFamilies(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveInwardFamiliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Filter prospective inward families for the record represented by the given UUID identifier
     * </pre>
     */
    default void filterProspectiveInwardFamilies(com.scailo.sdk.FilterFamiliesReqForIdentifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterProspectiveInwardFamiliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective outward job inward item info for the given family ID and outward job ID
     * </pre>
     */
    default void viewProspectiveOutwardJobInwardItem(com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveOutwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Inward Inventory Match of all the inward families of the given outward job
     * </pre>
     */
    default void viewInwardInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobInwardInventoryMatchList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInwardInventoryMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective outward items for the given outward job
     * </pre>
     */
    default void viewProspectiveOutwardFamilies(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveOutwardFamiliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Filter prospective outward families for the record represented by the given UUID identifier
     * </pre>
     */
    default void filterProspectiveOutwardFamilies(com.scailo.sdk.FilterFamiliesReqForIdentifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterProspectiveOutwardFamiliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective outward job outward item info for the given family ID and outward job ID
     * </pre>
     */
    default void viewProspectiveOutwardJobOutwardItem(com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveOutwardJobOutwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Outward Inventory Match of all the outward families of the given outward job
     * </pre>
     */
    default void viewOutwardInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobOutwardInventoryMatchList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardInventoryMatchMethod(), responseObserver);
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
     * Download outward job with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    default void downloadByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.OutwardJobsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.OutwardJobsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
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
    default void count(com.scailo.sdk.OutwardJobsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.OutwardJobsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OutwardJobsService.
   * <pre>
   *Describes the common methods applicable on each outward job
   * </pre>
   */
  public static abstract class OutwardJobsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OutwardJobsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OutwardJobsService.
   * <pre>
   *Describes the common methods applicable on each outward job
   * </pre>
   */
  public static final class OutwardJobsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OutwardJobsServiceStub> {
    private OutwardJobsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OutwardJobsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OutwardJobsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.OutwardJobsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.OutwardJobsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.OutwardJobsServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.OutwardJobsServiceUpdateRequest request,
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
    public void repeat(com.scailo.sdk.RepeatWithDeliveryDate request,
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
     * Autofill the outward job
     * </pre>
     */
    public void autofill(com.scailo.sdk.OutwardJobsServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request, responseObserver);
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
     * Checks if the Outward Job can be marked as completed (is true when all the inward items have been ordered and all the outward items have been dispatched)
     * </pre>
     */
    public void isCompletable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsCompletableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if the Inward items within an Outward Job have been ordered (through a Purchase Order)
     * </pre>
     */
    public void isOrdered(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsOrderedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if the Outward items within an Outward Job have been dispatched (through Free Issue Material)
     * </pre>
     */
    public void isDispatched(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsDispatchedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add multiple items to a outward job
     * </pre>
     */
    public void addMultipleOutwardJobInwardItems(com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMultipleOutwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an inward item to a outward job
     * </pre>
     */
    public void addOutwardJobInwardItem(com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOutwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an inward item in a outward job
     * </pre>
     */
    public void modifyOutwardJobInwardItem(com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyOutwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an inward item in a outward job
     * </pre>
     */
    public void approveOutwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveOutwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an inward item in a outward job
     * </pre>
     */
    public void deleteOutwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOutwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a outward job
     * </pre>
     */
    public void reorderOutwardJobInwardItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderOutwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Outward Job Inward Item by ID
     * </pre>
     */
    public void viewOutwardJobInwardItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobInwardItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardJobInwardItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved outward job inward items for given outward job ID
     * </pre>
     */
    public void viewApprovedOutwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedOutwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job inward items for given outward job ID
     * </pre>
     */
    public void viewUnapprovedOutwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedOutwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the outward job inward item
     * </pre>
     */
    public void viewOutwardJobInwardItemHistory(com.scailo.sdk.OutwardJobInwardItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardJobInwardItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved outward job inward items for given outward job ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedOutwardJobInwardItems(com.scailo.sdk.OutwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedOutwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job inward items for given outward job ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedOutwardJobInwardItems(com.scailo.sdk.OutwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedOutwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through outward job inward items with pagination
     * </pre>
     */
    public void searchInwardItemsWithPagination(com.scailo.sdk.OutwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchInwardItemsWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload inward items from the filled CSV file
     * </pre>
     */
    public void downloadInwardItemsCSVTemplate(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadInwardItemsCSVTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload inward items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public void uploadOutwardJobInwardItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadOutwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add multiple items to a outward job
     * </pre>
     */
    public void addMultipleOutwardJobOutwardItems(com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMultipleOutwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an outward item to a outward job
     * </pre>
     */
    public void addOutwardJobOutwardItem(com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOutwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an outward item in a outward job
     * </pre>
     */
    public void modifyOutwardJobOutwardItem(com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyOutwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an outward item in a outward job
     * </pre>
     */
    public void approveOutwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveOutwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an outward item in a outward job
     * </pre>
     */
    public void deleteOutwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOutwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a outward job
     * </pre>
     */
    public void reorderOutwardJobOutwardItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderOutwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Outward Job Outward Item by ID
     * </pre>
     */
    public void viewOutwardJobOutwardItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobOutwardItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardJobOutwardItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved outward job outward items for given outward job ID
     * </pre>
     */
    public void viewApprovedOutwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedOutwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job outward items for given outward job ID
     * </pre>
     */
    public void viewUnapprovedOutwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedOutwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the outward job outward item
     * </pre>
     */
    public void viewOutwardJobOutwardItemHistory(com.scailo.sdk.OutwardJobOutwardItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardJobOutwardItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved outward job outward items for given outward job ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedOutwardJobOutwardItems(com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedOutwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved outward job outward items for given outward job ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedOutwardJobOutwardItems(com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through outward job outward items with pagination
     * </pre>
     */
    public void searchOutwardItemsWithPagination(com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchOutwardItemsWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload outward items from the filled CSV file
     * </pre>
     */
    public void downloadOutwardItemsCSVTemplate(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadOutwardItemsCSVTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload outward items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public void uploadOutwardJobOutwardItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadOutwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    public void addOutwardJobContact(com.scailo.sdk.OutwardJobsServiceContactCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOutwardJobContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    public void approveOutwardJobContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveOutwardJobContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    public void deleteOutwardJobContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOutwardJobContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    public void viewOutwardJobContactByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobContact> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardJobContactByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all contacts for given outward job UUID
     * </pre>
     */
    public void viewOutwardJobContacts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobContactsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardJobContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobAncillaryParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.OutwardJobsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all purchase order IDs that are associated with the given outward job UUID
     * </pre>
     */
    public void viewAssociatedPurchaseOrderIDs(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAssociatedPurchaseOrderIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective inward items for the given outward job
     * </pre>
     */
    public void viewProspectiveInwardFamilies(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveInwardFamiliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Filter prospective inward families for the record represented by the given UUID identifier
     * </pre>
     */
    public void filterProspectiveInwardFamilies(com.scailo.sdk.FilterFamiliesReqForIdentifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterProspectiveInwardFamiliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective outward job inward item info for the given family ID and outward job ID
     * </pre>
     */
    public void viewProspectiveOutwardJobInwardItem(com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveOutwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Inward Inventory Match of all the inward families of the given outward job
     * </pre>
     */
    public void viewInwardInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobInwardInventoryMatchList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInwardInventoryMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective outward items for the given outward job
     * </pre>
     */
    public void viewProspectiveOutwardFamilies(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveOutwardFamiliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Filter prospective outward families for the record represented by the given UUID identifier
     * </pre>
     */
    public void filterProspectiveOutwardFamilies(com.scailo.sdk.FilterFamiliesReqForIdentifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterProspectiveOutwardFamiliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective outward job outward item info for the given family ID and outward job ID
     * </pre>
     */
    public void viewProspectiveOutwardJobOutwardItem(com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveOutwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Outward Inventory Match of all the outward families of the given outward job
     * </pre>
     */
    public void viewOutwardInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobOutwardInventoryMatchList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardInventoryMatchMethod(), getCallOptions()), request, responseObserver);
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
     * Download outward job with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public void downloadByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.OutwardJobsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.OutwardJobsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList> responseObserver) {
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
    public void count(com.scailo.sdk.OutwardJobsServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.OutwardJobsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OutwardJobsService.
   * <pre>
   *Describes the common methods applicable on each outward job
   * </pre>
   */
  public static final class OutwardJobsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OutwardJobsServiceBlockingStub> {
    private OutwardJobsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OutwardJobsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OutwardJobsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.OutwardJobsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.OutwardJobsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.OutwardJobsServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.OutwardJobsServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse repeat(com.scailo.sdk.RepeatWithDeliveryDate request) {
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
     * Autofill the outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse autofill(com.scailo.sdk.OutwardJobsServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAutofillMethod(), getCallOptions(), request);
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
     * Checks if the Outward Job can be marked as completed (is true when all the inward items have been ordered and all the outward items have been dispatched)
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isCompletable(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsCompletableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if the Inward items within an Outward Job have been ordered (through a Purchase Order)
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isOrdered(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsOrderedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if the Outward items within an Outward Job have been dispatched (through Free Issue Material)
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isDispatched(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsDispatchedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add multiple items to a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addMultipleOutwardJobInwardItems(com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMultipleOutwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an inward item to a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addOutwardJobInwardItem(com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOutwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an inward item in a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyOutwardJobInwardItem(com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyOutwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an inward item in a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveOutwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveOutwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an inward item in a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteOutwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOutwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderOutwardJobInwardItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderOutwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Outward Job Inward Item by ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobInwardItem viewOutwardJobInwardItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardJobInwardItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved outward job inward items for given outward job ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsInwardItemsList viewApprovedOutwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedOutwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved outward job inward items for given outward job ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsInwardItemsList viewUnapprovedOutwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedOutwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the outward job inward item
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsInwardItemsList viewOutwardJobInwardItemHistory(com.scailo.sdk.OutwardJobInwardItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardJobInwardItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved outward job inward items for given outward job ID with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse viewPaginatedApprovedOutwardJobInwardItems(com.scailo.sdk.OutwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedOutwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved outward job inward items for given outward job ID with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse viewPaginatedUnapprovedOutwardJobInwardItems(com.scailo.sdk.OutwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedOutwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through outward job inward items with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse searchInwardItemsWithPagination(com.scailo.sdk.OutwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchInwardItemsWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload inward items from the filled CSV file
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadInwardItemsCSVTemplate(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadInwardItemsCSVTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upload inward items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public com.scailo.sdk.IdentifiersList uploadOutwardJobInwardItems(com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadOutwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add multiple items to a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addMultipleOutwardJobOutwardItems(com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMultipleOutwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an outward item to a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addOutwardJobOutwardItem(com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOutwardJobOutwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an outward item in a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyOutwardJobOutwardItem(com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyOutwardJobOutwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an outward item in a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveOutwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveOutwardJobOutwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an outward item in a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteOutwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOutwardJobOutwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a outward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderOutwardJobOutwardItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderOutwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Outward Job Outward Item by ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobOutwardItem viewOutwardJobOutwardItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardJobOutwardItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved outward job outward items for given outward job ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsOutwardItemsList viewApprovedOutwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedOutwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved outward job outward items for given outward job ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsOutwardItemsList viewUnapprovedOutwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedOutwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the outward job outward item
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsOutwardItemsList viewOutwardJobOutwardItemHistory(com.scailo.sdk.OutwardJobOutwardItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardJobOutwardItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved outward job outward items for given outward job ID with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse viewPaginatedApprovedOutwardJobOutwardItems(com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedOutwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved outward job outward items for given outward job ID with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse viewPaginatedUnapprovedOutwardJobOutwardItems(com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through outward job outward items with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse searchOutwardItemsWithPagination(com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchOutwardItemsWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload outward items from the filled CSV file
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadOutwardItemsCSVTemplate(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadOutwardItemsCSVTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upload outward items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public com.scailo.sdk.IdentifiersList uploadOutwardJobOutwardItems(com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadOutwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addOutwardJobContact(com.scailo.sdk.OutwardJobsServiceContactCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOutwardJobContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveOutwardJobContact(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveOutwardJobContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteOutwardJobContact(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOutwardJobContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobContact viewOutwardJobContactByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardJobContactByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all contacts for given outward job UUID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobContactsList viewOutwardJobContacts(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardJobContactsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJob viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.OutwardJob viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.OutwardJob viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.OutwardJob viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobAncillaryParameters viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAncillaryParametersByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsServicePaginationResponse viewWithPagination(com.scailo.sdk.OutwardJobsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all purchase order IDs that are associated with the given outward job UUID
     * </pre>
     */
    public com.scailo.sdk.IdentifiersList viewAssociatedPurchaseOrderIDs(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAssociatedPurchaseOrderIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective inward items for the given outward job
     * </pre>
     */
    public com.scailo.sdk.FamiliesList viewProspectiveInwardFamilies(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveInwardFamiliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Filter prospective inward families for the record represented by the given UUID identifier
     * </pre>
     */
    public com.scailo.sdk.FamiliesList filterProspectiveInwardFamilies(com.scailo.sdk.FilterFamiliesReqForIdentifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterProspectiveInwardFamiliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective outward job inward item info for the given family ID and outward job ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest viewProspectiveOutwardJobInwardItem(com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveOutwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Inward Inventory Match of all the inward families of the given outward job
     * </pre>
     */
    public com.scailo.sdk.OutwardJobInwardInventoryMatchList viewInwardInventoryMatch(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInwardInventoryMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective outward items for the given outward job
     * </pre>
     */
    public com.scailo.sdk.FamiliesList viewProspectiveOutwardFamilies(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveOutwardFamiliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Filter prospective outward families for the record represented by the given UUID identifier
     * </pre>
     */
    public com.scailo.sdk.FamiliesList filterProspectiveOutwardFamilies(com.scailo.sdk.FilterFamiliesReqForIdentifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterProspectiveOutwardFamiliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective outward job outward item info for the given family ID and outward job ID
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest viewProspectiveOutwardJobOutwardItem(com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveOutwardJobOutwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Outward Inventory Match of all the outward families of the given outward job
     * </pre>
     */
    public com.scailo.sdk.OutwardJobOutwardInventoryMatchList viewOutwardInventoryMatch(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardInventoryMatchMethod(), getCallOptions(), request);
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
     * Download outward job with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsList searchAll(com.scailo.sdk.OutwardJobsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.OutwardJobsList filter(com.scailo.sdk.OutwardJobsServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.OutwardJobsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.OutwardJobsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OutwardJobsService.
   * <pre>
   *Describes the common methods applicable on each outward job
   * </pre>
   */
  public static final class OutwardJobsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OutwardJobsServiceFutureStub> {
    private OutwardJobsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OutwardJobsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OutwardJobsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.OutwardJobsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.OutwardJobsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.OutwardJobsServiceUpdateRequest request) {
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
        com.scailo.sdk.OutwardJobsServiceUpdateRequest request) {
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
        com.scailo.sdk.RepeatWithDeliveryDate request) {
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
     * Autofill the outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> autofill(
        com.scailo.sdk.OutwardJobsServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request);
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
     * Checks if the Outward Job can be marked as completed (is true when all the inward items have been ordered and all the outward items have been dispatched)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isCompletable(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsCompletableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if the Inward items within an Outward Job have been ordered (through a Purchase Order)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isOrdered(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsOrderedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if the Outward items within an Outward Job have been dispatched (through Free Issue Material)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isDispatched(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsDispatchedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add multiple items to a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addMultipleOutwardJobInwardItems(
        com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMultipleOutwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an inward item to a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addOutwardJobInwardItem(
        com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOutwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an inward item in a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyOutwardJobInwardItem(
        com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyOutwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an inward item in a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveOutwardJobInwardItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveOutwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an inward item in a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteOutwardJobInwardItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOutwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderOutwardJobInwardItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderOutwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Outward Job Inward Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobInwardItem> viewOutwardJobInwardItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardJobInwardItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved outward job inward items for given outward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsInwardItemsList> viewApprovedOutwardJobInwardItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedOutwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved outward job inward items for given outward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsInwardItemsList> viewUnapprovedOutwardJobInwardItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedOutwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the outward job inward item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsInwardItemsList> viewOutwardJobInwardItemHistory(
        com.scailo.sdk.OutwardJobInwardItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardJobInwardItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved outward job inward items for given outward job ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> viewPaginatedApprovedOutwardJobInwardItems(
        com.scailo.sdk.OutwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedOutwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved outward job inward items for given outward job ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> viewPaginatedUnapprovedOutwardJobInwardItems(
        com.scailo.sdk.OutwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedOutwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through outward job inward items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse> searchInwardItemsWithPagination(
        com.scailo.sdk.OutwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchInwardItemsWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload inward items from the filled CSV file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadInwardItemsCSVTemplate(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadInwardItemsCSVTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upload inward items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> uploadOutwardJobInwardItems(
        com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadOutwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add multiple items to a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addMultipleOutwardJobOutwardItems(
        com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMultipleOutwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an outward item to a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addOutwardJobOutwardItem(
        com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOutwardJobOutwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an outward item in a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyOutwardJobOutwardItem(
        com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyOutwardJobOutwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an outward item in a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveOutwardJobOutwardItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveOutwardJobOutwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an outward item in a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteOutwardJobOutwardItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOutwardJobOutwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderOutwardJobOutwardItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderOutwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Outward Job Outward Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobOutwardItem> viewOutwardJobOutwardItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardJobOutwardItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved outward job outward items for given outward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsOutwardItemsList> viewApprovedOutwardJobOutwardItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedOutwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved outward job outward items for given outward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsOutwardItemsList> viewUnapprovedOutwardJobOutwardItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedOutwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the outward job outward item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsOutwardItemsList> viewOutwardJobOutwardItemHistory(
        com.scailo.sdk.OutwardJobOutwardItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardJobOutwardItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved outward job outward items for given outward job ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> viewPaginatedApprovedOutwardJobOutwardItems(
        com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedOutwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved outward job outward items for given outward job ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> viewPaginatedUnapprovedOutwardJobOutwardItems(
        com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through outward job outward items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse> searchOutwardItemsWithPagination(
        com.scailo.sdk.OutwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchOutwardItemsWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload outward items from the filled CSV file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadOutwardItemsCSVTemplate(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadOutwardItemsCSVTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upload outward items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> uploadOutwardJobOutwardItems(
        com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadOutwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addOutwardJobContact(
        com.scailo.sdk.OutwardJobsServiceContactCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOutwardJobContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveOutwardJobContact(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveOutwardJobContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteOutwardJobContact(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOutwardJobContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobContact> viewOutwardJobContactByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardJobContactByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all contacts for given outward job UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobContactsList> viewOutwardJobContacts(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardJobContactsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJob> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJob> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJob> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJob> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobAncillaryParameters> viewAncillaryParametersByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.OutwardJobsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all purchase order IDs that are associated with the given outward job UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> viewAssociatedPurchaseOrderIDs(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAssociatedPurchaseOrderIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective inward items for the given outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> viewProspectiveInwardFamilies(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveInwardFamiliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Filter prospective inward families for the record represented by the given UUID identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> filterProspectiveInwardFamilies(
        com.scailo.sdk.FilterFamiliesReqForIdentifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterProspectiveInwardFamiliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective outward job inward item info for the given family ID and outward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest> viewProspectiveOutwardJobInwardItem(
        com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveOutwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Inward Inventory Match of all the inward families of the given outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobInwardInventoryMatchList> viewInwardInventoryMatch(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInwardInventoryMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective outward items for the given outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> viewProspectiveOutwardFamilies(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveOutwardFamiliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Filter prospective outward families for the record represented by the given UUID identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> filterProspectiveOutwardFamilies(
        com.scailo.sdk.FilterFamiliesReqForIdentifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterProspectiveOutwardFamiliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective outward job outward item info for the given family ID and outward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest> viewProspectiveOutwardJobOutwardItem(
        com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveOutwardJobOutwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Outward Inventory Match of all the outward families of the given outward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobOutwardInventoryMatchList> viewOutwardInventoryMatch(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardInventoryMatchMethod(), getCallOptions()), request);
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
     * Download outward job with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsList> searchAll(
        com.scailo.sdk.OutwardJobsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.OutwardJobsList> filter(
        com.scailo.sdk.OutwardJobsServiceFilterReq request) {
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
        com.scailo.sdk.OutwardJobsServiceCountReq request) {
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
        com.scailo.sdk.OutwardJobsServiceFilterReq request) {
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
  private static final int METHODID_CREATE_MAGIC_LINK = 17;
  private static final int METHODID_IS_COMPLETABLE = 18;
  private static final int METHODID_IS_ORDERED = 19;
  private static final int METHODID_IS_DISPATCHED = 20;
  private static final int METHODID_ADD_MULTIPLE_OUTWARD_JOB_INWARD_ITEMS = 21;
  private static final int METHODID_ADD_OUTWARD_JOB_INWARD_ITEM = 22;
  private static final int METHODID_MODIFY_OUTWARD_JOB_INWARD_ITEM = 23;
  private static final int METHODID_APPROVE_OUTWARD_JOB_INWARD_ITEM = 24;
  private static final int METHODID_DELETE_OUTWARD_JOB_INWARD_ITEM = 25;
  private static final int METHODID_REORDER_OUTWARD_JOB_INWARD_ITEMS = 26;
  private static final int METHODID_VIEW_OUTWARD_JOB_INWARD_ITEM_BY_ID = 27;
  private static final int METHODID_VIEW_APPROVED_OUTWARD_JOB_INWARD_ITEMS = 28;
  private static final int METHODID_VIEW_UNAPPROVED_OUTWARD_JOB_INWARD_ITEMS = 29;
  private static final int METHODID_VIEW_OUTWARD_JOB_INWARD_ITEM_HISTORY = 30;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_OUTWARD_JOB_INWARD_ITEMS = 31;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_OUTWARD_JOB_INWARD_ITEMS = 32;
  private static final int METHODID_SEARCH_INWARD_ITEMS_WITH_PAGINATION = 33;
  private static final int METHODID_DOWNLOAD_INWARD_ITEMS_CSVTEMPLATE = 34;
  private static final int METHODID_UPLOAD_OUTWARD_JOB_INWARD_ITEMS = 35;
  private static final int METHODID_ADD_MULTIPLE_OUTWARD_JOB_OUTWARD_ITEMS = 36;
  private static final int METHODID_ADD_OUTWARD_JOB_OUTWARD_ITEM = 37;
  private static final int METHODID_MODIFY_OUTWARD_JOB_OUTWARD_ITEM = 38;
  private static final int METHODID_APPROVE_OUTWARD_JOB_OUTWARD_ITEM = 39;
  private static final int METHODID_DELETE_OUTWARD_JOB_OUTWARD_ITEM = 40;
  private static final int METHODID_REORDER_OUTWARD_JOB_OUTWARD_ITEMS = 41;
  private static final int METHODID_VIEW_OUTWARD_JOB_OUTWARD_ITEM_BY_ID = 42;
  private static final int METHODID_VIEW_APPROVED_OUTWARD_JOB_OUTWARD_ITEMS = 43;
  private static final int METHODID_VIEW_UNAPPROVED_OUTWARD_JOB_OUTWARD_ITEMS = 44;
  private static final int METHODID_VIEW_OUTWARD_JOB_OUTWARD_ITEM_HISTORY = 45;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_OUTWARD_JOB_OUTWARD_ITEMS = 46;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_OUTWARD_JOB_OUTWARD_ITEMS = 47;
  private static final int METHODID_SEARCH_OUTWARD_ITEMS_WITH_PAGINATION = 48;
  private static final int METHODID_DOWNLOAD_OUTWARD_ITEMS_CSVTEMPLATE = 49;
  private static final int METHODID_UPLOAD_OUTWARD_JOB_OUTWARD_ITEMS = 50;
  private static final int METHODID_ADD_OUTWARD_JOB_CONTACT = 51;
  private static final int METHODID_APPROVE_OUTWARD_JOB_CONTACT = 52;
  private static final int METHODID_DELETE_OUTWARD_JOB_CONTACT = 53;
  private static final int METHODID_VIEW_OUTWARD_JOB_CONTACT_BY_ID = 54;
  private static final int METHODID_VIEW_OUTWARD_JOB_CONTACTS = 55;
  private static final int METHODID_VIEW_BY_ID = 56;
  private static final int METHODID_VIEW_BY_UUID = 57;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 58;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 59;
  private static final int METHODID_VIEW_FROM_IDS = 60;
  private static final int METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID = 61;
  private static final int METHODID_VIEW_ALL = 62;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 63;
  private static final int METHODID_VIEW_WITH_PAGINATION = 64;
  private static final int METHODID_VIEW_ASSOCIATED_PURCHASE_ORDER_IDS = 65;
  private static final int METHODID_VIEW_PROSPECTIVE_INWARD_FAMILIES = 66;
  private static final int METHODID_FILTER_PROSPECTIVE_INWARD_FAMILIES = 67;
  private static final int METHODID_VIEW_PROSPECTIVE_OUTWARD_JOB_INWARD_ITEM = 68;
  private static final int METHODID_VIEW_INWARD_INVENTORY_MATCH = 69;
  private static final int METHODID_VIEW_PROSPECTIVE_OUTWARD_FAMILIES = 70;
  private static final int METHODID_FILTER_PROSPECTIVE_OUTWARD_FAMILIES = 71;
  private static final int METHODID_VIEW_PROSPECTIVE_OUTWARD_JOB_OUTWARD_ITEM = 72;
  private static final int METHODID_VIEW_OUTWARD_INVENTORY_MATCH = 73;
  private static final int METHODID_IS_DOWNLOADABLE = 74;
  private static final int METHODID_DOWNLOAD_BY_UUID = 75;
  private static final int METHODID_SEARCH_ALL = 76;
  private static final int METHODID_FILTER = 77;
  private static final int METHODID_COUNT_IN_STATUS = 78;
  private static final int METHODID_COUNT = 79;
  private static final int METHODID_DOWNLOAD_AS_CSV = 80;

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
          serviceImpl.create((com.scailo.sdk.OutwardJobsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.OutwardJobsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.OutwardJobsServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.OutwardJobsServiceUpdateRequest) request,
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
          serviceImpl.repeat((com.scailo.sdk.RepeatWithDeliveryDate) request,
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
          serviceImpl.autofill((com.scailo.sdk.OutwardJobsServiceAutofillRequest) request,
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
        case METHODID_IS_ORDERED:
          serviceImpl.isOrdered((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_IS_DISPATCHED:
          serviceImpl.isDispatched((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_ADD_MULTIPLE_OUTWARD_JOB_INWARD_ITEMS:
          serviceImpl.addMultipleOutwardJobInwardItems((com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_OUTWARD_JOB_INWARD_ITEM:
          serviceImpl.addOutwardJobInwardItem((com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_OUTWARD_JOB_INWARD_ITEM:
          serviceImpl.modifyOutwardJobInwardItem((com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_OUTWARD_JOB_INWARD_ITEM:
          serviceImpl.approveOutwardJobInwardItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_OUTWARD_JOB_INWARD_ITEM:
          serviceImpl.deleteOutwardJobInwardItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_OUTWARD_JOB_INWARD_ITEMS:
          serviceImpl.reorderOutwardJobInwardItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_JOB_INWARD_ITEM_BY_ID:
          serviceImpl.viewOutwardJobInwardItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobInwardItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_OUTWARD_JOB_INWARD_ITEMS:
          serviceImpl.viewApprovedOutwardJobInwardItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsInwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_OUTWARD_JOB_INWARD_ITEMS:
          serviceImpl.viewUnapprovedOutwardJobInwardItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsInwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_JOB_INWARD_ITEM_HISTORY:
          serviceImpl.viewOutwardJobInwardItemHistory((com.scailo.sdk.OutwardJobInwardItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsInwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_OUTWARD_JOB_INWARD_ITEMS:
          serviceImpl.viewPaginatedApprovedOutwardJobInwardItems((com.scailo.sdk.OutwardJobInwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_OUTWARD_JOB_INWARD_ITEMS:
          serviceImpl.viewPaginatedUnapprovedOutwardJobInwardItems((com.scailo.sdk.OutwardJobInwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_INWARD_ITEMS_WITH_PAGINATION:
          serviceImpl.searchInwardItemsWithPagination((com.scailo.sdk.OutwardJobInwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_INWARD_ITEMS_CSVTEMPLATE:
          serviceImpl.downloadInwardItemsCSVTemplate((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_UPLOAD_OUTWARD_JOB_INWARD_ITEMS:
          serviceImpl.uploadOutwardJobInwardItems((com.scailo.sdk.IdentifierUUIDWithFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_ADD_MULTIPLE_OUTWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.addMultipleOutwardJobOutwardItems((com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_OUTWARD_JOB_OUTWARD_ITEM:
          serviceImpl.addOutwardJobOutwardItem((com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_OUTWARD_JOB_OUTWARD_ITEM:
          serviceImpl.modifyOutwardJobOutwardItem((com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_OUTWARD_JOB_OUTWARD_ITEM:
          serviceImpl.approveOutwardJobOutwardItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_OUTWARD_JOB_OUTWARD_ITEM:
          serviceImpl.deleteOutwardJobOutwardItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_OUTWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.reorderOutwardJobOutwardItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_JOB_OUTWARD_ITEM_BY_ID:
          serviceImpl.viewOutwardJobOutwardItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobOutwardItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_OUTWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.viewApprovedOutwardJobOutwardItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsOutwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_OUTWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.viewUnapprovedOutwardJobOutwardItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsOutwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_JOB_OUTWARD_ITEM_HISTORY:
          serviceImpl.viewOutwardJobOutwardItemHistory((com.scailo.sdk.OutwardJobOutwardItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsOutwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_OUTWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.viewPaginatedApprovedOutwardJobOutwardItems((com.scailo.sdk.OutwardJobOutwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_OUTWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.viewPaginatedUnapprovedOutwardJobOutwardItems((com.scailo.sdk.OutwardJobOutwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_OUTWARD_ITEMS_WITH_PAGINATION:
          serviceImpl.searchOutwardItemsWithPagination((com.scailo.sdk.OutwardJobOutwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_OUTWARD_ITEMS_CSVTEMPLATE:
          serviceImpl.downloadOutwardItemsCSVTemplate((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_UPLOAD_OUTWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.uploadOutwardJobOutwardItems((com.scailo.sdk.IdentifierUUIDWithFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_ADD_OUTWARD_JOB_CONTACT:
          serviceImpl.addOutwardJobContact((com.scailo.sdk.OutwardJobsServiceContactCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_OUTWARD_JOB_CONTACT:
          serviceImpl.approveOutwardJobContact((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_OUTWARD_JOB_CONTACT:
          serviceImpl.deleteOutwardJobContact((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_JOB_CONTACT_BY_ID:
          serviceImpl.viewOutwardJobContactByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobContact>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_JOB_CONTACTS:
          serviceImpl.viewOutwardJobContacts((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobContactsList>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJob>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList>) responseObserver);
          break;
        case METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID:
          serviceImpl.viewAncillaryParametersByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobAncillaryParameters>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.OutwardJobsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_ASSOCIATED_PURCHASE_ORDER_IDS:
          serviceImpl.viewAssociatedPurchaseOrderIDs((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_INWARD_FAMILIES:
          serviceImpl.viewProspectiveInwardFamilies((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER_PROSPECTIVE_INWARD_FAMILIES:
          serviceImpl.filterProspectiveInwardFamilies((com.scailo.sdk.FilterFamiliesReqForIdentifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_OUTWARD_JOB_INWARD_ITEM:
          serviceImpl.viewProspectiveOutwardJobInwardItem((com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest>) responseObserver);
          break;
        case METHODID_VIEW_INWARD_INVENTORY_MATCH:
          serviceImpl.viewInwardInventoryMatch((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobInwardInventoryMatchList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_OUTWARD_FAMILIES:
          serviceImpl.viewProspectiveOutwardFamilies((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER_PROSPECTIVE_OUTWARD_FAMILIES:
          serviceImpl.filterProspectiveOutwardFamilies((com.scailo.sdk.FilterFamiliesReqForIdentifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_OUTWARD_JOB_OUTWARD_ITEM:
          serviceImpl.viewProspectiveOutwardJobOutwardItem((com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_INVENTORY_MATCH:
          serviceImpl.viewOutwardInventoryMatch((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobOutwardInventoryMatchList>) responseObserver);
          break;
        case METHODID_IS_DOWNLOADABLE:
          serviceImpl.isDownloadable((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_BY_UUID:
          serviceImpl.downloadByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.OutwardJobsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.OutwardJobsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.OutwardJobsList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.OutwardJobsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.OutwardJobsServiceFilterReq) request,
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
              com.scailo.sdk.OutwardJobsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceUpdateRequest,
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
              com.scailo.sdk.OutwardJobsServiceUpdateRequest,
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
              com.scailo.sdk.RepeatWithDeliveryDate,
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
              com.scailo.sdk.OutwardJobsServiceAutofillRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_AUTOFILL)))
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
          getIsOrderedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_IS_ORDERED)))
        .addMethod(
          getIsDispatchedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_IS_DISPATCHED)))
        .addMethod(
          getAddMultipleOutwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceMultipleInwardItemsCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_MULTIPLE_OUTWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getAddOutwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_OUTWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getModifyOutwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceInwardItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_OUTWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getApproveOutwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_OUTWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getDeleteOutwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_OUTWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getReorderOutwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_OUTWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getViewOutwardJobInwardItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OutwardJobInwardItem>(
                service, METHODID_VIEW_OUTWARD_JOB_INWARD_ITEM_BY_ID)))
        .addMethod(
          getViewApprovedOutwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.OutwardJobsInwardItemsList>(
                service, METHODID_VIEW_APPROVED_OUTWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getViewUnapprovedOutwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.OutwardJobsInwardItemsList>(
                service, METHODID_VIEW_UNAPPROVED_OUTWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getViewOutwardJobInwardItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobInwardItemHistoryRequest,
              com.scailo.sdk.OutwardJobsInwardItemsList>(
                service, METHODID_VIEW_OUTWARD_JOB_INWARD_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedOutwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobInwardItemsSearchRequest,
              com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_OUTWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedOutwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobInwardItemsSearchRequest,
              com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_OUTWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getSearchInwardItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobInwardItemsSearchRequest,
              com.scailo.sdk.OutwardJobsServicePaginatedInwardItemsResponse>(
                service, METHODID_SEARCH_INWARD_ITEMS_WITH_PAGINATION)))
        .addMethod(
          getDownloadInwardItemsCSVTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_INWARD_ITEMS_CSVTEMPLATE)))
        .addMethod(
          getUploadOutwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithFile,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_UPLOAD_OUTWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getAddMultipleOutwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceMultipleOutwardItemsCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_MULTIPLE_OUTWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getAddOutwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_OUTWARD_JOB_OUTWARD_ITEM)))
        .addMethod(
          getModifyOutwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceOutwardItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_OUTWARD_JOB_OUTWARD_ITEM)))
        .addMethod(
          getApproveOutwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_OUTWARD_JOB_OUTWARD_ITEM)))
        .addMethod(
          getDeleteOutwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_OUTWARD_JOB_OUTWARD_ITEM)))
        .addMethod(
          getReorderOutwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_OUTWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getViewOutwardJobOutwardItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OutwardJobOutwardItem>(
                service, METHODID_VIEW_OUTWARD_JOB_OUTWARD_ITEM_BY_ID)))
        .addMethod(
          getViewApprovedOutwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.OutwardJobsOutwardItemsList>(
                service, METHODID_VIEW_APPROVED_OUTWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getViewUnapprovedOutwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.OutwardJobsOutwardItemsList>(
                service, METHODID_VIEW_UNAPPROVED_OUTWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getViewOutwardJobOutwardItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobOutwardItemHistoryRequest,
              com.scailo.sdk.OutwardJobsOutwardItemsList>(
                service, METHODID_VIEW_OUTWARD_JOB_OUTWARD_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedOutwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobOutwardItemsSearchRequest,
              com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_OUTWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobOutwardItemsSearchRequest,
              com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_OUTWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getSearchOutwardItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobOutwardItemsSearchRequest,
              com.scailo.sdk.OutwardJobsServicePaginatedOutwardItemsResponse>(
                service, METHODID_SEARCH_OUTWARD_ITEMS_WITH_PAGINATION)))
        .addMethod(
          getDownloadOutwardItemsCSVTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_OUTWARD_ITEMS_CSVTEMPLATE)))
        .addMethod(
          getUploadOutwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithFile,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_UPLOAD_OUTWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getAddOutwardJobContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceContactCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_OUTWARD_JOB_CONTACT)))
        .addMethod(
          getApproveOutwardJobContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_OUTWARD_JOB_CONTACT)))
        .addMethod(
          getDeleteOutwardJobContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_OUTWARD_JOB_CONTACT)))
        .addMethod(
          getViewOutwardJobContactByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OutwardJobContact>(
                service, METHODID_VIEW_OUTWARD_JOB_CONTACT_BY_ID)))
        .addMethod(
          getViewOutwardJobContactsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJobContactsList>(
                service, METHODID_VIEW_OUTWARD_JOB_CONTACTS)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OutwardJob>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJob>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.OutwardJob>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJob>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.OutwardJobsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAncillaryParametersByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJobAncillaryParameters>(
                service, METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.OutwardJobsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJobsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServicePaginationReq,
              com.scailo.sdk.OutwardJobsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewAssociatedPurchaseOrderIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_VIEW_ASSOCIATED_PURCHASE_ORDER_IDS)))
        .addMethod(
          getViewProspectiveInwardFamiliesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_VIEW_PROSPECTIVE_INWARD_FAMILIES)))
        .addMethod(
          getFilterProspectiveInwardFamiliesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FilterFamiliesReqForIdentifier,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_FILTER_PROSPECTIVE_INWARD_FAMILIES)))
        .addMethod(
          getViewProspectiveOutwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobInwardItemProspectiveInfoRequest,
              com.scailo.sdk.OutwardJobsServiceInwardItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_OUTWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getViewInwardInventoryMatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJobInwardInventoryMatchList>(
                service, METHODID_VIEW_INWARD_INVENTORY_MATCH)))
        .addMethod(
          getViewProspectiveOutwardFamiliesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_VIEW_PROSPECTIVE_OUTWARD_FAMILIES)))
        .addMethod(
          getFilterProspectiveOutwardFamiliesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FilterFamiliesReqForIdentifier,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_FILTER_PROSPECTIVE_OUTWARD_FAMILIES)))
        .addMethod(
          getViewProspectiveOutwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobOutwardItemProspectiveInfoRequest,
              com.scailo.sdk.OutwardJobsServiceOutwardItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_OUTWARD_JOB_OUTWARD_ITEM)))
        .addMethod(
          getViewOutwardInventoryMatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.OutwardJobOutwardInventoryMatchList>(
                service, METHODID_VIEW_OUTWARD_INVENTORY_MATCH)))
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
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceSearchAllReq,
              com.scailo.sdk.OutwardJobsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceFilterReq,
              com.scailo.sdk.OutwardJobsList>(
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
              com.scailo.sdk.OutwardJobsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.OutwardJobsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class OutwardJobsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OutwardJobsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.OutwardJobsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OutwardJobsService");
    }
  }

  private static final class OutwardJobsServiceFileDescriptorSupplier
      extends OutwardJobsServiceBaseDescriptorSupplier {
    OutwardJobsServiceFileDescriptorSupplier() {}
  }

  private static final class OutwardJobsServiceMethodDescriptorSupplier
      extends OutwardJobsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OutwardJobsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OutwardJobsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OutwardJobsServiceFileDescriptorSupplier())
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
              .addMethod(getCreateMagicLinkMethod())
              .addMethod(getIsCompletableMethod())
              .addMethod(getIsOrderedMethod())
              .addMethod(getIsDispatchedMethod())
              .addMethod(getAddMultipleOutwardJobInwardItemsMethod())
              .addMethod(getAddOutwardJobInwardItemMethod())
              .addMethod(getModifyOutwardJobInwardItemMethod())
              .addMethod(getApproveOutwardJobInwardItemMethod())
              .addMethod(getDeleteOutwardJobInwardItemMethod())
              .addMethod(getReorderOutwardJobInwardItemsMethod())
              .addMethod(getViewOutwardJobInwardItemByIDMethod())
              .addMethod(getViewApprovedOutwardJobInwardItemsMethod())
              .addMethod(getViewUnapprovedOutwardJobInwardItemsMethod())
              .addMethod(getViewOutwardJobInwardItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedOutwardJobInwardItemsMethod())
              .addMethod(getViewPaginatedUnapprovedOutwardJobInwardItemsMethod())
              .addMethod(getSearchInwardItemsWithPaginationMethod())
              .addMethod(getDownloadInwardItemsCSVTemplateMethod())
              .addMethod(getUploadOutwardJobInwardItemsMethod())
              .addMethod(getAddMultipleOutwardJobOutwardItemsMethod())
              .addMethod(getAddOutwardJobOutwardItemMethod())
              .addMethod(getModifyOutwardJobOutwardItemMethod())
              .addMethod(getApproveOutwardJobOutwardItemMethod())
              .addMethod(getDeleteOutwardJobOutwardItemMethod())
              .addMethod(getReorderOutwardJobOutwardItemsMethod())
              .addMethod(getViewOutwardJobOutwardItemByIDMethod())
              .addMethod(getViewApprovedOutwardJobOutwardItemsMethod())
              .addMethod(getViewUnapprovedOutwardJobOutwardItemsMethod())
              .addMethod(getViewOutwardJobOutwardItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedOutwardJobOutwardItemsMethod())
              .addMethod(getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod())
              .addMethod(getSearchOutwardItemsWithPaginationMethod())
              .addMethod(getDownloadOutwardItemsCSVTemplateMethod())
              .addMethod(getUploadOutwardJobOutwardItemsMethod())
              .addMethod(getAddOutwardJobContactMethod())
              .addMethod(getApproveOutwardJobContactMethod())
              .addMethod(getDeleteOutwardJobContactMethod())
              .addMethod(getViewOutwardJobContactByIDMethod())
              .addMethod(getViewOutwardJobContactsMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewAncillaryParametersByUUIDMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewAllForEntityUUIDMethod())
              .addMethod(getViewWithPaginationMethod())
              .addMethod(getViewAssociatedPurchaseOrderIDsMethod())
              .addMethod(getViewProspectiveInwardFamiliesMethod())
              .addMethod(getFilterProspectiveInwardFamiliesMethod())
              .addMethod(getViewProspectiveOutwardJobInwardItemMethod())
              .addMethod(getViewInwardInventoryMatchMethod())
              .addMethod(getViewProspectiveOutwardFamiliesMethod())
              .addMethod(getFilterProspectiveOutwardFamiliesMethod())
              .addMethod(getViewProspectiveOutwardJobOutwardItemMethod())
              .addMethod(getViewOutwardInventoryMatchMethod())
              .addMethod(getIsDownloadableMethod())
              .addMethod(getDownloadByUUIDMethod())
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
