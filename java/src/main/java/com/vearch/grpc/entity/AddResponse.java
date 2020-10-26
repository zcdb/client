// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: router_grpc.proto

package com.vearch.grpc.entity;

/**
 * Protobuf type {@code AddResponse}
 */
public final class AddResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddResponse)
    AddResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddResponse.newBuilder() to construct.
  private AddResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddResponse() {
    primaryKey_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            ResponseHead.Builder subBuilder = null;
            if (head_ != null) {
              subBuilder = head_.toBuilder();
            }
            head_ = input.readMessage(ResponseHead.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(head_);
              head_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            primaryKey_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return RouterGrpc.internal_static_AddResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RouterGrpc.internal_static_AddResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AddResponse.class, AddResponse.Builder.class);
  }

  public static final int HEAD_FIELD_NUMBER = 1;
  private ResponseHead head_;
  /**
   * <code>.ResponseHead head = 1;</code>
   * @return Whether the head field is set.
   */
  @Override
  public boolean hasHead() {
    return head_ != null;
  }
  /**
   * <code>.ResponseHead head = 1;</code>
   * @return The head.
   */
  @Override
  public ResponseHead getHead() {
    return head_ == null ? ResponseHead.getDefaultInstance() : head_;
  }
  /**
   * <code>.ResponseHead head = 1;</code>
   */
  @Override
  public ResponseHeadOrBuilder getHeadOrBuilder() {
    return getHead();
  }

  public static final int PRIMARY_KEY_FIELD_NUMBER = 4;
  private volatile Object primaryKey_;
  /**
   * <code>string primary_key = 4;</code>
   * @return The primaryKey.
   */
  @Override
  public String getPrimaryKey() {
    Object ref = primaryKey_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      primaryKey_ = s;
      return s;
    }
  }
  /**
   * <code>string primary_key = 4;</code>
   * @return The bytes for primaryKey.
   */
  @Override
  public com.google.protobuf.ByteString
      getPrimaryKeyBytes() {
    Object ref = primaryKey_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      primaryKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (head_ != null) {
      output.writeMessage(1, getHead());
    }
    if (!getPrimaryKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, primaryKey_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (head_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHead());
    }
    if (!getPrimaryKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, primaryKey_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof AddResponse)) {
      return super.equals(obj);
    }
    AddResponse other = (AddResponse) obj;

    if (hasHead() != other.hasHead()) return false;
    if (hasHead()) {
      if (!getHead()
          .equals(other.getHead())) return false;
    }
    if (!getPrimaryKey()
        .equals(other.getPrimaryKey())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHead()) {
      hash = (37 * hash) + HEAD_FIELD_NUMBER;
      hash = (53 * hash) + getHead().hashCode();
    }
    hash = (37 * hash) + PRIMARY_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPrimaryKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AddResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AddResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AddResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AddResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AddResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AddResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AddResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AddResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AddResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AddResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AddResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AddResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AddResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code AddResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddResponse)
      AddResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RouterGrpc.internal_static_AddResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RouterGrpc.internal_static_AddResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AddResponse.class, AddResponse.Builder.class);
    }

    // Construct using com.vearch.grpc.entity.AddResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (headBuilder_ == null) {
        head_ = null;
      } else {
        head_ = null;
        headBuilder_ = null;
      }
      primaryKey_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RouterGrpc.internal_static_AddResponse_descriptor;
    }

    @Override
    public AddResponse getDefaultInstanceForType() {
      return AddResponse.getDefaultInstance();
    }

    @Override
    public AddResponse build() {
      AddResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public AddResponse buildPartial() {
      AddResponse result = new AddResponse(this);
      if (headBuilder_ == null) {
        result.head_ = head_;
      } else {
        result.head_ = headBuilder_.build();
      }
      result.primaryKey_ = primaryKey_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof AddResponse) {
        return mergeFrom((AddResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AddResponse other) {
      if (other == AddResponse.getDefaultInstance()) return this;
      if (other.hasHead()) {
        mergeHead(other.getHead());
      }
      if (!other.getPrimaryKey().isEmpty()) {
        primaryKey_ = other.primaryKey_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      AddResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AddResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ResponseHead head_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ResponseHead, ResponseHead.Builder, ResponseHeadOrBuilder> headBuilder_;
    /**
     * <code>.ResponseHead head = 1;</code>
     * @return Whether the head field is set.
     */
    public boolean hasHead() {
      return headBuilder_ != null || head_ != null;
    }
    /**
     * <code>.ResponseHead head = 1;</code>
     * @return The head.
     */
    public ResponseHead getHead() {
      if (headBuilder_ == null) {
        return head_ == null ? ResponseHead.getDefaultInstance() : head_;
      } else {
        return headBuilder_.getMessage();
      }
    }
    /**
     * <code>.ResponseHead head = 1;</code>
     */
    public Builder setHead(ResponseHead value) {
      if (headBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        head_ = value;
        onChanged();
      } else {
        headBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ResponseHead head = 1;</code>
     */
    public Builder setHead(
        ResponseHead.Builder builderForValue) {
      if (headBuilder_ == null) {
        head_ = builderForValue.build();
        onChanged();
      } else {
        headBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ResponseHead head = 1;</code>
     */
    public Builder mergeHead(ResponseHead value) {
      if (headBuilder_ == null) {
        if (head_ != null) {
          head_ =
            ResponseHead.newBuilder(head_).mergeFrom(value).buildPartial();
        } else {
          head_ = value;
        }
        onChanged();
      } else {
        headBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ResponseHead head = 1;</code>
     */
    public Builder clearHead() {
      if (headBuilder_ == null) {
        head_ = null;
        onChanged();
      } else {
        head_ = null;
        headBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ResponseHead head = 1;</code>
     */
    public ResponseHead.Builder getHeadBuilder() {

      onChanged();
      return getHeadFieldBuilder().getBuilder();
    }
    /**
     * <code>.ResponseHead head = 1;</code>
     */
    public ResponseHeadOrBuilder getHeadOrBuilder() {
      if (headBuilder_ != null) {
        return headBuilder_.getMessageOrBuilder();
      } else {
        return head_ == null ?
            ResponseHead.getDefaultInstance() : head_;
      }
    }
    /**
     * <code>.ResponseHead head = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ResponseHead, ResponseHead.Builder, ResponseHeadOrBuilder>
        getHeadFieldBuilder() {
      if (headBuilder_ == null) {
        headBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ResponseHead, ResponseHead.Builder, ResponseHeadOrBuilder>(
                getHead(),
                getParentForChildren(),
                isClean());
        head_ = null;
      }
      return headBuilder_;
    }

    private Object primaryKey_ = "";
    /**
     * <code>string primary_key = 4;</code>
     * @return The primaryKey.
     */
    public String getPrimaryKey() {
      Object ref = primaryKey_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        primaryKey_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string primary_key = 4;</code>
     * @return The bytes for primaryKey.
     */
    public com.google.protobuf.ByteString
        getPrimaryKeyBytes() {
      Object ref = primaryKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        primaryKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string primary_key = 4;</code>
     * @param value The primaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryKey(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      primaryKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string primary_key = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrimaryKey() {

      primaryKey_ = getDefaultInstance().getPrimaryKey();
      onChanged();
      return this;
    }
    /**
     * <code>string primary_key = 4;</code>
     * @param value The bytes for primaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      primaryKey_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AddResponse)
  }

  // @@protoc_insertion_point(class_scope:AddResponse)
  private static final AddResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AddResponse();
  }

  public static AddResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddResponse>() {
    @Override
    public AddResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AddResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public AddResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

