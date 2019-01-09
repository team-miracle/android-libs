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
public class GpsMeasurement
  implements android.os.Parcelable
{
GpsMeasurement() { throw new RuntimeException("Stub!"); }
public  void set(android.location.GpsMeasurement measurement) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  byte getPrn() { throw new RuntimeException("Stub!"); }
public  void setPrn(byte value) { throw new RuntimeException("Stub!"); }
public  double getTimeOffsetInNs() { throw new RuntimeException("Stub!"); }
public  void setTimeOffsetInNs(double value) { throw new RuntimeException("Stub!"); }
public  short getState() { throw new RuntimeException("Stub!"); }
public  void setState(short value) { throw new RuntimeException("Stub!"); }
public  long getReceivedGpsTowInNs() { throw new RuntimeException("Stub!"); }
public  void setReceivedGpsTowInNs(long value) { throw new RuntimeException("Stub!"); }
public  long getReceivedGpsTowUncertaintyInNs() { throw new RuntimeException("Stub!"); }
public  void setReceivedGpsTowUncertaintyInNs(long value) { throw new RuntimeException("Stub!"); }
public  double getCn0InDbHz() { throw new RuntimeException("Stub!"); }
public  void setCn0InDbHz(double value) { throw new RuntimeException("Stub!"); }
public  double getPseudorangeRateInMetersPerSec() { throw new RuntimeException("Stub!"); }
public  void setPseudorangeRateInMetersPerSec(double value) { throw new RuntimeException("Stub!"); }
public  boolean isPseudorangeRateCorrected() { throw new RuntimeException("Stub!"); }
public  double getPseudorangeRateUncertaintyInMetersPerSec() { throw new RuntimeException("Stub!"); }
public  void setPseudorangeRateUncertaintyInMetersPerSec(double value) { throw new RuntimeException("Stub!"); }
public  short getAccumulatedDeltaRangeState() { throw new RuntimeException("Stub!"); }
public  void setAccumulatedDeltaRangeState(short value) { throw new RuntimeException("Stub!"); }
public  double getAccumulatedDeltaRangeInMeters() { throw new RuntimeException("Stub!"); }
public  void setAccumulatedDeltaRangeInMeters(double value) { throw new RuntimeException("Stub!"); }
public  double getAccumulatedDeltaRangeUncertaintyInMeters() { throw new RuntimeException("Stub!"); }
public  void setAccumulatedDeltaRangeUncertaintyInMeters(double value) { throw new RuntimeException("Stub!"); }
public  boolean hasPseudorangeInMeters() { throw new RuntimeException("Stub!"); }
public  double getPseudorangeInMeters() { throw new RuntimeException("Stub!"); }
public  void setPseudorangeInMeters(double value) { throw new RuntimeException("Stub!"); }
public  void resetPseudorangeInMeters() { throw new RuntimeException("Stub!"); }
public  boolean hasPseudorangeUncertaintyInMeters() { throw new RuntimeException("Stub!"); }
public  double getPseudorangeUncertaintyInMeters() { throw new RuntimeException("Stub!"); }
public  void setPseudorangeUncertaintyInMeters(double value) { throw new RuntimeException("Stub!"); }
public  void resetPseudorangeUncertaintyInMeters() { throw new RuntimeException("Stub!"); }
public  boolean hasCodePhaseInChips() { throw new RuntimeException("Stub!"); }
public  double getCodePhaseInChips() { throw new RuntimeException("Stub!"); }
public  void setCodePhaseInChips(double value) { throw new RuntimeException("Stub!"); }
public  void resetCodePhaseInChips() { throw new RuntimeException("Stub!"); }
public  boolean hasCodePhaseUncertaintyInChips() { throw new RuntimeException("Stub!"); }
public  double getCodePhaseUncertaintyInChips() { throw new RuntimeException("Stub!"); }
public  void setCodePhaseUncertaintyInChips(double value) { throw new RuntimeException("Stub!"); }
public  void resetCodePhaseUncertaintyInChips() { throw new RuntimeException("Stub!"); }
public  boolean hasCarrierFrequencyInHz() { throw new RuntimeException("Stub!"); }
public  float getCarrierFrequencyInHz() { throw new RuntimeException("Stub!"); }
public  void setCarrierFrequencyInHz(float carrierFrequencyInHz) { throw new RuntimeException("Stub!"); }
public  void resetCarrierFrequencyInHz() { throw new RuntimeException("Stub!"); }
public  boolean hasCarrierCycles() { throw new RuntimeException("Stub!"); }
public  long getCarrierCycles() { throw new RuntimeException("Stub!"); }
public  void setCarrierCycles(long value) { throw new RuntimeException("Stub!"); }
public  void resetCarrierCycles() { throw new RuntimeException("Stub!"); }
public  boolean hasCarrierPhase() { throw new RuntimeException("Stub!"); }
public  double getCarrierPhase() { throw new RuntimeException("Stub!"); }
public  void setCarrierPhase(double value) { throw new RuntimeException("Stub!"); }
public  void resetCarrierPhase() { throw new RuntimeException("Stub!"); }
public  boolean hasCarrierPhaseUncertainty() { throw new RuntimeException("Stub!"); }
public  double getCarrierPhaseUncertainty() { throw new RuntimeException("Stub!"); }
public  void setCarrierPhaseUncertainty(double value) { throw new RuntimeException("Stub!"); }
public  void resetCarrierPhaseUncertainty() { throw new RuntimeException("Stub!"); }
public  byte getLossOfLock() { throw new RuntimeException("Stub!"); }
public  void setLossOfLock(byte value) { throw new RuntimeException("Stub!"); }
public  boolean hasBitNumber() { throw new RuntimeException("Stub!"); }
public  int getBitNumber() { throw new RuntimeException("Stub!"); }
public  void setBitNumber(int bitNumber) { throw new RuntimeException("Stub!"); }
public  void resetBitNumber() { throw new RuntimeException("Stub!"); }
public  boolean hasTimeFromLastBitInMs() { throw new RuntimeException("Stub!"); }
public  short getTimeFromLastBitInMs() { throw new RuntimeException("Stub!"); }
public  void setTimeFromLastBitInMs(short value) { throw new RuntimeException("Stub!"); }
public  void resetTimeFromLastBitInMs() { throw new RuntimeException("Stub!"); }
public  boolean hasDopplerShiftInHz() { throw new RuntimeException("Stub!"); }
public  double getDopplerShiftInHz() { throw new RuntimeException("Stub!"); }
public  void setDopplerShiftInHz(double value) { throw new RuntimeException("Stub!"); }
public  void resetDopplerShiftInHz() { throw new RuntimeException("Stub!"); }
public  boolean hasDopplerShiftUncertaintyInHz() { throw new RuntimeException("Stub!"); }
public  double getDopplerShiftUncertaintyInHz() { throw new RuntimeException("Stub!"); }
public  void setDopplerShiftUncertaintyInHz(double value) { throw new RuntimeException("Stub!"); }
public  void resetDopplerShiftUncertaintyInHz() { throw new RuntimeException("Stub!"); }
public  byte getMultipathIndicator() { throw new RuntimeException("Stub!"); }
public  void setMultipathIndicator(byte value) { throw new RuntimeException("Stub!"); }
public  boolean hasSnrInDb() { throw new RuntimeException("Stub!"); }
public  double getSnrInDb() { throw new RuntimeException("Stub!"); }
public  void setSnrInDb(double snrInDb) { throw new RuntimeException("Stub!"); }
public  void resetSnrInDb() { throw new RuntimeException("Stub!"); }
public  boolean hasElevationInDeg() { throw new RuntimeException("Stub!"); }
public  double getElevationInDeg() { throw new RuntimeException("Stub!"); }
public  void setElevationInDeg(double elevationInDeg) { throw new RuntimeException("Stub!"); }
public  void resetElevationInDeg() { throw new RuntimeException("Stub!"); }
public  boolean hasElevationUncertaintyInDeg() { throw new RuntimeException("Stub!"); }
public  double getElevationUncertaintyInDeg() { throw new RuntimeException("Stub!"); }
public  void setElevationUncertaintyInDeg(double value) { throw new RuntimeException("Stub!"); }
public  void resetElevationUncertaintyInDeg() { throw new RuntimeException("Stub!"); }
public  boolean hasAzimuthInDeg() { throw new RuntimeException("Stub!"); }
public  double getAzimuthInDeg() { throw new RuntimeException("Stub!"); }
public  void setAzimuthInDeg(double value) { throw new RuntimeException("Stub!"); }
public  void resetAzimuthInDeg() { throw new RuntimeException("Stub!"); }
public  boolean hasAzimuthUncertaintyInDeg() { throw new RuntimeException("Stub!"); }
public  double getAzimuthUncertaintyInDeg() { throw new RuntimeException("Stub!"); }
public  void setAzimuthUncertaintyInDeg(double value) { throw new RuntimeException("Stub!"); }
public  void resetAzimuthUncertaintyInDeg() { throw new RuntimeException("Stub!"); }
public  boolean isUsedInFix() { throw new RuntimeException("Stub!"); }
public  void setUsedInFix(boolean value) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final short ADR_STATE_CYCLE_SLIP = 4;
public static final short ADR_STATE_RESET = 2;
public static final short ADR_STATE_UNKNOWN = 0;
public static final short ADR_STATE_VALID = 1;
public static final android.os.Parcelable.Creator<android.location.GpsMeasurement> CREATOR;
public static final byte LOSS_OF_LOCK_CYCLE_SLIP = 2;
public static final byte LOSS_OF_LOCK_OK = 1;
public static final byte LOSS_OF_LOCK_UNKNOWN = 0;
public static final byte MULTIPATH_INDICATOR_DETECTED = 1;
public static final byte MULTIPATH_INDICATOR_NOT_USED = 2;
public static final byte MULTIPATH_INDICATOR_UNKNOWN = 0;
public static final short STATE_BIT_SYNC = 2;
public static final short STATE_CODE_LOCK = 1;
public static final short STATE_MSEC_AMBIGUOUS = 16;
public static final short STATE_SUBFRAME_SYNC = 4;
public static final short STATE_TOW_DECODED = 8;
public static final short STATE_UNKNOWN = 0;
static { CREATOR = null; }
}
