package com.scailo.sdk

import com.scailo.sdk.LeavesLogsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.LeavesLogsService.
 */
public object LeavesLogsServiceGrpcKt {
  public const val SERVICE_NAME: String = LeavesLogsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val filterMethod: MethodDescriptor<LeavesLogsServiceFilterReq, LeavesLogsList>
    @JvmStatic
    get() = LeavesLogsServiceGrpc.getFilterMethod()

  public val countEmployeeLeavesMethod:
      MethodDescriptor<LeavesLogsCountEmployeeLeavesRequest, CountResponse>
    @JvmStatic
    get() = LeavesLogsServiceGrpc.getCountEmployeeLeavesMethod()

  public val countMethod: MethodDescriptor<LeavesLogsServiceCountReq, CountResponse>
    @JvmStatic
    get() = LeavesLogsServiceGrpc.getCountMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.LeavesLogsService service as suspending coroutines.
   */
  @StubFor(LeavesLogsServiceGrpc::class)
  public class LeavesLogsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<LeavesLogsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): LeavesLogsServiceCoroutineStub =
        LeavesLogsServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun filter(request: LeavesLogsServiceFilterReq, headers: Metadata = Metadata()):
        LeavesLogsList = unaryRpc(
      channel,
      LeavesLogsServiceGrpc.getFilterMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun countEmployeeLeaves(request: LeavesLogsCountEmployeeLeavesRequest,
        headers: Metadata = Metadata()): CountResponse = unaryRpc(
      channel,
      LeavesLogsServiceGrpc.getCountEmployeeLeavesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun count(request: LeavesLogsServiceCountReq, headers: Metadata = Metadata()):
        CountResponse = unaryRpc(
      channel,
      LeavesLogsServiceGrpc.getCountMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.LeavesLogsService service based on Kotlin coroutines.
   */
  public abstract class LeavesLogsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.LeavesLogsService.Filter.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun filter(request: LeavesLogsServiceFilterReq): LeavesLogsList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesLogsService.Filter is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesLogsService.CountEmployeeLeaves.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun countEmployeeLeaves(request: LeavesLogsCountEmployeeLeavesRequest):
        CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesLogsService.CountEmployeeLeaves is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LeavesLogsService.Count.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun count(request: LeavesLogsServiceCountReq): CountResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LeavesLogsService.Count is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesLogsServiceGrpc.getFilterMethod(),
      implementation = ::filter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesLogsServiceGrpc.getCountEmployeeLeavesMethod(),
      implementation = ::countEmployeeLeaves
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LeavesLogsServiceGrpc.getCountMethod(),
      implementation = ::count
    )).build()
  }
}
