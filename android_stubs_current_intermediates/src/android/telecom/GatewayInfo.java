/*
* Copyright 2014, The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.telecom;
public class GatewayInfo
  implements android.os.Parcelable
{
public  GatewayInfo(java.lang.String packageName, android.net.Uri gatewayUri, android.net.Uri originalAddress) { throw new RuntimeException("Stub!"); }
public  java.lang.String getGatewayProviderPackageName() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getGatewayAddress() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getOriginalAddress() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel destination, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telecom.GatewayInfo> CREATOR;
static { CREATOR = null; }
}
