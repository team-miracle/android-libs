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
* limitations under the License
*/

package android.telephony.ims.feature;
public class MmTelFeature
  extends android.telephony.ims.feature.ImsFeature
{
public static class MmTelCapabilities
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface MmTelCapability
{
}
public  MmTelCapabilities(android.telephony.ims.feature.ImsFeature.Capabilities c) { throw new RuntimeException("Stub!"); }
public  MmTelCapabilities(int capabilities) { throw new RuntimeException("Stub!"); }
public final  void addCapabilities(@android.telephony.ims.feature.MmTelFeature.MmTelCapabilities.MmTelCapability()
int capabilities) { throw new RuntimeException("Stub!"); }
public final  void removeCapabilities(@android.telephony.ims.feature.MmTelFeature.MmTelCapabilities.MmTelCapability()
int capability) { throw new RuntimeException("Stub!"); }
public final  boolean isCapable(@android.telephony.ims.feature.MmTelFeature.MmTelCapabilities.MmTelCapability()
int capabilities) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int CAPABILITY_TYPE_SMS = 8;
public static final int CAPABILITY_TYPE_UT = 4;
public static final int CAPABILITY_TYPE_VIDEO = 2;
public static final int CAPABILITY_TYPE_VOICE = 1;
}
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface ProcessCallResult
{
}
public  MmTelFeature() { throw new RuntimeException("Stub!"); }
public final  android.telephony.ims.feature.MmTelFeature.MmTelCapabilities queryCapabilityStatus() { throw new RuntimeException("Stub!"); }
public final  void notifyCapabilitiesStatusChanged(android.telephony.ims.feature.MmTelFeature.MmTelCapabilities c) { throw new RuntimeException("Stub!"); }
public final  void notifyIncomingCall(android.telephony.ims.stub.ImsCallSessionImplBase c, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public final  void notifyVoiceMessageCountUpdate(int count) { throw new RuntimeException("Stub!"); }
public  boolean queryCapabilityConfiguration(@android.telephony.ims.feature.MmTelFeature.MmTelCapabilities.MmTelCapability()
int capability, int radioTech) { throw new RuntimeException("Stub!"); }
public  void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest request, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy c) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.ImsCallProfile createCallProfile(int callSessionType, int callType) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsCallSessionImplBase createCallSession(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
@android.telephony.ims.feature.MmTelFeature.ProcessCallResult()
public  int shouldProcessCall(java.lang.String[] numbers) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsUtImplBase getUt() { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsEcbmImplBase getEcbm() { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsMultiEndpointImplBase getMultiEndpoint() { throw new RuntimeException("Stub!"); }
public  void setUiTtyMode(int mode, android.os.Message onCompleteMessage) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.stub.ImsSmsImplBase getSmsImplementation() { throw new RuntimeException("Stub!"); }
public  void onFeatureRemoved() { throw new RuntimeException("Stub!"); }
public  void onFeatureReady() { throw new RuntimeException("Stub!"); }
public static final int PROCESS_CALL_CSFB = 1;
public static final int PROCESS_CALL_IMS = 0;
}
