/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.provider;
@java.lang.Deprecated()
public final class LiveFolders
  implements android.provider.BaseColumns
{
LiveFolders() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CREATE_LIVE_FOLDER = "android.intent.action.CREATE_LIVE_FOLDER";
public static final java.lang.String DESCRIPTION = "description";
public static final int DISPLAY_MODE_GRID = 1;
public static final int DISPLAY_MODE_LIST = 2;
public static final java.lang.String EXTRA_LIVE_FOLDER_BASE_INTENT = "android.intent.extra.livefolder.BASE_INTENT";
public static final java.lang.String EXTRA_LIVE_FOLDER_DISPLAY_MODE = "android.intent.extra.livefolder.DISPLAY_MODE";
public static final java.lang.String EXTRA_LIVE_FOLDER_ICON = "android.intent.extra.livefolder.ICON";
public static final java.lang.String EXTRA_LIVE_FOLDER_NAME = "android.intent.extra.livefolder.NAME";
public static final java.lang.String ICON_BITMAP = "icon_bitmap";
public static final java.lang.String ICON_PACKAGE = "icon_package";
public static final java.lang.String ICON_RESOURCE = "icon_resource";
public static final java.lang.String INTENT = "intent";
public static final java.lang.String NAME = "name";
}
