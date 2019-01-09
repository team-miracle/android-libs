/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.telephony;
public class ServiceState
  implements android.os.Parcelable
{
public  ServiceState() { throw new RuntimeException("Stub!"); }
public  ServiceState(android.telephony.ServiceState s) { throw new RuntimeException("Stub!"); }
public  ServiceState(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
protected  void copyFrom(android.telephony.ServiceState s) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  int getDuplexMode() { throw new RuntimeException("Stub!"); }
public  int getChannelNumber() { throw new RuntimeException("Stub!"); }
public  int[] getCellBandwidths() { throw new RuntimeException("Stub!"); }
public  boolean getRoaming() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOperatorAlphaLong() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOperatorAlphaShort() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOperatorNumeric() { throw new RuntimeException("Stub!"); }
public  boolean getIsManualSelection() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void setStateOutOfService() { throw new RuntimeException("Stub!"); }
public  void setStateOff() { throw new RuntimeException("Stub!"); }
public  void setState(int state) { throw new RuntimeException("Stub!"); }
public  void setCellBandwidths(int[] bandwidths) { throw new RuntimeException("Stub!"); }
public  void setChannelNumber(int channelNumber) { throw new RuntimeException("Stub!"); }
public  void setRoaming(boolean roaming) { throw new RuntimeException("Stub!"); }
public  void setOperatorName(java.lang.String longName, java.lang.String shortName, java.lang.String numeric) { throw new RuntimeException("Stub!"); }
public  void setIsManualSelection(boolean isManual) { throw new RuntimeException("Stub!"); }
public  void setRilVoiceRadioTechnology(int rt) { throw new RuntimeException("Stub!"); }
public  void setRilDataRadioTechnology(int rt) { throw new RuntimeException("Stub!"); }
public  void setCdmaSystemAndNetworkId(int systemId, int networkId) { throw new RuntimeException("Stub!"); }
public  int getCdmaNetworkId() { throw new RuntimeException("Stub!"); }
public  int getCdmaSystemId() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.telephony.ServiceState> CREATOR;
public static final int DUPLEX_MODE_FDD = 1;
public static final int DUPLEX_MODE_TDD = 2;
public static final int DUPLEX_MODE_UNKNOWN = 0;
public static final int STATE_EMERGENCY_ONLY = 2;
public static final int STATE_IN_SERVICE = 0;
public static final int STATE_OUT_OF_SERVICE = 1;
public static final int STATE_POWER_OFF = 3;
public static final int UNKNOWN_ID = -1;
static { CREATOR = null; }
}
