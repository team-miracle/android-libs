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
public abstract class SensorEventCallback
  implements android.hardware.SensorEventListener2
{
public  SensorEventCallback() { throw new RuntimeException("Stub!"); }
public  void onSensorChanged(android.hardware.SensorEvent event) { throw new RuntimeException("Stub!"); }
public  void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) { throw new RuntimeException("Stub!"); }
public  void onFlushCompleted(android.hardware.Sensor sensor) { throw new RuntimeException("Stub!"); }
public  void onSensorAdditionalInfo(android.hardware.SensorAdditionalInfo info) { throw new RuntimeException("Stub!"); }
}
