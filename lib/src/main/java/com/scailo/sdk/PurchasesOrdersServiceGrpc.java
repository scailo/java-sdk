package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each purchase order
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: purchases_orders.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PurchasesOrdersServiceGrpc {

  private PurchasesOrdersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.PurchasesOrdersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.PurchasesOrdersServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = PurchasesOrdersServiceGrpc.getCreateMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getCreateMethod = PurchasesOrdersServiceGrpc.getCreateMethod) == null) {
          PurchasesOrdersServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.PurchasesOrdersServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = PurchasesOrdersServiceGrpc.getDraftMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDraftMethod = PurchasesOrdersServiceGrpc.getDraftMethod) == null) {
          PurchasesOrdersServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.PurchasesOrdersServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = PurchasesOrdersServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDraftUpdateMethod = PurchasesOrdersServiceGrpc.getDraftUpdateMethod) == null) {
          PurchasesOrdersServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = PurchasesOrdersServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getSendForVerificationMethod = PurchasesOrdersServiceGrpc.getSendForVerificationMethod) == null) {
          PurchasesOrdersServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = PurchasesOrdersServiceGrpc.getVerifyMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getVerifyMethod = PurchasesOrdersServiceGrpc.getVerifyMethod) == null) {
          PurchasesOrdersServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = PurchasesOrdersServiceGrpc.getApproveMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getApproveMethod = PurchasesOrdersServiceGrpc.getApproveMethod) == null) {
          PurchasesOrdersServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = PurchasesOrdersServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getSendForRevisionMethod = PurchasesOrdersServiceGrpc.getSendForRevisionMethod) == null) {
          PurchasesOrdersServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.PurchasesOrdersServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = PurchasesOrdersServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getRevisionUpdateMethod = PurchasesOrdersServiceGrpc.getRevisionUpdateMethod) == null) {
          PurchasesOrdersServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = PurchasesOrdersServiceGrpc.getHaltMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getHaltMethod = PurchasesOrdersServiceGrpc.getHaltMethod) == null) {
          PurchasesOrdersServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = PurchasesOrdersServiceGrpc.getDiscardMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDiscardMethod = PurchasesOrdersServiceGrpc.getDiscardMethod) == null) {
          PurchasesOrdersServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = PurchasesOrdersServiceGrpc.getRestoreMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getRestoreMethod = PurchasesOrdersServiceGrpc.getRestoreMethod) == null) {
          PurchasesOrdersServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = PurchasesOrdersServiceGrpc.getCompleteMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getCompleteMethod = PurchasesOrdersServiceGrpc.getCompleteMethod) == null) {
          PurchasesOrdersServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = PurchasesOrdersServiceGrpc.getRepeatMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getRepeatMethod = PurchasesOrdersServiceGrpc.getRepeatMethod) == null) {
          PurchasesOrdersServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.RepeatWithDeliveryDate, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.RepeatWithDeliveryDate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getReopenMethod = PurchasesOrdersServiceGrpc.getReopenMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getReopenMethod = PurchasesOrdersServiceGrpc.getReopenMethod) == null) {
          PurchasesOrdersServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getCommentAddMethod = PurchasesOrdersServiceGrpc.getCommentAddMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getCommentAddMethod = PurchasesOrdersServiceGrpc.getCommentAddMethod) == null) {
          PurchasesOrdersServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getSendEmailMethod = PurchasesOrdersServiceGrpc.getSendEmailMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getSendEmailMethod = PurchasesOrdersServiceGrpc.getSendEmailMethod) == null) {
          PurchasesOrdersServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Autofill",
      requestType = com.scailo.sdk.PurchasesOrdersServiceAutofillRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceAutofillRequest,
      com.scailo.sdk.IdentifierResponse> getAutofillMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceAutofillRequest, com.scailo.sdk.IdentifierResponse> getAutofillMethod;
    if ((getAutofillMethod = PurchasesOrdersServiceGrpc.getAutofillMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getAutofillMethod = PurchasesOrdersServiceGrpc.getAutofillMethod) == null) {
          PurchasesOrdersServiceGrpc.getAutofillMethod = getAutofillMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceAutofillRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Autofill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceAutofillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Autofill"))
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
    if ((getAmendMethod = PurchasesOrdersServiceGrpc.getAmendMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getAmendMethod = PurchasesOrdersServiceGrpc.getAmendMethod) == null) {
          PurchasesOrdersServiceGrpc.getAmendMethod = getAmendMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Amend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Amend"))
              .build();
        }
      }
    }
    return getAmendMethod;
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
    if ((getCreateMagicLinkMethod = PurchasesOrdersServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = PurchasesOrdersServiceGrpc.getCreateMagicLinkMethod) == null) {
          PurchasesOrdersServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("CreateMagicLink"))
              .build();
        }
      }
    }
    return getCreateMagicLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultiplePurchaseOrderItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMultiplePurchaseOrderItems",
      requestType = com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddMultiplePurchaseOrderItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest, com.scailo.sdk.IdentifierResponse> getAddMultiplePurchaseOrderItemsMethod;
    if ((getAddMultiplePurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getAddMultiplePurchaseOrderItemsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getAddMultiplePurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getAddMultiplePurchaseOrderItemsMethod) == null) {
          PurchasesOrdersServiceGrpc.getAddMultiplePurchaseOrderItemsMethod = getAddMultiplePurchaseOrderItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMultiplePurchaseOrderItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("AddMultiplePurchaseOrderItems"))
              .build();
        }
      }
    }
    return getAddMultiplePurchaseOrderItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddPurchaseOrderItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPurchaseOrderItem",
      requestType = com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddPurchaseOrderItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddPurchaseOrderItemMethod;
    if ((getAddPurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getAddPurchaseOrderItemMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getAddPurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getAddPurchaseOrderItemMethod) == null) {
          PurchasesOrdersServiceGrpc.getAddPurchaseOrderItemMethod = getAddPurchaseOrderItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPurchaseOrderItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("AddPurchaseOrderItem"))
              .build();
        }
      }
    }
    return getAddPurchaseOrderItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyPurchaseOrderItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyPurchaseOrderItem",
      requestType = com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyPurchaseOrderItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyPurchaseOrderItemMethod;
    if ((getModifyPurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getModifyPurchaseOrderItemMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getModifyPurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getModifyPurchaseOrderItemMethod) == null) {
          PurchasesOrdersServiceGrpc.getModifyPurchaseOrderItemMethod = getModifyPurchaseOrderItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyPurchaseOrderItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ModifyPurchaseOrderItem"))
              .build();
        }
      }
    }
    return getModifyPurchaseOrderItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getUpdatePurchaseOrderItemSpecificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePurchaseOrderItemSpecifications",
      requestType = com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getUpdatePurchaseOrderItemSpecificationsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest, com.scailo.sdk.IdentifierResponse> getUpdatePurchaseOrderItemSpecificationsMethod;
    if ((getUpdatePurchaseOrderItemSpecificationsMethod = PurchasesOrdersServiceGrpc.getUpdatePurchaseOrderItemSpecificationsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getUpdatePurchaseOrderItemSpecificationsMethod = PurchasesOrdersServiceGrpc.getUpdatePurchaseOrderItemSpecificationsMethod) == null) {
          PurchasesOrdersServiceGrpc.getUpdatePurchaseOrderItemSpecificationsMethod = getUpdatePurchaseOrderItemSpecificationsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePurchaseOrderItemSpecifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("UpdatePurchaseOrderItemSpecifications"))
              .build();
        }
      }
    }
    return getUpdatePurchaseOrderItemSpecificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApprovePurchaseOrderItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApprovePurchaseOrderItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApprovePurchaseOrderItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApprovePurchaseOrderItemMethod;
    if ((getApprovePurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getApprovePurchaseOrderItemMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getApprovePurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getApprovePurchaseOrderItemMethod) == null) {
          PurchasesOrdersServiceGrpc.getApprovePurchaseOrderItemMethod = getApprovePurchaseOrderItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApprovePurchaseOrderItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ApprovePurchaseOrderItem"))
              .build();
        }
      }
    }
    return getApprovePurchaseOrderItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeletePurchaseOrderItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePurchaseOrderItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeletePurchaseOrderItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeletePurchaseOrderItemMethod;
    if ((getDeletePurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getDeletePurchaseOrderItemMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDeletePurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getDeletePurchaseOrderItemMethod) == null) {
          PurchasesOrdersServiceGrpc.getDeletePurchaseOrderItemMethod = getDeletePurchaseOrderItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePurchaseOrderItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("DeletePurchaseOrderItem"))
              .build();
        }
      }
    }
    return getDeletePurchaseOrderItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderPurchaseOrderItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderPurchaseOrderItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderPurchaseOrderItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderPurchaseOrderItemsMethod;
    if ((getReorderPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getReorderPurchaseOrderItemsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getReorderPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getReorderPurchaseOrderItemsMethod) == null) {
          PurchasesOrdersServiceGrpc.getReorderPurchaseOrderItemsMethod = getReorderPurchaseOrderItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderPurchaseOrderItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ReorderPurchaseOrderItems"))
              .build();
        }
      }
    }
    return getReorderPurchaseOrderItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrderItem> getViewPurchaseOrderItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPurchaseOrderItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.PurchaseOrderItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrderItem> getViewPurchaseOrderItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrderItem> getViewPurchaseOrderItemByIDMethod;
    if ((getViewPurchaseOrderItemByIDMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderItemByIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPurchaseOrderItemByIDMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderItemByIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPurchaseOrderItemByIDMethod = getViewPurchaseOrderItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrderItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPurchaseOrderItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItem.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPurchaseOrderItemByID"))
              .build();
        }
      }
    }
    return getViewPurchaseOrderItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest,
      com.scailo.sdk.PriceResponse> getViewPurchaseOrderItemPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPurchaseOrderItemPrice",
      requestType = com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.PriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest,
      com.scailo.sdk.PriceResponse> getViewPurchaseOrderItemPriceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest, com.scailo.sdk.PriceResponse> getViewPurchaseOrderItemPriceMethod;
    if ((getViewPurchaseOrderItemPriceMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderItemPriceMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPurchaseOrderItemPriceMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderItemPriceMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPurchaseOrderItemPriceMethod = getViewPurchaseOrderItemPriceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest, com.scailo.sdk.PriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPurchaseOrderItemPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPurchaseOrderItemPrice"))
              .build();
        }
      }
    }
    return getViewPurchaseOrderItemPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.PurchaseOrderItemsList> getViewApprovedPurchaseOrderItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedPurchaseOrderItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.PurchaseOrderItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.PurchaseOrderItemsList> getViewApprovedPurchaseOrderItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.PurchaseOrderItemsList> getViewApprovedPurchaseOrderItemsMethod;
    if ((getViewApprovedPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getViewApprovedPurchaseOrderItemsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewApprovedPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getViewApprovedPurchaseOrderItemsMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewApprovedPurchaseOrderItemsMethod = getViewApprovedPurchaseOrderItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.PurchaseOrderItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedPurchaseOrderItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewApprovedPurchaseOrderItems"))
              .build();
        }
      }
    }
    return getViewApprovedPurchaseOrderItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.PurchaseOrderItemsList> getViewUnapprovedPurchaseOrderItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedPurchaseOrderItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.PurchaseOrderItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.PurchaseOrderItemsList> getViewUnapprovedPurchaseOrderItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.PurchaseOrderItemsList> getViewUnapprovedPurchaseOrderItemsMethod;
    if ((getViewUnapprovedPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getViewUnapprovedPurchaseOrderItemsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewUnapprovedPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getViewUnapprovedPurchaseOrderItemsMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewUnapprovedPurchaseOrderItemsMethod = getViewUnapprovedPurchaseOrderItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.PurchaseOrderItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedPurchaseOrderItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewUnapprovedPurchaseOrderItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedPurchaseOrderItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemHistoryRequest,
      com.scailo.sdk.PurchaseOrderItemsList> getViewPurchaseOrderItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPurchaseOrderItemHistory",
      requestType = com.scailo.sdk.PurchaseOrderItemHistoryRequest.class,
      responseType = com.scailo.sdk.PurchaseOrderItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemHistoryRequest,
      com.scailo.sdk.PurchaseOrderItemsList> getViewPurchaseOrderItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemHistoryRequest, com.scailo.sdk.PurchaseOrderItemsList> getViewPurchaseOrderItemHistoryMethod;
    if ((getViewPurchaseOrderItemHistoryMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderItemHistoryMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPurchaseOrderItemHistoryMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderItemHistoryMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPurchaseOrderItemHistoryMethod = getViewPurchaseOrderItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseOrderItemHistoryRequest, com.scailo.sdk.PurchaseOrderItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPurchaseOrderItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPurchaseOrderItemHistory"))
              .build();
        }
      }
    }
    return getViewPurchaseOrderItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemsSearchRequest,
      com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> getViewPaginatedApprovedPurchaseOrderItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedPurchaseOrderItems",
      requestType = com.scailo.sdk.PurchaseOrderItemsSearchRequest.class,
      responseType = com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemsSearchRequest,
      com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> getViewPaginatedApprovedPurchaseOrderItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemsSearchRequest, com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> getViewPaginatedApprovedPurchaseOrderItemsMethod;
    if ((getViewPaginatedApprovedPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getViewPaginatedApprovedPurchaseOrderItemsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPaginatedApprovedPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getViewPaginatedApprovedPurchaseOrderItemsMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPaginatedApprovedPurchaseOrderItemsMethod = getViewPaginatedApprovedPurchaseOrderItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseOrderItemsSearchRequest, com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedPurchaseOrderItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPaginatedApprovedPurchaseOrderItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedPurchaseOrderItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemsSearchRequest,
      com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> getViewPaginatedUnapprovedPurchaseOrderItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedPurchaseOrderItems",
      requestType = com.scailo.sdk.PurchaseOrderItemsSearchRequest.class,
      responseType = com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemsSearchRequest,
      com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> getViewPaginatedUnapprovedPurchaseOrderItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemsSearchRequest, com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> getViewPaginatedUnapprovedPurchaseOrderItemsMethod;
    if ((getViewPaginatedUnapprovedPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getViewPaginatedUnapprovedPurchaseOrderItemsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getViewPaginatedUnapprovedPurchaseOrderItemsMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPaginatedUnapprovedPurchaseOrderItemsMethod = getViewPaginatedUnapprovedPurchaseOrderItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseOrderItemsSearchRequest, com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedPurchaseOrderItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedPurchaseOrderItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedPurchaseOrderItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemsSearchRequest,
      com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchItemsWithPagination",
      requestType = com.scailo.sdk.PurchaseOrderItemsSearchRequest.class,
      responseType = com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemsSearchRequest,
      com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemsSearchRequest, com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;
    if ((getSearchItemsWithPaginationMethod = PurchasesOrdersServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getSearchItemsWithPaginationMethod = PurchasesOrdersServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
          PurchasesOrdersServiceGrpc.getSearchItemsWithPaginationMethod = getSearchItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseOrderItemsSearchRequest, com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("SearchItemsWithPagination"))
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
    if ((getDownloadItemsAsCSVMethod = PurchasesOrdersServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDownloadItemsAsCSVMethod = PurchasesOrdersServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
          PurchasesOrdersServiceGrpc.getDownloadItemsAsCSVMethod = getDownloadItemsAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("DownloadItemsAsCSV"))
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
    if ((getDownloadItemsTemplateAsCSVMethod = PurchasesOrdersServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDownloadItemsTemplateAsCSVMethod = PurchasesOrdersServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
          PurchasesOrdersServiceGrpc.getDownloadItemsTemplateAsCSVMethod = getDownloadItemsTemplateAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsTemplateAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("DownloadItemsTemplateAsCSV"))
              .build();
        }
      }
    }
    return getDownloadItemsTemplateAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadPurchaseOrderItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadPurchaseOrderItems",
      requestType = com.scailo.sdk.IdentifierUUIDWithFile.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadPurchaseOrderItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList> getUploadPurchaseOrderItemsMethod;
    if ((getUploadPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getUploadPurchaseOrderItemsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getUploadPurchaseOrderItemsMethod = PurchasesOrdersServiceGrpc.getUploadPurchaseOrderItemsMethod) == null) {
          PurchasesOrdersServiceGrpc.getUploadPurchaseOrderItemsMethod = getUploadPurchaseOrderItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadPurchaseOrderItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("UploadPurchaseOrderItems"))
              .build();
        }
      }
    }
    return getUploadPurchaseOrderItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddPurchaseOrderContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPurchaseOrderContact",
      requestType = com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddPurchaseOrderContactMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest, com.scailo.sdk.IdentifierResponse> getAddPurchaseOrderContactMethod;
    if ((getAddPurchaseOrderContactMethod = PurchasesOrdersServiceGrpc.getAddPurchaseOrderContactMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getAddPurchaseOrderContactMethod = PurchasesOrdersServiceGrpc.getAddPurchaseOrderContactMethod) == null) {
          PurchasesOrdersServiceGrpc.getAddPurchaseOrderContactMethod = getAddPurchaseOrderContactMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPurchaseOrderContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("AddPurchaseOrderContact"))
              .build();
        }
      }
    }
    return getAddPurchaseOrderContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApprovePurchaseOrderContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApprovePurchaseOrderContact",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApprovePurchaseOrderContactMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApprovePurchaseOrderContactMethod;
    if ((getApprovePurchaseOrderContactMethod = PurchasesOrdersServiceGrpc.getApprovePurchaseOrderContactMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getApprovePurchaseOrderContactMethod = PurchasesOrdersServiceGrpc.getApprovePurchaseOrderContactMethod) == null) {
          PurchasesOrdersServiceGrpc.getApprovePurchaseOrderContactMethod = getApprovePurchaseOrderContactMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApprovePurchaseOrderContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ApprovePurchaseOrderContact"))
              .build();
        }
      }
    }
    return getApprovePurchaseOrderContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeletePurchaseOrderContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePurchaseOrderContact",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeletePurchaseOrderContactMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeletePurchaseOrderContactMethod;
    if ((getDeletePurchaseOrderContactMethod = PurchasesOrdersServiceGrpc.getDeletePurchaseOrderContactMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDeletePurchaseOrderContactMethod = PurchasesOrdersServiceGrpc.getDeletePurchaseOrderContactMethod) == null) {
          PurchasesOrdersServiceGrpc.getDeletePurchaseOrderContactMethod = getDeletePurchaseOrderContactMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePurchaseOrderContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("DeletePurchaseOrderContact"))
              .build();
        }
      }
    }
    return getDeletePurchaseOrderContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrderContact> getViewPurchaseOrderContactByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPurchaseOrderContactByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.PurchaseOrderContact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrderContact> getViewPurchaseOrderContactByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrderContact> getViewPurchaseOrderContactByIDMethod;
    if ((getViewPurchaseOrderContactByIDMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderContactByIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPurchaseOrderContactByIDMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderContactByIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPurchaseOrderContactByIDMethod = getViewPurchaseOrderContactByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrderContact>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPurchaseOrderContactByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderContact.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPurchaseOrderContactByID"))
              .build();
        }
      }
    }
    return getViewPurchaseOrderContactByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderContactsList> getViewPurchaseOrderContactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPurchaseOrderContacts",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseOrderContactsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderContactsList> getViewPurchaseOrderContactsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderContactsList> getViewPurchaseOrderContactsMethod;
    if ((getViewPurchaseOrderContactsMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderContactsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPurchaseOrderContactsMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderContactsMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPurchaseOrderContactsMethod = getViewPurchaseOrderContactsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderContactsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPurchaseOrderContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderContactsList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPurchaseOrderContacts"))
              .build();
        }
      }
    }
    return getViewPurchaseOrderContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddPurchaseOrderReferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPurchaseOrderReference",
      requestType = com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddPurchaseOrderReferenceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest, com.scailo.sdk.IdentifierResponse> getAddPurchaseOrderReferenceMethod;
    if ((getAddPurchaseOrderReferenceMethod = PurchasesOrdersServiceGrpc.getAddPurchaseOrderReferenceMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getAddPurchaseOrderReferenceMethod = PurchasesOrdersServiceGrpc.getAddPurchaseOrderReferenceMethod) == null) {
          PurchasesOrdersServiceGrpc.getAddPurchaseOrderReferenceMethod = getAddPurchaseOrderReferenceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPurchaseOrderReference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("AddPurchaseOrderReference"))
              .build();
        }
      }
    }
    return getAddPurchaseOrderReferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApprovePurchaseOrderReferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApprovePurchaseOrderReference",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApprovePurchaseOrderReferenceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApprovePurchaseOrderReferenceMethod;
    if ((getApprovePurchaseOrderReferenceMethod = PurchasesOrdersServiceGrpc.getApprovePurchaseOrderReferenceMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getApprovePurchaseOrderReferenceMethod = PurchasesOrdersServiceGrpc.getApprovePurchaseOrderReferenceMethod) == null) {
          PurchasesOrdersServiceGrpc.getApprovePurchaseOrderReferenceMethod = getApprovePurchaseOrderReferenceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApprovePurchaseOrderReference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ApprovePurchaseOrderReference"))
              .build();
        }
      }
    }
    return getApprovePurchaseOrderReferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeletePurchaseOrderReferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePurchaseOrderReference",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeletePurchaseOrderReferenceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeletePurchaseOrderReferenceMethod;
    if ((getDeletePurchaseOrderReferenceMethod = PurchasesOrdersServiceGrpc.getDeletePurchaseOrderReferenceMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDeletePurchaseOrderReferenceMethod = PurchasesOrdersServiceGrpc.getDeletePurchaseOrderReferenceMethod) == null) {
          PurchasesOrdersServiceGrpc.getDeletePurchaseOrderReferenceMethod = getDeletePurchaseOrderReferenceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePurchaseOrderReference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("DeletePurchaseOrderReference"))
              .build();
        }
      }
    }
    return getDeletePurchaseOrderReferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrderReference> getViewPurchaseOrderReferenceByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPurchaseOrderReferenceByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.PurchaseOrderReference.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrderReference> getViewPurchaseOrderReferenceByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrderReference> getViewPurchaseOrderReferenceByIDMethod;
    if ((getViewPurchaseOrderReferenceByIDMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderReferenceByIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPurchaseOrderReferenceByIDMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderReferenceByIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPurchaseOrderReferenceByIDMethod = getViewPurchaseOrderReferenceByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrderReference>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPurchaseOrderReferenceByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderReference.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPurchaseOrderReferenceByID"))
              .build();
        }
      }
    }
    return getViewPurchaseOrderReferenceByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrderReferencesList> getViewPurchaseOrderReferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPurchaseOrderReferences",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.PurchaseOrderReferencesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrderReferencesList> getViewPurchaseOrderReferencesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrderReferencesList> getViewPurchaseOrderReferencesMethod;
    if ((getViewPurchaseOrderReferencesMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderReferencesMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPurchaseOrderReferencesMethod = PurchasesOrdersServiceGrpc.getViewPurchaseOrderReferencesMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPurchaseOrderReferencesMethod = getViewPurchaseOrderReferencesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrderReferencesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPurchaseOrderReferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderReferencesList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPurchaseOrderReferences"))
              .build();
        }
      }
    }
    return getViewPurchaseOrderReferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrder> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.PurchaseOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrder> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrder> getViewByIDMethod;
    if ((getViewByIDMethod = PurchasesOrdersServiceGrpc.getViewByIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewByIDMethod = PurchasesOrdersServiceGrpc.getViewByIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrder.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrder> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrder> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrder> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = PurchasesOrdersServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewByUUIDMethod = PurchasesOrdersServiceGrpc.getViewByUUIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrder.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.PurchaseOrder> getViewByReferenceIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByReferenceID",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.PurchaseOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.PurchaseOrder> getViewByReferenceIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.PurchaseOrder> getViewByReferenceIDMethod;
    if ((getViewByReferenceIDMethod = PurchasesOrdersServiceGrpc.getViewByReferenceIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewByReferenceIDMethod = PurchasesOrdersServiceGrpc.getViewByReferenceIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewByReferenceIDMethod = getViewByReferenceIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.PurchaseOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByReferenceID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrder.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewByReferenceID"))
              .build();
        }
      }
    }
    return getViewByReferenceIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrder> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.PurchaseOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseOrder> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrder> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = PurchasesOrdersServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = PurchasesOrdersServiceGrpc.getViewEssentialByIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrder.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrder> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrder> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrder> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = PurchasesOrdersServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = PurchasesOrdersServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrder.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.PurchasesOrdersList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.PurchasesOrdersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.PurchasesOrdersList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.PurchasesOrdersList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = PurchasesOrdersServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewFromIDsMethod = PurchasesOrdersServiceGrpc.getViewFromIDsMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.PurchasesOrdersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderAncillaryParameters> getViewAncillaryParametersByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAncillaryParametersByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseOrderAncillaryParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderAncillaryParameters> getViewAncillaryParametersByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderAncillaryParameters> getViewAncillaryParametersByUUIDMethod;
    if ((getViewAncillaryParametersByUUIDMethod = PurchasesOrdersServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewAncillaryParametersByUUIDMethod = PurchasesOrdersServiceGrpc.getViewAncillaryParametersByUUIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewAncillaryParametersByUUIDMethod = getViewAncillaryParametersByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderAncillaryParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAncillaryParametersByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderAncillaryParameters.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewAncillaryParametersByUUID"))
              .build();
        }
      }
    }
    return getViewAncillaryParametersByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.PurchasesOrdersList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.PurchasesOrdersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.PurchasesOrdersList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.PurchasesOrdersList> getViewAllMethod;
    if ((getViewAllMethod = PurchasesOrdersServiceGrpc.getViewAllMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewAllMethod = PurchasesOrdersServiceGrpc.getViewAllMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.PurchasesOrdersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchasesOrdersList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchasesOrdersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchasesOrdersList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchasesOrdersList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = PurchasesOrdersServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = PurchasesOrdersServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchasesOrdersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServicePaginationReq,
      com.scailo.sdk.PurchasesOrdersServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.PurchasesOrdersServicePaginationReq.class,
      responseType = com.scailo.sdk.PurchasesOrdersServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServicePaginationReq,
      com.scailo.sdk.PurchasesOrdersServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServicePaginationReq, com.scailo.sdk.PurchasesOrdersServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = PurchasesOrdersServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewWithPaginationMethod = PurchasesOrdersServiceGrpc.getViewWithPaginationMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServicePaginationReq, com.scailo.sdk.PurchasesOrdersServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewWithPagination"))
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
    if ((getViewAmendmentsMethod = PurchasesOrdersServiceGrpc.getViewAmendmentsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewAmendmentsMethod = PurchasesOrdersServiceGrpc.getViewAmendmentsMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewAmendmentsMethod = getViewAmendmentsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.AmendmentLogsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAmendments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AmendmentLogsList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewAmendments"))
              .build();
        }
      }
    }
    return getViewAmendmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderInventoryStatistics> getViewInventoryStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInventoryStatistics",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseOrderInventoryStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderInventoryStatistics> getViewInventoryStatisticsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderInventoryStatistics> getViewInventoryStatisticsMethod;
    if ((getViewInventoryStatisticsMethod = PurchasesOrdersServiceGrpc.getViewInventoryStatisticsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewInventoryStatisticsMethod = PurchasesOrdersServiceGrpc.getViewInventoryStatisticsMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewInventoryStatisticsMethod = getViewInventoryStatisticsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderInventoryStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInventoryStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderInventoryStatistics.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewInventoryStatistics"))
              .build();
        }
      }
    }
    return getViewInventoryStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderBillingStatistics> getViewBillingStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewBillingStatistics",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseOrderBillingStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderBillingStatistics> getViewBillingStatisticsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderBillingStatistics> getViewBillingStatisticsMethod;
    if ((getViewBillingStatisticsMethod = PurchasesOrdersServiceGrpc.getViewBillingStatisticsMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewBillingStatisticsMethod = PurchasesOrdersServiceGrpc.getViewBillingStatisticsMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewBillingStatisticsMethod = getViewBillingStatisticsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderBillingStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewBillingStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderBillingStatistics.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewBillingStatistics"))
              .build();
        }
      }
    }
    return getViewBillingStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderInventoryMatchList> getViewInventoryMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInventoryMatch",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseOrderInventoryMatchList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderInventoryMatchList> getViewInventoryMatchMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderInventoryMatchList> getViewInventoryMatchMethod;
    if ((getViewInventoryMatchMethod = PurchasesOrdersServiceGrpc.getViewInventoryMatchMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewInventoryMatchMethod = PurchasesOrdersServiceGrpc.getViewInventoryMatchMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewInventoryMatchMethod = getViewInventoryMatchMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderInventoryMatchList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInventoryMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderInventoryMatchList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewInventoryMatch"))
              .build();
        }
      }
    }
    return getViewInventoryMatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderPriceMatchList> getViewPriceMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPriceMatch",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseOrderPriceMatchList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseOrderPriceMatchList> getViewPriceMatchMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderPriceMatchList> getViewPriceMatchMethod;
    if ((getViewPriceMatchMethod = PurchasesOrdersServiceGrpc.getViewPriceMatchMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewPriceMatchMethod = PurchasesOrdersServiceGrpc.getViewPriceMatchMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewPriceMatchMethod = getViewPriceMatchMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseOrderPriceMatchList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPriceMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderPriceMatchList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewPriceMatch"))
              .build();
        }
      }
    }
    return getViewPriceMatchMethod;
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
    if ((getViewProspectiveFamiliesMethod = PurchasesOrdersServiceGrpc.getViewProspectiveFamiliesMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewProspectiveFamiliesMethod = PurchasesOrdersServiceGrpc.getViewProspectiveFamiliesMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewProspectiveFamiliesMethod = getViewProspectiveFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectiveFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewProspectiveFamilies"))
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
    if ((getFilterProspectiveFamiliesMethod = PurchasesOrdersServiceGrpc.getFilterProspectiveFamiliesMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getFilterProspectiveFamiliesMethod = PurchasesOrdersServiceGrpc.getFilterProspectiveFamiliesMethod) == null) {
          PurchasesOrdersServiceGrpc.getFilterProspectiveFamiliesMethod = getFilterProspectiveFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterProspectiveFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterFamiliesReqForIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("FilterProspectiveFamilies"))
              .build();
        }
      }
    }
    return getFilterProspectiveFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest,
      com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest> getViewProspectivePurchaseOrderItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProspectivePurchaseOrderItem",
      requestType = com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest.class,
      responseType = com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest,
      com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest> getViewProspectivePurchaseOrderItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest, com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest> getViewProspectivePurchaseOrderItemMethod;
    if ((getViewProspectivePurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getViewProspectivePurchaseOrderItemMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getViewProspectivePurchaseOrderItemMethod = PurchasesOrdersServiceGrpc.getViewProspectivePurchaseOrderItemMethod) == null) {
          PurchasesOrdersServiceGrpc.getViewProspectivePurchaseOrderItemMethod = getViewProspectivePurchaseOrderItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest, com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProspectivePurchaseOrderItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("ViewProspectivePurchaseOrderItem"))
              .build();
        }
      }
    }
    return getViewProspectivePurchaseOrderItemMethod;
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
    if ((getIsDownloadableMethod = PurchasesOrdersServiceGrpc.getIsDownloadableMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getIsDownloadableMethod = PurchasesOrdersServiceGrpc.getIsDownloadableMethod) == null) {
          PurchasesOrdersServiceGrpc.getIsDownloadableMethod = getIsDownloadableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDownloadable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("IsDownloadable"))
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
    if ((getDownloadByUUIDMethod = PurchasesOrdersServiceGrpc.getDownloadByUUIDMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDownloadByUUIDMethod = PurchasesOrdersServiceGrpc.getDownloadByUUIDMethod) == null) {
          PurchasesOrdersServiceGrpc.getDownloadByUUIDMethod = getDownloadByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("DownloadByUUID"))
              .build();
        }
      }
    }
    return getDownloadByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceSearchAllReq,
      com.scailo.sdk.PurchasesOrdersList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.PurchasesOrdersServiceSearchAllReq.class,
      responseType = com.scailo.sdk.PurchasesOrdersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceSearchAllReq,
      com.scailo.sdk.PurchasesOrdersList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceSearchAllReq, com.scailo.sdk.PurchasesOrdersList> getSearchAllMethod;
    if ((getSearchAllMethod = PurchasesOrdersServiceGrpc.getSearchAllMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getSearchAllMethod = PurchasesOrdersServiceGrpc.getSearchAllMethod) == null) {
          PurchasesOrdersServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceSearchAllReq, com.scailo.sdk.PurchasesOrdersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceFilterReq,
      com.scailo.sdk.PurchasesOrdersList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.PurchasesOrdersServiceFilterReq.class,
      responseType = com.scailo.sdk.PurchasesOrdersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceFilterReq,
      com.scailo.sdk.PurchasesOrdersList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceFilterReq, com.scailo.sdk.PurchasesOrdersList> getFilterMethod;
    if ((getFilterMethod = PurchasesOrdersServiceGrpc.getFilterMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getFilterMethod = PurchasesOrdersServiceGrpc.getFilterMethod) == null) {
          PurchasesOrdersServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceFilterReq, com.scailo.sdk.PurchasesOrdersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = PurchasesOrdersServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getCountInStatusMethod = PurchasesOrdersServiceGrpc.getCountInStatusMethod) == null) {
          PurchasesOrdersServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.PurchasesOrdersServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = PurchasesOrdersServiceGrpc.getCountMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getCountMethod = PurchasesOrdersServiceGrpc.getCountMethod) == null) {
          PurchasesOrdersServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCountReq,
      com.scailo.sdk.SumResponse> getAccruedValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccruedValue",
      requestType = com.scailo.sdk.PurchasesOrdersServiceCountReq.class,
      responseType = com.scailo.sdk.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCountReq,
      com.scailo.sdk.SumResponse> getAccruedValueMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceCountReq, com.scailo.sdk.SumResponse> getAccruedValueMethod;
    if ((getAccruedValueMethod = PurchasesOrdersServiceGrpc.getAccruedValueMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getAccruedValueMethod = PurchasesOrdersServiceGrpc.getAccruedValueMethod) == null) {
          PurchasesOrdersServiceGrpc.getAccruedValueMethod = getAccruedValueMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceCountReq, com.scailo.sdk.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccruedValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("AccruedValue"))
              .build();
        }
      }
    }
    return getAccruedValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.PurchasesOrdersServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesOrdersServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = PurchasesOrdersServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (PurchasesOrdersServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = PurchasesOrdersServiceGrpc.getDownloadAsCSVMethod) == null) {
          PurchasesOrdersServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesOrdersServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesOrdersServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesOrdersServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PurchasesOrdersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PurchasesOrdersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PurchasesOrdersServiceStub>() {
        @java.lang.Override
        public PurchasesOrdersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PurchasesOrdersServiceStub(channel, callOptions);
        }
      };
    return PurchasesOrdersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PurchasesOrdersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PurchasesOrdersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PurchasesOrdersServiceBlockingStub>() {
        @java.lang.Override
        public PurchasesOrdersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PurchasesOrdersServiceBlockingStub(channel, callOptions);
        }
      };
    return PurchasesOrdersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PurchasesOrdersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PurchasesOrdersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PurchasesOrdersServiceFutureStub>() {
        @java.lang.Override
        public PurchasesOrdersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PurchasesOrdersServiceFutureStub(channel, callOptions);
        }
      };
    return PurchasesOrdersServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each purchase order
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.PurchasesOrdersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.PurchasesOrdersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.PurchasesOrdersServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.PurchasesOrdersServiceUpdateRequest request,
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
     * Autofill the purchase order
     * </pre>
     */
    default void autofill(com.scailo.sdk.PurchasesOrdersServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAutofillMethod(), responseObserver);
    }

    /**
     * <pre>
     * Amend the purchase order and send for revision
     * </pre>
     */
    default void amend(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAmendMethod(), responseObserver);
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
     * Add multiple items to a purchase order
     * </pre>
     */
    default void addMultiplePurchaseOrderItems(com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMultiplePurchaseOrderItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an item to a purchase order
     * </pre>
     */
    default void addPurchaseOrderItem(com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPurchaseOrderItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a purchase order
     * </pre>
     */
    default void modifyPurchaseOrderItem(com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyPurchaseOrderItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update specifications of an item in a purchase order
     * </pre>
     */
    default void updatePurchaseOrderItemSpecifications(com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePurchaseOrderItemSpecificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a purchase order
     * </pre>
     */
    default void approvePurchaseOrderItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApprovePurchaseOrderItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a purchase order
     * </pre>
     */
    default void deletePurchaseOrderItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePurchaseOrderItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a purchase order
     * </pre>
     */
    default void reorderPurchaseOrderItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderPurchaseOrderItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Purchase Order Item by ID
     * </pre>
     */
    default void viewPurchaseOrderItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPurchaseOrderItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Purchase Order Item's price after factoring in the discount
     * </pre>
     */
    default void viewPurchaseOrderItemPrice(com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPurchaseOrderItemPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved purchase order items for given purchase order ID
     * </pre>
     */
    default void viewApprovedPurchaseOrderItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedPurchaseOrderItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved purchase order items for given purchase order ID
     * </pre>
     */
    default void viewUnapprovedPurchaseOrderItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedPurchaseOrderItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the purchase order item
     * </pre>
     */
    default void viewPurchaseOrderItemHistory(com.scailo.sdk.PurchaseOrderItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPurchaseOrderItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved purchase order items for given purchase order ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedPurchaseOrderItems(com.scailo.sdk.PurchaseOrderItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedPurchaseOrderItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved purchase order items for given purchase order ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedPurchaseOrderItems(com.scailo.sdk.PurchaseOrderItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedPurchaseOrderItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through purchase order items with pagination
     * </pre>
     */
    default void searchItemsWithPagination(com.scailo.sdk.PurchaseOrderItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> responseObserver) {
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
    default void uploadPurchaseOrderItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadPurchaseOrderItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    default void addPurchaseOrderContact(com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPurchaseOrderContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    default void approvePurchaseOrderContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApprovePurchaseOrderContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    default void deletePurchaseOrderContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePurchaseOrderContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    default void viewPurchaseOrderContactByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderContact> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPurchaseOrderContactByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all contacts for given purchase order UUID
     * </pre>
     */
    default void viewPurchaseOrderContacts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderContactsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPurchaseOrderContactsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a reference
     * </pre>
     */
    default void addPurchaseOrderReference(com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPurchaseOrderReferenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve a reference
     * </pre>
     */
    default void approvePurchaseOrderReference(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApprovePurchaseOrderReferenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a reference
     * </pre>
     */
    default void deletePurchaseOrderReference(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePurchaseOrderReferenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * View a reference for the given ID
     * </pre>
     */
    default void viewPurchaseOrderReferenceByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderReference> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPurchaseOrderReferenceByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all references for given purchase order ID
     * </pre>
     */
    default void viewPurchaseOrderReferences(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderReferencesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPurchaseOrderReferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    default void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByReferenceIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    default void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderAncillaryParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAncillaryParametersByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.PurchasesOrdersServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginationResponse> responseObserver) {
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
     * View Inventory Statistics of Purchase Order
     * </pre>
     */
    default void viewInventoryStatistics(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderInventoryStatistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInventoryStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Billing Statistics of Purchase Order
     * </pre>
     */
    default void viewBillingStatistics(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderBillingStatistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewBillingStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Inventory Match of all the families within a Purchase Order
     * </pre>
     */
    default void viewInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderInventoryMatchList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInventoryMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * View Price Match of all the families within a Purchase Order (between the purchase order, and the corresponding vendor invoices, and any corresponding debit notes)
     * </pre>
     */
    default void viewPriceMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderPriceMatchList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPriceMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * View prospective families for the given purchase order
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
     * View prospective purchase order item info for the given family ID and purchase order ID
     * </pre>
     */
    default void viewProspectivePurchaseOrderItem(com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProspectivePurchaseOrderItemMethod(), responseObserver);
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
     * Download purchase order with the given IdentifierUUID (can be used to allow public downloads)
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
    default void searchAll(com.scailo.sdk.PurchasesOrdersServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.PurchasesOrdersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
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
    default void count(com.scailo.sdk.PurchasesOrdersServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the sum of the total value of all the records that match the given criteria
     * </pre>
     */
    default void accruedValue(com.scailo.sdk.PurchasesOrdersServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccruedValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.PurchasesOrdersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PurchasesOrdersService.
   * <pre>
   *Describes the common methods applicable on each purchase order
   * </pre>
   */
  public static abstract class PurchasesOrdersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PurchasesOrdersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PurchasesOrdersService.
   * <pre>
   *Describes the common methods applicable on each purchase order
   * </pre>
   */
  public static final class PurchasesOrdersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PurchasesOrdersServiceStub> {
    private PurchasesOrdersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchasesOrdersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PurchasesOrdersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.PurchasesOrdersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.PurchasesOrdersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.PurchasesOrdersServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.PurchasesOrdersServiceUpdateRequest request,
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
     * Autofill the purchase order
     * </pre>
     */
    public void autofill(com.scailo.sdk.PurchasesOrdersServiceAutofillRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Amend the purchase order and send for revision
     * </pre>
     */
    public void amend(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAmendMethod(), getCallOptions()), request, responseObserver);
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
     * Add multiple items to a purchase order
     * </pre>
     */
    public void addMultiplePurchaseOrderItems(com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMultiplePurchaseOrderItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an item to a purchase order
     * </pre>
     */
    public void addPurchaseOrderItem(com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPurchaseOrderItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a purchase order
     * </pre>
     */
    public void modifyPurchaseOrderItem(com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyPurchaseOrderItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update specifications of an item in a purchase order
     * </pre>
     */
    public void updatePurchaseOrderItemSpecifications(com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePurchaseOrderItemSpecificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a purchase order
     * </pre>
     */
    public void approvePurchaseOrderItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApprovePurchaseOrderItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a purchase order
     * </pre>
     */
    public void deletePurchaseOrderItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePurchaseOrderItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a purchase order
     * </pre>
     */
    public void reorderPurchaseOrderItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderPurchaseOrderItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Purchase Order Item by ID
     * </pre>
     */
    public void viewPurchaseOrderItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPurchaseOrderItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Purchase Order Item's price after factoring in the discount
     * </pre>
     */
    public void viewPurchaseOrderItemPrice(com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPurchaseOrderItemPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved purchase order items for given purchase order ID
     * </pre>
     */
    public void viewApprovedPurchaseOrderItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedPurchaseOrderItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved purchase order items for given purchase order ID
     * </pre>
     */
    public void viewUnapprovedPurchaseOrderItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedPurchaseOrderItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the purchase order item
     * </pre>
     */
    public void viewPurchaseOrderItemHistory(com.scailo.sdk.PurchaseOrderItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPurchaseOrderItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved purchase order items for given purchase order ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedPurchaseOrderItems(com.scailo.sdk.PurchaseOrderItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedPurchaseOrderItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved purchase order items for given purchase order ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedPurchaseOrderItems(com.scailo.sdk.PurchaseOrderItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedPurchaseOrderItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through purchase order items with pagination
     * </pre>
     */
    public void searchItemsWithPagination(com.scailo.sdk.PurchaseOrderItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> responseObserver) {
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
    public void uploadPurchaseOrderItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadPurchaseOrderItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    public void addPurchaseOrderContact(com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPurchaseOrderContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    public void approvePurchaseOrderContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApprovePurchaseOrderContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    public void deletePurchaseOrderContact(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePurchaseOrderContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    public void viewPurchaseOrderContactByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderContact> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPurchaseOrderContactByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all contacts for given purchase order UUID
     * </pre>
     */
    public void viewPurchaseOrderContacts(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderContactsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPurchaseOrderContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a reference
     * </pre>
     */
    public void addPurchaseOrderReference(com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPurchaseOrderReferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve a reference
     * </pre>
     */
    public void approvePurchaseOrderReference(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApprovePurchaseOrderReferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a reference
     * </pre>
     */
    public void deletePurchaseOrderReference(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePurchaseOrderReferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View a reference for the given ID
     * </pre>
     */
    public void viewPurchaseOrderReferenceByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderReference> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPurchaseOrderReferenceByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all references for given purchase order ID
     * </pre>
     */
    public void viewPurchaseOrderReferences(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderReferencesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPurchaseOrderReferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public void viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderAncillaryParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.PurchasesOrdersServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginationResponse> responseObserver) {
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
     * View Inventory Statistics of Purchase Order
     * </pre>
     */
    public void viewInventoryStatistics(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderInventoryStatistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInventoryStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Billing Statistics of Purchase Order
     * </pre>
     */
    public void viewBillingStatistics(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderBillingStatistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewBillingStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Inventory Match of all the families within a Purchase Order
     * </pre>
     */
    public void viewInventoryMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderInventoryMatchList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInventoryMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View Price Match of all the families within a Purchase Order (between the purchase order, and the corresponding vendor invoices, and any corresponding debit notes)
     * </pre>
     */
    public void viewPriceMatch(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderPriceMatchList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPriceMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View prospective families for the given purchase order
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
     * View prospective purchase order item info for the given family ID and purchase order ID
     * </pre>
     */
    public void viewProspectivePurchaseOrderItem(com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProspectivePurchaseOrderItemMethod(), getCallOptions()), request, responseObserver);
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
     * Download purchase order with the given IdentifierUUID (can be used to allow public downloads)
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
    public void searchAll(com.scailo.sdk.PurchasesOrdersServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.PurchasesOrdersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList> responseObserver) {
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
    public void count(com.scailo.sdk.PurchasesOrdersServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the sum of the total value of all the records that match the given criteria
     * </pre>
     */
    public void accruedValue(com.scailo.sdk.PurchasesOrdersServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.PurchasesOrdersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PurchasesOrdersService.
   * <pre>
   *Describes the common methods applicable on each purchase order
   * </pre>
   */
  public static final class PurchasesOrdersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PurchasesOrdersServiceBlockingStub> {
    private PurchasesOrdersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchasesOrdersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PurchasesOrdersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.PurchasesOrdersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.PurchasesOrdersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.PurchasesOrdersServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.PurchasesOrdersServiceUpdateRequest request) {
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
     * Autofill the purchase order
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse autofill(com.scailo.sdk.PurchasesOrdersServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAutofillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Amend the purchase order and send for revision
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse amend(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAmendMethod(), getCallOptions(), request);
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
     * Add multiple items to a purchase order
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addMultiplePurchaseOrderItems(com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMultiplePurchaseOrderItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an item to a purchase order
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addPurchaseOrderItem(com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPurchaseOrderItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an item in a purchase order
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyPurchaseOrderItem(com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyPurchaseOrderItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update specifications of an item in a purchase order
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse updatePurchaseOrderItemSpecifications(com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePurchaseOrderItemSpecificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an item in a purchase order
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approvePurchaseOrderItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApprovePurchaseOrderItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an item in a purchase order
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deletePurchaseOrderItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePurchaseOrderItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a purchase order
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderPurchaseOrderItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderPurchaseOrderItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Purchase Order Item by ID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderItem viewPurchaseOrderItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPurchaseOrderItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Purchase Order Item's price after factoring in the discount
     * </pre>
     */
    public com.scailo.sdk.PriceResponse viewPurchaseOrderItemPrice(com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPurchaseOrderItemPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved purchase order items for given purchase order ID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderItemsList viewApprovedPurchaseOrderItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedPurchaseOrderItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved purchase order items for given purchase order ID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderItemsList viewUnapprovedPurchaseOrderItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedPurchaseOrderItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the purchase order item
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderItemsList viewPurchaseOrderItemHistory(com.scailo.sdk.PurchaseOrderItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPurchaseOrderItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved purchase order items for given purchase order ID with pagination
     * </pre>
     */
    public com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse viewPaginatedApprovedPurchaseOrderItems(com.scailo.sdk.PurchaseOrderItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedPurchaseOrderItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved purchase order items for given purchase order ID with pagination
     * </pre>
     */
    public com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse viewPaginatedUnapprovedPurchaseOrderItems(com.scailo.sdk.PurchaseOrderItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedPurchaseOrderItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through purchase order items with pagination
     * </pre>
     */
    public com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse searchItemsWithPagination(com.scailo.sdk.PurchaseOrderItemsSearchRequest request) {
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
    public com.scailo.sdk.IdentifiersList uploadPurchaseOrderItems(com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadPurchaseOrderItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addPurchaseOrderContact(com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPurchaseOrderContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approvePurchaseOrderContact(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApprovePurchaseOrderContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deletePurchaseOrderContact(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePurchaseOrderContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderContact viewPurchaseOrderContactByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPurchaseOrderContactByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all contacts for given purchase order UUID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderContactsList viewPurchaseOrderContacts(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPurchaseOrderContactsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a reference
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addPurchaseOrderReference(com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPurchaseOrderReferenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve a reference
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approvePurchaseOrderReference(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApprovePurchaseOrderReferenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a reference
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deletePurchaseOrderReference(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePurchaseOrderReferenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View a reference for the given ID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderReference viewPurchaseOrderReferenceByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPurchaseOrderReferenceByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all references for given purchase order ID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderReferencesList viewPurchaseOrderReferences(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPurchaseOrderReferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrder viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrder viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrder viewByReferenceID(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByReferenceIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrder viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrder viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.PurchasesOrdersList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderAncillaryParameters viewAncillaryParametersByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAncillaryParametersByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.PurchasesOrdersList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.PurchasesOrdersList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.PurchasesOrdersServicePaginationResponse viewWithPagination(com.scailo.sdk.PurchasesOrdersServicePaginationReq request) {
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
     * View Inventory Statistics of Purchase Order
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderInventoryStatistics viewInventoryStatistics(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInventoryStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Billing Statistics of Purchase Order
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderBillingStatistics viewBillingStatistics(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewBillingStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Inventory Match of all the families within a Purchase Order
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderInventoryMatchList viewInventoryMatch(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInventoryMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View Price Match of all the families within a Purchase Order (between the purchase order, and the corresponding vendor invoices, and any corresponding debit notes)
     * </pre>
     */
    public com.scailo.sdk.PurchaseOrderPriceMatchList viewPriceMatch(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPriceMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View prospective families for the given purchase order
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
     * View prospective purchase order item info for the given family ID and purchase order ID
     * </pre>
     */
    public com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest viewProspectivePurchaseOrderItem(com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProspectivePurchaseOrderItemMethod(), getCallOptions(), request);
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
     * Download purchase order with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.scailo.sdk.PurchasesOrdersList searchAll(com.scailo.sdk.PurchasesOrdersServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.PurchasesOrdersList filter(com.scailo.sdk.PurchasesOrdersServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.PurchasesOrdersServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the sum of the total value of all the records that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.SumResponse accruedValue(com.scailo.sdk.PurchasesOrdersServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccruedValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.PurchasesOrdersServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PurchasesOrdersService.
   * <pre>
   *Describes the common methods applicable on each purchase order
   * </pre>
   */
  public static final class PurchasesOrdersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PurchasesOrdersServiceFutureStub> {
    private PurchasesOrdersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchasesOrdersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PurchasesOrdersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.PurchasesOrdersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.PurchasesOrdersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.PurchasesOrdersServiceUpdateRequest request) {
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
        com.scailo.sdk.PurchasesOrdersServiceUpdateRequest request) {
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
     * Autofill the purchase order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> autofill(
        com.scailo.sdk.PurchasesOrdersServiceAutofillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAutofillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Amend the purchase order and send for revision
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> amend(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAmendMethod(), getCallOptions()), request);
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
     * Add multiple items to a purchase order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addMultiplePurchaseOrderItems(
        com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMultiplePurchaseOrderItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an item to a purchase order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addPurchaseOrderItem(
        com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPurchaseOrderItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an item in a purchase order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyPurchaseOrderItem(
        com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyPurchaseOrderItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update specifications of an item in a purchase order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> updatePurchaseOrderItemSpecifications(
        com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePurchaseOrderItemSpecificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an item in a purchase order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approvePurchaseOrderItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApprovePurchaseOrderItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an item in a purchase order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deletePurchaseOrderItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePurchaseOrderItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a purchase order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderPurchaseOrderItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderPurchaseOrderItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Purchase Order Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderItem> viewPurchaseOrderItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPurchaseOrderItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Purchase Order Item's price after factoring in the discount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PriceResponse> viewPurchaseOrderItemPrice(
        com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPurchaseOrderItemPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved purchase order items for given purchase order ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderItemsList> viewApprovedPurchaseOrderItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedPurchaseOrderItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved purchase order items for given purchase order ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderItemsList> viewUnapprovedPurchaseOrderItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedPurchaseOrderItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the purchase order item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderItemsList> viewPurchaseOrderItemHistory(
        com.scailo.sdk.PurchaseOrderItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPurchaseOrderItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved purchase order items for given purchase order ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> viewPaginatedApprovedPurchaseOrderItems(
        com.scailo.sdk.PurchaseOrderItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedPurchaseOrderItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved purchase order items for given purchase order ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> viewPaginatedUnapprovedPurchaseOrderItems(
        com.scailo.sdk.PurchaseOrderItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedPurchaseOrderItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through purchase order items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse> searchItemsWithPagination(
        com.scailo.sdk.PurchaseOrderItemsSearchRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> uploadPurchaseOrderItems(
        com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadPurchaseOrderItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addPurchaseOrderContact(
        com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPurchaseOrderContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approvePurchaseOrderContact(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApprovePurchaseOrderContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deletePurchaseOrderContact(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePurchaseOrderContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a contact for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderContact> viewPurchaseOrderContactByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPurchaseOrderContactByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all contacts for given purchase order UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderContactsList> viewPurchaseOrderContacts(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPurchaseOrderContactsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a reference
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addPurchaseOrderReference(
        com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPurchaseOrderReferenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve a reference
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approvePurchaseOrderReference(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApprovePurchaseOrderReferenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a reference
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deletePurchaseOrderReference(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePurchaseOrderReferenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View a reference for the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderReference> viewPurchaseOrderReferenceByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPurchaseOrderReferenceByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all references for given purchase order ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderReferencesList> viewPurchaseOrderReferences(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPurchaseOrderReferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrder> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrder> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrder> viewByReferenceID(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrder> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrder> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the ancillary parameters (UUIDs of the internal references) by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderAncillaryParameters> viewAncillaryParametersByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAncillaryParametersByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.PurchasesOrdersServicePaginationReq request) {
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
     * View Inventory Statistics of Purchase Order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderInventoryStatistics> viewInventoryStatistics(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInventoryStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Billing Statistics of Purchase Order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderBillingStatistics> viewBillingStatistics(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewBillingStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Inventory Match of all the families within a Purchase Order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderInventoryMatchList> viewInventoryMatch(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInventoryMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View Price Match of all the families within a Purchase Order (between the purchase order, and the corresponding vendor invoices, and any corresponding debit notes)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseOrderPriceMatchList> viewPriceMatch(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPriceMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View prospective families for the given purchase order
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
     * View prospective purchase order item info for the given family ID and purchase order ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest> viewProspectivePurchaseOrderItem(
        com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProspectivePurchaseOrderItemMethod(), getCallOptions()), request);
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
     * Download purchase order with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersList> searchAll(
        com.scailo.sdk.PurchasesOrdersServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesOrdersList> filter(
        com.scailo.sdk.PurchasesOrdersServiceFilterReq request) {
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
        com.scailo.sdk.PurchasesOrdersServiceCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the sum of the total value of all the records that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.SumResponse> accruedValue(
        com.scailo.sdk.PurchasesOrdersServiceCountReq request) {
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
        com.scailo.sdk.PurchasesOrdersServiceFilterReq request) {
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
  private static final int METHODID_AMEND = 17;
  private static final int METHODID_CREATE_MAGIC_LINK = 18;
  private static final int METHODID_ADD_MULTIPLE_PURCHASE_ORDER_ITEMS = 19;
  private static final int METHODID_ADD_PURCHASE_ORDER_ITEM = 20;
  private static final int METHODID_MODIFY_PURCHASE_ORDER_ITEM = 21;
  private static final int METHODID_UPDATE_PURCHASE_ORDER_ITEM_SPECIFICATIONS = 22;
  private static final int METHODID_APPROVE_PURCHASE_ORDER_ITEM = 23;
  private static final int METHODID_DELETE_PURCHASE_ORDER_ITEM = 24;
  private static final int METHODID_REORDER_PURCHASE_ORDER_ITEMS = 25;
  private static final int METHODID_VIEW_PURCHASE_ORDER_ITEM_BY_ID = 26;
  private static final int METHODID_VIEW_PURCHASE_ORDER_ITEM_PRICE = 27;
  private static final int METHODID_VIEW_APPROVED_PURCHASE_ORDER_ITEMS = 28;
  private static final int METHODID_VIEW_UNAPPROVED_PURCHASE_ORDER_ITEMS = 29;
  private static final int METHODID_VIEW_PURCHASE_ORDER_ITEM_HISTORY = 30;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_PURCHASE_ORDER_ITEMS = 31;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_PURCHASE_ORDER_ITEMS = 32;
  private static final int METHODID_SEARCH_ITEMS_WITH_PAGINATION = 33;
  private static final int METHODID_DOWNLOAD_ITEMS_AS_CSV = 34;
  private static final int METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV = 35;
  private static final int METHODID_UPLOAD_PURCHASE_ORDER_ITEMS = 36;
  private static final int METHODID_ADD_PURCHASE_ORDER_CONTACT = 37;
  private static final int METHODID_APPROVE_PURCHASE_ORDER_CONTACT = 38;
  private static final int METHODID_DELETE_PURCHASE_ORDER_CONTACT = 39;
  private static final int METHODID_VIEW_PURCHASE_ORDER_CONTACT_BY_ID = 40;
  private static final int METHODID_VIEW_PURCHASE_ORDER_CONTACTS = 41;
  private static final int METHODID_ADD_PURCHASE_ORDER_REFERENCE = 42;
  private static final int METHODID_APPROVE_PURCHASE_ORDER_REFERENCE = 43;
  private static final int METHODID_DELETE_PURCHASE_ORDER_REFERENCE = 44;
  private static final int METHODID_VIEW_PURCHASE_ORDER_REFERENCE_BY_ID = 45;
  private static final int METHODID_VIEW_PURCHASE_ORDER_REFERENCES = 46;
  private static final int METHODID_VIEW_BY_ID = 47;
  private static final int METHODID_VIEW_BY_UUID = 48;
  private static final int METHODID_VIEW_BY_REFERENCE_ID = 49;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 50;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 51;
  private static final int METHODID_VIEW_FROM_IDS = 52;
  private static final int METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID = 53;
  private static final int METHODID_VIEW_ALL = 54;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 55;
  private static final int METHODID_VIEW_WITH_PAGINATION = 56;
  private static final int METHODID_VIEW_AMENDMENTS = 57;
  private static final int METHODID_VIEW_INVENTORY_STATISTICS = 58;
  private static final int METHODID_VIEW_BILLING_STATISTICS = 59;
  private static final int METHODID_VIEW_INVENTORY_MATCH = 60;
  private static final int METHODID_VIEW_PRICE_MATCH = 61;
  private static final int METHODID_VIEW_PROSPECTIVE_FAMILIES = 62;
  private static final int METHODID_FILTER_PROSPECTIVE_FAMILIES = 63;
  private static final int METHODID_VIEW_PROSPECTIVE_PURCHASE_ORDER_ITEM = 64;
  private static final int METHODID_IS_DOWNLOADABLE = 65;
  private static final int METHODID_DOWNLOAD_BY_UUID = 66;
  private static final int METHODID_SEARCH_ALL = 67;
  private static final int METHODID_FILTER = 68;
  private static final int METHODID_COUNT_IN_STATUS = 69;
  private static final int METHODID_COUNT = 70;
  private static final int METHODID_ACCRUED_VALUE = 71;
  private static final int METHODID_DOWNLOAD_AS_CSV = 72;

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
          serviceImpl.create((com.scailo.sdk.PurchasesOrdersServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.PurchasesOrdersServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.PurchasesOrdersServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.PurchasesOrdersServiceUpdateRequest) request,
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
          serviceImpl.autofill((com.scailo.sdk.PurchasesOrdersServiceAutofillRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_AMEND:
          serviceImpl.amend((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_CREATE_MAGIC_LINK:
          serviceImpl.createMagicLink((com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink>) responseObserver);
          break;
        case METHODID_ADD_MULTIPLE_PURCHASE_ORDER_ITEMS:
          serviceImpl.addMultiplePurchaseOrderItems((com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_ADD_PURCHASE_ORDER_ITEM:
          serviceImpl.addPurchaseOrderItem((com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_PURCHASE_ORDER_ITEM:
          serviceImpl.modifyPurchaseOrderItem((com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PURCHASE_ORDER_ITEM_SPECIFICATIONS:
          serviceImpl.updatePurchaseOrderItemSpecifications((com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_PURCHASE_ORDER_ITEM:
          serviceImpl.approvePurchaseOrderItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_PURCHASE_ORDER_ITEM:
          serviceImpl.deletePurchaseOrderItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_PURCHASE_ORDER_ITEMS:
          serviceImpl.reorderPurchaseOrderItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_PURCHASE_ORDER_ITEM_BY_ID:
          serviceImpl.viewPurchaseOrderItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItem>) responseObserver);
          break;
        case METHODID_VIEW_PURCHASE_ORDER_ITEM_PRICE:
          serviceImpl.viewPurchaseOrderItemPrice((com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PriceResponse>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_PURCHASE_ORDER_ITEMS:
          serviceImpl.viewApprovedPurchaseOrderItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_PURCHASE_ORDER_ITEMS:
          serviceImpl.viewUnapprovedPurchaseOrderItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PURCHASE_ORDER_ITEM_HISTORY:
          serviceImpl.viewPurchaseOrderItemHistory((com.scailo.sdk.PurchaseOrderItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_PURCHASE_ORDER_ITEMS:
          serviceImpl.viewPaginatedApprovedPurchaseOrderItems((com.scailo.sdk.PurchaseOrderItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_PURCHASE_ORDER_ITEMS:
          serviceImpl.viewPaginatedUnapprovedPurchaseOrderItems((com.scailo.sdk.PurchaseOrderItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ITEMS_WITH_PAGINATION:
          serviceImpl.searchItemsWithPagination((com.scailo.sdk.PurchaseOrderItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_AS_CSV:
          serviceImpl.downloadItemsAsCSV((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV:
          serviceImpl.downloadItemsTemplateAsCSV((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_UPLOAD_PURCHASE_ORDER_ITEMS:
          serviceImpl.uploadPurchaseOrderItems((com.scailo.sdk.IdentifierUUIDWithFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_ADD_PURCHASE_ORDER_CONTACT:
          serviceImpl.addPurchaseOrderContact((com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_PURCHASE_ORDER_CONTACT:
          serviceImpl.approvePurchaseOrderContact((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_PURCHASE_ORDER_CONTACT:
          serviceImpl.deletePurchaseOrderContact((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_PURCHASE_ORDER_CONTACT_BY_ID:
          serviceImpl.viewPurchaseOrderContactByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderContact>) responseObserver);
          break;
        case METHODID_VIEW_PURCHASE_ORDER_CONTACTS:
          serviceImpl.viewPurchaseOrderContacts((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderContactsList>) responseObserver);
          break;
        case METHODID_ADD_PURCHASE_ORDER_REFERENCE:
          serviceImpl.addPurchaseOrderReference((com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_PURCHASE_ORDER_REFERENCE:
          serviceImpl.approvePurchaseOrderReference((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_PURCHASE_ORDER_REFERENCE:
          serviceImpl.deletePurchaseOrderReference((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_PURCHASE_ORDER_REFERENCE_BY_ID:
          serviceImpl.viewPurchaseOrderReferenceByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderReference>) responseObserver);
          break;
        case METHODID_VIEW_PURCHASE_ORDER_REFERENCES:
          serviceImpl.viewPurchaseOrderReferences((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderReferencesList>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder>) responseObserver);
          break;
        case METHODID_VIEW_BY_REFERENCE_ID:
          serviceImpl.viewByReferenceID((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrder>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList>) responseObserver);
          break;
        case METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID:
          serviceImpl.viewAncillaryParametersByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderAncillaryParameters>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.PurchasesOrdersServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_AMENDMENTS:
          serviceImpl.viewAmendments((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.AmendmentLogsList>) responseObserver);
          break;
        case METHODID_VIEW_INVENTORY_STATISTICS:
          serviceImpl.viewInventoryStatistics((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderInventoryStatistics>) responseObserver);
          break;
        case METHODID_VIEW_BILLING_STATISTICS:
          serviceImpl.viewBillingStatistics((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderBillingStatistics>) responseObserver);
          break;
        case METHODID_VIEW_INVENTORY_MATCH:
          serviceImpl.viewInventoryMatch((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderInventoryMatchList>) responseObserver);
          break;
        case METHODID_VIEW_PRICE_MATCH:
          serviceImpl.viewPriceMatch((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseOrderPriceMatchList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_FAMILIES:
          serviceImpl.viewProspectiveFamilies((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER_PROSPECTIVE_FAMILIES:
          serviceImpl.filterProspectiveFamilies((com.scailo.sdk.FilterFamiliesReqForIdentifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_VIEW_PROSPECTIVE_PURCHASE_ORDER_ITEM:
          serviceImpl.viewProspectivePurchaseOrderItem((com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest>) responseObserver);
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
          serviceImpl.searchAll((com.scailo.sdk.PurchasesOrdersServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.PurchasesOrdersServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesOrdersList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.PurchasesOrdersServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_ACCRUED_VALUE:
          serviceImpl.accruedValue((com.scailo.sdk.PurchasesOrdersServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.SumResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.PurchasesOrdersServiceFilterReq) request,
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
              com.scailo.sdk.PurchasesOrdersServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceUpdateRequest,
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
              com.scailo.sdk.PurchasesOrdersServiceUpdateRequest,
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
              com.scailo.sdk.PurchasesOrdersServiceAutofillRequest,
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
          getCreateMagicLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
              com.scailo.sdk.MagicLink>(
                service, METHODID_CREATE_MAGIC_LINK)))
        .addMethod(
          getAddMultiplePurchaseOrderItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceMultipleItemsCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_MULTIPLE_PURCHASE_ORDER_ITEMS)))
        .addMethod(
          getAddPurchaseOrderItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_PURCHASE_ORDER_ITEM)))
        .addMethod(
          getModifyPurchaseOrderItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_PURCHASE_ORDER_ITEM)))
        .addMethod(
          getUpdatePurchaseOrderItemSpecificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceItemSpecificationsUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE_PURCHASE_ORDER_ITEM_SPECIFICATIONS)))
        .addMethod(
          getApprovePurchaseOrderItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_PURCHASE_ORDER_ITEM)))
        .addMethod(
          getDeletePurchaseOrderItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_PURCHASE_ORDER_ITEM)))
        .addMethod(
          getReorderPurchaseOrderItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_PURCHASE_ORDER_ITEMS)))
        .addMethod(
          getViewPurchaseOrderItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.PurchaseOrderItem>(
                service, METHODID_VIEW_PURCHASE_ORDER_ITEM_BY_ID)))
        .addMethod(
          getViewPurchaseOrderItemPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest,
              com.scailo.sdk.PriceResponse>(
                service, METHODID_VIEW_PURCHASE_ORDER_ITEM_PRICE)))
        .addMethod(
          getViewApprovedPurchaseOrderItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.PurchaseOrderItemsList>(
                service, METHODID_VIEW_APPROVED_PURCHASE_ORDER_ITEMS)))
        .addMethod(
          getViewUnapprovedPurchaseOrderItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.PurchaseOrderItemsList>(
                service, METHODID_VIEW_UNAPPROVED_PURCHASE_ORDER_ITEMS)))
        .addMethod(
          getViewPurchaseOrderItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseOrderItemHistoryRequest,
              com.scailo.sdk.PurchaseOrderItemsList>(
                service, METHODID_VIEW_PURCHASE_ORDER_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedPurchaseOrderItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseOrderItemsSearchRequest,
              com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_PURCHASE_ORDER_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedPurchaseOrderItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseOrderItemsSearchRequest,
              com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_PURCHASE_ORDER_ITEMS)))
        .addMethod(
          getSearchItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseOrderItemsSearchRequest,
              com.scailo.sdk.PurchasesOrdersServicePaginatedItemsResponse>(
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
          getUploadPurchaseOrderItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithFile,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_UPLOAD_PURCHASE_ORDER_ITEMS)))
        .addMethod(
          getAddPurchaseOrderContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceContactCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_PURCHASE_ORDER_CONTACT)))
        .addMethod(
          getApprovePurchaseOrderContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_PURCHASE_ORDER_CONTACT)))
        .addMethod(
          getDeletePurchaseOrderContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_PURCHASE_ORDER_CONTACT)))
        .addMethod(
          getViewPurchaseOrderContactByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.PurchaseOrderContact>(
                service, METHODID_VIEW_PURCHASE_ORDER_CONTACT_BY_ID)))
        .addMethod(
          getViewPurchaseOrderContactsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseOrderContactsList>(
                service, METHODID_VIEW_PURCHASE_ORDER_CONTACTS)))
        .addMethod(
          getAddPurchaseOrderReferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceReferenceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_PURCHASE_ORDER_REFERENCE)))
        .addMethod(
          getApprovePurchaseOrderReferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_PURCHASE_ORDER_REFERENCE)))
        .addMethod(
          getDeletePurchaseOrderReferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_PURCHASE_ORDER_REFERENCE)))
        .addMethod(
          getViewPurchaseOrderReferenceByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.PurchaseOrderReference>(
                service, METHODID_VIEW_PURCHASE_ORDER_REFERENCE_BY_ID)))
        .addMethod(
          getViewPurchaseOrderReferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.PurchaseOrderReferencesList>(
                service, METHODID_VIEW_PURCHASE_ORDER_REFERENCES)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.PurchaseOrder>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseOrder>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewByReferenceIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.PurchaseOrder>(
                service, METHODID_VIEW_BY_REFERENCE_ID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.PurchaseOrder>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseOrder>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.PurchasesOrdersList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAncillaryParametersByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseOrderAncillaryParameters>(
                service, METHODID_VIEW_ANCILLARY_PARAMETERS_BY_UUID)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.PurchasesOrdersList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchasesOrdersList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServicePaginationReq,
              com.scailo.sdk.PurchasesOrdersServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewAmendmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.AmendmentLogsList>(
                service, METHODID_VIEW_AMENDMENTS)))
        .addMethod(
          getViewInventoryStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseOrderInventoryStatistics>(
                service, METHODID_VIEW_INVENTORY_STATISTICS)))
        .addMethod(
          getViewBillingStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseOrderBillingStatistics>(
                service, METHODID_VIEW_BILLING_STATISTICS)))
        .addMethod(
          getViewInventoryMatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseOrderInventoryMatchList>(
                service, METHODID_VIEW_INVENTORY_MATCH)))
        .addMethod(
          getViewPriceMatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseOrderPriceMatchList>(
                service, METHODID_VIEW_PRICE_MATCH)))
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
          getViewProspectivePurchaseOrderItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseOrderItemProspectiveInfoRequest,
              com.scailo.sdk.PurchasesOrdersServiceItemCreateRequest>(
                service, METHODID_VIEW_PROSPECTIVE_PURCHASE_ORDER_ITEM)))
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
              com.scailo.sdk.PurchasesOrdersServiceSearchAllReq,
              com.scailo.sdk.PurchasesOrdersList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceFilterReq,
              com.scailo.sdk.PurchasesOrdersList>(
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
              com.scailo.sdk.PurchasesOrdersServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getAccruedValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceCountReq,
              com.scailo.sdk.SumResponse>(
                service, METHODID_ACCRUED_VALUE)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesOrdersServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class PurchasesOrdersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PurchasesOrdersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.PurchasesOrdersScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PurchasesOrdersService");
    }
  }

  private static final class PurchasesOrdersServiceFileDescriptorSupplier
      extends PurchasesOrdersServiceBaseDescriptorSupplier {
    PurchasesOrdersServiceFileDescriptorSupplier() {}
  }

  private static final class PurchasesOrdersServiceMethodDescriptorSupplier
      extends PurchasesOrdersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PurchasesOrdersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PurchasesOrdersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PurchasesOrdersServiceFileDescriptorSupplier())
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
              .addMethod(getAmendMethod())
              .addMethod(getCreateMagicLinkMethod())
              .addMethod(getAddMultiplePurchaseOrderItemsMethod())
              .addMethod(getAddPurchaseOrderItemMethod())
              .addMethod(getModifyPurchaseOrderItemMethod())
              .addMethod(getUpdatePurchaseOrderItemSpecificationsMethod())
              .addMethod(getApprovePurchaseOrderItemMethod())
              .addMethod(getDeletePurchaseOrderItemMethod())
              .addMethod(getReorderPurchaseOrderItemsMethod())
              .addMethod(getViewPurchaseOrderItemByIDMethod())
              .addMethod(getViewPurchaseOrderItemPriceMethod())
              .addMethod(getViewApprovedPurchaseOrderItemsMethod())
              .addMethod(getViewUnapprovedPurchaseOrderItemsMethod())
              .addMethod(getViewPurchaseOrderItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedPurchaseOrderItemsMethod())
              .addMethod(getViewPaginatedUnapprovedPurchaseOrderItemsMethod())
              .addMethod(getSearchItemsWithPaginationMethod())
              .addMethod(getDownloadItemsAsCSVMethod())
              .addMethod(getDownloadItemsTemplateAsCSVMethod())
              .addMethod(getUploadPurchaseOrderItemsMethod())
              .addMethod(getAddPurchaseOrderContactMethod())
              .addMethod(getApprovePurchaseOrderContactMethod())
              .addMethod(getDeletePurchaseOrderContactMethod())
              .addMethod(getViewPurchaseOrderContactByIDMethod())
              .addMethod(getViewPurchaseOrderContactsMethod())
              .addMethod(getAddPurchaseOrderReferenceMethod())
              .addMethod(getApprovePurchaseOrderReferenceMethod())
              .addMethod(getDeletePurchaseOrderReferenceMethod())
              .addMethod(getViewPurchaseOrderReferenceByIDMethod())
              .addMethod(getViewPurchaseOrderReferencesMethod())
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
              .addMethod(getViewInventoryStatisticsMethod())
              .addMethod(getViewBillingStatisticsMethod())
              .addMethod(getViewInventoryMatchMethod())
              .addMethod(getViewPriceMatchMethod())
              .addMethod(getViewProspectiveFamiliesMethod())
              .addMethod(getFilterProspectiveFamiliesMethod())
              .addMethod(getViewProspectivePurchaseOrderItemMethod())
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
