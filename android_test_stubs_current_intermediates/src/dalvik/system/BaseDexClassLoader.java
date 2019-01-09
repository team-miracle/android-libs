/*
* Copyright (C) 2011 The Android Open Source Project
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
public class BaseDexClassLoader
  extends java.lang.ClassLoader
{
public  BaseDexClassLoader(java.lang.String dexPath, java.io.File optimizedDirectory, java.lang.String librarySearchPath, java.lang.ClassLoader parent) { throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  java.net.URL findResource(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  java.util.Enumeration<java.net.URL> findResources(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String findLibrary(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected synchronized  java.lang.Package getPackage(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
