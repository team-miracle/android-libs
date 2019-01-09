/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.view;
@java.lang.Deprecated()
public abstract class OrientationListener
  implements android.hardware.SensorListener
{
public  OrientationListener(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  OrientationListener(android.content.Context context, int rate) { throw new RuntimeException("Stub!"); }
public  void enable() { throw new RuntimeException("Stub!"); }
public  void disable() { throw new RuntimeException("Stub!"); }
public  void onAccuracyChanged(int sensor, int accuracy) { throw new RuntimeException("Stub!"); }
public  void onSensorChanged(int sensor, float[] values) { throw new RuntimeException("Stub!"); }
public abstract  void onOrientationChanged(int orientation);
public static final int ORIENTATION_UNKNOWN = -1;
}
