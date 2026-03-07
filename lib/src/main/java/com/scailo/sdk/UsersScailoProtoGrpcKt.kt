package com.scailo.sdk

import com.scailo.sdk.UsersServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.UsersService.
 */
public object UsersServiceGrpcKt {
  public const val SERVICE_NAME: String = UsersServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val registerMobileDeviceMethod:
      MethodDescriptor<UsersServiceRegisterMobileDeviceRequest, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getRegisterMobileDeviceMethod()

  public val createMethod: MethodDescriptor<UsersServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getCreateMethod()

  public val draftMethod: MethodDescriptor<UsersServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getDraftMethod()

  public val draftUpdateMethod: MethodDescriptor<UsersServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod: MethodDescriptor<UsersServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getRestoreMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getCommentAddMethod()

  public val createMagicLinkForSignatureMethod:
      MethodDescriptor<MagicLinksServiceCreateRequestForSpecificResource, MagicLink>
    @JvmStatic
    get() = UsersServiceGrpc.getCreateMagicLinkForSignatureMethod()

  public val updatePasswordMethod: MethodDescriptor<UpdatePasswordReq, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getUpdatePasswordMethod()

  public val updateOwnPasswordMethod: MethodDescriptor<UpdateOwnPasswordReq, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getUpdateOwnPasswordMethod()

  public val requestPasswordResetEmailMethod:
      MethodDescriptor<UsersServicePasswordResetReq, MagicLink>
    @JvmStatic
    get() = UsersServiceGrpc.getRequestPasswordResetEmailMethod()

  public val updateProfilePictureMethod: MethodDescriptor<UploadPictureReq, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getUpdateProfilePictureMethod()

  public val updateSignatureMethod: MethodDescriptor<UploadPictureReq, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getUpdateSignatureMethod()

  public val mFAEnableMethod: MethodDescriptor<IdentifierUUID, ImageResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getMFAEnableMethod()

  public val mFAResetMethod: MethodDescriptor<IdentifierUUID, IdentifierResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getMFAResetMethod()

  public val viewByIDMethod: MethodDescriptor<IdentifierZeroable, User>
    @JvmStatic
    get() = UsersServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, User>
    @JvmStatic
    get() = UsersServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, User>
    @JvmStatic
    get() = UsersServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, User>
    @JvmStatic
    get() = UsersServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewByUsernameMethod: MethodDescriptor<SimpleSearchReq, User>
    @JvmStatic
    get() = UsersServiceGrpc.getViewByUsernameMethod()

  public val viewByCodeMethod: MethodDescriptor<SimpleSearchReq, User>
    @JvmStatic
    get() = UsersServiceGrpc.getViewByCodeMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, UsersList>
    @JvmStatic
    get() = UsersServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, UsersList>
    @JvmStatic
    get() = UsersServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<UsersServicePaginationReq, UsersServicePaginationResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getViewWithPaginationMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, UsersList>
    @JvmStatic
    get() = UsersServiceGrpc.getViewFromIDsMethod()

  public val viewFromUUIDsMethod: MethodDescriptor<IdentifierUUIDsList, UsersList>
    @JvmStatic
    get() = UsersServiceGrpc.getViewFromUUIDsMethod()

  public val viewFromUsernamesMethod: MethodDescriptor<StringsList, UsersList>
    @JvmStatic
    get() = UsersServiceGrpc.getViewFromUsernamesMethod()

  public val viewSelfMethod: MethodDescriptor<Empty, User>
    @JvmStatic
    get() = UsersServiceGrpc.getViewSelfMethod()

  public val viewBirthdaysOnMethod: MethodDescriptor<MonthAndDayFilter, UsersList>
    @JvmStatic
    get() = UsersServiceGrpc.getViewBirthdaysOnMethod()

  public val viewSignatureMethod: MethodDescriptor<IdentifierUUID, Base64String>
    @JvmStatic
    get() = UsersServiceGrpc.getViewSignatureMethod()

  public val viewProfilePictureMethod: MethodDescriptor<IdentifierUUID, ImageResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getViewProfilePictureMethod()

  public val viewThumbnailPictureMethod: MethodDescriptor<IdentifierUUID, ImageResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getViewThumbnailPictureMethod()

  public val viewVCardMethod: MethodDescriptor<IdentifierUUID, ImageResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getViewVCardMethod()

  public val viewQRImageMethod: MethodDescriptor<IdentifierUUID, ImageResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getViewQRImageMethod()

  public val viewQRStringMethod: MethodDescriptor<IdentifierUUID, StringResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getViewQRStringMethod()

  public val identifyCroppedFaceMethod: MethodDescriptor<StandardFile, User>
    @JvmStatic
    get() = UsersServiceGrpc.getIdentifyCroppedFaceMethod()

  public val identifyFullFaceMethod: MethodDescriptor<StandardFile, User>
    @JvmStatic
    get() = UsersServiceGrpc.getIdentifyFullFaceMethod()

  public val searchAllMethod: MethodDescriptor<UsersServiceSearchAllReq, UsersList>
    @JvmStatic
    get() = UsersServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<UsersServiceFilterReq, UsersList>
    @JvmStatic
    get() = UsersServiceGrpc.getFilterMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<UsersServiceCountReq, CountResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getCountMethod()

  public val downloadAsCSVMethod: MethodDescriptor<UsersServiceFilterReq, StandardFile>
    @JvmStatic
    get() = UsersServiceGrpc.getDownloadAsCSVMethod()

  public val importFromCSVMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = UsersServiceGrpc.getImportFromCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.UsersService service as suspending coroutines.
   */
  @StubFor(UsersServiceGrpc::class)
  public class UsersServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<UsersServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): UsersServiceCoroutineStub =
        UsersServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun registerMobileDevice(request: UsersServiceRegisterMobileDeviceRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getRegisterMobileDeviceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: UsersServiceCreateRequest, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: UsersServiceCreateRequest, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: UsersServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: UsersServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun createMagicLinkForSignature(request: MagicLinksServiceCreateRequestForSpecificResource,
        headers: Metadata = Metadata()): MagicLink = unaryRpc(
      channel,
      UsersServiceGrpc.getCreateMagicLinkForSignatureMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updatePassword(request: UpdatePasswordReq, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getUpdatePasswordMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateOwnPassword(request: UpdateOwnPasswordReq, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getUpdateOwnPasswordMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun requestPasswordResetEmail(request: UsersServicePasswordResetReq,
        headers: Metadata = Metadata()): MagicLink = unaryRpc(
      channel,
      UsersServiceGrpc.getRequestPasswordResetEmailMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateProfilePicture(request: UploadPictureReq, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getUpdateProfilePictureMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateSignature(request: UploadPictureReq, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getUpdateSignatureMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun mFAEnable(request: IdentifierUUID, headers: Metadata = Metadata()):
        ImageResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getMFAEnableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun mFAReset(request: IdentifierUUID, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getMFAResetMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: IdentifierZeroable, headers: Metadata = Metadata()): User =
        unaryRpc(
      channel,
      UsersServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByUUID(request: IdentifierUUID, headers: Metadata = Metadata()): User =
        unaryRpc(
      channel,
      UsersServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewEssentialByID(request: Identifier, headers: Metadata = Metadata()): User
        = unaryRpc(
      channel,
      UsersServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        User = unaryRpc(
      channel,
      UsersServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByUsername(request: SimpleSearchReq, headers: Metadata = Metadata()):
        User = unaryRpc(
      channel,
      UsersServiceGrpc.getViewByUsernameMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByCode(request: SimpleSearchReq, headers: Metadata = Metadata()): User =
        unaryRpc(
      channel,
      UsersServiceGrpc.getViewByCodeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAll(request: ActiveStatus, headers: Metadata = Metadata()): UsersList =
        unaryRpc(
      channel,
      UsersServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): UsersList = unaryRpc(
      channel,
      UsersServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: UsersServicePaginationReq, headers: Metadata =
        Metadata()): UsersServicePaginationResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        UsersList = unaryRpc(
      channel,
      UsersServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFromUUIDs(request: IdentifierUUIDsList, headers: Metadata = Metadata()):
        UsersList = unaryRpc(
      channel,
      UsersServiceGrpc.getViewFromUUIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewFromUsernames(request: StringsList, headers: Metadata = Metadata()):
        UsersList = unaryRpc(
      channel,
      UsersServiceGrpc.getViewFromUsernamesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewSelf(request: Empty, headers: Metadata = Metadata()): User = unaryRpc(
      channel,
      UsersServiceGrpc.getViewSelfMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewBirthdaysOn(request: MonthAndDayFilter, headers: Metadata = Metadata()):
        UsersList = unaryRpc(
      channel,
      UsersServiceGrpc.getViewBirthdaysOnMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewSignature(request: IdentifierUUID, headers: Metadata = Metadata()):
        Base64String = unaryRpc(
      channel,
      UsersServiceGrpc.getViewSignatureMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewProfilePicture(request: IdentifierUUID, headers: Metadata = Metadata()):
        ImageResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getViewProfilePictureMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewThumbnailPicture(request: IdentifierUUID, headers: Metadata =
        Metadata()): ImageResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getViewThumbnailPictureMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewVCard(request: IdentifierUUID, headers: Metadata = Metadata()):
        ImageResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getViewVCardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewQRImage(request: IdentifierUUID, headers: Metadata = Metadata()):
        ImageResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getViewQRImageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewQRString(request: IdentifierUUID, headers: Metadata = Metadata()):
        StringResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getViewQRStringMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun identifyCroppedFace(request: StandardFile, headers: Metadata = Metadata()):
        User = unaryRpc(
      channel,
      UsersServiceGrpc.getIdentifyCroppedFaceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun identifyFullFace(request: StandardFile, headers: Metadata = Metadata()): User
        = unaryRpc(
      channel,
      UsersServiceGrpc.getIdentifyFullFaceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: UsersServiceSearchAllReq, headers: Metadata = Metadata()):
        UsersList = unaryRpc(
      channel,
      UsersServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: UsersServiceFilterReq, headers: Metadata = Metadata()):
        UsersList = unaryRpc(
      channel,
      UsersServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: UsersServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: UsersServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      UsersServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      UsersServiceGrpc.getImportFromCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.UsersService service based on Kotlin coroutines.
   */
  public abstract class UsersServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.UsersService.RegisterMobileDevice.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun registerMobileDevice(request: UsersServiceRegisterMobileDeviceRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.RegisterMobileDevice is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: UsersServiceCreateRequest): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: UsersServiceCreateRequest): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: UsersServiceUpdateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: UsersServiceUpdateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.CreateMagicLinkForSignature.
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
        fun createMagicLinkForSignature(request: MagicLinksServiceCreateRequestForSpecificResource):
        MagicLink = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.CreateMagicLinkForSignature is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.UpdatePassword.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updatePassword(request: UpdatePasswordReq): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.UpdatePassword is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.UpdateOwnPassword.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateOwnPassword(request: UpdateOwnPasswordReq): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.UpdateOwnPassword is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.RequestPasswordResetEmail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun requestPasswordResetEmail(request: UsersServicePasswordResetReq):
        MagicLink = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.RequestPasswordResetEmail is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.UpdateProfilePicture.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateProfilePicture(request: UploadPictureReq): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.UpdateProfilePicture is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.UpdateSignature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateSignature(request: UploadPictureReq): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.UpdateSignature is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.MFAEnable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mFAEnable(request: IdentifierUUID): ImageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.MFAEnable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.MFAReset.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun mFAReset(request: IdentifierUUID): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.MFAReset is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: IdentifierZeroable): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewByUsername.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUsername(request: SimpleSearchReq): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewByUsername is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewByCode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByCode(request: SimpleSearchReq): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewByCode is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): UsersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): UsersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: UsersServicePaginationReq):
        UsersServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): UsersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewFromUUIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromUUIDs(request: IdentifierUUIDsList): UsersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewFromUUIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewFromUsernames.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromUsernames(request: StringsList): UsersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewFromUsernames is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewSelf.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSelf(request: Empty): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewSelf is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewBirthdaysOn.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewBirthdaysOn(request: MonthAndDayFilter): UsersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewBirthdaysOn is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewSignature.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSignature(request: IdentifierUUID): Base64String = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewSignature is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewProfilePicture.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewProfilePicture(request: IdentifierUUID): ImageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewProfilePicture is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewThumbnailPicture.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewThumbnailPicture(request: IdentifierUUID): ImageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewThumbnailPicture is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewVCard.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewVCard(request: IdentifierUUID): ImageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewVCard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewQRImage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewQRImage(request: IdentifierUUID): ImageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewQRImage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ViewQRString.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewQRString(request: IdentifierUUID): StringResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ViewQRString is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.IdentifyCroppedFace.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun identifyCroppedFace(request: StandardFile): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.IdentifyCroppedFace is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.IdentifyFullFace.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun identifyFullFace(request: StandardFile): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.IdentifyFullFace is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: UsersServiceSearchAllReq): UsersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: UsersServiceFilterReq): UsersList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: UsersServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.Count is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: UsersServiceFilterReq): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.DownloadAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.UsersService.ImportFromCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.UsersService.ImportFromCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getRegisterMobileDeviceMethod(),
      implementation = ::registerMobileDevice
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getCreateMagicLinkForSignatureMethod(),
      implementation = ::createMagicLinkForSignature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getUpdatePasswordMethod(),
      implementation = ::updatePassword
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getUpdateOwnPasswordMethod(),
      implementation = ::updateOwnPassword
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getRequestPasswordResetEmailMethod(),
      implementation = ::requestPasswordResetEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getUpdateProfilePictureMethod(),
      implementation = ::updateProfilePicture
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getUpdateSignatureMethod(),
      implementation = ::updateSignature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getMFAEnableMethod(),
      implementation = ::mFAEnable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getMFAResetMethod(),
      implementation = ::mFAReset
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewByUsernameMethod(),
      implementation = ::viewByUsername
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewByCodeMethod(),
      implementation = ::viewByCode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewFromUUIDsMethod(),
      implementation = ::viewFromUUIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewFromUsernamesMethod(),
      implementation = ::viewFromUsernames
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewSelfMethod(),
      implementation = ::viewSelf
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewBirthdaysOnMethod(),
      implementation = ::viewBirthdaysOn
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewSignatureMethod(),
      implementation = ::viewSignature
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewProfilePictureMethod(),
      implementation = ::viewProfilePicture
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewThumbnailPictureMethod(),
      implementation = ::viewThumbnailPicture
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewVCardMethod(),
      implementation = ::viewVCard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewQRImageMethod(),
      implementation = ::viewQRImage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getViewQRStringMethod(),
      implementation = ::viewQRString
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getIdentifyCroppedFaceMethod(),
      implementation = ::identifyCroppedFace
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getIdentifyFullFaceMethod(),
      implementation = ::identifyFullFace
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getCountMethod(),
      implementation = ::count
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getImportFromCSVMethod(),
      implementation = ::importFromCSV
    )).build()
  }
}
