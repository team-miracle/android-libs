/*
* Copyright (C) 2008 The Android Open Source Project
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
public class GestureDetector
{
public static interface OnGestureListener
{
public abstract  boolean onDown(android.view.MotionEvent e);
public abstract  void onShowPress(android.view.MotionEvent e);
public abstract  boolean onSingleTapUp(android.view.MotionEvent e);
public abstract  boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY);
public abstract  void onLongPress(android.view.MotionEvent e);
public abstract  boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY);
}
public static interface OnDoubleTapListener
{
public abstract  boolean onSingleTapConfirmed(android.view.MotionEvent e);
public abstract  boolean onDoubleTap(android.view.MotionEvent e);
public abstract  boolean onDoubleTapEvent(android.view.MotionEvent e);
}
public static interface OnContextClickListener
{
public abstract  boolean onContextClick(android.view.MotionEvent e);
}
public static class SimpleOnGestureListener
  implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnContextClickListener
{
public  SimpleOnGestureListener() { throw new RuntimeException("Stub!"); }
public  boolean onSingleTapUp(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  void onLongPress(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY) { throw new RuntimeException("Stub!"); }
public  boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) { throw new RuntimeException("Stub!"); }
public  void onShowPress(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onDown(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onDoubleTap(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onDoubleTapEvent(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onSingleTapConfirmed(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
public  boolean onContextClick(android.view.MotionEvent e) { throw new RuntimeException("Stub!"); }
}
@java.lang.Deprecated()
public  GestureDetector(android.view.GestureDetector.OnGestureListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  GestureDetector(android.view.GestureDetector.OnGestureListener listener) { throw new RuntimeException("Stub!"); }
public  GestureDetector(android.content.Context context, android.view.GestureDetector.OnGestureListener listener) { throw new RuntimeException("Stub!"); }
public  GestureDetector(android.content.Context context, android.view.GestureDetector.OnGestureListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  GestureDetector(android.content.Context context, android.view.GestureDetector.OnGestureListener listener, android.os.Handler handler, boolean unused) { throw new RuntimeException("Stub!"); }
public  void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener) { throw new RuntimeException("Stub!"); }
public  void setContextClickListener(android.view.GestureDetector.OnContextClickListener onContextClickListener) { throw new RuntimeException("Stub!"); }
public  void setIsLongpressEnabled(boolean isLongpressEnabled) { throw new RuntimeException("Stub!"); }
public  boolean isLongpressEnabled() { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  boolean onGenericMotionEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
}
