/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.os;
public final class PersistableBundle
  extends android.os.BaseBundle
  implements java.lang.Cloneable, android.os.Parcelable
{
public  PersistableBundle() { throw new RuntimeException("Stub!"); }
public  PersistableBundle(int capacity) { throw new RuntimeException("Stub!"); }
public  PersistableBundle(android.os.PersistableBundle b) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle deepCopy() { throw new RuntimeException("Stub!"); }
public  void putPersistableBundle(java.lang.String key, android.os.PersistableBundle value) { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle getPersistableBundle(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.PersistableBundle> CREATOR;
public static final android.os.PersistableBundle EMPTY;
static { CREATOR = null; EMPTY = null; }
}
