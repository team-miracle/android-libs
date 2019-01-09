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
public class PackageItemInfo
{
public static class DisplayNameComparator
  implements java.util.Comparator<android.content.pm.PackageItemInfo>
{
public  DisplayNameComparator(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public final  int compare(android.content.pm.PackageItemInfo aa, android.content.pm.PackageItemInfo ab) { throw new RuntimeException("Stub!"); }
}
public  PackageItemInfo() { throw new RuntimeException("Stub!"); }
public  PackageItemInfo(android.content.pm.PackageItemInfo orig) { throw new RuntimeException("Stub!"); }
protected  PackageItemInfo(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadLabel(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadUnbadgedIcon(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadBanner(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadLogo(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.content.res.XmlResourceParser loadXmlMetaData(android.content.pm.PackageManager pm, java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  void dumpFront(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
protected  void dumpBack(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public int banner;
public int icon;
public int labelRes;
public int logo;
public android.os.Bundle metaData;
public java.lang.String name;
public java.lang.CharSequence nonLocalizedLabel;
public java.lang.String packageName;
}
