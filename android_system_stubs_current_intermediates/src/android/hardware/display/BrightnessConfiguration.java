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

package android.hardware.display;
public final class BrightnessConfiguration
  implements android.os.Parcelable
{
public static class Builder
{
public  Builder(float[] lux, float[] nits) { throw new RuntimeException("Stub!"); }
public  android.hardware.display.BrightnessConfiguration.Builder setDescription(java.lang.String description) { throw new RuntimeException("Stub!"); }
public  android.hardware.display.BrightnessConfiguration build() { throw new RuntimeException("Stub!"); }
}
BrightnessConfiguration() { throw new RuntimeException("Stub!"); }
public  android.util.Pair<float[], float[]> getCurve() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.display.BrightnessConfiguration> CREATOR;
static { CREATOR = null; }
}
