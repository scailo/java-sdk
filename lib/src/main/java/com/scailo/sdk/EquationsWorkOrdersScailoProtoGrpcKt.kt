package com.scailo.sdk

import com.scailo.sdk.EquationsWorkOrdersServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.EquationsWorkOrdersService.
 */
public object EquationsWorkOrdersServiceGrpcKt {
  public const val SERVICE_NAME: String = EquationsWorkOrdersServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<EquationsWorkOrdersServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getCreateMethod()

  public val draftMethod:
      MethodDescriptor<EquationsWorkOrdersServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<EquationsWorkOrdersServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<EquationsWorkOrdersServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getRepeatMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getReopenMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getCommentAddMethod()

  public val createMagicLinkMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getCreateMagicLinkMethod()

  public val amendMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getAmendMethod()

  public val cloneMethod: MethodDescriptor<CloneRequest, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getCloneMethod()

  public val addEquationWorkOrderItemMethod:
      MethodDescriptor<EquationsWorkOrdersServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getAddEquationWorkOrderItemMethod()

  public val modifyEquationWorkOrderItemMethod:
      MethodDescriptor<EquationsWorkOrdersServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getModifyEquationWorkOrderItemMethod()

  public val approveEquationWorkOrderItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getApproveEquationWorkOrderItemMethod()

  public val deleteEquationWorkOrderItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getDeleteEquationWorkOrderItemMethod()

  public val reorderEquationWorkOrderItemsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getReorderEquationWorkOrderItemsMethod()

  public val viewEquationWorkOrderItemByIDMethod:
      MethodDescriptor<Identifier, EquationWorkOrderItem>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewEquationWorkOrderItemByIDMethod()

  public val viewApprovedEquationWorkOrderItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, EquationsWorkOrdersItemsList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewApprovedEquationWorkOrderItemsMethod()

  public val viewUnapprovedEquationWorkOrderItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, EquationsWorkOrdersItemsList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewUnapprovedEquationWorkOrderItemsMethod()

  public val viewEquationWorkOrderItemHistoryMethod:
      MethodDescriptor<EquationWorkOrderItemHistoryRequest, EquationsWorkOrdersItemsList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewEquationWorkOrderItemHistoryMethod()

  public val viewPaginatedApprovedEquationWorkOrderItemsMethod:
      MethodDescriptor<EquationWorkOrderItemsSearchRequest, EquationsWorkOrdersServicePaginatedItemsResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewPaginatedApprovedEquationWorkOrderItemsMethod()

  public val viewPaginatedUnapprovedEquationWorkOrderItemsMethod:
      MethodDescriptor<EquationWorkOrderItemsSearchRequest, EquationsWorkOrdersServicePaginatedItemsResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewPaginatedUnapprovedEquationWorkOrderItemsMethod()

  public val searchItemsWithPaginationMethod:
      MethodDescriptor<EquationWorkOrderItemsSearchRequest, EquationsWorkOrdersServicePaginatedItemsResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getSearchItemsWithPaginationMethod()

  public val downloadItemsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getDownloadItemsAsCSVMethod()

  public val downloadItemsTemplateAsCSVMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getDownloadItemsTemplateAsCSVMethod()

  public val downloadTreeAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getDownloadTreeAsCSVMethod()

  public val uploadEquationWorkOrderItemsMethod:
      MethodDescriptor<IdentifierUUIDWithFile, IdentifiersList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getUploadEquationWorkOrderItemsMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, EquationWorkOrder>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, EquationWorkOrder>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewByUUIDMethod()

  public val viewByNameMethod: MethodDescriptor<SimpleSearchReq, EquationWorkOrder>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewByNameMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, EquationWorkOrder>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, EquationWorkOrder>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, EquationsWorkOrdersList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, EquationsWorkOrdersList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, EquationsWorkOrdersList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<EquationsWorkOrdersServicePaginationReq, EquationsWorkOrdersServicePaginationResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewWithPaginationMethod()

  public val viewForWorkOrderIDMethod: MethodDescriptor<Identifier, EquationWorkOrder>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewForWorkOrderIDMethod()

  public val viewAmendmentsMethod: MethodDescriptor<Identifier, AmendmentLogsList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getViewAmendmentsMethod()

  public val isDownloadableMethod: MethodDescriptor<IdentifierUUID, BooleanResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getIsDownloadableMethod()

  public val downloadByUUIDMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getDownloadByUUIDMethod()

  public val searchAllMethod:
      MethodDescriptor<EquationsWorkOrdersServiceSearchAllReq, EquationsWorkOrdersList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<EquationsWorkOrdersServiceFilterReq, EquationsWorkOrdersList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<EquationsWorkOrdersServiceCountReq, CountResponse>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod:
      MethodDescriptor<EquationsWorkOrdersServiceFilterReq, StandardFile>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getDownloadAsCSVMethod()

  public val importFromCSVMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = EquationsWorkOrdersServiceGrpc.getImportFromCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.EquationsWorkOrdersService service as suspending
   * coroutines.
   */
  @StubFor(EquationsWorkOrdersServiceGrpc::class)
  public class EquationsWorkOrdersServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<EquationsWorkOrdersServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        EquationsWorkOrdersServiceCoroutineStub = EquationsWorkOrdersServiceCoroutineStub(channel,
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
    public suspend fun create(request: EquationsWorkOrdersServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: EquationsWorkOrdersServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: EquationsWorkOrdersServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: EquationsWorkOrdersServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getCreateMagicLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getAmendMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun clone(request: CloneRequest, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getCloneMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addEquationWorkOrderItem(request: EquationsWorkOrdersServiceItemCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getAddEquationWorkOrderItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyEquationWorkOrderItem(request: EquationsWorkOrdersServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getModifyEquationWorkOrderItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveEquationWorkOrderItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getApproveEquationWorkOrderItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteEquationWorkOrderItem(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getDeleteEquationWorkOrderItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderEquationWorkOrderItems(request: ReorderItemsRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getReorderEquationWorkOrderItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewEquationWorkOrderItemByID(request: Identifier, headers: Metadata =
        Metadata()): EquationWorkOrderItem = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewEquationWorkOrderItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedEquationWorkOrderItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): EquationsWorkOrdersItemsList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewApprovedEquationWorkOrderItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnapprovedEquationWorkOrderItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): EquationsWorkOrdersItemsList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewUnapprovedEquationWorkOrderItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewEquationWorkOrderItemHistory(request: EquationWorkOrderItemHistoryRequest,
        headers: Metadata = Metadata()): EquationsWorkOrdersItemsList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewEquationWorkOrderItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedEquationWorkOrderItems(request: EquationWorkOrderItemsSearchRequest,
        headers: Metadata = Metadata()): EquationsWorkOrdersServicePaginatedItemsResponse =
        unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewPaginatedApprovedEquationWorkOrderItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedEquationWorkOrderItems(request: EquationWorkOrderItemsSearchRequest,
        headers: Metadata = Metadata()): EquationsWorkOrdersServicePaginatedItemsResponse =
        unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewPaginatedUnapprovedEquationWorkOrderItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchItemsWithPagination(request: EquationWorkOrderItemsSearchRequest,
        headers: Metadata = Metadata()): EquationsWorkOrdersServicePaginatedItemsResponse =
        unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getSearchItemsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getDownloadItemsAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadTreeAsCSV(request: IdentifierUUID, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getDownloadTreeAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadEquationWorkOrderItems(request: IdentifierUUIDWithFile,
        headers: Metadata = Metadata()): IdentifiersList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getUploadEquationWorkOrderItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        EquationWorkOrder = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        EquationWorkOrder = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByName(request: SimpleSearchReq, headers: Metadata = Metadata()):
        EquationWorkOrder = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewByNameMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        EquationWorkOrder = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        EquationWorkOrder = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        EquationsWorkOrdersList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        EquationsWorkOrdersList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): EquationsWorkOrdersList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: EquationsWorkOrdersServicePaginationReq,
        headers: Metadata = Metadata()): EquationsWorkOrdersServicePaginationResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewForWorkOrderID(request: Identifier, headers: Metadata = Metadata()):
        EquationWorkOrder = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getViewForWorkOrderIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getViewAmendmentsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getIsDownloadableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getDownloadByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: EquationsWorkOrdersServiceSearchAllReq, headers: Metadata
        = Metadata()): EquationsWorkOrdersList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: EquationsWorkOrdersServiceFilterReq, headers: Metadata =
        Metadata()): EquationsWorkOrdersList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      EquationsWorkOrdersServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: EquationsWorkOrdersServiceCountReq, headers: Metadata =
        Metadata()): CountResponse = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: EquationsWorkOrdersServiceFilterReq, headers: Metadata
        = Metadata()): StandardFile = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun importFromCSV(request: StandardFile, headers: Metadata = Metadata()):
        IdentifierUUIDsList = unaryRpc(
      channel,
      EquationsWorkOrdersServiceGrpc.getImportFromCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.EquationsWorkOrdersService service based on Kotlin
   * coroutines.
   */
  public abstract class EquationsWorkOrdersServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: EquationsWorkOrdersServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: EquationsWorkOrdersServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: EquationsWorkOrdersServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: EquationsWorkOrdersServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.CreateMagicLink.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.CreateMagicLink is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Amend.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Amend is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Clone.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun clone(request: CloneRequest): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Clone is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.AddEquationWorkOrderItem.
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
        fun addEquationWorkOrderItem(request: EquationsWorkOrdersServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.AddEquationWorkOrderItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.ModifyEquationWorkOrderItem.
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
        fun modifyEquationWorkOrderItem(request: EquationsWorkOrdersServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ModifyEquationWorkOrderItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.ApproveEquationWorkOrderItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveEquationWorkOrderItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ApproveEquationWorkOrderItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.DeleteEquationWorkOrderItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteEquationWorkOrderItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.DeleteEquationWorkOrderItem is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.ReorderEquationWorkOrderItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderEquationWorkOrderItems(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ReorderEquationWorkOrderItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.ViewEquationWorkOrderItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEquationWorkOrderItemByID(request: Identifier):
        EquationWorkOrderItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewEquationWorkOrderItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.ViewApprovedEquationWorkOrderItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedEquationWorkOrderItems(request: IdentifierWithSearchKey):
        EquationsWorkOrdersItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewApprovedEquationWorkOrderItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.ViewUnapprovedEquationWorkOrderItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedEquationWorkOrderItems(request: IdentifierWithSearchKey):
        EquationsWorkOrdersItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewUnapprovedEquationWorkOrderItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.ViewEquationWorkOrderItemHistory.
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
        fun viewEquationWorkOrderItemHistory(request: EquationWorkOrderItemHistoryRequest):
        EquationsWorkOrdersItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewEquationWorkOrderItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.ViewPaginatedApprovedEquationWorkOrderItems.
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
        fun viewPaginatedApprovedEquationWorkOrderItems(request: EquationWorkOrderItemsSearchRequest):
        EquationsWorkOrdersServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewPaginatedApprovedEquationWorkOrderItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.ViewPaginatedUnapprovedEquationWorkOrderItems.
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
        fun viewPaginatedUnapprovedEquationWorkOrderItems(request: EquationWorkOrderItemsSearchRequest):
        EquationsWorkOrdersServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewPaginatedUnapprovedEquationWorkOrderItems is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.SearchItemsWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchItemsWithPagination(request: EquationWorkOrderItemsSearchRequest):
        EquationsWorkOrdersServicePaginatedItemsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.SearchItemsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.DownloadItemsAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.DownloadItemsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.DownloadItemsTemplateAsCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.DownloadItemsTemplateAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.DownloadTreeAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadTreeAsCSV(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.DownloadTreeAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.EquationsWorkOrdersService.UploadEquationWorkOrderItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadEquationWorkOrderItems(request: IdentifierUUIDWithFile):
        IdentifiersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.UploadEquationWorkOrderItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): EquationWorkOrder = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): EquationWorkOrder = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewByName.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByName(request: SimpleSearchReq): EquationWorkOrder = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewByName is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): EquationWorkOrder = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): EquationWorkOrder = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): EquationsWorkOrdersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): EquationsWorkOrdersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): EquationsWorkOrdersList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: EquationsWorkOrdersServicePaginationReq):
        EquationsWorkOrdersServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewForWorkOrderID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewForWorkOrderID(request: Identifier): EquationWorkOrder = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewForWorkOrderID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ViewAmendments.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ViewAmendments is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.IsDownloadable.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.IsDownloadable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.DownloadByUUID.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.DownloadByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: EquationsWorkOrdersServiceSearchAllReq):
        EquationsWorkOrdersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: EquationsWorkOrdersServiceFilterReq):
        EquationsWorkOrdersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: EquationsWorkOrdersServiceCountReq): CountResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: EquationsWorkOrdersServiceFilterReq):
        StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.DownloadAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.EquationsWorkOrdersService.ImportFromCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun importFromCSV(request: StandardFile): IdentifierUUIDsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.EquationsWorkOrdersService.ImportFromCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getCreateMagicLinkMethod(),
      implementation = ::createMagicLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getAmendMethod(),
      implementation = ::amend
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getCloneMethod(),
      implementation = ::clone
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getAddEquationWorkOrderItemMethod(),
      implementation = ::addEquationWorkOrderItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getModifyEquationWorkOrderItemMethod(),
      implementation = ::modifyEquationWorkOrderItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getApproveEquationWorkOrderItemMethod(),
      implementation = ::approveEquationWorkOrderItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getDeleteEquationWorkOrderItemMethod(),
      implementation = ::deleteEquationWorkOrderItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getReorderEquationWorkOrderItemsMethod(),
      implementation = ::reorderEquationWorkOrderItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewEquationWorkOrderItemByIDMethod(),
      implementation = ::viewEquationWorkOrderItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewApprovedEquationWorkOrderItemsMethod(),
      implementation = ::viewApprovedEquationWorkOrderItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewUnapprovedEquationWorkOrderItemsMethod(),
      implementation = ::viewUnapprovedEquationWorkOrderItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewEquationWorkOrderItemHistoryMethod(),
      implementation = ::viewEquationWorkOrderItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        EquationsWorkOrdersServiceGrpc.getViewPaginatedApprovedEquationWorkOrderItemsMethod(),
      implementation = ::viewPaginatedApprovedEquationWorkOrderItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        EquationsWorkOrdersServiceGrpc.getViewPaginatedUnapprovedEquationWorkOrderItemsMethod(),
      implementation = ::viewPaginatedUnapprovedEquationWorkOrderItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getSearchItemsWithPaginationMethod(),
      implementation = ::searchItemsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getDownloadItemsAsCSVMethod(),
      implementation = ::downloadItemsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getDownloadItemsTemplateAsCSVMethod(),
      implementation = ::downloadItemsTemplateAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getDownloadTreeAsCSVMethod(),
      implementation = ::downloadTreeAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getUploadEquationWorkOrderItemsMethod(),
      implementation = ::uploadEquationWorkOrderItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewByNameMethod(),
      implementation = ::viewByName
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewForWorkOrderIDMethod(),
      implementation = ::viewForWorkOrderID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getViewAmendmentsMethod(),
      implementation = ::viewAmendments
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getIsDownloadableMethod(),
      implementation = ::isDownloadable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getDownloadByUUIDMethod(),
      implementation = ::downloadByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EquationsWorkOrdersServiceGrpc.getImportFromCSVMethod(),
      implementation = ::importFromCSV
    )).build()
  }
}
