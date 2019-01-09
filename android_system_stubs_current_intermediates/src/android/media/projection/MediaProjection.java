/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.media.projection;
public final class MediaProjection
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public  void onStop() { throw new RuntimeException("Stub!"); }
}
MediaProjection() { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.media.projection.MediaProjection.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterCallback(android.media.projection.MediaProjection.Callback callback) { throw new RuntimeException("Stub!"); }
public  android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String name, int width, int height, int dpi, int flags, android.view.Surface surface, android.hardware.display.VirtualDisplay.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void stop() { throw new RuntimeException("Stub!"); }
}
