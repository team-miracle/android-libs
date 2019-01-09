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
package android.os;
public class HardwarePropertiesManager
{
HardwarePropertiesManager() { throw new RuntimeException("Stub!"); }
public  float[] getDeviceTemperatures(int type, int source) { throw new RuntimeException("Stub!"); }
public  android.os.CpuUsageInfo[] getCpuUsages() { throw new RuntimeException("Stub!"); }
public  float[] getFanSpeeds() { throw new RuntimeException("Stub!"); }
public static final int DEVICE_TEMPERATURE_BATTERY = 2;
public static final int DEVICE_TEMPERATURE_CPU = 0;
public static final int DEVICE_TEMPERATURE_GPU = 1;
public static final int DEVICE_TEMPERATURE_SKIN = 3;
public static final int TEMPERATURE_CURRENT = 0;
public static final int TEMPERATURE_SHUTDOWN = 2;
public static final int TEMPERATURE_THROTTLING = 1;
public static final int TEMPERATURE_THROTTLING_BELOW_VR_MIN = 3;
public static final float UNDEFINED_TEMPERATURE = -3.4028235E38f;
}
