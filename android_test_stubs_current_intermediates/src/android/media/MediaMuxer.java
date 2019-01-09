/*
* Copyright (C) 2013 The Android Open Source Project
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
public final class MediaMuxer
{
public static final class OutputFormat
{
OutputFormat() { throw new RuntimeException("Stub!"); }
public static final int MUXER_OUTPUT_3GPP = 2;
public static final int MUXER_OUTPUT_HEIF = 3;
public static final int MUXER_OUTPUT_MPEG_4 = 0;
public static final int MUXER_OUTPUT_WEBM = 1;
}
public  MediaMuxer(java.lang.String path, int format) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  MediaMuxer(java.io.FileDescriptor fd, int format) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setOrientationHint(int degrees) { throw new RuntimeException("Stub!"); }
public  void setLocation(float latitude, float longitude) { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public  void stop() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  int addTrack(android.media.MediaFormat format) { throw new RuntimeException("Stub!"); }
public  void writeSampleData(int trackIndex, java.nio.ByteBuffer byteBuf, android.media.MediaCodec.BufferInfo bufferInfo) { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
}
