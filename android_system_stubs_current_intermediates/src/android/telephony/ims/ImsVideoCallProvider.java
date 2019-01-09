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
* limitations under the License
*/

package android.telephony.ims;
public abstract class ImsVideoCallProvider
{
public  ImsVideoCallProvider() { throw new RuntimeException("Stub!"); }
public abstract  void onSetCamera(java.lang.String cameraId);
public  void onSetCamera(java.lang.String cameraId, int uid) { throw new RuntimeException("Stub!"); }
public abstract  void onSetPreviewSurface(android.view.Surface surface);
public abstract  void onSetDisplaySurface(android.view.Surface surface);
public abstract  void onSetDeviceOrientation(int rotation);
public abstract  void onSetZoom(float value);
public abstract  void onSendSessionModifyRequest(android.telecom.VideoProfile fromProfile, android.telecom.VideoProfile toProfile);
public abstract  void onSendSessionModifyResponse(android.telecom.VideoProfile responseProfile);
public abstract  void onRequestCameraCapabilities();
public abstract  void onRequestCallDataUsage();
public abstract  void onSetPauseImage(android.net.Uri uri);
public  void receiveSessionModifyRequest(android.telecom.VideoProfile VideoProfile) { throw new RuntimeException("Stub!"); }
public  void receiveSessionModifyResponse(int status, android.telecom.VideoProfile requestedProfile, android.telecom.VideoProfile responseProfile) { throw new RuntimeException("Stub!"); }
public  void handleCallSessionEvent(int event) { throw new RuntimeException("Stub!"); }
public  void changePeerDimensions(int width, int height) { throw new RuntimeException("Stub!"); }
public  void changeCallDataUsage(long dataUsage) { throw new RuntimeException("Stub!"); }
public  void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities CameraCapabilities) { throw new RuntimeException("Stub!"); }
public  void changeVideoQuality(int videoQuality) { throw new RuntimeException("Stub!"); }
}
