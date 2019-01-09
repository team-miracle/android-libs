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

package android.nfc.tech;
public final class MifareUltralight
  extends android.nfc.tech.BasicTagTechnology
{
MifareUltralight() { throw new RuntimeException("Stub!"); }
public static  android.nfc.tech.MifareUltralight get(android.nfc.Tag tag) { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  byte[] readPages(int pageOffset) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writePage(int pageOffset, byte[] data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte[] transceive(byte[] data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getMaxTransceiveLength() { throw new RuntimeException("Stub!"); }
public  void setTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getTimeout() { throw new RuntimeException("Stub!"); }
public static final int PAGE_SIZE = 4;
public static final int TYPE_ULTRALIGHT = 1;
public static final int TYPE_ULTRALIGHT_C = 2;
public static final int TYPE_UNKNOWN = -1;
}
