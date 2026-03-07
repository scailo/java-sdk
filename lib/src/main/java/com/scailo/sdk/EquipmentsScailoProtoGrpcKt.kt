package com.scailo.sdk

import com.scailo.sdk.EquipmentsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.EquipmentsService.
 */
public object EquipmentsServiceGrpcKt {
  public const val SERVICE_NAME: String = EquipmentsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<EquipmentsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getCreateMethod()

  public val sendToStoreMethod:
      MethodDescriptor<EquipmentsServiceSendToStoreRequest, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getSendToStoreMethod()

  public val updateMethod: MethodDescriptor<EquipmentsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getUpdateMethod()

  public val sendForReworkMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getSendForReworkMethod()

  public val sendForQCMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getSendForQCMethod()

  public val splitLotMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getSplitLotMethod()

  public val partitionMethod: MethodDescriptor<InventoryPartitionRequest, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getPartitionMethod()

  public val consumeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getConsumeMethod()

  public val rejectMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getRejectMethod()

  public val scrapMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getScrapMethod()

  public val returnMaterialMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getReturnMaterialMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getDiscardMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getCommentAddMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getCreateMagicLinkMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, Equipment>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, Equipment>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, Equipment>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, Equipment>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, EquipmentsList>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getViewFromIDsMethod()

  public val viewFromUUIDsMethod: MethodDescriptor<IdentifierUUIDsList, EquipmentsList>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getViewFromUUIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, EquipmentsList>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getViewAllMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<EquipmentsServicePaginationReq, EquipmentsServicePaginationResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getViewWithPaginationMethod()

  public val downloadQCReportByIDMethod: MethodDescriptor<Identifier, StandardFile>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getDownloadQCReportByIDMethod()

  public val downloadQCReportByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getDownloadQCReportByUUIDMethod()

  public val downloadLabelByIDMethod: MethodDescriptor<Identifier, StandardFile>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getDownloadLabelByIDMethod()

  public val downloadLabelByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getDownloadLabelByUUIDMethod()

  public val viewInventoryInteractionsMethod:
      MethodDescriptor<IdentifierUUID, InventoryInteractionsList>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getViewInventoryInteractionsMethod()

  public val searchAllMethod: MethodDescriptor<EquipmentsServiceSearchAllReq, EquipmentsList>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<EquipmentsServiceFilterReq, EquipmentsList>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getFilterMethod()

  public val countMethod: MethodDescriptor<EquipmentsServiceCountReq, CountResponse>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<EquipmentsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getDownloadAsCSVMethod()

  public val downloadImportTemplateMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getDownloadImportTemplateMethod()

  public val importFromCSVMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = EquipmentsServiceGrpc.getImportFromCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.EquipmentsService service as suspending coroutines.
   */
  @StubFor(EquipmentsServiceGrpc::class)
  public class EquipmentsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<EquipmentsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): EquipmentsServiceCoroutineStub =
        EquipmentsServiceCoroutineStub(channel, callOptions)

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
    public suspend fun create(request: EquipmentsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getCreateMethod(),
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
    public suspend fun sendToStore(request: EquipmentsServiceSendToStoreRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getSendToStoreMethod(),
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
    public suspend fun update(request: EquipmentsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getUpdateMethod(),
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
    public suspend fun sendForRework(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getSendForReworkMethod(),
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
    public suspend fun sendForQC(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getSendForQCMethod(),
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
    public suspend fun splitLot(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getSplitLotMethod(),
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
    public suspend fun partition(request: InventoryPartitionRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getPartitionMethod(),
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
    public suspend fun consume(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getConsumeMethod(),
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
    public suspend fun reject(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getRejectMethod(),
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
    public suspend fun scrap(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getScrapMethod(),
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
    public suspend fun returnMaterial(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getReturnMaterialMethod(),
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
    public suspend fun discard(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getDiscardMethod(),
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
    public suspend fun commentAdd(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getCommentAddMethod(),
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
    public suspend fun createMagicLink(request: MagicLinksServiceCreateRequestForSpecificResource,
        headers: Metadata = Metadata()): MagicLink = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getCreateMagicLinkMethod(),
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
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): Equipment =
        unaryRpc(
      channel,
      EquipmentsServiceGrpc.getViewByIDMethod(),
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
    public suspend fun viewByUUID(request: IdentifierUUID, headers: Metadata = Metadata()):
        Equipment = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getViewByUUIDMethod(),
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
    public suspend fun viewEssentialByID(request: Identifier, headers: Metadata = Metadata()):
        Equipment = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getViewEssentialByIDMethod(),
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
    public suspend fun viewEssentialByUUID(request: IdentifierUUID, headers: Metadata = Metadata()):
        Equipment = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getViewEssentialByUUIDMethod(),
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
    public suspend fun viewFromIDs(request: IdentifiersList, headers: Metadata = Metadata()):
        EquipmentsList = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getViewFromIDsMethod(),
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
    public suspend fun viewFromUUIDs(request: IdentifierUUIDsList, headers: Metadata = Metadata()):
        EquipmentsList = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getViewFromUUIDsMethod(),
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
    public suspend fun viewAll(request: ActiveStatus, headers: Metadata = Metadata()):
        EquipmentsList = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getViewAllMethod(),
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
    public suspend fun viewWithPagination(request: EquipmentsServicePaginationReq, headers: Metadata
        = Metadata()): EquipmentsServicePaginationResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getViewWithPaginationMethod(),
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
    public suspend fun downloadQCReportByID(request: Identifier, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getDownloadQCReportByIDMethod(),
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
    public suspend fun downloadQCReportByUUID(request: IdentifierUUID, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getDownloadQCReportByUUIDMethod(),
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
    public suspend fun downloadLabelByID(request: Identifier, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getDownloadLabelByIDMethod(),
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
    public suspend fun downloadLabelByUUID(request: IdentifierUUID, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getDownloadLabelByUUIDMethod(),
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
    public suspend fun viewInventoryInteractions(request: IdentifierUUID, headers: Metadata =
        Metadata()): InventoryInteractionsList = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getViewInventoryInteractionsMethod(),
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
    public suspend fun searchAll(request: EquipmentsServiceSearchAllReq, headers: Metadata =
        Metadata()): EquipmentsList = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getSearchAllMethod(),
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
    public suspend fun filter(request: EquipmentsServiceFilterReq, headers: Metadata = Metadata()):
        EquipmentsList = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getFilterMethod(),
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
    public suspend fun count(request: EquipmentsServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getCountMethod(),
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
    public suspend fun downloadAsCSV(request: EquipmentsServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getDownloadAsCSVMethod(),
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
    public suspend fun downloadImportTemplate(request: Empty, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getDownloadImportTemplateMethod(),
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
    public suspend fun importFromCSV(request: StandardFile, headers: Metadata = Metadata()):
        IdentifierUUIDsList = unaryRpc(
      channel,
      EquipmentsServiceGrpc.getImportFromCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.EquipmentsService service based on Kotlin coroutines.
   */
  public abstract class EquipmentsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: EquipmentsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.SendToStore.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendToStore(request: EquipmentsServiceSendToStoreRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.SendToStore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.Update.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun update(request: EquipmentsServiceUpdateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.Update is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.SendForRework.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendForRework(request: IdentifierUUIDWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.SendForRework is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.SendForQC.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendForQC(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.SendForQC is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.SplitLot.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun splitLot(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.SplitLot is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.Partition.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun partition(request: InventoryPartitionRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.Partition is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.Consume.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun consume(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.Consume is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.Reject.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reject(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.Reject is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.Scrap.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun scrap(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.Scrap is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ReturnMaterial.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun returnMaterial(request: IdentifierUUIDWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ReturnMaterial is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.Discard.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun discard(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.CommentAdd.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun commentAdd(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.CreateMagicLink.
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
        fun createMagicLink(request: MagicLinksServiceCreateRequestForSpecificResource): MagicLink =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): Equipment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): Equipment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): Equipment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): Equipment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): EquipmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ViewFromUUIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromUUIDs(request: IdentifierUUIDsList): EquipmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ViewFromUUIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): EquipmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: EquipmentsServicePaginationReq):
        EquipmentsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.DownloadQCReportByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadQCReportByID(request: Identifier): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.DownloadQCReportByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.DownloadQCReportByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadQCReportByUUID(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.DownloadQCReportByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.DownloadLabelByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadLabelByID(request: Identifier): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.DownloadLabelByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.DownloadLabelByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadLabelByUUID(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.DownloadLabelByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ViewInventoryInteractions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInventoryInteractions(request: IdentifierUUID):
        InventoryInteractionsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ViewInventoryInteractions is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: EquipmentsServiceSearchAllReq): EquipmentsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: EquipmentsServiceFilterReq): EquipmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: EquipmentsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: EquipmentsServiceFilterReq): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.DownloadAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.DownloadImportTemplate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadImportTemplate(request: Empty): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.DownloadImportTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquipmentsService.ImportFromCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun importFromCSV(request: StandardFile): IdentifierUUIDsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquipmentsService.ImportFromCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getSendToStoreMethod(),
      implementation = ::sendToStore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getUpdateMethod(),
      implementation = ::update
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getSendForReworkMethod(),
      implementation = ::sendForRework
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getSendForQCMethod(),
      implementation = ::sendForQC
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getSplitLotMethod(),
      implementation = ::splitLot
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getPartitionMethod(),
      implementation = ::partition
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getConsumeMethod(),
      implementation = ::consume
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getRejectMethod(),
      implementation = ::reject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getScrapMethod(),
      implementation = ::scrap
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getReturnMaterialMethod(),
      implementation = ::returnMaterial
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getViewFromUUIDsMethod(),
      implementation = ::viewFromUUIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getDownloadQCReportByIDMethod(),
      implementation = ::downloadQCReportByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getDownloadQCReportByUUIDMethod(),
      implementation = ::downloadQCReportByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getDownloadLabelByIDMethod(),
      implementation = ::downloadLabelByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getDownloadLabelByUUIDMethod(),
      implementation = ::downloadLabelByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getViewInventoryInteractionsMethod(),
      implementation = ::viewInventoryInteractions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getDownloadImportTemplateMethod(),
      implementation = ::downloadImportTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquipmentsServiceGrpc.getImportFromCSVMethod(),
      implementation = ::importFromCSV
    )).build()
  }
}
