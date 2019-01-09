// Generated by protoc-gen-javastream. DO NOT MODIFY.
// source: frameworks/base/core/proto/android/net/networkrequest.proto

package android.net;

/** @hide */
// message NetworkRequestProto
public final class NetworkRequestProto {

    // enum Type
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_NONE = 1;
    public static final int TYPE_LISTEN = 2;
    public static final int TYPE_TRACK_DEFAULT = 3;
    public static final int TYPE_REQUEST = 4;
    public static final int TYPE_BACKGROUND_REQUEST = 5;

    // optional .android.net.NetworkRequestProto.Type type = 1;
    public static final long TYPE = 0x0000010e00000001L;

    // optional int32 request_id = 2;
    public static final long REQUEST_ID = 0x0000010500000002L;

    // optional int32 legacy_type = 3;
    public static final long LEGACY_TYPE = 0x0000010500000003L;

    // optional .android.net.NetworkCapabilitiesProto network_capabilities = 4;
    public static final long NETWORK_CAPABILITIES = 0x0000010b00000004L;

}

