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
@java.lang.Deprecated()
 abstract class WebSyncManager
  implements java.lang.Runnable
{
protected  WebSyncManager(android.content.Context context, java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public  void run() { throw new RuntimeException("Stub!"); }
public  void sync() { throw new RuntimeException("Stub!"); }
public  void resetSync() { throw new RuntimeException("Stub!"); }
public  void startSync() { throw new RuntimeException("Stub!"); }
public  void stopSync() { throw new RuntimeException("Stub!"); }
protected  void onSyncInit() { throw new RuntimeException("Stub!"); }
protected static final java.lang.String LOGTAG = "websync";
protected android.webkit.WebViewDatabase mDataBase;
protected android.os.Handler mHandler;
}
