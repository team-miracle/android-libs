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
public abstract class WebViewDatabase
{
public  WebViewDatabase() { throw new RuntimeException("Stub!"); }
public static  android.webkit.WebViewDatabase getInstance(android.content.Context context) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public abstract  boolean hasUsernamePassword();
@java.lang.Deprecated()
public abstract  void clearUsernamePassword();
public abstract  boolean hasHttpAuthUsernamePassword();
public abstract  void clearHttpAuthUsernamePassword();
public abstract  void setHttpAuthUsernamePassword(java.lang.String host, java.lang.String realm, java.lang.String username, java.lang.String password);
public abstract  java.lang.String[] getHttpAuthUsernamePassword(java.lang.String host, java.lang.String realm);
@java.lang.Deprecated()
public abstract  boolean hasFormData();
@java.lang.Deprecated()
public abstract  void clearFormData();
}
