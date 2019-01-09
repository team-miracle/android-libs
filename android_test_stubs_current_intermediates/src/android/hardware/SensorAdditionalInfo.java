/*
* Copyright (C) 2016 The Android Open Source Project
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

package android.hardware;
public class SensorAdditionalInfo
{
SensorAdditionalInfo() { throw new RuntimeException("Stub!"); }
public static final int TYPE_FRAME_BEGIN = 0;
public static final int TYPE_FRAME_END = 1;
public static final int TYPE_INTERNAL_TEMPERATURE = 65537;
public static final int TYPE_SAMPLING = 65540;
public static final int TYPE_SENSOR_PLACEMENT = 65539;
public static final int TYPE_UNTRACKED_DELAY = 65536;
public static final int TYPE_VEC3_CALIBRATION = 65538;
public final float[] floatValues = null;
public final int[] intValues = null;
public final android.hardware.Sensor sensor;
public final int serial;
public final int type;
}
