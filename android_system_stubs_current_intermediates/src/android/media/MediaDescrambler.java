/*
* Copyright (C) 2017 The Android Open Source Project
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
public final class MediaDescrambler
  implements java.lang.AutoCloseable
{
public  MediaDescrambler(int CA_system_id) throws android.media.MediaCasException.UnsupportedCasException { throw new RuntimeException("Stub!"); }
public  boolean requiresSecureDecoderComponent(java.lang.String mime) { throw new RuntimeException("Stub!"); }
public  void setMediaCasSession(android.media.MediaCas.Session session) { throw new RuntimeException("Stub!"); }
public  int descramble(java.nio.ByteBuffer srcBuf, java.nio.ByteBuffer dstBuf, android.media.MediaCodec.CryptoInfo cryptoInfo) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public static final byte SCRAMBLE_CONTROL_EVEN_KEY = 2;
public static final byte SCRAMBLE_CONTROL_ODD_KEY = 3;
public static final byte SCRAMBLE_CONTROL_RESERVED = 1;
public static final byte SCRAMBLE_CONTROL_UNSCRAMBLED = 0;
public static final byte SCRAMBLE_FLAG_PES_HEADER = 1;
}
