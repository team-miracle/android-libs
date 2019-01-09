/*
* Copyright 2017 The Android Open Source Project
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
package android.media;
public final class VolumeShaper
  implements java.lang.AutoCloseable
{
public static final class Configuration
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.media.VolumeShaper.Configuration configuration) { throw new RuntimeException("Stub!"); }
public  android.media.VolumeShaper.Configuration.Builder setInterpolatorType(int interpolatorType) { throw new RuntimeException("Stub!"); }
public  android.media.VolumeShaper.Configuration.Builder setDuration(long durationMillis) { throw new RuntimeException("Stub!"); }
public  android.media.VolumeShaper.Configuration.Builder setCurve(float[] times, float[] volumes) { throw new RuntimeException("Stub!"); }
public  android.media.VolumeShaper.Configuration.Builder reflectTimes() { throw new RuntimeException("Stub!"); }
public  android.media.VolumeShaper.Configuration.Builder invertVolumes() { throw new RuntimeException("Stub!"); }
public  android.media.VolumeShaper.Configuration.Builder scaleToEndVolume(float volume) { throw new RuntimeException("Stub!"); }
public  android.media.VolumeShaper.Configuration.Builder scaleToStartVolume(float volume) { throw new RuntimeException("Stub!"); }
public  android.media.VolumeShaper.Configuration build() { throw new RuntimeException("Stub!"); }
}
Configuration() { throw new RuntimeException("Stub!"); }
public static  int getMaximumCurvePoints() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int getInterpolatorType() { throw new RuntimeException("Stub!"); }
public  long getDuration() { throw new RuntimeException("Stub!"); }
public  float[] getTimes() { throw new RuntimeException("Stub!"); }
public  float[] getVolumes() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.VolumeShaper.Configuration> CREATOR;
public static final android.media.VolumeShaper.Configuration CUBIC_RAMP;
public static final int INTERPOLATOR_TYPE_CUBIC = 2;
public static final int INTERPOLATOR_TYPE_CUBIC_MONOTONIC = 3;
public static final int INTERPOLATOR_TYPE_LINEAR = 1;
public static final int INTERPOLATOR_TYPE_STEP = 0;
public static final android.media.VolumeShaper.Configuration LINEAR_RAMP;
public static final android.media.VolumeShaper.Configuration SCURVE_RAMP;
public static final android.media.VolumeShaper.Configuration SINE_RAMP;
static { CREATOR = null; CUBIC_RAMP = null; LINEAR_RAMP = null; SCURVE_RAMP = null; SINE_RAMP = null; }
}
public static final class Operation
  implements android.os.Parcelable
{
Operation() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.media.VolumeShaper.Operation> CREATOR;
public static final android.media.VolumeShaper.Operation PLAY;
public static final android.media.VolumeShaper.Operation REVERSE;
static { CREATOR = null; PLAY = null; REVERSE = null; }
}
VolumeShaper() { throw new RuntimeException("Stub!"); }
public  void apply(android.media.VolumeShaper.Operation operation) { throw new RuntimeException("Stub!"); }
public  void replace(android.media.VolumeShaper.Configuration configuration, android.media.VolumeShaper.Operation operation, boolean join) { throw new RuntimeException("Stub!"); }
public  float getVolume() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
}
