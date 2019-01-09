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

package android.location;
public final class GnssStatus
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onStarted() { throw new RuntimeException("Stub!"); }
public  void onStopped() { throw new RuntimeException("Stub!"); }
public  void onFirstFix(int ttffMillis) { throw new RuntimeException("Stub!"); }
public  void onSatelliteStatusChanged(android.location.GnssStatus status) { throw new RuntimeException("Stub!"); }
}
GnssStatus() { throw new RuntimeException("Stub!"); }
public  int getSatelliteCount() { throw new RuntimeException("Stub!"); }
public  int getConstellationType(int satIndex) { throw new RuntimeException("Stub!"); }
public  int getSvid(int satIndex) { throw new RuntimeException("Stub!"); }
public  float getCn0DbHz(int satIndex) { throw new RuntimeException("Stub!"); }
public  float getElevationDegrees(int satIndex) { throw new RuntimeException("Stub!"); }
public  float getAzimuthDegrees(int satIndex) { throw new RuntimeException("Stub!"); }
public  boolean hasEphemerisData(int satIndex) { throw new RuntimeException("Stub!"); }
public  boolean hasAlmanacData(int satIndex) { throw new RuntimeException("Stub!"); }
public  boolean usedInFix(int satIndex) { throw new RuntimeException("Stub!"); }
public  boolean hasCarrierFrequencyHz(int satIndex) { throw new RuntimeException("Stub!"); }
public  float getCarrierFrequencyHz(int satIndex) { throw new RuntimeException("Stub!"); }
public static final int CONSTELLATION_BEIDOU = 5;
public static final int CONSTELLATION_GALILEO = 6;
public static final int CONSTELLATION_GLONASS = 3;
public static final int CONSTELLATION_GPS = 1;
public static final int CONSTELLATION_QZSS = 4;
public static final int CONSTELLATION_SBAS = 2;
public static final int CONSTELLATION_UNKNOWN = 0;
}
