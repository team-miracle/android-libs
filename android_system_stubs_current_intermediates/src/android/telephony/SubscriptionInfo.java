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
* limitations under the License.
*/

package android.telephony;
public class SubscriptionInfo
  implements android.os.Parcelable
{
SubscriptionInfo() { throw new RuntimeException("Stub!"); }
public  int getSubscriptionId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getIccId() { throw new RuntimeException("Stub!"); }
public  int getSimSlotIndex() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getDisplayName() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getCarrierName() { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap createIconBitmap(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  int getIconTint() { throw new RuntimeException("Stub!"); }
public  java.lang.String getNumber() { throw new RuntimeException("Stub!"); }
public  int getDataRoaming() { throw new RuntimeException("Stub!"); }
public  int getMcc() { throw new RuntimeException("Stub!"); }
public  int getMnc() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCountryIso() { throw new RuntimeException("Stub!"); }
public  boolean isEmbedded() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.UiccAccessRule> getAccessRules() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.SubscriptionInfo> CREATOR;
static { CREATOR = null; }
}
