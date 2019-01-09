/*
* Copyright (C) 2007 The Android Open Source Project
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
public abstract class WebSettings
{
public static enum LayoutAlgorithm
{
@java.lang.Deprecated()
NARROW_COLUMNS(),
NORMAL(),
@java.lang.Deprecated()
SINGLE_COLUMN(),
TEXT_AUTOSIZING();
}
@java.lang.Deprecated()
public static enum TextSize
{
LARGER(),
LARGEST(),
NORMAL(),
SMALLER(),
SMALLEST();
}
public static enum ZoomDensity
{
CLOSE(),
FAR(),
MEDIUM();
}
public static enum RenderPriority
{
HIGH(),
LOW(),
NORMAL();
}
public static enum PluginState
{
OFF(),
ON(),
ON_DEMAND();
}
public  WebSettings() { throw new RuntimeException("Stub!"); }
public abstract  void setSupportZoom(boolean support);
public abstract  boolean supportZoom();
public abstract  void setMediaPlaybackRequiresUserGesture(boolean require);
public abstract  boolean getMediaPlaybackRequiresUserGesture();
public abstract  void setBuiltInZoomControls(boolean enabled);
public abstract  boolean getBuiltInZoomControls();
public abstract  void setDisplayZoomControls(boolean enabled);
public abstract  boolean getDisplayZoomControls();
public abstract  void setAllowFileAccess(boolean allow);
public abstract  boolean getAllowFileAccess();
public abstract  void setAllowContentAccess(boolean allow);
public abstract  boolean getAllowContentAccess();
public abstract  void setLoadWithOverviewMode(boolean overview);
public abstract  boolean getLoadWithOverviewMode();
@java.lang.Deprecated()
public abstract  void setEnableSmoothTransition(boolean enable);
@java.lang.Deprecated()
public abstract  boolean enableSmoothTransition();
@java.lang.Deprecated()
public abstract  void setSaveFormData(boolean save);
@java.lang.Deprecated()
public abstract  boolean getSaveFormData();
@java.lang.Deprecated()
public abstract  void setSavePassword(boolean save);
@java.lang.Deprecated()
public abstract  boolean getSavePassword();
public abstract  void setTextZoom(int textZoom);
public abstract  int getTextZoom();
@java.lang.Deprecated()
public synchronized  void setTextSize(android.webkit.WebSettings.TextSize t) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public synchronized  android.webkit.WebSettings.TextSize getTextSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public abstract  void setDefaultZoom(android.webkit.WebSettings.ZoomDensity zoom);
@java.lang.Deprecated()
public abstract  android.webkit.WebSettings.ZoomDensity getDefaultZoom();
@java.lang.Deprecated()
public abstract  void setLightTouchEnabled(boolean enabled);
@java.lang.Deprecated()
public abstract  boolean getLightTouchEnabled();
public abstract  void setUseWideViewPort(boolean use);
public abstract  boolean getUseWideViewPort();
public abstract  void setSupportMultipleWindows(boolean support);
public abstract  boolean supportMultipleWindows();
public abstract  void setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm l);
public abstract  android.webkit.WebSettings.LayoutAlgorithm getLayoutAlgorithm();
public abstract  void setStandardFontFamily(java.lang.String font);
public abstract  java.lang.String getStandardFontFamily();
public abstract  void setFixedFontFamily(java.lang.String font);
public abstract  java.lang.String getFixedFontFamily();
public abstract  void setSansSerifFontFamily(java.lang.String font);
public abstract  java.lang.String getSansSerifFontFamily();
public abstract  void setSerifFontFamily(java.lang.String font);
public abstract  java.lang.String getSerifFontFamily();
public abstract  void setCursiveFontFamily(java.lang.String font);
public abstract  java.lang.String getCursiveFontFamily();
public abstract  void setFantasyFontFamily(java.lang.String font);
public abstract  java.lang.String getFantasyFontFamily();
public abstract  void setMinimumFontSize(int size);
public abstract  int getMinimumFontSize();
public abstract  void setMinimumLogicalFontSize(int size);
public abstract  int getMinimumLogicalFontSize();
public abstract  void setDefaultFontSize(int size);
public abstract  int getDefaultFontSize();
public abstract  void setDefaultFixedFontSize(int size);
public abstract  int getDefaultFixedFontSize();
public abstract  void setLoadsImagesAutomatically(boolean flag);
public abstract  boolean getLoadsImagesAutomatically();
public abstract  void setBlockNetworkImage(boolean flag);
public abstract  boolean getBlockNetworkImage();
public abstract  void setBlockNetworkLoads(boolean flag);
public abstract  boolean getBlockNetworkLoads();
public abstract  void setJavaScriptEnabled(boolean flag);
public abstract  void setAllowUniversalAccessFromFileURLs(boolean flag);
public abstract  void setAllowFileAccessFromFileURLs(boolean flag);
@java.lang.Deprecated()
public abstract  void setPluginState(android.webkit.WebSettings.PluginState state);
@java.lang.Deprecated()
public abstract  void setDatabasePath(java.lang.String databasePath);
@java.lang.Deprecated()
public abstract  void setGeolocationDatabasePath(java.lang.String databasePath);
public abstract  void setAppCacheEnabled(boolean flag);
public abstract  void setAppCachePath(java.lang.String appCachePath);
@java.lang.Deprecated()
public abstract  void setAppCacheMaxSize(long appCacheMaxSize);
public abstract  void setDatabaseEnabled(boolean flag);
public abstract  void setDomStorageEnabled(boolean flag);
public abstract  boolean getDomStorageEnabled();
@java.lang.Deprecated()
public abstract  java.lang.String getDatabasePath();
public abstract  boolean getDatabaseEnabled();
public abstract  void setGeolocationEnabled(boolean flag);
public abstract  boolean getJavaScriptEnabled();
public abstract  boolean getAllowUniversalAccessFromFileURLs();
public abstract  boolean getAllowFileAccessFromFileURLs();
@java.lang.Deprecated()
public abstract  android.webkit.WebSettings.PluginState getPluginState();
public abstract  void setJavaScriptCanOpenWindowsAutomatically(boolean flag);
public abstract  boolean getJavaScriptCanOpenWindowsAutomatically();
public abstract  void setDefaultTextEncodingName(java.lang.String encoding);
public abstract  java.lang.String getDefaultTextEncodingName();
public abstract  void setUserAgentString(java.lang.String ua);
public abstract  java.lang.String getUserAgentString();
public static  java.lang.String getDefaultUserAgent(android.content.Context context) { throw new RuntimeException("Stub!"); }
public abstract  void setNeedInitialFocus(boolean flag);
@java.lang.Deprecated()
public abstract  void setRenderPriority(android.webkit.WebSettings.RenderPriority priority);
public abstract  void setCacheMode(int mode);
public abstract  int getCacheMode();
public abstract  void setMixedContentMode(int mode);
public abstract  int getMixedContentMode();
public abstract  void setOffscreenPreRaster(boolean enabled);
public abstract  boolean getOffscreenPreRaster();
public abstract  void setSafeBrowsingEnabled(boolean enabled);
public abstract  boolean getSafeBrowsingEnabled();
public abstract  void setDisabledActionModeMenuItems(int menuItems);
public abstract  int getDisabledActionModeMenuItems();
public static final int LOAD_CACHE_ELSE_NETWORK = 1;
public static final int LOAD_CACHE_ONLY = 3;
public static final int LOAD_DEFAULT = -1;
@java.lang.Deprecated()
public static final int LOAD_NORMAL = 0;
public static final int LOAD_NO_CACHE = 2;
public static final int MENU_ITEM_NONE = 0;
public static final int MENU_ITEM_PROCESS_TEXT = 4;
public static final int MENU_ITEM_SHARE = 1;
public static final int MENU_ITEM_WEB_SEARCH = 2;
public static final int MIXED_CONTENT_ALWAYS_ALLOW = 0;
public static final int MIXED_CONTENT_COMPATIBILITY_MODE = 2;
public static final int MIXED_CONTENT_NEVER_ALLOW = 1;
}
