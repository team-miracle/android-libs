/*
* Copyright (C) 2008 The Android Open Source Project
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
public class ComponentInfo
  extends android.content.pm.PackageItemInfo
{
public  ComponentInfo() { throw new RuntimeException("Stub!"); }
public  ComponentInfo(android.content.pm.ComponentInfo orig) { throw new RuntimeException("Stub!"); }
protected  ComponentInfo(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public final  int getIconResource() { throw new RuntimeException("Stub!"); }
public final  int getLogoResource() { throw new RuntimeException("Stub!"); }
public final  int getBannerResource() { throw new RuntimeException("Stub!"); }
protected  void dumpFront(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
protected  void dumpBack(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public android.content.pm.ApplicationInfo applicationInfo;
public int descriptionRes;
public boolean directBootAware;
public boolean enabled;
public boolean exported;
public java.lang.String processName;
public java.lang.String splitName;
}
