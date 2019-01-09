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
public abstract class ImsFeature
{
protected static class CapabilityCallbackProxy
{
CapabilityCallbackProxy() { throw new RuntimeException("Stub!"); }
public  void onChangeCapabilityConfigurationError(int capability, int radioTech, int reason) { throw new RuntimeException("Stub!"); }
}
public static class Capabilities
{
public  Capabilities() { throw new RuntimeException("Stub!"); }
protected  Capabilities(int capabilities) { throw new RuntimeException("Stub!"); }
public  void addCapabilities(int capabilities) { throw new RuntimeException("Stub!"); }
public  void removeCapabilities(int capabilities) { throw new RuntimeException("Stub!"); }
public  boolean isCapable(int capabilities) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.feature.ImsFeature.Capabilities copy() { throw new RuntimeException("Stub!"); }
public  int getMask() { throw new RuntimeException("Stub!"); }
protected int mCapabilities;
}
public  ImsFeature() { throw new RuntimeException("Stub!"); }
public final  void setFeatureState(int state) { throw new RuntimeException("Stub!"); }
public abstract  void changeEnabledCapabilities(android.telephony.ims.feature.CapabilityChangeRequest request, android.telephony.ims.feature.ImsFeature.CapabilityCallbackProxy c);
public abstract  void onFeatureRemoved();
public abstract  void onFeatureReady();
public static final int CAPABILITY_ERROR_GENERIC = -1;
public static final int CAPABILITY_SUCCESS = 0;
public static final int FEATURE_EMERGENCY_MMTEL = 0;
public static final int FEATURE_MMTEL = 1;
public static final int FEATURE_RCS = 2;
public static final int STATE_INITIALIZING = 1;
public static final int STATE_READY = 2;
public static final int STATE_UNAVAILABLE = 0;
}
