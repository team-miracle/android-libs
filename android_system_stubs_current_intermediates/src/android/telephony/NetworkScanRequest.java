/*
* Copyright (C) 2017 The Android Open Source Project
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
public final class NetworkScanRequest
  implements android.os.Parcelable
{
public  NetworkScanRequest(int scanType, android.telephony.RadioAccessSpecifier[] specifiers, int searchPeriodicity, int maxSearchTime, boolean incrementalResults, int incrementalResultsPeriodicity, java.util.ArrayList<java.lang.String> mccMncs) { throw new RuntimeException("Stub!"); }
public  int getScanType() { throw new RuntimeException("Stub!"); }
public  int getSearchPeriodicity() { throw new RuntimeException("Stub!"); }
public  int getMaxSearchTime() { throw new RuntimeException("Stub!"); }
public  boolean getIncrementalResults() { throw new RuntimeException("Stub!"); }
public  int getIncrementalResultsPeriodicity() { throw new RuntimeException("Stub!"); }
public  android.telephony.RadioAccessSpecifier[] getSpecifiers() { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.String> getPlmns() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.NetworkScanRequest> CREATOR;
public static final int SCAN_TYPE_ONE_SHOT = 0;
public static final int SCAN_TYPE_PERIODIC = 1;
static { CREATOR = null; }
}
