/*
* Copyright (C) 2013 The Android Open Source Project
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
public class JsDialogHelper
{
public  JsDialogHelper(android.webkit.JsPromptResult result, int type, java.lang.String defaultValue, java.lang.String message, java.lang.String url) { throw new RuntimeException("Stub!"); }
public  JsDialogHelper(android.webkit.JsPromptResult result, android.os.Message msg) { throw new RuntimeException("Stub!"); }
public  boolean invokeCallback(android.webkit.WebChromeClient client, android.webkit.WebView webView) { throw new RuntimeException("Stub!"); }
public  void showDialog(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static final int ALERT = 1;
public static final int CONFIRM = 2;
public static final int PROMPT = 3;
public static final int UNLOAD = 4;
}
