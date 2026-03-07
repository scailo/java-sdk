package com.scailo.sdk

import com.scailo.sdk.AttendancesAmendmentsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.AttendancesAmendmentsService.
 */
public object AttendancesAmendmentsServiceGrpcKt {
  public const val SERVICE_NAME: String = AttendancesAmendmentsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<AttendancesAmendmentsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getCreateMethod()

  public val draftMethod:
      MethodDescriptor<AttendancesAmendmentsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<AttendancesAmendmentsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<AttendancesAmendmentsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getRepeatMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getCommentAddMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, AttendanceAmendment>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, AttendanceAmendment>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, AttendanceAmendment>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, AttendanceAmendment>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, AttendancesAmendmentsList>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, AttendancesAmendmentsList>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, AttendancesAmendmentsList>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<AttendancesAmendmentsServicePaginationReq, AttendancesAmendmentsServicePaginationResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getViewWithPaginationMethod()

  public val searchAllMethod:
      MethodDescriptor<AttendancesAmendmentsServiceSearchAllReq, AttendancesAmendmentsList>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<AttendancesAmendmentsServiceFilterReq, AttendancesAmendmentsList>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<AttendancesAmendmentsServiceCountReq, CountResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getCountMethod()

  public val checkConflictsMethod: MethodDescriptor<Identifier, BooleanResponse>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getCheckConflictsMethod()

  public val downloadAsCSVMethod:
      MethodDescriptor<AttendancesAmendmentsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = AttendancesAmendmentsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.AttendancesAmendmentsService service as suspending
   * coroutines.
   */
  @StubFor(AttendancesAmendmentsServiceGrpc::class)
  public class AttendancesAmendmentsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AttendancesAmendmentsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        AttendancesAmendmentsServiceCoroutineStub =
        AttendancesAmendmentsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: AttendancesAmendmentsServiceCreateRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: AttendancesAmendmentsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: AttendancesAmendmentsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: AttendancesAmendmentsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        AttendanceAmendment = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        AttendanceAmendment = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        AttendanceAmendment = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        AttendanceAmendment = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        AttendancesAmendmentsList = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        AttendancesAmendmentsList = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): AttendancesAmendmentsList = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: AttendancesAmendmentsServicePaginationReq,
        headers: Metadata = Metadata()): AttendancesAmendmentsServicePaginationResponse = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: AttendancesAmendmentsServiceSearchAllReq,
        headers: Metadata = Metadata()): AttendancesAmendmentsList = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: AttendancesAmendmentsServiceFilterReq, headers: Metadata =
        Metadata()): AttendancesAmendmentsList = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      AttendancesAmendmentsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: AttendancesAmendmentsServiceCountReq, headers: Metadata =
        Metadata()): CountResponse = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun checkConflicts(request: Identifier, headers: Metadata = Metadata()):
        BooleanResponse = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getCheckConflictsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: AttendancesAmendmentsServiceFilterReq,
        headers: Metadata = Metadata()): StandardFile = unaryRpc(
      channel,
      AttendancesAmendmentsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.AttendancesAmendmentsService service based on Kotlin
   * coroutines.
   */
  public abstract class AttendancesAmendmentsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: AttendancesAmendmentsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: AttendancesAmendmentsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: AttendancesAmendmentsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: AttendancesAmendmentsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): AttendanceAmendment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): AttendanceAmendment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): AttendanceAmendment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): AttendanceAmendment =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): AttendancesAmendmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): AttendancesAmendmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): AttendancesAmendmentsList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: AttendancesAmendmentsServicePaginationReq):
        AttendancesAmendmentsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: AttendancesAmendmentsServiceSearchAllReq):
        AttendancesAmendmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: AttendancesAmendmentsServiceFilterReq):
        AttendancesAmendmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: AttendancesAmendmentsServiceCountReq): CountResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.CheckConflicts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun checkConflicts(request: Identifier): BooleanResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.CheckConflicts is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.AttendancesAmendmentsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: AttendancesAmendmentsServiceFilterReq):
        StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.AttendancesAmendmentsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getCheckConflictsMethod(),
      implementation = ::checkConflicts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AttendancesAmendmentsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
