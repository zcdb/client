// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: router_grpc.proto

package com.vearch.grpc.entity;

public interface BulkResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BulkResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ResponseHead head = 1;</code>
   * @return Whether the head field is set.
   */
  boolean hasHead();
  /**
   * <code>.ResponseHead head = 1;</code>
   * @return The head.
   */
  ResponseHead getHead();
  /**
   * <code>.ResponseHead head = 1;</code>
   */
  ResponseHeadOrBuilder getHeadOrBuilder();

  /**
   * <code>repeated .Item items = 2;</code>
   */
  java.util.List<Item>
      getItemsList();
  /**
   * <code>repeated .Item items = 2;</code>
   */
  Item getItems(int index);
  /**
   * <code>repeated .Item items = 2;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .Item items = 2;</code>
   */
  java.util.List<? extends ItemOrBuilder>
      getItemsOrBuilderList();
  /**
   * <code>repeated .Item items = 2;</code>
   */
  ItemOrBuilder getItemsOrBuilder(
          int index);
}
