package com.scailo.sdk

import com.scailo.sdk.VaultServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.VaultService.
 */
public object VaultServiceGrpcKt {
  public const val SERVICE_NAME: String = VaultServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val initiateFileMethod:
      MethodDescriptor<VaultFileInitiateFileRequest, VaultFileInitiateFileResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getInitiateFileMethod()

  public val addFileChunkMethod: MethodDescriptor<VaultFileAddChunkRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getAddFileChunkMethod()

  public val completeFileMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getCompleteFileMethod()

  public val renameFileMethod: MethodDescriptor<VaultFileRenameFileRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getRenameFileMethod()

  public val unzipFileMethod: MethodDescriptor<VaultFileUnzipRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getUnzipFileMethod()

  public val persistFileMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getPersistFileMethod()

  public val moveFileMethod: MethodDescriptor<VaultFileMoveFileRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getMoveFileMethod()

  public val deleteFileMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getDeleteFileMethod()

  public val addFilePermissionMethod: MethodDescriptor<VaultPermissionAddRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getAddFilePermissionMethod()

  public val modifyFilePermissionMethod:
      MethodDescriptor<VaultPermissionModifyRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getModifyFilePermissionMethod()

  public val deleteFilePermissionMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getDeleteFilePermissionMethod()

  public val downloadFileMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = VaultServiceGrpc.getDownloadFileMethod()

  public val downloadFileVersionMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = VaultServiceGrpc.getDownloadFileVersionMethod()

  public val viewFileLogoMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFileLogoMethod()

  public val viewFileByUUIDMethod: MethodDescriptor<IdentifierUUID, VaultFile>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFileByUUIDMethod()

  public val viewFileByIDMethod: MethodDescriptor<Identifier, VaultFile>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFileByIDMethod()

  public val viewFileChunkMethod: MethodDescriptor<IdentifierUUID, VaultFileVersionChunk>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFileChunkMethod()

  public val viewFileChunkMetadataMethod: MethodDescriptor<IdentifierUUID, VaultFileVersionChunk>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFileChunkMetadataMethod()

  public val viewFilePermissionMethod: MethodDescriptor<IdentifierUUID, VaultPermission>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFilePermissionMethod()

  public val doesFileExistMethod: MethodDescriptor<VaultDuplicateCheckReq, BooleanResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getDoesFileExistMethod()

  public val viewFileVersionsMethod: MethodDescriptor<IdentifierUUID, VaultFileVersionsList>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFileVersionsMethod()

  public val viewFileAccessLogsMethod: MethodDescriptor<IdentifierUUID, VaultAccessLogsList>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFileAccessLogsMethod()

  public val addFolderMethod: MethodDescriptor<VaultFolderAddRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getAddFolderMethod()

  public val moveFolderMethod: MethodDescriptor<VaultFolderMoveFolderRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getMoveFolderMethod()

  public val renameFolderMethod: MethodDescriptor<VaultFolderRenameFolderRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getRenameFolderMethod()

  public val deleteFolderMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getDeleteFolderMethod()

  public val zipFolderMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getZipFolderMethod()

  public val addFolderPermissionMethod: MethodDescriptor<VaultPermissionAddRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getAddFolderPermissionMethod()

  public val modifyFolderPermissionMethod:
      MethodDescriptor<VaultPermissionModifyRequest, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getModifyFolderPermissionMethod()

  public val deleteFolderPermissionMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getDeleteFolderPermissionMethod()

  public val viewFolderByIDMethod: MethodDescriptor<IdentifierZeroable, VaultFolder>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFolderByIDMethod()

  public val viewFolderByUUIDMethod: MethodDescriptor<IdentifierUUID, VaultFolder>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFolderByUUIDMethod()

  public val viewFolderDownloadStatusMethod: MethodDescriptor<IdentifierUUID, VaultFolderDownload>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFolderDownloadStatusMethod()

  public val downloadFolderMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = VaultServiceGrpc.getDownloadFolderMethod()

  public val viewAccessibleFilesInFolderMethod: MethodDescriptor<IdentifierUUID, VaultFilesList>
    @JvmStatic
    get() = VaultServiceGrpc.getViewAccessibleFilesInFolderMethod()

  public val viewAccessibleFoldersInFolderMethod: MethodDescriptor<IdentifierUUID, VaultFoldersList>
    @JvmStatic
    get() = VaultServiceGrpc.getViewAccessibleFoldersInFolderMethod()

  public val viewAccessibleResourcesInFolderMethod:
      MethodDescriptor<IdentifierUUID, VaultResourcesList>
    @JvmStatic
    get() = VaultServiceGrpc.getViewAccessibleResourcesInFolderMethod()

  public val viewFolderPermissionMethod: MethodDescriptor<IdentifierUUID, VaultPermission>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFolderPermissionMethod()

  public val doesFolderExistMethod: MethodDescriptor<VaultDuplicateCheckReq, BooleanResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getDoesFolderExistMethod()

  public val viewFolderAccessLogsMethod: MethodDescriptor<IdentifierUUID, VaultAccessLogsList>
    @JvmStatic
    get() = VaultServiceGrpc.getViewFolderAccessLogsMethod()

  public val viewPassthroughRolesForFolderMethod: MethodDescriptor<IdentifierUUID, RolesList>
    @JvmStatic
    get() = VaultServiceGrpc.getViewPassthroughRolesForFolderMethod()

  public val searchMethod: MethodDescriptor<VaultSearchReq, VaultSearchResponsesList>
    @JvmStatic
    get() = VaultServiceGrpc.getSearchMethod()

  public val setupGiXMethod: MethodDescriptor<IdentifierUUID, GiXAppRun>
    @JvmStatic
    get() = VaultServiceGrpc.getSetupGiXMethod()

  public val giXRelayDELETEMethod: MethodDescriptor<GiXRelayReqWithoutBody, GiXRelayResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getGiXRelayDELETEMethod()

  public val giXRelayGETMethod: MethodDescriptor<GiXRelayReqWithoutBody, GiXRelayResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getGiXRelayGETMethod()

  public val giXRelayHEADMethod: MethodDescriptor<GiXRelayReqWithoutBody, GiXRelayResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getGiXRelayHEADMethod()

  public val giXRelayPATCHMethod: MethodDescriptor<GiXRelayReqWithBody, GiXRelayResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getGiXRelayPATCHMethod()

  public val giXRelayPOSTMethod: MethodDescriptor<GiXRelayReqWithBody, GiXRelayResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getGiXRelayPOSTMethod()

  public val giXRelayPUTMethod: MethodDescriptor<GiXRelayReqWithBody, GiXRelayResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getGiXRelayPUTMethod()

  public val giXFilterMethod: MethodDescriptor<GiXAppRunFilterReq, GiXAppRunsList>
    @JvmStatic
    get() = VaultServiceGrpc.getGiXFilterMethod()

  public val giXCountMethod: MethodDescriptor<GiXAppRunCountReq, CountResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getGiXCountMethod()

  public val reconfigureEnclaveMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VaultServiceGrpc.getReconfigureEnclaveMethod()

  public val setupEnclaveIngressMethod: MethodDescriptor<IdentifierUUID, EnclaveIngress>
    @JvmStatic
    get() = VaultServiceGrpc.getSetupEnclaveIngressMethod()

  public val filterEnclaveIngressesMethod:
      MethodDescriptor<EnclaveIngressFilterReq, EnclaveIngressesList>
    @JvmStatic
    get() = VaultServiceGrpc.getFilterEnclaveIngressesMethod()

  public val countEnclaveIngressesMethod: MethodDescriptor<EnclaveIngressCountReq, CountResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getCountEnclaveIngressesMethod()

  public val verifyEnclaveIngressMethod:
      MethodDescriptor<VerifyEnclaveIngressRequest, VerifyEnclaveIngressResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getVerifyEnclaveIngressMethod()

  public val addEnclaveEnvironmentVariableMethod:
      MethodDescriptor<EnclaveEnvironmentVariableAddRequest, EnclaveEnvironmentVariable>
    @JvmStatic
    get() = VaultServiceGrpc.getAddEnclaveEnvironmentVariableMethod()

  public val updateEnclaveEnvironmentVariableMethod:
      MethodDescriptor<EnclaveEnvironmentVariableUpdateRequest, EnclaveEnvironmentVariable>
    @JvmStatic
    get() = VaultServiceGrpc.getUpdateEnclaveEnvironmentVariableMethod()

  public val deleteEnclaveEnvironmentVariableMethod:
      MethodDescriptor<IdentifierUUID, IdentifierResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getDeleteEnclaveEnvironmentVariableMethod()

  public val viewEnclaveEnvironmentVariableMethod:
      MethodDescriptor<IdentifierUUID, EnclaveEnvironmentVariable>
    @JvmStatic
    get() = VaultServiceGrpc.getViewEnclaveEnvironmentVariableMethod()

  public val viewAllEnclaveEnvironmentVariablesMethod:
      MethodDescriptor<IdentifierUUID, EnclaveEnvironmentVariablesList>
    @JvmStatic
    get() = VaultServiceGrpc.getViewAllEnclaveEnvironmentVariablesMethod()

  public val addEnclaveDomainMethod: MethodDescriptor<EnclaveDomainAddRequest, EnclaveDomain>
    @JvmStatic
    get() = VaultServiceGrpc.getAddEnclaveDomainMethod()

  public val deleteEnclaveDomainMethod: MethodDescriptor<IdentifierUUID, IdentifierResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getDeleteEnclaveDomainMethod()

  public val viewEnclaveDomainMethod: MethodDescriptor<IdentifierUUID, EnclaveDomain>
    @JvmStatic
    get() = VaultServiceGrpc.getViewEnclaveDomainMethod()

  public val viewAllEnclaveDomainsMethod: MethodDescriptor<IdentifierUUID, EnclaveDomainsList>
    @JvmStatic
    get() = VaultServiceGrpc.getViewAllEnclaveDomainsMethod()

  public val viewDomainSuffixMethod: MethodDescriptor<Empty, EnclaveDomainSuffixResp>
    @JvmStatic
    get() = VaultServiceGrpc.getViewDomainSuffixMethod()

  public val filterEnclaveDomainsMethod:
      MethodDescriptor<EnclaveDomainsFilterReq, EnclaveDomainsList>
    @JvmStatic
    get() = VaultServiceGrpc.getFilterEnclaveDomainsMethod()

  public val addEnclaveFrameMethod: MethodDescriptor<EnclaveFrameAddRequest, EnclaveFrame>
    @JvmStatic
    get() = VaultServiceGrpc.getAddEnclaveFrameMethod()

  public val viewEnclaveFrameMethod: MethodDescriptor<IdentifierUUID, EnclaveFrame>
    @JvmStatic
    get() = VaultServiceGrpc.getViewEnclaveFrameMethod()

  public val updateEnclaveFrameMethod: MethodDescriptor<EnclaveFrameUpdateRequest, EnclaveFrame>
    @JvmStatic
    get() = VaultServiceGrpc.getUpdateEnclaveFrameMethod()

  public val deleteEnclaveFrameMethod: MethodDescriptor<IdentifierUUID, IdentifierResponse>
    @JvmStatic
    get() = VaultServiceGrpc.getDeleteEnclaveFrameMethod()

  public val setupEnclaveFrameMethod: MethodDescriptor<IdentifierUUID, EnclaveFrameSetup>
    @JvmStatic
    get() = VaultServiceGrpc.getSetupEnclaveFrameMethod()

  public val setupAllEnclaveFramesMethod: MethodDescriptor<Empty, EnclaveFrameSetupList>
    @JvmStatic
    get() = VaultServiceGrpc.getSetupAllEnclaveFramesMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.VaultService service as suspending coroutines.
   */
  @StubFor(VaultServiceGrpc::class)
  public class VaultServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<VaultServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): VaultServiceCoroutineStub =
        VaultServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun initiateFile(request: VaultFileInitiateFileRequest, headers: Metadata =
        Metadata()): VaultFileInitiateFileResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getInitiateFileMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addFileChunk(request: VaultFileAddChunkRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getAddFileChunkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun completeFile(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getCompleteFileMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun renameFile(request: VaultFileRenameFileRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getRenameFileMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun unzipFile(request: VaultFileUnzipRequest, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getUnzipFileMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun persistFile(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getPersistFileMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun moveFile(request: VaultFileMoveFileRequest, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getMoveFileMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteFile(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getDeleteFileMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addFilePermission(request: VaultPermissionAddRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getAddFilePermissionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun modifyFilePermission(request: VaultPermissionModifyRequest, headers: Metadata
        = Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getModifyFilePermissionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteFilePermission(request: IdentifierUUID, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getDeleteFilePermissionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadFile(request: IdentifierUUID, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      VaultServiceGrpc.getDownloadFileMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadFileVersion(request: IdentifierUUID, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      VaultServiceGrpc.getDownloadFileVersionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFileLogo(request: IdentifierUUID, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFileLogoMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFileByUUID(request: IdentifierUUID, headers: Metadata = Metadata()):
        VaultFile = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFileByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFileByID(request: Identifier, headers: Metadata = Metadata()): VaultFile
        = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFileByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFileChunk(request: IdentifierUUID, headers: Metadata = Metadata()):
        VaultFileVersionChunk = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFileChunkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFileChunkMetadata(request: IdentifierUUID, headers: Metadata =
        Metadata()): VaultFileVersionChunk = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFileChunkMetadataMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFilePermission(request: IdentifierUUID, headers: Metadata = Metadata()):
        VaultPermission = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFilePermissionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun doesFileExist(request: VaultDuplicateCheckReq, headers: Metadata =
        Metadata()): BooleanResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getDoesFileExistMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFileVersions(request: IdentifierUUID, headers: Metadata = Metadata()):
        VaultFileVersionsList = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFileVersionsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFileAccessLogs(request: IdentifierUUID, headers: Metadata = Metadata()):
        VaultAccessLogsList = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFileAccessLogsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addFolder(request: VaultFolderAddRequest, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getAddFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun moveFolder(request: VaultFolderMoveFolderRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getMoveFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun renameFolder(request: VaultFolderRenameFolderRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getRenameFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteFolder(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getDeleteFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun zipFolder(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getZipFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addFolderPermission(request: VaultPermissionAddRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getAddFolderPermissionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun modifyFolderPermission(request: VaultPermissionModifyRequest,
        headers: Metadata = Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getModifyFolderPermissionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteFolderPermission(request: IdentifierUUID, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getDeleteFolderPermissionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFolderByID(request: IdentifierZeroable, headers: Metadata = Metadata()):
        VaultFolder = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFolderByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFolderByUUID(request: IdentifierUUID, headers: Metadata = Metadata()):
        VaultFolder = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFolderByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFolderDownloadStatus(request: IdentifierUUID, headers: Metadata =
        Metadata()): VaultFolderDownload = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFolderDownloadStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadFolder(request: IdentifierUUID, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      VaultServiceGrpc.getDownloadFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAccessibleFilesInFolder(request: IdentifierUUID, headers: Metadata =
        Metadata()): VaultFilesList = unaryRpc(
      channel,
      VaultServiceGrpc.getViewAccessibleFilesInFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAccessibleFoldersInFolder(request: IdentifierUUID, headers: Metadata =
        Metadata()): VaultFoldersList = unaryRpc(
      channel,
      VaultServiceGrpc.getViewAccessibleFoldersInFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAccessibleResourcesInFolder(request: IdentifierUUID, headers: Metadata =
        Metadata()): VaultResourcesList = unaryRpc(
      channel,
      VaultServiceGrpc.getViewAccessibleResourcesInFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFolderPermission(request: IdentifierUUID, headers: Metadata =
        Metadata()): VaultPermission = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFolderPermissionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun doesFolderExist(request: VaultDuplicateCheckReq, headers: Metadata =
        Metadata()): BooleanResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getDoesFolderExistMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFolderAccessLogs(request: IdentifierUUID, headers: Metadata =
        Metadata()): VaultAccessLogsList = unaryRpc(
      channel,
      VaultServiceGrpc.getViewFolderAccessLogsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewPassthroughRolesForFolder(request: IdentifierUUID, headers: Metadata =
        Metadata()): RolesList = unaryRpc(
      channel,
      VaultServiceGrpc.getViewPassthroughRolesForFolderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun search(request: VaultSearchReq, headers: Metadata = Metadata()):
        VaultSearchResponsesList = unaryRpc(
      channel,
      VaultServiceGrpc.getSearchMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun setupGiX(request: IdentifierUUID, headers: Metadata = Metadata()): GiXAppRun
        = unaryRpc(
      channel,
      VaultServiceGrpc.getSetupGiXMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun giXRelayDELETE(request: GiXRelayReqWithoutBody, headers: Metadata =
        Metadata()): GiXRelayResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getGiXRelayDELETEMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun giXRelayGET(request: GiXRelayReqWithoutBody, headers: Metadata = Metadata()):
        GiXRelayResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getGiXRelayGETMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun giXRelayHEAD(request: GiXRelayReqWithoutBody, headers: Metadata =
        Metadata()): GiXRelayResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getGiXRelayHEADMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun giXRelayPATCH(request: GiXRelayReqWithBody, headers: Metadata = Metadata()):
        GiXRelayResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getGiXRelayPATCHMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun giXRelayPOST(request: GiXRelayReqWithBody, headers: Metadata = Metadata()):
        GiXRelayResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getGiXRelayPOSTMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun giXRelayPUT(request: GiXRelayReqWithBody, headers: Metadata = Metadata()):
        GiXRelayResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getGiXRelayPUTMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun giXFilter(request: GiXAppRunFilterReq, headers: Metadata = Metadata()):
        GiXAppRunsList = unaryRpc(
      channel,
      VaultServiceGrpc.getGiXFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun giXCount(request: GiXAppRunCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getGiXCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reconfigureEnclave(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VaultServiceGrpc.getReconfigureEnclaveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun setupEnclaveIngress(request: IdentifierUUID, headers: Metadata = Metadata()):
        EnclaveIngress = unaryRpc(
      channel,
      VaultServiceGrpc.getSetupEnclaveIngressMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filterEnclaveIngresses(request: EnclaveIngressFilterReq, headers: Metadata =
        Metadata()): EnclaveIngressesList = unaryRpc(
      channel,
      VaultServiceGrpc.getFilterEnclaveIngressesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun countEnclaveIngresses(request: EnclaveIngressCountReq, headers: Metadata =
        Metadata()): CountResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getCountEnclaveIngressesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun verifyEnclaveIngress(request: VerifyEnclaveIngressRequest, headers: Metadata
        = Metadata()): VerifyEnclaveIngressResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getVerifyEnclaveIngressMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addEnclaveEnvironmentVariable(request: EnclaveEnvironmentVariableAddRequest,
        headers: Metadata = Metadata()): EnclaveEnvironmentVariable = unaryRpc(
      channel,
      VaultServiceGrpc.getAddEnclaveEnvironmentVariableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend
        fun updateEnclaveEnvironmentVariable(request: EnclaveEnvironmentVariableUpdateRequest,
        headers: Metadata = Metadata()): EnclaveEnvironmentVariable = unaryRpc(
      channel,
      VaultServiceGrpc.getUpdateEnclaveEnvironmentVariableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteEnclaveEnvironmentVariable(request: IdentifierUUID, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getDeleteEnclaveEnvironmentVariableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewEnclaveEnvironmentVariable(request: IdentifierUUID, headers: Metadata =
        Metadata()): EnclaveEnvironmentVariable = unaryRpc(
      channel,
      VaultServiceGrpc.getViewEnclaveEnvironmentVariableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAllEnclaveEnvironmentVariables(request: IdentifierUUID, headers: Metadata
        = Metadata()): EnclaveEnvironmentVariablesList = unaryRpc(
      channel,
      VaultServiceGrpc.getViewAllEnclaveEnvironmentVariablesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addEnclaveDomain(request: EnclaveDomainAddRequest, headers: Metadata =
        Metadata()): EnclaveDomain = unaryRpc(
      channel,
      VaultServiceGrpc.getAddEnclaveDomainMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteEnclaveDomain(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getDeleteEnclaveDomainMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewEnclaveDomain(request: IdentifierUUID, headers: Metadata = Metadata()):
        EnclaveDomain = unaryRpc(
      channel,
      VaultServiceGrpc.getViewEnclaveDomainMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAllEnclaveDomains(request: IdentifierUUID, headers: Metadata =
        Metadata()): EnclaveDomainsList = unaryRpc(
      channel,
      VaultServiceGrpc.getViewAllEnclaveDomainsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewDomainSuffix(request: Empty, headers: Metadata = Metadata()):
        EnclaveDomainSuffixResp = unaryRpc(
      channel,
      VaultServiceGrpc.getViewDomainSuffixMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filterEnclaveDomains(request: EnclaveDomainsFilterReq, headers: Metadata =
        Metadata()): EnclaveDomainsList = unaryRpc(
      channel,
      VaultServiceGrpc.getFilterEnclaveDomainsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addEnclaveFrame(request: EnclaveFrameAddRequest, headers: Metadata =
        Metadata()): EnclaveFrame = unaryRpc(
      channel,
      VaultServiceGrpc.getAddEnclaveFrameMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewEnclaveFrame(request: IdentifierUUID, headers: Metadata = Metadata()):
        EnclaveFrame = unaryRpc(
      channel,
      VaultServiceGrpc.getViewEnclaveFrameMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateEnclaveFrame(request: EnclaveFrameUpdateRequest, headers: Metadata =
        Metadata()): EnclaveFrame = unaryRpc(
      channel,
      VaultServiceGrpc.getUpdateEnclaveFrameMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteEnclaveFrame(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      VaultServiceGrpc.getDeleteEnclaveFrameMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun setupEnclaveFrame(request: IdentifierUUID, headers: Metadata = Metadata()):
        EnclaveFrameSetup = unaryRpc(
      channel,
      VaultServiceGrpc.getSetupEnclaveFrameMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun setupAllEnclaveFrames(request: Empty, headers: Metadata = Metadata()):
        EnclaveFrameSetupList = unaryRpc(
      channel,
      VaultServiceGrpc.getSetupAllEnclaveFramesMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.VaultService service based on Kotlin coroutines.
   */
  public abstract class VaultServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.VaultService.InitiateFile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun initiateFile(request: VaultFileInitiateFileRequest):
        VaultFileInitiateFileResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.InitiateFile is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.AddFileChunk.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addFileChunk(request: VaultFileAddChunkRequest): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.AddFileChunk is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.CompleteFile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun completeFile(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.CompleteFile is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.RenameFile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun renameFile(request: VaultFileRenameFileRequest): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.RenameFile is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.UnzipFile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun unzipFile(request: VaultFileUnzipRequest): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.UnzipFile is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.PersistFile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun persistFile(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.PersistFile is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.MoveFile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun moveFile(request: VaultFileMoveFileRequest): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.MoveFile is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DeleteFile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteFile(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DeleteFile is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.AddFilePermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addFilePermission(request: VaultPermissionAddRequest): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.AddFilePermission is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ModifyFilePermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun modifyFilePermission(request: VaultPermissionModifyRequest):
        IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ModifyFilePermission is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DeleteFilePermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteFilePermission(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DeleteFilePermission is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DownloadFile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadFile(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DownloadFile is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DownloadFileVersion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadFileVersion(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DownloadFileVersion is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFileLogo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFileLogo(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFileLogo is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFileByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFileByUUID(request: IdentifierUUID): VaultFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFileByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFileByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFileByID(request: Identifier): VaultFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFileByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFileChunk.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFileChunk(request: IdentifierUUID): VaultFileVersionChunk = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFileChunk is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFileChunkMetadata.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFileChunkMetadata(request: IdentifierUUID): VaultFileVersionChunk =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFileChunkMetadata is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFilePermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFilePermission(request: IdentifierUUID): VaultPermission = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFilePermission is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DoesFileExist.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun doesFileExist(request: VaultDuplicateCheckReq): BooleanResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DoesFileExist is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFileVersions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFileVersions(request: IdentifierUUID): VaultFileVersionsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFileVersions is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFileAccessLogs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFileAccessLogs(request: IdentifierUUID): VaultAccessLogsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFileAccessLogs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.AddFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addFolder(request: VaultFolderAddRequest): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.AddFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.MoveFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun moveFolder(request: VaultFolderMoveFolderRequest): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.MoveFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.RenameFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun renameFolder(request: VaultFolderRenameFolderRequest): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.RenameFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DeleteFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteFolder(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DeleteFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ZipFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun zipFolder(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ZipFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.AddFolderPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addFolderPermission(request: VaultPermissionAddRequest): IdentifierUUID
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.AddFolderPermission is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ModifyFolderPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun modifyFolderPermission(request: VaultPermissionModifyRequest):
        IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ModifyFolderPermission is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DeleteFolderPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteFolderPermission(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DeleteFolderPermission is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFolderByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFolderByID(request: IdentifierZeroable): VaultFolder = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFolderByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFolderByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFolderByUUID(request: IdentifierUUID): VaultFolder = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFolderByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFolderDownloadStatus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFolderDownloadStatus(request: IdentifierUUID): VaultFolderDownload =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFolderDownloadStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DownloadFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadFolder(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DownloadFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewAccessibleFilesInFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAccessibleFilesInFolder(request: IdentifierUUID): VaultFilesList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewAccessibleFilesInFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewAccessibleFoldersInFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAccessibleFoldersInFolder(request: IdentifierUUID): VaultFoldersList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewAccessibleFoldersInFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewAccessibleResourcesInFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAccessibleResourcesInFolder(request: IdentifierUUID):
        VaultResourcesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewAccessibleResourcesInFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFolderPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFolderPermission(request: IdentifierUUID): VaultPermission = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFolderPermission is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DoesFolderExist.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun doesFolderExist(request: VaultDuplicateCheckReq): BooleanResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DoesFolderExist is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewFolderAccessLogs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFolderAccessLogs(request: IdentifierUUID): VaultAccessLogsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewFolderAccessLogs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewPassthroughRolesForFolder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewPassthroughRolesForFolder(request: IdentifierUUID): RolesList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewPassthroughRolesForFolder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.Search.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun search(request: VaultSearchReq): VaultSearchResponsesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.Search is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.SetupGiX.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setupGiX(request: IdentifierUUID): GiXAppRun = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.SetupGiX is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.GiXRelayDELETE.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun giXRelayDELETE(request: GiXRelayReqWithoutBody): GiXRelayResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.GiXRelayDELETE is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.GiXRelayGET.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun giXRelayGET(request: GiXRelayReqWithoutBody): GiXRelayResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.GiXRelayGET is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.GiXRelayHEAD.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun giXRelayHEAD(request: GiXRelayReqWithoutBody): GiXRelayResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.GiXRelayHEAD is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.GiXRelayPATCH.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun giXRelayPATCH(request: GiXRelayReqWithBody): GiXRelayResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.GiXRelayPATCH is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.GiXRelayPOST.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun giXRelayPOST(request: GiXRelayReqWithBody): GiXRelayResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.GiXRelayPOST is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.GiXRelayPUT.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun giXRelayPUT(request: GiXRelayReqWithBody): GiXRelayResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.GiXRelayPUT is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.GiXFilter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun giXFilter(request: GiXAppRunFilterReq): GiXAppRunsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.GiXFilter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.GiXCount.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun giXCount(request: GiXAppRunCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.GiXCount is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ReconfigureEnclave.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reconfigureEnclave(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ReconfigureEnclave is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.SetupEnclaveIngress.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setupEnclaveIngress(request: IdentifierUUID): EnclaveIngress = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.SetupEnclaveIngress is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.FilterEnclaveIngresses.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filterEnclaveIngresses(request: EnclaveIngressFilterReq):
        EnclaveIngressesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.FilterEnclaveIngresses is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.CountEnclaveIngresses.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun countEnclaveIngresses(request: EnclaveIngressCountReq): CountResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.CountEnclaveIngresses is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.VerifyEnclaveIngress.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun verifyEnclaveIngress(request: VerifyEnclaveIngressRequest):
        VerifyEnclaveIngressResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.VerifyEnclaveIngress is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.AddEnclaveEnvironmentVariable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun addEnclaveEnvironmentVariable(request: EnclaveEnvironmentVariableAddRequest):
        EnclaveEnvironmentVariable = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.AddEnclaveEnvironmentVariable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.UpdateEnclaveEnvironmentVariable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun updateEnclaveEnvironmentVariable(request: EnclaveEnvironmentVariableUpdateRequest):
        EnclaveEnvironmentVariable = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.UpdateEnclaveEnvironmentVariable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DeleteEnclaveEnvironmentVariable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteEnclaveEnvironmentVariable(request: IdentifierUUID):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DeleteEnclaveEnvironmentVariable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewEnclaveEnvironmentVariable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEnclaveEnvironmentVariable(request: IdentifierUUID):
        EnclaveEnvironmentVariable = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewEnclaveEnvironmentVariable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewAllEnclaveEnvironmentVariables.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllEnclaveEnvironmentVariables(request: IdentifierUUID):
        EnclaveEnvironmentVariablesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewAllEnclaveEnvironmentVariables is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.AddEnclaveDomain.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addEnclaveDomain(request: EnclaveDomainAddRequest): EnclaveDomain =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.AddEnclaveDomain is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DeleteEnclaveDomain.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteEnclaveDomain(request: IdentifierUUID): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DeleteEnclaveDomain is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewEnclaveDomain.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEnclaveDomain(request: IdentifierUUID): EnclaveDomain = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewEnclaveDomain is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewAllEnclaveDomains.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllEnclaveDomains(request: IdentifierUUID): EnclaveDomainsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewAllEnclaveDomains is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewDomainSuffix.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewDomainSuffix(request: Empty): EnclaveDomainSuffixResp = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewDomainSuffix is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.FilterEnclaveDomains.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filterEnclaveDomains(request: EnclaveDomainsFilterReq):
        EnclaveDomainsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.FilterEnclaveDomains is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.AddEnclaveFrame.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addEnclaveFrame(request: EnclaveFrameAddRequest): EnclaveFrame = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.AddEnclaveFrame is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.ViewEnclaveFrame.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEnclaveFrame(request: IdentifierUUID): EnclaveFrame = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.ViewEnclaveFrame is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.UpdateEnclaveFrame.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateEnclaveFrame(request: EnclaveFrameUpdateRequest): EnclaveFrame =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.UpdateEnclaveFrame is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.DeleteEnclaveFrame.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteEnclaveFrame(request: IdentifierUUID): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.DeleteEnclaveFrame is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.SetupEnclaveFrame.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setupEnclaveFrame(request: IdentifierUUID): EnclaveFrameSetup = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.SetupEnclaveFrame is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VaultService.SetupAllEnclaveFrames.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setupAllEnclaveFrames(request: Empty): EnclaveFrameSetupList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VaultService.SetupAllEnclaveFrames is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getInitiateFileMethod(),
      implementation = ::initiateFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getAddFileChunkMethod(),
      implementation = ::addFileChunk
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getCompleteFileMethod(),
      implementation = ::completeFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getRenameFileMethod(),
      implementation = ::renameFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getUnzipFileMethod(),
      implementation = ::unzipFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getPersistFileMethod(),
      implementation = ::persistFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getMoveFileMethod(),
      implementation = ::moveFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDeleteFileMethod(),
      implementation = ::deleteFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getAddFilePermissionMethod(),
      implementation = ::addFilePermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getModifyFilePermissionMethod(),
      implementation = ::modifyFilePermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDeleteFilePermissionMethod(),
      implementation = ::deleteFilePermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDownloadFileMethod(),
      implementation = ::downloadFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDownloadFileVersionMethod(),
      implementation = ::downloadFileVersion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFileLogoMethod(),
      implementation = ::viewFileLogo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFileByUUIDMethod(),
      implementation = ::viewFileByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFileByIDMethod(),
      implementation = ::viewFileByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFileChunkMethod(),
      implementation = ::viewFileChunk
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFileChunkMetadataMethod(),
      implementation = ::viewFileChunkMetadata
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFilePermissionMethod(),
      implementation = ::viewFilePermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDoesFileExistMethod(),
      implementation = ::doesFileExist
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFileVersionsMethod(),
      implementation = ::viewFileVersions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFileAccessLogsMethod(),
      implementation = ::viewFileAccessLogs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getAddFolderMethod(),
      implementation = ::addFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getMoveFolderMethod(),
      implementation = ::moveFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getRenameFolderMethod(),
      implementation = ::renameFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDeleteFolderMethod(),
      implementation = ::deleteFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getZipFolderMethod(),
      implementation = ::zipFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getAddFolderPermissionMethod(),
      implementation = ::addFolderPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getModifyFolderPermissionMethod(),
      implementation = ::modifyFolderPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDeleteFolderPermissionMethod(),
      implementation = ::deleteFolderPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFolderByIDMethod(),
      implementation = ::viewFolderByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFolderByUUIDMethod(),
      implementation = ::viewFolderByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFolderDownloadStatusMethod(),
      implementation = ::viewFolderDownloadStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDownloadFolderMethod(),
      implementation = ::downloadFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewAccessibleFilesInFolderMethod(),
      implementation = ::viewAccessibleFilesInFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewAccessibleFoldersInFolderMethod(),
      implementation = ::viewAccessibleFoldersInFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewAccessibleResourcesInFolderMethod(),
      implementation = ::viewAccessibleResourcesInFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFolderPermissionMethod(),
      implementation = ::viewFolderPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDoesFolderExistMethod(),
      implementation = ::doesFolderExist
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewFolderAccessLogsMethod(),
      implementation = ::viewFolderAccessLogs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewPassthroughRolesForFolderMethod(),
      implementation = ::viewPassthroughRolesForFolder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getSearchMethod(),
      implementation = ::search
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getSetupGiXMethod(),
      implementation = ::setupGiX
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getGiXRelayDELETEMethod(),
      implementation = ::giXRelayDELETE
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getGiXRelayGETMethod(),
      implementation = ::giXRelayGET
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getGiXRelayHEADMethod(),
      implementation = ::giXRelayHEAD
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getGiXRelayPATCHMethod(),
      implementation = ::giXRelayPATCH
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getGiXRelayPOSTMethod(),
      implementation = ::giXRelayPOST
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getGiXRelayPUTMethod(),
      implementation = ::giXRelayPUT
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getGiXFilterMethod(),
      implementation = ::giXFilter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getGiXCountMethod(),
      implementation = ::giXCount
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getReconfigureEnclaveMethod(),
      implementation = ::reconfigureEnclave
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getSetupEnclaveIngressMethod(),
      implementation = ::setupEnclaveIngress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getFilterEnclaveIngressesMethod(),
      implementation = ::filterEnclaveIngresses
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getCountEnclaveIngressesMethod(),
      implementation = ::countEnclaveIngresses
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getVerifyEnclaveIngressMethod(),
      implementation = ::verifyEnclaveIngress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getAddEnclaveEnvironmentVariableMethod(),
      implementation = ::addEnclaveEnvironmentVariable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getUpdateEnclaveEnvironmentVariableMethod(),
      implementation = ::updateEnclaveEnvironmentVariable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDeleteEnclaveEnvironmentVariableMethod(),
      implementation = ::deleteEnclaveEnvironmentVariable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewEnclaveEnvironmentVariableMethod(),
      implementation = ::viewEnclaveEnvironmentVariable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewAllEnclaveEnvironmentVariablesMethod(),
      implementation = ::viewAllEnclaveEnvironmentVariables
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getAddEnclaveDomainMethod(),
      implementation = ::addEnclaveDomain
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDeleteEnclaveDomainMethod(),
      implementation = ::deleteEnclaveDomain
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewEnclaveDomainMethod(),
      implementation = ::viewEnclaveDomain
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewAllEnclaveDomainsMethod(),
      implementation = ::viewAllEnclaveDomains
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewDomainSuffixMethod(),
      implementation = ::viewDomainSuffix
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getFilterEnclaveDomainsMethod(),
      implementation = ::filterEnclaveDomains
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getAddEnclaveFrameMethod(),
      implementation = ::addEnclaveFrame
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getViewEnclaveFrameMethod(),
      implementation = ::viewEnclaveFrame
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getUpdateEnclaveFrameMethod(),
      implementation = ::updateEnclaveFrame
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getDeleteEnclaveFrameMethod(),
      implementation = ::deleteEnclaveFrame
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getSetupEnclaveFrameMethod(),
      implementation = ::setupEnclaveFrame
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VaultServiceGrpc.getSetupAllEnclaveFramesMethod(),
      implementation = ::setupAllEnclaveFrames
    )).build()
  }
}
