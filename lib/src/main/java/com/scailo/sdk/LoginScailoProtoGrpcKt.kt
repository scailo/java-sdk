package com.scailo.sdk

import com.scailo.sdk.LoginServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.LoginService.
 */
public object LoginServiceGrpcKt {
  public const val SERVICE_NAME: String = LoginServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val userLoginPrimaryMethod: MethodDescriptor<UserLoginRequest, UserLoginResponse>
    @JvmStatic
    get() = LoginServiceGrpc.getUserLoginPrimaryMethod()

  public val loginAsEmployeePrimaryMethod: MethodDescriptor<UserLoginRequest, UserLoginResponse>
    @JvmStatic
    get() = LoginServiceGrpc.getLoginAsEmployeePrimaryMethod()

  public val loginAsEmployeeSecondaryMethod: MethodDescriptor<UserLoginRequest, UserLoginResponse>
    @JvmStatic
    get() = LoginServiceGrpc.getLoginAsEmployeeSecondaryMethod()

  public val loginAsVendorUserMethod: MethodDescriptor<UserLoginRequest, VendorUserLoginResponse>
    @JvmStatic
    get() = LoginServiceGrpc.getLoginAsVendorUserMethod()

  public val loginAsClientUserMethod: MethodDescriptor<UserLoginRequest, ClientUserLoginResponse>
    @JvmStatic
    get() = LoginServiceGrpc.getLoginAsClientUserMethod()

  public val isAuthTokenValidMethod: MethodDescriptor<AuthTokenValidityRequest, BooleanResponse>
    @JvmStatic
    get() = LoginServiceGrpc.getIsAuthTokenValidMethod()

  public val logoutMethod: MethodDescriptor<LogoutRequest, LogoutResponse>
    @JvmStatic
    get() = LoginServiceGrpc.getLogoutMethod()

  public val viewHistoryMethod: MethodDescriptor<SimpleSearchReq, UserLoginHistoryList>
    @JvmStatic
    get() = LoginServiceGrpc.getViewHistoryMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.LoginService service as suspending coroutines.
   */
  @StubFor(LoginServiceGrpc::class)
  public class LoginServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<LoginServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): LoginServiceCoroutineStub =
        LoginServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
    public suspend fun userLoginPrimary(request: UserLoginRequest, headers: Metadata = Metadata()):
        UserLoginResponse = unaryRpc(
      channel,
      LoginServiceGrpc.getUserLoginPrimaryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun loginAsEmployeePrimary(request: UserLoginRequest, headers: Metadata =
        Metadata()): UserLoginResponse = unaryRpc(
      channel,
      LoginServiceGrpc.getLoginAsEmployeePrimaryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun loginAsEmployeeSecondary(request: UserLoginRequest, headers: Metadata =
        Metadata()): UserLoginResponse = unaryRpc(
      channel,
      LoginServiceGrpc.getLoginAsEmployeeSecondaryMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun loginAsVendorUser(request: UserLoginRequest, headers: Metadata = Metadata()):
        VendorUserLoginResponse = unaryRpc(
      channel,
      LoginServiceGrpc.getLoginAsVendorUserMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun loginAsClientUser(request: UserLoginRequest, headers: Metadata = Metadata()):
        ClientUserLoginResponse = unaryRpc(
      channel,
      LoginServiceGrpc.getLoginAsClientUserMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun isAuthTokenValid(request: AuthTokenValidityRequest, headers: Metadata =
        Metadata()): BooleanResponse = unaryRpc(
      channel,
      LoginServiceGrpc.getIsAuthTokenValidMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun logout(request: LogoutRequest, headers: Metadata = Metadata()):
        LogoutResponse = unaryRpc(
      channel,
      LoginServiceGrpc.getLogoutMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewHistory(request: SimpleSearchReq, headers: Metadata = Metadata()):
        UserLoginHistoryList = unaryRpc(
      channel,
      LoginServiceGrpc.getViewHistoryMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.LoginService service based on Kotlin coroutines.
   */
  public abstract class LoginServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.LoginService.UserLoginPrimary.
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
    public open suspend fun userLoginPrimary(request: UserLoginRequest): UserLoginResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LoginService.UserLoginPrimary is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LoginService.LoginAsEmployeePrimary.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun loginAsEmployeePrimary(request: UserLoginRequest): UserLoginResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LoginService.LoginAsEmployeePrimary is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LoginService.LoginAsEmployeeSecondary.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun loginAsEmployeeSecondary(request: UserLoginRequest): UserLoginResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LoginService.LoginAsEmployeeSecondary is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LoginService.LoginAsVendorUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun loginAsVendorUser(request: UserLoginRequest): VendorUserLoginResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LoginService.LoginAsVendorUser is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LoginService.LoginAsClientUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun loginAsClientUser(request: UserLoginRequest): ClientUserLoginResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LoginService.LoginAsClientUser is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LoginService.IsAuthTokenValid.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isAuthTokenValid(request: AuthTokenValidityRequest): BooleanResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LoginService.IsAuthTokenValid is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LoginService.Logout.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun logout(request: LogoutRequest): LogoutResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LoginService.Logout is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.LoginService.ViewHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewHistory(request: SimpleSearchReq): UserLoginHistoryList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.LoginService.ViewHistory is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LoginServiceGrpc.getUserLoginPrimaryMethod(),
      implementation = ::userLoginPrimary
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LoginServiceGrpc.getLoginAsEmployeePrimaryMethod(),
      implementation = ::loginAsEmployeePrimary
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LoginServiceGrpc.getLoginAsEmployeeSecondaryMethod(),
      implementation = ::loginAsEmployeeSecondary
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LoginServiceGrpc.getLoginAsVendorUserMethod(),
      implementation = ::loginAsVendorUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LoginServiceGrpc.getLoginAsClientUserMethod(),
      implementation = ::loginAsClientUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LoginServiceGrpc.getIsAuthTokenValidMethod(),
      implementation = ::isAuthTokenValid
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LoginServiceGrpc.getLogoutMethod(),
      implementation = ::logout
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LoginServiceGrpc.getViewHistoryMethod(),
      implementation = ::viewHistory
    )).build()
  }
}
