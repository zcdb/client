// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_model.proto

package com.vearch.grpc.entity;

public interface DocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string p_key = 1;</code>
   * @return The pKey.
   */
  String getPKey();
  /**
   * <code>string p_key = 1;</code>
   * @return The bytes for pKey.
   */
  com.google.protobuf.ByteString
      getPKeyBytes();

  /**
   * <code>repeated .Field fields = 2;</code>
   */
  java.util.List<Field>
      getFieldsList();
  /**
   * <code>repeated .Field fields = 2;</code>
   */
  Field getFields(int index);
  /**
   * <code>repeated .Field fields = 2;</code>
   */
  int getFieldsCount();
  /**
   * <code>repeated .Field fields = 2;</code>
   */
  java.util.List<? extends FieldOrBuilder>
      getFieldsOrBuilderList();
  /**
   * <code>repeated .Field fields = 2;</code>
   */
  FieldOrBuilder getFieldsOrBuilder(
          int index);
}
