/*
* Copyright (C) 2018 The Android Open Source Project
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

package android.telephony.ims;
public final class ImsCallForwardInfo
  implements android.os.Parcelable
{
public  ImsCallForwardInfo(int condition, int status, int toA, int serviceClass, java.lang.String number, int replyTimerSec) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int getCondition() { throw new RuntimeException("Stub!"); }
public  int getStatus() { throw new RuntimeException("Stub!"); }
public  int getToA() { throw new RuntimeException("Stub!"); }
public  int getServiceClass() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNumber() { throw new RuntimeException("Stub!"); }
public  int getTimeSeconds() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.ims.ImsCallForwardInfo> CREATOR;
static { CREATOR = null; }
}