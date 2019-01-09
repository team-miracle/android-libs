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

package android.service.voice;
public class AlwaysOnHotwordDetector
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
public abstract  void onDetected(android.service.voice.AlwaysOnHotwordDetector.EventPayload eventPayload);
public abstract  void onError();
public abstract  void onRecognitionPaused();
public abstract  void onRecognitionResumed();
}
AlwaysOnHotwordDetector() { throw new RuntimeException("Stub!"); }
public  int getSupportedRecognitionModes() { throw new RuntimeException("Stub!"); }
public  boolean startRecognition(int recognitionFlags) { throw new RuntimeException("Stub!"); }
public  boolean stopRecognition() { throw new RuntimeException("Stub!"); }
public  android.content.Intent createEnrollIntent() { throw new RuntimeException("Stub!"); }
public  android.content.Intent createUnEnrollIntent() { throw new RuntimeException("Stub!"); }
public  android.content.Intent createReEnrollIntent() { throw new RuntimeException("Stub!"); }
public static final int RECOGNITION_FLAG_ALLOW_MULTIPLE_TRIGGERS = 2;
public static final int RECOGNITION_FLAG_CAPTURE_TRIGGER_AUDIO = 1;
public static final int RECOGNITION_MODE_USER_IDENTIFICATION = 2;
public static final int RECOGNITION_MODE_VOICE_TRIGGER = 1;
public static final int STATE_HARDWARE_UNAVAILABLE = -2;
public static final int STATE_KEYPHRASE_ENROLLED = 2;
public static final int STATE_KEYPHRASE_UNENROLLED = 1;
public static final int STATE_KEYPHRASE_UNSUPPORTED = -1;
}
