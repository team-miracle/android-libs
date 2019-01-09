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

package android.webkit;
public final class WebViewDelegate
{
public static interface OnTraceEnabledChangeListener
{
public abstract  void onTraceEnabledChange(boolean enabled);
}
WebViewDelegate() { throw new RuntimeException("Stub!"); }
public  void setOnTraceEnabledChangeListener(android.webkit.WebViewDelegate.OnTraceEnabledChangeListener listener) { throw new RuntimeException("Stub!"); }
public  boolean isTraceTagEnabled() { throw new RuntimeException("Stub!"); }
public  boolean canInvokeDrawGlFunctor(android.view.View containerView) { throw new RuntimeException("Stub!"); }
public  void invokeDrawGlFunctor(android.view.View containerView, long nativeDrawGLFunctor, boolean waitForCompletion) { throw new RuntimeException("Stub!"); }
public  void callDrawGlFunction(android.graphics.Canvas canvas, long nativeDrawGLFunctor) { throw new RuntimeException("Stub!"); }
public  void callDrawGlFunction(android.graphics.Canvas canvas, long nativeDrawGLFunctor, java.lang.Runnable releasedRunnable) { throw new RuntimeException("Stub!"); }
public  void detachDrawGlFunctor(android.view.View containerView, long nativeDrawGLFunctor) { throw new RuntimeException("Stub!"); }
public  int getPackageId(android.content.res.Resources resources, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  android.app.Application getApplication() { throw new RuntimeException("Stub!"); }
public  java.lang.String getErrorString(android.content.Context context, int errorCode) { throw new RuntimeException("Stub!"); }
public  void addWebViewAssetPath(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  boolean isMultiProcessEnabled() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDataDirectorySuffix() { throw new RuntimeException("Stub!"); }
}
