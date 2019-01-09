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

package android.hardware.camera2;
public final class CameraManager
{
public abstract static class AvailabilityCallback
{
public  AvailabilityCallback() { throw new RuntimeException("Stub!"); }
public  void onCameraAvailable(java.lang.String cameraId) { throw new RuntimeException("Stub!"); }
public  void onCameraUnavailable(java.lang.String cameraId) { throw new RuntimeException("Stub!"); }
}
public abstract static class TorchCallback
{
public  TorchCallback() { throw new RuntimeException("Stub!"); }
public  void onTorchModeUnavailable(java.lang.String cameraId) { throw new RuntimeException("Stub!"); }
public  void onTorchModeChanged(java.lang.String cameraId, boolean enabled) { throw new RuntimeException("Stub!"); }
}
CameraManager() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getCameraIdList() throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public  void registerAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void registerAvailabilityCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback callback) { throw new RuntimeException("Stub!"); }
public  void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback callback) { throw new RuntimeException("Stub!"); }
public  void registerTorchCallback(android.hardware.camera2.CameraManager.TorchCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void registerTorchCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.TorchCallback callback) { throw new RuntimeException("Stub!"); }
public  void unregisterTorchCallback(android.hardware.camera2.CameraManager.TorchCallback callback) { throw new RuntimeException("Stub!"); }
public  android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String cameraId) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public  void openCamera(java.lang.String cameraId, android.hardware.camera2.CameraDevice.StateCallback callback, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public  void openCamera(java.lang.String cameraId, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback callback) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public  void setTorchMode(java.lang.String cameraId, boolean enabled) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
}
