package com.scailo.sdk

import com.scailo.sdk.GeneralSettingsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for Scailo.GeneralSettingsService.
 */
public object GeneralSettingsServiceGrpcKt {
  public const val SERVICE_NAME: String = GeneralSettingsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createMethod: MethodDescriptor<GeneralSettingsServiceCreateRequest, GeneralSettings>
    @JvmStatic
    get() = GeneralSettingsServiceGrpc.getCreateMethod()

  public val updateOrganizationLogoMethod: MethodDescriptor<StandardFile, IdentifierResponse>
    @JvmStatic
    get() = GeneralSettingsServiceGrpc.getUpdateOrganizationLogoMethod()

  public val viewOrganizationLogoMethod: MethodDescriptor<Empty, ImageResponse>
    @JvmStatic
    get() = GeneralSettingsServiceGrpc.getViewOrganizationLogoMethod()

  public val viewSettingsMethod: MethodDescriptor<Empty, GeneralSettings>
    @JvmStatic
    get() = GeneralSettingsServiceGrpc.getViewSettingsMethod()

  public val downloadImportTemplateMethod: MethodDescriptor<Empty, StandardFile>
    @JvmStatic
    get() = GeneralSettingsServiceGrpc.getDownloadImportTemplateMethod()

  public val importFromCSVMethod: MethodDescriptor<StandardFile, IdentifierUUIDsList>
    @JvmStatic
    get() = GeneralSettingsServiceGrpc.getImportFromCSVMethod()

  /**
   * A stub for issuing RPCs to a(n) Scailo.GeneralSettingsService service as suspending coroutines.
   */
  @StubFor(GeneralSettingsServiceGrpc::class)
  public class GeneralSettingsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<GeneralSettingsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        GeneralSettingsServiceCoroutineStub = GeneralSettingsServiceCoroutineStub(channel,
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
    public suspend fun create(request: GeneralSettingsServiceCreateRequest, headers: Metadata =
        Metadata()): GeneralSettings = unaryRpc(
      channel,
      GeneralSettingsServiceGrpc.getCreateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateOrganizationLogo(request: StandardFile, headers: Metadata =
        Metadata()): IdentifierResponse = unaryRpc(
      channel,
      GeneralSettingsServiceGrpc.getUpdateOrganizationLogoMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewOrganizationLogo(request: Empty, headers: Metadata = Metadata()):
        ImageResponse = unaryRpc(
      channel,
      GeneralSettingsServiceGrpc.getViewOrganizationLogoMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun viewSettings(request: Empty, headers: Metadata = Metadata()): GeneralSettings
        = unaryRpc(
      channel,
      GeneralSettingsServiceGrpc.getViewSettingsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun downloadImportTemplate(request: Empty, headers: Metadata = Metadata()):
        StandardFile = unaryRpc(
      channel,
      GeneralSettingsServiceGrpc.getDownloadImportTemplateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
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
      GeneralSettingsServiceGrpc.getImportFromCSVMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the Scailo.GeneralSettingsService service based on Kotlin
   * coroutines.
   */
  public abstract class GeneralSettingsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for Scailo.GeneralSettingsService.Create.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun create(request: GeneralSettingsServiceCreateRequest): GeneralSettings =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralSettingsService.Create is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralSettingsService.UpdateOrganizationLogo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateOrganizationLogo(request: StandardFile): IdentifierResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralSettingsService.UpdateOrganizationLogo is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralSettingsService.ViewOrganizationLogo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewOrganizationLogo(request: Empty): ImageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralSettingsService.ViewOrganizationLogo is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralSettingsService.ViewSettings.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun viewSettings(request: Empty): GeneralSettings = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralSettingsService.ViewSettings is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralSettingsService.DownloadImportTemplate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadImportTemplate(request: Empty): StandardFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralSettingsService.DownloadImportTemplate is unimplemented"))

    /**
     * Returns the response to an RPC for Scailo.GeneralSettingsService.ImportFromCSV.
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
        StatusException(UNIMPLEMENTED.withDescription("Method Scailo.GeneralSettingsService.ImportFromCSV is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralSettingsServiceGrpc.getCreateMethod(),
      implementation = ::create
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralSettingsServiceGrpc.getUpdateOrganizationLogoMethod(),
      implementation = ::updateOrganizationLogo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralSettingsServiceGrpc.getViewOrganizationLogoMethod(),
      implementation = ::viewOrganizationLogo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralSettingsServiceGrpc.getViewSettingsMethod(),
      implementation = ::viewSettings
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralSettingsServiceGrpc.getDownloadImportTemplateMethod(),
      implementation = ::downloadImportTemplate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeneralSettingsServiceGrpc.getImportFromCSVMethod(),
      implementation = ::importFromCSV
    )).build()
  }
}
