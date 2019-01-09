/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.content.pm;
public class InstrumentationInfo
  extends android.content.pm.PackageItemInfo
  implements android.os.Parcelable
{
public  InstrumentationInfo() { throw new RuntimeException("Stub!"); }
public  InstrumentationInfo(android.content.pm.InstrumentationInfo orig) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.InstrumentationInfo> CREATOR;
public java.lang.String dataDir;
public boolean functionalTest;
public boolean handleProfiling;
public java.lang.String publicSourceDir;
public java.lang.String sourceDir;
public java.lang.String[] splitNames = null;
public java.lang.String[] splitPublicSourceDirs = null;
public java.lang.String[] splitSourceDirs = null;
public java.lang.String targetPackage;
public java.lang.String targetProcesses;
static { CREATOR = null; }
}
