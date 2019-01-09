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
public final class ImsStreamMediaProfile
  implements android.os.Parcelable
{
public  ImsStreamMediaProfile(int audioQuality, int audioDirection, int videoQuality, int videoDirection, int rttMode) { throw new RuntimeException("Stub!"); }
public  void copyFrom(android.telephony.ims.ImsStreamMediaProfile profile) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  boolean isRttCall() { throw new RuntimeException("Stub!"); }
public  void setRttMode(int rttMode) { throw new RuntimeException("Stub!"); }
public  int getAudioQuality() { throw new RuntimeException("Stub!"); }
public  int getAudioDirection() { throw new RuntimeException("Stub!"); }
public  int getVideoQuality() { throw new RuntimeException("Stub!"); }
public  int getVideoDirection() { throw new RuntimeException("Stub!"); }
public  int getRttMode() { throw new RuntimeException("Stub!"); }
public static final int AUDIO_QUALITY_AMR = 1;
public static final int AUDIO_QUALITY_AMR_WB = 2;
public static final int AUDIO_QUALITY_EVRC = 4;
public static final int AUDIO_QUALITY_EVRC_B = 5;
public static final int AUDIO_QUALITY_EVRC_NW = 7;
public static final int AUDIO_QUALITY_EVRC_WB = 6;
public static final int AUDIO_QUALITY_EVS_FB = 20;
public static final int AUDIO_QUALITY_EVS_NB = 17;
public static final int AUDIO_QUALITY_EVS_SWB = 19;
public static final int AUDIO_QUALITY_EVS_WB = 18;
public static final int AUDIO_QUALITY_G711A = 13;
public static final int AUDIO_QUALITY_G711AB = 15;
public static final int AUDIO_QUALITY_G711U = 11;
public static final int AUDIO_QUALITY_G722 = 14;
public static final int AUDIO_QUALITY_G723 = 12;
public static final int AUDIO_QUALITY_G729 = 16;
public static final int AUDIO_QUALITY_GSM_EFR = 8;
public static final int AUDIO_QUALITY_GSM_FR = 9;
public static final int AUDIO_QUALITY_GSM_HR = 10;
public static final int AUDIO_QUALITY_NONE = 0;
public static final int AUDIO_QUALITY_QCELP13K = 3;
public static final android.os.Parcelable.Creator<android.telephony.ims.ImsStreamMediaProfile> CREATOR;
public static final int DIRECTION_INACTIVE = 0;
public static final int DIRECTION_INVALID = -1;
public static final int DIRECTION_RECEIVE = 1;
public static final int DIRECTION_SEND = 2;
public static final int DIRECTION_SEND_RECEIVE = 3;
public static final int RTT_MODE_DISABLED = 0;
public static final int RTT_MODE_FULL = 1;
public static final int VIDEO_QUALITY_NONE = 0;
public static final int VIDEO_QUALITY_QCIF = 1;
public static final int VIDEO_QUALITY_QVGA_LANDSCAPE = 2;
public static final int VIDEO_QUALITY_QVGA_PORTRAIT = 4;
public static final int VIDEO_QUALITY_VGA_LANDSCAPE = 8;
public static final int VIDEO_QUALITY_VGA_PORTRAIT = 16;
static { CREATOR = null; }
}
