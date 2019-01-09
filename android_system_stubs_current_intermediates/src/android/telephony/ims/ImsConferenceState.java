/*
* Copyright (C) 2018 The Android Open Source Project
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

package android.telephony.ims;
public final class ImsConferenceState
  implements android.os.Parcelable
{
ImsConferenceState() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static  int getConnectionStateForStatus(java.lang.String status) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.ims.ImsConferenceState> CREATOR;
public static final java.lang.String DISPLAY_TEXT = "display-text";
public static final java.lang.String ENDPOINT = "endpoint";
public static final java.lang.String SIP_STATUS_CODE = "sipstatuscode";
public static final java.lang.String STATUS = "status";
public static final java.lang.String STATUS_ALERTING = "alerting";
public static final java.lang.String STATUS_CONNECTED = "connected";
public static final java.lang.String STATUS_CONNECT_FAIL = "connect-fail";
public static final java.lang.String STATUS_DIALING_IN = "dialing-in";
public static final java.lang.String STATUS_DIALING_OUT = "dialing-out";
public static final java.lang.String STATUS_DISCONNECTED = "disconnected";
public static final java.lang.String STATUS_DISCONNECTING = "disconnecting";
public static final java.lang.String STATUS_MUTED_VIA_FOCUS = "muted-via-focus";
public static final java.lang.String STATUS_ON_HOLD = "on-hold";
public static final java.lang.String STATUS_PENDING = "pending";
public static final java.lang.String STATUS_SEND_ONLY = "sendonly";
public static final java.lang.String STATUS_SEND_RECV = "sendrecv";
public static final java.lang.String USER = "user";
public final java.util.HashMap<java.lang.String, android.os.Bundle> mParticipants;
static { CREATOR = null; }
}
