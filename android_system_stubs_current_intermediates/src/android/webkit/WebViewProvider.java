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

package android.webkit;
public interface WebViewProvider
{
public static interface ViewDelegate
{
public abstract  boolean shouldDelayChildPressedState();
public abstract  void onProvideVirtualStructure(android.view.ViewStructure structure);
default public  void onProvideAutofillVirtualStructure(@java.lang.SuppressWarnings(value={"unused"})
android.view.ViewStructure structure, @java.lang.SuppressWarnings(value={"unused"})
int flags) { throw new RuntimeException("Stub!"); }
default public  void autofill(@java.lang.SuppressWarnings(value={"unused"})
android.util.SparseArray<android.view.autofill.AutofillValue> values) { throw new RuntimeException("Stub!"); }
default public  boolean isVisibleToUserForAutofill(@java.lang.SuppressWarnings(value={"unused"})
int virtualId) { throw new RuntimeException("Stub!"); }
public abstract  android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider();
public abstract  void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo info);
public abstract  void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent event);
public abstract  boolean performAccessibilityAction(int action, android.os.Bundle arguments);
public abstract  void setOverScrollMode(int mode);
public abstract  void setScrollBarStyle(int style);
public abstract  void onDrawVerticalScrollBar(android.graphics.Canvas canvas, android.graphics.drawable.Drawable scrollBar, int l, int t, int r, int b);
public abstract  void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY);
public abstract  void onWindowVisibilityChanged(int visibility);
public abstract  void onDraw(android.graphics.Canvas canvas);
public abstract  void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams);
public abstract  boolean performLongClick();
public abstract  void onConfigurationChanged(android.content.res.Configuration newConfig);
public abstract  android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs);
public abstract  boolean onDragEvent(android.view.DragEvent event);
public abstract  boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event);
public abstract  boolean onKeyDown(int keyCode, android.view.KeyEvent event);
public abstract  boolean onKeyUp(int keyCode, android.view.KeyEvent event);
public abstract  void onAttachedToWindow();
public abstract  void onDetachedFromWindow();
default public  void onMovedToDisplay(int displayId, android.content.res.Configuration config) { throw new RuntimeException("Stub!"); }
public abstract  void onVisibilityChanged(android.view.View changedView, int visibility);
public abstract  void onWindowFocusChanged(boolean hasWindowFocus);
public abstract  void onFocusChanged(boolean focused, int direction, android.graphics.Rect previouslyFocusedRect);
public abstract  boolean setFrame(int left, int top, int right, int bottom);
public abstract  void onSizeChanged(int w, int h, int ow, int oh);
public abstract  void onScrollChanged(int l, int t, int oldl, int oldt);
public abstract  boolean dispatchKeyEvent(android.view.KeyEvent event);
public abstract  boolean onTouchEvent(android.view.MotionEvent ev);
public abstract  boolean onHoverEvent(android.view.MotionEvent event);
public abstract  boolean onGenericMotionEvent(android.view.MotionEvent event);
public abstract  boolean onTrackballEvent(android.view.MotionEvent ev);
public abstract  boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect);
public abstract  void onMeasure(int widthMeasureSpec, int heightMeasureSpec);
public abstract  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rect, boolean immediate);
public abstract  void setBackgroundColor(int color);
public abstract  void setLayerType(int layerType, android.graphics.Paint paint);
public abstract  void preDispatchDraw(android.graphics.Canvas canvas);
public abstract  void onStartTemporaryDetach();
public abstract  void onFinishTemporaryDetach();
public abstract  void onActivityResult(int requestCode, int resultCode, android.content.Intent data);
public abstract  android.os.Handler getHandler(android.os.Handler originalHandler);
public abstract  android.view.View findFocus(android.view.View originalFocusedView);
@java.lang.SuppressWarnings(value={"unused"})
default public  boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); }
}
public static interface ScrollDelegate
{
public abstract  int computeHorizontalScrollRange();
public abstract  int computeHorizontalScrollOffset();
public abstract  int computeVerticalScrollRange();
public abstract  int computeVerticalScrollOffset();
public abstract  int computeVerticalScrollExtent();
public abstract  void computeScroll();
}
public abstract  void init(java.util.Map<java.lang.String, java.lang.Object> javaScriptInterfaces, boolean privateBrowsing);
public abstract  void setHorizontalScrollbarOverlay(boolean overlay);
public abstract  void setVerticalScrollbarOverlay(boolean overlay);
public abstract  boolean overlayHorizontalScrollbar();
public abstract  boolean overlayVerticalScrollbar();
public abstract  int getVisibleTitleHeight();
public abstract  android.net.http.SslCertificate getCertificate();
public abstract  void setCertificate(android.net.http.SslCertificate certificate);
public abstract  void savePassword(java.lang.String host, java.lang.String username, java.lang.String password);
public abstract  void setHttpAuthUsernamePassword(java.lang.String host, java.lang.String realm, java.lang.String username, java.lang.String password);
public abstract  java.lang.String[] getHttpAuthUsernamePassword(java.lang.String host, java.lang.String realm);
public abstract  void destroy();
public abstract  void setNetworkAvailable(boolean networkUp);
public abstract  android.webkit.WebBackForwardList saveState(android.os.Bundle outState);
public abstract  boolean savePicture(android.os.Bundle b, java.io.File dest);
public abstract  boolean restorePicture(android.os.Bundle b, java.io.File src);
public abstract  android.webkit.WebBackForwardList restoreState(android.os.Bundle inState);
public abstract  void loadUrl(java.lang.String url, java.util.Map<java.lang.String, java.lang.String> additionalHttpHeaders);
public abstract  void loadUrl(java.lang.String url);
public abstract  void postUrl(java.lang.String url, byte[] postData);
public abstract  void loadData(java.lang.String data, java.lang.String mimeType, java.lang.String encoding);
public abstract  void loadDataWithBaseURL(java.lang.String baseUrl, java.lang.String data, java.lang.String mimeType, java.lang.String encoding, java.lang.String historyUrl);
public abstract  void evaluateJavaScript(java.lang.String script, android.webkit.ValueCallback<java.lang.String> resultCallback);
public abstract  void saveWebArchive(java.lang.String filename);
public abstract  void saveWebArchive(java.lang.String basename, boolean autoname, android.webkit.ValueCallback<java.lang.String> callback);
public abstract  void stopLoading();
public abstract  void reload();
public abstract  boolean canGoBack();
public abstract  void goBack();
public abstract  boolean canGoForward();
public abstract  void goForward();
public abstract  boolean canGoBackOrForward(int steps);
public abstract  void goBackOrForward(int steps);
public abstract  boolean isPrivateBrowsingEnabled();
public abstract  boolean pageUp(boolean top);
public abstract  boolean pageDown(boolean bottom);
public abstract  void insertVisualStateCallback(long requestId, android.webkit.WebView.VisualStateCallback callback);
public abstract  void clearView();
public abstract  android.graphics.Picture capturePicture();
public abstract  android.print.PrintDocumentAdapter createPrintDocumentAdapter(java.lang.String documentName);
public abstract  float getScale();
public abstract  void setInitialScale(int scaleInPercent);
public abstract  void invokeZoomPicker();
public abstract  android.webkit.WebView.HitTestResult getHitTestResult();
public abstract  void requestFocusNodeHref(android.os.Message hrefMsg);
public abstract  void requestImageRef(android.os.Message msg);
public abstract  java.lang.String getUrl();
public abstract  java.lang.String getOriginalUrl();
public abstract  java.lang.String getTitle();
public abstract  android.graphics.Bitmap getFavicon();
public abstract  java.lang.String getTouchIconUrl();
public abstract  int getProgress();
public abstract  int getContentHeight();
public abstract  int getContentWidth();
public abstract  void pauseTimers();
public abstract  void resumeTimers();
public abstract  void onPause();
public abstract  void onResume();
public abstract  boolean isPaused();
public abstract  void freeMemory();
public abstract  void clearCache(boolean includeDiskFiles);
public abstract  void clearFormData();
public abstract  void clearHistory();
public abstract  void clearSslPreferences();
public abstract  android.webkit.WebBackForwardList copyBackForwardList();
public abstract  void setFindListener(android.webkit.WebView.FindListener listener);
public abstract  void findNext(boolean forward);
public abstract  int findAll(java.lang.String find);
public abstract  void findAllAsync(java.lang.String find);
public abstract  boolean showFindDialog(java.lang.String text, boolean showIme);
public abstract  void clearMatches();
public abstract  void documentHasImages(android.os.Message response);
public abstract  void setWebViewClient(android.webkit.WebViewClient client);
public abstract  android.webkit.WebViewClient getWebViewClient();
public abstract  void setDownloadListener(android.webkit.DownloadListener listener);
public abstract  void setWebChromeClient(android.webkit.WebChromeClient client);
public abstract  android.webkit.WebChromeClient getWebChromeClient();
public abstract  void setPictureListener(android.webkit.WebView.PictureListener listener);
public abstract  void addJavascriptInterface(java.lang.Object obj, java.lang.String interfaceName);
public abstract  void removeJavascriptInterface(java.lang.String interfaceName);
public abstract  android.webkit.WebMessagePort[] createWebMessageChannel();
public abstract  void postMessageToMainFrame(android.webkit.WebMessage message, android.net.Uri targetOrigin);
public abstract  android.webkit.WebSettings getSettings();
public abstract  void setMapTrackballToArrowKeys(boolean setMap);
public abstract  void flingScroll(int vx, int vy);
public abstract  android.view.View getZoomControls();
public abstract  boolean canZoomIn();
public abstract  boolean canZoomOut();
public abstract  boolean zoomBy(float zoomFactor);
public abstract  boolean zoomIn();
public abstract  boolean zoomOut();
public abstract  void dumpViewHierarchyWithProperties(java.io.BufferedWriter out, int level);
public abstract  android.view.View findHierarchyView(java.lang.String className, int hashCode);
public abstract  void setRendererPriorityPolicy(int rendererRequestedPriority, boolean waivedWhenNotVisible);
public abstract  int getRendererRequestedPriority();
public abstract  boolean getRendererPriorityWaivedWhenNotVisible();
@java.lang.SuppressWarnings(value={"unused"})
default public  void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) { throw new RuntimeException("Stub!"); }
default public  android.view.textclassifier.TextClassifier getTextClassifier() { throw new RuntimeException("Stub!"); }
public abstract  android.webkit.WebViewProvider.ViewDelegate getViewDelegate();
public abstract  android.webkit.WebViewProvider.ScrollDelegate getScrollDelegate();
public abstract  void notifyFindDialogDismissed();
}
