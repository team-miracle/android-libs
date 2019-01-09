/*
* Copyright (C) 2007 The Android Open Source Project
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
public class SoundPool
{
public static interface OnLoadCompleteListener
{
public abstract  void onLoadComplete(android.media.SoundPool soundPool, int sampleId, int status);
}
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.media.SoundPool.Builder setMaxStreams(int maxStreams) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.SoundPool.Builder setAudioAttributes(android.media.AudioAttributes attributes) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.SoundPool build() { throw new RuntimeException("Stub!"); }
}
@Deprecated
public  SoundPool(int maxStreams, int streamType, int srcQuality) { throw new RuntimeException("Stub!"); }
public final  void release() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  int load(java.lang.String path, int priority) { throw new RuntimeException("Stub!"); }
public  int load(android.content.Context context, int resId, int priority) { throw new RuntimeException("Stub!"); }
public  int load(android.content.res.AssetFileDescriptor afd, int priority) { throw new RuntimeException("Stub!"); }
public  int load(java.io.FileDescriptor fd, long offset, long length, int priority) { throw new RuntimeException("Stub!"); }
public final native  boolean unload(int soundID);
public final  int play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate) { throw new RuntimeException("Stub!"); }
public final native  void pause(int streamID);
public final native  void resume(int streamID);
public final native  void autoPause();
public final native  void autoResume();
public final native  void stop(int streamID);
public final  void setVolume(int streamID, float leftVolume, float rightVolume) { throw new RuntimeException("Stub!"); }
public final native  void setPriority(int streamID, int priority);
public final native  void setLoop(int streamID, int loop);
public final native  void setRate(int streamID, float rate);
public  void setOnLoadCompleteListener(android.media.SoundPool.OnLoadCompleteListener listener) { throw new RuntimeException("Stub!"); }
}
