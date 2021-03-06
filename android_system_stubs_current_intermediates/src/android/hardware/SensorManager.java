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

package android.hardware;
public abstract class SensorManager
{
public abstract static class DynamicSensorCallback
{
public  DynamicSensorCallback() { throw new RuntimeException("Stub!"); }
public  void onDynamicSensorConnected(android.hardware.Sensor sensor) { throw new RuntimeException("Stub!"); }
public  void onDynamicSensorDisconnected(android.hardware.Sensor sensor) { throw new RuntimeException("Stub!"); }
}
SensorManager() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getSensors() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.Sensor> getSensorList(int type) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.Sensor> getDynamicSensorList(int type) { throw new RuntimeException("Stub!"); }
public  android.hardware.Sensor getDefaultSensor(int type) { throw new RuntimeException("Stub!"); }
public  android.hardware.Sensor getDefaultSensor(int type, boolean wakeUp) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean registerListener(android.hardware.SensorListener listener, int sensors) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean registerListener(android.hardware.SensorListener listener, int sensors, int rate) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void unregisterListener(android.hardware.SensorListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void unregisterListener(android.hardware.SensorListener listener, int sensors) { throw new RuntimeException("Stub!"); }
public  void unregisterListener(android.hardware.SensorEventListener listener, android.hardware.Sensor sensor) { throw new RuntimeException("Stub!"); }
public  void unregisterListener(android.hardware.SensorEventListener listener) { throw new RuntimeException("Stub!"); }
public  boolean registerListener(android.hardware.SensorEventListener listener, android.hardware.Sensor sensor, int samplingPeriodUs) { throw new RuntimeException("Stub!"); }
public  boolean registerListener(android.hardware.SensorEventListener listener, android.hardware.Sensor sensor, int samplingPeriodUs, int maxReportLatencyUs) { throw new RuntimeException("Stub!"); }
public  boolean registerListener(android.hardware.SensorEventListener listener, android.hardware.Sensor sensor, int samplingPeriodUs, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean registerListener(android.hardware.SensorEventListener listener, android.hardware.Sensor sensor, int samplingPeriodUs, int maxReportLatencyUs, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  boolean flush(android.hardware.SensorEventListener listener) { throw new RuntimeException("Stub!"); }
public  android.hardware.SensorDirectChannel createDirectChannel(android.os.MemoryFile mem) { throw new RuntimeException("Stub!"); }
public  android.hardware.SensorDirectChannel createDirectChannel(android.hardware.HardwareBuffer mem) { throw new RuntimeException("Stub!"); }
public  void registerDynamicSensorCallback(android.hardware.SensorManager.DynamicSensorCallback callback) { throw new RuntimeException("Stub!"); }
public  void registerDynamicSensorCallback(android.hardware.SensorManager.DynamicSensorCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterDynamicSensorCallback(android.hardware.SensorManager.DynamicSensorCallback callback) { throw new RuntimeException("Stub!"); }
public  boolean isDynamicSensorDiscoverySupported() { throw new RuntimeException("Stub!"); }
public static  boolean getRotationMatrix(float[] R, float[] I, float[] gravity, float[] geomagnetic) { throw new RuntimeException("Stub!"); }
public static  float getInclination(float[] I) { throw new RuntimeException("Stub!"); }
public static  boolean remapCoordinateSystem(float[] inR, int X, int Y, float[] outR) { throw new RuntimeException("Stub!"); }
public static  float[] getOrientation(float[] R, float[] values) { throw new RuntimeException("Stub!"); }
public static  float getAltitude(float p0, float p) { throw new RuntimeException("Stub!"); }
public static  void getAngleChange(float[] angleChange, float[] R, float[] prevR) { throw new RuntimeException("Stub!"); }
public static  void getRotationMatrixFromVector(float[] R, float[] rotationVector) { throw new RuntimeException("Stub!"); }
public static  void getQuaternionFromVector(float[] Q, float[] rv) { throw new RuntimeException("Stub!"); }
public  boolean requestTriggerSensor(android.hardware.TriggerEventListener listener, android.hardware.Sensor sensor) { throw new RuntimeException("Stub!"); }
public  boolean cancelTriggerSensor(android.hardware.TriggerEventListener listener, android.hardware.Sensor sensor) { throw new RuntimeException("Stub!"); }
public  boolean initDataInjection(boolean enable) { throw new RuntimeException("Stub!"); }
public  boolean injectSensorData(android.hardware.Sensor sensor, float[] values, int accuracy, long timestamp) { throw new RuntimeException("Stub!"); }
public static final int AXIS_MINUS_X = 129;
public static final int AXIS_MINUS_Y = 130;
public static final int AXIS_MINUS_Z = 131;
public static final int AXIS_X = 1;
public static final int AXIS_Y = 2;
public static final int AXIS_Z = 3;
@java.lang.Deprecated()
public static final int DATA_X = 0;
@java.lang.Deprecated()
public static final int DATA_Y = 1;
@java.lang.Deprecated()
public static final int DATA_Z = 2;
public static final float GRAVITY_DEATH_STAR_I = 3.5303614E-7f;
public static final float GRAVITY_EARTH = 9.80665f;
public static final float GRAVITY_JUPITER = 23.12f;
public static final float GRAVITY_MARS = 3.71f;
public static final float GRAVITY_MERCURY = 3.7f;
public static final float GRAVITY_MOON = 1.6f;
public static final float GRAVITY_NEPTUNE = 11.0f;
public static final float GRAVITY_PLUTO = 0.6f;
public static final float GRAVITY_SATURN = 8.96f;
public static final float GRAVITY_SUN = 275.0f;
public static final float GRAVITY_THE_ISLAND = 4.815162f;
public static final float GRAVITY_URANUS = 8.69f;
public static final float GRAVITY_VENUS = 8.87f;
public static final float LIGHT_CLOUDY = 100.0f;
public static final float LIGHT_FULLMOON = 0.25f;
public static final float LIGHT_NO_MOON = 0.001f;
public static final float LIGHT_OVERCAST = 10000.0f;
public static final float LIGHT_SHADE = 20000.0f;
public static final float LIGHT_SUNLIGHT = 110000.0f;
public static final float LIGHT_SUNLIGHT_MAX = 120000.0f;
public static final float LIGHT_SUNRISE = 400.0f;
public static final float MAGNETIC_FIELD_EARTH_MAX = 60.0f;
public static final float MAGNETIC_FIELD_EARTH_MIN = 30.0f;
public static final float PRESSURE_STANDARD_ATMOSPHERE = 1013.25f;
@java.lang.Deprecated()
public static final int RAW_DATA_INDEX = 3;
@java.lang.Deprecated()
public static final int RAW_DATA_X = 3;
@java.lang.Deprecated()
public static final int RAW_DATA_Y = 4;
@java.lang.Deprecated()
public static final int RAW_DATA_Z = 5;
@java.lang.Deprecated()
public static final int SENSOR_ACCELEROMETER = 2;
@java.lang.Deprecated()
public static final int SENSOR_ALL = 127;
public static final int SENSOR_DELAY_FASTEST = 0;
public static final int SENSOR_DELAY_GAME = 1;
public static final int SENSOR_DELAY_NORMAL = 3;
public static final int SENSOR_DELAY_UI = 2;
@java.lang.Deprecated()
public static final int SENSOR_LIGHT = 16;
@java.lang.Deprecated()
public static final int SENSOR_MAGNETIC_FIELD = 8;
@java.lang.Deprecated()
public static final int SENSOR_MAX = 64;
@java.lang.Deprecated()
public static final int SENSOR_MIN = 1;
@java.lang.Deprecated()
public static final int SENSOR_ORIENTATION = 1;
@java.lang.Deprecated()
public static final int SENSOR_ORIENTATION_RAW = 128;
@java.lang.Deprecated()
public static final int SENSOR_PROXIMITY = 32;
public static final int SENSOR_STATUS_ACCURACY_HIGH = 3;
public static final int SENSOR_STATUS_ACCURACY_LOW = 1;
public static final int SENSOR_STATUS_ACCURACY_MEDIUM = 2;
public static final int SENSOR_STATUS_NO_CONTACT = -1;
public static final int SENSOR_STATUS_UNRELIABLE = 0;
@java.lang.Deprecated()
public static final int SENSOR_TEMPERATURE = 4;
@java.lang.Deprecated()
public static final int SENSOR_TRICORDER = 64;
public static final float STANDARD_GRAVITY = 9.80665f;
}
