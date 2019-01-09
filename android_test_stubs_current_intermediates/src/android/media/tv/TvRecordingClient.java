/*
* Copyright (C) 2016 The Android Open Source Project
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

package android.media.tv;
public class TvRecordingClient
{
public abstract static class RecordingCallback
{
public  RecordingCallback() { throw new RuntimeException("Stub!"); }
public  void onConnectionFailed(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void onDisconnected(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void onTuned(android.net.Uri channelUri) { throw new RuntimeException("Stub!"); }
public  void onRecordingStopped(android.net.Uri recordedProgramUri) { throw new RuntimeException("Stub!"); }
public  void onError(int error) { throw new RuntimeException("Stub!"); }
}
public  TvRecordingClient(android.content.Context context, java.lang.String tag, android.media.tv.TvRecordingClient.RecordingCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void tune(java.lang.String inputId, android.net.Uri channelUri) { throw new RuntimeException("Stub!"); }
public  void tune(java.lang.String inputId, android.net.Uri channelUri, android.os.Bundle params) { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  void startRecording(android.net.Uri programUri) { throw new RuntimeException("Stub!"); }
public  void stopRecording() { throw new RuntimeException("Stub!"); }
public  void sendAppPrivateCommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
}
