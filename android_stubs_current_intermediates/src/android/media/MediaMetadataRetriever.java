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
public class MediaMetadataRetriever
{
public static final class BitmapParams
{
public  BitmapParams() { throw new RuntimeException("Stub!"); }
public  void setPreferredConfig(android.graphics.Bitmap.Config config) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap.Config getPreferredConfig() { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap.Config getActualConfig() { throw new RuntimeException("Stub!"); }
}
public  MediaMetadataRetriever() { throw new RuntimeException("Stub!"); }
public  void setDataSource(java.lang.String path) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  void setDataSource(java.lang.String uri, java.util.Map<java.lang.String, java.lang.String> headers) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public native  void setDataSource(java.io.FileDescriptor fd, long offset, long length) throws java.lang.IllegalArgumentException;
public  void setDataSource(java.io.FileDescriptor fd) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  void setDataSource(android.content.Context context, android.net.Uri uri) throws java.lang.IllegalArgumentException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  void setDataSource(android.media.MediaDataSource dataSource) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public native  java.lang.String extractMetadata(int keyCode);
public  android.graphics.Bitmap getFrameAtTime(long timeUs, int option) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getScaledFrameAtTime(long timeUs, int option, int dstWidth, int dstHeight) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getFrameAtTime(long timeUs) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getFrameAtTime() { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getFrameAtIndex(int frameIndex, android.media.MediaMetadataRetriever.BitmapParams params) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getFrameAtIndex(int frameIndex) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.graphics.Bitmap> getFramesAtIndex(int frameIndex, int numFrames, android.media.MediaMetadataRetriever.BitmapParams params) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.graphics.Bitmap> getFramesAtIndex(int frameIndex, int numFrames) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getImageAtIndex(int imageIndex, android.media.MediaMetadataRetriever.BitmapParams params) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getImageAtIndex(int imageIndex) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getPrimaryImage(android.media.MediaMetadataRetriever.BitmapParams params) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getPrimaryImage() { throw new RuntimeException("Stub!"); }
public  byte[] getEmbeddedPicture() { throw new RuntimeException("Stub!"); }
public native  void release();
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int METADATA_KEY_ALBUM = 1;
public static final int METADATA_KEY_ALBUMARTIST = 13;
public static final int METADATA_KEY_ARTIST = 2;
public static final int METADATA_KEY_AUTHOR = 3;
public static final int METADATA_KEY_BITRATE = 20;
public static final int METADATA_KEY_CAPTURE_FRAMERATE = 25;
public static final int METADATA_KEY_CD_TRACK_NUMBER = 0;
public static final int METADATA_KEY_COMPILATION = 15;
public static final int METADATA_KEY_COMPOSER = 4;
public static final int METADATA_KEY_DATE = 5;
public static final int METADATA_KEY_DISC_NUMBER = 14;
public static final int METADATA_KEY_DURATION = 9;
public static final int METADATA_KEY_GENRE = 6;
public static final int METADATA_KEY_HAS_AUDIO = 16;
public static final int METADATA_KEY_HAS_IMAGE = 26;
public static final int METADATA_KEY_HAS_VIDEO = 17;
public static final int METADATA_KEY_IMAGE_COUNT = 27;
public static final int METADATA_KEY_IMAGE_HEIGHT = 30;
public static final int METADATA_KEY_IMAGE_PRIMARY = 28;
public static final int METADATA_KEY_IMAGE_ROTATION = 31;
public static final int METADATA_KEY_IMAGE_WIDTH = 29;
public static final int METADATA_KEY_LOCATION = 23;
public static final int METADATA_KEY_MIMETYPE = 12;
public static final int METADATA_KEY_NUM_TRACKS = 10;
public static final int METADATA_KEY_TITLE = 7;
public static final int METADATA_KEY_VIDEO_FRAME_COUNT = 32;
public static final int METADATA_KEY_VIDEO_HEIGHT = 19;
public static final int METADATA_KEY_VIDEO_ROTATION = 24;
public static final int METADATA_KEY_VIDEO_WIDTH = 18;
public static final int METADATA_KEY_WRITER = 11;
public static final int METADATA_KEY_YEAR = 8;
public static final int OPTION_CLOSEST = 3;
public static final int OPTION_CLOSEST_SYNC = 2;
public static final int OPTION_NEXT_SYNC = 1;
public static final int OPTION_PREVIOUS_SYNC = 0;
}
