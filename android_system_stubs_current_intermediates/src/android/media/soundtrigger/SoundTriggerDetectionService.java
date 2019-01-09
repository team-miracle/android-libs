/*
* Copyright (C) 2018 The Android Open Source Project
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
public abstract class SoundTriggerDetectionService
  extends android.app.Service
{
public  SoundTriggerDetectionService() { throw new RuntimeException("Stub!"); }
public  void onConnected(java.util.UUID uuid, android.os.Bundle params) { throw new RuntimeException("Stub!"); }
public  void onDisconnected(java.util.UUID uuid, android.os.Bundle params) { throw new RuntimeException("Stub!"); }
public  void onGenericRecognitionEvent(java.util.UUID uuid, android.os.Bundle params, int opId, android.hardware.soundtrigger.SoundTrigger.RecognitionEvent event) { throw new RuntimeException("Stub!"); }
public  void onError(java.util.UUID uuid, android.os.Bundle params, int opId, int status) { throw new RuntimeException("Stub!"); }
public abstract  void onStopOperation(java.util.UUID uuid, android.os.Bundle params, int opId);
public final  void operationFinished(java.util.UUID uuid, int opId) { throw new RuntimeException("Stub!"); }
public  boolean onUnbind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
}
