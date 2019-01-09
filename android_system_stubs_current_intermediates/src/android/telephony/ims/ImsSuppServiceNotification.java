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
public final class ImsSuppServiceNotification
  implements android.os.Parcelable
{
public  ImsSuppServiceNotification(int notificationType, int code, int index, int type, java.lang.String number, java.lang.String[] history) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.ims.ImsSuppServiceNotification> CREATOR;
public final int code;
public final java.lang.String[] history = null;
public final int index;
public final int notificationType;
public final java.lang.String number;
public final int type;
static { CREATOR = null; }
}
