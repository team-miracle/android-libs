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
* limitations under the License.
*/
package android.telephony.euicc;
public final class EuiccNotification
  implements android.os.Parcelable
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface Event
{
}
public  EuiccNotification(int seq, java.lang.String targetAddr, @android.telephony.euicc.EuiccNotification.Event()
int event, byte[] data) { throw new RuntimeException("Stub!"); }
public  int getSeq() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTargetAddr() { throw new RuntimeException("Stub!"); }
@android.telephony.euicc.EuiccNotification.Event()
public  int getEvent() { throw new RuntimeException("Stub!"); }
public  byte[] getData() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
@android.telephony.euicc.EuiccNotification.Event()
public static final int ALL_EVENTS = 15;
public static final android.os.Parcelable.Creator<android.telephony.euicc.EuiccNotification> CREATOR;
public static final int EVENT_DELETE = 8;
public static final int EVENT_DISABLE = 4;
public static final int EVENT_ENABLE = 2;
public static final int EVENT_INSTALL = 1;
static { CREATOR = null; }
}
