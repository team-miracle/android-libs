/*
* Copyright (C) 2018 The Android Open Source Project
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

package android.net.wifi.rtt;
public class WifiRttManager
{
WifiRttManager() { throw new RuntimeException("Stub!"); }
public  boolean isAvailable() { throw new RuntimeException("Stub!"); }
public  void startRanging(android.net.wifi.rtt.RangingRequest request, java.util.concurrent.Executor executor, android.net.wifi.rtt.RangingResultCallback callback) { throw new RuntimeException("Stub!"); }
public  void startRanging(android.os.WorkSource workSource, android.net.wifi.rtt.RangingRequest request, java.util.concurrent.Executor executor, android.net.wifi.rtt.RangingResultCallback callback) { throw new RuntimeException("Stub!"); }
public  void cancelRanging(android.os.WorkSource workSource) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_WIFI_RTT_STATE_CHANGED = "android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED";
}
