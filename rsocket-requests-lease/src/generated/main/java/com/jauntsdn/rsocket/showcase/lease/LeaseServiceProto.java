// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/jauntsdn/rsocket/showcase/lease/service.proto

package com.jauntsdn.rsocket.showcase.lease;

public final class LeaseServiceProto {
  private LeaseServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jauntsdn_rsocket_showcase_lease_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jauntsdn_rsocket_showcase_lease_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jauntsdn_rsocket_showcase_lease_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jauntsdn_rsocket_showcase_lease_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1com/jauntsdn/rsocket/showcase/lease/se" +
      "rvice.proto\022#com.jauntsdn.rsocket.showca" +
      "se.lease\"\032\n\007Request\022\017\n\007message\030\001 \001(\t\"\033\n\010" +
      "Response\022\017\n\007message\030\001 \001(\t2t\n\007Service\022i\n\010" +
      "response\022,.com.jauntsdn.rsocket.showcase" +
      ".lease.Request\032-.com.jauntsdn.rsocket.sh" +
      "owcase.lease.Response\"\000B:\n#com.jauntsdn." +
      "rsocket.showcase.leaseB\021LeaseServiceProt" +
      "oP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_jauntsdn_rsocket_showcase_lease_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jauntsdn_rsocket_showcase_lease_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jauntsdn_rsocket_showcase_lease_Request_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_jauntsdn_rsocket_showcase_lease_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_jauntsdn_rsocket_showcase_lease_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jauntsdn_rsocket_showcase_lease_Response_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
