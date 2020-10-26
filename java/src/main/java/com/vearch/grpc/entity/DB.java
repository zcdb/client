// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_model.proto

package com.vearch.grpc.entity;

/**
 * Protobuf type {@code DB}
 */
public final class DB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DB)
    DBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DB.newBuilder() to construct.
  private DB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DB() {
    name_ = "";
    tables_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new DB();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DB(
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

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tables_ = new java.util.ArrayList<Table>();
              mutable_bitField0_ |= 0x00000001;
            }
            tables_.add(
                input.readMessage(Table.parser(), extensionRegistry));
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              userPasswordPair_ = com.google.protobuf.MapField.newMapField(
                  UserPasswordPairDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<String, String>
            userPasswordPair__ = input.readMessage(
                UserPasswordPairDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            userPasswordPair_.getMutableMap().put(
                userPasswordPair__.getKey(), userPasswordPair__.getValue());
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
        tables_ = java.util.Collections.unmodifiableList(tables_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return DataModel.internal_static_DB_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetUserPasswordPair();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DataModel.internal_static_DB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DB.class, DB.Builder.class);
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

  public static final int TABLES_FIELD_NUMBER = 2;
  private java.util.List<Table> tables_;
  /**
   * <code>repeated .Table tables = 2;</code>
   */
  @Override
  public java.util.List<Table> getTablesList() {
    return tables_;
  }
  /**
   * <code>repeated .Table tables = 2;</code>
   */
  @Override
  public java.util.List<? extends TableOrBuilder>
      getTablesOrBuilderList() {
    return tables_;
  }
  /**
   * <code>repeated .Table tables = 2;</code>
   */
  @Override
  public int getTablesCount() {
    return tables_.size();
  }
  /**
   * <code>repeated .Table tables = 2;</code>
   */
  @Override
  public Table getTables(int index) {
    return tables_.get(index);
  }
  /**
   * <code>repeated .Table tables = 2;</code>
   */
  @Override
  public TableOrBuilder getTablesOrBuilder(
      int index) {
    return tables_.get(index);
  }

  public static final int USER_PASSWORD_PAIR_FIELD_NUMBER = 3;
  private static final class UserPasswordPairDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, String> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, String>newDefaultInstance(
                DataModel.internal_static_DB_UserPasswordPairEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      String, String> userPasswordPair_;
  private com.google.protobuf.MapField<String, String>
  internalGetUserPasswordPair() {
    if (userPasswordPair_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          UserPasswordPairDefaultEntryHolder.defaultEntry);
    }
    return userPasswordPair_;
  }

  public int getUserPasswordPairCount() {
    return internalGetUserPasswordPair().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
   */

  @Override
  public boolean containsUserPasswordPair(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    return internalGetUserPasswordPair().getMap().containsKey(key);
  }
  /**
   * Use {@link #getUserPasswordPairMap()} instead.
   */
  @Override
  @Deprecated
  public java.util.Map<String, String> getUserPasswordPair() {
    return getUserPasswordPairMap();
  }
  /**
   * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
   */
  @Override

  public java.util.Map<String, String> getUserPasswordPairMap() {
    return internalGetUserPasswordPair().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
   */
  @Override

  public String getUserPasswordPairOrDefault(
      String key,
      String defaultValue) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetUserPasswordPair().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
   */
  @Override

  public String getUserPasswordPairOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetUserPasswordPair().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
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
    for (int i = 0; i < tables_.size(); i++) {
      output.writeMessage(2, tables_.get(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetUserPasswordPair(),
        UserPasswordPairDefaultEntryHolder.defaultEntry,
        3);
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
    for (int i = 0; i < tables_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, tables_.get(i));
    }
    for (java.util.Map.Entry<String, String> entry
         : internalGetUserPasswordPair().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, String>
      userPasswordPair__ = UserPasswordPairDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, userPasswordPair__);
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
    if (!(obj instanceof DB)) {
      return super.equals(obj);
    }
    DB other = (DB) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getTablesList()
        .equals(other.getTablesList())) return false;
    if (!internalGetUserPasswordPair().equals(
        other.internalGetUserPasswordPair())) return false;
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
    if (getTablesCount() > 0) {
      hash = (37 * hash) + TABLES_FIELD_NUMBER;
      hash = (53 * hash) + getTablesList().hashCode();
    }
    if (!internalGetUserPasswordPair().getMap().isEmpty()) {
      hash = (37 * hash) + USER_PASSWORD_PAIR_FIELD_NUMBER;
      hash = (53 * hash) + internalGetUserPasswordPair().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static DB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static DB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DB parseFrom(
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
  public static Builder newBuilder(DB prototype) {
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
   * Protobuf type {@code DB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DB)
      DBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DataModel.internal_static_DB_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetUserPasswordPair();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableUserPasswordPair();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DataModel.internal_static_DB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DB.class, DB.Builder.class);
    }

    // Construct using com.vearch.grpc.entity.DB.newBuilder()
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
        getTablesFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (tablesBuilder_ == null) {
        tables_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tablesBuilder_.clear();
      }
      internalGetMutableUserPasswordPair().clear();
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DataModel.internal_static_DB_descriptor;
    }

    @Override
    public DB getDefaultInstanceForType() {
      return DB.getDefaultInstance();
    }

    @Override
    public DB build() {
      DB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DB buildPartial() {
      DB result = new DB(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (tablesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tables_ = java.util.Collections.unmodifiableList(tables_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tables_ = tables_;
      } else {
        result.tables_ = tablesBuilder_.build();
      }
      result.userPasswordPair_ = internalGetUserPasswordPair();
      result.userPasswordPair_.makeImmutable();
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
      if (other instanceof DB) {
        return mergeFrom((DB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DB other) {
      if (other == DB.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (tablesBuilder_ == null) {
        if (!other.tables_.isEmpty()) {
          if (tables_.isEmpty()) {
            tables_ = other.tables_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTablesIsMutable();
            tables_.addAll(other.tables_);
          }
          onChanged();
        }
      } else {
        if (!other.tables_.isEmpty()) {
          if (tablesBuilder_.isEmpty()) {
            tablesBuilder_.dispose();
            tablesBuilder_ = null;
            tables_ = other.tables_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tablesBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTablesFieldBuilder() : null;
          } else {
            tablesBuilder_.addAllMessages(other.tables_);
          }
        }
      }
      internalGetMutableUserPasswordPair().mergeFrom(
          other.internalGetUserPasswordPair());
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
      DB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (DB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private java.util.List<Table> tables_ =
      java.util.Collections.emptyList();
    private void ensureTablesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tables_ = new java.util.ArrayList<Table>(tables_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Table, Table.Builder, TableOrBuilder> tablesBuilder_;

    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public java.util.List<Table> getTablesList() {
      if (tablesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tables_);
      } else {
        return tablesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public int getTablesCount() {
      if (tablesBuilder_ == null) {
        return tables_.size();
      } else {
        return tablesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Table getTables(int index) {
      if (tablesBuilder_ == null) {
        return tables_.get(index);
      } else {
        return tablesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Builder setTables(
        int index, Table value) {
      if (tablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTablesIsMutable();
        tables_.set(index, value);
        onChanged();
      } else {
        tablesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Builder setTables(
        int index, Table.Builder builderForValue) {
      if (tablesBuilder_ == null) {
        ensureTablesIsMutable();
        tables_.set(index, builderForValue.build());
        onChanged();
      } else {
        tablesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Builder addTables(Table value) {
      if (tablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTablesIsMutable();
        tables_.add(value);
        onChanged();
      } else {
        tablesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Builder addTables(
        int index, Table value) {
      if (tablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTablesIsMutable();
        tables_.add(index, value);
        onChanged();
      } else {
        tablesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Builder addTables(
        Table.Builder builderForValue) {
      if (tablesBuilder_ == null) {
        ensureTablesIsMutable();
        tables_.add(builderForValue.build());
        onChanged();
      } else {
        tablesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Builder addTables(
        int index, Table.Builder builderForValue) {
      if (tablesBuilder_ == null) {
        ensureTablesIsMutable();
        tables_.add(index, builderForValue.build());
        onChanged();
      } else {
        tablesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Builder addAllTables(
        Iterable<? extends Table> values) {
      if (tablesBuilder_ == null) {
        ensureTablesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tables_);
        onChanged();
      } else {
        tablesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Builder clearTables() {
      if (tablesBuilder_ == null) {
        tables_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tablesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Builder removeTables(int index) {
      if (tablesBuilder_ == null) {
        ensureTablesIsMutable();
        tables_.remove(index);
        onChanged();
      } else {
        tablesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Table.Builder getTablesBuilder(
        int index) {
      return getTablesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public TableOrBuilder getTablesOrBuilder(
        int index) {
      if (tablesBuilder_ == null) {
        return tables_.get(index);  } else {
        return tablesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public java.util.List<? extends TableOrBuilder>
         getTablesOrBuilderList() {
      if (tablesBuilder_ != null) {
        return tablesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tables_);
      }
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Table.Builder addTablesBuilder() {
      return getTablesFieldBuilder().addBuilder(
          Table.getDefaultInstance());
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public Table.Builder addTablesBuilder(
        int index) {
      return getTablesFieldBuilder().addBuilder(
          index, Table.getDefaultInstance());
    }
    /**
     * <code>repeated .Table tables = 2;</code>
     */
    public java.util.List<Table.Builder>
         getTablesBuilderList() {
      return getTablesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Table, Table.Builder, TableOrBuilder>
        getTablesFieldBuilder() {
      if (tablesBuilder_ == null) {
        tablesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Table, Table.Builder, TableOrBuilder>(
                tables_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tables_ = null;
      }
      return tablesBuilder_;
    }

    private com.google.protobuf.MapField<
        String, String> userPasswordPair_;
    private com.google.protobuf.MapField<String, String>
    internalGetUserPasswordPair() {
      if (userPasswordPair_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            UserPasswordPairDefaultEntryHolder.defaultEntry);
      }
      return userPasswordPair_;
    }
    private com.google.protobuf.MapField<String, String>
    internalGetMutableUserPasswordPair() {
      onChanged();;
      if (userPasswordPair_ == null) {
        userPasswordPair_ = com.google.protobuf.MapField.newMapField(
            UserPasswordPairDefaultEntryHolder.defaultEntry);
      }
      if (!userPasswordPair_.isMutable()) {
        userPasswordPair_ = userPasswordPair_.copy();
      }
      return userPasswordPair_;
    }

    public int getUserPasswordPairCount() {
      return internalGetUserPasswordPair().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
     */

    @Override
    public boolean containsUserPasswordPair(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetUserPasswordPair().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUserPasswordPairMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<String, String> getUserPasswordPair() {
      return getUserPasswordPairMap();
    }
    /**
     * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
     */
    @Override

    public java.util.Map<String, String> getUserPasswordPairMap() {
      return internalGetUserPasswordPair().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
     */
    @Override

    public String getUserPasswordPairOrDefault(
        String key,
        String defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetUserPasswordPair().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
     */
    @Override

    public String getUserPasswordPairOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetUserPasswordPair().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearUserPasswordPair() {
      internalGetMutableUserPasswordPair().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
     */

    public Builder removeUserPasswordPair(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      internalGetMutableUserPasswordPair().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, String>
    getMutableUserPasswordPair() {
      return internalGetMutableUserPasswordPair().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
     */
    public Builder putUserPasswordPair(
        String key,
        String value) {
      if (key == null) { throw new NullPointerException(); }
      if (value == null) { throw new NullPointerException(); }
      internalGetMutableUserPasswordPair().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; user_password_pair = 3;</code>
     */

    public Builder putAllUserPasswordPair(
        java.util.Map<String, String> values) {
      internalGetMutableUserPasswordPair().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:DB)
  }

  // @@protoc_insertion_point(class_scope:DB)
  private static final DB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DB();
  }

  public static DB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DB>
      PARSER = new com.google.protobuf.AbstractParser<DB>() {
    @Override
    public DB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DB> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DB> getParserForType() {
    return PARSER;
  }

  @Override
  public DB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

