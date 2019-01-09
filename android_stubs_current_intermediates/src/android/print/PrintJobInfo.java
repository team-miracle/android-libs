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
public final class PrintJobInfo
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(android.print.PrintJobInfo prototype) { throw new RuntimeException("Stub!"); }
public  void setCopies(int copies) { throw new RuntimeException("Stub!"); }
public  void setAttributes(android.print.PrintAttributes attributes) { throw new RuntimeException("Stub!"); }
public  void setPages(android.print.PageRange[] pages) { throw new RuntimeException("Stub!"); }
public  void putAdvancedOption(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void putAdvancedOption(java.lang.String key, int value) { throw new RuntimeException("Stub!"); }
public  android.print.PrintJobInfo build() { throw new RuntimeException("Stub!"); }
}
PrintJobInfo() { throw new RuntimeException("Stub!"); }
public  android.print.PrintJobId getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLabel() { throw new RuntimeException("Stub!"); }
public  android.print.PrinterId getPrinterId() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  long getCreationTime() { throw new RuntimeException("Stub!"); }
public  int getCopies() { throw new RuntimeException("Stub!"); }
public  android.print.PageRange[] getPages() { throw new RuntimeException("Stub!"); }
public  android.print.PrintAttributes getAttributes() { throw new RuntimeException("Stub!"); }
public  boolean hasAdvancedOption(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.String getAdvancedStringOption(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int getAdvancedIntOption(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.print.PrintJobInfo> CREATOR;
public static final int STATE_BLOCKED = 4;
public static final int STATE_CANCELED = 7;
public static final int STATE_COMPLETED = 5;
public static final int STATE_CREATED = 1;
public static final int STATE_FAILED = 6;
public static final int STATE_QUEUED = 2;
public static final int STATE_STARTED = 3;
static { CREATOR = null; }
}
