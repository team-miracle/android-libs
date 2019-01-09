/*
* Copyright (C) 2016 The Android Open Source Project
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
public final class RemoteAction
  implements android.os.Parcelable
{
public  RemoteAction(android.graphics.drawable.Icon icon, java.lang.CharSequence title, java.lang.CharSequence contentDescription, android.app.PendingIntent intent) { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  void setShouldShowIcon(boolean shouldShowIcon) { throw new RuntimeException("Stub!"); }
public  boolean shouldShowIcon() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Icon getIcon() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
public  android.app.PendingIntent getActionIntent() { throw new RuntimeException("Stub!"); }
public  android.app.RemoteAction clone() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  void dump(java.lang.String prefix, java.io.PrintWriter pw) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.RemoteAction> CREATOR;
static { CREATOR = null; }
}
