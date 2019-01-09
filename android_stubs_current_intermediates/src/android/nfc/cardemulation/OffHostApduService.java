/*
* Copyright (C) 2015 The Android Open Source Project
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

package android.nfc.cardemulation;
public abstract class OffHostApduService
  extends android.app.Service
{
public  OffHostApduService() { throw new RuntimeException("Stub!"); }
public abstract  android.os.IBinder onBind(android.content.Intent intent);
public static final java.lang.String SERVICE_INTERFACE = "android.nfc.cardemulation.action.OFF_HOST_APDU_SERVICE";
public static final java.lang.String SERVICE_META_DATA = "android.nfc.cardemulation.off_host_apdu_service";
}
