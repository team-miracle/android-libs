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
public final class CookieSyncManager
  extends android.webkit.WebSyncManager
{
CookieSyncManager() { super((android.content.Context)null,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public static  android.webkit.CookieSyncManager getInstance() { throw new RuntimeException("Stub!"); }
public static  android.webkit.CookieSyncManager createInstance(android.content.Context context) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void sync() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  void syncFromRamToFlash() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void resetSync() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void startSync() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void stopSync() { throw new RuntimeException("Stub!"); }
protected static final java.lang.String LOGTAG = "websync";
protected android.webkit.WebViewDatabase mDataBase;
protected android.os.Handler mHandler;
}
