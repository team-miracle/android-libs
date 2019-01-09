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
TvInputManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.tv.TvInputInfo> getTvInputList() { throw new RuntimeException("Stub!"); }
public  android.media.tv.TvInputInfo getTvInputInfo(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void updateTvInputInfo(android.media.tv.TvInputInfo inputInfo) { throw new RuntimeException("Stub!"); }
public  int getInputState(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.media.tv.TvInputManager.TvInputCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterCallback(android.media.tv.TvInputManager.TvInputCallback callback) { throw new RuntimeException("Stub!"); }
public  boolean isParentalControlsEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isRatingBlocked(android.media.tv.TvContentRating rating) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.tv.TvContentRating> getBlockedRatings() { throw new RuntimeException("Stub!"); }
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
