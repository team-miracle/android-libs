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
public class ResolveInfo
  implements android.os.Parcelable
{
public static class DisplayNameComparator
  implements java.util.Comparator<android.content.pm.ResolveInfo>
{
public  DisplayNameComparator(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public final  int compare(android.content.pm.ResolveInfo a, android.content.pm.ResolveInfo b) { throw new RuntimeException("Stub!"); }
}
public  ResolveInfo() { throw new RuntimeException("Stub!"); }
public  ResolveInfo(android.content.pm.ResolveInfo orig) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadLabel(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public final  int getIconResource() { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.ResolveInfo> CREATOR;
public android.content.pm.ActivityInfo activityInfo;
public android.content.IntentFilter filter;
public int icon;
public boolean isDefault;
public boolean isInstantAppAvailable;
public int labelRes;
public int match;
public java.lang.CharSequence nonLocalizedLabel;
public int preferredOrder;
public int priority;
public android.content.pm.ProviderInfo providerInfo;
public java.lang.String resolvePackageName;
public android.content.pm.ServiceInfo serviceInfo;
public int specificIndex;
static { CREATOR = null; }
}
