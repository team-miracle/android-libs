/**
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

package android.media.soundtrigger;
public final class SoundTriggerDetector
{
public static class EventPayload
{
EventPayload() { throw new RuntimeException("Stub!"); }
public  android.media.AudioFormat getCaptureAudioFormat() { throw new RuntimeException("Stub!"); }
public  byte[] getTriggerAudio() { throw new RuntimeException("Stub!"); }
}
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public abstract  void onAvailabilityChanged(int status);
public abstract  void onDetected(android.media.soundtrigger.SoundTriggerDetector.EventPayload eventPayload);
public abstract  void onError();
public abstract  void onRecognitionPaused();
public abstract  void onRecognitionResumed();
}
SoundTriggerDetector() { throw new RuntimeException("Stub!"); }
public  boolean startRecognition(int recognitionFlags) { throw new RuntimeException("Stub!"); }
public  boolean stopRecognition() { throw new RuntimeException("Stub!"); }
public static final int RECOGNITION_FLAG_ALLOW_MULTIPLE_TRIGGERS = 2;
public static final int RECOGNITION_FLAG_CAPTURE_TRIGGER_AUDIO = 1;
}
