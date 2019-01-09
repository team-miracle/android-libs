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
public class MediaRecorder
  implements android.media.AudioRouting
{
public final class AudioSource
{
AudioSource() { throw new RuntimeException("Stub!"); }
public static final int CAMCORDER = 5;
public static final int DEFAULT = 0;
public static final int MIC = 1;
public static final int REMOTE_SUBMIX = 8;
public static final int UNPROCESSED = 9;
public static final int VOICE_CALL = 4;
public static final int VOICE_COMMUNICATION = 7;
public static final int VOICE_DOWNLINK = 3;
public static final int VOICE_RECOGNITION = 6;
public static final int VOICE_UPLINK = 2;
}
public final class VideoSource
{
VideoSource() { throw new RuntimeException("Stub!"); }
public static final int CAMERA = 1;
public static final int DEFAULT = 0;
public static final int SURFACE = 2;
}
public final class OutputFormat
{
OutputFormat() { throw new RuntimeException("Stub!"); }
public static final int AAC_ADTS = 6;
public static final int AMR_NB = 3;
public static final int AMR_WB = 4;
public static final int DEFAULT = 0;
public static final int MPEG_2_TS = 8;
public static final int MPEG_4 = 2;
@Deprecated
public static final int RAW_AMR = 3;
public static final int THREE_GPP = 1;
public static final int WEBM = 9;
}
public final class AudioEncoder
{
AudioEncoder() { throw new RuntimeException("Stub!"); }
public static final int AAC = 3;
public static final int AAC_ELD = 5;
public static final int AMR_NB = 1;
public static final int AMR_WB = 2;
public static final int DEFAULT = 0;
public static final int HE_AAC = 4;
public static final int VORBIS = 6;
}
public final class VideoEncoder
{
VideoEncoder() { throw new RuntimeException("Stub!"); }
public static final int DEFAULT = 0;
public static final int H263 = 1;
public static final int H264 = 2;
public static final int HEVC = 5;
public static final int MPEG_4_SP = 3;
public static final int VP8 = 4;
}
public static interface OnErrorListener
{
public abstract  void onError(android.media.MediaRecorder mr, int what, int extra);
}
public static interface OnInfoListener
{
public abstract  void onInfo(android.media.MediaRecorder mr, int what, int extra);
}
public static final class MetricsConstants
{
MetricsConstants() { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUDIO_BITRATE = "android.media.mediarecorder.audio-bitrate";
public static final java.lang.String AUDIO_CHANNELS = "android.media.mediarecorder.audio-channels";
public static final java.lang.String AUDIO_SAMPLERATE = "android.media.mediarecorder.audio-samplerate";
public static final java.lang.String AUDIO_TIMESCALE = "android.media.mediarecorder.audio-timescale";
public static final java.lang.String CAPTURE_FPS = "android.media.mediarecorder.capture-fps";
public static final java.lang.String CAPTURE_FPS_ENABLE = "android.media.mediarecorder.capture-fpsenable";
public static final java.lang.String FRAMERATE = "android.media.mediarecorder.frame-rate";
public static final java.lang.String HEIGHT = "android.media.mediarecorder.height";
public static final java.lang.String MOVIE_TIMESCALE = "android.media.mediarecorder.movie-timescale";
public static final java.lang.String ROTATION = "android.media.mediarecorder.rotation";
public static final java.lang.String VIDEO_BITRATE = "android.media.mediarecorder.video-bitrate";
public static final java.lang.String VIDEO_IFRAME_INTERVAL = "android.media.mediarecorder.video-iframe-interval";
public static final java.lang.String VIDEO_LEVEL = "android.media.mediarecorder.video-encoder-level";
public static final java.lang.String VIDEO_PROFILE = "android.media.mediarecorder.video-encoder-profile";
public static final java.lang.String VIDEO_TIMESCALE = "android.media.mediarecorder.video-timescale";
public static final java.lang.String WIDTH = "android.media.mediarecorder.width";
}
public  MediaRecorder() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public native  void setCamera(android.hardware.Camera c);
public native  android.view.Surface getSurface();
public  void setInputSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public  void setPreviewDisplay(android.view.Surface sv) { throw new RuntimeException("Stub!"); }
public native  void setAudioSource(int audio_source) throws java.lang.IllegalStateException;
public static final  int getAudioSourceMax() { throw new RuntimeException("Stub!"); }
public native  void setVideoSource(int video_source) throws java.lang.IllegalStateException;
public  void setProfile(android.media.CamcorderProfile profile) { throw new RuntimeException("Stub!"); }
public  void setCaptureRate(double fps) { throw new RuntimeException("Stub!"); }
public  void setOrientationHint(int degrees) { throw new RuntimeException("Stub!"); }
public  void setLocation(float latitude, float longitude) { throw new RuntimeException("Stub!"); }
public native  void setOutputFormat(int output_format) throws java.lang.IllegalStateException;
public native  void setVideoSize(int width, int height) throws java.lang.IllegalStateException;
public native  void setVideoFrameRate(int rate) throws java.lang.IllegalStateException;
public native  void setMaxDuration(int max_duration_ms) throws java.lang.IllegalArgumentException;
public native  void setMaxFileSize(long max_filesize_bytes) throws java.lang.IllegalArgumentException;
public native  void setAudioEncoder(int audio_encoder) throws java.lang.IllegalStateException;
public native  void setVideoEncoder(int video_encoder) throws java.lang.IllegalStateException;
public  void setAudioSamplingRate(int samplingRate) { throw new RuntimeException("Stub!"); }
public  void setAudioChannels(int numChannels) { throw new RuntimeException("Stub!"); }
public  void setAudioEncodingBitRate(int bitRate) { throw new RuntimeException("Stub!"); }
public  void setVideoEncodingBitRate(int bitRate) { throw new RuntimeException("Stub!"); }
public  void setVideoEncodingProfileLevel(int profile, int level) { throw new RuntimeException("Stub!"); }
public  void setOutputFile(java.io.FileDescriptor fd) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setOutputFile(java.io.File file) { throw new RuntimeException("Stub!"); }
public  void setNextOutputFile(java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setOutputFile(java.lang.String path) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setNextOutputFile(java.io.File file) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void prepare() throws java.lang.IllegalStateException, java.io.IOException { throw new RuntimeException("Stub!"); }
public native  void start() throws java.lang.IllegalStateException;
public native  void stop() throws java.lang.IllegalStateException;
public native  void pause() throws java.lang.IllegalStateException;
public native  void resume() throws java.lang.IllegalStateException;
public  void reset() { throw new RuntimeException("Stub!"); }
public native  int getMaxAmplitude() throws java.lang.IllegalStateException;
public  void setOnErrorListener(android.media.MediaRecorder.OnErrorListener l) { throw new RuntimeException("Stub!"); }
public  void setOnInfoListener(android.media.MediaRecorder.OnInfoListener listener) { throw new RuntimeException("Stub!"); }
public  boolean setPreferredDevice(android.media.AudioDeviceInfo deviceInfo) { throw new RuntimeException("Stub!"); }
public  android.media.AudioDeviceInfo getPreferredDevice() { throw new RuntimeException("Stub!"); }
public  android.media.AudioDeviceInfo getRoutedDevice() { throw new RuntimeException("Stub!"); }
public  void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener listener) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.MicrophoneInfo> getActiveMicrophones() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public native  void release();
public  android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public static final int MEDIA_ERROR_SERVER_DIED = 100;
public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;
public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_APPROACHING = 802;
public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
public static final int MEDIA_RECORDER_INFO_NEXT_OUTPUT_FILE_STARTED = 803;
public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
}
