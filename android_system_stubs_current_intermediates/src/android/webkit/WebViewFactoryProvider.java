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
public interface WebViewFactoryProvider
{
public static interface Statics
{
public abstract  java.lang.String findAddress(java.lang.String addr);
public abstract  java.lang.String getDefaultUserAgent(android.content.Context context);
public abstract  void freeMemoryForTests();
public abstract  void setWebContentsDebuggingEnabled(boolean enable);
public abstract  void clearClientCertPreferences(java.lang.Runnable onCleared);
public abstract  void enableSlowWholeDocumentDraw();
public abstract  android.net.Uri[] parseFileChooserResult(int resultCode, android.content.Intent intent);
public abstract  void initSafeBrowsing(android.content.Context context, android.webkit.ValueCallback<java.lang.Boolean> callback);
public abstract  void setSafeBrowsingWhitelist(java.util.List<java.lang.String> hosts, android.webkit.ValueCallback<java.lang.Boolean> callback);
public abstract  android.net.Uri getSafeBrowsingPrivacyPolicyUrl();
}
public abstract  android.webkit.WebViewFactoryProvider.Statics getStatics();
public abstract  android.webkit.WebViewProvider createWebView(android.webkit.WebView webView, android.webkit.WebView.PrivateAccess privateAccess);
public abstract  android.webkit.GeolocationPermissions getGeolocationPermissions();
public abstract  android.webkit.CookieManager getCookieManager();
public abstract  android.webkit.TokenBindingService getTokenBindingService();
public abstract  android.webkit.TracingController getTracingController();
public abstract  android.webkit.ServiceWorkerController getServiceWorkerController();
public abstract  android.webkit.WebIconDatabase getWebIconDatabase();
public abstract  android.webkit.WebStorage getWebStorage();
public abstract  android.webkit.WebViewDatabase getWebViewDatabase(android.content.Context context);
public abstract  java.lang.ClassLoader getWebViewClassLoader();
}
