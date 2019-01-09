// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/statlogger.proto

package com.android.server;

/** @hide */
// message StatLoggerProto
public final class StatLoggerProto {

    // message Event
    public final class Event {

        // optional int32 eventId = 1;
        public static final long EVENT_ID = 0x0000010500000001L;

        // optional string label = 2;
        public static final long LABEL = 0x0000010900000002L;

        // optional int32 count = 3;
        public static final long COUNT = 0x0000010500000003L;

        // optional int64 total_duration_micros = 4;
        public static final long TOTAL_DURATION_MICROS = 0x0000010300000004L;

    }

    // repeated .com.android.server.StatLoggerProto.Event events = 1;
    public static final long EVENTS = 0x0000020b00000001L;

}
