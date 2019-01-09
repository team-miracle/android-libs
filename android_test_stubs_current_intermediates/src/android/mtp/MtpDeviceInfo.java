/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.mtp;
public class MtpDeviceInfo
{
MtpDeviceInfo() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getManufacturer() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getModel() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getVersion() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getSerialNumber() { throw new RuntimeException("Stub!"); }
public final  int[] getOperationsSupported() { throw new RuntimeException("Stub!"); }
public final  int[] getEventsSupported() { throw new RuntimeException("Stub!"); }
public  boolean isOperationSupported(int code) { throw new RuntimeException("Stub!"); }
public  boolean isEventSupported(int code) { throw new RuntimeException("Stub!"); }
}
