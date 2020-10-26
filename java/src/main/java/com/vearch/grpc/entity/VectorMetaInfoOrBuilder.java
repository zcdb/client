// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_model.proto

package com.vearch.grpc.entity;

public interface VectorMetaInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VectorMetaInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 dimension = 1;</code>
   * @return The dimension.
   */
  int getDimension();

  /**
   * <code>.VectorMetaInfo.ValueType value_type = 2;</code>
   * @return The enum numeric value on the wire for valueType.
   */
  int getValueTypeValue();
  /**
   * <code>.VectorMetaInfo.ValueType value_type = 2;</code>
   * @return The valueType.
   */
  VectorMetaInfo.ValueType getValueType();

  /**
   * <code>.VectorMetaInfo.StoreType store_type = 3;</code>
   * @return The enum numeric value on the wire for storeType.
   */
  int getStoreTypeValue();
  /**
   * <code>.VectorMetaInfo.StoreType store_type = 3;</code>
   * @return The storeType.
   */
  VectorMetaInfo.StoreType getStoreType();

  /**
   * <code>string store_param = 4;</code>
   * @return The storeParam.
   */
  String getStoreParam();
  /**
   * <code>string store_param = 4;</code>
   * @return The bytes for storeParam.
   */
  com.google.protobuf.ByteString
      getStoreParamBytes();
}
