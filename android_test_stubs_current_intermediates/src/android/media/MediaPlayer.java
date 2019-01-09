/*
* Copyright (C) 2006 The Android Open Source Project
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
public class MediaPlayer
  implements android.media.VolumeAutomation, android.media.AudioRouting
{
public static class TrackInfo
  implements android.os.Parcelable
{
TrackInfo() { throw new RuntimeException("Stub!"); }
public  int getTrackType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLanguage() { throw new RuntimeException("Stub!"); }
public  android.media.MediaFormat getFormat() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int MEDIA_TRACK_TYPE_AUDIO = 2;
public static final int MEDIA_TRACK_TYPE_METADATA = 5;
public static final int MEDIA_TRACK_TYPE_SUBTITLE = 4;
public static final int MEDIA_TRACK_TYPE_TIMEDTEXT = 3;
public static final int MEDIA_TRACK_TYPE_UNKNOWN = 0;
public static final int MEDIA_TRACK_TYPE_VIDEO = 1;
}
public static interface OnPreparedListener
{
public abstract  void onPrepared(android.media.MediaPlayer mp);
}
public static interface OnCompletionListener
{
public abstract  void onCompletion(android.media.MediaPlayer mp);
}
public static interface OnBufferingUpdateListener
{
public abstract  void onBufferingUpdate(android.media.MediaPlayer mp, int percent);
}
public static interface OnSeekCompleteListener
{
public abstract  void onSeekComplete(android.media.MediaPlayer mp);
}
public static interface OnVideoSizeChangedListener
{
public abstract  void onVideoSizeChanged(android.media.MediaPlayer mp, int width, int height);
}
public static interface OnTimedTextListener
{
public abstract  void onTimedText(android.media.MediaPlayer mp, android.media.TimedText text);
}
public static interface OnSubtitleDataListener
{
public abstract  void onSubtitleData(android.media.MediaPlayer mp, android.media.SubtitleData data);
}
public static interface OnMediaTimeDiscontinuityListener
{
public abstract  void onMediaTimeDiscontinuity(android.media.MediaPlayer mp, android.media.MediaTimestamp mts);
}
public static interface OnTimedMetaDataAvailableListener
{
public abstract  void onTimedMetaDataAvailable(android.media.MediaPlayer mp, android.media.TimedMetaData data);
}
public static interface OnErrorListener
{
public abstract  boolean onError(android.media.MediaPlayer mp, int what, int extra);
}
public static interface OnInfoListener
{
public abstract  boolean onInfo(android.media.MediaPlayer mp, int what, int extra);
}
public static interface OnDrmConfigHelper
{
public abstract  void onDrmConfig(android.media.MediaPlayer mp);
}
public static interface OnDrmInfoListener
{
public abstract  void onDrmInfo(android.media.MediaPlayer mp, android.media.MediaPlayer.DrmInfo drmInfo);
}
public static interface OnDrmPreparedListener
{
public abstract  void onDrmPrepared(android.media.MediaPlayer mp, int status);
}
public static final class DrmInfo
{
DrmInfo() { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.util.UUID, byte[]> getPssh() { throw new RuntimeException("Stub!"); }
public  java.util.UUID[] getSupportedSchemes() { throw new RuntimeException("Stub!"); }
}
public static final class NoDrmSchemeException
  extends android.media.MediaDrmException
{
public  NoDrmSchemeException(java.lang.String detailMessage) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
}
public static final class ProvisioningNetworkErrorException
  extends android.media.MediaDrmException
{
public  ProvisioningNetworkErrorException(java.lang.String detailMessage) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
}
public static final class ProvisioningServerErrorException
  extends android.media.MediaDrmException
{
public  ProvisioningServerErrorException(java.lang.String detailMessage) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
}
public static final class MetricsConstants
{
MetricsConstants() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CODEC_AUDIO = "android.media.mediaplayer.audio.codec";
public static final java.lang.String CODEC_VIDEO = "android.media.mediaplayer.video.codec";
public static final java.lang.String DURATION = "android.media.mediaplayer.durationMs";
public static final java.lang.String ERRORS = "android.media.mediaplayer.err";
public static final java.lang.String ERROR_CODE = "android.media.mediaplayer.errcode";
public static final java.lang.String FRAMES = "android.media.mediaplayer.frames";
public static final java.lang.String FRAMES_DROPPED = "android.media.mediaplayer.dropped";
public static final java.lang.String HEIGHT = "android.media.mediaplayer.height";
public static final java.lang.String MIME_TYPE_AUDIO = "android.media.mediaplayer.audio.mime";
public static final java.lang.String MIME_TYPE_VIDEO = "android.media.mediaplayer.video.mime";
public static final java.lang.String PLAYING = "android.media.mediaplayer.playingMs";
public static final java.lang.String WIDTH = "android.media.mediaplayer.width";
}
public  MediaPlayer() { throw new RuntimeException("Stub!"); }
public  void setDisplay(android.view.SurfaceHolder sh) { throw new RuntimeException("Stub!"); }
public  void setSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public  void setVideoScalingMode(int mode) { throw new RuntimeException("Stub!"); }
public static  android.media.MediaPlayer create(android.content.Context context, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  android.media.MediaPlayer create(android.content.Context context, android.net.Uri uri, android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public static  android.media.MediaPlayer create(android.content.Context context, android.net.Uri uri, android.view.SurfaceHolder holder, android.media.AudioAttributes audioAttributes, int audioSessionId) { throw new RuntimeException("Stub!"); }
public static  android.media.MediaPlayer create(android.content.Context context, int resid) { throw new RuntimeException("Stub!"); }
public static  android.media.MediaPlayer create(android.content.Context context, int resid, android.media.AudioAttributes audioAttributes, int audioSessionId) { throw new RuntimeException("Stub!"); }
public  void setDataSource(android.content.Context context, android.net.Uri uri) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setDataSource(android.content.Context context, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> headers, java.util.List<java.net.HttpCookie> cookies) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setDataSource(android.content.Context context, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> headers) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setDataSource(java.lang.String path) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setDataSource(android.content.res.AssetFileDescriptor afd) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setDataSource(java.io.FileDescriptor fd) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setDataSource(java.io.FileDescriptor fd, long offset, long length) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setDataSource(android.media.MediaDataSource dataSource) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void prepare() throws java.io.IOException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public native  void prepareAsync() throws java.lang.IllegalStateException;
public  void start() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void stop() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void pause() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  android.media.VolumeShaper createVolumeShaper(android.media.VolumeShaper.Configuration configuration) { throw new RuntimeException("Stub!"); }
public  boolean setPreferredDevice(android.media.AudioDeviceInfo deviceInfo) { throw new RuntimeException("Stub!"); }
public  android.media.AudioDeviceInfo getPreferredDevice() { throw new RuntimeException("Stub!"); }
public  android.media.AudioDeviceInfo getRoutedDevice() { throw new RuntimeException("Stub!"); }
public  void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener listener) { throw new RuntimeException("Stub!"); }
public  void setWakeMode(android.content.Context context, int mode) { throw new RuntimeException("Stub!"); }
public  void setScreenOnWhilePlaying(boolean screenOn) { throw new RuntimeException("Stub!"); }
public native  int getVideoWidth();
public native  int getVideoHeight();
public  android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
public native  boolean isPlaying();
public native  android.media.BufferingParams getBufferingParams();
public native  void setBufferingParams(android.media.BufferingParams params);
public native  void setPlaybackParams(android.media.PlaybackParams params);
public native  android.media.PlaybackParams getPlaybackParams();
public native  void setSyncParams(android.media.SyncParams params);
public native  android.media.SyncParams getSyncParams();
public  void seekTo(long msec, int mode) { throw new RuntimeException("Stub!"); }
public  void seekTo(int msec) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  android.media.MediaTimestamp getTimestamp() { throw new RuntimeException("Stub!"); }
public native  int getCurrentPosition();
public native  int getDuration();
public native  void setNextMediaPlayer(android.media.MediaPlayer next);
public  void release() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
@Deprecated
public  void setAudioStreamType(int streamtype) { throw new RuntimeException("Stub!"); }
public  void setAudioAttributes(android.media.AudioAttributes attributes) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public native  void setLooping(boolean looping);
public native  boolean isLooping();
public  void setVolume(float leftVolume, float rightVolume) { throw new RuntimeException("Stub!"); }
public native  void setAudioSessionId(int sessionId) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public native  int getAudioSessionId();
public native  void attachAuxEffect(int effectId);
public  void setAuxEffectSendLevel(float level) { throw new RuntimeException("Stub!"); }
public  android.media.MediaPlayer.TrackInfo[] getTrackInfo() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void addTimedTextSource(java.lang.String path, java.lang.String mimeType) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void addTimedTextSource(android.content.Context context, android.net.Uri uri, java.lang.String mimeType) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void addTimedTextSource(java.io.FileDescriptor fd, java.lang.String mimeType) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void addTimedTextSource(java.io.FileDescriptor fd, long offset, long length, java.lang.String mime) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getSelectedTrack(int trackType) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void selectTrack(int index) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void deselectTrack(int index) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnBufferingUpdateListener(android.media.MediaPlayer.OnBufferingUpdateListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnVideoSizeChangedListener(android.media.MediaPlayer.OnVideoSizeChangedListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnTimedTextListener(android.media.MediaPlayer.OnTimedTextListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnSubtitleDataListener(android.media.MediaPlayer.OnSubtitleDataListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setOnSubtitleDataListener(android.media.MediaPlayer.OnSubtitleDataListener listener) { throw new RuntimeException("Stub!"); }
public  void clearOnSubtitleDataListener() { throw new RuntimeException("Stub!"); }
public  void setOnMediaTimeDiscontinuityListener(android.media.MediaPlayer.OnMediaTimeDiscontinuityListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setOnMediaTimeDiscontinuityListener(android.media.MediaPlayer.OnMediaTimeDiscontinuityListener listener) { throw new RuntimeException("Stub!"); }
public  void clearOnMediaTimeDiscontinuityListener() { throw new RuntimeException("Stub!"); }
public  void setOnTimedMetaDataAvailableListener(android.media.MediaPlayer.OnTimedMetaDataAvailableListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnErrorListener(android.media.MediaPlayer.OnErrorListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnInfoListener(android.media.MediaPlayer.OnInfoListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnDrmConfigHelper(android.media.MediaPlayer.OnDrmConfigHelper listener) { throw new RuntimeException("Stub!"); }
public  void setOnDrmInfoListener(android.media.MediaPlayer.OnDrmInfoListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnDrmInfoListener(android.media.MediaPlayer.OnDrmInfoListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setOnDrmPreparedListener(android.media.MediaPlayer.OnDrmPreparedListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnDrmPreparedListener(android.media.MediaPlayer.OnDrmPreparedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.media.MediaPlayer.DrmInfo getDrmInfo() { throw new RuntimeException("Stub!"); }
public  void prepareDrm(java.util.UUID uuid) throws android.media.UnsupportedSchemeException, android.media.ResourceBusyException, android.media.MediaPlayer.ProvisioningNetworkErrorException, android.media.MediaPlayer.ProvisioningServerErrorException { throw new RuntimeException("Stub!"); }
public  void releaseDrm() throws android.media.MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
public  android.media.MediaDrm.KeyRequest getKeyRequest(byte[] keySetId, byte[] initData, java.lang.String mimeType, int keyType, java.util.Map<java.lang.String, java.lang.String> optionalParameters) throws android.media.MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
public  byte[] provideKeyResponse(byte[] keySetId, byte[] response) throws android.media.MediaPlayer.NoDrmSchemeException, android.media.DeniedByServerException { throw new RuntimeException("Stub!"); }
public  void restoreKeys(byte[] keySetId) throws android.media.MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
public  java.lang.String getDrmPropertyString(java.lang.String propertyName) throws android.media.MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
public  void setDrmPropertyString(java.lang.String propertyName, java.lang.String value) throws android.media.MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
public static final int MEDIA_ERROR_IO = -1004;
public static final int MEDIA_ERROR_MALFORMED = -1007;
public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
public static final int MEDIA_ERROR_SERVER_DIED = 100;
public static final int MEDIA_ERROR_TIMED_OUT = -110;
public static final int MEDIA_ERROR_UNKNOWN = 1;
public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
public static final int MEDIA_INFO_AUDIO_NOT_PLAYING = 804;
public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
public static final int MEDIA_INFO_BUFFERING_END = 702;
public static final int MEDIA_INFO_BUFFERING_START = 701;
public static final int MEDIA_INFO_METADATA_UPDATE = 802;
public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
public static final int MEDIA_INFO_UNKNOWN = 1;
public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
public static final int MEDIA_INFO_VIDEO_NOT_PLAYING = 805;
public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
@Deprecated
public static final java.lang.String MEDIA_MIMETYPE_TEXT_SUBRIP = "application/x-subrip";
public static final int PREPARE_DRM_STATUS_PREPARATION_ERROR = 3;
public static final int PREPARE_DRM_STATUS_PROVISIONING_NETWORK_ERROR = 1;
public static final int PREPARE_DRM_STATUS_PROVISIONING_SERVER_ERROR = 2;
public static final int PREPARE_DRM_STATUS_SUCCESS = 0;
public static final int SEEK_CLOSEST = 3;
public static final int SEEK_CLOSEST_SYNC = 2;
public static final int SEEK_NEXT_SYNC = 1;
public static final int SEEK_PREVIOUS_SYNC = 0;
public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
}
