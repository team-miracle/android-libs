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

package android.os;
public class BatteryManager
{
BatteryManager() { throw new RuntimeException("Stub!"); }
public  boolean isCharging() { throw new RuntimeException("Stub!"); }
public  int getIntProperty(int id) { throw new RuntimeException("Stub!"); }
public  long getLongProperty(int id) { throw new RuntimeException("Stub!"); }
public  long computeChargeTimeRemaining() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CHARGING = "android.os.action.CHARGING";
public static final java.lang.String ACTION_DISCHARGING = "android.os.action.DISCHARGING";
public static final int BATTERY_HEALTH_COLD = 7;
public static final int BATTERY_HEALTH_DEAD = 4;
public static final int BATTERY_HEALTH_GOOD = 2;
public static final int BATTERY_HEALTH_OVERHEAT = 3;
public static final int BATTERY_HEALTH_OVER_VOLTAGE = 5;
public static final int BATTERY_HEALTH_UNKNOWN = 1;
public static final int BATTERY_HEALTH_UNSPECIFIED_FAILURE = 6;
public static final int BATTERY_PLUGGED_AC = 1;
public static final int BATTERY_PLUGGED_USB = 2;
public static final int BATTERY_PLUGGED_WIRELESS = 4;
public static final int BATTERY_PROPERTY_CAPACITY = 4;
public static final int BATTERY_PROPERTY_CHARGE_COUNTER = 1;
public static final int BATTERY_PROPERTY_CURRENT_AVERAGE = 3;
public static final int BATTERY_PROPERTY_CURRENT_NOW = 2;
public static final int BATTERY_PROPERTY_ENERGY_COUNTER = 5;
public static final int BATTERY_PROPERTY_STATUS = 6;
public static final int BATTERY_STATUS_CHARGING = 2;
public static final int BATTERY_STATUS_DISCHARGING = 3;
public static final int BATTERY_STATUS_FULL = 5;
public static final int BATTERY_STATUS_NOT_CHARGING = 4;
public static final int BATTERY_STATUS_UNKNOWN = 1;
public static final java.lang.String EXTRA_BATTERY_LOW = "battery_low";
public static final java.lang.String EXTRA_EVENTS = "android.os.extra.EVENTS";
public static final java.lang.String EXTRA_EVENT_TIMESTAMP = "android.os.extra.EVENT_TIMESTAMP";
public static final java.lang.String EXTRA_HEALTH = "health";
public static final java.lang.String EXTRA_ICON_SMALL = "icon-small";
public static final java.lang.String EXTRA_LEVEL = "level";
public static final java.lang.String EXTRA_PLUGGED = "plugged";
public static final java.lang.String EXTRA_PRESENT = "present";
public static final java.lang.String EXTRA_SCALE = "scale";
public static final java.lang.String EXTRA_STATUS = "status";
public static final java.lang.String EXTRA_TECHNOLOGY = "technology";
public static final java.lang.String EXTRA_TEMPERATURE = "temperature";
public static final java.lang.String EXTRA_VOLTAGE = "voltage";
}
