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
public class IccOpenLogicalChannelResponse
  implements android.os.Parcelable
{
IccOpenLogicalChannelResponse() { throw new RuntimeException("Stub!"); }
public  int getChannel() { throw new RuntimeException("Stub!"); }
public  int getStatus() { throw new RuntimeException("Stub!"); }
public  byte[] getSelectResponse() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.IccOpenLogicalChannelResponse> CREATOR;
public static final int INVALID_CHANNEL = -1;
public static final int STATUS_MISSING_RESOURCE = 2;
public static final int STATUS_NO_ERROR = 1;
public static final int STATUS_NO_SUCH_ELEMENT = 3;
public static final int STATUS_UNKNOWN_ERROR = 4;
static { CREATOR = null; }
}
