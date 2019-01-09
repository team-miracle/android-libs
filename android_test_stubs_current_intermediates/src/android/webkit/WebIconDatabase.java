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
@java.lang.Deprecated()
public abstract class WebIconDatabase
{
@java.lang.Deprecated()
public static interface IconListener
{
public abstract  void onReceivedIcon(java.lang.String url, android.graphics.Bitmap icon);
}
public  WebIconDatabase() { throw new RuntimeException("Stub!"); }
public abstract  void open(java.lang.String path);
public abstract  void close();
public abstract  void removeAllIcons();
public abstract  void requestIconForPageUrl(java.lang.String url, android.webkit.WebIconDatabase.IconListener listener);
public abstract  void retainIconForPageUrl(java.lang.String url);
public abstract  void releaseIconForPageUrl(java.lang.String url);
public static  android.webkit.WebIconDatabase getInstance() { throw new RuntimeException("Stub!"); }
}
