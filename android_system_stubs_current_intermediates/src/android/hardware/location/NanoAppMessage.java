/*
* Copyright 2017 The Android Open Source Project
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
package android.hardware.location;
public final class NanoAppMessage
  implements android.os.Parcelable
{
NanoAppMessage() { throw new RuntimeException("Stub!"); }
public static  android.hardware.location.NanoAppMessage createMessageToNanoApp(long targetNanoAppId, int messageType, byte[] messageBody) { throw new RuntimeException("Stub!"); }
public static  android.hardware.location.NanoAppMessage createMessageFromNanoApp(long sourceNanoAppId, int messageType, byte[] messageBody, boolean broadcasted) { throw new RuntimeException("Stub!"); }
public  long getNanoAppId() { throw new RuntimeException("Stub!"); }
public  int getMessageType() { throw new RuntimeException("Stub!"); }
public  byte[] getMessageBody() { throw new RuntimeException("Stub!"); }
public  boolean isBroadcastMessage() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppMessage> CREATOR;
static { CREATOR = null; }
}
