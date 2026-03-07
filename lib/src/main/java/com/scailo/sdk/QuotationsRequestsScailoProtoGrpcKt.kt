package com.scailo.sdk

import com.scailo.sdk.QuotationsRequestsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.QuotationsRequestsService.
 */
public object QuotationsRequestsServiceGrpcKt {
  public const val SERVICE_NAME: String = QuotationsRequestsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<QuotationsRequestsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getCreateMethod()

  public val draftMethod:
      MethodDescriptor<QuotationsRequestsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<QuotationsRequestsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<QuotationsRequestsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<RepeatWithDeliveryDate, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getCommentAddMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getCreateMagicLinkMethod()

  public val autofillMethod:
      MethodDescriptor<QuotationsRequestsServiceAutofillRequest, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getAutofillMethod()

  public val addQuotationRequestItemMethod:
      MethodDescriptor<QuotationsRequestsServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getAddQuotationRequestItemMethod()

  public val modifyQuotationRequestItemMethod:
      MethodDescriptor<QuotationsRequestsServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getModifyQuotationRequestItemMethod()

  public val approveQuotationRequestItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getApproveQuotationRequestItemMethod()

  public val deleteQuotationRequestItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getDeleteQuotationRequestItemMethod()

  public val reorderQuotationRequestItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getReorderQuotationRequestItemsMethod()

  public val viewQuotationRequestItemByIDMethod: MethodDescriptor<Identifier, QuotationRequestItem>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewQuotationRequestItemByIDMethod()

  public val viewApprovedQuotationRequestItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, QuotationsRequestsItemsList>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewApprovedQuotationRequestItemsMethod()

  public val viewUnapprovedQuotationRequestItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, QuotationsRequestsItemsList>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewUnapprovedQuotationRequestItemsMethod()

  public val viewQuotationRequestItemHistoryMethod:
      MethodDescriptor<QuotationRequestItemHistoryRequest, QuotationsRequestsItemsList>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewQuotationRequestItemHistoryMethod()

  public val viewPaginatedApprovedQuotationRequestItemsMethod:
      MethodDescriptor<QuotationRequestItemsSearchRequest, QuotationsRequestsServicePaginatedItemsResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewPaginatedApprovedQuotationRequestItemsMethod()

  public val viewPaginatedUnapprovedQuotationRequestItemsMethod:
      MethodDescriptor<QuotationRequestItemsSearchRequest, QuotationsRequestsServicePaginatedItemsResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewPaginatedUnapprovedQuotationRequestItemsMethod()

  public val searchItemsWithPaginationMethod:
      MethodDescriptor<QuotationRequestItemsSearchRequest, QuotationsRequestsServicePaginatedItemsResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getSearchItemsWithPaginationMethod()

  public val downloadItemsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getDownloadItemsAsCSVMethod()

  public val downloadItemsTemplateAsCSVMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getDownloadItemsTemplateAsCSVMethod()

  public val uploadQuotationRequestItemsMethod:
      MethodDescriptor<IdentifierUUIDWithFile, IdentifiersList>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getUploadQuotationRequestItemsMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, QuotationRequest>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, QuotationRequest>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewByUUIDMethod()

  public val viewByReferenceIDMethod: MethodDescriptor<SimpleSearchReq, QuotationRequest>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewByReferenceIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, QuotationRequest>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, QuotationRequest>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, QuotationsRequestsList>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewFromIDsMethod()

  public val viewAncillaryParametersByUUIDMethod:
      MethodDescriptor<IdentifierUUID, QuotationRequestAncillaryParameters>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewAncillaryParametersByUUIDMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, QuotationsRequestsList>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, QuotationsRequestsList>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<QuotationsRequestsServicePaginationReq, QuotationsRequestsServicePaginationResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getViewWithPaginationMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getDownloadByUUIDMethod()

  public val searchAllMethod:
      MethodDescriptor<QuotationsRequestsServiceSearchAllReq, QuotationsRequestsList>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<QuotationsRequestsServiceFilterReq, QuotationsRequestsList>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<QuotationsRequestsServiceCountReq, CountResponse>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<QuotationsRequestsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = QuotationsRequestsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.QuotationsRequestsService service as suspending
   * coroutines.
   */
  @StubFor(QuotationsRequestsServiceGrpc::class)
  public class QuotationsRequestsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<QuotationsRequestsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        QuotationsRequestsServiceCoroutineStub = QuotationsRequestsServiceCoroutineStub(channel,
        callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: QuotationsRequestsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: QuotationsRequestsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: QuotationsRequestsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: QuotationsRequestsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun repeat(request: RepeatWithDeliveryDate, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getCreateMagicLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun autofill(request: QuotationsRequestsServiceAutofillRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getAutofillMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addQuotationRequestItem(request: QuotationsRequestsServiceItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getAddQuotationRequestItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyQuotationRequestItem(request: QuotationsRequestsServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getModifyQuotationRequestItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveQuotationRequestItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getApproveQuotationRequestItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteQuotationRequestItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getDeleteQuotationRequestItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderQuotationRequestItems(request: ReorderItemsRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getReorderQuotationRequestItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewQuotationRequestItemByID(request: Identifier, headers: Metadata =
        Metadata()): QuotationRequestItem = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewQuotationRequestItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedQuotationRequestItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): QuotationsRequestsItemsList = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewApprovedQuotationRequestItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnapprovedQuotationRequestItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): QuotationsRequestsItemsList = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewUnapprovedQuotationRequestItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewQuotationRequestItemHistory(request: QuotationRequestItemHistoryRequest,
        headers: Metadata = Metadata()): QuotationsRequestsItemsList = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewQuotationRequestItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedQuotationRequestItems(request: QuotationRequestItemsSearchRequest,
        headers: Metadata = Metadata()): QuotationsRequestsServicePaginatedItemsResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewPaginatedApprovedQuotationRequestItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedQuotationRequestItems(request: QuotationRequestItemsSearchRequest,
        headers: Metadata = Metadata()): QuotationsRequestsServicePaginatedItemsResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewPaginatedUnapprovedQuotationRequestItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchItemsWithPagination(request: QuotationRequestItemsSearchRequest,
        headers: Metadata = Metadata()): QuotationsRequestsServicePaginatedItemsResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getSearchItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getDownloadItemsAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadQuotationRequestItems(request: IdentifierUUIDWithFile,
        headers: Metadata = Metadata()): IdentifiersList = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getUploadQuotationRequestItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()):
        QuotationRequest = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        QuotationRequest = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        QuotationRequest = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewByReferenceIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        QuotationRequest = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        QuotationRequest = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        QuotationsRequestsList = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): QuotationRequestAncillaryParameters = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        QuotationsRequestsList = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): QuotationsRequestsList = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: QuotationsRequestsServicePaginationReq,
        headers: Metadata = Metadata()): QuotationsRequestsServicePaginationResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getIsDownloadableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getDownloadByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: QuotationsRequestsServiceSearchAllReq, headers: Metadata =
        Metadata()): QuotationsRequestsList = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: QuotationsRequestsServiceFilterReq, headers: Metadata =
        Metadata()): QuotationsRequestsList = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      QuotationsRequestsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: QuotationsRequestsServiceCountReq, headers: Metadata =
        Metadata()): CountResponse = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: QuotationsRequestsServiceFilterReq, headers: Metadata
        = Metadata()): StandardFile = unaryRpc(
      channel,
      QuotationsRequestsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.QuotationsRequestsService service based on Kotlin
   * coroutines.
   */
  public abstract class QuotationsRequestsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: QuotationsRequestsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: QuotationsRequestsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: QuotationsRequestsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: QuotationsRequestsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Repeat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun repeat(request: RepeatWithDeliveryDate): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Autofill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun autofill(request: QuotationsRequestsServiceAutofillRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Autofill is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.AddQuotationRequestItem.
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
        fun addQuotationRequestItem(request: QuotationsRequestsServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.AddQuotationRequestItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ModifyQuotationRequestItem.
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
        fun modifyQuotationRequestItem(request: QuotationsRequestsServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ModifyQuotationRequestItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ApproveQuotationRequestItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveQuotationRequestItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ApproveQuotationRequestItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.DeleteQuotationRequestItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteQuotationRequestItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.DeleteQuotationRequestItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ReorderQuotationRequestItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderQuotationRequestItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ReorderQuotationRequestItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ViewQuotationRequestItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewQuotationRequestItemByID(request: Identifier): QuotationRequestItem
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewQuotationRequestItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ViewApprovedQuotationRequestItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedQuotationRequestItems(request: IdentifierWithSearchKey):
        QuotationsRequestsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewApprovedQuotationRequestItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ViewUnapprovedQuotationRequestItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedQuotationRequestItems(request: IdentifierWithSearchKey):
        QuotationsRequestsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewUnapprovedQuotationRequestItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ViewQuotationRequestItemHistory.
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
        fun viewQuotationRequestItemHistory(request: QuotationRequestItemHistoryRequest):
        QuotationsRequestsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewQuotationRequestItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ViewPaginatedApprovedQuotationRequestItems.
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
        fun viewPaginatedApprovedQuotationRequestItems(request: QuotationRequestItemsSearchRequest):
        QuotationsRequestsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewPaginatedApprovedQuotationRequestItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ViewPaginatedUnapprovedQuotationRequestItems.
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
        fun viewPaginatedUnapprovedQuotationRequestItems(request: QuotationRequestItemsSearchRequest):
        QuotationsRequestsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewPaginatedUnapprovedQuotationRequestItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.SearchItemsWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchItemsWithPagination(request: QuotationRequestItemsSearchRequest):
        QuotationsRequestsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.SearchItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.DownloadItemsAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.DownloadItemsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.DownloadItemsTemplateAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.DownloadItemsTemplateAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.UploadQuotationRequestItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadQuotationRequestItems(request: IdentifierUUIDWithFile):
        IdentifiersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.UploadQuotationRequestItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): QuotationRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): QuotationRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.ViewByReferenceID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByReferenceID(request: SimpleSearchReq): QuotationRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewByReferenceID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): QuotationRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): QuotationRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): QuotationsRequestsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.QuotationsRequestsService.ViewAncillaryParametersByUUID.
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
        QuotationRequestAncillaryParameters = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewAncillaryParametersByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): QuotationsRequestsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): QuotationsRequestsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: QuotationsRequestsServicePaginationReq):
        QuotationsRequestsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: QuotationsRequestsServiceSearchAllReq):
        QuotationsRequestsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: QuotationsRequestsServiceFilterReq):
        QuotationsRequestsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: QuotationsRequestsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.QuotationsRequestsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: QuotationsRequestsServiceFilterReq): StandardFile
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.QuotationsRequestsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getAutofillMethod(),
      implementation = ::autofill
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getAddQuotationRequestItemMethod(),
      implementation = ::addQuotationRequestItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getModifyQuotationRequestItemMethod(),
      implementation = ::modifyQuotationRequestItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getApproveQuotationRequestItemMethod(),
      implementation = ::approveQuotationRequestItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getDeleteQuotationRequestItemMethod(),
      implementation = ::deleteQuotationRequestItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getReorderQuotationRequestItemsMethod(),
      implementation = ::reorderQuotationRequestItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewQuotationRequestItemByIDMethod(),
      implementation = ::viewQuotationRequestItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewApprovedQuotationRequestItemsMethod(),
      implementation = ::viewApprovedQuotationRequestItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewUnapprovedQuotationRequestItemsMethod(),
      implementation = ::viewUnapprovedQuotationRequestItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewQuotationRequestItemHistoryMethod(),
      implementation = ::viewQuotationRequestItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        QuotationsRequestsServiceGrpc.getViewPaginatedApprovedQuotationRequestItemsMethod(),
      implementation = ::viewPaginatedApprovedQuotationRequestItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        QuotationsRequestsServiceGrpc.getViewPaginatedUnapprovedQuotationRequestItemsMethod(),
      implementation = ::viewPaginatedUnapprovedQuotationRequestItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getSearchItemsWithPaginationMethod(),
      implementation = ::searchItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getDownloadItemsAsCSVMethod(),
      implementation = ::downloadItemsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      implementation = ::downloadItemsTemplateAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getUploadQuotationRequestItemsMethod(),
      implementation = ::uploadQuotationRequestItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewByReferenceIDMethod(),
      implementation = ::viewByReferenceID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      implementation = ::viewAncillaryParametersByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QuotationsRequestsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
