// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/package.proto

package android.service.pm;

/** @hide */
// message PackageProto
public final class PackageProto {

    // message SplitProto
    public final class SplitProto {

        // optional string name = 1;
        public static final long NAME = 0x0000010900000001L;

        // optional int32 revision_code = 2;
        public static final long REVISION_CODE = 0x0000010500000002L;

    }

    // message UserInfoProto
    public final class UserInfoProto {

        // enum InstallType
        public static final int NOT_INSTALLED_FOR_USER = 0;
        public static final int FULL_APP_INSTALL = 1;
        public static final int INSTANT_APP_INSTALL = 2;

        // enum EnabledState
        public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;
        public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;
        public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;
        public static final int COMPONENT_ENABLED_STATE_DISABLED_USER = 3;
        public static final int COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED = 4;

        // optional int32 id = 1;
        public static final long ID = 0x0000010500000001L;

        // optional .android.service.pm.PackageProto.UserInfoProto.InstallType install_type = 2;
        public static final long INSTALL_TYPE = 0x0000010e00000002L;

        // optional bool is_hidden = 3;
        public static final long IS_HIDDEN = 0x0000010800000003L;

        // optional bool is_suspended = 4;
        public static final long IS_SUSPENDED = 0x0000010800000004L;

        // optional bool is_stopped = 5;
        public static final long IS_STOPPED = 0x0000010800000005L;

        // optional bool is_launched = 6;
        public static final long IS_LAUNCHED = 0x0000010800000006L;

        // optional .android.service.pm.PackageProto.UserInfoProto.EnabledState enabled_state = 7;
        public static final long ENABLED_STATE = 0x0000010e00000007L;

        // optional string last_disabled_app_caller = 8;
        public static final long LAST_DISABLED_APP_CALLER = 0x0000010900000008L;

        // optional string suspending_package = 9;
        public static final long SUSPENDING_PACKAGE = 0x0000010900000009L;

    }

    // optional string name = 1;
    public static final long NAME = 0x0000010900000001L;

    // optional int32 uid = 2;
    public static final long UID = 0x0000010500000002L;

    // optional int32 version_code = 3;
    public static final long VERSION_CODE = 0x0000010500000003L;

    // optional string version_string = 4;
    public static final long VERSION_STRING = 0x0000010900000004L;

    // optional int64 install_time_ms = 5;
    public static final long INSTALL_TIME_MS = 0x0000010300000005L;

    // optional int64 update_time_ms = 6;
    public static final long UPDATE_TIME_MS = 0x0000010300000006L;

    // optional string installer_name = 7;
    public static final long INSTALLER_NAME = 0x0000010900000007L;

    // repeated .android.service.pm.PackageProto.SplitProto splits = 8;
    public static final long SPLITS = 0x0000020b00000008L;

    // repeated .android.service.pm.PackageProto.UserInfoProto users = 9;
    public static final long USERS = 0x0000020b00000009L;

}

