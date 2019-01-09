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

package android.os.storage;
public abstract class OnObbStateChangeListener
{
public  OnObbStateChangeListener() { throw new RuntimeException("Stub!"); }
public  void onObbStateChange(java.lang.String path, int state) { throw new RuntimeException("Stub!"); }
public static final int ERROR_ALREADY_MOUNTED = 24;
public static final int ERROR_COULD_NOT_MOUNT = 21;
public static final int ERROR_COULD_NOT_UNMOUNT = 22;
public static final int ERROR_INTERNAL = 20;
public static final int ERROR_NOT_MOUNTED = 23;
public static final int ERROR_PERMISSION_DENIED = 25;
public static final int MOUNTED = 1;
public static final int UNMOUNTED = 2;
}
