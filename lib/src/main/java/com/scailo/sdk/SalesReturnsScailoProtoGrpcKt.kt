package com.scailo.sdk

import com.scailo.sdk.SalesReturnsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.SalesReturnsService.
 */
public object SalesReturnsServiceGrpcKt {
  public const val SERVICE_NAME: String = SalesReturnsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<SalesReturnsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getCreateMethod()

  public val draftMethod: MethodDescriptor<SalesReturnsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<SalesReturnsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<SalesReturnsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getSendEmailMethod()

  public val isCompletableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getIsCompletableMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getCreateMagicLinkMethod()

  public val addSalesReturnItemMethod:
      MethodDescriptor<SalesReturnsServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getAddSalesReturnItemMethod()

  public val modifySalesReturnItemMethod:
      MethodDescriptor<SalesReturnsServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getModifySalesReturnItemMethod()

  public val approveSalesReturnItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getApproveSalesReturnItemMethod()

  public val deleteSalesReturnItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getDeleteSalesReturnItemMethod()

  public val reorderSalesReturnItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getReorderSalesReturnItemsMethod()

  public val viewSalesReturnItemByIDMethod: MethodDescriptor<Identifier, SalesReturnItem>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewSalesReturnItemByIDMethod()

  public val viewSalesReturnItemByInventoryHashMethod:
      MethodDescriptor<SimpleSearchReq, SalesReturnItem>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewSalesReturnItemByInventoryHashMethod()

  public val viewApprovedSalesReturnItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, SalesReturnsItemsList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewApprovedSalesReturnItemsMethod()

  public val viewUnapprovedSalesReturnItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, SalesReturnsItemsList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewUnapprovedSalesReturnItemsMethod()

  public val viewSalesReturnItemHistoryMethod:
      MethodDescriptor<SalesReturnItemHistoryRequest, SalesReturnsItemsList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewSalesReturnItemHistoryMethod()

  public val viewPaginatedApprovedSalesReturnItemsMethod:
      MethodDescriptor<SalesReturnItemsSearchRequest, SalesReturnsServicePaginatedItemsResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewPaginatedApprovedSalesReturnItemsMethod()

  public val viewPaginatedUnapprovedSalesReturnItemsMethod:
      MethodDescriptor<SalesReturnItemsSearchRequest, SalesReturnsServicePaginatedItemsResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewPaginatedUnapprovedSalesReturnItemsMethod()

  public val searchItemsWithPaginationMethod:
      MethodDescriptor<SalesReturnItemsSearchRequest, SalesReturnsServicePaginatedItemsResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getSearchItemsWithPaginationMethod()

  public val downloadItemsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getDownloadItemsAsCSVMethod()

  public val downloadItemsTemplateAsCSVMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, SalesReturn>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, SalesReturn>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewByUUIDMethod()

  public val viewByReferenceIDMethod: MethodDescriptor<SimpleSearchReq, SalesReturn>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewByReferenceIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, SalesReturn>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, SalesReturn>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, SalesReturnsList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewFromIDsMethod()

  public val viewAncillaryParametersByUUIDMethod:
      MethodDescriptor<IdentifierUUID, SalesReturnAncillaryParameters>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, SalesReturnsList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, SalesReturnsList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<SalesReturnsServicePaginationReq, SalesReturnsServicePaginationResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewWithPaginationMethod()

  public val viewProspectiveFamiliesMethod: MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewProspectiveFamiliesMethod()

  public val filterProspectiveFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getFilterProspectiveFamiliesMethod()

  public val viewProspectiveSalesReturnItemMethod:
      MethodDescriptor<SalesReturnItemProspectiveInfoRequest, SalesReturnsServiceItemCreateRequest>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewProspectiveSalesReturnItemMethod()

  public val searchReturnableInventoryMethod:
      MethodDescriptor<SearchReturnableInventoryForIdentifierUUID, GenericInventoryList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getSearchReturnableInventoryMethod()

  public val filterReturnableInventoryMethod:
      MethodDescriptor<FilterReturnableInventoryForIdentifierUUID, GenericInventoryList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getFilterReturnableInventoryMethod()

  public val viewAssociatedCreditNoteInfoMethod:
      MethodDescriptor<IdentifierUUID, IdentifierResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewAssociatedCreditNoteInfoMethod()

  public val isBilledMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getIsBilledMethod()

  public val viewAddedFamilyQuantityForSourceMethod:
      MethodDescriptor<SalesReturnsServiceAlreadyAddedQuantityForSourceRequest, DualQuantitiesResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getDownloadByUUIDMethod()

  public val downloadLabelByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getDownloadLabelByUUIDMethod()

  public val searchAllMethod: MethodDescriptor<SalesReturnsServiceSearchAllReq, SalesReturnsList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<SalesReturnsServiceFilterReq, SalesReturnsList>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<SalesReturnsServiceCountReq, CountResponse>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<SalesReturnsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = SalesReturnsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.SalesReturnsService service as suspending coroutines.
   */
  @StubFor(SalesReturnsServiceGrpc::class)
  public class SalesReturnsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<SalesReturnsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): SalesReturnsServiceCoroutineStub
        = SalesReturnsServiceCoroutineStub(channel, callOptions)

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
    public suspend fun create(request: SalesReturnsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getCreateMethod(),
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
    public suspend fun draft(request: SalesReturnsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getDraftMethod(),
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
    public suspend fun draftUpdate(request: SalesReturnsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getDraftUpdateMethod(),
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
    public suspend fun sendForVerification(request: IdentifierUUIDWithUserComment, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getSendForVerificationMethod(),
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
    public suspend fun verify(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getVerifyMethod(),
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
    public suspend fun approve(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getApproveMethod(),
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
    public suspend fun sendForRevision(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getSendForRevisionMethod(),
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
    public suspend fun revisionUpdate(request: SalesReturnsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getRevisionUpdateMethod(),
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
    public suspend fun halt(request: IdentifierUUIDWithUserComment, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getHaltMethod(),
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
      SalesReturnsServiceGrpc.getDiscardMethod(),
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
    public suspend fun restore(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getRestoreMethod(),
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
    public suspend fun complete(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getCompleteMethod(),
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
    public suspend fun repeat(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getRepeatMethod(),
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
    public suspend fun reopen(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getReopenMethod(),
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
      SalesReturnsServiceGrpc.getCommentAddMethod(),
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
    public suspend fun sendEmail(request: IdentifierWithEmailAttributes, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getSendEmailMethod(),
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
    public suspend fun isCompletable(request: IdentifierUUID, headers: Metadata = Metadata()):
        BooleanResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getIsCompletableMethod(),
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
      SalesReturnsServiceGrpc.getCreateMagicLinkMethod(),
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
    public suspend fun addSalesReturnItem(request: SalesReturnsServiceItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getAddSalesReturnItemMethod(),
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
    public suspend fun modifySalesReturnItem(request: SalesReturnsServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getModifySalesReturnItemMethod(),
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
    public suspend fun approveSalesReturnItem(request: IdentifierWithUserComment, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getApproveSalesReturnItemMethod(),
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
    public suspend fun deleteSalesReturnItem(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getDeleteSalesReturnItemMethod(),
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
    public suspend fun reorderSalesReturnItems(request: ReorderItemsRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getReorderSalesReturnItemsMethod(),
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
    public suspend fun viewSalesReturnItemByID(request: Identifier, headers: Metadata = Metadata()):
        SalesReturnItem = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewSalesReturnItemByIDMethod(),
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
    public suspend fun viewSalesReturnItemByInventoryHash(request: SimpleSearchReq,
        headers: Metadata = Metadata()): SalesReturnItem = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewSalesReturnItemByInventoryHashMethod(),
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
    public suspend fun viewApprovedSalesReturnItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): SalesReturnsItemsList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewApprovedSalesReturnItemsMethod(),
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
    public suspend fun viewUnapprovedSalesReturnItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): SalesReturnsItemsList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewUnapprovedSalesReturnItemsMethod(),
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
    public suspend fun viewSalesReturnItemHistory(request: SalesReturnItemHistoryRequest,
        headers: Metadata = Metadata()): SalesReturnsItemsList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewSalesReturnItemHistoryMethod(),
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
    public suspend fun viewPaginatedApprovedSalesReturnItems(request: SalesReturnItemsSearchRequest,
        headers: Metadata = Metadata()): SalesReturnsServicePaginatedItemsResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewPaginatedApprovedSalesReturnItemsMethod(),
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
        fun viewPaginatedUnapprovedSalesReturnItems(request: SalesReturnItemsSearchRequest,
        headers: Metadata = Metadata()): SalesReturnsServicePaginatedItemsResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewPaginatedUnapprovedSalesReturnItemsMethod(),
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
    public suspend fun searchItemsWithPagination(request: SalesReturnItemsSearchRequest,
        headers: Metadata = Metadata()): SalesReturnsServicePaginatedItemsResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getSearchItemsWithPaginationMethod(),
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
    public suspend fun downloadItemsAsCSV(request: IdentifierUUID, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getDownloadItemsAsCSVMethod(),
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
    public suspend fun downloadItemsTemplateAsCSV(request: Empty, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
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
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): SalesReturn =
        unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewByIDMethod(),
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
        SalesReturn = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewByUUIDMethod(),
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
    public suspend fun viewByReferenceID(request: SimpleSearchReq, headers: Metadata = Metadata()):
        SalesReturn = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewByReferenceIDMethod(),
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
        SalesReturn = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewEssentialByIDMethod(),
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
        SalesReturn = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewEssentialByUUIDMethod(),
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
        SalesReturnsList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewFromIDsMethod(),
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
    public suspend fun viewAncillaryParametersByUUID(request: IdentifierUUID, headers: Metadata =
        Metadata()): SalesReturnAncillaryParameters = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
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
        SalesReturnsList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewAllMethod(),
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
    public suspend fun viewAllForEntityUUID(request: IdentifierUUID, headers: Metadata =
        Metadata()): SalesReturnsList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewAllForEntityUUIDMethod(),
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
    public suspend fun viewWithPagination(request: SalesReturnsServicePaginationReq,
        headers: Metadata = Metadata()): SalesReturnsServicePaginationResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewWithPaginationMethod(),
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
    public suspend fun viewProspectiveFamilies(request: IdentifierWithSearchKey, headers: Metadata =
        Metadata()): FamiliesList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewProspectiveFamiliesMethod(),
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
    public suspend fun filterProspectiveFamilies(request: FilterFamiliesReqForIdentifier,
        headers: Metadata = Metadata()): FamiliesList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getFilterProspectiveFamiliesMethod(),
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
        fun viewProspectiveSalesReturnItem(request: SalesReturnItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): SalesReturnsServiceItemCreateRequest = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewProspectiveSalesReturnItemMethod(),
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
        fun searchReturnableInventory(request: SearchReturnableInventoryForIdentifierUUID,
        headers: Metadata = Metadata()): GenericInventoryList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getSearchReturnableInventoryMethod(),
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
        fun filterReturnableInventory(request: FilterReturnableInventoryForIdentifierUUID,
        headers: Metadata = Metadata()): GenericInventoryList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getFilterReturnableInventoryMethod(),
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
    public suspend fun viewAssociatedCreditNoteInfo(request: IdentifierUUID, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewAssociatedCreditNoteInfoMethod(),
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
    public suspend fun isBilled(request: IdentifierUUID, headers: Metadata = Metadata()):
        BooleanResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getIsBilledMethod(),
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
        fun viewAddedFamilyQuantityForSource(request: SalesReturnsServiceAlreadyAddedQuantityForSourceRequest,
        headers: Metadata = Metadata()): DualQuantitiesResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
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
    public suspend fun isDownloadable(request: IdentifierUUID, headers: Metadata = Metadata()):
        BooleanResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getIsDownloadableMethod(),
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
    public suspend fun downloadByUUID(request: IdentifierUUID, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getDownloadByUUIDMethod(),
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
      SalesReturnsServiceGrpc.getDownloadLabelByUUIDMethod(),
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
    public suspend fun searchAll(request: SalesReturnsServiceSearchAllReq, headers: Metadata =
        Metadata()): SalesReturnsList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getSearchAllMethod(),
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
    public suspend fun filter(request: SalesReturnsServiceFilterReq, headers: Metadata =
        Metadata()): SalesReturnsList = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getFilterMethod(),
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
    public suspend fun countInStatus(request: CountInSLCStatusRequest, headers: Metadata =
        Metadata()): CountResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getCountInStatusMethod(),
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
    public suspend fun count(request: SalesReturnsServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getCountMethod(),
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
    public suspend fun downloadAsCSV(request: SalesReturnsServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      SalesReturnsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.SalesReturnsService service based on Kotlin coroutines.
   */
  public abstract class SalesReturnsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: SalesReturnsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: SalesReturnsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: SalesReturnsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.SendForVerification.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendForVerification(request: IdentifierUUIDWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Verify.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun verify(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Approve.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approve(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.SendForRevision.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendForRevision(request: IdentifierUUIDWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: SalesReturnsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Halt.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun halt(request: IdentifierUUIDWithUserComment): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Restore.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun restore(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Complete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun complete(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Repeat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun repeat(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Reopen.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reopen(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.SendEmail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendEmail(request: IdentifierWithEmailAttributes): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.IsCompletable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isCompletable(request: IdentifierUUID): BooleanResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.IsCompletable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.AddSalesReturnItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addSalesReturnItem(request: SalesReturnsServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.AddSalesReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ModifySalesReturnItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun modifySalesReturnItem(request: SalesReturnsServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ModifySalesReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ApproveSalesReturnItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveSalesReturnItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ApproveSalesReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.DeleteSalesReturnItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteSalesReturnItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.DeleteSalesReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ReorderSalesReturnItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderSalesReturnItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ReorderSalesReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewSalesReturnItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSalesReturnItemByID(request: Identifier): SalesReturnItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewSalesReturnItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesReturnsService.ViewSalesReturnItemByInventoryHash.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSalesReturnItemByInventoryHash(request: SimpleSearchReq):
        SalesReturnItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewSalesReturnItemByInventoryHash is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewApprovedSalesReturnItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedSalesReturnItems(request: IdentifierWithSearchKey):
        SalesReturnsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewApprovedSalesReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewUnapprovedSalesReturnItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedSalesReturnItems(request: IdentifierWithSearchKey):
        SalesReturnsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewUnapprovedSalesReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewSalesReturnItemHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSalesReturnItemHistory(request: SalesReturnItemHistoryRequest):
        SalesReturnsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewSalesReturnItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesReturnsService.ViewPaginatedApprovedSalesReturnItems.
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
        fun viewPaginatedApprovedSalesReturnItems(request: SalesReturnItemsSearchRequest):
        SalesReturnsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewPaginatedApprovedSalesReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesReturnsService.ViewPaginatedUnapprovedSalesReturnItems.
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
        fun viewPaginatedUnapprovedSalesReturnItems(request: SalesReturnItemsSearchRequest):
        SalesReturnsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewPaginatedUnapprovedSalesReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.SearchItemsWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchItemsWithPagination(request: SalesReturnItemsSearchRequest):
        SalesReturnsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.SearchItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.DownloadItemsAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadItemsAsCSV(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.DownloadItemsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.DownloadItemsTemplateAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadItemsTemplateAsCSV(request: Empty): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.DownloadItemsTemplateAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): SalesReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): SalesReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewByReferenceID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByReferenceID(request: SimpleSearchReq): SalesReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewByReferenceID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): SalesReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): SalesReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): SalesReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewAncillaryParametersByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAncillaryParametersByUUID(request: IdentifierUUID):
        SalesReturnAncillaryParameters = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewAncillaryParametersByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): SalesReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): SalesReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: SalesReturnsServicePaginationReq):
        SalesReturnsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewProspectiveFamilies.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewProspectiveFamilies(request: IdentifierWithSearchKey): FamiliesList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.FilterProspectiveFamilies.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filterProspectiveFamilies(request: FilterFamiliesReqForIdentifier):
        FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.FilterProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewProspectiveSalesReturnItem.
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
        fun viewProspectiveSalesReturnItem(request: SalesReturnItemProspectiveInfoRequest):
        SalesReturnsServiceItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewProspectiveSalesReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.SearchReturnableInventory.
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
        fun searchReturnableInventory(request: SearchReturnableInventoryForIdentifierUUID):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.SearchReturnableInventory is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.FilterReturnableInventory.
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
        fun filterReturnableInventory(request: FilterReturnableInventoryForIdentifierUUID):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.FilterReturnableInventory is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.ViewAssociatedCreditNoteInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAssociatedCreditNoteInfo(request: IdentifierUUID):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewAssociatedCreditNoteInfo is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.IsBilled.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isBilled(request: IdentifierUUID): BooleanResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.IsBilled is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesReturnsService.ViewAddedFamilyQuantityForSource.
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
        fun viewAddedFamilyQuantityForSource(request: SalesReturnsServiceAlreadyAddedQuantityForSourceRequest):
        DualQuantitiesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.ViewAddedFamilyQuantityForSource is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.IsDownloadable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isDownloadable(request: IdentifierUUID): BooleanResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.DownloadByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadByUUID(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.DownloadLabelByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.DownloadLabelByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: SalesReturnsServiceSearchAllReq): SalesReturnsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: SalesReturnsServiceFilterReq): SalesReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.CountInStatus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun countInStatus(request: CountInSLCStatusRequest): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: SalesReturnsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesReturnsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: SalesReturnsServiceFilterReq): StandardFile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesReturnsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getIsCompletableMethod(),
      implementation = ::isCompletable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getAddSalesReturnItemMethod(),
      implementation = ::addSalesReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getModifySalesReturnItemMethod(),
      implementation = ::modifySalesReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getApproveSalesReturnItemMethod(),
      implementation = ::approveSalesReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getDeleteSalesReturnItemMethod(),
      implementation = ::deleteSalesReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getReorderSalesReturnItemsMethod(),
      implementation = ::reorderSalesReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewSalesReturnItemByIDMethod(),
      implementation = ::viewSalesReturnItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewSalesReturnItemByInventoryHashMethod(),
      implementation = ::viewSalesReturnItemByInventoryHash
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewApprovedSalesReturnItemsMethod(),
      implementation = ::viewApprovedSalesReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewUnapprovedSalesReturnItemsMethod(),
      implementation = ::viewUnapprovedSalesReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewSalesReturnItemHistoryMethod(),
      implementation = ::viewSalesReturnItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewPaginatedApprovedSalesReturnItemsMethod(),
      implementation = ::viewPaginatedApprovedSalesReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewPaginatedUnapprovedSalesReturnItemsMethod(),
      implementation = ::viewPaginatedUnapprovedSalesReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getSearchItemsWithPaginationMethod(),
      implementation = ::searchItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getDownloadItemsAsCSVMethod(),
      implementation = ::downloadItemsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      implementation = ::downloadItemsTemplateAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewByReferenceIDMethod(),
      implementation = ::viewByReferenceID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      implementation = ::viewAncillaryParametersByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewProspectiveFamiliesMethod(),
      implementation = ::viewProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      implementation = ::filterProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewProspectiveSalesReturnItemMethod(),
      implementation = ::viewProspectiveSalesReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getSearchReturnableInventoryMethod(),
      implementation = ::searchReturnableInventory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getFilterReturnableInventoryMethod(),
      implementation = ::filterReturnableInventory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewAssociatedCreditNoteInfoMethod(),
      implementation = ::viewAssociatedCreditNoteInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getIsBilledMethod(),
      implementation = ::isBilled
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      implementation = ::viewAddedFamilyQuantityForSource
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getDownloadLabelByUUIDMethod(),
      implementation = ::downloadLabelByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesReturnsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
