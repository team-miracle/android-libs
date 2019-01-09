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
public final class TvTrackInfo
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(int type, java.lang.String id) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setLanguage(java.lang.String language) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setDescription(java.lang.CharSequence description) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setAudioChannelCount(int audioChannelCount) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setAudioSampleRate(int audioSampleRate) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setVideoWidth(int videoWidth) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setVideoHeight(int videoHeight) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setVideoFrameRate(float videoFrameRate) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setVideoPixelAspectRatio(float videoPixelAspectRatio) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setVideoActiveFormatDescription(byte videoActiveFormatDescription) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo.Builder setExtra(android.os.Bundle extra) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvTrackInfo build() { throw new RuntimeException("Stub!"); }
}
TvTrackInfo() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLanguage() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDescription() { throw new RuntimeException("Stub!"); }
public  int getAudioChannelCount() { throw new RuntimeException("Stub!"); }
public  int getAudioSampleRate() { throw new RuntimeException("Stub!"); }
public  int getVideoWidth() { throw new RuntimeException("Stub!"); }
public  int getVideoHeight() { throw new RuntimeException("Stub!"); }
public  float getVideoFrameRate() { throw new RuntimeException("Stub!"); }
public  float getVideoPixelAspectRatio() { throw new RuntimeException("Stub!"); }
public  byte getVideoActiveFormatDescription() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtra() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.tv.TvTrackInfo> CREATOR;
public static final int TYPE_AUDIO = 0;
public static final int TYPE_SUBTITLE = 2;
public static final int TYPE_VIDEO = 1;
static { CREATOR = null; }
}
