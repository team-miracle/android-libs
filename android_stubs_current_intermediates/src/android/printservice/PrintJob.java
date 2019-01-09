/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.printservice;
public final class PrintJob
{
PrintJob() { throw new RuntimeException("Stub!"); }
public  android.print.PrintJobId getId() { throw new RuntimeException("Stub!"); }
public  android.print.PrintJobInfo getInfo() { throw new RuntimeException("Stub!"); }
public  android.printservice.PrintDocument getDocument() { throw new RuntimeException("Stub!"); }
public  boolean isQueued() { throw new RuntimeException("Stub!"); }
public  boolean isStarted() { throw new RuntimeException("Stub!"); }
public  boolean isBlocked() { throw new RuntimeException("Stub!"); }
public  boolean isCompleted() { throw new RuntimeException("Stub!"); }
public  boolean isFailed() { throw new RuntimeException("Stub!"); }
public  boolean isCancelled() { throw new RuntimeException("Stub!"); }
public  boolean start() { throw new RuntimeException("Stub!"); }
public  boolean block(java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  boolean complete() { throw new RuntimeException("Stub!"); }
public  boolean fail(java.lang.String error) { throw new RuntimeException("Stub!"); }
public  boolean cancel() { throw new RuntimeException("Stub!"); }
public  void setProgress(float progress) { throw new RuntimeException("Stub!"); }
public  void setStatus(java.lang.CharSequence status) { throw new RuntimeException("Stub!"); }
public  void setStatus(int statusResId) { throw new RuntimeException("Stub!"); }
public  boolean setTag(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  java.lang.String getTag() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAdvancedStringOption(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  boolean hasAdvancedOption(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int getAdvancedIntOption(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
