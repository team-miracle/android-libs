// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/libs/incident/proto/android/os/metadata.proto

package android.os;

/** @hide */
// message IncidentMetadata
public final class IncidentMetadata {

    // enum Destination
    public static final int AUTOMATIC = 0;
    public static final int EXPLICIT = 1;
    public static final int LOCAL = 2;

    // message SectionStats
    public final class SectionStats {

        // optional int32 id = 1;
        public static final long ID = 0x0000010500000001L;

        // optional bool success = 2;
        public static final long SUCCESS = 0x0000010800000002L;

        // optional int32 report_size_bytes = 3;
        public static final long REPORT_SIZE_BYTES = 0x0000010500000003L;

        // optional int64 exec_duration_ms = 4;
        public static final long EXEC_DURATION_MS = 0x0000010300000004L;

        // optional int32 dump_size_bytes = 5;
        public static final long DUMP_SIZE_BYTES = 0x0000010500000005L;

        // optional int64 dump_duration_ms = 6;
        public static final long DUMP_DURATION_MS = 0x0000010300000006L;

        // optional bool timed_out = 7;
        public static final long TIMED_OUT = 0x0000010800000007L;

        // optional bool is_truncated = 8;
        public static final long IS_TRUNCATED = 0x0000010800000008L;

    }

    // optional int64 report_id = 1;
    public static final long REPORT_ID = 0x0000010300000001L;

    // optional int32 sequence_number = 2;
    public static final long SEQUENCE_NUMBER = 0x0000010500000002L;

    // optional .android.os.IncidentMetadata.Destination dest = 3;
    public static final long DEST = 0x0000010e00000003L;

    // optional int32 request_size = 4;
    public static final long REQUEST_SIZE = 0x0000010500000004L;

    // optional bool use_dropbox = 5;
    public static final long USE_DROPBOX = 0x0000010800000005L;

    // repeated .android.os.IncidentMetadata.SectionStats sections = 6;
    public static final long SECTIONS = 0x0000020b00000006L;

}

