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
public class TvView
  extends android.view.ViewGroup
{
public abstract static class TimeShiftPositionCallback
{
public  TimeShiftPositionCallback() { throw new RuntimeException("Stub!"); }
public  void onTimeShiftStartPositionChanged(java.lang.String inputId, long timeMs) { throw new RuntimeException("Stub!"); }
public  void onTimeShiftCurrentPositionChanged(java.lang.String inputId, long timeMs) { throw new RuntimeException("Stub!"); }
}
public abstract static class TvInputCallback
{
public  TvInputCallback() { throw new RuntimeException("Stub!"); }
public  void onConnectionFailed(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void onDisconnected(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void onChannelRetuned(java.lang.String inputId, android.net.Uri channelUri) { throw new RuntimeException("Stub!"); }
public  void onTracksChanged(java.lang.String inputId, java.util.List<android.media.tv.TvTrackInfo> tracks) { throw new RuntimeException("Stub!"); }
public  void onTrackSelected(java.lang.String inputId, int type, java.lang.String trackId) { throw new RuntimeException("Stub!"); }
public  void onVideoSizeChanged(java.lang.String inputId, int width, int height) { throw new RuntimeException("Stub!"); }
public  void onVideoAvailable(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void onVideoUnavailable(java.lang.String inputId, int reason) { throw new RuntimeException("Stub!"); }
public  void onContentAllowed(java.lang.String inputId) { throw new RuntimeException("Stub!"); }
public  void onContentBlocked(java.lang.String inputId, android.media.tv.TvContentRating rating) { throw new RuntimeException("Stub!"); }
public  void onTimeShiftStatusChanged(java.lang.String inputId, int status) { throw new RuntimeException("Stub!"); }
}
public static interface OnUnhandledInputEventListener
{
public abstract  boolean onUnhandledInputEvent(android.view.InputEvent event);
}
public  TvView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  TvView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  TvView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setCallback(android.media.tv.TvView.TvInputCallback callback) { throw new RuntimeException("Stub!"); }
public  void setZOrderMediaOverlay(boolean isMediaOverlay) { throw new RuntimeException("Stub!"); }
public  void setZOrderOnTop(boolean onTop) { throw new RuntimeException("Stub!"); }
public  void setStreamVolume(float volume) { throw new RuntimeException("Stub!"); }
public  void tune(java.lang.String inputId, android.net.Uri channelUri) { throw new RuntimeException("Stub!"); }
public  void tune(java.lang.String inputId, android.net.Uri channelUri, android.os.Bundle params) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void setCaptionEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void selectTrack(int type, java.lang.String trackId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.tv.TvTrackInfo> getTracks(int type) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSelectedTrack(int type) { throw new RuntimeException("Stub!"); }
public  void timeShiftPlay(java.lang.String inputId, android.net.Uri recordedProgramUri) { throw new RuntimeException("Stub!"); }
public  void timeShiftPause() { throw new RuntimeException("Stub!"); }
public  void timeShiftResume() { throw new RuntimeException("Stub!"); }
public  void timeShiftSeekTo(long timeMs) { throw new RuntimeException("Stub!"); }
public  void timeShiftSetPlaybackParams(android.media.PlaybackParams params) { throw new RuntimeException("Stub!"); }
public  void setTimeShiftPositionCallback(android.media.tv.TvView.TimeShiftPositionCallback callback) { throw new RuntimeException("Stub!"); }
public  void sendAppPrivateCommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
public  boolean dispatchUnhandledInputEvent(android.view.InputEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onUnhandledInputEvent(android.view.InputEvent event) { throw new RuntimeException("Stub!"); }
public  void setOnUnhandledInputEventListener(android.media.tv.TvView.OnUnhandledInputEventListener listener) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchGenericMotionEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
public  boolean gatherTransparentRegion(android.graphics.Region region) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected  void onVisibilityChanged(android.view.View changedView, int visibility) { throw new RuntimeException("Stub!"); }
}
