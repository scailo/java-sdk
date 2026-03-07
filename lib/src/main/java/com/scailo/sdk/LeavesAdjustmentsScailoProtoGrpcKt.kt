package com.scailo.sdk

import com.scailo.sdk.LeavesAdjustmentsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.LeavesAdjustmentsService.
 */
public object LeavesAdjustmentsServiceGrpcKt {
  public const val SERVICE_NAME: String = LeavesAdjustmentsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod:
      MethodDescriptor<LeavesAdjustmentsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getCreateMethod()

  public val draftMethod:
      MethodDescriptor<LeavesAdjustmentsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getDraftMethod()

  public val draftUpdateMethod:
      MethodDescriptor<LeavesAdjustmentsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<LeavesAdjustmentsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getRestoreMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getRepeatMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getCommentAddMethod()

  public val addLeaveAdjustmentRecordMethod:
      MethodDescriptor<LeavesAdjustmentsServiceRecordCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getAddLeaveAdjustmentRecordMethod()

  public val modifyLeaveAdjustmentRecordMethod:
      MethodDescriptor<LeavesAdjustmentsServiceRecordUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getModifyLeaveAdjustmentRecordMethod()

  public val approveLeaveAdjustmentRecordMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getApproveLeaveAdjustmentRecordMethod()

  public val deleteLeaveAdjustmentRecordMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getDeleteLeaveAdjustmentRecordMethod()

  public val reorderLeaveAdjustmentRecordsMethod:
      MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getReorderLeaveAdjustmentRecordsMethod()

  public val viewLeaveAdjustmentRecordByIDMethod:
      MethodDescriptor<Identifier, LeaveAdjustmentRecord>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordByIDMethod()

  public val viewApprovedLeaveAdjustmentRecordsMethod:
      MethodDescriptor<IdentifierWithSearchKey, LeavesAdjustmentsRecordsList>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewApprovedLeaveAdjustmentRecordsMethod()

  public val viewUnapprovedLeaveAdjustmentRecordsMethod:
      MethodDescriptor<IdentifierWithSearchKey, LeavesAdjustmentsRecordsList>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewUnapprovedLeaveAdjustmentRecordsMethod()

  public val viewLeaveAdjustmentRecordHistoryMethod:
      MethodDescriptor<LeavesAdjustmentsRecordsHistoryRequest, LeavesAdjustmentsRecordsList>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordHistoryMethod()

  public val viewPaginatedApprovedLeaveAdjustmentRecordsMethod:
      MethodDescriptor<LeaveAdjustmentRecordsSearchRequest, LeavesAdjustmentsServicePaginatedRecordsResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewPaginatedApprovedLeaveAdjustmentRecordsMethod()

  public val viewPaginatedUnapprovedLeaveAdjustmentRecordsMethod:
      MethodDescriptor<LeaveAdjustmentRecordsSearchRequest, LeavesAdjustmentsServicePaginatedRecordsResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod()

  public val searchRecordsWithPaginationMethod:
      MethodDescriptor<LeaveAdjustmentRecordsSearchRequest, LeavesAdjustmentsServicePaginatedRecordsResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getSearchRecordsWithPaginationMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, LeaveAdjustment>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, LeaveAdjustment>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, LeaveAdjustment>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, LeaveAdjustment>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, LeavesAdjustmentsList>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, LeavesAdjustmentsList>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, LeavesAdjustmentsList>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<LeavesAdjustmentsServicePaginationReq, LeavesAdjustmentsServicePaginationResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getViewWithPaginationMethod()

  public val searchAllMethod:
      MethodDescriptor<LeavesAdjustmentsServiceSearchAllReq, LeavesAdjustmentsList>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getSearchAllMethod()

  public val filterMethod:
      MethodDescriptor<LeavesAdjustmentsServiceFilterReq, LeavesAdjustmentsList>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<LeavesAdjustmentsServiceCountReq, CountResponse>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<LeavesAdjustmentsServiceFilterReq, StandardFile>
    @JvmStatic
    get() = LeavesAdjustmentsServiceGrpc.getDownloadAsCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.LeavesAdjustmentsService service as suspending
   * coroutines.
   */
  @StubFor(LeavesAdjustmentsServiceGrpc::class)
  public class LeavesAdjustmentsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<LeavesAdjustmentsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        LeavesAdjustmentsServiceCoroutineStub = LeavesAdjustmentsServiceCoroutineStub(channel,
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
    public suspend fun create(request: LeavesAdjustmentsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: LeavesAdjustmentsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: LeavesAdjustmentsServiceUpdateRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: LeavesAdjustmentsServiceUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addLeaveAdjustmentRecord(request: LeavesAdjustmentsServiceRecordCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getAddLeaveAdjustmentRecordMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun modifyLeaveAdjustmentRecord(request: LeavesAdjustmentsServiceRecordUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getModifyLeaveAdjustmentRecordMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveLeaveAdjustmentRecord(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getApproveLeaveAdjustmentRecordMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteLeaveAdjustmentRecord(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getDeleteLeaveAdjustmentRecordMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderLeaveAdjustmentRecords(request: ReorderItemsRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getReorderLeaveAdjustmentRecordsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewLeaveAdjustmentRecordByID(request: Identifier, headers: Metadata =
        Metadata()): LeaveAdjustmentRecord = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewApprovedLeaveAdjustmentRecords(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): LeavesAdjustmentsRecordsList = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewApprovedLeaveAdjustmentRecordsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnapprovedLeaveAdjustmentRecords(request: IdentifierWithSearchKey,
        headers: Metadata = Metadata()): LeavesAdjustmentsRecordsList = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewUnapprovedLeaveAdjustmentRecordsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewLeaveAdjustmentRecordHistory(request: LeavesAdjustmentsRecordsHistoryRequest,
        headers: Metadata = Metadata()): LeavesAdjustmentsRecordsList = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedApprovedLeaveAdjustmentRecords(request: LeaveAdjustmentRecordsSearchRequest,
        headers: Metadata = Metadata()): LeavesAdjustmentsServicePaginatedRecordsResponse =
        unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewPaginatedApprovedLeaveAdjustmentRecordsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun viewPaginatedUnapprovedLeaveAdjustmentRecords(request: LeaveAdjustmentRecordsSearchRequest,
        headers: Metadata = Metadata()): LeavesAdjustmentsServicePaginatedRecordsResponse =
        unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchRecordsWithPagination(request: LeaveAdjustmentRecordsSearchRequest,
        headers: Metadata = Metadata()): LeavesAdjustmentsServicePaginatedRecordsResponse =
        unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getSearchRecordsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        LeaveAdjustment = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        LeaveAdjustment = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        LeaveAdjustment = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        LeaveAdjustment = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        LeavesAdjustmentsList = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        LeavesAdjustmentsList = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): LeavesAdjustmentsList = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: LeavesAdjustmentsServicePaginationReq,
        headers: Metadata = Metadata()): LeavesAdjustmentsServicePaginationResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: LeavesAdjustmentsServiceSearchAllReq, headers: Metadata =
        Metadata()): LeavesAdjustmentsList = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: LeavesAdjustmentsServiceFilterReq, headers: Metadata =
        Metadata()): LeavesAdjustmentsList = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      LeavesAdjustmentsServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: LeavesAdjustmentsServiceCountReq, headers: Metadata =
        Metadata()): CountResponse = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: LeavesAdjustmentsServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      LeavesAdjustmentsServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.LeavesAdjustmentsService service based on Kotlin
   * coroutines.
   */
  public abstract class LeavesAdjustmentsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: LeavesAdjustmentsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: LeavesAdjustmentsServiceCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: LeavesAdjustmentsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: LeavesAdjustmentsServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.AddLeaveAdjustmentRecord.
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
        fun addLeaveAdjustmentRecord(request: LeavesAdjustmentsServiceRecordCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.AddLeaveAdjustmentRecord is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.ModifyLeaveAdjustmentRecord.
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
        fun modifyLeaveAdjustmentRecord(request: LeavesAdjustmentsServiceRecordUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ModifyLeaveAdjustmentRecord is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.ApproveLeaveAdjustmentRecord.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveLeaveAdjustmentRecord(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ApproveLeaveAdjustmentRecord is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.DeleteLeaveAdjustmentRecord.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteLeaveAdjustmentRecord(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.DeleteLeaveAdjustmentRecord is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.ReorderLeaveAdjustmentRecords.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderLeaveAdjustmentRecords(request: ReorderItemsRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ReorderLeaveAdjustmentRecords is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.ViewLeaveAdjustmentRecordByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewLeaveAdjustmentRecordByID(request: Identifier):
        LeaveAdjustmentRecord = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewLeaveAdjustmentRecordByID is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.ViewApprovedLeaveAdjustmentRecords.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewApprovedLeaveAdjustmentRecords(request: IdentifierWithSearchKey):
        LeavesAdjustmentsRecordsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewApprovedLeaveAdjustmentRecords is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.ViewUnapprovedLeaveAdjustmentRecords.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnapprovedLeaveAdjustmentRecords(request: IdentifierWithSearchKey):
        LeavesAdjustmentsRecordsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewUnapprovedLeaveAdjustmentRecords is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.ViewLeaveAdjustmentRecordHistory.
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
        fun viewLeaveAdjustmentRecordHistory(request: LeavesAdjustmentsRecordsHistoryRequest):
        LeavesAdjustmentsRecordsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewLeaveAdjustmentRecordHistory is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.ViewPaginatedApprovedLeaveAdjustmentRecords.
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
        fun viewPaginatedApprovedLeaveAdjustmentRecords(request: LeaveAdjustmentRecordsSearchRequest):
        LeavesAdjustmentsServicePaginatedRecordsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewPaginatedApprovedLeaveAdjustmentRecords is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.ViewPaginatedUnapprovedLeaveAdjustmentRecords.
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
        fun viewPaginatedUnapprovedLeaveAdjustmentRecords(request: LeaveAdjustmentRecordsSearchRequest):
        LeavesAdjustmentsServicePaginatedRecordsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewPaginatedUnapprovedLeaveAdjustmentRecords is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.LeavesAdjustmentsService.SearchRecordsWithPagination.
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
        fun searchRecordsWithPagination(request: LeaveAdjustmentRecordsSearchRequest):
        LeavesAdjustmentsServicePaginatedRecordsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.SearchRecordsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): LeaveAdjustment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): LeaveAdjustment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): LeaveAdjustment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): LeaveAdjustment = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): LeavesAdjustmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): LeavesAdjustmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): LeavesAdjustmentsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: LeavesAdjustmentsServicePaginationReq):
        LeavesAdjustmentsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: LeavesAdjustmentsServiceSearchAllReq):
        LeavesAdjustmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: LeavesAdjustmentsServiceFilterReq):
        LeavesAdjustmentsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: LeavesAdjustmentsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesAdjustmentsService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: LeavesAdjustmentsServiceFilterReq): StandardFile
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesAdjustmentsService.DownloadAsCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getAddLeaveAdjustmentRecordMethod(),
      implementation = ::addLeaveAdjustmentRecord
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getModifyLeaveAdjustmentRecordMethod(),
      implementation = ::modifyLeaveAdjustmentRecord
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getApproveLeaveAdjustmentRecordMethod(),
      implementation = ::approveLeaveAdjustmentRecord
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getDeleteLeaveAdjustmentRecordMethod(),
      implementation = ::deleteLeaveAdjustmentRecord
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getReorderLeaveAdjustmentRecordsMethod(),
      implementation = ::reorderLeaveAdjustmentRecords
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordByIDMethod(),
      implementation = ::viewLeaveAdjustmentRecordByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewApprovedLeaveAdjustmentRecordsMethod(),
      implementation = ::viewApprovedLeaveAdjustmentRecords
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewUnapprovedLeaveAdjustmentRecordsMethod(),
      implementation = ::viewUnapprovedLeaveAdjustmentRecords
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewLeaveAdjustmentRecordHistoryMethod(),
      implementation = ::viewLeaveAdjustmentRecordHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        LeavesAdjustmentsServiceGrpc.getViewPaginatedApprovedLeaveAdjustmentRecordsMethod(),
      implementation = ::viewPaginatedApprovedLeaveAdjustmentRecords
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor =
        LeavesAdjustmentsServiceGrpc.getViewPaginatedUnapprovedLeaveAdjustmentRecordsMethod(),
      implementation = ::viewPaginatedUnapprovedLeaveAdjustmentRecords
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getSearchRecordsWithPaginationMethod(),
      implementation = ::searchRecordsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesAdjustmentsServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    )).build()
  }
}
