// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/activitymanagerservice.proto

package com.android.server.am;

/** @hide */
// message ProcessOomProto
public final class ProcessOomProto {

    // enum SchedGroup
    public static final int SCHED_GROUP_UNKNOWN = -1;
    public static final int SCHED_GROUP_BACKGROUND = 0;
    public static final int SCHED_GROUP_DEFAULT = 1;
    public static final int SCHED_GROUP_TOP_APP = 2;
    public static final int SCHED_GROUP_TOP_APP_BOUND = 3;

    // message Detail
    public final class Detail {

        // message CpuRunTime
        public final class CpuRunTime {

            // optional int64 over_ms = 1;
            public static final long OVER_MS = 0x0000010300000001L;

            // optional int64 used_ms = 2;
            public static final long USED_MS = 0x0000010300000002L;

            // optional float ultilization = 3;
            public static final long ULTILIZATION = 0x0000010200000003L;

        }

        // optional int32 max_adj = 1;
        public static final long MAX_ADJ = 0x0000010500000001L;

        // optional int32 cur_raw_adj = 2;
        public static final long CUR_RAW_ADJ = 0x0000010500000002L;

        // optional int32 set_raw_adj = 3;
        public static final long SET_RAW_ADJ = 0x0000010500000003L;

        // optional int32 cur_adj = 4;
        public static final long CUR_ADJ = 0x0000010500000004L;

        // optional int32 set_adj = 5;
        public static final long SET_ADJ = 0x0000010500000005L;

        // optional .android.app.ProcessStateEnum current_state = 7;
        public static final long CURRENT_STATE = 0x0000010e00000007L;

        // optional .android.app.ProcessStateEnum set_state = 8;
        public static final long SET_STATE = 0x0000010e00000008L;

        // optional string last_pss = 9;
        public static final long LAST_PSS = 0x0000010900000009L;

        // optional string last_swap_pss = 10;
        public static final long LAST_SWAP_PSS = 0x000001090000000aL;

        // optional string last_cached_pss = 11;
        public static final long LAST_CACHED_PSS = 0x000001090000000bL;

        // optional bool cached = 12;
        public static final long CACHED = 0x000001080000000cL;

        // optional bool empty = 13;
        public static final long EMPTY = 0x000001080000000dL;

        // optional bool has_above_client = 14;
        public static final long HAS_ABOVE_CLIENT = 0x000001080000000eL;

        // optional .com.android.server.am.ProcessOomProto.Detail.CpuRunTime service_run_time = 15;
        public static final long SERVICE_RUN_TIME = 0x0000010b0000000fL;

    }

    // optional bool persistent = 1;
    public static final long PERSISTENT = 0x0000010800000001L;

    // optional int32 num = 2;
    public static final long NUM = 0x0000010500000002L;

    // optional string oom_adj = 3;
    public static final long OOM_ADJ = 0x0000010900000003L;

    // optional .com.android.server.am.ProcessOomProto.SchedGroup sched_group = 4;
    public static final long SCHED_GROUP = 0x0000010e00000004L;

    // optional bool activities = 5;
    public static final long ACTIVITIES = 0x0000010800000005L;

    // optional bool services = 6;
    public static final long SERVICES = 0x0000010800000006L;

    // optional .android.app.ProcessStateEnum state = 7;
    public static final long STATE = 0x0000010e00000007L;

    // optional int32 trim_memory_level = 8;
    public static final long TRIM_MEMORY_LEVEL = 0x0000010500000008L;

    // optional .com.android.server.am.ProcessRecordProto proc = 9;
    public static final long PROC = 0x0000010b00000009L;

    // optional string adj_type = 10;
    public static final long ADJ_TYPE = 0x000001090000000aL;

    // optional .android.content.ComponentNameProto adj_target_component_name = 11;
    public static final long ADJ_TARGET_COMPONENT_NAME = 0x0000010b0000000bL;

    // optional string adj_target_object = 12;
    public static final long ADJ_TARGET_OBJECT = 0x000001090000000cL;

    // optional .com.android.server.am.ProcessRecordProto adj_source_proc = 13;
    public static final long ADJ_SOURCE_PROC = 0x0000010b0000000dL;

    // optional string adj_source_object = 14;
    public static final long ADJ_SOURCE_OBJECT = 0x000001090000000eL;

    // optional .com.android.server.am.ProcessOomProto.Detail detail = 15;
    public static final long DETAIL = 0x0000010b0000000fL;

}

