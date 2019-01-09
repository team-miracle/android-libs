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
public final class PrinterCapabilitiesInfo
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(android.print.PrinterId printerId) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterCapabilitiesInfo.Builder addMediaSize(android.print.PrintAttributes.MediaSize mediaSize, boolean isDefault) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterCapabilitiesInfo.Builder addResolution(android.print.PrintAttributes.Resolution resolution, boolean isDefault) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterCapabilitiesInfo.Builder setMinMargins(android.print.PrintAttributes.Margins margins) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterCapabilitiesInfo.Builder setColorModes(int colorModes, int defaultColorMode) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterCapabilitiesInfo.Builder setDuplexModes(int duplexModes, int defaultDuplexMode) { throw new RuntimeException("Stub!"); }
public  android.print.PrinterCapabilitiesInfo build() { throw new RuntimeException("Stub!"); }
}
PrinterCapabilitiesInfo() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.print.PrintAttributes.MediaSize> getMediaSizes() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.print.PrintAttributes.Resolution> getResolutions() { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes.Margins getMinMargins() { throw new RuntimeException("Stub!"); }
public  int getColorModes() { throw new RuntimeException("Stub!"); }
public  int getDuplexModes() { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes getDefaults() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.print.PrinterCapabilitiesInfo> CREATOR;
static { CREATOR = null; }
}
