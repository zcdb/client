// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: router_grpc.proto

package com.vearch.grpc.entity;

public interface AddRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AddRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.RequestHead head = 1;</code>
   * @return Whether the head field is set.
   */
  boolean hasHead();
  /**
   * <code>.RequestHead head = 1;</code>
   * @return The head.
   */
  RequestHead getHead();
  /**
   * <code>.RequestHead head = 1;</code>
   */
  RequestHeadOrBuilder getHeadOrBuilder();

  /**
   * <code>.Document doc = 4;</code>
   * @return Whether the doc field is set.
   */
  boolean hasDoc();
  /**
   * <code>.Document doc = 4;</code>
   * @return The doc.
   */
  Document getDoc();
  /**
   * <code>.Document doc = 4;</code>
   */
  DocumentOrBuilder getDocOrBuilder();
}
