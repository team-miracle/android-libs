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

package android.hardware.radio;
public abstract class RadioTuner
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
@Deprecated
public  void onError(int status) { throw new RuntimeException("Stub!"); }
public  void onTuneFailed(int result, android.hardware.radio.ProgramSelector selector) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onConfigurationChanged(android.hardware.radio.RadioManager.BandConfig config) { throw new RuntimeException("Stub!"); }
public  void onProgramInfoChanged(android.hardware.radio.RadioManager.ProgramInfo info) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onMetadataChanged(android.hardware.radio.RadioMetadata metadata) { throw new RuntimeException("Stub!"); }
public  void onTrafficAnnouncement(boolean active) { throw new RuntimeException("Stub!"); }
public  void onEmergencyAnnouncement(boolean active) { throw new RuntimeException("Stub!"); }
public  void onAntennaState(boolean connected) { throw new RuntimeException("Stub!"); }
public  void onControlChanged(boolean control) { throw new RuntimeException("Stub!"); }
public  void onBackgroundScanAvailabilityChange(boolean isAvailable) { throw new RuntimeException("Stub!"); }
public  void onBackgroundScanComplete() { throw new RuntimeException("Stub!"); }
public  void onProgramListChanged() { throw new RuntimeException("Stub!"); }
public  void onParametersUpdated(java.util.Map<java.lang.String, java.lang.String> parameters) { throw new RuntimeException("Stub!"); }
}
public  RadioTuner() { throw new RuntimeException("Stub!"); }
public abstract  void close();
@java.lang.Deprecated()
public abstract  int setConfiguration(android.hardware.radio.RadioManager.BandConfig config);
@java.lang.Deprecated()
public abstract  int getConfiguration(android.hardware.radio.RadioManager.BandConfig[] config);
public abstract  int setMute(boolean mute);
public abstract  boolean getMute();
public abstract  int step(int direction, boolean skipSubChannel);
public abstract  int scan(int direction, boolean skipSubChannel);
@java.lang.Deprecated()
public abstract  int tune(int channel, int subChannel);
public abstract  void tune(android.hardware.radio.ProgramSelector selector);
public abstract  int cancel();
public abstract  void cancelAnnouncement();
@java.lang.Deprecated()
public abstract  int getProgramInformation(android.hardware.radio.RadioManager.ProgramInfo[] info);
public abstract  boolean startBackgroundScan();
@java.lang.Deprecated()
public abstract  java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getProgramList(java.util.Map<java.lang.String, java.lang.String> vendorFilter);
public  android.hardware.radio.ProgramList getDynamicProgramList(android.hardware.radio.ProgramList.Filter filter) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public abstract  boolean isAnalogForced();
@java.lang.Deprecated()
public abstract  void setAnalogForced(boolean isForced);
public  boolean isConfigFlagSupported(int flag) { throw new RuntimeException("Stub!"); }
public  boolean isConfigFlagSet(int flag) { throw new RuntimeException("Stub!"); }
public  void setConfigFlag(int flag, boolean value) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.String> setParameters(java.util.Map<java.lang.String, java.lang.String> parameters) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.String> getParameters(java.util.List<java.lang.String> keys) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public abstract  boolean isAntennaConnected();
public abstract  boolean hasControl();
public static final int DIRECTION_DOWN = 1;
public static final int DIRECTION_UP = 0;
@java.lang.Deprecated()
public static final int ERROR_BACKGROUND_SCAN_FAILED = 6;
@java.lang.Deprecated()
public static final int ERROR_BACKGROUND_SCAN_UNAVAILABLE = 5;
@java.lang.Deprecated()
public static final int ERROR_CANCELLED = 2;
@java.lang.Deprecated()
public static final int ERROR_CONFIG = 4;
@java.lang.Deprecated()
public static final int ERROR_HARDWARE_FAILURE = 0;
@java.lang.Deprecated()
public static final int ERROR_SCAN_TIMEOUT = 3;
@java.lang.Deprecated()
public static final int ERROR_SERVER_DIED = 1;
}
