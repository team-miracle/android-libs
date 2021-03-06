// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/os/kernelwake.proto

package android.os;

/** @hide */
// message KernelWakeSourcesProto
public final class KernelWakeSourcesProto {

    // message WakeupSource
    public final class WakeupSource {

        // optional string name = 1;
        public static final long NAME = 0x0000010900000001L;

        // optional int32 active_count = 2;
        public static final long ACTIVE_COUNT = 0x0000010500000002L;

        // optional int32 event_count = 3;
        public static final long EVENT_COUNT = 0x0000010500000003L;

        // optional int32 wakeup_count = 4;
        public static final long WAKEUP_COUNT = 0x0000010500000004L;

        // optional int32 expire_count = 5;
        public static final long EXPIRE_COUNT = 0x0000010500000005L;

        // optional int64 active_since = 6;
        public static final long ACTIVE_SINCE = 0x0000010300000006L;

        // optional int64 total_time = 7;
        public static final long TOTAL_TIME = 0x0000010300000007L;

        // optional int64 max_time = 8;
        public static final long MAX_TIME = 0x0000010300000008L;

        // optional int64 last_change = 9;
        public static final long LAST_CHANGE = 0x0000010300000009L;

        // optional int64 prevent_suspend_time = 10;
        public static final long PREVENT_SUSPEND_TIME = 0x000001030000000aL;

    }

    // repeated .android.os.KernelWakeSourcesProto.WakeupSource wakeup_sources = 1;
    public static final long WAKEUP_SOURCES = 0x0000020b00000001L;

}

