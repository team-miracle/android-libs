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

package android.hardware;
public final class HardwareBuffer
  implements android.os.Parcelable, java.lang.AutoCloseable
{
HardwareBuffer() { throw new RuntimeException("Stub!"); }
public static  android.hardware.HardwareBuffer create(int width, int height, int format, int layers, long usage) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  int getFormat() { throw new RuntimeException("Stub!"); }
public  int getLayers() { throw new RuntimeException("Stub!"); }
public  long getUsage() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final int BLOB = 33;
public static final android.os.Parcelable.Creator<android.hardware.HardwareBuffer> CREATOR;
public static final int DS_24UI8 = 50;
public static final int DS_FP32UI8 = 52;
public static final int D_16 = 48;
public static final int D_24 = 49;
public static final int D_FP32 = 51;
public static final int RGBA_1010102 = 43;
public static final int RGBA_8888 = 1;
public static final int RGBA_FP16 = 22;
public static final int RGBX_8888 = 2;
public static final int RGB_565 = 4;
public static final int RGB_888 = 3;
public static final int S_UI8 = 53;
public static final long USAGE_CPU_READ_OFTEN = 3L;
public static final long USAGE_CPU_READ_RARELY = 2L;
public static final long USAGE_CPU_WRITE_OFTEN = 48L;
public static final long USAGE_CPU_WRITE_RARELY = 32L;
public static final long USAGE_GPU_COLOR_OUTPUT = 512L;
public static final long USAGE_GPU_CUBE_MAP = 33554432L;
public static final long USAGE_GPU_DATA_BUFFER = 16777216L;
public static final long USAGE_GPU_MIPMAP_COMPLETE = 67108864L;
public static final long USAGE_GPU_SAMPLED_IMAGE = 256L;
public static final long USAGE_PROTECTED_CONTENT = 16384L;
public static final long USAGE_SENSOR_DIRECT_DATA = 8388608L;
public static final long USAGE_VIDEO_ENCODE = 65536L;
static { CREATOR = null; }
}
