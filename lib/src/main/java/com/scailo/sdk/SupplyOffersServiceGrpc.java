package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each supply offer
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: supply_offers.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SupplyOffersServiceGrpc {

  private SupplyOffersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.SupplyOffersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.SupplyOffersServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = SupplyOffersServiceGrpc.getCreateMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getCreateMethod = SupplyOffersServiceGrpc.getCreateMethod) == null) {
          SupplyOffersServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.SupplyOffersServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = SupplyOffersServiceGrpc.getDraftMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getDraftMethod = SupplyOffersServiceGrpc.getDraftMethod) == null) {
          SupplyOffersServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.SupplyOffersServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = SupplyOffersServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getDraftUpdateMethod = SupplyOffersServiceGrpc.getDraftUpdateMethod) == null) {
          SupplyOffersServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = SupplyOffersServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getSendForVerificationMethod = SupplyOffersServiceGrpc.getSendForVerificationMethod) == null) {
          SupplyOffersServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = SupplyOffersServiceGrpc.getVerifyMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getVerifyMethod = SupplyOffersServiceGrpc.getVerifyMethod) == null) {
          SupplyOffersServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = SupplyOffersServiceGrpc.getApproveMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getApproveMethod = SupplyOffersServiceGrpc.getApproveMethod) == null) {
          SupplyOffersServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = SupplyOffersServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getSendForRevisionMethod = SupplyOffersServiceGrpc.getSendForRevisionMethod) == null) {
          SupplyOffersServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.SupplyOffersServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = SupplyOffersServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getRevisionUpdateMethod = SupplyOffersServiceGrpc.getRevisionUpdateMethod) == null) {
          SupplyOffersServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = SupplyOffersServiceGrpc.getHaltMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getHaltMethod = SupplyOffersServiceGrpc.getHaltMethod) == null) {
          SupplyOffersServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = SupplyOffersServiceGrpc.getDiscardMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getDiscardMethod = SupplyOffersServiceGrpc.getDiscardMethod) == null) {
          SupplyOffersServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = SupplyOffersServiceGrpc.getRestoreMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getRestoreMethod = SupplyOffersServiceGrpc.getRestoreMethod) == null) {
          SupplyOffersServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = SupplyOffersServiceGrpc.getCompleteMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getCompleteMethod = SupplyOffersServiceGrpc.getCompleteMethod) == null) {
          SupplyOffersServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = SupplyOffersServiceGrpc.getRepeatMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getRepeatMethod = SupplyOffersServiceGrpc.getRepeatMethod) == null) {
          SupplyOffersServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.RepeatWithDeliveryDate, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.RepeatWithDeliveryDate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getReopenMethod = SupplyOffersServiceGrpc.getReopenMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getReopenMethod = SupplyOffersServiceGrpc.getReopenMethod) == null) {
          SupplyOffersServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getCommentAddMethod = SupplyOffersServiceGrpc.getCommentAddMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getCommentAddMethod = SupplyOffersServiceGrpc.getCommentAddMethod) == null) {
          SupplyOffersServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getSendEmailMethod = SupplyOffersServiceGrpc.getSendEmailMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getSendEmailMethod = SupplyOffersServiceGrpc.getSendEmailMethod) == null) {
          SupplyOffersServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("SendEmail"))
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
    if ((getCreateMagicLinkMethod = SupplyOffersServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = SupplyOffersServiceGrpc.getCreateMagicLinkMethod) == null) {
          SupplyOffersServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("CreateMagicLink"))
              .build();
        }
      }
    }
    return getCreateMagicLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Autofill",
      requestType = com.scailo.sdk.SupplyOffersServiceAutofillRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceAutofillRequest, com.scailo.sdk.IdentifierResponse> getAutofillMethod;
    if ((getAutofillMethod = SupplyOffersServiceGrpc.getAutofillMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getAutofillMethod = SupplyOffersServiceGrpc.getAutofillMethod) == null) {
          SupplyOffersServiceGrpc.getAutofillMethod = getAutofillMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceAutofillRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Autofill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceAutofillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Autofill"))
              .build();
        }
      }
    }
    return getAutofillMethod;
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
    if ((getAmendMethod = SupplyOffersServiceGrpc.getAmendMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getAmendMethod = SupplyOffersServiceGrpc.getAmendMethod) == null) {
          SupplyOffersServiceGrpc.getAmendMethod = getAmendMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Amend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Amend"))
              .build();
        }
      }
    }
    return getAmendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSupplyOfferItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSupplyOfferItem",
      requestType = com.scailo.sdk.SupplyOffersServiceItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddSupplyOfferItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddSupplyOfferItemMethod;
    if ((getAddSupplyOfferItemMethod = SupplyOffersServiceGrpc.getAddSupplyOfferItemMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getAddSupplyOfferItemMethod = SupplyOffersServiceGrpc.getAddSupplyOfferItemMethod) == null) {
          SupplyOffersServiceGrpc.getAddSupplyOfferItemMethod = getAddSupplyOfferItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSupplyOfferItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("AddSupplyOfferItem"))
              .build();
        }
      }
    }
    return getAddSupplyOfferItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySupplyOfferItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifySupplyOfferItem",
      requestType = com.scailo.sdk.SupplyOffersServiceItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifySupplyOfferItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifySupplyOfferItemMethod;
    if ((getModifySupplyOfferItemMethod = SupplyOffersServiceGrpc.getModifySupplyOfferItemMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getModifySupplyOfferItemMethod = SupplyOffersServiceGrpc.getModifySupplyOfferItemMethod) == null) {
          SupplyOffersServiceGrpc.getModifySupplyOfferItemMethod = getModifySupplyOfferItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifySupplyOfferItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ModifySupplyOfferItem"))
              .build();
        }
      }
    }
    return getModifySupplyOfferItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSupplyOfferItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveSupplyOfferItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApproveSupplyOfferItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApproveSupplyOfferItemMethod;
    if ((getApproveSupplyOfferItemMethod = SupplyOffersServiceGrpc.getApproveSupplyOfferItemMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getApproveSupplyOfferItemMethod = SupplyOffersServiceGrpc.getApproveSupplyOfferItemMethod) == null) {
          SupplyOffersServiceGrpc.getApproveSupplyOfferItemMethod = getApproveSupplyOfferItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveSupplyOfferItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ApproveSupplyOfferItem"))
              .build();
        }
      }
    }
    return getApproveSupplyOfferItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSupplyOfferItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSupplyOfferItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeleteSupplyOfferItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeleteSupplyOfferItemMethod;
    if ((getDeleteSupplyOfferItemMethod = SupplyOffersServiceGrpc.getDeleteSupplyOfferItemMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getDeleteSupplyOfferItemMethod = SupplyOffersServiceGrpc.getDeleteSupplyOfferItemMethod) == null) {
          SupplyOffersServiceGrpc.getDeleteSupplyOfferItemMethod = getDeleteSupplyOfferItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSupplyOfferItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("DeleteSupplyOfferItem"))
              .build();
        }
      }
    }
    return getDeleteSupplyOfferItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSupplyOfferItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderSupplyOfferItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderSupplyOfferItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderSupplyOfferItemsMethod;
    if ((getReorderSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getReorderSupplyOfferItemsMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getReorderSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getReorderSupplyOfferItemsMethod) == null) {
          SupplyOffersServiceGrpc.getReorderSupplyOfferItemsMethod = getReorderSupplyOfferItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderSupplyOfferItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ReorderSupplyOfferItems"))
              .build();
        }
      }
    }
    return getReorderSupplyOfferItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SupplyOfferItem> getViewSupplyOfferItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSupplyOfferItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.SupplyOfferItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SupplyOfferItem> getViewSupplyOfferItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.SupplyOfferItem> getViewSupplyOfferItemByIDMethod;
    if ((getViewSupplyOfferItemByIDMethod = SupplyOffersServiceGrpc.getViewSupplyOfferItemByIDMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewSupplyOfferItemByIDMethod = SupplyOffersServiceGrpc.getViewSupplyOfferItemByIDMethod) == null) {
          SupplyOffersServiceGrpc.getViewSupplyOfferItemByIDMethod = getViewSupplyOfferItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.SupplyOfferItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSupplyOfferItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItem.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewSupplyOfferItemByID"))
              .build();
        }
      }
    }
    return getViewSupplyOfferItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest,
      com.scailo.sdk.PriceResponse> getViewSupplyOfferItemPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSupplyOfferItemPrice",
      requestType = com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.PriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest,
      com.scailo.sdk.PriceResponse> getViewSupplyOfferItemPriceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest, com.scailo.sdk.PriceResponse> getViewSupplyOfferItemPriceMethod;
    if ((getViewSupplyOfferItemPriceMethod = SupplyOffersServiceGrpc.getViewSupplyOfferItemPriceMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewSupplyOfferItemPriceMethod = SupplyOffersServiceGrpc.getViewSupplyOfferItemPriceMethod) == null) {
          SupplyOffersServiceGrpc.getViewSupplyOfferItemPriceMethod = getViewSupplyOfferItemPriceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest, com.scailo.sdk.PriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSupplyOfferItemPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewSupplyOfferItemPrice"))
              .build();
        }
      }
    }
    return getViewSupplyOfferItemPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SupplyOfferItemsList> getViewApprovedSupplyOfferItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedSupplyOfferItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SupplyOfferItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SupplyOfferItemsList> getViewApprovedSupplyOfferItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SupplyOfferItemsList> getViewApprovedSupplyOfferItemsMethod;
    if ((getViewApprovedSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getViewApprovedSupplyOfferItemsMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewApprovedSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getViewApprovedSupplyOfferItemsMethod) == null) {
          SupplyOffersServiceGrpc.getViewApprovedSupplyOfferItemsMethod = getViewApprovedSupplyOfferItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SupplyOfferItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedSupplyOfferItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewApprovedSupplyOfferItems"))
              .build();
        }
      }
    }
    return getViewApprovedSupplyOfferItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SupplyOfferItemsList> getViewUnapprovedSupplyOfferItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedSupplyOfferItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.SupplyOfferItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.SupplyOfferItemsList> getViewUnapprovedSupplyOfferItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SupplyOfferItemsList> getViewUnapprovedSupplyOfferItemsMethod;
    if ((getViewUnapprovedSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getViewUnapprovedSupplyOfferItemsMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewUnapprovedSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getViewUnapprovedSupplyOfferItemsMethod) == null) {
          SupplyOffersServiceGrpc.getViewUnapprovedSupplyOfferItemsMethod = getViewUnapprovedSupplyOfferItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.SupplyOfferItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedSupplyOfferItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewUnapprovedSupplyOfferItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedSupplyOfferItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemHistoryRequest,
      com.scailo.sdk.SupplyOfferItemsList> getViewSupplyOfferItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSupplyOfferItemHistory",
      requestType = com.scailo.sdk.SupplyOfferItemHistoryRequest.class,
      responseType = com.scailo.sdk.SupplyOfferItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemHistoryRequest,
      com.scailo.sdk.SupplyOfferItemsList> getViewSupplyOfferItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemHistoryRequest, com.scailo.sdk.SupplyOfferItemsList> getViewSupplyOfferItemHistoryMethod;
    if ((getViewSupplyOfferItemHistoryMethod = SupplyOffersServiceGrpc.getViewSupplyOfferItemHistoryMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewSupplyOfferItemHistoryMethod = SupplyOffersServiceGrpc.getViewSupplyOfferItemHistoryMethod) == null) {
          SupplyOffersServiceGrpc.getViewSupplyOfferItemHistoryMethod = getViewSupplyOfferItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOfferItemHistoryRequest, com.scailo.sdk.SupplyOfferItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSupplyOfferItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewSupplyOfferItemHistory"))
              .build();
        }
      }
    }
    return getViewSupplyOfferItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemsSearchRequest,
      com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> getViewPaginatedApprovedSupplyOfferItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedSupplyOfferItems",
      requestType = com.scailo.sdk.SupplyOfferItemsSearchRequest.class,
      responseType = com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemsSearchRequest,
      com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> getViewPaginatedApprovedSupplyOfferItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemsSearchRequest, com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> getViewPaginatedApprovedSupplyOfferItemsMethod;
    if ((getViewPaginatedApprovedSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getViewPaginatedApprovedSupplyOfferItemsMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewPaginatedApprovedSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getViewPaginatedApprovedSupplyOfferItemsMethod) == null) {
          SupplyOffersServiceGrpc.getViewPaginatedApprovedSupplyOfferItemsMethod = getViewPaginatedApprovedSupplyOfferItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOfferItemsSearchRequest, com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedSupplyOfferItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewPaginatedApprovedSupplyOfferItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedSupplyOfferItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemsSearchRequest,
      com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> getViewPaginatedUnapprovedSupplyOfferItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedSupplyOfferItems",
      requestType = com.scailo.sdk.SupplyOfferItemsSearchRequest.class,
      responseType = com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemsSearchRequest,
      com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> getViewPaginatedUnapprovedSupplyOfferItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemsSearchRequest, com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> getViewPaginatedUnapprovedSupplyOfferItemsMethod;
    if ((getViewPaginatedUnapprovedSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getViewPaginatedUnapprovedSupplyOfferItemsMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getViewPaginatedUnapprovedSupplyOfferItemsMethod) == null) {
          SupplyOffersServiceGrpc.getViewPaginatedUnapprovedSupplyOfferItemsMethod = getViewPaginatedUnapprovedSupplyOfferItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOfferItemsSearchRequest, com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedSupplyOfferItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedSupplyOfferItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedSupplyOfferItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemsSearchRequest,
      com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchItemsWithPagination",
      requestType = com.scailo.sdk.SupplyOfferItemsSearchRequest.class,
      responseType = com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemsSearchRequest,
      com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemsSearchRequest, com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;
    if ((getSearchItemsWithPaginationMethod = SupplyOffersServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getSearchItemsWithPaginationMethod = SupplyOffersServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
          SupplyOffersServiceGrpc.getSearchItemsWithPaginationMethod = getSearchItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOfferItemsSearchRequest, com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("SearchItemsWithPagination"))
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
    if ((getDownloadItemsAsCSVMethod = SupplyOffersServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getDownloadItemsAsCSVMethod = SupplyOffersServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
          SupplyOffersServiceGrpc.getDownloadItemsAsCSVMethod = getDownloadItemsAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("DownloadItemsAsCSV"))
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
    if ((getDownloadItemsTemplateAsCSVMethod = SupplyOffersServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getDownloadItemsTemplateAsCSVMethod = SupplyOffersServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
          SupplyOffersServiceGrpc.getDownloadItemsTemplateAsCSVMethod = getDownloadItemsTemplateAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsTemplateAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("DownloadItemsTemplateAsCSV"))
              .build();
        }
      }
    }
    return getDownloadItemsTemplateAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadSupplyOfferItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadSupplyOfferItems",
      requestType = com.scailo.sdk.IdentifierUUIDWithFile.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadSupplyOfferItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList> getUploadSupplyOfferItemsMethod;
    if ((getUploadSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getUploadSupplyOfferItemsMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getUploadSupplyOfferItemsMethod = SupplyOffersServiceGrpc.getUploadSupplyOfferItemsMethod) == null) {
          SupplyOffersServiceGrpc.getUploadSupplyOfferItemsMethod = getUploadSupplyOfferItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadSupplyOfferItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("UploadSupplyOfferItems"))
              .build();
        }
      }
    }
    return getUploadSupplyOfferItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SupplyOffer> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.SupplyOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SupplyOffer> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.SupplyOffer> getViewByIDMethod;
    if ((getViewByIDMethod = SupplyOffersServiceGrpc.getViewByIDMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewByIDMethod = SupplyOffersServiceGrpc.getViewByIDMethod) == null) {
          SupplyOffersServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.SupplyOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffer.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SupplyOffer> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.SupplyOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SupplyOffer> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SupplyOffer> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = SupplyOffersServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewByUUIDMethod = SupplyOffersServiceGrpc.getViewByUUIDMethod) == null) {
          SupplyOffersServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SupplyOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffer.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.SupplyOffer> getViewByReferenceIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByReferenceID",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.SupplyOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.SupplyOffer> getViewByReferenceIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.SupplyOffer> getViewByReferenceIDMethod;
    if ((getViewByReferenceIDMethod = SupplyOffersServiceGrpc.getViewByReferenceIDMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewByReferenceIDMethod = SupplyOffersServiceGrpc.getViewByReferenceIDMethod) == null) {
          SupplyOffersServiceGrpc.getViewByReferenceIDMethod = getViewByReferenceIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.SupplyOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByReferenceID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffer.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewByReferenceID"))
              .build();
        }
      }
    }
    return getViewByReferenceIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SupplyOffer> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.SupplyOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.SupplyOffer> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.SupplyOffer> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = SupplyOffersServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = SupplyOffersServiceGrpc.getViewEssentialByIDMethod) == null) {
          SupplyOffersServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.SupplyOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffer.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SupplyOffer> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.SupplyOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SupplyOffer> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SupplyOffer> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = SupplyOffersServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = SupplyOffersServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          SupplyOffersServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SupplyOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffer.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.SupplyOffersList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.SupplyOffersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.SupplyOffersList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.SupplyOffersList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = SupplyOffersServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewFromIDsMethod = SupplyOffersServiceGrpc.getViewFromIDsMethod) == null) {
          SupplyOffersServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.SupplyOffersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SupplyOfferAncillaryParameters> getViewAncillaryParametersByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAncillaryParametersByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.SupplyOfferAncillaryParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SupplyOfferAncillaryParameters> getViewAncillaryParametersByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SupplyOfferAncillaryParameters> getViewAncillaryParametersByUUIDMethod;
    if ((getViewAncillaryParametersByUUIDMethod = SupplyOffersServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewAncillaryParametersByUUIDMethod = SupplyOffersServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
          SupplyOffersServiceGrpc.getViewAncillaryParametersByUUIDMethod = getViewAncillaryParametersByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SupplyOfferAncillaryParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAncillaryParametersByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferAncillaryParameters.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewAncillaryParametersByUUID"))
              .build();
        }
      }
    }
    return getViewAncillaryParametersByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.SupplyOffersList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.SupplyOffersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.SupplyOffersList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.SupplyOffersList> getViewAllMethod;
    if ((getViewAllMethod = SupplyOffersServiceGrpc.getViewAllMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewAllMethod = SupplyOffersServiceGrpc.getViewAllMethod) == null) {
          SupplyOffersServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.SupplyOffersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SupplyOffersList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.SupplyOffersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.SupplyOffersList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SupplyOffersList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = SupplyOffersServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = SupplyOffersServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          SupplyOffersServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.SupplyOffersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServicePaginationReq,
      com.scailo.sdk.SupplyOffersServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.SupplyOffersServicePaginationReq.class,
      responseType = com.scailo.sdk.SupplyOffersServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServicePaginationReq,
      com.scailo.sdk.SupplyOffersServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServicePaginationReq, com.scailo.sdk.SupplyOffersServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = SupplyOffersServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewWithPaginationMethod = SupplyOffersServiceGrpc.getViewWithPaginationMethod) == null) {
          SupplyOffersServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServicePaginationReq, com.scailo.sdk.SupplyOffersServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
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
    if ((getViewAmendmentsMethod = SupplyOffersServiceGrpc.getViewAmendmentsMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewAmendmentsMethod = SupplyOffersServiceGrpc.getViewAmendmentsMethod) == null) {
          SupplyOffersServiceGrpc.getViewAmendmentsMethod = getViewAmendmentsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.AmendmentLogsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAmendments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AmendmentLogsList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewAmendments"))
              .build();
        }
      }
    }
    return getViewAmendmentsMethod;
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
    if ((getViewProspectiveFamiliesMethod = SupplyOffersServiceGrpc.getViewProspectiveFamiliesMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewProspectiveFamiliesMethod = SupplyOffersServiceGrpc.getViewProspectiveFamiliesMethod) == null) {
          SupplyOffersServiceGrpc.getViewProspectiveFamiliesMethod = getViewProspectiveFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewProspectiveFamilies"))
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
    if ((getFilterProspectiveFamiliesMethod = SupplyOffersServiceGrpc.getFilterProspectiveFamiliesMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getFilterProspectiveFamiliesMethod = SupplyOffersServiceGrpc.getFilterProspectiveFamiliesMethod) == null) {
          SupplyOffersServiceGrpc.getFilterProspectiveFamiliesMethod = getFilterProspectiveFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterProspectiveFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterFamiliesReqForIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("FilterProspectiveFamilies"))
              .build();
        }
      }
    }
    return getFilterProspectiveFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest,
      com.scailo.sdk.SupplyOffersServiceItemCreateRequest> getViewProspectiveSupplyOfferItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectiveSupplyOfferItem",
      requestType = com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.SupplyOffersServiceItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest,
      com.scailo.sdk.SupplyOffersServiceItemCreateRequest> getViewProspectiveSupplyOfferItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest, com.scailo.sdk.SupplyOffersServiceItemCreateRequest> getViewProspectiveSupplyOfferItemMethod;
    if ((getViewProspectiveSupplyOfferItemMethod = SupplyOffersServiceGrpc.getViewProspectiveSupplyOfferItemMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getViewProspectiveSupplyOfferItemMethod = SupplyOffersServiceGrpc.getViewProspectiveSupplyOfferItemMethod) == null) {
          SupplyOffersServiceGrpc.getViewProspectiveSupplyOfferItemMethod = getViewProspectiveSupplyOfferItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest, com.scailo.sdk.SupplyOffersServiceItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveSupplyOfferItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("ViewProspectiveSupplyOfferItem"))
              .build();
        }
      }
    }
    return getViewProspectiveSupplyOfferItemMethod;
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
    if ((getIsDownloadableMethod = SupplyOffersServiceGrpc.getIsDownloadableMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getIsDownloadableMethod = SupplyOffersServiceGrpc.getIsDownloadableMethod) == null) {
          SupplyOffersServiceGrpc.getIsDownloadableMethod = getIsDownloadableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDownloadable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("IsDownloadable"))
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
    if ((getDownloadByUUIDMethod = SupplyOffersServiceGrpc.getDownloadByUUIDMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getDownloadByUUIDMethod = SupplyOffersServiceGrpc.getDownloadByUUIDMethod) == null) {
          SupplyOffersServiceGrpc.getDownloadByUUIDMethod = getDownloadByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("DownloadByUUID"))
              .build();
        }
      }
    }
    return getDownloadByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceSearchAllReq,
      com.scailo.sdk.SupplyOffersList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.SupplyOffersServiceSearchAllReq.class,
      responseType = com.scailo.sdk.SupplyOffersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceSearchAllReq,
      com.scailo.sdk.SupplyOffersList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceSearchAllReq, com.scailo.sdk.SupplyOffersList> getSearchAllMethod;
    if ((getSearchAllMethod = SupplyOffersServiceGrpc.getSearchAllMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getSearchAllMethod = SupplyOffersServiceGrpc.getSearchAllMethod) == null) {
          SupplyOffersServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceSearchAllReq, com.scailo.sdk.SupplyOffersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceFilterReq,
      com.scailo.sdk.SupplyOffersList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.SupplyOffersServiceFilterReq.class,
      responseType = com.scailo.sdk.SupplyOffersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceFilterReq,
      com.scailo.sdk.SupplyOffersList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceFilterReq, com.scailo.sdk.SupplyOffersList> getFilterMethod;
    if ((getFilterMethod = SupplyOffersServiceGrpc.getFilterMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getFilterMethod = SupplyOffersServiceGrpc.getFilterMethod) == null) {
          SupplyOffersServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceFilterReq, com.scailo.sdk.SupplyOffersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersList.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = SupplyOffersServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getCountInStatusMethod = SupplyOffersServiceGrpc.getCountInStatusMethod) == null) {
          SupplyOffersServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.SupplyOffersServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = SupplyOffersServiceGrpc.getCountMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getCountMethod = SupplyOffersServiceGrpc.getCountMethod) == null) {
          SupplyOffersServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCountReq,
      com.scailo.sdk.SumResponse> getAccruedValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccruedValue",
      requestType = com.scailo.sdk.SupplyOffersServiceCountReq.class,
      responseType = com.scailo.sdk.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCountReq,
      com.scailo.sdk.SumResponse> getAccruedValueMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceCountReq, com.scailo.sdk.SumResponse> getAccruedValueMethod;
    if ((getAccruedValueMethod = SupplyOffersServiceGrpc.getAccruedValueMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getAccruedValueMethod = SupplyOffersServiceGrpc.getAccruedValueMethod) == null) {
          SupplyOffersServiceGrpc.getAccruedValueMethod = getAccruedValueMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceCountReq, com.scailo.sdk.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccruedValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("AccruedValue"))
              .build();
        }
      }
    }
    return getAccruedValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.SupplyOffersServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SupplyOffersServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = SupplyOffersServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (SupplyOffersServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = SupplyOffersServiceGrpc.getDownloadAsCSVMethod) == null) {
          SupplyOffersServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SupplyOffersServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SupplyOffersServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new SupplyOffersServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SupplyOffersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupplyOffersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupplyOffersServiceStub>() {
        @java.lang.Override
        public SupplyOffersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupplyOffersServiceStub(channel, callOptions);
        }
      };
    return SupplyOffersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SupplyOffersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupplyOffersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupplyOffersServiceBlockingStub>() {
        @java.lang.Override
        public SupplyOffersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupplyOffersServiceBlockingStub(channel, callOptions);
        }
      };
    return SupplyOffersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SupplyOffersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupplyOffersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupplyOffersServiceFutureStub>() {
        @java.lang.Override
        public SupplyOffersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupplyOffersServiceFutureStub(channel, callOptions);
        }
      };
    return SupplyOffersServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each supply offer
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.SupplyOffersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.SupplyOffersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.SupplyOffersServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.SupplyOffersServiceUpdateRequest request,
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
     * Create a magic link
     * </pre>
     */
    default void createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMagicLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Autofill the supply offer
     * </pre>
     */
    default void autofill(com.scailo.sdk.SupplyOffersServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAutofillMethod(), responseObserver);
    }

    /**
     * <pre>
     * Amend the supply offer and send for revision
     * </pre>
     */
    default void amend(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAmendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an item to a supply offer
     * </pre>
     */
    default void addSupplyOfferItem(com.scailo.sdk.SupplyOffersServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSupplyOfferItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a supply offer
     * </pre>
     */
    default void modifySupplyOfferItem(com.scailo.sdk.SupplyOffersServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifySupplyOfferItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a supply offer
     * </pre>
     */
    default void approveSupplyOfferItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveSupplyOfferItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a supply offer
     * </pre>
     */
    default void deleteSupplyOfferItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSupplyOfferItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a supply offer
     * </pre>
     */
    default void reorderSupplyOfferItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderSupplyOfferItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Supply Offer Item by ID
     * </pre>
     */
    default void viewSupplyOfferItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSupplyOfferItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Supply Offer Item's price after factoring in the discount
     * </pre>
     */
    default void viewSupplyOfferItemPrice(com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSupplyOfferItemPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved supply offer items for given supply offer ID
     * </pre>
     */
    default void viewApprovedSupplyOfferItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedSupplyOfferItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved supply offer items for given supply offer ID
     * </pre>
     */
    default void viewUnapprovedSupplyOfferItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedSupplyOfferItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the supply offer item
     * </pre>
     */
    default void viewSupplyOfferItemHistory(com.scailo.sdk.SupplyOfferItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSupplyOfferItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved supply offer items for given supply offer ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedSupplyOfferItems(com.scailo.sdk.SupplyOfferItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedSupplyOfferItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved supply offer items for given supply offer ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedSupplyOfferItems(com.scailo.sdk.SupplyOfferItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedSupplyOfferItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through supply offer items with pagination
     * </pre>
     */
    default void searchItemsWithPagination(com.scailo.sdk.SupplyOfferItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> responseObserver) {
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
    default void uploadSupplyOfferItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadSupplyOfferItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    default void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByReferenceIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    default void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferAncillaryParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAncillaryParametersByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.SupplyOffersServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
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
     * View prospective families for the given supply offer
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
     * View prospective supply offer item info for the given family ID and supply offer ID
     * </pre>
     */
    default void viewProspectiveSupplyOfferItem(com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServiceItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectiveSupplyOfferItemMethod(), responseObserver);
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
     * Download supply offer with the given IdentifierUUID (can be used to allow public downloads)
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
    default void searchAll(com.scailo.sdk.SupplyOffersServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.SupplyOffersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
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
    default void count(com.scailo.sdk.SupplyOffersServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the sum of the total value of all the records that match the given criteria
     * </pre>
     */
    default void accruedValue(com.scailo.sdk.SupplyOffersServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccruedValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.SupplyOffersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SupplyOffersService.
   * <pre>
   *Describes the common methods applicable on each supply offer
   * </pre>
   */
  public static abstract class SupplyOffersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SupplyOffersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SupplyOffersService.
   * <pre>
   *Describes the common methods applicable on each supply offer
   * </pre>
   */
  public static final class SupplyOffersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SupplyOffersServiceStub> {
    private SupplyOffersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupplyOffersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupplyOffersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.SupplyOffersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.SupplyOffersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.SupplyOffersServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.SupplyOffersServiceUpdateRequest request,
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
     * Autofill the supply offer
     * </pre>
     */
    public void autofill(com.scailo.sdk.SupplyOffersServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Amend the supply offer and send for revision
     * </pre>
     */
    public void amend(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAmendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an item to a supply offer
     * </pre>
     */
    public void addSupplyOfferItem(com.scailo.sdk.SupplyOffersServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSupplyOfferItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a supply offer
     * </pre>
     */
    public void modifySupplyOfferItem(com.scailo.sdk.SupplyOffersServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifySupplyOfferItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a supply offer
     * </pre>
     */
    public void approveSupplyOfferItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveSupplyOfferItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a supply offer
     * </pre>
     */
    public void deleteSupplyOfferItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSupplyOfferItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a supply offer
     * </pre>
     */
    public void reorderSupplyOfferItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderSupplyOfferItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Supply Offer Item by ID
     * </pre>
     */
    public void viewSupplyOfferItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSupplyOfferItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Supply Offer Item's price after factoring in the discount
     * </pre>
     */
    public void viewSupplyOfferItemPrice(com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSupplyOfferItemPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved supply offer items for given supply offer ID
     * </pre>
     */
    public void viewApprovedSupplyOfferItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedSupplyOfferItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved supply offer items for given supply offer ID
     * </pre>
     */
    public void viewUnapprovedSupplyOfferItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedSupplyOfferItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the supply offer item
     * </pre>
     */
    public void viewSupplyOfferItemHistory(com.scailo.sdk.SupplyOfferItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSupplyOfferItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved supply offer items for given supply offer ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedSupplyOfferItems(com.scailo.sdk.SupplyOfferItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedSupplyOfferItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved supply offer items for given supply offer ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedSupplyOfferItems(com.scailo.sdk.SupplyOfferItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedSupplyOfferItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through supply offer items with pagination
     * </pre>
     */
    public void searchItemsWithPagination(com.scailo.sdk.SupplyOfferItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> responseObserver) {
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
    public void uploadSupplyOfferItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadSupplyOfferItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferAncillaryParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.SupplyOffersServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
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
     * View prospective families for the given supply offer
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
     * View prospective supply offer item info for the given family ID and supply offer ID
     * </pre>
     */
    public void viewProspectiveSupplyOfferItem(com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServiceItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectiveSupplyOfferItemMethod(), getCallOptions()), request, responseObserver);
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
     * Download supply offer with the given IdentifierUUID (can be used to allow public downloads)
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
    public void searchAll(com.scailo.sdk.SupplyOffersServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.SupplyOffersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList> responseObserver) {
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
    public void count(com.scailo.sdk.SupplyOffersServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the sum of the total value of all the records that match the given criteria
     * </pre>
     */
    public void accruedValue(com.scailo.sdk.SupplyOffersServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccruedValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public void downloadAsCSV(com.scailo.sdk.SupplyOffersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SupplyOffersService.
   * <pre>
   *Describes the common methods applicable on each supply offer
   * </pre>
   */
  public static final class SupplyOffersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SupplyOffersServiceBlockingStub> {
    private SupplyOffersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupplyOffersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupplyOffersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.SupplyOffersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.SupplyOffersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.SupplyOffersServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.SupplyOffersServiceUpdateRequest request) {
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
     * Create a magic link
     * </pre>
     */
    public com.scailo.sdk.MagicLink createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMagicLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Autofill the supply offer
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse autofill(com.scailo.sdk.SupplyOffersServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAutofillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Amend the supply offer and send for revision
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse amend(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAmendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an item to a supply offer
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addSupplyOfferItem(com.scailo.sdk.SupplyOffersServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSupplyOfferItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an item in a supply offer
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifySupplyOfferItem(com.scailo.sdk.SupplyOffersServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifySupplyOfferItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an item in a supply offer
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approveSupplyOfferItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveSupplyOfferItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an item in a supply offer
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteSupplyOfferItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSupplyOfferItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a supply offer
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderSupplyOfferItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderSupplyOfferItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Supply Offer Item by ID
     * </pre>
     */
    public com.scailo.sdk.SupplyOfferItem viewSupplyOfferItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSupplyOfferItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Supply Offer Item's price after factoring in the discount
     * </pre>
     */
    public com.scailo.sdk.PriceResponse viewSupplyOfferItemPrice(com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSupplyOfferItemPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved supply offer items for given supply offer ID
     * </pre>
     */
    public com.scailo.sdk.SupplyOfferItemsList viewApprovedSupplyOfferItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedSupplyOfferItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved supply offer items for given supply offer ID
     * </pre>
     */
    public com.scailo.sdk.SupplyOfferItemsList viewUnapprovedSupplyOfferItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedSupplyOfferItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the supply offer item
     * </pre>
     */
    public com.scailo.sdk.SupplyOfferItemsList viewSupplyOfferItemHistory(com.scailo.sdk.SupplyOfferItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSupplyOfferItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved supply offer items for given supply offer ID with pagination
     * </pre>
     */
    public com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse viewPaginatedApprovedSupplyOfferItems(com.scailo.sdk.SupplyOfferItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedSupplyOfferItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved supply offer items for given supply offer ID with pagination
     * </pre>
     */
    public com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse viewPaginatedUnapprovedSupplyOfferItems(com.scailo.sdk.SupplyOfferItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedSupplyOfferItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through supply offer items with pagination
     * </pre>
     */
    public com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse searchItemsWithPagination(com.scailo.sdk.SupplyOfferItemsSearchRequest request) {
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
    public com.scailo.sdk.IdentifiersList uploadSupplyOfferItems(com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadSupplyOfferItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.SupplyOffer viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.SupplyOffer viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.scailo.sdk.SupplyOffer viewByReferenceID(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByReferenceIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.SupplyOffer viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.SupplyOffer viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.SupplyOffersList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.scailo.sdk.SupplyOfferAncillaryParameters viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAncillaryParametersByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.SupplyOffersList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.SupplyOffersList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.SupplyOffersServicePaginationResponse viewWithPagination(com.scailo.sdk.SupplyOffersServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
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
     * View prospective families for the given supply offer
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
     * View prospective supply offer item info for the given family ID and supply offer ID
     * </pre>
     */
    public com.scailo.sdk.SupplyOffersServiceItemCreateRequest viewProspectiveSupplyOfferItem(com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectiveSupplyOfferItemMethod(), getCallOptions(), request);
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
     * Download supply offer with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.scailo.sdk.SupplyOffersList searchAll(com.scailo.sdk.SupplyOffersServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.SupplyOffersList filter(com.scailo.sdk.SupplyOffersServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.SupplyOffersServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the sum of the total value of all the records that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.SumResponse accruedValue(com.scailo.sdk.SupplyOffersServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccruedValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.SupplyOffersServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SupplyOffersService.
   * <pre>
   *Describes the common methods applicable on each supply offer
   * </pre>
   */
  public static final class SupplyOffersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SupplyOffersServiceFutureStub> {
    private SupplyOffersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupplyOffersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupplyOffersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.SupplyOffersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.SupplyOffersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.SupplyOffersServiceUpdateRequest request) {
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
        com.scailo.sdk.SupplyOffersServiceUpdateRequest request) {
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
     * Autofill the supply offer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> autofill(
        com.scailo.sdk.SupplyOffersServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Amend the supply offer and send for revision
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> amend(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAmendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an item to a supply offer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addSupplyOfferItem(
        com.scailo.sdk.SupplyOffersServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSupplyOfferItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an item in a supply offer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifySupplyOfferItem(
        com.scailo.sdk.SupplyOffersServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifySupplyOfferItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an item in a supply offer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approveSupplyOfferItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveSupplyOfferItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an item in a supply offer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteSupplyOfferItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSupplyOfferItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a supply offer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderSupplyOfferItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderSupplyOfferItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Supply Offer Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOfferItem> viewSupplyOfferItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSupplyOfferItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Supply Offer Item's price after factoring in the discount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PriceResponse> viewSupplyOfferItemPrice(
        com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSupplyOfferItemPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved supply offer items for given supply offer ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOfferItemsList> viewApprovedSupplyOfferItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedSupplyOfferItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved supply offer items for given supply offer ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOfferItemsList> viewUnapprovedSupplyOfferItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedSupplyOfferItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the supply offer item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOfferItemsList> viewSupplyOfferItemHistory(
        com.scailo.sdk.SupplyOfferItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSupplyOfferItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved supply offer items for given supply offer ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> viewPaginatedApprovedSupplyOfferItems(
        com.scailo.sdk.SupplyOfferItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedSupplyOfferItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved supply offer items for given supply offer ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> viewPaginatedUnapprovedSupplyOfferItems(
        com.scailo.sdk.SupplyOfferItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedSupplyOfferItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through supply offer items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse> searchItemsWithPagination(
        com.scailo.sdk.SupplyOfferItemsSearchRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> uploadSupplyOfferItems(
        com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadSupplyOfferItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffer> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffer> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffer> viewByReferenceID(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffer> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffer> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOfferAncillaryParameters> viewAncillaryParametersByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.SupplyOffersServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
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
     * View prospective families for the given supply offer
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
     * View prospective supply offer item info for the given family ID and supply offer ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersServiceItemCreateRequest> viewProspectiveSupplyOfferItem(
        com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectiveSupplyOfferItemMethod(), getCallOptions()), request);
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
     * Download supply offer with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersList> searchAll(
        com.scailo.sdk.SupplyOffersServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SupplyOffersList> filter(
        com.scailo.sdk.SupplyOffersServiceFilterReq request) {
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
        com.scailo.sdk.SupplyOffersServiceCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the sum of the total value of all the records that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SumResponse> accruedValue(
        com.scailo.sdk.SupplyOffersServiceCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccruedValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadAsCSV(
        com.scailo.sdk.SupplyOffersServiceFilterReq request) {
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
  private static final int METHODID_AUTOFILL = 17;
  private static final int METHODID_AMEND = 18;
  private static final int METHODID_ADD_SUPPLY_OFFER_ITEM = 19;
  private static final int METHODID_MODIFY_SUPPLY_OFFER_ITEM = 20;
  private static final int METHODID_APPROVE_SUPPLY_OFFER_ITEM = 21;
  private static final int METHODID_DELETE_SUPPLY_OFFER_ITEM = 22;
  private static final int METHODID_REORDER_SUPPLY_OFFER_ITEMS = 23;
  private static final int METHODID_VIEW_SUPPLY_OFFER_ITEM_BY_ID = 24;
  private static final int METHODID_VIEW_SUPPLY_OFFER_ITEM_PRICE = 25;
  private static final int METHODID_VIEW_APPROVED_SUPPLY_OFFER_ITEMS = 26;
  private static final int METHODID_VIEW_UNAPPROVED_SUPPLY_OFFER_ITEMS = 27;
  private static final int METHODID_VIEW_SUPPLY_OFFER_ITEM_HISTORY = 28;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_SUPPLY_OFFER_ITEMS = 29;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_SUPPLY_OFFER_ITEMS = 30;
  private static final int METHODID_SEARCH_ITEMS_WITH_PAGINATION = 31;
  private static final int METHODID_DOWNLOAD_ITEMS_AS_CSV = 32;
  private static final int METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV = 33;
  private static final int METHODID_UPLOAD_SUPPLY_OFFER_ITEMS = 34;
  private static final int METHODID_VIEW_BY_ID = 35;
  private static final int METHODID_VIEW_BY_UUID = 36;
  private static final int METHODID_VIEW_BY_REFERENCE_ID = 37;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 38;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 39;
  private static final int METHODID_VIEW_FROM_IDS = 40;
  private static final int METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID = 41;
  private static final int METHODID_VIEW_ALL = 42;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 43;
  private static final int METHODID_VIEW_WITH_PAGINATION = 44;
  private static final int METHODID_VIEW_AMENDMENTS = 45;
  private static final int METHODID_VIEW_PROSPECTIVE_FAMILIES = 46;
  private static final int METHODID_FILTER_PROSPECTIVE_FAMILIES = 47;
  private static final int METHODID_VIEW_PROSPECTIVE_SUPPLY_OFFER_ITEM = 48;
  private static final int METHODID_IS_DOWNLOADABLE = 49;
  private static final int METHODID_DOWNLOAD_BY_UUID = 50;
  private static final int METHODID_SEARCH_ALL = 51;
  private static final int METHODID_FILTER = 52;
  private static final int METHODID_COUNT_IN_STATUS = 53;
  private static final int METHODID_COUNT = 54;
  private static final int METHODID_ACCRUED_VALUE = 55;
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
          serviceImpl.create((com.scailo.sdk.SupplyOffersServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.SupplyOffersServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.SupplyOffersServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.SupplyOffersServiceUpdateRequest) request,
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
        case METHODID_CREATE_MAGIC_LINK:
          serviceImpl.createMagicLink((com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink>) responseObserver);
          break;
        case METHODID_AUTOFILL:
          serviceImpl.autofill((com.scailo.sdk.SupplyOffersServiceAutofillRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_AMEND:
          serviceImpl.amend((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_SUPPLY_OFFER_ITEM:
          serviceImpl.addSupplyOfferItem((com.scailo.sdk.SupplyOffersServiceItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_SUPPLY_OFFER_ITEM:
          serviceImpl.modifySupplyOfferItem((com.scailo.sdk.SupplyOffersServiceItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_SUPPLY_OFFER_ITEM:
          serviceImpl.approveSupplyOfferItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUPPLY_OFFER_ITEM:
          serviceImpl.deleteSupplyOfferItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_SUPPLY_OFFER_ITEMS:
          serviceImpl.reorderSupplyOfferItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_SUPPLY_OFFER_ITEM_BY_ID:
          serviceImpl.viewSupplyOfferItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItem>) responseObserver);
          break;
        case METHODID_VIEW_SUPPLY_OFFER_ITEM_PRICE:
          serviceImpl.viewSupplyOfferItemPrice((com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PriceResponse>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_SUPPLY_OFFER_ITEMS:
          serviceImpl.viewApprovedSupplyOfferItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_SUPPLY_OFFER_ITEMS:
          serviceImpl.viewUnapprovedSupplyOfferItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItemsList>) responseObserver);
          break;
        case METHODID_VIEW_SUPPLY_OFFER_ITEM_HISTORY:
          serviceImpl.viewSupplyOfferItemHistory((com.scailo.sdk.SupplyOfferItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_SUPPLY_OFFER_ITEMS:
          serviceImpl.viewPaginatedApprovedSupplyOfferItems((com.scailo.sdk.SupplyOfferItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_SUPPLY_OFFER_ITEMS:
          serviceImpl.viewPaginatedUnapprovedSupplyOfferItems((com.scailo.sdk.SupplyOfferItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ITEMS_WITH_PAGINATION:
          serviceImpl.searchItemsWithPagination((com.scailo.sdk.SupplyOfferItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_AS_CSV:
          serviceImpl.downloadItemsAsCSV((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV:
          serviceImpl.downloadItemsTemplateAsCSV((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_UPLOAD_SUPPLY_OFFER_ITEMS:
          serviceImpl.uploadSupplyOfferItems((com.scailo.sdk.IdentifierUUIDWithFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer>) responseObserver);
          break;
        case METHODID_VIEW_BY_REFERENCE_ID:
          serviceImpl.viewByReferenceID((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffer>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList>) responseObserver);
          break;
        case METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID:
          serviceImpl.viewAncillaryParametersByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOfferAncillaryParameters>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.SupplyOffersServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_AMENDMENTS:
          serviceImpl.viewAmendments((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.AmendmentLogsList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_FAMILIES:
          serviceImpl.viewProspectiveFamilies((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER_PROSPECTIVE_FAMILIES:
          serviceImpl.filterProspectiveFamilies((com.scailo.sdk.FilterFamiliesReqForIdentifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_SUPPLY_OFFER_ITEM:
          serviceImpl.viewProspectiveSupplyOfferItem((com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersServiceItemCreateRequest>) responseObserver);
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
          serviceImpl.searchAll((com.scailo.sdk.SupplyOffersServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.SupplyOffersServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SupplyOffersList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.SupplyOffersServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_ACCRUED_VALUE:
          serviceImpl.accruedValue((com.scailo.sdk.SupplyOffersServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SumResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.SupplyOffersServiceFilterReq) request,
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
              com.scailo.sdk.SupplyOffersServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOffersServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOffersServiceUpdateRequest,
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
              com.scailo.sdk.SupplyOffersServiceUpdateRequest,
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
              com.scailo.sdk.SupplyOffersServiceAutofillRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_AUTOFILL)))
        .addMethod(
          getAmendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_AMEND)))
        .addMethod(
          getAddSupplyOfferItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOffersServiceItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_SUPPLY_OFFER_ITEM)))
        .addMethod(
          getModifySupplyOfferItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOffersServiceItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_SUPPLY_OFFER_ITEM)))
        .addMethod(
          getApproveSupplyOfferItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_SUPPLY_OFFER_ITEM)))
        .addMethod(
          getDeleteSupplyOfferItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_SUPPLY_OFFER_ITEM)))
        .addMethod(
          getReorderSupplyOfferItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_SUPPLY_OFFER_ITEMS)))
        .addMethod(
          getViewSupplyOfferItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.SupplyOfferItem>(
                service, METHODID_VIEW_SUPPLY_OFFER_ITEM_BY_ID)))
        .addMethod(
          getViewSupplyOfferItemPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest,
              com.scailo.sdk.PriceResponse>(
                service, METHODID_VIEW_SUPPLY_OFFER_ITEM_PRICE)))
        .addMethod(
          getViewApprovedSupplyOfferItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SupplyOfferItemsList>(
                service, METHODID_VIEW_APPROVED_SUPPLY_OFFER_ITEMS)))
        .addMethod(
          getViewUnapprovedSupplyOfferItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.SupplyOfferItemsList>(
                service, METHODID_VIEW_UNAPPROVED_SUPPLY_OFFER_ITEMS)))
        .addMethod(
          getViewSupplyOfferItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOfferItemHistoryRequest,
              com.scailo.sdk.SupplyOfferItemsList>(
                service, METHODID_VIEW_SUPPLY_OFFER_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedSupplyOfferItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOfferItemsSearchRequest,
              com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_SUPPLY_OFFER_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedSupplyOfferItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOfferItemsSearchRequest,
              com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_SUPPLY_OFFER_ITEMS)))
        .addMethod(
          getSearchItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOfferItemsSearchRequest,
              com.scailo.sdk.SupplyOffersServicePaginatedItemsResponse>(
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
          getUploadSupplyOfferItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithFile,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_UPLOAD_SUPPLY_OFFER_ITEMS)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.SupplyOffer>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.SupplyOffer>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewByReferenceIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.SupplyOffer>(
                service, METHODID_VIEW_BY_REFERENCE_ID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.SupplyOffer>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.SupplyOffer>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.SupplyOffersList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAncillaryParametersByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.SupplyOfferAncillaryParameters>(
                service, METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.SupplyOffersList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.SupplyOffersList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOffersServicePaginationReq,
              com.scailo.sdk.SupplyOffersServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewAmendmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.AmendmentLogsList>(
                service, METHODID_VIEW_AMENDMENTS)))
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
          getViewProspectiveSupplyOfferItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOfferItemProspectiveInfoRequest,
              com.scailo.sdk.SupplyOffersServiceItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_SUPPLY_OFFER_ITEM)))
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
              com.scailo.sdk.SupplyOffersServiceSearchAllReq,
              com.scailo.sdk.SupplyOffersList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOffersServiceFilterReq,
              com.scailo.sdk.SupplyOffersList>(
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
              com.scailo.sdk.SupplyOffersServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getAccruedValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOffersServiceCountReq,
              com.scailo.sdk.SumResponse>(
                service, METHODID_ACCRUED_VALUE)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SupplyOffersServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class SupplyOffersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SupplyOffersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.SupplyOffersScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SupplyOffersService");
    }
  }

  private static final class SupplyOffersServiceFileDescriptorSupplier
      extends SupplyOffersServiceBaseDescriptorSupplier {
    SupplyOffersServiceFileDescriptorSupplier() {}
  }

  private static final class SupplyOffersServiceMethodDescriptorSupplier
      extends SupplyOffersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SupplyOffersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SupplyOffersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SupplyOffersServiceFileDescriptorSupplier())
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
              .addMethod(getAutofillMethod())
              .addMethod(getAmendMethod())
              .addMethod(getAddSupplyOfferItemMethod())
              .addMethod(getModifySupplyOfferItemMethod())
              .addMethod(getApproveSupplyOfferItemMethod())
              .addMethod(getDeleteSupplyOfferItemMethod())
              .addMethod(getReorderSupplyOfferItemsMethod())
              .addMethod(getViewSupplyOfferItemByIDMethod())
              .addMethod(getViewSupplyOfferItemPriceMethod())
              .addMethod(getViewApprovedSupplyOfferItemsMethod())
              .addMethod(getViewUnapprovedSupplyOfferItemsMethod())
              .addMethod(getViewSupplyOfferItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedSupplyOfferItemsMethod())
              .addMethod(getViewPaginatedUnapprovedSupplyOfferItemsMethod())
              .addMethod(getSearchItemsWithPaginationMethod())
              .addMethod(getDownloadItemsAsCSVMethod())
              .addMethod(getDownloadItemsTemplateAsCSVMethod())
              .addMethod(getUploadSupplyOfferItemsMethod())
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
              .addMethod(getViewAmendmentsMethod())
              .addMethod(getViewProspectiveFamiliesMethod())
              .addMethod(getFilterProspectiveFamiliesMethod())
              .addMethod(getViewProspectiveSupplyOfferItemMethod())
              .addMethod(getIsDownloadableMethod())
              .addMethod(getDownloadByUUIDMethod())
              .addMethod(getSearchAllMethod())
              .addMethod(getFilterMethod())
              .addMethod(getCountInStatusMethod())
              .addMethod(getCountMethod())
              .addMethod(getAccruedValueMethod())
              .addMethod(getDownloadAsCSVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
