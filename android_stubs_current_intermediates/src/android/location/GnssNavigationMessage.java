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
* limitations under the License
*/

package android.location;
public final class GnssNavigationMessage
  implements android.os.Parcelable
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onGnssNavigationMessageReceived(android.location.GnssNavigationMessage event) { throw new RuntimeException("Stub!"); }
public  void onStatusChanged(int status) { throw new RuntimeException("Stub!"); }
public static final int STATUS_LOCATION_DISABLED = 2;
public static final int STATUS_NOT_SUPPORTED = 0;
public static final int STATUS_READY = 1;
}
GnssNavigationMessage() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getSvid() { throw new RuntimeException("Stub!"); }
public  int getMessageId() { throw new RuntimeException("Stub!"); }
public  int getSubmessageId() { throw new RuntimeException("Stub!"); }
public  byte[] getData() { throw new RuntimeException("Stub!"); }
public  int getStatus() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.location.GnssNavigationMessage> CREATOR;
public static final int STATUS_PARITY_PASSED = 1;
public static final int STATUS_PARITY_REBUILT = 2;
public static final int STATUS_UNKNOWN = 0;
public static final int TYPE_BDS_D1 = 1281;
public static final int TYPE_BDS_D2 = 1282;
public static final int TYPE_GAL_F = 1538;
public static final int TYPE_GAL_I = 1537;
public static final int TYPE_GLO_L1CA = 769;
public static final int TYPE_GPS_CNAV2 = 260;
public static final int TYPE_GPS_L1CA = 257;
public static final int TYPE_GPS_L2CNAV = 258;
public static final int TYPE_GPS_L5CNAV = 259;
public static final int TYPE_UNKNOWN = 0;
static { CREATOR = null; }
}
