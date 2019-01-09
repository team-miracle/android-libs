/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.app;
public class UiModeManager
{
UiModeManager() { throw new RuntimeException("Stub!"); }
public  void enableCarMode(int flags) { throw new RuntimeException("Stub!"); }
public  void disableCarMode(int flags) { throw new RuntimeException("Stub!"); }
public  int getCurrentModeType() { throw new RuntimeException("Stub!"); }
public  void setNightMode(int mode) { throw new RuntimeException("Stub!"); }
public  int getNightMode() { throw new RuntimeException("Stub!"); }
public static java.lang.String ACTION_ENTER_CAR_MODE;
public static java.lang.String ACTION_ENTER_DESK_MODE;
public static java.lang.String ACTION_EXIT_CAR_MODE;
public static java.lang.String ACTION_EXIT_DESK_MODE;
public static final int DISABLE_CAR_MODE_GO_HOME = 1;
public static final int ENABLE_CAR_MODE_ALLOW_SLEEP = 2;
public static final int ENABLE_CAR_MODE_GO_CAR_HOME = 1;
public static final int MODE_NIGHT_AUTO = 0;
public static final int MODE_NIGHT_NO = 1;
public static final int MODE_NIGHT_YES = 2;
}
