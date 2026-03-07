package com.scailo.sdk

import com.scailo.sdk.MerchandisesServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.MerchandisesService.
 */
public object MerchandisesServiceGrpcKt {
  public const val SERVICE_NAME: String = MerchandisesServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<MerchandisesServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getCreateMethod()

  public val sendToStoreMethod:
      MethodDescriptor<MerchandisesServiceSendToStoreRequest, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getSendToStoreMethod()

  public val updateMethod: MethodDescriptor<MerchandisesServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getUpdateMethod()

  public val sendForReworkMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getSendForReworkMethod()

  public val sendForQCMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getSendForQCMethod()

  public val splitLotMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getSplitLotMethod()

  public val partitionMethod: MethodDescriptor<InventoryPartitionRequest, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getPartitionMethod()

  public val consumeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getConsumeMethod()

  public val rejectMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getRejectMethod()

  public val scrapMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getScrapMethod()

  public val returnMaterialMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getReturnMaterialMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getDiscardMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getCommentAddMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getCreateMagicLinkMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, Merchandise>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, Merchandise>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, Merchandise>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, Merchandise>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, MerchandisesList>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getViewFromIDsMethod()

  public val viewFromUUIDsMethod: MethodDescriptor<IdentifierUUIDsList, MerchandisesList>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getViewFromUUIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, MerchandisesList>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getViewAllMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<MerchandisesServicePaginationReq, MerchandisesServicePaginationResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getViewWithPaginationMethod()

  public val downloadQCReportByIDMethod: MethodDescriptor<Identifier, StandardFile>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getDownloadQCReportByIDMethod()

  public val downloadQCReportByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getDownloadQCReportByUUIDMethod()

  public val downloadLabelByIDMethod: MethodDescriptor<Identifier, StandardFile>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getDownloadLabelByIDMethod()

  public val downloadLabelByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getDownloadLabelByUUIDMethod()

  public val viewInventoryInteractionsMethod:
      MethodDescriptor<IdentifierUUID, InventoryInteractionsList>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getViewInventoryInteractionsMethod()

  public val searchAllMethod: MethodDescriptor<MerchandisesServiceSearchAllReq, MerchandisesList>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<MerchandisesServiceFilterReq, MerchandisesList>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getFilterMethod()

  public val countMethod: MethodDescriptor<MerchandisesServiceCountReq, CountResponse>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<MerchandisesServiceFilterReq, StandardFile>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getDownloadAsCSVMethod()

  public val downloadImportTemplateMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getDownloadImportTemplateMethod()

  public val importFromCSVMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = MerchandisesServiceGrpc.getImportFromCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.MerchandisesService service as suspending coroutines.
   */
  @StubFor(MerchandisesServiceGrpc::class)
  public class MerchandisesServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MerchandisesServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): MerchandisesServiceCoroutineStub
        = MerchandisesServiceCoroutineStub(channel, callOptions)

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
    public suspend fun create(request: MerchandisesServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getCreateMethod(),
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
    public suspend fun sendToStore(request: MerchandisesServiceSendToStoreRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getSendToStoreMethod(),
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
    public suspend fun update(request: MerchandisesServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getUpdateMethod(),
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
      MerchandisesServiceGrpc.getSendForReworkMethod(),
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
      MerchandisesServiceGrpc.getSendForQCMethod(),
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
      MerchandisesServiceGrpc.getSplitLotMethod(),
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
      MerchandisesServiceGrpc.getPartitionMethod(),
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
      MerchandisesServiceGrpc.getConsumeMethod(),
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
      MerchandisesServiceGrpc.getRejectMethod(),
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
      MerchandisesServiceGrpc.getScrapMethod(),
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
      MerchandisesServiceGrpc.getReturnMaterialMethod(),
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
      MerchandisesServiceGrpc.getDiscardMethod(),
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
      MerchandisesServiceGrpc.getCommentAddMethod(),
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
      MerchandisesServiceGrpc.getCreateMagicLinkMethod(),
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
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): Merchandise =
        unaryRpc(
      channel,
      MerchandisesServiceGrpc.getViewByIDMethod(),
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
        Merchandise = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getViewByUUIDMethod(),
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
        Merchandise = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getViewEssentialByIDMethod(),
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
        Merchandise = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getViewEssentialByUUIDMethod(),
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
        MerchandisesList = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getViewFromIDsMethod(),
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
        MerchandisesList = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getViewFromUUIDsMethod(),
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
        MerchandisesList = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getViewAllMethod(),
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
    public suspend fun viewWithPagination(request: MerchandisesServicePaginationReq,
        headers: Metadata = Metadata()): MerchandisesServicePaginationResponse = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getViewWithPaginationMethod(),
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
      MerchandisesServiceGrpc.getDownloadQCReportByIDMethod(),
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
      MerchandisesServiceGrpc.getDownloadQCReportByUUIDMethod(),
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
      MerchandisesServiceGrpc.getDownloadLabelByIDMethod(),
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
      MerchandisesServiceGrpc.getDownloadLabelByUUIDMethod(),
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
      MerchandisesServiceGrpc.getViewInventoryInteractionsMethod(),
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
    public suspend fun searchAll(request: MerchandisesServiceSearchAllReq, headers: Metadata =
        Metadata()): MerchandisesList = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getSearchAllMethod(),
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
    public suspend fun filter(request: MerchandisesServiceFilterReq, headers: Metadata =
        Metadata()): MerchandisesList = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getFilterMethod(),
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
    public suspend fun count(request: MerchandisesServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getCountMethod(),
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
    public suspend fun downloadAsCSV(request: MerchandisesServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      MerchandisesServiceGrpc.getDownloadAsCSVMethod(),
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
      MerchandisesServiceGrpc.getDownloadImportTemplateMethod(),
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
      MerchandisesServiceGrpc.getImportFromCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.MerchandisesService service based on Kotlin coroutines.
   */
  public abstract class MerchandisesServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: MerchandisesServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.SendToStore.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendToStore(request: MerchandisesServiceSendToStoreRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.SendToStore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.Update.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun update(request: MerchandisesServiceUpdateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.Update is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.SendForRework.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.SendForRework is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.SendForQC.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.SendForQC is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.SplitLot.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.SplitLot is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.Partition.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.Partition is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.Consume.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.Consume is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.Reject.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.Reject is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.Scrap.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.Scrap is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ReturnMaterial.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ReturnMaterial is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): Merchandise = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): Merchandise = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): Merchandise = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): Merchandise = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): MerchandisesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ViewFromUUIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromUUIDs(request: IdentifierUUIDsList): MerchandisesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ViewFromUUIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): MerchandisesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: MerchandisesServicePaginationReq):
        MerchandisesServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.DownloadQCReportByID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.DownloadQCReportByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.DownloadQCReportByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.DownloadQCReportByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.DownloadLabelByID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.DownloadLabelByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.DownloadLabelByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.DownloadLabelByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ViewInventoryInteractions.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ViewInventoryInteractions is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: MerchandisesServiceSearchAllReq): MerchandisesList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: MerchandisesServiceFilterReq): MerchandisesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: MerchandisesServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: MerchandisesServiceFilterReq): StandardFile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.DownloadAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.DownloadImportTemplate.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.DownloadImportTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MerchandisesService.ImportFromCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MerchandisesService.ImportFromCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getSendToStoreMethod(),
      implementation = ::sendToStore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getUpdateMethod(),
      implementation = ::update
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getSendForReworkMethod(),
      implementation = ::sendForRework
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getSendForQCMethod(),
      implementation = ::sendForQC
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getSplitLotMethod(),
      implementation = ::splitLot
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getPartitionMethod(),
      implementation = ::partition
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getConsumeMethod(),
      implementation = ::consume
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getRejectMethod(),
      implementation = ::reject
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getScrapMethod(),
      implementation = ::scrap
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getReturnMaterialMethod(),
      implementation = ::returnMaterial
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getViewFromUUIDsMethod(),
      implementation = ::viewFromUUIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getDownloadQCReportByIDMethod(),
      implementation = ::downloadQCReportByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getDownloadQCReportByUUIDMethod(),
      implementation = ::downloadQCReportByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getDownloadLabelByIDMethod(),
      implementation = ::downloadLabelByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getDownloadLabelByUUIDMethod(),
      implementation = ::downloadLabelByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getViewInventoryInteractionsMethod(),
      implementation = ::viewInventoryInteractions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getDownloadImportTemplateMethod(),
      implementation = ::downloadImportTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MerchandisesServiceGrpc.getImportFromCSVMethod(),
      implementation = ::importFromCSV
    )).build()
  }
}
