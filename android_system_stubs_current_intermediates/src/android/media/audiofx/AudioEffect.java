/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.media.audiofx;
public class AudioEffect
{
public static class Descriptor
{
public  Descriptor() { throw new RuntimeException("Stub!"); }
public  Descriptor(java.lang.String type, java.lang.String uuid, java.lang.String connectMode, java.lang.String name, java.lang.String implementor) { throw new RuntimeException("Stub!"); }
public java.lang.String connectMode;
public java.lang.String implementor;
public java.lang.String name;
public java.util.UUID type;
public java.util.UUID uuid;
}
public static interface OnEnableStatusChangeListener
{
public abstract  void onEnableStatusChange(android.media.audiofx.AudioEffect effect, boolean enabled);
}
public static interface OnControlStatusChangeListener
{
public abstract  void onControlStatusChange(android.media.audiofx.AudioEffect effect, boolean controlGranted);
}
AudioEffect() { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.AudioEffect.Descriptor getDescriptor() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public static  android.media.audiofx.AudioEffect.Descriptor[] queryEffects() { throw new RuntimeException("Stub!"); }
public  int setEnabled(boolean enabled) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getId() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  boolean getEnabled() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  boolean hasControl() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setEnableStatusListener(android.media.audiofx.AudioEffect.OnEnableStatusChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void setControlStatusListener(android.media.audiofx.AudioEffect.OnControlStatusChangeListener listener) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION";
public static final java.lang.String ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL = "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL";
public static final java.lang.String ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION";
public static final int ALREADY_EXISTS = -2;
public static final int CONTENT_TYPE_GAME = 2;
public static final int CONTENT_TYPE_MOVIE = 1;
public static final int CONTENT_TYPE_MUSIC = 0;
public static final int CONTENT_TYPE_VOICE = 3;
public static final java.lang.String EFFECT_AUXILIARY = "Auxiliary";
public static final java.lang.String EFFECT_INSERT = "Insert";
public static final java.util.UUID EFFECT_TYPE_AEC;
public static final java.util.UUID EFFECT_TYPE_AGC;
public static final java.util.UUID EFFECT_TYPE_BASS_BOOST;
public static final java.util.UUID EFFECT_TYPE_DYNAMICS_PROCESSING;
public static final java.util.UUID EFFECT_TYPE_ENV_REVERB;
public static final java.util.UUID EFFECT_TYPE_EQUALIZER;
public static final java.util.UUID EFFECT_TYPE_LOUDNESS_ENHANCER;
public static final java.util.UUID EFFECT_TYPE_NS;
public static final java.util.UUID EFFECT_TYPE_PRESET_REVERB;
public static final java.util.UUID EFFECT_TYPE_VIRTUALIZER;
public static final int ERROR = -1;
public static final int ERROR_BAD_VALUE = -4;
public static final int ERROR_DEAD_OBJECT = -7;
public static final int ERROR_INVALID_OPERATION = -5;
public static final int ERROR_NO_INIT = -3;
public static final int ERROR_NO_MEMORY = -6;
public static final java.lang.String EXTRA_AUDIO_SESSION = "android.media.extra.AUDIO_SESSION";
public static final java.lang.String EXTRA_CONTENT_TYPE = "android.media.extra.CONTENT_TYPE";
public static final java.lang.String EXTRA_PACKAGE_NAME = "android.media.extra.PACKAGE_NAME";
public static final int SUCCESS = 0;
static { EFFECT_TYPE_AEC = null; EFFECT_TYPE_AGC = null; EFFECT_TYPE_BASS_BOOST = null; EFFECT_TYPE_DYNAMICS_PROCESSING = null; EFFECT_TYPE_ENV_REVERB = null; EFFECT_TYPE_EQUALIZER = null; EFFECT_TYPE_LOUDNESS_ENHANCER = null; EFFECT_TYPE_NS = null; EFFECT_TYPE_PRESET_REVERB = null; EFFECT_TYPE_VIRTUALIZER = null; }
}
