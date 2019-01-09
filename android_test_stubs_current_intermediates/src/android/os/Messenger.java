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

package android.os;
public final class Messenger
  implements android.os.Parcelable
{
public  Messenger(android.os.Handler target) { throw new RuntimeException("Stub!"); }
public  Messenger(android.os.IBinder target) { throw new RuntimeException("Stub!"); }
public  void send(android.os.Message message) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.os.IBinder getBinder() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object otherObj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static  void writeMessengerOrNullToParcel(android.os.Messenger messenger, android.os.Parcel out) { throw new RuntimeException("Stub!"); }
public static  android.os.Messenger readMessengerOrNullFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.Messenger> CREATOR;
static { CREATOR = null; }
}
