package com.scailo.sdk

import com.scailo.sdk.SalesInvoicesServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.SalesInvoicesService.
 */
public object SalesInvoicesServiceGrpcKt {
  public const val SERVICE_NAME: String = SalesInvoicesServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<SalesInvoicesServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getCreateMethod()

  public val draftMethod: MethodDescriptor<SalesInvoicesServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<SalesInvoicesServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<SalesInvoicesServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getSendEmailMethod()

  public val autofillMethod:
      MethodDescriptor<SalesInvoicesServiceAutofillRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getAutofillMethod()

  public val amendMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getAmendMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getCreateMagicLinkMethod()

  public val addMultipleSalesInvoiceItemsMethod:
      MethodDescriptor<SalesInvoicesServiceMultipleItemsCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getAddMultipleSalesInvoiceItemsMethod()

  public val addSalesInvoiceItemMethod:
      MethodDescriptor<SalesInvoicesServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getAddSalesInvoiceItemMethod()

  public val modifySalesInvoiceItemMethod:
      MethodDescriptor<SalesInvoicesServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getModifySalesInvoiceItemMethod()

  public val updateSalesInvoiceItemSpecificationsMethod:
      MethodDescriptor<SalesInvoicesServiceItemSpecificationsUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getUpdateSalesInvoiceItemSpecificationsMethod()

  public val approveSalesInvoiceItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getApproveSalesInvoiceItemMethod()

  public val deleteSalesInvoiceItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getDeleteSalesInvoiceItemMethod()

  public val reorderSalesInvoiceItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getReorderSalesInvoiceItemsMethod()

  public val viewSalesInvoiceItemByIDMethod: MethodDescriptor<Identifier, SalesInvoiceItem>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewSalesInvoiceItemByIDMethod()

  public val viewApprovedSalesInvoiceItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, SalesInvoiceItemsList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewApprovedSalesInvoiceItemsMethod()

  public val viewUnapprovedSalesInvoiceItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, SalesInvoiceItemsList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewUnapprovedSalesInvoiceItemsMethod()

  public val viewSalesInvoiceItemHistoryMethod:
      MethodDescriptor<SalesInvoiceItemHistoryRequest, SalesInvoiceItemsList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewSalesInvoiceItemHistoryMethod()

  public val viewPaginatedApprovedSalesInvoiceItemsMethod:
      MethodDescriptor<SalesInvoiceItemsSearchRequest, SalesInvoicesServicePaginatedItemsResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewPaginatedApprovedSalesInvoiceItemsMethod()

  public val viewPaginatedUnapprovedSalesInvoiceItemsMethod:
      MethodDescriptor<SalesInvoiceItemsSearchRequest, SalesInvoicesServicePaginatedItemsResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewPaginatedUnapprovedSalesInvoiceItemsMethod()

  public val searchItemsWithPaginationMethod:
      MethodDescriptor<SalesInvoiceItemsSearchRequest, SalesInvoicesServicePaginatedItemsResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getSearchItemsWithPaginationMethod()

  public val downloadItemsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getDownloadItemsAsCSVMethod()

  public val downloadItemsTemplateAsCSVMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getDownloadItemsTemplateAsCSVMethod()

  public val uploadSalesInvoiceItemsMethod:
      MethodDescriptor<IdentifierUUIDWithFile, IdentifiersList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getUploadSalesInvoiceItemsMethod()

  public val addSalesInvoiceReferenceMethod:
      MethodDescriptor<SalesInvoicesServiceReferenceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getAddSalesInvoiceReferenceMethod()

  public val approveSalesInvoiceReferenceMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getApproveSalesInvoiceReferenceMethod()

  public val deleteSalesInvoiceReferenceMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getDeleteSalesInvoiceReferenceMethod()

  public val viewSalesInvoiceReferenceByIDMethod:
      MethodDescriptor<Identifier, SalesInvoiceReference>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewSalesInvoiceReferenceByIDMethod()

  public val viewSalesInvoiceReferencesMethod:
      MethodDescriptor<Identifier, SalesInvoiceReferencesList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewSalesInvoiceReferencesMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, SalesInvoice>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, SalesInvoice>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewByUUIDMethod()

  public val viewByReferenceIDMethod: MethodDescriptor<SimpleSearchReq, SalesInvoice>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewByReferenceIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, SalesInvoice>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, SalesInvoice>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, SalesInvoicesList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewFromIDsMethod()

  public val viewAncillaryParametersByUUIDMethod:
      MethodDescriptor<IdentifierUUID, SalesInvoiceAncillaryParameters>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewAncillaryParametersByUUIDMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, SalesInvoicesList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, SalesInvoicesList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<SalesInvoicesServicePaginationReq, SalesInvoicesServicePaginationResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewWithPaginationMethod()

  public val viewAmendmentsMethod: MethodDescriptor<Identifier, AmendmentLogsList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewAmendmentsMethod()

  public val viewProspectiveFamiliesMethod: MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewProspectiveFamiliesMethod()

  public val filterProspectiveFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getFilterProspectiveFamiliesMethod()

  public val viewProspectiveSalesInvoiceItemMethod:
      MethodDescriptor<SalesInvoiceItemProspectiveInfoRequest, SalesInvoicesServiceItemCreateRequest>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewProspectiveSalesInvoiceItemMethod()

  public val viewDispatchedStatisticsMethod:
      MethodDescriptor<IdentifierUUID, SalesInvoiceDispatchedStatisticsList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewDispatchedStatisticsMethod()

  public val viewAddedFamilyQuantityForSourceMethod:
      MethodDescriptor<SalesInvoicesServiceAlreadyAddedQuantityForSourceRequest, DualQuantitiesResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getViewAddedFamilyQuantityForSourceMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getDownloadByUUIDMethod()

  public val searchAllMethod: MethodDescriptor<SalesInvoicesServiceSearchAllReq, SalesInvoicesList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<SalesInvoicesServiceFilterReq, SalesInvoicesList>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<SalesInvoicesServiceCountReq, CountResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getCountMethod()

  public val accruedValueMethod: MethodDescriptor<SalesInvoicesServiceCountReq, SumResponse>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getAccruedValueMethod()

  public val downloadAsCSVMethod: MethodDescriptor<SalesInvoicesServiceFilterReq, StandardFile>
    @JvmStatic
    get() = SalesInvoicesServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.SalesInvoicesService service as suspending coroutines.
   */
  @StubFor(SalesInvoicesServiceGrpc::class)
  public class SalesInvoicesServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<SalesInvoicesServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        SalesInvoicesServiceCoroutineStub = SalesInvoicesServiceCoroutineStub(channel, callOptions)

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
    public suspend fun create(request: SalesInvoicesServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getCreateMethod(),
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
    public suspend fun draft(request: SalesInvoicesServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getDraftMethod(),
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
    public suspend fun draftUpdate(request: SalesInvoicesServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getDraftUpdateMethod(),
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
      SalesInvoicesServiceGrpc.getSendForVerificationMethod(),
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
      SalesInvoicesServiceGrpc.getVerifyMethod(),
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
      SalesInvoicesServiceGrpc.getApproveMethod(),
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
      SalesInvoicesServiceGrpc.getSendForRevisionMethod(),
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
    public suspend fun revisionUpdate(request: SalesInvoicesServiceUpdateRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getRevisionUpdateMethod(),
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
      SalesInvoicesServiceGrpc.getHaltMethod(),
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
      SalesInvoicesServiceGrpc.getDiscardMethod(),
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
      SalesInvoicesServiceGrpc.getRestoreMethod(),
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
      SalesInvoicesServiceGrpc.getCompleteMethod(),
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
      SalesInvoicesServiceGrpc.getRepeatMethod(),
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
      SalesInvoicesServiceGrpc.getReopenMethod(),
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
      SalesInvoicesServiceGrpc.getCommentAddMethod(),
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
      SalesInvoicesServiceGrpc.getSendEmailMethod(),
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
    public suspend fun autofill(request: SalesInvoicesServiceAutofillRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getAutofillMethod(),
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
    public suspend fun amend(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getAmendMethod(),
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
      SalesInvoicesServiceGrpc.getCreateMagicLinkMethod(),
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
        fun addMultipleSalesInvoiceItems(request: SalesInvoicesServiceMultipleItemsCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getAddMultipleSalesInvoiceItemsMethod(),
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
    public suspend fun addSalesInvoiceItem(request: SalesInvoicesServiceItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getAddSalesInvoiceItemMethod(),
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
    public suspend fun modifySalesInvoiceItem(request: SalesInvoicesServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getModifySalesInvoiceItemMethod(),
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
        fun updateSalesInvoiceItemSpecifications(request: SalesInvoicesServiceItemSpecificationsUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getUpdateSalesInvoiceItemSpecificationsMethod(),
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
    public suspend fun approveSalesInvoiceItem(request: IdentifierWithUserComment, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getApproveSalesInvoiceItemMethod(),
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
    public suspend fun deleteSalesInvoiceItem(request: IdentifierWithUserComment, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getDeleteSalesInvoiceItemMethod(),
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
    public suspend fun reorderSalesInvoiceItems(request: ReorderItemsRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getReorderSalesInvoiceItemsMethod(),
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
    public suspend fun viewSalesInvoiceItemByID(request: Identifier, headers: Metadata =
        Metadata()): SalesInvoiceItem = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewSalesInvoiceItemByIDMethod(),
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
    public suspend fun viewApprovedSalesInvoiceItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): SalesInvoiceItemsList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewApprovedSalesInvoiceItemsMethod(),
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
    public suspend fun viewUnapprovedSalesInvoiceItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): SalesInvoiceItemsList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewUnapprovedSalesInvoiceItemsMethod(),
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
    public suspend fun viewSalesInvoiceItemHistory(request: SalesInvoiceItemHistoryRequest,
        headers: Metadata = Metadata()): SalesInvoiceItemsList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewSalesInvoiceItemHistoryMethod(),
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
        fun viewPaginatedApprovedSalesInvoiceItems(request: SalesInvoiceItemsSearchRequest,
        headers: Metadata = Metadata()): SalesInvoicesServicePaginatedItemsResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewPaginatedApprovedSalesInvoiceItemsMethod(),
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
        fun viewPaginatedUnapprovedSalesInvoiceItems(request: SalesInvoiceItemsSearchRequest,
        headers: Metadata = Metadata()): SalesInvoicesServicePaginatedItemsResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewPaginatedUnapprovedSalesInvoiceItemsMethod(),
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
    public suspend fun searchItemsWithPagination(request: SalesInvoiceItemsSearchRequest,
        headers: Metadata = Metadata()): SalesInvoicesServicePaginatedItemsResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getSearchItemsWithPaginationMethod(),
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
      SalesInvoicesServiceGrpc.getDownloadItemsAsCSVMethod(),
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
      SalesInvoicesServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
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
    public suspend fun uploadSalesInvoiceItems(request: IdentifierUUIDWithFile, headers: Metadata =
        Metadata()): IdentifiersList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getUploadSalesInvoiceItemsMethod(),
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
    public suspend fun addSalesInvoiceReference(request: SalesInvoicesServiceReferenceCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getAddSalesInvoiceReferenceMethod(),
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
    public suspend fun approveSalesInvoiceReference(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getApproveSalesInvoiceReferenceMethod(),
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
    public suspend fun deleteSalesInvoiceReference(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getDeleteSalesInvoiceReferenceMethod(),
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
    public suspend fun viewSalesInvoiceReferenceByID(request: Identifier, headers: Metadata =
        Metadata()): SalesInvoiceReference = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewSalesInvoiceReferenceByIDMethod(),
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
    public suspend fun viewSalesInvoiceReferences(request: Identifier, headers: Metadata =
        Metadata()): SalesInvoiceReferencesList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewSalesInvoiceReferencesMethod(),
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
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): SalesInvoice =
        unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewByIDMethod(),
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
        SalesInvoice = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewByUUIDMethod(),
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
        SalesInvoice = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewByReferenceIDMethod(),
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
        SalesInvoice = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewEssentialByIDMethod(),
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
        SalesInvoice = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewEssentialByUUIDMethod(),
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
        SalesInvoicesList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewFromIDsMethod(),
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
        Metadata()): SalesInvoiceAncillaryParameters = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
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
        SalesInvoicesList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewAllMethod(),
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
        Metadata()): SalesInvoicesList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewAllForEntityUUIDMethod(),
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
    public suspend fun viewWithPagination(request: SalesInvoicesServicePaginationReq,
        headers: Metadata = Metadata()): SalesInvoicesServicePaginationResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewWithPaginationMethod(),
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
    public suspend fun viewAmendments(request: Identifier, headers: Metadata = Metadata()):
        AmendmentLogsList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewAmendmentsMethod(),
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
      SalesInvoicesServiceGrpc.getViewProspectiveFamiliesMethod(),
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
      SalesInvoicesServiceGrpc.getFilterProspectiveFamiliesMethod(),
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
        fun viewProspectiveSalesInvoiceItem(request: SalesInvoiceItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): SalesInvoicesServiceItemCreateRequest = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewProspectiveSalesInvoiceItemMethod(),
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
    public suspend fun viewDispatchedStatistics(request: IdentifierUUID, headers: Metadata =
        Metadata()): SalesInvoiceDispatchedStatisticsList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewDispatchedStatisticsMethod(),
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
        fun viewAddedFamilyQuantityForSource(request: SalesInvoicesServiceAlreadyAddedQuantityForSourceRequest,
        headers: Metadata = Metadata()): DualQuantitiesResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
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
      SalesInvoicesServiceGrpc.getIsDownloadableMethod(),
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
      SalesInvoicesServiceGrpc.getDownloadByUUIDMethod(),
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
    public suspend fun searchAll(request: SalesInvoicesServiceSearchAllReq, headers: Metadata =
        Metadata()): SalesInvoicesList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getSearchAllMethod(),
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
    public suspend fun filter(request: SalesInvoicesServiceFilterReq, headers: Metadata =
        Metadata()): SalesInvoicesList = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getFilterMethod(),
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
      SalesInvoicesServiceGrpc.getCountInStatusMethod(),
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
    public suspend fun count(request: SalesInvoicesServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getCountMethod(),
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
    public suspend fun accruedValue(request: SalesInvoicesServiceCountReq, headers: Metadata =
        Metadata()): SumResponse = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getAccruedValueMethod(),
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
    public suspend fun downloadAsCSV(request: SalesInvoicesServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      SalesInvoicesServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.SalesInvoicesService service based on Kotlin coroutines.
   */
  public abstract class SalesInvoicesServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: SalesInvoicesServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: SalesInvoicesServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: SalesInvoicesServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: SalesInvoicesServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.SendEmail.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Autofill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun autofill(request: SalesInvoicesServiceAutofillRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Autofill is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Amend.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun amend(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Amend is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.AddMultipleSalesInvoiceItems.
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
        fun addMultipleSalesInvoiceItems(request: SalesInvoicesServiceMultipleItemsCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.AddMultipleSalesInvoiceItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.AddSalesInvoiceItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addSalesInvoiceItem(request: SalesInvoicesServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.AddSalesInvoiceItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ModifySalesInvoiceItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun modifySalesInvoiceItem(request: SalesInvoicesServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ModifySalesInvoiceItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesInvoicesService.UpdateSalesInvoiceItemSpecifications.
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
        fun updateSalesInvoiceItemSpecifications(request: SalesInvoicesServiceItemSpecificationsUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.UpdateSalesInvoiceItemSpecifications is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ApproveSalesInvoiceItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveSalesInvoiceItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ApproveSalesInvoiceItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.DeleteSalesInvoiceItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteSalesInvoiceItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.DeleteSalesInvoiceItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ReorderSalesInvoiceItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderSalesInvoiceItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ReorderSalesInvoiceItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewSalesInvoiceItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSalesInvoiceItemByID(request: Identifier): SalesInvoiceItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewSalesInvoiceItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewApprovedSalesInvoiceItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedSalesInvoiceItems(request: IdentifierWithSearchKey):
        SalesInvoiceItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewApprovedSalesInvoiceItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesInvoicesService.ViewUnapprovedSalesInvoiceItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedSalesInvoiceItems(request: IdentifierWithSearchKey):
        SalesInvoiceItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewUnapprovedSalesInvoiceItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewSalesInvoiceItemHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSalesInvoiceItemHistory(request: SalesInvoiceItemHistoryRequest):
        SalesInvoiceItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewSalesInvoiceItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesInvoicesService.ViewPaginatedApprovedSalesInvoiceItems.
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
        fun viewPaginatedApprovedSalesInvoiceItems(request: SalesInvoiceItemsSearchRequest):
        SalesInvoicesServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewPaginatedApprovedSalesInvoiceItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesInvoicesService.ViewPaginatedUnapprovedSalesInvoiceItems.
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
        fun viewPaginatedUnapprovedSalesInvoiceItems(request: SalesInvoiceItemsSearchRequest):
        SalesInvoicesServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewPaginatedUnapprovedSalesInvoiceItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.SearchItemsWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchItemsWithPagination(request: SalesInvoiceItemsSearchRequest):
        SalesInvoicesServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.SearchItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.DownloadItemsAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.DownloadItemsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.DownloadItemsTemplateAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.DownloadItemsTemplateAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.UploadSalesInvoiceItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadSalesInvoiceItems(request: IdentifierUUIDWithFile):
        IdentifiersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.UploadSalesInvoiceItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.AddSalesInvoiceReference.
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
        fun addSalesInvoiceReference(request: SalesInvoicesServiceReferenceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.AddSalesInvoiceReference is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ApproveSalesInvoiceReference.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveSalesInvoiceReference(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ApproveSalesInvoiceReference is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.DeleteSalesInvoiceReference.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteSalesInvoiceReference(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.DeleteSalesInvoiceReference is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewSalesInvoiceReferenceByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSalesInvoiceReferenceByID(request: Identifier):
        SalesInvoiceReference = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewSalesInvoiceReferenceByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewSalesInvoiceReferences.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSalesInvoiceReferences(request: Identifier):
        SalesInvoiceReferencesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewSalesInvoiceReferences is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): SalesInvoice = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): SalesInvoice = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewByReferenceID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByReferenceID(request: SimpleSearchReq): SalesInvoice = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewByReferenceID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): SalesInvoice = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): SalesInvoice = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): SalesInvoicesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewAncillaryParametersByUUID.
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
        SalesInvoiceAncillaryParameters = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewAncillaryParametersByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): SalesInvoicesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): SalesInvoicesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: SalesInvoicesServicePaginationReq):
        SalesInvoicesServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewAmendments.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAmendments(request: Identifier): AmendmentLogsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewAmendments is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.FilterProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.FilterProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesInvoicesService.ViewProspectiveSalesInvoiceItem.
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
        fun viewProspectiveSalesInvoiceItem(request: SalesInvoiceItemProspectiveInfoRequest):
        SalesInvoicesServiceItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewProspectiveSalesInvoiceItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.ViewDispatchedStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewDispatchedStatistics(request: IdentifierUUID):
        SalesInvoiceDispatchedStatisticsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewDispatchedStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.SalesInvoicesService.ViewAddedFamilyQuantityForSource.
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
        fun viewAddedFamilyQuantityForSource(request: SalesInvoicesServiceAlreadyAddedQuantityForSourceRequest):
        DualQuantitiesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.ViewAddedFamilyQuantityForSource is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: SalesInvoicesServiceSearchAllReq): SalesInvoicesList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: SalesInvoicesServiceFilterReq): SalesInvoicesList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: SalesInvoicesServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.AccruedValue.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun accruedValue(request: SalesInvoicesServiceCountReq): SumResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.AccruedValue is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.SalesInvoicesService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: SalesInvoicesServiceFilterReq): StandardFile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.SalesInvoicesService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getAutofillMethod(),
      implementation = ::autofill
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getAmendMethod(),
      implementation = ::amend
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getAddMultipleSalesInvoiceItemsMethod(),
      implementation = ::addMultipleSalesInvoiceItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getAddSalesInvoiceItemMethod(),
      implementation = ::addSalesInvoiceItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getModifySalesInvoiceItemMethod(),
      implementation = ::modifySalesInvoiceItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getUpdateSalesInvoiceItemSpecificationsMethod(),
      implementation = ::updateSalesInvoiceItemSpecifications
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getApproveSalesInvoiceItemMethod(),
      implementation = ::approveSalesInvoiceItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getDeleteSalesInvoiceItemMethod(),
      implementation = ::deleteSalesInvoiceItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getReorderSalesInvoiceItemsMethod(),
      implementation = ::reorderSalesInvoiceItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewSalesInvoiceItemByIDMethod(),
      implementation = ::viewSalesInvoiceItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewApprovedSalesInvoiceItemsMethod(),
      implementation = ::viewApprovedSalesInvoiceItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewUnapprovedSalesInvoiceItemsMethod(),
      implementation = ::viewUnapprovedSalesInvoiceItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewSalesInvoiceItemHistoryMethod(),
      implementation = ::viewSalesInvoiceItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewPaginatedApprovedSalesInvoiceItemsMethod(),
      implementation = ::viewPaginatedApprovedSalesInvoiceItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewPaginatedUnapprovedSalesInvoiceItemsMethod(),
      implementation = ::viewPaginatedUnapprovedSalesInvoiceItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getSearchItemsWithPaginationMethod(),
      implementation = ::searchItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getDownloadItemsAsCSVMethod(),
      implementation = ::downloadItemsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      implementation = ::downloadItemsTemplateAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getUploadSalesInvoiceItemsMethod(),
      implementation = ::uploadSalesInvoiceItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getAddSalesInvoiceReferenceMethod(),
      implementation = ::addSalesInvoiceReference
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getApproveSalesInvoiceReferenceMethod(),
      implementation = ::approveSalesInvoiceReference
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getDeleteSalesInvoiceReferenceMethod(),
      implementation = ::deleteSalesInvoiceReference
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewSalesInvoiceReferenceByIDMethod(),
      implementation = ::viewSalesInvoiceReferenceByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewSalesInvoiceReferencesMethod(),
      implementation = ::viewSalesInvoiceReferences
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewByReferenceIDMethod(),
      implementation = ::viewByReferenceID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      implementation = ::viewAncillaryParametersByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewAmendmentsMethod(),
      implementation = ::viewAmendments
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewProspectiveFamiliesMethod(),
      implementation = ::viewProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getFilterProspectiveFamiliesMethod(),
      implementation = ::filterProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewProspectiveSalesInvoiceItemMethod(),
      implementation = ::viewProspectiveSalesInvoiceItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewDispatchedStatisticsMethod(),
      implementation = ::viewDispatchedStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      implementation = ::viewAddedFamilyQuantityForSource
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getAccruedValueMethod(),
      implementation = ::accruedValue
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SalesInvoicesServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
