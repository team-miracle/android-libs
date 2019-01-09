/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.net;
public class NetworkInfo
  implements android.os.Parcelable
{
public static enum State
{
CONNECTED(),
CONNECTING(),
DISCONNECTED(),
DISCONNECTING(),
SUSPENDED(),
UNKNOWN();
}
public static enum DetailedState
{
AUTHENTICATING(),
BLOCKED(),
CAPTIVE_PORTAL_CHECK(),
CONNECTED(),
CONNECTING(),
DISCONNECTED(),
DISCONNECTING(),
FAILED(),
IDLE(),
OBTAINING_IPADDR(),
SCANNING(),
SUSPENDED(),
VERIFYING_POOR_LINK();
}
NetworkInfo() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getSubtype() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getTypeName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubtypeName() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isConnectedOrConnecting() { throw new RuntimeException("Stub!"); }
public  boolean isConnected() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isAvailable() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isFailover() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isRoaming() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.net.NetworkInfo.State getState() { throw new RuntimeException("Stub!"); }
public  android.net.NetworkInfo.DetailedState getDetailedState() { throw new RuntimeException("Stub!"); }
@Deprecated
public  java.lang.String getReason() { throw new RuntimeException("Stub!"); }
public  java.lang.String getExtraInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.NetworkInfo> CREATOR;
static { CREATOR = null; }
}
