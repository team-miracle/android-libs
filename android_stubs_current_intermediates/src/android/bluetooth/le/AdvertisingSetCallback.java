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
public abstract class AdvertisingSetCallback
{
public  AdvertisingSetCallback() { throw new RuntimeException("Stub!"); }
public  void onAdvertisingSetStarted(android.bluetooth.le.AdvertisingSet advertisingSet, int txPower, int status) { throw new RuntimeException("Stub!"); }
public  void onAdvertisingSetStopped(android.bluetooth.le.AdvertisingSet advertisingSet) { throw new RuntimeException("Stub!"); }
public  void onAdvertisingEnabled(android.bluetooth.le.AdvertisingSet advertisingSet, boolean enable, int status) { throw new RuntimeException("Stub!"); }
public  void onAdvertisingDataSet(android.bluetooth.le.AdvertisingSet advertisingSet, int status) { throw new RuntimeException("Stub!"); }
public  void onScanResponseDataSet(android.bluetooth.le.AdvertisingSet advertisingSet, int status) { throw new RuntimeException("Stub!"); }
public  void onAdvertisingParametersUpdated(android.bluetooth.le.AdvertisingSet advertisingSet, int txPower, int status) { throw new RuntimeException("Stub!"); }
public  void onPeriodicAdvertisingParametersUpdated(android.bluetooth.le.AdvertisingSet advertisingSet, int status) { throw new RuntimeException("Stub!"); }
public  void onPeriodicAdvertisingDataSet(android.bluetooth.le.AdvertisingSet advertisingSet, int status) { throw new RuntimeException("Stub!"); }
public  void onPeriodicAdvertisingEnabled(android.bluetooth.le.AdvertisingSet advertisingSet, boolean enable, int status) { throw new RuntimeException("Stub!"); }
public static final int ADVERTISE_FAILED_ALREADY_STARTED = 3;
public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = 1;
public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = 5;
public static final int ADVERTISE_FAILED_INTERNAL_ERROR = 4;
public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = 2;
public static final int ADVERTISE_SUCCESS = 0;
}
