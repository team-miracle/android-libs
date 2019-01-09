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

package android.hardware.display;
public final class BrightnessChangeEvent
  implements android.os.Parcelable
{
BrightnessChangeEvent() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.display.BrightnessChangeEvent> CREATOR;
public final float batteryLevel;
public final float brightness;
public final int colorTemperature;
public final boolean isDefaultBrightnessConfig;
public final boolean isUserSetBrightness;
public final float lastBrightness;
public final long[] luxTimestamps = null;
public final float[] luxValues = null;
public final boolean nightMode;
public final java.lang.String packageName;
public final float powerBrightnessFactor;
public final long timeStamp;
static { CREATOR = null; }
}
