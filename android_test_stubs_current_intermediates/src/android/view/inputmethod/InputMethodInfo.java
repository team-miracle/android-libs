/*
* Copyright (C) 2007-2008 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.view.inputmethod;
public final class InputMethodInfo
  implements android.os.Parcelable
{
public  InputMethodInfo(android.content.Context context, android.content.pm.ResolveInfo service) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  InputMethodInfo(java.lang.String packageName, java.lang.String className, java.lang.CharSequence label, java.lang.String settingsActivity) { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getServiceName() { throw new RuntimeException("Stub!"); }
public  android.content.pm.ServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getComponent() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadLabel(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSettingsActivity() { throw new RuntimeException("Stub!"); }
public  int getSubtypeCount() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputMethodSubtype getSubtypeAt(int index) { throw new RuntimeException("Stub!"); }
public  int getIsDefaultResourceId() { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.inputmethod.InputMethodInfo> CREATOR;
static { CREATOR = null; }
}
