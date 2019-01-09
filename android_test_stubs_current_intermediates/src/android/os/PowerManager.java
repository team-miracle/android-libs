/*
* Copyright (C) 2007 The Android Open Source Project
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
public final class PowerManager
{
public final class WakeLock
{
WakeLock() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  void setReferenceCounted(boolean value) { throw new RuntimeException("Stub!"); }
public  void acquire() { throw new RuntimeException("Stub!"); }
public  void acquire(long timeout) { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  void release(int flags) { throw new RuntimeException("Stub!"); }
public  boolean isHeld() { throw new RuntimeException("Stub!"); }
public  void setWorkSource(android.os.WorkSource ws) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
PowerManager() { throw new RuntimeException("Stub!"); }
public  android.os.PowerManager.WakeLock newWakeLock(int levelAndFlags, java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  void nap(long time) { throw new RuntimeException("Stub!"); }
public  boolean isWakeLockLevelSupported(int level) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isScreenOn() { throw new RuntimeException("Stub!"); }
public  boolean isInteractive() { throw new RuntimeException("Stub!"); }
public  void reboot(java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  boolean isPowerSaveMode() { throw new RuntimeException("Stub!"); }
public  int getLocationPowerSaveMode() { throw new RuntimeException("Stub!"); }
public  boolean isDeviceIdleMode() { throw new RuntimeException("Stub!"); }
public  boolean isIgnoringBatteryOptimizations(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  boolean isSustainedPerformanceModeSupported() { throw new RuntimeException("Stub!"); }
public static final int ACQUIRE_CAUSES_WAKEUP = 268435456;
public static final java.lang.String ACTION_DEVICE_IDLE_MODE_CHANGED = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
public static final java.lang.String ACTION_POWER_SAVE_MODE_CHANGED = "android.os.action.POWER_SAVE_MODE_CHANGED";
@java.lang.Deprecated()
public static final int FULL_WAKE_LOCK = 26;
public static final int LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF = 2;
public static final int LOCATION_MODE_FOREGROUND_ONLY = 3;
public static final int LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF = 1;
public static final int LOCATION_MODE_NO_CHANGE = 0;
public static final int ON_AFTER_RELEASE = 536870912;
public static final int PARTIAL_WAKE_LOCK = 1;
public static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;
public static final int RELEASE_FLAG_WAIT_FOR_NO_PROXIMITY = 1;
@java.lang.Deprecated()
public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;
@java.lang.Deprecated()
public static final int SCREEN_DIM_WAKE_LOCK = 6;
}
