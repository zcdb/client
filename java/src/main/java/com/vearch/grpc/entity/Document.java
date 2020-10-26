// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_model.proto

package com.vearch.grpc.entity;

/**
 * Protobuf type {@code Document}
 */
public final class Document extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Document)
    DocumentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Document.newBuilder() to construct.
  private Document(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Document() {
    pKey_ = "";
    fields_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Document();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Document(
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
          case 10: {
            String s = input.readStringRequireUtf8();

            pKey_ = s;
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
    return DataModel.internal_static_Document_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DataModel.internal_static_Document_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Document.class, Document.Builder.class);
  }

  public static final int P_KEY_FIELD_NUMBER = 1;
  private volatile Object pKey_;
  /**
   * <code>string p_key = 1;</code>
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
   * <code>string p_key = 1;</code>
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
    if (!getPKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pKey_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      output.writeMessage(2, fields_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pKey_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, fields_.get(i));
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
    if (!(obj instanceof Document)) {
      return super.equals(obj);
    }
    Document other = (Document) obj;

    if (!getPKey()
        .equals(other.getPKey())) return false;
    if (!getFieldsList()
        .equals(other.getFieldsList())) return false;
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
    hash = (37 * hash) + P_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPKey().hashCode();
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Document parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Document parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Document parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Document parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Document parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Document parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Document parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Document parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Document parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Document parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Document parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Document parseFrom(
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
  public static Builder newBuilder(Document prototype) {
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
   * Protobuf type {@code Document}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Document)
      DocumentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DataModel.internal_static_Document_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DataModel.internal_static_Document_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Document.class, Document.Builder.class);
    }

    // Construct using com.vearch.grpc.entity.Document.newBuilder()
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
      pKey_ = "";

      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fieldsBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DataModel.internal_static_Document_descriptor;
    }

    @Override
    public Document getDefaultInstanceForType() {
      return Document.getDefaultInstance();
    }

    @Override
    public Document build() {
      Document result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Document buildPartial() {
      Document result = new Document(this);
      int from_bitField0_ = bitField0_;
      result.pKey_ = pKey_;
      if (fieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fields_ = java.util.Collections.unmodifiableList(fields_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fields_ = fields_;
      } else {
        result.fields_ = fieldsBuilder_.build();
      }
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
      if (other instanceof Document) {
        return mergeFrom((Document)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Document other) {
      if (other == Document.getDefaultInstance()) return this;
      if (!other.getPKey().isEmpty()) {
        pKey_ = other.pKey_;
        onChanged();
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
      Document parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Document) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object pKey_ = "";
    /**
     * <code>string p_key = 1;</code>
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
     * <code>string p_key = 1;</code>
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
     * <code>string p_key = 1;</code>
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
     * <code>string p_key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPKey() {

      pKey_ = getDefaultInstance().getPKey();
      onChanged();
      return this;
    }
    /**
     * <code>string p_key = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:Document)
  }

  // @@protoc_insertion_point(class_scope:Document)
  private static final Document DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Document();
  }

  public static Document getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Document>
      PARSER = new com.google.protobuf.AbstractParser<Document>() {
    @Override
    public Document parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Document(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Document> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Document> getParserForType() {
    return PARSER;
  }

  @Override
  public Document getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

