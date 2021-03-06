// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/jobscheduler.proto

package com.android.server.job;

/** @hide */
// message StateControllerProto
public final class StateControllerProto {

    // message BackgroundJobsController
    public final class BackgroundJobsController {

        // message TrackedJob
        public final class TrackedJob {

            // optional .com.android.server.job.JobStatusShortInfoProto info = 1;
            public static final long INFO = 0x0000010b00000001L;

            // optional int32 source_uid = 2;
            public static final long SOURCE_UID = 0x0000010500000002L;

            // optional string source_package_name = 3;
            public static final long SOURCE_PACKAGE_NAME = 0x0000010900000003L;

            // optional bool is_in_foreground = 4;
            public static final long IS_IN_FOREGROUND = 0x0000010800000004L;

            // optional bool is_whitelisted = 5;
            public static final long IS_WHITELISTED = 0x0000010800000005L;

            // optional bool can_run_any_in_background = 6;
            public static final long CAN_RUN_ANY_IN_BACKGROUND = 0x0000010800000006L;

            // optional bool are_constraints_satisfied = 7;
            public static final long ARE_CONSTRAINTS_SATISFIED = 0x0000010800000007L;

        }

        // optional .com.android.server.ForceAppStandbyTrackerProto force_app_standby_tracker = 1;
        public static final long FORCE_APP_STANDBY_TRACKER = 0x0000010b00000001L;

        // repeated .com.android.server.job.StateControllerProto.BackgroundJobsController.TrackedJob tracked_jobs = 2;
        public static final long TRACKED_JOBS = 0x0000020b00000002L;

    }

    // message BatteryController
    public final class BatteryController {

        // message TrackedJob
        public final class TrackedJob {

            // optional .com.android.server.job.JobStatusShortInfoProto info = 1;
            public static final long INFO = 0x0000010b00000001L;

            // optional int32 source_uid = 2;
            public static final long SOURCE_UID = 0x0000010500000002L;

        }

        // optional bool is_on_stable_power = 1;
        public static final long IS_ON_STABLE_POWER = 0x0000010800000001L;

        // optional bool is_battery_not_low = 2;
        public static final long IS_BATTERY_NOT_LOW = 0x0000010800000002L;

        // optional bool is_monitoring = 3;
        public static final long IS_MONITORING = 0x0000010800000003L;

        // optional int32 last_broadcast_sequence_number = 4;
        public static final long LAST_BROADCAST_SEQUENCE_NUMBER = 0x0000010500000004L;

        // repeated .com.android.server.job.StateControllerProto.BatteryController.TrackedJob tracked_jobs = 5;
        public static final long TRACKED_JOBS = 0x0000020b00000005L;

    }

    // message ConnectivityController
    public final class ConnectivityController {

        // message TrackedJob
        public final class TrackedJob {

            // optional .com.android.server.job.JobStatusShortInfoProto info = 1;
            public static final long INFO = 0x0000010b00000001L;

            // optional int32 source_uid = 2;
            public static final long SOURCE_UID = 0x0000010500000002L;

            // optional .android.net.NetworkRequestProto required_network = 3;
            public static final long REQUIRED_NETWORK = 0x0000010b00000003L;

        }

        // optional bool is_connected = 1;
        public static final long IS_CONNECTED = 0x0000010800000001L;

        // repeated .com.android.server.job.StateControllerProto.ConnectivityController.TrackedJob tracked_jobs = 2;
        public static final long TRACKED_JOBS = 0x0000020b00000002L;

    }

    // message ContentObserverController
    public final class ContentObserverController {

        // message TrackedJob
        public final class TrackedJob {

            // optional .com.android.server.job.JobStatusShortInfoProto info = 1;
            public static final long INFO = 0x0000010b00000001L;

            // optional int32 source_uid = 2;
            public static final long SOURCE_UID = 0x0000010500000002L;

        }

        // message Observer
        public final class Observer {

            // message TriggerContentData
            public final class TriggerContentData {

                // message JobInstance
                public final class JobInstance {

                    // optional .com.android.server.job.JobStatusShortInfoProto info = 1;
                    public static final long INFO = 0x0000010b00000001L;

                    // optional int32 source_uid = 2;
                    public static final long SOURCE_UID = 0x0000010500000002L;

                    // optional int64 trigger_content_update_delay_ms = 3;
                    public static final long TRIGGER_CONTENT_UPDATE_DELAY_MS = 0x0000010300000003L;

                    // optional int64 trigger_content_max_delay_ms = 4;
                    public static final long TRIGGER_CONTENT_MAX_DELAY_MS = 0x0000010300000004L;

                    // repeated string changed_authorities = 5;
                    public static final long CHANGED_AUTHORITIES = 0x0000020900000005L;

                    // repeated string changed_uris = 6;
                    public static final long CHANGED_URIS = 0x0000020900000006L;

                }

                // optional string uri = 1;
                public static final long URI = 0x0000010900000001L;

                // optional int32 flags = 2;
                public static final long FLAGS = 0x0000010500000002L;

                // repeated .com.android.server.job.StateControllerProto.ContentObserverController.Observer.TriggerContentData.JobInstance jobs = 3;
                public static final long JOBS = 0x0000020b00000003L;

            }

            // optional int32 user_id = 1;
            public static final long USER_ID = 0x0000010500000001L;

            // repeated .com.android.server.job.StateControllerProto.ContentObserverController.Observer.TriggerContentData triggers = 2;
            public static final long TRIGGERS = 0x0000020b00000002L;

        }

        // repeated .com.android.server.job.StateControllerProto.ContentObserverController.TrackedJob tracked_jobs = 1;
        public static final long TRACKED_JOBS = 0x0000020b00000001L;

        // repeated .com.android.server.job.StateControllerProto.ContentObserverController.Observer observers = 2;
        public static final long OBSERVERS = 0x0000020b00000002L;

    }

    // message DeviceIdleJobsController
    public final class DeviceIdleJobsController {

        // message TrackedJob
        public final class TrackedJob {

            // optional .com.android.server.job.JobStatusShortInfoProto info = 1;
            public static final long INFO = 0x0000010b00000001L;

            // optional int32 source_uid = 2;
            public static final long SOURCE_UID = 0x0000010500000002L;

            // optional string source_package_name = 3;
            public static final long SOURCE_PACKAGE_NAME = 0x0000010900000003L;

            // optional bool are_constraints_satisfied = 4;
            public static final long ARE_CONSTRAINTS_SATISFIED = 0x0000010800000004L;

            // optional bool is_doze_whitelisted = 5;
            public static final long IS_DOZE_WHITELISTED = 0x0000010800000005L;

            // optional bool is_allowed_in_doze = 6;
            public static final long IS_ALLOWED_IN_DOZE = 0x0000010800000006L;

        }

        // optional bool is_device_idle_mode = 1;
        public static final long IS_DEVICE_IDLE_MODE = 0x0000010800000001L;

        // repeated .com.android.server.job.StateControllerProto.DeviceIdleJobsController.TrackedJob tracked_jobs = 2;
        public static final long TRACKED_JOBS = 0x0000020b00000002L;

    }

    // message IdleController
    public final class IdleController {

        // message TrackedJob
        public final class TrackedJob {

            // optional .com.android.server.job.JobStatusShortInfoProto info = 1;
            public static final long INFO = 0x0000010b00000001L;

            // optional int32 source_uid = 2;
            public static final long SOURCE_UID = 0x0000010500000002L;

        }

        // optional bool is_idle = 1;
        public static final long IS_IDLE = 0x0000010800000001L;

        // repeated .com.android.server.job.StateControllerProto.IdleController.TrackedJob tracked_jobs = 2;
        public static final long TRACKED_JOBS = 0x0000020b00000002L;

    }

    // message StorageController
    public final class StorageController {

        // message TrackedJob
        public final class TrackedJob {

            // optional .com.android.server.job.JobStatusShortInfoProto info = 1;
            public static final long INFO = 0x0000010b00000001L;

            // optional int32 source_uid = 2;
            public static final long SOURCE_UID = 0x0000010500000002L;

        }

        // optional bool is_storage_not_low = 1;
        public static final long IS_STORAGE_NOT_LOW = 0x0000010800000001L;

        // optional int32 last_broadcast_sequence_number = 2;
        public static final long LAST_BROADCAST_SEQUENCE_NUMBER = 0x0000010500000002L;

        // repeated .com.android.server.job.StateControllerProto.StorageController.TrackedJob tracked_jobs = 3;
        public static final long TRACKED_JOBS = 0x0000020b00000003L;

    }

    // message TimeController
    public final class TimeController {

        // message TrackedJob
        public final class TrackedJob {

            // optional .com.android.server.job.JobStatusShortInfoProto info = 1;
            public static final long INFO = 0x0000010b00000001L;

            // optional int32 source_uid = 2;
            public static final long SOURCE_UID = 0x0000010500000002L;

            // optional bool has_timing_delay_constraint = 3;
            public static final long HAS_TIMING_DELAY_CONSTRAINT = 0x0000010800000003L;

            // optional int64 delay_time_remaining_ms = 4;
            public static final long DELAY_TIME_REMAINING_MS = 0x0000010300000004L;

            // optional bool has_deadline_constraint = 5;
            public static final long HAS_DEADLINE_CONSTRAINT = 0x0000010800000005L;

            // optional int64 time_remaining_until_deadline_ms = 6;
            public static final long TIME_REMAINING_UNTIL_DEADLINE_MS = 0x0000010300000006L;

        }

        // optional int64 now_elapsed_realtime = 1;
        public static final long NOW_ELAPSED_REALTIME = 0x0000010300000001L;

        // optional int64 time_until_next_delay_alarm_ms = 2;
        public static final long TIME_UNTIL_NEXT_DELAY_ALARM_MS = 0x0000010300000002L;

        // optional int64 time_until_next_deadline_alarm_ms = 3;
        public static final long TIME_UNTIL_NEXT_DEADLINE_ALARM_MS = 0x0000010300000003L;

        // repeated .com.android.server.job.StateControllerProto.TimeController.TrackedJob tracked_jobs = 4;
        public static final long TRACKED_JOBS = 0x0000020b00000004L;

    }

    // optional .com.android.server.job.StateControllerProto.BackgroundJobsController background = 1;
    public static final long BACKGROUND = 0x0000010b00000001L;

    // optional .com.android.server.job.StateControllerProto.BatteryController battery = 2;
    public static final long BATTERY = 0x0000010b00000002L;

    // optional .com.android.server.job.StateControllerProto.ConnectivityController connectivity = 3;
    public static final long CONNECTIVITY = 0x0000010b00000003L;

    // optional .com.android.server.job.StateControllerProto.ContentObserverController content_observer = 4;
    public static final long CONTENT_OBSERVER = 0x0000010b00000004L;

    // optional .com.android.server.job.StateControllerProto.DeviceIdleJobsController device_idle = 5;
    public static final long DEVICE_IDLE = 0x0000010b00000005L;

    // optional .com.android.server.job.StateControllerProto.IdleController idle = 6;
    public static final long IDLE = 0x0000010b00000006L;

    // optional .com.android.server.job.StateControllerProto.StorageController storage = 7;
    public static final long STORAGE = 0x0000010b00000007L;

    // optional .com.android.server.job.StateControllerProto.TimeController time = 8;
    public static final long TIME = 0x0000010b00000008L;

}

