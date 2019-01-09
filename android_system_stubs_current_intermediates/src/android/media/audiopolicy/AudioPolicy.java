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

package android.media.audiopolicy;
public class AudioPolicy
{
public static class Builder
{
public  Builder(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioPolicy.Builder addMix(android.media.audiopolicy.AudioMix mix) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioPolicy.Builder setLooper(android.os.Looper looper) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  void setAudioPolicyFocusListener(android.media.audiopolicy.AudioPolicy.AudioPolicyFocusListener l) { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioPolicy.Builder setIsAudioFocusPolicy(boolean isFocusPolicy) { throw new RuntimeException("Stub!"); }
public  void setAudioPolicyStatusListener(android.media.audiopolicy.AudioPolicy.AudioPolicyStatusListener l) { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioPolicy.Builder setAudioPolicyVolumeCallback(android.media.audiopolicy.AudioPolicy.AudioPolicyVolumeCallback vc) { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioPolicy build() { throw new RuntimeException("Stub!"); }
}
public abstract static class AudioPolicyStatusListener
{
public  AudioPolicyStatusListener() { throw new RuntimeException("Stub!"); }
public  void onStatusChange() { throw new RuntimeException("Stub!"); }
public  void onMixStateUpdate(android.media.audiopolicy.AudioMix mix) { throw new RuntimeException("Stub!"); }
}
public abstract static class AudioPolicyFocusListener
{
public  AudioPolicyFocusListener() { throw new RuntimeException("Stub!"); }
public  void onAudioFocusGrant(android.media.AudioFocusInfo afi, int requestResult) { throw new RuntimeException("Stub!"); }
public  void onAudioFocusLoss(android.media.AudioFocusInfo afi, boolean wasNotified) { throw new RuntimeException("Stub!"); }
public  void onAudioFocusRequest(android.media.AudioFocusInfo afi, int requestResult) { throw new RuntimeException("Stub!"); }
public  void onAudioFocusAbandon(android.media.AudioFocusInfo afi) { throw new RuntimeException("Stub!"); }
}
public abstract static class AudioPolicyVolumeCallback
{
AudioPolicyVolumeCallback() { throw new RuntimeException("Stub!"); }
public  void onVolumeAdjustment(int adjustment) { throw new RuntimeException("Stub!"); }
}
AudioPolicy() { throw new RuntimeException("Stub!"); }
public  int attachMixes(java.util.List<android.media.audiopolicy.AudioMix> mixes) { throw new RuntimeException("Stub!"); }
public  int detachMixes(java.util.List<android.media.audiopolicy.AudioMix> mixes) { throw new RuntimeException("Stub!"); }
public  void setRegistration(java.lang.String regId) { throw new RuntimeException("Stub!"); }
public  int getFocusDuckingBehavior() { throw new RuntimeException("Stub!"); }
public  int setFocusDuckingBehavior(int behavior) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  android.media.AudioRecord createAudioRecordSink(android.media.audiopolicy.AudioMix mix) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.AudioTrack createAudioTrackSource(android.media.audiopolicy.AudioMix mix) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  int getStatus() { throw new RuntimeException("Stub!"); }
public  java.lang.String toLogFriendlyString() { throw new RuntimeException("Stub!"); }
public static final int FOCUS_POLICY_DUCKING_DEFAULT = 0;
public static final int FOCUS_POLICY_DUCKING_IN_APP = 0;
public static final int FOCUS_POLICY_DUCKING_IN_POLICY = 1;
public static final int POLICY_STATUS_REGISTERED = 2;
public static final int POLICY_STATUS_UNREGISTERED = 1;
}
