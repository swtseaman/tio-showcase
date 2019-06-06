// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

/**
 * Protobuf type {@code Group}
 */
public  final class Group extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Group)
    GroupOrBuilder {
  // Use Group.newBuilder() to construct.
  private Group(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Group() {
    id_ = 0L;
    nick_ = "";
    avatar_ = "";
    total_ = 0;
    online_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Group(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nick_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            avatar_ = s;
            break;
          }
          case 32: {

            total_ = input.readInt32();
            break;
          }
          case 40: {

            online_ = input.readInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tio.examples.im.common.packets.Chat.internal_static_Group_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tio.examples.im.common.packets.Chat.internal_static_Group_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tio.examples.im.common.packets.Group.class, org.tio.examples.im.common.packets.Group.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <pre>
   *group id
   * </pre>
   *
   * <code>int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int NICK_FIELD_NUMBER = 2;
  private volatile java.lang.Object nick_;
  /**
   * <pre>
   *group nick
   * </pre>
   *
   * <code>string nick = 2;</code>
   */
  public java.lang.String getNick() {
    java.lang.Object ref = nick_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nick_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *group nick
   * </pre>
   *
   * <code>string nick = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNickBytes() {
    java.lang.Object ref = nick_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nick_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AVATAR_FIELD_NUMBER = 3;
  private volatile java.lang.Object avatar_;
  /**
   * <pre>
   *group头像
   * </pre>
   *
   * <code>string avatar = 3;</code>
   */
  public java.lang.String getAvatar() {
    java.lang.Object ref = avatar_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      avatar_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *group头像
   * </pre>
   *
   * <code>string avatar = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAvatarBytes() {
    java.lang.Object ref = avatar_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      avatar_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_FIELD_NUMBER = 4;
  private int total_;
  /**
   * <pre>
   *群组总人数
   * </pre>
   *
   * <code>int32 total = 4;</code>
   */
  public int getTotal() {
    return total_;
  }

  public static final int ONLINE_FIELD_NUMBER = 5;
  private int online_;
  /**
   * <pre>
   *群组在线人数
   * </pre>
   *
   * <code>int32 online = 5;</code>
   */
  public int getOnline() {
    return online_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getNickBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nick_);
    }
    if (!getAvatarBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, avatar_);
    }
    if (total_ != 0) {
      output.writeInt32(4, total_);
    }
    if (online_ != 0) {
      output.writeInt32(5, online_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getNickBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nick_);
    }
    if (!getAvatarBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, avatar_);
    }
    if (total_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, total_);
    }
    if (online_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, online_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tio.examples.im.common.packets.Group)) {
      return super.equals(obj);
    }
    org.tio.examples.im.common.packets.Group other = (org.tio.examples.im.common.packets.Group) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getNick()
        .equals(other.getNick());
    result = result && getAvatar()
        .equals(other.getAvatar());
    result = result && (getTotal()
        == other.getTotal());
    result = result && (getOnline()
        == other.getOnline());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + NICK_FIELD_NUMBER;
    hash = (53 * hash) + getNick().hashCode();
    hash = (37 * hash) + AVATAR_FIELD_NUMBER;
    hash = (53 * hash) + getAvatar().hashCode();
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + getTotal();
    hash = (37 * hash) + ONLINE_FIELD_NUMBER;
    hash = (53 * hash) + getOnline();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tio.examples.im.common.packets.Group parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tio.examples.im.common.packets.Group parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tio.examples.im.common.packets.Group parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tio.examples.im.common.packets.Group parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tio.examples.im.common.packets.Group parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tio.examples.im.common.packets.Group parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tio.examples.im.common.packets.Group parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tio.examples.im.common.packets.Group parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tio.examples.im.common.packets.Group parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tio.examples.im.common.packets.Group parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tio.examples.im.common.packets.Group prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Group}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Group)
      org.tio.examples.im.common.packets.GroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tio.examples.im.common.packets.Chat.internal_static_Group_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tio.examples.im.common.packets.Chat.internal_static_Group_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tio.examples.im.common.packets.Group.class, org.tio.examples.im.common.packets.Group.Builder.class);
    }

    // Construct using org.tio.examples.im.common.packets.Group.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;

      nick_ = "";

      avatar_ = "";

      total_ = 0;

      online_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tio.examples.im.common.packets.Chat.internal_static_Group_descriptor;
    }

    public org.tio.examples.im.common.packets.Group getDefaultInstanceForType() {
      return org.tio.examples.im.common.packets.Group.getDefaultInstance();
    }

    public org.tio.examples.im.common.packets.Group build() {
      org.tio.examples.im.common.packets.Group result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tio.examples.im.common.packets.Group buildPartial() {
      org.tio.examples.im.common.packets.Group result = new org.tio.examples.im.common.packets.Group(this);
      result.id_ = id_;
      result.nick_ = nick_;
      result.avatar_ = avatar_;
      result.total_ = total_;
      result.online_ = online_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tio.examples.im.common.packets.Group) {
        return mergeFrom((org.tio.examples.im.common.packets.Group)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tio.examples.im.common.packets.Group other) {
      if (other == org.tio.examples.im.common.packets.Group.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getNick().isEmpty()) {
        nick_ = other.nick_;
        onChanged();
      }
      if (!other.getAvatar().isEmpty()) {
        avatar_ = other.avatar_;
        onChanged();
      }
      if (other.getTotal() != 0) {
        setTotal(other.getTotal());
      }
      if (other.getOnline() != 0) {
        setOnline(other.getOnline());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tio.examples.im.common.packets.Group parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tio.examples.im.common.packets.Group) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     *group id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     *group id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *group id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object nick_ = "";
    /**
     * <pre>
     *group nick
     * </pre>
     *
     * <code>string nick = 2;</code>
     */
    public java.lang.String getNick() {
      java.lang.Object ref = nick_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nick_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *group nick
     * </pre>
     *
     * <code>string nick = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNickBytes() {
      java.lang.Object ref = nick_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nick_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *group nick
     * </pre>
     *
     * <code>string nick = 2;</code>
     */
    public Builder setNick(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nick_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *group nick
     * </pre>
     *
     * <code>string nick = 2;</code>
     */
    public Builder clearNick() {
      
      nick_ = getDefaultInstance().getNick();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *group nick
     * </pre>
     *
     * <code>string nick = 2;</code>
     */
    public Builder setNickBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nick_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object avatar_ = "";
    /**
     * <pre>
     *group头像
     * </pre>
     *
     * <code>string avatar = 3;</code>
     */
    public java.lang.String getAvatar() {
      java.lang.Object ref = avatar_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        avatar_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *group头像
     * </pre>
     *
     * <code>string avatar = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAvatarBytes() {
      java.lang.Object ref = avatar_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        avatar_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *group头像
     * </pre>
     *
     * <code>string avatar = 3;</code>
     */
    public Builder setAvatar(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      avatar_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *group头像
     * </pre>
     *
     * <code>string avatar = 3;</code>
     */
    public Builder clearAvatar() {
      
      avatar_ = getDefaultInstance().getAvatar();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *group头像
     * </pre>
     *
     * <code>string avatar = 3;</code>
     */
    public Builder setAvatarBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      avatar_ = value;
      onChanged();
      return this;
    }

    private int total_ ;
    /**
     * <pre>
     *群组总人数
     * </pre>
     *
     * <code>int32 total = 4;</code>
     */
    public int getTotal() {
      return total_;
    }
    /**
     * <pre>
     *群组总人数
     * </pre>
     *
     * <code>int32 total = 4;</code>
     */
    public Builder setTotal(int value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *群组总人数
     * </pre>
     *
     * <code>int32 total = 4;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0;
      onChanged();
      return this;
    }

    private int online_ ;
    /**
     * <pre>
     *群组在线人数
     * </pre>
     *
     * <code>int32 online = 5;</code>
     */
    public int getOnline() {
      return online_;
    }
    /**
     * <pre>
     *群组在线人数
     * </pre>
     *
     * <code>int32 online = 5;</code>
     */
    public Builder setOnline(int value) {
      
      online_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *群组在线人数
     * </pre>
     *
     * <code>int32 online = 5;</code>
     */
    public Builder clearOnline() {
      
      online_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Group)
  }

  // @@protoc_insertion_point(class_scope:Group)
  private static final org.tio.examples.im.common.packets.Group DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tio.examples.im.common.packets.Group();
  }

  public static org.tio.examples.im.common.packets.Group getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Group>
      PARSER = new com.google.protobuf.AbstractParser<Group>() {
    public Group parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Group(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Group> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Group> getParserForType() {
    return PARSER;
  }

  public org.tio.examples.im.common.packets.Group getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

