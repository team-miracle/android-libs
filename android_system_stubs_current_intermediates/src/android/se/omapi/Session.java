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
/*
* Copyright (c) 2017, The Linux Foundation.
*/
/*
* Contributed by: Giesecke & Devrient GmbH.
*/

package android.se.omapi;
public final class Session
{
Session() { throw new RuntimeException("Stub!"); }
public  android.se.omapi.Reader getReader() { throw new RuntimeException("Stub!"); }
public  byte[] getATR() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public  void closeChannels() { throw new RuntimeException("Stub!"); }
public  android.se.omapi.Channel openBasicChannel(byte[] aid, byte p2) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.se.omapi.Channel openBasicChannel(byte[] aid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.se.omapi.Channel openLogicalChannel(byte[] aid, byte p2) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.se.omapi.Channel openLogicalChannel(byte[] aid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
