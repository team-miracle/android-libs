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
public abstract class CookieManager
{
public  CookieManager() { throw new RuntimeException("Stub!"); }
protected  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public static  android.webkit.CookieManager getInstance() { throw new RuntimeException("Stub!"); }
public abstract  void setAcceptCookie(boolean accept);
public abstract  boolean acceptCookie();
public abstract  void setAcceptThirdPartyCookies(android.webkit.WebView webview, boolean accept);
public abstract  boolean acceptThirdPartyCookies(android.webkit.WebView webview);
public abstract  void setCookie(java.lang.String url, java.lang.String value);
public abstract  void setCookie(java.lang.String url, java.lang.String value, android.webkit.ValueCallback<java.lang.Boolean> callback);
public abstract  java.lang.String getCookie(java.lang.String url);
@java.lang.Deprecated()
public abstract  void removeSessionCookie();
public abstract  void removeSessionCookies(android.webkit.ValueCallback<java.lang.Boolean> callback);
@java.lang.Deprecated()
public abstract  void removeAllCookie();
public abstract  void removeAllCookies(android.webkit.ValueCallback<java.lang.Boolean> callback);
public abstract  boolean hasCookies();
@java.lang.Deprecated()
public abstract  void removeExpiredCookie();
public abstract  void flush();
public static  boolean allowFileSchemeCookies() { throw new RuntimeException("Stub!"); }
public static  void setAcceptFileSchemeCookies(boolean accept) { throw new RuntimeException("Stub!"); }
}
