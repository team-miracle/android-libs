// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/server/powermanagerservice.proto

package com.android.server.power;

/** @hide */
// message PowerManagerServiceDumpProto
public final class PowerManagerServiceDumpProto {

    // message ConstantsProto
    public final class ConstantsProto {

        // optional bool is_no_cached_wake_locks = 1;
        public static final long IS_NO_CACHED_WAKE_LOCKS = 0x0000010800000001L;

    }

    // message ActiveWakeLocksProto
    public final class ActiveWakeLocksProto {

        // optional bool is_cpu = 1;
        public static final long IS_CPU = 0x0000010800000001L;

        // optional bool is_screen_bright = 2;
        public static final long IS_SCREEN_BRIGHT = 0x0000010800000002L;

        // optional bool is_screen_dim = 3;
        public static final long IS_SCREEN_DIM = 0x0000010800000003L;

        // optional bool is_button_bright = 4;
        public static final long IS_BUTTON_BRIGHT = 0x0000010800000004L;

        // optional bool is_proximity_screen_off = 5;
        public static final long IS_PROXIMITY_SCREEN_OFF = 0x0000010800000005L;

        // optional bool is_stay_awake = 6;
        public static final long IS_STAY_AWAKE = 0x0000010800000006L;

        // optional bool is_doze = 7;
        public static final long IS_DOZE = 0x0000010800000007L;

        // optional bool is_draw = 8;
        public static final long IS_DRAW = 0x0000010800000008L;

    }

    // message UserActivityProto
    public final class UserActivityProto {

        // optional bool is_screen_bright = 1;
        public static final long IS_SCREEN_BRIGHT = 0x0000010800000001L;

        // optional bool is_screen_dim = 2;
        public static final long IS_SCREEN_DIM = 0x0000010800000002L;

        // optional bool is_screen_dream = 3;
        public static final long IS_SCREEN_DREAM = 0x0000010800000003L;

    }

    // message UidStateProto
    public final class UidStateProto {

        // optional int32 uid = 1;
        public static final long UID = 0x0000010500000001L;

        // optional string uid_string = 2;
        public static final long UID_STRING = 0x0000010900000002L;

        // optional bool is_active = 3;
        public static final long IS_ACTIVE = 0x0000010800000003L;

        // optional int32 num_wake_locks = 4;
        public static final long NUM_WAKE_LOCKS = 0x0000010500000004L;

        // optional .android.app.ProcessStateEnum process_state = 5;
        public static final long PROCESS_STATE = 0x0000010e00000005L;

    }

    // optional .com.android.server.power.PowerManagerServiceDumpProto.ConstantsProto constants = 1;
    public static final long CONSTANTS = 0x0000010b00000001L;

    // optional int32 dirty = 2;
    public static final long DIRTY = 0x0000010500000002L;

    // optional .android.os.PowerManagerInternalProto.Wakefulness wakefulness = 3;
    public static final long WAKEFULNESS = 0x0000010e00000003L;

    // optional bool is_wakefulness_changing = 4;
    public static final long IS_WAKEFULNESS_CHANGING = 0x0000010800000004L;

    // optional bool is_powered = 5;
    public static final long IS_POWERED = 0x0000010800000005L;

    // optional .android.os.BatteryPluggedStateEnum plug_type = 6;
    public static final long PLUG_TYPE = 0x0000010e00000006L;

    // optional int32 battery_level = 7;
    public static final long BATTERY_LEVEL = 0x0000010500000007L;

    // optional int32 battery_level_when_dream_started = 8;
    public static final long BATTERY_LEVEL_WHEN_DREAM_STARTED = 0x0000010500000008L;

    // optional .android.content.IntentProto.DockState dock_state = 9;
    public static final long DOCK_STATE = 0x0000010e00000009L;

    // optional bool is_stay_on = 10;
    public static final long IS_STAY_ON = 0x000001080000000aL;

    // optional bool is_proximity_positive = 11;
    public static final long IS_PROXIMITY_POSITIVE = 0x000001080000000bL;

    // optional bool is_boot_completed = 12;
    public static final long IS_BOOT_COMPLETED = 0x000001080000000cL;

    // optional bool is_system_ready = 13;
    public static final long IS_SYSTEM_READY = 0x000001080000000dL;

    // optional bool is_hal_auto_suspend_mode_enabled = 14;
    public static final long IS_HAL_AUTO_SUSPEND_MODE_ENABLED = 0x000001080000000eL;

    // optional bool is_hal_auto_interactive_mode_enabled = 15;
    public static final long IS_HAL_AUTO_INTERACTIVE_MODE_ENABLED = 0x000001080000000fL;

    // optional .com.android.server.power.PowerManagerServiceDumpProto.ActiveWakeLocksProto active_wake_locks = 16;
    public static final long ACTIVE_WAKE_LOCKS = 0x0000010b00000010L;

    // optional int64 notify_long_scheduled_ms = 17;
    public static final long NOTIFY_LONG_SCHEDULED_MS = 0x0000010300000011L;

    // optional int64 notify_long_dispatched_ms = 18;
    public static final long NOTIFY_LONG_DISPATCHED_MS = 0x0000010300000012L;

    // optional int64 notify_long_next_check_ms = 19;
    public static final long NOTIFY_LONG_NEXT_CHECK_MS = 0x0000010300000013L;

    // optional .com.android.server.power.PowerManagerServiceDumpProto.UserActivityProto user_activity = 20;
    public static final long USER_ACTIVITY = 0x0000010b00000014L;

    // optional bool is_request_wait_for_negative_proximity = 21;
    public static final long IS_REQUEST_WAIT_FOR_NEGATIVE_PROXIMITY = 0x0000010800000015L;

    // optional bool is_sandman_scheduled = 22;
    public static final long IS_SANDMAN_SCHEDULED = 0x0000010800000016L;

    // optional bool is_sandman_summoned = 23;
    public static final long IS_SANDMAN_SUMMONED = 0x0000010800000017L;

    // optional bool is_battery_level_low = 24;
    public static final long IS_BATTERY_LEVEL_LOW = 0x0000010800000018L;

    // optional bool is_light_device_idle_mode = 25;
    public static final long IS_LIGHT_DEVICE_IDLE_MODE = 0x0000010800000019L;

    // optional bool is_device_idle_mode = 26;
    public static final long IS_DEVICE_IDLE_MODE = 0x000001080000001aL;

    // repeated int32 device_idle_whitelist = 27;
    public static final long DEVICE_IDLE_WHITELIST = 0x000002050000001bL;

    // repeated int32 device_idle_temp_whitelist = 28;
    public static final long DEVICE_IDLE_TEMP_WHITELIST = 0x000002050000001cL;

    // optional int64 last_wake_time_ms = 29;
    public static final long LAST_WAKE_TIME_MS = 0x000001030000001dL;

    // optional int64 last_sleep_time_ms = 30;
    public static final long LAST_SLEEP_TIME_MS = 0x000001030000001eL;

    // optional int64 last_user_activity_time_ms = 31;
    public static final long LAST_USER_ACTIVITY_TIME_MS = 0x000001030000001fL;

    // optional int64 last_user_activity_time_no_change_lights_ms = 32;
    public static final long LAST_USER_ACTIVITY_TIME_NO_CHANGE_LIGHTS_MS = 0x0000010300000020L;

    // optional int64 last_interactive_power_hint_time_ms = 33;
    public static final long LAST_INTERACTIVE_POWER_HINT_TIME_MS = 0x0000010300000021L;

    // optional int64 last_screen_brightness_boost_time_ms = 34;
    public static final long LAST_SCREEN_BRIGHTNESS_BOOST_TIME_MS = 0x0000010300000022L;

    // optional bool is_screen_brightness_boost_in_progress = 35;
    public static final long IS_SCREEN_BRIGHTNESS_BOOST_IN_PROGRESS = 0x0000010800000023L;

    // optional bool is_display_ready = 36;
    public static final long IS_DISPLAY_READY = 0x0000010800000024L;

    // optional bool is_holding_wake_lock_suspend_blocker = 37;
    public static final long IS_HOLDING_WAKE_LOCK_SUSPEND_BLOCKER = 0x0000010800000025L;

    // optional bool is_holding_display_suspend_blocker = 38;
    public static final long IS_HOLDING_DISPLAY_SUSPEND_BLOCKER = 0x0000010800000026L;

    // optional .com.android.server.power.PowerServiceSettingsAndConfigurationDumpProto settings_and_configuration = 39;
    public static final long SETTINGS_AND_CONFIGURATION = 0x0000010b00000027L;

    // optional sint32 sleep_timeout_ms = 40;
    public static final long SLEEP_TIMEOUT_MS = 0x0000011100000028L;

    // optional int32 screen_off_timeout_ms = 41;
    public static final long SCREEN_OFF_TIMEOUT_MS = 0x0000010500000029L;

    // optional int32 screen_dim_duration_ms = 42;
    public static final long SCREEN_DIM_DURATION_MS = 0x000001050000002aL;

    // optional bool are_uids_changing = 43;
    public static final long ARE_UIDS_CHANGING = 0x000001080000002bL;

    // optional bool are_uids_changed = 44;
    public static final long ARE_UIDS_CHANGED = 0x000001080000002cL;

    // repeated .com.android.server.power.PowerManagerServiceDumpProto.UidStateProto uid_states = 45;
    public static final long UID_STATES = 0x0000020b0000002dL;

    // optional .android.os.LooperProto looper = 46;
    public static final long LOOPER = 0x0000010b0000002eL;

    // repeated .com.android.server.power.WakeLockProto wake_locks = 47;
    public static final long WAKE_LOCKS = 0x0000020b0000002fL;

    // repeated .com.android.server.power.SuspendBlockerProto suspend_blockers = 48;
    public static final long SUSPEND_BLOCKERS = 0x0000020b00000030L;

    // optional .com.android.server.power.WirelessChargerDetectorProto wireless_charger_detector = 49;
    public static final long WIRELESS_CHARGER_DETECTOR = 0x0000010b00000031L;

    // optional .com.android.server.power.BatterySaverStateMachineProto battery_saver_state_machine = 50;
    public static final long BATTERY_SAVER_STATE_MACHINE = 0x0000010b00000032L;

}

