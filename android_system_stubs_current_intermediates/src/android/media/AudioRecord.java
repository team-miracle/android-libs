/*
* Copyright (C) 2008 The Android Open Source Project
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
public class AudioRecord
  implements android.media.AudioRouting
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.media.AudioRecord.Builder setAudioSource(int source) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.AudioRecord.Builder setAudioAttributes(android.media.AudioAttributes attributes) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.AudioRecord.Builder setAudioFormat(android.media.AudioFormat format) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.AudioRecord.Builder setBufferSizeInBytes(int bufferSizeInBytes) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.AudioRecord.Builder setSessionId(int sessionId) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.AudioRecord build() throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
}
@java.lang.Deprecated()
public static interface OnRoutingChangedListener
  extends android.media.AudioRouting.OnRoutingChangedListener
{
public abstract  void onRoutingChanged(android.media.AudioRecord audioRecord);
default public  void onRoutingChanged(android.media.AudioRouting router) { throw new RuntimeException("Stub!"); }
}
public static interface OnRecordPositionUpdateListener
{
public abstract  void onMarkerReached(android.media.AudioRecord recorder);
public abstract  void onPeriodicNotification(android.media.AudioRecord recorder);
}
public static final class MetricsConstants
{
MetricsConstants() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CHANNELS = "android.media.audiorecord.channels";
public static final java.lang.String ENCODING = "android.media.audiorecord.encoding";
public static final java.lang.String LATENCY = "android.media.audiorecord.latency";
public static final java.lang.String SAMPLERATE = "android.media.audiorecord.samplerate";
public static final java.lang.String SOURCE = "android.media.audiorecord.source";
}
public  AudioRecord(int audioSource, int sampleRateInHz, int channelConfig, int audioFormat, int bufferSizeInBytes) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  AudioRecord(android.media.AudioAttributes attributes, android.media.AudioFormat format, int bufferSizeInBytes, int sessionId) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  int getSampleRate() { throw new RuntimeException("Stub!"); }
public  int getAudioSource() { throw new RuntimeException("Stub!"); }
public  int getAudioFormat() { throw new RuntimeException("Stub!"); }
public  int getChannelConfiguration() { throw new RuntimeException("Stub!"); }
public  android.media.AudioFormat getFormat() { throw new RuntimeException("Stub!"); }
public  int getChannelCount() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  int getRecordingState() { throw new RuntimeException("Stub!"); }
public  int getBufferSizeInFrames() { throw new RuntimeException("Stub!"); }
public  int getNotificationMarkerPosition() { throw new RuntimeException("Stub!"); }
public  int getPositionNotificationPeriod() { throw new RuntimeException("Stub!"); }
public  int getTimestamp(android.media.AudioTimestamp outTimestamp, int timebase) { throw new RuntimeException("Stub!"); }
public static  int getMinBufferSize(int sampleRateInHz, int channelConfig, int audioFormat) { throw new RuntimeException("Stub!"); }
public  int getAudioSessionId() { throw new RuntimeException("Stub!"); }
public  void startRecording() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void startRecording(android.media.MediaSyncEvent syncEvent) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void stop() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int read(byte[] audioData, int offsetInBytes, int sizeInBytes) { throw new RuntimeException("Stub!"); }
public  int read(byte[] audioData, int offsetInBytes, int sizeInBytes, int readMode) { throw new RuntimeException("Stub!"); }
public  int read(short[] audioData, int offsetInShorts, int sizeInShorts) { throw new RuntimeException("Stub!"); }
public  int read(short[] audioData, int offsetInShorts, int sizeInShorts, int readMode) { throw new RuntimeException("Stub!"); }
public  int read(float[] audioData, int offsetInFloats, int sizeInFloats, int readMode) { throw new RuntimeException("Stub!"); }
public  int read(java.nio.ByteBuffer audioBuffer, int sizeInBytes) { throw new RuntimeException("Stub!"); }
public  int read(java.nio.ByteBuffer audioBuffer, int sizeInBytes, int readMode) { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
public  void setRecordPositionUpdateListener(android.media.AudioRecord.OnRecordPositionUpdateListener listener) { throw new RuntimeException("Stub!"); }
public  void setRecordPositionUpdateListener(android.media.AudioRecord.OnRecordPositionUpdateListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  int setNotificationMarkerPosition(int markerInFrames) { throw new RuntimeException("Stub!"); }
public  android.media.AudioDeviceInfo getRoutedDevice() { throw new RuntimeException("Stub!"); }
public  void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void addOnRoutingChangedListener(android.media.AudioRecord.OnRoutingChangedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void removeOnRoutingChangedListener(android.media.AudioRecord.OnRoutingChangedListener listener) { throw new RuntimeException("Stub!"); }
public  int setPositionNotificationPeriod(int periodInFrames) { throw new RuntimeException("Stub!"); }
public  boolean setPreferredDevice(android.media.AudioDeviceInfo deviceInfo) { throw new RuntimeException("Stub!"); }
public  android.media.AudioDeviceInfo getPreferredDevice() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.MicrophoneInfo> getActiveMicrophones() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final int ERROR = -1;
public static final int ERROR_BAD_VALUE = -2;
public static final int ERROR_DEAD_OBJECT = -6;
public static final int ERROR_INVALID_OPERATION = -3;
public static final int READ_BLOCKING = 0;
public static final int READ_NON_BLOCKING = 1;
public static final int RECORDSTATE_RECORDING = 3;
public static final int RECORDSTATE_STOPPED = 1;
public static final int STATE_INITIALIZED = 1;
public static final int STATE_UNINITIALIZED = 0;
public static final int SUCCESS = 0;
}
