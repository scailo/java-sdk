package com.scailo.sdk

import com.scailo.sdk.VendorStreamsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.VendorStreamsService.
 */
public object VendorStreamsServiceGrpcKt {
  public const val SERVICE_NAME: String = VendorStreamsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<VendorStreamsServiceCreateRequest, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getCreateMethod()

  public val updateMethod: MethodDescriptor<VendorStreamsServiceUpdateRequest, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getUpdateMethod()

  public val cancelMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getCancelMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getCompleteMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getReopenMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getRepeatMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getCommentAddMethod()

  public val addMessageMethod:
      MethodDescriptor<VendorStreamsServiceMessageCreateRequest, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getAddMessageMethod()

  public val saveMessageForLaterMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getSaveMessageForLaterMethod()

  public val deleteMessageMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getDeleteMessageMethod()

  public val viewMessageByUUIDMethod: MethodDescriptor<IdentifierUUID, VendorStreamMessage>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewMessageByUUIDMethod()

  public val viewMessagesMethod: MethodDescriptor<IdentifierUUID, VendorStreamMessagesList>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewMessagesMethod()

  public val viewPaginatedMessagesMethod:
      MethodDescriptor<VendorStreamMessagesSearchRequest, VendorStreamsServicePaginatedMessagesResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewPaginatedMessagesMethod()

  public val searchMessagesWithPaginationMethod:
      MethodDescriptor<VendorStreamMessagesSearchRequest, VendorStreamsServicePaginatedMessagesResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getSearchMessagesWithPaginationMethod()

  public val viewMessageReceiptsMethod:
      MethodDescriptor<IdentifierUUID, VendorStreamMessageReceiptsList>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewMessageReceiptsMethod()

  public val addInternalSubscriberMethod:
      MethodDescriptor<VendorStreamsServiceInternalSubscriberCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getAddInternalSubscriberMethod()

  public val deleteInternalSubscriberMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getDeleteInternalSubscriberMethod()

  public val viewInternalSubscriberByIDMethod:
      MethodDescriptor<Identifier, VendorStreamInternalSubscriber>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewInternalSubscriberByIDMethod()

  public val viewInternalSubscribersMethod:
      MethodDescriptor<IdentifierUUID, VendorStreamInternalSubscribersList>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewInternalSubscribersMethod()

  public val importInternalSubscribersFromTeamMethod:
      MethodDescriptor<VendorStreamsServiceImportInternalSubscribersRequest, IdentifierResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod()

  public val importInternalSubscribersFromDepartmentMethod:
      MethodDescriptor<VendorStreamsServiceImportInternalSubscribersRequest, IdentifierResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod()

  public val addVendorSubscriberMethod:
      MethodDescriptor<VendorStreamsServiceVendorSubscriberCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getAddVendorSubscriberMethod()

  public val deleteVendorSubscriberMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getDeleteVendorSubscriberMethod()

  public val viewVendorSubscriberByIDMethod:
      MethodDescriptor<Identifier, VendorStreamVendorSubscriber>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewVendorSubscriberByIDMethod()

  public val viewVendorSubscribersMethod:
      MethodDescriptor<IdentifierUUID, VendorStreamVendorSubscribersList>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewVendorSubscribersMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, VendorStream>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, VendorStream>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, VendorStream>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, VendorStream>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, VendorStreamsList>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, VendorStreamsList>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, VendorStreamsList>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<VendorStreamsServicePaginationReq, VendorStreamsServicePaginationResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getViewWithPaginationMethod()

  public val searchAllMethod: MethodDescriptor<VendorStreamsServiceSearchAllReq, VendorStreamsList>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<VendorStreamsServiceFilterReq, VendorStreamsList>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getFilterMethod()

  public val countMethod: MethodDescriptor<VendorStreamsServiceCountReq, CountResponse>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<VendorStreamsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = VendorStreamsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.VendorStreamsService service as suspending coroutines.
   */
  @StubFor(VendorStreamsServiceGrpc::class)
  public class VendorStreamsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<VendorStreamsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        VendorStreamsServiceCoroutineStub = VendorStreamsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: VendorStreamsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun update(request: VendorStreamsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun cancel(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getCancelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addMessage(request: VendorStreamsServiceMessageCreateRequest,
        headers: Metadata = Metadata()): IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getAddMessageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun saveMessageForLater(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getSaveMessageForLaterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteMessage(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierUUID = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getDeleteMessageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewMessageByUUID(request: IdentifierUUID, headers: Metadata = Metadata()):
        VendorStreamMessage = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewMessageByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewMessages(request: IdentifierUUID, headers: Metadata = Metadata()):
        VendorStreamMessagesList = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewMessagesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewPaginatedMessages(request: VendorStreamMessagesSearchRequest,
        headers: Metadata = Metadata()): VendorStreamsServicePaginatedMessagesResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewPaginatedMessagesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchMessagesWithPagination(request: VendorStreamMessagesSearchRequest,
        headers: Metadata = Metadata()): VendorStreamsServicePaginatedMessagesResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getSearchMessagesWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewMessageReceipts(request: IdentifierUUID, headers: Metadata = Metadata()):
        VendorStreamMessageReceiptsList = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewMessageReceiptsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addInternalSubscriber(request: VendorStreamsServiceInternalSubscriberCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getAddInternalSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteInternalSubscriber(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getDeleteInternalSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInternalSubscriberByID(request: Identifier, headers: Metadata =
        Metadata()): VendorStreamInternalSubscriber = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewInternalSubscriberByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInternalSubscribers(request: IdentifierUUID, headers: Metadata =
        Metadata()): VendorStreamInternalSubscribersList = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewInternalSubscribersMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun importInternalSubscribersFromTeam(request: VendorStreamsServiceImportInternalSubscribersRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun importInternalSubscribersFromDepartment(request: VendorStreamsServiceImportInternalSubscribersRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addVendorSubscriber(request: VendorStreamsServiceVendorSubscriberCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getAddVendorSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteVendorSubscriber(request: IdentifierWithUserComment, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getDeleteVendorSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewVendorSubscriberByID(request: Identifier, headers: Metadata =
        Metadata()): VendorStreamVendorSubscriber = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewVendorSubscriberByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewVendorSubscribers(request: IdentifierUUID, headers: Metadata =
        Metadata()): VendorStreamVendorSubscribersList = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewVendorSubscribersMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): VendorStream =
        unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        VendorStream = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        VendorStream = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        VendorStream = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        VendorStreamsList = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        VendorStreamsList = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): VendorStreamsList = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: VendorStreamsServicePaginationReq,
        headers: Metadata = Metadata()): VendorStreamsServicePaginationResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: VendorStreamsServiceSearchAllReq, headers: Metadata =
        Metadata()): VendorStreamsList = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: VendorStreamsServiceFilterReq, headers: Metadata =
        Metadata()): VendorStreamsList = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: VendorStreamsServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: VendorStreamsServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      VendorStreamsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.VendorStreamsService service based on Kotlin coroutines.
   */
  public abstract class VendorStreamsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: VendorStreamsServiceCreateRequest): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.Update.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun update(request: VendorStreamsServiceUpdateRequest): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.Update is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.Cancel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun cancel(request: IdentifierUUIDWithUserComment): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.Cancel is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.Complete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun complete(request: IdentifierUUIDWithUserComment): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.Reopen.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reopen(request: IdentifierUUIDWithUserComment): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.Repeat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun repeat(request: IdentifierUUIDWithUserComment): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.CommentAdd.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun commentAdd(request: IdentifierUUIDWithUserComment): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.AddMessage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addMessage(request: VendorStreamsServiceMessageCreateRequest):
        IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.AddMessage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.SaveMessageForLater.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun saveMessageForLater(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.SaveMessageForLater is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.DeleteMessage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteMessage(request: IdentifierUUID): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.DeleteMessage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewMessageByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewMessageByUUID(request: IdentifierUUID): VendorStreamMessage = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewMessageByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewMessages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewMessages(request: IdentifierUUID): VendorStreamMessagesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewMessages is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewPaginatedMessages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewPaginatedMessages(request: VendorStreamMessagesSearchRequest):
        VendorStreamsServicePaginatedMessagesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewPaginatedMessages is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.SearchMessagesWithPagination.
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
        fun searchMessagesWithPagination(request: VendorStreamMessagesSearchRequest):
        VendorStreamsServicePaginatedMessagesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.SearchMessagesWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewMessageReceipts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewMessageReceipts(request: IdentifierUUID):
        VendorStreamMessageReceiptsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewMessageReceipts is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.AddInternalSubscriber.
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
        fun addInternalSubscriber(request: VendorStreamsServiceInternalSubscriberCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.AddInternalSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.DeleteInternalSubscriber.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteInternalSubscriber(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.DeleteInternalSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewInternalSubscriberByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInternalSubscriberByID(request: Identifier):
        VendorStreamInternalSubscriber = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewInternalSubscriberByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewInternalSubscribers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInternalSubscribers(request: IdentifierUUID):
        VendorStreamInternalSubscribersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewInternalSubscribers is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.VendorStreamsService.ImportInternalSubscribersFromTeam.
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
        fun importInternalSubscribersFromTeam(request: VendorStreamsServiceImportInternalSubscribersRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ImportInternalSubscribersFromTeam is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.VendorStreamsService.ImportInternalSubscribersFromDepartment.
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
        fun importInternalSubscribersFromDepartment(request: VendorStreamsServiceImportInternalSubscribersRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ImportInternalSubscribersFromDepartment is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.AddVendorSubscriber.
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
        fun addVendorSubscriber(request: VendorStreamsServiceVendorSubscriberCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.AddVendorSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.DeleteVendorSubscriber.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteVendorSubscriber(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.DeleteVendorSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewVendorSubscriberByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewVendorSubscriberByID(request: Identifier):
        VendorStreamVendorSubscriber = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewVendorSubscriberByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewVendorSubscribers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewVendorSubscribers(request: IdentifierUUID):
        VendorStreamVendorSubscribersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewVendorSubscribers is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): VendorStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): VendorStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): VendorStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): VendorStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): VendorStreamsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): VendorStreamsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): VendorStreamsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: VendorStreamsServicePaginationReq):
        VendorStreamsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: VendorStreamsServiceSearchAllReq): VendorStreamsList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: VendorStreamsServiceFilterReq): VendorStreamsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: VendorStreamsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.VendorStreamsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: VendorStreamsServiceFilterReq): StandardFile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.VendorStreamsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getUpdateMethod(),
      implementation = ::update
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getCancelMethod(),
      implementation = ::cancel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getAddMessageMethod(),
      implementation = ::addMessage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getSaveMessageForLaterMethod(),
      implementation = ::saveMessageForLater
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getDeleteMessageMethod(),
      implementation = ::deleteMessage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewMessageByUUIDMethod(),
      implementation = ::viewMessageByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewMessagesMethod(),
      implementation = ::viewMessages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewPaginatedMessagesMethod(),
      implementation = ::viewPaginatedMessages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getSearchMessagesWithPaginationMethod(),
      implementation = ::searchMessagesWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewMessageReceiptsMethod(),
      implementation = ::viewMessageReceipts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getAddInternalSubscriberMethod(),
      implementation = ::addInternalSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getDeleteInternalSubscriberMethod(),
      implementation = ::deleteInternalSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewInternalSubscriberByIDMethod(),
      implementation = ::viewInternalSubscriberByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewInternalSubscribersMethod(),
      implementation = ::viewInternalSubscribers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod(),
      implementation = ::importInternalSubscribersFromTeam
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod(),
      implementation = ::importInternalSubscribersFromDepartment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getAddVendorSubscriberMethod(),
      implementation = ::addVendorSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getDeleteVendorSubscriberMethod(),
      implementation = ::deleteVendorSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewVendorSubscriberByIDMethod(),
      implementation = ::viewVendorSubscriberByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewVendorSubscribersMethod(),
      implementation = ::viewVendorSubscribers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = VendorStreamsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
