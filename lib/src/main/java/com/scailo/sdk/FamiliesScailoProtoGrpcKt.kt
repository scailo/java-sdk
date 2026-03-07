package com.scailo.sdk

import com.scailo.sdk.FamiliesServiceGrpc.getServiceDescriptor
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
import kotlin.Deprecated
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.FamiliesService.
 */
public object FamiliesServiceGrpcKt {
  public const val SERVICE_NAME: String = FamiliesServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<FamiliesServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getCreateMethod()

  public val draftMethod: MethodDescriptor<FamiliesServiceCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getDraftMethod()

  public val draftUpdateMethod: MethodDescriptor<FamiliesServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getDraftUpdateMethod()

  public val sendForVerificationMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSendForVerificationMethod()

  public val verifyMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getVerifyMethod()

  public val approveMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getApproveMethod()

  public val sendForRevisionMethod:
      MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSendForRevisionMethod()

  public val revisionUpdateMethod:
      MethodDescriptor<FamiliesServiceUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getRevisionUpdateMethod()

  public val haltMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getHaltMethod()

  public val discardMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getDiscardMethod()

  public val restoreMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getRestoreMethod()

  public val commentAddMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getCommentAddMethod()

  public val amendMethod: MethodDescriptor<IdentifierUUIDWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getAmendMethod()

  public val updatePriceMethod:
      MethodDescriptor<FamiliesServiceUpdatePriceRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getUpdatePriceMethod()

  public val uploadPricesMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getUploadPricesMethod()

  public val updateMinStockToMaintainMethod:
      MethodDescriptor<FamiliesServiceUpdateMinStockToMaintainRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getUpdateMinStockToMaintainMethod()

  public val uploadMinStockToMaintainMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getUploadMinStockToMaintainMethod()

  public val downloadAsCSVMethod: MethodDescriptor<FamiliesServiceFilterReq, StandardFile>
    @JvmStatic
    get() = FamiliesServiceGrpc.getDownloadAsCSVMethod()

  public val importFromCSVMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getImportFromCSVMethod()

  public val addStorageMethod:
      MethodDescriptor<FamiliesServiceStorageCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getAddStorageMethod()

  public val approveStorageMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getApproveStorageMethod()

  public val deleteStorageMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getDeleteStorageMethod()

  public val viewStorageByIDMethod: MethodDescriptor<Identifier, FamilyStorage>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewStorageByIDMethod()

  public val viewStoragesMethod: MethodDescriptor<Identifier, FamilyStoragesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewStoragesMethod()

  public val addLabelMethod: MethodDescriptor<FamiliesServiceLabelCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getAddLabelMethod()

  public val approveLabelMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getApproveLabelMethod()

  public val deleteLabelMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getDeleteLabelMethod()

  public val viewLabelByIDMethod: MethodDescriptor<Identifier, FamilyLabel>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewLabelByIDMethod()

  public val viewLabelsMethod: MethodDescriptor<Identifier, FamilyLabelsList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewLabelsMethod()

  public val viewLabelsForFamilyIDsMethod: MethodDescriptor<IdentifiersList, FamilyLabelsList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewLabelsForFamilyIDsMethod()

  public val addUnitConversionMethod:
      MethodDescriptor<FamiliesServiceUnitConversionCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getAddUnitConversionMethod()

  public val approveUnitConversionMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getApproveUnitConversionMethod()

  public val deleteUnitConversionMethod:
      MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getDeleteUnitConversionMethod()

  public val viewUnitConversionByIDMethod: MethodDescriptor<Identifier, FamilyUnitConversion>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewUnitConversionByIDMethod()

  public val viewUnitConversionsMethod: MethodDescriptor<Identifier, FamilyUnitConversionsList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewUnitConversionsMethod()

  public val viewUnitConversionForMethod:
      MethodDescriptor<FamiliesServiceUnitConversionPresenceRequest, FamilyUnitConversion>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewUnitConversionForMethod()

  public val addQCGroupMethod:
      MethodDescriptor<FamiliesServiceQCGroupCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getAddQCGroupMethod()

  public val approveQCGroupMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getApproveQCGroupMethod()

  public val deleteQCGroupMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getDeleteQCGroupMethod()

  public val viewQCGroupByIDMethod: MethodDescriptor<Identifier, FamilyQCGroup>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewQCGroupByIDMethod()

  public val viewQCGroupsMethod: MethodDescriptor<Identifier, FamilyQCGroupsList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewQCGroupsMethod()

  public val addImageMethod: MethodDescriptor<FamiliesServiceImageCreateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getAddImageMethod()

  public val updateImageMethod:
      MethodDescriptor<FamiliesServiceImageUpdateRequest, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getUpdateImageMethod()

  public val approveImageMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getApproveImageMethod()

  public val deleteImageMethod: MethodDescriptor<IdentifierWithUserComment, IdentifierResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getDeleteImageMethod()

  public val viewImageByIDMethod: MethodDescriptor<Identifier, FamilyImage>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewImageByIDMethod()

  public val viewImagesMethod: MethodDescriptor<Identifier, FamilyImagesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewImagesMethod()

  public val viewPublicImagesMethod: MethodDescriptor<Identifier, FamilyImagesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewPublicImagesMethod()

  public val viewByIDMethod: MethodDescriptor<Identifier, Family>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewByIDMethod()

  public val viewByUUIDMethod: MethodDescriptor<IdentifierUUID, Family>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewByUUIDMethod()

  public val viewEssentialByIDMethod: MethodDescriptor<Identifier, Family>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewEssentialByIDMethod()

  public val viewEssentialByCodeMethod: MethodDescriptor<SimpleSearchReq, Family>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewEssentialByCodeMethod()

  public val viewEssentialByUUIDMethod: MethodDescriptor<IdentifierUUID, Family>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewEssentialByUUIDMethod()

  public val viewFromIDsMethod: MethodDescriptor<IdentifiersList, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewFromIDsMethod()

  public val viewAllMethod: MethodDescriptor<ActiveStatus, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewAllMethod()

  public val viewAllForEntityUUIDMethod: MethodDescriptor<IdentifierUUID, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewAllForEntityUUIDMethod()

  public val viewWithPaginationMethod:
      MethodDescriptor<FamiliesServicePaginationReq, FamiliesServicePaginationResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewWithPaginationMethod()

  public val viewAllRequirableMethod: MethodDescriptor<FamilyTypesList, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewAllRequirableMethod()

  public val viewAmendmentsMethod: MethodDescriptor<Identifier, AmendmentLogsList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getViewAmendmentsMethod()

  public val searchAllMethod: MethodDescriptor<FamiliesServiceSearchAllReq, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSearchAllMethod()

  public val filterMethod: MethodDescriptor<FamiliesServiceFilterReq, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getFilterMethod()

  public val searchForPurchaseMethod: MethodDescriptor<SimpleSearchReq, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSearchForPurchaseMethod()

  public val searchForSaleMethod: MethodDescriptor<SimpleSearchReq, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSearchForSaleMethod()

  public val searchForProductionMethod: MethodDescriptor<SimpleSearchReq, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSearchForProductionMethod()

  public val searchForReplaceablesMethod: MethodDescriptor<SimpleSearchReq, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSearchForReplaceablesMethod()

  public val searchForEquationFamilyMethod: MethodDescriptor<SimpleSearchReq, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSearchForEquationFamilyMethod()

  public val searchForEquationReplaceableMethod: MethodDescriptor<SimpleSearchReq, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSearchForEquationReplaceableMethod()

  public val searchForEquationSalesBundleMethod: MethodDescriptor<SimpleSearchReq, FamiliesList>
    @JvmStatic
    get() = FamiliesServiceGrpc.getSearchForEquationSalesBundleMethod()

  public val countInStatusMethod: MethodDescriptor<CountInSLCStatusRequest, CountResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getCountInStatusMethod()

  public val countMethod: MethodDescriptor<FamiliesServiceCountReq, CountResponse>
    @JvmStatic
    get() = FamiliesServiceGrpc.getCountMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.FamiliesService service as suspending coroutines.
   */
  @StubFor(FamiliesServiceGrpc::class)
  public class FamiliesServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<FamiliesServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): FamiliesServiceCoroutineStub =
        FamiliesServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun create(request: FamiliesServiceCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draft(request: FamiliesServiceCreateRequest, headers: Metadata = Metadata()):
        IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getDraftMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun draftUpdate(request: FamiliesServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getDraftUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getSendForVerificationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getVerifyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getApproveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getSendForRevisionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun revisionUpdate(request: FamiliesServiceUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getRevisionUpdateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getHaltMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getDiscardMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getRestoreMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getCommentAddMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun amend(request: IdentifierUUIDWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getAmendMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updatePrice(request: FamiliesServiceUpdatePriceRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getUpdatePriceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadPrices(request: StandardFile, headers: Metadata = Metadata()):
        IdentifierUUIDsList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getUploadPricesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        fun updateMinStockToMaintain(request: FamiliesServiceUpdateMinStockToMaintainRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getUpdateMinStockToMaintainMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun uploadMinStockToMaintain(request: StandardFile, headers: Metadata =
        Metadata()): IdentifierUUIDsList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getUploadMinStockToMaintainMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadAsCSV(request: FamiliesServiceFilterReq, headers: Metadata =
        Metadata()): StandardFile = unaryRpc(
      channel,
      FamiliesServiceGrpc.getDownloadAsCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getImportFromCSVMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addStorage(request: FamiliesServiceStorageCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getAddStorageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveStorage(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getApproveStorageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteStorage(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getDeleteStorageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewStorageByID(request: Identifier, headers: Metadata = Metadata()):
        FamilyStorage = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewStorageByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewStorages(request: Identifier, headers: Metadata = Metadata()):
        FamilyStoragesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewStoragesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addLabel(request: FamiliesServiceLabelCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getAddLabelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveLabel(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getApproveLabelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteLabel(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getDeleteLabelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewLabelByID(request: Identifier, headers: Metadata = Metadata()):
        FamilyLabel = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewLabelByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewLabels(request: Identifier, headers: Metadata = Metadata()):
        FamilyLabelsList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewLabelsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewLabelsForFamilyIDs(request: IdentifiersList, headers: Metadata =
        Metadata()): FamilyLabelsList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewLabelsForFamilyIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addUnitConversion(request: FamiliesServiceUnitConversionCreateRequest,
        headers: Metadata = Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getAddUnitConversionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveUnitConversion(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getApproveUnitConversionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteUnitConversion(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getDeleteUnitConversionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnitConversionByID(request: Identifier, headers: Metadata = Metadata()):
        FamilyUnitConversion = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewUnitConversionByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnitConversions(request: Identifier, headers: Metadata = Metadata()):
        FamilyUnitConversionsList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewUnitConversionsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewUnitConversionFor(request: FamiliesServiceUnitConversionPresenceRequest,
        headers: Metadata = Metadata()): FamilyUnitConversion = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewUnitConversionForMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addQCGroup(request: FamiliesServiceQCGroupCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getAddQCGroupMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveQCGroup(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getApproveQCGroupMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteQCGroup(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getDeleteQCGroupMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewQCGroupByID(request: Identifier, headers: Metadata = Metadata()):
        FamilyQCGroup = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewQCGroupByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewQCGroups(request: Identifier, headers: Metadata = Metadata()):
        FamilyQCGroupsList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewQCGroupsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addImage(request: FamiliesServiceImageCreateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getAddImageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateImage(request: FamiliesServiceImageUpdateRequest, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getUpdateImageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun approveImage(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getApproveImageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteImage(request: IdentifierWithUserComment, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getDeleteImageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewImageByID(request: Identifier, headers: Metadata = Metadata()):
        FamilyImage = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewImageByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewImages(request: Identifier, headers: Metadata = Metadata()):
        FamilyImagesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewImagesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewPublicImages(request: Identifier, headers: Metadata = Metadata()):
        FamilyImagesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewPublicImagesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByID(request: Identifier, headers: Metadata = Metadata()): Family =
        unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByUUID(request: IdentifierUUID, headers: Metadata = Metadata()): Family =
        unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Family = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewEssentialByIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewEssentialByCode(request: SimpleSearchReq, headers: Metadata =
        Metadata()): Family = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewEssentialByCodeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Family = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewEssentialByUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewFromIDsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAll(request: ActiveStatus, headers: Metadata = Metadata()): FamiliesList
        = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
        Metadata()): FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewAllForEntityUUIDMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWithPagination(request: FamiliesServicePaginationReq, headers: Metadata =
        Metadata()): FamiliesServicePaginationResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewWithPaginationMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAllRequirable(request: FamilyTypesList, headers: Metadata = Metadata()):
        FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewAllRequirableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAmendments(request: Identifier, headers: Metadata = Metadata()):
        AmendmentLogsList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getViewAmendmentsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchAll(request: FamiliesServiceSearchAllReq, headers: Metadata =
        Metadata()): FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getSearchAllMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: FamiliesServiceFilterReq, headers: Metadata = Metadata()):
        FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public suspend fun searchForPurchase(request: SimpleSearchReq, headers: Metadata = Metadata()):
        FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getSearchForPurchaseMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public suspend fun searchForSale(request: SimpleSearchReq, headers: Metadata = Metadata()):
        FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getSearchForSaleMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public suspend fun searchForProduction(request: SimpleSearchReq, headers: Metadata =
        Metadata()): FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getSearchForProductionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public suspend fun searchForReplaceables(request: SimpleSearchReq, headers: Metadata =
        Metadata()): FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getSearchForReplaceablesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public suspend fun searchForEquationFamily(request: SimpleSearchReq, headers: Metadata =
        Metadata()): FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getSearchForEquationFamilyMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public suspend fun searchForEquationReplaceable(request: SimpleSearchReq, headers: Metadata =
        Metadata()): FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getSearchForEquationReplaceableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public suspend fun searchForEquationSalesBundle(request: SimpleSearchReq, headers: Metadata =
        Metadata()): FamiliesList = unaryRpc(
      channel,
      FamiliesServiceGrpc.getSearchForEquationSalesBundleMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      FamiliesServiceGrpc.getCountInStatusMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: FamiliesServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      FamiliesServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.FamiliesService service based on Kotlin coroutines.
   */
  public abstract class FamiliesServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: FamiliesServiceCreateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Draft.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draft(request: FamiliesServiceCreateRequest): IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Draft is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.DraftUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun draftUpdate(request: FamiliesServiceUpdateRequest): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.DraftUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SendForVerification.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SendForVerification is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Verify.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Verify is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Approve.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Approve is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SendForRevision.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SendForRevision is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.RevisionUpdate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun revisionUpdate(request: FamiliesServiceUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.RevisionUpdate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Halt.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Halt is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Discard.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Discard is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Restore.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Restore is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.CommentAdd.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.CommentAdd is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Amend.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun amend(request: IdentifierUUIDWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Amend is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.UpdatePrice.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updatePrice(request: FamiliesServiceUpdatePriceRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.UpdatePrice is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.UploadPrices.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadPrices(request: StandardFile): IdentifierUUIDsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.UploadPrices is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.UpdateMinStockToMaintain.
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
        fun updateMinStockToMaintain(request: FamiliesServiceUpdateMinStockToMaintainRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.UpdateMinStockToMaintain is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.UploadMinStockToMaintain.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadMinStockToMaintain(request: StandardFile): IdentifierUUIDsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.UploadMinStockToMaintain is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.DownloadAsCSV.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadAsCSV(request: FamiliesServiceFilterReq): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.DownloadAsCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ImportFromCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ImportFromCSV is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.AddStorage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addStorage(request: FamiliesServiceStorageCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.AddStorage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ApproveStorage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveStorage(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ApproveStorage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.DeleteStorage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteStorage(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.DeleteStorage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewStorageByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewStorageByID(request: Identifier): FamilyStorage = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewStorageByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewStorages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewStorages(request: Identifier): FamilyStoragesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewStorages is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.AddLabel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addLabel(request: FamiliesServiceLabelCreateRequest): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.AddLabel is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ApproveLabel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveLabel(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ApproveLabel is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.DeleteLabel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteLabel(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.DeleteLabel is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewLabelByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewLabelByID(request: Identifier): FamilyLabel = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewLabelByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewLabels.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewLabels(request: Identifier): FamilyLabelsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewLabels is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewLabelsForFamilyIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewLabelsForFamilyIDs(request: IdentifiersList): FamilyLabelsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewLabelsForFamilyIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.AddUnitConversion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addUnitConversion(request: FamiliesServiceUnitConversionCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.AddUnitConversion is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ApproveUnitConversion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveUnitConversion(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ApproveUnitConversion is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.DeleteUnitConversion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteUnitConversion(request: IdentifierWithUserComment):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.DeleteUnitConversion is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewUnitConversionByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnitConversionByID(request: Identifier): FamilyUnitConversion =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewUnitConversionByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewUnitConversions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewUnitConversions(request: Identifier): FamilyUnitConversionsList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewUnitConversions is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewUnitConversionFor.
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
        fun viewUnitConversionFor(request: FamiliesServiceUnitConversionPresenceRequest):
        FamilyUnitConversion = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewUnitConversionFor is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.AddQCGroup.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addQCGroup(request: FamiliesServiceQCGroupCreateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.AddQCGroup is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ApproveQCGroup.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveQCGroup(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ApproveQCGroup is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.DeleteQCGroup.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteQCGroup(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.DeleteQCGroup is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewQCGroupByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewQCGroupByID(request: Identifier): FamilyQCGroup = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewQCGroupByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewQCGroups.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewQCGroups(request: Identifier): FamilyQCGroupsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewQCGroups is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.AddImage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addImage(request: FamiliesServiceImageCreateRequest): IdentifierResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.AddImage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.UpdateImage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateImage(request: FamiliesServiceImageUpdateRequest):
        IdentifierResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.UpdateImage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ApproveImage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun approveImage(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ApproveImage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.DeleteImage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteImage(request: IdentifierWithUserComment): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.DeleteImage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewImageByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewImageByID(request: Identifier): FamilyImage = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewImageByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewImages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewImages(request: Identifier): FamilyImagesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewImages is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewPublicImages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewPublicImages(request: Identifier): FamilyImagesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewPublicImages is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByID(request: Identifier): Family = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByUUID(request: IdentifierUUID): Family = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewEssentialByID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByID(request: Identifier): Family = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewEssentialByID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewEssentialByCode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByCode(request: SimpleSearchReq): Family = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewEssentialByCode is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewEssentialByUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewEssentialByUUID(request: IdentifierUUID): Family = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewEssentialByUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewFromIDs.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewFromIDs(request: IdentifiersList): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewFromIDs is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAll(request: ActiveStatus): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewAllForEntityUUID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllForEntityUUID(request: IdentifierUUID): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewAllForEntityUUID is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewWithPagination.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWithPagination(request: FamiliesServicePaginationReq):
        FamiliesServicePaginationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewWithPagination is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewAllRequirable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAllRequirable(request: FamilyTypesList): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewAllRequirable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.ViewAmendments.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAmendments(request: Identifier): AmendmentLogsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.ViewAmendments is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SearchAll.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchAll(request: FamiliesServiceSearchAllReq): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SearchAll is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: FamiliesServiceFilterReq): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SearchForPurchase.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public open suspend fun searchForPurchase(request: SimpleSearchReq): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SearchForPurchase is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SearchForSale.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public open suspend fun searchForSale(request: SimpleSearchReq): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SearchForSale is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SearchForProduction.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public open suspend fun searchForProduction(request: SimpleSearchReq): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SearchForProduction is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SearchForReplaceables.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public open suspend fun searchForReplaceables(request: SimpleSearchReq): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SearchForReplaceables is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SearchForEquationFamily.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public open suspend fun searchForEquationFamily(request: SimpleSearchReq): FamiliesList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SearchForEquationFamily is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SearchForEquationReplaceable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public open suspend fun searchForEquationReplaceable(request: SimpleSearchReq): FamiliesList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SearchForEquationReplaceable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.SearchForEquationSalesBundle.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public open suspend fun searchForEquationSalesBundle(request: SimpleSearchReq): FamiliesList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.SearchForEquationSalesBundle is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.CountInStatus.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.CountInStatus is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.FamiliesService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: FamiliesServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.FamiliesService.Count is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getDraftMethod(),
      implementation = ::draft
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getDraftUpdateMethod(),
      implementation = ::draftUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSendForVerificationMethod(),
      implementation = ::sendForVerification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getVerifyMethod(),
      implementation = ::verify
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getApproveMethod(),
      implementation = ::approve
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSendForRevisionMethod(),
      implementation = ::sendForRevision
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getRevisionUpdateMethod(),
      implementation = ::revisionUpdate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getHaltMethod(),
      implementation = ::halt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getDiscardMethod(),
      implementation = ::discard
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getRestoreMethod(),
      implementation = ::restore
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getCommentAddMethod(),
      implementation = ::commentAdd
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getAmendMethod(),
      implementation = ::amend
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getUpdatePriceMethod(),
      implementation = ::updatePrice
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getUploadPricesMethod(),
      implementation = ::uploadPrices
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getUpdateMinStockToMaintainMethod(),
      implementation = ::updateMinStockToMaintain
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getUploadMinStockToMaintainMethod(),
      implementation = ::uploadMinStockToMaintain
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getDownloadAsCSVMethod(),
      implementation = ::downloadAsCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getImportFromCSVMethod(),
      implementation = ::importFromCSV
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getAddStorageMethod(),
      implementation = ::addStorage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getApproveStorageMethod(),
      implementation = ::approveStorage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getDeleteStorageMethod(),
      implementation = ::deleteStorage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewStorageByIDMethod(),
      implementation = ::viewStorageByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewStoragesMethod(),
      implementation = ::viewStorages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getAddLabelMethod(),
      implementation = ::addLabel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getApproveLabelMethod(),
      implementation = ::approveLabel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getDeleteLabelMethod(),
      implementation = ::deleteLabel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewLabelByIDMethod(),
      implementation = ::viewLabelByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewLabelsMethod(),
      implementation = ::viewLabels
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewLabelsForFamilyIDsMethod(),
      implementation = ::viewLabelsForFamilyIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getAddUnitConversionMethod(),
      implementation = ::addUnitConversion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getApproveUnitConversionMethod(),
      implementation = ::approveUnitConversion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getDeleteUnitConversionMethod(),
      implementation = ::deleteUnitConversion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewUnitConversionByIDMethod(),
      implementation = ::viewUnitConversionByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewUnitConversionsMethod(),
      implementation = ::viewUnitConversions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewUnitConversionForMethod(),
      implementation = ::viewUnitConversionFor
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getAddQCGroupMethod(),
      implementation = ::addQCGroup
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getApproveQCGroupMethod(),
      implementation = ::approveQCGroup
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getDeleteQCGroupMethod(),
      implementation = ::deleteQCGroup
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewQCGroupByIDMethod(),
      implementation = ::viewQCGroupByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewQCGroupsMethod(),
      implementation = ::viewQCGroups
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getAddImageMethod(),
      implementation = ::addImage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getUpdateImageMethod(),
      implementation = ::updateImage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getApproveImageMethod(),
      implementation = ::approveImage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getDeleteImageMethod(),
      implementation = ::deleteImage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewImageByIDMethod(),
      implementation = ::viewImageByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewImagesMethod(),
      implementation = ::viewImages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewPublicImagesMethod(),
      implementation = ::viewPublicImages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewByIDMethod(),
      implementation = ::viewByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewByUUIDMethod(),
      implementation = ::viewByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewEssentialByIDMethod(),
      implementation = ::viewEssentialByID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewEssentialByCodeMethod(),
      implementation = ::viewEssentialByCode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewEssentialByUUIDMethod(),
      implementation = ::viewEssentialByUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewFromIDsMethod(),
      implementation = ::viewFromIDs
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewAllMethod(),
      implementation = ::viewAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewAllForEntityUUIDMethod(),
      implementation = ::viewAllForEntityUUID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewWithPaginationMethod(),
      implementation = ::viewWithPagination
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewAllRequirableMethod(),
      implementation = ::viewAllRequirable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getViewAmendmentsMethod(),
      implementation = ::viewAmendments
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSearchAllMethod(),
      implementation = ::searchAll
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSearchForPurchaseMethod(),
      implementation = ::searchForPurchase
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSearchForSaleMethod(),
      implementation = ::searchForSale
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSearchForProductionMethod(),
      implementation = ::searchForProduction
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSearchForReplaceablesMethod(),
      implementation = ::searchForReplaceables
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSearchForEquationFamilyMethod(),
      implementation = ::searchForEquationFamily
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSearchForEquationReplaceableMethod(),
      implementation = ::searchForEquationReplaceable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getSearchForEquationSalesBundleMethod(),
      implementation = ::searchForEquationSalesBundle
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getCountInStatusMethod(),
      implementation = ::countInStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FamiliesServiceGrpc.getCountMethod(),
      implementation = ::count
    )).build()
  }
}
