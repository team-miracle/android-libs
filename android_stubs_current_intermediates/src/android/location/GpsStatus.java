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

package android.location;
@java.lang.Deprecated()
public final class GpsStatus
{
@java.lang.Deprecated()
public static interface Listener
{
public abstract  void onGpsStatusChanged(int event);
}
@java.lang.Deprecated()
public static interface NmeaListener
{
public abstract  void onNmeaReceived(long timestamp, java.lang.String nmea);
}
GpsStatus() { throw new RuntimeException("Stub!"); }
public  int getTimeToFirstFix() { throw new RuntimeException("Stub!"); }
public  java.lang.Iterable<android.location.GpsSatellite> getSatellites() { throw new RuntimeException("Stub!"); }
public  int getMaxSatellites() { throw new RuntimeException("Stub!"); }
public static final int GPS_EVENT_FIRST_FIX = 3;
public static final int GPS_EVENT_SATELLITE_STATUS = 4;
public static final int GPS_EVENT_STARTED = 1;
public static final int GPS_EVENT_STOPPED = 2;
}
