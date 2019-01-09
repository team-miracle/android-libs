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

package android.media.tv;
public abstract class TvInputService
  extends android.app.Service
{
public abstract static class Session
  implements android.view.KeyEvent.Callback
{
public  Session(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void setOverlayViewEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
public  void notifyChannelRetuned(android.net.Uri channelUri) { throw new RuntimeException("Stub!"); }
public  void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> tracks) { throw new RuntimeException("Stub!"); }
public  void notifyTrackSelected(int type, java.lang.String trackId) { throw new RuntimeException("Stub!"); }
public  void notifyVideoAvailable() { throw new RuntimeException("Stub!"); }
public  void notifyVideoUnavailable(int reason) { throw new RuntimeException("Stub!"); }
public  void notifyContentAllowed() { throw new RuntimeException("Stub!"); }
public  void notifyContentBlocked(android.media.tv.TvContentRating rating) { throw new RuntimeException("Stub!"); }
public  void notifyTimeShiftStatusChanged(int status) { throw new RuntimeException("Stub!"); }
public  void layoutSurface(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public abstract  void onRelease();
public abstract  boolean onSetSurface(android.view.Surface surface);
public  void onSurfaceChanged(int format, int width, int height) { throw new RuntimeException("Stub!"); }
public  void onOverlayViewSizeChanged(int width, int height) { throw new RuntimeException("Stub!"); }
public abstract  void onSetStreamVolume(float volume);
public abstract  boolean onTune(android.net.Uri channelUri);
public  boolean onTune(android.net.Uri channelUri, android.os.Bundle params) { throw new RuntimeException("Stub!"); }
public abstract  void onSetCaptionEnabled(boolean enabled);
public  void onUnblockContent(android.media.tv.TvContentRating unblockedRating) { throw new RuntimeException("Stub!"); }
public  boolean onSelectTrack(int type, java.lang.String trackId) { throw new RuntimeException("Stub!"); }
public  void onAppPrivateCommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateOverlayView() { throw new RuntimeException("Stub!"); }
public  void onTimeShiftPlay(android.net.Uri recordedProgramUri) { throw new RuntimeException("Stub!"); }
public  void onTimeShiftPause() { throw new RuntimeException("Stub!"); }
public  void onTimeShiftResume() { throw new RuntimeException("Stub!"); }
public  void onTimeShiftSeekTo(long timeMs) { throw new RuntimeException("Stub!"); }
public  void onTimeShiftSetPlaybackParams(android.media.PlaybackParams params) { throw new RuntimeException("Stub!"); }
public  long onTimeShiftGetStartPosition() { throw new RuntimeException("Stub!"); }
public  long onTimeShiftGetCurrentPosition() { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyLongPress(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int count, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onGenericMotionEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
}
public abstract static class RecordingSession
{
public  RecordingSession(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void notifyTuned(android.net.Uri channelUri) { throw new RuntimeException("Stub!"); }
public  void notifyRecordingStopped(android.net.Uri recordedProgramUri) { throw new RuntimeException("Stub!"); }
public  void notifyError(int error) { throw new RuntimeException("Stub!"); }
public abstract  void onTune(android.net.Uri channelUri);
public  void onTune(android.net.Uri channelUri, android.os.Bundle params) { throw new RuntimeException("Stub!"); }
public abstract  void onStartRecording(android.net.Uri programUri);
public abstract  void onStopRecording();
public abstract  void onRelease();
public  void onAppPrivateCommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
}
public abstract static class HardwareSession
  extends android.media.tv.TvInputService.Session
{
public  HardwareSession(android.content.Context context) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getHardwareInputId();
public final  boolean onSetSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public  void onHardwareVideoAvailable() { throw new RuntimeException("Stub!"); }
public  void onHardwareVideoUnavailable(int reason) { throw new RuntimeException("Stub!"); }
}
public  TvInputService() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  android.media.tv.TvInputService.Session onCreateSession(java.lang.String inputId);
public  android.media.tv.TvInputService.RecordingSession onCreateRecordingSession(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.media.tv.TvInputService";
public static final java.lang.String SERVICE_META_DATA = "android.media.tv.input";
}
