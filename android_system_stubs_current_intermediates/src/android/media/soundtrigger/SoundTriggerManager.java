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
public final class SoundTriggerManager
{
public static class Model
{
Model() { throw new RuntimeException("Stub!"); }
public static  android.media.soundtrigger.SoundTriggerManager.Model create(java.util.UUID modelUuid, java.util.UUID vendorUuid, byte[] data) { throw new RuntimeException("Stub!"); }
public  java.util.UUID getModelUuid() { throw new RuntimeException("Stub!"); }
public  java.util.UUID getVendorUuid() { throw new RuntimeException("Stub!"); }
public  byte[] getModelData() { throw new RuntimeException("Stub!"); }
}
SoundTriggerManager() { throw new RuntimeException("Stub!"); }
public  void updateModel(android.media.soundtrigger.SoundTriggerManager.Model model) { throw new RuntimeException("Stub!"); }
public  android.media.soundtrigger.SoundTriggerManager.Model getModel(java.util.UUID soundModelId) { throw new RuntimeException("Stub!"); }
public  void deleteModel(java.util.UUID soundModelId) { throw new RuntimeException("Stub!"); }
public  android.media.soundtrigger.SoundTriggerDetector createSoundTriggerDetector(java.util.UUID soundModelId, android.media.soundtrigger.SoundTriggerDetector.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  int getDetectionServiceOperationsTimeout() { throw new RuntimeException("Stub!"); }
}
