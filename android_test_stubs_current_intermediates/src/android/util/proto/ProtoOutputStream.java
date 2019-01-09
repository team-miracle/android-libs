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
public final class ProtoOutputStream
{
public  ProtoOutputStream() { throw new RuntimeException("Stub!"); }
public  ProtoOutputStream(int chunkSize) { throw new RuntimeException("Stub!"); }
public  ProtoOutputStream(java.io.OutputStream stream) { throw new RuntimeException("Stub!"); }
public  ProtoOutputStream(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public  void write(long fieldId, double val) { throw new RuntimeException("Stub!"); }
public  void write(long fieldId, float val) { throw new RuntimeException("Stub!"); }
public  void write(long fieldId, int val) { throw new RuntimeException("Stub!"); }
public  void write(long fieldId, long val) { throw new RuntimeException("Stub!"); }
public  void write(long fieldId, boolean val) { throw new RuntimeException("Stub!"); }
public  void write(long fieldId, java.lang.String val) { throw new RuntimeException("Stub!"); }
public  void write(long fieldId, byte[] val) { throw new RuntimeException("Stub!"); }
public  long start(long fieldId) { throw new RuntimeException("Stub!"); }
public  void end(long token) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeDouble(long fieldId, double val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedDouble(long fieldId, double val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedDouble(long fieldId, double[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeFloat(long fieldId, float val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedFloat(long fieldId, float val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedFloat(long fieldId, float[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeInt32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedInt32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedInt32(long fieldId, int[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeInt64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedInt64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedInt64(long fieldId, long[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeUInt32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedUInt32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedUInt32(long fieldId, int[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeUInt64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedUInt64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedUInt64(long fieldId, long[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeSInt32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedSInt32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedSInt32(long fieldId, int[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeSInt64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedSInt64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedSInt64(long fieldId, long[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeFixed32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedFixed32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedFixed32(long fieldId, int[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeFixed64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedFixed64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedFixed64(long fieldId, long[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeSFixed32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedSFixed32(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedSFixed32(long fieldId, int[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeSFixed64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedSFixed64(long fieldId, long val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedSFixed64(long fieldId, long[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeBool(long fieldId, boolean val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedBool(long fieldId, boolean val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedBool(long fieldId, boolean[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeString(long fieldId, java.lang.String val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedString(long fieldId, java.lang.String val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeBytes(long fieldId, byte[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedBytes(long fieldId, byte[] val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeEnum(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedEnum(long fieldId, int val) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writePackedEnum(long fieldId, int[] val) { throw new RuntimeException("Stub!"); }
public static  long makeToken(int tagSize, boolean repeated, int depth, int objectId, int sizePos) { throw new RuntimeException("Stub!"); }
public static  int getTagSizeFromToken(long token) { throw new RuntimeException("Stub!"); }
public static  boolean getRepeatedFromToken(long token) { throw new RuntimeException("Stub!"); }
public static  int getDepthFromToken(long token) { throw new RuntimeException("Stub!"); }
public static  int getObjectIdFromToken(long token) { throw new RuntimeException("Stub!"); }
public static  int getSizePosFromToken(long token) { throw new RuntimeException("Stub!"); }
public static  int convertObjectIdToOrdinal(int objectId) { throw new RuntimeException("Stub!"); }
public static  java.lang.String token2String(long token) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  long startObject(long fieldId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void endObject(long token) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  long startRepeatedObject(long fieldId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void endRepeatedObject(long token) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeObject(long fieldId, byte[] value) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void writeRepeatedObject(long fieldId, byte[] value) { throw new RuntimeException("Stub!"); }
public static  long makeFieldId(int id, long fieldFlags) { throw new RuntimeException("Stub!"); }
public static  int checkFieldId(long fieldId, long expectedFlags) { throw new RuntimeException("Stub!"); }
public  void writeTag(int id, int wireType) { throw new RuntimeException("Stub!"); }
public  byte[] getBytes() { throw new RuntimeException("Stub!"); }
public  void flush() { throw new RuntimeException("Stub!"); }
public  void dump(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public static final long FIELD_COUNT_MASK = 16492674416640L;
public static final long FIELD_COUNT_PACKED = 5497558138880L;
public static final long FIELD_COUNT_REPEATED = 2199023255552L;
public static final int FIELD_COUNT_SHIFT = 40;
public static final long FIELD_COUNT_SINGLE = 1099511627776L;
public static final long FIELD_COUNT_UNKNOWN = 0L;
public static final int FIELD_ID_MASK = -8;
public static final int FIELD_ID_SHIFT = 3;
public static final long FIELD_TYPE_BOOL = 34359738368L;
public static final long FIELD_TYPE_BYTES = 51539607552L;
public static final long FIELD_TYPE_DOUBLE = 4294967296L;
public static final long FIELD_TYPE_ENUM = 60129542144L;
public static final long FIELD_TYPE_FIXED32 = 30064771072L;
public static final long FIELD_TYPE_FIXED64 = 25769803776L;
public static final long FIELD_TYPE_FLOAT = 8589934592L;
public static final long FIELD_TYPE_INT32 = 21474836480L;
public static final long FIELD_TYPE_INT64 = 12884901888L;
public static final long FIELD_TYPE_MASK = 1095216660480L;
public static final long FIELD_TYPE_MESSAGE = 47244640256L;
public static final long FIELD_TYPE_SFIXED32 = 64424509440L;
public static final long FIELD_TYPE_SFIXED64 = 68719476736L;
public static final int FIELD_TYPE_SHIFT = 32;
public static final long FIELD_TYPE_SINT32 = 73014444032L;
public static final long FIELD_TYPE_SINT64 = 77309411328L;
public static final long FIELD_TYPE_STRING = 38654705664L;
public static final long FIELD_TYPE_UINT32 = 55834574848L;
public static final long FIELD_TYPE_UINT64 = 17179869184L;
public static final long FIELD_TYPE_UNKNOWN = 0L;
public static final java.lang.String TAG = "ProtoOutputStream";
public static final int WIRE_TYPE_END_GROUP = 4;
public static final int WIRE_TYPE_FIXED32 = 5;
public static final int WIRE_TYPE_FIXED64 = 1;
public static final int WIRE_TYPE_LENGTH_DELIMITED = 2;
public static final int WIRE_TYPE_MASK = 7;
public static final int WIRE_TYPE_START_GROUP = 3;
public static final int WIRE_TYPE_VARINT = 0;
}
