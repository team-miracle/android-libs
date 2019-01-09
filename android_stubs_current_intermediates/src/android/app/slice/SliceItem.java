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

package android.app.slice;
public final class SliceItem
  implements android.os.Parcelable
{
SliceItem() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getHints() { throw new RuntimeException("Stub!"); }
public  java.lang.String getFormat() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubType() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getBundle() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Icon getIcon() { throw new RuntimeException("Stub!"); }
public  android.app.PendingIntent getAction() { throw new RuntimeException("Stub!"); }
public  android.app.RemoteInput getRemoteInput() { throw new RuntimeException("Stub!"); }
public  int getInt() { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice getSlice() { throw new RuntimeException("Stub!"); }
public  long getLong() { throw new RuntimeException("Stub!"); }
public  boolean hasHint(java.lang.String hint) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.slice.SliceItem> CREATOR;
public static final java.lang.String FORMAT_ACTION = "action";
public static final java.lang.String FORMAT_BUNDLE = "bundle";
public static final java.lang.String FORMAT_IMAGE = "image";
public static final java.lang.String FORMAT_INT = "int";
public static final java.lang.String FORMAT_LONG = "long";
public static final java.lang.String FORMAT_REMOTE_INPUT = "input";
public static final java.lang.String FORMAT_SLICE = "slice";
public static final java.lang.String FORMAT_TEXT = "text";
static { CREATOR = null; }
}
