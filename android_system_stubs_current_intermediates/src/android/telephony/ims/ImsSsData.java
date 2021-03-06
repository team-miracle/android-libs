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
public final class ImsSsData
  implements android.os.Parcelable
{
public  ImsSsData(int serviceType, int requestType, int teleserviceType, int serviceClass, int result) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  boolean isTypeCf() { throw new RuntimeException("Stub!"); }
public  boolean isTypeUnConditional() { throw new RuntimeException("Stub!"); }
public  boolean isTypeCw() { throw new RuntimeException("Stub!"); }
public  boolean isTypeClip() { throw new RuntimeException("Stub!"); }
public  boolean isTypeColr() { throw new RuntimeException("Stub!"); }
public  boolean isTypeColp() { throw new RuntimeException("Stub!"); }
public  boolean isTypeClir() { throw new RuntimeException("Stub!"); }
public  boolean isTypeIcb() { throw new RuntimeException("Stub!"); }
public  boolean isTypeBarring() { throw new RuntimeException("Stub!"); }
public  boolean isTypeInterrogation() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.ims.ImsSsData> CREATOR;
public static final int SS_ACTIVATION = 0;
public static final int SS_ALL_BARRING = 18;
public static final int SS_ALL_DATA_TELESERVICES = 3;
public static final int SS_ALL_TELESERVICES_EXCEPT_SMS = 5;
public static final int SS_ALL_TELESEVICES = 1;
public static final int SS_ALL_TELE_AND_BEARER_SERVICES = 0;
public static final int SS_BAIC = 16;
public static final int SS_BAIC_ROAMING = 17;
public static final int SS_BAOC = 13;
public static final int SS_BAOIC = 14;
public static final int SS_BAOIC_EXC_HOME = 15;
public static final int SS_CFU = 0;
public static final int SS_CFUT = 6;
public static final int SS_CF_ALL = 4;
public static final int SS_CF_ALL_CONDITIONAL = 5;
public static final int SS_CF_BUSY = 1;
public static final int SS_CF_NOT_REACHABLE = 3;
public static final int SS_CF_NO_REPLY = 2;
public static final int SS_CLIP = 7;
public static final int SS_CLIR = 8;
public static final int SS_CNAP = 11;
public static final int SS_COLP = 9;
public static final int SS_COLR = 10;
public static final int SS_DEACTIVATION = 1;
public static final int SS_ERASURE = 4;
public static final int SS_INCOMING_BARRING = 20;
public static final int SS_INCOMING_BARRING_ANONYMOUS = 22;
public static final int SS_INCOMING_BARRING_DN = 21;
public static final int SS_INTERROGATION = 2;
public static final int SS_OUTGOING_BARRING = 19;
public static final int SS_REGISTRATION = 3;
public static final int SS_SMS_SERVICES = 4;
public static final int SS_TELEPHONY = 2;
public static final int SS_WAIT = 12;
static { CREATOR = null; }
}
