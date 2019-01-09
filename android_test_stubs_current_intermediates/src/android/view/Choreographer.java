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

package android.view;
public final class Choreographer
{
public static interface FrameCallback
{
public abstract  void doFrame(long frameTimeNanos);
}
Choreographer() { throw new RuntimeException("Stub!"); }
public static  android.view.Choreographer getInstance() { throw new RuntimeException("Stub!"); }
public static  long getFrameDelay() { throw new RuntimeException("Stub!"); }
public static  void setFrameDelay(long frameDelay) { throw new RuntimeException("Stub!"); }
public  void postCallback(int callbackType, java.lang.Runnable action, java.lang.Object token) { throw new RuntimeException("Stub!"); }
public  void postCallbackDelayed(int callbackType, java.lang.Runnable action, java.lang.Object token, long delayMillis) { throw new RuntimeException("Stub!"); }
public  void removeCallbacks(int callbackType, java.lang.Runnable action, java.lang.Object token) { throw new RuntimeException("Stub!"); }
public  void postFrameCallback(android.view.Choreographer.FrameCallback callback) { throw new RuntimeException("Stub!"); }
public  void postFrameCallbackDelayed(android.view.Choreographer.FrameCallback callback, long delayMillis) { throw new RuntimeException("Stub!"); }
public  void removeFrameCallback(android.view.Choreographer.FrameCallback callback) { throw new RuntimeException("Stub!"); }
public static final int CALLBACK_ANIMATION = 1;
}