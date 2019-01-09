/*
* Copyright (C) 2016 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License
*/

package android.telecom;
public class ParcelableCallAnalytics
  implements android.os.Parcelable
{
public static final class AnalyticsEvent
  implements android.os.Parcelable
{
public  AnalyticsEvent(int eventName, long timestamp) { throw new RuntimeException("Stub!"); }
public  int getEventName() { throw new RuntimeException("Stub!"); }
public  long getTimeSinceLastEvent() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final int AUDIO_ROUTE_BT = 204;
public static final int AUDIO_ROUTE_EARPIECE = 205;
public static final int AUDIO_ROUTE_HEADSET = 206;
public static final int AUDIO_ROUTE_SPEAKER = 207;
public static final int BIND_CS = 5;
public static final int BLOCK_CHECK_FINISHED = 105;
public static final int BLOCK_CHECK_INITIATED = 104;
public static final int CONFERENCE_WITH = 300;
public static final android.os.Parcelable.Creator<android.telecom.ParcelableCallAnalytics.AnalyticsEvent> CREATOR;
public static final int CS_BOUND = 6;
public static final int DIRECT_TO_VM_FINISHED = 103;
public static final int DIRECT_TO_VM_INITIATED = 102;
public static final int FILTERING_COMPLETED = 107;
public static final int FILTERING_INITIATED = 106;
public static final int FILTERING_TIMED_OUT = 108;
public static final int MUTE = 202;
public static final int REMOTELY_HELD = 402;
public static final int REMOTELY_UNHELD = 403;
public static final int REQUEST_ACCEPT = 7;
public static final int REQUEST_HOLD = 400;
public static final int REQUEST_PULL = 500;
public static final int REQUEST_REJECT = 8;
public static final int REQUEST_UNHOLD = 401;
public static final int SCREENING_COMPLETED = 101;
public static final int SCREENING_SENT = 100;
public static final int SET_ACTIVE = 1;
public static final int SET_DIALING = 4;
public static final int SET_DISCONNECTED = 2;
public static final int SET_HOLD = 404;
public static final int SET_PARENT = 302;
public static final int SET_SELECT_PHONE_ACCOUNT = 0;
public static final int SILENCE = 201;
public static final int SKIP_RINGING = 200;
public static final int SPLIT_CONFERENCE = 301;
public static final int START_CONNECTION = 3;
public static final int SWAP = 405;
public static final int UNMUTE = 203;
static { CREATOR = null; }
}
public static final class EventTiming
  implements android.os.Parcelable
{
public  EventTiming(int name, long time) { throw new RuntimeException("Stub!"); }
public  int getName() { throw new RuntimeException("Stub!"); }
public  long getTime() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final int ACCEPT_TIMING = 0;
public static final int BIND_CS_TIMING = 6;
public static final int BLOCK_CHECK_FINISHED_TIMING = 9;
public static final android.os.Parcelable.Creator<android.telecom.ParcelableCallAnalytics.EventTiming> CREATOR;
public static final int DIRECT_TO_VM_FINISHED_TIMING = 8;
public static final int DISCONNECT_TIMING = 2;
public static final int FILTERING_COMPLETED_TIMING = 10;
public static final int FILTERING_TIMED_OUT_TIMING = 11;
public static final int HOLD_TIMING = 3;
public static final int INVALID = 999999;
public static final int OUTGOING_TIME_TO_DIALING_TIMING = 5;
public static final int REJECT_TIMING = 1;
public static final int SCREENING_COMPLETED_TIMING = 7;
public static final int UNHOLD_TIMING = 4;
static { CREATOR = null; }
}
public  ParcelableCallAnalytics(long startTimeMillis, long callDurationMillis, int callType, boolean isAdditionalCall, boolean isInterrupted, int callTechnologies, int callTerminationCode, boolean isEmergencyCall, java.lang.String connectionService, boolean isCreatedFromExistingConnection, java.util.List<android.telecom.ParcelableCallAnalytics.AnalyticsEvent> analyticsEvents, java.util.List<android.telecom.ParcelableCallAnalytics.EventTiming> eventTimings) { throw new RuntimeException("Stub!"); }
public  ParcelableCallAnalytics(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  long getStartTimeMillis() { throw new RuntimeException("Stub!"); }
public  long getCallDurationMillis() { throw new RuntimeException("Stub!"); }
public  int getCallType() { throw new RuntimeException("Stub!"); }
public  boolean isAdditionalCall() { throw new RuntimeException("Stub!"); }
public  boolean isInterrupted() { throw new RuntimeException("Stub!"); }
public  int getCallTechnologies() { throw new RuntimeException("Stub!"); }
public  int getCallTerminationCode() { throw new RuntimeException("Stub!"); }
public  boolean isEmergencyCall() { throw new RuntimeException("Stub!"); }
public  java.lang.String getConnectionService() { throw new RuntimeException("Stub!"); }
public  boolean isCreatedFromExistingConnection() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.ParcelableCallAnalytics.AnalyticsEvent> analyticsEvents() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.ParcelableCallAnalytics.EventTiming> getEventTimings() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final int CALLTYPE_INCOMING = 1;
public static final int CALLTYPE_OUTGOING = 2;
public static final int CALLTYPE_UNKNOWN = 0;
public static final int CDMA_PHONE = 1;
public static final android.os.Parcelable.Creator<android.telecom.ParcelableCallAnalytics> CREATOR;
public static final int GSM_PHONE = 2;
public static final int IMS_PHONE = 4;
public static final long MILLIS_IN_1_SECOND = 1000L;
public static final long MILLIS_IN_5_MINUTES = 300000L;
public static final int SIP_PHONE = 8;
public static final int STILL_CONNECTED = -1;
public static final int THIRD_PARTY_PHONE = 16;
static { CREATOR = null; }
}
