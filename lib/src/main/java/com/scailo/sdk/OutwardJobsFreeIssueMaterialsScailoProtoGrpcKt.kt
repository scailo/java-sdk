package com.scailo.sdk

import com.scailo.sdk.OutwardJobsFreeIssueMaterialsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for
 * Scailo.OutwardJobsFreeIssueMaterialsService.
 */
public object OutwardJobsFreeIssueMaterialsServiceGrpcKt {
  public const val SERVICE_NAME: String = OutwardJobsFreeIssueMaterialsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getCreateMethod()

  public val draftMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getSendEmailMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getCreateMagicLinkMethod()

  public val autofillMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceAutofillRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getAutofillMethod()

  public val isCompletableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getIsCompletableMethod()

  public val addOutwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getAddOutwardJobFreeIssueMaterialItemMethod()

  public val modifyOutwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getModifyOutwardJobFreeIssueMaterialItemMethod()

  public val approveOutwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getApproveOutwardJobFreeIssueMaterialItemMethod()

  public val deleteOutwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getDeleteOutwardJobFreeIssueMaterialItemMethod()

  public val reorderOutwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getReorderOutwardJobFreeIssueMaterialItemsMethod()

  public val viewOutwardJobFreeIssueMaterialItemByIDMethod:
      MethodDescriptor<Identifier, OutwardJobFreeIssueMaterialItem>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewOutwardJobFreeIssueMaterialItemByIDMethod()

  public val viewOutwardJobFreeIssueMaterialItemByInventoryHashMethod:
      MethodDescriptor<SimpleSearchReq, OutwardJobFreeIssueMaterialItem>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewOutwardJobFreeIssueMaterialItemByInventoryHashMethod()

  public val viewApprovedOutwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, OutwardJobsFreeIssueMaterialsItemsList>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewApprovedOutwardJobFreeIssueMaterialItemsMethod()

  public val viewUnapprovedOutwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, OutwardJobsFreeIssueMaterialsItemsList>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewUnapprovedOutwardJobFreeIssueMaterialItemsMethod()

  public val viewOutwardJobFreeIssueMaterialItemHistoryMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialItemHistoryRequest, OutwardJobsFreeIssueMaterialsItemsList>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewOutwardJobFreeIssueMaterialItemHistoryMethod()

  public val viewPaginatedApprovedOutwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialItemsSearchRequest, OutwardJobsFreeIssueMaterialsServicePaginatedItemsResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedApprovedOutwardJobFreeIssueMaterialItemsMethod()

  public val viewPaginatedUnapprovedOutwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialItemsSearchRequest, OutwardJobsFreeIssueMaterialsServicePaginatedItemsResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialItemsMethod()

  public val searchItemsWithPaginationMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialItemsSearchRequest, OutwardJobsFreeIssueMaterialsServicePaginatedItemsResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getSearchItemsWithPaginationMethod()

  public val downloadItemsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsAsCSVMethod()

  public val downloadItemsTemplateAsCSVMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsTemplateAsCSVMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, OutwardJobFreeIssueMaterial>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, OutwardJobFreeIssueMaterial>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewByUUIDMethod()

  public val viewByReferenceIDMethod: MethodDescriptor<SimpleSearchReq, OutwardJobFreeIssueMaterial>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewByReferenceIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, OutwardJobFreeIssueMaterial>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod:
      MethodDescriptor<IdentifierUUID, OutwardJobFreeIssueMaterial>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, OutwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewFromIDsMethod()

  public val viewAncillaryParametersByUUIDMethod:
      MethodDescriptor<IdentifierUUID, OutwardJobFreeIssueMaterialAncillaryParameters>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAncillaryParametersByUUIDMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, OutwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod:
      MethodDescriptor<IdentifierUUID, OutwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServicePaginationReq, OutwardJobsFreeIssueMaterialsServicePaginationResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewWithPaginationMethod()

  public val viewProspectiveFamiliesMethod: MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveFamiliesMethod()

  public val filterProspectiveFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getFilterProspectiveFamiliesMethod()

  public val viewProspectiveOutwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialItemProspectiveInfoRequest, OutwardJobsFreeIssueMaterialsServiceItemCreateRequest>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveOutwardJobFreeIssueMaterialItemMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadByUUIDMethod()

  public val downloadLabelByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadLabelByUUIDMethod()

  public val viewAddedFamilyQuantityForSourceMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceAlreadyAddedQuantityForSourceRequest, DualQuantitiesResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod()

  public val searchAllMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceSearchAllReq, OutwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceFilterReq, OutwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getCountInStatusMethod()

  public val countMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceCountReq, CountResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.OutwardJobsFreeIssueMaterialsService service as
   * suspending coroutines.
   */
  @StubFor(OutwardJobsFreeIssueMaterialsServiceGrpc::class)
  public class OutwardJobsFreeIssueMaterialsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<OutwardJobsFreeIssueMaterialsServiceCoroutineStub>(channel, callOptions)
      {
    override fun build(channel: Channel, callOptions: CallOptions):
        OutwardJobsFreeIssueMaterialsServiceCoroutineStub =
        OutwardJobsFreeIssueMaterialsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: OutwardJobsFreeIssueMaterialsServiceCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: OutwardJobsFreeIssueMaterialsServiceCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: OutwardJobsFreeIssueMaterialsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: OutwardJobsFreeIssueMaterialsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getSendEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getCreateMagicLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun autofill(request: OutwardJobsFreeIssueMaterialsServiceAutofillRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getAutofillMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getIsCompletableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addOutwardJobFreeIssueMaterialItem(request: OutwardJobsFreeIssueMaterialsServiceItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getAddOutwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyOutwardJobFreeIssueMaterialItem(request: OutwardJobsFreeIssueMaterialsServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getModifyOutwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveOutwardJobFreeIssueMaterialItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getApproveOutwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteOutwardJobFreeIssueMaterialItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getDeleteOutwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderOutwardJobFreeIssueMaterialItems(request: ReorderItemsRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getReorderOutwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOutwardJobFreeIssueMaterialItemByID(request: Identifier,
        headers: Metadata = Metadata()): OutwardJobFreeIssueMaterialItem = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewOutwardJobFreeIssueMaterialItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOutwardJobFreeIssueMaterialItemByInventoryHash(request: SimpleSearchReq,
        headers: Metadata = Metadata()): OutwardJobFreeIssueMaterialItem = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewOutwardJobFreeIssueMaterialItemByInventoryHashMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewApprovedOutwardJobFreeIssueMaterialItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsItemsList = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewApprovedOutwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewUnapprovedOutwardJobFreeIssueMaterialItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsItemsList = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewUnapprovedOutwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewOutwardJobFreeIssueMaterialItemHistory(request: OutwardJobFreeIssueMaterialItemHistoryRequest,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsItemsList = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewOutwardJobFreeIssueMaterialItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedOutwardJobFreeIssueMaterialItems(request: OutwardJobFreeIssueMaterialItemsSearchRequest,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsServicePaginatedItemsResponse
        = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedApprovedOutwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedOutwardJobFreeIssueMaterialItems(request: OutwardJobFreeIssueMaterialItemsSearchRequest,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsServicePaginatedItemsResponse
        = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun searchItemsWithPagination(request: OutwardJobFreeIssueMaterialItemsSearchRequest,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsServicePaginatedItemsResponse
        = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getSearchItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterial = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterial = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterial = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewByReferenceIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterial = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterial = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): OutwardJobFreeIssueMaterialAncillaryParameters = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): OutwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewWithPagination(request: OutwardJobsFreeIssueMaterialsServicePaginationReq,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsServicePaginationResponse =
        unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewProspectiveOutwardJobFreeIssueMaterialItem(request: OutwardJobFreeIssueMaterialItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsServiceItemCreateRequest =
        unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveOutwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getIsDownloadableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadLabelByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewAddedFamilyQuantityForSource(request: OutwardJobsFreeIssueMaterialsServiceAlreadyAddedQuantityForSourceRequest,
        headers: Metadata = Metadata()): DualQuantitiesResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: OutwardJobsFreeIssueMaterialsServiceSearchAllReq,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: OutwardJobsFreeIssueMaterialsServiceFilterReq,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: OutwardJobsFreeIssueMaterialsServiceCountReq,
        headers: Metadata = Metadata()): CountResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: OutwardJobsFreeIssueMaterialsServiceFilterReq,
        headers: Metadata = Metadata()): StandardFile = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.OutwardJobsFreeIssueMaterialsService service based on
   * Kotlin coroutines.
   */
  public abstract class OutwardJobsFreeIssueMaterialsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: OutwardJobsFreeIssueMaterialsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: OutwardJobsFreeIssueMaterialsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: OutwardJobsFreeIssueMaterialsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.RevisionUpdate.
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
        fun revisionUpdate(request: OutwardJobsFreeIssueMaterialsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.SendEmail.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Autofill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun autofill(request: OutwardJobsFreeIssueMaterialsServiceAutofillRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Autofill is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.IsCompletable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.IsCompletable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.AddOutwardJobFreeIssueMaterialItem.
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
        fun addOutwardJobFreeIssueMaterialItem(request: OutwardJobsFreeIssueMaterialsServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.AddOutwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ModifyOutwardJobFreeIssueMaterialItem.
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
        fun modifyOutwardJobFreeIssueMaterialItem(request: OutwardJobsFreeIssueMaterialsServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ModifyOutwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ApproveOutwardJobFreeIssueMaterialItem.
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
        fun approveOutwardJobFreeIssueMaterialItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ApproveOutwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.DeleteOutwardJobFreeIssueMaterialItem.
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
        fun deleteOutwardJobFreeIssueMaterialItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.DeleteOutwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ReorderOutwardJobFreeIssueMaterialItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderOutwardJobFreeIssueMaterialItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ReorderOutwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewOutwardJobFreeIssueMaterialItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOutwardJobFreeIssueMaterialItemByID(request: Identifier):
        OutwardJobFreeIssueMaterialItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewOutwardJobFreeIssueMaterialItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewOutwardJobFreeIssueMaterialItemByInventoryHash.
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
        fun viewOutwardJobFreeIssueMaterialItemByInventoryHash(request: SimpleSearchReq):
        OutwardJobFreeIssueMaterialItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewOutwardJobFreeIssueMaterialItemByInventoryHash is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewApprovedOutwardJobFreeIssueMaterialItems.
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
        fun viewApprovedOutwardJobFreeIssueMaterialItems(request: IdentifierWithSearchKey):
        OutwardJobsFreeIssueMaterialsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewApprovedOutwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewUnapprovedOutwardJobFreeIssueMaterialItems.
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
        fun viewUnapprovedOutwardJobFreeIssueMaterialItems(request: IdentifierWithSearchKey):
        OutwardJobsFreeIssueMaterialsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewUnapprovedOutwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewOutwardJobFreeIssueMaterialItemHistory.
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
        fun viewOutwardJobFreeIssueMaterialItemHistory(request: OutwardJobFreeIssueMaterialItemHistoryRequest):
        OutwardJobsFreeIssueMaterialsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewOutwardJobFreeIssueMaterialItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewPaginatedApprovedOutwardJobFreeIssueMaterialItems.
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
        fun viewPaginatedApprovedOutwardJobFreeIssueMaterialItems(request: OutwardJobFreeIssueMaterialItemsSearchRequest):
        OutwardJobsFreeIssueMaterialsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewPaginatedApprovedOutwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewPaginatedUnapprovedOutwardJobFreeIssueMaterialItems.
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
        fun viewPaginatedUnapprovedOutwardJobFreeIssueMaterialItems(request: OutwardJobFreeIssueMaterialItemsSearchRequest):
        OutwardJobsFreeIssueMaterialsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewPaginatedUnapprovedOutwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.SearchItemsWithPagination.
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
        fun searchItemsWithPagination(request: OutwardJobFreeIssueMaterialItemsSearchRequest):
        OutwardJobsFreeIssueMaterialsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.SearchItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.DownloadItemsAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.DownloadItemsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.DownloadItemsTemplateAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.DownloadItemsTemplateAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): OutwardJobFreeIssueMaterial = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): OutwardJobFreeIssueMaterial = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewByReferenceID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByReferenceID(request: SimpleSearchReq): OutwardJobFreeIssueMaterial
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewByReferenceID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): OutwardJobFreeIssueMaterial =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID):
        OutwardJobFreeIssueMaterial = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): OutwardJobsFreeIssueMaterialsList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewAncillaryParametersByUUID.
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
        OutwardJobFreeIssueMaterialAncillaryParameters = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewAncillaryParametersByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): OutwardJobsFreeIssueMaterialsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID):
        OutwardJobsFreeIssueMaterialsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewWithPagination.
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
        fun viewWithPagination(request: OutwardJobsFreeIssueMaterialsServicePaginationReq):
        OutwardJobsFreeIssueMaterialsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.FilterProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.FilterProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewProspectiveOutwardJobFreeIssueMaterialItem.
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
        fun viewProspectiveOutwardJobFreeIssueMaterialItem(request: OutwardJobFreeIssueMaterialItemProspectiveInfoRequest):
        OutwardJobsFreeIssueMaterialsServiceItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewProspectiveOutwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.DownloadLabelByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.DownloadLabelByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsService.ViewAddedFamilyQuantityForSource.
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
        fun viewAddedFamilyQuantityForSource(request: OutwardJobsFreeIssueMaterialsServiceAlreadyAddedQuantityForSourceRequest):
        DualQuantitiesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.ViewAddedFamilyQuantityForSource is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: OutwardJobsFreeIssueMaterialsServiceSearchAllReq):
        OutwardJobsFreeIssueMaterialsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: OutwardJobsFreeIssueMaterialsServiceFilterReq):
        OutwardJobsFreeIssueMaterialsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: OutwardJobsFreeIssueMaterialsServiceCountReq):
        CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: OutwardJobsFreeIssueMaterialsServiceFilterReq):
        StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getAutofillMethod(),
      implementation = ::autofill
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getIsCompletableMethod(),
      implementation = ::isCompletable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getAddOutwardJobFreeIssueMaterialItemMethod(),
      implementation = ::addOutwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getModifyOutwardJobFreeIssueMaterialItemMethod(),
      implementation = ::modifyOutwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getApproveOutwardJobFreeIssueMaterialItemMethod(),
      implementation = ::approveOutwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getDeleteOutwardJobFreeIssueMaterialItemMethod(),
      implementation = ::deleteOutwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getReorderOutwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::reorderOutwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewOutwardJobFreeIssueMaterialItemByIDMethod(),
      implementation = ::viewOutwardJobFreeIssueMaterialItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewOutwardJobFreeIssueMaterialItemByInventoryHashMethod(),
      implementation = ::viewOutwardJobFreeIssueMaterialItemByInventoryHash
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewApprovedOutwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::viewApprovedOutwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewUnapprovedOutwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::viewUnapprovedOutwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewOutwardJobFreeIssueMaterialItemHistoryMethod(),
      implementation = ::viewOutwardJobFreeIssueMaterialItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedApprovedOutwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::viewPaginatedApprovedOutwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::viewPaginatedUnapprovedOutwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getSearchItemsWithPaginationMethod(),
      implementation = ::searchItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsAsCSVMethod(),
      implementation = ::downloadItemsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      implementation = ::downloadItemsTemplateAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewByReferenceIDMethod(),
      implementation = ::viewByReferenceID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      implementation = ::viewAncillaryParametersByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveFamiliesMethod(),
      implementation = ::viewProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      implementation = ::filterProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveOutwardJobFreeIssueMaterialItemMethod(),
      implementation = ::viewProspectiveOutwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadLabelByUUIDMethod(),
      implementation = ::downloadLabelByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      implementation = ::viewAddedFamilyQuantityForSource
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
