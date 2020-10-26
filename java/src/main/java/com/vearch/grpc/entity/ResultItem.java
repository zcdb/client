// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: router_grpc.proto

package com.vearch.grpc.entity;

/**
 * Protobuf type {@code ResultItem}
 */
public final class ResultItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ResultItem)
    ResultItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultItem.newBuilder() to construct.
  private ResultItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultItem() {
    fields_ = java.util.Collections.emptyList();
    extra_ = "";
    pKey_ = "";
    source_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResultItem();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResultItem(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 9: {

            score_ = input.readDouble();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fields_ = new java.util.ArrayList<Field>();
              mutable_bitField0_ |= 0x00000001;
            }
            fields_.add(
                input.readMessage(Field.parser(), extensionRegistry));
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            extra_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            pKey_ = s;
            break;
          }
          case 42: {

            source_ = input.readBytes();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fields_ = java.util.Collections.unmodifiableList(fields_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return RouterGrpc.internal_static_ResultItem_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RouterGrpc.internal_static_ResultItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ResultItem.class, ResultItem.Builder.class);
  }

  public static final int SCORE_FIELD_NUMBER = 1;
  private double score_;
  /**
   * <code>double score = 1;</code>
   * @return The score.
   */
  @Override
  public double getScore() {
    return score_;
  }

  public static final int FIELDS_FIELD_NUMBER = 2;
  private java.util.List<Field> fields_;
  /**
   * <code>repeated .Field fields = 2;</code>
   */
  @Override
  public java.util.List<Field> getFieldsList() {
    return fields_;
  }
  /**
   * <code>repeated .Field fields = 2;</code>
   */
  @Override
  public java.util.List<? extends FieldOrBuilder>
      getFieldsOrBuilderList() {
    return fields_;
  }
  /**
   * <code>repeated .Field fields = 2;</code>
   */
  @Override
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <code>repeated .Field fields = 2;</code>
   */
  @Override
  public Field getFields(int index) {
    return fields_.get(index);
  }
  /**
   * <code>repeated .Field fields = 2;</code>
   */
  @Override
  public FieldOrBuilder getFieldsOrBuilder(
      int index) {
    return fields_.get(index);
  }

  public static final int EXTRA_FIELD_NUMBER = 3;
  private volatile Object extra_;
  /**
   * <code>string extra = 3;</code>
   * @return The extra.
   */
  @Override
  public String getExtra() {
    Object ref = extra_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      extra_ = s;
      return s;
    }
  }
  /**
   * <code>string extra = 3;</code>
   * @return The bytes for extra.
   */
  @Override
  public com.google.protobuf.ByteString
      getExtraBytes() {
    Object ref = extra_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      extra_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int P_KEY_FIELD_NUMBER = 4;
  private volatile Object pKey_;
  /**
   * <code>string p_key = 4;</code>
   * @return The pKey.
   */
  @Override
  public String getPKey() {
    Object ref = pKey_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      pKey_ = s;
      return s;
    }
  }
  /**
   * <code>string p_key = 4;</code>
   * @return The bytes for pKey.
   */
  @Override
  public com.google.protobuf.ByteString
      getPKeyBytes() {
    Object ref = pKey_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      pKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString source_;
  /**
   * <code>bytes source = 5;</code>
   * @return The source.
   */
  @Override
  public com.google.protobuf.ByteString getSource() {
    return source_;
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
    if (score_ != 0D) {
      output.writeDouble(1, score_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      output.writeMessage(2, fields_.get(i));
    }
    if (!getExtraBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, extra_);
    }
    if (!getPKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pKey_);
    }
    if (!source_.isEmpty()) {
      output.writeBytes(5, source_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (score_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, score_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, fields_.get(i));
    }
    if (!getExtraBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, extra_);
    }
    if (!getPKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pKey_);
    }
    if (!source_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, source_);
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
    if (!(obj instanceof ResultItem)) {
      return super.equals(obj);
    }
    ResultItem other = (ResultItem) obj;

    if (Double.doubleToLongBits(getScore())
        != Double.doubleToLongBits(
            other.getScore())) return false;
    if (!getFieldsList()
        .equals(other.getFieldsList())) return false;
    if (!getExtra()
        .equals(other.getExtra())) return false;
    if (!getPKey()
        .equals(other.getPKey())) return false;
    if (!getSource()
        .equals(other.getSource())) return false;
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getScore()));
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    hash = (37 * hash) + EXTRA_FIELD_NUMBER;
    hash = (53 * hash) + getExtra().hashCode();
    hash = (37 * hash) + P_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPKey().hashCode();
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ResultItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResultItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResultItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResultItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResultItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResultItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResultItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ResultItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ResultItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ResultItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ResultItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ResultItem parseFrom(
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
  public static Builder newBuilder(ResultItem prototype) {
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
   * Protobuf type {@code ResultItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ResultItem)
      ResultItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RouterGrpc.internal_static_ResultItem_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RouterGrpc.internal_static_ResultItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResultItem.class, ResultItem.Builder.class);
    }

    // Construct using com.vearch.grpc.entity.ResultItem.newBuilder()
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
        getFieldsFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      score_ = 0D;

      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fieldsBuilder_.clear();
      }
      extra_ = "";

      pKey_ = "";

      source_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RouterGrpc.internal_static_ResultItem_descriptor;
    }

    @Override
    public ResultItem getDefaultInstanceForType() {
      return ResultItem.getDefaultInstance();
    }

    @Override
    public ResultItem build() {
      ResultItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ResultItem buildPartial() {
      ResultItem result = new ResultItem(this);
      int from_bitField0_ = bitField0_;
      result.score_ = score_;
      if (fieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fields_ = java.util.Collections.unmodifiableList(fields_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fields_ = fields_;
      } else {
        result.fields_ = fieldsBuilder_.build();
      }
      result.extra_ = extra_;
      result.pKey_ = pKey_;
      result.source_ = source_;
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
      if (other instanceof ResultItem) {
        return mergeFrom((ResultItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ResultItem other) {
      if (other == ResultItem.getDefaultInstance()) return this;
      if (other.getScore() != 0D) {
        setScore(other.getScore());
      }
      if (fieldsBuilder_ == null) {
        if (!other.fields_.isEmpty()) {
          if (fields_.isEmpty()) {
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFieldsIsMutable();
            fields_.addAll(other.fields_);
          }
          onChanged();
        }
      } else {
        if (!other.fields_.isEmpty()) {
          if (fieldsBuilder_.isEmpty()) {
            fieldsBuilder_.dispose();
            fieldsBuilder_ = null;
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fieldsBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFieldsFieldBuilder() : null;
          } else {
            fieldsBuilder_.addAllMessages(other.fields_);
          }
        }
      }
      if (!other.getExtra().isEmpty()) {
        extra_ = other.extra_;
        onChanged();
      }
      if (!other.getPKey().isEmpty()) {
        pKey_ = other.pKey_;
        onChanged();
      }
      if (other.getSource() != com.google.protobuf.ByteString.EMPTY) {
        setSource(other.getSource());
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
      ResultItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ResultItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private double score_ ;
    /**
     * <code>double score = 1;</code>
     * @return The score.
     */
    @Override
    public double getScore() {
      return score_;
    }
    /**
     * <code>double score = 1;</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(double value) {

      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double score = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {

      score_ = 0D;
      onChanged();
      return this;
    }

    private java.util.List<Field> fields_ =
      java.util.Collections.emptyList();
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fields_ = new java.util.ArrayList<Field>(fields_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Field, Field.Builder, FieldOrBuilder> fieldsBuilder_;

    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public java.util.List<Field> getFieldsList() {
      if (fieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fields_);
      } else {
        return fieldsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public int getFieldsCount() {
      if (fieldsBuilder_ == null) {
        return fields_.size();
      } else {
        return fieldsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Field getFields(int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);
      } else {
        return fieldsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Builder setFields(
        int index, Field value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.set(index, value);
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Builder setFields(
        int index, Field.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.set(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Builder addFields(Field value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Builder addFields(
        int index, Field value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(index, value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Builder addFields(
        Field.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Builder addFields(
        int index, Field.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Builder addAllFields(
        Iterable<? extends Field> values) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fields_);
        onChanged();
      } else {
        fieldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Builder clearFields() {
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fieldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Builder removeFields(int index) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.remove(index);
        onChanged();
      } else {
        fieldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Field.Builder getFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public FieldOrBuilder getFieldsOrBuilder(
        int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);  } else {
        return fieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public java.util.List<? extends FieldOrBuilder>
         getFieldsOrBuilderList() {
      if (fieldsBuilder_ != null) {
        return fieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fields_);
      }
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Field.Builder addFieldsBuilder() {
      return getFieldsFieldBuilder().addBuilder(
          Field.getDefaultInstance());
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public Field.Builder addFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().addBuilder(
          index, Field.getDefaultInstance());
    }
    /**
     * <code>repeated .Field fields = 2;</code>
     */
    public java.util.List<Field.Builder>
         getFieldsBuilderList() {
      return getFieldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Field, Field.Builder, FieldOrBuilder>
        getFieldsFieldBuilder() {
      if (fieldsBuilder_ == null) {
        fieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Field, Field.Builder, FieldOrBuilder>(
                fields_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fields_ = null;
      }
      return fieldsBuilder_;
    }

    private Object extra_ = "";
    /**
     * <code>string extra = 3;</code>
     * @return The extra.
     */
    public String getExtra() {
      Object ref = extra_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        extra_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string extra = 3;</code>
     * @return The bytes for extra.
     */
    public com.google.protobuf.ByteString
        getExtraBytes() {
      Object ref = extra_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        extra_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extra = 3;</code>
     * @param value The extra to set.
     * @return This builder for chaining.
     */
    public Builder setExtra(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      extra_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string extra = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtra() {

      extra_ = getDefaultInstance().getExtra();
      onChanged();
      return this;
    }
    /**
     * <code>string extra = 3;</code>
     * @param value The bytes for extra to set.
     * @return This builder for chaining.
     */
    public Builder setExtraBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      extra_ = value;
      onChanged();
      return this;
    }

    private Object pKey_ = "";
    /**
     * <code>string p_key = 4;</code>
     * @return The pKey.
     */
    public String getPKey() {
      Object ref = pKey_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        pKey_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string p_key = 4;</code>
     * @return The bytes for pKey.
     */
    public com.google.protobuf.ByteString
        getPKeyBytes() {
      Object ref = pKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        pKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string p_key = 4;</code>
     * @param value The pKey to set.
     * @return This builder for chaining.
     */
    public Builder setPKey(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      pKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string p_key = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPKey() {

      pKey_ = getDefaultInstance().getPKey();
      onChanged();
      return this;
    }
    /**
     * <code>string p_key = 4;</code>
     * @param value The bytes for pKey to set.
     * @return This builder for chaining.
     */
    public Builder setPKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      pKey_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString source_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes source = 5;</code>
     * @return The source.
     */
    @Override
    public com.google.protobuf.ByteString getSource() {
      return source_;
    }
    /**
     * <code>bytes source = 5;</code>
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }

      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes source = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSource() {

      source_ = getDefaultInstance().getSource();
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


    // @@protoc_insertion_point(builder_scope:ResultItem)
  }

  // @@protoc_insertion_point(class_scope:ResultItem)
  private static final ResultItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ResultItem();
  }

  public static ResultItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultItem>
      PARSER = new com.google.protobuf.AbstractParser<ResultItem>() {
    @Override
    public ResultItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResultItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResultItem> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ResultItem> getParserForType() {
    return PARSER;
  }

  @Override
  public ResultItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

