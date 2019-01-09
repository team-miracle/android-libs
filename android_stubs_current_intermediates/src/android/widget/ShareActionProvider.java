/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.widget;
public class ShareActionProvider
  extends android.view.ActionProvider
{
public static interface OnShareTargetSelectedListener
{
public abstract  boolean onShareTargetSelected(android.widget.ShareActionProvider source, android.content.Intent intent);
}
public  ShareActionProvider(android.content.Context context) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  void setOnShareTargetSelectedListener(android.widget.ShareActionProvider.OnShareTargetSelectedListener listener) { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateActionView() { throw new RuntimeException("Stub!"); }
public  boolean hasSubMenu() { throw new RuntimeException("Stub!"); }
public  void onPrepareSubMenu(android.view.SubMenu subMenu) { throw new RuntimeException("Stub!"); }
public  void setShareHistoryFileName(java.lang.String shareHistoryFile) { throw new RuntimeException("Stub!"); }
public  void setShareIntent(android.content.Intent shareIntent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
}
