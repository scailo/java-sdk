package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each quotation request
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: quotations_requests.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QuotationsRequestsServiceGrpc {

  private QuotationsRequestsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.QuotationsRequestsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.QuotationsRequestsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = QuotationsRequestsServiceGrpc.getCreateMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getCreateMethod = QuotationsRequestsServiceGrpc.getCreateMethod) == null) {
          QuotationsRequestsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.QuotationsRequestsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = QuotationsRequestsServiceGrpc.getDraftMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getDraftMethod = QuotationsRequestsServiceGrpc.getDraftMethod) == null) {
          QuotationsRequestsServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.QuotationsRequestsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = QuotationsRequestsServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getDraftUpdateMethod = QuotationsRequestsServiceGrpc.getDraftUpdateMethod) == null) {
          QuotationsRequestsServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = QuotationsRequestsServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getSendForVerificationMethod = QuotationsRequestsServiceGrpc.getSendForVerificationMethod) == null) {
          QuotationsRequestsServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = QuotationsRequestsServiceGrpc.getVerifyMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getVerifyMethod = QuotationsRequestsServiceGrpc.getVerifyMethod) == null) {
          QuotationsRequestsServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = QuotationsRequestsServiceGrpc.getApproveMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getApproveMethod = QuotationsRequestsServiceGrpc.getApproveMethod) == null) {
          QuotationsRequestsServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = QuotationsRequestsServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getSendForRevisionMethod = QuotationsRequestsServiceGrpc.getSendForRevisionMethod) == null) {
          QuotationsRequestsServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.QuotationsRequestsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = QuotationsRequestsServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getRevisionUpdateMethod = QuotationsRequestsServiceGrpc.getRevisionUpdateMethod) == null) {
          QuotationsRequestsServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = QuotationsRequestsServiceGrpc.getHaltMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getHaltMethod = QuotationsRequestsServiceGrpc.getHaltMethod) == null) {
          QuotationsRequestsServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = QuotationsRequestsServiceGrpc.getDiscardMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getDiscardMethod = QuotationsRequestsServiceGrpc.getDiscardMethod) == null) {
          QuotationsRequestsServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = QuotationsRequestsServiceGrpc.getRestoreMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getRestoreMethod = QuotationsRequestsServiceGrpc.getRestoreMethod) == null) {
          QuotationsRequestsServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = QuotationsRequestsServiceGrpc.getCompleteMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getCompleteMethod = QuotationsRequestsServiceGrpc.getCompleteMethod) == null) {
          QuotationsRequestsServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = QuotationsRequestsServiceGrpc.getRepeatMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getRepeatMethod = QuotationsRequestsServiceGrpc.getRepeatMethod) == null) {
          QuotationsRequestsServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.RepeatWithDeliveryDate, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.RepeatWithDeliveryDate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getReopenMethod = QuotationsRequestsServiceGrpc.getReopenMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getReopenMethod = QuotationsRequestsServiceGrpc.getReopenMethod) == null) {
          QuotationsRequestsServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getCommentAddMethod = QuotationsRequestsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getCommentAddMethod = QuotationsRequestsServiceGrpc.getCommentAddMethod) == null) {
          QuotationsRequestsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getCreateMagicLinkMethod = QuotationsRequestsServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = QuotationsRequestsServiceGrpc.getCreateMagicLinkMethod) == null) {
          QuotationsRequestsServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("CreateMagicLink"))
              .build();
        }
      }
    }
    return getCreateMagicLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Autofill",
      requestType = com.scailo.sdk.QuotationsRequestsServiceAutofillRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceAutofillRequest, com.scailo.sdk.IdentifierResponse> getAutofillMethod;
    if ((getAutofillMethod = QuotationsRequestsServiceGrpc.getAutofillMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getAutofillMethod = QuotationsRequestsServiceGrpc.getAutofillMethod) == null) {
          QuotationsRequestsServiceGrpc.getAutofillMethod = getAutofillMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceAutofillRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Autofill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceAutofillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Autofill"))
              .build();
        }
      }
    }
    return getAutofillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddQuotationRequestItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddQuotationRequestItem",
      requestType = com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddQuotationRequestItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddQuotationRequestItemMethod;
    if ((getAddQuotationRequestItemMethod = QuotationsRequestsServiceGrpc.getAddQuotationRequestItemMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getAddQuotationRequestItemMethod = QuotationsRequestsServiceGrpc.getAddQuotationRequestItemMethod) == null) {
          QuotationsRequestsServiceGrpc.getAddQuotationRequestItemMethod = getAddQuotationRequestItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddQuotationRequestItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("AddQuotationRequestItem"))
              .build();
        }
      }
    }
    return getAddQuotationRequestItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyQuotationRequestItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyQuotationRequestItem",
      requestType = com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyQuotationRequestItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyQuotationRequestItemMethod;
    if ((getModifyQuotationRequestItemMethod = QuotationsRequestsServiceGrpc.getModifyQuotationRequestItemMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getModifyQuotationRequestItemMethod = QuotationsRequestsServiceGrpc.getModifyQuotationRequestItemMethod) == null) {
          QuotationsRequestsServiceGrpc.getModifyQuotationRequestItemMethod = getModifyQuotationRequestItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyQuotationRequestItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ModifyQuotationRequestItem"))
              .build();
        }
      }
    }
    return getModifyQuotationRequestItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveQuotationRequestItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveQuotationRequestItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveQuotationRequestItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveQuotationRequestItemMethod;
    if ((getApproveQuotationRequestItemMethod = QuotationsRequestsServiceGrpc.getApproveQuotationRequestItemMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getApproveQuotationRequestItemMethod = QuotationsRequestsServiceGrpc.getApproveQuotationRequestItemMethod) == null) {
          QuotationsRequestsServiceGrpc.getApproveQuotationRequestItemMethod = getApproveQuotationRequestItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveQuotationRequestItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ApproveQuotationRequestItem"))
              .build();
        }
      }
    }
    return getApproveQuotationRequestItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteQuotationRequestItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteQuotationRequestItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteQuotationRequestItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteQuotationRequestItemMethod;
    if ((getDeleteQuotationRequestItemMethod = QuotationsRequestsServiceGrpc.getDeleteQuotationRequestItemMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getDeleteQuotationRequestItemMethod = QuotationsRequestsServiceGrpc.getDeleteQuotationRequestItemMethod) == null) {
          QuotationsRequestsServiceGrpc.getDeleteQuotationRequestItemMethod = getDeleteQuotationRequestItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteQuotationRequestItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("DeleteQuotationRequestItem"))
              .build();
        }
      }
    }
    return getDeleteQuotationRequestItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderQuotationRequestItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderQuotationRequestItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderQuotationRequestItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderQuotationRequestItemsMethod;
    if ((getReorderQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getReorderQuotationRequestItemsMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getReorderQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getReorderQuotationRequestItemsMethod) == null) {
          QuotationsRequestsServiceGrpc.getReorderQuotationRequestItemsMethod = getReorderQuotationRequestItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderQuotationRequestItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ReorderQuotationRequestItems"))
              .build();
        }
      }
    }
    return getReorderQuotationRequestItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuotationRequestItem> getViewQuotationRequestItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewQuotationRequestItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.QuotationRequestItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuotationRequestItem> getViewQuotationRequestItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.QuotationRequestItem> getViewQuotationRequestItemByIDMethod;
    if ((getViewQuotationRequestItemByIDMethod = QuotationsRequestsServiceGrpc.getViewQuotationRequestItemByIDMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewQuotationRequestItemByIDMethod = QuotationsRequestsServiceGrpc.getViewQuotationRequestItemByIDMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewQuotationRequestItemByIDMethod = getViewQuotationRequestItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.QuotationRequestItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewQuotationRequestItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequestItem.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewQuotationRequestItemByID"))
              .build();
        }
      }
    }
    return getViewQuotationRequestItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.QuotationsRequestsItemsList> getViewApprovedQuotationRequestItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedQuotationRequestItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.QuotationsRequestsItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.QuotationsRequestsItemsList> getViewApprovedQuotationRequestItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.QuotationsRequestsItemsList> getViewApprovedQuotationRequestItemsMethod;
    if ((getViewApprovedQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getViewApprovedQuotationRequestItemsMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewApprovedQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getViewApprovedQuotationRequestItemsMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewApprovedQuotationRequestItemsMethod = getViewApprovedQuotationRequestItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.QuotationsRequestsItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedQuotationRequestItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewApprovedQuotationRequestItems"))
              .build();
        }
      }
    }
    return getViewApprovedQuotationRequestItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.QuotationsRequestsItemsList> getViewUnapprovedQuotationRequestItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedQuotationRequestItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.QuotationsRequestsItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.QuotationsRequestsItemsList> getViewUnapprovedQuotationRequestItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.QuotationsRequestsItemsList> getViewUnapprovedQuotationRequestItemsMethod;
    if ((getViewUnapprovedQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getViewUnapprovedQuotationRequestItemsMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewUnapprovedQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getViewUnapprovedQuotationRequestItemsMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewUnapprovedQuotationRequestItemsMethod = getViewUnapprovedQuotationRequestItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.QuotationsRequestsItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedQuotationRequestItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewUnapprovedQuotationRequestItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedQuotationRequestItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemHistoryRequest,
      com.scailo.sdk.QuotationsRequestsItemsList> getViewQuotationRequestItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewQuotationRequestItemHistory",
      requestType = com.scailo.sdk.QuotationRequestItemHistoryRequest.class,
      responseType = com.scailo.sdk.QuotationsRequestsItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemHistoryRequest,
      com.scailo.sdk.QuotationsRequestsItemsList> getViewQuotationRequestItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemHistoryRequest, com.scailo.sdk.QuotationsRequestsItemsList> getViewQuotationRequestItemHistoryMethod;
    if ((getViewQuotationRequestItemHistoryMethod = QuotationsRequestsServiceGrpc.getViewQuotationRequestItemHistoryMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewQuotationRequestItemHistoryMethod = QuotationsRequestsServiceGrpc.getViewQuotationRequestItemHistoryMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewQuotationRequestItemHistoryMethod = getViewQuotationRequestItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationRequestItemHistoryRequest, com.scailo.sdk.QuotationsRequestsItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewQuotationRequestItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequestItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewQuotationRequestItemHistory"))
              .build();
        }
      }
    }
    return getViewQuotationRequestItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemsSearchRequest,
      com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> getViewPaginatedApprovedQuotationRequestItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedQuotationRequestItems",
      requestType = com.scailo.sdk.QuotationRequestItemsSearchRequest.class,
      responseType = com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemsSearchRequest,
      com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> getViewPaginatedApprovedQuotationRequestItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemsSearchRequest, com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> getViewPaginatedApprovedQuotationRequestItemsMethod;
    if ((getViewPaginatedApprovedQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getViewPaginatedApprovedQuotationRequestItemsMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewPaginatedApprovedQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getViewPaginatedApprovedQuotationRequestItemsMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewPaginatedApprovedQuotationRequestItemsMethod = getViewPaginatedApprovedQuotationRequestItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationRequestItemsSearchRequest, com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedQuotationRequestItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequestItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewPaginatedApprovedQuotationRequestItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedQuotationRequestItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemsSearchRequest,
      com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> getViewPaginatedUnapprovedQuotationRequestItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedQuotationRequestItems",
      requestType = com.scailo.sdk.QuotationRequestItemsSearchRequest.class,
      responseType = com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemsSearchRequest,
      com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> getViewPaginatedUnapprovedQuotationRequestItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemsSearchRequest, com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> getViewPaginatedUnapprovedQuotationRequestItemsMethod;
    if ((getViewPaginatedUnapprovedQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getViewPaginatedUnapprovedQuotationRequestItemsMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getViewPaginatedUnapprovedQuotationRequestItemsMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewPaginatedUnapprovedQuotationRequestItemsMethod = getViewPaginatedUnapprovedQuotationRequestItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationRequestItemsSearchRequest, com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedQuotationRequestItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequestItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedQuotationRequestItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedQuotationRequestItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemsSearchRequest,
      com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchItemsWithPagination",
      requestType = com.scailo.sdk.QuotationRequestItemsSearchRequest.class,
      responseType = com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemsSearchRequest,
      com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationRequestItemsSearchRequest, com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;
    if ((getSearchItemsWithPaginationMethod = QuotationsRequestsServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getSearchItemsWithPaginationMethod = QuotationsRequestsServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
          QuotationsRequestsServiceGrpc.getSearchItemsWithPaginationMethod = getSearchItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationRequestItemsSearchRequest, com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequestItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("SearchItemsWithPagination"))
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
    if ((getDownloadItemsAsCSVMethod = QuotationsRequestsServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getDownloadItemsAsCSVMethod = QuotationsRequestsServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
          QuotationsRequestsServiceGrpc.getDownloadItemsAsCSVMethod = getDownloadItemsAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("DownloadItemsAsCSV"))
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
    if ((getDownloadItemsTemplateAsCSVMethod = QuotationsRequestsServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getDownloadItemsTemplateAsCSVMethod = QuotationsRequestsServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
          QuotationsRequestsServiceGrpc.getDownloadItemsTemplateAsCSVMethod = getDownloadItemsTemplateAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsTemplateAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("DownloadItemsTemplateAsCSV"))
              .build();
        }
      }
    }
    return getDownloadItemsTemplateAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadQuotationRequestItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadQuotationRequestItems",
      requestType = com.scailo.sdk.IdentifierUUIDWithFile.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadQuotationRequestItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList> getUploadQuotationRequestItemsMethod;
    if ((getUploadQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getUploadQuotationRequestItemsMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getUploadQuotationRequestItemsMethod = QuotationsRequestsServiceGrpc.getUploadQuotationRequestItemsMethod) == null) {
          QuotationsRequestsServiceGrpc.getUploadQuotationRequestItemsMethod = getUploadQuotationRequestItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadQuotationRequestItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("UploadQuotationRequestItems"))
              .build();
        }
      }
    }
    return getUploadQuotationRequestItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuotationRequest> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.QuotationRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuotationRequest> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.QuotationRequest> getViewByIDMethod;
    if ((getViewByIDMethod = QuotationsRequestsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewByIDMethod = QuotationsRequestsServiceGrpc.getViewByIDMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.QuotationRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequest.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.QuotationRequest> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.QuotationRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.QuotationRequest> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.QuotationRequest> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = QuotationsRequestsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewByUUIDMethod = QuotationsRequestsServiceGrpc.getViewByUUIDMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.QuotationRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequest.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.QuotationRequest> getViewByReferenceIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByReferenceID",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.QuotationRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.QuotationRequest> getViewByReferenceIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.QuotationRequest> getViewByReferenceIDMethod;
    if ((getViewByReferenceIDMethod = QuotationsRequestsServiceGrpc.getViewByReferenceIDMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewByReferenceIDMethod = QuotationsRequestsServiceGrpc.getViewByReferenceIDMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewByReferenceIDMethod = getViewByReferenceIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.QuotationRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByReferenceID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequest.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewByReferenceID"))
              .build();
        }
      }
    }
    return getViewByReferenceIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuotationRequest> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.QuotationRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuotationRequest> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.QuotationRequest> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = QuotationsRequestsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = QuotationsRequestsServiceGrpc.getViewEssentialByIDMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.QuotationRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequest.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.QuotationRequest> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.QuotationRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.QuotationRequest> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.QuotationRequest> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = QuotationsRequestsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = QuotationsRequestsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.QuotationRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequest.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.QuotationsRequestsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.QuotationsRequestsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.QuotationsRequestsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.QuotationsRequestsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = QuotationsRequestsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewFromIDsMethod = QuotationsRequestsServiceGrpc.getViewFromIDsMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.QuotationsRequestsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsList.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.QuotationRequestAncillaryParameters> getViewAncillaryParametersByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAncillaryParametersByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.QuotationRequestAncillaryParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.QuotationRequestAncillaryParameters> getViewAncillaryParametersByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.QuotationRequestAncillaryParameters> getViewAncillaryParametersByUUIDMethod;
    if ((getViewAncillaryParametersByUUIDMethod = QuotationsRequestsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewAncillaryParametersByUUIDMethod = QuotationsRequestsServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewAncillaryParametersByUUIDMethod = getViewAncillaryParametersByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.QuotationRequestAncillaryParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAncillaryParametersByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationRequestAncillaryParameters.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewAncillaryParametersByUUID"))
              .build();
        }
      }
    }
    return getViewAncillaryParametersByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.QuotationsRequestsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.QuotationsRequestsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.QuotationsRequestsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.QuotationsRequestsList> getViewAllMethod;
    if ((getViewAllMethod = QuotationsRequestsServiceGrpc.getViewAllMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewAllMethod = QuotationsRequestsServiceGrpc.getViewAllMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.QuotationsRequestsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsList.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.QuotationsRequestsList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.QuotationsRequestsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.QuotationsRequestsList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.QuotationsRequestsList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = QuotationsRequestsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = QuotationsRequestsServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.QuotationsRequestsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsList.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServicePaginationReq,
      com.scailo.sdk.QuotationsRequestsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.QuotationsRequestsServicePaginationReq.class,
      responseType = com.scailo.sdk.QuotationsRequestsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServicePaginationReq,
      com.scailo.sdk.QuotationsRequestsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServicePaginationReq, com.scailo.sdk.QuotationsRequestsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = QuotationsRequestsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = QuotationsRequestsServiceGrpc.getViewWithPaginationMethod) == null) {
          QuotationsRequestsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServicePaginationReq, com.scailo.sdk.QuotationsRequestsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
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
    if ((getIsDownloadableMethod = QuotationsRequestsServiceGrpc.getIsDownloadableMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getIsDownloadableMethod = QuotationsRequestsServiceGrpc.getIsDownloadableMethod) == null) {
          QuotationsRequestsServiceGrpc.getIsDownloadableMethod = getIsDownloadableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDownloadable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("IsDownloadable"))
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
    if ((getDownloadByUUIDMethod = QuotationsRequestsServiceGrpc.getDownloadByUUIDMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getDownloadByUUIDMethod = QuotationsRequestsServiceGrpc.getDownloadByUUIDMethod) == null) {
          QuotationsRequestsServiceGrpc.getDownloadByUUIDMethod = getDownloadByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("DownloadByUUID"))
              .build();
        }
      }
    }
    return getDownloadByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceSearchAllReq,
      com.scailo.sdk.QuotationsRequestsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.QuotationsRequestsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.QuotationsRequestsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceSearchAllReq,
      com.scailo.sdk.QuotationsRequestsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceSearchAllReq, com.scailo.sdk.QuotationsRequestsList> getSearchAllMethod;
    if ((getSearchAllMethod = QuotationsRequestsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getSearchAllMethod = QuotationsRequestsServiceGrpc.getSearchAllMethod) == null) {
          QuotationsRequestsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceSearchAllReq, com.scailo.sdk.QuotationsRequestsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsList.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceFilterReq,
      com.scailo.sdk.QuotationsRequestsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.QuotationsRequestsServiceFilterReq.class,
      responseType = com.scailo.sdk.QuotationsRequestsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceFilterReq,
      com.scailo.sdk.QuotationsRequestsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceFilterReq, com.scailo.sdk.QuotationsRequestsList> getFilterMethod;
    if ((getFilterMethod = QuotationsRequestsServiceGrpc.getFilterMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getFilterMethod = QuotationsRequestsServiceGrpc.getFilterMethod) == null) {
          QuotationsRequestsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceFilterReq, com.scailo.sdk.QuotationsRequestsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsList.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = QuotationsRequestsServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getCountInStatusMethod = QuotationsRequestsServiceGrpc.getCountInStatusMethod) == null) {
          QuotationsRequestsServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.QuotationsRequestsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = QuotationsRequestsServiceGrpc.getCountMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getCountMethod = QuotationsRequestsServiceGrpc.getCountMethod) == null) {
          QuotationsRequestsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.QuotationsRequestsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.QuotationsRequestsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = QuotationsRequestsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (QuotationsRequestsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = QuotationsRequestsServiceGrpc.getDownloadAsCSVMethod) == null) {
          QuotationsRequestsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.QuotationsRequestsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuotationsRequestsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new QuotationsRequestsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuotationsRequestsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotationsRequestsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotationsRequestsServiceStub>() {
        @java.lang.Override
        public QuotationsRequestsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotationsRequestsServiceStub(channel, callOptions);
        }
      };
    return QuotationsRequestsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuotationsRequestsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotationsRequestsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotationsRequestsServiceBlockingStub>() {
        @java.lang.Override
        public QuotationsRequestsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotationsRequestsServiceBlockingStub(channel, callOptions);
        }
      };
    return QuotationsRequestsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuotationsRequestsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotationsRequestsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotationsRequestsServiceFutureStub>() {
        @java.lang.Override
        public QuotationsRequestsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotationsRequestsServiceFutureStub(channel, callOptions);
        }
      };
    return QuotationsRequestsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each quotation request
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.QuotationsRequestsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.QuotationsRequestsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.QuotationsRequestsServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.QuotationsRequestsServiceUpdateRequest request,
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
     * Create a magic link
     * </pre>
     */
    default void createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMagicLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Autofill the quotation request (from the associated purchase enquiry)
     * </pre>
     */
    default void autofill(com.scailo.sdk.QuotationsRequestsServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAutofillMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an item to a quotation request
     * </pre>
     */
    default void addQuotationRequestItem(com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddQuotationRequestItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a quotation request
     * </pre>
     */
    default void modifyQuotationRequestItem(com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyQuotationRequestItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a quotation request
     * </pre>
     */
    default void approveQuotationRequestItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveQuotationRequestItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a quotation request
     * </pre>
     */
    default void deleteQuotationRequestItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteQuotationRequestItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a quotation request
     * </pre>
     */
    default void reorderQuotationRequestItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderQuotationRequestItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View quotation request Item by ID
     * </pre>
     */
    default void viewQuotationRequestItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequestItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewQuotationRequestItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved quotation request items for given quotation request ID
     * </pre>
     */
    default void viewApprovedQuotationRequestItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedQuotationRequestItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved quotation request items for given quotation request ID
     * </pre>
     */
    default void viewUnapprovedQuotationRequestItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedQuotationRequestItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the quotation request item
     * </pre>
     */
    default void viewQuotationRequestItemHistory(com.scailo.sdk.QuotationRequestItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewQuotationRequestItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved quotation request items for given quotation request ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedQuotationRequestItems(com.scailo.sdk.QuotationRequestItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedQuotationRequestItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved quotation request items for given quotation request ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedQuotationRequestItems(com.scailo.sdk.QuotationRequestItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedQuotationRequestItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through quotation request items with pagination
     * </pre>
     */
    default void searchItemsWithPagination(com.scailo.sdk.QuotationRequestItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> responseObserver) {
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
     * Upload items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    default void uploadQuotationRequestItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadQuotationRequestItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    default void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByReferenceIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    default void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequestAncillaryParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAncillaryParametersByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.QuotationsRequestsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
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
     * Download quotation request with the given IdentifierUUID (can be used to allow public downloads)
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
    default void searchAll(com.scailo.sdk.QuotationsRequestsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.QuotationsRequestsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
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
    default void count(com.scailo.sdk.QuotationsRequestsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.QuotationsRequestsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QuotationsRequestsService.
   * <pre>
   *Describes the common methods applicable on each quotation request
   * </pre>
   */
  public static abstract class QuotationsRequestsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QuotationsRequestsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QuotationsRequestsService.
   * <pre>
   *Describes the common methods applicable on each quotation request
   * </pre>
   */
  public static final class QuotationsRequestsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QuotationsRequestsServiceStub> {
    private QuotationsRequestsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotationsRequestsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotationsRequestsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.QuotationsRequestsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.QuotationsRequestsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.QuotationsRequestsServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.QuotationsRequestsServiceUpdateRequest request,
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
     * Autofill the quotation request (from the associated purchase enquiry)
     * </pre>
     */
    public void autofill(com.scailo.sdk.QuotationsRequestsServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an item to a quotation request
     * </pre>
     */
    public void addQuotationRequestItem(com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddQuotationRequestItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a quotation request
     * </pre>
     */
    public void modifyQuotationRequestItem(com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyQuotationRequestItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a quotation request
     * </pre>
     */
    public void approveQuotationRequestItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveQuotationRequestItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a quotation request
     * </pre>
     */
    public void deleteQuotationRequestItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteQuotationRequestItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a quotation request
     * </pre>
     */
    public void reorderQuotationRequestItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderQuotationRequestItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View quotation request Item by ID
     * </pre>
     */
    public void viewQuotationRequestItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequestItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewQuotationRequestItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved quotation request items for given quotation request ID
     * </pre>
     */
    public void viewApprovedQuotationRequestItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedQuotationRequestItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved quotation request items for given quotation request ID
     * </pre>
     */
    public void viewUnapprovedQuotationRequestItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedQuotationRequestItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the quotation request item
     * </pre>
     */
    public void viewQuotationRequestItemHistory(com.scailo.sdk.QuotationRequestItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewQuotationRequestItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved quotation request items for given quotation request ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedQuotationRequestItems(com.scailo.sdk.QuotationRequestItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedQuotationRequestItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved quotation request items for given quotation request ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedQuotationRequestItems(com.scailo.sdk.QuotationRequestItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedQuotationRequestItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through quotation request items with pagination
     * </pre>
     */
    public void searchItemsWithPagination(com.scailo.sdk.QuotationRequestItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> responseObserver) {
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
     * Upload items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public void uploadQuotationRequestItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadQuotationRequestItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequestAncillaryParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.QuotationsRequestsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
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
     * Download quotation request with the given IdentifierUUID (can be used to allow public downloads)
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
    public void searchAll(com.scailo.sdk.QuotationsRequestsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.QuotationsRequestsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList> responseObserver) {
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
    public void count(com.scailo.sdk.QuotationsRequestsServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.QuotationsRequestsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QuotationsRequestsService.
   * <pre>
   *Describes the common methods applicable on each quotation request
   * </pre>
   */
  public static final class QuotationsRequestsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QuotationsRequestsServiceBlockingStub> {
    private QuotationsRequestsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotationsRequestsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotationsRequestsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.QuotationsRequestsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.QuotationsRequestsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.QuotationsRequestsServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.QuotationsRequestsServiceUpdateRequest request) {
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
     * Create a magic link
     * </pre>
     */
    public com.scailo.sdk.MagicLink createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMagicLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Autofill the quotation request (from the associated purchase enquiry)
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse autofill(com.scailo.sdk.QuotationsRequestsServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAutofillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an item to a quotation request
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addQuotationRequestItem(com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddQuotationRequestItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an item in a quotation request
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyQuotationRequestItem(com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyQuotationRequestItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an item in a quotation request
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveQuotationRequestItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveQuotationRequestItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an item in a quotation request
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteQuotationRequestItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteQuotationRequestItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a quotation request
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderQuotationRequestItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderQuotationRequestItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View quotation request Item by ID
     * </pre>
     */
    public com.scailo.sdk.QuotationRequestItem viewQuotationRequestItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewQuotationRequestItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved quotation request items for given quotation request ID
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsItemsList viewApprovedQuotationRequestItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedQuotationRequestItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved quotation request items for given quotation request ID
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsItemsList viewUnapprovedQuotationRequestItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedQuotationRequestItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the quotation request item
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsItemsList viewQuotationRequestItemHistory(com.scailo.sdk.QuotationRequestItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewQuotationRequestItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved quotation request items for given quotation request ID with pagination
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse viewPaginatedApprovedQuotationRequestItems(com.scailo.sdk.QuotationRequestItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedQuotationRequestItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved quotation request items for given quotation request ID with pagination
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse viewPaginatedUnapprovedQuotationRequestItems(com.scailo.sdk.QuotationRequestItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedQuotationRequestItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through quotation request items with pagination
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse searchItemsWithPagination(com.scailo.sdk.QuotationRequestItemsSearchRequest request) {
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
     * Upload items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public com.scailo.sdk.IdentifiersList uploadQuotationRequestItems(com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadQuotationRequestItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.QuotationRequest viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.QuotationRequest viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.scailo.sdk.QuotationRequest viewByReferenceID(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByReferenceIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.QuotationRequest viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.QuotationRequest viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.scailo.sdk.QuotationRequestAncillaryParameters viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAncillaryParametersByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsServicePaginationResponse viewWithPagination(com.scailo.sdk.QuotationsRequestsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
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
     * Download quotation request with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.scailo.sdk.QuotationsRequestsList searchAll(com.scailo.sdk.QuotationsRequestsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.QuotationsRequestsList filter(com.scailo.sdk.QuotationsRequestsServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.QuotationsRequestsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.QuotationsRequestsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QuotationsRequestsService.
   * <pre>
   *Describes the common methods applicable on each quotation request
   * </pre>
   */
  public static final class QuotationsRequestsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QuotationsRequestsServiceFutureStub> {
    private QuotationsRequestsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotationsRequestsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotationsRequestsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.QuotationsRequestsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.QuotationsRequestsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.QuotationsRequestsServiceUpdateRequest request) {
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
        com.scailo.sdk.QuotationsRequestsServiceUpdateRequest request) {
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
     * Autofill the quotation request (from the associated purchase enquiry)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> autofill(
        com.scailo.sdk.QuotationsRequestsServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an item to a quotation request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addQuotationRequestItem(
        com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddQuotationRequestItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an item in a quotation request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyQuotationRequestItem(
        com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyQuotationRequestItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an item in a quotation request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveQuotationRequestItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveQuotationRequestItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an item in a quotation request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteQuotationRequestItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteQuotationRequestItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a quotation request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderQuotationRequestItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderQuotationRequestItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View quotation request Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationRequestItem> viewQuotationRequestItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewQuotationRequestItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved quotation request items for given quotation request ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsItemsList> viewApprovedQuotationRequestItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedQuotationRequestItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved quotation request items for given quotation request ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsItemsList> viewUnapprovedQuotationRequestItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedQuotationRequestItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the quotation request item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsItemsList> viewQuotationRequestItemHistory(
        com.scailo.sdk.QuotationRequestItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewQuotationRequestItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved quotation request items for given quotation request ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> viewPaginatedApprovedQuotationRequestItems(
        com.scailo.sdk.QuotationRequestItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedQuotationRequestItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved quotation request items for given quotation request ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> viewPaginatedUnapprovedQuotationRequestItems(
        com.scailo.sdk.QuotationRequestItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedQuotationRequestItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through quotation request items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse> searchItemsWithPagination(
        com.scailo.sdk.QuotationRequestItemsSearchRequest request) {
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
     * Upload items using a CSV file. This is an idempotent operation. All the existing items are deleted before adding the items from the file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> uploadQuotationRequestItems(
        com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadQuotationRequestItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationRequest> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationRequest> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationRequest> viewByReferenceID(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationRequest> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationRequest> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationRequestAncillaryParameters> viewAncillaryParametersByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.QuotationsRequestsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
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
     * Download quotation request with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsList> searchAll(
        com.scailo.sdk.QuotationsRequestsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuotationsRequestsList> filter(
        com.scailo.sdk.QuotationsRequestsServiceFilterReq request) {
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
        com.scailo.sdk.QuotationsRequestsServiceCountReq request) {
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
        com.scailo.sdk.QuotationsRequestsServiceFilterReq request) {
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
  private static final int METHODID_CREATE_MAGIC_LINK = 15;
  private static final int METHODID_AUTOFILL = 16;
  private static final int METHODID_ADD_QUOTATION_REQUEST_ITEM = 17;
  private static final int METHODID_MODIFY_QUOTATION_REQUEST_ITEM = 18;
  private static final int METHODID_APPROVE_QUOTATION_REQUEST_ITEM = 19;
  private static final int METHODID_DELETE_QUOTATION_REQUEST_ITEM = 20;
  private static final int METHODID_REORDER_QUOTATION_REQUEST_ITEMS = 21;
  private static final int METHODID_VIEW_QUOTATION_REQUEST_ITEM_BY_ID = 22;
  private static final int METHODID_VIEW_APPROVED_QUOTATION_REQUEST_ITEMS = 23;
  private static final int METHODID_VIEW_UNAPPROVED_QUOTATION_REQUEST_ITEMS = 24;
  private static final int METHODID_VIEW_QUOTATION_REQUEST_ITEM_HISTORY = 25;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_QUOTATION_REQUEST_ITEMS = 26;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_QUOTATION_REQUEST_ITEMS = 27;
  private static final int METHODID_SEARCH_ITEMS_WITH_PAGINATION = 28;
  private static final int METHODID_DOWNLOAD_ITEMS_AS_CSV = 29;
  private static final int METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV = 30;
  private static final int METHODID_UPLOAD_QUOTATION_REQUEST_ITEMS = 31;
  private static final int METHODID_VIEW_BY_ID = 32;
  private static final int METHODID_VIEW_BY_UUID = 33;
  private static final int METHODID_VIEW_BY_REFERENCE_ID = 34;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 35;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 36;
  private static final int METHODID_VIEW_FROM_IDS = 37;
  private static final int METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID = 38;
  private static final int METHODID_VIEW_ALL = 39;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 40;
  private static final int METHODID_VIEW_WITH_PAGINATION = 41;
  private static final int METHODID_IS_DOWNLOADABLE = 42;
  private static final int METHODID_DOWNLOAD_BY_UUID = 43;
  private static final int METHODID_SEARCH_ALL = 44;
  private static final int METHODID_FILTER = 45;
  private static final int METHODID_COUNT_IN_STATUS = 46;
  private static final int METHODID_COUNT = 47;
  private static final int METHODID_DOWNLOAD_AS_CSV = 48;

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
          serviceImpl.create((com.scailo.sdk.QuotationsRequestsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.QuotationsRequestsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.QuotationsRequestsServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.QuotationsRequestsServiceUpdateRequest) request,
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
        case METHODID_CREATE_MAGIC_LINK:
          serviceImpl.createMagicLink((com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink>) responseObserver);
          break;
        case METHODID_AUTOFILL:
          serviceImpl.autofill((com.scailo.sdk.QuotationsRequestsServiceAutofillRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_QUOTATION_REQUEST_ITEM:
          serviceImpl.addQuotationRequestItem((com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_QUOTATION_REQUEST_ITEM:
          serviceImpl.modifyQuotationRequestItem((com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_QUOTATION_REQUEST_ITEM:
          serviceImpl.approveQuotationRequestItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_QUOTATION_REQUEST_ITEM:
          serviceImpl.deleteQuotationRequestItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_QUOTATION_REQUEST_ITEMS:
          serviceImpl.reorderQuotationRequestItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_QUOTATION_REQUEST_ITEM_BY_ID:
          serviceImpl.viewQuotationRequestItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequestItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_QUOTATION_REQUEST_ITEMS:
          serviceImpl.viewApprovedQuotationRequestItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_QUOTATION_REQUEST_ITEMS:
          serviceImpl.viewUnapprovedQuotationRequestItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsItemsList>) responseObserver);
          break;
        case METHODID_VIEW_QUOTATION_REQUEST_ITEM_HISTORY:
          serviceImpl.viewQuotationRequestItemHistory((com.scailo.sdk.QuotationRequestItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_QUOTATION_REQUEST_ITEMS:
          serviceImpl.viewPaginatedApprovedQuotationRequestItems((com.scailo.sdk.QuotationRequestItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_QUOTATION_REQUEST_ITEMS:
          serviceImpl.viewPaginatedUnapprovedQuotationRequestItems((com.scailo.sdk.QuotationRequestItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ITEMS_WITH_PAGINATION:
          serviceImpl.searchItemsWithPagination((com.scailo.sdk.QuotationRequestItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_AS_CSV:
          serviceImpl.downloadItemsAsCSV((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV:
          serviceImpl.downloadItemsTemplateAsCSV((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_UPLOAD_QUOTATION_REQUEST_ITEMS:
          serviceImpl.uploadQuotationRequestItems((com.scailo.sdk.IdentifierUUIDWithFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest>) responseObserver);
          break;
        case METHODID_VIEW_BY_REFERENCE_ID:
          serviceImpl.viewByReferenceID((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequest>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList>) responseObserver);
          break;
        case METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID:
          serviceImpl.viewAncillaryParametersByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationRequestAncillaryParameters>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.QuotationsRequestsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsServicePaginationResponse>) responseObserver);
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
          serviceImpl.searchAll((com.scailo.sdk.QuotationsRequestsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.QuotationsRequestsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuotationsRequestsList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.QuotationsRequestsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.QuotationsRequestsServiceFilterReq) request,
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
              com.scailo.sdk.QuotationsRequestsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationsRequestsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationsRequestsServiceUpdateRequest,
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
              com.scailo.sdk.QuotationsRequestsServiceUpdateRequest,
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
          getCreateMagicLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
              com.scailo.sdk.MagicLink>(
                service, METHODID_CREATE_MAGIC_LINK)))
        .addMethod(
          getAutofillMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationsRequestsServiceAutofillRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_AUTOFILL)))
        .addMethod(
          getAddQuotationRequestItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationsRequestsServiceItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_QUOTATION_REQUEST_ITEM)))
        .addMethod(
          getModifyQuotationRequestItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationsRequestsServiceItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_QUOTATION_REQUEST_ITEM)))
        .addMethod(
          getApproveQuotationRequestItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_QUOTATION_REQUEST_ITEM)))
        .addMethod(
          getDeleteQuotationRequestItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_QUOTATION_REQUEST_ITEM)))
        .addMethod(
          getReorderQuotationRequestItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_QUOTATION_REQUEST_ITEMS)))
        .addMethod(
          getViewQuotationRequestItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.QuotationRequestItem>(
                service, METHODID_VIEW_QUOTATION_REQUEST_ITEM_BY_ID)))
        .addMethod(
          getViewApprovedQuotationRequestItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.QuotationsRequestsItemsList>(
                service, METHODID_VIEW_APPROVED_QUOTATION_REQUEST_ITEMS)))
        .addMethod(
          getViewUnapprovedQuotationRequestItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.QuotationsRequestsItemsList>(
                service, METHODID_VIEW_UNAPPROVED_QUOTATION_REQUEST_ITEMS)))
        .addMethod(
          getViewQuotationRequestItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationRequestItemHistoryRequest,
              com.scailo.sdk.QuotationsRequestsItemsList>(
                service, METHODID_VIEW_QUOTATION_REQUEST_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedQuotationRequestItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationRequestItemsSearchRequest,
              com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_QUOTATION_REQUEST_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedQuotationRequestItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationRequestItemsSearchRequest,
              com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_QUOTATION_REQUEST_ITEMS)))
        .addMethod(
          getSearchItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationRequestItemsSearchRequest,
              com.scailo.sdk.QuotationsRequestsServicePaginatedItemsResponse>(
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
          getUploadQuotationRequestItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithFile,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_UPLOAD_QUOTATION_REQUEST_ITEMS)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.QuotationRequest>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.QuotationRequest>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewByReferenceIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.QuotationRequest>(
                service, METHODID_VIEW_BY_REFERENCE_ID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.QuotationRequest>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.QuotationRequest>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.QuotationsRequestsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAncillaryParametersByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.QuotationRequestAncillaryParameters>(
                service, METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.QuotationsRequestsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.QuotationsRequestsList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationsRequestsServicePaginationReq,
              com.scailo.sdk.QuotationsRequestsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
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
              com.scailo.sdk.QuotationsRequestsServiceSearchAllReq,
              com.scailo.sdk.QuotationsRequestsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationsRequestsServiceFilterReq,
              com.scailo.sdk.QuotationsRequestsList>(
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
              com.scailo.sdk.QuotationsRequestsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.QuotationsRequestsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class QuotationsRequestsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuotationsRequestsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.QuotationsRequestsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuotationsRequestsService");
    }
  }

  private static final class QuotationsRequestsServiceFileDescriptorSupplier
      extends QuotationsRequestsServiceBaseDescriptorSupplier {
    QuotationsRequestsServiceFileDescriptorSupplier() {}
  }

  private static final class QuotationsRequestsServiceMethodDescriptorSupplier
      extends QuotationsRequestsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QuotationsRequestsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QuotationsRequestsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuotationsRequestsServiceFileDescriptorSupplier())
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
              .addMethod(getCreateMagicLinkMethod())
              .addMethod(getAutofillMethod())
              .addMethod(getAddQuotationRequestItemMethod())
              .addMethod(getModifyQuotationRequestItemMethod())
              .addMethod(getApproveQuotationRequestItemMethod())
              .addMethod(getDeleteQuotationRequestItemMethod())
              .addMethod(getReorderQuotationRequestItemsMethod())
              .addMethod(getViewQuotationRequestItemByIDMethod())
              .addMethod(getViewApprovedQuotationRequestItemsMethod())
              .addMethod(getViewUnapprovedQuotationRequestItemsMethod())
              .addMethod(getViewQuotationRequestItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedQuotationRequestItemsMethod())
              .addMethod(getViewPaginatedUnapprovedQuotationRequestItemsMethod())
              .addMethod(getSearchItemsWithPaginationMethod())
              .addMethod(getDownloadItemsAsCSVMethod())
              .addMethod(getDownloadItemsTemplateAsCSVMethod())
              .addMethod(getUploadQuotationRequestItemsMethod())
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
