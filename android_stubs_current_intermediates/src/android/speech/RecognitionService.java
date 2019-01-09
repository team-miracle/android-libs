/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.speech;
public abstract class RecognitionService
  extends android.app.Service
{
public class Callback
{
Callback() { throw new RuntimeException("Stub!"); }
public  void beginningOfSpeech() throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void bufferReceived(byte[] buffer) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void endOfSpeech() throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void error(int error) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void partialResults(android.os.Bundle partialResults) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void readyForSpeech(android.os.Bundle params) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void results(android.os.Bundle results) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void rmsChanged(float rmsdB) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int getCallingUid() { throw new RuntimeException("Stub!"); }
}
public  RecognitionService() { throw new RuntimeException("Stub!"); }
protected abstract  void onStartListening(android.content.Intent recognizerIntent, android.speech.RecognitionService.Callback listener);
protected abstract  void onCancel(android.speech.RecognitionService.Callback listener);
protected abstract  void onStopListening(android.speech.RecognitionService.Callback listener);
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.speech.RecognitionService";
public static final java.lang.String SERVICE_META_DATA = "android.speech";
}
