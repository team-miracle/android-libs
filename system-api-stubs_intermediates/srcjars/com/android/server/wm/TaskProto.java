// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/windowmanagerservice.proto

package com.android.server.wm;

/** @hide */
// message TaskProto
public final class TaskProto {

    // optional .com.android.server.wm.WindowContainerProto window_container = 1;
    public static final long WINDOW_CONTAINER = 0x0000010b00000001L;

    // optional int32 id = 2;
    public static final long ID = 0x0000010500000002L;

    // repeated .com.android.server.wm.AppWindowTokenProto app_window_tokens = 3;
    public static final long APP_WINDOW_TOKENS = 0x0000020b00000003L;

    // optional bool fills_parent = 4;
    public static final long FILLS_PARENT = 0x0000010800000004L;

    // optional .android.graphics.RectProto bounds = 5;
    public static final long BOUNDS = 0x0000010b00000005L;

    // optional .android.graphics.RectProto temp_inset_bounds = 6;
    public static final long TEMP_INSET_BOUNDS = 0x0000010b00000006L;

    // optional bool defer_removal = 7;
    public static final long DEFER_REMOVAL = 0x0000010800000007L;

}
