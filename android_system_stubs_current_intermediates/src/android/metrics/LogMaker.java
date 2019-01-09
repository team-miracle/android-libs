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
package android.metrics;
public class LogMaker
{
public  LogMaker(int category) { throw new RuntimeException("Stub!"); }
public  LogMaker(java.lang.Object[] items) { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker setCategory(int category) { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker clearCategory() { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker setType(int type) { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker clearType() { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker setSubtype(int subtype) { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker clearSubtype() { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker setPackageName(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker clearPackageName() { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker addTaggedData(int tag, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  android.metrics.LogMaker clearTaggedData(int tag) { throw new RuntimeException("Stub!"); }
public  boolean isValidValue(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getTaggedData(int tag) { throw new RuntimeException("Stub!"); }
public  int getCategory() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getSubtype() { throw new RuntimeException("Stub!"); }
public  long getTimestamp() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  int getProcessId() { throw new RuntimeException("Stub!"); }
public  int getUid() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCounterName() { throw new RuntimeException("Stub!"); }
public  long getCounterBucket() { throw new RuntimeException("Stub!"); }
public  boolean isLongCounterBucket() { throw new RuntimeException("Stub!"); }
public  int getCounterValue() { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] serialize() { throw new RuntimeException("Stub!"); }
public  void deserialize(java.lang.Object[] items) { throw new RuntimeException("Stub!"); }
public  boolean isSubsetOf(android.metrics.LogMaker that) { throw new RuntimeException("Stub!"); }
}
