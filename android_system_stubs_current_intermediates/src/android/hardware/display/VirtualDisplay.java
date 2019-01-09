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
package android.hardware.display;
public final class VirtualDisplay
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onPaused() { throw new RuntimeException("Stub!"); }
public  void onResumed() { throw new RuntimeException("Stub!"); }
public  void onStopped() { throw new RuntimeException("Stub!"); }
}
VirtualDisplay() { throw new RuntimeException("Stub!"); }
public  android.view.Display getDisplay() { throw new RuntimeException("Stub!"); }
public  android.view.Surface getSurface() { throw new RuntimeException("Stub!"); }
public  void setSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
public  void resize(int width, int height, int densityDpi) { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
