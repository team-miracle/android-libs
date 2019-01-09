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

package android.hardware.hdmi;
public final class HdmiControlManager
{
public static interface HotplugEventListener
{
public abstract  void onReceived(android.hardware.hdmi.HdmiHotplugEvent event);
}
public static interface VendorCommandListener
{
public abstract  void onReceived(int srcAddress, int destAddress, byte[] params, boolean hasVendorId);
public abstract  void onControlStateChanged(boolean enabled, int reason);
}
HdmiControlManager() { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public  android.hardware.hdmi.HdmiClient getClient(int type) { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public  android.hardware.hdmi.HdmiPlaybackClient getPlaybackClient() { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public  android.hardware.hdmi.HdmiTvClient getTvClient() { throw new RuntimeException("Stub!"); }
public  void setStandbyMode(boolean isStandbyModeOn) { throw new RuntimeException("Stub!"); }
public  void addHotplugEventListener(android.hardware.hdmi.HdmiControlManager.HotplugEventListener listener) { throw new RuntimeException("Stub!"); }
public  void removeHotplugEventListener(android.hardware.hdmi.HdmiControlManager.HotplugEventListener listener) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_OSD_MESSAGE = "android.hardware.hdmi.action.OSD_MESSAGE";
public static final int AVR_VOLUME_MUTED = 101;
public static final int CLEAR_TIMER_STATUS_CEC_DISABLE = 162;
public static final int CLEAR_TIMER_STATUS_CHECK_RECORDER_CONNECTION = 160;
public static final int CLEAR_TIMER_STATUS_FAIL_TO_CLEAR_SELECTED_SOURCE = 161;
public static final int CLEAR_TIMER_STATUS_TIMER_CLEARED = 128;
public static final int CLEAR_TIMER_STATUS_TIMER_NOT_CLEARED_NO_INFO_AVAILABLE = 2;
public static final int CLEAR_TIMER_STATUS_TIMER_NOT_CLEARED_NO_MATCHING = 1;
public static final int CLEAR_TIMER_STATUS_TIMER_NOT_CLEARED_RECORDING = 0;
public static final int CONTROL_STATE_CHANGED_REASON_SETTING = 1;
public static final int CONTROL_STATE_CHANGED_REASON_STANDBY = 3;
public static final int CONTROL_STATE_CHANGED_REASON_START = 0;
public static final int CONTROL_STATE_CHANGED_REASON_WAKEUP = 2;
public static final int DEVICE_EVENT_ADD_DEVICE = 1;
public static final int DEVICE_EVENT_REMOVE_DEVICE = 2;
public static final int DEVICE_EVENT_UPDATE_DEVICE = 3;
public static final java.lang.String EXTRA_MESSAGE_EXTRA_PARAM1 = "android.hardware.hdmi.extra.MESSAGE_EXTRA_PARAM1";
public static final java.lang.String EXTRA_MESSAGE_ID = "android.hardware.hdmi.extra.MESSAGE_ID";
public static final int ONE_TOUCH_RECORD_ALREADY_RECORDING = 18;
public static final int ONE_TOUCH_RECORD_CEC_DISABLED = 51;
public static final int ONE_TOUCH_RECORD_CHECK_RECORDER_CONNECTION = 49;
public static final int ONE_TOUCH_RECORD_DISALLOW_TO_COPY = 13;
public static final int ONE_TOUCH_RECORD_DISALLOW_TO_FUTHER_COPIES = 14;
public static final int ONE_TOUCH_RECORD_FAIL_TO_RECORD_DISPLAYED_SCREEN = 50;
public static final int ONE_TOUCH_RECORD_INVALID_EXTERNAL_PHYSICAL_ADDRESS = 10;
public static final int ONE_TOUCH_RECORD_INVALID_EXTERNAL_PLUG_NUMBER = 9;
public static final int ONE_TOUCH_RECORD_MEDIA_PROBLEM = 21;
public static final int ONE_TOUCH_RECORD_MEDIA_PROTECTED = 19;
public static final int ONE_TOUCH_RECORD_NOT_ENOUGH_SPACE = 22;
public static final int ONE_TOUCH_RECORD_NO_MEDIA = 16;
public static final int ONE_TOUCH_RECORD_NO_OR_INSUFFICIENT_CA_ENTITLEMENTS = 12;
public static final int ONE_TOUCH_RECORD_NO_SOURCE_SIGNAL = 20;
public static final int ONE_TOUCH_RECORD_OTHER_REASON = 31;
public static final int ONE_TOUCH_RECORD_PARENT_LOCK_ON = 23;
public static final int ONE_TOUCH_RECORD_PLAYING = 17;
public static final int ONE_TOUCH_RECORD_PREVIOUS_RECORDING_IN_PROGRESS = 48;
public static final int ONE_TOUCH_RECORD_RECORDING_ALREADY_TERMINATED = 27;
public static final int ONE_TOUCH_RECORD_RECORDING_ANALOGUE_SERVICE = 3;
public static final int ONE_TOUCH_RECORD_RECORDING_CURRENTLY_SELECTED_SOURCE = 1;
public static final int ONE_TOUCH_RECORD_RECORDING_DIGITAL_SERVICE = 2;
public static final int ONE_TOUCH_RECORD_RECORDING_EXTERNAL_INPUT = 4;
public static final int ONE_TOUCH_RECORD_RECORDING_TERMINATED_NORMALLY = 26;
public static final int ONE_TOUCH_RECORD_UNABLE_ANALOGUE_SERVICE = 6;
public static final int ONE_TOUCH_RECORD_UNABLE_DIGITAL_SERVICE = 5;
public static final int ONE_TOUCH_RECORD_UNABLE_SELECTED_SERVICE = 7;
public static final int ONE_TOUCH_RECORD_UNSUPPORTED_CA = 11;
public static final int OSD_MESSAGE_ARC_CONNECTED_INVALID_PORT = 1;
public static final int OSD_MESSAGE_AVR_VOLUME_CHANGED = 2;
public static final int POWER_STATUS_ON = 0;
public static final int POWER_STATUS_STANDBY = 1;
public static final int POWER_STATUS_TRANSIENT_TO_ON = 2;
public static final int POWER_STATUS_TRANSIENT_TO_STANDBY = 3;
public static final int POWER_STATUS_UNKNOWN = -1;
@java.lang.Deprecated()
public static final int RESULT_ALREADY_IN_PROGRESS = 4;
public static final int RESULT_COMMUNICATION_FAILED = 7;
public static final int RESULT_EXCEPTION = 5;
public static final int RESULT_INCORRECT_MODE = 6;
public static final int RESULT_SOURCE_NOT_AVAILABLE = 2;
public static final int RESULT_SUCCESS = 0;
public static final int RESULT_TARGET_NOT_AVAILABLE = 3;
public static final int RESULT_TIMEOUT = 1;
public static final int TIMER_RECORDING_RESULT_EXTRA_CEC_DISABLED = 3;
public static final int TIMER_RECORDING_RESULT_EXTRA_CHECK_RECORDER_CONNECTION = 1;
public static final int TIMER_RECORDING_RESULT_EXTRA_FAIL_TO_RECORD_SELECTED_SOURCE = 2;
public static final int TIMER_RECORDING_RESULT_EXTRA_NO_ERROR = 0;
public static final int TIMER_RECORDING_TYPE_ANALOGUE = 2;
public static final int TIMER_RECORDING_TYPE_DIGITAL = 1;
public static final int TIMER_RECORDING_TYPE_EXTERNAL = 3;
public static final int TIMER_STATUS_MEDIA_INFO_NOT_PRESENT = 2;
public static final int TIMER_STATUS_MEDIA_INFO_PRESENT_NOT_PROTECTED = 0;
public static final int TIMER_STATUS_MEDIA_INFO_PRESENT_PROTECTED = 1;
public static final int TIMER_STATUS_NOT_PROGRAMMED_CA_NOT_SUPPORTED = 6;
public static final int TIMER_STATUS_NOT_PROGRAMMED_CLOCK_FAILURE = 10;
public static final int TIMER_STATUS_NOT_PROGRAMMED_DATE_OUT_OF_RANGE = 2;
public static final int TIMER_STATUS_NOT_PROGRAMMED_DUPLICATED = 14;
public static final int TIMER_STATUS_NOT_PROGRAMMED_INVALID_EXTERNAL_PHYSICAL_NUMBER = 5;
public static final int TIMER_STATUS_NOT_PROGRAMMED_INVALID_EXTERNAL_PLUG_NUMBER = 4;
public static final int TIMER_STATUS_NOT_PROGRAMMED_INVALID_SEQUENCE = 3;
public static final int TIMER_STATUS_NOT_PROGRAMMED_NO_CA_ENTITLEMENTS = 7;
public static final int TIMER_STATUS_NOT_PROGRAMMED_NO_FREE_TIME = 1;
public static final int TIMER_STATUS_NOT_PROGRAMMED_PARENTAL_LOCK_ON = 9;
public static final int TIMER_STATUS_NOT_PROGRAMMED_UNSUPPORTED_RESOLUTION = 8;
public static final int TIMER_STATUS_PROGRAMMED_INFO_ENOUGH_SPACE = 8;
public static final int TIMER_STATUS_PROGRAMMED_INFO_MIGHT_NOT_ENOUGH_SPACE = 11;
public static final int TIMER_STATUS_PROGRAMMED_INFO_NOT_ENOUGH_SPACE = 9;
public static final int TIMER_STATUS_PROGRAMMED_INFO_NO_MEDIA_INFO = 10;
}
