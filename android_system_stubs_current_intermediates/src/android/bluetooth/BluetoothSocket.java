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

package android.bluetooth;
public final class BluetoothSocket
  implements java.io.Closeable
{
BluetoothSocket() { throw new RuntimeException("Stub!"); }
public  android.bluetooth.BluetoothDevice getRemoteDevice() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getInputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getOutputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  void connect() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getMaxTransmitPacketSize() { throw new RuntimeException("Stub!"); }
public  int getMaxReceivePacketSize() { throw new RuntimeException("Stub!"); }
public  int getConnectionType() { throw new RuntimeException("Stub!"); }
public static final int TYPE_L2CAP = 3;
public static final int TYPE_RFCOMM = 1;
public static final int TYPE_SCO = 2;
}
