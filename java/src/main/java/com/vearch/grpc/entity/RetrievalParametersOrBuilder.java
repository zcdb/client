// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: router_grpc.proto

package com.vearch.grpc.entity;

public interface RetrievalParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RetrievalParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.RetrievalParameters.DistanceMetricType metric_type = 1;</code>
   * @return The enum numeric value on the wire for metricType.
   */
  int getMetricTypeValue();
  /**
   * <code>.RetrievalParameters.DistanceMetricType metric_type = 1;</code>
   * @return The metricType.
   */
  RetrievalParameters.DistanceMetricType getMetricType();

  /**
   * <code>int32 nprobe = 2;</code>
   * @return The nprobe.
   */
  int getNprobe();
}
