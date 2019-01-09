/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.media.midi;
public final class MidiDevice
  implements java.io.Closeable
{
public class MidiConnection
  implements java.io.Closeable
{
MidiConnection() { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
MidiDevice() { throw new RuntimeException("Stub!"); }
public  android.media.midi.MidiDeviceInfo getInfo() { throw new RuntimeException("Stub!"); }
public  android.media.midi.MidiInputPort openInputPort(int portNumber) { throw new RuntimeException("Stub!"); }
public  android.media.midi.MidiOutputPort openOutputPort(int portNumber) { throw new RuntimeException("Stub!"); }
public  android.media.midi.MidiDevice.MidiConnection connectPorts(android.media.midi.MidiInputPort inputPort, int outputPortNumber) { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
