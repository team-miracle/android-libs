/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.media;
public final class AudioFormat
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.media.AudioFormat af) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFormat build() { throw new RuntimeException("Stub!"); }
public  android.media.AudioFormat.Builder setEncoding(int encoding) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.AudioFormat.Builder setChannelMask(int channelMask) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFormat.Builder setChannelIndexMask(int channelIndexMask) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFormat.Builder setSampleRate(int sampleRate) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
}
AudioFormat() { throw new RuntimeException("Stub!"); }
public  int getEncoding() { throw new RuntimeException("Stub!"); }
public  int getSampleRate() { throw new RuntimeException("Stub!"); }
public  int getChannelMask() { throw new RuntimeException("Stub!"); }
public  int getChannelIndexMask() { throw new RuntimeException("Stub!"); }
public  int getChannelCount() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static final int CHANNEL_CONFIGURATION_DEFAULT = 1;
@java.lang.Deprecated()
public static final int CHANNEL_CONFIGURATION_INVALID = 0;
@java.lang.Deprecated()
public static final int CHANNEL_CONFIGURATION_MONO = 2;
@java.lang.Deprecated()
public static final int CHANNEL_CONFIGURATION_STEREO = 3;
public static final int CHANNEL_INVALID = 0;
public static final int CHANNEL_IN_BACK = 32;
public static final int CHANNEL_IN_BACK_PROCESSED = 512;
public static final int CHANNEL_IN_DEFAULT = 1;
public static final int CHANNEL_IN_FRONT = 16;
public static final int CHANNEL_IN_FRONT_PROCESSED = 256;
public static final int CHANNEL_IN_LEFT = 4;
public static final int CHANNEL_IN_LEFT_PROCESSED = 64;
public static final int CHANNEL_IN_MONO = 16;
public static final int CHANNEL_IN_PRESSURE = 1024;
public static final int CHANNEL_IN_RIGHT = 8;
public static final int CHANNEL_IN_RIGHT_PROCESSED = 128;
public static final int CHANNEL_IN_STEREO = 12;
public static final int CHANNEL_IN_VOICE_DNLINK = 32768;
public static final int CHANNEL_IN_VOICE_UPLINK = 16384;
public static final int CHANNEL_IN_X_AXIS = 2048;
public static final int CHANNEL_IN_Y_AXIS = 4096;
public static final int CHANNEL_IN_Z_AXIS = 8192;
public static final int CHANNEL_OUT_5POINT1 = 252;
@java.lang.Deprecated()
public static final int CHANNEL_OUT_7POINT1 = 1020;
public static final int CHANNEL_OUT_7POINT1_SURROUND = 6396;
public static final int CHANNEL_OUT_BACK_CENTER = 1024;
public static final int CHANNEL_OUT_BACK_LEFT = 64;
public static final int CHANNEL_OUT_BACK_RIGHT = 128;
public static final int CHANNEL_OUT_DEFAULT = 1;
public static final int CHANNEL_OUT_FRONT_CENTER = 16;
public static final int CHANNEL_OUT_FRONT_LEFT = 4;
public static final int CHANNEL_OUT_FRONT_LEFT_OF_CENTER = 256;
public static final int CHANNEL_OUT_FRONT_RIGHT = 8;
public static final int CHANNEL_OUT_FRONT_RIGHT_OF_CENTER = 512;
public static final int CHANNEL_OUT_LOW_FREQUENCY = 32;
public static final int CHANNEL_OUT_MONO = 4;
public static final int CHANNEL_OUT_QUAD = 204;
public static final int CHANNEL_OUT_SIDE_LEFT = 2048;
public static final int CHANNEL_OUT_SIDE_RIGHT = 4096;
public static final int CHANNEL_OUT_STEREO = 12;
public static final int CHANNEL_OUT_SURROUND = 1052;
public static final android.os.Parcelable.Creator<android.media.AudioFormat> CREATOR;
public static final int ENCODING_AAC_ELD = 15;
public static final int ENCODING_AAC_HE_V1 = 11;
public static final int ENCODING_AAC_HE_V2 = 12;
public static final int ENCODING_AAC_LC = 10;
public static final int ENCODING_AAC_XHE = 16;
public static final int ENCODING_AC3 = 5;
public static final int ENCODING_AC4 = 17;
public static final int ENCODING_DEFAULT = 1;
public static final int ENCODING_DOLBY_TRUEHD = 14;
public static final int ENCODING_DTS = 7;
public static final int ENCODING_DTS_HD = 8;
public static final int ENCODING_E_AC3 = 6;
public static final int ENCODING_E_AC3_JOC = 18;
public static final int ENCODING_IEC61937 = 13;
public static final int ENCODING_INVALID = 0;
public static final int ENCODING_MP3 = 9;
public static final int ENCODING_PCM_16BIT = 2;
public static final int ENCODING_PCM_8BIT = 3;
public static final int ENCODING_PCM_FLOAT = 4;
public static final int SAMPLE_RATE_UNSPECIFIED = 0;
static { CREATOR = null; }
}
