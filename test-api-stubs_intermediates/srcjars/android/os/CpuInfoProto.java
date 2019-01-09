// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/os/cpuinfo.proto

package android.os;

/** @hide */
// message CpuInfoProto
public final class CpuInfoProto {

    // message TaskStats
    public final class TaskStats {

        // optional int32 total = 1;
        public static final long TOTAL = 0x0000010500000001L;

        // optional int32 running = 2;
        public static final long RUNNING = 0x0000010500000002L;

        // optional int32 sleeping = 3;
        public static final long SLEEPING = 0x0000010500000003L;

        // optional int32 stopped = 4;
        public static final long STOPPED = 0x0000010500000004L;

        // optional int32 zombie = 5;
        public static final long ZOMBIE = 0x0000010500000005L;

    }

    // message MemStats
    public final class MemStats {

        // optional int32 total = 1;
        public static final long TOTAL = 0x0000010500000001L;

        // optional int32 used = 2;
        public static final long USED = 0x0000010500000002L;

        // optional int32 free = 3;
        public static final long FREE = 0x0000010500000003L;

        // optional int32 buffers = 4;
        public static final long BUFFERS = 0x0000010500000004L;

        // optional int32 cached = 5;
        public static final long CACHED = 0x0000010500000005L;

    }

    // message CpuUsage
    public final class CpuUsage {

        // optional int32 cpu = 1;
        public static final long CPU = 0x0000010500000001L;

        // optional int32 user = 2;
        public static final long USER = 0x0000010500000002L;

        // optional int32 nice = 3;
        public static final long NICE = 0x0000010500000003L;

        // optional int32 sys = 4;
        public static final long SYS = 0x0000010500000004L;

        // optional int32 idle = 5;
        public static final long IDLE = 0x0000010500000005L;

        // optional int32 iow = 6;
        public static final long IOW = 0x0000010500000006L;

        // optional int32 irq = 7;
        public static final long IRQ = 0x0000010500000007L;

        // optional int32 sirq = 8;
        public static final long SIRQ = 0x0000010500000008L;

        // optional int32 host = 9;
        public static final long HOST = 0x0000010500000009L;

    }

    // message Task
    public final class Task {

        // enum Status
        public static final int STATUS_UNKNOWN = 0;
        public static final int STATUS_D = 1;
        public static final int STATUS_R = 2;
        public static final int STATUS_S = 3;
        public static final int STATUS_T = 4;
        public static final int STATUS_Z = 5;

        // enum Policy
        public static final int POLICY_UNKNOWN = 0;
        public static final int POLICY_FG = 1;
        public static final int POLICY_BG = 2;
        public static final int POLICY_TA = 3;

        // optional int32 pid = 1;
        public static final long PID = 0x0000010500000001L;

        // optional int32 tid = 2;
        public static final long TID = 0x0000010500000002L;

        // optional string user = 3;
        public static final long USER = 0x0000010900000003L;

        // optional string pr = 4;
        public static final long PR = 0x0000010900000004L;

        // optional sint32 ni = 5;
        public static final long NI = 0x0000011100000005L;

        // optional float cpu = 6;
        public static final long CPU = 0x0000010200000006L;

        // optional .android.os.CpuInfoProto.Task.Status s = 7;
        public static final long S = 0x0000010e00000007L;

        // optional string virt = 8;
        public static final long VIRT = 0x0000010900000008L;

        // optional string res = 9;
        public static final long RES = 0x0000010900000009L;

        // optional .android.os.CpuInfoProto.Task.Policy pcy = 10;
        public static final long PCY = 0x0000010e0000000aL;

        // optional string cmd = 11;
        public static final long CMD = 0x000001090000000bL;

        // optional string name = 12;
        public static final long NAME = 0x000001090000000cL;

    }

    // optional .android.os.CpuInfoProto.TaskStats task_stats = 1;
    public static final long TASK_STATS = 0x0000010b00000001L;

    // optional .android.os.CpuInfoProto.MemStats mem = 2;
    public static final long MEM = 0x0000010b00000002L;

    // optional .android.os.CpuInfoProto.MemStats swap = 3;
    public static final long SWAP = 0x0000010b00000003L;

    // optional .android.os.CpuInfoProto.CpuUsage cpu_usage = 4;
    public static final long CPU_USAGE = 0x0000010b00000004L;

    // repeated .android.os.CpuInfoProto.Task tasks = 5;
    public static final long TASKS = 0x0000020b00000005L;

}

