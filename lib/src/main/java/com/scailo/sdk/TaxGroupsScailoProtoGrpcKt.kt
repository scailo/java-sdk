package com.scailo.sdk

import com.scailo.sdk.TaxGroupsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.TaxGroupsService.
 */
public object TaxGroupsServiceGrpcKt {
  public const val SERVICE_NAME: String = TaxGroupsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<TaxGroupsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getCreateMethod()

  public val draftMethod: MethodDescriptor<TaxGroupsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod: MethodDescriptor<TaxGroupsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<TaxGroupsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getRestoreMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getCommentAddMethod()

  public val addTaxGroupItemMethod:
      MethodDescriptor<TaxGroupsServiceItemCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getAddTaxGroupItemMethod()

  public val modifyTaxGroupItemMethod:
      MethodDescriptor<TaxGroupsServiceItemUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getModifyTaxGroupItemMethod()

  public val approveTaxGroupItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getApproveTaxGroupItemMethod()

  public val deleteTaxGroupItemMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getDeleteTaxGroupItemMethod()

  public val reorderTaxGroupItemsMethod: MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getReorderTaxGroupItemsMethod()

  public val viewTaxGroupItemByIDMethod: MethodDescriptor<Identifier, TaxGroupItem>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewTaxGroupItemByIDMethod()

  public val viewApprovedTaxGroupItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, TaxGroupsItemsList>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewApprovedTaxGroupItemsMethod()

  public val viewUnapprovedTaxGroupItemsMethod:
      MethodDescriptor<IdentifierWithSearchKey, TaxGroupsItemsList>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewUnapprovedTaxGroupItemsMethod()

  public val viewTaxGroupItemHistoryMethod:
      MethodDescriptor<TaxGroupItemHistoryRequest, TaxGroupsItemsList>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewTaxGroupItemHistoryMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, TaxGroup>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, TaxGroup>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, TaxGroup>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, TaxGroup>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, TaxGroupsList>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, TaxGroupsList>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, TaxGroupsList>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<TaxGroupsServicePaginationReq, TaxGroupsServicePaginationResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getViewWithPaginationMethod()

  public val searchAllMethod: MethodDescriptor<TaxGroupsServiceSearchAllReq, TaxGroupsList>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<TaxGroupsServiceFilterReq, TaxGroupsList>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<TaxGroupsServiceCountReq, CountResponse>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<TaxGroupsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getDownloadAsCSVMethod()

  public val importFromCSVMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = TaxGroupsServiceGrpc.getImportFromCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.TaxGroupsService service as suspending coroutines.
   */
  @StubFor(TaxGroupsServiceGrpc::class)
  public class TaxGroupsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TaxGroupsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TaxGroupsServiceCoroutineStub =
        TaxGroupsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: TaxGroupsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: TaxGroupsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: TaxGroupsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: TaxGroupsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addTaxGroupItem(request: TaxGroupsServiceItemCreateRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getAddTaxGroupItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun modifyTaxGroupItem(request: TaxGroupsServiceItemUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getModifyTaxGroupItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveTaxGroupItem(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getApproveTaxGroupItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteTaxGroupItem(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getDeleteTaxGroupItemMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderTaxGroupItems(request: ReorderItemsRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getReorderTaxGroupItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewTaxGroupItemByID(request: Identifier, headers: Metadata = Metadata()):
        TaxGroupItem = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewTaxGroupItemByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedTaxGroupItems(request: IdentifierWithSearchKey, headers: Metadata
        = Metadata()): TaxGroupsItemsList = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewApprovedTaxGroupItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnapprovedTaxGroupItems(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): TaxGroupsItemsList = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewUnapprovedTaxGroupItemsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewTaxGroupItemHistory(request: TaxGroupItemHistoryRequest,
        headers: Metadata = Metadata()): TaxGroupsItemsList = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewTaxGroupItemHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): TaxGroup =
        unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByUUID(request: IdentifierUUID, headers: Metadata = Metadata()): TaxGroup
        = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        TaxGroup = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        TaxGroup = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        TaxGroupsList = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAll(request: ActiveStatus, headers: Metadata = Metadata()): TaxGroupsList
        = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): TaxGroupsList = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: TaxGroupsServicePaginationReq, headers: Metadata
        = Metadata()): TaxGroupsServicePaginationResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: TaxGroupsServiceSearchAllReq, headers: Metadata =
        Metadata()): TaxGroupsList = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: TaxGroupsServiceFilterReq, headers: Metadata = Metadata()):
        TaxGroupsList = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: TaxGroupsServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: TaxGroupsServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      TaxGroupsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      TaxGroupsServiceGrpc.getImportFromCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.TaxGroupsService service based on Kotlin coroutines.
   */
  public abstract class TaxGroupsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: TaxGroupsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: TaxGroupsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: TaxGroupsServiceUpdateRequest): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: TaxGroupsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.AddTaxGroupItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addTaxGroupItem(request: TaxGroupsServiceItemCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.AddTaxGroupItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ModifyTaxGroupItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun modifyTaxGroupItem(request: TaxGroupsServiceItemUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ModifyTaxGroupItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ApproveTaxGroupItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveTaxGroupItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ApproveTaxGroupItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.DeleteTaxGroupItem.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteTaxGroupItem(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.DeleteTaxGroupItem is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ReorderTaxGroupItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderTaxGroupItems(request: ReorderItemsRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ReorderTaxGroupItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewTaxGroupItemByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewTaxGroupItemByID(request: Identifier): TaxGroupItem = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewTaxGroupItemByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewApprovedTaxGroupItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedTaxGroupItems(request: IdentifierWithSearchKey):
        TaxGroupsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewApprovedTaxGroupItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewUnapprovedTaxGroupItems.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedTaxGroupItems(request: IdentifierWithSearchKey):
        TaxGroupsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewUnapprovedTaxGroupItems is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewTaxGroupItemHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewTaxGroupItemHistory(request: TaxGroupItemHistoryRequest):
        TaxGroupsItemsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewTaxGroupItemHistory is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): TaxGroup = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): TaxGroup = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): TaxGroup = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): TaxGroup = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): TaxGroupsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): TaxGroupsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): TaxGroupsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: TaxGroupsServicePaginationReq):
        TaxGroupsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: TaxGroupsServiceSearchAllReq): TaxGroupsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: TaxGroupsServiceFilterReq): TaxGroupsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: TaxGroupsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: TaxGroupsServiceFilterReq): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.DownloadAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TaxGroupsService.ImportFromCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TaxGroupsService.ImportFromCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getAddTaxGroupItemMethod(),
      implementation = ::addTaxGroupItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getModifyTaxGroupItemMethod(),
      implementation = ::modifyTaxGroupItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getApproveTaxGroupItemMethod(),
      implementation = ::approveTaxGroupItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getDeleteTaxGroupItemMethod(),
      implementation = ::deleteTaxGroupItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getReorderTaxGroupItemsMethod(),
      implementation = ::reorderTaxGroupItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewTaxGroupItemByIDMethod(),
      implementation = ::viewTaxGroupItemByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewApprovedTaxGroupItemsMethod(),
      implementation = ::viewApprovedTaxGroupItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewUnapprovedTaxGroupItemsMethod(),
      implementation = ::viewUnapprovedTaxGroupItems
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewTaxGroupItemHistoryMethod(),
      implementation = ::viewTaxGroupItemHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TaxGroupsServiceGrpc.getImportFromCSVMethod(),
      implementation = ::importFromCSV
    )).build()
  }
}
