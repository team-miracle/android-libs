/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.app;
public final class PictureInPictureParams
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.app.PictureInPictureParams.Builder setAspectRatio(android.util.Rational aspectRatio) { throw new RuntimeException("Stub!"); }
public  android.app.PictureInPictureParams.Builder setActions(java.util.List<android.app.RemoteAction> actions) { throw new RuntimeException("Stub!"); }
public  android.app.PictureInPictureParams.Builder setSourceRectHint(android.graphics.Rect launchBounds) { throw new RuntimeException("Stub!"); }
public  android.app.PictureInPictureParams build() { throw new RuntimeException("Stub!"); }
}
PictureInPictureParams() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.PictureInPictureParams> CREATOR;
static { CREATOR = null; }
}
