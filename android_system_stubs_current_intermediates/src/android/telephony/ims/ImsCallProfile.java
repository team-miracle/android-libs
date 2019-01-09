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
public final class ImsCallProfile
  implements android.os.Parcelable
{
public  ImsCallProfile() { throw new RuntimeException("Stub!"); }
public  ImsCallProfile(int serviceType, int callType) { throw new RuntimeException("Stub!"); }
public  ImsCallProfile(int serviceType, int callType, android.os.Bundle callExtras, android.telephony.ims.ImsStreamMediaProfile mediaProfile) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCallExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCallExtra(java.lang.String name, java.lang.String defaultValue) { throw new RuntimeException("Stub!"); }
public  boolean getCallExtraBoolean(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean getCallExtraBoolean(java.lang.String name, boolean defaultValue) { throw new RuntimeException("Stub!"); }
public  int getCallExtraInt(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int getCallExtraInt(java.lang.String name, int defaultValue) { throw new RuntimeException("Stub!"); }
public  void setCallExtra(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setCallExtraBoolean(java.lang.String name, boolean value) { throw new RuntimeException("Stub!"); }
public  void setCallExtraInt(java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
public  void updateCallType(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void updateCallExtras(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void updateMediaProfile(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int getServiceType() { throw new RuntimeException("Stub!"); }
public  int getCallType() { throw new RuntimeException("Stub!"); }
public  int getRestrictCause() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getCallExtras() { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.ImsStreamMediaProfile getMediaProfile() { throw new RuntimeException("Stub!"); }
public static  int getVideoStateFromImsCallProfile(android.telephony.ims.ImsCallProfile callProfile) { throw new RuntimeException("Stub!"); }
public static  int getVideoStateFromCallType(int callType) { throw new RuntimeException("Stub!"); }
public static  int getCallTypeFromVideoState(int videoState) { throw new RuntimeException("Stub!"); }
public static  int presentationToOir(int presentation) { throw new RuntimeException("Stub!"); }
public  boolean isVideoPaused() { throw new RuntimeException("Stub!"); }
public  boolean isVideoCall() { throw new RuntimeException("Stub!"); }
public static final int CALL_RESTRICT_CAUSE_DISABLED = 2;
public static final int CALL_RESTRICT_CAUSE_HD = 3;
public static final int CALL_RESTRICT_CAUSE_NONE = 0;
public static final int CALL_RESTRICT_CAUSE_RAT = 1;
public static final int CALL_TYPE_VIDEO_N_VOICE = 3;
public static final int CALL_TYPE_VOICE = 2;
public static final int CALL_TYPE_VOICE_N_VIDEO = 1;
public static final int CALL_TYPE_VS = 8;
public static final int CALL_TYPE_VS_RX = 10;
public static final int CALL_TYPE_VS_TX = 9;
public static final int CALL_TYPE_VT = 4;
public static final int CALL_TYPE_VT_NODIR = 7;
public static final int CALL_TYPE_VT_RX = 6;
public static final int CALL_TYPE_VT_TX = 5;
public static final android.os.Parcelable.Creator<android.telephony.ims.ImsCallProfile> CREATOR;
public static final int DIALSTRING_NORMAL = 0;
public static final int DIALSTRING_SS_CONF = 1;
public static final int DIALSTRING_USSD = 2;
public static final java.lang.String EXTRA_ADDITIONAL_CALL_INFO = "AdditionalCallInfo";
public static final java.lang.String EXTRA_CALL_RAT_TYPE = "CallRadioTech";
public static final java.lang.String EXTRA_CHILD_NUMBER = "ChildNum";
public static final java.lang.String EXTRA_CNA = "cna";
public static final java.lang.String EXTRA_CNAP = "cnap";
public static final java.lang.String EXTRA_CODEC = "Codec";
public static final java.lang.String EXTRA_DIALSTRING = "dialstring";
public static final java.lang.String EXTRA_DISPLAY_TEXT = "DisplayText";
public static final java.lang.String EXTRA_IS_CALL_PULL = "CallPull";
public static final java.lang.String EXTRA_OI = "oi";
public static final java.lang.String EXTRA_OIR = "oir";
public static final java.lang.String EXTRA_REMOTE_URI = "remote_uri";
public static final java.lang.String EXTRA_USSD = "ussd";
public static final int OIR_DEFAULT = 0;
public static final int OIR_PRESENTATION_NOT_RESTRICTED = 2;
public static final int OIR_PRESENTATION_PAYPHONE = 4;
public static final int OIR_PRESENTATION_RESTRICTED = 1;
public static final int OIR_PRESENTATION_UNKNOWN = 3;
public static final int SERVICE_TYPE_EMERGENCY = 2;
public static final int SERVICE_TYPE_NONE = 0;
public static final int SERVICE_TYPE_NORMAL = 1;
static { CREATOR = null; }
}
