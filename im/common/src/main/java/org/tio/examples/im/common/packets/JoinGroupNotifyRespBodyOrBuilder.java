// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

public interface JoinGroupNotifyRespBodyOrBuilder extends
		// @@protoc_insertion_point(interface_extends:JoinGroupNotifyRespBody)
		com.google.protobuf.MessageOrBuilder {

	/**
	 * <code>.Client client = 1;</code>
	 */
	org.tio.examples.im.common.packets.Client getClient();

	/**
	 * <code>.Client client = 1;</code>
	 */
	org.tio.examples.im.common.packets.ClientOrBuilder getClientOrBuilder();

	/**
	 * <code>string group = 2;</code>
	 */
	java.lang.String getGroup();

	/**
	 * <code>string group = 2;</code>
	 */
	com.google.protobuf.ByteString getGroupBytes();

	/**
	 * <code>.Client client = 1;</code>
	 */
	boolean hasClient();
}
