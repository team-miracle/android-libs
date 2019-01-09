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
package android.speech;
public interface RecognitionListener
{
public abstract  void onReadyForSpeech(android.os.Bundle params);
public abstract  void onBeginningOfSpeech();
public abstract  void onRmsChanged(float rmsdB);
public abstract  void onBufferReceived(byte[] buffer);
public abstract  void onEndOfSpeech();
public abstract  void onError(int error);
public abstract  void onResults(android.os.Bundle results);
public abstract  void onPartialResults(android.os.Bundle partialResults);
public abstract  void onEvent(int eventType, android.os.Bundle params);
}
