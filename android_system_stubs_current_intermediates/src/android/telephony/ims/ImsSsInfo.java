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
public final class ImsSsInfo
  implements android.os.Parcelable
{
public  ImsSsInfo(int status, java.lang.String icbNum) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int getStatus() { throw new RuntimeException("Stub!"); }
public  java.lang.String getIcbNum() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.ims.ImsSsInfo> CREATOR;
public static final int DISABLED = 0;
public static final int ENABLED = 1;
public static final int NOT_REGISTERED = -1;
static { CREATOR = null; }
}
