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
public final class MediaCodec
{
public static final class BufferInfo
{
public  BufferInfo() { throw new RuntimeException("Stub!"); }
public  void set(int newOffset, int newSize, long newTimeUs, int newFlags) { throw new RuntimeException("Stub!"); }
public int flags;
public int offset;
public long presentationTimeUs;
public int size;
}
public static final class CodecException
  extends java.lang.IllegalStateException
{
CodecException() { throw new RuntimeException("Stub!"); }
public  boolean isTransient() { throw new RuntimeException("Stub!"); }
public  boolean isRecoverable() { throw new RuntimeException("Stub!"); }
public  int getErrorCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDiagnosticInfo() { throw new RuntimeException("Stub!"); }
public static final int ERROR_INSUFFICIENT_RESOURCE = 1100;
public static final int ERROR_RECLAIMED = 1101;
}
public static final class CryptoException
  extends java.lang.RuntimeException
{
public  CryptoException(int errorCode, java.lang.String detailMessage) { throw new RuntimeException("Stub!"); }
public  int getErrorCode() { throw new RuntimeException("Stub!"); }
public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = 4;
public static final int ERROR_KEY_EXPIRED = 2;
public static final int ERROR_NO_KEY = 1;
public static final int ERROR_RESOURCE_BUSY = 3;
public static final int ERROR_SESSION_NOT_OPENED = 5;
public static final int ERROR_UNSUPPORTED_OPERATION = 6;
}
public static final class CryptoInfo
{
public static final class Pattern
{
public  Pattern(int blocksToEncrypt, int blocksToSkip) { throw new RuntimeException("Stub!"); }
public  void set(int blocksToEncrypt, int blocksToSkip) { throw new RuntimeException("Stub!"); }
public  int getSkipBlocks() { throw new RuntimeException("Stub!"); }
public  int getEncryptBlocks() { throw new RuntimeException("Stub!"); }
}
public  CryptoInfo() { throw new RuntimeException("Stub!"); }
public  void set(int newNumSubSamples, int[] newNumBytesOfClearData, int[] newNumBytesOfEncryptedData, byte[] newKey, byte[] newIV, int newMode) { throw new RuntimeException("Stub!"); }
public  void setPattern(android.media.MediaCodec.CryptoInfo.Pattern newPattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public byte[] iv = null;
public byte[] key = null;
public int mode;
public int[] numBytesOfClearData = null;
public int[] numBytesOfEncryptedData = null;
public int numSubSamples;
}
public static interface OnFrameRenderedListener
{
public abstract  void onFrameRendered(android.media.MediaCodec codec, long presentationTimeUs, long nanoTime);
}
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public abstract  void onInputBufferAvailable(android.media.MediaCodec codec, int index);
public abstract  void onOutputBufferAvailable(android.media.MediaCodec codec, int index, android.media.MediaCodec.BufferInfo info);
public abstract  void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e);
public abstract  void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format);
}
public static final class MetricsConstants
{
MetricsConstants() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CODEC = "android.media.mediacodec.codec";
public static final java.lang.String ENCODER = "android.media.mediacodec.encoder";
public static final java.lang.String HEIGHT = "android.media.mediacodec.height";
public static final java.lang.String MIME_TYPE = "android.media.mediacodec.mime";
public static final java.lang.String MODE = "android.media.mediacodec.mode";
public static final java.lang.String MODE_AUDIO = "audio";
public static final java.lang.String MODE_VIDEO = "video";
public static final java.lang.String ROTATION = "android.media.mediacodec.rotation";
public static final java.lang.String SECURE = "android.media.mediacodec.secure";
public static final java.lang.String WIDTH = "android.media.mediacodec.width";
}
MediaCodec() { throw new RuntimeException("Stub!"); }
public static  android.media.MediaCodec createDecoderByType(java.lang.String type) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.media.MediaCodec createEncoderByType(java.lang.String type) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.media.MediaCodec createByCodecName(java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  void configure(android.media.MediaFormat format, android.view.Surface surface, android.media.MediaCrypto crypto, int flags) { throw new RuntimeException("Stub!"); }
public  void configure(android.media.MediaFormat format, android.view.Surface surface, int flags, android.media.MediaDescrambler descrambler) { throw new RuntimeException("Stub!"); }
public  void setOutputSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public static  android.view.Surface createPersistentInputSurface() { throw new RuntimeException("Stub!"); }
public  void setInputSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public native  android.view.Surface createInputSurface();
public  void start() { throw new RuntimeException("Stub!"); }
public  void stop() { throw new RuntimeException("Stub!"); }
public  void flush() { throw new RuntimeException("Stub!"); }
public  void queueInputBuffer(int index, int offset, int size, long presentationTimeUs, int flags) throws android.media.MediaCodec.CryptoException { throw new RuntimeException("Stub!"); }
public  void queueSecureInputBuffer(int index, int offset, android.media.MediaCodec.CryptoInfo info, long presentationTimeUs, int flags) throws android.media.MediaCodec.CryptoException { throw new RuntimeException("Stub!"); }
public  int dequeueInputBuffer(long timeoutUs) { throw new RuntimeException("Stub!"); }
public  int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo info, long timeoutUs) { throw new RuntimeException("Stub!"); }
public  void releaseOutputBuffer(int index, boolean render) { throw new RuntimeException("Stub!"); }
public  void releaseOutputBuffer(int index, long renderTimestampNs) { throw new RuntimeException("Stub!"); }
public native  void signalEndOfInputStream();
public  android.media.MediaFormat getOutputFormat() { throw new RuntimeException("Stub!"); }
public  android.media.MediaFormat getInputFormat() { throw new RuntimeException("Stub!"); }
public  android.media.MediaFormat getOutputFormat(int index) { throw new RuntimeException("Stub!"); }
@Deprecated
public  java.nio.ByteBuffer[] getInputBuffers() { throw new RuntimeException("Stub!"); }
@Deprecated
public  java.nio.ByteBuffer[] getOutputBuffers() { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer getInputBuffer(int index) { throw new RuntimeException("Stub!"); }
public  android.media.Image getInputImage(int index) { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer getOutputBuffer(int index) { throw new RuntimeException("Stub!"); }
public  android.media.Image getOutputImage(int index) { throw new RuntimeException("Stub!"); }
public native  void setVideoScalingMode(int mode);
public native  java.lang.String getName();
public  android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
public  void setParameters(android.os.Bundle params) { throw new RuntimeException("Stub!"); }
public  void setCallback(android.media.MediaCodec.Callback cb, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setCallback(android.media.MediaCodec.Callback cb) { throw new RuntimeException("Stub!"); }
public  void setOnFrameRenderedListener(android.media.MediaCodec.OnFrameRenderedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.media.MediaCodecInfo getCodecInfo() { throw new RuntimeException("Stub!"); }
public static final int BUFFER_FLAG_CODEC_CONFIG = 2;
public static final int BUFFER_FLAG_END_OF_STREAM = 4;
public static final int BUFFER_FLAG_KEY_FRAME = 1;
public static final int BUFFER_FLAG_PARTIAL_FRAME = 8;
@Deprecated
public static final int BUFFER_FLAG_SYNC_FRAME = 1;
public static final int CONFIGURE_FLAG_ENCODE = 1;
public static final int CRYPTO_MODE_AES_CBC = 2;
public static final int CRYPTO_MODE_AES_CTR = 1;
public static final int CRYPTO_MODE_UNENCRYPTED = 0;
@Deprecated
public static final int INFO_OUTPUT_BUFFERS_CHANGED = -3;
public static final int INFO_OUTPUT_FORMAT_CHANGED = -2;
public static final int INFO_TRY_AGAIN_LATER = -1;
public static final java.lang.String PARAMETER_KEY_REQUEST_SYNC_FRAME = "request-sync";
public static final java.lang.String PARAMETER_KEY_SUSPEND = "drop-input-frames";
public static final java.lang.String PARAMETER_KEY_VIDEO_BITRATE = "video-bitrate";
public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
}
