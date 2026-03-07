package com.scailo.sdk

import com.scailo.sdk.ActivitiesServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.ActivitiesService.
 */
public object ActivitiesServiceGrpcKt {
  public const val SERVICE_NAME: String = ActivitiesServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<ActivitiesServiceCreateRequest, IdentifierUUID>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getCreateMethod()

  public val updateMethod: MethodDescriptor<ActivitiesServiceUpdateRequest, IdentifierUUID>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getUpdateMethod()

  public val cancelMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getCancelMethod()

  public val completeMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getCompleteMethod()

  public val reopenMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getReopenMethod()

  public val repeatMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getRepeatMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierUUID>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getCommentAddMethod()

  public val sendEmailMethod: MethodDescriptor<IdentifierWithEmailAttributes, IdentifierUUID>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getSendEmailMethod()

  public val addActionMethod:
      MethodDescriptor<ActivitiesServiceActionCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getAddActionMethod()

  public val addActionWithTimerMethod:
      MethodDescriptor<ActivitiesServiceActionWithTimerCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getAddActionWithTimerMethod()

  public val modifyActionMethod:
      MethodDescriptor<ActivitiesServiceActionUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getModifyActionMethod()

  public val deleteActionMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getDeleteActionMethod()

  public val reorderActionsMethod: MethodDescriptor<ReorderItemsRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getReorderActionsMethod()

  public val viewActionByIDMethod: MethodDescriptor<Identifier, ActivityAction>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewActionByIDMethod()

  public val viewActionStatisticsMethod: MethodDescriptor<Identifier, ActivityActionStatistics>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewActionStatisticsMethod()

  public val viewActionsMethod: MethodDescriptor<IdentifierUUID, ActivityActionsList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewActionsMethod()

  public val viewActionHistoryMethod:
      MethodDescriptor<ActivityActionHistoryRequest, ActivityActionsList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewActionHistoryMethod()

  public val viewPaginatedActionsMethod:
      MethodDescriptor<ActivityActionsSearchRequest, ActivitiesServicePaginatedActionsResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewPaginatedActionsMethod()

  public val searchActionsWithPaginationMethod:
      MethodDescriptor<ActivityActionsSearchRequest, ActivitiesServicePaginatedActionsResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getSearchActionsWithPaginationMethod()

  public val downloadActionsAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getDownloadActionsAsCSVMethod()

  public val uploadActivityActionsMethod: MethodDescriptor<IdentifierUUIDWithFile, IdentifiersList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getUploadActivityActionsMethod()

  public val addActivityTagAssociationMethod:
      MethodDescriptor<ActivitiesServiceActivityTagAssociationCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getAddActivityTagAssociationMethod()

  public val deleteActivityTagAssociationMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getDeleteActivityTagAssociationMethod()

  public val viewActivityTagAssociationByIDMethod:
      MethodDescriptor<Identifier, ActivityTagAssociation>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewActivityTagAssociationByIDMethod()

  public val viewActivityTagAssociationsMethod:
      MethodDescriptor<IdentifierUUID, ActivityTagAssociationsList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewActivityTagAssociationsMethod()

  public val addOwnerMethod:
      MethodDescriptor<ActivitiesServiceOwnerCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getAddOwnerMethod()

  public val deleteOwnerMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getDeleteOwnerMethod()

  public val viewOwnerByIDMethod: MethodDescriptor<Identifier, ActivityOwner>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewOwnerByIDMethod()

  public val viewOwnersMethod: MethodDescriptor<IdentifierUUID, ActivityOwnersList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewOwnersMethod()

  public val importOwnersFromTeamMethod:
      MethodDescriptor<ActivitiesServiceImportOwnersRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getImportOwnersFromTeamMethod()

  public val importOwnersFromDepartmentMethod:
      MethodDescriptor<ActivitiesServiceImportOwnersRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getImportOwnersFromDepartmentMethod()

  public val addSupervisorMethod:
      MethodDescriptor<ActivitiesServiceSupervisorCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getAddSupervisorMethod()

  public val deleteSupervisorMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getDeleteSupervisorMethod()

  public val viewSupervisorByIDMethod: MethodDescriptor<Identifier, ActivitySupervisor>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewSupervisorByIDMethod()

  public val viewSupervisorsMethod: MethodDescriptor<IdentifierUUID, ActivitySupervisorsList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewSupervisorsMethod()

  public val addTimerMethod:
      MethodDescriptor<ActivitiesServiceTimerCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getAddTimerMethod()

  public val endTimerMethod: MethodDescriptor<ActivitiesServiceTimerEndRequest, IdentifierResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getEndTimerMethod()

  public val viewTimerByIDMethod: MethodDescriptor<Identifier, ActivityTimer>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewTimerByIDMethod()

  public val viewTimersMethod: MethodDescriptor<IdentifierUUID, ActivityTimersList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewTimersMethod()

  public val viewPaginatedTimersMethod:
      MethodDescriptor<ActivityTimersSearchRequest, ActivitiesServicePaginatedTimersResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewPaginatedTimersMethod()

  public val searchTimersWithPaginationMethod:
      MethodDescriptor<ActivityTimersSearchRequest, ActivitiesServicePaginatedTimersResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getSearchTimersWithPaginationMethod()

  public val downloadTimersAsCSVMethod: MethodDescriptor<IdentifierUUID, StandardFile>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getDownloadTimersAsCSVMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, Activity>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, Activity>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, Activity>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, Activity>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, ActivitiesList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, ActivitiesList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, ActivitiesList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<ActivitiesServicePaginationReq, ActivitiesServicePaginationResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewWithPaginationMethod()

  public val viewStatisticsMethod: MethodDescriptor<IdentifierUUID, ActivityStatistics>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getViewStatisticsMethod()

  public val searchAllMethod: MethodDescriptor<ActivitiesServiceSearchAllReq, ActivitiesList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<ActivitiesServiceFilterReq, ActivitiesList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getFilterMethod()

  public val countMethod: MethodDescriptor<ActivitiesServiceCountReq, CountResponse>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<ActivitiesServiceFilterReq, StandardFile>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getDownloadAsCSVMethod()

  public val importFromCSVMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = ActivitiesServiceGrpc.getImportFromCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.ActivitiesService service as suspending coroutines.
   */
  @StubFor(ActivitiesServiceGrpc::class)
  public class ActivitiesServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ActivitiesServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ActivitiesServiceCoroutineStub =
        ActivitiesServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: ActivitiesServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun update(request: ActivitiesServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ActivitiesServiceGrpc.getCancelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ActivitiesServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ActivitiesServiceGrpc.getReopenMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ActivitiesServiceGrpc.getRepeatMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ActivitiesServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): IdentifierUUID = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getSendEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addAction(request: ActivitiesServiceActionCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getAddActionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addActionWithTimer(request: ActivitiesServiceActionWithTimerCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getAddActionWithTimerMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun modifyAction(request: ActivitiesServiceActionUpdateRequest, headers: Metadata
        = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getModifyActionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteAction(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getDeleteActionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reorderActions(request: ReorderItemsRequest, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getReorderActionsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewActionByID(request: Identifier, headers: Metadata = Metadata()):
        ActivityAction = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewActionByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewActionStatistics(request: Identifier, headers: Metadata = Metadata()):
        ActivityActionStatistics = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewActionStatisticsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewActions(request: IdentifierUUID, headers: Metadata = Metadata()):
        ActivityActionsList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewActionsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewActionHistory(request: ActivityActionHistoryRequest, headers: Metadata =
        Metadata()): ActivityActionsList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewActionHistoryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewPaginatedActions(request: ActivityActionsSearchRequest, headers: Metadata
        = Metadata()): ActivitiesServicePaginatedActionsResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewPaginatedActionsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchActionsWithPagination(request: ActivityActionsSearchRequest,
        headers: Metadata = Metadata()): ActivitiesServicePaginatedActionsResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getSearchActionsWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadActionsAsCSV(request: IdentifierUUID, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getDownloadActionsAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadActivityActions(request: IdentifierUUIDWithFile, headers: Metadata =
        Metadata()): IdentifiersList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getUploadActivityActionsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun addActivityTagAssociation(request: ActivitiesServiceActivityTagAssociationCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getAddActivityTagAssociationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteActivityTagAssociation(request: IdentifierWithUserComment,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getDeleteActivityTagAssociationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewActivityTagAssociationByID(request: Identifier, headers: Metadata =
        Metadata()): ActivityTagAssociation = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewActivityTagAssociationByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewActivityTagAssociations(request: IdentifierUUID, headers: Metadata =
        Metadata()): ActivityTagAssociationsList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewActivityTagAssociationsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addOwner(request: ActivitiesServiceOwnerCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getAddOwnerMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteOwner(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getDeleteOwnerMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOwnerByID(request: Identifier, headers: Metadata = Metadata()):
        ActivityOwner = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewOwnerByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOwners(request: IdentifierUUID, headers: Metadata = Metadata()):
        ActivityOwnersList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewOwnersMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun importOwnersFromTeam(request: ActivitiesServiceImportOwnersRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getImportOwnersFromTeamMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun importOwnersFromDepartment(request: ActivitiesServiceImportOwnersRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getImportOwnersFromDepartmentMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addSupervisor(request: ActivitiesServiceSupervisorCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getAddSupervisorMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteSupervisor(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getDeleteSupervisorMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewSupervisorByID(request: Identifier, headers: Metadata = Metadata()):
        ActivitySupervisor = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewSupervisorByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewSupervisors(request: IdentifierUUID, headers: Metadata = Metadata()):
        ActivitySupervisorsList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewSupervisorsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addTimer(request: ActivitiesServiceTimerCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getAddTimerMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun endTimer(request: ActivitiesServiceTimerEndRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getEndTimerMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewTimerByID(request: Identifier, headers: Metadata = Metadata()):
        ActivityTimer = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewTimerByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewTimers(request: IdentifierUUID, headers: Metadata = Metadata()):
        ActivityTimersList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewTimersMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewPaginatedTimers(request: ActivityTimersSearchRequest, headers: Metadata =
        Metadata()): ActivitiesServicePaginatedTimersResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewPaginatedTimersMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchTimersWithPagination(request: ActivityTimersSearchRequest,
        headers: Metadata = Metadata()): ActivitiesServicePaginatedTimersResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getSearchTimersWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadTimersAsCSV(request: IdentifierUUID, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getDownloadTimersAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): Activity =
        unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByUUID(request: IdentifierUUID, headers: Metadata = Metadata()): Activity
        = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Activity = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Activity = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ActivitiesList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        ActivitiesList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): ActivitiesList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: ActivitiesServicePaginationReq, headers: Metadata
        = Metadata()): ActivitiesServicePaginationResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewStatistics(request: IdentifierUUID, headers: Metadata = Metadata()):
        ActivityStatistics = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getViewStatisticsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: ActivitiesServiceSearchAllReq, headers: Metadata =
        Metadata()): ActivitiesList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: ActivitiesServiceFilterReq, headers: Metadata = Metadata()):
        ActivitiesList = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: ActivitiesServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: ActivitiesServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      ActivitiesServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      ActivitiesServiceGrpc.getImportFromCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.ActivitiesService service based on Kotlin coroutines.
   */
  public abstract class ActivitiesServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: ActivitiesServiceCreateRequest): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.Update.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun update(request: ActivitiesServiceUpdateRequest): IdentifierUUID = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.Update is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.Cancel.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.Cancel is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.Complete.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.Complete is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.Reopen.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.Reopen is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.Repeat.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.Repeat is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.SendEmail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendEmail(request: IdentifierWithEmailAttributes): IdentifierUUID =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.SendEmail is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.AddAction.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addAction(request: ActivitiesServiceActionCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.AddAction is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.AddActionWithTimer.
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
        fun addActionWithTimer(request: ActivitiesServiceActionWithTimerCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.AddActionWithTimer is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ModifyAction.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun modifyAction(request: ActivitiesServiceActionUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ModifyAction is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.DeleteAction.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteAction(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.DeleteAction is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ReorderActions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reorderActions(request: ReorderItemsRequest): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ReorderActions is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewActionByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewActionByID(request: Identifier): ActivityAction = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewActionByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewActionStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewActionStatistics(request: Identifier): ActivityActionStatistics =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewActionStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewActions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewActions(request: IdentifierUUID): ActivityActionsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewActions is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewActionHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewActionHistory(request: ActivityActionHistoryRequest):
        ActivityActionsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewActionHistory is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewPaginatedActions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewPaginatedActions(request: ActivityActionsSearchRequest):
        ActivitiesServicePaginatedActionsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewPaginatedActions is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.SearchActionsWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchActionsWithPagination(request: ActivityActionsSearchRequest):
        ActivitiesServicePaginatedActionsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.SearchActionsWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.DownloadActionsAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadActionsAsCSV(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.DownloadActionsAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.UploadActivityActions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadActivityActions(request: IdentifierUUIDWithFile): IdentifiersList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.UploadActivityActions is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.AddActivityTagAssociation.
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
        fun addActivityTagAssociation(request: ActivitiesServiceActivityTagAssociationCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.AddActivityTagAssociation is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.DeleteActivityTagAssociation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteActivityTagAssociation(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.DeleteActivityTagAssociation is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewActivityTagAssociationByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewActivityTagAssociationByID(request: Identifier):
        ActivityTagAssociation = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewActivityTagAssociationByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewActivityTagAssociations.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewActivityTagAssociations(request: IdentifierUUID):
        ActivityTagAssociationsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewActivityTagAssociations is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.AddOwner.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addOwner(request: ActivitiesServiceOwnerCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.AddOwner is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.DeleteOwner.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteOwner(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.DeleteOwner is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewOwnerByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOwnerByID(request: Identifier): ActivityOwner = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewOwnerByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewOwners.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOwners(request: IdentifierUUID): ActivityOwnersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewOwners is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ImportOwnersFromTeam.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun importOwnersFromTeam(request: ActivitiesServiceImportOwnersRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ImportOwnersFromTeam is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ImportOwnersFromDepartment.
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
        fun importOwnersFromDepartment(request: ActivitiesServiceImportOwnersRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ImportOwnersFromDepartment is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.AddSupervisor.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addSupervisor(request: ActivitiesServiceSupervisorCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.AddSupervisor is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.DeleteSupervisor.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteSupervisor(request: IdentifierWithUserComment): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.DeleteSupervisor is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewSupervisorByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSupervisorByID(request: Identifier): ActivitySupervisor = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewSupervisorByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewSupervisors.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSupervisors(request: IdentifierUUID): ActivitySupervisorsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewSupervisors is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.AddTimer.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addTimer(request: ActivitiesServiceTimerCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.AddTimer is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.EndTimer.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun endTimer(request: ActivitiesServiceTimerEndRequest): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.EndTimer is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewTimerByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewTimerByID(request: Identifier): ActivityTimer = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewTimerByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewTimers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewTimers(request: IdentifierUUID): ActivityTimersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewTimers is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewPaginatedTimers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewPaginatedTimers(request: ActivityTimersSearchRequest):
        ActivitiesServicePaginatedTimersResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewPaginatedTimers is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.SearchTimersWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchTimersWithPagination(request: ActivityTimersSearchRequest):
        ActivitiesServicePaginatedTimersResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.SearchTimersWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.DownloadTimersAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadTimersAsCSV(request: IdentifierUUID): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.DownloadTimersAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): Activity = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): Activity = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): Activity = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): Activity = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): ActivitiesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): ActivitiesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): ActivitiesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: ActivitiesServicePaginationReq):
        ActivitiesServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ViewStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewStatistics(request: IdentifierUUID): ActivityStatistics = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ViewStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: ActivitiesServiceSearchAllReq): ActivitiesList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: ActivitiesServiceFilterReq): ActivitiesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: ActivitiesServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: ActivitiesServiceFilterReq): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.DownloadAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.ActivitiesService.ImportFromCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.ActivitiesService.ImportFromCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getUpdateMethod(),
      implementation = ::update
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getCancelMethod(),
      implementation = ::cancel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getReopenMethod(),
      implementation = ::reopen
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getRepeatMethod(),
      implementation = ::repeat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getSendEmailMethod(),
      implementation = ::sendEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getAddActionMethod(),
      implementation = ::addAction
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getAddActionWithTimerMethod(),
      implementation = ::addActionWithTimer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getModifyActionMethod(),
      implementation = ::modifyAction
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getDeleteActionMethod(),
      implementation = ::deleteAction
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getReorderActionsMethod(),
      implementation = ::reorderActions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewActionByIDMethod(),
      implementation = ::viewActionByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewActionStatisticsMethod(),
      implementation = ::viewActionStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewActionsMethod(),
      implementation = ::viewActions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewActionHistoryMethod(),
      implementation = ::viewActionHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewPaginatedActionsMethod(),
      implementation = ::viewPaginatedActions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getSearchActionsWithPaginationMethod(),
      implementation = ::searchActionsWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getDownloadActionsAsCSVMethod(),
      implementation = ::downloadActionsAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getUploadActivityActionsMethod(),
      implementation = ::uploadActivityActions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getAddActivityTagAssociationMethod(),
      implementation = ::addActivityTagAssociation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getDeleteActivityTagAssociationMethod(),
      implementation = ::deleteActivityTagAssociation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewActivityTagAssociationByIDMethod(),
      implementation = ::viewActivityTagAssociationByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewActivityTagAssociationsMethod(),
      implementation = ::viewActivityTagAssociations
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getAddOwnerMethod(),
      implementation = ::addOwner
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getDeleteOwnerMethod(),
      implementation = ::deleteOwner
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewOwnerByIDMethod(),
      implementation = ::viewOwnerByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewOwnersMethod(),
      implementation = ::viewOwners
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getImportOwnersFromTeamMethod(),
      implementation = ::importOwnersFromTeam
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getImportOwnersFromDepartmentMethod(),
      implementation = ::importOwnersFromDepartment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getAddSupervisorMethod(),
      implementation = ::addSupervisor
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getDeleteSupervisorMethod(),
      implementation = ::deleteSupervisor
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewSupervisorByIDMethod(),
      implementation = ::viewSupervisorByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewSupervisorsMethod(),
      implementation = ::viewSupervisors
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getAddTimerMethod(),
      implementation = ::addTimer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getEndTimerMethod(),
      implementation = ::endTimer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewTimerByIDMethod(),
      implementation = ::viewTimerByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewTimersMethod(),
      implementation = ::viewTimers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewPaginatedTimersMethod(),
      implementation = ::viewPaginatedTimers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getSearchTimersWithPaginationMethod(),
      implementation = ::searchTimersWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getDownloadTimersAsCSVMethod(),
      implementation = ::downloadTimersAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getViewStatisticsMethod(),
      implementation = ::viewStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActivitiesServiceGrpc.getImportFromCSVMethod(),
      implementation = ::importFromCSV
    )).build()
  }
}
