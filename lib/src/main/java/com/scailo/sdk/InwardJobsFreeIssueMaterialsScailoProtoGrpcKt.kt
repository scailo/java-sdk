package com.scailo.sdk

import com.scailo.sdk.InwardJobsFreeIssueMaterialsServiceGrpc.getServiceDescriptor
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
 * Scailo.InwardJobsFreeIssueMaterialsService.
 */
public object InwardJobsFreeIssueMaterialsServiceGrpcKt {
  public const val SERVICE_NAME: String = InwardJobsFreeIssueMaterialsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getCreateMethod()

  public val draftMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getSendEmailMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getCreateMagicLinkMethod()

  public val autofillMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceAutofillRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getAutofillMethod()

  public val isCompletableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getIsCompletableMethod()

  public val addInwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getAddInwardJobFreeIssueMaterialItemMethod()

  public val modifyInwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getModifyInwardJobFreeIssueMaterialItemMethod()

  public val approveInwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getApproveInwardJobFreeIssueMaterialItemMethod()

  public val deleteInwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getDeleteInwardJobFreeIssueMaterialItemMethod()

  public val reorderInwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsServiceGrpc.getReorderInwardJobFreeIssueMaterialItemsMethod()

  public val viewInwardJobFreeIssueMaterialItemByIDMethod:
      MethodDescriptor<Identifier, InwardJobFreeIssueMaterialItem>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewInwardJobFreeIssueMaterialItemByIDMethod()

  public val viewApprovedInwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, InwardJobsFreeIssueMaterialsItemsList>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewApprovedInwardJobFreeIssueMaterialItemsMethod()

  public val viewUnapprovedInwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, InwardJobsFreeIssueMaterialsItemsList>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewUnapprovedInwardJobFreeIssueMaterialItemsMethod()

  public val viewInwardJobFreeIssueMaterialItemHistoryMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialItemHistoryRequest, InwardJobsFreeIssueMaterialsItemsList>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewInwardJobFreeIssueMaterialItemHistoryMethod()

  public val viewPaginatedApprovedInwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialItemsSearchRequest, InwardJobsFreeIssueMaterialsServicePaginatedItemsResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedApprovedInwardJobFreeIssueMaterialItemsMethod()

  public val viewPaginatedUnapprovedInwardJobFreeIssueMaterialItemsMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialItemsSearchRequest, InwardJobsFreeIssueMaterialsServicePaginatedItemsResponse>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedUnapprovedInwardJobFreeIssueMaterialItemsMethod()

  public val searchItemsWithPaginationMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialItemsSearchRequest, InwardJobsFreeIssueMaterialsServicePaginatedItemsResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getSearchItemsWithPaginationMethod()

  public val downloadItemsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsAsCSVMethod()

  public val downloadItemsTemplateAsCSVMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsTemplateAsCSVMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, InwardJobFreeIssueMaterial>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, InwardJobFreeIssueMaterial>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewByUUIDMethod()

  public val viewByReferenceIDMethod: MethodDescriptor<SimpleSearchReq, InwardJobFreeIssueMaterial>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewByReferenceIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, InwardJobFreeIssueMaterial>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, InwardJobFreeIssueMaterial>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, InwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewFromIDsMethod()

  public val viewAncillaryParametersByUUIDMethod:
      MethodDescriptor<IdentifierUUID, InwardJobFreeIssueMaterialAncillaryParameters>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewAncillaryParametersByUUIDMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, InwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod:
      MethodDescriptor<IdentifierUUID, InwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServicePaginationReq, InwardJobsFreeIssueMaterialsServicePaginationResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewWithPaginationMethod()

  public val viewProspectiveFamiliesMethod: MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveFamiliesMethod()

  public val filterProspectiveFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getFilterProspectiveFamiliesMethod()

  public val viewProspectiveInwardJobFreeIssueMaterialItemMethod:
      MethodDescriptor<InwardJobFreeIssueMaterialItemProspectiveInfoRequest, InwardJobsFreeIssueMaterialsServiceItemCreateRequest>
    @JvmStatic
    get() =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveInwardJobFreeIssueMaterialItemMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadByUUIDMethod()

  public val downloadLabelByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadLabelByUUIDMethod()

  public val viewAddedFamilyQuantityForSourceMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceAlreadyAddedQuantityForSourceRequest, DualQuantitiesResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod()

  public val searchAllMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceSearchAllReq, InwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceFilterReq, InwardJobsFreeIssueMaterialsList>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getCountInStatusMethod()

  public val countMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceCountReq, CountResponse>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod:
      MethodDescriptor<InwardJobsFreeIssueMaterialsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.InwardJobsFreeIssueMaterialsService service as
   * suspending coroutines.
   */
  @StubFor(InwardJobsFreeIssueMaterialsServiceGrpc::class)
  public class InwardJobsFreeIssueMaterialsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<InwardJobsFreeIssueMaterialsServiceCoroutineStub>(channel, callOptions)
      {
    override fun build(channel: Channel, callOptions: CallOptions):
        InwardJobsFreeIssueMaterialsServiceCoroutineStub =
        InwardJobsFreeIssueMaterialsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: InwardJobsFreeIssueMaterialsServiceCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: InwardJobsFreeIssueMaterialsServiceCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: InwardJobsFreeIssueMaterialsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: InwardJobsFreeIssueMaterialsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getSendEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getCreateMagicLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun autofill(request: InwardJobsFreeIssueMaterialsServiceAutofillRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getAutofillMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getIsCompletableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addInwardJobFreeIssueMaterialItem(request: InwardJobsFreeIssueMaterialsServiceItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getAddInwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyInwardJobFreeIssueMaterialItem(request: InwardJobsFreeIssueMaterialsServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getModifyInwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveInwardJobFreeIssueMaterialItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getApproveInwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteInwardJobFreeIssueMaterialItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getDeleteInwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderInwardJobFreeIssueMaterialItems(request: ReorderItemsRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getReorderInwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInwardJobFreeIssueMaterialItemByID(request: Identifier, headers: Metadata
        = Metadata()): InwardJobFreeIssueMaterialItem = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewInwardJobFreeIssueMaterialItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedInwardJobFreeIssueMaterialItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsItemsList = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewApprovedInwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewUnapprovedInwardJobFreeIssueMaterialItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsItemsList = unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewUnapprovedInwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewInwardJobFreeIssueMaterialItemHistory(request: InwardJobFreeIssueMaterialItemHistoryRequest,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsItemsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewInwardJobFreeIssueMaterialItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedInwardJobFreeIssueMaterialItems(request: InwardJobFreeIssueMaterialItemsSearchRequest,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsServicePaginatedItemsResponse =
        unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedApprovedInwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedInwardJobFreeIssueMaterialItems(request: InwardJobFreeIssueMaterialItemsSearchRequest,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsServicePaginatedItemsResponse =
        unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedUnapprovedInwardJobFreeIssueMaterialItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun searchItemsWithPagination(request: InwardJobFreeIssueMaterialItemsSearchRequest,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsServicePaginatedItemsResponse =
        unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getSearchItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterial = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterial = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterial = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewByReferenceIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterial = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobFreeIssueMaterial = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): InwardJobFreeIssueMaterialAncillaryParameters = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): InwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: InwardJobsFreeIssueMaterialsServicePaginationReq,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsServicePaginationResponse =
        unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewProspectiveInwardJobFreeIssueMaterialItem(request: InwardJobFreeIssueMaterialItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsServiceItemCreateRequest =
        unaryRpc(
      channel,
     
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveInwardJobFreeIssueMaterialItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getIsDownloadableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadLabelByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewAddedFamilyQuantityForSource(request: InwardJobsFreeIssueMaterialsServiceAlreadyAddedQuantityForSourceRequest,
        headers: Metadata = Metadata()): DualQuantitiesResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: InwardJobsFreeIssueMaterialsServiceSearchAllReq,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: InwardJobsFreeIssueMaterialsServiceFilterReq,
        headers: Metadata = Metadata()): InwardJobsFreeIssueMaterialsList = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsFreeIssueMaterialsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: InwardJobsFreeIssueMaterialsServiceCountReq, headers: Metadata
        = Metadata()): CountResponse = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: InwardJobsFreeIssueMaterialsServiceFilterReq,
        headers: Metadata = Metadata()): StandardFile = unaryRpc(
      channel,
      InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.InwardJobsFreeIssueMaterialsService service based on
   * Kotlin coroutines.
   */
  public abstract class InwardJobsFreeIssueMaterialsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: InwardJobsFreeIssueMaterialsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: InwardJobsFreeIssueMaterialsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: InwardJobsFreeIssueMaterialsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.RevisionUpdate.
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
        fun revisionUpdate(request: InwardJobsFreeIssueMaterialsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.SendEmail.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Autofill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun autofill(request: InwardJobsFreeIssueMaterialsServiceAutofillRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Autofill is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.IsCompletable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.IsCompletable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.AddInwardJobFreeIssueMaterialItem.
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
        fun addInwardJobFreeIssueMaterialItem(request: InwardJobsFreeIssueMaterialsServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.AddInwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ModifyInwardJobFreeIssueMaterialItem.
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
        fun modifyInwardJobFreeIssueMaterialItem(request: InwardJobsFreeIssueMaterialsServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ModifyInwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ApproveInwardJobFreeIssueMaterialItem.
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
        fun approveInwardJobFreeIssueMaterialItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ApproveInwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.DeleteInwardJobFreeIssueMaterialItem.
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
        fun deleteInwardJobFreeIssueMaterialItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.DeleteInwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ReorderInwardJobFreeIssueMaterialItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderInwardJobFreeIssueMaterialItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ReorderInwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewInwardJobFreeIssueMaterialItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInwardJobFreeIssueMaterialItemByID(request: Identifier):
        InwardJobFreeIssueMaterialItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewInwardJobFreeIssueMaterialItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewApprovedInwardJobFreeIssueMaterialItems.
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
        fun viewApprovedInwardJobFreeIssueMaterialItems(request: IdentifierWithSearchKey):
        InwardJobsFreeIssueMaterialsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewApprovedInwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewUnapprovedInwardJobFreeIssueMaterialItems.
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
        fun viewUnapprovedInwardJobFreeIssueMaterialItems(request: IdentifierWithSearchKey):
        InwardJobsFreeIssueMaterialsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewUnapprovedInwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewInwardJobFreeIssueMaterialItemHistory.
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
        fun viewInwardJobFreeIssueMaterialItemHistory(request: InwardJobFreeIssueMaterialItemHistoryRequest):
        InwardJobsFreeIssueMaterialsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewInwardJobFreeIssueMaterialItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewPaginatedApprovedInwardJobFreeIssueMaterialItems.
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
        fun viewPaginatedApprovedInwardJobFreeIssueMaterialItems(request: InwardJobFreeIssueMaterialItemsSearchRequest):
        InwardJobsFreeIssueMaterialsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewPaginatedApprovedInwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewPaginatedUnapprovedInwardJobFreeIssueMaterialItems.
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
        fun viewPaginatedUnapprovedInwardJobFreeIssueMaterialItems(request: InwardJobFreeIssueMaterialItemsSearchRequest):
        InwardJobsFreeIssueMaterialsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewPaginatedUnapprovedInwardJobFreeIssueMaterialItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.SearchItemsWithPagination.
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
        fun searchItemsWithPagination(request: InwardJobFreeIssueMaterialItemsSearchRequest):
        InwardJobsFreeIssueMaterialsServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.SearchItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.DownloadItemsAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.DownloadItemsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.DownloadItemsTemplateAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.DownloadItemsTemplateAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): InwardJobFreeIssueMaterial = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): InwardJobFreeIssueMaterial = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewByReferenceID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByReferenceID(request: SimpleSearchReq): InwardJobFreeIssueMaterial
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewByReferenceID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): InwardJobFreeIssueMaterial =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): InwardJobFreeIssueMaterial
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): InwardJobsFreeIssueMaterialsList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewAncillaryParametersByUUID.
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
        InwardJobFreeIssueMaterialAncillaryParameters = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewAncillaryParametersByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): InwardJobsFreeIssueMaterialsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewAllForEntityUUID.
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
        InwardJobsFreeIssueMaterialsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewWithPagination.
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
        fun viewWithPagination(request: InwardJobsFreeIssueMaterialsServicePaginationReq):
        InwardJobsFreeIssueMaterialsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.FilterProspectiveFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.FilterProspectiveFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewProspectiveInwardJobFreeIssueMaterialItem.
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
        fun viewProspectiveInwardJobFreeIssueMaterialItem(request: InwardJobFreeIssueMaterialItemProspectiveInfoRequest):
        InwardJobsFreeIssueMaterialsServiceItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewProspectiveInwardJobFreeIssueMaterialItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.DownloadLabelByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.DownloadLabelByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsFreeIssueMaterialsService.ViewAddedFamilyQuantityForSource.
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
        fun viewAddedFamilyQuantityForSource(request: InwardJobsFreeIssueMaterialsServiceAlreadyAddedQuantityForSourceRequest):
        DualQuantitiesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.ViewAddedFamilyQuantityForSource is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: InwardJobsFreeIssueMaterialsServiceSearchAllReq):
        InwardJobsFreeIssueMaterialsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: InwardJobsFreeIssueMaterialsServiceFilterReq):
        InwardJobsFreeIssueMaterialsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: InwardJobsFreeIssueMaterialsServiceCountReq):
        CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsFreeIssueMaterialsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: InwardJobsFreeIssueMaterialsServiceFilterReq):
        StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsFreeIssueMaterialsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getAutofillMethod(),
      implementation = ::autofill
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getIsCompletableMethod(),
      implementation = ::isCompletable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getAddInwardJobFreeIssueMaterialItemMethod(),
      implementation = ::addInwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getModifyInwardJobFreeIssueMaterialItemMethod(),
      implementation = ::modifyInwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getApproveInwardJobFreeIssueMaterialItemMethod(),
      implementation = ::approveInwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getDeleteInwardJobFreeIssueMaterialItemMethod(),
      implementation = ::deleteInwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getReorderInwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::reorderInwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewInwardJobFreeIssueMaterialItemByIDMethod(),
      implementation = ::viewInwardJobFreeIssueMaterialItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewApprovedInwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::viewApprovedInwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewUnapprovedInwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::viewUnapprovedInwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewInwardJobFreeIssueMaterialItemHistoryMethod(),
      implementation = ::viewInwardJobFreeIssueMaterialItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedApprovedInwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::viewPaginatedApprovedInwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewPaginatedUnapprovedInwardJobFreeIssueMaterialItemsMethod(),
      implementation = ::viewPaginatedUnapprovedInwardJobFreeIssueMaterialItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getSearchItemsWithPaginationMethod(),
      implementation = ::searchItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsAsCSVMethod(),
      implementation = ::downloadItemsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      implementation = ::downloadItemsTemplateAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewByReferenceIDMethod(),
      implementation = ::viewByReferenceID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      implementation = ::viewAncillaryParametersByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveFamiliesMethod(),
      implementation = ::viewProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getFilterProspectiveFamiliesMethod(),
      implementation = ::filterProspectiveFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewProspectiveInwardJobFreeIssueMaterialItemMethod(),
      implementation = ::viewProspectiveInwardJobFreeIssueMaterialItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadLabelByUUIDMethod(),
      implementation = ::downloadLabelByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        InwardJobsFreeIssueMaterialsServiceGrpc.getViewAddedFamilyQuantityForSourceMethod(),
      implementation = ::viewAddedFamilyQuantityForSource
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsFreeIssueMaterialsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
