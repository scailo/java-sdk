package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the available services in Vault
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: vault.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VaultServiceGrpc {

  private VaultServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.VaultService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileInitiateFileRequest,
      com.scailo.sdk.VaultFileInitiateFileResponse> getInitiateFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitiateFile",
      requestType = com.scailo.sdk.VaultFileInitiateFileRequest.class,
      responseType = com.scailo.sdk.VaultFileInitiateFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileInitiateFileRequest,
      com.scailo.sdk.VaultFileInitiateFileResponse> getInitiateFileMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileInitiateFileRequest, com.scailo.sdk.VaultFileInitiateFileResponse> getInitiateFileMethod;
    if ((getInitiateFileMethod = VaultServiceGrpc.getInitiateFileMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getInitiateFileMethod = VaultServiceGrpc.getInitiateFileMethod) == null) {
          VaultServiceGrpc.getInitiateFileMethod = getInitiateFileMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultFileInitiateFileRequest, com.scailo.sdk.VaultFileInitiateFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitiateFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFileInitiateFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFileInitiateFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("InitiateFile"))
              .build();
        }
      }
    }
    return getInitiateFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileAddChunkRequest,
      com.scailo.sdk.IdentifierUUID> getAddFileChunkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFileChunk",
      requestType = com.scailo.sdk.VaultFileAddChunkRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileAddChunkRequest,
      com.scailo.sdk.IdentifierUUID> getAddFileChunkMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileAddChunkRequest, com.scailo.sdk.IdentifierUUID> getAddFileChunkMethod;
    if ((getAddFileChunkMethod = VaultServiceGrpc.getAddFileChunkMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getAddFileChunkMethod = VaultServiceGrpc.getAddFileChunkMethod) == null) {
          VaultServiceGrpc.getAddFileChunkMethod = getAddFileChunkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultFileAddChunkRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFileChunk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFileAddChunkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("AddFileChunk"))
              .build();
        }
      }
    }
    return getAddFileChunkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getCompleteFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteFile",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getCompleteFileMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getCompleteFileMethod;
    if ((getCompleteFileMethod = VaultServiceGrpc.getCompleteFileMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getCompleteFileMethod = VaultServiceGrpc.getCompleteFileMethod) == null) {
          VaultServiceGrpc.getCompleteFileMethod = getCompleteFileMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompleteFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("CompleteFile"))
              .build();
        }
      }
    }
    return getCompleteFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileRenameFileRequest,
      com.scailo.sdk.IdentifierUUID> getRenameFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameFile",
      requestType = com.scailo.sdk.VaultFileRenameFileRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileRenameFileRequest,
      com.scailo.sdk.IdentifierUUID> getRenameFileMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileRenameFileRequest, com.scailo.sdk.IdentifierUUID> getRenameFileMethod;
    if ((getRenameFileMethod = VaultServiceGrpc.getRenameFileMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getRenameFileMethod = VaultServiceGrpc.getRenameFileMethod) == null) {
          VaultServiceGrpc.getRenameFileMethod = getRenameFileMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultFileRenameFileRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFileRenameFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("RenameFile"))
              .build();
        }
      }
    }
    return getRenameFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileUnzipRequest,
      com.scailo.sdk.IdentifierUUID> getUnzipFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnzipFile",
      requestType = com.scailo.sdk.VaultFileUnzipRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileUnzipRequest,
      com.scailo.sdk.IdentifierUUID> getUnzipFileMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileUnzipRequest, com.scailo.sdk.IdentifierUUID> getUnzipFileMethod;
    if ((getUnzipFileMethod = VaultServiceGrpc.getUnzipFileMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getUnzipFileMethod = VaultServiceGrpc.getUnzipFileMethod) == null) {
          VaultServiceGrpc.getUnzipFileMethod = getUnzipFileMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultFileUnzipRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnzipFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFileUnzipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("UnzipFile"))
              .build();
        }
      }
    }
    return getUnzipFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getPersistFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PersistFile",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getPersistFileMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getPersistFileMethod;
    if ((getPersistFileMethod = VaultServiceGrpc.getPersistFileMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getPersistFileMethod = VaultServiceGrpc.getPersistFileMethod) == null) {
          VaultServiceGrpc.getPersistFileMethod = getPersistFileMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PersistFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("PersistFile"))
              .build();
        }
      }
    }
    return getPersistFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileMoveFileRequest,
      com.scailo.sdk.IdentifierUUID> getMoveFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveFile",
      requestType = com.scailo.sdk.VaultFileMoveFileRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileMoveFileRequest,
      com.scailo.sdk.IdentifierUUID> getMoveFileMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultFileMoveFileRequest, com.scailo.sdk.IdentifierUUID> getMoveFileMethod;
    if ((getMoveFileMethod = VaultServiceGrpc.getMoveFileMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getMoveFileMethod = VaultServiceGrpc.getMoveFileMethod) == null) {
          VaultServiceGrpc.getMoveFileMethod = getMoveFileMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultFileMoveFileRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFileMoveFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("MoveFile"))
              .build();
        }
      }
    }
    return getMoveFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFile",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteFileMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getDeleteFileMethod;
    if ((getDeleteFileMethod = VaultServiceGrpc.getDeleteFileMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDeleteFileMethod = VaultServiceGrpc.getDeleteFileMethod) == null) {
          VaultServiceGrpc.getDeleteFileMethod = getDeleteFileMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DeleteFile"))
              .build();
        }
      }
    }
    return getDeleteFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionAddRequest,
      com.scailo.sdk.IdentifierUUID> getAddFilePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFilePermission",
      requestType = com.scailo.sdk.VaultPermissionAddRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionAddRequest,
      com.scailo.sdk.IdentifierUUID> getAddFilePermissionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionAddRequest, com.scailo.sdk.IdentifierUUID> getAddFilePermissionMethod;
    if ((getAddFilePermissionMethod = VaultServiceGrpc.getAddFilePermissionMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getAddFilePermissionMethod = VaultServiceGrpc.getAddFilePermissionMethod) == null) {
          VaultServiceGrpc.getAddFilePermissionMethod = getAddFilePermissionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultPermissionAddRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFilePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultPermissionAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("AddFilePermission"))
              .build();
        }
      }
    }
    return getAddFilePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionModifyRequest,
      com.scailo.sdk.IdentifierUUID> getModifyFilePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyFilePermission",
      requestType = com.scailo.sdk.VaultPermissionModifyRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionModifyRequest,
      com.scailo.sdk.IdentifierUUID> getModifyFilePermissionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionModifyRequest, com.scailo.sdk.IdentifierUUID> getModifyFilePermissionMethod;
    if ((getModifyFilePermissionMethod = VaultServiceGrpc.getModifyFilePermissionMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getModifyFilePermissionMethod = VaultServiceGrpc.getModifyFilePermissionMethod) == null) {
          VaultServiceGrpc.getModifyFilePermissionMethod = getModifyFilePermissionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultPermissionModifyRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyFilePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultPermissionModifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ModifyFilePermission"))
              .build();
        }
      }
    }
    return getModifyFilePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteFilePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFilePermission",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteFilePermissionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getDeleteFilePermissionMethod;
    if ((getDeleteFilePermissionMethod = VaultServiceGrpc.getDeleteFilePermissionMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDeleteFilePermissionMethod = VaultServiceGrpc.getDeleteFilePermissionMethod) == null) {
          VaultServiceGrpc.getDeleteFilePermissionMethod = getDeleteFilePermissionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFilePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DeleteFilePermission"))
              .build();
        }
      }
    }
    return getDeleteFilePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadFile",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadFileMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadFileMethod;
    if ((getDownloadFileMethod = VaultServiceGrpc.getDownloadFileMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDownloadFileMethod = VaultServiceGrpc.getDownloadFileMethod) == null) {
          VaultServiceGrpc.getDownloadFileMethod = getDownloadFileMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DownloadFile"))
              .build();
        }
      }
    }
    return getDownloadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadFileVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadFileVersion",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadFileVersionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadFileVersionMethod;
    if ((getDownloadFileVersionMethod = VaultServiceGrpc.getDownloadFileVersionMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDownloadFileVersionMethod = VaultServiceGrpc.getDownloadFileVersionMethod) == null) {
          VaultServiceGrpc.getDownloadFileVersionMethod = getDownloadFileVersionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadFileVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DownloadFileVersion"))
              .build();
        }
      }
    }
    return getDownloadFileVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getViewFileLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFileLogo",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getViewFileLogoMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getViewFileLogoMethod;
    if ((getViewFileLogoMethod = VaultServiceGrpc.getViewFileLogoMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFileLogoMethod = VaultServiceGrpc.getViewFileLogoMethod) == null) {
          VaultServiceGrpc.getViewFileLogoMethod = getViewFileLogoMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFileLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFileLogo"))
              .build();
        }
      }
    }
    return getViewFileLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFile> getViewFileByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFileByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFile> getViewFileByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFile> getViewFileByUUIDMethod;
    if ((getViewFileByUUIDMethod = VaultServiceGrpc.getViewFileByUUIDMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFileByUUIDMethod = VaultServiceGrpc.getViewFileByUUIDMethod) == null) {
          VaultServiceGrpc.getViewFileByUUIDMethod = getViewFileByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFileByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFile.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFileByUUID"))
              .build();
        }
      }
    }
    return getViewFileByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VaultFile> getViewFileByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFileByID",
      requestType = com.scailo.sdk.Identifier.class,
      responseType = com.scailo.sdk.VaultFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Identifier,
      com.scailo.sdk.VaultFile> getViewFileByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Identifier, com.scailo.sdk.VaultFile> getViewFileByIDMethod;
    if ((getViewFileByIDMethod = VaultServiceGrpc.getViewFileByIDMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFileByIDMethod = VaultServiceGrpc.getViewFileByIDMethod) == null) {
          VaultServiceGrpc.getViewFileByIDMethod = getViewFileByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Identifier, com.scailo.sdk.VaultFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFileByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFile.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFileByID"))
              .build();
        }
      }
    }
    return getViewFileByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFileVersionChunk> getViewFileChunkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFileChunk",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultFileVersionChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFileVersionChunk> getViewFileChunkMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFileVersionChunk> getViewFileChunkMethod;
    if ((getViewFileChunkMethod = VaultServiceGrpc.getViewFileChunkMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFileChunkMethod = VaultServiceGrpc.getViewFileChunkMethod) == null) {
          VaultServiceGrpc.getViewFileChunkMethod = getViewFileChunkMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFileVersionChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFileChunk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFileVersionChunk.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFileChunk"))
              .build();
        }
      }
    }
    return getViewFileChunkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFileVersionChunk> getViewFileChunkMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFileChunkMetadata",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultFileVersionChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFileVersionChunk> getViewFileChunkMetadataMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFileVersionChunk> getViewFileChunkMetadataMethod;
    if ((getViewFileChunkMetadataMethod = VaultServiceGrpc.getViewFileChunkMetadataMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFileChunkMetadataMethod = VaultServiceGrpc.getViewFileChunkMetadataMethod) == null) {
          VaultServiceGrpc.getViewFileChunkMetadataMethod = getViewFileChunkMetadataMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFileVersionChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFileChunkMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFileVersionChunk.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFileChunkMetadata"))
              .build();
        }
      }
    }
    return getViewFileChunkMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultPermission> getViewFilePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFilePermission",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultPermission.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultPermission> getViewFilePermissionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultPermission> getViewFilePermissionMethod;
    if ((getViewFilePermissionMethod = VaultServiceGrpc.getViewFilePermissionMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFilePermissionMethod = VaultServiceGrpc.getViewFilePermissionMethod) == null) {
          VaultServiceGrpc.getViewFilePermissionMethod = getViewFilePermissionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultPermission>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFilePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultPermission.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFilePermission"))
              .build();
        }
      }
    }
    return getViewFilePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultDuplicateCheckReq,
      com.scailo.sdk.BooleanResponse> getDoesFileExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoesFileExist",
      requestType = com.scailo.sdk.VaultDuplicateCheckReq.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultDuplicateCheckReq,
      com.scailo.sdk.BooleanResponse> getDoesFileExistMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultDuplicateCheckReq, com.scailo.sdk.BooleanResponse> getDoesFileExistMethod;
    if ((getDoesFileExistMethod = VaultServiceGrpc.getDoesFileExistMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDoesFileExistMethod = VaultServiceGrpc.getDoesFileExistMethod) == null) {
          VaultServiceGrpc.getDoesFileExistMethod = getDoesFileExistMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultDuplicateCheckReq, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoesFileExist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultDuplicateCheckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DoesFileExist"))
              .build();
        }
      }
    }
    return getDoesFileExistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFileVersionsList> getViewFileVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFileVersions",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultFileVersionsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFileVersionsList> getViewFileVersionsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFileVersionsList> getViewFileVersionsMethod;
    if ((getViewFileVersionsMethod = VaultServiceGrpc.getViewFileVersionsMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFileVersionsMethod = VaultServiceGrpc.getViewFileVersionsMethod) == null) {
          VaultServiceGrpc.getViewFileVersionsMethod = getViewFileVersionsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFileVersionsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFileVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFileVersionsList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFileVersions"))
              .build();
        }
      }
    }
    return getViewFileVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultAccessLogsList> getViewFileAccessLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFileAccessLogs",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultAccessLogsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultAccessLogsList> getViewFileAccessLogsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultAccessLogsList> getViewFileAccessLogsMethod;
    if ((getViewFileAccessLogsMethod = VaultServiceGrpc.getViewFileAccessLogsMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFileAccessLogsMethod = VaultServiceGrpc.getViewFileAccessLogsMethod) == null) {
          VaultServiceGrpc.getViewFileAccessLogsMethod = getViewFileAccessLogsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultAccessLogsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFileAccessLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultAccessLogsList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFileAccessLogs"))
              .build();
        }
      }
    }
    return getViewFileAccessLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultFolderAddRequest,
      com.scailo.sdk.IdentifierUUID> getAddFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFolder",
      requestType = com.scailo.sdk.VaultFolderAddRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultFolderAddRequest,
      com.scailo.sdk.IdentifierUUID> getAddFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultFolderAddRequest, com.scailo.sdk.IdentifierUUID> getAddFolderMethod;
    if ((getAddFolderMethod = VaultServiceGrpc.getAddFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getAddFolderMethod = VaultServiceGrpc.getAddFolderMethod) == null) {
          VaultServiceGrpc.getAddFolderMethod = getAddFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultFolderAddRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFolderAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("AddFolder"))
              .build();
        }
      }
    }
    return getAddFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultFolderMoveFolderRequest,
      com.scailo.sdk.IdentifierUUID> getMoveFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveFolder",
      requestType = com.scailo.sdk.VaultFolderMoveFolderRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultFolderMoveFolderRequest,
      com.scailo.sdk.IdentifierUUID> getMoveFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultFolderMoveFolderRequest, com.scailo.sdk.IdentifierUUID> getMoveFolderMethod;
    if ((getMoveFolderMethod = VaultServiceGrpc.getMoveFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getMoveFolderMethod = VaultServiceGrpc.getMoveFolderMethod) == null) {
          VaultServiceGrpc.getMoveFolderMethod = getMoveFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultFolderMoveFolderRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFolderMoveFolderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("MoveFolder"))
              .build();
        }
      }
    }
    return getMoveFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultFolderRenameFolderRequest,
      com.scailo.sdk.IdentifierUUID> getRenameFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameFolder",
      requestType = com.scailo.sdk.VaultFolderRenameFolderRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultFolderRenameFolderRequest,
      com.scailo.sdk.IdentifierUUID> getRenameFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultFolderRenameFolderRequest, com.scailo.sdk.IdentifierUUID> getRenameFolderMethod;
    if ((getRenameFolderMethod = VaultServiceGrpc.getRenameFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getRenameFolderMethod = VaultServiceGrpc.getRenameFolderMethod) == null) {
          VaultServiceGrpc.getRenameFolderMethod = getRenameFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultFolderRenameFolderRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFolderRenameFolderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("RenameFolder"))
              .build();
        }
      }
    }
    return getRenameFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFolder",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getDeleteFolderMethod;
    if ((getDeleteFolderMethod = VaultServiceGrpc.getDeleteFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDeleteFolderMethod = VaultServiceGrpc.getDeleteFolderMethod) == null) {
          VaultServiceGrpc.getDeleteFolderMethod = getDeleteFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DeleteFolder"))
              .build();
        }
      }
    }
    return getDeleteFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getZipFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZipFolder",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getZipFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getZipFolderMethod;
    if ((getZipFolderMethod = VaultServiceGrpc.getZipFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getZipFolderMethod = VaultServiceGrpc.getZipFolderMethod) == null) {
          VaultServiceGrpc.getZipFolderMethod = getZipFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZipFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ZipFolder"))
              .build();
        }
      }
    }
    return getZipFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionAddRequest,
      com.scailo.sdk.IdentifierUUID> getAddFolderPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFolderPermission",
      requestType = com.scailo.sdk.VaultPermissionAddRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionAddRequest,
      com.scailo.sdk.IdentifierUUID> getAddFolderPermissionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionAddRequest, com.scailo.sdk.IdentifierUUID> getAddFolderPermissionMethod;
    if ((getAddFolderPermissionMethod = VaultServiceGrpc.getAddFolderPermissionMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getAddFolderPermissionMethod = VaultServiceGrpc.getAddFolderPermissionMethod) == null) {
          VaultServiceGrpc.getAddFolderPermissionMethod = getAddFolderPermissionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultPermissionAddRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFolderPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultPermissionAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("AddFolderPermission"))
              .build();
        }
      }
    }
    return getAddFolderPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionModifyRequest,
      com.scailo.sdk.IdentifierUUID> getModifyFolderPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyFolderPermission",
      requestType = com.scailo.sdk.VaultPermissionModifyRequest.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionModifyRequest,
      com.scailo.sdk.IdentifierUUID> getModifyFolderPermissionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultPermissionModifyRequest, com.scailo.sdk.IdentifierUUID> getModifyFolderPermissionMethod;
    if ((getModifyFolderPermissionMethod = VaultServiceGrpc.getModifyFolderPermissionMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getModifyFolderPermissionMethod = VaultServiceGrpc.getModifyFolderPermissionMethod) == null) {
          VaultServiceGrpc.getModifyFolderPermissionMethod = getModifyFolderPermissionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultPermissionModifyRequest, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyFolderPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultPermissionModifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ModifyFolderPermission"))
              .build();
        }
      }
    }
    return getModifyFolderPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteFolderPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFolderPermission",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getDeleteFolderPermissionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getDeleteFolderPermissionMethod;
    if ((getDeleteFolderPermissionMethod = VaultServiceGrpc.getDeleteFolderPermissionMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDeleteFolderPermissionMethod = VaultServiceGrpc.getDeleteFolderPermissionMethod) == null) {
          VaultServiceGrpc.getDeleteFolderPermissionMethod = getDeleteFolderPermissionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFolderPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DeleteFolderPermission"))
              .build();
        }
      }
    }
    return getDeleteFolderPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierZeroable,
      com.scailo.sdk.VaultFolder> getViewFolderByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFolderByID",
      requestType = com.scailo.sdk.IdentifierZeroable.class,
      responseType = com.scailo.sdk.VaultFolder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierZeroable,
      com.scailo.sdk.VaultFolder> getViewFolderByIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierZeroable, com.scailo.sdk.VaultFolder> getViewFolderByIDMethod;
    if ((getViewFolderByIDMethod = VaultServiceGrpc.getViewFolderByIDMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFolderByIDMethod = VaultServiceGrpc.getViewFolderByIDMethod) == null) {
          VaultServiceGrpc.getViewFolderByIDMethod = getViewFolderByIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierZeroable, com.scailo.sdk.VaultFolder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFolderByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierZeroable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFolder.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFolderByID"))
              .build();
        }
      }
    }
    return getViewFolderByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFolder> getViewFolderByUUIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFolderByUUID",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultFolder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFolder> getViewFolderByUUIDMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFolder> getViewFolderByUUIDMethod;
    if ((getViewFolderByUUIDMethod = VaultServiceGrpc.getViewFolderByUUIDMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFolderByUUIDMethod = VaultServiceGrpc.getViewFolderByUUIDMethod) == null) {
          VaultServiceGrpc.getViewFolderByUUIDMethod = getViewFolderByUUIDMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFolder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFolderByUUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFolder.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFolderByUUID"))
              .build();
        }
      }
    }
    return getViewFolderByUUIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFolderDownload> getViewFolderDownloadStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFolderDownloadStatus",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultFolderDownload.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFolderDownload> getViewFolderDownloadStatusMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFolderDownload> getViewFolderDownloadStatusMethod;
    if ((getViewFolderDownloadStatusMethod = VaultServiceGrpc.getViewFolderDownloadStatusMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFolderDownloadStatusMethod = VaultServiceGrpc.getViewFolderDownloadStatusMethod) == null) {
          VaultServiceGrpc.getViewFolderDownloadStatusMethod = getViewFolderDownloadStatusMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFolderDownload>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFolderDownloadStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFolderDownload.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFolderDownloadStatus"))
              .build();
        }
      }
    }
    return getViewFolderDownloadStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadFolder",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.StandardFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.StandardFile> getDownloadFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile> getDownloadFolderMethod;
    if ((getDownloadFolderMethod = VaultServiceGrpc.getDownloadFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDownloadFolderMethod = VaultServiceGrpc.getDownloadFolderMethod) == null) {
          VaultServiceGrpc.getDownloadFolderMethod = getDownloadFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.StandardFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.StandardFile.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DownloadFolder"))
              .build();
        }
      }
    }
    return getDownloadFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFilesList> getViewAccessibleFilesInFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAccessibleFilesInFolder",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultFilesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFilesList> getViewAccessibleFilesInFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFilesList> getViewAccessibleFilesInFolderMethod;
    if ((getViewAccessibleFilesInFolderMethod = VaultServiceGrpc.getViewAccessibleFilesInFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewAccessibleFilesInFolderMethod = VaultServiceGrpc.getViewAccessibleFilesInFolderMethod) == null) {
          VaultServiceGrpc.getViewAccessibleFilesInFolderMethod = getViewAccessibleFilesInFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFilesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAccessibleFilesInFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFilesList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewAccessibleFilesInFolder"))
              .build();
        }
      }
    }
    return getViewAccessibleFilesInFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFoldersList> getViewAccessibleFoldersInFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAccessibleFoldersInFolder",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultFoldersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultFoldersList> getViewAccessibleFoldersInFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFoldersList> getViewAccessibleFoldersInFolderMethod;
    if ((getViewAccessibleFoldersInFolderMethod = VaultServiceGrpc.getViewAccessibleFoldersInFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewAccessibleFoldersInFolderMethod = VaultServiceGrpc.getViewAccessibleFoldersInFolderMethod) == null) {
          VaultServiceGrpc.getViewAccessibleFoldersInFolderMethod = getViewAccessibleFoldersInFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultFoldersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAccessibleFoldersInFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultFoldersList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewAccessibleFoldersInFolder"))
              .build();
        }
      }
    }
    return getViewAccessibleFoldersInFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultResourcesList> getViewAccessibleResourcesInFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAccessibleResourcesInFolder",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultResourcesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultResourcesList> getViewAccessibleResourcesInFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultResourcesList> getViewAccessibleResourcesInFolderMethod;
    if ((getViewAccessibleResourcesInFolderMethod = VaultServiceGrpc.getViewAccessibleResourcesInFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewAccessibleResourcesInFolderMethod = VaultServiceGrpc.getViewAccessibleResourcesInFolderMethod) == null) {
          VaultServiceGrpc.getViewAccessibleResourcesInFolderMethod = getViewAccessibleResourcesInFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultResourcesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAccessibleResourcesInFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultResourcesList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewAccessibleResourcesInFolder"))
              .build();
        }
      }
    }
    return getViewAccessibleResourcesInFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultPermission> getViewFolderPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFolderPermission",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultPermission.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultPermission> getViewFolderPermissionMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultPermission> getViewFolderPermissionMethod;
    if ((getViewFolderPermissionMethod = VaultServiceGrpc.getViewFolderPermissionMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFolderPermissionMethod = VaultServiceGrpc.getViewFolderPermissionMethod) == null) {
          VaultServiceGrpc.getViewFolderPermissionMethod = getViewFolderPermissionMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultPermission>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFolderPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultPermission.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFolderPermission"))
              .build();
        }
      }
    }
    return getViewFolderPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultDuplicateCheckReq,
      com.scailo.sdk.BooleanResponse> getDoesFolderExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoesFolderExist",
      requestType = com.scailo.sdk.VaultDuplicateCheckReq.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultDuplicateCheckReq,
      com.scailo.sdk.BooleanResponse> getDoesFolderExistMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultDuplicateCheckReq, com.scailo.sdk.BooleanResponse> getDoesFolderExistMethod;
    if ((getDoesFolderExistMethod = VaultServiceGrpc.getDoesFolderExistMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDoesFolderExistMethod = VaultServiceGrpc.getDoesFolderExistMethod) == null) {
          VaultServiceGrpc.getDoesFolderExistMethod = getDoesFolderExistMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultDuplicateCheckReq, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoesFolderExist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultDuplicateCheckReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DoesFolderExist"))
              .build();
        }
      }
    }
    return getDoesFolderExistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultAccessLogsList> getViewFolderAccessLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewFolderAccessLogs",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.VaultAccessLogsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.VaultAccessLogsList> getViewFolderAccessLogsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultAccessLogsList> getViewFolderAccessLogsMethod;
    if ((getViewFolderAccessLogsMethod = VaultServiceGrpc.getViewFolderAccessLogsMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewFolderAccessLogsMethod = VaultServiceGrpc.getViewFolderAccessLogsMethod) == null) {
          VaultServiceGrpc.getViewFolderAccessLogsMethod = getViewFolderAccessLogsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.VaultAccessLogsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewFolderAccessLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultAccessLogsList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewFolderAccessLogs"))
              .build();
        }
      }
    }
    return getViewFolderAccessLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.RolesList> getViewPassthroughRolesForFolderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewPassthroughRolesForFolder",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.RolesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.RolesList> getViewPassthroughRolesForFolderMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.RolesList> getViewPassthroughRolesForFolderMethod;
    if ((getViewPassthroughRolesForFolderMethod = VaultServiceGrpc.getViewPassthroughRolesForFolderMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewPassthroughRolesForFolderMethod = VaultServiceGrpc.getViewPassthroughRolesForFolderMethod) == null) {
          VaultServiceGrpc.getViewPassthroughRolesForFolderMethod = getViewPassthroughRolesForFolderMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.RolesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewPassthroughRolesForFolder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.RolesList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewPassthroughRolesForFolder"))
              .build();
        }
      }
    }
    return getViewPassthroughRolesForFolderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VaultSearchReq,
      com.scailo.sdk.VaultSearchResponsesList> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = com.scailo.sdk.VaultSearchReq.class,
      responseType = com.scailo.sdk.VaultSearchResponsesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VaultSearchReq,
      com.scailo.sdk.VaultSearchResponsesList> getSearchMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VaultSearchReq, com.scailo.sdk.VaultSearchResponsesList> getSearchMethod;
    if ((getSearchMethod = VaultServiceGrpc.getSearchMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getSearchMethod = VaultServiceGrpc.getSearchMethod) == null) {
          VaultServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VaultSearchReq, com.scailo.sdk.VaultSearchResponsesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VaultSearchResponsesList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GiXAppRun> getSetupGiXMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetupGiX",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.GiXAppRun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.GiXAppRun> getSetupGiXMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GiXAppRun> getSetupGiXMethod;
    if ((getSetupGiXMethod = VaultServiceGrpc.getSetupGiXMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getSetupGiXMethod = VaultServiceGrpc.getSetupGiXMethod) == null) {
          VaultServiceGrpc.getSetupGiXMethod = getSetupGiXMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.GiXAppRun>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetupGiX"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXAppRun.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("SetupGiX"))
              .build();
        }
      }
    }
    return getSetupGiXMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithoutBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayDELETEMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiXRelayDELETE",
      requestType = com.scailo.sdk.GiXRelayReqWithoutBody.class,
      responseType = com.scailo.sdk.GiXRelayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithoutBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayDELETEMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithoutBody, com.scailo.sdk.GiXRelayResponse> getGiXRelayDELETEMethod;
    if ((getGiXRelayDELETEMethod = VaultServiceGrpc.getGiXRelayDELETEMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getGiXRelayDELETEMethod = VaultServiceGrpc.getGiXRelayDELETEMethod) == null) {
          VaultServiceGrpc.getGiXRelayDELETEMethod = getGiXRelayDELETEMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GiXRelayReqWithoutBody, com.scailo.sdk.GiXRelayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GiXRelayDELETE"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayReqWithoutBody.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("GiXRelayDELETE"))
              .build();
        }
      }
    }
    return getGiXRelayDELETEMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithoutBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayGETMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiXRelayGET",
      requestType = com.scailo.sdk.GiXRelayReqWithoutBody.class,
      responseType = com.scailo.sdk.GiXRelayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithoutBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayGETMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithoutBody, com.scailo.sdk.GiXRelayResponse> getGiXRelayGETMethod;
    if ((getGiXRelayGETMethod = VaultServiceGrpc.getGiXRelayGETMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getGiXRelayGETMethod = VaultServiceGrpc.getGiXRelayGETMethod) == null) {
          VaultServiceGrpc.getGiXRelayGETMethod = getGiXRelayGETMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GiXRelayReqWithoutBody, com.scailo.sdk.GiXRelayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GiXRelayGET"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayReqWithoutBody.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("GiXRelayGET"))
              .build();
        }
      }
    }
    return getGiXRelayGETMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithoutBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayHEADMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiXRelayHEAD",
      requestType = com.scailo.sdk.GiXRelayReqWithoutBody.class,
      responseType = com.scailo.sdk.GiXRelayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithoutBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayHEADMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithoutBody, com.scailo.sdk.GiXRelayResponse> getGiXRelayHEADMethod;
    if ((getGiXRelayHEADMethod = VaultServiceGrpc.getGiXRelayHEADMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getGiXRelayHEADMethod = VaultServiceGrpc.getGiXRelayHEADMethod) == null) {
          VaultServiceGrpc.getGiXRelayHEADMethod = getGiXRelayHEADMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GiXRelayReqWithoutBody, com.scailo.sdk.GiXRelayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GiXRelayHEAD"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayReqWithoutBody.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("GiXRelayHEAD"))
              .build();
        }
      }
    }
    return getGiXRelayHEADMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayPATCHMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiXRelayPATCH",
      requestType = com.scailo.sdk.GiXRelayReqWithBody.class,
      responseType = com.scailo.sdk.GiXRelayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayPATCHMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithBody, com.scailo.sdk.GiXRelayResponse> getGiXRelayPATCHMethod;
    if ((getGiXRelayPATCHMethod = VaultServiceGrpc.getGiXRelayPATCHMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getGiXRelayPATCHMethod = VaultServiceGrpc.getGiXRelayPATCHMethod) == null) {
          VaultServiceGrpc.getGiXRelayPATCHMethod = getGiXRelayPATCHMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GiXRelayReqWithBody, com.scailo.sdk.GiXRelayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GiXRelayPATCH"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayReqWithBody.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("GiXRelayPATCH"))
              .build();
        }
      }
    }
    return getGiXRelayPATCHMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayPOSTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiXRelayPOST",
      requestType = com.scailo.sdk.GiXRelayReqWithBody.class,
      responseType = com.scailo.sdk.GiXRelayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayPOSTMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithBody, com.scailo.sdk.GiXRelayResponse> getGiXRelayPOSTMethod;
    if ((getGiXRelayPOSTMethod = VaultServiceGrpc.getGiXRelayPOSTMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getGiXRelayPOSTMethod = VaultServiceGrpc.getGiXRelayPOSTMethod) == null) {
          VaultServiceGrpc.getGiXRelayPOSTMethod = getGiXRelayPOSTMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GiXRelayReqWithBody, com.scailo.sdk.GiXRelayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GiXRelayPOST"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayReqWithBody.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("GiXRelayPOST"))
              .build();
        }
      }
    }
    return getGiXRelayPOSTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayPUTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiXRelayPUT",
      requestType = com.scailo.sdk.GiXRelayReqWithBody.class,
      responseType = com.scailo.sdk.GiXRelayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithBody,
      com.scailo.sdk.GiXRelayResponse> getGiXRelayPUTMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GiXRelayReqWithBody, com.scailo.sdk.GiXRelayResponse> getGiXRelayPUTMethod;
    if ((getGiXRelayPUTMethod = VaultServiceGrpc.getGiXRelayPUTMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getGiXRelayPUTMethod = VaultServiceGrpc.getGiXRelayPUTMethod) == null) {
          VaultServiceGrpc.getGiXRelayPUTMethod = getGiXRelayPUTMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GiXRelayReqWithBody, com.scailo.sdk.GiXRelayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GiXRelayPUT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayReqWithBody.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXRelayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("GiXRelayPUT"))
              .build();
        }
      }
    }
    return getGiXRelayPUTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GiXAppRunFilterReq,
      com.scailo.sdk.GiXAppRunsList> getGiXFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiXFilter",
      requestType = com.scailo.sdk.GiXAppRunFilterReq.class,
      responseType = com.scailo.sdk.GiXAppRunsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GiXAppRunFilterReq,
      com.scailo.sdk.GiXAppRunsList> getGiXFilterMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GiXAppRunFilterReq, com.scailo.sdk.GiXAppRunsList> getGiXFilterMethod;
    if ((getGiXFilterMethod = VaultServiceGrpc.getGiXFilterMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getGiXFilterMethod = VaultServiceGrpc.getGiXFilterMethod) == null) {
          VaultServiceGrpc.getGiXFilterMethod = getGiXFilterMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GiXAppRunFilterReq, com.scailo.sdk.GiXAppRunsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GiXFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXAppRunFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXAppRunsList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("GiXFilter"))
              .build();
        }
      }
    }
    return getGiXFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.GiXAppRunCountReq,
      com.scailo.sdk.CountResponse> getGiXCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiXCount",
      requestType = com.scailo.sdk.GiXAppRunCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.GiXAppRunCountReq,
      com.scailo.sdk.CountResponse> getGiXCountMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.GiXAppRunCountReq, com.scailo.sdk.CountResponse> getGiXCountMethod;
    if ((getGiXCountMethod = VaultServiceGrpc.getGiXCountMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getGiXCountMethod = VaultServiceGrpc.getGiXCountMethod) == null) {
          VaultServiceGrpc.getGiXCountMethod = getGiXCountMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.GiXAppRunCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GiXCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.GiXAppRunCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("GiXCount"))
              .build();
        }
      }
    }
    return getGiXCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getReconfigureEnclaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReconfigureEnclave",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierUUID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierUUID> getReconfigureEnclaveMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID> getReconfigureEnclaveMethod;
    if ((getReconfigureEnclaveMethod = VaultServiceGrpc.getReconfigureEnclaveMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getReconfigureEnclaveMethod = VaultServiceGrpc.getReconfigureEnclaveMethod) == null) {
          VaultServiceGrpc.getReconfigureEnclaveMethod = getReconfigureEnclaveMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierUUID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReconfigureEnclave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ReconfigureEnclave"))
              .build();
        }
      }
    }
    return getReconfigureEnclaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveIngress> getSetupEnclaveIngressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetupEnclaveIngress",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.EnclaveIngress.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveIngress> getSetupEnclaveIngressMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveIngress> getSetupEnclaveIngressMethod;
    if ((getSetupEnclaveIngressMethod = VaultServiceGrpc.getSetupEnclaveIngressMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getSetupEnclaveIngressMethod = VaultServiceGrpc.getSetupEnclaveIngressMethod) == null) {
          VaultServiceGrpc.getSetupEnclaveIngressMethod = getSetupEnclaveIngressMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveIngress>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetupEnclaveIngress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveIngress.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("SetupEnclaveIngress"))
              .build();
        }
      }
    }
    return getSetupEnclaveIngressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveIngressFilterReq,
      com.scailo.sdk.EnclaveIngressesList> getFilterEnclaveIngressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FilterEnclaveIngresses",
      requestType = com.scailo.sdk.EnclaveIngressFilterReq.class,
      responseType = com.scailo.sdk.EnclaveIngressesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveIngressFilterReq,
      com.scailo.sdk.EnclaveIngressesList> getFilterEnclaveIngressesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveIngressFilterReq, com.scailo.sdk.EnclaveIngressesList> getFilterEnclaveIngressesMethod;
    if ((getFilterEnclaveIngressesMethod = VaultServiceGrpc.getFilterEnclaveIngressesMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getFilterEnclaveIngressesMethod = VaultServiceGrpc.getFilterEnclaveIngressesMethod) == null) {
          VaultServiceGrpc.getFilterEnclaveIngressesMethod = getFilterEnclaveIngressesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.EnclaveIngressFilterReq, com.scailo.sdk.EnclaveIngressesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterEnclaveIngresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveIngressFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveIngressesList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("FilterEnclaveIngresses"))
              .build();
        }
      }
    }
    return getFilterEnclaveIngressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveIngressCountReq,
      com.scailo.sdk.CountResponse> getCountEnclaveIngressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountEnclaveIngresses",
      requestType = com.scailo.sdk.EnclaveIngressCountReq.class,
      responseType = com.scailo.sdk.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveIngressCountReq,
      com.scailo.sdk.CountResponse> getCountEnclaveIngressesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveIngressCountReq, com.scailo.sdk.CountResponse> getCountEnclaveIngressesMethod;
    if ((getCountEnclaveIngressesMethod = VaultServiceGrpc.getCountEnclaveIngressesMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getCountEnclaveIngressesMethod = VaultServiceGrpc.getCountEnclaveIngressesMethod) == null) {
          VaultServiceGrpc.getCountEnclaveIngressesMethod = getCountEnclaveIngressesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.EnclaveIngressCountReq, com.scailo.sdk.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CountEnclaveIngresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveIngressCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("CountEnclaveIngresses"))
              .build();
        }
      }
    }
    return getCountEnclaveIngressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.VerifyEnclaveIngressRequest,
      com.scailo.sdk.VerifyEnclaveIngressResponse> getVerifyEnclaveIngressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyEnclaveIngress",
      requestType = com.scailo.sdk.VerifyEnclaveIngressRequest.class,
      responseType = com.scailo.sdk.VerifyEnclaveIngressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.VerifyEnclaveIngressRequest,
      com.scailo.sdk.VerifyEnclaveIngressResponse> getVerifyEnclaveIngressMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.VerifyEnclaveIngressRequest, com.scailo.sdk.VerifyEnclaveIngressResponse> getVerifyEnclaveIngressMethod;
    if ((getVerifyEnclaveIngressMethod = VaultServiceGrpc.getVerifyEnclaveIngressMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getVerifyEnclaveIngressMethod = VaultServiceGrpc.getVerifyEnclaveIngressMethod) == null) {
          VaultServiceGrpc.getVerifyEnclaveIngressMethod = getVerifyEnclaveIngressMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.VerifyEnclaveIngressRequest, com.scailo.sdk.VerifyEnclaveIngressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyEnclaveIngress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VerifyEnclaveIngressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VerifyEnclaveIngressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("VerifyEnclaveIngress"))
              .build();
        }
      }
    }
    return getVerifyEnclaveIngressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveEnvironmentVariableAddRequest,
      com.scailo.sdk.EnclaveEnvironmentVariable> getAddEnclaveEnvironmentVariableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEnclaveEnvironmentVariable",
      requestType = com.scailo.sdk.EnclaveEnvironmentVariableAddRequest.class,
      responseType = com.scailo.sdk.EnclaveEnvironmentVariable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveEnvironmentVariableAddRequest,
      com.scailo.sdk.EnclaveEnvironmentVariable> getAddEnclaveEnvironmentVariableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveEnvironmentVariableAddRequest, com.scailo.sdk.EnclaveEnvironmentVariable> getAddEnclaveEnvironmentVariableMethod;
    if ((getAddEnclaveEnvironmentVariableMethod = VaultServiceGrpc.getAddEnclaveEnvironmentVariableMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getAddEnclaveEnvironmentVariableMethod = VaultServiceGrpc.getAddEnclaveEnvironmentVariableMethod) == null) {
          VaultServiceGrpc.getAddEnclaveEnvironmentVariableMethod = getAddEnclaveEnvironmentVariableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.EnclaveEnvironmentVariableAddRequest, com.scailo.sdk.EnclaveEnvironmentVariable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddEnclaveEnvironmentVariable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveEnvironmentVariableAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveEnvironmentVariable.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("AddEnclaveEnvironmentVariable"))
              .build();
        }
      }
    }
    return getAddEnclaveEnvironmentVariableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest,
      com.scailo.sdk.EnclaveEnvironmentVariable> getUpdateEnclaveEnvironmentVariableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnclaveEnvironmentVariable",
      requestType = com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest.class,
      responseType = com.scailo.sdk.EnclaveEnvironmentVariable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest,
      com.scailo.sdk.EnclaveEnvironmentVariable> getUpdateEnclaveEnvironmentVariableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest, com.scailo.sdk.EnclaveEnvironmentVariable> getUpdateEnclaveEnvironmentVariableMethod;
    if ((getUpdateEnclaveEnvironmentVariableMethod = VaultServiceGrpc.getUpdateEnclaveEnvironmentVariableMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getUpdateEnclaveEnvironmentVariableMethod = VaultServiceGrpc.getUpdateEnclaveEnvironmentVariableMethod) == null) {
          VaultServiceGrpc.getUpdateEnclaveEnvironmentVariableMethod = getUpdateEnclaveEnvironmentVariableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest, com.scailo.sdk.EnclaveEnvironmentVariable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnclaveEnvironmentVariable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveEnvironmentVariable.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("UpdateEnclaveEnvironmentVariable"))
              .build();
        }
      }
    }
    return getUpdateEnclaveEnvironmentVariableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getDeleteEnclaveEnvironmentVariableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnclaveEnvironmentVariable",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getDeleteEnclaveEnvironmentVariableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse> getDeleteEnclaveEnvironmentVariableMethod;
    if ((getDeleteEnclaveEnvironmentVariableMethod = VaultServiceGrpc.getDeleteEnclaveEnvironmentVariableMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDeleteEnclaveEnvironmentVariableMethod = VaultServiceGrpc.getDeleteEnclaveEnvironmentVariableMethod) == null) {
          VaultServiceGrpc.getDeleteEnclaveEnvironmentVariableMethod = getDeleteEnclaveEnvironmentVariableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnclaveEnvironmentVariable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DeleteEnclaveEnvironmentVariable"))
              .build();
        }
      }
    }
    return getDeleteEnclaveEnvironmentVariableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveEnvironmentVariable> getViewEnclaveEnvironmentVariableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEnclaveEnvironmentVariable",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.EnclaveEnvironmentVariable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveEnvironmentVariable> getViewEnclaveEnvironmentVariableMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveEnvironmentVariable> getViewEnclaveEnvironmentVariableMethod;
    if ((getViewEnclaveEnvironmentVariableMethod = VaultServiceGrpc.getViewEnclaveEnvironmentVariableMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewEnclaveEnvironmentVariableMethod = VaultServiceGrpc.getViewEnclaveEnvironmentVariableMethod) == null) {
          VaultServiceGrpc.getViewEnclaveEnvironmentVariableMethod = getViewEnclaveEnvironmentVariableMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveEnvironmentVariable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEnclaveEnvironmentVariable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveEnvironmentVariable.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewEnclaveEnvironmentVariable"))
              .build();
        }
      }
    }
    return getViewEnclaveEnvironmentVariableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveEnvironmentVariablesList> getViewAllEnclaveEnvironmentVariablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllEnclaveEnvironmentVariables",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.EnclaveEnvironmentVariablesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveEnvironmentVariablesList> getViewAllEnclaveEnvironmentVariablesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveEnvironmentVariablesList> getViewAllEnclaveEnvironmentVariablesMethod;
    if ((getViewAllEnclaveEnvironmentVariablesMethod = VaultServiceGrpc.getViewAllEnclaveEnvironmentVariablesMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewAllEnclaveEnvironmentVariablesMethod = VaultServiceGrpc.getViewAllEnclaveEnvironmentVariablesMethod) == null) {
          VaultServiceGrpc.getViewAllEnclaveEnvironmentVariablesMethod = getViewAllEnclaveEnvironmentVariablesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveEnvironmentVariablesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllEnclaveEnvironmentVariables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveEnvironmentVariablesList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewAllEnclaveEnvironmentVariables"))
              .build();
        }
      }
    }
    return getViewAllEnclaveEnvironmentVariablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveDomainAddRequest,
      com.scailo.sdk.EnclaveDomain> getAddEnclaveDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEnclaveDomain",
      requestType = com.scailo.sdk.EnclaveDomainAddRequest.class,
      responseType = com.scailo.sdk.EnclaveDomain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveDomainAddRequest,
      com.scailo.sdk.EnclaveDomain> getAddEnclaveDomainMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveDomainAddRequest, com.scailo.sdk.EnclaveDomain> getAddEnclaveDomainMethod;
    if ((getAddEnclaveDomainMethod = VaultServiceGrpc.getAddEnclaveDomainMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getAddEnclaveDomainMethod = VaultServiceGrpc.getAddEnclaveDomainMethod) == null) {
          VaultServiceGrpc.getAddEnclaveDomainMethod = getAddEnclaveDomainMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.EnclaveDomainAddRequest, com.scailo.sdk.EnclaveDomain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddEnclaveDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveDomainAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveDomain.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("AddEnclaveDomain"))
              .build();
        }
      }
    }
    return getAddEnclaveDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getDeleteEnclaveDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnclaveDomain",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getDeleteEnclaveDomainMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse> getDeleteEnclaveDomainMethod;
    if ((getDeleteEnclaveDomainMethod = VaultServiceGrpc.getDeleteEnclaveDomainMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDeleteEnclaveDomainMethod = VaultServiceGrpc.getDeleteEnclaveDomainMethod) == null) {
          VaultServiceGrpc.getDeleteEnclaveDomainMethod = getDeleteEnclaveDomainMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnclaveDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DeleteEnclaveDomain"))
              .build();
        }
      }
    }
    return getDeleteEnclaveDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveDomain> getViewEnclaveDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEnclaveDomain",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.EnclaveDomain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveDomain> getViewEnclaveDomainMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveDomain> getViewEnclaveDomainMethod;
    if ((getViewEnclaveDomainMethod = VaultServiceGrpc.getViewEnclaveDomainMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewEnclaveDomainMethod = VaultServiceGrpc.getViewEnclaveDomainMethod) == null) {
          VaultServiceGrpc.getViewEnclaveDomainMethod = getViewEnclaveDomainMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveDomain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEnclaveDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveDomain.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewEnclaveDomain"))
              .build();
        }
      }
    }
    return getViewEnclaveDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveDomainsList> getViewAllEnclaveDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewAllEnclaveDomains",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.EnclaveDomainsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveDomainsList> getViewAllEnclaveDomainsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveDomainsList> getViewAllEnclaveDomainsMethod;
    if ((getViewAllEnclaveDomainsMethod = VaultServiceGrpc.getViewAllEnclaveDomainsMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewAllEnclaveDomainsMethod = VaultServiceGrpc.getViewAllEnclaveDomainsMethod) == null) {
          VaultServiceGrpc.getViewAllEnclaveDomainsMethod = getViewAllEnclaveDomainsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveDomainsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewAllEnclaveDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveDomainsList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewAllEnclaveDomains"))
              .build();
        }
      }
    }
    return getViewAllEnclaveDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.EnclaveDomainSuffixResp> getViewDomainSuffixMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewDomainSuffix",
      requestType = com.scailo.sdk.Empty.class,
      responseType = com.scailo.sdk.EnclaveDomainSuffixResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.EnclaveDomainSuffixResp> getViewDomainSuffixMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Empty, com.scailo.sdk.EnclaveDomainSuffixResp> getViewDomainSuffixMethod;
    if ((getViewDomainSuffixMethod = VaultServiceGrpc.getViewDomainSuffixMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewDomainSuffixMethod = VaultServiceGrpc.getViewDomainSuffixMethod) == null) {
          VaultServiceGrpc.getViewDomainSuffixMethod = getViewDomainSuffixMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.EnclaveDomainSuffixResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewDomainSuffix"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveDomainSuffixResp.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewDomainSuffix"))
              .build();
        }
      }
    }
    return getViewDomainSuffixMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveDomainsFilterReq,
      com.scailo.sdk.EnclaveDomainsList> getFilterEnclaveDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FilterEnclaveDomains",
      requestType = com.scailo.sdk.EnclaveDomainsFilterReq.class,
      responseType = com.scailo.sdk.EnclaveDomainsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveDomainsFilterReq,
      com.scailo.sdk.EnclaveDomainsList> getFilterEnclaveDomainsMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveDomainsFilterReq, com.scailo.sdk.EnclaveDomainsList> getFilterEnclaveDomainsMethod;
    if ((getFilterEnclaveDomainsMethod = VaultServiceGrpc.getFilterEnclaveDomainsMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getFilterEnclaveDomainsMethod = VaultServiceGrpc.getFilterEnclaveDomainsMethod) == null) {
          VaultServiceGrpc.getFilterEnclaveDomainsMethod = getFilterEnclaveDomainsMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.EnclaveDomainsFilterReq, com.scailo.sdk.EnclaveDomainsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FilterEnclaveDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveDomainsFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveDomainsList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("FilterEnclaveDomains"))
              .build();
        }
      }
    }
    return getFilterEnclaveDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveFrameAddRequest,
      com.scailo.sdk.EnclaveFrame> getAddEnclaveFrameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEnclaveFrame",
      requestType = com.scailo.sdk.EnclaveFrameAddRequest.class,
      responseType = com.scailo.sdk.EnclaveFrame.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveFrameAddRequest,
      com.scailo.sdk.EnclaveFrame> getAddEnclaveFrameMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveFrameAddRequest, com.scailo.sdk.EnclaveFrame> getAddEnclaveFrameMethod;
    if ((getAddEnclaveFrameMethod = VaultServiceGrpc.getAddEnclaveFrameMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getAddEnclaveFrameMethod = VaultServiceGrpc.getAddEnclaveFrameMethod) == null) {
          VaultServiceGrpc.getAddEnclaveFrameMethod = getAddEnclaveFrameMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.EnclaveFrameAddRequest, com.scailo.sdk.EnclaveFrame>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddEnclaveFrame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveFrameAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveFrame.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("AddEnclaveFrame"))
              .build();
        }
      }
    }
    return getAddEnclaveFrameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveFrame> getViewEnclaveFrameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewEnclaveFrame",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.EnclaveFrame.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveFrame> getViewEnclaveFrameMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveFrame> getViewEnclaveFrameMethod;
    if ((getViewEnclaveFrameMethod = VaultServiceGrpc.getViewEnclaveFrameMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getViewEnclaveFrameMethod = VaultServiceGrpc.getViewEnclaveFrameMethod) == null) {
          VaultServiceGrpc.getViewEnclaveFrameMethod = getViewEnclaveFrameMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveFrame>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewEnclaveFrame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveFrame.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("ViewEnclaveFrame"))
              .build();
        }
      }
    }
    return getViewEnclaveFrameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveFrameUpdateRequest,
      com.scailo.sdk.EnclaveFrame> getUpdateEnclaveFrameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnclaveFrame",
      requestType = com.scailo.sdk.EnclaveFrameUpdateRequest.class,
      responseType = com.scailo.sdk.EnclaveFrame.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveFrameUpdateRequest,
      com.scailo.sdk.EnclaveFrame> getUpdateEnclaveFrameMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.EnclaveFrameUpdateRequest, com.scailo.sdk.EnclaveFrame> getUpdateEnclaveFrameMethod;
    if ((getUpdateEnclaveFrameMethod = VaultServiceGrpc.getUpdateEnclaveFrameMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getUpdateEnclaveFrameMethod = VaultServiceGrpc.getUpdateEnclaveFrameMethod) == null) {
          VaultServiceGrpc.getUpdateEnclaveFrameMethod = getUpdateEnclaveFrameMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.EnclaveFrameUpdateRequest, com.scailo.sdk.EnclaveFrame>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnclaveFrame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveFrameUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveFrame.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("UpdateEnclaveFrame"))
              .build();
        }
      }
    }
    return getUpdateEnclaveFrameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getDeleteEnclaveFrameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnclaveFrame",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.IdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.IdentifierResponse> getDeleteEnclaveFrameMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse> getDeleteEnclaveFrameMethod;
    if ((getDeleteEnclaveFrameMethod = VaultServiceGrpc.getDeleteEnclaveFrameMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getDeleteEnclaveFrameMethod = VaultServiceGrpc.getDeleteEnclaveFrameMethod) == null) {
          VaultServiceGrpc.getDeleteEnclaveFrameMethod = getDeleteEnclaveFrameMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.IdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnclaveFrame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("DeleteEnclaveFrame"))
              .build();
        }
      }
    }
    return getDeleteEnclaveFrameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveFrameSetup> getSetupEnclaveFrameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetupEnclaveFrame",
      requestType = com.scailo.sdk.IdentifierUUID.class,
      responseType = com.scailo.sdk.EnclaveFrameSetup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID,
      com.scailo.sdk.EnclaveFrameSetup> getSetupEnclaveFrameMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveFrameSetup> getSetupEnclaveFrameMethod;
    if ((getSetupEnclaveFrameMethod = VaultServiceGrpc.getSetupEnclaveFrameMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getSetupEnclaveFrameMethod = VaultServiceGrpc.getSetupEnclaveFrameMethod) == null) {
          VaultServiceGrpc.getSetupEnclaveFrameMethod = getSetupEnclaveFrameMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.IdentifierUUID, com.scailo.sdk.EnclaveFrameSetup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetupEnclaveFrame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.IdentifierUUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveFrameSetup.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("SetupEnclaveFrame"))
              .build();
        }
      }
    }
    return getSetupEnclaveFrameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.EnclaveFrameSetupList> getSetupAllEnclaveFramesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetupAllEnclaveFrames",
      requestType = com.scailo.sdk.Empty.class,
      responseType = com.scailo.sdk.EnclaveFrameSetupList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.Empty,
      com.scailo.sdk.EnclaveFrameSetupList> getSetupAllEnclaveFramesMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.Empty, com.scailo.sdk.EnclaveFrameSetupList> getSetupAllEnclaveFramesMethod;
    if ((getSetupAllEnclaveFramesMethod = VaultServiceGrpc.getSetupAllEnclaveFramesMethod) == null) {
      synchronized (VaultServiceGrpc.class) {
        if ((getSetupAllEnclaveFramesMethod = VaultServiceGrpc.getSetupAllEnclaveFramesMethod) == null) {
          VaultServiceGrpc.getSetupAllEnclaveFramesMethod = getSetupAllEnclaveFramesMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.Empty, com.scailo.sdk.EnclaveFrameSetupList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetupAllEnclaveFrames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.EnclaveFrameSetupList.getDefaultInstance()))
              .setSchemaDescriptor(new VaultServiceMethodDescriptorSupplier("SetupAllEnclaveFrames"))
              .build();
        }
      }
    }
    return getSetupAllEnclaveFramesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VaultServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VaultServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VaultServiceStub>() {
        @java.lang.Override
        public VaultServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VaultServiceStub(channel, callOptions);
        }
      };
    return VaultServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VaultServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VaultServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VaultServiceBlockingStub>() {
        @java.lang.Override
        public VaultServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VaultServiceBlockingStub(channel, callOptions);
        }
      };
    return VaultServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VaultServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VaultServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VaultServiceFutureStub>() {
        @java.lang.Override
        public VaultServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VaultServiceFutureStub(channel, callOptions);
        }
      };
    return VaultServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the available services in Vault
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Initiate file upload
     * </pre>
     */
    default void initiateFile(com.scailo.sdk.VaultFileInitiateFileRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileInitiateFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitiateFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add chunk to a file version and returns the UUID of the added chunk
     * </pre>
     */
    default void addFileChunk(com.scailo.sdk.VaultFileAddChunkRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFileChunkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Complete file upload
     * </pre>
     */
    default void completeFile(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rename file
     * </pre>
     */
    default void renameFile(com.scailo.sdk.VaultFileRenameFileRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unzip file
     * </pre>
     */
    default void unzipFile(com.scailo.sdk.VaultFileUnzipRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnzipFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Persist file
     * </pre>
     */
    default void persistFile(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPersistFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move file
     * </pre>
     */
    default void moveFile(com.scailo.sdk.VaultFileMoveFileRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete file
     * </pre>
     */
    default void deleteFile(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Permission APIs
     * Add permission and returns the UUID of the added permission
     * </pre>
     */
    default void addFilePermission(com.scailo.sdk.VaultPermissionAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFilePermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify permission and returns the UUID of the added permission
     * </pre>
     */
    default void modifyFilePermission(com.scailo.sdk.VaultPermissionModifyRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyFilePermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete permission (returns the UUID of the file)
     * </pre>
     */
    default void deleteFilePermission(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFilePermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Downloads
     * Download file with the given UUID
     * </pre>
     */
    default void downloadFile(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download file version with the given UUID
     * </pre>
     */
    default void downloadFileVersion(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadFileVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * View logo
     * </pre>
     */
    default void viewFileLogo(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFileLogoMethod(), responseObserver);
    }

    /**
     * <pre>
     * View file by UUID
     * </pre>
     */
    default void viewFileByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFileByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View file by ID
     * </pre>
     */
    default void viewFileByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFileByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View chunk with the given UUID
     * </pre>
     */
    default void viewFileChunk(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileVersionChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFileChunkMethod(), responseObserver);
    }

    /**
     * <pre>
     * View chunk metadata
     * </pre>
     */
    default void viewFileChunkMetadata(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileVersionChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFileChunkMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * View permission for file
     * </pre>
     */
    default void viewFilePermission(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultPermission> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFilePermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check if file already exists
     * </pre>
     */
    default void doesFileExist(com.scailo.sdk.VaultDuplicateCheckReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoesFileExistMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all versions of file
     * </pre>
     */
    default void viewFileVersions(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileVersionsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFileVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View access logs of file
     * </pre>
     */
    default void viewFileAccessLogs(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultAccessLogsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFileAccessLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add folder
     * </pre>
     */
    default void addFolder(com.scailo.sdk.VaultFolderAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move folder
     * </pre>
     */
    default void moveFolder(com.scailo.sdk.VaultFolderMoveFolderRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rename folder
     * </pre>
     */
    default void renameFolder(com.scailo.sdk.VaultFolderRenameFolderRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete folder
     * </pre>
     */
    default void deleteFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Zip folder and returns the UUID of the vault folder download
     * </pre>
     */
    default void zipFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZipFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Permission APIs
     * Add permission and returns the UUID of the added permission
     * </pre>
     */
    default void addFolderPermission(com.scailo.sdk.VaultPermissionAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFolderPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modify permission and returns the UUID of the modified permission
     * </pre>
     */
    default void modifyFolderPermission(com.scailo.sdk.VaultPermissionModifyRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyFolderPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete permission (returns the UUID of the folder)
     * </pre>
     */
    default void deleteFolderPermission(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFolderPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * View folder by ID
     * </pre>
     */
    default void viewFolderByID(com.scailo.sdk.IdentifierZeroable request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFolder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFolderByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View folder by UUID
     * </pre>
     */
    default void viewFolderByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFolder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFolderByUUIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the status of the folder download
     * </pre>
     */
    default void viewFolderDownloadStatus(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFolderDownload> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFolderDownloadStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download the vault folder
     * </pre>
     */
    default void downloadFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all files accessible by self in the given folder
     * </pre>
     */
    default void viewAccessibleFilesInFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFilesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAccessibleFilesInFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all folders accessible by self in the given folder
     * </pre>
     */
    default void viewAccessibleFoldersInFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFoldersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAccessibleFoldersInFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all the resources accessible by self in the given folder
     * </pre>
     */
    default void viewAccessibleResourcesInFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultResourcesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAccessibleResourcesInFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * View permission for folder
     * </pre>
     */
    default void viewFolderPermission(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultPermission> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFolderPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check if folder already exists
     * </pre>
     */
    default void doesFolderExist(com.scailo.sdk.VaultDuplicateCheckReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoesFolderExistMethod(), responseObserver);
    }

    /**
     * <pre>
     * View access logs of folder
     * </pre>
     */
    default void viewFolderAccessLogs(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultAccessLogsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewFolderAccessLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * View passthrough roles for folder
     * </pre>
     */
    default void viewPassthroughRolesForFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.RolesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewPassthroughRolesForFolderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search for files and folders
     * </pre>
     */
    default void search(com.scailo.sdk.VaultSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultSearchResponsesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Setup GiX app
     * </pre>
     */
    default void setupGiX(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXAppRun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetupGiXMethod(), responseObserver);
    }

    /**
     * <pre>
     * Relay a DELETE API
     * </pre>
     */
    default void giXRelayDELETE(com.scailo.sdk.GiXRelayReqWithoutBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGiXRelayDELETEMethod(), responseObserver);
    }

    /**
     * <pre>
     * Relay a GET API
     * </pre>
     */
    default void giXRelayGET(com.scailo.sdk.GiXRelayReqWithoutBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGiXRelayGETMethod(), responseObserver);
    }

    /**
     * <pre>
     * Relay a HEAD API
     * </pre>
     */
    default void giXRelayHEAD(com.scailo.sdk.GiXRelayReqWithoutBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGiXRelayHEADMethod(), responseObserver);
    }

    /**
     * <pre>
     * Relay a PATCH API
     * </pre>
     */
    default void giXRelayPATCH(com.scailo.sdk.GiXRelayReqWithBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGiXRelayPATCHMethod(), responseObserver);
    }

    /**
     * <pre>
     * Relay a POST API
     * </pre>
     */
    default void giXRelayPOST(com.scailo.sdk.GiXRelayReqWithBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGiXRelayPOSTMethod(), responseObserver);
    }

    /**
     * <pre>
     * Relay a PUT API
     * </pre>
     */
    default void giXRelayPUT(com.scailo.sdk.GiXRelayReqWithBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGiXRelayPUTMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all runs that match the given filter criteria
     * </pre>
     */
    default void giXFilter(com.scailo.sdk.GiXAppRunFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXAppRunsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGiXFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all runs that match the given filter criteria
     * </pre>
     */
    default void giXCount(com.scailo.sdk.GiXAppRunCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGiXCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reconfigures the enclave (redeploys the enclave)
     * </pre>
     */
    default void reconfigureEnclave(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReconfigureEnclaveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Setup Enclave Ingress
     * </pre>
     */
    default void setupEnclaveIngress(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveIngress> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetupEnclaveIngressMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all enclave ingresses that match the given filter criteria
     * </pre>
     */
    default void filterEnclaveIngresses(com.scailo.sdk.EnclaveIngressFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveIngressesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterEnclaveIngressesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count all enclave ingresses that match the given filter criteria
     * </pre>
     */
    default void countEnclaveIngresses(com.scailo.sdk.EnclaveIngressCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountEnclaveIngressesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Verifies the enclave ingress and returns the necessary information for subsequent requests
     * </pre>
     */
    default void verifyEnclaveIngress(com.scailo.sdk.VerifyEnclaveIngressRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VerifyEnclaveIngressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyEnclaveIngressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add environment variable to enclave
     * </pre>
     */
    default void addEnclaveEnvironmentVariable(com.scailo.sdk.EnclaveEnvironmentVariableAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEnclaveEnvironmentVariableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update environment variable in enclave
     * </pre>
     */
    default void updateEnclaveEnvironmentVariable(com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnclaveEnvironmentVariableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete environment variable in enclave
     * </pre>
     */
    default void deleteEnclaveEnvironmentVariable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEnclaveEnvironmentVariableMethod(), responseObserver);
    }

    /**
     * <pre>
     * View environment variable in enclave represented by the Identifier
     * </pre>
     */
    default void viewEnclaveEnvironmentVariable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEnclaveEnvironmentVariableMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all environment variables in enclave for the enclave represented by the Identifier
     * </pre>
     */
    default void viewAllEnclaveEnvironmentVariables(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariablesList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllEnclaveEnvironmentVariablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add domain to enclave
     * </pre>
     */
    default void addEnclaveDomain(com.scailo.sdk.EnclaveDomainAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomain> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEnclaveDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete domain from enclave
     * </pre>
     */
    default void deleteEnclaveDomain(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEnclaveDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * View domain for enclave represented by the Identifier
     * </pre>
     */
    default void viewEnclaveDomain(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomain> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEnclaveDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * View all domains for enclave for the enclave represented by the Identifier
     * </pre>
     */
    default void viewAllEnclaveDomains(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomainsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewAllEnclaveDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the default domain suffix that could be used for creating a new domain
     * </pre>
     */
    default void viewDomainSuffix(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomainSuffixResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewDomainSuffixMethod(), responseObserver);
    }

    /**
     * <pre>
     * Filter all domains that match the given filter criteria
     * </pre>
     */
    default void filterEnclaveDomains(com.scailo.sdk.EnclaveDomainsFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomainsList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterEnclaveDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds an enclave as a dashboard frame. The file needs to be an enclave. Returns an error otherwise
     * </pre>
     */
    default void addEnclaveFrame(com.scailo.sdk.EnclaveFrameAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrame> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEnclaveFrameMethod(), responseObserver);
    }

    /**
     * <pre>
     * View the properties of a frame
     * </pre>
     */
    default void viewEnclaveFrame(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrame> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewEnclaveFrameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the properties of a frame
     * </pre>
     */
    default void updateEnclaveFrame(com.scailo.sdk.EnclaveFrameUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrame> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnclaveFrameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete the dashboard frame
     * </pre>
     */
    default void deleteEnclaveFrame(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEnclaveFrameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the endpoint that could be used to render a frame
     * </pre>
     */
    default void setupEnclaveFrame(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrameSetup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetupEnclaveFrameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all the endpoints that could be used to render frames for the identified user. This can be primary used to render all the frames on a user's dashboard, for example.
     * </pre>
     */
    default void setupAllEnclaveFrames(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrameSetupList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetupAllEnclaveFramesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VaultService.
   * <pre>
   *Describes the available services in Vault
   * </pre>
   */
  public static abstract class VaultServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VaultServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VaultService.
   * <pre>
   *Describes the available services in Vault
   * </pre>
   */
  public static final class VaultServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VaultServiceStub> {
    private VaultServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VaultServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VaultServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initiate file upload
     * </pre>
     */
    public void initiateFile(com.scailo.sdk.VaultFileInitiateFileRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileInitiateFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitiateFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add chunk to a file version and returns the UUID of the added chunk
     * </pre>
     */
    public void addFileChunk(com.scailo.sdk.VaultFileAddChunkRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFileChunkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Complete file upload
     * </pre>
     */
    public void completeFile(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rename file
     * </pre>
     */
    public void renameFile(com.scailo.sdk.VaultFileRenameFileRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unzip file
     * </pre>
     */
    public void unzipFile(com.scailo.sdk.VaultFileUnzipRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnzipFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Persist file
     * </pre>
     */
    public void persistFile(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPersistFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move file
     * </pre>
     */
    public void moveFile(com.scailo.sdk.VaultFileMoveFileRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete file
     * </pre>
     */
    public void deleteFile(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Permission APIs
     * Add permission and returns the UUID of the added permission
     * </pre>
     */
    public void addFilePermission(com.scailo.sdk.VaultPermissionAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFilePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify permission and returns the UUID of the added permission
     * </pre>
     */
    public void modifyFilePermission(com.scailo.sdk.VaultPermissionModifyRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyFilePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete permission (returns the UUID of the file)
     * </pre>
     */
    public void deleteFilePermission(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFilePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Downloads
     * Download file with the given UUID
     * </pre>
     */
    public void downloadFile(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download file version with the given UUID
     * </pre>
     */
    public void downloadFileVersion(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadFileVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View logo
     * </pre>
     */
    public void viewFileLogo(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFileLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View file by UUID
     * </pre>
     */
    public void viewFileByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFileByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View file by ID
     * </pre>
     */
    public void viewFileByID(com.scailo.sdk.Identifier request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFileByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View chunk with the given UUID
     * </pre>
     */
    public void viewFileChunk(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileVersionChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFileChunkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View chunk metadata
     * </pre>
     */
    public void viewFileChunkMetadata(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileVersionChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFileChunkMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View permission for file
     * </pre>
     */
    public void viewFilePermission(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultPermission> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFilePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if file already exists
     * </pre>
     */
    public void doesFileExist(com.scailo.sdk.VaultDuplicateCheckReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoesFileExistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all versions of file
     * </pre>
     */
    public void viewFileVersions(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileVersionsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFileVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View access logs of file
     * </pre>
     */
    public void viewFileAccessLogs(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultAccessLogsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFileAccessLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add folder
     * </pre>
     */
    public void addFolder(com.scailo.sdk.VaultFolderAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move folder
     * </pre>
     */
    public void moveFolder(com.scailo.sdk.VaultFolderMoveFolderRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rename folder
     * </pre>
     */
    public void renameFolder(com.scailo.sdk.VaultFolderRenameFolderRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete folder
     * </pre>
     */
    public void deleteFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Zip folder and returns the UUID of the vault folder download
     * </pre>
     */
    public void zipFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZipFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Permission APIs
     * Add permission and returns the UUID of the added permission
     * </pre>
     */
    public void addFolderPermission(com.scailo.sdk.VaultPermissionAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFolderPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modify permission and returns the UUID of the modified permission
     * </pre>
     */
    public void modifyFolderPermission(com.scailo.sdk.VaultPermissionModifyRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyFolderPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete permission (returns the UUID of the folder)
     * </pre>
     */
    public void deleteFolderPermission(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFolderPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View folder by ID
     * </pre>
     */
    public void viewFolderByID(com.scailo.sdk.IdentifierZeroable request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFolder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFolderByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View folder by UUID
     * </pre>
     */
    public void viewFolderByUUID(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFolder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFolderByUUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the status of the folder download
     * </pre>
     */
    public void viewFolderDownloadStatus(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFolderDownload> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFolderDownloadStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download the vault folder
     * </pre>
     */
    public void downloadFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all files accessible by self in the given folder
     * </pre>
     */
    public void viewAccessibleFilesInFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFilesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAccessibleFilesInFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all folders accessible by self in the given folder
     * </pre>
     */
    public void viewAccessibleFoldersInFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFoldersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAccessibleFoldersInFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all the resources accessible by self in the given folder
     * </pre>
     */
    public void viewAccessibleResourcesInFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultResourcesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAccessibleResourcesInFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View permission for folder
     * </pre>
     */
    public void viewFolderPermission(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultPermission> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFolderPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if folder already exists
     * </pre>
     */
    public void doesFolderExist(com.scailo.sdk.VaultDuplicateCheckReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoesFolderExistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View access logs of folder
     * </pre>
     */
    public void viewFolderAccessLogs(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultAccessLogsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewFolderAccessLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View passthrough roles for folder
     * </pre>
     */
    public void viewPassthroughRolesForFolder(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.RolesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewPassthroughRolesForFolderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search for files and folders
     * </pre>
     */
    public void search(com.scailo.sdk.VaultSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VaultSearchResponsesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Setup GiX app
     * </pre>
     */
    public void setupGiX(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXAppRun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetupGiXMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Relay a DELETE API
     * </pre>
     */
    public void giXRelayDELETE(com.scailo.sdk.GiXRelayReqWithoutBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGiXRelayDELETEMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Relay a GET API
     * </pre>
     */
    public void giXRelayGET(com.scailo.sdk.GiXRelayReqWithoutBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGiXRelayGETMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Relay a HEAD API
     * </pre>
     */
    public void giXRelayHEAD(com.scailo.sdk.GiXRelayReqWithoutBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGiXRelayHEADMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Relay a PATCH API
     * </pre>
     */
    public void giXRelayPATCH(com.scailo.sdk.GiXRelayReqWithBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGiXRelayPATCHMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Relay a POST API
     * </pre>
     */
    public void giXRelayPOST(com.scailo.sdk.GiXRelayReqWithBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGiXRelayPOSTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Relay a PUT API
     * </pre>
     */
    public void giXRelayPUT(com.scailo.sdk.GiXRelayReqWithBody request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGiXRelayPUTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all runs that match the given filter criteria
     * </pre>
     */
    public void giXFilter(com.scailo.sdk.GiXAppRunFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.GiXAppRunsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGiXFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all runs that match the given filter criteria
     * </pre>
     */
    public void giXCount(com.scailo.sdk.GiXAppRunCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGiXCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reconfigures the enclave (redeploys the enclave)
     * </pre>
     */
    public void reconfigureEnclave(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReconfigureEnclaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Setup Enclave Ingress
     * </pre>
     */
    public void setupEnclaveIngress(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveIngress> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetupEnclaveIngressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all enclave ingresses that match the given filter criteria
     * </pre>
     */
    public void filterEnclaveIngresses(com.scailo.sdk.EnclaveIngressFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveIngressesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterEnclaveIngressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count all enclave ingresses that match the given filter criteria
     * </pre>
     */
    public void countEnclaveIngresses(com.scailo.sdk.EnclaveIngressCountReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountEnclaveIngressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verifies the enclave ingress and returns the necessary information for subsequent requests
     * </pre>
     */
    public void verifyEnclaveIngress(com.scailo.sdk.VerifyEnclaveIngressRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VerifyEnclaveIngressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyEnclaveIngressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add environment variable to enclave
     * </pre>
     */
    public void addEnclaveEnvironmentVariable(com.scailo.sdk.EnclaveEnvironmentVariableAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEnclaveEnvironmentVariableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update environment variable in enclave
     * </pre>
     */
    public void updateEnclaveEnvironmentVariable(com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnclaveEnvironmentVariableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete environment variable in enclave
     * </pre>
     */
    public void deleteEnclaveEnvironmentVariable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEnclaveEnvironmentVariableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View environment variable in enclave represented by the Identifier
     * </pre>
     */
    public void viewEnclaveEnvironmentVariable(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEnclaveEnvironmentVariableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all environment variables in enclave for the enclave represented by the Identifier
     * </pre>
     */
    public void viewAllEnclaveEnvironmentVariables(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariablesList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllEnclaveEnvironmentVariablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add domain to enclave
     * </pre>
     */
    public void addEnclaveDomain(com.scailo.sdk.EnclaveDomainAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomain> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEnclaveDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete domain from enclave
     * </pre>
     */
    public void deleteEnclaveDomain(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEnclaveDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View domain for enclave represented by the Identifier
     * </pre>
     */
    public void viewEnclaveDomain(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomain> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEnclaveDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View all domains for enclave for the enclave represented by the Identifier
     * </pre>
     */
    public void viewAllEnclaveDomains(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomainsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewAllEnclaveDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the default domain suffix that could be used for creating a new domain
     * </pre>
     */
    public void viewDomainSuffix(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomainSuffixResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewDomainSuffixMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Filter all domains that match the given filter criteria
     * </pre>
     */
    public void filterEnclaveDomains(com.scailo.sdk.EnclaveDomainsFilterReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomainsList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterEnclaveDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds an enclave as a dashboard frame. The file needs to be an enclave. Returns an error otherwise
     * </pre>
     */
    public void addEnclaveFrame(com.scailo.sdk.EnclaveFrameAddRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrame> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEnclaveFrameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View the properties of a frame
     * </pre>
     */
    public void viewEnclaveFrame(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrame> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewEnclaveFrameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the properties of a frame
     * </pre>
     */
    public void updateEnclaveFrame(com.scailo.sdk.EnclaveFrameUpdateRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrame> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnclaveFrameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete the dashboard frame
     * </pre>
     */
    public void deleteEnclaveFrame(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEnclaveFrameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the endpoint that could be used to render a frame
     * </pre>
     */
    public void setupEnclaveFrame(com.scailo.sdk.IdentifierUUID request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrameSetup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetupEnclaveFrameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all the endpoints that could be used to render frames for the identified user. This can be primary used to render all the frames on a user's dashboard, for example.
     * </pre>
     */
    public void setupAllEnclaveFrames(com.scailo.sdk.Empty request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrameSetupList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetupAllEnclaveFramesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VaultService.
   * <pre>
   *Describes the available services in Vault
   * </pre>
   */
  public static final class VaultServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VaultServiceBlockingStub> {
    private VaultServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VaultServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VaultServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initiate file upload
     * </pre>
     */
    public com.scailo.sdk.VaultFileInitiateFileResponse initiateFile(com.scailo.sdk.VaultFileInitiateFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitiateFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add chunk to a file version and returns the UUID of the added chunk
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID addFileChunk(com.scailo.sdk.VaultFileAddChunkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFileChunkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Complete file upload
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID completeFile(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rename file
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID renameFile(com.scailo.sdk.VaultFileRenameFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unzip file
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID unzipFile(com.scailo.sdk.VaultFileUnzipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnzipFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Persist file
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID persistFile(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPersistFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move file
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID moveFile(com.scailo.sdk.VaultFileMoveFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete file
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID deleteFile(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Permission APIs
     * Add permission and returns the UUID of the added permission
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID addFilePermission(com.scailo.sdk.VaultPermissionAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFilePermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify permission and returns the UUID of the added permission
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID modifyFilePermission(com.scailo.sdk.VaultPermissionModifyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyFilePermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete permission (returns the UUID of the file)
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID deleteFilePermission(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFilePermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Downloads
     * Download file with the given UUID
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadFile(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download file version with the given UUID
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadFileVersion(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadFileVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View logo
     * </pre>
     */
    public com.scailo.sdk.StandardFile viewFileLogo(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFileLogoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View file by UUID
     * </pre>
     */
    public com.scailo.sdk.VaultFile viewFileByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFileByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View file by ID
     * </pre>
     */
    public com.scailo.sdk.VaultFile viewFileByID(com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFileByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View chunk with the given UUID
     * </pre>
     */
    public com.scailo.sdk.VaultFileVersionChunk viewFileChunk(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFileChunkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View chunk metadata
     * </pre>
     */
    public com.scailo.sdk.VaultFileVersionChunk viewFileChunkMetadata(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFileChunkMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View permission for file
     * </pre>
     */
    public com.scailo.sdk.VaultPermission viewFilePermission(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFilePermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if file already exists
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse doesFileExist(com.scailo.sdk.VaultDuplicateCheckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoesFileExistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all versions of file
     * </pre>
     */
    public com.scailo.sdk.VaultFileVersionsList viewFileVersions(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFileVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View access logs of file
     * </pre>
     */
    public com.scailo.sdk.VaultAccessLogsList viewFileAccessLogs(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFileAccessLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add folder
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID addFolder(com.scailo.sdk.VaultFolderAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move folder
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID moveFolder(com.scailo.sdk.VaultFolderMoveFolderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rename folder
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID renameFolder(com.scailo.sdk.VaultFolderRenameFolderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete folder
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID deleteFolder(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Zip folder and returns the UUID of the vault folder download
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID zipFolder(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZipFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Permission APIs
     * Add permission and returns the UUID of the added permission
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID addFolderPermission(com.scailo.sdk.VaultPermissionAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFolderPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modify permission and returns the UUID of the modified permission
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID modifyFolderPermission(com.scailo.sdk.VaultPermissionModifyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyFolderPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete permission (returns the UUID of the folder)
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID deleteFolderPermission(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFolderPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View folder by ID
     * </pre>
     */
    public com.scailo.sdk.VaultFolder viewFolderByID(com.scailo.sdk.IdentifierZeroable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFolderByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View folder by UUID
     * </pre>
     */
    public com.scailo.sdk.VaultFolder viewFolderByUUID(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFolderByUUIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the status of the folder download
     * </pre>
     */
    public com.scailo.sdk.VaultFolderDownload viewFolderDownloadStatus(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFolderDownloadStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download the vault folder
     * </pre>
     */
    public com.scailo.sdk.StandardFile downloadFolder(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all files accessible by self in the given folder
     * </pre>
     */
    public com.scailo.sdk.VaultFilesList viewAccessibleFilesInFolder(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAccessibleFilesInFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all folders accessible by self in the given folder
     * </pre>
     */
    public com.scailo.sdk.VaultFoldersList viewAccessibleFoldersInFolder(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAccessibleFoldersInFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all the resources accessible by self in the given folder
     * </pre>
     */
    public com.scailo.sdk.VaultResourcesList viewAccessibleResourcesInFolder(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAccessibleResourcesInFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View permission for folder
     * </pre>
     */
    public com.scailo.sdk.VaultPermission viewFolderPermission(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFolderPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if folder already exists
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse doesFolderExist(com.scailo.sdk.VaultDuplicateCheckReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoesFolderExistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View access logs of folder
     * </pre>
     */
    public com.scailo.sdk.VaultAccessLogsList viewFolderAccessLogs(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewFolderAccessLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View passthrough roles for folder
     * </pre>
     */
    public com.scailo.sdk.RolesList viewPassthroughRolesForFolder(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewPassthroughRolesForFolderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search for files and folders
     * </pre>
     */
    public com.scailo.sdk.VaultSearchResponsesList search(com.scailo.sdk.VaultSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Setup GiX app
     * </pre>
     */
    public com.scailo.sdk.GiXAppRun setupGiX(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetupGiXMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Relay a DELETE API
     * </pre>
     */
    public com.scailo.sdk.GiXRelayResponse giXRelayDELETE(com.scailo.sdk.GiXRelayReqWithoutBody request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGiXRelayDELETEMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Relay a GET API
     * </pre>
     */
    public com.scailo.sdk.GiXRelayResponse giXRelayGET(com.scailo.sdk.GiXRelayReqWithoutBody request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGiXRelayGETMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Relay a HEAD API
     * </pre>
     */
    public com.scailo.sdk.GiXRelayResponse giXRelayHEAD(com.scailo.sdk.GiXRelayReqWithoutBody request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGiXRelayHEADMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Relay a PATCH API
     * </pre>
     */
    public com.scailo.sdk.GiXRelayResponse giXRelayPATCH(com.scailo.sdk.GiXRelayReqWithBody request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGiXRelayPATCHMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Relay a POST API
     * </pre>
     */
    public com.scailo.sdk.GiXRelayResponse giXRelayPOST(com.scailo.sdk.GiXRelayReqWithBody request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGiXRelayPOSTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Relay a PUT API
     * </pre>
     */
    public com.scailo.sdk.GiXRelayResponse giXRelayPUT(com.scailo.sdk.GiXRelayReqWithBody request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGiXRelayPUTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all runs that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.GiXAppRunsList giXFilter(com.scailo.sdk.GiXAppRunFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGiXFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all runs that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse giXCount(com.scailo.sdk.GiXAppRunCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGiXCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reconfigures the enclave (redeploys the enclave)
     * </pre>
     */
    public com.scailo.sdk.IdentifierUUID reconfigureEnclave(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReconfigureEnclaveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Setup Enclave Ingress
     * </pre>
     */
    public com.scailo.sdk.EnclaveIngress setupEnclaveIngress(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetupEnclaveIngressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all enclave ingresses that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.EnclaveIngressesList filterEnclaveIngresses(com.scailo.sdk.EnclaveIngressFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterEnclaveIngressesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count all enclave ingresses that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.CountResponse countEnclaveIngresses(com.scailo.sdk.EnclaveIngressCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountEnclaveIngressesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verifies the enclave ingress and returns the necessary information for subsequent requests
     * </pre>
     */
    public com.scailo.sdk.VerifyEnclaveIngressResponse verifyEnclaveIngress(com.scailo.sdk.VerifyEnclaveIngressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyEnclaveIngressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add environment variable to enclave
     * </pre>
     */
    public com.scailo.sdk.EnclaveEnvironmentVariable addEnclaveEnvironmentVariable(com.scailo.sdk.EnclaveEnvironmentVariableAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEnclaveEnvironmentVariableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update environment variable in enclave
     * </pre>
     */
    public com.scailo.sdk.EnclaveEnvironmentVariable updateEnclaveEnvironmentVariable(com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnclaveEnvironmentVariableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete environment variable in enclave
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteEnclaveEnvironmentVariable(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEnclaveEnvironmentVariableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View environment variable in enclave represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.EnclaveEnvironmentVariable viewEnclaveEnvironmentVariable(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEnclaveEnvironmentVariableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all environment variables in enclave for the enclave represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.EnclaveEnvironmentVariablesList viewAllEnclaveEnvironmentVariables(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllEnclaveEnvironmentVariablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add domain to enclave
     * </pre>
     */
    public com.scailo.sdk.EnclaveDomain addEnclaveDomain(com.scailo.sdk.EnclaveDomainAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEnclaveDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete domain from enclave
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteEnclaveDomain(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEnclaveDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View domain for enclave represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.EnclaveDomain viewEnclaveDomain(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEnclaveDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View all domains for enclave for the enclave represented by the Identifier
     * </pre>
     */
    public com.scailo.sdk.EnclaveDomainsList viewAllEnclaveDomains(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewAllEnclaveDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the default domain suffix that could be used for creating a new domain
     * </pre>
     */
    public com.scailo.sdk.EnclaveDomainSuffixResp viewDomainSuffix(com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewDomainSuffixMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Filter all domains that match the given filter criteria
     * </pre>
     */
    public com.scailo.sdk.EnclaveDomainsList filterEnclaveDomains(com.scailo.sdk.EnclaveDomainsFilterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterEnclaveDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds an enclave as a dashboard frame. The file needs to be an enclave. Returns an error otherwise
     * </pre>
     */
    public com.scailo.sdk.EnclaveFrame addEnclaveFrame(com.scailo.sdk.EnclaveFrameAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEnclaveFrameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View the properties of a frame
     * </pre>
     */
    public com.scailo.sdk.EnclaveFrame viewEnclaveFrame(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewEnclaveFrameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the properties of a frame
     * </pre>
     */
    public com.scailo.sdk.EnclaveFrame updateEnclaveFrame(com.scailo.sdk.EnclaveFrameUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnclaveFrameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete the dashboard frame
     * </pre>
     */
    public com.scailo.sdk.IdentifierResponse deleteEnclaveFrame(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEnclaveFrameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the endpoint that could be used to render a frame
     * </pre>
     */
    public com.scailo.sdk.EnclaveFrameSetup setupEnclaveFrame(com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetupEnclaveFrameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all the endpoints that could be used to render frames for the identified user. This can be primary used to render all the frames on a user's dashboard, for example.
     * </pre>
     */
    public com.scailo.sdk.EnclaveFrameSetupList setupAllEnclaveFrames(com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetupAllEnclaveFramesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VaultService.
   * <pre>
   *Describes the available services in Vault
   * </pre>
   */
  public static final class VaultServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VaultServiceFutureStub> {
    private VaultServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VaultServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VaultServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initiate file upload
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFileInitiateFileResponse> initiateFile(
        com.scailo.sdk.VaultFileInitiateFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitiateFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add chunk to a file version and returns the UUID of the added chunk
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> addFileChunk(
        com.scailo.sdk.VaultFileAddChunkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFileChunkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Complete file upload
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> completeFile(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rename file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> renameFile(
        com.scailo.sdk.VaultFileRenameFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unzip file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> unzipFile(
        com.scailo.sdk.VaultFileUnzipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnzipFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Persist file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> persistFile(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPersistFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> moveFile(
        com.scailo.sdk.VaultFileMoveFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> deleteFile(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Permission APIs
     * Add permission and returns the UUID of the added permission
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> addFilePermission(
        com.scailo.sdk.VaultPermissionAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFilePermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify permission and returns the UUID of the added permission
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> modifyFilePermission(
        com.scailo.sdk.VaultPermissionModifyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyFilePermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete permission (returns the UUID of the file)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> deleteFilePermission(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFilePermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Downloads
     * Download file with the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadFile(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download file version with the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadFileVersion(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadFileVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View logo
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> viewFileLogo(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFileLogoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View file by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFile> viewFileByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFileByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View file by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFile> viewFileByID(
        com.scailo.sdk.Identifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFileByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View chunk with the given UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFileVersionChunk> viewFileChunk(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFileChunkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View chunk metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFileVersionChunk> viewFileChunkMetadata(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFileChunkMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View permission for file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultPermission> viewFilePermission(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFilePermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if file already exists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> doesFileExist(
        com.scailo.sdk.VaultDuplicateCheckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoesFileExistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all versions of file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFileVersionsList> viewFileVersions(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFileVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View access logs of file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultAccessLogsList> viewFileAccessLogs(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFileAccessLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> addFolder(
        com.scailo.sdk.VaultFolderAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> moveFolder(
        com.scailo.sdk.VaultFolderMoveFolderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rename folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> renameFolder(
        com.scailo.sdk.VaultFolderRenameFolderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> deleteFolder(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Zip folder and returns the UUID of the vault folder download
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> zipFolder(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZipFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Permission APIs
     * Add permission and returns the UUID of the added permission
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> addFolderPermission(
        com.scailo.sdk.VaultPermissionAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFolderPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modify permission and returns the UUID of the modified permission
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> modifyFolderPermission(
        com.scailo.sdk.VaultPermissionModifyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyFolderPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete permission (returns the UUID of the folder)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> deleteFolderPermission(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFolderPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View folder by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFolder> viewFolderByID(
        com.scailo.sdk.IdentifierZeroable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFolderByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View folder by UUID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFolder> viewFolderByUUID(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFolderByUUIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the status of the folder download
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFolderDownload> viewFolderDownloadStatus(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFolderDownloadStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download the vault folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.StandardFile> downloadFolder(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all files accessible by self in the given folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFilesList> viewAccessibleFilesInFolder(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAccessibleFilesInFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all folders accessible by self in the given folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultFoldersList> viewAccessibleFoldersInFolder(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAccessibleFoldersInFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all the resources accessible by self in the given folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultResourcesList> viewAccessibleResourcesInFolder(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAccessibleResourcesInFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View permission for folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultPermission> viewFolderPermission(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFolderPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if folder already exists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> doesFolderExist(
        com.scailo.sdk.VaultDuplicateCheckReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoesFolderExistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View access logs of folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultAccessLogsList> viewFolderAccessLogs(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewFolderAccessLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View passthrough roles for folder
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.RolesList> viewPassthroughRolesForFolder(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewPassthroughRolesForFolderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search for files and folders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VaultSearchResponsesList> search(
        com.scailo.sdk.VaultSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Setup GiX app
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GiXAppRun> setupGiX(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetupGiXMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Relay a DELETE API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GiXRelayResponse> giXRelayDELETE(
        com.scailo.sdk.GiXRelayReqWithoutBody request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGiXRelayDELETEMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Relay a GET API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GiXRelayResponse> giXRelayGET(
        com.scailo.sdk.GiXRelayReqWithoutBody request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGiXRelayGETMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Relay a HEAD API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GiXRelayResponse> giXRelayHEAD(
        com.scailo.sdk.GiXRelayReqWithoutBody request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGiXRelayHEADMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Relay a PATCH API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GiXRelayResponse> giXRelayPATCH(
        com.scailo.sdk.GiXRelayReqWithBody request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGiXRelayPATCHMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Relay a POST API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GiXRelayResponse> giXRelayPOST(
        com.scailo.sdk.GiXRelayReqWithBody request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGiXRelayPOSTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Relay a PUT API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GiXRelayResponse> giXRelayPUT(
        com.scailo.sdk.GiXRelayReqWithBody request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGiXRelayPUTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all runs that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.GiXAppRunsList> giXFilter(
        com.scailo.sdk.GiXAppRunFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGiXFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all runs that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> giXCount(
        com.scailo.sdk.GiXAppRunCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGiXCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reconfigures the enclave (redeploys the enclave)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierUUID> reconfigureEnclave(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReconfigureEnclaveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Setup Enclave Ingress
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveIngress> setupEnclaveIngress(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetupEnclaveIngressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all enclave ingresses that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveIngressesList> filterEnclaveIngresses(
        com.scailo.sdk.EnclaveIngressFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterEnclaveIngressesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count all enclave ingresses that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.CountResponse> countEnclaveIngresses(
        com.scailo.sdk.EnclaveIngressCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountEnclaveIngressesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Verifies the enclave ingress and returns the necessary information for subsequent requests
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VerifyEnclaveIngressResponse> verifyEnclaveIngress(
        com.scailo.sdk.VerifyEnclaveIngressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyEnclaveIngressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add environment variable to enclave
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveEnvironmentVariable> addEnclaveEnvironmentVariable(
        com.scailo.sdk.EnclaveEnvironmentVariableAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEnclaveEnvironmentVariableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update environment variable in enclave
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveEnvironmentVariable> updateEnclaveEnvironmentVariable(
        com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnclaveEnvironmentVariableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete environment variable in enclave
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteEnclaveEnvironmentVariable(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEnclaveEnvironmentVariableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View environment variable in enclave represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveEnvironmentVariable> viewEnclaveEnvironmentVariable(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEnclaveEnvironmentVariableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all environment variables in enclave for the enclave represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveEnvironmentVariablesList> viewAllEnclaveEnvironmentVariables(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllEnclaveEnvironmentVariablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add domain to enclave
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveDomain> addEnclaveDomain(
        com.scailo.sdk.EnclaveDomainAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEnclaveDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete domain from enclave
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteEnclaveDomain(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEnclaveDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View domain for enclave represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveDomain> viewEnclaveDomain(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEnclaveDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View all domains for enclave for the enclave represented by the Identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveDomainsList> viewAllEnclaveDomains(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewAllEnclaveDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the default domain suffix that could be used for creating a new domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveDomainSuffixResp> viewDomainSuffix(
        com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewDomainSuffixMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Filter all domains that match the given filter criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveDomainsList> filterEnclaveDomains(
        com.scailo.sdk.EnclaveDomainsFilterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterEnclaveDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds an enclave as a dashboard frame. The file needs to be an enclave. Returns an error otherwise
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveFrame> addEnclaveFrame(
        com.scailo.sdk.EnclaveFrameAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEnclaveFrameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View the properties of a frame
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveFrame> viewEnclaveFrame(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewEnclaveFrameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the properties of a frame
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveFrame> updateEnclaveFrame(
        com.scailo.sdk.EnclaveFrameUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnclaveFrameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete the dashboard frame
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.IdentifierResponse> deleteEnclaveFrame(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEnclaveFrameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the endpoint that could be used to render a frame
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveFrameSetup> setupEnclaveFrame(
        com.scailo.sdk.IdentifierUUID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetupEnclaveFrameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all the endpoints that could be used to render frames for the identified user. This can be primary used to render all the frames on a user's dashboard, for example.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.EnclaveFrameSetupList> setupAllEnclaveFrames(
        com.scailo.sdk.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetupAllEnclaveFramesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIATE_FILE = 0;
  private static final int METHODID_ADD_FILE_CHUNK = 1;
  private static final int METHODID_COMPLETE_FILE = 2;
  private static final int METHODID_RENAME_FILE = 3;
  private static final int METHODID_UNZIP_FILE = 4;
  private static final int METHODID_PERSIST_FILE = 5;
  private static final int METHODID_MOVE_FILE = 6;
  private static final int METHODID_DELETE_FILE = 7;
  private static final int METHODID_ADD_FILE_PERMISSION = 8;
  private static final int METHODID_MODIFY_FILE_PERMISSION = 9;
  private static final int METHODID_DELETE_FILE_PERMISSION = 10;
  private static final int METHODID_DOWNLOAD_FILE = 11;
  private static final int METHODID_DOWNLOAD_FILE_VERSION = 12;
  private static final int METHODID_VIEW_FILE_LOGO = 13;
  private static final int METHODID_VIEW_FILE_BY_UUID = 14;
  private static final int METHODID_VIEW_FILE_BY_ID = 15;
  private static final int METHODID_VIEW_FILE_CHUNK = 16;
  private static final int METHODID_VIEW_FILE_CHUNK_METADATA = 17;
  private static final int METHODID_VIEW_FILE_PERMISSION = 18;
  private static final int METHODID_DOES_FILE_EXIST = 19;
  private static final int METHODID_VIEW_FILE_VERSIONS = 20;
  private static final int METHODID_VIEW_FILE_ACCESS_LOGS = 21;
  private static final int METHODID_ADD_FOLDER = 22;
  private static final int METHODID_MOVE_FOLDER = 23;
  private static final int METHODID_RENAME_FOLDER = 24;
  private static final int METHODID_DELETE_FOLDER = 25;
  private static final int METHODID_ZIP_FOLDER = 26;
  private static final int METHODID_ADD_FOLDER_PERMISSION = 27;
  private static final int METHODID_MODIFY_FOLDER_PERMISSION = 28;
  private static final int METHODID_DELETE_FOLDER_PERMISSION = 29;
  private static final int METHODID_VIEW_FOLDER_BY_ID = 30;
  private static final int METHODID_VIEW_FOLDER_BY_UUID = 31;
  private static final int METHODID_VIEW_FOLDER_DOWNLOAD_STATUS = 32;
  private static final int METHODID_DOWNLOAD_FOLDER = 33;
  private static final int METHODID_VIEW_ACCESSIBLE_FILES_IN_FOLDER = 34;
  private static final int METHODID_VIEW_ACCESSIBLE_FOLDERS_IN_FOLDER = 35;
  private static final int METHODID_VIEW_ACCESSIBLE_RESOURCES_IN_FOLDER = 36;
  private static final int METHODID_VIEW_FOLDER_PERMISSION = 37;
  private static final int METHODID_DOES_FOLDER_EXIST = 38;
  private static final int METHODID_VIEW_FOLDER_ACCESS_LOGS = 39;
  private static final int METHODID_VIEW_PASSTHROUGH_ROLES_FOR_FOLDER = 40;
  private static final int METHODID_SEARCH = 41;
  private static final int METHODID_SETUP_GI_X = 42;
  private static final int METHODID_GI_XRELAY_DELETE = 43;
  private static final int METHODID_GI_XRELAY_GET = 44;
  private static final int METHODID_GI_XRELAY_HEAD = 45;
  private static final int METHODID_GI_XRELAY_PATCH = 46;
  private static final int METHODID_GI_XRELAY_POST = 47;
  private static final int METHODID_GI_XRELAY_PUT = 48;
  private static final int METHODID_GI_XFILTER = 49;
  private static final int METHODID_GI_XCOUNT = 50;
  private static final int METHODID_RECONFIGURE_ENCLAVE = 51;
  private static final int METHODID_SETUP_ENCLAVE_INGRESS = 52;
  private static final int METHODID_FILTER_ENCLAVE_INGRESSES = 53;
  private static final int METHODID_COUNT_ENCLAVE_INGRESSES = 54;
  private static final int METHODID_VERIFY_ENCLAVE_INGRESS = 55;
  private static final int METHODID_ADD_ENCLAVE_ENVIRONMENT_VARIABLE = 56;
  private static final int METHODID_UPDATE_ENCLAVE_ENVIRONMENT_VARIABLE = 57;
  private static final int METHODID_DELETE_ENCLAVE_ENVIRONMENT_VARIABLE = 58;
  private static final int METHODID_VIEW_ENCLAVE_ENVIRONMENT_VARIABLE = 59;
  private static final int METHODID_VIEW_ALL_ENCLAVE_ENVIRONMENT_VARIABLES = 60;
  private static final int METHODID_ADD_ENCLAVE_DOMAIN = 61;
  private static final int METHODID_DELETE_ENCLAVE_DOMAIN = 62;
  private static final int METHODID_VIEW_ENCLAVE_DOMAIN = 63;
  private static final int METHODID_VIEW_ALL_ENCLAVE_DOMAINS = 64;
  private static final int METHODID_VIEW_DOMAIN_SUFFIX = 65;
  private static final int METHODID_FILTER_ENCLAVE_DOMAINS = 66;
  private static final int METHODID_ADD_ENCLAVE_FRAME = 67;
  private static final int METHODID_VIEW_ENCLAVE_FRAME = 68;
  private static final int METHODID_UPDATE_ENCLAVE_FRAME = 69;
  private static final int METHODID_DELETE_ENCLAVE_FRAME = 70;
  private static final int METHODID_SETUP_ENCLAVE_FRAME = 71;
  private static final int METHODID_SETUP_ALL_ENCLAVE_FRAMES = 72;

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
        case METHODID_INITIATE_FILE:
          serviceImpl.initiateFile((com.scailo.sdk.VaultFileInitiateFileRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileInitiateFileResponse>) responseObserver);
          break;
        case METHODID_ADD_FILE_CHUNK:
          serviceImpl.addFileChunk((com.scailo.sdk.VaultFileAddChunkRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_COMPLETE_FILE:
          serviceImpl.completeFile((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_RENAME_FILE:
          serviceImpl.renameFile((com.scailo.sdk.VaultFileRenameFileRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_UNZIP_FILE:
          serviceImpl.unzipFile((com.scailo.sdk.VaultFileUnzipRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_PERSIST_FILE:
          serviceImpl.persistFile((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_MOVE_FILE:
          serviceImpl.moveFile((com.scailo.sdk.VaultFileMoveFileRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_DELETE_FILE:
          serviceImpl.deleteFile((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_ADD_FILE_PERMISSION:
          serviceImpl.addFilePermission((com.scailo.sdk.VaultPermissionAddRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_MODIFY_FILE_PERMISSION:
          serviceImpl.modifyFilePermission((com.scailo.sdk.VaultPermissionModifyRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_DELETE_FILE_PERMISSION:
          serviceImpl.deleteFilePermission((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_DOWNLOAD_FILE:
          serviceImpl.downloadFile((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_DOWNLOAD_FILE_VERSION:
          serviceImpl.downloadFileVersion((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_VIEW_FILE_LOGO:
          serviceImpl.viewFileLogo((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_VIEW_FILE_BY_UUID:
          serviceImpl.viewFileByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFile>) responseObserver);
          break;
        case METHODID_VIEW_FILE_BY_ID:
          serviceImpl.viewFileByID((com.scailo.sdk.Identifier) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFile>) responseObserver);
          break;
        case METHODID_VIEW_FILE_CHUNK:
          serviceImpl.viewFileChunk((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileVersionChunk>) responseObserver);
          break;
        case METHODID_VIEW_FILE_CHUNK_METADATA:
          serviceImpl.viewFileChunkMetadata((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileVersionChunk>) responseObserver);
          break;
        case METHODID_VIEW_FILE_PERMISSION:
          serviceImpl.viewFilePermission((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultPermission>) responseObserver);
          break;
        case METHODID_DOES_FILE_EXIST:
          serviceImpl.doesFileExist((com.scailo.sdk.VaultDuplicateCheckReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_VIEW_FILE_VERSIONS:
          serviceImpl.viewFileVersions((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFileVersionsList>) responseObserver);
          break;
        case METHODID_VIEW_FILE_ACCESS_LOGS:
          serviceImpl.viewFileAccessLogs((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultAccessLogsList>) responseObserver);
          break;
        case METHODID_ADD_FOLDER:
          serviceImpl.addFolder((com.scailo.sdk.VaultFolderAddRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_MOVE_FOLDER:
          serviceImpl.moveFolder((com.scailo.sdk.VaultFolderMoveFolderRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_RENAME_FOLDER:
          serviceImpl.renameFolder((com.scailo.sdk.VaultFolderRenameFolderRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_DELETE_FOLDER:
          serviceImpl.deleteFolder((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_ZIP_FOLDER:
          serviceImpl.zipFolder((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_ADD_FOLDER_PERMISSION:
          serviceImpl.addFolderPermission((com.scailo.sdk.VaultPermissionAddRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_MODIFY_FOLDER_PERMISSION:
          serviceImpl.modifyFolderPermission((com.scailo.sdk.VaultPermissionModifyRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_DELETE_FOLDER_PERMISSION:
          serviceImpl.deleteFolderPermission((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_VIEW_FOLDER_BY_ID:
          serviceImpl.viewFolderByID((com.scailo.sdk.IdentifierZeroable) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFolder>) responseObserver);
          break;
        case METHODID_VIEW_FOLDER_BY_UUID:
          serviceImpl.viewFolderByUUID((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFolder>) responseObserver);
          break;
        case METHODID_VIEW_FOLDER_DOWNLOAD_STATUS:
          serviceImpl.viewFolderDownloadStatus((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFolderDownload>) responseObserver);
          break;
        case METHODID_DOWNLOAD_FOLDER:
          serviceImpl.downloadFolder((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.StandardFile>) responseObserver);
          break;
        case METHODID_VIEW_ACCESSIBLE_FILES_IN_FOLDER:
          serviceImpl.viewAccessibleFilesInFolder((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFilesList>) responseObserver);
          break;
        case METHODID_VIEW_ACCESSIBLE_FOLDERS_IN_FOLDER:
          serviceImpl.viewAccessibleFoldersInFolder((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultFoldersList>) responseObserver);
          break;
        case METHODID_VIEW_ACCESSIBLE_RESOURCES_IN_FOLDER:
          serviceImpl.viewAccessibleResourcesInFolder((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultResourcesList>) responseObserver);
          break;
        case METHODID_VIEW_FOLDER_PERMISSION:
          serviceImpl.viewFolderPermission((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultPermission>) responseObserver);
          break;
        case METHODID_DOES_FOLDER_EXIST:
          serviceImpl.doesFolderExist((com.scailo.sdk.VaultDuplicateCheckReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_VIEW_FOLDER_ACCESS_LOGS:
          serviceImpl.viewFolderAccessLogs((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultAccessLogsList>) responseObserver);
          break;
        case METHODID_VIEW_PASSTHROUGH_ROLES_FOR_FOLDER:
          serviceImpl.viewPassthroughRolesForFolder((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.RolesList>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.scailo.sdk.VaultSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VaultSearchResponsesList>) responseObserver);
          break;
        case METHODID_SETUP_GI_X:
          serviceImpl.setupGiX((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GiXAppRun>) responseObserver);
          break;
        case METHODID_GI_XRELAY_DELETE:
          serviceImpl.giXRelayDELETE((com.scailo.sdk.GiXRelayReqWithoutBody) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse>) responseObserver);
          break;
        case METHODID_GI_XRELAY_GET:
          serviceImpl.giXRelayGET((com.scailo.sdk.GiXRelayReqWithoutBody) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse>) responseObserver);
          break;
        case METHODID_GI_XRELAY_HEAD:
          serviceImpl.giXRelayHEAD((com.scailo.sdk.GiXRelayReqWithoutBody) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse>) responseObserver);
          break;
        case METHODID_GI_XRELAY_PATCH:
          serviceImpl.giXRelayPATCH((com.scailo.sdk.GiXRelayReqWithBody) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse>) responseObserver);
          break;
        case METHODID_GI_XRELAY_POST:
          serviceImpl.giXRelayPOST((com.scailo.sdk.GiXRelayReqWithBody) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse>) responseObserver);
          break;
        case METHODID_GI_XRELAY_PUT:
          serviceImpl.giXRelayPUT((com.scailo.sdk.GiXRelayReqWithBody) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GiXRelayResponse>) responseObserver);
          break;
        case METHODID_GI_XFILTER:
          serviceImpl.giXFilter((com.scailo.sdk.GiXAppRunFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.GiXAppRunsList>) responseObserver);
          break;
        case METHODID_GI_XCOUNT:
          serviceImpl.giXCount((com.scailo.sdk.GiXAppRunCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_RECONFIGURE_ENCLAVE:
          serviceImpl.reconfigureEnclave((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierUUID>) responseObserver);
          break;
        case METHODID_SETUP_ENCLAVE_INGRESS:
          serviceImpl.setupEnclaveIngress((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveIngress>) responseObserver);
          break;
        case METHODID_FILTER_ENCLAVE_INGRESSES:
          serviceImpl.filterEnclaveIngresses((com.scailo.sdk.EnclaveIngressFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveIngressesList>) responseObserver);
          break;
        case METHODID_COUNT_ENCLAVE_INGRESSES:
          serviceImpl.countEnclaveIngresses((com.scailo.sdk.EnclaveIngressCountReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.CountResponse>) responseObserver);
          break;
        case METHODID_VERIFY_ENCLAVE_INGRESS:
          serviceImpl.verifyEnclaveIngress((com.scailo.sdk.VerifyEnclaveIngressRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VerifyEnclaveIngressResponse>) responseObserver);
          break;
        case METHODID_ADD_ENCLAVE_ENVIRONMENT_VARIABLE:
          serviceImpl.addEnclaveEnvironmentVariable((com.scailo.sdk.EnclaveEnvironmentVariableAddRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariable>) responseObserver);
          break;
        case METHODID_UPDATE_ENCLAVE_ENVIRONMENT_VARIABLE:
          serviceImpl.updateEnclaveEnvironmentVariable((com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariable>) responseObserver);
          break;
        case METHODID_DELETE_ENCLAVE_ENVIRONMENT_VARIABLE:
          serviceImpl.deleteEnclaveEnvironmentVariable((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_ENCLAVE_ENVIRONMENT_VARIABLE:
          serviceImpl.viewEnclaveEnvironmentVariable((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariable>) responseObserver);
          break;
        case METHODID_VIEW_ALL_ENCLAVE_ENVIRONMENT_VARIABLES:
          serviceImpl.viewAllEnclaveEnvironmentVariables((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveEnvironmentVariablesList>) responseObserver);
          break;
        case METHODID_ADD_ENCLAVE_DOMAIN:
          serviceImpl.addEnclaveDomain((com.scailo.sdk.EnclaveDomainAddRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomain>) responseObserver);
          break;
        case METHODID_DELETE_ENCLAVE_DOMAIN:
          serviceImpl.deleteEnclaveDomain((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_VIEW_ENCLAVE_DOMAIN:
          serviceImpl.viewEnclaveDomain((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomain>) responseObserver);
          break;
        case METHODID_VIEW_ALL_ENCLAVE_DOMAINS:
          serviceImpl.viewAllEnclaveDomains((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomainsList>) responseObserver);
          break;
        case METHODID_VIEW_DOMAIN_SUFFIX:
          serviceImpl.viewDomainSuffix((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomainSuffixResp>) responseObserver);
          break;
        case METHODID_FILTER_ENCLAVE_DOMAINS:
          serviceImpl.filterEnclaveDomains((com.scailo.sdk.EnclaveDomainsFilterReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveDomainsList>) responseObserver);
          break;
        case METHODID_ADD_ENCLAVE_FRAME:
          serviceImpl.addEnclaveFrame((com.scailo.sdk.EnclaveFrameAddRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrame>) responseObserver);
          break;
        case METHODID_VIEW_ENCLAVE_FRAME:
          serviceImpl.viewEnclaveFrame((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrame>) responseObserver);
          break;
        case METHODID_UPDATE_ENCLAVE_FRAME:
          serviceImpl.updateEnclaveFrame((com.scailo.sdk.EnclaveFrameUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrame>) responseObserver);
          break;
        case METHODID_DELETE_ENCLAVE_FRAME:
          serviceImpl.deleteEnclaveFrame((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.IdentifierResponse>) responseObserver);
          break;
        case METHODID_SETUP_ENCLAVE_FRAME:
          serviceImpl.setupEnclaveFrame((com.scailo.sdk.IdentifierUUID) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrameSetup>) responseObserver);
          break;
        case METHODID_SETUP_ALL_ENCLAVE_FRAMES:
          serviceImpl.setupAllEnclaveFrames((com.scailo.sdk.Empty) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.EnclaveFrameSetupList>) responseObserver);
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
          getInitiateFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultFileInitiateFileRequest,
              com.scailo.sdk.VaultFileInitiateFileResponse>(
                service, METHODID_INITIATE_FILE)))
        .addMethod(
          getAddFileChunkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultFileAddChunkRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_ADD_FILE_CHUNK)))
        .addMethod(
          getCompleteFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_COMPLETE_FILE)))
        .addMethod(
          getRenameFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultFileRenameFileRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_RENAME_FILE)))
        .addMethod(
          getUnzipFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultFileUnzipRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_UNZIP_FILE)))
        .addMethod(
          getPersistFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_PERSIST_FILE)))
        .addMethod(
          getMoveFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultFileMoveFileRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_MOVE_FILE)))
        .addMethod(
          getDeleteFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_DELETE_FILE)))
        .addMethod(
          getAddFilePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultPermissionAddRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_ADD_FILE_PERMISSION)))
        .addMethod(
          getModifyFilePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultPermissionModifyRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_MODIFY_FILE_PERMISSION)))
        .addMethod(
          getDeleteFilePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_DELETE_FILE_PERMISSION)))
        .addMethod(
          getDownloadFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_FILE)))
        .addMethod(
          getDownloadFileVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_FILE_VERSION)))
        .addMethod(
          getViewFileLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_VIEW_FILE_LOGO)))
        .addMethod(
          getViewFileByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultFile>(
                service, METHODID_VIEW_FILE_BY_UUID)))
        .addMethod(
          getViewFileByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Identifier,
              com.scailo.sdk.VaultFile>(
                service, METHODID_VIEW_FILE_BY_ID)))
        .addMethod(
          getViewFileChunkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultFileVersionChunk>(
                service, METHODID_VIEW_FILE_CHUNK)))
        .addMethod(
          getViewFileChunkMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultFileVersionChunk>(
                service, METHODID_VIEW_FILE_CHUNK_METADATA)))
        .addMethod(
          getViewFilePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultPermission>(
                service, METHODID_VIEW_FILE_PERMISSION)))
        .addMethod(
          getDoesFileExistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultDuplicateCheckReq,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_DOES_FILE_EXIST)))
        .addMethod(
          getViewFileVersionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultFileVersionsList>(
                service, METHODID_VIEW_FILE_VERSIONS)))
        .addMethod(
          getViewFileAccessLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultAccessLogsList>(
                service, METHODID_VIEW_FILE_ACCESS_LOGS)))
        .addMethod(
          getAddFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultFolderAddRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_ADD_FOLDER)))
        .addMethod(
          getMoveFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultFolderMoveFolderRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_MOVE_FOLDER)))
        .addMethod(
          getRenameFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultFolderRenameFolderRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_RENAME_FOLDER)))
        .addMethod(
          getDeleteFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_DELETE_FOLDER)))
        .addMethod(
          getZipFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_ZIP_FOLDER)))
        .addMethod(
          getAddFolderPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultPermissionAddRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_ADD_FOLDER_PERMISSION)))
        .addMethod(
          getModifyFolderPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultPermissionModifyRequest,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_MODIFY_FOLDER_PERMISSION)))
        .addMethod(
          getDeleteFolderPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_DELETE_FOLDER_PERMISSION)))
        .addMethod(
          getViewFolderByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierZeroable,
              com.scailo.sdk.VaultFolder>(
                service, METHODID_VIEW_FOLDER_BY_ID)))
        .addMethod(
          getViewFolderByUUIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultFolder>(
                service, METHODID_VIEW_FOLDER_BY_UUID)))
        .addMethod(
          getViewFolderDownloadStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultFolderDownload>(
                service, METHODID_VIEW_FOLDER_DOWNLOAD_STATUS)))
        .addMethod(
          getDownloadFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.StandardFile>(
                service, METHODID_DOWNLOAD_FOLDER)))
        .addMethod(
          getViewAccessibleFilesInFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultFilesList>(
                service, METHODID_VIEW_ACCESSIBLE_FILES_IN_FOLDER)))
        .addMethod(
          getViewAccessibleFoldersInFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultFoldersList>(
                service, METHODID_VIEW_ACCESSIBLE_FOLDERS_IN_FOLDER)))
        .addMethod(
          getViewAccessibleResourcesInFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultResourcesList>(
                service, METHODID_VIEW_ACCESSIBLE_RESOURCES_IN_FOLDER)))
        .addMethod(
          getViewFolderPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultPermission>(
                service, METHODID_VIEW_FOLDER_PERMISSION)))
        .addMethod(
          getDoesFolderExistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultDuplicateCheckReq,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_DOES_FOLDER_EXIST)))
        .addMethod(
          getViewFolderAccessLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.VaultAccessLogsList>(
                service, METHODID_VIEW_FOLDER_ACCESS_LOGS)))
        .addMethod(
          getViewPassthroughRolesForFolderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.RolesList>(
                service, METHODID_VIEW_PASSTHROUGH_ROLES_FOR_FOLDER)))
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VaultSearchReq,
              com.scailo.sdk.VaultSearchResponsesList>(
                service, METHODID_SEARCH)))
        .addMethod(
          getSetupGiXMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.GiXAppRun>(
                service, METHODID_SETUP_GI_X)))
        .addMethod(
          getGiXRelayDELETEMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GiXRelayReqWithoutBody,
              com.scailo.sdk.GiXRelayResponse>(
                service, METHODID_GI_XRELAY_DELETE)))
        .addMethod(
          getGiXRelayGETMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GiXRelayReqWithoutBody,
              com.scailo.sdk.GiXRelayResponse>(
                service, METHODID_GI_XRELAY_GET)))
        .addMethod(
          getGiXRelayHEADMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GiXRelayReqWithoutBody,
              com.scailo.sdk.GiXRelayResponse>(
                service, METHODID_GI_XRELAY_HEAD)))
        .addMethod(
          getGiXRelayPATCHMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GiXRelayReqWithBody,
              com.scailo.sdk.GiXRelayResponse>(
                service, METHODID_GI_XRELAY_PATCH)))
        .addMethod(
          getGiXRelayPOSTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GiXRelayReqWithBody,
              com.scailo.sdk.GiXRelayResponse>(
                service, METHODID_GI_XRELAY_POST)))
        .addMethod(
          getGiXRelayPUTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GiXRelayReqWithBody,
              com.scailo.sdk.GiXRelayResponse>(
                service, METHODID_GI_XRELAY_PUT)))
        .addMethod(
          getGiXFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GiXAppRunFilterReq,
              com.scailo.sdk.GiXAppRunsList>(
                service, METHODID_GI_XFILTER)))
        .addMethod(
          getGiXCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.GiXAppRunCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_GI_XCOUNT)))
        .addMethod(
          getReconfigureEnclaveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierUUID>(
                service, METHODID_RECONFIGURE_ENCLAVE)))
        .addMethod(
          getSetupEnclaveIngressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.EnclaveIngress>(
                service, METHODID_SETUP_ENCLAVE_INGRESS)))
        .addMethod(
          getFilterEnclaveIngressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.EnclaveIngressFilterReq,
              com.scailo.sdk.EnclaveIngressesList>(
                service, METHODID_FILTER_ENCLAVE_INGRESSES)))
        .addMethod(
          getCountEnclaveIngressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.EnclaveIngressCountReq,
              com.scailo.sdk.CountResponse>(
                service, METHODID_COUNT_ENCLAVE_INGRESSES)))
        .addMethod(
          getVerifyEnclaveIngressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.VerifyEnclaveIngressRequest,
              com.scailo.sdk.VerifyEnclaveIngressResponse>(
                service, METHODID_VERIFY_ENCLAVE_INGRESS)))
        .addMethod(
          getAddEnclaveEnvironmentVariableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.EnclaveEnvironmentVariableAddRequest,
              com.scailo.sdk.EnclaveEnvironmentVariable>(
                service, METHODID_ADD_ENCLAVE_ENVIRONMENT_VARIABLE)))
        .addMethod(
          getUpdateEnclaveEnvironmentVariableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.EnclaveEnvironmentVariableUpdateRequest,
              com.scailo.sdk.EnclaveEnvironmentVariable>(
                service, METHODID_UPDATE_ENCLAVE_ENVIRONMENT_VARIABLE)))
        .addMethod(
          getDeleteEnclaveEnvironmentVariableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_ENCLAVE_ENVIRONMENT_VARIABLE)))
        .addMethod(
          getViewEnclaveEnvironmentVariableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.EnclaveEnvironmentVariable>(
                service, METHODID_VIEW_ENCLAVE_ENVIRONMENT_VARIABLE)))
        .addMethod(
          getViewAllEnclaveEnvironmentVariablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.EnclaveEnvironmentVariablesList>(
                service, METHODID_VIEW_ALL_ENCLAVE_ENVIRONMENT_VARIABLES)))
        .addMethod(
          getAddEnclaveDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.EnclaveDomainAddRequest,
              com.scailo.sdk.EnclaveDomain>(
                service, METHODID_ADD_ENCLAVE_DOMAIN)))
        .addMethod(
          getDeleteEnclaveDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_ENCLAVE_DOMAIN)))
        .addMethod(
          getViewEnclaveDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.EnclaveDomain>(
                service, METHODID_VIEW_ENCLAVE_DOMAIN)))
        .addMethod(
          getViewAllEnclaveDomainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.EnclaveDomainsList>(
                service, METHODID_VIEW_ALL_ENCLAVE_DOMAINS)))
        .addMethod(
          getViewDomainSuffixMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Empty,
              com.scailo.sdk.EnclaveDomainSuffixResp>(
                service, METHODID_VIEW_DOMAIN_SUFFIX)))
        .addMethod(
          getFilterEnclaveDomainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.EnclaveDomainsFilterReq,
              com.scailo.sdk.EnclaveDomainsList>(
                service, METHODID_FILTER_ENCLAVE_DOMAINS)))
        .addMethod(
          getAddEnclaveFrameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.EnclaveFrameAddRequest,
              com.scailo.sdk.EnclaveFrame>(
                service, METHODID_ADD_ENCLAVE_FRAME)))
        .addMethod(
          getViewEnclaveFrameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.EnclaveFrame>(
                service, METHODID_VIEW_ENCLAVE_FRAME)))
        .addMethod(
          getUpdateEnclaveFrameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.EnclaveFrameUpdateRequest,
              com.scailo.sdk.EnclaveFrame>(
                service, METHODID_UPDATE_ENCLAVE_FRAME)))
        .addMethod(
          getDeleteEnclaveFrameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.IdentifierResponse>(
                service, METHODID_DELETE_ENCLAVE_FRAME)))
        .addMethod(
          getSetupEnclaveFrameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.IdentifierUUID,
              com.scailo.sdk.EnclaveFrameSetup>(
                service, METHODID_SETUP_ENCLAVE_FRAME)))
        .addMethod(
          getSetupAllEnclaveFramesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.Empty,
              com.scailo.sdk.EnclaveFrameSetupList>(
                service, METHODID_SETUP_ALL_ENCLAVE_FRAMES)))
        .build();
  }

  private static abstract class VaultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VaultServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.VaultScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VaultService");
    }
  }

  private static final class VaultServiceFileDescriptorSupplier
      extends VaultServiceBaseDescriptorSupplier {
    VaultServiceFileDescriptorSupplier() {}
  }

  private static final class VaultServiceMethodDescriptorSupplier
      extends VaultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VaultServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VaultServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VaultServiceFileDescriptorSupplier())
              .addMethod(getInitiateFileMethod())
              .addMethod(getAddFileChunkMethod())
              .addMethod(getCompleteFileMethod())
              .addMethod(getRenameFileMethod())
              .addMethod(getUnzipFileMethod())
              .addMethod(getPersistFileMethod())
              .addMethod(getMoveFileMethod())
              .addMethod(getDeleteFileMethod())
              .addMethod(getAddFilePermissionMethod())
              .addMethod(getModifyFilePermissionMethod())
              .addMethod(getDeleteFilePermissionMethod())
              .addMethod(getDownloadFileMethod())
              .addMethod(getDownloadFileVersionMethod())
              .addMethod(getViewFileLogoMethod())
              .addMethod(getViewFileByUUIDMethod())
              .addMethod(getViewFileByIDMethod())
              .addMethod(getViewFileChunkMethod())
              .addMethod(getViewFileChunkMetadataMethod())
              .addMethod(getViewFilePermissionMethod())
              .addMethod(getDoesFileExistMethod())
              .addMethod(getViewFileVersionsMethod())
              .addMethod(getViewFileAccessLogsMethod())
              .addMethod(getAddFolderMethod())
              .addMethod(getMoveFolderMethod())
              .addMethod(getRenameFolderMethod())
              .addMethod(getDeleteFolderMethod())
              .addMethod(getZipFolderMethod())
              .addMethod(getAddFolderPermissionMethod())
              .addMethod(getModifyFolderPermissionMethod())
              .addMethod(getDeleteFolderPermissionMethod())
              .addMethod(getViewFolderByIDMethod())
              .addMethod(getViewFolderByUUIDMethod())
              .addMethod(getViewFolderDownloadStatusMethod())
              .addMethod(getDownloadFolderMethod())
              .addMethod(getViewAccessibleFilesInFolderMethod())
              .addMethod(getViewAccessibleFoldersInFolderMethod())
              .addMethod(getViewAccessibleResourcesInFolderMethod())
              .addMethod(getViewFolderPermissionMethod())
              .addMethod(getDoesFolderExistMethod())
              .addMethod(getViewFolderAccessLogsMethod())
              .addMethod(getViewPassthroughRolesForFolderMethod())
              .addMethod(getSearchMethod())
              .addMethod(getSetupGiXMethod())
              .addMethod(getGiXRelayDELETEMethod())
              .addMethod(getGiXRelayGETMethod())
              .addMethod(getGiXRelayHEADMethod())
              .addMethod(getGiXRelayPATCHMethod())
              .addMethod(getGiXRelayPOSTMethod())
              .addMethod(getGiXRelayPUTMethod())
              .addMethod(getGiXFilterMethod())
              .addMethod(getGiXCountMethod())
              .addMethod(getReconfigureEnclaveMethod())
              .addMethod(getSetupEnclaveIngressMethod())
              .addMethod(getFilterEnclaveIngressesMethod())
              .addMethod(getCountEnclaveIngressesMethod())
              .addMethod(getVerifyEnclaveIngressMethod())
              .addMethod(getAddEnclaveEnvironmentVariableMethod())
              .addMethod(getUpdateEnclaveEnvironmentVariableMethod())
              .addMethod(getDeleteEnclaveEnvironmentVariableMethod())
              .addMethod(getViewEnclaveEnvironmentVariableMethod())
              .addMethod(getViewAllEnclaveEnvironmentVariablesMethod())
              .addMethod(getAddEnclaveDomainMethod())
              .addMethod(getDeleteEnclaveDomainMethod())
              .addMethod(getViewEnclaveDomainMethod())
              .addMethod(getViewAllEnclaveDomainsMethod())
              .addMethod(getViewDomainSuffixMethod())
              .addMethod(getFilterEnclaveDomainsMethod())
              .addMethod(getAddEnclaveFrameMethod())
              .addMethod(getViewEnclaveFrameMethod())
              .addMethod(getUpdateEnclaveFrameMethod())
              .addMethod(getDeleteEnclaveFrameMethod())
              .addMethod(getSetupEnclaveFrameMethod())
              .addMethod(getSetupAllEnclaveFramesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
