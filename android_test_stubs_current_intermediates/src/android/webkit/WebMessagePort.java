/*
* Copyright (C) 2015 The Android Open Source Project
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
public abstract class WebMessagePort
{
public abstract static class WebMessageCallback
{
public  WebMessageCallback() { throw new RuntimeException("Stub!"); }
public  void onMessage(android.webkit.WebMessagePort port, android.webkit.WebMessage message) { throw new RuntimeException("Stub!"); }
}
WebMessagePort() { throw new RuntimeException("Stub!"); }
public abstract  void postMessage(android.webkit.WebMessage message);
public abstract  void close();
public abstract  void setWebMessageCallback(android.webkit.WebMessagePort.WebMessageCallback callback);
public abstract  void setWebMessageCallback(android.webkit.WebMessagePort.WebMessageCallback callback, android.os.Handler handler);
}
