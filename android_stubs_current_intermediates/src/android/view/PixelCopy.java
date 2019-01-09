/*
* Copyright (C) 2016 The Android Open Source Project
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
public final class PixelCopy
{
public static interface OnPixelCopyFinishedListener
{
public abstract  void onPixelCopyFinished(int copyResult);
}
PixelCopy() { throw new RuntimeException("Stub!"); }
public static  void request(android.view.SurfaceView source, android.graphics.Bitmap dest, android.view.PixelCopy.OnPixelCopyFinishedListener listener, android.os.Handler listenerThread) { throw new RuntimeException("Stub!"); }
public static  void request(android.view.SurfaceView source, android.graphics.Rect srcRect, android.graphics.Bitmap dest, android.view.PixelCopy.OnPixelCopyFinishedListener listener, android.os.Handler listenerThread) { throw new RuntimeException("Stub!"); }
public static  void request(android.view.Surface source, android.graphics.Bitmap dest, android.view.PixelCopy.OnPixelCopyFinishedListener listener, android.os.Handler listenerThread) { throw new RuntimeException("Stub!"); }
public static  void request(android.view.Surface source, android.graphics.Rect srcRect, android.graphics.Bitmap dest, android.view.PixelCopy.OnPixelCopyFinishedListener listener, android.os.Handler listenerThread) { throw new RuntimeException("Stub!"); }
public static  void request(android.view.Window source, android.graphics.Bitmap dest, android.view.PixelCopy.OnPixelCopyFinishedListener listener, android.os.Handler listenerThread) { throw new RuntimeException("Stub!"); }
public static  void request(android.view.Window source, android.graphics.Rect srcRect, android.graphics.Bitmap dest, android.view.PixelCopy.OnPixelCopyFinishedListener listener, android.os.Handler listenerThread) { throw new RuntimeException("Stub!"); }
public static final int ERROR_DESTINATION_INVALID = 5;
public static final int ERROR_SOURCE_INVALID = 4;
public static final int ERROR_SOURCE_NO_DATA = 3;
public static final int ERROR_TIMEOUT = 2;
public static final int ERROR_UNKNOWN = 1;
public static final int SUCCESS = 0;
}
