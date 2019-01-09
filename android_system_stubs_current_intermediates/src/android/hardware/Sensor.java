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
public final class Sensor
{
Sensor() { throw new RuntimeException("Stub!"); }
public  int getReportingMode() { throw new RuntimeException("Stub!"); }
public  int getHighestDirectReportRateLevel() { throw new RuntimeException("Stub!"); }
public  boolean isDirectChannelTypeSupported(int sharedMemType) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getVendor() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  float getMaximumRange() { throw new RuntimeException("Stub!"); }
public  float getResolution() { throw new RuntimeException("Stub!"); }
public  float getPower() { throw new RuntimeException("Stub!"); }
public  int getMinDelay() { throw new RuntimeException("Stub!"); }
public  int getFifoReservedEventCount() { throw new RuntimeException("Stub!"); }
public  int getFifoMaxEventCount() { throw new RuntimeException("Stub!"); }
public  java.lang.String getStringType() { throw new RuntimeException("Stub!"); }
public  java.util.UUID getUuid() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  int getMaxDelay() { throw new RuntimeException("Stub!"); }
public  boolean isWakeUpSensor() { throw new RuntimeException("Stub!"); }
public  boolean isDynamicSensor() { throw new RuntimeException("Stub!"); }
public  boolean isAdditionalInfoSupported() { throw new RuntimeException("Stub!"); }
public  boolean isDataInjectionSupported() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int REPORTING_MODE_CONTINUOUS = 0;
public static final int REPORTING_MODE_ONE_SHOT = 2;
public static final int REPORTING_MODE_ON_CHANGE = 1;
public static final int REPORTING_MODE_SPECIAL_TRIGGER = 3;
public static final java.lang.String STRING_TYPE_ACCELEROMETER = "android.sensor.accelerometer";
public static final java.lang.String STRING_TYPE_ACCELEROMETER_UNCALIBRATED = "android.sensor.accelerometer_uncalibrated";
public static final java.lang.String STRING_TYPE_AMBIENT_TEMPERATURE = "android.sensor.ambient_temperature";
public static final java.lang.String STRING_TYPE_DYNAMIC_SENSOR_META = "android.sensor.dynamic_sensor_meta";
public static final java.lang.String STRING_TYPE_GAME_ROTATION_VECTOR = "android.sensor.game_rotation_vector";
public static final java.lang.String STRING_TYPE_GEOMAGNETIC_ROTATION_VECTOR = "android.sensor.geomagnetic_rotation_vector";
public static final java.lang.String STRING_TYPE_GRAVITY = "android.sensor.gravity";
public static final java.lang.String STRING_TYPE_GYROSCOPE = "android.sensor.gyroscope";
public static final java.lang.String STRING_TYPE_GYROSCOPE_UNCALIBRATED = "android.sensor.gyroscope_uncalibrated";
public static final java.lang.String STRING_TYPE_HEART_BEAT = "android.sensor.heart_beat";
public static final java.lang.String STRING_TYPE_HEART_RATE = "android.sensor.heart_rate";
public static final java.lang.String STRING_TYPE_LIGHT = "android.sensor.light";
public static final java.lang.String STRING_TYPE_LINEAR_ACCELERATION = "android.sensor.linear_acceleration";
public static final java.lang.String STRING_TYPE_LOW_LATENCY_OFFBODY_DETECT = "android.sensor.low_latency_offbody_detect";
public static final java.lang.String STRING_TYPE_MAGNETIC_FIELD = "android.sensor.magnetic_field";
public static final java.lang.String STRING_TYPE_MAGNETIC_FIELD_UNCALIBRATED = "android.sensor.magnetic_field_uncalibrated";
public static final java.lang.String STRING_TYPE_MOTION_DETECT = "android.sensor.motion_detect";
@java.lang.Deprecated()
public static final java.lang.String STRING_TYPE_ORIENTATION = "android.sensor.orientation";
public static final java.lang.String STRING_TYPE_POSE_6DOF = "android.sensor.pose_6dof";
public static final java.lang.String STRING_TYPE_PRESSURE = "android.sensor.pressure";
public static final java.lang.String STRING_TYPE_PROXIMITY = "android.sensor.proximity";
public static final java.lang.String STRING_TYPE_RELATIVE_HUMIDITY = "android.sensor.relative_humidity";
public static final java.lang.String STRING_TYPE_ROTATION_VECTOR = "android.sensor.rotation_vector";
public static final java.lang.String STRING_TYPE_SIGNIFICANT_MOTION = "android.sensor.significant_motion";
public static final java.lang.String STRING_TYPE_STATIONARY_DETECT = "android.sensor.stationary_detect";
public static final java.lang.String STRING_TYPE_STEP_COUNTER = "android.sensor.step_counter";
public static final java.lang.String STRING_TYPE_STEP_DETECTOR = "android.sensor.step_detector";
@java.lang.Deprecated()
public static final java.lang.String STRING_TYPE_TEMPERATURE = "android.sensor.temperature";
public static final java.lang.String STRING_TYPE_WRIST_TILT_GESTURE = "android.sensor.wrist_tilt_gesture";
public static final int TYPE_ACCELEROMETER = 1;
public static final int TYPE_ACCELEROMETER_UNCALIBRATED = 35;
public static final int TYPE_ALL = -1;
public static final int TYPE_AMBIENT_TEMPERATURE = 13;
public static final int TYPE_DEVICE_PRIVATE_BASE = 65536;
public static final int TYPE_DYNAMIC_SENSOR_META = 32;
public static final int TYPE_GAME_ROTATION_VECTOR = 15;
public static final int TYPE_GEOMAGNETIC_ROTATION_VECTOR = 20;
public static final int TYPE_GRAVITY = 9;
public static final int TYPE_GYROSCOPE = 4;
public static final int TYPE_GYROSCOPE_UNCALIBRATED = 16;
public static final int TYPE_HEART_BEAT = 31;
public static final int TYPE_HEART_RATE = 21;
public static final int TYPE_LIGHT = 5;
public static final int TYPE_LINEAR_ACCELERATION = 10;
public static final int TYPE_LOW_LATENCY_OFFBODY_DETECT = 34;
public static final int TYPE_MAGNETIC_FIELD = 2;
public static final int TYPE_MAGNETIC_FIELD_UNCALIBRATED = 14;
public static final int TYPE_MOTION_DETECT = 30;
@java.lang.Deprecated()
public static final int TYPE_ORIENTATION = 3;
public static final int TYPE_POSE_6DOF = 28;
public static final int TYPE_PRESSURE = 6;
public static final int TYPE_PROXIMITY = 8;
public static final int TYPE_RELATIVE_HUMIDITY = 12;
public static final int TYPE_ROTATION_VECTOR = 11;
public static final int TYPE_SIGNIFICANT_MOTION = 17;
public static final int TYPE_STATIONARY_DETECT = 29;
public static final int TYPE_STEP_COUNTER = 19;
public static final int TYPE_STEP_DETECTOR = 18;
@java.lang.Deprecated()
public static final int TYPE_TEMPERATURE = 7;
public static final int TYPE_WRIST_TILT_GESTURE = 26;
}
