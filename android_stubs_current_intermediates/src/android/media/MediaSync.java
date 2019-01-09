/*
* Copyright (C) 2015 The Android Open Source Project
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

package android.media;
public final class MediaSync
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public abstract  void onAudioBufferConsumed(android.media.MediaSync sync, java.nio.ByteBuffer audioBuffer, int bufferId);
}
public static interface OnErrorListener
{
public abstract  void onError(android.media.MediaSync sync, int what, int extra);
}
public  MediaSync() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  void setCallback(android.media.MediaSync.Callback cb, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setOnErrorListener(android.media.MediaSync.OnErrorListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public  void setAudioTrack(android.media.AudioTrack audioTrack) { throw new RuntimeException("Stub!"); }
public native  android.view.Surface createInputSurface();
public  void setPlaybackParams(android.media.PlaybackParams params) { throw new RuntimeException("Stub!"); }
public native  android.media.PlaybackParams getPlaybackParams();
public  void setSyncParams(android.media.SyncParams params) { throw new RuntimeException("Stub!"); }
public native  android.media.SyncParams getSyncParams();
public  void flush() { throw new RuntimeException("Stub!"); }
public  android.media.MediaTimestamp getTimestamp() { throw new RuntimeException("Stub!"); }
public  void queueAudio(java.nio.ByteBuffer audioData, int bufferId, long presentationTimeUs) { throw new RuntimeException("Stub!"); }
public static final int MEDIASYNC_ERROR_AUDIOTRACK_FAIL = 1;
public static final int MEDIASYNC_ERROR_SURFACE_FAIL = 2;
}
