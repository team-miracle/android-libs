// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/service/notification.proto

package android.service.notification;

/** @hide */
// message RankingHelperProto
public final class RankingHelperProto {

    // message RecordProto
    public final class RecordProto {

        // optional string package = 1;
        public static final long PACKAGE = 0x0000010900000001L;

        // optional int32 uid = 2;
        public static final long UID = 0x0000010500000002L;

        // optional sint32 importance = 3;
        public static final long IMPORTANCE = 0x0000011100000003L;

        // optional int32 priority = 4;
        public static final long PRIORITY = 0x0000010500000004L;

        // optional sint32 visibility = 5;
        public static final long VISIBILITY = 0x0000011100000005L;

        // optional bool show_badge = 6;
        public static final long SHOW_BADGE = 0x0000010800000006L;

        // repeated .android.app.NotificationChannelProto channels = 7;
        public static final long CHANNELS = 0x0000020b00000007L;

        // repeated .android.app.NotificationChannelGroupProto channel_groups = 8;
        public static final long CHANNEL_GROUPS = 0x0000020b00000008L;

    }

    // repeated string notification_signal_extractors = 1;
    public static final long NOTIFICATION_SIGNAL_EXTRACTORS = 0x0000020900000001L;

    // repeated .android.service.notification.RankingHelperProto.RecordProto records = 2;
    public static final long RECORDS = 0x0000020b00000002L;

    // repeated .android.service.notification.RankingHelperProto.RecordProto records_restored_without_uid = 3;
    public static final long RECORDS_RESTORED_WITHOUT_UID = 0x0000020b00000003L;

}
