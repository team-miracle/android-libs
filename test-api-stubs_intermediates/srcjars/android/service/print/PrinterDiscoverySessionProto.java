// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/print.proto

package android.service.print;

/** @hide */
// message PrinterDiscoverySessionProto
public final class PrinterDiscoverySessionProto {

    // optional bool is_destroyed = 1;
    public static final long IS_DESTROYED = 0x0000010800000001L;

    // optional bool is_printer_discovery_in_progress = 2;
    public static final long IS_PRINTER_DISCOVERY_IN_PROGRESS = 0x0000010800000002L;

    // repeated string printer_discovery_observers = 3;
    public static final long PRINTER_DISCOVERY_OBSERVERS = 0x0000020900000003L;

    // repeated string discovery_requests = 4;
    public static final long DISCOVERY_REQUESTS = 0x0000020900000004L;

    // repeated .android.service.print.PrinterIdProto tracked_printer_requests = 5;
    public static final long TRACKED_PRINTER_REQUESTS = 0x0000020b00000005L;

    // repeated .android.service.print.PrinterInfoProto printer = 6;
    public static final long PRINTER = 0x0000020b00000006L;

}

