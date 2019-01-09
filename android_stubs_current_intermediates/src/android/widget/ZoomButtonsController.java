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

package android.widget;
@java.lang.Deprecated()
public class ZoomButtonsController
  implements android.view.View.OnTouchListener
{
public static interface OnZoomListener
{
public abstract  void onVisibilityChanged(boolean visible);
public abstract  void onZoom(boolean zoomIn);
}
public  ZoomButtonsController(android.view.View ownerView) { throw new RuntimeException("Stub!"); }
public  void setZoomInEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setZoomOutEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setZoomSpeed(long speed) { throw new RuntimeException("Stub!"); }
public  void setOnZoomListener(android.widget.ZoomButtonsController.OnZoomListener listener) { throw new RuntimeException("Stub!"); }
public  void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
public  boolean isAutoDismissed() { throw new RuntimeException("Stub!"); }
public  void setAutoDismissed(boolean autoDismiss) { throw new RuntimeException("Stub!"); }
public  boolean isVisible() { throw new RuntimeException("Stub!"); }
public  void setVisible(boolean visible) { throw new RuntimeException("Stub!"); }
public  android.view.ViewGroup getContainer() { throw new RuntimeException("Stub!"); }
public  android.view.View getZoomControls() { throw new RuntimeException("Stub!"); }
public  boolean onTouch(android.view.View v, android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
}
