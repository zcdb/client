// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_model.proto

package com.vearch.grpc.entity;

/**
 * Protobuf type {@code Table}
 */
public final class Table extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Table)
    TableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Table.newBuilder() to construct.
  private Table(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Table() {
    name_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Table();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Table(
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
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            TableMetaInfo.Builder subBuilder = null;
            if (tableMetaInfo_ != null) {
              subBuilder = tableMetaInfo_.toBuilder();
            }
            tableMetaInfo_ = input.readMessage(TableMetaInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tableMetaInfo_);
              tableMetaInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            startIndexingSize_ = input.readInt32();
            break;
          }
          case 34: {
            Model.Builder subBuilder = null;
            if (model_ != null) {
              subBuilder = model_.toBuilder();
            }
            model_ = input.readMessage(Model.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(model_);
              model_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

            totalDocsSize_ = input.readInt64();
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
    return DataModel.internal_static_Table_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DataModel.internal_static_Table_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Table.class, Table.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @Override
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_META_INFO_FIELD_NUMBER = 2;
  private TableMetaInfo tableMetaInfo_;
  /**
   * <code>.TableMetaInfo table_meta_info = 2;</code>
   * @return Whether the tableMetaInfo field is set.
   */
  @Override
  public boolean hasTableMetaInfo() {
    return tableMetaInfo_ != null;
  }
  /**
   * <code>.TableMetaInfo table_meta_info = 2;</code>
   * @return The tableMetaInfo.
   */
  @Override
  public TableMetaInfo getTableMetaInfo() {
    return tableMetaInfo_ == null ? TableMetaInfo.getDefaultInstance() : tableMetaInfo_;
  }
  /**
   * <code>.TableMetaInfo table_meta_info = 2;</code>
   */
  @Override
  public TableMetaInfoOrBuilder getTableMetaInfoOrBuilder() {
    return getTableMetaInfo();
  }

  public static final int START_INDEXING_SIZE_FIELD_NUMBER = 3;
  private int startIndexingSize_;
  /**
   * <code>int32 start_indexing_size = 3;</code>
   * @return The startIndexingSize.
   */
  @Override
  public int getStartIndexingSize() {
    return startIndexingSize_;
  }

  public static final int MODEL_FIELD_NUMBER = 4;
  private Model model_;
  /**
   * <code>.Model model = 4;</code>
   * @return Whether the model field is set.
   */
  @Override
  public boolean hasModel() {
    return model_ != null;
  }
  /**
   * <code>.Model model = 4;</code>
   * @return The model.
   */
  @Override
  public Model getModel() {
    return model_ == null ? Model.getDefaultInstance() : model_;
  }
  /**
   * <code>.Model model = 4;</code>
   */
  @Override
  public ModelOrBuilder getModelOrBuilder() {
    return getModel();
  }

  public static final int TOTAL_DOCS_SIZE_FIELD_NUMBER = 5;
  private long totalDocsSize_;
  /**
   * <code>int64 total_docs_size = 5;</code>
   * @return The totalDocsSize.
   */
  @Override
  public long getTotalDocsSize() {
    return totalDocsSize_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (tableMetaInfo_ != null) {
      output.writeMessage(2, getTableMetaInfo());
    }
    if (startIndexingSize_ != 0) {
      output.writeInt32(3, startIndexingSize_);
    }
    if (model_ != null) {
      output.writeMessage(4, getModel());
    }
    if (totalDocsSize_ != 0L) {
      output.writeInt64(5, totalDocsSize_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (tableMetaInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTableMetaInfo());
    }
    if (startIndexingSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, startIndexingSize_);
    }
    if (model_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getModel());
    }
    if (totalDocsSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, totalDocsSize_);
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
    if (!(obj instanceof Table)) {
      return super.equals(obj);
    }
    Table other = (Table) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasTableMetaInfo() != other.hasTableMetaInfo()) return false;
    if (hasTableMetaInfo()) {
      if (!getTableMetaInfo()
          .equals(other.getTableMetaInfo())) return false;
    }
    if (getStartIndexingSize()
        != other.getStartIndexingSize()) return false;
    if (hasModel() != other.hasModel()) return false;
    if (hasModel()) {
      if (!getModel()
          .equals(other.getModel())) return false;
    }
    if (getTotalDocsSize()
        != other.getTotalDocsSize()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasTableMetaInfo()) {
      hash = (37 * hash) + TABLE_META_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getTableMetaInfo().hashCode();
    }
    hash = (37 * hash) + START_INDEXING_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getStartIndexingSize();
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    hash = (37 * hash) + TOTAL_DOCS_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalDocsSize());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Table parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Table parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Table parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Table parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Table parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Table parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Table parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Table parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Table parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Table parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Table parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Table parseFrom(
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
  public static Builder newBuilder(Table prototype) {
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
   * Protobuf type {@code Table}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Table)
      TableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DataModel.internal_static_Table_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DataModel.internal_static_Table_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Table.class, Table.Builder.class);
    }

    // Construct using com.vearch.grpc.entity.Table.newBuilder()
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
      name_ = "";

      if (tableMetaInfoBuilder_ == null) {
        tableMetaInfo_ = null;
      } else {
        tableMetaInfo_ = null;
        tableMetaInfoBuilder_ = null;
      }
      startIndexingSize_ = 0;

      if (modelBuilder_ == null) {
        model_ = null;
      } else {
        model_ = null;
        modelBuilder_ = null;
      }
      totalDocsSize_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DataModel.internal_static_Table_descriptor;
    }

    @Override
    public Table getDefaultInstanceForType() {
      return Table.getDefaultInstance();
    }

    @Override
    public Table build() {
      Table result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Table buildPartial() {
      Table result = new Table(this);
      result.name_ = name_;
      if (tableMetaInfoBuilder_ == null) {
        result.tableMetaInfo_ = tableMetaInfo_;
      } else {
        result.tableMetaInfo_ = tableMetaInfoBuilder_.build();
      }
      result.startIndexingSize_ = startIndexingSize_;
      if (modelBuilder_ == null) {
        result.model_ = model_;
      } else {
        result.model_ = modelBuilder_.build();
      }
      result.totalDocsSize_ = totalDocsSize_;
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
      if (other instanceof Table) {
        return mergeFrom((Table)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Table other) {
      if (other == Table.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasTableMetaInfo()) {
        mergeTableMetaInfo(other.getTableMetaInfo());
      }
      if (other.getStartIndexingSize() != 0) {
        setStartIndexingSize(other.getStartIndexingSize());
      }
      if (other.hasModel()) {
        mergeModel(other.getModel());
      }
      if (other.getTotalDocsSize() != 0L) {
        setTotalDocsSize(other.getTotalDocsSize());
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
      Table parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Table) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private TableMetaInfo tableMetaInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        TableMetaInfo, TableMetaInfo.Builder, TableMetaInfoOrBuilder> tableMetaInfoBuilder_;
    /**
     * <code>.TableMetaInfo table_meta_info = 2;</code>
     * @return Whether the tableMetaInfo field is set.
     */
    public boolean hasTableMetaInfo() {
      return tableMetaInfoBuilder_ != null || tableMetaInfo_ != null;
    }
    /**
     * <code>.TableMetaInfo table_meta_info = 2;</code>
     * @return The tableMetaInfo.
     */
    public TableMetaInfo getTableMetaInfo() {
      if (tableMetaInfoBuilder_ == null) {
        return tableMetaInfo_ == null ? TableMetaInfo.getDefaultInstance() : tableMetaInfo_;
      } else {
        return tableMetaInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.TableMetaInfo table_meta_info = 2;</code>
     */
    public Builder setTableMetaInfo(TableMetaInfo value) {
      if (tableMetaInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableMetaInfo_ = value;
        onChanged();
      } else {
        tableMetaInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.TableMetaInfo table_meta_info = 2;</code>
     */
    public Builder setTableMetaInfo(
        TableMetaInfo.Builder builderForValue) {
      if (tableMetaInfoBuilder_ == null) {
        tableMetaInfo_ = builderForValue.build();
        onChanged();
      } else {
        tableMetaInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.TableMetaInfo table_meta_info = 2;</code>
     */
    public Builder mergeTableMetaInfo(TableMetaInfo value) {
      if (tableMetaInfoBuilder_ == null) {
        if (tableMetaInfo_ != null) {
          tableMetaInfo_ =
            TableMetaInfo.newBuilder(tableMetaInfo_).mergeFrom(value).buildPartial();
        } else {
          tableMetaInfo_ = value;
        }
        onChanged();
      } else {
        tableMetaInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.TableMetaInfo table_meta_info = 2;</code>
     */
    public Builder clearTableMetaInfo() {
      if (tableMetaInfoBuilder_ == null) {
        tableMetaInfo_ = null;
        onChanged();
      } else {
        tableMetaInfo_ = null;
        tableMetaInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.TableMetaInfo table_meta_info = 2;</code>
     */
    public TableMetaInfo.Builder getTableMetaInfoBuilder() {

      onChanged();
      return getTableMetaInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.TableMetaInfo table_meta_info = 2;</code>
     */
    public TableMetaInfoOrBuilder getTableMetaInfoOrBuilder() {
      if (tableMetaInfoBuilder_ != null) {
        return tableMetaInfoBuilder_.getMessageOrBuilder();
      } else {
        return tableMetaInfo_ == null ?
            TableMetaInfo.getDefaultInstance() : tableMetaInfo_;
      }
    }
    /**
     * <code>.TableMetaInfo table_meta_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        TableMetaInfo, TableMetaInfo.Builder, TableMetaInfoOrBuilder>
        getTableMetaInfoFieldBuilder() {
      if (tableMetaInfoBuilder_ == null) {
        tableMetaInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            TableMetaInfo, TableMetaInfo.Builder, TableMetaInfoOrBuilder>(
                getTableMetaInfo(),
                getParentForChildren(),
                isClean());
        tableMetaInfo_ = null;
      }
      return tableMetaInfoBuilder_;
    }

    private int startIndexingSize_ ;
    /**
     * <code>int32 start_indexing_size = 3;</code>
     * @return The startIndexingSize.
     */
    @Override
    public int getStartIndexingSize() {
      return startIndexingSize_;
    }
    /**
     * <code>int32 start_indexing_size = 3;</code>
     * @param value The startIndexingSize to set.
     * @return This builder for chaining.
     */
    public Builder setStartIndexingSize(int value) {

      startIndexingSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 start_indexing_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartIndexingSize() {

      startIndexingSize_ = 0;
      onChanged();
      return this;
    }

    private Model model_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Model, Model.Builder, ModelOrBuilder> modelBuilder_;
    /**
     * <code>.Model model = 4;</code>
     * @return Whether the model field is set.
     */
    public boolean hasModel() {
      return modelBuilder_ != null || model_ != null;
    }
    /**
     * <code>.Model model = 4;</code>
     * @return The model.
     */
    public Model getModel() {
      if (modelBuilder_ == null) {
        return model_ == null ? Model.getDefaultInstance() : model_;
      } else {
        return modelBuilder_.getMessage();
      }
    }
    /**
     * <code>.Model model = 4;</code>
     */
    public Builder setModel(Model value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        model_ = value;
        onChanged();
      } else {
        modelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Model model = 4;</code>
     */
    public Builder setModel(
        Model.Builder builderForValue) {
      if (modelBuilder_ == null) {
        model_ = builderForValue.build();
        onChanged();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Model model = 4;</code>
     */
    public Builder mergeModel(Model value) {
      if (modelBuilder_ == null) {
        if (model_ != null) {
          model_ =
            Model.newBuilder(model_).mergeFrom(value).buildPartial();
        } else {
          model_ = value;
        }
        onChanged();
      } else {
        modelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Model model = 4;</code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        model_ = null;
        onChanged();
      } else {
        model_ = null;
        modelBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Model model = 4;</code>
     */
    public Model.Builder getModelBuilder() {

      onChanged();
      return getModelFieldBuilder().getBuilder();
    }
    /**
     * <code>.Model model = 4;</code>
     */
    public ModelOrBuilder getModelOrBuilder() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        return model_ == null ?
            Model.getDefaultInstance() : model_;
      }
    }
    /**
     * <code>.Model model = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Model, Model.Builder, ModelOrBuilder>
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Model, Model.Builder, ModelOrBuilder>(
                getModel(),
                getParentForChildren(),
                isClean());
        model_ = null;
      }
      return modelBuilder_;
    }

    private long totalDocsSize_ ;
    /**
     * <code>int64 total_docs_size = 5;</code>
     * @return The totalDocsSize.
     */
    @Override
    public long getTotalDocsSize() {
      return totalDocsSize_;
    }
    /**
     * <code>int64 total_docs_size = 5;</code>
     * @param value The totalDocsSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalDocsSize(long value) {

      totalDocsSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_docs_size = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalDocsSize() {

      totalDocsSize_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:Table)
  }

  // @@protoc_insertion_point(class_scope:Table)
  private static final Table DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Table();
  }

  public static Table getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Table>
      PARSER = new com.google.protobuf.AbstractParser<Table>() {
    @Override
    public Table parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Table(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Table> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Table> getParserForType() {
    return PARSER;
  }

  @Override
  public Table getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

