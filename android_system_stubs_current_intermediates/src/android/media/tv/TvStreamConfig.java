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
public class TvStreamConfig
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvStreamConfig.Builder streamId(int streamId) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvStreamConfig.Builder type(int type) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvStreamConfig.Builder maxWidth(int maxWidth) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvStreamConfig.Builder maxHeight(int maxHeight) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvStreamConfig.Builder generation(int generation) { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvStreamConfig build() { throw new RuntimeException("Stub!"); }
}
TvStreamConfig() { throw new RuntimeException("Stub!"); }
public  int getStreamId() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getMaxWidth() { throw new RuntimeException("Stub!"); }
public  int getMaxHeight() { throw new RuntimeException("Stub!"); }
public  int getGeneration() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.tv.TvStreamConfig> CREATOR;
public static final int STREAM_TYPE_BUFFER_PRODUCER = 2;
public static final int STREAM_TYPE_INDEPENDENT_VIDEO_SOURCE = 1;
static { CREATOR = null; }
}
