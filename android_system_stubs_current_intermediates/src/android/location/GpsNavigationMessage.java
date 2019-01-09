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
* limitations under the License
*/

package android.location;
public class GpsNavigationMessage
  implements android.os.Parcelable
{
GpsNavigationMessage() { throw new RuntimeException("Stub!"); }
public  void set(android.location.GpsNavigationMessage navigationMessage) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  byte getType() { throw new RuntimeException("Stub!"); }
public  void setType(byte value) { throw new RuntimeException("Stub!"); }
public  byte getPrn() { throw new RuntimeException("Stub!"); }
public  void setPrn(byte value) { throw new RuntimeException("Stub!"); }
public  short getMessageId() { throw new RuntimeException("Stub!"); }
public  void setMessageId(short value) { throw new RuntimeException("Stub!"); }
public  short getSubmessageId() { throw new RuntimeException("Stub!"); }
public  void setSubmessageId(short value) { throw new RuntimeException("Stub!"); }
public  byte[] getData() { throw new RuntimeException("Stub!"); }
public  void setData(byte[] value) { throw new RuntimeException("Stub!"); }
public  short getStatus() { throw new RuntimeException("Stub!"); }
public  void setStatus(short value) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.location.GpsNavigationMessage> CREATOR;
public static final short STATUS_PARITY_PASSED = 1;
public static final short STATUS_PARITY_REBUILT = 2;
public static final short STATUS_UNKNOWN = 0;
public static final byte TYPE_CNAV2 = 4;
public static final byte TYPE_L1CA = 1;
public static final byte TYPE_L2CNAV = 2;
public static final byte TYPE_L5CNAV = 3;
public static final byte TYPE_UNKNOWN = 0;
static { CREATOR = null; }
}
