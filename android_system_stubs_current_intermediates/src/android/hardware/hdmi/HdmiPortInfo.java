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
package android.hardware.hdmi;
public final class HdmiPortInfo
  implements android.os.Parcelable
{
public  HdmiPortInfo(int id, int type, int address, boolean cec, boolean mhl, boolean arc) { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getAddress() { throw new RuntimeException("Stub!"); }
public  boolean isCecSupported() { throw new RuntimeException("Stub!"); }
public  boolean isMhlSupported() { throw new RuntimeException("Stub!"); }
public  boolean isArcSupported() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.hdmi.HdmiPortInfo> CREATOR;
public static final int PORT_INPUT = 0;
public static final int PORT_OUTPUT = 1;
static { CREATOR = null; }
}
