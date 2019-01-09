/*
* Copyright (C) 2012 The Android Open Source Project
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
public final class DisplayManager
{
public static interface DisplayListener
{
public abstract  void onDisplayAdded(int displayId);
public abstract  void onDisplayRemoved(int displayId);
public abstract  void onDisplayChanged(int displayId);
}
DisplayManager() { throw new RuntimeException("Stub!"); }
public  android.view.Display getDisplay(int displayId) { throw new RuntimeException("Stub!"); }
public  android.view.Display[] getDisplays() { throw new RuntimeException("Stub!"); }
public  android.view.Display[] getDisplays(java.lang.String category) { throw new RuntimeException("Stub!"); }
public  void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterDisplayListener(android.hardware.display.DisplayManager.DisplayListener listener) { throw new RuntimeException("Stub!"); }
public  android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String name, int width, int height, int densityDpi, android.view.Surface surface, int flags) { throw new RuntimeException("Stub!"); }
public  android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String name, int width, int height, int densityDpi, android.view.Surface surface, int flags, android.hardware.display.VirtualDisplay.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
public static final int VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR = 16;
public static final int VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY = 8;
public static final int VIRTUAL_DISPLAY_FLAG_PRESENTATION = 2;
public static final int VIRTUAL_DISPLAY_FLAG_PUBLIC = 1;
public static final int VIRTUAL_DISPLAY_FLAG_SECURE = 4;
}
