/*
* Copyright (C) 2007-2008 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.view.inputmethod;
public final class InputBinding
  implements android.os.Parcelable
{
public  InputBinding(android.view.inputmethod.InputConnection conn, android.os.IBinder connToken, int uid, int pid) { throw new RuntimeException("Stub!"); }
public  InputBinding(android.view.inputmethod.InputConnection conn, android.view.inputmethod.InputBinding binding) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputConnection getConnection() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder getConnectionToken() { throw new RuntimeException("Stub!"); }
public  int getUid() { throw new RuntimeException("Stub!"); }
public  int getPid() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.inputmethod.InputBinding> CREATOR;
static { CREATOR = null; }
}
