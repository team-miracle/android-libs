/*
* Copyright (C) 2014 The Android Open Source Project
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
* limitations under the License.
*/

package android.media.tv;
public final class TvInputHardwareInfo
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputHardwareInfo.Builder deviceId(int deviceId) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputHardwareInfo.Builder type(int type) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputHardwareInfo.Builder audioType(int audioType) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputHardwareInfo.Builder audioAddress(java.lang.String audioAddress) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputHardwareInfo.Builder hdmiPortId(int hdmiPortId) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputHardwareInfo.Builder cableConnectionStatus(int cableConnectionStatus) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputHardwareInfo build() { throw new RuntimeException("Stub!"); }
}
TvInputHardwareInfo() { throw new RuntimeException("Stub!"); }
public  int getDeviceId() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getAudioType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAudioAddress() { throw new RuntimeException("Stub!"); }
public  int getHdmiPortId() { throw new RuntimeException("Stub!"); }
public  int getCableConnectionStatus() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public static final int CABLE_CONNECTION_STATUS_CONNECTED = 1;
public static final int CABLE_CONNECTION_STATUS_DISCONNECTED = 2;
public static final int CABLE_CONNECTION_STATUS_UNKNOWN = 0;
public static final android.os.Parcelable.Creator<android.media.tv.TvInputHardwareInfo> CREATOR;
public static final int TV_INPUT_TYPE_COMPONENT = 6;
public static final int TV_INPUT_TYPE_COMPOSITE = 3;
public static final int TV_INPUT_TYPE_DISPLAY_PORT = 10;
public static final int TV_INPUT_TYPE_DVI = 8;
public static final int TV_INPUT_TYPE_HDMI = 9;
public static final int TV_INPUT_TYPE_OTHER_HARDWARE = 1;
public static final int TV_INPUT_TYPE_SCART = 5;
public static final int TV_INPUT_TYPE_SVIDEO = 4;
public static final int TV_INPUT_TYPE_TUNER = 2;
public static final int TV_INPUT_TYPE_VGA = 7;
static { CREATOR = null; }
}
