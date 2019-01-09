/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.media;
public class AudioManager
{
public static interface OnAudioFocusChangeListener
{
public abstract  void onAudioFocusChange(int focusChange);
}
public abstract static class AudioPlaybackCallback
{
public  AudioPlaybackCallback() { throw new RuntimeException("Stub!"); }
public  void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> configs) { throw new RuntimeException("Stub!"); }
}
public abstract static class AudioRecordingCallback
{
public  AudioRecordingCallback() { throw new RuntimeException("Stub!"); }
public  void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> configs) { throw new RuntimeException("Stub!"); }
}
public abstract static class AudioServerStateCallback
{
public  AudioServerStateCallback() { throw new RuntimeException("Stub!"); }
public  void onAudioServerDown() { throw new RuntimeException("Stub!"); }
public  void onAudioServerUp() { throw new RuntimeException("Stub!"); }
}
AudioManager() { throw new RuntimeException("Stub!"); }
public  void dispatchMediaKeyEvent(android.view.KeyEvent keyEvent) { throw new RuntimeException("Stub!"); }
public  boolean isVolumeFixed() { throw new RuntimeException("Stub!"); }
public  void adjustStreamVolume(int streamType, int direction, int flags) { throw new RuntimeException("Stub!"); }
public  void adjustVolume(int direction, int flags) { throw new RuntimeException("Stub!"); }
public  void adjustSuggestedStreamVolume(int direction, int suggestedStreamType, int flags) { throw new RuntimeException("Stub!"); }
public  int getRingerMode() { throw new RuntimeException("Stub!"); }
public  int getStreamMaxVolume(int streamType) { throw new RuntimeException("Stub!"); }
public  int getStreamMinVolume(int streamType) { throw new RuntimeException("Stub!"); }
public  int getStreamVolume(int streamType) { throw new RuntimeException("Stub!"); }
public  float getStreamVolumeDb(int streamType, int index, int deviceType) { throw new RuntimeException("Stub!"); }
public  void setRingerMode(int ringerMode) { throw new RuntimeException("Stub!"); }
public  void setStreamVolume(int streamType, int index, int flags) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setStreamSolo(int streamType, boolean state) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setStreamMute(int streamType, boolean state) { throw new RuntimeException("Stub!"); }
public  boolean isStreamMute(int streamType) { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean shouldVibrate(int vibrateType) { throw new RuntimeException("Stub!"); }
@Deprecated
public  int getVibrateSetting(int vibrateType) { throw new RuntimeException("Stub!"); }
@Deprecated
public  void setVibrateSetting(int vibrateType, int vibrateSetting) { throw new RuntimeException("Stub!"); }
public  void setSpeakerphoneOn(boolean on) { throw new RuntimeException("Stub!"); }
public  boolean isSpeakerphoneOn() { throw new RuntimeException("Stub!"); }
public  boolean isBluetoothScoAvailableOffCall() { throw new RuntimeException("Stub!"); }
public  void startBluetoothSco() { throw new RuntimeException("Stub!"); }
public  void stopBluetoothSco() { throw new RuntimeException("Stub!"); }
public  void setBluetoothScoOn(boolean on) { throw new RuntimeException("Stub!"); }
public  boolean isBluetoothScoOn() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setBluetoothA2dpOn(boolean on) { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean isBluetoothA2dpOn() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setWiredHeadsetOn(boolean on) { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean isWiredHeadsetOn() { throw new RuntimeException("Stub!"); }
public  void setMicrophoneMute(boolean on) { throw new RuntimeException("Stub!"); }
public  boolean isMicrophoneMute() { throw new RuntimeException("Stub!"); }
public  void setMode(int mode) { throw new RuntimeException("Stub!"); }
public  int getMode() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setRouting(int mode, int routes, int mask) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getRouting(int mode) { throw new RuntimeException("Stub!"); }
public  boolean isMusicActive() { throw new RuntimeException("Stub!"); }
public  int generateAudioSessionId() { throw new RuntimeException("Stub!"); }
public  void setParameters(java.lang.String keyValuePairs) { throw new RuntimeException("Stub!"); }
public  java.lang.String getParameters(java.lang.String keys) { throw new RuntimeException("Stub!"); }
public  void playSoundEffect(int effectType) { throw new RuntimeException("Stub!"); }
public  void playSoundEffect(int effectType, float volume) { throw new RuntimeException("Stub!"); }
public  void loadSoundEffects() { throw new RuntimeException("Stub!"); }
public  void unloadSoundEffects() { throw new RuntimeException("Stub!"); }
@Deprecated
public  int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener l, int streamType, int durationHint) { throw new RuntimeException("Stub!"); }
public  int requestAudioFocus(android.media.AudioFocusRequest focusRequest) { throw new RuntimeException("Stub!"); }
public  int abandonAudioFocusRequest(android.media.AudioFocusRequest focusRequest) { throw new RuntimeException("Stub!"); }
public  int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener l, android.media.AudioAttributes requestAttributes, int durationHint, int flags) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
@Deprecated
public  int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener l, android.media.AudioAttributes requestAttributes, int durationHint, int flags, android.media.audiopolicy.AudioPolicy ap) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  int requestAudioFocus(android.media.AudioFocusRequest afr, android.media.audiopolicy.AudioPolicy ap) { throw new RuntimeException("Stub!"); }
public  void setFocusRequestResult(android.media.AudioFocusInfo afi, int requestResult, android.media.audiopolicy.AudioPolicy ap) { throw new RuntimeException("Stub!"); }
public  int dispatchAudioFocusChange(android.media.AudioFocusInfo afi, int focusChange, android.media.audiopolicy.AudioPolicy ap) { throw new RuntimeException("Stub!"); }
@Deprecated
public  int abandonAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener l) { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
@Deprecated
public  int abandonAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener l, android.media.AudioAttributes aa) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void registerMediaButtonEventReceiver(android.content.ComponentName eventReceiver) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void registerMediaButtonEventReceiver(android.app.PendingIntent eventReceiver) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void unregisterMediaButtonEventReceiver(android.content.ComponentName eventReceiver) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void unregisterMediaButtonEventReceiver(android.app.PendingIntent eventReceiver) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void registerRemoteControlClient(android.media.RemoteControlClient rcClient) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void unregisterRemoteControlClient(android.media.RemoteControlClient rcClient) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean registerRemoteController(android.media.RemoteController rctlr) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void unregisterRemoteController(android.media.RemoteController rctlr) { throw new RuntimeException("Stub!"); }
public  int registerAudioPolicy(android.media.audiopolicy.AudioPolicy policy) { throw new RuntimeException("Stub!"); }
public  void unregisterAudioPolicyAsync(android.media.audiopolicy.AudioPolicy policy) { throw new RuntimeException("Stub!"); }
public  void registerAudioPlaybackCallback(android.media.AudioManager.AudioPlaybackCallback cb, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterAudioPlaybackCallback(android.media.AudioManager.AudioPlaybackCallback cb) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() { throw new RuntimeException("Stub!"); }
public  void registerAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback cb, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback cb) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProperty(java.lang.String key) { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public  boolean isHdmiSystemAudioSupported() { throw new RuntimeException("Stub!"); }
public  android.media.AudioDeviceInfo[] getDevices(int flags) { throw new RuntimeException("Stub!"); }
public  void registerAudioDeviceCallback(android.media.AudioDeviceCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterAudioDeviceCallback(android.media.AudioDeviceCallback callback) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.MicrophoneInfo> getMicrophones() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setAudioServerStateCallback(java.util.concurrent.Executor executor, android.media.AudioManager.AudioServerStateCallback stateCallback) { throw new RuntimeException("Stub!"); }
public  void clearAudioServerStateCallback() { throw new RuntimeException("Stub!"); }
public  boolean isAudioServerRunning() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_AUDIO_BECOMING_NOISY = "android.media.AUDIO_BECOMING_NOISY";
public static final java.lang.String ACTION_HDMI_AUDIO_PLUG = "android.media.action.HDMI_AUDIO_PLUG";
public static final java.lang.String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
public static final java.lang.String ACTION_MICROPHONE_MUTE_CHANGED = "android.media.action.MICROPHONE_MUTE_CHANGED";
@java.lang.Deprecated()
public static final java.lang.String ACTION_SCO_AUDIO_STATE_CHANGED = "android.media.SCO_AUDIO_STATE_CHANGED";
public static final java.lang.String ACTION_SCO_AUDIO_STATE_UPDATED = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED";
public static final int ADJUST_LOWER = -1;
public static final int ADJUST_MUTE = -100;
public static final int ADJUST_RAISE = 1;
public static final int ADJUST_SAME = 0;
public static final int ADJUST_TOGGLE_MUTE = 101;
public static final int ADJUST_UNMUTE = 100;
public static final int AUDIOFOCUS_FLAG_DELAY_OK = 1;
public static final int AUDIOFOCUS_FLAG_LOCK = 4;
public static final int AUDIOFOCUS_FLAG_PAUSES_ON_DUCKABLE_LOSS = 2;
public static final int AUDIOFOCUS_GAIN = 1;
public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
public static final int AUDIOFOCUS_LOSS = -1;
public static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
public static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;
public static final int AUDIOFOCUS_NONE = 0;
public static final int AUDIOFOCUS_REQUEST_DELAYED = 2;
public static final int AUDIOFOCUS_REQUEST_FAILED = 0;
public static final int AUDIOFOCUS_REQUEST_GRANTED = 1;
public static final int AUDIO_SESSION_ID_GENERATE = 0;
public static final int ERROR = -1;
public static final int ERROR_DEAD_OBJECT = -6;
public static final java.lang.String EXTRA_AUDIO_PLUG_STATE = "android.media.extra.AUDIO_PLUG_STATE";
public static final java.lang.String EXTRA_ENCODINGS = "android.media.extra.ENCODINGS";
public static final java.lang.String EXTRA_MAX_CHANNEL_COUNT = "android.media.extra.MAX_CHANNEL_COUNT";
public static final java.lang.String EXTRA_RINGER_MODE = "android.media.EXTRA_RINGER_MODE";
public static final java.lang.String EXTRA_SCO_AUDIO_PREVIOUS_STATE = "android.media.extra.SCO_AUDIO_PREVIOUS_STATE";
public static final java.lang.String EXTRA_SCO_AUDIO_STATE = "android.media.extra.SCO_AUDIO_STATE";
@Deprecated
public static final java.lang.String EXTRA_VIBRATE_SETTING = "android.media.EXTRA_VIBRATE_SETTING";
@Deprecated
public static final java.lang.String EXTRA_VIBRATE_TYPE = "android.media.EXTRA_VIBRATE_TYPE";
public static final int FLAG_ALLOW_RINGER_MODES = 2;
public static final int FLAG_PLAY_SOUND = 4;
public static final int FLAG_REMOVE_SOUND_AND_VIBRATE = 8;
public static final int FLAG_SHOW_UI = 1;
public static final int FLAG_VIBRATE = 16;
public static final int FX_FOCUS_NAVIGATION_DOWN = 2;
public static final int FX_FOCUS_NAVIGATION_LEFT = 3;
public static final int FX_FOCUS_NAVIGATION_RIGHT = 4;
public static final int FX_FOCUS_NAVIGATION_UP = 1;
public static final int FX_KEYPRESS_DELETE = 7;
public static final int FX_KEYPRESS_INVALID = 9;
public static final int FX_KEYPRESS_RETURN = 8;
public static final int FX_KEYPRESS_SPACEBAR = 6;
public static final int FX_KEYPRESS_STANDARD = 5;
public static final int FX_KEY_CLICK = 0;
public static final int GET_DEVICES_ALL = 3;
public static final int GET_DEVICES_INPUTS = 1;
public static final int GET_DEVICES_OUTPUTS = 2;
public static final int MODE_CURRENT = -1;
public static final int MODE_INVALID = -2;
public static final int MODE_IN_CALL = 2;
public static final int MODE_IN_COMMUNICATION = 3;
public static final int MODE_NORMAL = 0;
public static final int MODE_RINGTONE = 1;
@java.lang.Deprecated()
public static final int NUM_STREAMS = 5;
public static final java.lang.String PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "android.media.property.OUTPUT_FRAMES_PER_BUFFER";
public static final java.lang.String PROPERTY_OUTPUT_SAMPLE_RATE = "android.media.property.OUTPUT_SAMPLE_RATE";
public static final java.lang.String PROPERTY_SUPPORT_AUDIO_SOURCE_UNPROCESSED = "android.media.property.SUPPORT_AUDIO_SOURCE_UNPROCESSED";
public static final java.lang.String PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND = "android.media.property.SUPPORT_MIC_NEAR_ULTRASOUND";
public static final java.lang.String PROPERTY_SUPPORT_SPEAKER_NEAR_ULTRASOUND = "android.media.property.SUPPORT_SPEAKER_NEAR_ULTRASOUND";
public static final java.lang.String RINGER_MODE_CHANGED_ACTION = "android.media.RINGER_MODE_CHANGED";
public static final int RINGER_MODE_NORMAL = 2;
public static final int RINGER_MODE_SILENT = 0;
public static final int RINGER_MODE_VIBRATE = 1;
@java.lang.Deprecated()
public static final int ROUTE_ALL = -1;
@java.lang.Deprecated()
public static final int ROUTE_BLUETOOTH = 4;
@java.lang.Deprecated()
public static final int ROUTE_BLUETOOTH_A2DP = 16;
@java.lang.Deprecated()
public static final int ROUTE_BLUETOOTH_SCO = 4;
@java.lang.Deprecated()
public static final int ROUTE_EARPIECE = 1;
@java.lang.Deprecated()
public static final int ROUTE_HEADSET = 8;
@java.lang.Deprecated()
public static final int ROUTE_SPEAKER = 2;
public static final int SCO_AUDIO_STATE_CONNECTED = 1;
public static final int SCO_AUDIO_STATE_CONNECTING = 2;
public static final int SCO_AUDIO_STATE_DISCONNECTED = 0;
public static final int SCO_AUDIO_STATE_ERROR = -1;
public static final int STREAM_ACCESSIBILITY = 10;
public static final int STREAM_ALARM = 4;
public static final int STREAM_DTMF = 8;
public static final int STREAM_MUSIC = 3;
public static final int STREAM_NOTIFICATION = 5;
public static final int STREAM_RING = 2;
public static final int STREAM_SYSTEM = 1;
public static final int STREAM_VOICE_CALL = 0;
public static final int USE_DEFAULT_STREAM_TYPE = -2147483648;
@Deprecated
public static final java.lang.String VIBRATE_SETTING_CHANGED_ACTION = "android.media.VIBRATE_SETTING_CHANGED";
@Deprecated
public static final int VIBRATE_SETTING_OFF = 0;
@Deprecated
public static final int VIBRATE_SETTING_ON = 1;
@Deprecated
public static final int VIBRATE_SETTING_ONLY_SILENT = 2;
@Deprecated
public static final int VIBRATE_TYPE_NOTIFICATION = 1;
@Deprecated
public static final int VIBRATE_TYPE_RINGER = 0;
}
