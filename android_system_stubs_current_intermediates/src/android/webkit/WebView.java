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

package android.webkit;
public class WebView
  extends android.widget.AbsoluteLayout
  implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener, android.view.ViewGroup.OnHierarchyChangeListener
{
public class WebViewTransport
{
public  WebViewTransport() { throw new RuntimeException("Stub!"); }
public synchronized  void setWebView(android.webkit.WebView webview) { throw new RuntimeException("Stub!"); }
public synchronized  android.webkit.WebView getWebView() { throw new RuntimeException("Stub!"); }
}
public static interface FindListener
{
public abstract  void onFindResultReceived(int activeMatchOrdinal, int numberOfMatches, boolean isDoneCounting);
}
public abstract static class VisualStateCallback
{
public  VisualStateCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onComplete(long requestId);
}
@java.lang.Deprecated()
public static interface PictureListener
{
@java.lang.Deprecated()
public abstract  void onNewPicture(android.webkit.WebView view, android.graphics.Picture picture);
}
public static class HitTestResult
{
public  HitTestResult() { throw new RuntimeException("Stub!"); }
public  void setType(int type) { throw new RuntimeException("Stub!"); }
public  void setExtra(java.lang.String extra) { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getExtra() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static final int ANCHOR_TYPE = 1;
public static final int EDIT_TEXT_TYPE = 9;
public static final int EMAIL_TYPE = 4;
public static final int GEO_TYPE = 3;
@java.lang.Deprecated()
public static final int IMAGE_ANCHOR_TYPE = 6;
public static final int IMAGE_TYPE = 5;
public static final int PHONE_TYPE = 2;
public static final int SRC_ANCHOR_TYPE = 7;
public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
public static final int UNKNOWN_TYPE = 0;
}
public class PrivateAccess
{
public  PrivateAccess() { throw new RuntimeException("Stub!"); }
public  int super_getScrollBarStyle() { throw new RuntimeException("Stub!"); }
public  void super_scrollTo(int scrollX, int scrollY) { throw new RuntimeException("Stub!"); }
public  void super_computeScroll() { throw new RuntimeException("Stub!"); }
public  boolean super_onHoverEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean super_performAccessibilityAction(int action, android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
public  boolean super_performLongClick() { throw new RuntimeException("Stub!"); }
public  boolean super_setFrame(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  boolean super_dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean super_onGenericMotionEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean super_requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  void super_setLayoutParams(android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void super_startActivityForResult(android.content.Intent intent, int requestCode) { throw new RuntimeException("Stub!"); }
public  void overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) { throw new RuntimeException("Stub!"); }
public  void awakenScrollBars(int duration) { throw new RuntimeException("Stub!"); }
public  void awakenScrollBars(int duration, boolean invalidate) { throw new RuntimeException("Stub!"); }
public  float getVerticalScrollFactor() { throw new RuntimeException("Stub!"); }
public  float getHorizontalScrollFactor() { throw new RuntimeException("Stub!"); }
public  void setMeasuredDimension(int measuredWidth, int measuredHeight) { throw new RuntimeException("Stub!"); }
public  void onScrollChanged(int l, int t, int oldl, int oldt) { throw new RuntimeException("Stub!"); }
public  int getHorizontalScrollbarHeight() { throw new RuntimeException("Stub!"); }
public  void super_onDrawVerticalScrollBar(android.graphics.Canvas canvas, android.graphics.drawable.Drawable scrollBar, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  void setScrollXRaw(int scrollX) { throw new RuntimeException("Stub!"); }
public  void setScrollYRaw(int scrollY) { throw new RuntimeException("Stub!"); }
}
public  WebView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  WebView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  WebView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  WebView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  WebView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, boolean privateBrowsing) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setHorizontalScrollbarOverlay(boolean overlay) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setVerticalScrollbarOverlay(boolean overlay) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean overlayHorizontalScrollbar() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean overlayVerticalScrollbar() { throw new RuntimeException("Stub!"); }
public  android.net.http.SslCertificate getCertificate() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setCertificate(android.net.http.SslCertificate certificate) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void savePassword(java.lang.String host, java.lang.String username, java.lang.String password) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setHttpAuthUsernamePassword(java.lang.String host, java.lang.String realm, java.lang.String username, java.lang.String password) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String[] getHttpAuthUsernamePassword(java.lang.String host, java.lang.String realm) { throw new RuntimeException("Stub!"); }
public  void destroy() { throw new RuntimeException("Stub!"); }
public  void setNetworkAvailable(boolean networkUp) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebBackForwardList saveState(android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebBackForwardList restoreState(android.os.Bundle inState) { throw new RuntimeException("Stub!"); }
public  void loadUrl(java.lang.String url, java.util.Map<java.lang.String, java.lang.String> additionalHttpHeaders) { throw new RuntimeException("Stub!"); }
public  void loadUrl(java.lang.String url) { throw new RuntimeException("Stub!"); }
public  void postUrl(java.lang.String url, byte[] postData) { throw new RuntimeException("Stub!"); }
public  void loadData(java.lang.String data, java.lang.String mimeType, java.lang.String encoding) { throw new RuntimeException("Stub!"); }
public  void loadDataWithBaseURL(java.lang.String baseUrl, java.lang.String data, java.lang.String mimeType, java.lang.String encoding, java.lang.String historyUrl) { throw new RuntimeException("Stub!"); }
public  void evaluateJavascript(java.lang.String script, android.webkit.ValueCallback<java.lang.String> resultCallback) { throw new RuntimeException("Stub!"); }
public  void saveWebArchive(java.lang.String filename) { throw new RuntimeException("Stub!"); }
public  void saveWebArchive(java.lang.String basename, boolean autoname, android.webkit.ValueCallback<java.lang.String> callback) { throw new RuntimeException("Stub!"); }
public  void stopLoading() { throw new RuntimeException("Stub!"); }
public  void reload() { throw new RuntimeException("Stub!"); }
public  boolean canGoBack() { throw new RuntimeException("Stub!"); }
public  void goBack() { throw new RuntimeException("Stub!"); }
public  boolean canGoForward() { throw new RuntimeException("Stub!"); }
public  void goForward() { throw new RuntimeException("Stub!"); }
public  boolean canGoBackOrForward(int steps) { throw new RuntimeException("Stub!"); }
public  void goBackOrForward(int steps) { throw new RuntimeException("Stub!"); }
public  boolean isPrivateBrowsingEnabled() { throw new RuntimeException("Stub!"); }
public  boolean pageUp(boolean top) { throw new RuntimeException("Stub!"); }
public  boolean pageDown(boolean bottom) { throw new RuntimeException("Stub!"); }
public  void postVisualStateCallback(long requestId, android.webkit.WebView.VisualStateCallback callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void clearView() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.graphics.Picture capturePicture() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.print.PrintDocumentAdapter createPrintDocumentAdapter() { throw new RuntimeException("Stub!"); }
public  android.print.PrintDocumentAdapter createPrintDocumentAdapter(java.lang.String documentName) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.view.ViewDebug.ExportedProperty(category="webview")
public  float getScale() { throw new RuntimeException("Stub!"); }
public  void setInitialScale(int scaleInPercent) { throw new RuntimeException("Stub!"); }
public  void invokeZoomPicker() { throw new RuntimeException("Stub!"); }
public  android.webkit.WebView.HitTestResult getHitTestResult() { throw new RuntimeException("Stub!"); }
public  void requestFocusNodeHref(android.os.Message hrefMsg) { throw new RuntimeException("Stub!"); }
public  void requestImageRef(android.os.Message msg) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="webview")
public  java.lang.String getUrl() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="webview")
public  java.lang.String getOriginalUrl() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="webview")
public  java.lang.String getTitle() { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getFavicon() { throw new RuntimeException("Stub!"); }
public  int getProgress() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="webview")
public  int getContentHeight() { throw new RuntimeException("Stub!"); }
public  void pauseTimers() { throw new RuntimeException("Stub!"); }
public  void resumeTimers() { throw new RuntimeException("Stub!"); }
public  void onPause() { throw new RuntimeException("Stub!"); }
public  void onResume() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void freeMemory() { throw new RuntimeException("Stub!"); }
public  void clearCache(boolean includeDiskFiles) { throw new RuntimeException("Stub!"); }
public  void clearFormData() { throw new RuntimeException("Stub!"); }
public  void clearHistory() { throw new RuntimeException("Stub!"); }
public  void clearSslPreferences() { throw new RuntimeException("Stub!"); }
public static  void clearClientCertPreferences(java.lang.Runnable onCleared) { throw new RuntimeException("Stub!"); }
public static  void startSafeBrowsing(android.content.Context context, android.webkit.ValueCallback<java.lang.Boolean> callback) { throw new RuntimeException("Stub!"); }
public static  void setSafeBrowsingWhitelist(java.util.List<java.lang.String> hosts, android.webkit.ValueCallback<java.lang.Boolean> callback) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getSafeBrowsingPrivacyPolicyUrl() { throw new RuntimeException("Stub!"); }
public  android.webkit.WebBackForwardList copyBackForwardList() { throw new RuntimeException("Stub!"); }
public  void setFindListener(android.webkit.WebView.FindListener listener) { throw new RuntimeException("Stub!"); }
public  void findNext(boolean forward) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int findAll(java.lang.String find) { throw new RuntimeException("Stub!"); }
public  void findAllAsync(java.lang.String find) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean showFindDialog(java.lang.String text, boolean showIme) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  java.lang.String findAddress(java.lang.String addr) { throw new RuntimeException("Stub!"); }
public static  void enableSlowWholeDocumentDraw() { throw new RuntimeException("Stub!"); }
public  void clearMatches() { throw new RuntimeException("Stub!"); }
public  void documentHasImages(android.os.Message response) { throw new RuntimeException("Stub!"); }
public  void setWebViewClient(android.webkit.WebViewClient client) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebViewClient getWebViewClient() { throw new RuntimeException("Stub!"); }
public  void setDownloadListener(android.webkit.DownloadListener listener) { throw new RuntimeException("Stub!"); }
public  void setWebChromeClient(android.webkit.WebChromeClient client) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebChromeClient getWebChromeClient() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setPictureListener(android.webkit.WebView.PictureListener listener) { throw new RuntimeException("Stub!"); }
public  void addJavascriptInterface(java.lang.Object object, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void removeJavascriptInterface(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebMessagePort[] createWebMessageChannel() { throw new RuntimeException("Stub!"); }
public  void postWebMessage(android.webkit.WebMessage message, android.net.Uri targetOrigin) { throw new RuntimeException("Stub!"); }
public  android.webkit.WebSettings getSettings() { throw new RuntimeException("Stub!"); }
public static  void setWebContentsDebuggingEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public static  void setDataDirectorySuffix(java.lang.String suffix) { throw new RuntimeException("Stub!"); }
public static  void disableWebView() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onChildViewAdded(android.view.View parent, android.view.View child) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onChildViewRemoved(android.view.View p, android.view.View child) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onGlobalFocusChanged(android.view.View oldFocus, android.view.View newFocus) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setMapTrackballToArrowKeys(boolean setMap) { throw new RuntimeException("Stub!"); }
public  void flingScroll(int vx, int vy) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean canZoomIn() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean canZoomOut() { throw new RuntimeException("Stub!"); }
public  void zoomBy(float zoomFactor) { throw new RuntimeException("Stub!"); }
public  boolean zoomIn() { throw new RuntimeException("Stub!"); }
public  boolean zoomOut() { throw new RuntimeException("Stub!"); }
public  void setRendererPriorityPolicy(int rendererRequestedPriority, boolean waivedWhenNotVisible) { throw new RuntimeException("Stub!"); }
public  int getRendererRequestedPriority() { throw new RuntimeException("Stub!"); }
public  boolean getRendererPriorityWaivedWhenNotVisible() { throw new RuntimeException("Stub!"); }
public  void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextClassifier getTextClassifier() { throw new RuntimeException("Stub!"); }
public static  java.lang.ClassLoader getWebViewClassLoader() { throw new RuntimeException("Stub!"); }
public  android.os.Looper getWebViewLooper() { throw new RuntimeException("Stub!"); }
public  android.webkit.WebViewProvider getWebViewProvider() { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
public  void setLayoutParams(android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void setOverScrollMode(int mode) { throw new RuntimeException("Stub!"); }
public  void setScrollBarStyle(int style) { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
public  void computeScroll() { throw new RuntimeException("Stub!"); }
public  boolean onHoverEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onGenericMotionEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  void onProvideVirtualStructure(android.view.ViewStructure structure) { throw new RuntimeException("Stub!"); }
public  void onProvideAutofillVirtualStructure(android.view.ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
public  void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> values) { throw new RuntimeException("Stub!"); }
public  boolean isVisibleToUserForAutofill(int virtualId) { throw new RuntimeException("Stub!"); }
protected  void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); }
protected  void onWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  boolean performLongClick() { throw new RuntimeException("Stub!"); }
protected  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) { throw new RuntimeException("Stub!"); }
public  boolean onDragEvent(android.view.DragEvent event) { throw new RuntimeException("Stub!"); }
protected  void onVisibilityChanged(android.view.View changedView, int visibility) { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
protected  void onSizeChanged(int w, int h, int ow, int oh) { throw new RuntimeException("Stub!"); }
protected  void onScrollChanged(int l, int t, int oldl, int oldt) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
public  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rect, boolean immediate) { throw new RuntimeException("Stub!"); }
public  void setBackgroundColor(int color) { throw new RuntimeException("Stub!"); }
public  void setLayerType(int layerType, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void onStartTemporaryDetach() { throw new RuntimeException("Stub!"); }
public  void onFinishTemporaryDetach() { throw new RuntimeException("Stub!"); }
public  android.os.Handler getHandler() { throw new RuntimeException("Stub!"); }
public  android.view.View findFocus() { throw new RuntimeException("Stub!"); }
public static  android.content.pm.PackageInfo getCurrentWebViewPackage() { throw new RuntimeException("Stub!"); }
public  boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); }
public static final int RENDERER_PRIORITY_BOUND = 1;
public static final int RENDERER_PRIORITY_IMPORTANT = 2;
public static final int RENDERER_PRIORITY_WAIVED = 0;
public static final java.lang.String SCHEME_GEO = "geo:0,0?q=";
public static final java.lang.String SCHEME_MAILTO = "mailto:";
public static final java.lang.String SCHEME_TEL = "tel:";
}
