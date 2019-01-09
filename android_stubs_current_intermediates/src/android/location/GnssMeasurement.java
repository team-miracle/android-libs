/*
* Copyright (C) 2014 The Android Open Source Project
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
* limitations under the License
*/

package android.location;
public final class GnssMeasurement
  implements android.os.Parcelable
{
GnssMeasurement() { throw new RuntimeException("Stub!"); }
public  int getSvid() { throw new RuntimeException("Stub!"); }
public  int getConstellationType() { throw new RuntimeException("Stub!"); }
public  double getTimeOffsetNanos() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  long getReceivedSvTimeNanos() { throw new RuntimeException("Stub!"); }
public  long getReceivedSvTimeUncertaintyNanos() { throw new RuntimeException("Stub!"); }
public  double getCn0DbHz() { throw new RuntimeException("Stub!"); }
public  double getPseudorangeRateMetersPerSecond() { throw new RuntimeException("Stub!"); }
public  double getPseudorangeRateUncertaintyMetersPerSecond() { throw new RuntimeException("Stub!"); }
public  int getAccumulatedDeltaRangeState() { throw new RuntimeException("Stub!"); }
public  double getAccumulatedDeltaRangeMeters() { throw new RuntimeException("Stub!"); }
public  double getAccumulatedDeltaRangeUncertaintyMeters() { throw new RuntimeException("Stub!"); }
public  boolean hasCarrierFrequencyHz() { throw new RuntimeException("Stub!"); }
public  float getCarrierFrequencyHz() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean hasCarrierCycles() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  long getCarrierCycles() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean hasCarrierPhase() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  double getCarrierPhase() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean hasCarrierPhaseUncertainty() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  double getCarrierPhaseUncertainty() { throw new RuntimeException("Stub!"); }
public  int getMultipathIndicator() { throw new RuntimeException("Stub!"); }
public  boolean hasSnrInDb() { throw new RuntimeException("Stub!"); }
public  double getSnrInDb() { throw new RuntimeException("Stub!"); }
public  boolean hasAutomaticGainControlLevelDb() { throw new RuntimeException("Stub!"); }
public  double getAutomaticGainControlLevelDb() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int ADR_STATE_CYCLE_SLIP = 4;
public static final int ADR_STATE_HALF_CYCLE_REPORTED = 16;
public static final int ADR_STATE_HALF_CYCLE_RESOLVED = 8;
public static final int ADR_STATE_RESET = 2;
public static final int ADR_STATE_UNKNOWN = 0;
public static final int ADR_STATE_VALID = 1;
public static final android.os.Parcelable.Creator<android.location.GnssMeasurement> CREATOR;
public static final int MULTIPATH_INDICATOR_DETECTED = 1;
public static final int MULTIPATH_INDICATOR_NOT_DETECTED = 2;
public static final int MULTIPATH_INDICATOR_UNKNOWN = 0;
public static final int STATE_BDS_D2_BIT_SYNC = 256;
public static final int STATE_BDS_D2_SUBFRAME_SYNC = 512;
public static final int STATE_BIT_SYNC = 2;
public static final int STATE_CODE_LOCK = 1;
public static final int STATE_GAL_E1BC_CODE_LOCK = 1024;
public static final int STATE_GAL_E1B_PAGE_SYNC = 4096;
public static final int STATE_GAL_E1C_2ND_CODE_LOCK = 2048;
public static final int STATE_GLO_STRING_SYNC = 64;
public static final int STATE_GLO_TOD_DECODED = 128;
public static final int STATE_GLO_TOD_KNOWN = 32768;
public static final int STATE_MSEC_AMBIGUOUS = 16;
public static final int STATE_SBAS_SYNC = 8192;
public static final int STATE_SUBFRAME_SYNC = 4;
public static final int STATE_SYMBOL_SYNC = 32;
public static final int STATE_TOW_DECODED = 8;
public static final int STATE_TOW_KNOWN = 16384;
public static final int STATE_UNKNOWN = 0;
static { CREATOR = null; }
}
