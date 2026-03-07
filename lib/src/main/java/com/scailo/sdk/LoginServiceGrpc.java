package com.scailo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Describes the methods applicable on the login service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: login.scailo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LoginServiceGrpc {

  private LoginServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Scailo.LoginService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.UserLoginResponse> getUserLoginPrimaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserLoginPrimary",
      requestType = com.scailo.sdk.UserLoginRequest.class,
      responseType = com.scailo.sdk.UserLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.UserLoginResponse> getUserLoginPrimaryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.UserLoginResponse> getUserLoginPrimaryMethod;
    if ((getUserLoginPrimaryMethod = LoginServiceGrpc.getUserLoginPrimaryMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getUserLoginPrimaryMethod = LoginServiceGrpc.getUserLoginPrimaryMethod) == null) {
          LoginServiceGrpc.getUserLoginPrimaryMethod = getUserLoginPrimaryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.UserLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserLoginPrimary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UserLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UserLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("UserLoginPrimary"))
              .build();
        }
      }
    }
    return getUserLoginPrimaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.UserLoginResponse> getLoginAsEmployeePrimaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginAsEmployeePrimary",
      requestType = com.scailo.sdk.UserLoginRequest.class,
      responseType = com.scailo.sdk.UserLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.UserLoginResponse> getLoginAsEmployeePrimaryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.UserLoginResponse> getLoginAsEmployeePrimaryMethod;
    if ((getLoginAsEmployeePrimaryMethod = LoginServiceGrpc.getLoginAsEmployeePrimaryMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getLoginAsEmployeePrimaryMethod = LoginServiceGrpc.getLoginAsEmployeePrimaryMethod) == null) {
          LoginServiceGrpc.getLoginAsEmployeePrimaryMethod = getLoginAsEmployeePrimaryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.UserLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginAsEmployeePrimary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UserLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UserLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("LoginAsEmployeePrimary"))
              .build();
        }
      }
    }
    return getLoginAsEmployeePrimaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.UserLoginResponse> getLoginAsEmployeeSecondaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginAsEmployeeSecondary",
      requestType = com.scailo.sdk.UserLoginRequest.class,
      responseType = com.scailo.sdk.UserLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.UserLoginResponse> getLoginAsEmployeeSecondaryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.UserLoginResponse> getLoginAsEmployeeSecondaryMethod;
    if ((getLoginAsEmployeeSecondaryMethod = LoginServiceGrpc.getLoginAsEmployeeSecondaryMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getLoginAsEmployeeSecondaryMethod = LoginServiceGrpc.getLoginAsEmployeeSecondaryMethod) == null) {
          LoginServiceGrpc.getLoginAsEmployeeSecondaryMethod = getLoginAsEmployeeSecondaryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.UserLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginAsEmployeeSecondary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UserLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UserLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("LoginAsEmployeeSecondary"))
              .build();
        }
      }
    }
    return getLoginAsEmployeeSecondaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.VendorUserLoginResponse> getLoginAsVendorUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginAsVendorUser",
      requestType = com.scailo.sdk.UserLoginRequest.class,
      responseType = com.scailo.sdk.VendorUserLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.VendorUserLoginResponse> getLoginAsVendorUserMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.VendorUserLoginResponse> getLoginAsVendorUserMethod;
    if ((getLoginAsVendorUserMethod = LoginServiceGrpc.getLoginAsVendorUserMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getLoginAsVendorUserMethod = LoginServiceGrpc.getLoginAsVendorUserMethod) == null) {
          LoginServiceGrpc.getLoginAsVendorUserMethod = getLoginAsVendorUserMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.VendorUserLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginAsVendorUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UserLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.VendorUserLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("LoginAsVendorUser"))
              .build();
        }
      }
    }
    return getLoginAsVendorUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.ClientUserLoginResponse> getLoginAsClientUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginAsClientUser",
      requestType = com.scailo.sdk.UserLoginRequest.class,
      responseType = com.scailo.sdk.ClientUserLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest,
      com.scailo.sdk.ClientUserLoginResponse> getLoginAsClientUserMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.ClientUserLoginResponse> getLoginAsClientUserMethod;
    if ((getLoginAsClientUserMethod = LoginServiceGrpc.getLoginAsClientUserMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getLoginAsClientUserMethod = LoginServiceGrpc.getLoginAsClientUserMethod) == null) {
          LoginServiceGrpc.getLoginAsClientUserMethod = getLoginAsClientUserMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.UserLoginRequest, com.scailo.sdk.ClientUserLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginAsClientUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UserLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.ClientUserLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("LoginAsClientUser"))
              .build();
        }
      }
    }
    return getLoginAsClientUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.AuthTokenValidityRequest,
      com.scailo.sdk.BooleanResponse> getIsAuthTokenValidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsAuthTokenValid",
      requestType = com.scailo.sdk.AuthTokenValidityRequest.class,
      responseType = com.scailo.sdk.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.AuthTokenValidityRequest,
      com.scailo.sdk.BooleanResponse> getIsAuthTokenValidMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.AuthTokenValidityRequest, com.scailo.sdk.BooleanResponse> getIsAuthTokenValidMethod;
    if ((getIsAuthTokenValidMethod = LoginServiceGrpc.getIsAuthTokenValidMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getIsAuthTokenValidMethod = LoginServiceGrpc.getIsAuthTokenValidMethod) == null) {
          LoginServiceGrpc.getIsAuthTokenValidMethod = getIsAuthTokenValidMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.AuthTokenValidityRequest, com.scailo.sdk.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsAuthTokenValid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.AuthTokenValidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.BooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("IsAuthTokenValid"))
              .build();
        }
      }
    }
    return getIsAuthTokenValidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.LogoutRequest,
      com.scailo.sdk.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = com.scailo.sdk.LogoutRequest.class,
      responseType = com.scailo.sdk.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.LogoutRequest,
      com.scailo.sdk.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.LogoutRequest, com.scailo.sdk.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = LoginServiceGrpc.getLogoutMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getLogoutMethod = LoginServiceGrpc.getLogoutMethod) == null) {
          LoginServiceGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.LogoutRequest, com.scailo.sdk.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.LogoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("Logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.UserLoginHistoryList> getViewHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewHistory",
      requestType = com.scailo.sdk.SimpleSearchReq.class,
      responseType = com.scailo.sdk.UserLoginHistoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq,
      com.scailo.sdk.UserLoginHistoryList> getViewHistoryMethod() {
    io.grpc.MethodDescriptor<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.UserLoginHistoryList> getViewHistoryMethod;
    if ((getViewHistoryMethod = LoginServiceGrpc.getViewHistoryMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getViewHistoryMethod = LoginServiceGrpc.getViewHistoryMethod) == null) {
          LoginServiceGrpc.getViewHistoryMethod = getViewHistoryMethod =
              io.grpc.MethodDescriptor.<com.scailo.sdk.SimpleSearchReq, com.scailo.sdk.UserLoginHistoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.SimpleSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scailo.sdk.UserLoginHistoryList.getDefaultInstance()))
              .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("ViewHistory"))
              .build();
        }
      }
    }
    return getViewHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoginServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginServiceStub>() {
        @java.lang.Override
        public LoginServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginServiceStub(channel, callOptions);
        }
      };
    return LoginServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginServiceBlockingStub>() {
        @java.lang.Override
        public LoginServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginServiceBlockingStub(channel, callOptions);
        }
      };
    return LoginServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoginServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoginServiceFutureStub>() {
        @java.lang.Override
        public LoginServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoginServiceFutureStub(channel, callOptions);
        }
      };
    return LoginServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Describes the methods applicable on the login service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Login using credentials belonging to a user and evaluate using user's primary role (this has been deprecated. Use LoginAsEmployeePrimary instead)
     * </pre>
     */
    @java.lang.Deprecated
    default void userLoginPrimary(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserLoginPrimaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Login as employee using primary role
     * </pre>
     */
    default void loginAsEmployeePrimary(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginAsEmployeePrimaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Login as employee using mobile role
     * </pre>
     */
    default void loginAsEmployeeSecondary(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginAsEmployeeSecondaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Login using credentials belonging to a vendor user
     * </pre>
     */
    default void loginAsVendorUser(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorUserLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginAsVendorUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Login using credentials belonging to a client user
     * </pre>
     */
    default void loginAsClientUser(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientUserLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginAsClientUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check if the auth token is still valid
     * </pre>
     */
    default void isAuthTokenValid(com.scailo.sdk.AuthTokenValidityRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsAuthTokenValidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Logout
     * </pre>
     */
    default void logout(com.scailo.sdk.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LogoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * View login history for the given username
     * </pre>
     */
    default void viewHistory(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginHistoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewHistoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LoginService.
   * <pre>
   *Describes the methods applicable on the login service
   * </pre>
   */
  public static abstract class LoginServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LoginServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LoginService.
   * <pre>
   *Describes the methods applicable on the login service
   * </pre>
   */
  public static final class LoginServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LoginServiceStub> {
    private LoginServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Login using credentials belonging to a user and evaluate using user's primary role (this has been deprecated. Use LoginAsEmployeePrimary instead)
     * </pre>
     */
    @java.lang.Deprecated
    public void userLoginPrimary(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserLoginPrimaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Login as employee using primary role
     * </pre>
     */
    public void loginAsEmployeePrimary(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginAsEmployeePrimaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Login as employee using mobile role
     * </pre>
     */
    public void loginAsEmployeeSecondary(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginAsEmployeeSecondaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Login using credentials belonging to a vendor user
     * </pre>
     */
    public void loginAsVendorUser(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.VendorUserLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginAsVendorUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Login using credentials belonging to a client user
     * </pre>
     */
    public void loginAsClientUser(com.scailo.sdk.UserLoginRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.ClientUserLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginAsClientUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if the auth token is still valid
     * </pre>
     */
    public void isAuthTokenValid(com.scailo.sdk.AuthTokenValidityRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsAuthTokenValidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Logout
     * </pre>
     */
    public void logout(com.scailo.sdk.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.LogoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * View login history for the given username
     * </pre>
     */
    public void viewHistory(com.scailo.sdk.SimpleSearchReq request,
        io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginHistoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LoginService.
   * <pre>
   *Describes the methods applicable on the login service
   * </pre>
   */
  public static final class LoginServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LoginServiceBlockingStub> {
    private LoginServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Login using credentials belonging to a user and evaluate using user's primary role (this has been deprecated. Use LoginAsEmployeePrimary instead)
     * </pre>
     */
    @java.lang.Deprecated
    public com.scailo.sdk.UserLoginResponse userLoginPrimary(com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserLoginPrimaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Login as employee using primary role
     * </pre>
     */
    public com.scailo.sdk.UserLoginResponse loginAsEmployeePrimary(com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginAsEmployeePrimaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Login as employee using mobile role
     * </pre>
     */
    public com.scailo.sdk.UserLoginResponse loginAsEmployeeSecondary(com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginAsEmployeeSecondaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Login using credentials belonging to a vendor user
     * </pre>
     */
    public com.scailo.sdk.VendorUserLoginResponse loginAsVendorUser(com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginAsVendorUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Login using credentials belonging to a client user
     * </pre>
     */
    public com.scailo.sdk.ClientUserLoginResponse loginAsClientUser(com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginAsClientUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if the auth token is still valid
     * </pre>
     */
    public com.scailo.sdk.BooleanResponse isAuthTokenValid(com.scailo.sdk.AuthTokenValidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsAuthTokenValidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Logout
     * </pre>
     */
    public com.scailo.sdk.LogoutResponse logout(com.scailo.sdk.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * View login history for the given username
     * </pre>
     */
    public com.scailo.sdk.UserLoginHistoryList viewHistory(com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LoginService.
   * <pre>
   *Describes the methods applicable on the login service
   * </pre>
   */
  public static final class LoginServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LoginServiceFutureStub> {
    private LoginServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoginServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Login using credentials belonging to a user and evaluate using user's primary role (this has been deprecated. Use LoginAsEmployeePrimary instead)
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UserLoginResponse> userLoginPrimary(
        com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserLoginPrimaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Login as employee using primary role
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UserLoginResponse> loginAsEmployeePrimary(
        com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginAsEmployeePrimaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Login as employee using mobile role
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UserLoginResponse> loginAsEmployeeSecondary(
        com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginAsEmployeeSecondaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Login using credentials belonging to a vendor user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.VendorUserLoginResponse> loginAsVendorUser(
        com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginAsVendorUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Login using credentials belonging to a client user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.ClientUserLoginResponse> loginAsClientUser(
        com.scailo.sdk.UserLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginAsClientUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if the auth token is still valid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.BooleanResponse> isAuthTokenValid(
        com.scailo.sdk.AuthTokenValidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsAuthTokenValidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Logout
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.LogoutResponse> logout(
        com.scailo.sdk.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * View login history for the given username
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scailo.sdk.UserLoginHistoryList> viewHistory(
        com.scailo.sdk.SimpleSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_LOGIN_PRIMARY = 0;
  private static final int METHODID_LOGIN_AS_EMPLOYEE_PRIMARY = 1;
  private static final int METHODID_LOGIN_AS_EMPLOYEE_SECONDARY = 2;
  private static final int METHODID_LOGIN_AS_VENDOR_USER = 3;
  private static final int METHODID_LOGIN_AS_CLIENT_USER = 4;
  private static final int METHODID_IS_AUTH_TOKEN_VALID = 5;
  private static final int METHODID_LOGOUT = 6;
  private static final int METHODID_VIEW_HISTORY = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_LOGIN_PRIMARY:
          serviceImpl.userLoginPrimary((com.scailo.sdk.UserLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginResponse>) responseObserver);
          break;
        case METHODID_LOGIN_AS_EMPLOYEE_PRIMARY:
          serviceImpl.loginAsEmployeePrimary((com.scailo.sdk.UserLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginResponse>) responseObserver);
          break;
        case METHODID_LOGIN_AS_EMPLOYEE_SECONDARY:
          serviceImpl.loginAsEmployeeSecondary((com.scailo.sdk.UserLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginResponse>) responseObserver);
          break;
        case METHODID_LOGIN_AS_VENDOR_USER:
          serviceImpl.loginAsVendorUser((com.scailo.sdk.UserLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.VendorUserLoginResponse>) responseObserver);
          break;
        case METHODID_LOGIN_AS_CLIENT_USER:
          serviceImpl.loginAsClientUser((com.scailo.sdk.UserLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.ClientUserLoginResponse>) responseObserver);
          break;
        case METHODID_IS_AUTH_TOKEN_VALID:
          serviceImpl.isAuthTokenValid((com.scailo.sdk.AuthTokenValidityRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.BooleanResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.scailo.sdk.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.LogoutResponse>) responseObserver);
          break;
        case METHODID_VIEW_HISTORY:
          serviceImpl.viewHistory((com.scailo.sdk.SimpleSearchReq) request,
              (io.grpc.stub.StreamObserver<com.scailo.sdk.UserLoginHistoryList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUserLoginPrimaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UserLoginRequest,
              com.scailo.sdk.UserLoginResponse>(
                service, METHODID_USER_LOGIN_PRIMARY)))
        .addMethod(
          getLoginAsEmployeePrimaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UserLoginRequest,
              com.scailo.sdk.UserLoginResponse>(
                service, METHODID_LOGIN_AS_EMPLOYEE_PRIMARY)))
        .addMethod(
          getLoginAsEmployeeSecondaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UserLoginRequest,
              com.scailo.sdk.UserLoginResponse>(
                service, METHODID_LOGIN_AS_EMPLOYEE_SECONDARY)))
        .addMethod(
          getLoginAsVendorUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UserLoginRequest,
              com.scailo.sdk.VendorUserLoginResponse>(
                service, METHODID_LOGIN_AS_VENDOR_USER)))
        .addMethod(
          getLoginAsClientUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.UserLoginRequest,
              com.scailo.sdk.ClientUserLoginResponse>(
                service, METHODID_LOGIN_AS_CLIENT_USER)))
        .addMethod(
          getIsAuthTokenValidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.AuthTokenValidityRequest,
              com.scailo.sdk.BooleanResponse>(
                service, METHODID_IS_AUTH_TOKEN_VALID)))
        .addMethod(
          getLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.LogoutRequest,
              com.scailo.sdk.LogoutResponse>(
                service, METHODID_LOGOUT)))
        .addMethod(
          getViewHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scailo.sdk.SimpleSearchReq,
              com.scailo.sdk.UserLoginHistoryList>(
                service, METHODID_VIEW_HISTORY)))
        .build();
  }

  private static abstract class LoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoginServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scailo.sdk.LoginScailoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoginService");
    }
  }

  private static final class LoginServiceFileDescriptorSupplier
      extends LoginServiceBaseDescriptorSupplier {
    LoginServiceFileDescriptorSupplier() {}
  }

  private static final class LoginServiceMethodDescriptorSupplier
      extends LoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LoginServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LoginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoginServiceFileDescriptorSupplier())
              .addMethod(getUserLoginPrimaryMethod())
              .addMethod(getLoginAsEmployeePrimaryMethod())
              .addMethod(getLoginAsEmployeeSecondaryMethod())
              .addMethod(getLoginAsVendorUserMethod())
              .addMethod(getLoginAsClientUserMethod())
              .addMethod(getIsAuthTokenValidMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getViewHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
