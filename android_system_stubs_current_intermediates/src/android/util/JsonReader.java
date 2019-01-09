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

package android.util;
public final class JsonReader
  implements java.io.Closeable
{
public  JsonReader(java.io.Reader in) { throw new RuntimeException("Stub!"); }
public  void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
public  boolean isLenient() { throw new RuntimeException("Stub!"); }
public  void beginArray() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void endArray() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void beginObject() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void endObject() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean hasNext() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonToken peek() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String nextName() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String nextString() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean nextBoolean() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void nextNull() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  double nextDouble() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long nextLong() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int nextInt() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void skipValue() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
