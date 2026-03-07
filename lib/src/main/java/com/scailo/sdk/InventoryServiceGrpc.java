package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the common methods applicable on inventory
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: inventory.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventoryServiceGrpc {

  private InventoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.InventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InventoryHashSearchReq,
      com.scailo.sdk.GenericInventory> getViewByHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByHash",
      requestType = com.scailo.sdk.InventoryHashSearchReq.class,
      responseType = com.scailo.sdk.GenericInventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InventoryHashSearchReq,
      com.scailo.sdk.GenericInventory> getViewByHashMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InventoryHashSearchReq, com.scailo.sdk.GenericInventory> getViewByHashMethod;
    if ((getViewByHashMethod = InventoryServiceGrpc.getViewByHashMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewByHashMethod = InventoryServiceGrpc.getViewByHashMethod) == null) {
          InventoryServiceGrpc.getViewByHashMethod = getViewByHashMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InventoryHashSearchReq, com.scailo.sdk.GenericInventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryHashSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewByHash"))
              .build();
        }
      }
    }
    return getViewByHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.GenericInventory> getViewByShortURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewByShortURL",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.GenericInventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.GenericInventory> getViewByShortURLMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.GenericInventory> getViewByShortURLMethod;
    if ((getViewByShortURLMethod = InventoryServiceGrpc.getViewByShortURLMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewByShortURLMethod = InventoryServiceGrpc.getViewByShortURLMethod) == null) {
          InventoryServiceGrpc.getViewByShortURLMethod = getViewByShortURLMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.GenericInventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewByShortURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewByShortURL"))
              .build();
        }
      }
    }
    return getViewByShortURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IssuableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewIssuableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewIssuable",
      requestType = com.scailo.sdk.IssuableInventorySearchReq.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IssuableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewIssuableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IssuableInventorySearchReq, com.scailo.sdk.GenericInventoryList> getViewIssuableMethod;
    if ((getViewIssuableMethod = InventoryServiceGrpc.getViewIssuableMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewIssuableMethod = InventoryServiceGrpc.getViewIssuableMethod) == null) {
          InventoryServiceGrpc.getViewIssuableMethod = getViewIssuableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IssuableInventorySearchReq, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewIssuable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IssuableInventorySearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewIssuable"))
              .build();
        }
      }
    }
    return getViewIssuableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewIssuedForGoodsDispatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewIssuedForGoodsDispatch",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewIssuedForGoodsDispatchMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList> getViewIssuedForGoodsDispatchMethod;
    if ((getViewIssuedForGoodsDispatchMethod = InventoryServiceGrpc.getViewIssuedForGoodsDispatchMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewIssuedForGoodsDispatchMethod = InventoryServiceGrpc.getViewIssuedForGoodsDispatchMethod) == null) {
          InventoryServiceGrpc.getViewIssuedForGoodsDispatchMethod = getViewIssuedForGoodsDispatchMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewIssuedForGoodsDispatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewIssuedForGoodsDispatch"))
              .build();
        }
      }
    }
    return getViewIssuedForGoodsDispatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewIssuedForOutwardJobFreeIssueMaterialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewIssuedForOutwardJobFreeIssueMaterial",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewIssuedForOutwardJobFreeIssueMaterialMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList> getViewIssuedForOutwardJobFreeIssueMaterialMethod;
    if ((getViewIssuedForOutwardJobFreeIssueMaterialMethod = InventoryServiceGrpc.getViewIssuedForOutwardJobFreeIssueMaterialMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewIssuedForOutwardJobFreeIssueMaterialMethod = InventoryServiceGrpc.getViewIssuedForOutwardJobFreeIssueMaterialMethod) == null) {
          InventoryServiceGrpc.getViewIssuedForOutwardJobFreeIssueMaterialMethod = getViewIssuedForOutwardJobFreeIssueMaterialMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewIssuedForOutwardJobFreeIssueMaterial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewIssuedForOutwardJobFreeIssueMaterial"))
              .build();
        }
      }
    }
    return getViewIssuedForOutwardJobFreeIssueMaterialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewAdmittedFromGoodsReceiptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAdmittedFromGoodsReceipt",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewAdmittedFromGoodsReceiptMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList> getViewAdmittedFromGoodsReceiptMethod;
    if ((getViewAdmittedFromGoodsReceiptMethod = InventoryServiceGrpc.getViewAdmittedFromGoodsReceiptMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewAdmittedFromGoodsReceiptMethod = InventoryServiceGrpc.getViewAdmittedFromGoodsReceiptMethod) == null) {
          InventoryServiceGrpc.getViewAdmittedFromGoodsReceiptMethod = getViewAdmittedFromGoodsReceiptMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAdmittedFromGoodsReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewAdmittedFromGoodsReceipt"))
              .build();
        }
      }
    }
    return getViewAdmittedFromGoodsReceiptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewAdmittedFromInwardJobFreeIssueMaterialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAdmittedFromInwardJobFreeIssueMaterial",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewAdmittedFromInwardJobFreeIssueMaterialMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList> getViewAdmittedFromInwardJobFreeIssueMaterialMethod;
    if ((getViewAdmittedFromInwardJobFreeIssueMaterialMethod = InventoryServiceGrpc.getViewAdmittedFromInwardJobFreeIssueMaterialMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewAdmittedFromInwardJobFreeIssueMaterialMethod = InventoryServiceGrpc.getViewAdmittedFromInwardJobFreeIssueMaterialMethod) == null) {
          InventoryServiceGrpc.getViewAdmittedFromInwardJobFreeIssueMaterialMethod = getViewAdmittedFromInwardJobFreeIssueMaterialMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAdmittedFromInwardJobFreeIssueMaterial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewAdmittedFromInwardJobFreeIssueMaterial"))
              .build();
        }
      }
    }
    return getViewAdmittedFromInwardJobFreeIssueMaterialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewAdmittedFromProductionPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAdmittedFromProductionPlan",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewAdmittedFromProductionPlanMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList> getViewAdmittedFromProductionPlanMethod;
    if ((getViewAdmittedFromProductionPlanMethod = InventoryServiceGrpc.getViewAdmittedFromProductionPlanMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewAdmittedFromProductionPlanMethod = InventoryServiceGrpc.getViewAdmittedFromProductionPlanMethod) == null) {
          InventoryServiceGrpc.getViewAdmittedFromProductionPlanMethod = getViewAdmittedFromProductionPlanMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAdmittedFromProductionPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewAdmittedFromProductionPlan"))
              .build();
        }
      }
    }
    return getViewAdmittedFromProductionPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForPurchaseOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewReturnableForPurchaseOrder",
      requestType = com.scailo.sdk.ReturnableInventorySearchReq.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForPurchaseOrderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList> getViewReturnableForPurchaseOrderMethod;
    if ((getViewReturnableForPurchaseOrderMethod = InventoryServiceGrpc.getViewReturnableForPurchaseOrderMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewReturnableForPurchaseOrderMethod = InventoryServiceGrpc.getViewReturnableForPurchaseOrderMethod) == null) {
          InventoryServiceGrpc.getViewReturnableForPurchaseOrderMethod = getViewReturnableForPurchaseOrderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewReturnableForPurchaseOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReturnableInventorySearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewReturnableForPurchaseOrder"))
              .build();
        }
      }
    }
    return getViewReturnableForPurchaseOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForInwardJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewReturnableForInwardJob",
      requestType = com.scailo.sdk.ReturnableInventorySearchReq.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForInwardJobMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList> getViewReturnableForInwardJobMethod;
    if ((getViewReturnableForInwardJobMethod = InventoryServiceGrpc.getViewReturnableForInwardJobMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewReturnableForInwardJobMethod = InventoryServiceGrpc.getViewReturnableForInwardJobMethod) == null) {
          InventoryServiceGrpc.getViewReturnableForInwardJobMethod = getViewReturnableForInwardJobMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewReturnableForInwardJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReturnableInventorySearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewReturnableForInwardJob"))
              .build();
        }
      }
    }
    return getViewReturnableForInwardJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForStockIssuanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewReturnableForStockIssuance",
      requestType = com.scailo.sdk.ReturnableInventorySearchReq.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForStockIssuanceMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList> getViewReturnableForStockIssuanceMethod;
    if ((getViewReturnableForStockIssuanceMethod = InventoryServiceGrpc.getViewReturnableForStockIssuanceMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewReturnableForStockIssuanceMethod = InventoryServiceGrpc.getViewReturnableForStockIssuanceMethod) == null) {
          InventoryServiceGrpc.getViewReturnableForStockIssuanceMethod = getViewReturnableForStockIssuanceMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewReturnableForStockIssuance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReturnableInventorySearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewReturnableForStockIssuance"))
              .build();
        }
      }
    }
    return getViewReturnableForStockIssuanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForSalesOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewReturnableForSalesOrder",
      requestType = com.scailo.sdk.ReturnableInventorySearchReq.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForSalesOrderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList> getViewReturnableForSalesOrderMethod;
    if ((getViewReturnableForSalesOrderMethod = InventoryServiceGrpc.getViewReturnableForSalesOrderMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewReturnableForSalesOrderMethod = InventoryServiceGrpc.getViewReturnableForSalesOrderMethod) == null) {
          InventoryServiceGrpc.getViewReturnableForSalesOrderMethod = getViewReturnableForSalesOrderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewReturnableForSalesOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReturnableInventorySearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewReturnableForSalesOrder"))
              .build();
        }
      }
    }
    return getViewReturnableForSalesOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForOutwardJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewReturnableForOutwardJob",
      requestType = com.scailo.sdk.ReturnableInventorySearchReq.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq,
      com.scailo.sdk.GenericInventoryList> getViewReturnableForOutwardJobMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList> getViewReturnableForOutwardJobMethod;
    if ((getViewReturnableForOutwardJobMethod = InventoryServiceGrpc.getViewReturnableForOutwardJobMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewReturnableForOutwardJobMethod = InventoryServiceGrpc.getViewReturnableForOutwardJobMethod) == null) {
          InventoryServiceGrpc.getViewReturnableForOutwardJobMethod = getViewReturnableForOutwardJobMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.ReturnableInventorySearchReq, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewReturnableForOutwardJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ReturnableInventorySearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewReturnableForOutwardJob"))
              .build();
        }
      }
    }
    return getViewReturnableForOutwardJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceFamilyQuantityReq,
      com.scailo.sdk.QuantityResponse> getViewQuantityRemainingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewQuantityRemaining",
      requestType = com.scailo.sdk.InventoryServiceFamilyQuantityReq.class,
      responseType = com.scailo.sdk.QuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceFamilyQuantityReq,
      com.scailo.sdk.QuantityResponse> getViewQuantityRemainingMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceFamilyQuantityReq, com.scailo.sdk.QuantityResponse> getViewQuantityRemainingMethod;
    if ((getViewQuantityRemainingMethod = InventoryServiceGrpc.getViewQuantityRemainingMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewQuantityRemainingMethod = InventoryServiceGrpc.getViewQuantityRemainingMethod) == null) {
          InventoryServiceGrpc.getViewQuantityRemainingMethod = getViewQuantityRemainingMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InventoryServiceFamilyQuantityReq, com.scailo.sdk.QuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewQuantityRemaining"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryServiceFamilyQuantityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuantityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewQuantityRemaining"))
              .build();
        }
      }
    }
    return getViewQuantityRemainingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getCountWorkInProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountWorkInProgress",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.QuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getCountWorkInProgressMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse> getCountWorkInProgressMethod;
    if ((getCountWorkInProgressMethod = InventoryServiceGrpc.getCountWorkInProgressMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getCountWorkInProgressMethod = InventoryServiceGrpc.getCountWorkInProgressMethod) == null) {
          InventoryServiceGrpc.getCountWorkInProgressMethod = getCountWorkInProgressMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountWorkInProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuantityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("CountWorkInProgress"))
              .build();
        }
      }
    }
    return getCountWorkInProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getCountIndentedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountIndented",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.QuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getCountIndentedMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse> getCountIndentedMethod;
    if ((getCountIndentedMethod = InventoryServiceGrpc.getCountIndentedMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getCountIndentedMethod = InventoryServiceGrpc.getCountIndentedMethod) == null) {
          InventoryServiceGrpc.getCountIndentedMethod = getCountIndentedMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountIndented"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuantityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("CountIndented"))
              .build();
        }
      }
    }
    return getCountIndentedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getCountOrderedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountOrdered",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.QuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getCountOrderedMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse> getCountOrderedMethod;
    if ((getCountOrderedMethod = InventoryServiceGrpc.getCountOrderedMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getCountOrderedMethod = InventoryServiceGrpc.getCountOrderedMethod) == null) {
          InventoryServiceGrpc.getCountOrderedMethod = getCountOrderedMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountOrdered"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuantityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("CountOrdered"))
              .build();
        }
      }
    }
    return getCountOrderedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getViewBaseDemandQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewBaseDemandQuantity",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.QuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getViewBaseDemandQuantityMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse> getViewBaseDemandQuantityMethod;
    if ((getViewBaseDemandQuantityMethod = InventoryServiceGrpc.getViewBaseDemandQuantityMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewBaseDemandQuantityMethod = InventoryServiceGrpc.getViewBaseDemandQuantityMethod) == null) {
          InventoryServiceGrpc.getViewBaseDemandQuantityMethod = getViewBaseDemandQuantityMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewBaseDemandQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuantityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewBaseDemandQuantity"))
              .build();
        }
      }
    }
    return getViewBaseDemandQuantityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getViewAdjustedDemandQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAdjustedDemandQuantity",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.QuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getViewAdjustedDemandQuantityMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse> getViewAdjustedDemandQuantityMethod;
    if ((getViewAdjustedDemandQuantityMethod = InventoryServiceGrpc.getViewAdjustedDemandQuantityMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewAdjustedDemandQuantityMethod = InventoryServiceGrpc.getViewAdjustedDemandQuantityMethod) == null) {
          InventoryServiceGrpc.getViewAdjustedDemandQuantityMethod = getViewAdjustedDemandQuantityMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAdjustedDemandQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuantityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewAdjustedDemandQuantity"))
              .build();
        }
      }
    }
    return getViewAdjustedDemandQuantityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getViewRequiredQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewRequiredQuantity",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.QuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.QuantityResponse> getViewRequiredQuantityMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse> getViewRequiredQuantityMethod;
    if ((getViewRequiredQuantityMethod = InventoryServiceGrpc.getViewRequiredQuantityMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewRequiredQuantityMethod = InventoryServiceGrpc.getViewRequiredQuantityMethod) == null) {
          InventoryServiceGrpc.getViewRequiredQuantityMethod = getViewRequiredQuantityMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.QuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewRequiredQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.QuantityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewRequiredQuantity"))
              .build();
        }
      }
    }
    return getViewRequiredQuantityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ConsolidatedInventoryStatistics> getViewConsolidatedStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewConsolidatedStatistics",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.ConsolidatedInventoryStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.ConsolidatedInventoryStatistics> getViewConsolidatedStatisticsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.ConsolidatedInventoryStatistics> getViewConsolidatedStatisticsMethod;
    if ((getViewConsolidatedStatisticsMethod = InventoryServiceGrpc.getViewConsolidatedStatisticsMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewConsolidatedStatisticsMethod = InventoryServiceGrpc.getViewConsolidatedStatisticsMethod) == null) {
          InventoryServiceGrpc.getViewConsolidatedStatisticsMethod = getViewConsolidatedStatisticsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.ConsolidatedInventoryStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewConsolidatedStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ConsolidatedInventoryStatistics.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewConsolidatedStatistics"))
              .build();
        }
      }
    }
    return getViewConsolidatedStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.ConsolidatedInventoryStatisticsList> getViewConsolidatedStatisticsForFamiliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewConsolidatedStatisticsForFamilies",
      requestType = com.scailo.sdk.IdentifiersList.class,
      responseType = com.scailo.sdk.ConsolidatedInventoryStatisticsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList,
      com.scailo.sdk.ConsolidatedInventoryStatisticsList> getViewConsolidatedStatisticsForFamiliesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifiersList, com.scailo.sdk.ConsolidatedInventoryStatisticsList> getViewConsolidatedStatisticsForFamiliesMethod;
    if ((getViewConsolidatedStatisticsForFamiliesMethod = InventoryServiceGrpc.getViewConsolidatedStatisticsForFamiliesMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewConsolidatedStatisticsForFamiliesMethod = InventoryServiceGrpc.getViewConsolidatedStatisticsForFamiliesMethod) == null) {
          InventoryServiceGrpc.getViewConsolidatedStatisticsForFamiliesMethod = getViewConsolidatedStatisticsForFamiliesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifiersList, com.scailo.sdk.ConsolidatedInventoryStatisticsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewConsolidatedStatisticsForFamilies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifiersList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ConsolidatedInventoryStatisticsList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewConsolidatedStatisticsForFamilies"))
              .build();
        }
      }
    }
    return getViewConsolidatedStatisticsForFamiliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewInStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewInStorage",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.GenericInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.GenericInventoryList> getViewInStorageMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList> getViewInStorageMethod;
    if ((getViewInStorageMethod = InventoryServiceGrpc.getViewInStorageMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewInStorageMethod = InventoryServiceGrpc.getViewInStorageMethod) == null) {
          InventoryServiceGrpc.getViewInStorageMethod = getViewInStorageMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.GenericInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewInStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventoryList.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewInStorage"))
              .build();
        }
      }
    }
    return getViewInStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InventoryWorkInProgressStatistics> getViewWorkInProgressStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewWorkInProgressStatistics",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.InventoryWorkInProgressStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InventoryWorkInProgressStatistics> getViewWorkInProgressStatisticsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.InventoryWorkInProgressStatistics> getViewWorkInProgressStatisticsMethod;
    if ((getViewWorkInProgressStatisticsMethod = InventoryServiceGrpc.getViewWorkInProgressStatisticsMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewWorkInProgressStatisticsMethod = InventoryServiceGrpc.getViewWorkInProgressStatisticsMethod) == null) {
          InventoryServiceGrpc.getViewWorkInProgressStatisticsMethod = getViewWorkInProgressStatisticsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.InventoryWorkInProgressStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewWorkInProgressStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryWorkInProgressStatistics.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewWorkInProgressStatistics"))
              .build();
        }
      }
    }
    return getViewWorkInProgressStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InventoryIndentedStatistics> getViewIndentedStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewIndentedStatistics",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.InventoryIndentedStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InventoryIndentedStatistics> getViewIndentedStatisticsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.InventoryIndentedStatistics> getViewIndentedStatisticsMethod;
    if ((getViewIndentedStatisticsMethod = InventoryServiceGrpc.getViewIndentedStatisticsMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewIndentedStatisticsMethod = InventoryServiceGrpc.getViewIndentedStatisticsMethod) == null) {
          InventoryServiceGrpc.getViewIndentedStatisticsMethod = getViewIndentedStatisticsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.InventoryIndentedStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewIndentedStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryIndentedStatistics.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewIndentedStatistics"))
              .build();
        }
      }
    }
    return getViewIndentedStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InventoryOrderedStatistics> getViewOrderedStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewOrderedStatistics",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.InventoryOrderedStatistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InventoryOrderedStatistics> getViewOrderedStatisticsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.InventoryOrderedStatistics> getViewOrderedStatisticsMethod;
    if ((getViewOrderedStatisticsMethod = InventoryServiceGrpc.getViewOrderedStatisticsMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewOrderedStatisticsMethod = InventoryServiceGrpc.getViewOrderedStatisticsMethod) == null) {
          InventoryServiceGrpc.getViewOrderedStatisticsMethod = getViewOrderedStatisticsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.InventoryOrderedStatistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewOrderedStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryOrderedStatistics.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewOrderedStatistics"))
              .build();
        }
      }
    }
    return getViewOrderedStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InventoryDetailedDemand> getViewDetailedDemandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewDetailedDemand",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.InventoryDetailedDemand.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.InventoryDetailedDemand> getViewDetailedDemandMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.InventoryDetailedDemand> getViewDetailedDemandMethod;
    if ((getViewDetailedDemandMethod = InventoryServiceGrpc.getViewDetailedDemandMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getViewDetailedDemandMethod = InventoryServiceGrpc.getViewDetailedDemandMethod) == null) {
          InventoryServiceGrpc.getViewDetailedDemandMethod = getViewDetailedDemandMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.InventoryDetailedDemand>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewDetailedDemand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryDetailedDemand.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("ViewDetailedDemand"))
              .build();
        }
      }
    }
    return getViewDetailedDemandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq,
      com.scailo.sdk.GenericInventory> getUpdateStorageWithShortURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStorageWithShortURL",
      requestType = com.scailo.sdk.InventoryServiceUpdateStorageReq.class,
      responseType = com.scailo.sdk.GenericInventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq,
      com.scailo.sdk.GenericInventory> getUpdateStorageWithShortURLMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq, com.scailo.sdk.GenericInventory> getUpdateStorageWithShortURLMethod;
    if ((getUpdateStorageWithShortURLMethod = InventoryServiceGrpc.getUpdateStorageWithShortURLMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getUpdateStorageWithShortURLMethod = InventoryServiceGrpc.getUpdateStorageWithShortURLMethod) == null) {
          InventoryServiceGrpc.getUpdateStorageWithShortURLMethod = getUpdateStorageWithShortURLMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InventoryServiceUpdateStorageReq, com.scailo.sdk.GenericInventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStorageWithShortURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryServiceUpdateStorageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("UpdateStorageWithShortURL"))
              .build();
        }
      }
    }
    return getUpdateStorageWithShortURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq,
      com.scailo.sdk.GenericInventory> getUpdateStorageWithInternalItemCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStorageWithInternalItemCode",
      requestType = com.scailo.sdk.InventoryServiceUpdateStorageReq.class,
      responseType = com.scailo.sdk.GenericInventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq,
      com.scailo.sdk.GenericInventory> getUpdateStorageWithInternalItemCodeMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq, com.scailo.sdk.GenericInventory> getUpdateStorageWithInternalItemCodeMethod;
    if ((getUpdateStorageWithInternalItemCodeMethod = InventoryServiceGrpc.getUpdateStorageWithInternalItemCodeMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getUpdateStorageWithInternalItemCodeMethod = InventoryServiceGrpc.getUpdateStorageWithInternalItemCodeMethod) == null) {
          InventoryServiceGrpc.getUpdateStorageWithInternalItemCodeMethod = getUpdateStorageWithInternalItemCodeMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InventoryServiceUpdateStorageReq, com.scailo.sdk.GenericInventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStorageWithInternalItemCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryServiceUpdateStorageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("UpdateStorageWithInternalItemCode"))
              .build();
        }
      }
    }
    return getUpdateStorageWithInternalItemCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq,
      com.scailo.sdk.GenericInventory> getMoveToStorageWithShortURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveToStorageWithShortURL",
      requestType = com.scailo.sdk.InventoryServiceUpdateStorageReq.class,
      responseType = com.scailo.sdk.GenericInventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq,
      com.scailo.sdk.GenericInventory> getMoveToStorageWithShortURLMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq, com.scailo.sdk.GenericInventory> getMoveToStorageWithShortURLMethod;
    if ((getMoveToStorageWithShortURLMethod = InventoryServiceGrpc.getMoveToStorageWithShortURLMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getMoveToStorageWithShortURLMethod = InventoryServiceGrpc.getMoveToStorageWithShortURLMethod) == null) {
          InventoryServiceGrpc.getMoveToStorageWithShortURLMethod = getMoveToStorageWithShortURLMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InventoryServiceUpdateStorageReq, com.scailo.sdk.GenericInventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveToStorageWithShortURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryServiceUpdateStorageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("MoveToStorageWithShortURL"))
              .build();
        }
      }
    }
    return getMoveToStorageWithShortURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq,
      com.scailo.sdk.GenericInventory> getMoveToStorageWithInternalItemCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveToStorageWithInternalItemCode",
      requestType = com.scailo.sdk.InventoryServiceUpdateStorageReq.class,
      responseType = com.scailo.sdk.GenericInventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq,
      com.scailo.sdk.GenericInventory> getMoveToStorageWithInternalItemCodeMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.InventoryServiceUpdateStorageReq, com.scailo.sdk.GenericInventory> getMoveToStorageWithInternalItemCodeMethod;
    if ((getMoveToStorageWithInternalItemCodeMethod = InventoryServiceGrpc.getMoveToStorageWithInternalItemCodeMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getMoveToStorageWithInternalItemCodeMethod = InventoryServiceGrpc.getMoveToStorageWithInternalItemCodeMethod) == null) {
          InventoryServiceGrpc.getMoveToStorageWithInternalItemCodeMethod = getMoveToStorageWithInternalItemCodeMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.InventoryServiceUpdateStorageReq, com.scailo.sdk.GenericInventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveToStorageWithInternalItemCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.InventoryServiceUpdateStorageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GenericInventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("MoveToStorageWithInternalItemCode"))
              .build();
        }
      }
    }
    return getMoveToStorageWithInternalItemCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceStub>() {
        @java.lang.Override
        public InventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceStub(channel, callOptions);
        }
      };
    return InventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceBlockingStub>() {
        @java.lang.Override
        public InventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return InventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceFutureStub>() {
        @java.lang.Override
        public InventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceFutureStub(channel, callOptions);
        }
      };
    return InventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the common methods applicable on inventory
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * View inventory item by hash
     * </pre>
     */
    default void viewByHash(com.scailo.sdk.InventoryHashSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * View inventory item by short URL
     * </pre>
     */
    default void viewByShortURL(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewByShortURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * View issuable inventory
     * </pre>
     */
    default void viewIssuable(com.scailo.sdk.IssuableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewIssuableMethod(), responseObserver);
    }

    /**
     * <pre>
     * View issued inventory for a Goods Dispatch represented by the Identifier
     * </pre>
     */
    default void viewIssuedForGoodsDispatch(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewIssuedForGoodsDispatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * View issued inventory for an Outward Job Free Issue Material represented by the Identifier
     * </pre>
     */
    default void viewIssuedForOutwardJobFreeIssueMaterial(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewIssuedForOutwardJobFreeIssueMaterialMethod(), responseObserver);
    }

    /**
     * <pre>
     * View admitted inventory from a Goods Receipt represented by the Identifier
     * </pre>
     */
    default void viewAdmittedFromGoodsReceipt(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAdmittedFromGoodsReceiptMethod(), responseObserver);
    }

    /**
     * <pre>
     * View admitted inventory from an Inward Job Free Issue Material represented by the Identifier
     * </pre>
     */
    default void viewAdmittedFromInwardJobFreeIssueMaterial(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAdmittedFromInwardJobFreeIssueMaterialMethod(), responseObserver);
    }

    /**
     * <pre>
     * View admitted inventory from a Production Plan represented by the Identifier
     * </pre>
     */
    default void viewAdmittedFromProductionPlan(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAdmittedFromProductionPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from a purchase order
     * </pre>
     */
    @java.lang.Deprecated
    default void viewReturnableForPurchaseOrder(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewReturnableForPurchaseOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from an inward job
     * </pre>
     */
    @java.lang.Deprecated
    default void viewReturnableForInwardJob(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewReturnableForInwardJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from a stock issuance
     * </pre>
     */
    @java.lang.Deprecated
    default void viewReturnableForStockIssuance(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewReturnableForStockIssuanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from a sales order
     * </pre>
     */
    @java.lang.Deprecated
    default void viewReturnableForSalesOrder(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewReturnableForSalesOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from an outward job
     * </pre>
     */
    @java.lang.Deprecated
    default void viewReturnableForOutwardJob(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewReturnableForOutwardJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * View quantity remaining of the family in the given status
     * </pre>
     */
    default void viewQuantityRemaining(com.scailo.sdk.InventoryServiceFamilyQuantityReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewQuantityRemainingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that are being manufactured
     * </pre>
     */
    default void countWorkInProgress(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountWorkInProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that have been indented
     * </pre>
     */
    default void countIndented(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountIndentedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that have been ordered
     * </pre>
     */
    default void countOrdered(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountOrderedMethod(), responseObserver);
    }

    /**
     * <pre>
     * View base demand quantity of the family with the given Identifier
     * </pre>
     */
    default void viewBaseDemandQuantity(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewBaseDemandQuantityMethod(), responseObserver);
    }

    /**
     * <pre>
     * View adjusted demand quantity of the family with the given Identifier
     * </pre>
     */
    default void viewAdjustedDemandQuantity(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAdjustedDemandQuantityMethod(), responseObserver);
    }

    /**
     * <pre>
     * View required quantity of the family with the given Identifier
     * </pre>
     */
    default void viewRequiredQuantity(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewRequiredQuantityMethod(), responseObserver);
    }

    /**
     * <pre>
     * View consolidated inventory statistics for family with the given Identifier
     * </pre>
     */
    default void viewConsolidatedStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ConsolidatedInventoryStatistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewConsolidatedStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View consolidated inventory statistics for families with the given IdentifiersList
     * </pre>
     */
    default void viewConsolidatedStatisticsForFamilies(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ConsolidatedInventoryStatisticsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewConsolidatedStatisticsForFamiliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * View inventory placed in storage represented by the Identifier
     * </pre>
     */
    default void viewInStorage(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewInStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the work in progress statistics of the family with the given Identifier
     * </pre>
     */
    default void viewWorkInProgressStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryWorkInProgressStatistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewWorkInProgressStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the indented statistics of the family with the given Identifier
     * </pre>
     */
    default void viewIndentedStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryIndentedStatistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewIndentedStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the ordered statistics of the fammily with the given Identifier
     * </pre>
     */
    default void viewOrderedStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryOrderedStatistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewOrderedStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the detailed demand of the family with the given Identifier
     * </pre>
     */
    default void viewDetailedDemand(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryDetailedDemand> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewDetailedDemandMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the inventory item identified by the given short URL with the given storage
     * </pre>
     */
    default void updateStorageWithShortURL(com.scailo.sdk.InventoryServiceUpdateStorageReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStorageWithShortURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the first inventory item identified by the given internal item code with the given storage
     * </pre>
     */
    default void updateStorageWithInternalItemCode(com.scailo.sdk.InventoryServiceUpdateStorageReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStorageWithInternalItemCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves the inventory item identified by the given short URL into the given storage
     * </pre>
     */
    default void moveToStorageWithShortURL(com.scailo.sdk.InventoryServiceUpdateStorageReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveToStorageWithShortURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * Moves the inventory item identified by the given internal item code into the given storage
     * </pre>
     */
    default void moveToStorageWithInternalItemCode(com.scailo.sdk.InventoryServiceUpdateStorageReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveToStorageWithInternalItemCodeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InventoryService.
   * <pre>
   *Describes the common methods applicable on inventory
   * </pre>
   */
  public static abstract class InventoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InventoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InventoryService.
   * <pre>
   *Describes the common methods applicable on inventory
   * </pre>
   */
  public static final class InventoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InventoryServiceStub> {
    private InventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * View inventory item by hash
     * </pre>
     */
    public void viewByHash(com.scailo.sdk.InventoryHashSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View inventory item by short URL
     * </pre>
     */
    public void viewByShortURL(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewByShortURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View issuable inventory
     * </pre>
     */
    public void viewIssuable(com.scailo.sdk.IssuableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewIssuableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View issued inventory for a Goods Dispatch represented by the Identifier
     * </pre>
     */
    public void viewIssuedForGoodsDispatch(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewIssuedForGoodsDispatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View issued inventory for an Outward Job Free Issue Material represented by the Identifier
     * </pre>
     */
    public void viewIssuedForOutwardJobFreeIssueMaterial(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewIssuedForOutwardJobFreeIssueMaterialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View admitted inventory from a Goods Receipt represented by the Identifier
     * </pre>
     */
    public void viewAdmittedFromGoodsReceipt(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAdmittedFromGoodsReceiptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View admitted inventory from an Inward Job Free Issue Material represented by the Identifier
     * </pre>
     */
    public void viewAdmittedFromInwardJobFreeIssueMaterial(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAdmittedFromInwardJobFreeIssueMaterialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View admitted inventory from a Production Plan represented by the Identifier
     * </pre>
     */
    public void viewAdmittedFromProductionPlan(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAdmittedFromProductionPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from a purchase order
     * </pre>
     */
    @java.lang.Deprecated
    public void viewReturnableForPurchaseOrder(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewReturnableForPurchaseOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from an inward job
     * </pre>
     */
    @java.lang.Deprecated
    public void viewReturnableForInwardJob(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewReturnableForInwardJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from a stock issuance
     * </pre>
     */
    @java.lang.Deprecated
    public void viewReturnableForStockIssuance(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewReturnableForStockIssuanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from a sales order
     * </pre>
     */
    @java.lang.Deprecated
    public void viewReturnableForSalesOrder(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewReturnableForSalesOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View inventory that is returnable from an outward job
     * </pre>
     */
    @java.lang.Deprecated
    public void viewReturnableForOutwardJob(com.scailo.sdk.ReturnableInventorySearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewReturnableForOutwardJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View quantity remaining of the family in the given status
     * </pre>
     */
    public void viewQuantityRemaining(com.scailo.sdk.InventoryServiceFamilyQuantityReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewQuantityRemainingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that are being manufactured
     * </pre>
     */
    public void countWorkInProgress(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountWorkInProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that have been indented
     * </pre>
     */
    public void countIndented(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountIndentedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that have been ordered
     * </pre>
     */
    public void countOrdered(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountOrderedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View base demand quantity of the family with the given Identifier
     * </pre>
     */
    public void viewBaseDemandQuantity(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewBaseDemandQuantityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View adjusted demand quantity of the family with the given Identifier
     * </pre>
     */
    public void viewAdjustedDemandQuantity(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAdjustedDemandQuantityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View required quantity of the family with the given Identifier
     * </pre>
     */
    public void viewRequiredQuantity(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewRequiredQuantityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View consolidated inventory statistics for family with the given Identifier
     * </pre>
     */
    public void viewConsolidatedStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ConsolidatedInventoryStatistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewConsolidatedStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View consolidated inventory statistics for families with the given IdentifiersList
     * </pre>
     */
    public void viewConsolidatedStatisticsForFamilies(com.scailo.sdk.IdentifiersList request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ConsolidatedInventoryStatisticsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewConsolidatedStatisticsForFamiliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View inventory placed in storage represented by the Identifier
     * </pre>
     */
    public void viewInStorage(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewInStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the work in progress statistics of the family with the given Identifier
     * </pre>
     */
    public void viewWorkInProgressStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryWorkInProgressStatistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewWorkInProgressStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the indented statistics of the family with the given Identifier
     * </pre>
     */
    public void viewIndentedStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryIndentedStatistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewIndentedStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the ordered statistics of the fammily with the given Identifier
     * </pre>
     */
    public void viewOrderedStatistics(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryOrderedStatistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewOrderedStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the detailed demand of the family with the given Identifier
     * </pre>
     */
    public void viewDetailedDemand(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryDetailedDemand> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewDetailedDemandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the inventory item identified by the given short URL with the given storage
     * </pre>
     */
    public void updateStorageWithShortURL(com.scailo.sdk.InventoryServiceUpdateStorageReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStorageWithShortURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the first inventory item identified by the given internal item code with the given storage
     * </pre>
     */
    public void updateStorageWithInternalItemCode(com.scailo.sdk.InventoryServiceUpdateStorageReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStorageWithInternalItemCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves the inventory item identified by the given short URL into the given storage
     * </pre>
     */
    public void moveToStorageWithShortURL(com.scailo.sdk.InventoryServiceUpdateStorageReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveToStorageWithShortURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves the inventory item identified by the given internal item code into the given storage
     * </pre>
     */
    public void moveToStorageWithInternalItemCode(com.scailo.sdk.InventoryServiceUpdateStorageReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveToStorageWithInternalItemCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InventoryService.
   * <pre>
   *Describes the common methods applicable on inventory
   * </pre>
   */
  public static final class InventoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InventoryServiceBlockingStub> {
    private InventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * View inventory item by hash
     * </pre>
     */
    public com.scailo.sdk.GenericInventory viewByHash(com.scailo.sdk.InventoryHashSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View inventory item by short URL
     * </pre>
     */
    public com.scailo.sdk.GenericInventory viewByShortURL(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewByShortURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View issuable inventory
     * </pre>
     */
    public com.scailo.sdk.GenericInventoryList viewIssuable(com.scailo.sdk.IssuableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewIssuableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View issued inventory for a Goods Dispatch represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.GenericInventoryList viewIssuedForGoodsDispatch(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewIssuedForGoodsDispatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View issued inventory for an Outward Job Free Issue Material represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.GenericInventoryList viewIssuedForOutwardJobFreeIssueMaterial(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewIssuedForOutwardJobFreeIssueMaterialMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View admitted inventory from a Goods Receipt represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.GenericInventoryList viewAdmittedFromGoodsReceipt(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAdmittedFromGoodsReceiptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View admitted inventory from an Inward Job Free Issue Material represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.GenericInventoryList viewAdmittedFromInwardJobFreeIssueMaterial(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAdmittedFromInwardJobFreeIssueMaterialMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View admitted inventory from a Production Plan represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.GenericInventoryList viewAdmittedFromProductionPlan(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAdmittedFromProductionPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from a purchase order
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.GenericInventoryList viewReturnableForPurchaseOrder(com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewReturnableForPurchaseOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from an inward job
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.GenericInventoryList viewReturnableForInwardJob(com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewReturnableForInwardJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from a stock issuance
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.GenericInventoryList viewReturnableForStockIssuance(com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewReturnableForStockIssuanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from a sales order
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.GenericInventoryList viewReturnableForSalesOrder(com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewReturnableForSalesOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from an outward job
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.GenericInventoryList viewReturnableForOutwardJob(com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewReturnableForOutwardJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View quantity remaining of the family in the given status
     * </pre>
     */
    public com.scailo.sdk.QuantityResponse viewQuantityRemaining(com.scailo.sdk.InventoryServiceFamilyQuantityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewQuantityRemainingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that are being manufactured
     * </pre>
     */
    public com.scailo.sdk.QuantityResponse countWorkInProgress(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountWorkInProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that have been indented
     * </pre>
     */
    public com.scailo.sdk.QuantityResponse countIndented(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountIndentedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that have been ordered
     * </pre>
     */
    public com.scailo.sdk.QuantityResponse countOrdered(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountOrderedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View base demand quantity of the family with the given Identifier
     * </pre>
     */
    public com.scailo.sdk.QuantityResponse viewBaseDemandQuantity(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewBaseDemandQuantityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View adjusted demand quantity of the family with the given Identifier
     * </pre>
     */
    public com.scailo.sdk.QuantityResponse viewAdjustedDemandQuantity(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAdjustedDemandQuantityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View required quantity of the family with the given Identifier
     * </pre>
     */
    public com.scailo.sdk.QuantityResponse viewRequiredQuantity(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewRequiredQuantityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View consolidated inventory statistics for family with the given Identifier
     * </pre>
     */
    public com.scailo.sdk.ConsolidatedInventoryStatistics viewConsolidatedStatistics(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewConsolidatedStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View consolidated inventory statistics for families with the given IdentifiersList
     * </pre>
     */
    public com.scailo.sdk.ConsolidatedInventoryStatisticsList viewConsolidatedStatisticsForFamilies(com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewConsolidatedStatisticsForFamiliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View inventory placed in storage represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.GenericInventoryList viewInStorage(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewInStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the work in progress statistics of the family with the given Identifier
     * </pre>
     */
    public com.scailo.sdk.InventoryWorkInProgressStatistics viewWorkInProgressStatistics(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewWorkInProgressStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the indented statistics of the family with the given Identifier
     * </pre>
     */
    public com.scailo.sdk.InventoryIndentedStatistics viewIndentedStatistics(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewIndentedStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the ordered statistics of the fammily with the given Identifier
     * </pre>
     */
    public com.scailo.sdk.InventoryOrderedStatistics viewOrderedStatistics(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewOrderedStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the detailed demand of the family with the given Identifier
     * </pre>
     */
    public com.scailo.sdk.InventoryDetailedDemand viewDetailedDemand(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewDetailedDemandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the inventory item identified by the given short URL with the given storage
     * </pre>
     */
    public com.scailo.sdk.GenericInventory updateStorageWithShortURL(com.scailo.sdk.InventoryServiceUpdateStorageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStorageWithShortURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the first inventory item identified by the given internal item code with the given storage
     * </pre>
     */
    public com.scailo.sdk.GenericInventory updateStorageWithInternalItemCode(com.scailo.sdk.InventoryServiceUpdateStorageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStorageWithInternalItemCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves the inventory item identified by the given short URL into the given storage
     * </pre>
     */
    public com.scailo.sdk.GenericInventory moveToStorageWithShortURL(com.scailo.sdk.InventoryServiceUpdateStorageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveToStorageWithShortURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves the inventory item identified by the given internal item code into the given storage
     * </pre>
     */
    public com.scailo.sdk.GenericInventory moveToStorageWithInternalItemCode(com.scailo.sdk.InventoryServiceUpdateStorageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveToStorageWithInternalItemCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InventoryService.
   * <pre>
   *Describes the common methods applicable on inventory
   * </pre>
   */
  public static final class InventoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InventoryServiceFutureStub> {
    private InventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * View inventory item by hash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventory> viewByHash(
        com.scailo.sdk.InventoryHashSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View inventory item by short URL
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventory> viewByShortURL(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewByShortURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View issuable inventory
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewIssuable(
        com.scailo.sdk.IssuableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewIssuableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View issued inventory for a Goods Dispatch represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewIssuedForGoodsDispatch(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewIssuedForGoodsDispatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View issued inventory for an Outward Job Free Issue Material represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewIssuedForOutwardJobFreeIssueMaterial(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewIssuedForOutwardJobFreeIssueMaterialMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View admitted inventory from a Goods Receipt represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewAdmittedFromGoodsReceipt(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAdmittedFromGoodsReceiptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View admitted inventory from an Inward Job Free Issue Material represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewAdmittedFromInwardJobFreeIssueMaterial(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAdmittedFromInwardJobFreeIssueMaterialMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View admitted inventory from a Production Plan represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewAdmittedFromProductionPlan(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAdmittedFromProductionPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from a purchase order
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewReturnableForPurchaseOrder(
        com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewReturnableForPurchaseOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from an inward job
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewReturnableForInwardJob(
        com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewReturnableForInwardJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from a stock issuance
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewReturnableForStockIssuance(
        com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewReturnableForStockIssuanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from a sales order
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewReturnableForSalesOrder(
        com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewReturnableForSalesOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View inventory that is returnable from an outward job
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewReturnableForOutwardJob(
        com.scailo.sdk.ReturnableInventorySearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewReturnableForOutwardJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View quantity remaining of the family in the given status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuantityResponse> viewQuantityRemaining(
        com.scailo.sdk.InventoryServiceFamilyQuantityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewQuantityRemainingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that are being manufactured
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuantityResponse> countWorkInProgress(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountWorkInProgressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that have been indented
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuantityResponse> countIndented(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountIndentedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Quantity of inventory items of the family with the given Identifier that have been ordered
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuantityResponse> countOrdered(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountOrderedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View base demand quantity of the family with the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuantityResponse> viewBaseDemandQuantity(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewBaseDemandQuantityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View adjusted demand quantity of the family with the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuantityResponse> viewAdjustedDemandQuantity(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAdjustedDemandQuantityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View required quantity of the family with the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.QuantityResponse> viewRequiredQuantity(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewRequiredQuantityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View consolidated inventory statistics for family with the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ConsolidatedInventoryStatistics> viewConsolidatedStatistics(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewConsolidatedStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View consolidated inventory statistics for families with the given IdentifiersList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ConsolidatedInventoryStatisticsList> viewConsolidatedStatisticsForFamilies(
        com.scailo.sdk.IdentifiersList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewConsolidatedStatisticsForFamiliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View inventory placed in storage represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventoryList> viewInStorage(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewInStorageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the work in progress statistics of the family with the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InventoryWorkInProgressStatistics> viewWorkInProgressStatistics(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewWorkInProgressStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the indented statistics of the family with the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InventoryIndentedStatistics> viewIndentedStatistics(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewIndentedStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the ordered statistics of the fammily with the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InventoryOrderedStatistics> viewOrderedStatistics(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewOrderedStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the detailed demand of the family with the given Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.InventoryDetailedDemand> viewDetailedDemand(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewDetailedDemandMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the inventory item identified by the given short URL with the given storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventory> updateStorageWithShortURL(
        com.scailo.sdk.InventoryServiceUpdateStorageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStorageWithShortURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the first inventory item identified by the given internal item code with the given storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventory> updateStorageWithInternalItemCode(
        com.scailo.sdk.InventoryServiceUpdateStorageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStorageWithInternalItemCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves the inventory item identified by the given short URL into the given storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventory> moveToStorageWithShortURL(
        com.scailo.sdk.InventoryServiceUpdateStorageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveToStorageWithShortURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves the inventory item identified by the given internal item code into the given storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GenericInventory> moveToStorageWithInternalItemCode(
        com.scailo.sdk.InventoryServiceUpdateStorageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveToStorageWithInternalItemCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VIEW_BY_HASH = 0;
  private static final int METHODID_VIEW_BY_SHORT_URL = 1;
  private static final int METHODID_VIEW_ISSUABLE = 2;
  private static final int METHODID_VIEW_ISSUED_FOR_GOODS_DISPATCH = 3;
  private static final int METHODID_VIEW_ISSUED_FOR_OUTWARD_JOB_FREE_ISSUE_MATERIAL = 4;
  private static final int METHODID_VIEW_ADMITTED_FROM_GOODS_RECEIPT = 5;
  private static final int METHODID_VIEW_ADMITTED_FROM_INWARD_JOB_FREE_ISSUE_MATERIAL = 6;
  private static final int METHODID_VIEW_ADMITTED_FROM_PRODUCTION_PLAN = 7;
  private static final int METHODID_VIEW_RETURNABLE_FOR_PURCHASE_ORDER = 8;
  private static final int METHODID_VIEW_RETURNABLE_FOR_INWARD_JOB = 9;
  private static final int METHODID_VIEW_RETURNABLE_FOR_STOCK_ISSUANCE = 10;
  private static final int METHODID_VIEW_RETURNABLE_FOR_SALES_ORDER = 11;
  private static final int METHODID_VIEW_RETURNABLE_FOR_OUTWARD_JOB = 12;
  private static final int METHODID_VIEW_QUANTITY_REMAINING = 13;
  private static final int METHODID_COUNT_WORK_IN_PROGRESS = 14;
  private static final int METHODID_COUNT_INDENTED = 15;
  private static final int METHODID_COUNT_ORDERED = 16;
  private static final int METHODID_VIEW_BASE_DEMAND_QUANTITY = 17;
  private static final int METHODID_VIEW_ADJUSTED_DEMAND_QUANTITY = 18;
  private static final int METHODID_VIEW_REQUIRED_QUANTITY = 19;
  private static final int METHODID_VIEW_CONSOLIDATED_STATISTICS = 20;
  private static final int METHODID_VIEW_CONSOLIDATED_STATISTICS_FOR_FAMILIES = 21;
  private static final int METHODID_VIEW_IN_STORAGE = 22;
  private static final int METHODID_VIEW_WORK_IN_PROGRESS_STATISTICS = 23;
  private static final int METHODID_VIEW_INDENTED_STATISTICS = 24;
  private static final int METHODID_VIEW_ORDERED_STATISTICS = 25;
  private static final int METHODID_VIEW_DETAILED_DEMAND = 26;
  private static final int METHODID_UPDATE_STORAGE_WITH_SHORT_URL = 27;
  private static final int METHODID_UPDATE_STORAGE_WITH_INTERNAL_ITEM_CODE = 28;
  private static final int METHODID_MOVE_TO_STORAGE_WITH_SHORT_URL = 29;
  private static final int METHODID_MOVE_TO_STORAGE_WITH_INTERNAL_ITEM_CODE = 30;

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
        case METHODID_VIEW_BY_HASH:
          serviceImpl.viewByHash((com.scailo.sdk.InventoryHashSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory>) responseObserver);
          break;
        case METHODID_VIEW_BY_SHORT_URL:
          serviceImpl.viewByShortURL((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory>) responseObserver);
          break;
        case METHODID_VIEW_ISSUABLE:
          serviceImpl.viewIssuable((com.scailo.sdk.IssuableInventorySearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_ISSUED_FOR_GOODS_DISPATCH:
          serviceImpl.viewIssuedForGoodsDispatch((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_ISSUED_FOR_OUTWARD_JOB_FREE_ISSUE_MATERIAL:
          serviceImpl.viewIssuedForOutwardJobFreeIssueMaterial((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_ADMITTED_FROM_GOODS_RECEIPT:
          serviceImpl.viewAdmittedFromGoodsReceipt((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_ADMITTED_FROM_INWARD_JOB_FREE_ISSUE_MATERIAL:
          serviceImpl.viewAdmittedFromInwardJobFreeIssueMaterial((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_ADMITTED_FROM_PRODUCTION_PLAN:
          serviceImpl.viewAdmittedFromProductionPlan((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_RETURNABLE_FOR_PURCHASE_ORDER:
          serviceImpl.viewReturnableForPurchaseOrder((com.scailo.sdk.ReturnableInventorySearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_RETURNABLE_FOR_INWARD_JOB:
          serviceImpl.viewReturnableForInwardJob((com.scailo.sdk.ReturnableInventorySearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_RETURNABLE_FOR_STOCK_ISSUANCE:
          serviceImpl.viewReturnableForStockIssuance((com.scailo.sdk.ReturnableInventorySearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_RETURNABLE_FOR_SALES_ORDER:
          serviceImpl.viewReturnableForSalesOrder((com.scailo.sdk.ReturnableInventorySearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_RETURNABLE_FOR_OUTWARD_JOB:
          serviceImpl.viewReturnableForOutwardJob((com.scailo.sdk.ReturnableInventorySearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_QUANTITY_REMAINING:
          serviceImpl.viewQuantityRemaining((com.scailo.sdk.InventoryServiceFamilyQuantityReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse>) responseObserver);
          break;
        case METHODID_COUNT_WORK_IN_PROGRESS:
          serviceImpl.countWorkInProgress((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse>) responseObserver);
          break;
        case METHODID_COUNT_INDENTED:
          serviceImpl.countIndented((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse>) responseObserver);
          break;
        case METHODID_COUNT_ORDERED:
          serviceImpl.countOrdered((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse>) responseObserver);
          break;
        case METHODID_VIEW_BASE_DEMAND_QUANTITY:
          serviceImpl.viewBaseDemandQuantity((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse>) responseObserver);
          break;
        case METHODID_VIEW_ADJUSTED_DEMAND_QUANTITY:
          serviceImpl.viewAdjustedDemandQuantity((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse>) responseObserver);
          break;
        case METHODID_VIEW_REQUIRED_QUANTITY:
          serviceImpl.viewRequiredQuantity((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.QuantityResponse>) responseObserver);
          break;
        case METHODID_VIEW_CONSOLIDATED_STATISTICS:
          serviceImpl.viewConsolidatedStatistics((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ConsolidatedInventoryStatistics>) responseObserver);
          break;
        case METHODID_VIEW_CONSOLIDATED_STATISTICS_FOR_FAMILIES:
          serviceImpl.viewConsolidatedStatisticsForFamilies((com.scailo.sdk.IdentifiersList) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ConsolidatedInventoryStatisticsList>) responseObserver);
          break;
        case METHODID_VIEW_IN_STORAGE:
          serviceImpl.viewInStorage((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventoryList>) responseObserver);
          break;
        case METHODID_VIEW_WORK_IN_PROGRESS_STATISTICS:
          serviceImpl.viewWorkInProgressStatistics((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryWorkInProgressStatistics>) responseObserver);
          break;
        case METHODID_VIEW_INDENTED_STATISTICS:
          serviceImpl.viewIndentedStatistics((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryIndentedStatistics>) responseObserver);
          break;
        case METHODID_VIEW_ORDERED_STATISTICS:
          serviceImpl.viewOrderedStatistics((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryOrderedStatistics>) responseObserver);
          break;
        case METHODID_VIEW_DETAILED_DEMAND:
          serviceImpl.viewDetailedDemand((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.InventoryDetailedDemand>) responseObserver);
          break;
        case METHODID_UPDATE_STORAGE_WITH_SHORT_URL:
          serviceImpl.updateStorageWithShortURL((com.scailo.sdk.InventoryServiceUpdateStorageReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory>) responseObserver);
          break;
        case METHODID_UPDATE_STORAGE_WITH_INTERNAL_ITEM_CODE:
          serviceImpl.updateStorageWithInternalItemCode((com.scailo.sdk.InventoryServiceUpdateStorageReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory>) responseObserver);
          break;
        case METHODID_MOVE_TO_STORAGE_WITH_SHORT_URL:
          serviceImpl.moveToStorageWithShortURL((com.scailo.sdk.InventoryServiceUpdateStorageReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory>) responseObserver);
          break;
        case METHODID_MOVE_TO_STORAGE_WITH_INTERNAL_ITEM_CODE:
          serviceImpl.moveToStorageWithInternalItemCode((com.scailo.sdk.InventoryServiceUpdateStorageReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GenericInventory>) responseObserver);
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
          getViewByHashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InventoryHashSearchReq,
              com.scailo.sdk.GenericInventory>(
                service, METHODID_VIEW_BY_HASH)))
        .addMethod(
          getViewByShortURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.GenericInventory>(
                service, METHODID_VIEW_BY_SHORT_URL)))
        .addMethod(
          getViewIssuableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IssuableInventorySearchReq,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_ISSUABLE)))
        .addMethod(
          getViewIssuedForGoodsDispatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_ISSUED_FOR_GOODS_DISPATCH)))
        .addMethod(
          getViewIssuedForOutwardJobFreeIssueMaterialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_ISSUED_FOR_OUTWARD_JOB_FREE_ISSUE_MATERIAL)))
        .addMethod(
          getViewAdmittedFromGoodsReceiptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_ADMITTED_FROM_GOODS_RECEIPT)))
        .addMethod(
          getViewAdmittedFromInwardJobFreeIssueMaterialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_ADMITTED_FROM_INWARD_JOB_FREE_ISSUE_MATERIAL)))
        .addMethod(
          getViewAdmittedFromProductionPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_ADMITTED_FROM_PRODUCTION_PLAN)))
        .addMethod(
          getViewReturnableForPurchaseOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReturnableInventorySearchReq,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_RETURNABLE_FOR_PURCHASE_ORDER)))
        .addMethod(
          getViewReturnableForInwardJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReturnableInventorySearchReq,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_RETURNABLE_FOR_INWARD_JOB)))
        .addMethod(
          getViewReturnableForStockIssuanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReturnableInventorySearchReq,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_RETURNABLE_FOR_STOCK_ISSUANCE)))
        .addMethod(
          getViewReturnableForSalesOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReturnableInventorySearchReq,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_RETURNABLE_FOR_SALES_ORDER)))
        .addMethod(
          getViewReturnableForOutwardJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.ReturnableInventorySearchReq,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_RETURNABLE_FOR_OUTWARD_JOB)))
        .addMethod(
          getViewQuantityRemainingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InventoryServiceFamilyQuantityReq,
              com.scailo.sdk.QuantityResponse>(
                service, METHODID_VIEW_QUANTITY_REMAINING)))
        .addMethod(
          getCountWorkInProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.QuantityResponse>(
                service, METHODID_COUNT_WORK_IN_PROGRESS)))
        .addMethod(
          getCountIndentedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.QuantityResponse>(
                service, METHODID_COUNT_INDENTED)))
        .addMethod(
          getCountOrderedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.QuantityResponse>(
                service, METHODID_COUNT_ORDERED)))
        .addMethod(
          getViewBaseDemandQuantityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.QuantityResponse>(
                service, METHODID_VIEW_BASE_DEMAND_QUANTITY)))
        .addMethod(
          getViewAdjustedDemandQuantityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.QuantityResponse>(
                service, METHODID_VIEW_ADJUSTED_DEMAND_QUANTITY)))
        .addMethod(
          getViewRequiredQuantityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.QuantityResponse>(
                service, METHODID_VIEW_REQUIRED_QUANTITY)))
        .addMethod(
          getViewConsolidatedStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.ConsolidatedInventoryStatistics>(
                service, METHODID_VIEW_CONSOLIDATED_STATISTICS)))
        .addMethod(
          getViewConsolidatedStatisticsForFamiliesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifiersList,
              com.scailo.sdk.ConsolidatedInventoryStatisticsList>(
                service, METHODID_VIEW_CONSOLIDATED_STATISTICS_FOR_FAMILIES)))
        .addMethod(
          getViewInStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.GenericInventoryList>(
                service, METHODID_VIEW_IN_STORAGE)))
        .addMethod(
          getViewWorkInProgressStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.InventoryWorkInProgressStatistics>(
                service, METHODID_VIEW_WORK_IN_PROGRESS_STATISTICS)))
        .addMethod(
          getViewIndentedStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.InventoryIndentedStatistics>(
                service, METHODID_VIEW_INDENTED_STATISTICS)))
        .addMethod(
          getViewOrderedStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.InventoryOrderedStatistics>(
                service, METHODID_VIEW_ORDERED_STATISTICS)))
        .addMethod(
          getViewDetailedDemandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.InventoryDetailedDemand>(
                service, METHODID_VIEW_DETAILED_DEMAND)))
        .addMethod(
          getUpdateStorageWithShortURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InventoryServiceUpdateStorageReq,
              com.scailo.sdk.GenericInventory>(
                service, METHODID_UPDATE_STORAGE_WITH_SHORT_URL)))
        .addMethod(
          getUpdateStorageWithInternalItemCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InventoryServiceUpdateStorageReq,
              com.scailo.sdk.GenericInventory>(
                service, METHODID_UPDATE_STORAGE_WITH_INTERNAL_ITEM_CODE)))
        .addMethod(
          getMoveToStorageWithShortURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InventoryServiceUpdateStorageReq,
              com.scailo.sdk.GenericInventory>(
                service, METHODID_MOVE_TO_STORAGE_WITH_SHORT_URL)))
        .addMethod(
          getMoveToStorageWithInternalItemCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.InventoryServiceUpdateStorageReq,
              com.scailo.sdk.GenericInventory>(
                service, METHODID_MOVE_TO_STORAGE_WITH_INTERNAL_ITEM_CODE)))
        .build();
  }

  private static abstract class InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.InventoryScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryService");
    }
  }

  private static final class InventoryServiceFileDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier {
    InventoryServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryServiceMethodDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InventoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryServiceFileDescriptorSupplier())
              .addMethod(getViewByHashMethod())
              .addMethod(getViewByShortURLMethod())
              .addMethod(getViewIssuableMethod())
              .addMethod(getViewIssuedForGoodsDispatchMethod())
              .addMethod(getViewIssuedForOutwardJobFreeIssueMaterialMethod())
              .addMethod(getViewAdmittedFromGoodsReceiptMethod())
              .addMethod(getViewAdmittedFromInwardJobFreeIssueMaterialMethod())
              .addMethod(getViewAdmittedFromProductionPlanMethod())
              .addMethod(getViewReturnableForPurchaseOrderMethod())
              .addMethod(getViewReturnableForInwardJobMethod())
              .addMethod(getViewReturnableForStockIssuanceMethod())
              .addMethod(getViewReturnableForSalesOrderMethod())
              .addMethod(getViewReturnableForOutwardJobMethod())
              .addMethod(getViewQuantityRemainingMethod())
              .addMethod(getCountWorkInProgressMethod())
              .addMethod(getCountIndentedMethod())
              .addMethod(getCountOrderedMethod())
              .addMethod(getViewBaseDemandQuantityMethod())
              .addMethod(getViewAdjustedDemandQuantityMethod())
              .addMethod(getViewRequiredQuantityMethod())
              .addMethod(getViewConsolidatedStatisticsMethod())
              .addMethod(getViewConsolidatedStatisticsForFamiliesMethod())
              .addMethod(getViewInStorageMethod())
              .addMethod(getViewWorkInProgressStatisticsMethod())
              .addMethod(getViewIndentedStatisticsMethod())
              .addMethod(getViewOrderedStatisticsMethod())
              .addMethod(getViewDetailedDemandMethod())
              .addMethod(getUpdateStorageWithShortURLMethod())
              .addMethod(getUpdateStorageWithInternalItemCodeMethod())
              .addMethod(getMoveToStorageWithShortURLMethod())
              .addMethod(getMoveToStorageWithInternalItemCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
