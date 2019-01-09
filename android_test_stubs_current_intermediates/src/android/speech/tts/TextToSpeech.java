/*
* Copyright (C) 2009 The Android Open Source Project
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
public class TextToSpeech
{
public static interface OnInitListener
{
public abstract  void onInit(int status);
}
@java.lang.Deprecated()
public static interface OnUtteranceCompletedListener
{
public abstract  void onUtteranceCompleted(java.lang.String utteranceId);
}
public class Engine
{
public  Engine() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CHECK_TTS_DATA = "android.speech.tts.engine.CHECK_TTS_DATA";
public static final java.lang.String ACTION_GET_SAMPLE_TEXT = "android.speech.tts.engine.GET_SAMPLE_TEXT";
public static final java.lang.String ACTION_INSTALL_TTS_DATA = "android.speech.tts.engine.INSTALL_TTS_DATA";
public static final java.lang.String ACTION_TTS_DATA_INSTALLED = "android.speech.tts.engine.TTS_DATA_INSTALLED";
@java.lang.Deprecated()
public static final int CHECK_VOICE_DATA_BAD_DATA = -1;
public static final int CHECK_VOICE_DATA_FAIL = 0;
@java.lang.Deprecated()
public static final int CHECK_VOICE_DATA_MISSING_DATA = -2;
@java.lang.Deprecated()
public static final int CHECK_VOICE_DATA_MISSING_VOLUME = -3;
public static final int CHECK_VOICE_DATA_PASS = 1;
public static final int DEFAULT_STREAM = 3;
public static final java.lang.String EXTRA_AVAILABLE_VOICES = "availableVoices";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_CHECK_VOICE_DATA_FOR = "checkVoiceDataFor";
public static final java.lang.String EXTRA_SAMPLE_TEXT = "sampleText";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_TTS_DATA_INSTALLED = "dataInstalled";
public static final java.lang.String EXTRA_UNAVAILABLE_VOICES = "unavailableVoices";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_VOICE_DATA_FILES = "dataFiles";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_VOICE_DATA_FILES_INFO = "dataFilesInfo";
@java.lang.Deprecated()
public static final java.lang.String EXTRA_VOICE_DATA_ROOT_DIRECTORY = "dataRoot";
public static final java.lang.String INTENT_ACTION_TTS_SERVICE = "android.intent.action.TTS_SERVICE";
@java.lang.Deprecated()
public static final java.lang.String KEY_FEATURE_EMBEDDED_SYNTHESIS = "embeddedTts";
public static final java.lang.String KEY_FEATURE_NETWORK_RETRIES_COUNT = "networkRetriesCount";
@java.lang.Deprecated()
public static final java.lang.String KEY_FEATURE_NETWORK_SYNTHESIS = "networkTts";
public static final java.lang.String KEY_FEATURE_NETWORK_TIMEOUT_MS = "networkTimeoutMs";
public static final java.lang.String KEY_FEATURE_NOT_INSTALLED = "notInstalled";
public static final java.lang.String KEY_PARAM_PAN = "pan";
public static final java.lang.String KEY_PARAM_SESSION_ID = "sessionId";
public static final java.lang.String KEY_PARAM_STREAM = "streamType";
public static final java.lang.String KEY_PARAM_UTTERANCE_ID = "utteranceId";
public static final java.lang.String KEY_PARAM_VOLUME = "volume";
public static final java.lang.String SERVICE_META_DATA = "android.speech.tts";
}
public static class EngineInfo
{
public  EngineInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public int icon;
public java.lang.String label;
public java.lang.String name;
}
public  TextToSpeech(android.content.Context context, android.speech.tts.TextToSpeech.OnInitListener listener) { throw new RuntimeException("Stub!"); }
public  TextToSpeech(android.content.Context context, android.speech.tts.TextToSpeech.OnInitListener listener, java.lang.String engine) { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
public  int addSpeech(java.lang.String text, java.lang.String packagename, int resourceId) { throw new RuntimeException("Stub!"); }
public  int addSpeech(java.lang.CharSequence text, java.lang.String packagename, int resourceId) { throw new RuntimeException("Stub!"); }
public  int addSpeech(java.lang.String text, java.lang.String filename) { throw new RuntimeException("Stub!"); }
public  int addSpeech(java.lang.CharSequence text, java.io.File file) { throw new RuntimeException("Stub!"); }
public  int addEarcon(java.lang.String earcon, java.lang.String packagename, int resourceId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int addEarcon(java.lang.String earcon, java.lang.String filename) { throw new RuntimeException("Stub!"); }
public  int addEarcon(java.lang.String earcon, java.io.File file) { throw new RuntimeException("Stub!"); }
public  int speak(java.lang.CharSequence text, int queueMode, android.os.Bundle params, java.lang.String utteranceId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int speak(java.lang.String text, int queueMode, java.util.HashMap<java.lang.String, java.lang.String> params) { throw new RuntimeException("Stub!"); }
public  int playEarcon(java.lang.String earcon, int queueMode, android.os.Bundle params, java.lang.String utteranceId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int playEarcon(java.lang.String earcon, int queueMode, java.util.HashMap<java.lang.String, java.lang.String> params) { throw new RuntimeException("Stub!"); }
public  int playSilentUtterance(long durationInMs, int queueMode, java.lang.String utteranceId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int playSilence(long durationInMs, int queueMode, java.util.HashMap<java.lang.String, java.lang.String> params) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.Set<java.lang.String> getFeatures(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  boolean isSpeaking() { throw new RuntimeException("Stub!"); }
public  int stop() { throw new RuntimeException("Stub!"); }
public  int setSpeechRate(float speechRate) { throw new RuntimeException("Stub!"); }
public  int setPitch(float pitch) { throw new RuntimeException("Stub!"); }
public  int setAudioAttributes(android.media.AudioAttributes audioAttributes) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.Locale getDefaultLanguage() { throw new RuntimeException("Stub!"); }
public  int setLanguage(java.util.Locale loc) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.Locale getLanguage() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.util.Locale> getAvailableLanguages() { throw new RuntimeException("Stub!"); }
public  java.util.Set<android.speech.tts.Voice> getVoices() { throw new RuntimeException("Stub!"); }
public  int setVoice(android.speech.tts.Voice voice) { throw new RuntimeException("Stub!"); }
public  android.speech.tts.Voice getVoice() { throw new RuntimeException("Stub!"); }
public  android.speech.tts.Voice getDefaultVoice() { throw new RuntimeException("Stub!"); }
public  int isLanguageAvailable(java.util.Locale loc) { throw new RuntimeException("Stub!"); }
public  int synthesizeToFile(java.lang.CharSequence text, android.os.Bundle params, java.io.File file, java.lang.String utteranceId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int synthesizeToFile(java.lang.String text, java.util.HashMap<java.lang.String, java.lang.String> params, java.lang.String filename) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int setOnUtteranceCompletedListener(android.speech.tts.TextToSpeech.OnUtteranceCompletedListener listener) { throw new RuntimeException("Stub!"); }
public  int setOnUtteranceProgressListener(android.speech.tts.UtteranceProgressListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int setEngineByPackageName(java.lang.String enginePackageName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDefaultEngine() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean areDefaultsEnforced() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.speech.tts.TextToSpeech.EngineInfo> getEngines() { throw new RuntimeException("Stub!"); }
public static  int getMaxSpeechInputLength() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_TTS_QUEUE_PROCESSING_COMPLETED = "android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED";
public static final int ERROR = -1;
public static final int ERROR_INVALID_REQUEST = -8;
public static final int ERROR_NETWORK = -6;
public static final int ERROR_NETWORK_TIMEOUT = -7;
public static final int ERROR_NOT_INSTALLED_YET = -9;
public static final int ERROR_OUTPUT = -5;
public static final int ERROR_SERVICE = -4;
public static final int ERROR_SYNTHESIS = -3;
public static final int LANG_AVAILABLE = 0;
public static final int LANG_COUNTRY_AVAILABLE = 1;
public static final int LANG_COUNTRY_VAR_AVAILABLE = 2;
public static final int LANG_MISSING_DATA = -1;
public static final int LANG_NOT_SUPPORTED = -2;
public static final int QUEUE_ADD = 1;
public static final int QUEUE_FLUSH = 0;
public static final int STOPPED = -2;
public static final int SUCCESS = 0;
}
