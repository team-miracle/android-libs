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
public final class JsonWriter
  implements java.io.Closeable
{
public  JsonWriter(java.io.Writer out) { throw new RuntimeException("Stub!"); }
public  void setIndent(java.lang.String indent) { throw new RuntimeException("Stub!"); }
public  void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
public  boolean isLenient() { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter beginArray() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter endArray() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter beginObject() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter endObject() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter name(java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter value(java.lang.String value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter nullValue() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter value(boolean value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter value(double value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter value(long value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.util.JsonWriter value(java.lang.Number value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
