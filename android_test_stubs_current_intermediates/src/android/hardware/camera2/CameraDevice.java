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
public abstract class CameraDevice
  implements java.lang.AutoCloseable
{
public abstract static class StateCallback
{
public  StateCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onOpened(android.hardware.camera2.CameraDevice camera);
public  void onClosed(android.hardware.camera2.CameraDevice camera) { throw new RuntimeException("Stub!"); }
public abstract  void onDisconnected(android.hardware.camera2.CameraDevice camera);
public abstract  void onError(android.hardware.camera2.CameraDevice camera, int error);
public static final int ERROR_CAMERA_DEVICE = 4;
public static final int ERROR_CAMERA_DISABLED = 3;
public static final int ERROR_CAMERA_IN_USE = 1;
public static final int ERROR_CAMERA_SERVICE = 5;
public static final int ERROR_MAX_CAMERAS_IN_USE = 2;
}
CameraDevice() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getId();
public abstract  void createCaptureSession(java.util.List<android.view.Surface> outputs, android.hardware.camera2.CameraCaptureSession.StateCallback callback, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public abstract  void createCaptureSessionByOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> outputConfigurations, android.hardware.camera2.CameraCaptureSession.StateCallback callback, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public abstract  void createReprocessableCaptureSession(android.hardware.camera2.params.InputConfiguration inputConfig, java.util.List<android.view.Surface> outputs, android.hardware.camera2.CameraCaptureSession.StateCallback callback, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public abstract  void createReprocessableCaptureSessionByConfigurations(android.hardware.camera2.params.InputConfiguration inputConfig, java.util.List<android.hardware.camera2.params.OutputConfiguration> outputs, android.hardware.camera2.CameraCaptureSession.StateCallback callback, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public abstract  void createConstrainedHighSpeedCaptureSession(java.util.List<android.view.Surface> outputs, android.hardware.camera2.CameraCaptureSession.StateCallback callback, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public abstract  void createCustomCaptureSession(android.hardware.camera2.params.InputConfiguration inputConfig, java.util.List<android.hardware.camera2.params.OutputConfiguration> outputs, int operatingMode, android.hardware.camera2.CameraCaptureSession.StateCallback callback, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public  void createCaptureSession(android.hardware.camera2.params.SessionConfiguration config) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public abstract  android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int templateType) throws android.hardware.camera2.CameraAccessException;
public  android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int templateType, java.util.Set<java.lang.String> physicalCameraIdSet) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public abstract  android.hardware.camera2.CaptureRequest.Builder createReprocessCaptureRequest(android.hardware.camera2.TotalCaptureResult inputResult) throws android.hardware.camera2.CameraAccessException;
public abstract  void close();
public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;
public static final int SESSION_OPERATION_MODE_NORMAL = 0;
public static final int SESSION_OPERATION_MODE_VENDOR_START = 32768;
public static final int TEMPLATE_MANUAL = 6;
public static final int TEMPLATE_PREVIEW = 1;
public static final int TEMPLATE_RECORD = 3;
public static final int TEMPLATE_STILL_CAPTURE = 2;
public static final int TEMPLATE_VIDEO_SNAPSHOT = 4;
public static final int TEMPLATE_ZERO_SHUTTER_LAG = 5;
}
