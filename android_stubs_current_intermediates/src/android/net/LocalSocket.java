/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.net;
public class LocalSocket
  implements java.io.Closeable
{
public  LocalSocket() { throw new RuntimeException("Stub!"); }
public  LocalSocket(int sockType) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void connect(android.net.LocalSocketAddress endpoint) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void bind(android.net.LocalSocketAddress bindpoint) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.net.LocalSocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getInputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getOutputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void shutdownInput() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void shutdownOutput() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setReceiveBufferSize(int size) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getReceiveBufferSize() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSoTimeout(int n) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getSoTimeout() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSendBufferSize(int n) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getSendBufferSize() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.net.LocalSocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); }
public synchronized  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public synchronized  boolean isBound() { throw new RuntimeException("Stub!"); }
public  boolean isOutputShutdown() { throw new RuntimeException("Stub!"); }
public  boolean isInputShutdown() { throw new RuntimeException("Stub!"); }
public  void connect(android.net.LocalSocketAddress endpoint, int timeout) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setFileDescriptorsForSend(java.io.FileDescriptor[] fds) { throw new RuntimeException("Stub!"); }
public  java.io.FileDescriptor[] getAncillaryFileDescriptors() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.net.Credentials getPeerCredentials() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
public static final int SOCKET_DGRAM = 1;
public static final int SOCKET_SEQPACKET = 3;
public static final int SOCKET_STREAM = 2;
}
