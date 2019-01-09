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

package android.content;
public interface ComponentCallbacks2
  extends android.content.ComponentCallbacks
{
public abstract  void onTrimMemory(int level);
public static final int TRIM_MEMORY_BACKGROUND = 40;
public static final int TRIM_MEMORY_COMPLETE = 80;
public static final int TRIM_MEMORY_MODERATE = 60;
public static final int TRIM_MEMORY_RUNNING_CRITICAL = 15;
public static final int TRIM_MEMORY_RUNNING_LOW = 10;
public static final int TRIM_MEMORY_RUNNING_MODERATE = 5;
public static final int TRIM_MEMORY_UI_HIDDEN = 20;
}
