package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each attendance
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: attendances.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AttendancesServiceGrpc {

  private AttendancesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.AttendancesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.AttendancesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = AttendancesServiceGrpc.getCreateMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getCreateMethod = AttendancesServiceGrpc.getCreateMethod) == null) {
          AttendancesServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draft",
      requestType = com.scailo.sdk.AttendancesServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getDraftMethod;
    if ((getDraftMethod = AttendancesServiceGrpc.getDraftMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getDraftMethod = AttendancesServiceGrpc.getDraftMethod) == null) {
          AttendancesServiceGrpc.getDraftMethod = getDraftMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Draft"))
              .build();
        }
      }
    }
    return getDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DraftUpdate",
      requestType = com.scailo.sdk.AttendancesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getDraftUpdateMethod;
    if ((getDraftUpdateMethod = AttendancesServiceGrpc.getDraftUpdateMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getDraftUpdateMethod = AttendancesServiceGrpc.getDraftUpdateMethod) == null) {
          AttendancesServiceGrpc.getDraftUpdateMethod = getDraftUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DraftUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("DraftUpdate"))
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
    if ((getSendForVerificationMethod = AttendancesServiceGrpc.getSendForVerificationMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getSendForVerificationMethod = AttendancesServiceGrpc.getSendForVerificationMethod) == null) {
          AttendancesServiceGrpc.getSendForVerificationMethod = getSendForVerificationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("SendForVerification"))
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
    if ((getVerifyMethod = AttendancesServiceGrpc.getVerifyMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getVerifyMethod = AttendancesServiceGrpc.getVerifyMethod) == null) {
          AttendancesServiceGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Verify"))
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
    if ((getApproveMethod = AttendancesServiceGrpc.getApproveMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getApproveMethod = AttendancesServiceGrpc.getApproveMethod) == null) {
          AttendancesServiceGrpc.getApproveMethod = getApproveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Approve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Approve"))
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
    if ((getSendForRevisionMethod = AttendancesServiceGrpc.getSendForRevisionMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getSendForRevisionMethod = AttendancesServiceGrpc.getSendForRevisionMethod) == null) {
          AttendancesServiceGrpc.getSendForRevisionMethod = getSendForRevisionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("SendForRevision"))
              .build();
        }
      }
    }
    return getSendForRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevisionUpdate",
      requestType = com.scailo.sdk.AttendancesServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getRevisionUpdateMethod;
    if ((getRevisionUpdateMethod = AttendancesServiceGrpc.getRevisionUpdateMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getRevisionUpdateMethod = AttendancesServiceGrpc.getRevisionUpdateMethod) == null) {
          AttendancesServiceGrpc.getRevisionUpdateMethod = getRevisionUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevisionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("RevisionUpdate"))
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
    if ((getHaltMethod = AttendancesServiceGrpc.getHaltMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getHaltMethod = AttendancesServiceGrpc.getHaltMethod) == null) {
          AttendancesServiceGrpc.getHaltMethod = getHaltMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Halt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Halt"))
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
    if ((getDiscardMethod = AttendancesServiceGrpc.getDiscardMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getDiscardMethod = AttendancesServiceGrpc.getDiscardMethod) == null) {
          AttendancesServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Discard"))
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
    if ((getRestoreMethod = AttendancesServiceGrpc.getRestoreMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getRestoreMethod = AttendancesServiceGrpc.getRestoreMethod) == null) {
          AttendancesServiceGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Restore"))
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
    if ((getCompleteMethod = AttendancesServiceGrpc.getCompleteMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getCompleteMethod = AttendancesServiceGrpc.getCompleteMethod) == null) {
          AttendancesServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Complete"))
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
    if ((getRepeatMethod = AttendancesServiceGrpc.getRepeatMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getRepeatMethod = AttendancesServiceGrpc.getRepeatMethod) == null) {
          AttendancesServiceGrpc.getRepeatMethod = getRepeatMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Repeat"))
              .build();
        }
      }
    }
    return getRepeatMethod;
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
    if ((getCommentAddMethod = AttendancesServiceGrpc.getCommentAddMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getCommentAddMethod = AttendancesServiceGrpc.getCommentAddMethod) == null) {
          AttendancesServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getCreateMagicLinkMethod = AttendancesServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = AttendancesServiceGrpc.getCreateMagicLinkMethod) == null) {
          AttendancesServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("CreateMagicLink"))
              .build();
        }
      }
    }
    return getCreateMagicLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceImageEntryRequest,
      com.scailo.sdk.IdentifierResponse> getRecordImageEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordImageEntry",
      requestType = com.scailo.sdk.AttendancesServiceImageEntryRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceImageEntryRequest,
      com.scailo.sdk.IdentifierResponse> getRecordImageEntryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceImageEntryRequest, com.scailo.sdk.IdentifierResponse> getRecordImageEntryMethod;
    if ((getRecordImageEntryMethod = AttendancesServiceGrpc.getRecordImageEntryMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getRecordImageEntryMethod = AttendancesServiceGrpc.getRecordImageEntryMethod) == null) {
          AttendancesServiceGrpc.getRecordImageEntryMethod = getRecordImageEntryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceImageEntryRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordImageEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceImageEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("RecordImageEntry"))
              .build();
        }
      }
    }
    return getRecordImageEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceImageExitRequest,
      com.scailo.sdk.IdentifierResponse> getRecordImageExitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordImageExit",
      requestType = com.scailo.sdk.AttendancesServiceImageExitRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceImageExitRequest,
      com.scailo.sdk.IdentifierResponse> getRecordImageExitMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceImageExitRequest, com.scailo.sdk.IdentifierResponse> getRecordImageExitMethod;
    if ((getRecordImageExitMethod = AttendancesServiceGrpc.getRecordImageExitMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getRecordImageExitMethod = AttendancesServiceGrpc.getRecordImageExitMethod) == null) {
          AttendancesServiceGrpc.getRecordImageExitMethod = getRecordImageExitMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceImageExitRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordImageExit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceImageExitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("RecordImageExit"))
              .build();
        }
      }
    }
    return getRecordImageExitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Attendance> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Attendance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Attendance> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Attendance> getViewByIDMethod;
    if ((getViewByIDMethod = AttendancesServiceGrpc.getViewByIDMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewByIDMethod = AttendancesServiceGrpc.getViewByIDMethod) == null) {
          AttendancesServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Attendance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Attendance.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Attendance> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Attendance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Attendance> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Attendance> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = AttendancesServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewByUUIDMethod = AttendancesServiceGrpc.getViewByUUIDMethod) == null) {
          AttendancesServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Attendance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Attendance.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Attendance> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Attendance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Attendance> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Attendance> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = AttendancesServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = AttendancesServiceGrpc.getViewEssentialByIDMethod) == null) {
          AttendancesServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Attendance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Attendance.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Attendance> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Attendance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Attendance> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Attendance> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = AttendancesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = AttendancesServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          AttendancesServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Attendance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Attendance.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.AttendancesList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.AttendancesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.AttendancesList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.AttendancesList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = AttendancesServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewFromIDsMethod = AttendancesServiceGrpc.getViewFromIDsMethod) == null) {
          AttendancesServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.AttendancesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesList.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.AttendancesList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.AttendancesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.AttendancesList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.AttendancesList> getViewAllMethod;
    if ((getViewAllMethod = AttendancesServiceGrpc.getViewAllMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewAllMethod = AttendancesServiceGrpc.getViewAllMethod) == null) {
          AttendancesServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.AttendancesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesList.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.AttendancesList> getViewAllForEntityUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllForEntityUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.AttendancesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.AttendancesList> getViewAllForEntityUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.AttendancesList> getViewAllForEntityUUIDMethod;
    if ((getViewAllForEntityUUIDMethod = AttendancesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewAllForEntityUUIDMethod = AttendancesServiceGrpc.getViewAllForEntityUUIDMethod) == null) {
          AttendancesServiceGrpc.getViewAllForEntityUUIDMethod = getViewAllForEntityUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.AttendancesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllForEntityUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesList.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewAllForEntityUUID"))
              .build();
        }
      }
    }
    return getViewAllForEntityUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServicePaginationReq,
      com.scailo.sdk.AttendancesServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.AttendancesServicePaginationReq.class,
      responseType = com.scailo.sdk.AttendancesServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServicePaginationReq,
      com.scailo.sdk.AttendancesServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServicePaginationReq, com.scailo.sdk.AttendancesServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = AttendancesServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewWithPaginationMethod = AttendancesServiceGrpc.getViewWithPaginationMethod) == null) {
          AttendancesServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServicePaginationReq, com.scailo.sdk.AttendancesServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewEntryImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEntryImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewEntryImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewEntryImageMethod;
    if ((getViewEntryImageMethod = AttendancesServiceGrpc.getViewEntryImageMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewEntryImageMethod = AttendancesServiceGrpc.getViewEntryImageMethod) == null) {
          AttendancesServiceGrpc.getViewEntryImageMethod = getViewEntryImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEntryImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewEntryImage"))
              .build();
        }
      }
    }
    return getViewEntryImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getConfirmEntryImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmEntryImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getConfirmEntryImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getConfirmEntryImageMethod;
    if ((getConfirmEntryImageMethod = AttendancesServiceGrpc.getConfirmEntryImageMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getConfirmEntryImageMethod = AttendancesServiceGrpc.getConfirmEntryImageMethod) == null) {
          AttendancesServiceGrpc.getConfirmEntryImageMethod = getConfirmEntryImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmEntryImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ConfirmEntryImage"))
              .build();
        }
      }
    }
    return getConfirmEntryImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewExitImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewExitImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewExitImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewExitImageMethod;
    if ((getViewExitImageMethod = AttendancesServiceGrpc.getViewExitImageMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewExitImageMethod = AttendancesServiceGrpc.getViewExitImageMethod) == null) {
          AttendancesServiceGrpc.getViewExitImageMethod = getViewExitImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewExitImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewExitImage"))
              .build();
        }
      }
    }
    return getViewExitImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getConfirmExitImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmExitImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.BooleanResponse> getConfirmExitImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse> getConfirmExitImageMethod;
    if ((getConfirmExitImageMethod = AttendancesServiceGrpc.getConfirmExitImageMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getConfirmExitImageMethod = AttendancesServiceGrpc.getConfirmExitImageMethod) == null) {
          AttendancesServiceGrpc.getConfirmExitImageMethod = getConfirmExitImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmExitImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ConfirmExitImage"))
              .build();
        }
      }
    }
    return getConfirmExitImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GPSCoordinatesResponse> getViewEntryGPSCoordinatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEntryGPSCoordinates",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GPSCoordinatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GPSCoordinatesResponse> getViewEntryGPSCoordinatesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GPSCoordinatesResponse> getViewEntryGPSCoordinatesMethod;
    if ((getViewEntryGPSCoordinatesMethod = AttendancesServiceGrpc.getViewEntryGPSCoordinatesMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewEntryGPSCoordinatesMethod = AttendancesServiceGrpc.getViewEntryGPSCoordinatesMethod) == null) {
          AttendancesServiceGrpc.getViewEntryGPSCoordinatesMethod = getViewEntryGPSCoordinatesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GPSCoordinatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEntryGPSCoordinates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GPSCoordinatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewEntryGPSCoordinates"))
              .build();
        }
      }
    }
    return getViewEntryGPSCoordinatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GPSCoordinatesResponse> getViewExitGPSCoordinatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewExitGPSCoordinates",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GPSCoordinatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GPSCoordinatesResponse> getViewExitGPSCoordinatesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GPSCoordinatesResponse> getViewExitGPSCoordinatesMethod;
    if ((getViewExitGPSCoordinatesMethod = AttendancesServiceGrpc.getViewExitGPSCoordinatesMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewExitGPSCoordinatesMethod = AttendancesServiceGrpc.getViewExitGPSCoordinatesMethod) == null) {
          AttendancesServiceGrpc.getViewExitGPSCoordinatesMethod = getViewExitGPSCoordinatesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GPSCoordinatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewExitGPSCoordinates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GPSCoordinatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewExitGPSCoordinates"))
              .build();
        }
      }
    }
    return getViewExitGPSCoordinatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewEntryGPSStaticImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEntryGPSStaticImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewEntryGPSStaticImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewEntryGPSStaticImageMethod;
    if ((getViewEntryGPSStaticImageMethod = AttendancesServiceGrpc.getViewEntryGPSStaticImageMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewEntryGPSStaticImageMethod = AttendancesServiceGrpc.getViewEntryGPSStaticImageMethod) == null) {
          AttendancesServiceGrpc.getViewEntryGPSStaticImageMethod = getViewEntryGPSStaticImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEntryGPSStaticImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewEntryGPSStaticImage"))
              .build();
        }
      }
    }
    return getViewEntryGPSStaticImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewExitGPSStaticImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewExitGPSStaticImage",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.ImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.ImageResponse> getViewExitGPSStaticImageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse> getViewExitGPSStaticImageMethod;
    if ((getViewExitGPSStaticImageMethod = AttendancesServiceGrpc.getViewExitGPSStaticImageMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewExitGPSStaticImageMethod = AttendancesServiceGrpc.getViewExitGPSStaticImageMethod) == null) {
          AttendancesServiceGrpc.getViewExitGPSStaticImageMethod = getViewExitGPSStaticImageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.ImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewExitGPSStaticImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewExitGPSStaticImage"))
              .build();
        }
      }
    }
    return getViewExitGPSStaticImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Attendance> getViewOpenAttendanceForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOpenAttendanceForUser",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Attendance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Attendance> getViewOpenAttendanceForUserMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Attendance> getViewOpenAttendanceForUserMethod;
    if ((getViewOpenAttendanceForUserMethod = AttendancesServiceGrpc.getViewOpenAttendanceForUserMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getViewOpenAttendanceForUserMethod = AttendancesServiceGrpc.getViewOpenAttendanceForUserMethod) == null) {
          AttendancesServiceGrpc.getViewOpenAttendanceForUserMethod = getViewOpenAttendanceForUserMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Attendance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOpenAttendanceForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Attendance.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("ViewOpenAttendanceForUser"))
              .build();
        }
      }
    }
    return getViewOpenAttendanceForUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceSearchAllReq,
      com.scailo.sdk.AttendancesList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.AttendancesServiceSearchAllReq.class,
      responseType = com.scailo.sdk.AttendancesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceSearchAllReq,
      com.scailo.sdk.AttendancesList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceSearchAllReq, com.scailo.sdk.AttendancesList> getSearchAllMethod;
    if ((getSearchAllMethod = AttendancesServiceGrpc.getSearchAllMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getSearchAllMethod = AttendancesServiceGrpc.getSearchAllMethod) == null) {
          AttendancesServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceSearchAllReq, com.scailo.sdk.AttendancesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesList.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceFilterReq,
      com.scailo.sdk.AttendancesList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.AttendancesServiceFilterReq.class,
      responseType = com.scailo.sdk.AttendancesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceFilterReq,
      com.scailo.sdk.AttendancesList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceFilterReq, com.scailo.sdk.AttendancesList> getFilterMethod;
    if ((getFilterMethod = AttendancesServiceGrpc.getFilterMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getFilterMethod = AttendancesServiceGrpc.getFilterMethod) == null) {
          AttendancesServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceFilterReq, com.scailo.sdk.AttendancesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesList.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.BooleanResponse> getEmployeeHasOpenAttendanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmployeeHasOpenAttendance",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.BooleanResponse> getEmployeeHasOpenAttendanceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.BooleanResponse> getEmployeeHasOpenAttendanceMethod;
    if ((getEmployeeHasOpenAttendanceMethod = AttendancesServiceGrpc.getEmployeeHasOpenAttendanceMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getEmployeeHasOpenAttendanceMethod = AttendancesServiceGrpc.getEmployeeHasOpenAttendanceMethod) == null) {
          AttendancesServiceGrpc.getEmployeeHasOpenAttendanceMethod = getEmployeeHasOpenAttendanceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmployeeHasOpenAttendance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("EmployeeHasOpenAttendance"))
              .build();
        }
      }
    }
    return getEmployeeHasOpenAttendanceMethod;
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
    if ((getCountInStatusMethod = AttendancesServiceGrpc.getCountInStatusMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getCountInStatusMethod = AttendancesServiceGrpc.getCountInStatusMethod) == null) {
          AttendancesServiceGrpc.getCountInStatusMethod = getCountInStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.CountInSLCStatusRequest, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountInStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountInSLCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("CountInStatus"))
              .build();
        }
      }
    }
    return getCountInStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.AttendancesServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = AttendancesServiceGrpc.getCountMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getCountMethod = AttendancesServiceGrpc.getCountMethod) == null) {
          AttendancesServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.AttendancesServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AttendancesServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = AttendancesServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (AttendancesServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = AttendancesServiceGrpc.getDownloadAsCSVMethod) == null) {
          AttendancesServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AttendancesServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AttendancesServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new AttendancesServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AttendancesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttendancesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttendancesServiceStub>() {
        @java.lang.Override
        public AttendancesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttendancesServiceStub(channel, callOptions);
        }
      };
    return AttendancesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AttendancesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttendancesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttendancesServiceBlockingStub>() {
        @java.lang.Override
        public AttendancesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttendancesServiceBlockingStub(channel, callOptions);
        }
      };
    return AttendancesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AttendancesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttendancesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttendancesServiceFutureStub>() {
        @java.lang.Override
        public AttendancesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttendancesServiceFutureStub(channel, callOptions);
        }
      };
    return AttendancesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each attendance
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    default void create(com.scailo.sdk.AttendancesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    default void draft(com.scailo.sdk.AttendancesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    default void draftUpdate(com.scailo.sdk.AttendancesServiceUpdateRequest request,
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
    default void revisionUpdate(com.scailo.sdk.AttendancesServiceUpdateRequest request,
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
     * rpc SendEmail (Identifier) returns (IdentifierResponse);
     * Create a magic link
     * </pre>
     */
    default void createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMagicLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Store entry time
     * </pre>
     */
    default void recordImageEntry(com.scailo.sdk.AttendancesServiceImageEntryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordImageEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Store exit time
     * </pre>
     */
    default void recordImageExit(com.scailo.sdk.AttendancesServiceImageExitRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordImageExitMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    default void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllForEntityUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.AttendancesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View entry image for attendance UUID
     * </pre>
     */
    default void viewEntryImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEntryImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Confirm that the entry image of the given attendance UUID belongs to the user
     * </pre>
     */
    default void confirmEntryImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmEntryImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View exit image for attendance UUID
     * </pre>
     */
    default void viewExitImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewExitImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Confirm that the exit image of the given attendance UUID belongs to the user
     * </pre>
     */
    default void confirmExitImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmExitImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View entry GPS coordinates for attendance UUID
     * </pre>
     */
    default void viewEntryGPSCoordinates(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEntryGPSCoordinatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View exit GPS coordinates for attendance UUID
     * </pre>
     */
    default void viewExitGPSCoordinates(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewExitGPSCoordinatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View entry GPS static image from Google Maps
     * </pre>
     */
    default void viewEntryGPSStaticImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEntryGPSStaticImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View exit GPS static image from Google Maps
     * </pre>
     */
    default void viewExitGPSStaticImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewExitGPSStaticImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the open attendance for a user (with the given identifier), if available. Returns an empty instance if no attendance is available
     * </pre>
     */
    default void viewOpenAttendanceForUser(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOpenAttendanceForUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.AttendancesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.AttendancesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if a user (with the given identifier) has an open attendance (attendance with only entry and no exit)
     * </pre>
     */
    default void employeeHasOpenAttendance(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmployeeHasOpenAttendanceMethod(), responseObserver);
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
     * View all that match the given count criteria
     * </pre>
     */
    default void count(com.scailo.sdk.AttendancesServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.AttendancesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AttendancesService.
   * <pre>
   *Describes the common methods applicable on each attendance
   * </pre>
   */
  public static abstract class AttendancesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AttendancesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AttendancesService.
   * <pre>
   *Describes the common methods applicable on each attendance
   * </pre>
   */
  public static final class AttendancesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AttendancesServiceStub> {
    private AttendancesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttendancesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttendancesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public void create(com.scailo.sdk.AttendancesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public void draft(com.scailo.sdk.AttendancesServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public void draftUpdate(com.scailo.sdk.AttendancesServiceUpdateRequest request,
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
    public void revisionUpdate(com.scailo.sdk.AttendancesServiceUpdateRequest request,
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
     * rpc SendEmail (Identifier) returns (IdentifierResponse);
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
     * Store entry time
     * </pre>
     */
    public void recordImageEntry(com.scailo.sdk.AttendancesServiceImageEntryRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordImageEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Store exit time
     * </pre>
     */
    public void recordImageExit(com.scailo.sdk.AttendancesServiceImageExitRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordImageExitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public void viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.AttendancesServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View entry image for attendance UUID
     * </pre>
     */
    public void viewEntryImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEntryImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Confirm that the entry image of the given attendance UUID belongs to the user
     * </pre>
     */
    public void confirmEntryImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmEntryImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View exit image for attendance UUID
     * </pre>
     */
    public void viewExitImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewExitImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Confirm that the exit image of the given attendance UUID belongs to the user
     * </pre>
     */
    public void confirmExitImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmExitImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View entry GPS coordinates for attendance UUID
     * </pre>
     */
    public void viewEntryGPSCoordinates(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEntryGPSCoordinatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View exit GPS coordinates for attendance UUID
     * </pre>
     */
    public void viewExitGPSCoordinates(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewExitGPSCoordinatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View entry GPS static image from Google Maps
     * </pre>
     */
    public void viewEntryGPSStaticImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEntryGPSStaticImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View exit GPS static image from Google Maps
     * </pre>
     */
    public void viewExitGPSStaticImage(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewExitGPSStaticImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the open attendance for a user (with the given identifier), if available. Returns an empty instance if no attendance is available
     * </pre>
     */
    public void viewOpenAttendanceForUser(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOpenAttendanceForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.AttendancesServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.AttendancesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if a user (with the given identifier) has an open attendance (attendance with only entry and no exit)
     * </pre>
     */
    public void employeeHasOpenAttendance(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmployeeHasOpenAttendanceMethod(), getCallOptions()), request, responseObserver);
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
     * View all that match the given count criteria
     * </pre>
     */
    public void count(com.scailo.sdk.AttendancesServiceCountReq request,
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
    public void downloadAsCSV(com.scailo.sdk.AttendancesServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AttendancesService.
   * <pre>
   *Describes the common methods applicable on each attendance
   * </pre>
   */
  public static final class AttendancesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AttendancesServiceBlockingStub> {
    private AttendancesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttendancesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttendancesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.AttendancesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draft(com.scailo.sdk.AttendancesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse draftUpdate(com.scailo.sdk.AttendancesServiceUpdateRequest request) {
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
    public com.scailo.sdk.IdentifierResponse revisionUpdate(com.scailo.sdk.AttendancesServiceUpdateRequest request) {
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
     * rpc SendEmail (Identifier) returns (IdentifierResponse);
     * Create a magic link
     * </pre>
     */
    public com.scailo.sdk.MagicLink createMagicLink(com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMagicLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Store entry time
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse recordImageEntry(com.scailo.sdk.AttendancesServiceImageEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordImageEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Store exit time
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse recordImageExit(com.scailo.sdk.AttendancesServiceImageExitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordImageExitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.Attendance viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.Attendance viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.Attendance viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.Attendance viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.AttendancesList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.AttendancesList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.scailo.sdk.AttendancesList viewAllForEntityUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllForEntityUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.AttendancesServicePaginationResponse viewWithPagination(com.scailo.sdk.AttendancesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View entry image for attendance UUID
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewEntryImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEntryImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Confirm that the entry image of the given attendance UUID belongs to the user
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse confirmEntryImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmEntryImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View exit image for attendance UUID
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewExitImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewExitImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Confirm that the exit image of the given attendance UUID belongs to the user
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse confirmExitImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmExitImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View entry GPS coordinates for attendance UUID
     * </pre>
     */
    public com.scailo.sdk.GPSCoordinatesResponse viewEntryGPSCoordinates(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEntryGPSCoordinatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View exit GPS coordinates for attendance UUID
     * </pre>
     */
    public com.scailo.sdk.GPSCoordinatesResponse viewExitGPSCoordinates(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewExitGPSCoordinatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View entry GPS static image from Google Maps
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewEntryGPSStaticImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEntryGPSStaticImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View exit GPS static image from Google Maps
     * </pre>
     */
    public com.scailo.sdk.ImageResponse viewExitGPSStaticImage(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewExitGPSStaticImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the open attendance for a user (with the given identifier), if available. Returns an empty instance if no attendance is available
     * </pre>
     */
    public com.scailo.sdk.Attendance viewOpenAttendanceForUser(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOpenAttendanceForUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.AttendancesList searchAll(com.scailo.sdk.AttendancesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.AttendancesList filter(com.scailo.sdk.AttendancesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if a user (with the given identifier) has an open attendance (attendance with only entry and no exit)
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse employeeHasOpenAttendance(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmployeeHasOpenAttendanceMethod(), getCallOptions(), request);
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
     * View all that match the given count criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.AttendancesServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request. The same file could also be used as a template for uploading records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.AttendancesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AttendancesService.
   * <pre>
   *Describes the common methods applicable on each attendance
   * </pre>
   */
  public static final class AttendancesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AttendancesServiceFutureStub> {
    private AttendancesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttendancesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttendancesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create and send for verification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.AttendancesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create and save as draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draft(
        com.scailo.sdk.AttendancesServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update draft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> draftUpdate(
        com.scailo.sdk.AttendancesServiceUpdateRequest request) {
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
        com.scailo.sdk.AttendancesServiceUpdateRequest request) {
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
     * rpc SendEmail (Identifier) returns (IdentifierResponse);
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
     * Store entry time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> recordImageEntry(
        com.scailo.sdk.AttendancesServiceImageEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordImageEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Store exit time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> recordImageExit(
        com.scailo.sdk.AttendancesServiceImageExitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordImageExitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Attendance> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Attendance> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Attendance> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Attendance> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.AttendancesList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.AttendancesList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all with the given entity UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.AttendancesList> viewAllForEntityUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllForEntityUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.AttendancesServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.AttendancesServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View entry image for attendance UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewEntryImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEntryImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Confirm that the entry image of the given attendance UUID belongs to the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> confirmEntryImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmEntryImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View exit image for attendance UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewExitImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewExitImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Confirm that the exit image of the given attendance UUID belongs to the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> confirmExitImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmExitImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View entry GPS coordinates for attendance UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GPSCoordinatesResponse> viewEntryGPSCoordinates(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEntryGPSCoordinatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View exit GPS coordinates for attendance UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GPSCoordinatesResponse> viewExitGPSCoordinates(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewExitGPSCoordinatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View entry GPS static image from Google Maps
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewEntryGPSStaticImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEntryGPSStaticImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View exit GPS static image from Google Maps
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ImageResponse> viewExitGPSStaticImage(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewExitGPSStaticImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the open attendance for a user (with the given identifier), if available. Returns an empty instance if no attendance is available
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Attendance> viewOpenAttendanceForUser(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOpenAttendanceForUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.AttendancesList> searchAll(
        com.scailo.sdk.AttendancesServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.AttendancesList> filter(
        com.scailo.sdk.AttendancesServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if a user (with the given identifier) has an open attendance (attendance with only entry and no exit)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> employeeHasOpenAttendance(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmployeeHasOpenAttendanceMethod(), getCallOptions()), request);
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
     * View all that match the given count criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.AttendancesServiceCountReq request) {
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
        com.scailo.sdk.AttendancesServiceFilterReq request) {
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
  private static final int METHODID_COMMENT_ADD = 13;
  private static final int METHODID_CREATE_MAGIC_LINK = 14;
  private static final int METHODID_RECORD_IMAGE_ENTRY = 15;
  private static final int METHODID_RECORD_IMAGE_EXIT = 16;
  private static final int METHODID_VIEW_BY_ID = 17;
  private static final int METHODID_VIEW_BY_UUID = 18;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 19;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 20;
  private static final int METHODID_VIEW_FROM_IDS = 21;
  private static final int METHODID_VIEW_ALL = 22;
  private static final int METHODID_VIEW_ALL_FOR_ENTITY_UUID = 23;
  private static final int METHODID_VIEW_WITH_PAGINATION = 24;
  private static final int METHODID_VIEW_ENTRY_IMAGE = 25;
  private static final int METHODID_CONFIRM_ENTRY_IMAGE = 26;
  private static final int METHODID_VIEW_EXIT_IMAGE = 27;
  private static final int METHODID_CONFIRM_EXIT_IMAGE = 28;
  private static final int METHODID_VIEW_ENTRY_GPSCOORDINATES = 29;
  private static final int METHODID_VIEW_EXIT_GPSCOORDINATES = 30;
  private static final int METHODID_VIEW_ENTRY_GPSSTATIC_IMAGE = 31;
  private static final int METHODID_VIEW_EXIT_GPSSTATIC_IMAGE = 32;
  private static final int METHODID_VIEW_OPEN_ATTENDANCE_FOR_USER = 33;
  private static final int METHODID_SEARCH_ALL = 34;
  private static final int METHODID_FILTER = 35;
  private static final int METHODID_EMPLOYEE_HAS_OPEN_ATTENDANCE = 36;
  private static final int METHODID_COUNT_IN_STATUS = 37;
  private static final int METHODID_COUNT = 38;
  private static final int METHODID_DOWNLOAD_AS_CSV = 39;

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
          serviceImpl.create((com.scailo.sdk.AttendancesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT:
          serviceImpl.draft((com.scailo.sdk.AttendancesServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DRAFT_UPDATE:
          serviceImpl.draftUpdate((com.scailo.sdk.AttendancesServiceUpdateRequest) request,
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
          serviceImpl.revisionUpdate((com.scailo.sdk.AttendancesServiceUpdateRequest) request,
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
        case METHODID_COMMENT_ADD:
          serviceImpl.commentAdd((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_CREATE_MAGIC_LINK:
          serviceImpl.createMagicLink((com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.MagicLink>) responseObserver);
          break;
        case METHODID_RECORD_IMAGE_ENTRY:
          serviceImpl.recordImageEntry((com.scailo.sdk.AttendancesServiceImageEntryRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_RECORD_IMAGE_EXIT:
          serviceImpl.recordImageExit((com.scailo.sdk.AttendancesServiceImageExitRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList>) responseObserver);
          break;
        case METHODID_VIEW_ALL_FOR_ENTITY_UUID:
          serviceImpl.viewAllForEntityUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.AttendancesServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_ENTRY_IMAGE:
          serviceImpl.viewEntryImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_ENTRY_IMAGE:
          serviceImpl.confirmEntryImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_VIEW_EXIT_IMAGE:
          serviceImpl.viewExitImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_EXIT_IMAGE:
          serviceImpl.confirmExitImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_VIEW_ENTRY_GPSCOORDINATES:
          serviceImpl.viewEntryGPSCoordinates((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse>) responseObserver);
          break;
        case METHODID_VIEW_EXIT_GPSCOORDINATES:
          serviceImpl.viewExitGPSCoordinates((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GPSCoordinatesResponse>) responseObserver);
          break;
        case METHODID_VIEW_ENTRY_GPSSTATIC_IMAGE:
          serviceImpl.viewEntryGPSStaticImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_VIEW_EXIT_GPSSTATIC_IMAGE:
          serviceImpl.viewExitGPSStaticImage((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ImageResponse>) responseObserver);
          break;
        case METHODID_VIEW_OPEN_ATTENDANCE_FOR_USER:
          serviceImpl.viewOpenAttendanceForUser((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Attendance>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.AttendancesServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.AttendancesServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.AttendancesList>) responseObserver);
          break;
        case METHODID_EMPLOYEE_HAS_OPEN_ATTENDANCE:
          serviceImpl.employeeHasOpenAttendance((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_COUNT_IN_STATUS:
          serviceImpl.countInStatus((com.scailo.sdk.CountInSLCStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.AttendancesServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.AttendancesServiceFilterReq) request,
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
              com.scailo.sdk.AttendancesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.AttendancesServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DRAFT)))
        .addMethod(
          getDraftUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.AttendancesServiceUpdateRequest,
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
              com.scailo.sdk.AttendancesServiceUpdateRequest,
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
          getRecordImageEntryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.AttendancesServiceImageEntryRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_RECORD_IMAGE_ENTRY)))
        .addMethod(
          getRecordImageExitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.AttendancesServiceImageExitRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_RECORD_IMAGE_EXIT)))
        .addMethod(
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Attendance>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Attendance>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Attendance>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Attendance>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.AttendancesList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.AttendancesList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewAllForEntityUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.AttendancesList>(
                service, METHODID_VIEW_ALL_FOR_ENTITY_UUID)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.AttendancesServicePaginationReq,
              com.scailo.sdk.AttendancesServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewEntryImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_ENTRY_IMAGE)))
        .addMethod(
          getConfirmEntryImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_CONFIRM_ENTRY_IMAGE)))
        .addMethod(
          getViewExitImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_EXIT_IMAGE)))
        .addMethod(
          getConfirmExitImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_CONFIRM_EXIT_IMAGE)))
        .addMethod(
          getViewEntryGPSCoordinatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GPSCoordinatesResponse>(
                service, METHODID_VIEW_ENTRY_GPSCOORDINATES)))
        .addMethod(
          getViewExitGPSCoordinatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GPSCoordinatesResponse>(
                service, METHODID_VIEW_EXIT_GPSCOORDINATES)))
        .addMethod(
          getViewEntryGPSStaticImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_ENTRY_GPSSTATIC_IMAGE)))
        .addMethod(
          getViewExitGPSStaticImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.ImageResponse>(
                service, METHODID_VIEW_EXIT_GPSSTATIC_IMAGE)))
        .addMethod(
          getViewOpenAttendanceForUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Attendance>(
                service, METHODID_VIEW_OPEN_ATTENDANCE_FOR_USER)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.AttendancesServiceSearchAllReq,
              com.scailo.sdk.AttendancesList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.AttendancesServiceFilterReq,
              com.scailo.sdk.AttendancesList>(
                service, METHODID_FILTER)))
        .addMethod(
          getEmployeeHasOpenAttendanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_EMPLOYEE_HAS_OPEN_ATTENDANCE)))
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
              com.scailo.sdk.AttendancesServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.AttendancesServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .build();
  }

  private static abstract class AttendancesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AttendancesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.AttendancesScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AttendancesService");
    }
  }

  private static final class AttendancesServiceFileDescriptorSupplier
      extends AttendancesServiceBaseDescriptorSupplier {
    AttendancesServiceFileDescriptorSupplier() {}
  }

  private static final class AttendancesServiceMethodDescriptorSupplier
      extends AttendancesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AttendancesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AttendancesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AttendancesServiceFileDescriptorSupplier())
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
              .addMethod(getCommentAddMethod())
              .addMethod(getCreateMagicLinkMethod())
              .addMethod(getRecordImageEntryMethod())
              .addMethod(getRecordImageExitMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewAllForEntityUUIDMethod())
              .addMethod(getViewWithPaginationMethod())
              .addMethod(getViewEntryImageMethod())
              .addMethod(getConfirmEntryImageMethod())
              .addMethod(getViewExitImageMethod())
              .addMethod(getConfirmExitImageMethod())
              .addMethod(getViewEntryGPSCoordinatesMethod())
              .addMethod(getViewExitGPSCoordinatesMethod())
              .addMethod(getViewEntryGPSStaticImageMethod())
              .addMethod(getViewExitGPSStaticImageMethod())
              .addMethod(getViewOpenAttendanceForUserMethod())
              .addMethod(getSearchAllMethod())
              .addMethod(getFilterMethod())
              .addMethod(getEmployeeHasOpenAttendanceMethod())
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
