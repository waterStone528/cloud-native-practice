package com.zx.member.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: member.proto")
public final class MemberServiceGrpc {

  private MemberServiceGrpc() {}

  public static final String SERVICE_NAME = "member.MemberService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<SignOnRequest,
      SignOnResponse> METHOD_SIGN_ON =
      io.grpc.MethodDescriptor.<SignOnRequest, SignOnResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "member.MemberService", "SignOn"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              SignOnRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              SignOnResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MemberServiceStub newStub(io.grpc.Channel channel) {
    return new MemberServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MemberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MemberServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MemberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MemberServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MemberServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void signOn(SignOnRequest request,
                       io.grpc.stub.StreamObserver<SignOnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SIGN_ON, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SIGN_ON,
            asyncUnaryCall(
              new MethodHandlers<
                SignOnRequest,
                SignOnResponse>(
                  this, METHODID_SIGN_ON)))
          .build();
    }
  }

  /**
   */
  public static final class MemberServiceStub extends io.grpc.stub.AbstractStub<MemberServiceStub> {
    private MemberServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MemberServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MemberServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MemberServiceStub(channel, callOptions);
    }

    /**
     */
    public void signOn(SignOnRequest request,
                       io.grpc.stub.StreamObserver<SignOnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SIGN_ON, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MemberServiceBlockingStub extends io.grpc.stub.AbstractStub<MemberServiceBlockingStub> {
    private MemberServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MemberServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MemberServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MemberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public SignOnResponse signOn(SignOnRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SIGN_ON, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MemberServiceFutureStub extends io.grpc.stub.AbstractStub<MemberServiceFutureStub> {
    private MemberServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MemberServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MemberServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MemberServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SignOnResponse> signOn(
        SignOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SIGN_ON, getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_ON = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MemberServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MemberServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_ON:
          serviceImpl.signOn((SignOnRequest) request,
              (io.grpc.stub.StreamObserver<SignOnResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class MemberServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Member.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MemberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MemberServiceDescriptorSupplier())
              .addMethod(METHOD_SIGN_ON)
              .build();
        }
      }
    }
    return result;
  }
}
