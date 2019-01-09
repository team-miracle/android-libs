/*
* Copyright (C) 2012 The Android Open Source Project
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
public final class MediaExtractor
{
public static final class CasInfo
{
CasInfo() { throw new RuntimeException("Stub!"); }
public  int getSystemId() { throw new RuntimeException("Stub!"); }
public  android.media.MediaCas.Session getSession() { throw new RuntimeException("Stub!"); }
}
public static final class MetricsConstants
{
MetricsConstants() { throw new RuntimeException("Stub!"); }
public static final java.lang.String FORMAT = "android.media.mediaextractor.fmt";
public static final java.lang.String MIME_TYPE = "android.media.mediaextractor.mime";
public static final java.lang.String TRACKS = "android.media.mediaextractor.ntrk";
}
public  MediaExtractor() { throw new RuntimeException("Stub!"); }
public native  void setDataSource(android.media.MediaDataSource dataSource) throws java.io.IOException;
public  void setDataSource(android.content.Context context, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> headers) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setDataSource(java.lang.String path, java.util.Map<java.lang.String, java.lang.String> headers) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setDataSource(java.lang.String path) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setDataSource(android.content.res.AssetFileDescriptor afd) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  void setDataSource(java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public native  void setDataSource(java.io.FileDescriptor fd, long offset, long length) throws java.io.IOException;
public  void setMediaCas(android.media.MediaCas mediaCas) { throw new RuntimeException("Stub!"); }
public  android.media.MediaExtractor.CasInfo getCasInfo(int index) { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public native  void release();
public native  int getTrackCount();
public  android.media.DrmInitData getDrmInitData() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.media.AudioPresentation> getAudioPresentations(int trackIndex) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.util.UUID, byte[]> getPsshInfo() { throw new RuntimeException("Stub!"); }
public  android.media.MediaFormat getTrackFormat(int index) { throw new RuntimeException("Stub!"); }
public native  void selectTrack(int index);
public native  void unselectTrack(int index);
public native  void seekTo(long timeUs, int mode);
public native  boolean advance();
public native  int readSampleData(java.nio.ByteBuffer byteBuf, int offset);
public native  int getSampleTrackIndex();
public native  long getSampleTime();
public native  long getSampleSize();
public native  int getSampleFlags();
public native  boolean getSampleCryptoInfo(android.media.MediaCodec.CryptoInfo info);
public native  long getCachedDuration();
public native  boolean hasCacheReachedEndOfStream();
public  android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
public static final int SAMPLE_FLAG_ENCRYPTED = 2;
public static final int SAMPLE_FLAG_PARTIAL_FRAME = 4;
public static final int SAMPLE_FLAG_SYNC = 1;
public static final int SEEK_TO_CLOSEST_SYNC = 2;
public static final int SEEK_TO_NEXT_SYNC = 1;
public static final int SEEK_TO_PREVIOUS_SYNC = 0;
}
