package com.scailo.sdk

import com.scailo.sdk.InwardJobsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.InwardJobsService.
 */
public object InwardJobsServiceGrpcKt {
  public const val SERVICE_NAME: String = InwardJobsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<InwardJobsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getCreateMethod()

  public val draftMethod: MethodDescriptor<InwardJobsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod: MethodDescriptor<InwardJobsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<InwardJobsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<RepeatWithDeliveryDate, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getSendEmailMethod()

  public val autofillMethod: MethodDescriptor<InwardJobsServiceAutofillRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getAutofillMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getCreateMagicLinkMethod()

  public val isCompletableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getIsCompletableMethod()

  public val isOrderedMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getIsOrderedMethod()

  public val isReceivedMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getIsReceivedMethod()

  public val addMultipleInwardJobInwardItemsMethod:
      MethodDescriptor<InwardJobsServiceMultipleInwardItemsCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getAddMultipleInwardJobInwardItemsMethod()

  public val addInwardJobInwardItemMethod:
      MethodDescriptor<InwardJobsServiceInwardItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getAddInwardJobInwardItemMethod()

  public val modifyInwardJobInwardItemMethod:
      MethodDescriptor<InwardJobsServiceInwardItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getModifyInwardJobInwardItemMethod()

  public val approveInwardJobInwardItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getApproveInwardJobInwardItemMethod()

  public val deleteInwardJobInwardItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDeleteInwardJobInwardItemMethod()

  public val reorderInwardJobInwardItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getReorderInwardJobInwardItemsMethod()

  public val viewInwardJobInwardItemByIDMethod: MethodDescriptor<Identifier, InwardJobInwardItem>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewInwardJobInwardItemByIDMethod()

  public val viewApprovedInwardJobInwardItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, InwardJobsInwardItemsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewApprovedInwardJobInwardItemsMethod()

  public val viewUnapprovedInwardJobInwardItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, InwardJobsInwardItemsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewUnapprovedInwardJobInwardItemsMethod()

  public val viewInwardJobInwardItemHistoryMethod:
      MethodDescriptor<InwardJobInwardItemHistoryRequest, InwardJobsInwardItemsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewInwardJobInwardItemHistoryMethod()

  public val viewPaginatedApprovedInwardJobInwardItemsMethod:
      MethodDescriptor<InwardJobInwardItemsSearchRequest, InwardJobsServicePaginatedInwardItemsResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobInwardItemsMethod()

  public val viewPaginatedUnapprovedInwardJobInwardItemsMethod:
      MethodDescriptor<InwardJobInwardItemsSearchRequest, InwardJobsServicePaginatedInwardItemsResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobInwardItemsMethod()

  public val searchInwardItemsWithPaginationMethod:
      MethodDescriptor<InwardJobInwardItemsSearchRequest, InwardJobsServicePaginatedInwardItemsResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod()

  public val downloadInwardItemsCSVTemplateMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod()

  public val uploadInwardJobInwardItemsMethod:
      MethodDescriptor<IdentifierUUIDWithFile, IdentifiersList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getUploadInwardJobInwardItemsMethod()

  public val addMultipleInwardJobOutwardItemsMethod:
      MethodDescriptor<InwardJobsServiceMultipleOutwardItemsCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getAddMultipleInwardJobOutwardItemsMethod()

  public val addInwardJobOutwardItemMethod:
      MethodDescriptor<InwardJobsServiceOutwardItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getAddInwardJobOutwardItemMethod()

  public val modifyInwardJobOutwardItemMethod:
      MethodDescriptor<InwardJobsServiceOutwardItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getModifyInwardJobOutwardItemMethod()

  public val approveInwardJobOutwardItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getApproveInwardJobOutwardItemMethod()

  public val deleteInwardJobOutwardItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDeleteInwardJobOutwardItemMethod()

  public val reorderInwardJobOutwardItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getReorderInwardJobOutwardItemsMethod()

  public val viewInwardJobOutwardItemByIDMethod: MethodDescriptor<Identifier, InwardJobOutwardItem>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewInwardJobOutwardItemByIDMethod()

  public val viewApprovedInwardJobOutwardItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, InwardJobsOutwardItemsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewApprovedInwardJobOutwardItemsMethod()

  public val viewUnapprovedInwardJobOutwardItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, InwardJobsOutwardItemsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewUnapprovedInwardJobOutwardItemsMethod()

  public val viewInwardJobOutwardItemHistoryMethod:
      MethodDescriptor<InwardJobOutwardItemHistoryRequest, InwardJobsOutwardItemsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewInwardJobOutwardItemHistoryMethod()

  public val viewPaginatedApprovedInwardJobOutwardItemsMethod:
      MethodDescriptor<InwardJobOutwardItemsSearchRequest, InwardJobsServicePaginatedOutwardItemsResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobOutwardItemsMethod()

  public val viewPaginatedUnapprovedInwardJobOutwardItemsMethod:
      MethodDescriptor<InwardJobOutwardItemsSearchRequest, InwardJobsServicePaginatedOutwardItemsResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobOutwardItemsMethod()

  public val searchOutwardItemsWithPaginationMethod:
      MethodDescriptor<InwardJobOutwardItemsSearchRequest, InwardJobsServicePaginatedOutwardItemsResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod()

  public val downloadOutwardItemsCSVTemplateMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod()

  public val uploadInwardJobOutwardItemsMethod:
      MethodDescriptor<IdentifierUUIDWithFile, IdentifiersList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getUploadInwardJobOutwardItemsMethod()

  public val addInwardJobContactMethod:
      MethodDescriptor<InwardJobsServiceContactCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getAddInwardJobContactMethod()

  public val approveInwardJobContactMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getApproveInwardJobContactMethod()

  public val deleteInwardJobContactMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDeleteInwardJobContactMethod()

  public val viewInwardJobContactByIDMethod: MethodDescriptor<Identifier, InwardJobContact>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewInwardJobContactByIDMethod()

  public val viewInwardJobContactsMethod: MethodDescriptor<IdentifierUUID, InwardJobContactsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewInwardJobContactsMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, InwardJob>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, InwardJob>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, InwardJob>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, InwardJob>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, InwardJobsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewFromIDsMethod()

  public val viewAncillaryParametersByUUIDMethod:
      MethodDescriptor<IdentifierUUID, InwardJobAncillaryParameters>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, InwardJobsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, InwardJobsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<InwardJobsServicePaginationReq, InwardJobsServicePaginationResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewWithPaginationMethod()

  public val viewAssociatedSalesOrderIDsMethod: MethodDescriptor<IdentifierUUID, IdentifiersList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewAssociatedSalesOrderIDsMethod()

  public val viewInwardInventoryMatchMethod:
      MethodDescriptor<IdentifierUUID, InwardJobInwardInventoryMatchList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewInwardInventoryMatchMethod()

  public val viewProspectiveInwardFamiliesMethod:
      MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod()

  public val filterProspectiveInwardFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod()

  public val viewProspectiveInwardJobInwardItemMethod:
      MethodDescriptor<InwardJobInwardItemProspectiveInfoRequest, InwardJobsServiceInwardItemCreateRequest>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewProspectiveInwardJobInwardItemMethod()

  public val viewOutwardInventoryMatchMethod:
      MethodDescriptor<IdentifierUUID, InwardJobOutwardInventoryMatchList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod()

  public val viewProspectiveOutwardFamiliesMethod:
      MethodDescriptor<IdentifierWithSearchKey, FamiliesList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod()

  public val filterProspectiveOutwardFamiliesMethod:
      MethodDescriptor<FilterFamiliesReqForIdentifier, FamiliesList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod()

  public val viewProspectiveInwardJobOutwardItemMethod:
      MethodDescriptor<InwardJobOutwardItemProspectiveInfoRequest, InwardJobsServiceOutwardItemCreateRequest>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getViewProspectiveInwardJobOutwardItemMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDownloadByUUIDMethod()

  public val searchAllMethod: MethodDescriptor<InwardJobsServiceSearchAllReq, InwardJobsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<InwardJobsServiceFilterReq, InwardJobsList>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<InwardJobsServiceCountReq, CountResponse>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<InwardJobsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = InwardJobsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.InwardJobsService service as suspending coroutines.
   */
  @StubFor(InwardJobsServiceGrpc::class)
  public class InwardJobsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<InwardJobsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): InwardJobsServiceCoroutineStub =
        InwardJobsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: InwardJobsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: InwardJobsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: InwardJobsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: InwardJobsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getSendEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun autofill(request: InwardJobsServiceAutofillRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getAutofillMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getCreateMagicLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getIsCompletableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getIsOrderedMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun isReceived(request: IdentifierUUID, headers: Metadata = Metadata()):
        BooleanResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getIsReceivedMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addMultipleInwardJobInwardItems(request: InwardJobsServiceMultipleInwardItemsCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getAddMultipleInwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addInwardJobInwardItem(request: InwardJobsServiceInwardItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getAddInwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun modifyInwardJobInwardItem(request: InwardJobsServiceInwardItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getModifyInwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveInwardJobInwardItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getApproveInwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteInwardJobInwardItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getDeleteInwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderInwardJobInwardItems(request: ReorderItemsRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getReorderInwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInwardJobInwardItemByID(request: Identifier, headers: Metadata =
        Metadata()): InwardJobInwardItem = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewInwardJobInwardItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedInwardJobInwardItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): InwardJobsInwardItemsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewApprovedInwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnapprovedInwardJobInwardItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): InwardJobsInwardItemsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewUnapprovedInwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInwardJobInwardItemHistory(request: InwardJobInwardItemHistoryRequest,
        headers: Metadata = Metadata()): InwardJobsInwardItemsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewInwardJobInwardItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedInwardJobInwardItems(request: InwardJobInwardItemsSearchRequest,
        headers: Metadata = Metadata()): InwardJobsServicePaginatedInwardItemsResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedInwardJobInwardItems(request: InwardJobInwardItemsSearchRequest,
        headers: Metadata = Metadata()): InwardJobsServicePaginatedInwardItemsResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchInwardItemsWithPagination(request: InwardJobInwardItemsSearchRequest,
        headers: Metadata = Metadata()): InwardJobsServicePaginatedInwardItemsResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadInwardJobInwardItems(request: IdentifierUUIDWithFile, headers: Metadata
        = Metadata()): IdentifiersList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getUploadInwardJobInwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addMultipleInwardJobOutwardItems(request: InwardJobsServiceMultipleOutwardItemsCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getAddMultipleInwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addInwardJobOutwardItem(request: InwardJobsServiceOutwardItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getAddInwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyInwardJobOutwardItem(request: InwardJobsServiceOutwardItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getModifyInwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveInwardJobOutwardItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getApproveInwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteInwardJobOutwardItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getDeleteInwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderInwardJobOutwardItems(request: ReorderItemsRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getReorderInwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInwardJobOutwardItemByID(request: Identifier, headers: Metadata =
        Metadata()): InwardJobOutwardItem = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewInwardJobOutwardItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedInwardJobOutwardItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): InwardJobsOutwardItemsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewApprovedInwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnapprovedInwardJobOutwardItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): InwardJobsOutwardItemsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewUnapprovedInwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInwardJobOutwardItemHistory(request: InwardJobOutwardItemHistoryRequest,
        headers: Metadata = Metadata()): InwardJobsOutwardItemsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewInwardJobOutwardItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedInwardJobOutwardItems(request: InwardJobOutwardItemsSearchRequest,
        headers: Metadata = Metadata()): InwardJobsServicePaginatedOutwardItemsResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedInwardJobOutwardItems(request: InwardJobOutwardItemsSearchRequest,
        headers: Metadata = Metadata()): InwardJobsServicePaginatedOutwardItemsResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchOutwardItemsWithPagination(request: InwardJobOutwardItemsSearchRequest,
        headers: Metadata = Metadata()): InwardJobsServicePaginatedOutwardItemsResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadInwardJobOutwardItems(request: IdentifierUUIDWithFile,
        headers: Metadata = Metadata()): IdentifiersList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getUploadInwardJobOutwardItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addInwardJobContact(request: InwardJobsServiceContactCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getAddInwardJobContactMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveInwardJobContact(request: IdentifierWithUserComment, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getApproveInwardJobContactMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteInwardJobContact(request: IdentifierWithUserComment, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getDeleteInwardJobContactMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInwardJobContactByID(request: Identifier, headers: Metadata =
        Metadata()): InwardJobContact = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewInwardJobContactByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInwardJobContacts(request: IdentifierUUID, headers: Metadata =
        Metadata()): InwardJobContactsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewInwardJobContactsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): InwardJob =
        unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJob = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJob = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJob = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): InwardJobAncillaryParameters = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        InwardJobsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): InwardJobsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: InwardJobsServicePaginationReq, headers: Metadata
        = Metadata()): InwardJobsServicePaginationResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAssociatedSalesOrderIDs(request: IdentifierUUID, headers: Metadata =
        Metadata()): IdentifiersList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewAssociatedSalesOrderIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): InwardJobInwardInventoryMatchList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewInwardInventoryMatchMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewProspectiveInwardJobInwardItem(request: InwardJobInwardItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): InwardJobsServiceInwardItemCreateRequest = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewProspectiveInwardJobInwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): InwardJobOutwardInventoryMatchList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewProspectiveInwardJobOutwardItem(request: InwardJobOutwardItemProspectiveInfoRequest,
        headers: Metadata = Metadata()): InwardJobsServiceOutwardItemCreateRequest = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getViewProspectiveInwardJobOutwardItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getIsDownloadableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getDownloadByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: InwardJobsServiceSearchAllReq, headers: Metadata =
        Metadata()): InwardJobsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: InwardJobsServiceFilterReq, headers: Metadata = Metadata()):
        InwardJobsList = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      InwardJobsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: InwardJobsServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: InwardJobsServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      InwardJobsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.InwardJobsService service based on Kotlin coroutines.
   */
  public abstract class InwardJobsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: InwardJobsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: InwardJobsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: InwardJobsServiceUpdateRequest): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: InwardJobsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.SendEmail.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Autofill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun autofill(request: InwardJobsServiceAutofillRequest): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Autofill is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.IsCompletable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.IsCompletable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.IsOrdered.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.IsOrdered is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.IsReceived.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isReceived(request: IdentifierUUID): BooleanResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.IsReceived is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.AddMultipleInwardJobInwardItems.
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
        fun addMultipleInwardJobInwardItems(request: InwardJobsServiceMultipleInwardItemsCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.AddMultipleInwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.AddInwardJobInwardItem.
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
        fun addInwardJobInwardItem(request: InwardJobsServiceInwardItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.AddInwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ModifyInwardJobInwardItem.
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
        fun modifyInwardJobInwardItem(request: InwardJobsServiceInwardItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ModifyInwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ApproveInwardJobInwardItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveInwardJobInwardItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ApproveInwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.DeleteInwardJobInwardItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteInwardJobInwardItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.DeleteInwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ReorderInwardJobInwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderInwardJobInwardItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ReorderInwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewInwardJobInwardItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInwardJobInwardItemByID(request: Identifier): InwardJobInwardItem =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewInwardJobInwardItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewApprovedInwardJobInwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedInwardJobInwardItems(request: IdentifierWithSearchKey):
        InwardJobsInwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewApprovedInwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsService.ViewUnapprovedInwardJobInwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedInwardJobInwardItems(request: IdentifierWithSearchKey):
        InwardJobsInwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewUnapprovedInwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewInwardJobInwardItemHistory.
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
        fun viewInwardJobInwardItemHistory(request: InwardJobInwardItemHistoryRequest):
        InwardJobsInwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewInwardJobInwardItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsService.ViewPaginatedApprovedInwardJobInwardItems.
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
        fun viewPaginatedApprovedInwardJobInwardItems(request: InwardJobInwardItemsSearchRequest):
        InwardJobsServicePaginatedInwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewPaginatedApprovedInwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsService.ViewPaginatedUnapprovedInwardJobInwardItems.
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
        fun viewPaginatedUnapprovedInwardJobInwardItems(request: InwardJobInwardItemsSearchRequest):
        InwardJobsServicePaginatedInwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewPaginatedUnapprovedInwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.SearchInwardItemsWithPagination.
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
        fun searchInwardItemsWithPagination(request: InwardJobInwardItemsSearchRequest):
        InwardJobsServicePaginatedInwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.SearchInwardItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.DownloadInwardItemsCSVTemplate.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.DownloadInwardItemsCSVTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.UploadInwardJobInwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadInwardJobInwardItems(request: IdentifierUUIDWithFile):
        IdentifiersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.UploadInwardJobInwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.AddMultipleInwardJobOutwardItems.
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
        fun addMultipleInwardJobOutwardItems(request: InwardJobsServiceMultipleOutwardItemsCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.AddMultipleInwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.AddInwardJobOutwardItem.
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
        fun addInwardJobOutwardItem(request: InwardJobsServiceOutwardItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.AddInwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ModifyInwardJobOutwardItem.
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
        fun modifyInwardJobOutwardItem(request: InwardJobsServiceOutwardItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ModifyInwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ApproveInwardJobOutwardItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveInwardJobOutwardItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ApproveInwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.DeleteInwardJobOutwardItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteInwardJobOutwardItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.DeleteInwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ReorderInwardJobOutwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderInwardJobOutwardItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ReorderInwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewInwardJobOutwardItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInwardJobOutwardItemByID(request: Identifier): InwardJobOutwardItem
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewInwardJobOutwardItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsService.ViewApprovedInwardJobOutwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedInwardJobOutwardItems(request: IdentifierWithSearchKey):
        InwardJobsOutwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewApprovedInwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsService.ViewUnapprovedInwardJobOutwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedInwardJobOutwardItems(request: IdentifierWithSearchKey):
        InwardJobsOutwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewUnapprovedInwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewInwardJobOutwardItemHistory.
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
        fun viewInwardJobOutwardItemHistory(request: InwardJobOutwardItemHistoryRequest):
        InwardJobsOutwardItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewInwardJobOutwardItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsService.ViewPaginatedApprovedInwardJobOutwardItems.
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
        fun viewPaginatedApprovedInwardJobOutwardItems(request: InwardJobOutwardItemsSearchRequest):
        InwardJobsServicePaginatedOutwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewPaginatedApprovedInwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsService.ViewPaginatedUnapprovedInwardJobOutwardItems.
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
        fun viewPaginatedUnapprovedInwardJobOutwardItems(request: InwardJobOutwardItemsSearchRequest):
        InwardJobsServicePaginatedOutwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewPaginatedUnapprovedInwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.SearchOutwardItemsWithPagination.
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
        fun searchOutwardItemsWithPagination(request: InwardJobOutwardItemsSearchRequest):
        InwardJobsServicePaginatedOutwardItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.SearchOutwardItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.DownloadOutwardItemsCSVTemplate.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.DownloadOutwardItemsCSVTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.UploadInwardJobOutwardItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadInwardJobOutwardItems(request: IdentifierUUIDWithFile):
        IdentifiersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.UploadInwardJobOutwardItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.AddInwardJobContact.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addInwardJobContact(request: InwardJobsServiceContactCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.AddInwardJobContact is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ApproveInwardJobContact.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveInwardJobContact(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ApproveInwardJobContact is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.DeleteInwardJobContact.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteInwardJobContact(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.DeleteInwardJobContact is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewInwardJobContactByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInwardJobContactByID(request: Identifier): InwardJobContact = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewInwardJobContactByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewInwardJobContacts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInwardJobContacts(request: IdentifierUUID): InwardJobContactsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewInwardJobContacts is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): InwardJob = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): InwardJob = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): InwardJob = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): InwardJob = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): InwardJobsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewAncillaryParametersByUUID.
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
        InwardJobAncillaryParameters = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewAncillaryParametersByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): InwardJobsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): InwardJobsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: InwardJobsServicePaginationReq):
        InwardJobsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewAssociatedSalesOrderIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAssociatedSalesOrderIDs(request: IdentifierUUID): IdentifiersList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewAssociatedSalesOrderIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewInwardInventoryMatch.
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
        InwardJobInwardInventoryMatchList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewInwardInventoryMatch is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewProspectiveInwardFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewProspectiveInwardFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.FilterProspectiveInwardFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.FilterProspectiveInwardFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsService.ViewProspectiveInwardJobInwardItem.
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
        fun viewProspectiveInwardJobInwardItem(request: InwardJobInwardItemProspectiveInfoRequest):
        InwardJobsServiceInwardItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewProspectiveInwardJobInwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewOutwardInventoryMatch.
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
        InwardJobOutwardInventoryMatchList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewOutwardInventoryMatch is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.ViewProspectiveOutwardFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewProspectiveOutwardFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.FilterProspectiveOutwardFamilies.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.FilterProspectiveOutwardFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InwardJobsService.ViewProspectiveInwardJobOutwardItem.
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
        fun viewProspectiveInwardJobOutwardItem(request: InwardJobOutwardItemProspectiveInfoRequest):
        InwardJobsServiceOutwardItemCreateRequest = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.ViewProspectiveInwardJobOutwardItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: InwardJobsServiceSearchAllReq): InwardJobsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: InwardJobsServiceFilterReq): InwardJobsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: InwardJobsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InwardJobsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: InwardJobsServiceFilterReq): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InwardJobsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getAutofillMethod(),
      implementation = ::autofill
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getIsCompletableMethod(),
      implementation = ::isCompletable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getIsOrderedMethod(),
      implementation = ::isOrdered
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getIsReceivedMethod(),
      implementation = ::isReceived
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getAddMultipleInwardJobInwardItemsMethod(),
      implementation = ::addMultipleInwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getAddInwardJobInwardItemMethod(),
      implementation = ::addInwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getModifyInwardJobInwardItemMethod(),
      implementation = ::modifyInwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getApproveInwardJobInwardItemMethod(),
      implementation = ::approveInwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDeleteInwardJobInwardItemMethod(),
      implementation = ::deleteInwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getReorderInwardJobInwardItemsMethod(),
      implementation = ::reorderInwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewInwardJobInwardItemByIDMethod(),
      implementation = ::viewInwardJobInwardItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewApprovedInwardJobInwardItemsMethod(),
      implementation = ::viewApprovedInwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewUnapprovedInwardJobInwardItemsMethod(),
      implementation = ::viewUnapprovedInwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewInwardJobInwardItemHistoryMethod(),
      implementation = ::viewInwardJobInwardItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobInwardItemsMethod(),
      implementation = ::viewPaginatedApprovedInwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobInwardItemsMethod(),
      implementation = ::viewPaginatedUnapprovedInwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getSearchInwardItemsWithPaginationMethod(),
      implementation = ::searchInwardItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDownloadInwardItemsCSVTemplateMethod(),
      implementation = ::downloadInwardItemsCSVTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getUploadInwardJobInwardItemsMethod(),
      implementation = ::uploadInwardJobInwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getAddMultipleInwardJobOutwardItemsMethod(),
      implementation = ::addMultipleInwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getAddInwardJobOutwardItemMethod(),
      implementation = ::addInwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getModifyInwardJobOutwardItemMethod(),
      implementation = ::modifyInwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getApproveInwardJobOutwardItemMethod(),
      implementation = ::approveInwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDeleteInwardJobOutwardItemMethod(),
      implementation = ::deleteInwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getReorderInwardJobOutwardItemsMethod(),
      implementation = ::reorderInwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewInwardJobOutwardItemByIDMethod(),
      implementation = ::viewInwardJobOutwardItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewApprovedInwardJobOutwardItemsMethod(),
      implementation = ::viewApprovedInwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewUnapprovedInwardJobOutwardItemsMethod(),
      implementation = ::viewUnapprovedInwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewInwardJobOutwardItemHistoryMethod(),
      implementation = ::viewInwardJobOutwardItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewPaginatedApprovedInwardJobOutwardItemsMethod(),
      implementation = ::viewPaginatedApprovedInwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewPaginatedUnapprovedInwardJobOutwardItemsMethod(),
      implementation = ::viewPaginatedUnapprovedInwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getSearchOutwardItemsWithPaginationMethod(),
      implementation = ::searchOutwardItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDownloadOutwardItemsCSVTemplateMethod(),
      implementation = ::downloadOutwardItemsCSVTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getUploadInwardJobOutwardItemsMethod(),
      implementation = ::uploadInwardJobOutwardItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getAddInwardJobContactMethod(),
      implementation = ::addInwardJobContact
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getApproveInwardJobContactMethod(),
      implementation = ::approveInwardJobContact
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDeleteInwardJobContactMethod(),
      implementation = ::deleteInwardJobContact
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewInwardJobContactByIDMethod(),
      implementation = ::viewInwardJobContactByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewInwardJobContactsMethod(),
      implementation = ::viewInwardJobContacts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewAncillaryParametersByUUIDMethod(),
      implementation = ::viewAncillaryParametersByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewAssociatedSalesOrderIDsMethod(),
      implementation = ::viewAssociatedSalesOrderIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewInwardInventoryMatchMethod(),
      implementation = ::viewInwardInventoryMatch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewProspectiveInwardFamiliesMethod(),
      implementation = ::viewProspectiveInwardFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getFilterProspectiveInwardFamiliesMethod(),
      implementation = ::filterProspectiveInwardFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewProspectiveInwardJobInwardItemMethod(),
      implementation = ::viewProspectiveInwardJobInwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewOutwardInventoryMatchMethod(),
      implementation = ::viewOutwardInventoryMatch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewProspectiveOutwardFamiliesMethod(),
      implementation = ::viewProspectiveOutwardFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getFilterProspectiveOutwardFamiliesMethod(),
      implementation = ::filterProspectiveOutwardFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getViewProspectiveInwardJobOutwardItemMethod(),
      implementation = ::viewProspectiveInwardJobOutwardItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InwardJobsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
