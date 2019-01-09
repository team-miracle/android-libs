/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.content;
public final class ComponentName
  implements android.os.Parcelable, java.lang.Cloneable, java.lang.Comparable<android.content.ComponentName>
{
public  ComponentName(java.lang.String pkg, java.lang.String cls) { throw new RuntimeException("Stub!"); }
public  ComponentName(android.content.Context pkg, java.lang.String cls) { throw new RuntimeException("Stub!"); }
public  ComponentName(android.content.Context pkg, java.lang.Class<?> cls) { throw new RuntimeException("Stub!"); }
public  ComponentName(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static  android.content.ComponentName createRelative(java.lang.String pkg, java.lang.String cls) { throw new RuntimeException("Stub!"); }
public static  android.content.ComponentName createRelative(android.content.Context pkg, java.lang.String cls) { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getClassName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getShortClassName() { throw new RuntimeException("Stub!"); }
public  java.lang.String flattenToString() { throw new RuntimeException("Stub!"); }
public  java.lang.String flattenToShortString() { throw new RuntimeException("Stub!"); }
public static  android.content.ComponentName unflattenFromString(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  java.lang.String toShortString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int compareTo(android.content.ComponentName that) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static  void writeToParcel(android.content.ComponentName c, android.os.Parcel out) { throw new RuntimeException("Stub!"); }
public static  android.content.ComponentName readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.ComponentName> CREATOR;
static { CREATOR = null; }
}
