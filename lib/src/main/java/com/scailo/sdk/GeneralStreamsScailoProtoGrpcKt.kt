package com.scailo.sdk

import com.scailo.sdk.GeneralStreamsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.GeneralStreamsService.
 */
public object GeneralStreamsServiceGrpcKt {
  public const val SERVICE_NAME: String = GeneralStreamsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<GeneralStreamsServiceCreateRequest, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getCreateMethod()

  public val updateMethod: MethodDescriptor<GeneralStreamsServiceUpdateRequest, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getUpdateMethod()

  public val cancelMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getCancelMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getCompleteMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getReopenMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getRepeatMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getCommentAddMethod()

  public val addMessageMethod:
      MethodDescriptor<GeneralStreamsServiceMessageCreateRequest, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getAddMessageMethod()

  public val saveMessageForLaterMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getSaveMessageForLaterMethod()

  public val deleteMessageMethod: MethodDescriptor<IdentifierUUID, IdentifierUUID>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getDeleteMessageMethod()

  public val viewMessageByUUIDMethod: MethodDescriptor<IdentifierUUID, GeneralStreamMessage>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewMessageByUUIDMethod()

  public val viewMessagesMethod: MethodDescriptor<IdentifierUUID, GeneralStreamMessagesList>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewMessagesMethod()

  public val viewPaginatedMessagesMethod:
      MethodDescriptor<GeneralStreamMessagesSearchRequest, GeneralStreamsServicePaginatedMessagesResponse>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewPaginatedMessagesMethod()

  public val searchMessagesWithPaginationMethod:
      MethodDescriptor<GeneralStreamMessagesSearchRequest, GeneralStreamsServicePaginatedMessagesResponse>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getSearchMessagesWithPaginationMethod()

  public val viewMessageReceiptsMethod:
      MethodDescriptor<IdentifierUUID, GeneralStreamMessageReceiptsList>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewMessageReceiptsMethod()

  public val addInternalSubscriberMethod:
      MethodDescriptor<GeneralStreamsServiceInternalSubscriberCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getAddInternalSubscriberMethod()

  public val deleteInternalSubscriberMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getDeleteInternalSubscriberMethod()

  public val viewInternalSubscriberByIDMethod:
      MethodDescriptor<Identifier, GeneralStreamInternalSubscriber>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewInternalSubscriberByIDMethod()

  public val viewInternalSubscribersMethod:
      MethodDescriptor<IdentifierUUID, GeneralStreamInternalSubscribersList>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewInternalSubscribersMethod()

  public val importInternalSubscribersFromTeamMethod:
      MethodDescriptor<GeneralStreamsServiceImportInternalSubscribersRequest, IdentifierResponse>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod()

  public val importInternalSubscribersFromDepartmentMethod:
      MethodDescriptor<GeneralStreamsServiceImportInternalSubscribersRequest, IdentifierResponse>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, GeneralStream>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, GeneralStream>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, GeneralStream>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, GeneralStream>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, GeneralStreamsList>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, GeneralStreamsList>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, GeneralStreamsList>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<GeneralStreamsServicePaginationReq, GeneralStreamsServicePaginationResponse>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getViewWithPaginationMethod()

  public val searchAllMethod:
      MethodDescriptor<GeneralStreamsServiceSearchAllReq, GeneralStreamsList>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<GeneralStreamsServiceFilterReq, GeneralStreamsList>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getFilterMethod()

  public val countMethod: MethodDescriptor<GeneralStreamsServiceCountReq, CountResponse>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<GeneralStreamsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = GeneralStreamsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.GeneralStreamsService service as suspending coroutines.
   */
  @StubFor(GeneralStreamsServiceGrpc::class)
  public class GeneralStreamsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<GeneralStreamsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        GeneralStreamsServiceCoroutineStub = GeneralStreamsServiceCoroutineStub(channel,
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
    public suspend fun create(request: GeneralStreamsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun update(request: GeneralStreamsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      GeneralStreamsServiceGrpc.getCancelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      GeneralStreamsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      GeneralStreamsServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      GeneralStreamsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      GeneralStreamsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addMessage(request: GeneralStreamsServiceMessageCreateRequest,
        headers: Metadata = Metadata()): IdentifierUUID = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getAddMessageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      GeneralStreamsServiceGrpc.getSaveMessageForLaterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      GeneralStreamsServiceGrpc.getDeleteMessageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        GeneralStreamMessage = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewMessageByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        GeneralStreamMessagesList = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewMessagesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewPaginatedMessages(request: GeneralStreamMessagesSearchRequest,
        headers: Metadata = Metadata()): GeneralStreamsServicePaginatedMessagesResponse = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewPaginatedMessagesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchMessagesWithPagination(request: GeneralStreamMessagesSearchRequest,
        headers: Metadata = Metadata()): GeneralStreamsServicePaginatedMessagesResponse = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getSearchMessagesWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        GeneralStreamMessageReceiptsList = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewMessageReceiptsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addInternalSubscriber(request: GeneralStreamsServiceInternalSubscriberCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getAddInternalSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      GeneralStreamsServiceGrpc.getDeleteInternalSubscriberMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): GeneralStreamInternalSubscriber = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewInternalSubscriberByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): GeneralStreamInternalSubscribersList = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewInternalSubscribersMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun importInternalSubscribersFromTeam(request: GeneralStreamsServiceImportInternalSubscribersRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun importInternalSubscribersFromDepartment(request: GeneralStreamsServiceImportInternalSubscribersRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): GeneralStream
        = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        GeneralStream = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        GeneralStream = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        GeneralStream = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        GeneralStreamsList = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        GeneralStreamsList = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): GeneralStreamsList = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: GeneralStreamsServicePaginationReq,
        headers: Metadata = Metadata()): GeneralStreamsServicePaginationResponse = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: GeneralStreamsServiceSearchAllReq, headers: Metadata =
        Metadata()): GeneralStreamsList = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: GeneralStreamsServiceFilterReq, headers: Metadata =
        Metadata()): GeneralStreamsList = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: GeneralStreamsServiceCountReq, headers: Metadata =
        Metadata()): CountResponse = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: GeneralStreamsServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      GeneralStreamsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.GeneralStreamsService service based on Kotlin coroutines.
   */
  public abstract class GeneralStreamsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: GeneralStreamsServiceCreateRequest): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.Update.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun update(request: GeneralStreamsServiceUpdateRequest): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.Update is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.Cancel.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.Cancel is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.AddMessage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addMessage(request: GeneralStreamsServiceMessageCreateRequest):
        IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.AddMessage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.SaveMessageForLater.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.SaveMessageForLater is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.DeleteMessage.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.DeleteMessage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewMessageByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewMessageByUUID(request: IdentifierUUID): GeneralStreamMessage = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewMessageByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewMessages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewMessages(request: IdentifierUUID): GeneralStreamMessagesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewMessages is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewPaginatedMessages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewPaginatedMessages(request: GeneralStreamMessagesSearchRequest):
        GeneralStreamsServicePaginatedMessagesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewPaginatedMessages is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.SearchMessagesWithPagination.
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
        fun searchMessagesWithPagination(request: GeneralStreamMessagesSearchRequest):
        GeneralStreamsServicePaginatedMessagesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.SearchMessagesWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewMessageReceipts.
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
        GeneralStreamMessageReceiptsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewMessageReceipts is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.AddInternalSubscriber.
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
        fun addInternalSubscriber(request: GeneralStreamsServiceInternalSubscriberCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.AddInternalSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.DeleteInternalSubscriber.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.DeleteInternalSubscriber is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewInternalSubscriberByID.
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
        GeneralStreamInternalSubscriber = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewInternalSubscriberByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewInternalSubscribers.
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
        GeneralStreamInternalSubscribersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewInternalSubscribers is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.GeneralStreamsService.ImportInternalSubscribersFromTeam.
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
        fun importInternalSubscribersFromTeam(request: GeneralStreamsServiceImportInternalSubscribersRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ImportInternalSubscribersFromTeam is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.GeneralStreamsService.ImportInternalSubscribersFromDepartment.
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
        fun importInternalSubscribersFromDepartment(request: GeneralStreamsServiceImportInternalSubscribersRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ImportInternalSubscribersFromDepartment is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): GeneralStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): GeneralStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): GeneralStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): GeneralStream = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): GeneralStreamsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): GeneralStreamsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): GeneralStreamsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: GeneralStreamsServicePaginationReq):
        GeneralStreamsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: GeneralStreamsServiceSearchAllReq):
        GeneralStreamsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: GeneralStreamsServiceFilterReq): GeneralStreamsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: GeneralStreamsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralStreamsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: GeneralStreamsServiceFilterReq): StandardFile =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralStreamsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getUpdateMethod(),
      implementation = ::update
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getCancelMethod(),
      implementation = ::cancel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getAddMessageMethod(),
      implementation = ::addMessage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getSaveMessageForLaterMethod(),
      implementation = ::saveMessageForLater
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getDeleteMessageMethod(),
      implementation = ::deleteMessage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewMessageByUUIDMethod(),
      implementation = ::viewMessageByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewMessagesMethod(),
      implementation = ::viewMessages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewPaginatedMessagesMethod(),
      implementation = ::viewPaginatedMessages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getSearchMessagesWithPaginationMethod(),
      implementation = ::searchMessagesWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewMessageReceiptsMethod(),
      implementation = ::viewMessageReceipts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getAddInternalSubscriberMethod(),
      implementation = ::addInternalSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getDeleteInternalSubscriberMethod(),
      implementation = ::deleteInternalSubscriber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewInternalSubscriberByIDMethod(),
      implementation = ::viewInternalSubscriberByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewInternalSubscribersMethod(),
      implementation = ::viewInternalSubscribers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getImportInternalSubscribersFromTeamMethod(),
      implementation = ::importInternalSubscribersFromTeam
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getImportInternalSubscribersFromDepartmentMethod(),
      implementation = ::importInternalSubscribersFromDepartment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralStreamsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
