package com.scailo.sdk

import com.scailo.sdk.InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getServiceDescriptor
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
 * Scailo.InwardJobsFreeIssueMaterialsReturnsService.
 */
public object InwardJobsFreeIssueMaterialsReturnsServiceGrpcKt {
  public const val SERVICE_NAME: String =
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMethod()

  public val draftMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendEmailMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMagicLinkMethod()

  public val isCompletableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsCompletableMethod()

  public val addInwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getAddInwardJobFreeIssueMaterialReturnItemMethod()

  public val modifyInwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getModifyInwardJobFreeIssueMaterialReturnItemMethod()

  public val approveInwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveInwardJobFreeIssueMaterialReturnItemMethod()

  public val deleteInwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDeleteInwardJobFreeIssueMaterialReturnItemMethod()

  public val reorderInwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReorderInwardJobFreeIssueMaterialReturnItemsMethod()

  public val viewInwardJobFreeIssueMaterialReturnItemByIDMethod:
      MethodDescriptor<Identifier, InwardJobFreeIssueMaterialReturnItem>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewInwardJobFreeIssueMaterialReturnItemByIDMethod()

  public val viewInwardJobFreeIssueMaterialReturnItemByInventoryHashMethod:
      MethodDescriptor<SimpleSearchReq, InwardJobFreeIssueMaterialReturnItem>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewInwardJobFreeIssueMaterialReturnItemByInventoryHashMethod()

  public val viewApprovedInwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, InwardJobsFreeIssueMaterialsReturnsItemsList>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewApprovedInwardJobFreeIssueMaterialReturnItemsMethod()

  public val viewUnapprovedInwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, InwardJobsFreeIssueMaterialsReturnsItemsList>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewUnapprovedInwardJobFreeIssueMaterialReturnItemsMethod()

  public val viewInwardJobFreeIssueMaterialReturnItemHistoryMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialReturnItemHistoryRequest, InwardJobsFreeIssueMaterialsReturnsItemsList>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewInwardJobFreeIssueMaterialReturnItemHistoryMethod()

  public val viewPaginatedApprovedInwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialReturnItemsSearchRequest, InwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedApprovedInwardJobFreeIssueMaterialReturnItemsMethod()

  public val viewPaginatedUnapprovedInwardJobFreeIssueMaterialReturnItemsMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialReturnItemsSearchRequest, InwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedUnapprovedInwardJobFreeIssueMaterialReturnItemsMethod()

  public val searchItemsWithPaginationMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialReturnItemsSearchRequest, InwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchItemsWithPaginationMethod()

  public val downloadItemsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsAsCSVMethod()

  public val downloadItemsTemplateAsCSVMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, InwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, InwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByUUIDMethod()

  public val viewByReferenceIDMethod:
      MethodDescriptor<SimpleSearchReq, InwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByReferenceIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, InwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod:
      MethodDescriptor<IdentifierUUID, InwardJobFreeIssueMaterialReturn>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod:
      MethodDescriptor<IdentifiersList, InwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewFromIDsMethod()

  public val viewAncillaryParametersByUUIDMethod:
      MethodDescriptor<IdentifierUUID, InwardJobFreeIssueMaterialReturnAncillaryParameters>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, InwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod:
      MethodDescriptor<IdentifierUUID, InwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServicePaginationReq, InwardJobsFreeIssueMaterialsReturnsServicePaginationResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewWithPaginationMethod()

  public val viewProspectiveFamiliesMethod: MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveFamiliesMethod()

  public val filterProspectiveFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterProspectiveFamiliesMethod()

  public val viewProspectiveInwardJobFreeIssueMaterialReturnItemMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest, InwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveInwardJobFreeIssueMaterialReturnItemMethod()

  public val searchReturnableInventoryMethod:
      MethodDescriptor<SearchReturnableInventoryForIdentifierUUID, GenericInventoryList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchReturnableInventoryMethod()

  public val filterReturnableInventoryMethod:
      MethodDescriptor<FilterReturnableInventoryForIdentifierUUID, GenericInventoryList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterReturnableInventoryMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadByUUIDMethod()

  public val downloadLabelByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadLabelByUUIDMethod()

  public val viewAddedFamilyQuantityForSourceMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest, DualQuantitiesResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod()

  public val searchAllMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq, InwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceFilterReq, InwardJobsFreeIssueMaterialsReturnsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountInStatusMethod()

  public val countMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceCountReq, CountResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsReturnsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.InwardJobsFreeIssueMaterialsReturnsService service as
   * suspending coroutines.
   */
  @StubFor(InwardJobsFreeIssueMaterialsReturnsServiceGrpc::class)
  public class InwardJobsFreeIssueMaterialsReturnsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<InwardJobsFreeIssueMaterialsReturnsServiceCoroutineStub>(channel,
      callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        InwardJobsFreeIssueMaterialsReturnsServiceCoroutineStub =
        InwardJobsFreeIssueMaterialsReturnsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: InwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: InwardJobsFreeIssueMaterialsReturnsServiceCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: InwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun revisionUpdate(request: InwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMagicLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsCompletableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addInwardJobFreeIssueMaterialReturnItem(request: InwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getAddInwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyInwardJobFreeIssueMaterialReturnItem(request: InwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getModifyInwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun approveInwardJobFreeIssueMaterialReturnItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveInwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun deleteInwardJobFreeIssueMaterialReturnItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDeleteInwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderInwardJobFreeIssueMaterialReturnItems(request: ReorderItemsRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReorderInwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInwardJobFreeIssueMaterialReturnItemByID(request: Identifier,
        headers: Metadata = Metadata()): InwardJobFreeIssueMaterialReturnItem = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewInwardJobFreeIssueMaterialReturnItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewInwardJobFreeIssueMaterialReturnItemByInventoryHash(request: SimpleSearchReq,
        headers: Metadata = Metadata()): InwardJobFreeIssueMaterialReturnItem = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewInwardJobFreeIssueMaterialReturnItemByInventoryHashMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewApprovedInwardJobFreeIssueMaterialReturnItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsReturnsItemsList = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewApprovedInwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewUnapprovedInwardJobFreeIssueMaterialReturnItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsReturnsItemsList = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewUnapprovedInwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewInwardJobFreeIssueMaterialReturnItemHistory(request: InwardJobFreeIssueMaterialReturnItemHistoryRequest,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsReturnsItemsList = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewInwardJobFreeIssueMaterialReturnItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedInwardJobFreeIssueMaterialReturnItems(request: InwardJobFreeIssueMaterialReturnItemsSearchRequest,
        headers: Metadata = Metadata()):
        InwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedApprovedInwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedInwardJobFreeIssueMaterialReturnItems(request: InwardJobFreeIssueMaterialReturnItemsSearchRequest,
        headers: Metadata = Metadata()):
        InwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedUnapprovedInwardJobFreeIssueMaterialReturnItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun searchItemsWithPagination(request: InwardJobFreeIssueMaterialReturnItemsSearchRequest,
        headers: Metadata = Metadata()):
        InwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByReferenceIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterialReturn = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): InwardJobFreeIssueMaterialReturnAncillaryParameters = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): InwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewWithPagination(request: InwardJobsFreeIssueMaterialsReturnsServicePaginationReq,
        headers: Metadata = Metadata()):
        InwardJobsFreeIssueMaterialsReturnsServicePaginationResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewProspectiveInwardJobFreeIssueMaterialReturnItem(request: InwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest
        = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveInwardJobFreeIssueMaterialReturnItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchReturnableInventoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterReturnableInventoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsDownloadableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadLabelByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewAddedFamilyQuantityForSource(request: InwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest,
        headers: Metadata = Metadata()): DualQuantitiesResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: InwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: InwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsReturnsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: InwardJobsFreeIssueMaterialsReturnsServiceCountReq,
        headers: Metadata = Metadata()): CountResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: InwardJobsFreeIssueMaterialsReturnsServiceFilterReq,
        headers: Metadata = Metadata()): StandardFile = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.InwardJobsFreeIssueMaterialsReturnsService service based
   * on Kotlin coroutines.
   */
  public abstract class InwardJobsFreeIssueMaterialsReturnsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Create.
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
        fun create(request: InwardJobsFreeIssueMaterialsReturnsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: InwardJobsFreeIssueMaterialsReturnsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.DraftUpdate.
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
        fun draftUpdate(request: InwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.RevisionUpdate.
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
        fun revisionUpdate(request: InwardJobsFreeIssueMaterialsReturnsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.SendEmail.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.IsCompletable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.IsCompletable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.AddInwardJobFreeIssueMaterialReturnItem.
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
        fun addInwardJobFreeIssueMaterialReturnItem(request: InwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.AddInwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ModifyInwardJobFreeIssueMaterialReturnItem.
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
        fun modifyInwardJobFreeIssueMaterialReturnItem(request: InwardJobsFreeIssueMaterialsReturnsServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ModifyInwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ApproveInwardJobFreeIssueMaterialReturnItem.
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
        fun approveInwardJobFreeIssueMaterialReturnItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ApproveInwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.DeleteInwardJobFreeIssueMaterialReturnItem.
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
        fun deleteInwardJobFreeIssueMaterialReturnItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.DeleteInwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ReorderInwardJobFreeIssueMaterialReturnItems.
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
        fun reorderInwardJobFreeIssueMaterialReturnItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ReorderInwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewInwardJobFreeIssueMaterialReturnItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInwardJobFreeIssueMaterialReturnItemByID(request: Identifier):
        InwardJobFreeIssueMaterialReturnItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewInwardJobFreeIssueMaterialReturnItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewInwardJobFreeIssueMaterialReturnItemByInventoryHash.
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
        fun viewInwardJobFreeIssueMaterialReturnItemByInventoryHash(request: SimpleSearchReq):
        InwardJobFreeIssueMaterialReturnItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewInwardJobFreeIssueMaterialReturnItemByInventoryHash is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewApprovedInwardJobFreeIssueMaterialReturnItems.
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
        fun viewApprovedInwardJobFreeIssueMaterialReturnItems(request: IdentifierWithSearchKey):
        InwardJobsFreeIssueMaterialsReturnsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewApprovedInwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewUnapprovedInwardJobFreeIssueMaterialReturnItems.
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
        fun viewUnapprovedInwardJobFreeIssueMaterialReturnItems(request: IdentifierWithSearchKey):
        InwardJobsFreeIssueMaterialsReturnsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewUnapprovedInwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewInwardJobFreeIssueMaterialReturnItemHistory.
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
        fun viewInwardJobFreeIssueMaterialReturnItemHistory(request: InwardJobFreeIssueMaterialReturnItemHistoryRequest):
        InwardJobsFreeIssueMaterialsReturnsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewInwardJobFreeIssueMaterialReturnItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewPaginatedApprovedInwardJobFreeIssueMaterialReturnItems.
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
        fun viewPaginatedApprovedInwardJobFreeIssueMaterialReturnItems(request: InwardJobFreeIssueMaterialReturnItemsSearchRequest):
        InwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewPaginatedApprovedInwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewPaginatedUnapprovedInwardJobFreeIssueMaterialReturnItems.
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
        fun viewPaginatedUnapprovedInwardJobFreeIssueMaterialReturnItems(request: InwardJobFreeIssueMaterialReturnItemsSearchRequest):
        InwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewPaginatedUnapprovedInwardJobFreeIssueMaterialReturnItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.SearchItemsWithPagination.
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
        fun searchItemsWithPagination(request: InwardJobFreeIssueMaterialReturnItemsSearchRequest):
        InwardJobsFreeIssueMaterialsReturnsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.SearchItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadItemsAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadItemsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadItemsTemplateAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadItemsTemplateAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): InwardJobFreeIssueMaterialReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): InwardJobFreeIssueMaterialReturn =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewByReferenceID.
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
        InwardJobFreeIssueMaterialReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewByReferenceID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): InwardJobFreeIssueMaterialReturn
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewEssentialByUUID.
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
        InwardJobFreeIssueMaterialReturn = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewFromIDs.
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
        InwardJobsFreeIssueMaterialsReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewAncillaryParametersByUUID.
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
        InwardJobFreeIssueMaterialReturnAncillaryParameters = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewAncillaryParametersByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): InwardJobsFreeIssueMaterialsReturnsList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewAllForEntityUUID.
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
        InwardJobsFreeIssueMaterialsReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewWithPagination.
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
        fun viewWithPagination(request: InwardJobsFreeIssueMaterialsReturnsServicePaginationReq):
        InwardJobsFreeIssueMaterialsReturnsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.FilterProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.FilterProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewProspectiveInwardJobFreeIssueMaterialReturnItem.
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
        fun viewProspectiveInwardJobFreeIssueMaterialReturnItem(request: InwardJobFreeIssueMaterialReturnItemProspectiveInfoRequest):
        InwardJobsFreeIssueMaterialsReturnsServiceItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewProspectiveInwardJobFreeIssueMaterialReturnItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.SearchReturnableInventory.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.SearchReturnableInventory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.FilterReturnableInventory.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.FilterReturnableInventory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadLabelByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadLabelByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewAddedFamilyQuantityForSource.
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
        fun viewAddedFamilyQuantityForSource(request: InwardJobsFreeIssueMaterialsReturnsServiceAlreadyAddedQuantityForSourceRequest):
        DualQuantitiesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.ViewAddedFamilyQuantityForSource is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.SearchAll.
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
        fun searchAll(request: InwardJobsFreeIssueMaterialsReturnsServiceSearchAllReq):
        InwardJobsFreeIssueMaterialsReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: InwardJobsFreeIssueMaterialsReturnsServiceFilterReq):
        InwardJobsFreeIssueMaterialsReturnsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsReturnsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: InwardJobsFreeIssueMaterialsReturnsServiceCountReq):
        CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadAsCSV.
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
        fun downloadAsCSV(request: InwardJobsFreeIssueMaterialsReturnsServiceFilterReq):
        StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsReturnsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsCompletableMethod(),
      implementation = ::isCompletable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getAddInwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::addInwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getModifyInwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::modifyInwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getApproveInwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::approveInwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDeleteInwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::deleteInwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getReorderInwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::reorderInwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewInwardJobFreeIssueMaterialReturnItemByIDMethod(),
      implementation = ::viewInwardJobFreeIssueMaterialReturnItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewInwardJobFreeIssueMaterialReturnItemByInventoryHashMethod(),
      implementation = ::viewInwardJobFreeIssueMaterialReturnItemByInventoryHash
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewApprovedInwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::viewApprovedInwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewUnapprovedInwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::viewUnapprovedInwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewInwardJobFreeIssueMaterialReturnItemHistoryMethod(),
      implementation = ::viewInwardJobFreeIssueMaterialReturnItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedApprovedInwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::viewPaginatedApprovedInwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewPaginatedUnapprovedInwardJobFreeIssueMaterialReturnItemsMethod(),
      implementation = ::viewPaginatedUnapprovedInwardJobFreeIssueMaterialReturnItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchItemsWithPaginationMethod(),
      implementation = ::searchItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsAsCSVMethod(),
      implementation = ::downloadItemsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      implementation = ::downloadItemsTemplateAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewByReferenceIDMethod(),
      implementation = ::viewByReferenceID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      implementation = ::viewAncillaryParametersByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveFamiliesMethod(),
      implementation = ::viewProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      implementation = ::filterProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewProspectiveInwardJobFreeIssueMaterialReturnItemMethod(),
      implementation = ::viewProspectiveInwardJobFreeIssueMaterialReturnItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchReturnableInventoryMethod(),
      implementation = ::searchReturnableInventory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterReturnableInventoryMethod(),
      implementation = ::filterReturnableInventory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadLabelByUUIDMethod(),
      implementation = ::downloadLabelByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      implementation = ::viewAddedFamilyQuantityForSource
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsReturnsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
