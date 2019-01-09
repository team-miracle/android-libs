/*
* Copyright (C) 2017 The Android Open Source Project
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
public final class SharedLibraryInfo
  implements android.os.Parcelable
{
SharedLibraryInfo() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  long getLongVersion() { throw new RuntimeException("Stub!"); }
public  android.content.pm.VersionedPackage getDeclaringPackage() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.pm.VersionedPackage> getDependentPackages() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.pm.SharedLibraryInfo> CREATOR;
public static final int TYPE_BUILTIN = 0;
public static final int TYPE_DYNAMIC = 1;
public static final int TYPE_STATIC = 2;
public static final int VERSION_UNDEFINED = -1;
static { CREATOR = null; }
}
