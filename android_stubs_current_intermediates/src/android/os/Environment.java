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

package android.os;
public class Environment
{
public  Environment() { throw new RuntimeException("Stub!"); }
public static  java.io.File getRootDirectory() { throw new RuntimeException("Stub!"); }
public static  java.io.File getDataDirectory() { throw new RuntimeException("Stub!"); }
public static  java.io.File getExternalStorageDirectory() { throw new RuntimeException("Stub!"); }
public static  java.io.File getExternalStoragePublicDirectory(java.lang.String type) { throw new RuntimeException("Stub!"); }
public static  java.io.File getDownloadCacheDirectory() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getExternalStorageState() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  java.lang.String getStorageState(java.io.File path) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getExternalStorageState(java.io.File path) { throw new RuntimeException("Stub!"); }
public static  boolean isExternalStorageRemovable() { throw new RuntimeException("Stub!"); }
public static  boolean isExternalStorageRemovable(java.io.File path) { throw new RuntimeException("Stub!"); }
public static  boolean isExternalStorageEmulated() { throw new RuntimeException("Stub!"); }
public static  boolean isExternalStorageEmulated(java.io.File path) { throw new RuntimeException("Stub!"); }
public static java.lang.String DIRECTORY_ALARMS;
public static java.lang.String DIRECTORY_DCIM;
public static java.lang.String DIRECTORY_DOCUMENTS;
public static java.lang.String DIRECTORY_DOWNLOADS;
public static java.lang.String DIRECTORY_MOVIES;
public static java.lang.String DIRECTORY_MUSIC;
public static java.lang.String DIRECTORY_NOTIFICATIONS;
public static java.lang.String DIRECTORY_PICTURES;
public static java.lang.String DIRECTORY_PODCASTS;
public static java.lang.String DIRECTORY_RINGTONES;
public static final java.lang.String MEDIA_BAD_REMOVAL = "bad_removal";
public static final java.lang.String MEDIA_CHECKING = "checking";
public static final java.lang.String MEDIA_EJECTING = "ejecting";
public static final java.lang.String MEDIA_MOUNTED = "mounted";
public static final java.lang.String MEDIA_MOUNTED_READ_ONLY = "mounted_ro";
public static final java.lang.String MEDIA_NOFS = "nofs";
public static final java.lang.String MEDIA_REMOVED = "removed";
public static final java.lang.String MEDIA_SHARED = "shared";
public static final java.lang.String MEDIA_UNKNOWN = "unknown";
public static final java.lang.String MEDIA_UNMOUNTABLE = "unmountable";
public static final java.lang.String MEDIA_UNMOUNTED = "unmounted";
}
