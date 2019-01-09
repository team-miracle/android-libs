/*
* Copyright (C) 2013 The Android Open Source Project
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
package android.hardware.location;
public final class GeofenceHardware
{
GeofenceHardware() { throw new RuntimeException("Stub!"); }
public  int[] getMonitoringTypes() { throw new RuntimeException("Stub!"); }
public  int getStatusOfMonitoringType(int monitoringType) { throw new RuntimeException("Stub!"); }
public  boolean addGeofence(int geofenceId, int monitoringType, android.hardware.location.GeofenceHardwareRequest geofenceRequest, android.hardware.location.GeofenceHardwareCallback callback) { throw new RuntimeException("Stub!"); }
public  boolean removeGeofence(int geofenceId, int monitoringType) { throw new RuntimeException("Stub!"); }
public  boolean pauseGeofence(int geofenceId, int monitoringType) { throw new RuntimeException("Stub!"); }
public  boolean resumeGeofence(int geofenceId, int monitoringType, int monitorTransition) { throw new RuntimeException("Stub!"); }
public  boolean registerForMonitorStateChangeCallback(int monitoringType, android.hardware.location.GeofenceHardwareMonitorCallback callback) { throw new RuntimeException("Stub!"); }
public  boolean unregisterForMonitorStateChangeCallback(int monitoringType, android.hardware.location.GeofenceHardwareMonitorCallback callback) { throw new RuntimeException("Stub!"); }
public static final int GEOFENCE_ENTERED = 1;
public static final int GEOFENCE_ERROR_ID_EXISTS = 2;
public static final int GEOFENCE_ERROR_ID_UNKNOWN = 3;
public static final int GEOFENCE_ERROR_INSUFFICIENT_MEMORY = 6;
public static final int GEOFENCE_ERROR_INVALID_TRANSITION = 4;
public static final int GEOFENCE_ERROR_TOO_MANY_GEOFENCES = 1;
public static final int GEOFENCE_EXITED = 2;
public static final int GEOFENCE_FAILURE = 5;
public static final int GEOFENCE_SUCCESS = 0;
public static final int GEOFENCE_UNCERTAIN = 4;
public static final int MONITORING_TYPE_FUSED_HARDWARE = 1;
public static final int MONITORING_TYPE_GPS_HARDWARE = 0;
public static final int MONITOR_CURRENTLY_AVAILABLE = 0;
public static final int MONITOR_CURRENTLY_UNAVAILABLE = 1;
public static final int MONITOR_UNSUPPORTED = 2;
public static final int SOURCE_TECHNOLOGY_BLUETOOTH = 16;
public static final int SOURCE_TECHNOLOGY_CELL = 8;
public static final int SOURCE_TECHNOLOGY_GNSS = 1;
public static final int SOURCE_TECHNOLOGY_SENSORS = 4;
public static final int SOURCE_TECHNOLOGY_WIFI = 2;
}
