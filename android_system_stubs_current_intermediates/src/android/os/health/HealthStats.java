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

package android.os.health;
public class HealthStats
{
HealthStats() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDataType() { throw new RuntimeException("Stub!"); }
public  boolean hasTimer(int key) { throw new RuntimeException("Stub!"); }
public  android.os.health.TimerStat getTimer(int key) { throw new RuntimeException("Stub!"); }
public  int getTimerCount(int key) { throw new RuntimeException("Stub!"); }
public  long getTimerTime(int key) { throw new RuntimeException("Stub!"); }
public  int getTimerKeyCount() { throw new RuntimeException("Stub!"); }
public  int getTimerKeyAt(int index) { throw new RuntimeException("Stub!"); }
public  boolean hasMeasurement(int key) { throw new RuntimeException("Stub!"); }
public  long getMeasurement(int key) { throw new RuntimeException("Stub!"); }
public  int getMeasurementKeyCount() { throw new RuntimeException("Stub!"); }
public  int getMeasurementKeyAt(int index) { throw new RuntimeException("Stub!"); }
public  boolean hasStats(int key) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, android.os.health.HealthStats> getStats(int key) { throw new RuntimeException("Stub!"); }
public  int getStatsKeyCount() { throw new RuntimeException("Stub!"); }
public  int getStatsKeyAt(int index) { throw new RuntimeException("Stub!"); }
public  boolean hasTimers(int key) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, android.os.health.TimerStat> getTimers(int key) { throw new RuntimeException("Stub!"); }
public  int getTimersKeyCount() { throw new RuntimeException("Stub!"); }
public  int getTimersKeyAt(int index) { throw new RuntimeException("Stub!"); }
public  boolean hasMeasurements(int key) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.Long> getMeasurements(int key) { throw new RuntimeException("Stub!"); }
public  int getMeasurementsKeyCount() { throw new RuntimeException("Stub!"); }
public  int getMeasurementsKeyAt(int index) { throw new RuntimeException("Stub!"); }
}
