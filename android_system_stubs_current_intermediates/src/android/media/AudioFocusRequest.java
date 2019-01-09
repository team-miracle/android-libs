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
* limitations under the License.
*/

package android.media;
public final class AudioFocusRequest
{
public static final class Builder
{
public  Builder(int focusGain) { throw new RuntimeException("Stub!"); }
public  Builder(android.media.AudioFocusRequest requestToCopy) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFocusRequest.Builder setFocusGain(int focusGain) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener listener) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFocusRequest.Builder setAudioAttributes(android.media.AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFocusRequest.Builder setWillPauseWhenDucked(boolean pauseOnDuck) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFocusRequest.Builder setAcceptsDelayedFocusGain(boolean acceptsDelayedFocusGain) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFocusRequest.Builder setLocksFocus(boolean focusLocked) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFocusRequest.Builder setForceDucking(boolean forceDucking) { throw new RuntimeException("Stub!"); }
public  android.media.AudioFocusRequest build() { throw new RuntimeException("Stub!"); }
}
AudioFocusRequest() { throw new RuntimeException("Stub!"); }
public  android.media.AudioAttributes getAudioAttributes() { throw new RuntimeException("Stub!"); }
public  int getFocusGain() { throw new RuntimeException("Stub!"); }
public  boolean willPauseWhenDucked() { throw new RuntimeException("Stub!"); }
public  boolean acceptsDelayedFocusGain() { throw new RuntimeException("Stub!"); }
public  boolean locksFocus() { throw new RuntimeException("Stub!"); }
}
