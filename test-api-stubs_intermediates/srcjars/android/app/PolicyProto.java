// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/app/notificationmanager.proto

package android.app;

/** @hide */
// message PolicyProto
public final class PolicyProto {

    // enum Category
    public static final int CATEGORY_UNKNOWN = 0;
    public static final int REMINDERS = 1;
    public static final int EVENTS = 2;
    public static final int MESSAGES = 3;
    public static final int CALLS = 4;
    public static final int REPEAT_CALLERS = 5;
    public static final int ALARMS = 6;
    public static final int MEDIA_SYSTEM_OTHER = 7;

    // enum Sender
    public static final int ANY = 0;
    public static final int CONTACTS = 1;
    public static final int STARRED = 2;

    // enum SuppressedVisualEffect
    public static final int SVE_UNKNOWN = 0;
    public static final int SCREEN_OFF = 1;
    public static final int SCREEN_ON = 2;

    // repeated .android.app.PolicyProto.Category priority_categories = 1;
    public static final long PRIORITY_CATEGORIES = 0x0000020e00000001L;

    // optional .android.app.PolicyProto.Sender priority_call_sender = 2;
    public static final long PRIORITY_CALL_SENDER = 0x0000010e00000002L;

    // optional .android.app.PolicyProto.Sender priority_message_sender = 3;
    public static final long PRIORITY_MESSAGE_SENDER = 0x0000010e00000003L;

    // repeated .android.app.PolicyProto.SuppressedVisualEffect suppressed_visual_effects = 4;
    public static final long SUPPRESSED_VISUAL_EFFECTS = 0x0000020e00000004L;

}

