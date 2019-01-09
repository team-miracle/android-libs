/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.app.backup;
public class BackupDataInput
{
public  BackupDataInput(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public  boolean readNextHeader() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getKey() { throw new RuntimeException("Stub!"); }
public  int getDataSize() { throw new RuntimeException("Stub!"); }
public  int readEntityData(byte[] data, int offset, int size) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void skipEntityData() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}