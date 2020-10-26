// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: router_grpc.proto

package com.vearch.grpc.entity;

public interface SearchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SearchResponse)
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
   * <code>repeated .SearchResult results = 2;</code>
   */
  java.util.List<SearchResult>
      getResultsList();
  /**
   * <code>repeated .SearchResult results = 2;</code>
   */
  SearchResult getResults(int index);
  /**
   * <code>repeated .SearchResult results = 2;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .SearchResult results = 2;</code>
   */
  java.util.List<? extends SearchResultOrBuilder>
      getResultsOrBuilderList();
  /**
   * <code>repeated .SearchResult results = 2;</code>
   */
  SearchResultOrBuilder getResultsOrBuilder(
          int index);

  /**
   * <code>string online_log_message = 3;</code>
   * @return The onlineLogMessage.
   */
  String getOnlineLogMessage();
  /**
   * <code>string online_log_message = 3;</code>
   * @return The bytes for onlineLogMessage.
   */
  com.google.protobuf.ByteString
      getOnlineLogMessageBytes();

  /**
   * <code>bool timeout = 4;</code>
   * @return The timeout.
   */
  boolean getTimeout();

  /**
   * <code>bytes FlatBytes = 5;</code>
   * @return The flatBytes.
   */
  com.google.protobuf.ByteString getFlatBytes();

  /**
   * <code>map&lt;string, string&gt; sort_field_map = 6;</code>
   */
  int getSortFieldMapCount();
  /**
   * <code>map&lt;string, string&gt; sort_field_map = 6;</code>
   */
  boolean containsSortFieldMap(
          String key);
  /**
   * Use {@link #getSortFieldMapMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getSortFieldMap();
  /**
   * <code>map&lt;string, string&gt; sort_field_map = 6;</code>
   */
  java.util.Map<String, String>
  getSortFieldMapMap();
  /**
   * <code>map&lt;string, string&gt; sort_field_map = 6;</code>
   */

  String getSortFieldMapOrDefault(
          String key,
          String defaultValue);
  /**
   * <code>map&lt;string, string&gt; sort_field_map = 6;</code>
   */

  String getSortFieldMapOrThrow(
          String key);

  /**
   * <code>int32 top_size = 7;</code>
   * @return The topSize.
   */
  int getTopSize();
}
