/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.net.rtp;
public class RtpStream
{
RtpStream() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public  int getLocalPort() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); }
public  int getRemotePort() { throw new RuntimeException("Stub!"); }
public  boolean isBusy() { throw new RuntimeException("Stub!"); }
public  int getMode() { throw new RuntimeException("Stub!"); }
public  void setMode(int mode) { throw new RuntimeException("Stub!"); }
public  void associate(java.net.InetAddress address, int port) { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int MODE_NORMAL = 0;
public static final int MODE_RECEIVE_ONLY = 2;
public static final int MODE_SEND_ONLY = 1;
}
