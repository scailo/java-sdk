package com.scailo.sdk

import com.scailo.sdk.OutwardJobsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.OutwardJobsService.
 */
public object OutwardJobsServiceGrpcKt {
  public const val SERVICE_NAME: String = OutwardJobsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<OutwardJobsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getCreateMethod()

  public val draftMethod: MethodDescriptor<OutwardJobsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<OutwardJobsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<OutwardJobsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<RepeatWithDeliveryDate, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getSendEmailMethod()

  public val autofillMethod: MethodDescriptor<OutwardJobsServiceAutofillRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getAutofillMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getCreateMagicLinkMethod()

  public val isCompletableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getIsCompletableMethod()

  public val isOrderedMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getIsOrderedMethod()

  public val isDispatchedMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getIsDispatchedMethod()

  public val addMultipleOutwardJobInwardItemsMethod:
      MethodDescriptor<OutwardJobsServiceMultipleInwardItemsCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getAddMultipleOutwardJobInwardItemsMethod()

  public val addOutwardJobInwardItemMethod:
      MethodDescriptor<OutwardJobsServiceInwardItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getAddOutwardJobInwardItemMethod()

  public val modifyOutwardJobInwardItemMethod:
      MethodDescriptor<OutwardJobsServiceInwardItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getModifyOutwardJobInwardItemMethod()

  public val approveOutwardJobInwardItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getApproveOutwardJobInwardItemMethod()

  public val deleteOutwardJobInwardItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDeleteOutwardJobInwardItemMethod()

  public val reorderOutwardJobInwardItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getReorderOutwardJobInwardItemsMethod()

  public val viewOutwardJobInwardItemByIDMethod: MethodDescriptor<Identifier, OutwardJobInwardItem>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewOutwardJobInwardItemByIDMethod()

  public val viewApprovedOutwardJobInwardItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, OutwardJobsInwardItemsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewApprovedOutwardJobInwardItemsMethod()

  public val viewUnapprovedOutwardJobInwardItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, OutwardJobsInwardItemsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobInwardItemsMethod()

  public val viewOutwardJobInwardItemHistoryMethod:
      MethodDescriptor<OutwardJobInwardItemHistoryRequest, OutwardJobsInwardItemsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewOutwardJobInwardItemHistoryMethod()

  public val viewPaginatedApprovedOutwardJobInwardItemsMethod:
      MethodDescriptor<OutwardJobInwardItemsSearchRequest, OutwardJobsServicePaginatedInwardItemsResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobInwardItemsMethod()

  public val viewPaginatedUnapprovedOutwardJobInwardItemsMethod:
      MethodDescriptor<OutwardJobInwardItemsSearchRequest, OutwardJobsServicePaginatedInwardItemsResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobInwardItemsMethod()

  public val searchInwardItemsWithPaginationMethod:
      MethodDescriptor<OutwardJobInwardItemsSearchRequest, OutwardJobsServicePaginatedInwardItemsResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod()

  public val downloadInwardItemsCSVTemplateMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod()

  public val uploadOutwardJobInwardItemsMethod:
      MethodDescriptor<IdentifierUUIDWithFile, IdentifiersList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getUploadOutwardJobInwardItemsMethod()

  public val addMultipleOutwardJobOutwardItemsMethod:
      MethodDescriptor<OutwardJobsServiceMultipleOutwardItemsCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getAddMultipleOutwardJobOutwardItemsMethod()

  public val addOutwardJobOutwardItemMethod:
      MethodDescriptor<OutwardJobsServiceOutwardItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getAddOutwardJobOutwardItemMethod()

  public val modifyOutwardJobOutwardItemMethod:
      MethodDescriptor<OutwardJobsServiceOutwardItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getModifyOutwardJobOutwardItemMethod()

  public val approveOutwardJobOutwardItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getApproveOutwardJobOutwardItemMethod()

  public val deleteOutwardJobOutwardItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDeleteOutwardJobOutwardItemMethod()

  public val reorderOutwardJobOutwardItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getReorderOutwardJobOutwardItemsMethod()

  public val viewOutwardJobOutwardItemByIDMethod:
      MethodDescriptor<Identifier, OutwardJobOutwardItem>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemByIDMethod()

  public val viewApprovedOutwardJobOutwardItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, OutwardJobsOutwardItemsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewApprovedOutwardJobOutwardItemsMethod()

  public val viewUnapprovedOutwardJobOutwardItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, OutwardJobsOutwardItemsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobOutwardItemsMethod()

  public val viewOutwardJobOutwardItemHistoryMethod:
      MethodDescriptor<OutwardJobOutwardItemHistoryRequest, OutwardJobsOutwardItemsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemHistoryMethod()

  public val viewPaginatedApprovedOutwardJobOutwardItemsMethod:
      MethodDescriptor<OutwardJobOutwardItemsSearchRequest, OutwardJobsServicePaginatedOutwardItemsResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobOutwardItemsMethod()

  public val viewPaginatedUnapprovedOutwardJobOutwardItemsMethod:
      MethodDescriptor<OutwardJobOutwardItemsSearchRequest, OutwardJobsServicePaginatedOutwardItemsResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod()

  public val searchOutwardItemsWithPaginationMethod:
      MethodDescriptor<OutwardJobOutwardItemsSearchRequest, OutwardJobsServicePaginatedOutwardItemsResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod()

  public val downloadOutwardItemsCSVTemplateMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod()

  public val uploadOutwardJobOutwardItemsMethod:
      MethodDescriptor<IdentifierUUIDWithFile, IdentifiersList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getUploadOutwardJobOutwardItemsMethod()

  public val addOutwardJobContactMethod:
      MethodDescriptor<OutwardJobsServiceContactCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getAddOutwardJobContactMethod()

  public val approveOutwardJobContactMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getApproveOutwardJobContactMethod()

  public val deleteOutwardJobContactMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDeleteOutwardJobContactMethod()

  public val viewOutwardJobContactByIDMethod: MethodDescriptor<Identifier, OutwardJobContact>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewOutwardJobContactByIDMethod()

  public val viewOutwardJobContactsMethod: MethodDescriptor<IdentifierUUID, OutwardJobContactsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewOutwardJobContactsMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, OutwardJob>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, OutwardJob>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, OutwardJob>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, OutwardJob>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, OutwardJobsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewFromIDsMethod()

  public val viewAncillaryParametersByUUIDMethod:
      MethodDescriptor<IdentifierUUID, OutwardJobAncillaryParameters>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, OutwardJobsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, OutwardJobsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<OutwardJobsServicePaginationReq, OutwardJobsServicePaginationResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewWithPaginationMethod()

  public val viewAssociatedPurchaseOrderIDsMethod: MethodDescriptor<IdentifierUUID, IdentifiersList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewAssociatedPurchaseOrderIDsMethod()

  public val viewProspectiveInwardFamiliesMethod:
      MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod()

  public val filterProspectiveInwardFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod()

  public val viewProspectiveOutwardJobInwardItemMethod:
      MethodDescriptor<OutwardJobInwardItemProspectiveInfoRequest, OutwardJobsServiceInwardItemCreateRequest>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewProspectiveOutwardJobInwardItemMethod()

  public val viewInwardInventoryMatchMethod:
      MethodDescriptor<IdentifierUUID, OutwardJobInwardInventoryMatchList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewInwardInventoryMatchMethod()

  public val viewProspectiveOutwardFamiliesMethod:
      MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod()

  public val filterProspectiveOutwardFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod()

  public val viewProspectiveOutwardJobOutwardItemMethod:
      MethodDescriptor<OutwardJobOutwardItemProspectiveInfoRequest, OutwardJobsServiceOutwardItemCreateRequest>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewProspectiveOutwardJobOutwardItemMethod()

  public val viewOutwardInventoryMatchMethod:
      MethodDescriptor<IdentifierUUID, OutwardJobOutwardInventoryMatchList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDownloadByUUIDMethod()

  public val searchAllMethod: MethodDescriptor<OutwardJobsServiceSearchAllReq, OutwardJobsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<OutwardJobsServiceFilterReq, OutwardJobsList>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<OutwardJobsServiceCountReq, CountResponse>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<OutwardJobsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = OutwardJobsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.OutwardJobsService service as suspending coroutines.
   */
  @StubFor(OutwardJobsServiceGrpc::class)
  public class OutwardJobsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<OutwardJobsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): OutwardJobsServiceCoroutineStub
        = OutwardJobsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: OutwardJobsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: OutwardJobsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: OutwardJobsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: OutwardJobsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getSendEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun autofill(request: OutwardJobsServiceAutofillRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getAutofillMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getCreateMagicLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getIsCompletableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun isOrdered(request: IdentifierUUID, headers: Metadata = Metadata()):
        BooleanResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getIsOrderedMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun isDispatched(request: IdentifierUUID, headers: Metadata = Metadata()):
        BooleanResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getIsDispatchedMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addMultipleOutwardJobInwardItems(request: OutwardJobsServiceMultipleInwardItemsCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getAddMultipleOutwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addOutwardJobInwardItem(request: OutwardJobsServiceInwardItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getAddOutwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyOutwardJobInwardItem(request: OutwardJobsServiceInwardItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getModifyOutwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveOutwardJobInwardItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getApproveOutwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteOutwardJobInwardItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getDeleteOutwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderOutwardJobInwardItems(request: ReorderItemsRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getReorderOutwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOutwardJobInwardItemByID(request: Identifier, headers: Metadata =
        Metadata()): OutwardJobInwardItem = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewOutwardJobInwardItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedOutwardJobInwardItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): OutwardJobsInwardItemsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewApprovedOutwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnapprovedOutwardJobInwardItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): OutwardJobsInwardItemsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOutwardJobInwardItemHistory(request: OutwardJobInwardItemHistoryRequest,
        headers: Metadata = Metadata()): OutwardJobsInwardItemsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewOutwardJobInwardItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedOutwardJobInwardItems(request: OutwardJobInwardItemsSearchRequest,
        headers: Metadata = Metadata()): OutwardJobsServicePaginatedInwardItemsResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedOutwardJobInwardItems(request: OutwardJobInwardItemsSearchRequest,
        headers: Metadata = Metadata()): OutwardJobsServicePaginatedInwardItemsResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchInwardItemsWithPagination(request: OutwardJobInwardItemsSearchRequest,
        headers: Metadata = Metadata()): OutwardJobsServicePaginatedInwardItemsResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadInwardItemsCSVTemplate(request: IdentifierUUID, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadOutwardJobInwardItems(request: IdentifierUUIDWithFile,
        headers: Metadata = Metadata()): IdentifiersList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getUploadOutwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addMultipleOutwardJobOutwardItems(request: OutwardJobsServiceMultipleOutwardItemsCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getAddMultipleOutwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addOutwardJobOutwardItem(request: OutwardJobsServiceOutwardItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getAddOutwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyOutwardJobOutwardItem(request: OutwardJobsServiceOutwardItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getModifyOutwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveOutwardJobOutwardItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getApproveOutwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteOutwardJobOutwardItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getDeleteOutwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderOutwardJobOutwardItems(request: ReorderItemsRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getReorderOutwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOutwardJobOutwardItemByID(request: Identifier, headers: Metadata =
        Metadata()): OutwardJobOutwardItem = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedOutwardJobOutwardItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): OutwardJobsOutwardItemsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewApprovedOutwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnapprovedOutwardJobOutwardItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): OutwardJobsOutwardItemsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewOutwardJobOutwardItemHistory(request: OutwardJobOutwardItemHistoryRequest,
        headers: Metadata = Metadata()): OutwardJobsOutwardItemsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedOutwardJobOutwardItems(request: OutwardJobOutwardItemsSearchRequest,
        headers: Metadata = Metadata()): OutwardJobsServicePaginatedOutwardItemsResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedOutwardJobOutwardItems(request: OutwardJobOutwardItemsSearchRequest,
        headers: Metadata = Metadata()): OutwardJobsServicePaginatedOutwardItemsResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun searchOutwardItemsWithPagination(request: OutwardJobOutwardItemsSearchRequest,
        headers: Metadata = Metadata()): OutwardJobsServicePaginatedOutwardItemsResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadOutwardItemsCSVTemplate(request: IdentifierUUID, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadOutwardJobOutwardItems(request: IdentifierUUIDWithFile,
        headers: Metadata = Metadata()): IdentifiersList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getUploadOutwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addOutwardJobContact(request: OutwardJobsServiceContactCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getAddOutwardJobContactMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveOutwardJobContact(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getApproveOutwardJobContactMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteOutwardJobContact(request: IdentifierWithUserComment, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getDeleteOutwardJobContactMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOutwardJobContactByID(request: Identifier, headers: Metadata =
        Metadata()): OutwardJobContact = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewOutwardJobContactByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOutwardJobContacts(request: IdentifierUUID, headers: Metadata =
        Metadata()): OutwardJobContactsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewOutwardJobContactsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): OutwardJob =
        unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJob = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJob = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJob = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): OutwardJobAncillaryParameters = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        OutwardJobsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): OutwardJobsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: OutwardJobsServicePaginationReq,
        headers: Metadata = Metadata()): OutwardJobsServicePaginationResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAssociatedPurchaseOrderIDs(request: IdentifierUUID, headers: Metadata =
        Metadata()): IdentifiersList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewAssociatedPurchaseOrderIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewProspectiveInwardFamilies(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): FamiliesList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filterProspectiveInwardFamilies(request: FilterFamiliesReqForIdentifier,
        headers: Metadata = Metadata()): FamiliesList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewProspectiveOutwardJobInwardItem(request: OutwardJobInwardItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): OutwardJobsServiceInwardItemCreateRequest = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewProspectiveOutwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInwardInventoryMatch(request: IdentifierUUID, headers: Metadata =
        Metadata()): OutwardJobInwardInventoryMatchList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewInwardInventoryMatchMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewProspectiveOutwardFamilies(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): FamiliesList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filterProspectiveOutwardFamilies(request: FilterFamiliesReqForIdentifier,
        headers: Metadata = Metadata()): FamiliesList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewProspectiveOutwardJobOutwardItem(request: OutwardJobOutwardItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): OutwardJobsServiceOutwardItemCreateRequest = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewProspectiveOutwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOutwardInventoryMatch(request: IdentifierUUID, headers: Metadata =
        Metadata()): OutwardJobOutwardInventoryMatchList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getIsDownloadableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getDownloadByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: OutwardJobsServiceSearchAllReq, headers: Metadata =
        Metadata()): OutwardJobsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: OutwardJobsServiceFilterReq, headers: Metadata = Metadata()):
        OutwardJobsList = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      OutwardJobsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: OutwardJobsServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: OutwardJobsServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      OutwardJobsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.OutwardJobsService service based on Kotlin coroutines.
   */
  public abstract class OutwardJobsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: OutwardJobsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: OutwardJobsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: OutwardJobsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: OutwardJobsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.SendEmail.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Autofill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun autofill(request: OutwardJobsServiceAutofillRequest): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Autofill is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.IsCompletable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.IsCompletable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.IsOrdered.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isOrdered(request: IdentifierUUID): BooleanResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.IsOrdered is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.IsDispatched.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isDispatched(request: IdentifierUUID): BooleanResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.IsDispatched is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.AddMultipleOutwardJobInwardItems.
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
        fun addMultipleOutwardJobInwardItems(request: OutwardJobsServiceMultipleInwardItemsCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.AddMultipleOutwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.AddOutwardJobInwardItem.
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
        fun addOutwardJobInwardItem(request: OutwardJobsServiceInwardItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.AddOutwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ModifyOutwardJobInwardItem.
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
        fun modifyOutwardJobInwardItem(request: OutwardJobsServiceInwardItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ModifyOutwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ApproveOutwardJobInwardItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveOutwardJobInwardItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ApproveOutwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.DeleteOutwardJobInwardItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteOutwardJobInwardItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.DeleteOutwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ReorderOutwardJobInwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderOutwardJobInwardItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ReorderOutwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewOutwardJobInwardItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOutwardJobInwardItemByID(request: Identifier): OutwardJobInwardItem
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewOutwardJobInwardItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewApprovedOutwardJobInwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedOutwardJobInwardItems(request: IdentifierWithSearchKey):
        OutwardJobsInwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewApprovedOutwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewUnapprovedOutwardJobInwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedOutwardJobInwardItems(request: IdentifierWithSearchKey):
        OutwardJobsInwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewUnapprovedOutwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewOutwardJobInwardItemHistory.
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
        fun viewOutwardJobInwardItemHistory(request: OutwardJobInwardItemHistoryRequest):
        OutwardJobsInwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewOutwardJobInwardItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewPaginatedApprovedOutwardJobInwardItems.
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
        fun viewPaginatedApprovedOutwardJobInwardItems(request: OutwardJobInwardItemsSearchRequest):
        OutwardJobsServicePaginatedInwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewPaginatedApprovedOutwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewPaginatedUnapprovedOutwardJobInwardItems.
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
        fun viewPaginatedUnapprovedOutwardJobInwardItems(request: OutwardJobInwardItemsSearchRequest):
        OutwardJobsServicePaginatedInwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewPaginatedUnapprovedOutwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.SearchInwardItemsWithPagination.
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
        fun searchInwardItemsWithPagination(request: OutwardJobInwardItemsSearchRequest):
        OutwardJobsServicePaginatedInwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.SearchInwardItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.DownloadInwardItemsCSVTemplate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadInwardItemsCSVTemplate(request: IdentifierUUID): StandardFile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.DownloadInwardItemsCSVTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.UploadOutwardJobInwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadOutwardJobInwardItems(request: IdentifierUUIDWithFile):
        IdentifiersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.UploadOutwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.AddMultipleOutwardJobOutwardItems.
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
        fun addMultipleOutwardJobOutwardItems(request: OutwardJobsServiceMultipleOutwardItemsCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.AddMultipleOutwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.AddOutwardJobOutwardItem.
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
        fun addOutwardJobOutwardItem(request: OutwardJobsServiceOutwardItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.AddOutwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ModifyOutwardJobOutwardItem.
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
        fun modifyOutwardJobOutwardItem(request: OutwardJobsServiceOutwardItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ModifyOutwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ApproveOutwardJobOutwardItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveOutwardJobOutwardItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ApproveOutwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.DeleteOutwardJobOutwardItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteOutwardJobOutwardItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.DeleteOutwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ReorderOutwardJobOutwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderOutwardJobOutwardItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ReorderOutwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewOutwardJobOutwardItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOutwardJobOutwardItemByID(request: Identifier):
        OutwardJobOutwardItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewOutwardJobOutwardItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewApprovedOutwardJobOutwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedOutwardJobOutwardItems(request: IdentifierWithSearchKey):
        OutwardJobsOutwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewApprovedOutwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewUnapprovedOutwardJobOutwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedOutwardJobOutwardItems(request: IdentifierWithSearchKey):
        OutwardJobsOutwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewUnapprovedOutwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewOutwardJobOutwardItemHistory.
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
        fun viewOutwardJobOutwardItemHistory(request: OutwardJobOutwardItemHistoryRequest):
        OutwardJobsOutwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewOutwardJobOutwardItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewPaginatedApprovedOutwardJobOutwardItems.
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
        fun viewPaginatedApprovedOutwardJobOutwardItems(request: OutwardJobOutwardItemsSearchRequest):
        OutwardJobsServicePaginatedOutwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewPaginatedApprovedOutwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewPaginatedUnapprovedOutwardJobOutwardItems.
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
        fun viewPaginatedUnapprovedOutwardJobOutwardItems(request: OutwardJobOutwardItemsSearchRequest):
        OutwardJobsServicePaginatedOutwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewPaginatedUnapprovedOutwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.SearchOutwardItemsWithPagination.
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
        fun searchOutwardItemsWithPagination(request: OutwardJobOutwardItemsSearchRequest):
        OutwardJobsServicePaginatedOutwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.SearchOutwardItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.DownloadOutwardItemsCSVTemplate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadOutwardItemsCSVTemplate(request: IdentifierUUID): StandardFile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.DownloadOutwardItemsCSVTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.UploadOutwardJobOutwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadOutwardJobOutwardItems(request: IdentifierUUIDWithFile):
        IdentifiersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.UploadOutwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.AddOutwardJobContact.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addOutwardJobContact(request: OutwardJobsServiceContactCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.AddOutwardJobContact is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ApproveOutwardJobContact.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveOutwardJobContact(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ApproveOutwardJobContact is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.DeleteOutwardJobContact.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteOutwardJobContact(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.DeleteOutwardJobContact is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewOutwardJobContactByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOutwardJobContactByID(request: Identifier): OutwardJobContact =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewOutwardJobContactByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewOutwardJobContacts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOutwardJobContacts(request: IdentifierUUID): OutwardJobContactsList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewOutwardJobContacts is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): OutwardJob = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): OutwardJob = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): OutwardJob = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): OutwardJob = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): OutwardJobsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewAncillaryParametersByUUID.
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
        OutwardJobAncillaryParameters = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewAncillaryParametersByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): OutwardJobsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): OutwardJobsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: OutwardJobsServicePaginationReq):
        OutwardJobsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewAssociatedPurchaseOrderIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAssociatedPurchaseOrderIDs(request: IdentifierUUID): IdentifiersList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewAssociatedPurchaseOrderIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewProspectiveInwardFamilies.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewProspectiveInwardFamilies(request: IdentifierWithSearchKey):
        FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewProspectiveInwardFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.FilterProspectiveInwardFamilies.
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
        fun filterProspectiveInwardFamilies(request: FilterFamiliesReqForIdentifier): FamiliesList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.FilterProspectiveInwardFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewProspectiveOutwardJobInwardItem.
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
        fun viewProspectiveOutwardJobInwardItem(request: OutwardJobInwardItemProspectiveInfoRequest):
        OutwardJobsServiceInwardItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewProspectiveOutwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewInwardInventoryMatch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInwardInventoryMatch(request: IdentifierUUID):
        OutwardJobInwardInventoryMatchList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewInwardInventoryMatch is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewProspectiveOutwardFamilies.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewProspectiveOutwardFamilies(request: IdentifierWithSearchKey):
        FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewProspectiveOutwardFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.FilterProspectiveOutwardFamilies.
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
        fun filterProspectiveOutwardFamilies(request: FilterFamiliesReqForIdentifier): FamiliesList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.FilterProspectiveOutwardFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.OutwardJobsService.ViewProspectiveOutwardJobOutwardItem.
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
        fun viewProspectiveOutwardJobOutwardItem(request: OutwardJobOutwardItemProspectiveInfoRequest):
        OutwardJobsServiceOutwardItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewProspectiveOutwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.ViewOutwardInventoryMatch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOutwardInventoryMatch(request: IdentifierUUID):
        OutwardJobOutwardInventoryMatchList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.ViewOutwardInventoryMatch is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: OutwardJobsServiceSearchAllReq): OutwardJobsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: OutwardJobsServiceFilterReq): OutwardJobsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: OutwardJobsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.OutwardJobsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: OutwardJobsServiceFilterReq): StandardFile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.OutwardJobsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getAutofillMethod(),
      implementation = ::autofill
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getIsCompletableMethod(),
      implementation = ::isCompletable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getIsOrderedMethod(),
      implementation = ::isOrdered
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getIsDispatchedMethod(),
      implementation = ::isDispatched
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getAddMultipleOutwardJobInwardItemsMethod(),
      implementation = ::addMultipleOutwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getAddOutwardJobInwardItemMethod(),
      implementation = ::addOutwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getModifyOutwardJobInwardItemMethod(),
      implementation = ::modifyOutwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getApproveOutwardJobInwardItemMethod(),
      implementation = ::approveOutwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDeleteOutwardJobInwardItemMethod(),
      implementation = ::deleteOutwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getReorderOutwardJobInwardItemsMethod(),
      implementation = ::reorderOutwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewOutwardJobInwardItemByIDMethod(),
      implementation = ::viewOutwardJobInwardItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewApprovedOutwardJobInwardItemsMethod(),
      implementation = ::viewApprovedOutwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobInwardItemsMethod(),
      implementation = ::viewUnapprovedOutwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewOutwardJobInwardItemHistoryMethod(),
      implementation = ::viewOutwardJobInwardItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobInwardItemsMethod(),
      implementation = ::viewPaginatedApprovedOutwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobInwardItemsMethod(),
      implementation = ::viewPaginatedUnapprovedOutwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod(),
      implementation = ::searchInwardItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod(),
      implementation = ::downloadInwardItemsCSVTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getUploadOutwardJobInwardItemsMethod(),
      implementation = ::uploadOutwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getAddMultipleOutwardJobOutwardItemsMethod(),
      implementation = ::addMultipleOutwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getAddOutwardJobOutwardItemMethod(),
      implementation = ::addOutwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getModifyOutwardJobOutwardItemMethod(),
      implementation = ::modifyOutwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getApproveOutwardJobOutwardItemMethod(),
      implementation = ::approveOutwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDeleteOutwardJobOutwardItemMethod(),
      implementation = ::deleteOutwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getReorderOutwardJobOutwardItemsMethod(),
      implementation = ::reorderOutwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemByIDMethod(),
      implementation = ::viewOutwardJobOutwardItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewApprovedOutwardJobOutwardItemsMethod(),
      implementation = ::viewApprovedOutwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewUnapprovedOutwardJobOutwardItemsMethod(),
      implementation = ::viewUnapprovedOutwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewOutwardJobOutwardItemHistoryMethod(),
      implementation = ::viewOutwardJobOutwardItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewPaginatedApprovedOutwardJobOutwardItemsMethod(),
      implementation = ::viewPaginatedApprovedOutwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewPaginatedUnapprovedOutwardJobOutwardItemsMethod(),
      implementation = ::viewPaginatedUnapprovedOutwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod(),
      implementation = ::searchOutwardItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod(),
      implementation = ::downloadOutwardItemsCSVTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getUploadOutwardJobOutwardItemsMethod(),
      implementation = ::uploadOutwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getAddOutwardJobContactMethod(),
      implementation = ::addOutwardJobContact
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getApproveOutwardJobContactMethod(),
      implementation = ::approveOutwardJobContact
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDeleteOutwardJobContactMethod(),
      implementation = ::deleteOutwardJobContact
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewOutwardJobContactByIDMethod(),
      implementation = ::viewOutwardJobContactByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewOutwardJobContactsMethod(),
      implementation = ::viewOutwardJobContacts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      implementation = ::viewAncillaryParametersByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewAssociatedPurchaseOrderIDsMethod(),
      implementation = ::viewAssociatedPurchaseOrderIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod(),
      implementation = ::viewProspectiveInwardFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod(),
      implementation = ::filterProspectiveInwardFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewProspectiveOutwardJobInwardItemMethod(),
      implementation = ::viewProspectiveOutwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewInwardInventoryMatchMethod(),
      implementation = ::viewInwardInventoryMatch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod(),
      implementation = ::viewProspectiveOutwardFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod(),
      implementation = ::filterProspectiveOutwardFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewProspectiveOutwardJobOutwardItemMethod(),
      implementation = ::viewProspectiveOutwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod(),
      implementation = ::viewOutwardInventoryMatch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OutwardJobsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
