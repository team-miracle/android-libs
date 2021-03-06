// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/procstats.proto

package android.service.procstats;

/** @hide */
// message ProcessStatsSectionProto
public final class ProcessStatsSectionProto {

    // enum Status
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_COMPLETE = 1;
    public static final int STATUS_PARTIAL = 2;
    public static final int STATUS_SHUTDOWN = 3;
    public static final int STATUS_SYSPROPS = 4;

    // optional int64 start_realtime_ms = 1;
    public static final long START_REALTIME_MS = 0x0000010300000001L;

    // optional int64 end_realtime_ms = 2;
    public static final long END_REALTIME_MS = 0x0000010300000002L;

    // optional int64 start_uptime_ms = 3;
    public static final long START_UPTIME_MS = 0x0000010300000003L;

    // optional int64 end_uptime_ms = 4;
    public static final long END_UPTIME_MS = 0x0000010300000004L;

    // optional string runtime = 5;
    public static final long RUNTIME = 0x0000010900000005L;

    // optional bool has_swapped_pss = 6;
    public static final long HAS_SWAPPED_PSS = 0x0000010800000006L;

    // repeated .android.service.procstats.ProcessStatsSectionProto.Status status = 7;
    public static final long STATUS = 0x0000020e00000007L;

    // repeated .android.service.procstats.ProcessStatsProto process_stats = 8;
    public static final long PROCESS_STATS = 0x0000020b00000008L;

}

