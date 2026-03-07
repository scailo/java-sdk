package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each inward job
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: inward_jobs.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InwardJobsServiceGrpc {

  private InwardJobsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.InwardJobsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.InwardJobsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = InwardJobsServiceGrpc.getCreateMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getCreateMethod = InwardJobsServiceGrpc.getCreateMethod) == null) {
          InwardJobsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.InwardJobsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = InwardJobsServiceGrpc.getDraftMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDraftMethod = InwardJobsServiceGrpc.getDraftMethod) == null) {
          InwardJobsServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.InwardJobsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = InwardJobsServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDraftUpdateMethod = InwardJobsServiceGrpc.getDraftUpdateMethod) == null) {
          InwardJobsServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = InwardJobsServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getSendForVerificationMethod = InwardJobsServiceGrpc.getSendForVerificationMethod) == null) {
          InwardJobsServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = InwardJobsServiceGrpc.getVerifyMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getVerifyMethod = InwardJobsServiceGrpc.getVerifyMethod) == null) {
          InwardJobsServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = InwardJobsServiceGrpc.getApproveMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getApproveMethod = InwardJobsServiceGrpc.getApproveMethod) == null) {
          InwardJobsServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = InwardJobsServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getSendForRevisionMethod = InwardJobsServiceGrpc.getSendForRevisionMethod) == null) {
          InwardJobsServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.InwardJobsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = InwardJobsServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getRevisionUpdateMethod = InwardJobsServiceGrpc.getRevisionUpdateMethod) == null) {
          InwardJobsServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = InwardJobsServiceGrpc.getHaltMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getHaltMethod = InwardJobsServiceGrpc.getHaltMethod) == null) {
          InwardJobsServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = InwardJobsServiceGrpc.getDiscardMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDiscardMethod = InwardJobsServiceGrpc.getDiscardMethod) == null) {
          InwardJobsServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = InwardJobsServiceGrpc.getRestoreMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getRestoreMethod = InwardJobsServiceGrpc.getRestoreMethod) == null) {
          InwardJobsServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = InwardJobsServiceGrpc.getCompleteMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getCompleteMethod = InwardJobsServiceGrpc.getCompleteMethod) == null) {
          InwardJobsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = InwardJobsServiceGrpc.getRepeatMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getRepeatMethod = InwardJobsServiceGrpc.getRepeatMethod) == null) {
          InwardJobsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.RepeatWithDeliveryDate, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.RepeatWithDeliveryDate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getReopenMethod = InwardJobsServiceGrpc.getReopenMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getReopenMethod = InwardJobsServiceGrpc.getReopenMethod) == null) {
          InwardJobsServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getCommentAddMethod = InwardJobsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getCommentAddMethod = InwardJobsServiceGrpc.getCommentAddMethod) == null) {
          InwardJobsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getSendEmailMethod = InwardJobsServiceGrpc.getSendEmailMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getSendEmailMethod = InwardJobsServiceGrpc.getSendEmailMethod) == null) {
          InwardJobsServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Autofill",
      requestType = com.scailo.sdk.InwardJobsServiceAutofillRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceAutofillRequest, com.scailo.sdk.IdentifierResponse> getAutofillMethod;
    if ((getAutofillMethod = InwardJobsServiceGrpc.getAutofillMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getAutofillMethod = InwardJobsServiceGrpc.getAutofillMethod) == null) {
          InwardJobsServiceGrpc.getAutofillMethod = getAutofillMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceAutofillRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Autofill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceAutofillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Autofill"))
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
    if ((getCreateMagicLinkMethod = InwardJobsServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = InwardJobsServiceGrpc.getCreateMagicLinkMethod) == null) {
          InwardJobsServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("CreateMagicLink"))
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
    if ((getIsCompletableMethod = InwardJobsServiceGrpc.getIsCompletableMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getIsCompletableMethod = InwardJobsServiceGrpc.getIsCompletableMethod) == null) {
          InwardJobsServiceGrpc.getIsCompletableMethod = getIsCompletableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsCompletable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("IsCompletable"))
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
    if ((getIsOrderedMethod = InwardJobsServiceGrpc.getIsOrderedMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getIsOrderedMethod = InwardJobsServiceGrpc.getIsOrderedMethod) == null) {
          InwardJobsServiceGrpc.getIsOrderedMethod = getIsOrderedMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsOrdered"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("IsOrdered"))
              .build();
        }
      }
    }
    return getIsOrderedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsReceivedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsReceived",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getIsReceivedMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getIsReceivedMethod;
    if ((getIsReceivedMethod = InwardJobsServiceGrpc.getIsReceivedMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getIsReceivedMethod = InwardJobsServiceGrpc.getIsReceivedMethod) == null) {
          InwardJobsServiceGrpc.getIsReceivedMethod = getIsReceivedMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsReceived"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("IsReceived"))
              .build();
        }
      }
    }
    return getIsReceivedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultipleInwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMultipleInwardJobInwardItems",
      requestType = com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultipleInwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest, com.scailo.sdk.IdentifierResponse> getAddMultipleInwardJobInwardItemsMethod;
    if ((getAddMultipleInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getAddMultipleInwardJobInwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getAddMultipleInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getAddMultipleInwardJobInwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getAddMultipleInwardJobInwardItemsMethod = getAddMultipleInwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMultipleInwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("AddMultipleInwardJobInwardItems"))
              .build();
        }
      }
    }
    return getAddMultipleInwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddInwardJobInwardItem",
      requestType = com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddInwardJobInwardItemMethod;
    if ((getAddInwardJobInwardItemMethod = InwardJobsServiceGrpc.getAddInwardJobInwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getAddInwardJobInwardItemMethod = InwardJobsServiceGrpc.getAddInwardJobInwardItemMethod) == null) {
          InwardJobsServiceGrpc.getAddInwardJobInwardItemMethod = getAddInwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddInwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("AddInwardJobInwardItem"))
              .build();
        }
      }
    }
    return getAddInwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyInwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyInwardJobInwardItem",
      requestType = com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyInwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyInwardJobInwardItemMethod;
    if ((getModifyInwardJobInwardItemMethod = InwardJobsServiceGrpc.getModifyInwardJobInwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getModifyInwardJobInwardItemMethod = InwardJobsServiceGrpc.getModifyInwardJobInwardItemMethod) == null) {
          InwardJobsServiceGrpc.getModifyInwardJobInwardItemMethod = getModifyInwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyInwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ModifyInwardJobInwardItem"))
              .build();
        }
      }
    }
    return getModifyInwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveInwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveInwardJobInwardItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveInwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveInwardJobInwardItemMethod;
    if ((getApproveInwardJobInwardItemMethod = InwardJobsServiceGrpc.getApproveInwardJobInwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getApproveInwardJobInwardItemMethod = InwardJobsServiceGrpc.getApproveInwardJobInwardItemMethod) == null) {
          InwardJobsServiceGrpc.getApproveInwardJobInwardItemMethod = getApproveInwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveInwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ApproveInwardJobInwardItem"))
              .build();
        }
      }
    }
    return getApproveInwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteInwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInwardJobInwardItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteInwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteInwardJobInwardItemMethod;
    if ((getDeleteInwardJobInwardItemMethod = InwardJobsServiceGrpc.getDeleteInwardJobInwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDeleteInwardJobInwardItemMethod = InwardJobsServiceGrpc.getDeleteInwardJobInwardItemMethod) == null) {
          InwardJobsServiceGrpc.getDeleteInwardJobInwardItemMethod = getDeleteInwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("DeleteInwardJobInwardItem"))
              .build();
        }
      }
    }
    return getDeleteInwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderInwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderInwardJobInwardItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderInwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderInwardJobInwardItemsMethod;
    if ((getReorderInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getReorderInwardJobInwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getReorderInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getReorderInwardJobInwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getReorderInwardJobInwardItemsMethod = getReorderInwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderInwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ReorderInwardJobInwardItems"))
              .build();
        }
      }
    }
    return getReorderInwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJobInwardItem> getViewInwardJobInwardItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInwardJobInwardItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.InwardJobInwardItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJobInwardItem> getViewInwardJobInwardItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJobInwardItem> getViewInwardJobInwardItemByIDMethod;
    if ((getViewInwardJobInwardItemByIDMethod = InwardJobsServiceGrpc.getViewInwardJobInwardItemByIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewInwardJobInwardItemByIDMethod = InwardJobsServiceGrpc.getViewInwardJobInwardItemByIDMethod) == null) {
          InwardJobsServiceGrpc.getViewInwardJobInwardItemByIDMethod = getViewInwardJobInwardItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJobInwardItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInwardJobInwardItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobInwardItem.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewInwardJobInwardItemByID"))
              .build();
        }
      }
    }
    return getViewInwardJobInwardItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.InwardJobsInwardItemsList> getViewApprovedInwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedInwardJobInwardItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.InwardJobsInwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.InwardJobsInwardItemsList> getViewApprovedInwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.InwardJobsInwardItemsList> getViewApprovedInwardJobInwardItemsMethod;
    if ((getViewApprovedInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getViewApprovedInwardJobInwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewApprovedInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getViewApprovedInwardJobInwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getViewApprovedInwardJobInwardItemsMethod = getViewApprovedInwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.InwardJobsInwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedInwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsInwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewApprovedInwardJobInwardItems"))
              .build();
        }
      }
    }
    return getViewApprovedInwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.InwardJobsInwardItemsList> getViewUnapprovedInwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedInwardJobInwardItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.InwardJobsInwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.InwardJobsInwardItemsList> getViewUnapprovedInwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.InwardJobsInwardItemsList> getViewUnapprovedInwardJobInwardItemsMethod;
    if ((getViewUnapprovedInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getViewUnapprovedInwardJobInwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewUnapprovedInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getViewUnapprovedInwardJobInwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getViewUnapprovedInwardJobInwardItemsMethod = getViewUnapprovedInwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.InwardJobsInwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedInwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsInwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewUnapprovedInwardJobInwardItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedInwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemHistoryRequest,
      com.scailo.sdk.InwardJobsInwardItemsList> getViewInwardJobInwardItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInwardJobInwardItemHistory",
      requestType = com.scailo.sdk.InwardJobInwardItemHistoryRequest.class,
      responseType = com.scailo.sdk.InwardJobsInwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemHistoryRequest,
      com.scailo.sdk.InwardJobsInwardItemsList> getViewInwardJobInwardItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemHistoryRequest, com.scailo.sdk.InwardJobsInwardItemsList> getViewInwardJobInwardItemHistoryMethod;
    if ((getViewInwardJobInwardItemHistoryMethod = InwardJobsServiceGrpc.getViewInwardJobInwardItemHistoryMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewInwardJobInwardItemHistoryMethod = InwardJobsServiceGrpc.getViewInwardJobInwardItemHistoryMethod) == null) {
          InwardJobsServiceGrpc.getViewInwardJobInwardItemHistoryMethod = getViewInwardJobInwardItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobInwardItemHistoryRequest, com.scailo.sdk.InwardJobsInwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInwardJobInwardItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobInwardItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsInwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewInwardJobInwardItemHistory"))
              .build();
        }
      }
    }
    return getViewInwardJobInwardItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedApprovedInwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedInwardJobInwardItems",
      requestType = com.scailo.sdk.InwardJobInwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedApprovedInwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedApprovedInwardJobInwardItemsMethod;
    if ((getViewPaginatedApprovedInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobInwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewPaginatedApprovedInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobInwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobInwardItemsMethod = getViewPaginatedApprovedInwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobInwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedInwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobInwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewPaginatedApprovedInwardJobInwardItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedInwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedUnapprovedInwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedInwardJobInwardItems",
      requestType = com.scailo.sdk.InwardJobInwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedUnapprovedInwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> getViewPaginatedUnapprovedInwardJobInwardItemsMethod;
    if ((getViewPaginatedUnapprovedInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobInwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobInwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobInwardItemsMethod = getViewPaginatedUnapprovedInwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobInwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedInwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobInwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedInwardJobInwardItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedInwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> getSearchInwardItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchInwardItemsWithPagination",
      requestType = com.scailo.sdk.InwardJobInwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> getSearchInwardItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> getSearchInwardItemsWithPaginationMethod;
    if ((getSearchInwardItemsWithPaginationMethod = InwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getSearchInwardItemsWithPaginationMethod = InwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod) == null) {
          InwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod = getSearchInwardItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobInwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchInwardItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobInwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("SearchInwardItemsWithPagination"))
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
    if ((getDownloadInwardItemsCSVTemplateMethod = InwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDownloadInwardItemsCSVTemplateMethod = InwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod) == null) {
          InwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod = getDownloadInwardItemsCSVTemplateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadInwardItemsCSVTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("DownloadInwardItemsCSVTemplate"))
              .build();
        }
      }
    }
    return getDownloadInwardItemsCSVTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadInwardJobInwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadInwardJobInwardItems",
      requestType = com.scailo.sdk.IdentifierUUIDWithFile.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadInwardJobInwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList> getUploadInwardJobInwardItemsMethod;
    if ((getUploadInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getUploadInwardJobInwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getUploadInwardJobInwardItemsMethod = InwardJobsServiceGrpc.getUploadInwardJobInwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getUploadInwardJobInwardItemsMethod = getUploadInwardJobInwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadInwardJobInwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("UploadInwardJobInwardItems"))
              .build();
        }
      }
    }
    return getUploadInwardJobInwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultipleInwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMultipleInwardJobOutwardItems",
      requestType = com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultipleInwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest, com.scailo.sdk.IdentifierResponse> getAddMultipleInwardJobOutwardItemsMethod;
    if ((getAddMultipleInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getAddMultipleInwardJobOutwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getAddMultipleInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getAddMultipleInwardJobOutwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getAddMultipleInwardJobOutwardItemsMethod = getAddMultipleInwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMultipleInwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("AddMultipleInwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getAddMultipleInwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddInwardJobOutwardItem",
      requestType = com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddInwardJobOutwardItemMethod;
    if ((getAddInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getAddInwardJobOutwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getAddInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getAddInwardJobOutwardItemMethod) == null) {
          InwardJobsServiceGrpc.getAddInwardJobOutwardItemMethod = getAddInwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddInwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("AddInwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getAddInwardJobOutwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyInwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyInwardJobOutwardItem",
      requestType = com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyInwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyInwardJobOutwardItemMethod;
    if ((getModifyInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getModifyInwardJobOutwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getModifyInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getModifyInwardJobOutwardItemMethod) == null) {
          InwardJobsServiceGrpc.getModifyInwardJobOutwardItemMethod = getModifyInwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyInwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ModifyInwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getModifyInwardJobOutwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveInwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveInwardJobOutwardItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveInwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveInwardJobOutwardItemMethod;
    if ((getApproveInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getApproveInwardJobOutwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getApproveInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getApproveInwardJobOutwardItemMethod) == null) {
          InwardJobsServiceGrpc.getApproveInwardJobOutwardItemMethod = getApproveInwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveInwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ApproveInwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getApproveInwardJobOutwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteInwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInwardJobOutwardItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteInwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteInwardJobOutwardItemMethod;
    if ((getDeleteInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getDeleteInwardJobOutwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDeleteInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getDeleteInwardJobOutwardItemMethod) == null) {
          InwardJobsServiceGrpc.getDeleteInwardJobOutwardItemMethod = getDeleteInwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("DeleteInwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getDeleteInwardJobOutwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderInwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderInwardJobOutwardItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderInwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderInwardJobOutwardItemsMethod;
    if ((getReorderInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getReorderInwardJobOutwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getReorderInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getReorderInwardJobOutwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getReorderInwardJobOutwardItemsMethod = getReorderInwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderInwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ReorderInwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getReorderInwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJobOutwardItem> getViewInwardJobOutwardItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInwardJobOutwardItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.InwardJobOutwardItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJobOutwardItem> getViewInwardJobOutwardItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJobOutwardItem> getViewInwardJobOutwardItemByIDMethod;
    if ((getViewInwardJobOutwardItemByIDMethod = InwardJobsServiceGrpc.getViewInwardJobOutwardItemByIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewInwardJobOutwardItemByIDMethod = InwardJobsServiceGrpc.getViewInwardJobOutwardItemByIDMethod) == null) {
          InwardJobsServiceGrpc.getViewInwardJobOutwardItemByIDMethod = getViewInwardJobOutwardItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJobOutwardItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInwardJobOutwardItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobOutwardItem.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewInwardJobOutwardItemByID"))
              .build();
        }
      }
    }
    return getViewInwardJobOutwardItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.InwardJobsOutwardItemsList> getViewApprovedInwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedInwardJobOutwardItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.InwardJobsOutwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.InwardJobsOutwardItemsList> getViewApprovedInwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.InwardJobsOutwardItemsList> getViewApprovedInwardJobOutwardItemsMethod;
    if ((getViewApprovedInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getViewApprovedInwardJobOutwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewApprovedInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getViewApprovedInwardJobOutwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getViewApprovedInwardJobOutwardItemsMethod = getViewApprovedInwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.InwardJobsOutwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedInwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsOutwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewApprovedInwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getViewApprovedInwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.InwardJobsOutwardItemsList> getViewUnapprovedInwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedInwardJobOutwardItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.InwardJobsOutwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.InwardJobsOutwardItemsList> getViewUnapprovedInwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.InwardJobsOutwardItemsList> getViewUnapprovedInwardJobOutwardItemsMethod;
    if ((getViewUnapprovedInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getViewUnapprovedInwardJobOutwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewUnapprovedInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getViewUnapprovedInwardJobOutwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getViewUnapprovedInwardJobOutwardItemsMethod = getViewUnapprovedInwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.InwardJobsOutwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedInwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsOutwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewUnapprovedInwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedInwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemHistoryRequest,
      com.scailo.sdk.InwardJobsOutwardItemsList> getViewInwardJobOutwardItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInwardJobOutwardItemHistory",
      requestType = com.scailo.sdk.InwardJobOutwardItemHistoryRequest.class,
      responseType = com.scailo.sdk.InwardJobsOutwardItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemHistoryRequest,
      com.scailo.sdk.InwardJobsOutwardItemsList> getViewInwardJobOutwardItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemHistoryRequest, com.scailo.sdk.InwardJobsOutwardItemsList> getViewInwardJobOutwardItemHistoryMethod;
    if ((getViewInwardJobOutwardItemHistoryMethod = InwardJobsServiceGrpc.getViewInwardJobOutwardItemHistoryMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewInwardJobOutwardItemHistoryMethod = InwardJobsServiceGrpc.getViewInwardJobOutwardItemHistoryMethod) == null) {
          InwardJobsServiceGrpc.getViewInwardJobOutwardItemHistoryMethod = getViewInwardJobOutwardItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobOutwardItemHistoryRequest, com.scailo.sdk.InwardJobsOutwardItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInwardJobOutwardItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobOutwardItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsOutwardItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewInwardJobOutwardItemHistory"))
              .build();
        }
      }
    }
    return getViewInwardJobOutwardItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedApprovedInwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedInwardJobOutwardItems",
      requestType = com.scailo.sdk.InwardJobOutwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedApprovedInwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedApprovedInwardJobOutwardItemsMethod;
    if ((getViewPaginatedApprovedInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobOutwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewPaginatedApprovedInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobOutwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobOutwardItemsMethod = getViewPaginatedApprovedInwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobOutwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedInwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobOutwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewPaginatedApprovedInwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedInwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedUnapprovedInwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedInwardJobOutwardItems",
      requestType = com.scailo.sdk.InwardJobOutwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedUnapprovedInwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> getViewPaginatedUnapprovedInwardJobOutwardItemsMethod;
    if ((getViewPaginatedUnapprovedInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobOutwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobOutwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobOutwardItemsMethod = getViewPaginatedUnapprovedInwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobOutwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedInwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobOutwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedInwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedInwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> getSearchOutwardItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchOutwardItemsWithPagination",
      requestType = com.scailo.sdk.InwardJobOutwardItemsSearchRequest.class,
      responseType = com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemsSearchRequest,
      com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> getSearchOutwardItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> getSearchOutwardItemsWithPaginationMethod;
    if ((getSearchOutwardItemsWithPaginationMethod = InwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getSearchOutwardItemsWithPaginationMethod = InwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod) == null) {
          InwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod = getSearchOutwardItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobOutwardItemsSearchRequest, com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchOutwardItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobOutwardItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("SearchOutwardItemsWithPagination"))
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
    if ((getDownloadOutwardItemsCSVTemplateMethod = InwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDownloadOutwardItemsCSVTemplateMethod = InwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod) == null) {
          InwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod = getDownloadOutwardItemsCSVTemplateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadOutwardItemsCSVTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("DownloadOutwardItemsCSVTemplate"))
              .build();
        }
      }
    }
    return getDownloadOutwardItemsCSVTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadInwardJobOutwardItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadInwardJobOutwardItems",
      requestType = com.scailo.sdk.IdentifierUUIDWithFile.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadInwardJobOutwardItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList> getUploadInwardJobOutwardItemsMethod;
    if ((getUploadInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getUploadInwardJobOutwardItemsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getUploadInwardJobOutwardItemsMethod = InwardJobsServiceGrpc.getUploadInwardJobOutwardItemsMethod) == null) {
          InwardJobsServiceGrpc.getUploadInwardJobOutwardItemsMethod = getUploadInwardJobOutwardItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadInwardJobOutwardItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("UploadInwardJobOutwardItems"))
              .build();
        }
      }
    }
    return getUploadInwardJobOutwardItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceContactCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInwardJobContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddInwardJobContact",
      requestType = com.scailo.sdk.InwardJobsServiceContactCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceContactCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddInwardJobContactMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceContactCreateRequest, com.scailo.sdk.IdentifierResponse> getAddInwardJobContactMethod;
    if ((getAddInwardJobContactMethod = InwardJobsServiceGrpc.getAddInwardJobContactMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getAddInwardJobContactMethod = InwardJobsServiceGrpc.getAddInwardJobContactMethod) == null) {
          InwardJobsServiceGrpc.getAddInwardJobContactMethod = getAddInwardJobContactMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceContactCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddInwardJobContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceContactCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("AddInwardJobContact"))
              .build();
        }
      }
    }
    return getAddInwardJobContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveInwardJobContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveInwardJobContact",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveInwardJobContactMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveInwardJobContactMethod;
    if ((getApproveInwardJobContactMethod = InwardJobsServiceGrpc.getApproveInwardJobContactMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getApproveInwardJobContactMethod = InwardJobsServiceGrpc.getApproveInwardJobContactMethod) == null) {
          InwardJobsServiceGrpc.getApproveInwardJobContactMethod = getApproveInwardJobContactMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveInwardJobContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ApproveInwardJobContact"))
              .build();
        }
      }
    }
    return getApproveInwardJobContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteInwardJobContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInwardJobContact",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteInwardJobContactMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteInwardJobContactMethod;
    if ((getDeleteInwardJobContactMethod = InwardJobsServiceGrpc.getDeleteInwardJobContactMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDeleteInwardJobContactMethod = InwardJobsServiceGrpc.getDeleteInwardJobContactMethod) == null) {
          InwardJobsServiceGrpc.getDeleteInwardJobContactMethod = getDeleteInwardJobContactMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInwardJobContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("DeleteInwardJobContact"))
              .build();
        }
      }
    }
    return getDeleteInwardJobContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJobContact> getViewInwardJobContactByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInwardJobContactByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.InwardJobContact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJobContact> getViewInwardJobContactByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJobContact> getViewInwardJobContactByIDMethod;
    if ((getViewInwardJobContactByIDMethod = InwardJobsServiceGrpc.getViewInwardJobContactByIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewInwardJobContactByIDMethod = InwardJobsServiceGrpc.getViewInwardJobContactByIDMethod) == null) {
          InwardJobsServiceGrpc.getViewInwardJobContactByIDMethod = getViewInwardJobContactByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJobContact>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInwardJobContactByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobContact.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewInwardJobContactByID"))
              .build();
        }
      }
    }
    return getViewInwardJobContactByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobContactsList> getViewInwardJobContactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInwardJobContacts",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.InwardJobContactsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobContactsList> getViewInwardJobContactsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobContactsList> getViewInwardJobContactsMethod;
    if ((getViewInwardJobContactsMethod = InwardJobsServiceGrpc.getViewInwardJobContactsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewInwardJobContactsMethod = InwardJobsServiceGrpc.getViewInwardJobContactsMethod) == null) {
          InwardJobsServiceGrpc.getViewInwardJobContactsMethod = getViewInwardJobContactsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobContactsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInwardJobContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobContactsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewInwardJobContacts"))
              .build();
        }
      }
    }
    return getViewInwardJobContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJob> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.InwardJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJob> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJob> getViewByIDMethod;
    if ((getViewByIDMethod = InwardJobsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewByIDMethod = InwardJobsServiceGrpc.getViewByIDMethod) == null) {
          InwardJobsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJob.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJob> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.InwardJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJob> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJob> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = InwardJobsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewByUUIDMethod = InwardJobsServiceGrpc.getViewByUUIDMethod) == null) {
          InwardJobsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJob.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJob> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.InwardJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InwardJob> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJob> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = InwardJobsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = InwardJobsServiceGrpc.getViewEssentialByIDMethod) == null) {
          InwardJobsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.InwardJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJob.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJob> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.InwardJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJob> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJob> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = InwardJobsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = InwardJobsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          InwardJobsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJob.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.InwardJobsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.InwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.InwardJobsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.InwardJobsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = InwardJobsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewFromIDsMethod = InwardJobsServiceGrpc.getViewFromIDsMethod) == null) {
          InwardJobsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.InwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobAncillaryParameters> getViewAncillaryParametersByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAncillaryParametersByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.InwardJobAncillaryParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobAncillaryParameters> getViewAncillaryParametersByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobAncillaryParameters> getViewAncillaryParametersByUUIDMethod;
    if ((getViewAncillaryParametersByUUIDMethod = InwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewAncillaryParametersByUUIDMethod = InwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
          InwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod = getViewAncillaryParametersByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobAncillaryParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAncillaryParametersByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobAncillaryParameters.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewAncillaryParametersByUUID"))
              .build();
        }
      }
    }
    return getViewAncillaryParametersByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.InwardJobsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.InwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.InwardJobsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.InwardJobsList> getViewAllMethod;
    if ((getViewAllMethod = InwardJobsServiceGrpc.getViewAllMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewAllMethod = InwardJobsServiceGrpc.getViewAllMethod) == null) {
          InwardJobsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.InwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.InwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = InwardJobsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = InwardJobsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          InwardJobsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServicePaginationReq,
      com.scailo.sdk.InwardJobsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.InwardJobsServicePaginationReq.class,
      responseType = com.scailo.sdk.InwardJobsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServicePaginationReq,
      com.scailo.sdk.InwardJobsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServicePaginationReq, com.scailo.sdk.InwardJobsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = InwardJobsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = InwardJobsServiceGrpc.getViewWithPaginationMethod) == null) {
          InwardJobsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServicePaginationReq, com.scailo.sdk.InwardJobsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifiersList> getViewAssociatedSalesOrderIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAssociatedSalesOrderIDs",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifiersList> getViewAssociatedSalesOrderIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifiersList> getViewAssociatedSalesOrderIDsMethod;
    if ((getViewAssociatedSalesOrderIDsMethod = InwardJobsServiceGrpc.getViewAssociatedSalesOrderIDsMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewAssociatedSalesOrderIDsMethod = InwardJobsServiceGrpc.getViewAssociatedSalesOrderIDsMethod) == null) {
          InwardJobsServiceGrpc.getViewAssociatedSalesOrderIDsMethod = getViewAssociatedSalesOrderIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAssociatedSalesOrderIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewAssociatedSalesOrderIDs"))
              .build();
        }
      }
    }
    return getViewAssociatedSalesOrderIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobInwardInventoryMatchList> getViewInwardInventoryMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInwardInventoryMatch",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.InwardJobInwardInventoryMatchList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobInwardInventoryMatchList> getViewInwardInventoryMatchMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobInwardInventoryMatchList> getViewInwardInventoryMatchMethod;
    if ((getViewInwardInventoryMatchMethod = InwardJobsServiceGrpc.getViewInwardInventoryMatchMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewInwardInventoryMatchMethod = InwardJobsServiceGrpc.getViewInwardInventoryMatchMethod) == null) {
          InwardJobsServiceGrpc.getViewInwardInventoryMatchMethod = getViewInwardInventoryMatchMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobInwardInventoryMatchList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInwardInventoryMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobInwardInventoryMatchList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewInwardInventoryMatch"))
              .build();
        }
      }
    }
    return getViewInwardInventoryMatchMethod;
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
    if ((getViewProspectiveInwardFamiliesMethod = InwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewProspectiveInwardFamiliesMethod = InwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod) == null) {
          InwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod = getViewProspectiveInwardFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveInwardFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewProspectiveInwardFamilies"))
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
    if ((getFilterProspectiveInwardFamiliesMethod = InwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getFilterProspectiveInwardFamiliesMethod = InwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod) == null) {
          InwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod = getFilterProspectiveInwardFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterProspectiveInwardFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterFamiliesReqForIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("FilterProspectiveInwardFamilies"))
              .build();
        }
      }
    }
    return getFilterProspectiveInwardFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest,
      com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest> getViewProspectiveInwardJobInwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveInwardJobInwardItem",
      requestType = com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest,
      com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest> getViewProspectiveInwardJobInwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest, com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest> getViewProspectiveInwardJobInwardItemMethod;
    if ((getViewProspectiveInwardJobInwardItemMethod = InwardJobsServiceGrpc.getViewProspectiveInwardJobInwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewProspectiveInwardJobInwardItemMethod = InwardJobsServiceGrpc.getViewProspectiveInwardJobInwardItemMethod) == null) {
          InwardJobsServiceGrpc.getViewProspectiveInwardJobInwardItemMethod = getViewProspectiveInwardJobInwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest, com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveInwardJobInwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewProspectiveInwardJobInwardItem"))
              .build();
        }
      }
    }
    return getViewProspectiveInwardJobInwardItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobOutwardInventoryMatchList> getViewOutwardInventoryMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOutwardInventoryMatch",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.InwardJobOutwardInventoryMatchList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InwardJobOutwardInventoryMatchList> getViewOutwardInventoryMatchMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobOutwardInventoryMatchList> getViewOutwardInventoryMatchMethod;
    if ((getViewOutwardInventoryMatchMethod = InwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewOutwardInventoryMatchMethod = InwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod) == null) {
          InwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod = getViewOutwardInventoryMatchMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InwardJobOutwardInventoryMatchList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOutwardInventoryMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobOutwardInventoryMatchList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewOutwardInventoryMatch"))
              .build();
        }
      }
    }
    return getViewOutwardInventoryMatchMethod;
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
    if ((getViewProspectiveOutwardFamiliesMethod = InwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewProspectiveOutwardFamiliesMethod = InwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod) == null) {
          InwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod = getViewProspectiveOutwardFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveOutwardFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewProspectiveOutwardFamilies"))
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
    if ((getFilterProspectiveOutwardFamiliesMethod = InwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getFilterProspectiveOutwardFamiliesMethod = InwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod) == null) {
          InwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod = getFilterProspectiveOutwardFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterProspectiveOutwardFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterFamiliesReqForIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("FilterProspectiveOutwardFamilies"))
              .build();
        }
      }
    }
    return getFilterProspectiveOutwardFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest,
      com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest> getViewProspectiveInwardJobOutwardItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveInwardJobOutwardItem",
      requestType = com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest,
      com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest> getViewProspectiveInwardJobOutwardItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest, com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest> getViewProspectiveInwardJobOutwardItemMethod;
    if ((getViewProspectiveInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getViewProspectiveInwardJobOutwardItemMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getViewProspectiveInwardJobOutwardItemMethod = InwardJobsServiceGrpc.getViewProspectiveInwardJobOutwardItemMethod) == null) {
          InwardJobsServiceGrpc.getViewProspectiveInwardJobOutwardItemMethod = getViewProspectiveInwardJobOutwardItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest, com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveInwardJobOutwardItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("ViewProspectiveInwardJobOutwardItem"))
              .build();
        }
      }
    }
    return getViewProspectiveInwardJobOutwardItemMethod;
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
    if ((getIsDownloadableMethod = InwardJobsServiceGrpc.getIsDownloadableMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getIsDownloadableMethod = InwardJobsServiceGrpc.getIsDownloadableMethod) == null) {
          InwardJobsServiceGrpc.getIsDownloadableMethod = getIsDownloadableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDownloadable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("IsDownloadable"))
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
    if ((getDownloadByUUIDMethod = InwardJobsServiceGrpc.getDownloadByUUIDMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDownloadByUUIDMethod = InwardJobsServiceGrpc.getDownloadByUUIDMethod) == null) {
          InwardJobsServiceGrpc.getDownloadByUUIDMethod = getDownloadByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("DownloadByUUID"))
              .build();
        }
      }
    }
    return getDownloadByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceSearchAllReq,
      com.scailo.sdk.InwardJobsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.InwardJobsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.InwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceSearchAllReq,
      com.scailo.sdk.InwardJobsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceSearchAllReq, com.scailo.sdk.InwardJobsList> getSearchAllMethod;
    if ((getSearchAllMethod = InwardJobsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getSearchAllMethod = InwardJobsServiceGrpc.getSearchAllMethod) == null) {
          InwardJobsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceSearchAllReq, com.scailo.sdk.InwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceFilterReq,
      com.scailo.sdk.InwardJobsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.InwardJobsServiceFilterReq.class,
      responseType = com.scailo.sdk.InwardJobsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceFilterReq,
      com.scailo.sdk.InwardJobsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceFilterReq, com.scailo.sdk.InwardJobsList> getFilterMethod;
    if ((getFilterMethod = InwardJobsServiceGrpc.getFilterMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getFilterMethod = InwardJobsServiceGrpc.getFilterMethod) == null) {
          InwardJobsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceFilterReq, com.scailo.sdk.InwardJobsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsList.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = InwardJobsServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getCountInStatusMethod = InwardJobsServiceGrpc.getCountInStatusMethod) == null) {
          InwardJobsServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.InwardJobsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = InwardJobsServiceGrpc.getCountMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getCountMethod = InwardJobsServiceGrpc.getCountMethod) == null) {
          InwardJobsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.InwardJobsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InwardJobsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = InwardJobsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (InwardJobsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = InwardJobsServiceGrpc.getDownloadAsCSVMethod) == null) {
          InwardJobsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InwardJobsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InwardJobsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new InwardJobsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InwardJobsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InwardJobsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InwardJobsServiceStub>() {
        @java.lang.Override
        public InwardJobsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InwardJobsServiceStub(channel, callOptions);
        }
      };
    return InwardJobsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InwardJobsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InwardJobsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InwardJobsServiceBlockingStub>() {
        @java.lang.Override
        public InwardJobsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InwardJobsServiceBlockingStub(channel, callOptions);
        }
      };
    return InwardJobsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InwardJobsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InwardJobsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InwardJobsServiceFutureStub>() {
        @java.lang.Override
        public InwardJobsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InwardJobsServiceFutureStub(channel, callOptions);
        }
      };
    return InwardJobsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each inward job
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.InwardJobsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.InwardJobsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.InwardJobsServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.InwardJobsServiceUpdateRequest request,
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
     * Autofill the inward job
     * </pre>
     */
    default void autofill(com.scailo.sdk.InwardJobsServiceAutofillRequest request,
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
     * Checks if the Inward Job can be marked as completed (is true when all the inward items have been ordered and all the outward items have been received)
     * </pre>
     */
    default void isCompletable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsCompletableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if the Inward items within an Inward Job have been ordered (through a Sales Order)
     * </pre>
     */
    default void isOrdered(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsOrderedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if the Outward items within an Inward Job have been received (through Free Issue Material)
     * </pre>
     */
    default void isReceived(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsReceivedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add multiple items to a inward job
     * </pre>
     */
    default void addMultipleInwardJobInwardItems(com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMultipleInwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an inward item to a inward job
     * </pre>
     */
    default void addInwardJobInwardItem(com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddInwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an inward item in a inward job
     * </pre>
     */
    default void modifyInwardJobInwardItem(com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyInwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an inward item in a inward job
     * </pre>
     */
    default void approveInwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveInwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an inward item in a inward job
     * </pre>
     */
    default void deleteInwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a inward job
     * </pre>
     */
    default void reorderInwardJobInwardItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderInwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Inward Job Inward Item by ID
     * </pre>
     */
    default void viewInwardJobInwardItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobInwardItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInwardJobInwardItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved inward job inward items for given inward job ID
     * </pre>
     */
    default void viewApprovedInwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedInwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved inward job inward items for given inward job ID
     * </pre>
     */
    default void viewUnapprovedInwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedInwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the inward job inward item
     * </pre>
     */
    default void viewInwardJobInwardItemHistory(com.scailo.sdk.InwardJobInwardItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInwardJobInwardItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved inward job inward items for given inward job ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedInwardJobInwardItems(com.scailo.sdk.InwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedInwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved inward job inward items for given inward job ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedInwardJobInwardItems(com.scailo.sdk.InwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedInwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through inward job inward items with pagination
     * </pre>
     */
    default void searchInwardItemsWithPagination(com.scailo.sdk.InwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
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
    default void uploadInwardJobInwardItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadInwardJobInwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add multiple items to a inward job
     * </pre>
     */
    default void addMultipleInwardJobOutwardItems(com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMultipleInwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an outward item to a inward job
     * </pre>
     */
    default void addInwardJobOutwardItem(com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddInwardJobOutwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an outward item in a inward job
     * </pre>
     */
    default void modifyInwardJobOutwardItem(com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyInwardJobOutwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an outward item in a inward job
     * </pre>
     */
    default void approveInwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveInwardJobOutwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an outward item in a inward job
     * </pre>
     */
    default void deleteInwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInwardJobOutwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a inward job
     * </pre>
     */
    default void reorderInwardJobOutwardItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderInwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Inward Job Outward Item by ID
     * </pre>
     */
    default void viewInwardJobOutwardItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobOutwardItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInwardJobOutwardItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved inward job outward items for given inward job ID
     * </pre>
     */
    default void viewApprovedInwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedInwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved inward job outward items for given inward job ID
     * </pre>
     */
    default void viewUnapprovedInwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedInwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the inward job outward item
     * </pre>
     */
    default void viewInwardJobOutwardItemHistory(com.scailo.sdk.InwardJobOutwardItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInwardJobOutwardItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved inward job outward items for given inward job ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedInwardJobOutwardItems(com.scailo.sdk.InwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedInwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved inward job outward items for given inward job ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedInwardJobOutwardItems(com.scailo.sdk.InwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedInwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through inward job outward items with pagination
     * </pre>
     */
    default void searchOutwardItemsWithPagination(com.scailo.sdk.InwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
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
    default void uploadInwardJobOutwardItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadInwardJobOutwardItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    default void addInwardJobContact(com.scailo.sdk.InwardJobsServiceContactCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddInwardJobContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    default void approveInwardJobContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveInwardJobContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    default void deleteInwardJobContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInwardJobContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    default void viewInwardJobContactByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobContact> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInwardJobContactByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all contacts for given inward job UUID
     * </pre>
     */
    default void viewInwardJobContacts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobContactsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInwardJobContactsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    default void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobAncillaryParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAncillaryParametersByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.InwardJobsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all sales order IDs that are associated with the given inward job UUID
     * </pre>
     */
    default void viewAssociatedSalesOrderIDs(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAssociatedSalesOrderIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Inward Inventory Match of all the inward families of the given inward job
     * </pre>
     */
    default void viewInwardInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobInwardInventoryMatchList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInwardInventoryMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective inward items for the given inward job (all families that could be purchased)
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
     * View prospective inward job inward item info for the given family ID and inward job ID
     * </pre>
     */
    default void viewProspectiveInwardJobInwardItem(com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveInwardJobInwardItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Outward Inventory Match of all the outward families of the given inward job
     * </pre>
     */
    default void viewOutwardInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobOutwardInventoryMatchList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOutwardInventoryMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective outward items for the given inward job (all families that could be sold)
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
     * View prospective inward job outward item info for the given family ID and inward job ID
     * </pre>
     */
    default void viewProspectiveInwardJobOutwardItem(com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveInwardJobOutwardItemMethod(), responseObserver);
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
     * Download inward job with the given IdentifierUUID (can be used to allow public downloads)
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
    default void searchAll(com.scailo.sdk.InwardJobsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.InwardJobsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
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
    default void count(com.scailo.sdk.InwardJobsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.InwardJobsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InwardJobsService.
   * <pre>
   *Describes the common methods applicable on each inward job
   * </pre>
   */
  public static abstract class InwardJobsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InwardJobsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InwardJobsService.
   * <pre>
   *Describes the common methods applicable on each inward job
   * </pre>
   */
  public static final class InwardJobsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InwardJobsServiceStub> {
    private InwardJobsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InwardJobsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InwardJobsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.InwardJobsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.InwardJobsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.InwardJobsServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.InwardJobsServiceUpdateRequest request,
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
     * Autofill the inward job
     * </pre>
     */
    public void autofill(com.scailo.sdk.InwardJobsServiceAutofillRequest request,
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
     * Checks if the Inward Job can be marked as completed (is true when all the inward items have been ordered and all the outward items have been received)
     * </pre>
     */
    public void isCompletable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsCompletableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if the Inward items within an Inward Job have been ordered (through a Sales Order)
     * </pre>
     */
    public void isOrdered(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsOrderedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if the Outward items within an Inward Job have been received (through Free Issue Material)
     * </pre>
     */
    public void isReceived(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsReceivedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add multiple items to a inward job
     * </pre>
     */
    public void addMultipleInwardJobInwardItems(com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMultipleInwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an inward item to a inward job
     * </pre>
     */
    public void addInwardJobInwardItem(com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddInwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an inward item in a inward job
     * </pre>
     */
    public void modifyInwardJobInwardItem(com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyInwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an inward item in a inward job
     * </pre>
     */
    public void approveInwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveInwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an inward item in a inward job
     * </pre>
     */
    public void deleteInwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a inward job
     * </pre>
     */
    public void reorderInwardJobInwardItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderInwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Inward Job Inward Item by ID
     * </pre>
     */
    public void viewInwardJobInwardItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobInwardItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInwardJobInwardItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved inward job inward items for given inward job ID
     * </pre>
     */
    public void viewApprovedInwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedInwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved inward job inward items for given inward job ID
     * </pre>
     */
    public void viewUnapprovedInwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedInwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the inward job inward item
     * </pre>
     */
    public void viewInwardJobInwardItemHistory(com.scailo.sdk.InwardJobInwardItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsInwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInwardJobInwardItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved inward job inward items for given inward job ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedInwardJobInwardItems(com.scailo.sdk.InwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedInwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved inward job inward items for given inward job ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedInwardJobInwardItems(com.scailo.sdk.InwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedInwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through inward job inward items with pagination
     * </pre>
     */
    public void searchInwardItemsWithPagination(com.scailo.sdk.InwardJobInwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> responseObserver) {
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
    public void uploadInwardJobInwardItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadInwardJobInwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add multiple items to a inward job
     * </pre>
     */
    public void addMultipleInwardJobOutwardItems(com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMultipleInwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an outward item to a inward job
     * </pre>
     */
    public void addInwardJobOutwardItem(com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddInwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an outward item in a inward job
     * </pre>
     */
    public void modifyInwardJobOutwardItem(com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyInwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an outward item in a inward job
     * </pre>
     */
    public void approveInwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveInwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an outward item in a inward job
     * </pre>
     */
    public void deleteInwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a inward job
     * </pre>
     */
    public void reorderInwardJobOutwardItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderInwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Inward Job Outward Item by ID
     * </pre>
     */
    public void viewInwardJobOutwardItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobOutwardItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInwardJobOutwardItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved inward job outward items for given inward job ID
     * </pre>
     */
    public void viewApprovedInwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedInwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved inward job outward items for given inward job ID
     * </pre>
     */
    public void viewUnapprovedInwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedInwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the inward job outward item
     * </pre>
     */
    public void viewInwardJobOutwardItemHistory(com.scailo.sdk.InwardJobOutwardItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsOutwardItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInwardJobOutwardItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved inward job outward items for given inward job ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedInwardJobOutwardItems(com.scailo.sdk.InwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedInwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved inward job outward items for given inward job ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedInwardJobOutwardItems(com.scailo.sdk.InwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedInwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through inward job outward items with pagination
     * </pre>
     */
    public void searchOutwardItemsWithPagination(com.scailo.sdk.InwardJobOutwardItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> responseObserver) {
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
    public void uploadInwardJobOutwardItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadInwardJobOutwardItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    public void addInwardJobContact(com.scailo.sdk.InwardJobsServiceContactCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddInwardJobContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    public void approveInwardJobContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveInwardJobContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    public void deleteInwardJobContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInwardJobContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    public void viewInwardJobContactByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobContact> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInwardJobContactByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all contacts for given inward job UUID
     * </pre>
     */
    public void viewInwardJobContacts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobContactsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInwardJobContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobAncillaryParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.InwardJobsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all sales order IDs that are associated with the given inward job UUID
     * </pre>
     */
    public void viewAssociatedSalesOrderIDs(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAssociatedSalesOrderIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Inward Inventory Match of all the inward families of the given inward job
     * </pre>
     */
    public void viewInwardInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobInwardInventoryMatchList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInwardInventoryMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective inward items for the given inward job (all families that could be purchased)
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
     * View prospective inward job inward item info for the given family ID and inward job ID
     * </pre>
     */
    public void viewProspectiveInwardJobInwardItem(com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveInwardJobInwardItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Outward Inventory Match of all the outward families of the given inward job
     * </pre>
     */
    public void viewOutwardInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobOutwardInventoryMatchList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOutwardInventoryMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective outward items for the given inward job (all families that could be sold)
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
     * View prospective inward job outward item info for the given family ID and inward job ID
     * </pre>
     */
    public void viewProspectiveInwardJobOutwardItem(com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveInwardJobOutwardItemMethod(), getCallOptions()), request, responseObserver);
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
     * Download inward job with the given IdentifierUUID (can be used to allow public downloads)
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
    public void searchAll(com.scailo.sdk.InwardJobsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.InwardJobsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList> responseObserver) {
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
    public void count(com.scailo.sdk.InwardJobsServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.InwardJobsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InwardJobsService.
   * <pre>
   *Describes the common methods applicable on each inward job
   * </pre>
   */
  public static final class InwardJobsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InwardJobsServiceBlockingStub> {
    private InwardJobsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InwardJobsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InwardJobsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.InwardJobsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.InwardJobsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.InwardJobsServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.InwardJobsServiceUpdateRequest request) {
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
     * Autofill the inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse autofill(com.scailo.sdk.InwardJobsServiceAutofillRequest request) {
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
     * Checks if the Inward Job can be marked as completed (is true when all the inward items have been ordered and all the outward items have been received)
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isCompletable(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsCompletableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if the Inward items within an Inward Job have been ordered (through a Sales Order)
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isOrdered(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsOrderedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if the Outward items within an Inward Job have been received (through Free Issue Material)
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isReceived(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsReceivedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add multiple items to a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addMultipleInwardJobInwardItems(com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMultipleInwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an inward item to a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addInwardJobInwardItem(com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddInwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an inward item in a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyInwardJobInwardItem(com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyInwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an inward item in a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveInwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveInwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an inward item in a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteInwardJobInwardItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderInwardJobInwardItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderInwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Inward Job Inward Item by ID
     * </pre>
     */
    public com.scailo.sdk.InwardJobInwardItem viewInwardJobInwardItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInwardJobInwardItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved inward job inward items for given inward job ID
     * </pre>
     */
    public com.scailo.sdk.InwardJobsInwardItemsList viewApprovedInwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedInwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved inward job inward items for given inward job ID
     * </pre>
     */
    public com.scailo.sdk.InwardJobsInwardItemsList viewUnapprovedInwardJobInwardItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedInwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the inward job inward item
     * </pre>
     */
    public com.scailo.sdk.InwardJobsInwardItemsList viewInwardJobInwardItemHistory(com.scailo.sdk.InwardJobInwardItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInwardJobInwardItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved inward job inward items for given inward job ID with pagination
     * </pre>
     */
    public com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse viewPaginatedApprovedInwardJobInwardItems(com.scailo.sdk.InwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedInwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved inward job inward items for given inward job ID with pagination
     * </pre>
     */
    public com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse viewPaginatedUnapprovedInwardJobInwardItems(com.scailo.sdk.InwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedInwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through inward job inward items with pagination
     * </pre>
     */
    public com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse searchInwardItemsWithPagination(com.scailo.sdk.InwardJobInwardItemsSearchRequest request) {
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
    public com.scailo.sdk.IdentifiersList uploadInwardJobInwardItems(com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadInwardJobInwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add multiple items to a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addMultipleInwardJobOutwardItems(com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMultipleInwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an outward item to a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addInwardJobOutwardItem(com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddInwardJobOutwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an outward item in a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyInwardJobOutwardItem(com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyInwardJobOutwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an outward item in a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveInwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveInwardJobOutwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an outward item in a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteInwardJobOutwardItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInwardJobOutwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a inward job
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderInwardJobOutwardItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderInwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Inward Job Outward Item by ID
     * </pre>
     */
    public com.scailo.sdk.InwardJobOutwardItem viewInwardJobOutwardItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInwardJobOutwardItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved inward job outward items for given inward job ID
     * </pre>
     */
    public com.scailo.sdk.InwardJobsOutwardItemsList viewApprovedInwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedInwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved inward job outward items for given inward job ID
     * </pre>
     */
    public com.scailo.sdk.InwardJobsOutwardItemsList viewUnapprovedInwardJobOutwardItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedInwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the inward job outward item
     * </pre>
     */
    public com.scailo.sdk.InwardJobsOutwardItemsList viewInwardJobOutwardItemHistory(com.scailo.sdk.InwardJobOutwardItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInwardJobOutwardItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved inward job outward items for given inward job ID with pagination
     * </pre>
     */
    public com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse viewPaginatedApprovedInwardJobOutwardItems(com.scailo.sdk.InwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedInwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved inward job outward items for given inward job ID with pagination
     * </pre>
     */
    public com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse viewPaginatedUnapprovedInwardJobOutwardItems(com.scailo.sdk.InwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedInwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through inward job outward items with pagination
     * </pre>
     */
    public com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse searchOutwardItemsWithPagination(com.scailo.sdk.InwardJobOutwardItemsSearchRequest request) {
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
    public com.scailo.sdk.IdentifiersList uploadInwardJobOutwardItems(com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadInwardJobOutwardItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addInwardJobContact(com.scailo.sdk.InwardJobsServiceContactCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddInwardJobContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveInwardJobContact(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveInwardJobContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteInwardJobContact(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInwardJobContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    public com.scailo.sdk.InwardJobContact viewInwardJobContactByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInwardJobContactByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all contacts for given inward job UUID
     * </pre>
     */
    public com.scailo.sdk.InwardJobContactsList viewInwardJobContacts(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInwardJobContactsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.InwardJob viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.InwardJob viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.InwardJob viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.InwardJob viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.InwardJobsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.scailo.sdk.InwardJobAncillaryParameters viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAncillaryParametersByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.InwardJobsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.InwardJobsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.InwardJobsServicePaginationResponse viewWithPagination(com.scailo.sdk.InwardJobsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all sales order IDs that are associated with the given inward job UUID
     * </pre>
     */
    public com.scailo.sdk.IdentifiersList viewAssociatedSalesOrderIDs(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAssociatedSalesOrderIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Inward Inventory Match of all the inward families of the given inward job
     * </pre>
     */
    public com.scailo.sdk.InwardJobInwardInventoryMatchList viewInwardInventoryMatch(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInwardInventoryMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective inward items for the given inward job (all families that could be purchased)
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
     * View prospective inward job inward item info for the given family ID and inward job ID
     * </pre>
     */
    public com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest viewProspectiveInwardJobInwardItem(com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveInwardJobInwardItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Outward Inventory Match of all the outward families of the given inward job
     * </pre>
     */
    public com.scailo.sdk.InwardJobOutwardInventoryMatchList viewOutwardInventoryMatch(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOutwardInventoryMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective outward items for the given inward job (all families that could be sold)
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
     * View prospective inward job outward item info for the given family ID and inward job ID
     * </pre>
     */
    public com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest viewProspectiveInwardJobOutwardItem(com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveInwardJobOutwardItemMethod(), getCallOptions(), request);
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
     * Download inward job with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.scailo.sdk.InwardJobsList searchAll(com.scailo.sdk.InwardJobsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.InwardJobsList filter(com.scailo.sdk.InwardJobsServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.InwardJobsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.InwardJobsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InwardJobsService.
   * <pre>
   *Describes the common methods applicable on each inward job
   * </pre>
   */
  public static final class InwardJobsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InwardJobsServiceFutureStub> {
    private InwardJobsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InwardJobsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InwardJobsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.InwardJobsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.InwardJobsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.InwardJobsServiceUpdateRequest request) {
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
        com.scailo.sdk.InwardJobsServiceUpdateRequest request) {
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
     * Autofill the inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> autofill(
        com.scailo.sdk.InwardJobsServiceAutofillRequest request) {
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
     * Checks if the Inward Job can be marked as completed (is true when all the inward items have been ordered and all the outward items have been received)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isCompletable(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsCompletableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if the Inward items within an Inward Job have been ordered (through a Sales Order)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isOrdered(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsOrderedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if the Outward items within an Inward Job have been received (through Free Issue Material)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isReceived(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsReceivedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add multiple items to a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addMultipleInwardJobInwardItems(
        com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMultipleInwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an inward item to a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addInwardJobInwardItem(
        com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddInwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an inward item in a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyInwardJobInwardItem(
        com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyInwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an inward item in a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveInwardJobInwardItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveInwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an inward item in a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteInwardJobInwardItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderInwardJobInwardItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderInwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Inward Job Inward Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobInwardItem> viewInwardJobInwardItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInwardJobInwardItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved inward job inward items for given inward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsInwardItemsList> viewApprovedInwardJobInwardItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedInwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved inward job inward items for given inward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsInwardItemsList> viewUnapprovedInwardJobInwardItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedInwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the inward job inward item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsInwardItemsList> viewInwardJobInwardItemHistory(
        com.scailo.sdk.InwardJobInwardItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInwardJobInwardItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved inward job inward items for given inward job ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> viewPaginatedApprovedInwardJobInwardItems(
        com.scailo.sdk.InwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedInwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved inward job inward items for given inward job ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> viewPaginatedUnapprovedInwardJobInwardItems(
        com.scailo.sdk.InwardJobInwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedInwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through inward job inward items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse> searchInwardItemsWithPagination(
        com.scailo.sdk.InwardJobInwardItemsSearchRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> uploadInwardJobInwardItems(
        com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadInwardJobInwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add multiple items to a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addMultipleInwardJobOutwardItems(
        com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMultipleInwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an outward item to a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addInwardJobOutwardItem(
        com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddInwardJobOutwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an outward item in a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyInwardJobOutwardItem(
        com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyInwardJobOutwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an outward item in a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveInwardJobOutwardItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveInwardJobOutwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an outward item in a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteInwardJobOutwardItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInwardJobOutwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderInwardJobOutwardItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderInwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Inward Job Outward Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobOutwardItem> viewInwardJobOutwardItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInwardJobOutwardItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved inward job outward items for given inward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsOutwardItemsList> viewApprovedInwardJobOutwardItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedInwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved inward job outward items for given inward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsOutwardItemsList> viewUnapprovedInwardJobOutwardItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedInwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the inward job outward item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsOutwardItemsList> viewInwardJobOutwardItemHistory(
        com.scailo.sdk.InwardJobOutwardItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInwardJobOutwardItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved inward job outward items for given inward job ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> viewPaginatedApprovedInwardJobOutwardItems(
        com.scailo.sdk.InwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedInwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved inward job outward items for given inward job ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> viewPaginatedUnapprovedInwardJobOutwardItems(
        com.scailo.sdk.InwardJobOutwardItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedInwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through inward job outward items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse> searchOutwardItemsWithPagination(
        com.scailo.sdk.InwardJobOutwardItemsSearchRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> uploadInwardJobOutwardItems(
        com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadInwardJobOutwardItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addInwardJobContact(
        com.scailo.sdk.InwardJobsServiceContactCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddInwardJobContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveInwardJobContact(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveInwardJobContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteInwardJobContact(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInwardJobContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobContact> viewInwardJobContactByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInwardJobContactByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all contacts for given inward job UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobContactsList> viewInwardJobContacts(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInwardJobContactsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJob> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJob> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJob> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJob> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobAncillaryParameters> viewAncillaryParametersByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.InwardJobsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all sales order IDs that are associated with the given inward job UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> viewAssociatedSalesOrderIDs(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAssociatedSalesOrderIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Inward Inventory Match of all the inward families of the given inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobInwardInventoryMatchList> viewInwardInventoryMatch(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInwardInventoryMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective inward items for the given inward job (all families that could be purchased)
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
     * View prospective inward job inward item info for the given family ID and inward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest> viewProspectiveInwardJobInwardItem(
        com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveInwardJobInwardItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Outward Inventory Match of all the outward families of the given inward job
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobOutwardInventoryMatchList> viewOutwardInventoryMatch(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOutwardInventoryMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective outward items for the given inward job (all families that could be sold)
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
     * View prospective inward job outward item info for the given family ID and inward job ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest> viewProspectiveInwardJobOutwardItem(
        com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveInwardJobOutwardItemMethod(), getCallOptions()), request);
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
     * Download inward job with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsList> searchAll(
        com.scailo.sdk.InwardJobsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InwardJobsList> filter(
        com.scailo.sdk.InwardJobsServiceFilterReq request) {
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
        com.scailo.sdk.InwardJobsServiceCountReq request) {
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
        com.scailo.sdk.InwardJobsServiceFilterReq request) {
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
  private static final int METHODID_IS_RECEIVED = 20;
  private static final int METHODID_ADD_MULTIPLE_INWARD_JOB_INWARD_ITEMS = 21;
  private static final int METHODID_ADD_INWARD_JOB_INWARD_ITEM = 22;
  private static final int METHODID_MODIFY_INWARD_JOB_INWARD_ITEM = 23;
  private static final int METHODID_APPROVE_INWARD_JOB_INWARD_ITEM = 24;
  private static final int METHODID_DELETE_INWARD_JOB_INWARD_ITEM = 25;
  private static final int METHODID_REORDER_INWARD_JOB_INWARD_ITEMS = 26;
  private static final int METHODID_VIEW_INWARD_JOB_INWARD_ITEM_BY_ID = 27;
  private static final int METHODID_VIEW_APPROVED_INWARD_JOB_INWARD_ITEMS = 28;
  private static final int METHODID_VIEW_UNAPPROVED_INWARD_JOB_INWARD_ITEMS = 29;
  private static final int METHODID_VIEW_INWARD_JOB_INWARD_ITEM_HISTORY = 30;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_INWARD_JOB_INWARD_ITEMS = 31;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_INWARD_JOB_INWARD_ITEMS = 32;
  private static final int METHODID_SEARCH_INWARD_ITEMS_WITH_PAGINATION = 33;
  private static final int METHODID_DOWNLOAD_INWARD_ITEMS_CSVTEMPLATE = 34;
  private static final int METHODID_UPLOAD_INWARD_JOB_INWARD_ITEMS = 35;
  private static final int METHODID_ADD_MULTIPLE_INWARD_JOB_OUTWARD_ITEMS = 36;
  private static final int METHODID_ADD_INWARD_JOB_OUTWARD_ITEM = 37;
  private static final int METHODID_MODIFY_INWARD_JOB_OUTWARD_ITEM = 38;
  private static final int METHODID_APPROVE_INWARD_JOB_OUTWARD_ITEM = 39;
  private static final int METHODID_DELETE_INWARD_JOB_OUTWARD_ITEM = 40;
  private static final int METHODID_REORDER_INWARD_JOB_OUTWARD_ITEMS = 41;
  private static final int METHODID_VIEW_INWARD_JOB_OUTWARD_ITEM_BY_ID = 42;
  private static final int METHODID_VIEW_APPROVED_INWARD_JOB_OUTWARD_ITEMS = 43;
  private static final int METHODID_VIEW_UNAPPROVED_INWARD_JOB_OUTWARD_ITEMS = 44;
  private static final int METHODID_VIEW_INWARD_JOB_OUTWARD_ITEM_HISTORY = 45;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_INWARD_JOB_OUTWARD_ITEMS = 46;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_INWARD_JOB_OUTWARD_ITEMS = 47;
  private static final int METHODID_SEARCH_OUTWARD_ITEMS_WITH_PAGINATION = 48;
  private static final int METHODID_DOWNLOAD_OUTWARD_ITEMS_CSVTEMPLATE = 49;
  private static final int METHODID_UPLOAD_INWARD_JOB_OUTWARD_ITEMS = 50;
  private static final int METHODID_ADD_INWARD_JOB_CONTACT = 51;
  private static final int METHODID_APPROVE_INWARD_JOB_CONTACT = 52;
  private static final int METHODID_DELETE_INWARD_JOB_CONTACT = 53;
  private static final int METHODID_VIEW_INWARD_JOB_CONTACT_BY_ID = 54;
  private static final int METHODID_VIEW_INWARD_JOB_CONTACTS = 55;
  private static final int METHODID_VIEW_BY_ID = 56;
  private static final int METHODID_VIEW_BY_UUID = 57;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 58;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 59;
  private static final int METHODID_VIEW_FROM_IDS = 60;
  private static final int METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID = 61;
  private static final int METHODID_VIEW_ALL = 62;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 63;
  private static final int METHODID_VIEW_WITH_PAGINATION = 64;
  private static final int METHODID_VIEW_ASSOCIATED_SALES_ORDER_IDS = 65;
  private static final int METHODID_VIEW_INWARD_INVENTORY_MATCH = 66;
  private static final int METHODID_VIEW_PROSPECTIVE_INWARD_FAMILIES = 67;
  private static final int METHODID_FILTER_PROSPECTIVE_INWARD_FAMILIES = 68;
  private static final int METHODID_VIEW_PROSPECTIVE_INWARD_JOB_INWARD_ITEM = 69;
  private static final int METHODID_VIEW_OUTWARD_INVENTORY_MATCH = 70;
  private static final int METHODID_VIEW_PROSPECTIVE_OUTWARD_FAMILIES = 71;
  private static final int METHODID_FILTER_PROSPECTIVE_OUTWARD_FAMILIES = 72;
  private static final int METHODID_VIEW_PROSPECTIVE_INWARD_JOB_OUTWARD_ITEM = 73;
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
          serviceImpl.create((com.scailo.sdk.InwardJobsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.InwardJobsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.InwardJobsServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.InwardJobsServiceUpdateRequest) request,
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
          serviceImpl.autofill((com.scailo.sdk.InwardJobsServiceAutofillRequest) request,
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
        case METHODID_IS_RECEIVED:
          serviceImpl.isReceived((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_ADD_MULTIPLE_INWARD_JOB_INWARD_ITEMS:
          serviceImpl.addMultipleInwardJobInwardItems((com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_INWARD_JOB_INWARD_ITEM:
          serviceImpl.addInwardJobInwardItem((com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_INWARD_JOB_INWARD_ITEM:
          serviceImpl.modifyInwardJobInwardItem((com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_INWARD_JOB_INWARD_ITEM:
          serviceImpl.approveInwardJobInwardItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_INWARD_JOB_INWARD_ITEM:
          serviceImpl.deleteInwardJobInwardItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_INWARD_JOB_INWARD_ITEMS:
          serviceImpl.reorderInwardJobInwardItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_INWARD_JOB_INWARD_ITEM_BY_ID:
          serviceImpl.viewInwardJobInwardItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobInwardItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_INWARD_JOB_INWARD_ITEMS:
          serviceImpl.viewApprovedInwardJobInwardItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsInwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_INWARD_JOB_INWARD_ITEMS:
          serviceImpl.viewUnapprovedInwardJobInwardItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsInwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_INWARD_JOB_INWARD_ITEM_HISTORY:
          serviceImpl.viewInwardJobInwardItemHistory((com.scailo.sdk.InwardJobInwardItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsInwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_INWARD_JOB_INWARD_ITEMS:
          serviceImpl.viewPaginatedApprovedInwardJobInwardItems((com.scailo.sdk.InwardJobInwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_INWARD_JOB_INWARD_ITEMS:
          serviceImpl.viewPaginatedUnapprovedInwardJobInwardItems((com.scailo.sdk.InwardJobInwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_INWARD_ITEMS_WITH_PAGINATION:
          serviceImpl.searchInwardItemsWithPagination((com.scailo.sdk.InwardJobInwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_INWARD_ITEMS_CSVTEMPLATE:
          serviceImpl.downloadInwardItemsCSVTemplate((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_UPLOAD_INWARD_JOB_INWARD_ITEMS:
          serviceImpl.uploadInwardJobInwardItems((com.scailo.sdk.IdentifierUUIDWithFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_ADD_MULTIPLE_INWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.addMultipleInwardJobOutwardItems((com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_INWARD_JOB_OUTWARD_ITEM:
          serviceImpl.addInwardJobOutwardItem((com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_INWARD_JOB_OUTWARD_ITEM:
          serviceImpl.modifyInwardJobOutwardItem((com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_INWARD_JOB_OUTWARD_ITEM:
          serviceImpl.approveInwardJobOutwardItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_INWARD_JOB_OUTWARD_ITEM:
          serviceImpl.deleteInwardJobOutwardItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_INWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.reorderInwardJobOutwardItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_INWARD_JOB_OUTWARD_ITEM_BY_ID:
          serviceImpl.viewInwardJobOutwardItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobOutwardItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_INWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.viewApprovedInwardJobOutwardItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsOutwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_INWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.viewUnapprovedInwardJobOutwardItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsOutwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_INWARD_JOB_OUTWARD_ITEM_HISTORY:
          serviceImpl.viewInwardJobOutwardItemHistory((com.scailo.sdk.InwardJobOutwardItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsOutwardItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_INWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.viewPaginatedApprovedInwardJobOutwardItems((com.scailo.sdk.InwardJobOutwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_INWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.viewPaginatedUnapprovedInwardJobOutwardItems((com.scailo.sdk.InwardJobOutwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_OUTWARD_ITEMS_WITH_PAGINATION:
          serviceImpl.searchOutwardItemsWithPagination((com.scailo.sdk.InwardJobOutwardItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_OUTWARD_ITEMS_CSVTEMPLATE:
          serviceImpl.downloadOutwardItemsCSVTemplate((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_UPLOAD_INWARD_JOB_OUTWARD_ITEMS:
          serviceImpl.uploadInwardJobOutwardItems((com.scailo.sdk.IdentifierUUIDWithFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_ADD_INWARD_JOB_CONTACT:
          serviceImpl.addInwardJobContact((com.scailo.sdk.InwardJobsServiceContactCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_INWARD_JOB_CONTACT:
          serviceImpl.approveInwardJobContact((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_INWARD_JOB_CONTACT:
          serviceImpl.deleteInwardJobContact((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_INWARD_JOB_CONTACT_BY_ID:
          serviceImpl.viewInwardJobContactByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobContact>) responseObserver);
          break;
        case METHODID_VIEW_INWARD_JOB_CONTACTS:
          serviceImpl.viewInwardJobContacts((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobContactsList>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJob>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList>) responseObserver);
          break;
        case METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID:
          serviceImpl.viewAncillaryParametersByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobAncillaryParameters>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.InwardJobsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_ASSOCIATED_SALES_ORDER_IDS:
          serviceImpl.viewAssociatedSalesOrderIDs((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_VIEW_INWARD_INVENTORY_MATCH:
          serviceImpl.viewInwardInventoryMatch((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobInwardInventoryMatchList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_INWARD_FAMILIES:
          serviceImpl.viewProspectiveInwardFamilies((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER_PROSPECTIVE_INWARD_FAMILIES:
          serviceImpl.filterProspectiveInwardFamilies((com.scailo.sdk.FilterFamiliesReqForIdentifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_INWARD_JOB_INWARD_ITEM:
          serviceImpl.viewProspectiveInwardJobInwardItem((com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest>) responseObserver);
          break;
        case METHODID_VIEW_OUTWARD_INVENTORY_MATCH:
          serviceImpl.viewOutwardInventoryMatch((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobOutwardInventoryMatchList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_OUTWARD_FAMILIES:
          serviceImpl.viewProspectiveOutwardFamilies((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER_PROSPECTIVE_OUTWARD_FAMILIES:
          serviceImpl.filterProspectiveOutwardFamilies((com.scailo.sdk.FilterFamiliesReqForIdentifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_INWARD_JOB_OUTWARD_ITEM:
          serviceImpl.viewProspectiveInwardJobOutwardItem((com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest>) responseObserver);
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
          serviceImpl.searchAll((com.scailo.sdk.InwardJobsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.InwardJobsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InwardJobsList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.InwardJobsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.InwardJobsServiceFilterReq) request,
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
              com.scailo.sdk.InwardJobsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceUpdateRequest,
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
              com.scailo.sdk.InwardJobsServiceUpdateRequest,
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
              com.scailo.sdk.InwardJobsServiceAutofillRequest,
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
          getIsReceivedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_IS_RECEIVED)))
        .addMethod(
          getAddMultipleInwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceMultipleInwardItemsCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_MULTIPLE_INWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getAddInwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_INWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getModifyInwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceInwardItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_INWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getApproveInwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_INWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getDeleteInwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_INWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getReorderInwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_INWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getViewInwardJobInwardItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.InwardJobInwardItem>(
                service, METHODID_VIEW_INWARD_JOB_INWARD_ITEM_BY_ID)))
        .addMethod(
          getViewApprovedInwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.InwardJobsInwardItemsList>(
                service, METHODID_VIEW_APPROVED_INWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getViewUnapprovedInwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.InwardJobsInwardItemsList>(
                service, METHODID_VIEW_UNAPPROVED_INWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getViewInwardJobInwardItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobInwardItemHistoryRequest,
              com.scailo.sdk.InwardJobsInwardItemsList>(
                service, METHODID_VIEW_INWARD_JOB_INWARD_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedInwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobInwardItemsSearchRequest,
              com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_INWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedInwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobInwardItemsSearchRequest,
              com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_INWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getSearchInwardItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobInwardItemsSearchRequest,
              com.scailo.sdk.InwardJobsServicePaginatedInwardItemsResponse>(
                service, METHODID_SEARCH_INWARD_ITEMS_WITH_PAGINATION)))
        .addMethod(
          getDownloadInwardItemsCSVTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_INWARD_ITEMS_CSVTEMPLATE)))
        .addMethod(
          getUploadInwardJobInwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithFile,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_UPLOAD_INWARD_JOB_INWARD_ITEMS)))
        .addMethod(
          getAddMultipleInwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceMultipleOutwardItemsCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_MULTIPLE_INWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getAddInwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_INWARD_JOB_OUTWARD_ITEM)))
        .addMethod(
          getModifyInwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceOutwardItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_INWARD_JOB_OUTWARD_ITEM)))
        .addMethod(
          getApproveInwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_INWARD_JOB_OUTWARD_ITEM)))
        .addMethod(
          getDeleteInwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_INWARD_JOB_OUTWARD_ITEM)))
        .addMethod(
          getReorderInwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_INWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getViewInwardJobOutwardItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.InwardJobOutwardItem>(
                service, METHODID_VIEW_INWARD_JOB_OUTWARD_ITEM_BY_ID)))
        .addMethod(
          getViewApprovedInwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.InwardJobsOutwardItemsList>(
                service, METHODID_VIEW_APPROVED_INWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getViewUnapprovedInwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.InwardJobsOutwardItemsList>(
                service, METHODID_VIEW_UNAPPROVED_INWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getViewInwardJobOutwardItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobOutwardItemHistoryRequest,
              com.scailo.sdk.InwardJobsOutwardItemsList>(
                service, METHODID_VIEW_INWARD_JOB_OUTWARD_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedInwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobOutwardItemsSearchRequest,
              com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_INWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedInwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobOutwardItemsSearchRequest,
              com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_INWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getSearchOutwardItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobOutwardItemsSearchRequest,
              com.scailo.sdk.InwardJobsServicePaginatedOutwardItemsResponse>(
                service, METHODID_SEARCH_OUTWARD_ITEMS_WITH_PAGINATION)))
        .addMethod(
          getDownloadOutwardItemsCSVTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_OUTWARD_ITEMS_CSVTEMPLATE)))
        .addMethod(
          getUploadInwardJobOutwardItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithFile,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_UPLOAD_INWARD_JOB_OUTWARD_ITEMS)))
        .addMethod(
          getAddInwardJobContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceContactCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_INWARD_JOB_CONTACT)))
        .addMethod(
          getApproveInwardJobContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_INWARD_JOB_CONTACT)))
        .addMethod(
          getDeleteInwardJobContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_INWARD_JOB_CONTACT)))
        .addMethod(
          getViewInwardJobContactByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.InwardJobContact>(
                service, METHODID_VIEW_INWARD_JOB_CONTACT_BY_ID)))
        .addMethod(
          getViewInwardJobContactsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.InwardJobContactsList>(
                service, METHODID_VIEW_INWARD_JOB_CONTACTS)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.InwardJob>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.InwardJob>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.InwardJob>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.InwardJob>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.InwardJobsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAncillaryParametersByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.InwardJobAncillaryParameters>(
                service, METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.InwardJobsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.InwardJobsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServicePaginationReq,
              com.scailo.sdk.InwardJobsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewAssociatedSalesOrderIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_VIEW_ASSOCIATED_SALES_ORDER_IDS)))
        .addMethod(
          getViewInwardInventoryMatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.InwardJobInwardInventoryMatchList>(
                service, METHODID_VIEW_INWARD_INVENTORY_MATCH)))
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
          getViewProspectiveInwardJobInwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobInwardItemProspectiveInfoRequest,
              com.scailo.sdk.InwardJobsServiceInwardItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_INWARD_JOB_INWARD_ITEM)))
        .addMethod(
          getViewOutwardInventoryMatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.InwardJobOutwardInventoryMatchList>(
                service, METHODID_VIEW_OUTWARD_INVENTORY_MATCH)))
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
          getViewProspectiveInwardJobOutwardItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobOutwardItemProspectiveInfoRequest,
              com.scailo.sdk.InwardJobsServiceOutwardItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_INWARD_JOB_OUTWARD_ITEM)))
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
              com.scailo.sdk.InwardJobsServiceSearchAllReq,
              com.scailo.sdk.InwardJobsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceFilterReq,
              com.scailo.sdk.InwardJobsList>(
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
              com.scailo.sdk.InwardJobsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InwardJobsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class InwardJobsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InwardJobsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.InwardJobsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InwardJobsService");
    }
  }

  private static final class InwardJobsServiceFileDescriptorSupplier
      extends InwardJobsServiceBaseDescriptorSupplier {
    InwardJobsServiceFileDescriptorSupplier() {}
  }

  private static final class InwardJobsServiceMethodDescriptorSupplier
      extends InwardJobsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InwardJobsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InwardJobsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InwardJobsServiceFileDescriptorSupplier())
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
              .addMethod(getIsReceivedMethod())
              .addMethod(getAddMultipleInwardJobInwardItemsMethod())
              .addMethod(getAddInwardJobInwardItemMethod())
              .addMethod(getModifyInwardJobInwardItemMethod())
              .addMethod(getApproveInwardJobInwardItemMethod())
              .addMethod(getDeleteInwardJobInwardItemMethod())
              .addMethod(getReorderInwardJobInwardItemsMethod())
              .addMethod(getViewInwardJobInwardItemByIDMethod())
              .addMethod(getViewApprovedInwardJobInwardItemsMethod())
              .addMethod(getViewUnapprovedInwardJobInwardItemsMethod())
              .addMethod(getViewInwardJobInwardItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedInwardJobInwardItemsMethod())
              .addMethod(getViewPaginatedUnapprovedInwardJobInwardItemsMethod())
              .addMethod(getSearchInwardItemsWithPaginationMethod())
              .addMethod(getDownloadInwardItemsCSVTemplateMethod())
              .addMethod(getUploadInwardJobInwardItemsMethod())
              .addMethod(getAddMultipleInwardJobOutwardItemsMethod())
              .addMethod(getAddInwardJobOutwardItemMethod())
              .addMethod(getModifyInwardJobOutwardItemMethod())
              .addMethod(getApproveInwardJobOutwardItemMethod())
              .addMethod(getDeleteInwardJobOutwardItemMethod())
              .addMethod(getReorderInwardJobOutwardItemsMethod())
              .addMethod(getViewInwardJobOutwardItemByIDMethod())
              .addMethod(getViewApprovedInwardJobOutwardItemsMethod())
              .addMethod(getViewUnapprovedInwardJobOutwardItemsMethod())
              .addMethod(getViewInwardJobOutwardItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedInwardJobOutwardItemsMethod())
              .addMethod(getViewPaginatedUnapprovedInwardJobOutwardItemsMethod())
              .addMethod(getSearchOutwardItemsWithPaginationMethod())
              .addMethod(getDownloadOutwardItemsCSVTemplateMethod())
              .addMethod(getUploadInwardJobOutwardItemsMethod())
              .addMethod(getAddInwardJobContactMethod())
              .addMethod(getApproveInwardJobContactMethod())
              .addMethod(getDeleteInwardJobContactMethod())
              .addMethod(getViewInwardJobContactByIDMethod())
              .addMethod(getViewInwardJobContactsMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewAncillaryParametersByUUIDMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewAllForEntityUUIDMethod())
              .addMethod(getViewWithPaginationMethod())
              .addMethod(getViewAssociatedSalesOrderIDsMethod())
              .addMethod(getViewInwardInventoryMatchMethod())
              .addMethod(getViewProspectiveInwardFamiliesMethod())
              .addMethod(getFilterProspectiveInwardFamiliesMethod())
              .addMethod(getViewProspectiveInwardJobInwardItemMethod())
              .addMethod(getViewOutwardInventoryMatchMethod())
              .addMethod(getViewProspectiveOutwardFamiliesMethod())
              .addMethod(getFilterProspectiveOutwardFamiliesMethod())
              .addMethod(getViewProspectiveInwardJobOutwardItemMethod())
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
