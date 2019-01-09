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

package android.os;
public abstract class VibrationEffect
  implements android.os.Parcelable
{
VibrationEffect() { throw new RuntimeException("Stub!"); }
public static  android.os.VibrationEffect createOneShot(long milliseconds, int amplitude) { throw new RuntimeException("Stub!"); }
public static  android.os.VibrationEffect createWaveform(long[] timings, int repeat) { throw new RuntimeException("Stub!"); }
public static  android.os.VibrationEffect createWaveform(long[] timings, int[] amplitudes, int repeat) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.VibrationEffect> CREATOR;
public static final int DEFAULT_AMPLITUDE = -1;
static { CREATOR = null; }
}
