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
public final class SensorDirectChannel
  implements java.nio.channels.Channel
{
SensorDirectChannel() { throw new RuntimeException("Stub!"); }
public  boolean isOpen() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  int configure(android.hardware.Sensor sensor, int rateLevel) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int RATE_FAST = 2;
public static final int RATE_NORMAL = 1;
public static final int RATE_STOP = 0;
public static final int RATE_VERY_FAST = 3;
public static final int TYPE_HARDWARE_BUFFER = 2;
public static final int TYPE_MEMORY_FILE = 1;
}
