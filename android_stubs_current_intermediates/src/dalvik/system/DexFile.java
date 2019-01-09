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

package dalvik.system;
@java.lang.Deprecated()
public final class DexFile
{
@java.lang.Deprecated()
public  DexFile(java.io.File file) throws java.io.IOException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  DexFile(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  dalvik.system.DexFile loadDex(java.lang.String sourcePathName, java.lang.String outputPathName, int flags) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Class loadClass(java.lang.String name, java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration<java.lang.String> entries() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static native  boolean isDexOptNeeded(java.lang.String fileName) throws java.io.FileNotFoundException, java.io.IOException;
}
