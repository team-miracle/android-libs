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
* limitations under the License.
*/

package android.bluetooth.le;
public abstract class AdvertiseCallback
{
public  AdvertiseCallback() { throw new RuntimeException("Stub!"); }
public  void onStartSuccess(android.bluetooth.le.AdvertiseSettings settingsInEffect) { throw new RuntimeException("Stub!"); }
public  void onStartFailure(int errorCode) { throw new RuntimeException("Stub!"); }
public static final int ADVERTISE_FAILED_ALREADY_STARTED = 3;
public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = 1;
public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = 5;
public static final int ADVERTISE_FAILED_INTERNAL_ERROR = 4;
public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = 2;
}
