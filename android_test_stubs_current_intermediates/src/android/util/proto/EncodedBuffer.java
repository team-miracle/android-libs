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

package android.util.proto;
public final class EncodedBuffer
{
public  EncodedBuffer() { throw new RuntimeException("Stub!"); }
public  EncodedBuffer(int chunkSize) { throw new RuntimeException("Stub!"); }
public  void startEditing() { throw new RuntimeException("Stub!"); }
public  void rewindRead() { throw new RuntimeException("Stub!"); }
public  int getReadableSize() { throw new RuntimeException("Stub!"); }
public  int getReadPos() { throw new RuntimeException("Stub!"); }
public  void skipRead(int amount) { throw new RuntimeException("Stub!"); }
public  byte readRawByte() { throw new RuntimeException("Stub!"); }
public  long readRawUnsigned() { throw new RuntimeException("Stub!"); }
public  int readRawFixed32() { throw new RuntimeException("Stub!"); }
public  void writeRawByte(byte val) { throw new RuntimeException("Stub!"); }
public static  int getRawVarint32Size(int val) { throw new RuntimeException("Stub!"); }
public  void writeRawVarint32(int val) { throw new RuntimeException("Stub!"); }
public static  int getRawZigZag32Size(int val) { throw new RuntimeException("Stub!"); }
public  void writeRawZigZag32(int val) { throw new RuntimeException("Stub!"); }
public static  int getRawVarint64Size(long val) { throw new RuntimeException("Stub!"); }
public  void writeRawVarint64(long val) { throw new RuntimeException("Stub!"); }
public static  int getRawZigZag64Size(long val) { throw new RuntimeException("Stub!"); }
public  void writeRawZigZag64(long val) { throw new RuntimeException("Stub!"); }
public  void writeRawFixed32(int val) { throw new RuntimeException("Stub!"); }
public  void writeRawFixed64(long val) { throw new RuntimeException("Stub!"); }
public  void writeRawBuffer(byte[] val) { throw new RuntimeException("Stub!"); }
public  void writeRawBuffer(byte[] val, int offset, int length) { throw new RuntimeException("Stub!"); }
public  void writeFromThisBuffer(int srcOffset, int size) { throw new RuntimeException("Stub!"); }
public  int getWritePos() { throw new RuntimeException("Stub!"); }
public  void rewindWriteTo(int writePos) { throw new RuntimeException("Stub!"); }
public  int getRawFixed32At(int pos) { throw new RuntimeException("Stub!"); }
public  void editRawFixed32(int pos, int val) { throw new RuntimeException("Stub!"); }
public  byte[] getBytes(int size) { throw new RuntimeException("Stub!"); }
public  int getChunkCount() { throw new RuntimeException("Stub!"); }
public  int getWriteIndex() { throw new RuntimeException("Stub!"); }
public  int getWriteBufIndex() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDebugString() { throw new RuntimeException("Stub!"); }
public  void dumpBuffers(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public static  void dumpByteString(java.lang.String tag, java.lang.String prefix, byte[] buf) { throw new RuntimeException("Stub!"); }
}
