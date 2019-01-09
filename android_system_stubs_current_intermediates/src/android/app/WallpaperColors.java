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
* limitations under the License
*/

package android.app;
public final class WallpaperColors
  implements android.os.Parcelable
{
public  WallpaperColors(android.os.Parcel parcel) { throw new RuntimeException("Stub!"); }
public  WallpaperColors(android.graphics.Color primaryColor, android.graphics.Color secondaryColor, android.graphics.Color tertiaryColor) { throw new RuntimeException("Stub!"); }
public static  android.app.WallpaperColors fromDrawable(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public static  android.app.WallpaperColors fromBitmap(android.graphics.Bitmap bitmap) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  android.graphics.Color getPrimaryColor() { throw new RuntimeException("Stub!"); }
public  android.graphics.Color getSecondaryColor() { throw new RuntimeException("Stub!"); }
public  android.graphics.Color getTertiaryColor() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.WallpaperColors> CREATOR;
static { CREATOR = null; }
}
