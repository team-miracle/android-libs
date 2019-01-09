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
* limitations under the License
*/

package android.telephony.ims;
public class ImsService
  extends android.app.Service
{
public  ImsService() { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsFeatureConfiguration querySupportedImsFeatures() { throw new RuntimeException("Stub!"); }
public final  void onUpdateSupportedImsFeatures(android.telephony.ims.stub.ImsFeatureConfiguration c) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void readyForFeatureCreation() { throw new RuntimeException("Stub!"); }
public  void enableIms(int slotId) { throw new RuntimeException("Stub!"); }
public  void disableIms(int slotId) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.feature.MmTelFeature createMmTelFeature(int slotId) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.feature.RcsFeature createRcsFeature(int slotId) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsConfigImplBase getConfig(int slotId) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsRegistrationImplBase getRegistration(int slotId) { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
}
