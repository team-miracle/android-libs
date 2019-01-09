/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.bluetooth.le;
public final class AdvertisingSetParameters
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters.Builder setConnectable(boolean connectable) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters.Builder setScannable(boolean scannable) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters.Builder setLegacyMode(boolean isLegacy) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters.Builder setAnonymous(boolean isAnonymous) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters.Builder setIncludeTxPower(boolean includeTxPower) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters.Builder setPrimaryPhy(int primaryPhy) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters.Builder setSecondaryPhy(int secondaryPhy) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters.Builder setInterval(int interval) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters.Builder setTxPowerLevel(int txPowerLevel) { throw new RuntimeException("Stub!"); }
public  android.bluetooth.le.AdvertisingSetParameters build() { throw new RuntimeException("Stub!"); }
}
AdvertisingSetParameters() { throw new RuntimeException("Stub!"); }
public  boolean isConnectable() { throw new RuntimeException("Stub!"); }
public  boolean isScannable() { throw new RuntimeException("Stub!"); }
public  boolean isLegacy() { throw new RuntimeException("Stub!"); }
public  boolean isAnonymous() { throw new RuntimeException("Stub!"); }
public  boolean includeTxPower() { throw new RuntimeException("Stub!"); }
public  int getPrimaryPhy() { throw new RuntimeException("Stub!"); }
public  int getSecondaryPhy() { throw new RuntimeException("Stub!"); }
public  int getInterval() { throw new RuntimeException("Stub!"); }
public  int getTxPowerLevel() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.bluetooth.le.AdvertisingSetParameters> CREATOR;
public static final int INTERVAL_HIGH = 1600;
public static final int INTERVAL_LOW = 160;
public static final int INTERVAL_MAX = 16777215;
public static final int INTERVAL_MEDIUM = 400;
public static final int INTERVAL_MIN = 160;
public static final int TX_POWER_HIGH = 1;
public static final int TX_POWER_LOW = -15;
public static final int TX_POWER_MAX = 1;
public static final int TX_POWER_MEDIUM = -7;
public static final int TX_POWER_MIN = -127;
public static final int TX_POWER_ULTRA_LOW = -21;
static { CREATOR = null; }
}
