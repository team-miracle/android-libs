// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/activitymanagerservice.proto

package com.android.server.am;

/** @hide */
// message StickyBroadcastProto
public final class StickyBroadcastProto {

    // message StickyAction
    public final class StickyAction {

        // optional string name = 1;
        public static final long NAME = 0x0000010900000001L;

        // repeated .android.content.IntentProto intents = 2;
        public static final long INTENTS = 0x0000020b00000002L;

    }

    // optional int32 user = 1;
    public static final long USER = 0x0000010500000001L;

    // repeated .com.android.server.am.StickyBroadcastProto.StickyAction actions = 2;
    public static final long ACTIONS = 0x0000020b00000002L;

}

