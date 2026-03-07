package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on each component
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: components.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ComponentsServiceGrpc {

  private ComponentsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.ComponentsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.scailo.sdk.ComponentsServiceCreateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceCreateRequest,
      com.scailo.sdk.IdentifierResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceCreateRequest, com.scailo.sdk.IdentifierResponse> getCreateMethod;
    if ((getCreateMethod = ComponentsServiceGrpc.getCreateMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getCreateMethod = ComponentsServiceGrpc.getCreateMethod) == null) {
          ComponentsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ComponentsServiceCreateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsServiceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceSendToStoreRequest,
      com.scailo.sdk.IdentifierResponse> getSendToStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendToStore",
      requestType = com.scailo.sdk.ComponentsServiceSendToStoreRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceSendToStoreRequest,
      com.scailo.sdk.IdentifierResponse> getSendToStoreMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceSendToStoreRequest, com.scailo.sdk.IdentifierResponse> getSendToStoreMethod;
    if ((getSendToStoreMethod = ComponentsServiceGrpc.getSendToStoreMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getSendToStoreMethod = ComponentsServiceGrpc.getSendToStoreMethod) == null) {
          ComponentsServiceGrpc.getSendToStoreMethod = getSendToStoreMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ComponentsServiceSendToStoreRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendToStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsServiceSendToStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("SendToStore"))
              .build();
        }
      }
    }
    return getSendToStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.scailo.sdk.ComponentsServiceUpdateRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceUpdateRequest,
      com.scailo.sdk.IdentifierResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse> getUpdateMethod;
    if ((getUpdateMethod = ComponentsServiceGrpc.getUpdateMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getUpdateMethod = ComponentsServiceGrpc.getUpdateMethod) == null) {
          ComponentsServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ComponentsServiceUpdateRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsServiceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSendForReworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendForRework",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSendForReworkMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getSendForReworkMethod;
    if ((getSendForReworkMethod = ComponentsServiceGrpc.getSendForReworkMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getSendForReworkMethod = ComponentsServiceGrpc.getSendForReworkMethod) == null) {
          ComponentsServiceGrpc.getSendForReworkMethod = getSendForReworkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForRework"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("SendForRework"))
              .build();
        }
      }
    }
    return getSendForReworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSendForQCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendForQC",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSendForQCMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getSendForQCMethod;
    if ((getSendForQCMethod = ComponentsServiceGrpc.getSendForQCMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getSendForQCMethod = ComponentsServiceGrpc.getSendForQCMethod) == null) {
          ComponentsServiceGrpc.getSendForQCMethod = getSendForQCMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendForQC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("SendForQC"))
              .build();
        }
      }
    }
    return getSendForQCMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSplitLotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SplitLot",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getSplitLotMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getSplitLotMethod;
    if ((getSplitLotMethod = ComponentsServiceGrpc.getSplitLotMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getSplitLotMethod = ComponentsServiceGrpc.getSplitLotMethod) == null) {
          ComponentsServiceGrpc.getSplitLotMethod = getSplitLotMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SplitLot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("SplitLot"))
              .build();
        }
      }
    }
    return getSplitLotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InventoryPartitionRequest,
      com.scailo.sdk.IdentifierResponse> getPartitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Partition",
      requestType = com.scailo.sdk.InventoryPartitionRequest.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InventoryPartitionRequest,
      com.scailo.sdk.IdentifierResponse> getPartitionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InventoryPartitionRequest, com.scailo.sdk.IdentifierResponse> getPartitionMethod;
    if ((getPartitionMethod = ComponentsServiceGrpc.getPartitionMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getPartitionMethod = ComponentsServiceGrpc.getPartitionMethod) == null) {
          ComponentsServiceGrpc.getPartitionMethod = getPartitionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InventoryPartitionRequest, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Partition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryPartitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("Partition"))
              .build();
        }
      }
    }
    return getPartitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getConsumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Consume",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getConsumeMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getConsumeMethod;
    if ((getConsumeMethod = ComponentsServiceGrpc.getConsumeMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getConsumeMethod = ComponentsServiceGrpc.getConsumeMethod) == null) {
          ComponentsServiceGrpc.getConsumeMethod = getConsumeMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Consume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("Consume"))
              .build();
        }
      }
    }
    return getConsumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getRejectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reject",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getRejectMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getRejectMethod;
    if ((getRejectMethod = ComponentsServiceGrpc.getRejectMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getRejectMethod = ComponentsServiceGrpc.getRejectMethod) == null) {
          ComponentsServiceGrpc.getRejectMethod = getRejectMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("Reject"))
              .build();
        }
      }
    }
    return getRejectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getScrapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Scrap",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getScrapMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getScrapMethod;
    if ((getScrapMethod = ComponentsServiceGrpc.getScrapMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getScrapMethod = ComponentsServiceGrpc.getScrapMethod) == null) {
          ComponentsServiceGrpc.getScrapMethod = getScrapMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Scrap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("Scrap"))
              .build();
        }
      }
    }
    return getScrapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getReturnMaterialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReturnMaterial",
      requestType = com.scailo.sdk.IdentifierUUIDWithUserComment.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment,
      com.scailo.sdk.IdentifierResponse> getReturnMaterialMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse> getReturnMaterialMethod;
    if ((getReturnMaterialMethod = ComponentsServiceGrpc.getReturnMaterialMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getReturnMaterialMethod = ComponentsServiceGrpc.getReturnMaterialMethod) == null) {
          ComponentsServiceGrpc.getReturnMaterialMethod = getReturnMaterialMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReturnMaterial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ReturnMaterial"))
              .build();
        }
      }
    }
    return getReturnMaterialMethod;
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
    if ((getDiscardMethod = ComponentsServiceGrpc.getDiscardMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getDiscardMethod = ComponentsServiceGrpc.getDiscardMethod) == null) {
          ComponentsServiceGrpc.getDiscardMethod = getDiscardMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("Discard"))
              .build();
        }
      }
    }
    return getDiscardMethod;
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
    if ((getCommentAddMethod = ComponentsServiceGrpc.getCommentAddMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getCommentAddMethod = ComponentsServiceGrpc.getCommentAddMethod) == null) {
          ComponentsServiceGrpc.getCommentAddMethod = getCommentAddMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDWithUserComment, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDWithUserComment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("CommentAdd"))
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
    if ((getCreateMagicLinkMethod = ComponentsServiceGrpc.getCreateMagicLinkMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getCreateMagicLinkMethod = ComponentsServiceGrpc.getCreateMagicLinkMethod) == null) {
          ComponentsServiceGrpc.getCreateMagicLinkMethod = getCreateMagicLinkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource, com.scailo.sdk.MagicLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMagicLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLinksServiceCreateRequestForSpecificResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.MagicLink.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("CreateMagicLink"))
              .build();
        }
      }
    }
    return getCreateMagicLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Component> getViewByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Component.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Component> getViewByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Component> getViewByIDMethod;
    if ((getViewByIDMethod = ComponentsServiceGrpc.getViewByIDMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewByIDMethod = ComponentsServiceGrpc.getViewByIDMethod) == null) {
          ComponentsServiceGrpc.getViewByIDMethod = getViewByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Component>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Component.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewByID"))
              .build();
        }
      }
    }
    return getViewByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Component> getViewByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Component.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Component> getViewByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Component> getViewByUUIDMethod;
    if ((getViewByUUIDMethod = ComponentsServiceGrpc.getViewByUUIDMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewByUUIDMethod = ComponentsServiceGrpc.getViewByUUIDMethod) == null) {
          ComponentsServiceGrpc.getViewByUUIDMethod = getViewByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Component>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Component.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewByUUID"))
              .build();
        }
      }
    }
    return getViewByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Component> getViewEssentialByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.Component.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.Component> getViewEssentialByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.Component> getViewEssentialByIDMethod;
    if ((getViewEssentialByIDMethod = ComponentsServiceGrpc.getViewEssentialByIDMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewEssentialByIDMethod = ComponentsServiceGrpc.getViewEssentialByIDMethod) == null) {
          ComponentsServiceGrpc.getViewEssentialByIDMethod = getViewEssentialByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.Component>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Component.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewEssentialByID"))
              .build();
        }
      }
    }
    return getViewEssentialByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Component> getViewEssentialByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEssentialByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.Component.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.Component> getViewEssentialByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Component> getViewEssentialByUUIDMethod;
    if ((getViewEssentialByUUIDMethod = ComponentsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewEssentialByUUIDMethod = ComponentsServiceGrpc.getViewEssentialByUUIDMethod) == null) {
          ComponentsServiceGrpc.getViewEssentialByUUIDMethod = getViewEssentialByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.Component>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEssentialByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Component.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewEssentialByUUID"))
              .build();
        }
      }
    }
    return getViewEssentialByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.ComponentsList> getViewFromIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromIDs",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.ComponentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.ComponentsList> getViewFromIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.ComponentsList> getViewFromIDsMethod;
    if ((getViewFromIDsMethod = ComponentsServiceGrpc.getViewFromIDsMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewFromIDsMethod = ComponentsServiceGrpc.getViewFromIDsMethod) == null) {
          ComponentsServiceGrpc.getViewFromIDsMethod = getViewFromIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.ComponentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsList.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewFromIDs"))
              .build();
        }
      }
    }
    return getViewFromIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDsList,
      com.scailo.sdk.ComponentsList> getViewFromUUIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFromUUIDs",
      requestType = com.scailo.sdk.IdentifierUUIDsList.class,
      responseType = com.scailo.sdk.ComponentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDsList,
      com.scailo.sdk.ComponentsList> getViewFromUUIDsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUIDsList, com.scailo.sdk.ComponentsList> getViewFromUUIDsMethod;
    if ((getViewFromUUIDsMethod = ComponentsServiceGrpc.getViewFromUUIDsMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewFromUUIDsMethod = ComponentsServiceGrpc.getViewFromUUIDsMethod) == null) {
          ComponentsServiceGrpc.getViewFromUUIDsMethod = getViewFromUUIDsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUIDsList, com.scailo.sdk.ComponentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFromUUIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDsList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsList.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewFromUUIDs"))
              .build();
        }
      }
    }
    return getViewFromUUIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.ComponentsList> getViewAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAll",
      requestType = com.scailo.sdk.ActiveStatus.class,
      responseType = com.scailo.sdk.ComponentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus,
      com.scailo.sdk.ComponentsList> getViewAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ActiveStatus, com.scailo.sdk.ComponentsList> getViewAllMethod;
    if ((getViewAllMethod = ComponentsServiceGrpc.getViewAllMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewAllMethod = ComponentsServiceGrpc.getViewAllMethod) == null) {
          ComponentsServiceGrpc.getViewAllMethod = getViewAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ActiveStatus, com.scailo.sdk.ComponentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ActiveStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsList.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewAll"))
              .build();
        }
      }
    }
    return getViewAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServicePaginationReq,
      com.scailo.sdk.ComponentsServicePaginationResponse> getViewWithPaginationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWithPagination",
      requestType = com.scailo.sdk.ComponentsServicePaginationReq.class,
      responseType = com.scailo.sdk.ComponentsServicePaginationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServicePaginationReq,
      com.scailo.sdk.ComponentsServicePaginationResponse> getViewWithPaginationMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServicePaginationReq, com.scailo.sdk.ComponentsServicePaginationResponse> getViewWithPaginationMethod;
    if ((getViewWithPaginationMethod = ComponentsServiceGrpc.getViewWithPaginationMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewWithPaginationMethod = ComponentsServiceGrpc.getViewWithPaginationMethod) == null) {
          ComponentsServiceGrpc.getViewWithPaginationMethod = getViewWithPaginationMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ComponentsServicePaginationReq, com.scailo.sdk.ComponentsServicePaginationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWithPagination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsServicePaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsServicePaginationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewWithPagination"))
              .build();
        }
      }
    }
    return getViewWithPaginationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.FamiliesList> getViewFamiliesInProductionPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFamiliesInProductionPlan",
      requestType = com.scailo.sdk.IdentifierWithSearchKey.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey,
      com.scailo.sdk.FamiliesList> getViewFamiliesInProductionPlanMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList> getViewFamiliesInProductionPlanMethod;
    if ((getViewFamiliesInProductionPlanMethod = ComponentsServiceGrpc.getViewFamiliesInProductionPlanMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewFamiliesInProductionPlanMethod = ComponentsServiceGrpc.getViewFamiliesInProductionPlanMethod) == null) {
          ComponentsServiceGrpc.getViewFamiliesInProductionPlanMethod = getViewFamiliesInProductionPlanMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierWithSearchKey, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFamiliesInProductionPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierWithSearchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewFamiliesInProductionPlan"))
              .build();
        }
      }
    }
    return getViewFamiliesInProductionPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier,
      com.scailo.sdk.FamiliesList> getFilterFamiliesInProductionPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FilterFamiliesInProductionPlan",
      requestType = com.scailo.sdk.FilterFamiliesReqForIdentifier.class,
      responseType = com.scailo.sdk.FamiliesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier,
      com.scailo.sdk.FamiliesList> getFilterFamiliesInProductionPlanMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList> getFilterFamiliesInProductionPlanMethod;
    if ((getFilterFamiliesInProductionPlanMethod = ComponentsServiceGrpc.getFilterFamiliesInProductionPlanMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getFilterFamiliesInProductionPlanMethod = ComponentsServiceGrpc.getFilterFamiliesInProductionPlanMethod) == null) {
          ComponentsServiceGrpc.getFilterFamiliesInProductionPlanMethod = getFilterFamiliesInProductionPlanMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.FilterFamiliesReqForIdentifier, com.scailo.sdk.FamiliesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterFamiliesInProductionPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FilterFamiliesReqForIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.FamiliesList.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("FilterFamiliesInProductionPlan"))
              .build();
        }
      }
    }
    return getFilterFamiliesInProductionPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.StandardFile> getDownloadQCReportByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadQCReportByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.StandardFile> getDownloadQCReportByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.StandardFile> getDownloadQCReportByIDMethod;
    if ((getDownloadQCReportByIDMethod = ComponentsServiceGrpc.getDownloadQCReportByIDMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getDownloadQCReportByIDMethod = ComponentsServiceGrpc.getDownloadQCReportByIDMethod) == null) {
          ComponentsServiceGrpc.getDownloadQCReportByIDMethod = getDownloadQCReportByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadQCReportByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("DownloadQCReportByID"))
              .build();
        }
      }
    }
    return getDownloadQCReportByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadQCReportByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadQCReportByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadQCReportByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadQCReportByUUIDMethod;
    if ((getDownloadQCReportByUUIDMethod = ComponentsServiceGrpc.getDownloadQCReportByUUIDMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getDownloadQCReportByUUIDMethod = ComponentsServiceGrpc.getDownloadQCReportByUUIDMethod) == null) {
          ComponentsServiceGrpc.getDownloadQCReportByUUIDMethod = getDownloadQCReportByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadQCReportByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("DownloadQCReportByUUID"))
              .build();
        }
      }
    }
    return getDownloadQCReportByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.StandardFile> getDownloadLabelByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadLabelByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.StandardFile> getDownloadLabelByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.StandardFile> getDownloadLabelByIDMethod;
    if ((getDownloadLabelByIDMethod = ComponentsServiceGrpc.getDownloadLabelByIDMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getDownloadLabelByIDMethod = ComponentsServiceGrpc.getDownloadLabelByIDMethod) == null) {
          ComponentsServiceGrpc.getDownloadLabelByIDMethod = getDownloadLabelByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadLabelByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("DownloadLabelByID"))
              .build();
        }
      }
    }
    return getDownloadLabelByIDMethod;
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
    if ((getDownloadLabelByUUIDMethod = ComponentsServiceGrpc.getDownloadLabelByUUIDMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getDownloadLabelByUUIDMethod = ComponentsServiceGrpc.getDownloadLabelByUUIDMethod) == null) {
          ComponentsServiceGrpc.getDownloadLabelByUUIDMethod = getDownloadLabelByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadLabelByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("DownloadLabelByUUID"))
              .build();
        }
      }
    }
    return getDownloadLabelByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InventoryInteractionsList> getViewInventoryInteractionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInventoryInteractions",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.InventoryInteractionsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.InventoryInteractionsList> getViewInventoryInteractionsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InventoryInteractionsList> getViewInventoryInteractionsMethod;
    if ((getViewInventoryInteractionsMethod = ComponentsServiceGrpc.getViewInventoryInteractionsMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getViewInventoryInteractionsMethod = ComponentsServiceGrpc.getViewInventoryInteractionsMethod) == null) {
          ComponentsServiceGrpc.getViewInventoryInteractionsMethod = getViewInventoryInteractionsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.InventoryInteractionsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInventoryInteractions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryInteractionsList.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ViewInventoryInteractions"))
              .build();
        }
      }
    }
    return getViewInventoryInteractionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceSearchAllReq,
      com.scailo.sdk.ComponentsList> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAll",
      requestType = com.scailo.sdk.ComponentsServiceSearchAllReq.class,
      responseType = com.scailo.sdk.ComponentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceSearchAllReq,
      com.scailo.sdk.ComponentsList> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceSearchAllReq, com.scailo.sdk.ComponentsList> getSearchAllMethod;
    if ((getSearchAllMethod = ComponentsServiceGrpc.getSearchAllMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getSearchAllMethod = ComponentsServiceGrpc.getSearchAllMethod) == null) {
          ComponentsServiceGrpc.getSearchAllMethod = getSearchAllMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ComponentsServiceSearchAllReq, com.scailo.sdk.ComponentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsServiceSearchAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsList.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("SearchAll"))
              .build();
        }
      }
    }
    return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceFilterReq,
      com.scailo.sdk.ComponentsList> getFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Filter",
      requestType = com.scailo.sdk.ComponentsServiceFilterReq.class,
      responseType = com.scailo.sdk.ComponentsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceFilterReq,
      com.scailo.sdk.ComponentsList> getFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceFilterReq, com.scailo.sdk.ComponentsList> getFilterMethod;
    if ((getFilterMethod = ComponentsServiceGrpc.getFilterMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getFilterMethod = ComponentsServiceGrpc.getFilterMethod) == null) {
          ComponentsServiceGrpc.getFilterMethod = getFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ComponentsServiceFilterReq, com.scailo.sdk.ComponentsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Filter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsList.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("Filter"))
              .build();
        }
      }
    }
    return getFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.scailo.sdk.ComponentsServiceCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceCountReq,
      com.scailo.sdk.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceCountReq, com.scailo.sdk.CountResponse> getCountMethod;
    if ((getCountMethod = ComponentsServiceGrpc.getCountMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getCountMethod = ComponentsServiceGrpc.getCountMethod) == null) {
          ComponentsServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ComponentsServiceCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsServiceCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadAsCSV",
      requestType = com.scailo.sdk.ComponentsServiceFilterReq.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceFilterReq,
      com.scailo.sdk.StandardFile> getDownloadAsCSVMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ComponentsServiceFilterReq, com.scailo.sdk.StandardFile> getDownloadAsCSVMethod;
    if ((getDownloadAsCSVMethod = ComponentsServiceGrpc.getDownloadAsCSVMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getDownloadAsCSVMethod = ComponentsServiceGrpc.getDownloadAsCSVMethod) == null) {
          ComponentsServiceGrpc.getDownloadAsCSVMethod = getDownloadAsCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ComponentsServiceFilterReq, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadAsCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ComponentsServiceFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("DownloadAsCSV"))
              .build();
        }
      }
    }
    return getDownloadAsCSVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.StandardFile> getDownloadImportTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadImportTemplate",
      requestType = com.scailo.sdk.Empty.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.StandardFile> getDownloadImportTemplateMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile> getDownloadImportTemplateMethod;
    if ((getDownloadImportTemplateMethod = ComponentsServiceGrpc.getDownloadImportTemplateMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getDownloadImportTemplateMethod = ComponentsServiceGrpc.getDownloadImportTemplateMethod) == null) {
          ComponentsServiceGrpc.getDownloadImportTemplateMethod = getDownloadImportTemplateMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadImportTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("DownloadImportTemplate"))
              .build();
        }
      }
    }
    return getDownloadImportTemplateMethod;
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
    if ((getImportFromCSVMethod = ComponentsServiceGrpc.getImportFromCSVMethod) == null) {
      synchronized (ComponentsServiceGrpc.class) {
        if ((getImportFromCSVMethod = ComponentsServiceGrpc.getImportFromCSVMethod) == null) {
          ComponentsServiceGrpc.getImportFromCSVMethod = getImportFromCSVMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.StandardFile, com.scailo.sdk.IdentifierUUIDsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportFromCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUIDsList.getDefaultInstance()))
              .setSchemaDescriptor(new ComponentsServiceMethodDescriptorSupplier("ImportFromCSV"))
              .build();
        }
      }
    }
    return getImportFromCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComponentsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComponentsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComponentsServiceStub>() {
        @java.lang.Override
        public ComponentsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComponentsServiceStub(channel, callOptions);
        }
      };
    return ComponentsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComponentsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComponentsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComponentsServiceBlockingStub>() {
        @java.lang.Override
        public ComponentsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComponentsServiceBlockingStub(channel, callOptions);
        }
      };
    return ComponentsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComponentsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComponentsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComponentsServiceFutureStub>() {
        @java.lang.Override
        public ComponentsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComponentsServiceFutureStub(channel, callOptions);
        }
      };
    return ComponentsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on each component
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create (and Send for QC)
     * </pre>
     */
    default void create(com.scailo.sdk.ComponentsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send to Store
     * </pre>
     */
    default void sendToStore(com.scailo.sdk.ComponentsServiceSendToStoreRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendToStoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    default void update(com.scailo.sdk.ComponentsServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send for Rework
     * </pre>
     */
    default void sendForRework(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendForReworkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send for QC
     * </pre>
     */
    default void sendForQC(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendForQCMethod(), responseObserver);
    }

    /**
     * <pre>
     * Split into unit quantities
     * </pre>
     */
    default void splitLot(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSplitLotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a partition from the parent lot (and returns the identifier of the new partition)
     * </pre>
     */
    default void partition(com.scailo.sdk.InventoryPartitionRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPartitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Consume
     * </pre>
     */
    default void consume(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reject
     * </pre>
     */
    default void reject(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRejectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Scrap
     * </pre>
     */
    default void scrap(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScrapMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return
     * </pre>
     */
    default void returnMaterial(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReturnMaterialMethod(), responseObserver);
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
     * View by ID
     * </pre>
     */
    default void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Component> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    default void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Component> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    default void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Component> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    default void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Component> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEssentialByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    default void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all records with the given UUIDs
     * </pre>
     */
    default void viewFromUUIDs(com.scailo.sdk.IdentifierUUIDsList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFromUUIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    default void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    default void viewWithPagination(com.scailo.sdk.ComponentsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWithPaginationMethod(), responseObserver);
    }

    /**
     * <pre>
     * View component families for the given production plan
     * </pre>
     */
    default void viewFamiliesInProductionPlan(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFamiliesInProductionPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Filter component families for the given production plan
     * </pre>
     */
    default void filterFamiliesInProductionPlan(com.scailo.sdk.FilterFamiliesReqForIdentifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterFamiliesInProductionPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download QC Report with the given Identifier
     * </pre>
     */
    default void downloadQCReportByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadQCReportByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download QC Report with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    default void downloadQCReportByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadQCReportByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download Label for the given Identifier
     * </pre>
     */
    default void downloadLabelByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadLabelByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download Label for the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    default void downloadLabelByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadLabelByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all inventory interactions for component with the given IdentifierUUID
     * </pre>
     */
    default void viewInventoryInteractions(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryInteractionsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInventoryInteractionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    default void searchAll(com.scailo.sdk.ComponentsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    default void filter(com.scailo.sdk.ComponentsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    default void count(com.scailo.sdk.ComponentsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    default void downloadAsCSV(com.scailo.sdk.ComponentsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadAsCSVMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload records
     * </pre>
     */
    default void downloadImportTemplate(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadImportTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import records using a CSV file. Imports records as initial stock
     * </pre>
     */
    default void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportFromCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ComponentsService.
   * <pre>
   *Describes the common methods applicable on each component
   * </pre>
   */
  public static abstract class ComponentsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ComponentsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ComponentsService.
   * <pre>
   *Describes the common methods applicable on each component
   * </pre>
   */
  public static final class ComponentsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ComponentsServiceStub> {
    private ComponentsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComponentsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComponentsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create (and Send for QC)
     * </pre>
     */
    public void create(com.scailo.sdk.ComponentsServiceCreateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send to Store
     * </pre>
     */
    public void sendToStore(com.scailo.sdk.ComponentsServiceSendToStoreRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendToStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public void update(com.scailo.sdk.ComponentsServiceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send for Rework
     * </pre>
     */
    public void sendForRework(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendForReworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send for QC
     * </pre>
     */
    public void sendForQC(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendForQCMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Split into unit quantities
     * </pre>
     */
    public void splitLot(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSplitLotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a partition from the parent lot (and returns the identifier of the new partition)
     * </pre>
     */
    public void partition(com.scailo.sdk.InventoryPartitionRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPartitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Consume
     * </pre>
     */
    public void consume(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reject
     * </pre>
     */
    public void reject(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRejectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Scrap
     * </pre>
     */
    public void scrap(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScrapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return
     * </pre>
     */
    public void returnMaterial(com.scailo.sdk.IdentifierUUIDWithUserComment request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReturnMaterialMethod(), getCallOptions()), request, responseObserver);
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
     * View by ID
     * </pre>
     */
    public void viewByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Component> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public void viewByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Component> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public void viewEssentialByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Component> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public void viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.Component> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public void viewFromIDs(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all records with the given UUIDs
     * </pre>
     */
    public void viewFromUUIDs(com.scailo.sdk.IdentifierUUIDsList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFromUUIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public void viewAll(com.scailo.sdk.ActiveStatus request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public void viewWithPagination(com.scailo.sdk.ComponentsServicePaginationReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsServicePaginationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View component families for the given production plan
     * </pre>
     */
    public void viewFamiliesInProductionPlan(com.scailo.sdk.IdentifierWithSearchKey request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFamiliesInProductionPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Filter component families for the given production plan
     * </pre>
     */
    public void filterFamiliesInProductionPlan(com.scailo.sdk.FilterFamiliesReqForIdentifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterFamiliesInProductionPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download QC Report with the given Identifier
     * </pre>
     */
    public void downloadQCReportByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadQCReportByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download QC Report with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public void downloadQCReportByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadQCReportByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download Label for the given Identifier
     * </pre>
     */
    public void downloadLabelByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadLabelByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download Label for the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public void downloadLabelByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadLabelByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all inventory interactions for component with the given IdentifierUUID
     * </pre>
     */
    public void viewInventoryInteractions(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryInteractionsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInventoryInteractionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public void searchAll(com.scailo.sdk.ComponentsServiceSearchAllReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public void filter(com.scailo.sdk.ComponentsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public void count(com.scailo.sdk.ComponentsServiceCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    public void downloadAsCSV(com.scailo.sdk.ComponentsServiceFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload records
     * </pre>
     */
    public void downloadImportTemplate(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadImportTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import records using a CSV file. Imports records as initial stock
     * </pre>
     */
    public void importFromCSV(com.scailo.sdk.StandardFile request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUIDsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ComponentsService.
   * <pre>
   *Describes the common methods applicable on each component
   * </pre>
   */
  public static final class ComponentsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ComponentsServiceBlockingStub> {
    private ComponentsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComponentsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComponentsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create (and Send for QC)
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse create(com.scailo.sdk.ComponentsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send to Store
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse sendToStore(com.scailo.sdk.ComponentsServiceSendToStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendToStoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse update(com.scailo.sdk.ComponentsServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send for Rework
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse sendForRework(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendForReworkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send for QC
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse sendForQC(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendForQCMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Split into unit quantities
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse splitLot(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSplitLotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a partition from the parent lot (and returns the identifier of the new partition)
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse partition(com.scailo.sdk.InventoryPartitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPartitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Consume
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse consume(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reject
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse reject(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRejectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Scrap
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse scrap(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScrapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse returnMaterial(com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReturnMaterialMethod(), getCallOptions(), request);
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
     * View by ID
     * </pre>
     */
    public com.scailo.sdk.Component viewByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.scailo.sdk.Component viewByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.scailo.sdk.Component viewEssentialByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.scailo.sdk.Component viewEssentialByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEssentialByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.scailo.sdk.ComponentsList viewFromIDs(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all records with the given UUIDs
     * </pre>
     */
    public com.scailo.sdk.ComponentsList viewFromUUIDs(com.scailo.sdk.IdentifierUUIDsList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFromUUIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.scailo.sdk.ComponentsList viewAll(com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.scailo.sdk.ComponentsServicePaginationResponse viewWithPagination(com.scailo.sdk.ComponentsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWithPaginationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View component families for the given production plan
     * </pre>
     */
    public com.scailo.sdk.FamiliesList viewFamiliesInProductionPlan(com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFamiliesInProductionPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Filter component families for the given production plan
     * </pre>
     */
    public com.scailo.sdk.FamiliesList filterFamiliesInProductionPlan(com.scailo.sdk.FilterFamiliesReqForIdentifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterFamiliesInProductionPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download QC Report with the given Identifier
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadQCReportByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadQCReportByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download QC Report with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadQCReportByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadQCReportByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download Label for the given Identifier
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadLabelByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadLabelByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download Label for the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadLabelByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadLabelByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all inventory interactions for component with the given IdentifierUUID
     * </pre>
     */
    public com.scailo.sdk.InventoryInteractionsList viewInventoryInteractions(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInventoryInteractionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.scailo.sdk.ComponentsList searchAll(com.scailo.sdk.ComponentsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.ComponentsList filter(com.scailo.sdk.ComponentsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse count(com.scailo.sdk.ComponentsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadAsCSV(com.scailo.sdk.ComponentsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadAsCSVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload records
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadImportTemplate(com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadImportTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import records using a CSV file. Imports records as initial stock
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUIDsList importFromCSV(com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportFromCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ComponentsService.
   * <pre>
   *Describes the common methods applicable on each component
   * </pre>
   */
  public static final class ComponentsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ComponentsServiceFutureStub> {
    private ComponentsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComponentsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComponentsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create (and Send for QC)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> create(
        com.scailo.sdk.ComponentsServiceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send to Store
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> sendToStore(
        com.scailo.sdk.ComponentsServiceSendToStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendToStoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> update(
        com.scailo.sdk.ComponentsServiceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send for Rework
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> sendForRework(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendForReworkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send for QC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> sendForQC(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendForQCMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Split into unit quantities
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> splitLot(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSplitLotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a partition from the parent lot (and returns the identifier of the new partition)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> partition(
        com.scailo.sdk.InventoryPartitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPartitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Consume
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> consume(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reject
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> reject(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRejectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Scrap
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> scrap(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScrapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> returnMaterial(
        com.scailo.sdk.IdentifierUUIDWithUserComment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReturnMaterialMethod(), getCallOptions()), request);
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
     * View by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Component> viewByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Component> viewByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components by ID (without logs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Component> viewEssentialByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View only essential components (without logs) that matches the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.Component> viewEssentialByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEssentialByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ComponentsList> viewFromIDs(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all records with the given UUIDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ComponentsList> viewFromUUIDs(
        com.scailo.sdk.IdentifierUUIDsList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFromUUIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ComponentsList> viewAll(
        com.scailo.sdk.ActiveStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ComponentsServicePaginationResponse> viewWithPagination(
        com.scailo.sdk.ComponentsServicePaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWithPaginationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View component families for the given production plan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> viewFamiliesInProductionPlan(
        com.scailo.sdk.IdentifierWithSearchKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFamiliesInProductionPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Filter component families for the given production plan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.FamiliesList> filterFamiliesInProductionPlan(
        com.scailo.sdk.FilterFamiliesReqForIdentifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterFamiliesInProductionPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download QC Report with the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadQCReportByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadQCReportByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download QC Report with the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadQCReportByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadQCReportByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download Label for the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadLabelByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadLabelByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download Label for the given IdentifierUUID (can be used to allow public downloads)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadLabelByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadLabelByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all inventory interactions for component with the given IdentifierUUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InventoryInteractionsList> viewInventoryInteractions(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInventoryInteractionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given search key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ComponentsList> searchAll(
        com.scailo.sdk.ComponentsServiceSearchAllReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ComponentsList> filter(
        com.scailo.sdk.ComponentsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all that match the given criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> count(
        com.scailo.sdk.ComponentsServiceCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CSV operations
     * Download the CSV file that consists of the list of records according to the given filter request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadAsCSV(
        com.scailo.sdk.ComponentsServiceFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadAsCSVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download the CSV template that could be used to upload records
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadImportTemplate(
        com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadImportTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import records using a CSV file. Imports records as initial stock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUIDsList> importFromCSV(
        com.scailo.sdk.StandardFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportFromCSVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_SEND_TO_STORE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_SEND_FOR_REWORK = 3;
  private static final int METHODID_SEND_FOR_QC = 4;
  private static final int METHODID_SPLIT_LOT = 5;
  private static final int METHODID_PARTITION = 6;
  private static final int METHODID_CONSUME = 7;
  private static final int METHODID_REJECT = 8;
  private static final int METHODID_SCRAP = 9;
  private static final int METHODID_RETURN_MATERIAL = 10;
  private static final int METHODID_DISCARD = 11;
  private static final int METHODID_COMMENT_ADD = 12;
  private static final int METHODID_CREATE_MAGIC_LINK = 13;
  private static final int METHODID_VIEW_BY_ID = 14;
  private static final int METHODID_VIEW_BY_UUID = 15;
  private static final int METHODID_VIEW_ESSENTIAL_BY_ID = 16;
  private static final int METHODID_VIEW_ESSENTIAL_BY_UUID = 17;
  private static final int METHODID_VIEW_FROM_IDS = 18;
  private static final int METHODID_VIEW_FROM_UUIDS = 19;
  private static final int METHODID_VIEW_ALL = 20;
  private static final int METHODID_VIEW_WITH_PAGINATION = 21;
  private static final int METHODID_VIEW_FAMILIES_IN_PRODUCTION_PLAN = 22;
  private static final int METHODID_FILTER_FAMILIES_IN_PRODUCTION_PLAN = 23;
  private static final int METHODID_DOWNLOAD_QCREPORT_BY_ID = 24;
  private static final int METHODID_DOWNLOAD_QCREPORT_BY_UUID = 25;
  private static final int METHODID_DOWNLOAD_LABEL_BY_ID = 26;
  private static final int METHODID_DOWNLOAD_LABEL_BY_UUID = 27;
  private static final int METHODID_VIEW_INVENTORY_INTERACTIONS = 28;
  private static final int METHODID_SEARCH_ALL = 29;
  private static final int METHODID_FILTER = 30;
  private static final int METHODID_COUNT = 31;
  private static final int METHODID_DOWNLOAD_AS_CSV = 32;
  private static final int METHODID_DOWNLOAD_IMPORT_TEMPLATE = 33;
  private static final int METHODID_IMPORT_FROM_CSV = 34;

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
          serviceImpl.create((com.scailo.sdk.ComponentsServiceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SEND_TO_STORE:
          serviceImpl.sendToStore((com.scailo.sdk.ComponentsServiceSendToStoreRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.scailo.sdk.ComponentsServiceUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SEND_FOR_REWORK:
          serviceImpl.sendForRework((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SEND_FOR_QC:
          serviceImpl.sendForQC((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SPLIT_LOT:
          serviceImpl.splitLot((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_PARTITION:
          serviceImpl.partition((com.scailo.sdk.InventoryPartitionRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_CONSUME:
          serviceImpl.consume((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_REJECT:
          serviceImpl.reject((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SCRAP:
          serviceImpl.scrap((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_RETURN_MATERIAL:
          serviceImpl.returnMaterial((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_DISCARD:
          serviceImpl.discard((com.scailo.sdk.IdentifierUUIDWithUserComment) request,
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
        case METHODID_VIEW_BY_ID:
          serviceImpl.viewByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Component>) responseObserver);
          break;
        case METHODID_VIEW_BY_UUID:
          serviceImpl.viewByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Component>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_ID:
          serviceImpl.viewEssentialByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Component>) responseObserver);
          break;
        case METHODID_VIEW_ESSENTIAL_BY_UUID:
          serviceImpl.viewEssentialByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.Component>) responseObserver);
          break;
        case METHODID_VIEW_FROM_IDS:
          serviceImpl.viewFromIDs((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList>) responseObserver);
          break;
        case METHODID_VIEW_FROM_UUIDS:
          serviceImpl.viewFromUUIDs((com.scailo.sdk.IdentifierUUIDsList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList>) responseObserver);
          break;
        case METHODID_VIEW_ALL:
          serviceImpl.viewAll((com.scailo.sdk.ActiveStatus) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList>) responseObserver);
          break;
        case METHODID_VIEW_WITH_PAGINATION:
          serviceImpl.viewWithPagination((com.scailo.sdk.ComponentsServicePaginationReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsServicePaginationResponse>) responseObserver);
          break;
        case METHODID_VIEW_FAMILIES_IN_PRODUCTION_PLAN:
          serviceImpl.viewFamiliesInProductionPlan((com.scailo.sdk.IdentifierWithSearchKey) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_FILTER_FAMILIES_IN_PRODUCTION_PLAN:
          serviceImpl.filterFamiliesInProductionPlan((com.scailo.sdk.FilterFamiliesReqForIdentifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.FamiliesList>) responseObserver);
          break;
        case METHODID_DOWNLOAD_QCREPORT_BY_ID:
          serviceImpl.downloadQCReportByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_QCREPORT_BY_UUID:
          serviceImpl.downloadQCReportByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_LABEL_BY_ID:
          serviceImpl.downloadLabelByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_LABEL_BY_UUID:
          serviceImpl.downloadLabelByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_VIEW_INVENTORY_INTERACTIONS:
          serviceImpl.viewInventoryInteractions((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryInteractionsList>) responseObserver);
          break;
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.scailo.sdk.ComponentsServiceSearchAllReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList>) responseObserver);
          break;
        case METHODID_FILTER:
          serviceImpl.filter((com.scailo.sdk.ComponentsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ComponentsList>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.scailo.sdk.ComponentsServiceCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_AS_CSV:
          serviceImpl.downloadAsCSV((com.scailo.sdk.ComponentsServiceFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_IMPORT_TEMPLATE:
          serviceImpl.downloadImportTemplate((com.scailo.sdk.Empty) request,
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
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ComponentsServiceCreateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getSendToStoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ComponentsServiceSendToStoreRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_SEND_TO_STORE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ComponentsServiceUpdateRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getSendForReworkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_SEND_FOR_REWORK)))
        .addMethod(
          getSendForQCMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_SEND_FOR_QC)))
        .addMethod(
          getSplitLotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_SPLIT_LOT)))
        .addMethod(
          getPartitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InventoryPartitionRequest,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_PARTITION)))
        .addMethod(
          getConsumeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_CONSUME)))
        .addMethod(
          getRejectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_REJECT)))
        .addMethod(
          getScrapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_SCRAP)))
        .addMethod(
          getReturnMaterialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_RETURN_MATERIAL)))
        .addMethod(
          getDiscardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDWithUserComment,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DISCARD)))
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
          getViewByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Component>(
                service, METHODID_VIEW_BY_ID)))
        .addMethod(
          getViewByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Component>(
                service, METHODID_VIEW_BY_UUID)))
        .addMethod(
          getViewEssentialByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.Component>(
                service, METHODID_VIEW_ESSENTIAL_BY_ID)))
        .addMethod(
          getViewEssentialByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.Component>(
                service, METHODID_VIEW_ESSENTIAL_BY_UUID)))
        .addMethod(
          getViewFromIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.ComponentsList>(
                service, METHODID_VIEW_FROM_IDS)))
        .addMethod(
          getViewFromUUIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUIDsList,
              com.scailo.sdk.ComponentsList>(
                service, METHODID_VIEW_FROM_UUIDS)))
        .addMethod(
          getViewAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ActiveStatus,
              com.scailo.sdk.ComponentsList>(
                service, METHODID_VIEW_ALL)))
        .addMethod(
          getViewWithPaginationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ComponentsServicePaginationReq,
              com.scailo.sdk.ComponentsServicePaginationResponse>(
                service, METHODID_VIEW_WITH_PAGINATION)))
        .addMethod(
          getViewFamiliesInProductionPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierWithSearchKey,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_VIEW_FAMILIES_IN_PRODUCTION_PLAN)))
        .addMethod(
          getFilterFamiliesInProductionPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.FilterFamiliesReqForIdentifier,
              com.scailo.sdk.FamiliesList>(
                service, METHODID_FILTER_FAMILIES_IN_PRODUCTION_PLAN)))
        .addMethod(
          getDownloadQCReportByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_QCREPORT_BY_ID)))
        .addMethod(
          getDownloadQCReportByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_QCREPORT_BY_UUID)))
        .addMethod(
          getDownloadLabelByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_LABEL_BY_ID)))
        .addMethod(
          getDownloadLabelByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_LABEL_BY_UUID)))
        .addMethod(
          getViewInventoryInteractionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.InventoryInteractionsList>(
                service, METHODID_VIEW_INVENTORY_INTERACTIONS)))
        .addMethod(
          getSearchAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ComponentsServiceSearchAllReq,
              com.scailo.sdk.ComponentsList>(
                service, METHODID_SEARCH_ALL)))
        .addMethod(
          getFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ComponentsServiceFilterReq,
              com.scailo.sdk.ComponentsList>(
                service, METHODID_FILTER)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ComponentsServiceCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getDownloadAsCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ComponentsServiceFilterReq,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_AS_CSV)))
        .addMethod(
          getDownloadImportTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Empty,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_IMPORT_TEMPLATE)))
        .addMethod(
          getImportFromCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.StandardFile,
              com.scailo.sdk.IdentifierUUIDsList>(
                service, METHODID_IMPORT_FROM_CSV)))
        .build();
  }

  private static abstract class ComponentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComponentsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.ComponentsScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComponentsService");
    }
  }

  private static final class ComponentsServiceFileDescriptorSupplier
      extends ComponentsServiceBaseDescriptorSupplier {
    ComponentsServiceFileDescriptorSupplier() {}
  }

  private static final class ComponentsServiceMethodDescriptorSupplier
      extends ComponentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ComponentsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ComponentsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComponentsServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getSendToStoreMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getSendForReworkMethod())
              .addMethod(getSendForQCMethod())
              .addMethod(getSplitLotMethod())
              .addMethod(getPartitionMethod())
              .addMethod(getConsumeMethod())
              .addMethod(getRejectMethod())
              .addMethod(getScrapMethod())
              .addMethod(getReturnMaterialMethod())
              .addMethod(getDiscardMethod())
              .addMethod(getCommentAddMethod())
              .addMethod(getCreateMagicLinkMethod())
              .addMethod(getViewByIDMethod())
              .addMethod(getViewByUUIDMethod())
              .addMethod(getViewEssentialByIDMethod())
              .addMethod(getViewEssentialByUUIDMethod())
              .addMethod(getViewFromIDsMethod())
              .addMethod(getViewFromUUIDsMethod())
              .addMethod(getViewAllMethod())
              .addMethod(getViewWithPaginationMethod())
              .addMethod(getViewFamiliesInProductionPlanMethod())
              .addMethod(getFilterFamiliesInProductionPlanMethod())
              .addMethod(getDownloadQCReportByIDMethod())
              .addMethod(getDownloadQCReportByUUIDMethod())
              .addMethod(getDownloadLabelByIDMethod())
              .addMethod(getDownloadLabelByUUIDMethod())
              .addMethod(getViewInventoryInteractionsMethod())
              .addMethod(getSearchAllMethod())
              .addMethod(getFilterMethod())
              .addMethod(getCountMethod())
              .addMethod(getDownloadAsCSVMethod())
              .addMethod(getDownloadImportTemplateMethod())
              .addMethod(getImportFromCSVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
