/*
* Copyright (C) 2011 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/
package android.speech.tts;
public abstract class TextToSpeechService
  extends android.app.Service
{
public  TextToSpeechService() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
protected abstract  int onIsLanguageAvailable(java.lang.String lang, java.lang.String country, java.lang.String variant);
protected abstract  java.lang.String[] onGetLanguage();
protected abstract  int onLoadLanguage(java.lang.String lang, java.lang.String country, java.lang.String variant);
protected abstract  void onStop();
protected abstract  void onSynthesizeText(android.speech.tts.SynthesisRequest request, android.speech.tts.SynthesisCallback callback);
protected  java.util.Set<java.lang.String> onGetFeaturesForLanguage(java.lang.String lang, java.lang.String country, java.lang.String variant) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.speech.tts.Voice> onGetVoices() { throw new RuntimeException("Stub!"); }
public  java.lang.String onGetDefaultVoiceNameFor(java.lang.String lang, java.lang.String country, java.lang.String variant) { throw new RuntimeException("Stub!"); }
public  int onLoadVoice(java.lang.String voiceName) { throw new RuntimeException("Stub!"); }
public  int onIsValidVoiceName(java.lang.String voiceName) { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
}
