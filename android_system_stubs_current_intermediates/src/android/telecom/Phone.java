/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.telecom;
@java.lang.Deprecated()
public final class Phone
{
public abstract static class Listener
{
public  Listener() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onAudioStateChanged(android.telecom.Phone phone, android.telecom.AudioState audioState) { throw new RuntimeException("Stub!"); }
public  void onCallAudioStateChanged(android.telecom.Phone phone, android.telecom.CallAudioState callAudioState) { throw new RuntimeException("Stub!"); }
public  void onBringToForeground(android.telecom.Phone phone, boolean showDialpad) { throw new RuntimeException("Stub!"); }
public  void onCallAdded(android.telecom.Phone phone, android.telecom.Call call) { throw new RuntimeException("Stub!"); }
public  void onCallRemoved(android.telecom.Phone phone, android.telecom.Call call) { throw new RuntimeException("Stub!"); }
public  void onCanAddCallChanged(android.telecom.Phone phone, boolean canAddCall) { throw new RuntimeException("Stub!"); }
public  void onSilenceRinger(android.telecom.Phone phone) { throw new RuntimeException("Stub!"); }
}
Phone() { throw new RuntimeException("Stub!"); }
public  void addListener(android.telecom.Phone.Listener listener) { throw new RuntimeException("Stub!"); }
public  void removeListener(android.telecom.Phone.Listener listener) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telecom.Call> getCalls() { throw new RuntimeException("Stub!"); }
public  boolean canAddCall() { throw new RuntimeException("Stub!"); }
public  void setMuted(boolean state) { throw new RuntimeException("Stub!"); }
public  void setAudioRoute(int route) { throw new RuntimeException("Stub!"); }
public  void requestBluetoothAudio(java.lang.String bluetoothAddress) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.telecom.AudioState getAudioState() { throw new RuntimeException("Stub!"); }
public  android.telecom.CallAudioState getCallAudioState() { throw new RuntimeException("Stub!"); }
}
