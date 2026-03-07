package com.scailo.sdk

import com.scailo.sdk.ClientStreamsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.ClientStreamsService.
 */
public object ClientStreamsServiceGrpcKt {
  public const val SERVICE_NAME: String = ClientStreamsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<ClientStreamsServiceCreateRequest, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getCreateMethod()

  public val updateMethod: MethodDescriptor<ClientStreamsServiceUpdateRequest, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getUpdateMethod()

  public val cancelMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getCancelMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getCompleteMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getReopenMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getRepeatMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getCommentAddMethod()

  public val addMessageMethod:
      MethodDescriptor<ClientStreamsServiceMessageCreateRequest, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getAddMessageMethod()

  public val saveMessageForLaterMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getSaveMessageForLaterMethod()

  public val deleteMessageMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getDeleteMessageMethod()

  public val viewMessageByUUIDMethod: MethodDescriptor<IdentifierUUID, ClientStreamMessage>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewMessageByUUIDMethod()

  public val viewMessagesMethod: MethodDescriptor<IdentifierUUID, ClientStreamMessagesList>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewMessagesMethod()

  public val viewPaginatedMessagesMethod:
      MethodDescriptor<ClientStreamMessagesSearchRequest, ClientStreamsServicePaginatedMessagesResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewPaginatedMessagesMethod()

  public val searchMessagesWithPaginationMethod:
      MethodDescriptor<ClientStreamMessagesSearchRequest, ClientStreamsServicePaginatedMessagesResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getSearchMessagesWithPaginationMethod()

  public val viewMessageReceiptsMethod:
      MethodDescriptor<IdentifierUUID, ClientStreamMessageReceiptsList>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewMessageReceiptsMethod()

  public val addInternalSubscriberMethod:
      MethodDescriptor<ClientStreamsServiceInternalSubscriberCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getAddInternalSubscriberMethod()

  public val deleteInternalSubscriberMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getDeleteInternalSubscriberMethod()

  public val viewInternalSubscriberByIDMethod:
      MethodDescriptor<Identifier, ClientStreamInternalSubscriber>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewInternalSubscriberByIDMethod()

  public val viewInternalSubscribersMethod:
      MethodDescriptor<IdentifierUUID, ClientStreamInternalSubscribersList>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewInternalSubscribersMethod()

  public val importInternalSubscribersFromTeamMethod:
      MethodDescriptor<ClientStreamsServiceImportInternalSubscribersRequest, IdentifierResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod()

  public val importInternalSubscribersFromDepartmentMethod:
      MethodDescriptor<ClientStreamsServiceImportInternalSubscribersRequest, IdentifierResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod()

  public val addClientSubscriberMethod:
      MethodDescriptor<ClientStreamsServiceClientSubscriberCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getAddClientSubscriberMethod()

  public val deleteClientSubscriberMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getDeleteClientSubscriberMethod()

  public val viewClientSubscriberByIDMethod:
      MethodDescriptor<Identifier, ClientStreamClientSubscriber>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewClientSubscriberByIDMethod()

  public val viewClientSubscribersMethod:
      MethodDescriptor<IdentifierUUID, ClientStreamClientSubscribersList>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewClientSubscribersMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, ClientStream>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, ClientStream>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, ClientStream>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, ClientStream>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, ClientStreamsList>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, ClientStreamsList>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, ClientStreamsList>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<ClientStreamsServicePaginationReq, ClientStreamsServicePaginationResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getViewWithPaginationMethod()

  public val searchAllMethod: MethodDescriptor<ClientStreamsServiceSearchAllReq, ClientStreamsList>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<ClientStreamsServiceFilterReq, ClientStreamsList>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getFilterMethod()

  public val countMethod: MethodDescriptor<ClientStreamsServiceCountReq, CountResponse>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<ClientStreamsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = ClientStreamsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.ClientStreamsService service as suspending coroutines.
   */
  @StubFor(ClientStreamsServiceGrpc::class)
  public class ClientStreamsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ClientStreamsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        ClientStreamsServiceCoroutineStub = ClientStreamsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: ClientStreamsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun update(request: ClientStreamsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ClientStreamsServiceGrpc.getCancelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ClientStreamsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ClientStreamsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ClientStreamsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ClientStreamsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addMessage(request: ClientStreamsServiceMessageCreateRequest,
        headers: Metadata = Metadata()): IdentifierUUID = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getAddMessageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ClientStreamsServiceGrpc.getSaveMessageForLaterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ClientStreamsServiceGrpc.getDeleteMessageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ClientStreamMessage = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewMessageByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ClientStreamMessagesList = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewMessagesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewPaginatedMessages(request: ClientStreamMessagesSearchRequest,
        headers: Metadata = Metadata()): ClientStreamsServicePaginatedMessagesResponse = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewPaginatedMessagesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchMessagesWithPagination(request: ClientStreamMessagesSearchRequest,
        headers: Metadata = Metadata()): ClientStreamsServicePaginatedMessagesResponse = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getSearchMessagesWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ClientStreamMessageReceiptsList = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewMessageReceiptsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addInternalSubscriber(request: ClientStreamsServiceInternalSubscriberCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getAddInternalSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ClientStreamsServiceGrpc.getDeleteInternalSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): ClientStreamInternalSubscriber = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewInternalSubscriberByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): ClientStreamInternalSubscribersList = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewInternalSubscribersMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun importInternalSubscribersFromTeam(request: ClientStreamsServiceImportInternalSubscribersRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun importInternalSubscribersFromDepartment(request: ClientStreamsServiceImportInternalSubscribersRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addClientSubscriber(request: ClientStreamsServiceClientSubscriberCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getAddClientSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteClientSubscriber(request: IdentifierWithUserComment, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getDeleteClientSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewClientSubscriberByID(request: Identifier, headers: Metadata =
        Metadata()): ClientStreamClientSubscriber = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewClientSubscriberByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewClientSubscribers(request: IdentifierUUID, headers: Metadata =
        Metadata()): ClientStreamClientSubscribersList = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewClientSubscribersMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): ClientStream =
        unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ClientStream = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ClientStream = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ClientStream = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ClientStreamsList = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ClientStreamsList = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): ClientStreamsList = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: ClientStreamsServicePaginationReq,
        headers: Metadata = Metadata()): ClientStreamsServicePaginationResponse = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: ClientStreamsServiceSearchAllReq, headers: Metadata =
        Metadata()): ClientStreamsList = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: ClientStreamsServiceFilterReq, headers: Metadata =
        Metadata()): ClientStreamsList = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: ClientStreamsServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: ClientStreamsServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      ClientStreamsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.ClientStreamsService service based on Kotlin coroutines.
   */
  public abstract class ClientStreamsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: ClientStreamsServiceCreateRequest): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.Update.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun update(request: ClientStreamsServiceUpdateRequest): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.Update is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.Cancel.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.Cancel is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.AddMessage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addMessage(request: ClientStreamsServiceMessageCreateRequest):
        IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.AddMessage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.SaveMessageForLater.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.SaveMessageForLater is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.DeleteMessage.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.DeleteMessage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewMessageByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewMessageByUUID(request: IdentifierUUID): ClientStreamMessage = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewMessageByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewMessages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewMessages(request: IdentifierUUID): ClientStreamMessagesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewMessages is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewPaginatedMessages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewPaginatedMessages(request: ClientStreamMessagesSearchRequest):
        ClientStreamsServicePaginatedMessagesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewPaginatedMessages is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.SearchMessagesWithPagination.
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
        fun searchMessagesWithPagination(request: ClientStreamMessagesSearchRequest):
        ClientStreamsServicePaginatedMessagesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.SearchMessagesWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewMessageReceipts.
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
        ClientStreamMessageReceiptsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewMessageReceipts is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.AddInternalSubscriber.
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
        fun addInternalSubscriber(request: ClientStreamsServiceInternalSubscriberCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.AddInternalSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.DeleteInternalSubscriber.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.DeleteInternalSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewInternalSubscriberByID.
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
        ClientStreamInternalSubscriber = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewInternalSubscriberByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewInternalSubscribers.
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
        ClientStreamInternalSubscribersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewInternalSubscribers is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ClientStreamsService.ImportInternalSubscribersFromTeam.
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
        fun importInternalSubscribersFromTeam(request: ClientStreamsServiceImportInternalSubscribersRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ImportInternalSubscribersFromTeam is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.ClientStreamsService.ImportInternalSubscribersFromDepartment.
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
        fun importInternalSubscribersFromDepartment(request: ClientStreamsServiceImportInternalSubscribersRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ImportInternalSubscribersFromDepartment is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.AddClientSubscriber.
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
        fun addClientSubscriber(request: ClientStreamsServiceClientSubscriberCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.AddClientSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.DeleteClientSubscriber.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteClientSubscriber(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.DeleteClientSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewClientSubscriberByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewClientSubscriberByID(request: Identifier):
        ClientStreamClientSubscriber = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewClientSubscriberByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewClientSubscribers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewClientSubscribers(request: IdentifierUUID):
        ClientStreamClientSubscribersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewClientSubscribers is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): ClientStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): ClientStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): ClientStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): ClientStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): ClientStreamsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): ClientStreamsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): ClientStreamsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: ClientStreamsServicePaginationReq):
        ClientStreamsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: ClientStreamsServiceSearchAllReq): ClientStreamsList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: ClientStreamsServiceFilterReq): ClientStreamsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: ClientStreamsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ClientStreamsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: ClientStreamsServiceFilterReq): StandardFile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ClientStreamsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getUpdateMethod(),
      implementation = ::update
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getCancelMethod(),
      implementation = ::cancel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getAddMessageMethod(),
      implementation = ::addMessage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getSaveMessageForLaterMethod(),
      implementation = ::saveMessageForLater
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getDeleteMessageMethod(),
      implementation = ::deleteMessage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewMessageByUUIDMethod(),
      implementation = ::viewMessageByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewMessagesMethod(),
      implementation = ::viewMessages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewPaginatedMessagesMethod(),
      implementation = ::viewPaginatedMessages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getSearchMessagesWithPaginationMethod(),
      implementation = ::searchMessagesWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewMessageReceiptsMethod(),
      implementation = ::viewMessageReceipts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getAddInternalSubscriberMethod(),
      implementation = ::addInternalSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getDeleteInternalSubscriberMethod(),
      implementation = ::deleteInternalSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewInternalSubscriberByIDMethod(),
      implementation = ::viewInternalSubscriberByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewInternalSubscribersMethod(),
      implementation = ::viewInternalSubscribers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod(),
      implementation = ::importInternalSubscribersFromTeam
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod(),
      implementation = ::importInternalSubscribersFromDepartment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getAddClientSubscriberMethod(),
      implementation = ::addClientSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getDeleteClientSubscriberMethod(),
      implementation = ::deleteClientSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewClientSubscriberByIDMethod(),
      implementation = ::viewClientSubscriberByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewClientSubscribersMethod(),
      implementation = ::viewClientSubscribers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ClientStreamsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
