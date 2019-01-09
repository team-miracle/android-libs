/*
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

package android.hardware.camera2;
public abstract class CameraCaptureSession
  implements java.lang.AutoCloseable
{
public abstract static class StateCallback
{
public  StateCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onConfigured(android.hardware.camera2.CameraCaptureSession session);
public abstract  void onConfigureFailed(android.hardware.camera2.CameraCaptureSession session);
public  void onReady(android.hardware.camera2.CameraCaptureSession session) { throw new RuntimeException("Stub!"); }
public  void onActive(android.hardware.camera2.CameraCaptureSession session) { throw new RuntimeException("Stub!"); }
public  void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession session) { throw new RuntimeException("Stub!"); }
public  void onClosed(android.hardware.camera2.CameraCaptureSession session) { throw new RuntimeException("Stub!"); }
public  void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession session, android.view.Surface surface) { throw new RuntimeException("Stub!"); }
}
public abstract static class CaptureCallback
{
public  CaptureCallback() { throw new RuntimeException("Stub!"); }
public  void onCaptureStarted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, long timestamp, long frameNumber) { throw new RuntimeException("Stub!"); }
public  void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureResult partialResult) { throw new RuntimeException("Stub!"); }
public  void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) { throw new RuntimeException("Stub!"); }
public  void onCaptureFailed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureFailure failure) { throw new RuntimeException("Stub!"); }
public  void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession session, int sequenceId, long frameNumber) { throw new RuntimeException("Stub!"); }
public  void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession session, int sequenceId) { throw new RuntimeException("Stub!"); }
public  void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.view.Surface target, long frameNumber) { throw new RuntimeException("Stub!"); }
}
public  CameraCaptureSession() { throw new RuntimeException("Stub!"); }
public abstract  android.hardware.camera2.CameraDevice getDevice();
public abstract  void prepare(android.view.Surface surface) throws android.hardware.camera2.CameraAccessException;
public abstract  void finalizeOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> outputConfigs) throws android.hardware.camera2.CameraAccessException;
public abstract  int capture(android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public  int captureSingleRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public abstract  int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> requests, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public  int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public abstract  int setRepeatingRequest(android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public  int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public abstract  int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> requests, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException;
public  int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public abstract  void stopRepeating() throws android.hardware.camera2.CameraAccessException;
public abstract  void abortCaptures() throws android.hardware.camera2.CameraAccessException;
public abstract  boolean isReprocessable();
public abstract  android.view.Surface getInputSurface();
public  void updateOutputConfiguration(android.hardware.camera2.params.OutputConfiguration config) throws android.hardware.camera2.CameraAccessException { throw new RuntimeException("Stub!"); }
public abstract  void close();
}
