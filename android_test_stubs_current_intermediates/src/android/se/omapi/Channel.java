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
* Copyright (c) 2015-2017, The Linux Foundation.
*/
/*
* Contributed by: Giesecke & Devrient GmbH.
*/

package android.se.omapi;
public final class Channel
  implements java.nio.channels.Channel
{
Channel() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  boolean isOpen() { throw new RuntimeException("Stub!"); }
public  boolean isBasicChannel() { throw new RuntimeException("Stub!"); }
public  byte[] transmit(byte[] command) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.se.omapi.Session getSession() { throw new RuntimeException("Stub!"); }
public  byte[] getSelectResponse() { throw new RuntimeException("Stub!"); }
public  boolean selectNext() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
