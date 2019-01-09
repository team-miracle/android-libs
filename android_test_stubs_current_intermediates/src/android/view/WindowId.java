/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.view;
public class WindowId
  implements android.os.Parcelable
{
public abstract static class FocusObserver
{
public  FocusObserver() { throw new RuntimeException("Stub!"); }
public abstract  void onFocusGained(android.view.WindowId token);
public abstract  void onFocusLost(android.view.WindowId token);
}
WindowId() { throw new RuntimeException("Stub!"); }
public  boolean isFocused() { throw new RuntimeException("Stub!"); }
public  void registerFocusObserver(android.view.WindowId.FocusObserver observer) { throw new RuntimeException("Stub!"); }
public  void unregisterFocusObserver(android.view.WindowId.FocusObserver observer) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object otherObj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.WindowId> CREATOR;
static { CREATOR = null; }
}
