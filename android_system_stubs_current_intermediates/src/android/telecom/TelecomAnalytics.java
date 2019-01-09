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
public final class TelecomAnalytics
  implements android.os.Parcelable
{
public static final class SessionTiming
  implements android.os.Parcelable
{
public  SessionTiming(int id, long time) { throw new RuntimeException("Stub!"); }
public  java.lang.Integer getKey() { throw new RuntimeException("Stub!"); }
public  long getTime() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telecom.TelecomAnalytics.SessionTiming> CREATOR;
public static final int CSW_ADD_CONFERENCE_CALL = 108;
public static final int CSW_HANDLE_CREATE_CONNECTION_COMPLETE = 100;
public static final int CSW_REMOVE_CALL = 106;
public static final int CSW_SET_ACTIVE = 101;
public static final int CSW_SET_DIALING = 103;
public static final int CSW_SET_DISCONNECTED = 104;
public static final int CSW_SET_IS_CONFERENCED = 107;
public static final int CSW_SET_ON_HOLD = 105;
public static final int CSW_SET_RINGING = 102;
public static final int ICA_ANSWER_CALL = 1;
public static final int ICA_CONFERENCE = 8;
public static final int ICA_DISCONNECT_CALL = 3;
public static final int ICA_HOLD_CALL = 4;
public static final int ICA_MUTE = 6;
public static final int ICA_REJECT_CALL = 2;
public static final int ICA_SET_AUDIO_ROUTE = 7;
public static final int ICA_UNHOLD_CALL = 5;
static { CREATOR = null; }
}
public  TelecomAnalytics(java.util.List<android.telecom.TelecomAnalytics.SessionTiming> sessionTimings, java.util.List<android.telecom.ParcelableCallAnalytics> callAnalytics) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.TelecomAnalytics.SessionTiming> getSessionTimings() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.ParcelableCallAnalytics> getCallAnalytics() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telecom.TelecomAnalytics> CREATOR;
static { CREATOR = null; }
}
