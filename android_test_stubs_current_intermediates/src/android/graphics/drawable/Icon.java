/*
* Copyright (C) 2015 The Android Open Source Project
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

package android.graphics.drawable;
public final class Icon
  implements android.os.Parcelable
{
public static interface OnDrawableLoadedListener
{
public abstract  void onDrawableLoaded(android.graphics.drawable.Drawable d);
}
Icon() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getResPackage() { throw new RuntimeException("Stub!"); }
public  int getResId() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getUri() { throw new RuntimeException("Stub!"); }
public  void loadDrawableAsync(android.content.Context context, android.os.Message andThen) { throw new RuntimeException("Stub!"); }
public  void loadDrawableAsync(android.content.Context context, android.graphics.drawable.Icon.OnDrawableLoadedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadDrawable(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Icon createWithResource(android.content.Context context, int resId) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Icon createWithResource(java.lang.String resPackage, int resId) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Icon createWithBitmap(android.graphics.Bitmap bits) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Icon createWithAdaptiveBitmap(android.graphics.Bitmap bits) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Icon createWithData(byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Icon createWithContentUri(java.lang.String uri) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Icon createWithContentUri(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Icon setTint(int tint) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Icon setTintList(android.content.res.ColorStateList tintList) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Icon setTintMode(android.graphics.PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Icon createWithFilePath(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.graphics.drawable.Icon> CREATOR;
public static final int TYPE_ADAPTIVE_BITMAP = 5;
public static final int TYPE_BITMAP = 1;
public static final int TYPE_DATA = 3;
public static final int TYPE_RESOURCE = 2;
public static final int TYPE_URI = 4;
static { CREATOR = null; }
}
