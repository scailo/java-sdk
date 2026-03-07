package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each purchase enquiry
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: purchases_enquiries.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PurchasesEnquiriesServiceGrpc {

  private PurchasesEnquiriesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.PurchasesEnquiriesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = PurchasesEnquiriesServiceGrpc.getCreateMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getCreateMethod = PurchasesEnquiriesServiceGrpc.getCreateMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = PurchasesEnquiriesServiceGrpc.getDraftMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getDraftMethod = PurchasesEnquiriesServiceGrpc.getDraftMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = PurchasesEnquiriesServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getDraftUpdateMethod = PurchasesEnquiriesServiceGrpc.getDraftUpdateMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = PurchasesEnquiriesServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getSendForVerificationMethod = PurchasesEnquiriesServiceGrpc.getSendForVerificationMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = PurchasesEnquiriesServiceGrpc.getVerifyMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getVerifyMethod = PurchasesEnquiriesServiceGrpc.getVerifyMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = PurchasesEnquiriesServiceGrpc.getApproveMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getApproveMethod = PurchasesEnquiriesServiceGrpc.getApproveMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = PurchasesEnquiriesServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getSendForRevisionMethod = PurchasesEnquiriesServiceGrpc.getSendForRevisionMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = PurchasesEnquiriesServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getRevisionUpdateMethod = PurchasesEnquiriesServiceGrpc.getRevisionUpdateMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = PurchasesEnquiriesServiceGrpc.getHaltMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getHaltMethod = PurchasesEnquiriesServiceGrpc.getHaltMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = PurchasesEnquiriesServiceGrpc.getDiscardMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getDiscardMethod = PurchasesEnquiriesServiceGrpc.getDiscardMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = PurchasesEnquiriesServiceGrpc.getRestoreMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getRestoreMethod = PurchasesEnquiriesServiceGrpc.getRestoreMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = PurchasesEnquiriesServiceGrpc.getCompleteMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getCompleteMethod = PurchasesEnquiriesServiceGrpc.getCompleteMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = PurchasesEnquiriesServiceGrpc.getRepeatMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getRepeatMethod = PurchasesEnquiriesServiceGrpc.getRepeatMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Repeat"))
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
    if ((getReopenMethod = PurchasesEnquiriesServiceGrpc.getReopenMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getReopenMethod = PurchasesEnquiriesServiceGrpc.getReopenMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getReopenMethod = getReopenMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reopen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Reopen"))
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
    if ((getCommentAddMethod = PurchasesEnquiriesServiceGrpc.getCommentAddMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getCommentAddMethod = PurchasesEnquiriesServiceGrpc.getCommentAddMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getSendEmailMethod = PurchasesEnquiriesServiceGrpc.getSendEmailMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getSendEmailMethod = PurchasesEnquiriesServiceGrpc.getSendEmailMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithEmailAttributes, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithEmailAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("SendEmail"))
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
    if ((getCreateMagicLinkMethod = PurchasesEnquiriesServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = PurchasesEnquiriesServiceGrpc.getCreateMagicLinkMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("CreateMagicLink"))
              .build();
        }
      }
    }
    return getCreateMagicLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddPurchaseEnquiryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPurchaseEnquiryItem",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest,
      com.scailo.sdk.IdentifierResponse> getAddPurchaseEnquiryItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse> getAddPurchaseEnquiryItemMethod;
    if ((getAddPurchaseEnquiryItemMethod = PurchasesEnquiriesServiceGrpc.getAddPurchaseEnquiryItemMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getAddPurchaseEnquiryItemMethod = PurchasesEnquiriesServiceGrpc.getAddPurchaseEnquiryItemMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getAddPurchaseEnquiryItemMethod = getAddPurchaseEnquiryItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPurchaseEnquiryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("AddPurchaseEnquiryItem"))
              .build();
        }
      }
    }
    return getAddPurchaseEnquiryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyPurchaseEnquiryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyPurchaseEnquiryItem",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getModifyPurchaseEnquiryItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse> getModifyPurchaseEnquiryItemMethod;
    if ((getModifyPurchaseEnquiryItemMethod = PurchasesEnquiriesServiceGrpc.getModifyPurchaseEnquiryItemMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getModifyPurchaseEnquiryItemMethod = PurchasesEnquiriesServiceGrpc.getModifyPurchaseEnquiryItemMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getModifyPurchaseEnquiryItemMethod = getModifyPurchaseEnquiryItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyPurchaseEnquiryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ModifyPurchaseEnquiryItem"))
              .build();
        }
      }
    }
    return getModifyPurchaseEnquiryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApprovePurchaseEnquiryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApprovePurchaseEnquiryItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getApprovePurchaseEnquiryItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getApprovePurchaseEnquiryItemMethod;
    if ((getApprovePurchaseEnquiryItemMethod = PurchasesEnquiriesServiceGrpc.getApprovePurchaseEnquiryItemMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getApprovePurchaseEnquiryItemMethod = PurchasesEnquiriesServiceGrpc.getApprovePurchaseEnquiryItemMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getApprovePurchaseEnquiryItemMethod = getApprovePurchaseEnquiryItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApprovePurchaseEnquiryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ApprovePurchaseEnquiryItem"))
              .build();
        }
      }
    }
    return getApprovePurchaseEnquiryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeletePurchaseEnquiryItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePurchaseEnquiryItem",
      requestType = com.scailo.sdk.IdentifierWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment,
      com.scailo.sdk.IdentifierResponse> getDeletePurchaseEnquiryItemMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse> getDeletePurchaseEnquiryItemMethod;
    if ((getDeletePurchaseEnquiryItemMethod = PurchasesEnquiriesServiceGrpc.getDeletePurchaseEnquiryItemMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getDeletePurchaseEnquiryItemMethod = PurchasesEnquiriesServiceGrpc.getDeletePurchaseEnquiryItemMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getDeletePurchaseEnquiryItemMethod = getDeletePurchaseEnquiryItemMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePurchaseEnquiryItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("DeletePurchaseEnquiryItem"))
              .build();
        }
      }
    }
    return getDeletePurchaseEnquiryItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderPurchaseEnquiryItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReorderPurchaseEnquiryItems",
      requestType = com.scailo.sdk.ReorderItemsRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest,
      com.scailo.sdk.IdentifierResponse> getReorderPurchaseEnquiryItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse> getReorderPurchaseEnquiryItemsMethod;
    if ((getReorderPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getReorderPurchaseEnquiryItemsMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getReorderPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getReorderPurchaseEnquiryItemsMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getReorderPurchaseEnquiryItemsMethod = getReorderPurchaseEnquiryItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReorderItemsRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReorderPurchaseEnquiryItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReorderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ReorderPurchaseEnquiryItems"))
              .build();
        }
      }
    }
    return getReorderPurchaseEnquiryItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseEnquiryItem> getViewPurchaseEnquiryItemByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPurchaseEnquiryItemByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.PurchaseEnquiryItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseEnquiryItem> getViewPurchaseEnquiryItemByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseEnquiryItem> getViewPurchaseEnquiryItemByIDMethod;
    if ((getViewPurchaseEnquiryItemByIDMethod = PurchasesEnquiriesServiceGrpc.getViewPurchaseEnquiryItemByIDMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewPurchaseEnquiryItemByIDMethod = PurchasesEnquiriesServiceGrpc.getViewPurchaseEnquiryItemByIDMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewPurchaseEnquiryItemByIDMethod = getViewPurchaseEnquiryItemByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseEnquiryItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPurchaseEnquiryItemByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiryItem.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewPurchaseEnquiryItemByID"))
              .build();
        }
      }
    }
    return getViewPurchaseEnquiryItemByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.PurchasesEnquiriesItemsList> getViewApprovedPurchaseEnquiryItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewApprovedPurchaseEnquiryItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.PurchasesEnquiriesItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.PurchasesEnquiriesItemsList> getViewApprovedPurchaseEnquiryItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.PurchasesEnquiriesItemsList> getViewApprovedPurchaseEnquiryItemsMethod;
    if ((getViewApprovedPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getViewApprovedPurchaseEnquiryItemsMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewApprovedPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getViewApprovedPurchaseEnquiryItemsMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewApprovedPurchaseEnquiryItemsMethod = getViewApprovedPurchaseEnquiryItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.PurchasesEnquiriesItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewApprovedPurchaseEnquiryItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewApprovedPurchaseEnquiryItems"))
              .build();
        }
      }
    }
    return getViewApprovedPurchaseEnquiryItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.PurchasesEnquiriesItemsList> getViewUnapprovedPurchaseEnquiryItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUnapprovedPurchaseEnquiryItems",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.PurchasesEnquiriesItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.PurchasesEnquiriesItemsList> getViewUnapprovedPurchaseEnquiryItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.PurchasesEnquiriesItemsList> getViewUnapprovedPurchaseEnquiryItemsMethod;
    if ((getViewUnapprovedPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getViewUnapprovedPurchaseEnquiryItemsMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewUnapprovedPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getViewUnapprovedPurchaseEnquiryItemsMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewUnapprovedPurchaseEnquiryItemsMethod = getViewUnapprovedPurchaseEnquiryItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.PurchasesEnquiriesItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewUnapprovedPurchaseEnquiryItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewUnapprovedPurchaseEnquiryItems"))
              .build();
        }
      }
    }
    return getViewUnapprovedPurchaseEnquiryItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemHistoryRequest,
      com.scailo.sdk.PurchasesEnquiriesItemsList> getViewPurchaseEnquiryItemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPurchaseEnquiryItemHistory",
      requestType = com.scailo.sdk.PurchaseEnquiryItemHistoryRequest.class,
      responseType = com.scailo.sdk.PurchasesEnquiriesItemsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemHistoryRequest,
      com.scailo.sdk.PurchasesEnquiriesItemsList> getViewPurchaseEnquiryItemHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemHistoryRequest, com.scailo.sdk.PurchasesEnquiriesItemsList> getViewPurchaseEnquiryItemHistoryMethod;
    if ((getViewPurchaseEnquiryItemHistoryMethod = PurchasesEnquiriesServiceGrpc.getViewPurchaseEnquiryItemHistoryMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewPurchaseEnquiryItemHistoryMethod = PurchasesEnquiriesServiceGrpc.getViewPurchaseEnquiryItemHistoryMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewPurchaseEnquiryItemHistoryMethod = getViewPurchaseEnquiryItemHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseEnquiryItemHistoryRequest, com.scailo.sdk.PurchasesEnquiriesItemsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPurchaseEnquiryItemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiryItemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesItemsList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewPurchaseEnquiryItemHistory"))
              .build();
        }
      }
    }
    return getViewPurchaseEnquiryItemHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest,
      com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> getViewPaginatedApprovedPurchaseEnquiryItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedApprovedPurchaseEnquiryItems",
      requestType = com.scailo.sdk.PurchaseEnquiryItemsSearchRequest.class,
      responseType = com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest,
      com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> getViewPaginatedApprovedPurchaseEnquiryItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest, com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> getViewPaginatedApprovedPurchaseEnquiryItemsMethod;
    if ((getViewPaginatedApprovedPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getViewPaginatedApprovedPurchaseEnquiryItemsMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewPaginatedApprovedPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getViewPaginatedApprovedPurchaseEnquiryItemsMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewPaginatedApprovedPurchaseEnquiryItemsMethod = getViewPaginatedApprovedPurchaseEnquiryItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest, com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedApprovedPurchaseEnquiryItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiryItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewPaginatedApprovedPurchaseEnquiryItems"))
              .build();
        }
      }
    }
    return getViewPaginatedApprovedPurchaseEnquiryItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest,
      com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPaginatedUnapprovedPurchaseEnquiryItems",
      requestType = com.scailo.sdk.PurchaseEnquiryItemsSearchRequest.class,
      responseType = com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest,
      com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest, com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod;
    if ((getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod = getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest, com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPaginatedUnapprovedPurchaseEnquiryItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiryItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewPaginatedUnapprovedPurchaseEnquiryItems"))
              .build();
        }
      }
    }
    return getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest,
      com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchItemsWithPagination",
      requestType = com.scailo.sdk.PurchaseEnquiryItemsSearchRequest.class,
      responseType = com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest,
      com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest, com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> getSearchItemsWithPaginationMethod;
    if ((getSearchItemsWithPaginationMethod = PurchasesEnquiriesServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getSearchItemsWithPaginationMethod = PurchasesEnquiriesServiceGrpc.getSearchItemsWithPaginationMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getSearchItemsWithPaginationMethod = getSearchItemsWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchaseEnquiryItemsSearchRequest, com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchItemsWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiryItemsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("SearchItemsWithPagination"))
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
    if ((getDownloadItemsAsCSVMethod = PurchasesEnquiriesServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getDownloadItemsAsCSVMethod = PurchasesEnquiriesServiceGrpc.getDownloadItemsAsCSVMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getDownloadItemsAsCSVMethod = getDownloadItemsAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("DownloadItemsAsCSV"))
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
    if ((getDownloadItemsTemplateAsCSVMethod = PurchasesEnquiriesServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getDownloadItemsTemplateAsCSVMethod = PurchasesEnquiriesServiceGrpc.getDownloadItemsTemplateAsCSVMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getDownloadItemsTemplateAsCSVMethod = getDownloadItemsTemplateAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadItemsTemplateAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("DownloadItemsTemplateAsCSV"))
              .build();
        }
      }
    }
    return getDownloadItemsTemplateAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadPurchaseEnquiryItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadPurchaseEnquiryItems",
      requestType = com.scailo.sdk.IdentifierUUIDWithFile.class,
      responseType = com.scailo.sdk.IdentifiersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile,
      com.scailo.sdk.IdentifiersList> getUploadPurchaseEnquiryItemsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList> getUploadPurchaseEnquiryItemsMethod;
    if ((getUploadPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getUploadPurchaseEnquiryItemsMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getUploadPurchaseEnquiryItemsMethod = PurchasesEnquiriesServiceGrpc.getUploadPurchaseEnquiryItemsMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getUploadPurchaseEnquiryItemsMethod = getUploadPurchaseEnquiryItemsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithFile, com.scailo.sdk.IdentifiersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadPurchaseEnquiryItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("UploadPurchaseEnquiryItems"))
              .build();
        }
      }
    }
    return getUploadPurchaseEnquiryItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseEnquiry> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.PurchaseEnquiry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseEnquiry> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseEnquiry> getViewByIDMethod;
    if ((getViewByIDMethod = PurchasesEnquiriesServiceGrpc.getViewByIDMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewByIDMethod = PurchasesEnquiriesServiceGrpc.getViewByIDMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseEnquiry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiry.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseEnquiry> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseEnquiry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseEnquiry> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseEnquiry> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = PurchasesEnquiriesServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewByUUIDMethod = PurchasesEnquiriesServiceGrpc.getViewByUUIDMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseEnquiry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiry.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.PurchaseEnquiry> getViewByReferenceIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByReferenceID",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.PurchaseEnquiry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.PurchaseEnquiry> getViewByReferenceIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.PurchaseEnquiry> getViewByReferenceIDMethod;
    if ((getViewByReferenceIDMethod = PurchasesEnquiriesServiceGrpc.getViewByReferenceIDMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewByReferenceIDMethod = PurchasesEnquiriesServiceGrpc.getViewByReferenceIDMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewByReferenceIDMethod = getViewByReferenceIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.PurchaseEnquiry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByReferenceID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiry.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewByReferenceID"))
              .build();
        }
      }
    }
    return getViewByReferenceIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseEnquiry> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.PurchaseEnquiry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.PurchaseEnquiry> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseEnquiry> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = PurchasesEnquiriesServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = PurchasesEnquiriesServiceGrpc.getViewEssentialByIDMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.PurchaseEnquiry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiry.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseEnquiry> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchaseEnquiry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchaseEnquiry> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseEnquiry> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = PurchasesEnquiriesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = PurchasesEnquiriesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchaseEnquiry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchaseEnquiry.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.PurchasesEnquiriesList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.PurchasesEnquiriesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.PurchasesEnquiriesList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.PurchasesEnquiriesList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = PurchasesEnquiriesServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewFromIDsMethod = PurchasesEnquiriesServiceGrpc.getViewFromIDsMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.PurchasesEnquiriesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.PurchasesEnquiriesList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.PurchasesEnquiriesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.PurchasesEnquiriesList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.PurchasesEnquiriesList> getViewAllMethod;
    if ((getViewAllMethod = PurchasesEnquiriesServiceGrpc.getViewAllMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewAllMethod = PurchasesEnquiriesServiceGrpc.getViewAllMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.PurchasesEnquiriesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchasesEnquiriesList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.PurchasesEnquiriesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.PurchasesEnquiriesList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchasesEnquiriesList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = PurchasesEnquiriesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = PurchasesEnquiriesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.PurchasesEnquiriesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServicePaginationReq,
      com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.PurchasesEnquiriesServicePaginationReq.class,
      responseType = com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServicePaginationReq,
      com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServicePaginationReq, com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = PurchasesEnquiriesServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getViewWithPaginationMethod = PurchasesEnquiriesServiceGrpc.getViewWithPaginationMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServicePaginationReq, com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("ViewWithPagination"))
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
    if ((getIsDownloadableMethod = PurchasesEnquiriesServiceGrpc.getIsDownloadableMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getIsDownloadableMethod = PurchasesEnquiriesServiceGrpc.getIsDownloadableMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getIsDownloadableMethod = getIsDownloadableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsDownloadable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("IsDownloadable"))
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
    if ((getDownloadByUUIDMethod = PurchasesEnquiriesServiceGrpc.getDownloadByUUIDMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getDownloadByUUIDMethod = PurchasesEnquiriesServiceGrpc.getDownloadByUUIDMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getDownloadByUUIDMethod = getDownloadByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("DownloadByUUID"))
              .build();
        }
      }
    }
    return getDownloadByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq,
      com.scailo.sdk.PurchasesEnquiriesList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq.class,
      responseType = com.scailo.sdk.PurchasesEnquiriesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq,
      com.scailo.sdk.PurchasesEnquiriesList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq, com.scailo.sdk.PurchasesEnquiriesList> getSearchAllMethod;
    if ((getSearchAllMethod = PurchasesEnquiriesServiceGrpc.getSearchAllMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getSearchAllMethod = PurchasesEnquiriesServiceGrpc.getSearchAllMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq, com.scailo.sdk.PurchasesEnquiriesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceFilterReq,
      com.scailo.sdk.PurchasesEnquiriesList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceFilterReq.class,
      responseType = com.scailo.sdk.PurchasesEnquiriesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceFilterReq,
      com.scailo.sdk.PurchasesEnquiriesList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceFilterReq, com.scailo.sdk.PurchasesEnquiriesList> getFilterMethod;
    if ((getFilterMethod = PurchasesEnquiriesServiceGrpc.getFilterMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getFilterMethod = PurchasesEnquiriesServiceGrpc.getFilterMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceFilterReq, com.scailo.sdk.PurchasesEnquiriesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesList.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = PurchasesEnquiriesServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getCountInStatusMethod = PurchasesEnquiriesServiceGrpc.getCountInStatusMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = PurchasesEnquiriesServiceGrpc.getCountMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getCountMethod = PurchasesEnquiriesServiceGrpc.getCountMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.PurchasesEnquiriesServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.PurchasesEnquiriesServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = PurchasesEnquiriesServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = PurchasesEnquiriesServiceGrpc.getDownloadAsCSVMethod) == null) {
          PurchasesEnquiriesServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.PurchasesEnquiriesServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.PurchasesEnquiriesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new PurchasesEnquiriesServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PurchasesEnquiriesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PurchasesEnquiriesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PurchasesEnquiriesServiceStub>() {
        @java.lang.Override
        public PurchasesEnquiriesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PurchasesEnquiriesServiceStub(channel, callOptions);
        }
      };
    return PurchasesEnquiriesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PurchasesEnquiriesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PurchasesEnquiriesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PurchasesEnquiriesServiceBlockingStub>() {
        @java.lang.Override
        public PurchasesEnquiriesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PurchasesEnquiriesServiceBlockingStub(channel, callOptions);
        }
      };
    return PurchasesEnquiriesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PurchasesEnquiriesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PurchasesEnquiriesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PurchasesEnquiriesServiceFutureStub>() {
        @java.lang.Override
        public PurchasesEnquiriesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PurchasesEnquiriesServiceFutureStub(channel, callOptions);
        }
      };
    return PurchasesEnquiriesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each purchase enquiry
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest request,
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
     * Add an item to a purchase enquiry
     * </pre>
     */
    default void addPurchaseEnquiryItem(com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPurchaseEnquiryItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a purchase enquiry
     * </pre>
     */
    default void modifyPurchaseEnquiryItem(com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyPurchaseEnquiryItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a purchase enquiry
     * </pre>
     */
    default void approvePurchaseEnquiryItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApprovePurchaseEnquiryItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a purchase enquiry
     * </pre>
     */
    default void deletePurchaseEnquiryItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePurchaseEnquiryItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a purchase enquiry
     * </pre>
     */
    default void reorderPurchaseEnquiryItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReorderPurchaseEnquiryItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View purchase enquiry Item by ID
     * </pre>
     */
    default void viewPurchaseEnquiryItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiryItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPurchaseEnquiryItemByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved purchase enquiry items for given purchase enquiry ID
     * </pre>
     */
    default void viewApprovedPurchaseEnquiryItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewApprovedPurchaseEnquiryItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved purchase enquiry items for given purchase enquiry ID
     * </pre>
     */
    default void viewUnapprovedPurchaseEnquiryItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewUnapprovedPurchaseEnquiryItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the history of the purchase enquiry item
     * </pre>
     */
    default void viewPurchaseEnquiryItemHistory(com.scailo.sdk.PurchaseEnquiryItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesItemsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPurchaseEnquiryItemHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * View approved purchase enquiry items for given purchase enquiry ID with pagination
     * </pre>
     */
    default void viewPaginatedApprovedPurchaseEnquiryItems(com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedApprovedPurchaseEnquiryItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View unapproved purchase enquiry items for given purchase enquiry ID with pagination
     * </pre>
     */
    default void viewPaginatedUnapprovedPurchaseEnquiryItems(com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search through purchase enquiry items with pagination
     * </pre>
     */
    default void searchItemsWithPagination(com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> responseObserver) {
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
    default void uploadPurchaseEnquiryItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadPurchaseEnquiryItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    default void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByReferenceIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.PurchasesEnquiriesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse> responseObserver) {
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
     * Download purchase enquiry with the given IdentifierUUID (can be used to allow public downloads)
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
    default void searchAll(com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.PurchasesEnquiriesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
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
    default void count(com.scailo.sdk.PurchasesEnquiriesServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.PurchasesEnquiriesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PurchasesEnquiriesService.
   * <pre>
   *Describes the common methods applicable on each purchase enquiry
   * </pre>
   */
  public static abstract class PurchasesEnquiriesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PurchasesEnquiriesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PurchasesEnquiriesService.
   * <pre>
   *Describes the common methods applicable on each purchase enquiry
   * </pre>
   */
  public static final class PurchasesEnquiriesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PurchasesEnquiriesServiceStub> {
    private PurchasesEnquiriesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchasesEnquiriesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PurchasesEnquiriesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest request,
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
     * Add an item to a purchase enquiry
     * </pre>
     */
    public void addPurchaseEnquiryItem(com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPurchaseEnquiryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify an item in a purchase enquiry
     * </pre>
     */
    public void modifyPurchaseEnquiryItem(com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyPurchaseEnquiryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve an item in a purchase enquiry
     * </pre>
     */
    public void approvePurchaseEnquiryItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApprovePurchaseEnquiryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an item in a purchase enquiry
     * </pre>
     */
    public void deletePurchaseEnquiryItem(com.scailo.sdk.IdentifierWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePurchaseEnquiryItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reorder items in a purchase enquiry
     * </pre>
     */
    public void reorderPurchaseEnquiryItems(com.scailo.sdk.ReorderItemsRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReorderPurchaseEnquiryItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View purchase enquiry Item by ID
     * </pre>
     */
    public void viewPurchaseEnquiryItemByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiryItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPurchaseEnquiryItemByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved purchase enquiry items for given purchase enquiry ID
     * </pre>
     */
    public void viewApprovedPurchaseEnquiryItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewApprovedPurchaseEnquiryItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved purchase enquiry items for given purchase enquiry ID
     * </pre>
     */
    public void viewUnapprovedPurchaseEnquiryItems(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewUnapprovedPurchaseEnquiryItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the history of the purchase enquiry item
     * </pre>
     */
    public void viewPurchaseEnquiryItemHistory(com.scailo.sdk.PurchaseEnquiryItemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesItemsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPurchaseEnquiryItemHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View approved purchase enquiry items for given purchase enquiry ID with pagination
     * </pre>
     */
    public void viewPaginatedApprovedPurchaseEnquiryItems(com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedPurchaseEnquiryItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View unapproved purchase enquiry items for given purchase enquiry ID with pagination
     * </pre>
     */
    public void viewPaginatedUnapprovedPurchaseEnquiryItems(com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search through purchase enquiry items with pagination
     * </pre>
     */
    public void searchItemsWithPagination(com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> responseObserver) {
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
    public void uploadPurchaseEnquiryItems(com.scailo.sdk.IdentifierUUIDWithFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadPurchaseEnquiryItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public void viewByReferenceID(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.PurchasesEnquiriesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse> responseObserver) {
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
     * Download purchase enquiry with the given IdentifierUUID (can be used to allow public downloads)
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
    public void searchAll(com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.PurchasesEnquiriesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList> responseObserver) {
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
    public void count(com.scailo.sdk.PurchasesEnquiriesServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.PurchasesEnquiriesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PurchasesEnquiriesService.
   * <pre>
   *Describes the common methods applicable on each purchase enquiry
   * </pre>
   */
  public static final class PurchasesEnquiriesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PurchasesEnquiriesServiceBlockingStub> {
    private PurchasesEnquiriesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchasesEnquiriesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PurchasesEnquiriesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest request) {
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
     * Add an item to a purchase enquiry
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse addPurchaseEnquiryItem(com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPurchaseEnquiryItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify an item in a purchase enquiry
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse modifyPurchaseEnquiryItem(com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyPurchaseEnquiryItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve an item in a purchase enquiry
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse approvePurchaseEnquiryItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApprovePurchaseEnquiryItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an item in a purchase enquiry
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deletePurchaseEnquiryItem(com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePurchaseEnquiryItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reorder items in a purchase enquiry
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reorderPurchaseEnquiryItems(com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReorderPurchaseEnquiryItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View purchase enquiry Item by ID
     * </pre>
     */
    public com.scailo.sdk.PurchaseEnquiryItem viewPurchaseEnquiryItemByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPurchaseEnquiryItemByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved purchase enquiry items for given purchase enquiry ID
     * </pre>
     */
    public com.scailo.sdk.PurchasesEnquiriesItemsList viewApprovedPurchaseEnquiryItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewApprovedPurchaseEnquiryItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved purchase enquiry items for given purchase enquiry ID
     * </pre>
     */
    public com.scailo.sdk.PurchasesEnquiriesItemsList viewUnapprovedPurchaseEnquiryItems(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewUnapprovedPurchaseEnquiryItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the history of the purchase enquiry item
     * </pre>
     */
    public com.scailo.sdk.PurchasesEnquiriesItemsList viewPurchaseEnquiryItemHistory(com.scailo.sdk.PurchaseEnquiryItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPurchaseEnquiryItemHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View approved purchase enquiry items for given purchase enquiry ID with pagination
     * </pre>
     */
    public com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse viewPaginatedApprovedPurchaseEnquiryItems(com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedApprovedPurchaseEnquiryItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View unapproved purchase enquiry items for given purchase enquiry ID with pagination
     * </pre>
     */
    public com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse viewPaginatedUnapprovedPurchaseEnquiryItems(com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search through purchase enquiry items with pagination
     * </pre>
     */
    public com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse searchItemsWithPagination(com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request) {
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
    public com.scailo.sdk.IdentifiersList uploadPurchaseEnquiryItems(com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadPurchaseEnquiryItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.PurchaseEnquiry viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.PurchaseEnquiry viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.scailo.sdk.PurchaseEnquiry viewByReferenceID(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByReferenceIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.PurchaseEnquiry viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.PurchaseEnquiry viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.PurchasesEnquiriesList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.PurchasesEnquiriesList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.PurchasesEnquiriesList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse viewWithPagination(com.scailo.sdk.PurchasesEnquiriesServicePaginationReq request) {
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
     * Download purchase enquiry with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.scailo.sdk.PurchasesEnquiriesList searchAll(com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.PurchasesEnquiriesList filter(com.scailo.sdk.PurchasesEnquiriesServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.PurchasesEnquiriesServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.PurchasesEnquiriesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PurchasesEnquiriesService.
   * <pre>
   *Describes the common methods applicable on each purchase enquiry
   * </pre>
   */
  public static final class PurchasesEnquiriesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PurchasesEnquiriesServiceFutureStub> {
    private PurchasesEnquiriesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PurchasesEnquiriesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PurchasesEnquiriesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest request) {
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
        com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest request) {
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
     * Add an item to a purchase enquiry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> addPurchaseEnquiryItem(
        com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPurchaseEnquiryItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify an item in a purchase enquiry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> modifyPurchaseEnquiryItem(
        com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyPurchaseEnquiryItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve an item in a purchase enquiry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> approvePurchaseEnquiryItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApprovePurchaseEnquiryItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an item in a purchase enquiry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deletePurchaseEnquiryItem(
        com.scailo.sdk.IdentifierWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePurchaseEnquiryItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reorder items in a purchase enquiry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reorderPurchaseEnquiryItems(
        com.scailo.sdk.ReorderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReorderPurchaseEnquiryItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View purchase enquiry Item by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseEnquiryItem> viewPurchaseEnquiryItemByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPurchaseEnquiryItemByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved purchase enquiry items for given purchase enquiry ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesEnquiriesItemsList> viewApprovedPurchaseEnquiryItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewApprovedPurchaseEnquiryItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved purchase enquiry items for given purchase enquiry ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesEnquiriesItemsList> viewUnapprovedPurchaseEnquiryItems(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewUnapprovedPurchaseEnquiryItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the history of the purchase enquiry item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesEnquiriesItemsList> viewPurchaseEnquiryItemHistory(
        com.scailo.sdk.PurchaseEnquiryItemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPurchaseEnquiryItemHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View approved purchase enquiry items for given purchase enquiry ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> viewPaginatedApprovedPurchaseEnquiryItems(
        com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedApprovedPurchaseEnquiryItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View unapproved purchase enquiry items for given purchase enquiry ID with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> viewPaginatedUnapprovedPurchaseEnquiryItems(
        com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search through purchase enquiry items with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse> searchItemsWithPagination(
        com.scailo.sdk.PurchaseEnquiryItemsSearchRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifiersList> uploadPurchaseEnquiryItems(
        com.scailo.sdk.IdentifierUUIDWithFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadPurchaseEnquiryItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseEnquiry> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseEnquiry> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by Reference ID (returns the latest record in case of duplicates)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseEnquiry> viewByReferenceID(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByReferenceIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseEnquiry> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchaseEnquiry> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesEnquiriesList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesEnquiriesList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesEnquiriesList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.PurchasesEnquiriesServicePaginationReq request) {
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
     * Download purchase enquiry with the given IdentifierUUID (can be used to allow public downloads)
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
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesEnquiriesList> searchAll(
        com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.PurchasesEnquiriesList> filter(
        com.scailo.sdk.PurchasesEnquiriesServiceFilterReq request) {
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
        com.scailo.sdk.PurchasesEnquiriesServiceCountReq request) {
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
        com.scailo.sdk.PurchasesEnquiriesServiceFilterReq request) {
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
  private static final int METHODID_ADD_PURCHASE_ENQUIRY_ITEM = 17;
  private static final int METHODID_MODIFY_PURCHASE_ENQUIRY_ITEM = 18;
  private static final int METHODID_APPROVE_PURCHASE_ENQUIRY_ITEM = 19;
  private static final int METHODID_DELETE_PURCHASE_ENQUIRY_ITEM = 20;
  private static final int METHODID_REORDER_PURCHASE_ENQUIRY_ITEMS = 21;
  private static final int METHODID_VIEW_PURCHASE_ENQUIRY_ITEM_BY_ID = 22;
  private static final int METHODID_VIEW_APPROVED_PURCHASE_ENQUIRY_ITEMS = 23;
  private static final int METHODID_VIEW_UNAPPROVED_PURCHASE_ENQUIRY_ITEMS = 24;
  private static final int METHODID_VIEW_PURCHASE_ENQUIRY_ITEM_HISTORY = 25;
  private static final int METHODID_VIEW_PAGINATED_APPROVED_PURCHASE_ENQUIRY_ITEMS = 26;
  private static final int METHODID_VIEW_PAGINATED_UNAPPROVED_PURCHASE_ENQUIRY_ITEMS = 27;
  private static final int METHODID_SEARCH_ITEMS_WITH_PAGINATION = 28;
  private static final int METHODID_DOWNLOAD_ITEMS_AS_CSV = 29;
  private static final int METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV = 30;
  private static final int METHODID_UPLOAD_PURCHASE_ENQUIRY_ITEMS = 31;
  private static final int METHODID_VIEW_BY_ID = 32;
  private static final int METHODID_VIEW_BY_UUID = 33;
  private static final int METHODID_VIEW_BY_REFERENCE_ID = 34;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 35;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 36;
  private static final int METHODID_VIEW_FROM_IDS = 37;
  private static final int METHODID_VIEW_ALL = 38;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 39;
  private static final int METHODID_VIEW_WITH_PAGINATION = 40;
  private static final int METHODID_IS_DOWNLOADABLE = 41;
  private static final int METHODID_DOWNLOAD_BY_UUID = 42;
  private static final int METHODID_SEARCH_ALL = 43;
  private static final int METHODID_FILTER = 44;
  private static final int METHODID_COUNT_IN_STATUS = 45;
  private static final int METHODID_COUNT = 46;
  private static final int METHODID_DOWNLOAD_AS_CSV = 47;

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
          serviceImpl.create((com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest) request,
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
        case METHODID_ADD_PURCHASE_ENQUIRY_ITEM:
          serviceImpl.addPurchaseEnquiryItem((com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MODIFY_PURCHASE_ENQUIRY_ITEM:
          serviceImpl.modifyPurchaseEnquiryItem((com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_APPROVE_PURCHASE_ENQUIRY_ITEM:
          serviceImpl.approvePurchaseEnquiryItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DELETE_PURCHASE_ENQUIRY_ITEM:
          serviceImpl.deletePurchaseEnquiryItem((com.scailo.sdk.IdentifierWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REORDER_PURCHASE_ENQUIRY_ITEMS:
          serviceImpl.reorderPurchaseEnquiryItems((com.scailo.sdk.ReorderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_PURCHASE_ENQUIRY_ITEM_BY_ID:
          serviceImpl.viewPurchaseEnquiryItemByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiryItem>) responseObserver);
          break;
        case METHODID_VIEW_APPROVED_PURCHASE_ENQUIRY_ITEMS:
          serviceImpl.viewApprovedPurchaseEnquiryItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesItemsList>) responseObserver);
          break;
        case METHODID_VIEW_UNAPPROVED_PURCHASE_ENQUIRY_ITEMS:
          serviceImpl.viewUnapprovedPurchaseEnquiryItems((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PURCHASE_ENQUIRY_ITEM_HISTORY:
          serviceImpl.viewPurchaseEnquiryItemHistory((com.scailo.sdk.PurchaseEnquiryItemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesItemsList>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_APPROVED_PURCHASE_ENQUIRY_ITEMS:
          serviceImpl.viewPaginatedApprovedPurchaseEnquiryItems((com.scailo.sdk.PurchaseEnquiryItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_VIEW_PAGINATED_UNAPPROVED_PURCHASE_ENQUIRY_ITEMS:
          serviceImpl.viewPaginatedUnapprovedPurchaseEnquiryItems((com.scailo.sdk.PurchaseEnquiryItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ITEMS_WITH_PAGINATION:
          serviceImpl.searchItemsWithPagination((com.scailo.sdk.PurchaseEnquiryItemsSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_AS_CSV:
          serviceImpl.downloadItemsAsCSV((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_ITEMS_TEMPLATE_AS_CSV:
          serviceImpl.downloadItemsTemplateAsCSV((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_UPLOAD_PURCHASE_ENQUIRY_ITEMS:
          serviceImpl.uploadPurchaseEnquiryItems((com.scailo.sdk.IdentifierUUIDWithFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifiersList>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry>) responseObserver);
          break;
        case METHODID_VIEW_BY_REFERENCE_ID:
          serviceImpl.viewByReferenceID((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchaseEnquiry>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.PurchasesEnquiriesServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse>) responseObserver);
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
          serviceImpl.searchAll((com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.PurchasesEnquiriesServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.PurchasesEnquiriesList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.PurchasesEnquiriesServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.PurchasesEnquiriesServiceFilterReq) request,
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
              com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesEnquiriesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest,
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
              com.scailo.sdk.PurchasesEnquiriesServiceUpdateRequest,
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
          getAddPurchaseEnquiryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesEnquiriesServiceItemCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_ADD_PURCHASE_ENQUIRY_ITEM)))
        .addMethod(
          getModifyPurchaseEnquiryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesEnquiriesServiceItemUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MODIFY_PURCHASE_ENQUIRY_ITEM)))
        .addMethod(
          getApprovePurchaseEnquiryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_APPROVE_PURCHASE_ENQUIRY_ITEM)))
        .addMethod(
          getDeletePurchaseEnquiryItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_PURCHASE_ENQUIRY_ITEM)))
        .addMethod(
          getReorderPurchaseEnquiryItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReorderItemsRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REORDER_PURCHASE_ENQUIRY_ITEMS)))
        .addMethod(
          getViewPurchaseEnquiryItemByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.PurchaseEnquiryItem>(
                service, METHODID_VIEW_PURCHASE_ENQUIRY_ITEM_BY_ID)))
        .addMethod(
          getViewApprovedPurchaseEnquiryItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.PurchasesEnquiriesItemsList>(
                service, METHODID_VIEW_APPROVED_PURCHASE_ENQUIRY_ITEMS)))
        .addMethod(
          getViewUnapprovedPurchaseEnquiryItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.PurchasesEnquiriesItemsList>(
                service, METHODID_VIEW_UNAPPROVED_PURCHASE_ENQUIRY_ITEMS)))
        .addMethod(
          getViewPurchaseEnquiryItemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseEnquiryItemHistoryRequest,
              com.scailo.sdk.PurchasesEnquiriesItemsList>(
                service, METHODID_VIEW_PURCHASE_ENQUIRY_ITEM_HISTORY)))
        .addMethod(
          getViewPaginatedApprovedPurchaseEnquiryItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseEnquiryItemsSearchRequest,
              com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_APPROVED_PURCHASE_ENQUIRY_ITEMS)))
        .addMethod(
          getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseEnquiryItemsSearchRequest,
              com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse>(
                service, METHODID_VIEW_PAGINATED_UNAPPROVED_PURCHASE_ENQUIRY_ITEMS)))
        .addMethod(
          getSearchItemsWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchaseEnquiryItemsSearchRequest,
              com.scailo.sdk.PurchaseEnquiriesServicePaginatedItemsResponse>(
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
          getUploadPurchaseEnquiryItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithFile,
              com.scailo.sdk.IdentifiersList>(
                service, METHODID_UPLOAD_PURCHASE_ENQUIRY_ITEMS)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.PurchaseEnquiry>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseEnquiry>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewByReferenceIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.PurchaseEnquiry>(
                service, METHODID_VIEW_BY_REFERENCE_ID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.PurchaseEnquiry>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchaseEnquiry>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.PurchasesEnquiriesList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.PurchasesEnquiriesList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.PurchasesEnquiriesList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesEnquiriesServicePaginationReq,
              com.scailo.sdk.PurchasesEnquiriesServicePaginationResponse>(
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
              com.scailo.sdk.PurchasesEnquiriesServiceSearchAllReq,
              com.scailo.sdk.PurchasesEnquiriesList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesEnquiriesServiceFilterReq,
              com.scailo.sdk.PurchasesEnquiriesList>(
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
              com.scailo.sdk.PurchasesEnquiriesServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.PurchasesEnquiriesServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class PurchasesEnquiriesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PurchasesEnquiriesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.PurchasesEnquiriesScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PurchasesEnquiriesService");
    }
  }

  private static final class PurchasesEnquiriesServiceFileDescriptorSupplier
      extends PurchasesEnquiriesServiceBaseDescriptorSupplier {
    PurchasesEnquiriesServiceFileDescriptorSupplier() {}
  }

  private static final class PurchasesEnquiriesServiceMethodDescriptorSupplier
      extends PurchasesEnquiriesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PurchasesEnquiriesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PurchasesEnquiriesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PurchasesEnquiriesServiceFileDescriptorSupplier())
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
              .addMethod(getAddPurchaseEnquiryItemMethod())
              .addMethod(getModifyPurchaseEnquiryItemMethod())
              .addMethod(getApprovePurchaseEnquiryItemMethod())
              .addMethod(getDeletePurchaseEnquiryItemMethod())
              .addMethod(getReorderPurchaseEnquiryItemsMethod())
              .addMethod(getViewPurchaseEnquiryItemByIDMethod())
              .addMethod(getViewApprovedPurchaseEnquiryItemsMethod())
              .addMethod(getViewUnapprovedPurchaseEnquiryItemsMethod())
              .addMethod(getViewPurchaseEnquiryItemHistoryMethod())
              .addMethod(getViewPaginatedApprovedPurchaseEnquiryItemsMethod())
              .addMethod(getViewPaginatedUnapprovedPurchaseEnquiryItemsMethod())
              .addMethod(getSearchItemsWithPaginationMethod())
              .addMethod(getDownloadItemsAsCSVMethod())
              .addMethod(getDownloadItemsTemplateAsCSVMethod())
              .addMethod(getUploadPurchaseEnquiryItemsMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewByReferenceIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
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
