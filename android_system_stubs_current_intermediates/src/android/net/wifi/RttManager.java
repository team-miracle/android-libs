package android.net.wifi;
@java.lang.Deprecated()
public class RttManager
{
@java.lang.Deprecated()
public class Capabilities
{
public  Capabilities() { throw new RuntimeException("Stub!"); }
public int supportedPeerType;
public int supportedType;
}
@java.lang.Deprecated()
public static class RttCapabilities
  implements android.os.Parcelable
{
public  RttCapabilities() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public int bwSupported;
public boolean lciSupported;
public boolean lcrSupported;
public int mcVersion;
public boolean oneSidedRttSupported;
public int preambleSupported;
public boolean responderSupported;
public boolean secureRttSupported;
@java.lang.Deprecated()
public boolean supportedPeerType;
@java.lang.Deprecated()
public boolean supportedType;
public boolean twoSided11McRttSupported;
}
@java.lang.Deprecated()
public static class RttParams
{
public  RttParams() { throw new RuntimeException("Stub!"); }
public boolean LCIRequest;
public boolean LCRRequest;
public int bandwidth;
public java.lang.String bssid;
public int burstTimeout;
public int centerFreq0;
public int centerFreq1;
public int channelWidth;
public int deviceType;
public int frequency;
public int interval;
public int numRetriesPerFTMR;
public int numRetriesPerMeasurementFrame;
public int numSamplesPerBurst;
@java.lang.Deprecated()
public int num_retries;
@java.lang.Deprecated()
public int num_samples;
public int numberBurst;
public int preamble;
public int requestType;
public boolean secure;
}
@java.lang.Deprecated()
public static class ParcelableRttParams
  implements android.os.Parcelable
{
ParcelableRttParams() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public android.net.wifi.RttManager.RttParams[] mParams = null;
}
@java.lang.Deprecated()
public static class WifiInformationElement
{
public  WifiInformationElement() { throw new RuntimeException("Stub!"); }
public byte[] data = null;
public byte id;
}
@java.lang.Deprecated()
public static class RttResult
{
public  RttResult() { throw new RuntimeException("Stub!"); }
public android.net.wifi.RttManager.WifiInformationElement LCI;
public android.net.wifi.RttManager.WifiInformationElement LCR;
public java.lang.String bssid;
public int burstDuration;
public int burstNumber;
public int distance;
public int distanceSpread;
public int distanceStandardDeviation;
@java.lang.Deprecated()
public int distance_cm;
@java.lang.Deprecated()
public int distance_sd_cm;
@java.lang.Deprecated()
public int distance_spread_cm;
public int frameNumberPerBurstPeer;
public int measurementFrameNumber;
public int measurementType;
public int negotiatedBurstNum;
@java.lang.Deprecated()
public int requestType;
public int retryAfterDuration;
public int rssi;
public int rssiSpread;
@java.lang.Deprecated()
public int rssi_spread;
public long rtt;
public long rttSpread;
public long rttStandardDeviation;
@java.lang.Deprecated()
public long rtt_ns;
@java.lang.Deprecated()
public long rtt_sd_ns;
@java.lang.Deprecated()
public long rtt_spread_ns;
public int rxRate;
public boolean secure;
public int status;
public int successMeasurementFrameNumber;
public long ts;
public int txRate;
@java.lang.Deprecated()
public int tx_rate;
}
@java.lang.Deprecated()
public static class ParcelableRttResults
  implements android.os.Parcelable
{
public  ParcelableRttResults(android.net.wifi.RttManager.RttResult[] results) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public android.net.wifi.RttManager.RttResult[] mResults = null;
}
@java.lang.Deprecated()
public static interface RttListener
{
public abstract  void onSuccess(android.net.wifi.RttManager.RttResult[] results);
public abstract  void onFailure(int reason, java.lang.String description);
public abstract  void onAborted();
}
@java.lang.Deprecated()
public abstract static class ResponderCallback
{
public  ResponderCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onResponderEnabled(android.net.wifi.RttManager.ResponderConfig config);
public abstract  void onResponderEnableFailure(int reason);
}
@java.lang.Deprecated()
public static class ResponderConfig
  implements android.os.Parcelable
{
public  ResponderConfig() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.RttManager.ResponderConfig> CREATOR;
public int centerFreq0;
public int centerFreq1;
public int channelWidth;
public int frequency;
public java.lang.String macAddress;
public int preamble;
static { CREATOR = null; }
}
RttManager() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.annotation.SuppressLint(value={"Doclava125"})
public  android.net.wifi.RttManager.Capabilities getCapabilities() { throw new RuntimeException("Stub!"); }
public  android.net.wifi.RttManager.RttCapabilities getRttCapabilities() { throw new RuntimeException("Stub!"); }
public  void startRanging(android.net.wifi.RttManager.RttParams[] params, android.net.wifi.RttManager.RttListener listener) { throw new RuntimeException("Stub!"); }
public  void stopRanging(android.net.wifi.RttManager.RttListener listener) { throw new RuntimeException("Stub!"); }
public  void enableResponder(android.net.wifi.RttManager.ResponderCallback callback) { throw new RuntimeException("Stub!"); }
public  void disableResponder(android.net.wifi.RttManager.ResponderCallback callback) { throw new RuntimeException("Stub!"); }
public static final int BASE = 160256;
public static final int CMD_OP_ABORTED = 160260;
public static final int CMD_OP_DISABLE_RESPONDER = 160262;
public static final int CMD_OP_ENABLE_RESPONDER = 160261;
public static final int CMD_OP_ENALBE_RESPONDER_FAILED = 160264;
public static final int CMD_OP_ENALBE_RESPONDER_SUCCEEDED = 160263;
public static final int CMD_OP_FAILED = 160258;
public static final int CMD_OP_START_RANGING = 160256;
public static final int CMD_OP_STOP_RANGING = 160257;
public static final int CMD_OP_SUCCEEDED = 160259;
public static final java.lang.String DESCRIPTION_KEY = "android.net.wifi.RttManager.Description";
public static final int PREAMBLE_HT = 2;
public static final int PREAMBLE_LEGACY = 1;
public static final int PREAMBLE_VHT = 4;
public static final int REASON_INITIATOR_NOT_ALLOWED_WHEN_RESPONDER_ON = -6;
public static final int REASON_INVALID_LISTENER = -3;
public static final int REASON_INVALID_REQUEST = -4;
public static final int REASON_NOT_AVAILABLE = -2;
public static final int REASON_PERMISSION_DENIED = -5;
public static final int REASON_UNSPECIFIED = -1;
public static final int RTT_BW_10_SUPPORT = 2;
public static final int RTT_BW_160_SUPPORT = 32;
public static final int RTT_BW_20_SUPPORT = 4;
public static final int RTT_BW_40_SUPPORT = 8;
public static final int RTT_BW_5_SUPPORT = 1;
public static final int RTT_BW_80_SUPPORT = 16;
@java.lang.Deprecated()
public static final int RTT_CHANNEL_WIDTH_10 = 6;
@java.lang.Deprecated()
public static final int RTT_CHANNEL_WIDTH_160 = 3;
@java.lang.Deprecated()
public static final int RTT_CHANNEL_WIDTH_20 = 0;
@java.lang.Deprecated()
public static final int RTT_CHANNEL_WIDTH_40 = 1;
@java.lang.Deprecated()
public static final int RTT_CHANNEL_WIDTH_5 = 5;
@java.lang.Deprecated()
public static final int RTT_CHANNEL_WIDTH_80 = 2;
@java.lang.Deprecated()
public static final int RTT_CHANNEL_WIDTH_80P80 = 4;
@java.lang.Deprecated()
public static final int RTT_CHANNEL_WIDTH_UNSPECIFIED = -1;
public static final int RTT_PEER_NAN = 5;
public static final int RTT_PEER_P2P_CLIENT = 4;
public static final int RTT_PEER_P2P_GO = 3;
public static final int RTT_PEER_TYPE_AP = 1;
public static final int RTT_PEER_TYPE_STA = 2;
@java.lang.Deprecated()
public static final int RTT_PEER_TYPE_UNSPECIFIED = 0;
public static final int RTT_STATUS_ABORTED = 8;
public static final int RTT_STATUS_FAILURE = 1;
public static final int RTT_STATUS_FAIL_AP_ON_DIFF_CHANNEL = 6;
public static final int RTT_STATUS_FAIL_BUSY_TRY_LATER = 12;
public static final int RTT_STATUS_FAIL_FTM_PARAM_OVERRIDE = 15;
public static final int RTT_STATUS_FAIL_INVALID_TS = 9;
public static final int RTT_STATUS_FAIL_NOT_SCHEDULED_YET = 4;
public static final int RTT_STATUS_FAIL_NO_CAPABILITY = 7;
public static final int RTT_STATUS_FAIL_NO_RSP = 2;
public static final int RTT_STATUS_FAIL_PROTOCOL = 10;
public static final int RTT_STATUS_FAIL_REJECTED = 3;
public static final int RTT_STATUS_FAIL_SCHEDULE = 11;
public static final int RTT_STATUS_FAIL_TM_TIMEOUT = 5;
public static final int RTT_STATUS_INVALID_REQ = 13;
public static final int RTT_STATUS_NO_WIFI = 14;
public static final int RTT_STATUS_SUCCESS = 0;
@java.lang.Deprecated()
public static final int RTT_TYPE_11_MC = 4;
@java.lang.Deprecated()
public static final int RTT_TYPE_11_V = 2;
public static final int RTT_TYPE_ONE_SIDED = 1;
public static final int RTT_TYPE_TWO_SIDED = 2;
@java.lang.Deprecated()
public static final int RTT_TYPE_UNSPECIFIED = 0;
}
