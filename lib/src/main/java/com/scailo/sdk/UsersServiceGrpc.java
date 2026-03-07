package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each user
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: users.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersServiceGrpc {

  private UsersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.UsersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest,
      com.scailo.sdk.IdentifierResponse> getRegisterMobileDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterMobileDevice",
      requestType = com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest,
      com.scailo.sdk.IdentifierResponse> getRegisterMobileDeviceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest, com.scailo.sdk.IdentifierResponse> getRegisterMobileDeviceMethod;
    if ((getRegisterMobileDeviceMethod = UsersServiceGrpc.getRegisterMobileDeviceMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getRegisterMobileDeviceMethod = UsersServiceGrpc.getRegisterMobileDeviceMethod) == null) {
          UsersServiceGrpc.getRegisterMobileDeviceMethod = getRegisterMobileDeviceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterMobileDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("RegisterMobileDevice"))
              .build();
        }
      }
    }
    return getRegisterMobileDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.UsersServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = UsersServiceGrpc.getCreateMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreateMethod = UsersServiceGrpc.getCreateMethod) == null) {
          UsersServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.UsersServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = UsersServiceGrpc.getDraftMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDraftMethod = UsersServiceGrpc.getDraftMethod) == null) {
          UsersServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.UsersServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = UsersServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDraftUpdateMethod = UsersServiceGrpc.getDraftUpdateMethod) == null) {
          UsersServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = UsersServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSendForVerificationMethod = UsersServiceGrpc.getSendForVerificationMethod) == null) {
          UsersServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = UsersServiceGrpc.getVerifyMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getVerifyMethod = UsersServiceGrpc.getVerifyMethod) == null) {
          UsersServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = UsersServiceGrpc.getApproveMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getApproveMethod = UsersServiceGrpc.getApproveMethod) == null) {
          UsersServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = UsersServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSendForRevisionMethod = UsersServiceGrpc.getSendForRevisionMethod) == null) {
          UsersServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.UsersServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = UsersServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getRevisionUpdateMethod = UsersServiceGrpc.getRevisionUpdateMethod) == null) {
          UsersServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = UsersServiceGrpc.getHaltMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getHaltMethod = UsersServiceGrpc.getHaltMethod) == null) {
          UsersServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = UsersServiceGrpc.getDiscardMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDiscardMethod = UsersServiceGrpc.getDiscardMethod) == null) {
          UsersServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = UsersServiceGrpc.getRestoreMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getRestoreMethod = UsersServiceGrpc.getRestoreMethod) == null) {
          UsersServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCommentAddMethod = UsersServiceGrpc.getCommentAddMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCommentAddMethod = UsersServiceGrpc.getCommentAddMethod) == null) {
          UsersServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CommentAdd"))
              .build();
        }
      }
    }
    return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
      com.scailo.sdk.MagicLink> getCreateMagicLinkForSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMagicLinkForSignature",
      requestType = com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.class,
      responseType = com.scailo.sdk.MagicLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
      com.scailo.sdk.MagicLink> getCreateMagicLinkForSignatureMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink> getCreateMagicLinkForSignatureMethod;
    if ((getCreateMagicLinkForSignatureMethod = UsersServiceGrpc.getCreateMagicLinkForSignatureMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreateMagicLinkForSignatureMethod = UsersServiceGrpc.getCreateMagicLinkForSignatureMethod) == null) {
          UsersServiceGrpc.getCreateMagicLinkForSignatureMethod = getCreateMagicLinkForSignatureMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLinkForSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CreateMagicLinkForSignature"))
              .build();
        }
      }
    }
    return getCreateMagicLinkForSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UpdatePasswordReq,
      com.scailo.sdk.IdentifierResponse> getUpdatePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePassword",
      requestType = com.scailo.sdk.UpdatePasswordReq.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UpdatePasswordReq,
      com.scailo.sdk.IdentifierResponse> getUpdatePasswordMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UpdatePasswordReq, com.scailo.sdk.IdentifierResponse> getUpdatePasswordMethod;
    if ((getUpdatePasswordMethod = UsersServiceGrpc.getUpdatePasswordMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdatePasswordMethod = UsersServiceGrpc.getUpdatePasswordMethod) == null) {
          UsersServiceGrpc.getUpdatePasswordMethod = getUpdatePasswordMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UpdatePasswordReq, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UpdatePasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdatePassword"))
              .build();
        }
      }
    }
    return getUpdatePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UpdateOwnPasswordReq,
      com.scailo.sdk.IdentifierResponse> getUpdateOwnPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOwnPassword",
      requestType = com.scailo.sdk.UpdateOwnPasswordReq.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UpdateOwnPasswordReq,
      com.scailo.sdk.IdentifierResponse> getUpdateOwnPasswordMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UpdateOwnPasswordReq, com.scailo.sdk.IdentifierResponse> getUpdateOwnPasswordMethod;
    if ((getUpdateOwnPasswordMethod = UsersServiceGrpc.getUpdateOwnPasswordMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateOwnPasswordMethod = UsersServiceGrpc.getUpdateOwnPasswordMethod) == null) {
          UsersServiceGrpc.getUpdateOwnPasswordMethod = getUpdateOwnPasswordMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UpdateOwnPasswordReq, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOwnPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UpdateOwnPasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateOwnPassword"))
              .build();
        }
      }
    }
    return getUpdateOwnPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServicePasswordResetReq,
      com.scailo.sdk.MagicLink> getRequestPasswordResetEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestPasswordResetEmail",
      requestType = com.scailo.sdk.UsersServicePasswordResetReq.class,
      responseType = com.scailo.sdk.MagicLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServicePasswordResetReq,
      com.scailo.sdk.MagicLink> getRequestPasswordResetEmailMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServicePasswordResetReq, com.scailo.sdk.MagicLink> getRequestPasswordResetEmailMethod;
    if ((getRequestPasswordResetEmailMethod = UsersServiceGrpc.getRequestPasswordResetEmailMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getRequestPasswordResetEmailMethod = UsersServiceGrpc.getRequestPasswordResetEmailMethod) == null) {
          UsersServiceGrpc.getRequestPasswordResetEmailMethod = getRequestPasswordResetEmailMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServicePasswordResetReq, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestPasswordResetEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServicePasswordResetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("RequestPasswordResetEmail"))
              .build();
        }
      }
    }
    return getRequestPasswordResetEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UploadPictureReq,
      com.scailo.sdk.IdentifierResponse> getUpdateProfilePictureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProfilePicture",
      requestType = com.scailo.sdk.UploadPictureReq.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UploadPictureReq,
      com.scailo.sdk.IdentifierResponse> getUpdateProfilePictureMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UploadPictureReq, com.scailo.sdk.IdentifierResponse> getUpdateProfilePictureMethod;
    if ((getUpdateProfilePictureMethod = UsersServiceGrpc.getUpdateProfilePictureMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateProfilePictureMethod = UsersServiceGrpc.getUpdateProfilePictureMethod) == null) {
          UsersServiceGrpc.getUpdateProfilePictureMethod = getUpdateProfilePictureMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UploadPictureReq, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProfilePicture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UploadPictureReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateProfilePicture"))
              .build();
        }
      }
    }
    return getUpdateProfilePictureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UploadPictureReq,
      com.scailo.sdk.IdentifierResponse> getUpdateSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSignature",
      requestType = com.scailo.sdk.UploadPictureReq.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UploadPictureReq,
      com.scailo.sdk.IdentifierResponse> getUpdateSignatureMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UploadPictureReq, com.scailo.sdk.IdentifierResponse> getUpdateSignatureMethod;
    if ((getUpdateSignatureMethod = UsersServiceGrpc.getUpdateSignatureMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateSignatureMethod = UsersServiceGrpc.getUpdateSignatureMethod) == null) {
          UsersServiceGrpc.getUpdateSignatureMethod = getUpdateSignatureMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UploadPictureReq, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UploadPictureReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateSignature"))
              .build();
        }
      }
    }
    return getUpdateSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getMFAEnableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MFAEnable",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getMFAEnableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getMFAEnableMethod;
    if ((getMFAEnableMethod = UsersServiceGrpc.getMFAEnableMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getMFAEnableMethod = UsersServiceGrpc.getMFAEnableMethod) == null) {
          UsersServiceGrpc.getMFAEnableMethod = getMFAEnableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MFAEnable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("MFAEnable"))
              .build();
        }
      }
    }
    return getMFAEnableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getMFAResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MFAReset",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getMFAResetMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse> getMFAResetMethod;
    if ((getMFAResetMethod = UsersServiceGrpc.getMFAResetMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getMFAResetMethod = UsersServiceGrpc.getMFAResetMethod) == null) {
          UsersServiceGrpc.getMFAResetMethod = getMFAResetMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MFAReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("MFAReset"))
              .build();
        }
      }
    }
    return getMFAResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierZeroable,
      com.scailo.sdk.User> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.IdentifierZeroable.class,
      responseType = com.scailo.sdk.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierZeroable,
      com.scailo.sdk.User> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierZeroable, com.scailo.sdk.User> getViewByIDMethod;
    if ((getViewByIDMethod = UsersServiceGrpc.getViewByIDMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewByIDMethod = UsersServiceGrpc.getViewByIDMethod) == null) {
          UsersServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierZeroable, com.scailo.sdk.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierZeroable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.User> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.User> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.User> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = UsersServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewByUUIDMethod = UsersServiceGrpc.getViewByUUIDMethod) == null) {
          UsersServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.User> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.User> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.User> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = UsersServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = UsersServiceGrpc.getViewEssentialByIDMethod) == null) {
          UsersServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.User> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.User> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.User> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = UsersServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = UsersServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          UsersServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.User> getViewByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUsername",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.User> getViewByUsernameMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.User> getViewByUsernameMethod;
    if ((getViewByUsernameMethod = UsersServiceGrpc.getViewByUsernameMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewByUsernameMethod = UsersServiceGrpc.getViewByUsernameMethod) == null) {
          UsersServiceGrpc.getViewByUsernameMethod = getViewByUsernameMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewByUsername"))
              .build();
        }
      }
    }
    return getViewByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.User> getViewByCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByCode",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.User> getViewByCodeMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.User> getViewByCodeMethod;
    if ((getViewByCodeMethod = UsersServiceGrpc.getViewByCodeMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewByCodeMethod = UsersServiceGrpc.getViewByCodeMethod) == null) {
          UsersServiceGrpc.getViewByCodeMethod = getViewByCodeMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewByCode"))
              .build();
        }
      }
    }
    return getViewByCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.UsersList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.UsersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.UsersList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.UsersList> getViewAllMethod;
    if ((getViewAllMethod = UsersServiceGrpc.getViewAllMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewAllMethod = UsersServiceGrpc.getViewAllMethod) == null) {
          UsersServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.UsersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.UsersList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.UsersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.UsersList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.UsersList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = UsersServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = UsersServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          UsersServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.UsersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServicePaginationReq,
      com.scailo.sdk.UsersServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.UsersServicePaginationReq.class,
      responseType = com.scailo.sdk.UsersServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServicePaginationReq,
      com.scailo.sdk.UsersServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServicePaginationReq, com.scailo.sdk.UsersServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = UsersServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewWithPaginationMethod = UsersServiceGrpc.getViewWithPaginationMethod) == null) {
          UsersServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServicePaginationReq, com.scailo.sdk.UsersServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.UsersList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.UsersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.UsersList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.UsersList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = UsersServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewFromIDsMethod = UsersServiceGrpc.getViewFromIDsMethod) == null) {
          UsersServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.UsersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDsList,
      com.scailo.sdk.UsersList> getViewFromUUIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromUUIDs",
      requestType = com.scailo.sdk.IdentifierUUIDsList.class,
      responseType = com.scailo.sdk.UsersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDsList,
      com.scailo.sdk.UsersList> getViewFromUUIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDsList, com.scailo.sdk.UsersList> getViewFromUUIDsMethod;
    if ((getViewFromUUIDsMethod = UsersServiceGrpc.getViewFromUUIDsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewFromUUIDsMethod = UsersServiceGrpc.getViewFromUUIDsMethod) == null) {
          UsersServiceGrpc.getViewFromUUIDsMethod = getViewFromUUIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDsList, com.scailo.sdk.UsersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromUUIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDsList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewFromUUIDs"))
              .build();
        }
      }
    }
    return getViewFromUUIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.StringsList,
      com.scailo.sdk.UsersList> getViewFromUsernamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromUsernames",
      requestType = com.scailo.sdk.StringsList.class,
      responseType = com.scailo.sdk.UsersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.StringsList,
      com.scailo.sdk.UsersList> getViewFromUsernamesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.StringsList, com.scailo.sdk.UsersList> getViewFromUsernamesMethod;
    if ((getViewFromUsernamesMethod = UsersServiceGrpc.getViewFromUsernamesMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewFromUsernamesMethod = UsersServiceGrpc.getViewFromUsernamesMethod) == null) {
          UsersServiceGrpc.getViewFromUsernamesMethod = getViewFromUsernamesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StringsList, com.scailo.sdk.UsersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromUsernames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StringsList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewFromUsernames"))
              .build();
        }
      }
    }
    return getViewFromUsernamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.User> getViewSelfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSelf",
      requestType = com.scailo.sdk.Empty.class,
      responseType = com.scailo.sdk.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.User> getViewSelfMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Empty, com.scailo.sdk.User> getViewSelfMethod;
    if ((getViewSelfMethod = UsersServiceGrpc.getViewSelfMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewSelfMethod = UsersServiceGrpc.getViewSelfMethod) == null) {
          UsersServiceGrpc.getViewSelfMethod = getViewSelfMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSelf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewSelf"))
              .build();
        }
      }
    }
    return getViewSelfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.MonthAndDayFilter,
      com.scailo.sdk.UsersList> getViewBirthdaysOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewBirthdaysOn",
      requestType = com.scailo.sdk.MonthAndDayFilter.class,
      responseType = com.scailo.sdk.UsersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.MonthAndDayFilter,
      com.scailo.sdk.UsersList> getViewBirthdaysOnMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.MonthAndDayFilter, com.scailo.sdk.UsersList> getViewBirthdaysOnMethod;
    if ((getViewBirthdaysOnMethod = UsersServiceGrpc.getViewBirthdaysOnMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewBirthdaysOnMethod = UsersServiceGrpc.getViewBirthdaysOnMethod) == null) {
          UsersServiceGrpc.getViewBirthdaysOnMethod = getViewBirthdaysOnMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MonthAndDayFilter, com.scailo.sdk.UsersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewBirthdaysOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MonthAndDayFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewBirthdaysOn"))
              .build();
        }
      }
    }
    return getViewBirthdaysOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Base64String> getViewSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewSignature",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Base64String.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Base64String> getViewSignatureMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Base64String> getViewSignatureMethod;
    if ((getViewSignatureMethod = UsersServiceGrpc.getViewSignatureMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewSignatureMethod = UsersServiceGrpc.getViewSignatureMethod) == null) {
          UsersServiceGrpc.getViewSignatureMethod = getViewSignatureMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Base64String>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Base64String.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewSignature"))
              .build();
        }
      }
    }
    return getViewSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewProfilePictureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewProfilePicture",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewProfilePictureMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewProfilePictureMethod;
    if ((getViewProfilePictureMethod = UsersServiceGrpc.getViewProfilePictureMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewProfilePictureMethod = UsersServiceGrpc.getViewProfilePictureMethod) == null) {
          UsersServiceGrpc.getViewProfilePictureMethod = getViewProfilePictureMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewProfilePicture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewProfilePicture"))
              .build();
        }
      }
    }
    return getViewProfilePictureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewThumbnailPictureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewThumbnailPicture",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewThumbnailPictureMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewThumbnailPictureMethod;
    if ((getViewThumbnailPictureMethod = UsersServiceGrpc.getViewThumbnailPictureMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewThumbnailPictureMethod = UsersServiceGrpc.getViewThumbnailPictureMethod) == null) {
          UsersServiceGrpc.getViewThumbnailPictureMethod = getViewThumbnailPictureMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewThumbnailPicture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewThumbnailPicture"))
              .build();
        }
      }
    }
    return getViewThumbnailPictureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewVCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewVCard",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewVCardMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewVCardMethod;
    if ((getViewVCardMethod = UsersServiceGrpc.getViewVCardMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewVCardMethod = UsersServiceGrpc.getViewVCardMethod) == null) {
          UsersServiceGrpc.getViewVCardMethod = getViewVCardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewVCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewVCard"))
              .build();
        }
      }
    }
    return getViewVCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewQRImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewQRImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewQRImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewQRImageMethod;
    if ((getViewQRImageMethod = UsersServiceGrpc.getViewQRImageMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewQRImageMethod = UsersServiceGrpc.getViewQRImageMethod) == null) {
          UsersServiceGrpc.getViewQRImageMethod = getViewQRImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewQRImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewQRImage"))
              .build();
        }
      }
    }
    return getViewQRImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StringResponse> getViewQRStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewQRString",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StringResponse> getViewQRStringMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StringResponse> getViewQRStringMethod;
    if ((getViewQRStringMethod = UsersServiceGrpc.getViewQRStringMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getViewQRStringMethod = UsersServiceGrpc.getViewQRStringMethod) == null) {
          UsersServiceGrpc.getViewQRStringMethod = getViewQRStringMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewQRString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ViewQRString"))
              .build();
        }
      }
    }
    return getViewQRStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.User> getIdentifyCroppedFaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IdentifyCroppedFace",
      requestType = com.scailo.sdk.StandardFile.class,
      responseType = com.scailo.sdk.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.User> getIdentifyCroppedFaceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile, com.scailo.sdk.User> getIdentifyCroppedFaceMethod;
    if ((getIdentifyCroppedFaceMethod = UsersServiceGrpc.getIdentifyCroppedFaceMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getIdentifyCroppedFaceMethod = UsersServiceGrpc.getIdentifyCroppedFaceMethod) == null) {
          UsersServiceGrpc.getIdentifyCroppedFaceMethod = getIdentifyCroppedFaceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IdentifyCroppedFace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("IdentifyCroppedFace"))
              .build();
        }
      }
    }
    return getIdentifyCroppedFaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.User> getIdentifyFullFaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IdentifyFullFace",
      requestType = com.scailo.sdk.StandardFile.class,
      responseType = com.scailo.sdk.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile,
      com.scailo.sdk.User> getIdentifyFullFaceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.StandardFile, com.scailo.sdk.User> getIdentifyFullFaceMethod;
    if ((getIdentifyFullFaceMethod = UsersServiceGrpc.getIdentifyFullFaceMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getIdentifyFullFaceMethod = UsersServiceGrpc.getIdentifyFullFaceMethod) == null) {
          UsersServiceGrpc.getIdentifyFullFaceMethod = getIdentifyFullFaceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IdentifyFullFace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("IdentifyFullFace"))
              .build();
        }
      }
    }
    return getIdentifyFullFaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceSearchAllReq,
      com.scailo.sdk.UsersList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.UsersServiceSearchAllReq.class,
      responseType = com.scailo.sdk.UsersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceSearchAllReq,
      com.scailo.sdk.UsersList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceSearchAllReq, com.scailo.sdk.UsersList> getSearchAllMethod;
    if ((getSearchAllMethod = UsersServiceGrpc.getSearchAllMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSearchAllMethod = UsersServiceGrpc.getSearchAllMethod) == null) {
          UsersServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServiceSearchAllReq, com.scailo.sdk.UsersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceFilterReq,
      com.scailo.sdk.UsersList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.UsersServiceFilterReq.class,
      responseType = com.scailo.sdk.UsersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceFilterReq,
      com.scailo.sdk.UsersList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceFilterReq, com.scailo.sdk.UsersList> getFilterMethod;
    if ((getFilterMethod = UsersServiceGrpc.getFilterMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getFilterMethod = UsersServiceGrpc.getFilterMethod) == null) {
          UsersServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServiceFilterReq, com.scailo.sdk.UsersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("Filter"))
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
    if ((getCountInStatusMethod = UsersServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCountInStatusMethod = UsersServiceGrpc.getCountInStatusMethod) == null) {
          UsersServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.UsersServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = UsersServiceGrpc.getCountMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCountMethod = UsersServiceGrpc.getCountMethod) == null) {
          UsersServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.UsersServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UsersServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = UsersServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = UsersServiceGrpc.getDownloadAsCSVMethod) == null) {
          UsersServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UsersServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UsersServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("DownloadAsCSV"))
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
    if ((getImportFromCSVMethod = UsersServiceGrpc.getImportFromCSVMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getImportFromCSVMethod = UsersServiceGrpc.getImportFromCSVMethod) == null) {
          UsersServiceGrpc.getImportFromCSVMethod = getImportFromCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportFromCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDsList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ImportFromCSV"))
              .build();
        }
      }
    }
    return getImportFromCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub>() {
        @java.lang.Override
        public UsersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceStub(channel, callOptions);
        }
      };
    return UsersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub>() {
        @java.lang.Override
        public UsersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceBlockingStub(channel, callOptions);
        }
      };
    return UsersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub>() {
        @java.lang.Override
        public UsersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceFutureStub(channel, callOptions);
        }
      };
    return UsersServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each user
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Register user's mobile device for push notifications. Returns the ID of the user device record
     * </pre>
     */
    default void registerMobileDevice(com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMobileDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new user and initiates the verification workflow.
     * This method validates all required fields.
     * The user record is created with a `STANDARD_LIFECYCLE_STATUS.PREVERIFY` status.
     * **Side Effects:**
     * - Generates a unique system UUID.
     * - Records an audit log for the "Create" action.
     * **Errors:** // - `ALREADY_EXISTS`: If the `username`, `code`, or `email` is already taken.
     * - `INVALID_ARGUMENT`: If validation rules (e.g., `buf.validate`) fail.
     * </pre>
     */
    default void create(com.scailo.sdk.UsersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Saves a new user record as a draft without triggering side effects.
     * Use this method when you have incomplete information but wish to persist
     * the record for later completion. The user cannot log in while the record is in a `DRAFT` state.
     * **Note:** Some strict validation rules may be relaxed in the backend for drafts
     * </pre>
     */
    default void draft(com.scailo.sdk.UsersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.UsersServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.UsersServiceUpdateRequest request,
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
     * Create a magic link that allows user to upload their signature
     * </pre>
     */
    default void createMagicLinkForSignature(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMagicLinkForSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user's password by another user (such as an administrator)
     * </pre>
     */
    default void updatePassword(com.scailo.sdk.UpdatePasswordReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update user's own password
     * </pre>
     */
    default void updateOwnPassword(com.scailo.sdk.UpdateOwnPasswordReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOwnPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request the password reset email for the given username. An email is triggered if the username is found.
     * </pre>
     */
    default void requestPasswordResetEmail(com.scailo.sdk.UsersServicePasswordResetReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestPasswordResetEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the user's profile picture
     * </pre>
     */
    default void updateProfilePicture(com.scailo.sdk.UploadPictureReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProfilePictureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the user's signature
     * </pre>
     */
    default void updateSignature(com.scailo.sdk.UploadPictureReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enable MFA for user
     * </pre>
     */
    default void mFAEnable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMFAEnableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset MFA for user
     * </pre>
     */
    default void mFAReset(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMFAResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID (returns the entire information about the user, including the logs)
     * </pre>
     */
    default void viewByID(com.scailo.sdk.IdentifierZeroable request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID (logs aren't returned)
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by username (logs aren't returned)
     * </pre>
     */
    default void viewByUsername(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUsernameMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by user's code (logs aren't returned)
     * </pre>
     */
    default void viewByCode(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.UsersServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all users with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all users with the given UUIDs
     * </pre>
     */
    default void viewFromUUIDs(com.scailo.sdk.IdentifierUUIDsList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromUUIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all users with the given usernames
     * </pre>
     */
    default void viewFromUsernames(com.scailo.sdk.StringsList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromUsernamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View self user (the profile of the logged in user)
     * </pre>
     */
    default void viewSelf(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSelfMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all users with birthdays on the given date
     * </pre>
     */
    default void viewBirthdaysOn(com.scailo.sdk.MonthAndDayFilter request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewBirthdaysOnMethod(), responseObserver);
    }

    /**
     * <pre>
     * View user's signature
     * </pre>
     */
    default void viewSignature(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Base64String> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * View user's profile picture
     * </pre>
     */
    default void viewProfilePicture(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewProfilePictureMethod(), responseObserver);
    }

    /**
     * <pre>
     * View user's thumbnail picture
     * </pre>
     */
    default void viewThumbnailPicture(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewThumbnailPictureMethod(), responseObserver);
    }

    /**
     * <pre>
     * View user's VCard
     * </pre>
     */
    default void viewVCard(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewVCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * View user's QR Code as image
     * </pre>
     */
    default void viewQRImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewQRImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View user's QR Code as string
     * </pre>
     */
    default void viewQRString(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewQRStringMethod(), responseObserver);
    }

    /**
     * <pre>
     * View user info on the basis of the provided image. The image should consist of only the user's face. Will return an error if the image has not been recognized.
     * </pre>
     */
    default void identifyCroppedFace(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIdentifyCroppedFaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * View user info on the basis of the provided image. The image should consist of just the user (might be a full sized photo). The face will be cropped. Will return an error if the image has not been recognized.
     * </pre>
     */
    default void identifyFullFace(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIdentifyFullFaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.UsersServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.UsersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
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
    default void count(com.scailo.sdk.UsersServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.UsersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import records using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    default void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportFromCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UsersService.
   * <pre>
   *Describes the common methods applicable on each user
   * </pre>
   */
  public static abstract class UsersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UsersService.
   * <pre>
   *Describes the common methods applicable on each user
   * </pre>
   */
  public static final class UsersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UsersServiceStub> {
    private UsersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register user's mobile device for push notifications. Returns the ID of the user device record
     * </pre>
     */
    public void registerMobileDevice(com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMobileDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new user and initiates the verification workflow.
     * This method validates all required fields.
     * The user record is created with a `STANDARD_LIFECYCLE_STATUS.PREVERIFY` status.
     * **Side Effects:**
     * - Generates a unique system UUID.
     * - Records an audit log for the "Create" action.
     * **Errors:** // - `ALREADY_EXISTS`: If the `username`, `code`, or `email` is already taken.
     * - `INVALID_ARGUMENT`: If validation rules (e.g., `buf.validate`) fail.
     * </pre>
     */
    public void create(com.scailo.sdk.UsersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Saves a new user record as a draft without triggering side effects.
     * Use this method when you have incomplete information but wish to persist
     * the record for later completion. The user cannot log in while the record is in a `DRAFT` state.
     * **Note:** Some strict validation rules may be relaxed in the backend for drafts
     * </pre>
     */
    public void draft(com.scailo.sdk.UsersServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.UsersServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.UsersServiceUpdateRequest request,
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
     * Create a magic link that allows user to upload their signature
     * </pre>
     */
    public void createMagicLinkForSignature(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMagicLinkForSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user's password by another user (such as an administrator)
     * </pre>
     */
    public void updatePassword(com.scailo.sdk.UpdatePasswordReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update user's own password
     * </pre>
     */
    public void updateOwnPassword(com.scailo.sdk.UpdateOwnPasswordReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOwnPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request the password reset email for the given username. An email is triggered if the username is found.
     * </pre>
     */
    public void requestPasswordResetEmail(com.scailo.sdk.UsersServicePasswordResetReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestPasswordResetEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the user's profile picture
     * </pre>
     */
    public void updateProfilePicture(com.scailo.sdk.UploadPictureReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProfilePictureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the user's signature
     * </pre>
     */
    public void updateSignature(com.scailo.sdk.UploadPictureReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enable MFA for user
     * </pre>
     */
    public void mFAEnable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMFAEnableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset MFA for user
     * </pre>
     */
    public void mFAReset(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMFAResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID (returns the entire information about the user, including the logs)
     * </pre>
     */
    public void viewByID(com.scailo.sdk.IdentifierZeroable request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID (logs aren't returned)
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by username (logs aren't returned)
     * </pre>
     */
    public void viewByUsername(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by user's code (logs aren't returned)
     * </pre>
     */
    public void viewByCode(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.UsersServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all users with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all users with the given UUIDs
     * </pre>
     */
    public void viewFromUUIDs(com.scailo.sdk.IdentifierUUIDsList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromUUIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all users with the given usernames
     * </pre>
     */
    public void viewFromUsernames(com.scailo.sdk.StringsList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromUsernamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View self user (the profile of the logged in user)
     * </pre>
     */
    public void viewSelf(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSelfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all users with birthdays on the given date
     * </pre>
     */
    public void viewBirthdaysOn(com.scailo.sdk.MonthAndDayFilter request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewBirthdaysOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View user's signature
     * </pre>
     */
    public void viewSignature(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Base64String> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View user's profile picture
     * </pre>
     */
    public void viewProfilePicture(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewProfilePictureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View user's thumbnail picture
     * </pre>
     */
    public void viewThumbnailPicture(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewThumbnailPictureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View user's VCard
     * </pre>
     */
    public void viewVCard(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewVCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View user's QR Code as image
     * </pre>
     */
    public void viewQRImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewQRImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View user's QR Code as string
     * </pre>
     */
    public void viewQRString(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewQRStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View user info on the basis of the provided image. The image should consist of only the user's face. Will return an error if the image has not been recognized.
     * </pre>
     */
    public void identifyCroppedFace(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIdentifyCroppedFaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View user info on the basis of the provided image. The image should consist of just the user (might be a full sized photo). The face will be cropped. Will return an error if the image has not been recognized.
     * </pre>
     */
    public void identifyFullFace(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIdentifyFullFaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.UsersServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.UsersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList> responseObserver) {
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
    public void count(com.scailo.sdk.UsersServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.UsersServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import records using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    public void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UsersService.
   * <pre>
   *Describes the common methods applicable on each user
   * </pre>
   */
  public static final class UsersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UsersServiceBlockingStub> {
    private UsersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register user's mobile device for push notifications. Returns the ID of the user device record
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse registerMobileDevice(com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMobileDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new user and initiates the verification workflow.
     * This method validates all required fields.
     * The user record is created with a `STANDARD_LIFECYCLE_STATUS.PREVERIFY` status.
     * **Side Effects:**
     * - Generates a unique system UUID.
     * - Records an audit log for the "Create" action.
     * **Errors:** // - `ALREADY_EXISTS`: If the `username`, `code`, or `email` is already taken.
     * - `INVALID_ARGUMENT`: If validation rules (e.g., `buf.validate`) fail.
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.UsersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Saves a new user record as a draft without triggering side effects.
     * Use this method when you have incomplete information but wish to persist
     * the record for later completion. The user cannot log in while the record is in a `DRAFT` state.
     * **Note:** Some strict validation rules may be relaxed in the backend for drafts
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.UsersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.UsersServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.UsersServiceUpdateRequest request) {
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
     * Create a magic link that allows user to upload their signature
     * </pre>
     */
    public com.scailo.sdk.MagicLink createMagicLinkForSignature(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMagicLinkForSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user's password by another user (such as an administrator)
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse updatePassword(com.scailo.sdk.UpdatePasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update user's own password
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse updateOwnPassword(com.scailo.sdk.UpdateOwnPasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOwnPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request the password reset email for the given username. An email is triggered if the username is found.
     * </pre>
     */
    public com.scailo.sdk.MagicLink requestPasswordResetEmail(com.scailo.sdk.UsersServicePasswordResetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestPasswordResetEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the user's profile picture
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse updateProfilePicture(com.scailo.sdk.UploadPictureReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProfilePictureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the user's signature
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse updateSignature(com.scailo.sdk.UploadPictureReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enable MFA for user
     * </pre>
     */
    public com.scailo.sdk.ImageResponse mFAEnable(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMFAEnableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset MFA for user
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse mFAReset(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMFAResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID (returns the entire information about the user, including the logs)
     * </pre>
     */
    public com.scailo.sdk.User viewByID(com.scailo.sdk.IdentifierZeroable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID (logs aren't returned)
     * </pre>
     */
    public com.scailo.sdk.User viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.User viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.User viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by username (logs aren't returned)
     * </pre>
     */
    public com.scailo.sdk.User viewByUsername(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUsernameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by user's code (logs aren't returned)
     * </pre>
     */
    public com.scailo.sdk.User viewByCode(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.UsersList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.UsersList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.UsersServicePaginationResponse viewWithPagination(com.scailo.sdk.UsersServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all users with the given IDs
     * </pre>
     */
    public com.scailo.sdk.UsersList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all users with the given UUIDs
     * </pre>
     */
    public com.scailo.sdk.UsersList viewFromUUIDs(com.scailo.sdk.IdentifierUUIDsList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromUUIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all users with the given usernames
     * </pre>
     */
    public com.scailo.sdk.UsersList viewFromUsernames(com.scailo.sdk.StringsList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromUsernamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View self user (the profile of the logged in user)
     * </pre>
     */
    public com.scailo.sdk.User viewSelf(com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSelfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all users with birthdays on the given date
     * </pre>
     */
    public com.scailo.sdk.UsersList viewBirthdaysOn(com.scailo.sdk.MonthAndDayFilter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewBirthdaysOnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View user's signature
     * </pre>
     */
    public com.scailo.sdk.Base64String viewSignature(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View user's profile picture
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewProfilePicture(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewProfilePictureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View user's thumbnail picture
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewThumbnailPicture(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewThumbnailPictureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View user's VCard
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewVCard(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewVCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View user's QR Code as image
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewQRImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewQRImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View user's QR Code as string
     * </pre>
     */
    public com.scailo.sdk.StringResponse viewQRString(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewQRStringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View user info on the basis of the provided image. The image should consist of only the user's face. Will return an error if the image has not been recognized.
     * </pre>
     */
    public com.scailo.sdk.User identifyCroppedFace(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIdentifyCroppedFaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View user info on the basis of the provided image. The image should consist of just the user (might be a full sized photo). The face will be cropped. Will return an error if the image has not been recognized.
     * </pre>
     */
    public com.scailo.sdk.User identifyFullFace(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIdentifyFullFaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.UsersList searchAll(com.scailo.sdk.UsersServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.UsersList filter(com.scailo.sdk.UsersServiceFilterReq request) {
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
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.UsersServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.UsersServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import records using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUIDsList importFromCSV(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportFromCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UsersService.
   * <pre>
   *Describes the common methods applicable on each user
   * </pre>
   */
  public static final class UsersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UsersServiceFutureStub> {
    private UsersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register user's mobile device for push notifications. Returns the ID of the user device record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> registerMobileDevice(
        com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMobileDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new user and initiates the verification workflow.
     * This method validates all required fields.
     * The user record is created with a `STANDARD_LIFECYCLE_STATUS.PREVERIFY` status.
     * **Side Effects:**
     * - Generates a unique system UUID.
     * - Records an audit log for the "Create" action.
     * **Errors:** // - `ALREADY_EXISTS`: If the `username`, `code`, or `email` is already taken.
     * - `INVALID_ARGUMENT`: If validation rules (e.g., `buf.validate`) fail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.UsersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Saves a new user record as a draft without triggering side effects.
     * Use this method when you have incomplete information but wish to persist
     * the record for later completion. The user cannot log in while the record is in a `DRAFT` state.
     * **Note:** Some strict validation rules may be relaxed in the backend for drafts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.UsersServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.UsersServiceUpdateRequest request) {
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
        com.scailo.sdk.UsersServiceUpdateRequest request) {
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
     * Create a magic link that allows user to upload their signature
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MagicLink> createMagicLinkForSignature(
        com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMagicLinkForSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user's password by another user (such as an administrator)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> updatePassword(
        com.scailo.sdk.UpdatePasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update user's own password
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> updateOwnPassword(
        com.scailo.sdk.UpdateOwnPasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOwnPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request the password reset email for the given username. An email is triggered if the username is found.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.MagicLink> requestPasswordResetEmail(
        com.scailo.sdk.UsersServicePasswordResetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestPasswordResetEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the user's profile picture
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> updateProfilePicture(
        com.scailo.sdk.UploadPictureReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProfilePictureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the user's signature
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> updateSignature(
        com.scailo.sdk.UploadPictureReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enable MFA for user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> mFAEnable(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMFAEnableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset MFA for user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> mFAReset(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMFAResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID (returns the entire information about the user, including the logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.User> viewByID(
        com.scailo.sdk.IdentifierZeroable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID (logs aren't returned)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.User> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.User> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.User> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by username (logs aren't returned)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.User> viewByUsername(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUsernameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by user's code (logs aren't returned)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.User> viewByCode(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UsersList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UsersList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UsersServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.UsersServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all users with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UsersList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all users with the given UUIDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UsersList> viewFromUUIDs(
        com.scailo.sdk.IdentifierUUIDsList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromUUIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all users with the given usernames
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UsersList> viewFromUsernames(
        com.scailo.sdk.StringsList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromUsernamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View self user (the profile of the logged in user)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.User> viewSelf(
        com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSelfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all users with birthdays on the given date
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UsersList> viewBirthdaysOn(
        com.scailo.sdk.MonthAndDayFilter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewBirthdaysOnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View user's signature
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Base64String> viewSignature(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View user's profile picture
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewProfilePicture(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewProfilePictureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View user's thumbnail picture
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewThumbnailPicture(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewThumbnailPictureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View user's VCard
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewVCard(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewVCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View user's QR Code as image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewQRImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewQRImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View user's QR Code as string
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StringResponse> viewQRString(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewQRStringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View user info on the basis of the provided image. The image should consist of only the user's face. Will return an error if the image has not been recognized.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.User> identifyCroppedFace(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIdentifyCroppedFaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View user info on the basis of the provided image. The image should consist of just the user (might be a full sized photo). The face will be cropped. Will return an error if the image has not been recognized.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.User> identifyFullFace(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIdentifyFullFaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UsersList> searchAll(
        com.scailo.sdk.UsersServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UsersList> filter(
        com.scailo.sdk.UsersServiceFilterReq request) {
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
        com.scailo.sdk.UsersServiceCountReq request) {
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
        com.scailo.sdk.UsersServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import records using a CSV file (duplicate codes will be skipped)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUIDsList> importFromCSV(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_MOBILE_DEVICE = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_DRAFT = 2;
  private static final int METHODID_DRAFT_UPDATE = 3;
  private static final int METHODID_SEND_FOR_VERIFICATION = 4;
  private static final int METHODID_VERIFY = 5;
  private static final int METHODID_APPROVE = 6;
  private static final int METHODID_SEND_FOR_REVISION = 7;
  private static final int METHODID_REVISION_UPDATE = 8;
  private static final int METHODID_HALT = 9;
  private static final int METHODID_DISCARD = 10;
  private static final int METHODID_RESTORE = 11;
  private static final int METHODID_COMMENT_ADD = 12;
  private static final int METHODID_CREATE_MAGIC_LINK_FOR_SIGNATURE = 13;
  private static final int METHODID_UPDATE_PASSWORD = 14;
  private static final int METHODID_UPDATE_OWN_PASSWORD = 15;
  private static final int METHODID_REQUEST_PASSWORD_RESET_EMAIL = 16;
  private static final int METHODID_UPDATE_PROFILE_PICTURE = 17;
  private static final int METHODID_UPDATE_SIGNATURE = 18;
  private static final int METHODID_MFAENABLE = 19;
  private static final int METHODID_MFARESET = 20;
  private static final int METHODID_VIEW_BY_ID = 21;
  private static final int METHODID_VIEW_BY_UUID = 22;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 23;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 24;
  private static final int METHODID_VIEW_BY_USERNAME = 25;
  private static final int METHODID_VIEW_BY_CODE = 26;
  private static final int METHODID_VIEW_ALL = 27;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 28;
  private static final int METHODID_VIEW_WITH_PAGINATION = 29;
  private static final int METHODID_VIEW_FROM_IDS = 30;
  private static final int METHODID_VIEW_FROM_UUIDS = 31;
  private static final int METHODID_VIEW_FROM_USERNAMES = 32;
  private static final int METHODID_VIEW_SELF = 33;
  private static final int METHODID_VIEW_BIRTHDAYS_ON = 34;
  private static final int METHODID_VIEW_SIGNATURE = 35;
  private static final int METHODID_VIEW_PROFILE_PICTURE = 36;
  private static final int METHODID_VIEW_THUMBNAIL_PICTURE = 37;
  private static final int METHODID_VIEW_VCARD = 38;
  private static final int METHODID_VIEW_QRIMAGE = 39;
  private static final int METHODID_VIEW_QRSTRING = 40;
  private static final int METHODID_IDENTIFY_CROPPED_FACE = 41;
  private static final int METHODID_IDENTIFY_FULL_FACE = 42;
  private static final int METHODID_SEARCH_ALL = 43;
  private static final int METHODID_FILTER = 44;
  private static final int METHODID_COUNT_IN_STATUS = 45;
  private static final int METHODID_COUNT = 46;
  private static final int METHODID_DOWNLOAD_AS_CSV = 47;
  private static final int METHODID_IMPORT_FROM_CSV = 48;

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
        case METHODID_REGISTER_MOBILE_DEVICE:
          serviceImpl.registerMobileDevice((com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.scailo.sdk.UsersServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.UsersServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.UsersServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.UsersServiceUpdateRequest) request,
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
        case METHODID_CREATE_MAGIC_LINK_FOR_SIGNATURE:
          serviceImpl.createMagicLinkForSignature((com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink>) responseObserver);
          break;
        case METHODID_UPDATE_PASSWORD:
          serviceImpl.updatePassword((com.scailo.sdk.UpdatePasswordReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OWN_PASSWORD:
          serviceImpl.updateOwnPassword((com.scailo.sdk.UpdateOwnPasswordReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REQUEST_PASSWORD_RESET_EMAIL:
          serviceImpl.requestPasswordResetEmail((com.scailo.sdk.UsersServicePasswordResetReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE_PICTURE:
          serviceImpl.updateProfilePicture((com.scailo.sdk.UploadPictureReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SIGNATURE:
          serviceImpl.updateSignature((com.scailo.sdk.UploadPictureReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_MFAENABLE:
          serviceImpl.mFAEnable((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_MFARESET:
          serviceImpl.mFAReset((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.IdentifierZeroable) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.User>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.User>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.User>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.User>) responseObserver);
          break;
        case METHODID_VIEW_BY_USERNAME:
          serviceImpl.viewByUsername((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.User>) responseObserver);
          break;
        case METHODID_VIEW_BY_CODE:
          serviceImpl.viewByCode((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.User>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.UsersServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UsersServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList>) responseObserver);
          break;
        case METHODID_VIEW_FROM_UUIDS:
          serviceImpl.viewFromUUIDs((com.scailo.sdk.IdentifierUUIDsList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList>) responseObserver);
          break;
        case METHODID_VIEW_FROM_USERNAMES:
          serviceImpl.viewFromUsernames((com.scailo.sdk.StringsList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList>) responseObserver);
          break;
        case METHODID_VIEW_SELF:
          serviceImpl.viewSelf((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.User>) responseObserver);
          break;
        case METHODID_VIEW_BIRTHDAYS_ON:
          serviceImpl.viewBirthdaysOn((com.scailo.sdk.MonthAndDayFilter) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList>) responseObserver);
          break;
        case METHODID_VIEW_SIGNATURE:
          serviceImpl.viewSignature((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Base64String>) responseObserver);
          break;
        case METHODID_VIEW_PROFILE_PICTURE:
          serviceImpl.viewProfilePicture((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_VIEW_THUMBNAIL_PICTURE:
          serviceImpl.viewThumbnailPicture((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_VIEW_VCARD:
          serviceImpl.viewVCard((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_VIEW_QRIMAGE:
          serviceImpl.viewQRImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_VIEW_QRSTRING:
          serviceImpl.viewQRString((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StringResponse>) responseObserver);
          break;
        case METHODID_IDENTIFY_CROPPED_FACE:
          serviceImpl.identifyCroppedFace((com.scailo.sdk.StandardFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.User>) responseObserver);
          break;
        case METHODID_IDENTIFY_FULL_FACE:
          serviceImpl.identifyFullFace((com.scailo.sdk.StandardFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.User>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.UsersServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.UsersServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UsersList>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.UsersServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.UsersServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_IMPORT_FROM_CSV:
          serviceImpl.importFromCSV((com.scailo.sdk.StandardFile) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList>) responseObserver);
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
          getRegisterMobileDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UsersServiceRegisterMobileDeviceRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REGISTER_MOBILE_DEVICE)))
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UsersServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UsersServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UsersServiceUpdateRequest,
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
              com.scailo.sdk.UsersServiceUpdateRequest,
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
          getCreateMagicLinkForSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource,
              com.scailo.sdk.MagicLink>(
                service, METHODID_CREATE_MAGIC_LINK_FOR_SIGNATURE)))
        .addMethod(
          getUpdatePasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UpdatePasswordReq,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE_PASSWORD)))
        .addMethod(
          getUpdateOwnPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UpdateOwnPasswordReq,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE_OWN_PASSWORD)))
        .addMethod(
          getRequestPasswordResetEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UsersServicePasswordResetReq,
              com.scailo.sdk.MagicLink>(
                service, METHODID_REQUEST_PASSWORD_RESET_EMAIL)))
        .addMethod(
          getUpdateProfilePictureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UploadPictureReq,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE_PROFILE_PICTURE)))
        .addMethod(
          getUpdateSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UploadPictureReq,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE_SIGNATURE)))
        .addMethod(
          getMFAEnableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_MFAENABLE)))
        .addMethod(
          getMFAResetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_MFARESET)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierZeroable,
              com.scailo.sdk.User>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.User>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.User>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.User>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewByUsernameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.User>(
                service, METHODID_VIEW_BY_USERNAME)))
        .addMethod(
          getViewByCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.User>(
                service, METHODID_VIEW_BY_CODE)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.UsersList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.UsersList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UsersServicePaginationReq,
              com.scailo.sdk.UsersServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.UsersList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewFromUUIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDsList,
              com.scailo.sdk.UsersList>(
                service, METHODID_VIEW_FROM_UUIDS)))
        .addMethod(
          getViewFromUsernamesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StringsList,
              com.scailo.sdk.UsersList>(
                service, METHODID_VIEW_FROM_USERNAMES)))
        .addMethod(
          getViewSelfMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Empty,
              com.scailo.sdk.User>(
                service, METHODID_VIEW_SELF)))
        .addMethod(
          getViewBirthdaysOnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.MonthAndDayFilter,
              com.scailo.sdk.UsersList>(
                service, METHODID_VIEW_BIRTHDAYS_ON)))
        .addMethod(
          getViewSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Base64String>(
                service, METHODID_VIEW_SIGNATURE)))
        .addMethod(
          getViewProfilePictureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_PROFILE_PICTURE)))
        .addMethod(
          getViewThumbnailPictureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_THUMBNAIL_PICTURE)))
        .addMethod(
          getViewVCardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_VCARD)))
        .addMethod(
          getViewQRImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_QRIMAGE)))
        .addMethod(
          getViewQRStringMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StringResponse>(
                service, METHODID_VIEW_QRSTRING)))
        .addMethod(
          getIdentifyCroppedFaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.User>(
                service, METHODID_IDENTIFY_CROPPED_FACE)))
        .addMethod(
          getIdentifyFullFaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.User>(
                service, METHODID_IDENTIFY_FULL_FACE)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UsersServiceSearchAllReq,
              com.scailo.sdk.UsersList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UsersServiceFilterReq,
              com.scailo.sdk.UsersList>(
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
              com.scailo.sdk.UsersServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UsersServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .addMethod(
          getImportFromCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.IdentifierUUIDsList>(
                service, METHODID_IMPORT_FROM_CSV)))
        .build();
  }

  private static abstract class UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.UsersScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsersService");
    }
  }

  private static final class UsersServiceFileDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier {
    UsersServiceFileDescriptorSupplier() {}
  }

  private static final class UsersServiceMethodDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UsersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UsersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersServiceFileDescriptorSupplier())
              .addMethod(getRegisterMobileDeviceMethod())
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
              .addMethod(getCreateMagicLinkForSignatureMethod())
              .addMethod(getUpdatePasswordMethod())
              .addMethod(getUpdateOwnPasswordMethod())
              .addMethod(getRequestPasswordResetEmailMethod())
              .addMethod(getUpdateProfilePictureMethod())
              .addMethod(getUpdateSignatureMethod())
              .addMethod(getMFAEnableMethod())
              .addMethod(getMFAResetMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewByUsernameMethod())
              .addMethod(getViewByCodeMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewAllForEntityUUIDMethod())
              .addMethod(getViewWithPaginationMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewFromUUIDsMethod())
              .addMethod(getViewFromUsernamesMethod())
              .addMethod(getViewSelfMethod())
              .addMethod(getViewBirthdaysOnMethod())
              .addMethod(getViewSignatureMethod())
              .addMethod(getViewProfilePictureMethod())
              .addMethod(getViewThumbnailPictureMethod())
              .addMethod(getViewVCardMethod())
              .addMethod(getViewQRImageMethod())
              .addMethod(getViewQRStringMethod())
              .addMethod(getIdentifyCroppedFaceMethod())
              .addMethod(getIdentifyFullFaceMethod())
              .addMethod(getSearchAllMethod())
              .addMethod(getFilterMethod())
              .addMethod(getCountInStatusMethod())
              .addMethod(getCountMethod())
              .addMethod(getDownloadAsCSVMethod())
              .addMethod(getImportFromCSVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
