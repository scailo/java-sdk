package com.scailo.sdk

import com.scailo.sdk.InventoryServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.InventoryService.
 */
public object InventoryServiceGrpcKt {
  public const val SERVICE_NAME: String = InventoryServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val viewByHashMethod: MethodDescriptor<InventoryHashSearchReq, GenericInventory>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewByHashMethod()

  public val viewByShortURLMethod: MethodDescriptor<SimpleSearchReq, GenericInventory>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewByShortURLMethod()

  public val viewIssuableMethod: MethodDescriptor<IssuableInventorySearchReq, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewIssuableMethod()

  public val viewIssuedForGoodsDispatchMethod: MethodDescriptor<Identifier, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewIssuedForGoodsDispatchMethod()

  public val viewIssuedForOutwardJobFreeIssueMaterialMethod:
      MethodDescriptor<Identifier, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewIssuedForOutwardJobFreeIssueMaterialMethod()

  public val viewAdmittedFromGoodsReceiptMethod: MethodDescriptor<Identifier, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewAdmittedFromGoodsReceiptMethod()

  public val viewAdmittedFromInwardJobFreeIssueMaterialMethod:
      MethodDescriptor<Identifier, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewAdmittedFromInwardJobFreeIssueMaterialMethod()

  public val viewAdmittedFromProductionPlanMethod:
      MethodDescriptor<Identifier, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewAdmittedFromProductionPlanMethod()

  public val viewReturnableForPurchaseOrderMethod:
      MethodDescriptor<ReturnableInventorySearchReq, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewReturnableForPurchaseOrderMethod()

  public val viewReturnableForInwardJobMethod:
      MethodDescriptor<ReturnableInventorySearchReq, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewReturnableForInwardJobMethod()

  public val viewReturnableForStockIssuanceMethod:
      MethodDescriptor<ReturnableInventorySearchReq, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewReturnableForStockIssuanceMethod()

  public val viewReturnableForSalesOrderMethod:
      MethodDescriptor<ReturnableInventorySearchReq, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewReturnableForSalesOrderMethod()

  public val viewReturnableForOutwardJobMethod:
      MethodDescriptor<ReturnableInventorySearchReq, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewReturnableForOutwardJobMethod()

  public val viewQuantityRemainingMethod:
      MethodDescriptor<InventoryServiceFamilyQuantityReq, QuantityResponse>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewQuantityRemainingMethod()

  public val countWorkInProgressMethod: MethodDescriptor<Identifier, QuantityResponse>
    @JvmStatic
    get() = InventoryServiceGrpc.getCountWorkInProgressMethod()

  public val countIndentedMethod: MethodDescriptor<Identifier, QuantityResponse>
    @JvmStatic
    get() = InventoryServiceGrpc.getCountIndentedMethod()

  public val countOrderedMethod: MethodDescriptor<Identifier, QuantityResponse>
    @JvmStatic
    get() = InventoryServiceGrpc.getCountOrderedMethod()

  public val viewBaseDemandQuantityMethod: MethodDescriptor<Identifier, QuantityResponse>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewBaseDemandQuantityMethod()

  public val viewAdjustedDemandQuantityMethod: MethodDescriptor<Identifier, QuantityResponse>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewAdjustedDemandQuantityMethod()

  public val viewRequiredQuantityMethod: MethodDescriptor<Identifier, QuantityResponse>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewRequiredQuantityMethod()

  public val viewConsolidatedStatisticsMethod:
      MethodDescriptor<Identifier, ConsolidatedInventoryStatistics>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewConsolidatedStatisticsMethod()

  public val viewConsolidatedStatisticsForFamiliesMethod:
      MethodDescriptor<IdentifiersList, ConsolidatedInventoryStatisticsList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewConsolidatedStatisticsForFamiliesMethod()

  public val viewInStorageMethod: MethodDescriptor<Identifier, GenericInventoryList>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewInStorageMethod()

  public val viewWorkInProgressStatisticsMethod:
      MethodDescriptor<Identifier, InventoryWorkInProgressStatistics>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewWorkInProgressStatisticsMethod()

  public val viewIndentedStatisticsMethod: MethodDescriptor<Identifier, InventoryIndentedStatistics>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewIndentedStatisticsMethod()

  public val viewOrderedStatisticsMethod: MethodDescriptor<Identifier, InventoryOrderedStatistics>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewOrderedStatisticsMethod()

  public val viewDetailedDemandMethod: MethodDescriptor<Identifier, InventoryDetailedDemand>
    @JvmStatic
    get() = InventoryServiceGrpc.getViewDetailedDemandMethod()

  public val updateStorageWithShortURLMethod:
      MethodDescriptor<InventoryServiceUpdateStorageReq, GenericInventory>
    @JvmStatic
    get() = InventoryServiceGrpc.getUpdateStorageWithShortURLMethod()

  public val updateStorageWithInternalItemCodeMethod:
      MethodDescriptor<InventoryServiceUpdateStorageReq, GenericInventory>
    @JvmStatic
    get() = InventoryServiceGrpc.getUpdateStorageWithInternalItemCodeMethod()

  public val moveToStorageWithShortURLMethod:
      MethodDescriptor<InventoryServiceUpdateStorageReq, GenericInventory>
    @JvmStatic
    get() = InventoryServiceGrpc.getMoveToStorageWithShortURLMethod()

  public val moveToStorageWithInternalItemCodeMethod:
      MethodDescriptor<InventoryServiceUpdateStorageReq, GenericInventory>
    @JvmStatic
    get() = InventoryServiceGrpc.getMoveToStorageWithInternalItemCodeMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.InventoryService service as suspending coroutines.
   */
  @StubFor(InventoryServiceGrpc::class)
  public class InventoryServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<InventoryServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): InventoryServiceCoroutineStub =
        InventoryServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByHash(request: InventoryHashSearchReq, headers: Metadata = Metadata()):
        GenericInventory = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewByHashMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewByShortURL(request: SimpleSearchReq, headers: Metadata = Metadata()):
        GenericInventory = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewByShortURLMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewIssuable(request: IssuableInventorySearchReq, headers: Metadata =
        Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewIssuableMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewIssuedForGoodsDispatch(request: Identifier, headers: Metadata =
        Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewIssuedForGoodsDispatchMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewIssuedForOutwardJobFreeIssueMaterial(request: Identifier,
        headers: Metadata = Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewIssuedForOutwardJobFreeIssueMaterialMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAdmittedFromGoodsReceipt(request: Identifier, headers: Metadata =
        Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewAdmittedFromGoodsReceiptMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAdmittedFromInwardJobFreeIssueMaterial(request: Identifier,
        headers: Metadata = Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewAdmittedFromInwardJobFreeIssueMaterialMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAdmittedFromProductionPlan(request: Identifier, headers: Metadata =
        Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewAdmittedFromProductionPlanMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
    public suspend fun viewReturnableForPurchaseOrder(request: ReturnableInventorySearchReq,
        headers: Metadata = Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewReturnableForPurchaseOrderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
    public suspend fun viewReturnableForInwardJob(request: ReturnableInventorySearchReq,
        headers: Metadata = Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewReturnableForInwardJobMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
    public suspend fun viewReturnableForStockIssuance(request: ReturnableInventorySearchReq,
        headers: Metadata = Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewReturnableForStockIssuanceMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
    public suspend fun viewReturnableForSalesOrder(request: ReturnableInventorySearchReq,
        headers: Metadata = Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewReturnableForSalesOrderMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
    public suspend fun viewReturnableForOutwardJob(request: ReturnableInventorySearchReq,
        headers: Metadata = Metadata()): GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewReturnableForOutwardJobMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewQuantityRemaining(request: InventoryServiceFamilyQuantityReq,
        headers: Metadata = Metadata()): QuantityResponse = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewQuantityRemainingMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun countWorkInProgress(request: Identifier, headers: Metadata = Metadata()):
        QuantityResponse = unaryRpc(
      channel,
      InventoryServiceGrpc.getCountWorkInProgressMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun countIndented(request: Identifier, headers: Metadata = Metadata()):
        QuantityResponse = unaryRpc(
      channel,
      InventoryServiceGrpc.getCountIndentedMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun countOrdered(request: Identifier, headers: Metadata = Metadata()):
        QuantityResponse = unaryRpc(
      channel,
      InventoryServiceGrpc.getCountOrderedMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewBaseDemandQuantity(request: Identifier, headers: Metadata = Metadata()):
        QuantityResponse = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewBaseDemandQuantityMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewAdjustedDemandQuantity(request: Identifier, headers: Metadata =
        Metadata()): QuantityResponse = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewAdjustedDemandQuantityMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewRequiredQuantity(request: Identifier, headers: Metadata = Metadata()):
        QuantityResponse = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewRequiredQuantityMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewConsolidatedStatistics(request: Identifier, headers: Metadata =
        Metadata()): ConsolidatedInventoryStatistics = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewConsolidatedStatisticsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewConsolidatedStatisticsForFamilies(request: IdentifiersList,
        headers: Metadata = Metadata()): ConsolidatedInventoryStatisticsList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewConsolidatedStatisticsForFamiliesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewInStorage(request: Identifier, headers: Metadata = Metadata()):
        GenericInventoryList = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewInStorageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewWorkInProgressStatistics(request: Identifier, headers: Metadata =
        Metadata()): InventoryWorkInProgressStatistics = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewWorkInProgressStatisticsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewIndentedStatistics(request: Identifier, headers: Metadata = Metadata()):
        InventoryIndentedStatistics = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewIndentedStatisticsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOrderedStatistics(request: Identifier, headers: Metadata = Metadata()):
        InventoryOrderedStatistics = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewOrderedStatisticsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewDetailedDemand(request: Identifier, headers: Metadata = Metadata()):
        InventoryDetailedDemand = unaryRpc(
      channel,
      InventoryServiceGrpc.getViewDetailedDemandMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateStorageWithShortURL(request: InventoryServiceUpdateStorageReq,
        headers: Metadata = Metadata()): GenericInventory = unaryRpc(
      channel,
      InventoryServiceGrpc.getUpdateStorageWithShortURLMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateStorageWithInternalItemCode(request: InventoryServiceUpdateStorageReq,
        headers: Metadata = Metadata()): GenericInventory = unaryRpc(
      channel,
      InventoryServiceGrpc.getUpdateStorageWithInternalItemCodeMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun moveToStorageWithShortURL(request: InventoryServiceUpdateStorageReq,
        headers: Metadata = Metadata()): GenericInventory = unaryRpc(
      channel,
      InventoryServiceGrpc.getMoveToStorageWithShortURLMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun moveToStorageWithInternalItemCode(request: InventoryServiceUpdateStorageReq,
        headers: Metadata = Metadata()): GenericInventory = unaryRpc(
      channel,
      InventoryServiceGrpc.getMoveToStorageWithInternalItemCodeMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.InventoryService service based on Kotlin coroutines.
   */
  public abstract class InventoryServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewByHash.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByHash(request: InventoryHashSearchReq): GenericInventory = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewByHash is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewByShortURL.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewByShortURL(request: SimpleSearchReq): GenericInventory = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewByShortURL is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewIssuable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewIssuable(request: IssuableInventorySearchReq): GenericInventoryList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewIssuable is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewIssuedForGoodsDispatch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewIssuedForGoodsDispatch(request: Identifier): GenericInventoryList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewIssuedForGoodsDispatch is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InventoryService.ViewIssuedForOutwardJobFreeIssueMaterial.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewIssuedForOutwardJobFreeIssueMaterial(request: Identifier):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewIssuedForOutwardJobFreeIssueMaterial is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewAdmittedFromGoodsReceipt.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAdmittedFromGoodsReceipt(request: Identifier): GenericInventoryList
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewAdmittedFromGoodsReceipt is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InventoryService.ViewAdmittedFromInwardJobFreeIssueMaterial.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAdmittedFromInwardJobFreeIssueMaterial(request: Identifier):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewAdmittedFromInwardJobFreeIssueMaterial is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewAdmittedFromProductionPlan.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAdmittedFromProductionPlan(request: Identifier):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewAdmittedFromProductionPlan is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewReturnableForPurchaseOrder.
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
    public open suspend fun viewReturnableForPurchaseOrder(request: ReturnableInventorySearchReq):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewReturnableForPurchaseOrder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewReturnableForInwardJob.
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
    public open suspend fun viewReturnableForInwardJob(request: ReturnableInventorySearchReq):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewReturnableForInwardJob is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewReturnableForStockIssuance.
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
    public open suspend fun viewReturnableForStockIssuance(request: ReturnableInventorySearchReq):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewReturnableForStockIssuance is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewReturnableForSalesOrder.
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
    public open suspend fun viewReturnableForSalesOrder(request: ReturnableInventorySearchReq):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewReturnableForSalesOrder is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewReturnableForOutwardJob.
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
    public open suspend fun viewReturnableForOutwardJob(request: ReturnableInventorySearchReq):
        GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewReturnableForOutwardJob is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewQuantityRemaining.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewQuantityRemaining(request: InventoryServiceFamilyQuantityReq):
        QuantityResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewQuantityRemaining is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.CountWorkInProgress.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun countWorkInProgress(request: Identifier): QuantityResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.CountWorkInProgress is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.CountIndented.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun countIndented(request: Identifier): QuantityResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.CountIndented is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.CountOrdered.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun countOrdered(request: Identifier): QuantityResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.CountOrdered is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewBaseDemandQuantity.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewBaseDemandQuantity(request: Identifier): QuantityResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewBaseDemandQuantity is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewAdjustedDemandQuantity.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewAdjustedDemandQuantity(request: Identifier): QuantityResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewAdjustedDemandQuantity is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewRequiredQuantity.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewRequiredQuantity(request: Identifier): QuantityResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewRequiredQuantity is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewConsolidatedStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewConsolidatedStatistics(request: Identifier):
        ConsolidatedInventoryStatistics = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewConsolidatedStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for
     * Scailo.InventoryService.ViewConsolidatedStatisticsForFamilies.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewConsolidatedStatisticsForFamilies(request: IdentifiersList):
        ConsolidatedInventoryStatisticsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewConsolidatedStatisticsForFamilies is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewInStorage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewInStorage(request: Identifier): GenericInventoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewInStorage is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewWorkInProgressStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewWorkInProgressStatistics(request: Identifier):
        InventoryWorkInProgressStatistics = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewWorkInProgressStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewIndentedStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewIndentedStatistics(request: Identifier): InventoryIndentedStatistics
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewIndentedStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewOrderedStatistics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOrderedStatistics(request: Identifier): InventoryOrderedStatistics =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewOrderedStatistics is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.ViewDetailedDemand.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewDetailedDemand(request: Identifier): InventoryDetailedDemand = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.ViewDetailedDemand is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.UpdateStorageWithShortURL.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateStorageWithShortURL(request: InventoryServiceUpdateStorageReq):
        GenericInventory = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.UpdateStorageWithShortURL is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.UpdateStorageWithInternalItemCode.
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
        fun updateStorageWithInternalItemCode(request: InventoryServiceUpdateStorageReq):
        GenericInventory = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.UpdateStorageWithInternalItemCode is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.MoveToStorageWithShortURL.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun moveToStorageWithShortURL(request: InventoryServiceUpdateStorageReq):
        GenericInventory = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.MoveToStorageWithShortURL is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.InventoryService.MoveToStorageWithInternalItemCode.
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
        fun moveToStorageWithInternalItemCode(request: InventoryServiceUpdateStorageReq):
        GenericInventory = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.InventoryService.MoveToStorageWithInternalItemCode is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewByHashMethod(),
      implementation = ::viewByHash
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewByShortURLMethod(),
      implementation = ::viewByShortURL
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewIssuableMethod(),
      implementation = ::viewIssuable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewIssuedForGoodsDispatchMethod(),
      implementation = ::viewIssuedForGoodsDispatch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewIssuedForOutwardJobFreeIssueMaterialMethod(),
      implementation = ::viewIssuedForOutwardJobFreeIssueMaterial
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewAdmittedFromGoodsReceiptMethod(),
      implementation = ::viewAdmittedFromGoodsReceipt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewAdmittedFromInwardJobFreeIssueMaterialMethod(),
      implementation = ::viewAdmittedFromInwardJobFreeIssueMaterial
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewAdmittedFromProductionPlanMethod(),
      implementation = ::viewAdmittedFromProductionPlan
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewReturnableForPurchaseOrderMethod(),
      implementation = ::viewReturnableForPurchaseOrder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewReturnableForInwardJobMethod(),
      implementation = ::viewReturnableForInwardJob
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewReturnableForStockIssuanceMethod(),
      implementation = ::viewReturnableForStockIssuance
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewReturnableForSalesOrderMethod(),
      implementation = ::viewReturnableForSalesOrder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewReturnableForOutwardJobMethod(),
      implementation = ::viewReturnableForOutwardJob
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewQuantityRemainingMethod(),
      implementation = ::viewQuantityRemaining
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getCountWorkInProgressMethod(),
      implementation = ::countWorkInProgress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getCountIndentedMethod(),
      implementation = ::countIndented
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getCountOrderedMethod(),
      implementation = ::countOrdered
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewBaseDemandQuantityMethod(),
      implementation = ::viewBaseDemandQuantity
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewAdjustedDemandQuantityMethod(),
      implementation = ::viewAdjustedDemandQuantity
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewRequiredQuantityMethod(),
      implementation = ::viewRequiredQuantity
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewConsolidatedStatisticsMethod(),
      implementation = ::viewConsolidatedStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewConsolidatedStatisticsForFamiliesMethod(),
      implementation = ::viewConsolidatedStatisticsForFamilies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewInStorageMethod(),
      implementation = ::viewInStorage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewWorkInProgressStatisticsMethod(),
      implementation = ::viewWorkInProgressStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewIndentedStatisticsMethod(),
      implementation = ::viewIndentedStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewOrderedStatisticsMethod(),
      implementation = ::viewOrderedStatistics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getViewDetailedDemandMethod(),
      implementation = ::viewDetailedDemand
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getUpdateStorageWithShortURLMethod(),
      implementation = ::updateStorageWithShortURL
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getUpdateStorageWithInternalItemCodeMethod(),
      implementation = ::updateStorageWithInternalItemCode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getMoveToStorageWithShortURLMethod(),
      implementation = ::moveToStorageWithShortURL
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InventoryServiceGrpc.getMoveToStorageWithInternalItemCodeMethod(),
      implementation = ::moveToStorageWithInternalItemCode
    )).build()
  }
}
