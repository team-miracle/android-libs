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
public abstract class HostNfcFService
  extends android.app.Service
{
public  HostNfcFService() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public final  void sendResponsePacket(byte[] responsePacket) { throw new RuntimeException("Stub!"); }
public abstract  byte[] processNfcFPacket(byte[] commandPacket, android.os.Bundle extras);
public abstract  void onDeactivated(int reason);
public static final int DEACTIVATION_LINK_LOSS = 0;
public static final java.lang.String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_NFCF_SERVICE";
public static final java.lang.String SERVICE_META_DATA = "android.nfc.cardemulation.host_nfcf_service";
}
