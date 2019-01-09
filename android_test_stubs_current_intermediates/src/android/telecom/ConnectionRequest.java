/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.telecom;
public final class ConnectionRequest
  implements android.os.Parcelable
{
public  ConnectionRequest(android.telecom.PhoneAccountHandle accountHandle, android.net.Uri handle, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  ConnectionRequest(android.telecom.PhoneAccountHandle accountHandle, android.net.Uri handle, android.os.Bundle extras, int videoState) { throw new RuntimeException("Stub!"); }
public  android.telecom.PhoneAccountHandle getAccountHandle() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getAddress() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  int getVideoState() { throw new RuntimeException("Stub!"); }
public  android.telecom.Connection.RttTextStream getRttTextStream() { throw new RuntimeException("Stub!"); }
public  boolean isRequestingRtt() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel destination, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telecom.ConnectionRequest> CREATOR;
static { CREATOR = null; }
}
