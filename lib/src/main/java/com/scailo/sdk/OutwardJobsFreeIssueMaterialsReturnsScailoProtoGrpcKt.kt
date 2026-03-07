package com.scailo.sdk

import com.scailo.sdk.OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getServiceDescriptor
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
 * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.
 */
public object OutwardJobsFreeIssueMaterialsReturnsServiceGrpcKt {
  public const val SERVICE_NAME: String =
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMethod()

  public val draftMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendEmailMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMagicLinkMethod()

  public val isCompletableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsCompletableMethod()

  public val addOutwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getAddOutwardJobFreeIssueMaterialReturnItemMethod()

  public val modifyOutwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getModifyOutwardJobFreeIssueMaterialReturnItemMethod()

  public val approveOutwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveOutwardJobFreeIssueMaterialReturnItemMethod()

  public val deleteOutwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDeleteOutwardJobFreeIssueMaterialReturnItemMethod()

  public val reorderOutwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReorderOutwardJobFreeIssueMaterialReturnItemsMethod()

  public val viewOutwardJobFreeIssueMaterialReturnItemByIDMethod:
      MethodDescriptor<Identifier, OutwardJobFreeIssueMaterialReturnItem>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod()

  public val viewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod:
      MethodDescriptor<SimpleSearchReq, OutwardJobFreeIssueMaterialReturnItem>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod()

  public val viewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, OutwardJobsFreeIssueMaterialsReturnsItemsList>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod()

  public val viewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, OutwardJobsFreeIssueMaterialsReturnsItemsList>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod()

  public val viewOutwardJobFreeIssueMaterialReturnItemHistoryMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialReturnItemHistoryRequest, OutwardJobsFreeIssueMaterialsReturnsItemsList>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod()

  public val viewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialReturnItemsSearchRequest, OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod()

  public val viewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialReturnItemsSearchRequest, OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod()

  public val searchItemsWithPaginationMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialReturnItemsSearchRequest, OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchItemsWithPaginationMethod()

  public val downloadItemsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsAsCSVMethod()

  public val downloadItemsTemplateAsCSVMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, OutwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, OutwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByUUIDMethod()

  public val viewByReferenceIDMethod:
      MethodDescriptor<SimpleSearchReq, OutwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByReferenceIDMethod()

  public val viewEssentialByIDMethod:
      MethodDescriptor<Identifier, OutwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod:
      MethodDescriptor<IdentifierUUID, OutwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod:
      MethodDescriptor<IdentifiersList, OutwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewFromIDsMethod()

  public val viewAncillaryParametersByUUIDMethod:
      MethodDescriptor<IdentifierUUID, OutwardJobFreeIssueMaterialReturnAncillaryParameters>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, OutwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod:
      MethodDescriptor<IdentifierUUID, OutwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq, OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewWithPaginationMethod()

  public val viewProspectiveFamiliesMethod: MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveFamiliesMethod()

  public val filterProspectiveFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterProspectiveFamiliesMethod()

  public val viewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest, OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod()

  public val searchReturnableInventoryMethod:
      MethodDescriptor<SearchReturnableInventoryForIdentifierUUID, GenericInventoryList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchReturnableInventoryMethod()

  public val filterReturnableInventoryMethod:
      MethodDescriptor<FilterReturnableInventoryForIdentifierUUID, GenericInventoryList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterReturnableInventoryMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadByUUIDMethod()

  public val downloadLabelByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadLabelByUUIDMethod()

  public val viewAddedFamilyQuantityForSourceMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest, DualQuantitiesResponse>
    @JvmStatic
    get() =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod()

  public val searchAllMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq, OutwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq, OutwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountInStatusMethod()

  public val countMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceCountReq, CountResponse>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod:
      MethodDescriptor<OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.OutwardJobsFreeIssueMaterialsReturnsService service as
   * suspending coroutines.
   */
  @StubFor(OutwardJobsFreeIssueMaterialsReturnsServiceGrpc::class)
  public class OutwardJobsFreeIssueMaterialsReturnsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<OutwardJobsFreeIssueMaterialsReturnsServiceCoroutineStub>(channel,
      callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        OutwardJobsFreeIssueMaterialsReturnsServiceCoroutineStub =
        OutwardJobsFreeIssueMaterialsReturnsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun draftUpdate(request: OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun revisionUpdate(request: OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMagicLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsCompletableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addOutwardJobFreeIssueMaterialReturnItem(request: OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getAddOutwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyOutwardJobFreeIssueMaterialReturnItem(request: OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getModifyOutwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun approveOutwardJobFreeIssueMaterialReturnItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveOutwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun deleteOutwardJobFreeIssueMaterialReturnItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDeleteOutwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderOutwardJobFreeIssueMaterialReturnItems(request: ReorderItemsRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReorderOutwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOutwardJobFreeIssueMaterialReturnItemByID(request: Identifier,
        headers: Metadata = Metadata()): OutwardJobFreeIssueMaterialReturnItem = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewOutwardJobFreeIssueMaterialReturnItemByInventoryHash(request: SimpleSearchReq,
        headers: Metadata = Metadata()): OutwardJobFreeIssueMaterialReturnItem = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewApprovedOutwardJobFreeIssueMaterialReturnItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsReturnsItemsList = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewUnapprovedOutwardJobFreeIssueMaterialReturnItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsReturnsItemsList = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewOutwardJobFreeIssueMaterialReturnItemHistory(request: OutwardJobFreeIssueMaterialReturnItemHistoryRequest,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsReturnsItemsList = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems(request: OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
        headers: Metadata = Metadata()):
        OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems(request: OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
        headers: Metadata = Metadata()):
        OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun searchItemsWithPagination(request: OutwardJobFreeIssueMaterialReturnItemsSearchRequest,
        headers: Metadata = Metadata()):
        OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByReferenceIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): OutwardJobFreeIssueMaterialReturnAncillaryParameters = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): OutwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewWithPagination(request: OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq,
        headers: Metadata = Metadata()):
        OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewProspectiveOutwardJobFreeIssueMaterialReturnItem(request: OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest,
        headers: Metadata = Metadata()):
        OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest = unaryRpc(
      channel,
     
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchReturnableInventoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterReturnableInventoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsDownloadableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadLabelByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewAddedFamilyQuantityForSource(request: OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest,
        headers: Metadata = Metadata()): DualQuantitiesResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
        headers: Metadata = Metadata()): OutwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: OutwardJobsFreeIssueMaterialsReturnsServiceCountReq,
        headers: Metadata = Metadata()): CountResponse = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
        headers: Metadata = Metadata()): StandardFile = unaryRpc(
      channel,
      OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.OutwardJobsFreeIssueMaterialsReturnsService service based
   * on Kotlin coroutines.
   */
  public abstract class OutwardJobsFreeIssueMaterialsReturnsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Create.
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
        fun create(request: OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Draft.
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
        fun draft(request: OutwardJobsFreeIssueMaterialsReturnsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DraftUpdate.
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
        fun draftUpdate(request: OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.RevisionUpdate.
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
        fun revisionUpdate(request: OutwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SendEmail.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.IsCompletable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.IsCompletable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.AddOutwardJobFreeIssueMaterialReturnItem.
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
        fun addOutwardJobFreeIssueMaterialReturnItem(request: OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.AddOutwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ModifyOutwardJobFreeIssueMaterialReturnItem.
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
        fun modifyOutwardJobFreeIssueMaterialReturnItem(request: OutwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ModifyOutwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ApproveOutwardJobFreeIssueMaterialReturnItem.
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
        fun approveOutwardJobFreeIssueMaterialReturnItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ApproveOutwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DeleteOutwardJobFreeIssueMaterialReturnItem.
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
        fun deleteOutwardJobFreeIssueMaterialReturnItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DeleteOutwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ReorderOutwardJobFreeIssueMaterialReturnItems.
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
        fun reorderOutwardJobFreeIssueMaterialReturnItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ReorderOutwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewOutwardJobFreeIssueMaterialReturnItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOutwardJobFreeIssueMaterialReturnItemByID(request: Identifier):
        OutwardJobFreeIssueMaterialReturnItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewOutwardJobFreeIssueMaterialReturnItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewOutwardJobFreeIssueMaterialReturnItemByInventoryHash.
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
        fun viewOutwardJobFreeIssueMaterialReturnItemByInventoryHash(request: SimpleSearchReq):
        OutwardJobFreeIssueMaterialReturnItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewOutwardJobFreeIssueMaterialReturnItemByInventoryHash is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewApprovedOutwardJobFreeIssueMaterialReturnItems.
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
        fun viewApprovedOutwardJobFreeIssueMaterialReturnItems(request: IdentifierWithSearchKey):
        OutwardJobsFreeIssueMaterialsReturnsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewApprovedOutwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewUnapprovedOutwardJobFreeIssueMaterialReturnItems.
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
        fun viewUnapprovedOutwardJobFreeIssueMaterialReturnItems(request: IdentifierWithSearchKey):
        OutwardJobsFreeIssueMaterialsReturnsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewUnapprovedOutwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewOutwardJobFreeIssueMaterialReturnItemHistory.
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
        fun viewOutwardJobFreeIssueMaterialReturnItemHistory(request: OutwardJobFreeIssueMaterialReturnItemHistoryRequest):
        OutwardJobsFreeIssueMaterialsReturnsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewOutwardJobFreeIssueMaterialReturnItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems.
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
        fun viewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems(request: OutwardJobFreeIssueMaterialReturnItemsSearchRequest):
        OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems.
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
        fun viewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems(request: OutwardJobFreeIssueMaterialReturnItemsSearchRequest):
        OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SearchItemsWithPagination.
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
        fun searchItemsWithPagination(request: OutwardJobFreeIssueMaterialReturnItemsSearchRequest):
        OutwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SearchItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadItemsAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadItemsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadItemsTemplateAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadItemsTemplateAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): OutwardJobFreeIssueMaterialReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): OutwardJobFreeIssueMaterialReturn =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewByReferenceID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByReferenceID(request: SimpleSearchReq):
        OutwardJobFreeIssueMaterialReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewByReferenceID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier):
        OutwardJobFreeIssueMaterialReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewEssentialByUUID.
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
        OutwardJobFreeIssueMaterialReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList):
        OutwardJobsFreeIssueMaterialsReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewAncillaryParametersByUUID.
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
        OutwardJobFreeIssueMaterialReturnAncillaryParameters = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewAncillaryParametersByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): OutwardJobsFreeIssueMaterialsReturnsList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewAllForEntityUUID.
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
        OutwardJobsFreeIssueMaterialsReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewWithPagination.
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
        fun viewWithPagination(request: OutwardJobsFreeIssueMaterialsReturnsServicePaginationReq):
        OutwardJobsFreeIssueMaterialsReturnsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.FilterProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.FilterProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewProspectiveOutwardJobFreeIssueMaterialReturnItem.
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
        fun viewProspectiveOutwardJobFreeIssueMaterialReturnItem(request: OutwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest):
        OutwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewProspectiveOutwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SearchReturnableInventory.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SearchReturnableInventory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.FilterReturnableInventory.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.FilterReturnableInventory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadLabelByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadLabelByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewAddedFamilyQuantityForSource.
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
        fun viewAddedFamilyQuantityForSource(request: OutwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest):
        DualQuantitiesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.ViewAddedFamilyQuantityForSource is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SearchAll.
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
        fun searchAll(request: OutwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq):
        OutwardJobsFreeIssueMaterialsReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq):
        OutwardJobsFreeIssueMaterialsReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: OutwardJobsFreeIssueMaterialsReturnsServiceCountReq):
        CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadAsCSV.
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
        fun downloadAsCSV(request: OutwardJobsFreeIssueMaterialsReturnsServiceFilterReq):
        StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsFreeIssueMaterialsReturnsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsCompletableMethod(),
      implementation = ::isCompletable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getAddOutwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::addOutwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getModifyOutwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::modifyOutwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveOutwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::approveOutwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDeleteOutwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::deleteOutwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReorderOutwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::reorderOutwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByIDMethod(),
      implementation = ::viewOutwardJobFreeIssueMaterialReturnItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemByInventoryHashMethod(),
      implementation = ::viewOutwardJobFreeIssueMaterialReturnItemByInventoryHash
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::viewApprovedOutwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::viewUnapprovedOutwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewOutwardJobFreeIssueMaterialReturnItemHistoryMethod(),
      implementation = ::viewOutwardJobFreeIssueMaterialReturnItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::viewPaginatedApprovedOutwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::viewPaginatedUnapprovedOutwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchItemsWithPaginationMethod(),
      implementation = ::searchItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsAsCSVMethod(),
      implementation = ::downloadItemsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      implementation = ::downloadItemsTemplateAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByReferenceIDMethod(),
      implementation = ::viewByReferenceID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      implementation = ::viewAncillaryParametersByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveFamiliesMethod(),
      implementation = ::viewProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      implementation = ::filterProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveOutwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::viewProspectiveOutwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchReturnableInventoryMethod(),
      implementation = ::searchReturnableInventory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterReturnableInventoryMethod(),
      implementation = ::filterReturnableInventory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadLabelByUUIDMethod(),
      implementation = ::downloadLabelByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      implementation = ::viewAddedFamilyQuantityForSource
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
