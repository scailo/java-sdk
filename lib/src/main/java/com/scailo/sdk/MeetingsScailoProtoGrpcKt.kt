package com.scailo.sdk

import com.scailo.sdk.MeetingsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.MeetingsService.
 */
public object MeetingsServiceGrpcKt {
  public const val SERVICE_NAME: String = MeetingsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<MeetingsServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getCreateMethod()

  public val updateMethod: MethodDescriptor<MeetingsServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getUpdateMethod()

  public val cancelMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getCancelMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getCompleteMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getRepeatMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getSendEmailMethod()

  public val requestRSVPMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getRequestRSVPMethod()

  public val sendActionablesMethod:
      MethodDescriptor<IdentifierWithEmailAttributes, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getSendActionablesMethod()

  public val addActionableMethod:
      MethodDescriptor<MeetingsServiceActionableCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getAddActionableMethod()

  public val modifyActionableMethod:
      MethodDescriptor<MeetingsServiceActionableUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getModifyActionableMethod()

  public val deleteActionableMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getDeleteActionableMethod()

  public val reorderActionablesMethod: MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getReorderActionablesMethod()

  public val viewActionableByIDMethod: MethodDescriptor<Identifier, MeetingActionable>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewActionableByIDMethod()

  public val viewActionablesMethod:
      MethodDescriptor<IdentifierWithSearchKey, MeetingActionablesList>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewActionablesMethod()

  public val viewActionableHistoryMethod:
      MethodDescriptor<MeetingActionableHistoryRequest, MeetingActionablesList>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewActionableHistoryMethod()

  public val viewPaginatedActionablesMethod:
      MethodDescriptor<MeetingActionablesSearchRequest, MeetingsServicePaginatedActionablesResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewPaginatedActionablesMethod()

  public val searchActionablesWithPaginationMethod:
      MethodDescriptor<MeetingActionablesSearchRequest, MeetingsServicePaginatedActionablesResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getSearchActionablesWithPaginationMethod()

  public val addEmployeeMethod:
      MethodDescriptor<MeetingsServiceEmployeeCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getAddEmployeeMethod()

  public val deleteEmployeeMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getDeleteEmployeeMethod()

  public val viewEmployeeByIDMethod: MethodDescriptor<Identifier, MeetingEmployee>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewEmployeeByIDMethod()

  public val viewEmployeesMethod: MethodDescriptor<Identifier, MeetingEmployeesList>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewEmployeesMethod()

  public val setEmployeeRSVPMethod: MethodDescriptor<MeetingsServiceSetRSVPRequest, IdentifierUUID>
    @JvmStatic
    get() = MeetingsServiceGrpc.getSetEmployeeRSVPMethod()

  public val importFromTeamMethod:
      MethodDescriptor<MeetingsServiceImportEmployeesRequest, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getImportFromTeamMethod()

  public val importFromDepartmentMethod:
      MethodDescriptor<MeetingsServiceImportEmployeesRequest, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getImportFromDepartmentMethod()

  public val addAssociateMethod:
      MethodDescriptor<MeetingsServiceAssociateCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getAddAssociateMethod()

  public val deleteAssociateMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getDeleteAssociateMethod()

  public val viewAssociateByIDMethod: MethodDescriptor<Identifier, MeetingAssociate>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewAssociateByIDMethod()

  public val viewAssociatesMethod: MethodDescriptor<Identifier, MeetingAssociatesList>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewAssociatesMethod()

  public val setAssociateRSVPMethod: MethodDescriptor<MeetingsServiceSetRSVPRequest, IdentifierUUID>
    @JvmStatic
    get() = MeetingsServiceGrpc.getSetAssociateRSVPMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, Meeting>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, Meeting>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, Meeting>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, Meeting>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, MeetingsList>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, MeetingsList>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, MeetingsList>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<MeetingsServicePaginationReq, MeetingsServicePaginationResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getViewWithPaginationMethod()

  public val searchAllMethod: MethodDescriptor<MeetingsServiceSearchAllReq, MeetingsList>
    @JvmStatic
    get() = MeetingsServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<MeetingsServiceFilterReq, MeetingsList>
    @JvmStatic
    get() = MeetingsServiceGrpc.getFilterMethod()

  public val countMethod: MethodDescriptor<MeetingsServiceCountReq, CountResponse>
    @JvmStatic
    get() = MeetingsServiceGrpc.getCountMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.MeetingsService service as suspending coroutines.
   */
  @StubFor(MeetingsServiceGrpc::class)
  public class MeetingsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MeetingsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): MeetingsServiceCoroutineStub =
        MeetingsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: MeetingsServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun update(request: MeetingsServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getCancelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      MeetingsServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      MeetingsServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      MeetingsServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      MeetingsServiceGrpc.getSendEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun requestRSVP(request: IdentifierWithEmailAttributes, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getRequestRSVPMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun sendActionables(request: IdentifierWithEmailAttributes, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getSendActionablesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addActionable(request: MeetingsServiceActionableCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getAddActionableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun modifyActionable(request: MeetingsServiceActionableUpdateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getModifyActionableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteActionable(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getDeleteActionableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderActionables(request: ReorderItemsRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getReorderActionablesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewActionableByID(request: Identifier, headers: Metadata = Metadata()):
        MeetingActionable = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewActionableByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewActionables(request: IdentifierWithSearchKey, headers: Metadata =
        Metadata()): MeetingActionablesList = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewActionablesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewActionableHistory(request: MeetingActionableHistoryRequest,
        headers: Metadata = Metadata()): MeetingActionablesList = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewActionableHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewPaginatedActionables(request: MeetingActionablesSearchRequest,
        headers: Metadata = Metadata()): MeetingsServicePaginatedActionablesResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewPaginatedActionablesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchActionablesWithPagination(request: MeetingActionablesSearchRequest,
        headers: Metadata = Metadata()): MeetingsServicePaginatedActionablesResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getSearchActionablesWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addEmployee(request: MeetingsServiceEmployeeCreateRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getAddEmployeeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteEmployee(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getDeleteEmployeeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewEmployeeByID(request: Identifier, headers: Metadata = Metadata()):
        MeetingEmployee = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewEmployeeByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewEmployees(request: Identifier, headers: Metadata = Metadata()):
        MeetingEmployeesList = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewEmployeesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun setEmployeeRSVP(request: MeetingsServiceSetRSVPRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      MeetingsServiceGrpc.getSetEmployeeRSVPMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun importFromTeam(request: MeetingsServiceImportEmployeesRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getImportFromTeamMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun importFromDepartment(request: MeetingsServiceImportEmployeesRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getImportFromDepartmentMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addAssociate(request: MeetingsServiceAssociateCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getAddAssociateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteAssociate(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getDeleteAssociateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAssociateByID(request: Identifier, headers: Metadata = Metadata()):
        MeetingAssociate = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewAssociateByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAssociates(request: Identifier, headers: Metadata = Metadata()):
        MeetingAssociatesList = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewAssociatesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun setAssociateRSVP(request: MeetingsServiceSetRSVPRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      MeetingsServiceGrpc.getSetAssociateRSVPMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): Meeting =
        unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByUUID(request: IdentifierUUID, headers: Metadata = Metadata()): Meeting
        = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Meeting = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Meeting = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        MeetingsList = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAll(request: ActiveStatus, headers: Metadata = Metadata()): MeetingsList
        = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): MeetingsList = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: MeetingsServicePaginationReq, headers: Metadata =
        Metadata()): MeetingsServicePaginationResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: MeetingsServiceSearchAllReq, headers: Metadata =
        Metadata()): MeetingsList = unaryRpc(
      channel,
      MeetingsServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: MeetingsServiceFilterReq, headers: Metadata = Metadata()):
        MeetingsList = unaryRpc(
      channel,
      MeetingsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: MeetingsServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      MeetingsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.MeetingsService service based on Kotlin coroutines.
   */
  public abstract class MeetingsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.MeetingsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: MeetingsServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.Update.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun update(request: MeetingsServiceUpdateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.Update is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.Cancel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun cancel(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.Cancel is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.SendEmail.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.RequestRSVP.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun requestRSVP(request: IdentifierWithEmailAttributes): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.RequestRSVP is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.SendActionables.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendActionables(request: IdentifierWithEmailAttributes):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.SendActionables is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.AddActionable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addActionable(request: MeetingsServiceActionableCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.AddActionable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ModifyActionable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun modifyActionable(request: MeetingsServiceActionableUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ModifyActionable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.DeleteActionable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteActionable(request: IdentifierWithUserComment): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.DeleteActionable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ReorderActionables.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderActionables(request: ReorderItemsRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ReorderActionables is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewActionableByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewActionableByID(request: Identifier): MeetingActionable = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewActionableByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewActionables.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewActionables(request: IdentifierWithSearchKey):
        MeetingActionablesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewActionables is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewActionableHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewActionableHistory(request: MeetingActionableHistoryRequest):
        MeetingActionablesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewActionableHistory is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewPaginatedActionables.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewPaginatedActionables(request: MeetingActionablesSearchRequest):
        MeetingsServicePaginatedActionablesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewPaginatedActionables is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.SearchActionablesWithPagination.
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
        fun searchActionablesWithPagination(request: MeetingActionablesSearchRequest):
        MeetingsServicePaginatedActionablesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.SearchActionablesWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.AddEmployee.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addEmployee(request: MeetingsServiceEmployeeCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.AddEmployee is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.DeleteEmployee.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteEmployee(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.DeleteEmployee is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewEmployeeByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEmployeeByID(request: Identifier): MeetingEmployee = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewEmployeeByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewEmployees.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEmployees(request: Identifier): MeetingEmployeesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewEmployees is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.SetEmployeeRSVP.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setEmployeeRSVP(request: MeetingsServiceSetRSVPRequest): IdentifierUUID
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.SetEmployeeRSVP is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ImportFromTeam.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun importFromTeam(request: MeetingsServiceImportEmployeesRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ImportFromTeam is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ImportFromDepartment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun importFromDepartment(request: MeetingsServiceImportEmployeesRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ImportFromDepartment is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.AddAssociate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addAssociate(request: MeetingsServiceAssociateCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.AddAssociate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.DeleteAssociate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteAssociate(request: IdentifierWithUserComment): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.DeleteAssociate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewAssociateByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAssociateByID(request: Identifier): MeetingAssociate = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewAssociateByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewAssociates.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAssociates(request: Identifier): MeetingAssociatesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewAssociates is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.SetAssociateRSVP.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setAssociateRSVP(request: MeetingsServiceSetRSVPRequest): IdentifierUUID
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.SetAssociateRSVP is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): Meeting = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): Meeting = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): Meeting = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): Meeting = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): MeetingsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): MeetingsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): MeetingsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: MeetingsServicePaginationReq):
        MeetingsServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: MeetingsServiceSearchAllReq): MeetingsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: MeetingsServiceFilterReq): MeetingsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.MeetingsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: MeetingsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.MeetingsService.Count is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getUpdateMethod(),
      implementation = ::update
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getCancelMethod(),
      implementation = ::cancel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getRequestRSVPMethod(),
      implementation = ::requestRSVP
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getSendActionablesMethod(),
      implementation = ::sendActionables
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getAddActionableMethod(),
      implementation = ::addActionable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getModifyActionableMethod(),
      implementation = ::modifyActionable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getDeleteActionableMethod(),
      implementation = ::deleteActionable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getReorderActionablesMethod(),
      implementation = ::reorderActionables
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewActionableByIDMethod(),
      implementation = ::viewActionableByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewActionablesMethod(),
      implementation = ::viewActionables
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewActionableHistoryMethod(),
      implementation = ::viewActionableHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewPaginatedActionablesMethod(),
      implementation = ::viewPaginatedActionables
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getSearchActionablesWithPaginationMethod(),
      implementation = ::searchActionablesWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getAddEmployeeMethod(),
      implementation = ::addEmployee
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getDeleteEmployeeMethod(),
      implementation = ::deleteEmployee
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewEmployeeByIDMethod(),
      implementation = ::viewEmployeeByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewEmployeesMethod(),
      implementation = ::viewEmployees
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getSetEmployeeRSVPMethod(),
      implementation = ::setEmployeeRSVP
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getImportFromTeamMethod(),
      implementation = ::importFromTeam
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getImportFromDepartmentMethod(),
      implementation = ::importFromDepartment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getAddAssociateMethod(),
      implementation = ::addAssociate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getDeleteAssociateMethod(),
      implementation = ::deleteAssociate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewAssociateByIDMethod(),
      implementation = ::viewAssociateByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewAssociatesMethod(),
      implementation = ::viewAssociates
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getSetAssociateRSVPMethod(),
      implementation = ::setAssociateRSVP
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MeetingsServiceGrpc.getCountMethod(),
      implementation = ::count
    )).build()
  }
}
