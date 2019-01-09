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

package android.media.tv;
public final class TvInputManager
{
public abstract static class TvInputCallback
{
public  TvInputCallback() { throw new RuntimeException("Stub!"); }
public  void onInputStateChanged(java.lang.String inputId, int state) { throw new RuntimeException("Stub!"); }
public  void onInputAdded(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void onInputRemoved(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void onInputUpdated(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void onTvInputInfoUpdated(android.media.tv.TvInputInfo inputInfo) { throw new RuntimeException("Stub!"); }
}
public abstract static class HardwareCallback
{
public  HardwareCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onReleased();
public abstract  void onStreamConfigChanged(android.media.tv.TvStreamConfig[] configs);
}
public static final class Hardware
{
Hardware() { throw new RuntimeException("Stub!"); }
public  boolean setSurface(android.view.Surface surface, android.media.tv.TvStreamConfig config) { throw new RuntimeException("Stub!"); }
public  void setStreamVolume(float volume) { throw new RuntimeException("Stub!"); }
public  void overrideAudioSink(int audioType, java.lang.String audioAddress, int samplingRate, int channelMask, int format) { throw new RuntimeException("Stub!"); }
}
TvInputManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.tv.TvInputInfo> getTvInputList() { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputInfo getTvInputInfo(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void updateTvInputInfo(android.media.tv.TvInputInfo inputInfo) { throw new RuntimeException("Stub!"); }
public  int getInputState(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.media.tv.TvInputManager.TvInputCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterCallback(android.media.tv.TvInputManager.TvInputCallback callback) { throw new RuntimeException("Stub!"); }
public  boolean isParentalControlsEnabled() { throw new RuntimeException("Stub!"); }
public  void setParentalControlsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isRatingBlocked(android.media.tv.TvContentRating rating) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.tv.TvContentRating> getBlockedRatings() { throw new RuntimeException("Stub!"); }
public  void addBlockedRating(android.media.tv.TvContentRating rating) { throw new RuntimeException("Stub!"); }
public  void removeBlockedRating(android.media.tv.TvContentRating rating) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.tv.TvContentRatingSystemInfo> getTvContentRatingSystemList() { throw new RuntimeException("Stub!"); }
public  void notifyPreviewProgramBrowsableDisabled(java.lang.String packageName, long programId) { throw new RuntimeException("Stub!"); }
public  void notifyWatchNextProgramBrowsableDisabled(java.lang.String packageName, long programId) { throw new RuntimeException("Stub!"); }
public  void notifyPreviewProgramAddedToWatchNext(java.lang.String packageName, long previewProgramId, long watchNextProgramId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.tv.TvStreamConfig> getAvailableTvStreamConfigList(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  boolean captureFrame(java.lang.String inputId, android.view.Surface surface, android.media.tv.TvStreamConfig config) { throw new RuntimeException("Stub!"); }
public  boolean isSingleSessionActive() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.tv.TvInputHardwareInfo> getHardwareList() { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputManager.Hardware acquireTvInputHardware(int deviceId, android.media.tv.TvInputInfo info, android.media.tv.TvInputManager.HardwareCallback callback) { throw new RuntimeException("Stub!"); }
public  void releaseTvInputHardware(int deviceId, android.media.tv.TvInputManager.Hardware hardware) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_BLOCKED_RATINGS_CHANGED = "android.media.tv.action.BLOCKED_RATINGS_CHANGED";
public static final java.lang.String ACTION_PARENTAL_CONTROLS_ENABLED_CHANGED = "android.media.tv.action.PARENTAL_CONTROLS_ENABLED_CHANGED";
public static final java.lang.String ACTION_QUERY_CONTENT_RATING_SYSTEMS = "android.media.tv.action.QUERY_CONTENT_RATING_SYSTEMS";
public static final java.lang.String ACTION_SETUP_INPUTS = "android.media.tv.action.SETUP_INPUTS";
public static final java.lang.String ACTION_VIEW_RECORDING_SCHEDULES = "android.media.tv.action.VIEW_RECORDING_SCHEDULES";
public static final int INPUT_STATE_CONNECTED = 0;
public static final int INPUT_STATE_CONNECTED_STANDBY = 1;
public static final int INPUT_STATE_DISCONNECTED = 2;
public static final java.lang.String META_DATA_CONTENT_RATING_SYSTEMS = "android.media.tv.metadata.CONTENT_RATING_SYSTEMS";
public static final int RECORDING_ERROR_INSUFFICIENT_SPACE = 1;
public static final int RECORDING_ERROR_RESOURCE_BUSY = 2;
public static final int RECORDING_ERROR_UNKNOWN = 0;
public static final long TIME_SHIFT_INVALID_TIME = -9223372036854775808L;
public static final int TIME_SHIFT_STATUS_AVAILABLE = 3;
public static final int TIME_SHIFT_STATUS_UNAVAILABLE = 2;
public static final int TIME_SHIFT_STATUS_UNKNOWN = 0;
public static final int TIME_SHIFT_STATUS_UNSUPPORTED = 1;
public static final int VIDEO_UNAVAILABLE_REASON_AUDIO_ONLY = 4;
public static final int VIDEO_UNAVAILABLE_REASON_BUFFERING = 3;
public static final int VIDEO_UNAVAILABLE_REASON_TUNING = 1;
public static final int VIDEO_UNAVAILABLE_REASON_UNKNOWN = 0;
public static final int VIDEO_UNAVAILABLE_REASON_WEAK_SIGNAL = 2;
}
