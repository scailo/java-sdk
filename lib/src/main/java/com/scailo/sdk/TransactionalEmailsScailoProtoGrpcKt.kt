package com.scailo.sdk

import com.scailo.sdk.TransactionalEmailsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.TransactionalEmailsService.
 */
public object TransactionalEmailsServiceGrpcKt {
  public const val SERVICE_NAME: String = TransactionalEmailsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<TransactionalEmailsServiceCreateRequest, TransactionalEmail>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getCreateMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, TransactionalEmail>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, TransactionalEmail>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getViewByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, TransactionalEmailsList>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getViewFromIDsMethod()

  public val viewRecipientsMethod:
      MethodDescriptor<IdentifierUUID, TransactionalEmailRecipientsList>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getViewRecipientsMethod()

  public val viewAttachmentsMethod:
      MethodDescriptor<IdentifierUUID, TransactionalEmailAttachmentsList>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getViewAttachmentsMethod()

  public val searchAllMethod:
      MethodDescriptor<TransactionalEmailsServiceSearchAllReq, TransactionalEmailsList>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<TransactionalEmailsServiceFilterReq, TransactionalEmailsList>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getFilterMethod()

  public val countMethod: MethodDescriptor<TransactionalEmailsServiceCountReq, CountResponse>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod:
      MethodDescriptor<TransactionalEmailsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = TransactionalEmailsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.TransactionalEmailsService service as suspending
   * coroutines.
   */
  @StubFor(TransactionalEmailsServiceGrpc::class)
  public class TransactionalEmailsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TransactionalEmailsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        TransactionalEmailsServiceCoroutineStub = TransactionalEmailsServiceCoroutineStub(channel,
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
    public suspend fun create(request: TransactionalEmailsServiceCreateRequest, headers: Metadata =
        Metadata()): TransactionalEmail = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        TransactionalEmail = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        TransactionalEmail = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        TransactionalEmailsList = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewRecipients(request: IdentifierUUID, headers: Metadata = Metadata()):
        TransactionalEmailRecipientsList = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getViewRecipientsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAttachments(request: IdentifierUUID, headers: Metadata = Metadata()):
        TransactionalEmailAttachmentsList = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getViewAttachmentsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: TransactionalEmailsServiceSearchAllReq, headers: Metadata
        = Metadata()): TransactionalEmailsList = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: TransactionalEmailsServiceFilterReq, headers: Metadata =
        Metadata()): TransactionalEmailsList = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: TransactionalEmailsServiceCountReq, headers: Metadata =
        Metadata()): CountResponse = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: TransactionalEmailsServiceFilterReq, headers: Metadata
        = Metadata()): StandardFile = unaryRpc(
      channel,
      TransactionalEmailsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.TransactionalEmailsService service based on Kotlin
   * coroutines.
   */
  public abstract class TransactionalEmailsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: TransactionalEmailsServiceCreateRequest):
        TransactionalEmail = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): TransactionalEmail = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): TransactionalEmail = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): TransactionalEmailsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.ViewRecipients.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewRecipients(request: IdentifierUUID):
        TransactionalEmailRecipientsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.ViewRecipients is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.ViewAttachments.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAttachments(request: IdentifierUUID):
        TransactionalEmailAttachmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.ViewAttachments is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: TransactionalEmailsServiceSearchAllReq):
        TransactionalEmailsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: TransactionalEmailsServiceFilterReq):
        TransactionalEmailsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: TransactionalEmailsServiceCountReq): CountResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.TransactionalEmailsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: TransactionalEmailsServiceFilterReq):
        StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.TransactionalEmailsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getViewRecipientsMethod(),
      implementation = ::viewRecipients
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getViewAttachmentsMethod(),
      implementation = ::viewAttachments
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransactionalEmailsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
