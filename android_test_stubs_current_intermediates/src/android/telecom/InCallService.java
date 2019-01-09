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
public abstract class InCallService
  extends android.app.Service
{
public abstract static class VideoCall
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public abstract  void onSessionModifyRequestReceived(android.telecom.VideoProfile videoProfile);
public abstract  void onSessionModifyResponseReceived(int status, android.telecom.VideoProfile requestedProfile, android.telecom.VideoProfile responseProfile);
public abstract  void onCallSessionEvent(int event);
public abstract  void onPeerDimensionsChanged(int width, int height);
public abstract  void onVideoQualityChanged(int videoQuality);
public abstract  void onCallDataUsageChanged(long dataUsage);
public abstract  void onCameraCapabilitiesChanged(android.telecom.VideoProfile.CameraCapabilities cameraCapabilities);
}
public  VideoCall() { throw new RuntimeException("Stub!"); }
public abstract  void registerCallback(android.telecom.InCallService.VideoCall.Callback callback);
public abstract  void registerCallback(android.telecom.InCallService.VideoCall.Callback callback, android.os.Handler handler);
public abstract  void unregisterCallback(android.telecom.InCallService.VideoCall.Callback callback);
public abstract  void setCamera(java.lang.String cameraId);
public abstract  void setPreviewSurface(android.view.Surface surface);
public abstract  void setDisplaySurface(android.view.Surface surface);
public abstract  void setDeviceOrientation(int rotation);
public abstract  void setZoom(float value);
public abstract  void sendSessionModifyRequest(android.telecom.VideoProfile requestProfile);
public abstract  void sendSessionModifyResponse(android.telecom.VideoProfile responseProfile);
public abstract  void requestCameraCapabilities();
public abstract  void requestCallDataUsage();
public abstract  void setPauseImage(android.net.Uri uri);
}
public  InCallService() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  boolean onUnbind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public final  java.util.List<android.telecom.Call> getCalls() { throw new RuntimeException("Stub!"); }
public final  boolean canAddCall() { throw new RuntimeException("Stub!"); }
public final  android.telecom.CallAudioState getCallAudioState() { throw new RuntimeException("Stub!"); }
public final  void setMuted(boolean state) { throw new RuntimeException("Stub!"); }
public final  void setAudioRoute(int route) { throw new RuntimeException("Stub!"); }
public final  void requestBluetoothAudio(android.bluetooth.BluetoothDevice bluetoothDevice) { throw new RuntimeException("Stub!"); }
public  void onCallAudioStateChanged(android.telecom.CallAudioState audioState) { throw new RuntimeException("Stub!"); }
public  void onBringToForeground(boolean showDialpad) { throw new RuntimeException("Stub!"); }
public  void onCallAdded(android.telecom.Call call) { throw new RuntimeException("Stub!"); }
public  void onCallRemoved(android.telecom.Call call) { throw new RuntimeException("Stub!"); }
public  void onCanAddCallChanged(boolean canAddCall) { throw new RuntimeException("Stub!"); }
public  void onSilenceRinger() { throw new RuntimeException("Stub!"); }
public  void onConnectionEvent(android.telecom.Call call, java.lang.String event, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.telecom.InCallService";
}
