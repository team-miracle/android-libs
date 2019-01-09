/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.os;
public class Handler
{
public static interface Callback
{
public abstract  boolean handleMessage(android.os.Message msg);
}
public  Handler() { throw new RuntimeException("Stub!"); }
public  Handler(android.os.Handler.Callback callback) { throw new RuntimeException("Stub!"); }
public  Handler(android.os.Looper looper) { throw new RuntimeException("Stub!"); }
public  Handler(android.os.Looper looper, android.os.Handler.Callback callback) { throw new RuntimeException("Stub!"); }
public  void handleMessage(android.os.Message msg) { throw new RuntimeException("Stub!"); }
public  void dispatchMessage(android.os.Message msg) { throw new RuntimeException("Stub!"); }
public static  android.os.Handler createAsync(android.os.Looper looper) { throw new RuntimeException("Stub!"); }
public static  android.os.Handler createAsync(android.os.Looper looper, android.os.Handler.Callback callback) { throw new RuntimeException("Stub!"); }
public  java.lang.String getMessageName(android.os.Message message) { throw new RuntimeException("Stub!"); }
public final  android.os.Message obtainMessage() { throw new RuntimeException("Stub!"); }
public final  android.os.Message obtainMessage(int what) { throw new RuntimeException("Stub!"); }
public final  android.os.Message obtainMessage(int what, java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public final  android.os.Message obtainMessage(int what, int arg1, int arg2) { throw new RuntimeException("Stub!"); }
public final  android.os.Message obtainMessage(int what, int arg1, int arg2, java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public final  boolean post(java.lang.Runnable r) { throw new RuntimeException("Stub!"); }
public final  boolean postAtTime(java.lang.Runnable r, long uptimeMillis) { throw new RuntimeException("Stub!"); }
public final  boolean postAtTime(java.lang.Runnable r, java.lang.Object token, long uptimeMillis) { throw new RuntimeException("Stub!"); }
public final  boolean postDelayed(java.lang.Runnable r, long delayMillis) { throw new RuntimeException("Stub!"); }
public final  boolean postDelayed(java.lang.Runnable r, java.lang.Object token, long delayMillis) { throw new RuntimeException("Stub!"); }
public final  boolean postAtFrontOfQueue(java.lang.Runnable r) { throw new RuntimeException("Stub!"); }
public final  void removeCallbacks(java.lang.Runnable r) { throw new RuntimeException("Stub!"); }
public final  void removeCallbacks(java.lang.Runnable r, java.lang.Object token) { throw new RuntimeException("Stub!"); }
public final  boolean sendMessage(android.os.Message msg) { throw new RuntimeException("Stub!"); }
public final  boolean sendEmptyMessage(int what) { throw new RuntimeException("Stub!"); }
public final  boolean sendEmptyMessageDelayed(int what, long delayMillis) { throw new RuntimeException("Stub!"); }
public final  boolean sendEmptyMessageAtTime(int what, long uptimeMillis) { throw new RuntimeException("Stub!"); }
public final  boolean sendMessageDelayed(android.os.Message msg, long delayMillis) { throw new RuntimeException("Stub!"); }
public  boolean sendMessageAtTime(android.os.Message msg, long uptimeMillis) { throw new RuntimeException("Stub!"); }
public final  boolean sendMessageAtFrontOfQueue(android.os.Message msg) { throw new RuntimeException("Stub!"); }
public final  void removeMessages(int what) { throw new RuntimeException("Stub!"); }
public final  void removeMessages(int what, java.lang.Object object) { throw new RuntimeException("Stub!"); }
public final  void removeCallbacksAndMessages(java.lang.Object token) { throw new RuntimeException("Stub!"); }
public final  boolean hasMessages(int what) { throw new RuntimeException("Stub!"); }
public final  boolean hasMessages(int what, java.lang.Object object) { throw new RuntimeException("Stub!"); }
public final  android.os.Looper getLooper() { throw new RuntimeException("Stub!"); }
public final  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
