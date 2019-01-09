/*
* Copyright (C) 2015 The Android Open Source Project
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


package android.hardware.camera2.params;
public final class OutputConfiguration
  implements android.os.Parcelable
{
public  OutputConfiguration(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public  OutputConfiguration(int surfaceGroupId, android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public <T> OutputConfiguration(android.util.Size surfaceSize, java.lang.Class<T> klass) { throw new RuntimeException("Stub!"); }
public  void enableSurfaceSharing() { throw new RuntimeException("Stub!"); }
public  void setPhysicalCameraId(java.lang.String physicalCameraId) { throw new RuntimeException("Stub!"); }
public  void addSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public  void removeSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public  int getMaxSharedSurfaceCount() { throw new RuntimeException("Stub!"); }
public  android.view.Surface getSurface() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.Surface> getSurfaces() { throw new RuntimeException("Stub!"); }
public  int getSurfaceGroupId() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.camera2.params.OutputConfiguration> CREATOR;
public static final int SURFACE_GROUP_ID_NONE = -1;
static { CREATOR = null; }
}
