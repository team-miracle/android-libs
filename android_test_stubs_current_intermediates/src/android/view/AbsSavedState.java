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
public abstract class AbsSavedState
  implements android.os.Parcelable
{
protected  AbsSavedState(android.os.Parcelable superState) { throw new RuntimeException("Stub!"); }
protected  AbsSavedState(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
protected  AbsSavedState(android.os.Parcel source, java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public final  android.os.Parcelable getSuperState() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.AbsSavedState> CREATOR;
public static final android.view.AbsSavedState EMPTY_STATE;
static { CREATOR = null; EMPTY_STATE = null; }
}
