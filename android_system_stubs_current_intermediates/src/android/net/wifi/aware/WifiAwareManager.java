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

package android.net.wifi.aware;
public class WifiAwareManager
{
WifiAwareManager() { throw new RuntimeException("Stub!"); }
public  boolean isAvailable() { throw new RuntimeException("Stub!"); }
public  android.net.wifi.aware.Characteristics getCharacteristics() { throw new RuntimeException("Stub!"); }
public  void attach(android.net.wifi.aware.AttachCallback attachCallback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void attach(android.net.wifi.aware.AttachCallback attachCallback, android.net.wifi.aware.IdentityChangedListener identityChangedListener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_WIFI_AWARE_STATE_CHANGED = "android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED";
public static final int WIFI_AWARE_DATA_PATH_ROLE_INITIATOR = 0;
public static final int WIFI_AWARE_DATA_PATH_ROLE_RESPONDER = 1;
}
