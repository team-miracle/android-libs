// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/print.proto

package android.service.print;

/** @hide */
// message ActivePrintServiceProto
public final class ActivePrintServiceProto {

    // optional .android.content.ComponentNameProto component_name = 1;
    public static final long COMPONENT_NAME = 0x0000010b00000001L;

    // optional bool is_destroyed = 2;
    public static final long IS_DESTROYED = 0x0000010800000002L;

    // optional bool is_bound = 3;
    public static final long IS_BOUND = 0x0000010800000003L;

    // optional bool has_discovery_session = 4;
    public static final long HAS_DISCOVERY_SESSION = 0x0000010800000004L;

    // optional bool has_active_print_jobs = 5;
    public static final long HAS_ACTIVE_PRINT_JOBS = 0x0000010800000005L;

    // optional bool is_discovering_printers = 6;
    public static final long IS_DISCOVERING_PRINTERS = 0x0000010800000006L;

    // repeated .android.service.print.PrinterIdProto tracked_printers = 7;
    public static final long TRACKED_PRINTERS = 0x0000020b00000007L;

}
