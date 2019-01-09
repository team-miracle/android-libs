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
* limitations under the License
*/

package dalvik.system;
public final class DelegateLastClassLoader
  extends dalvik.system.PathClassLoader
{
public  DelegateLastClassLoader(java.lang.String dexPath, java.lang.ClassLoader parent) { super((java.lang.String)null,(java.lang.String)null,(java.lang.ClassLoader)null); throw new RuntimeException("Stub!"); }
public  DelegateLastClassLoader(java.lang.String dexPath, java.lang.String librarySearchPath, java.lang.ClassLoader parent) { super((java.lang.String)null,(java.lang.String)null,(java.lang.ClassLoader)null); throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> loadClass(java.lang.String name, boolean resolve) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  java.net.URL getResource(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration<java.net.URL> getResources(java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
