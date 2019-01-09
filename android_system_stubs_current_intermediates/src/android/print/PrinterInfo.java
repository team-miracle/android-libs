/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.print;
public final class PrinterInfo
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(android.print.PrinterId printerId, java.lang.String name, int status) { throw new RuntimeException("Stub!"); }
public  Builder(android.print.PrinterInfo other) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterInfo.Builder setStatus(int status) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterInfo.Builder setIconResourceId(int iconResourceId) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterInfo.Builder setHasCustomPrinterIcon(boolean hasCustomPrinterIcon) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterInfo.Builder setName(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterInfo.Builder setDescription(java.lang.String description) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterInfo.Builder setInfoIntent(android.app.PendingIntent infoIntent) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterInfo.Builder setCapabilities(android.print.PrinterCapabilitiesInfo capabilities) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterInfo build() { throw new RuntimeException("Stub!"); }
}
PrinterInfo() { throw new RuntimeException("Stub!"); }
public  android.print.PrinterId getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  int getStatus() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDescription() { throw new RuntimeException("Stub!"); }
public  android.print.PrinterCapabilitiesInfo getCapabilities() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.print.PrinterInfo> CREATOR;
public static final int STATUS_BUSY = 2;
public static final int STATUS_IDLE = 1;
public static final int STATUS_UNAVAILABLE = 3;
static { CREATOR = null; }
}
