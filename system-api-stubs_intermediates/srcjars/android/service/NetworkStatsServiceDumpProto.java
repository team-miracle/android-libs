// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/netstats.proto

package android.service;

/** @hide */
// message NetworkStatsServiceDumpProto
public final class NetworkStatsServiceDumpProto {

    // repeated .android.service.NetworkInterfaceProto active_interfaces = 1;
    public static final long ACTIVE_INTERFACES = 0x0000020b00000001L;

    // repeated .android.service.NetworkInterfaceProto active_uid_interfaces = 2;
    public static final long ACTIVE_UID_INTERFACES = 0x0000020b00000002L;

    // optional .android.service.NetworkStatsRecorderProto dev_stats = 3;
    public static final long DEV_STATS = 0x0000010b00000003L;

    // optional .android.service.NetworkStatsRecorderProto xt_stats = 4;
    public static final long XT_STATS = 0x0000010b00000004L;

    // optional .android.service.NetworkStatsRecorderProto uid_stats = 5;
    public static final long UID_STATS = 0x0000010b00000005L;

    // optional .android.service.NetworkStatsRecorderProto uid_tag_stats = 6;
    public static final long UID_TAG_STATS = 0x0000010b00000006L;

}

