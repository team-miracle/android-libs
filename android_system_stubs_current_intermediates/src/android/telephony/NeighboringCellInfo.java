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

package android.telephony;
public class NeighboringCellInfo
  implements android.os.Parcelable
{
@java.lang.Deprecated()
public  NeighboringCellInfo() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  NeighboringCellInfo(int rssi, int cid) { throw new RuntimeException("Stub!"); }
public  NeighboringCellInfo(int rssi, java.lang.String location, int radioType) { throw new RuntimeException("Stub!"); }
public  NeighboringCellInfo(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  int getRssi() { throw new RuntimeException("Stub!"); }
public  int getLac() { throw new RuntimeException("Stub!"); }
public  int getCid() { throw new RuntimeException("Stub!"); }
public  int getPsc() { throw new RuntimeException("Stub!"); }
public  int getNetworkType() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setCid(int cid) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setRssi(int rssi) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.NeighboringCellInfo> CREATOR;
public static final int UNKNOWN_CID = -1;
public static final int UNKNOWN_RSSI = 99;
static { CREATOR = null; }
}
