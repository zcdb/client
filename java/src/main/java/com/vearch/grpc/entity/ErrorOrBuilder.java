// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: errors.proto

package com.vearch.grpc.entity;

public interface ErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Error)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ErrorEnum code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.ErrorEnum code = 1;</code>
   * @return The code.
   */
  ErrorEnum getCode();

  /**
   * <code>string msg = 2;</code>
   * @return The msg.
   */
  String getMsg();
  /**
   * <code>string msg = 2;</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();
}