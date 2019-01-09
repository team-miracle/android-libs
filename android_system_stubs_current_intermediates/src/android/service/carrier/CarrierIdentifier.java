/**
* Copyright (c) 2015, The Android Open Source Project
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

package android.service.carrier;
public class CarrierIdentifier
  implements android.os.Parcelable
{
public  CarrierIdentifier(java.lang.String mcc, java.lang.String mnc, java.lang.String spn, java.lang.String imsi, java.lang.String gid1, java.lang.String gid2) { throw new RuntimeException("Stub!"); }
public  CarrierIdentifier(byte[] mccMnc, java.lang.String gid1, java.lang.String gid2) { throw new RuntimeException("Stub!"); }
public  java.lang.String getMcc() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMnc() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSpn() { throw new RuntimeException("Stub!"); }
public  java.lang.String getImsi() { throw new RuntimeException("Stub!"); }
public  java.lang.String getGid1() { throw new RuntimeException("Stub!"); }
public  java.lang.String getGid2() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.carrier.CarrierIdentifier> CREATOR;
static { CREATOR = null; }
}
