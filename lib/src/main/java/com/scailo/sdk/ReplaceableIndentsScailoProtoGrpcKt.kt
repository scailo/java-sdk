package com.scailo.sdk

import com.scailo.sdk.ReplaceableIndentsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.ReplaceableIndentsService.
 */
public object ReplaceableIndentsServiceGrpcKt {
  public const val SERVICE_NAME: String = ReplaceableIndentsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<ReplaceableIndentsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getCreateMethod()

  public val draftMethod:
      MethodDescriptor<ReplaceableIndentsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<ReplaceableIndentsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<ReplaceableIndentsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getSendEmailMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getCreateMagicLinkMethod()

  public val autofillMethod:
      MethodDescriptor<ReplaceableIndentsServiceAutofillRequest, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getAutofillMethod()

  public val isCompletableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getIsCompletableMethod()

  public val addReplaceableIndentItemMethod:
      MethodDescriptor<ReplaceableIndentsServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getAddReplaceableIndentItemMethod()

  public val modifyReplaceableIndentItemMethod:
      MethodDescriptor<ReplaceableIndentsServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getModifyReplaceableIndentItemMethod()

  public val approveReplaceableIndentItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getApproveReplaceableIndentItemMethod()

  public val deleteReplaceableIndentItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getDeleteReplaceableIndentItemMethod()

  public val reorderReplaceableIndentItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getReorderReplaceableIndentItemsMethod()

  public val viewReplaceableIndentItemByIDMethod:
      MethodDescriptor<Identifier, ReplaceableIndentItem>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewReplaceableIndentItemByIDMethod()

  public val viewApprovedReplaceableIndentItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, ReplaceableIndentsItemsList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewApprovedReplaceableIndentItemsMethod()

  public val viewUnapprovedReplaceableIndentItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, ReplaceableIndentsItemsList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewUnapprovedReplaceableIndentItemsMethod()

  public val viewReplaceableIndentItemHistoryMethod:
      MethodDescriptor<ReplaceableIndentItemHistoryRequest, ReplaceableIndentsItemsList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewReplaceableIndentItemHistoryMethod()

  public val viewPaginatedApprovedReplaceableIndentItemsMethod:
      MethodDescriptor<ReplaceableIndentItemsSearchRequest, ReplaceableIndentsServicePaginatedItemsResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewPaginatedApprovedReplaceableIndentItemsMethod()

  public val viewPaginatedUnapprovedReplaceableIndentItemsMethod:
      MethodDescriptor<ReplaceableIndentItemsSearchRequest, ReplaceableIndentsServicePaginatedItemsResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewPaginatedUnapprovedReplaceableIndentItemsMethod()

  public val searchItemsWithPaginationMethod:
      MethodDescriptor<ReplaceableIndentItemsSearchRequest, ReplaceableIndentsServicePaginatedItemsResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getSearchItemsWithPaginationMethod()

  public val downloadItemsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getDownloadItemsAsCSVMethod()

  public val downloadItemsTemplateAsCSVMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getDownloadItemsTemplateAsCSVMethod()

  public val uploadReplaceableIndentItemsMethod:
      MethodDescriptor<IdentifierUUIDWithFile, IdentifiersList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getUploadReplaceableIndentItemsMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, ReplaceableIndent>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, ReplaceableIndent>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewByUUIDMethod()

  public val viewByReferenceIDMethod: MethodDescriptor<SimpleSearchReq, ReplaceableIndent>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewByReferenceIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, ReplaceableIndent>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, ReplaceableIndent>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, ReplaceableIndentsList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, ReplaceableIndentsList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, ReplaceableIndentsList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<ReplaceableIndentsServicePaginationReq, ReplaceableIndentsServicePaginationResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewWithPaginationMethod()

  public val viewProspectiveFamiliesMethod: MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewProspectiveFamiliesMethod()

  public val filterProspectiveFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getFilterProspectiveFamiliesMethod()

  public val viewProspectiveReplaceableIndentItemMethod:
      MethodDescriptor<ReplaceableIndentItemProspectiveInfoRequest, ReplaceableIndentsServiceItemCreateRequest>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewProspectiveReplaceableIndentItemMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getDownloadByUUIDMethod()

  public val viewIssuedStatisticsMethod:
      MethodDescriptor<IdentifierUUID, ReplaceableIndentIssuedStatisticsList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewIssuedStatisticsMethod()

  public val viewAddedQuantityForFamilyMethod:
      MethodDescriptor<ReplaceableIndentItemProspectiveInfoRequest, QuantityResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getViewAddedQuantityForFamilyMethod()

  public val searchAllMethod:
      MethodDescriptor<ReplaceableIndentsServiceSearchAllReq, ReplaceableIndentsList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<ReplaceableIndentsServiceFilterReq, ReplaceableIndentsList>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<ReplaceableIndentsServiceCountReq, CountResponse>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<ReplaceableIndentsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = ReplaceableIndentsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.ReplaceableIndentsService service as suspending
   * coroutines.
   */
  @StubFor(ReplaceableIndentsServiceGrpc::class)
  public class ReplaceableIndentsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ReplaceableIndentsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        ReplaceableIndentsServiceCoroutineStub = ReplaceableIndentsServiceCoroutineStub(channel,
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
    public suspend fun create(request: ReplaceableIndentsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: ReplaceableIndentsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: ReplaceableIndentsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: ReplaceableIndentsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getSendEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getCreateMagicLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun autofill(request: ReplaceableIndentsServiceAutofillRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getAutofillMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getIsCompletableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addReplaceableIndentItem(request: ReplaceableIndentsServiceItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getAddReplaceableIndentItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyReplaceableIndentItem(request: ReplaceableIndentsServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getModifyReplaceableIndentItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveReplaceableIndentItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getApproveReplaceableIndentItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteReplaceableIndentItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getDeleteReplaceableIndentItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderReplaceableIndentItems(request: ReorderItemsRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getReorderReplaceableIndentItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewReplaceableIndentItemByID(request: Identifier, headers: Metadata =
        Metadata()): ReplaceableIndentItem = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewReplaceableIndentItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedReplaceableIndentItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): ReplaceableIndentsItemsList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewApprovedReplaceableIndentItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnapprovedReplaceableIndentItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): ReplaceableIndentsItemsList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewUnapprovedReplaceableIndentItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewReplaceableIndentItemHistory(request: ReplaceableIndentItemHistoryRequest,
        headers: Metadata = Metadata()): ReplaceableIndentsItemsList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewReplaceableIndentItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedReplaceableIndentItems(request: ReplaceableIndentItemsSearchRequest,
        headers: Metadata = Metadata()): ReplaceableIndentsServicePaginatedItemsResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewPaginatedApprovedReplaceableIndentItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedReplaceableIndentItems(request: ReplaceableIndentItemsSearchRequest,
        headers: Metadata = Metadata()): ReplaceableIndentsServicePaginatedItemsResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewPaginatedUnapprovedReplaceableIndentItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchItemsWithPagination(request: ReplaceableIndentItemsSearchRequest,
        headers: Metadata = Metadata()): ReplaceableIndentsServicePaginatedItemsResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getSearchItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getDownloadItemsAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadReplaceableIndentItems(request: IdentifierUUIDWithFile,
        headers: Metadata = Metadata()): IdentifiersList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getUploadReplaceableIndentItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ReplaceableIndent = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ReplaceableIndent = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ReplaceableIndent = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewByReferenceIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ReplaceableIndent = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ReplaceableIndent = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ReplaceableIndentsList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ReplaceableIndentsList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): ReplaceableIndentsList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: ReplaceableIndentsServicePaginationReq,
        headers: Metadata = Metadata()): ReplaceableIndentsServicePaginationResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getViewProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewProspectiveReplaceableIndentItem(request: ReplaceableIndentItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): ReplaceableIndentsServiceItemCreateRequest = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewProspectiveReplaceableIndentItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getIsDownloadableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getDownloadByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewIssuedStatistics(request: IdentifierUUID, headers: Metadata =
        Metadata()): ReplaceableIndentIssuedStatisticsList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewIssuedStatisticsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewAddedQuantityForFamily(request: ReplaceableIndentItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): QuantityResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getViewAddedQuantityForFamilyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: ReplaceableIndentsServiceSearchAllReq, headers: Metadata =
        Metadata()): ReplaceableIndentsList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: ReplaceableIndentsServiceFilterReq, headers: Metadata =
        Metadata()): ReplaceableIndentsList = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ReplaceableIndentsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: ReplaceableIndentsServiceCountReq, headers: Metadata =
        Metadata()): CountResponse = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: ReplaceableIndentsServiceFilterReq, headers: Metadata
        = Metadata()): StandardFile = unaryRpc(
      channel,
      ReplaceableIndentsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.ReplaceableIndentsService service based on Kotlin
   * coroutines.
   */
  public abstract class ReplaceableIndentsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: ReplaceableIndentsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: ReplaceableIndentsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: ReplaceableIndentsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: ReplaceableIndentsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.SendEmail.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Autofill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun autofill(request: ReplaceableIndentsServiceAutofillRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Autofill is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.IsCompletable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.IsCompletable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.AddReplaceableIndentItem.
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
        fun addReplaceableIndentItem(request: ReplaceableIndentsServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.AddReplaceableIndentItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ModifyReplaceableIndentItem.
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
        fun modifyReplaceableIndentItem(request: ReplaceableIndentsServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ModifyReplaceableIndentItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ApproveReplaceableIndentItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveReplaceableIndentItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ApproveReplaceableIndentItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.DeleteReplaceableIndentItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteReplaceableIndentItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.DeleteReplaceableIndentItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ReorderReplaceableIndentItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderReplaceableIndentItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ReorderReplaceableIndentItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ViewReplaceableIndentItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewReplaceableIndentItemByID(request: Identifier):
        ReplaceableIndentItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewReplaceableIndentItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ViewApprovedReplaceableIndentItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedReplaceableIndentItems(request: IdentifierWithSearchKey):
        ReplaceableIndentsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewApprovedReplaceableIndentItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ViewUnapprovedReplaceableIndentItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedReplaceableIndentItems(request: IdentifierWithSearchKey):
        ReplaceableIndentsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewUnapprovedReplaceableIndentItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ViewReplaceableIndentItemHistory.
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
        fun viewReplaceableIndentItemHistory(request: ReplaceableIndentItemHistoryRequest):
        ReplaceableIndentsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewReplaceableIndentItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ViewPaginatedApprovedReplaceableIndentItems.
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
        fun viewPaginatedApprovedReplaceableIndentItems(request: ReplaceableIndentItemsSearchRequest):
        ReplaceableIndentsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewPaginatedApprovedReplaceableIndentItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ViewPaginatedUnapprovedReplaceableIndentItems.
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
        fun viewPaginatedUnapprovedReplaceableIndentItems(request: ReplaceableIndentItemsSearchRequest):
        ReplaceableIndentsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewPaginatedUnapprovedReplaceableIndentItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.SearchItemsWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchItemsWithPagination(request: ReplaceableIndentItemsSearchRequest):
        ReplaceableIndentsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.SearchItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.DownloadItemsAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.DownloadItemsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.DownloadItemsTemplateAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.DownloadItemsTemplateAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.UploadReplaceableIndentItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadReplaceableIndentItems(request: IdentifierUUIDWithFile):
        IdentifiersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.UploadReplaceableIndentItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): ReplaceableIndent = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): ReplaceableIndent = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewByReferenceID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByReferenceID(request: SimpleSearchReq): ReplaceableIndent = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewByReferenceID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): ReplaceableIndent = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): ReplaceableIndent = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): ReplaceableIndentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): ReplaceableIndentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): ReplaceableIndentsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: ReplaceableIndentsServicePaginationReq):
        ReplaceableIndentsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.FilterProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.FilterProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ViewProspectiveReplaceableIndentItem.
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
        fun viewProspectiveReplaceableIndentItem(request: ReplaceableIndentItemProspectiveInfoRequest):
        ReplaceableIndentsServiceItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewProspectiveReplaceableIndentItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.ViewIssuedStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewIssuedStatistics(request: IdentifierUUID):
        ReplaceableIndentIssuedStatisticsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewIssuedStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ReplaceableIndentsService.ViewAddedQuantityForFamily.
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
        fun viewAddedQuantityForFamily(request: ReplaceableIndentItemProspectiveInfoRequest):
        QuantityResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.ViewAddedQuantityForFamily is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: ReplaceableIndentsServiceSearchAllReq):
        ReplaceableIndentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: ReplaceableIndentsServiceFilterReq):
        ReplaceableIndentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: ReplaceableIndentsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ReplaceableIndentsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: ReplaceableIndentsServiceFilterReq): StandardFile
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ReplaceableIndentsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getAutofillMethod(),
      implementation = ::autofill
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getIsCompletableMethod(),
      implementation = ::isCompletable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getAddReplaceableIndentItemMethod(),
      implementation = ::addReplaceableIndentItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getModifyReplaceableIndentItemMethod(),
      implementation = ::modifyReplaceableIndentItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getApproveReplaceableIndentItemMethod(),
      implementation = ::approveReplaceableIndentItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getDeleteReplaceableIndentItemMethod(),
      implementation = ::deleteReplaceableIndentItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getReorderReplaceableIndentItemsMethod(),
      implementation = ::reorderReplaceableIndentItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewReplaceableIndentItemByIDMethod(),
      implementation = ::viewReplaceableIndentItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewApprovedReplaceableIndentItemsMethod(),
      implementation = ::viewApprovedReplaceableIndentItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewUnapprovedReplaceableIndentItemsMethod(),
      implementation = ::viewUnapprovedReplaceableIndentItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewReplaceableIndentItemHistoryMethod(),
      implementation = ::viewReplaceableIndentItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        ReplaceableIndentsServiceGrpc.getViewPaginatedApprovedReplaceableIndentItemsMethod(),
      implementation = ::viewPaginatedApprovedReplaceableIndentItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        ReplaceableIndentsServiceGrpc.getViewPaginatedUnapprovedReplaceableIndentItemsMethod(),
      implementation = ::viewPaginatedUnapprovedReplaceableIndentItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getSearchItemsWithPaginationMethod(),
      implementation = ::searchItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getDownloadItemsAsCSVMethod(),
      implementation = ::downloadItemsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      implementation = ::downloadItemsTemplateAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getUploadReplaceableIndentItemsMethod(),
      implementation = ::uploadReplaceableIndentItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewByReferenceIDMethod(),
      implementation = ::viewByReferenceID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewProspectiveFamiliesMethod(),
      implementation = ::viewProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      implementation = ::filterProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewProspectiveReplaceableIndentItemMethod(),
      implementation = ::viewProspectiveReplaceableIndentItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewIssuedStatisticsMethod(),
      implementation = ::viewIssuedStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getViewAddedQuantityForFamilyMethod(),
      implementation = ::viewAddedQuantityForFamily
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReplaceableIndentsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
