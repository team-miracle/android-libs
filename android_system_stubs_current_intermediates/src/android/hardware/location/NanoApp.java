/*
* Copyright (C) 2016 The Android Open Source Project
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
package android.hardware.location;
@java.lang.Deprecated()
public class NanoApp
  implements android.os.Parcelable
{
public  NanoApp() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  NanoApp(int appId, byte[] appBinary) { throw new RuntimeException("Stub!"); }
public  NanoApp(long appId, byte[] appBinary) { throw new RuntimeException("Stub!"); }
public  void setPublisher(java.lang.String publisher) { throw new RuntimeException("Stub!"); }
public  void setName(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void setAppId(long appId) { throw new RuntimeException("Stub!"); }
public  void setAppVersion(int appVersion) { throw new RuntimeException("Stub!"); }
public  void setNeededReadMemBytes(int neededReadMemBytes) { throw new RuntimeException("Stub!"); }
public  void setNeededWriteMemBytes(int neededWriteMemBytes) { throw new RuntimeException("Stub!"); }
public  void setNeededExecMemBytes(int neededExecMemBytes) { throw new RuntimeException("Stub!"); }
public  void setNeededSensors(int[] neededSensors) { throw new RuntimeException("Stub!"); }
public  void setOutputEvents(int[] outputEvents) { throw new RuntimeException("Stub!"); }
public  void setAppBinary(byte[] appBinary) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPublisher() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  long getAppId() { throw new RuntimeException("Stub!"); }
public  int getAppVersion() { throw new RuntimeException("Stub!"); }
public  int getNeededReadMemBytes() { throw new RuntimeException("Stub!"); }
public  int getNeededWriteMemBytes() { throw new RuntimeException("Stub!"); }
public  int getNeededExecMemBytes() { throw new RuntimeException("Stub!"); }
public  int[] getNeededSensors() { throw new RuntimeException("Stub!"); }
public  int[] getOutputEvents() { throw new RuntimeException("Stub!"); }
public  byte[] getAppBinary() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.location.NanoApp> CREATOR;
static { CREATOR = null; }
}
