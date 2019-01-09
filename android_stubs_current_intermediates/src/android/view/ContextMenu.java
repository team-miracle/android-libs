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

package android.view;
public interface ContextMenu
  extends android.view.Menu
{
public static interface ContextMenuInfo
{
}
public abstract  android.view.ContextMenu setHeaderTitle(int titleRes);
public abstract  android.view.ContextMenu setHeaderTitle(java.lang.CharSequence title);
public abstract  android.view.ContextMenu setHeaderIcon(int iconRes);
public abstract  android.view.ContextMenu setHeaderIcon(android.graphics.drawable.Drawable icon);
public abstract  android.view.ContextMenu setHeaderView(android.view.View view);
public abstract  void clearHeader();
}
