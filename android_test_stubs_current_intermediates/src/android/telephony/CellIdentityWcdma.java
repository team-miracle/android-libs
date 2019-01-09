/*
* Copyright (C) 2013 The Android Open Source Project
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
public final class CellIdentityWcdma
  extends android.telephony.CellIdentity
{
CellIdentityWcdma() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getMcc() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getMnc() { throw new RuntimeException("Stub!"); }
public  int getLac() { throw new RuntimeException("Stub!"); }
public  int getCid() { throw new RuntimeException("Stub!"); }
public  int getPsc() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMccString() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMncString() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMobileNetworkOperator() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int getUarfcn() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"hiding"})
public static final android.os.Parcelable.Creator<android.telephony.CellIdentityWcdma> CREATOR;
static { CREATOR = null; }
}
