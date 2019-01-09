/*
* Copyright 2017 The Android Open Source Project
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
public final class BufferingParams
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.media.BufferingParams bp) { throw new RuntimeException("Stub!"); }
public  android.media.BufferingParams build() { throw new RuntimeException("Stub!"); }
public  android.media.BufferingParams.Builder setInitialMarkMs(int markMs) { throw new RuntimeException("Stub!"); }
public  android.media.BufferingParams.Builder setResumePlaybackMarkMs(int markMs) { throw new RuntimeException("Stub!"); }
}
BufferingParams() { throw new RuntimeException("Stub!"); }
public  int getInitialMarkMs() { throw new RuntimeException("Stub!"); }
public  int getResumePlaybackMarkMs() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.BufferingParams> CREATOR;
static { CREATOR = null; }
}
