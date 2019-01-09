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
public class ContextWrapper
  extends android.content.Context
{
public  ContextWrapper(android.content.Context base) { throw new RuntimeException("Stub!"); }
protected  void attachBaseContext(android.content.Context base) { throw new RuntimeException("Stub!"); }
public  android.content.Context getBaseContext() { throw new RuntimeException("Stub!"); }
public  android.content.res.AssetManager getAssets() { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources getResources() { throw new RuntimeException("Stub!"); }
public  android.content.pm.PackageManager getPackageManager() { throw new RuntimeException("Stub!"); }
public  android.content.ContentResolver getContentResolver() { throw new RuntimeException("Stub!"); }
public  android.os.Looper getMainLooper() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Executor getMainExecutor() { throw new RuntimeException("Stub!"); }
public  android.content.Context getApplicationContext() { throw new RuntimeException("Stub!"); }
public  void setTheme(int resid) { throw new RuntimeException("Stub!"); }
public  android.content.res.Resources.Theme getTheme() { throw new RuntimeException("Stub!"); }
public  java.lang.ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  android.content.pm.ApplicationInfo getApplicationInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageResourcePath() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageCodePath() { throw new RuntimeException("Stub!"); }
public  android.content.SharedPreferences getSharedPreferences(java.lang.String name, int mode) { throw new RuntimeException("Stub!"); }
public  boolean moveSharedPreferencesFrom(android.content.Context sourceContext, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean deleteSharedPreferences(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.io.FileInputStream openFileInput(java.lang.String name) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  java.io.FileOutputStream openFileOutput(java.lang.String name, int mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  boolean deleteFile(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.io.File getFileStreamPath(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] fileList() { throw new RuntimeException("Stub!"); }
public  java.io.File getDataDir() { throw new RuntimeException("Stub!"); }
public  java.io.File getFilesDir() { throw new RuntimeException("Stub!"); }
public  java.io.File getNoBackupFilesDir() { throw new RuntimeException("Stub!"); }
public  java.io.File getExternalFilesDir(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  java.io.File[] getExternalFilesDirs(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  java.io.File getObbDir() { throw new RuntimeException("Stub!"); }
public  java.io.File[] getObbDirs() { throw new RuntimeException("Stub!"); }
public  java.io.File getCacheDir() { throw new RuntimeException("Stub!"); }
public  java.io.File getCodeCacheDir() { throw new RuntimeException("Stub!"); }
public  java.io.File getExternalCacheDir() { throw new RuntimeException("Stub!"); }
public  java.io.File[] getExternalCacheDirs() { throw new RuntimeException("Stub!"); }
public  java.io.File[] getExternalMediaDirs() { throw new RuntimeException("Stub!"); }
public  java.io.File getDir(java.lang.String name, int mode) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
public  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory, android.database.DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
public  boolean moveDatabaseFrom(android.content.Context sourceContext, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean deleteDatabase(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.io.File getDatabasePath(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] databaseList() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.graphics.drawable.Drawable getWallpaper() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.graphics.drawable.Drawable peekWallpaper() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getWallpaperDesiredMinimumWidth() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getWallpaperDesiredMinimumHeight() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setWallpaper(android.graphics.Bitmap bitmap) throws java.io.IOException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setWallpaper(java.io.InputStream data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void clearWallpaper() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void startActivity(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void startActivity(android.content.Intent intent, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  void startActivities(android.content.Intent[] intents) { throw new RuntimeException("Stub!"); }
public  void startActivities(android.content.Intent[] intents, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  void startIntentSender(android.content.IntentSender intent, android.content.Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
public  void startIntentSender(android.content.IntentSender intent, android.content.Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, android.os.Bundle options) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
public  void sendBroadcast(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void sendBroadcast(android.content.Intent intent, java.lang.String receiverPermission) { throw new RuntimeException("Stub!"); }
public  void sendOrderedBroadcast(android.content.Intent intent, java.lang.String receiverPermission) { throw new RuntimeException("Stub!"); }
public  void sendOrderedBroadcast(android.content.Intent intent, java.lang.String receiverPermission, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras) { throw new RuntimeException("Stub!"); }
public  void sendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void sendBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user, java.lang.String receiverPermission) { throw new RuntimeException("Stub!"); }
public  void sendOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user, java.lang.String receiverPermission, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void sendStickyBroadcast(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void sendStickyOrderedBroadcast(android.content.Intent intent, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void removeStickyBroadcast(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void sendStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void sendStickyOrderedBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void removeStickyBroadcastAsUser(android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter) { throw new RuntimeException("Stub!"); }
public  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter, java.lang.String broadcastPermission, android.os.Handler scheduler) { throw new RuntimeException("Stub!"); }
public  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter, java.lang.String broadcastPermission, android.os.Handler scheduler, int flags) { throw new RuntimeException("Stub!"); }
public  void unregisterReceiver(android.content.BroadcastReceiver receiver) { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName startService(android.content.Intent service) { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName startForegroundService(android.content.Intent service) { throw new RuntimeException("Stub!"); }
public  boolean stopService(android.content.Intent name) { throw new RuntimeException("Stub!"); }
public  boolean bindService(android.content.Intent service, android.content.ServiceConnection conn, int flags) { throw new RuntimeException("Stub!"); }
public  void unbindService(android.content.ServiceConnection conn) { throw new RuntimeException("Stub!"); }
public  boolean startInstrumentation(android.content.ComponentName className, java.lang.String profileFile, android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getSystemService(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSystemServiceName(java.lang.Class<?> serviceClass) { throw new RuntimeException("Stub!"); }
public  int checkPermission(java.lang.String permission, int pid, int uid) { throw new RuntimeException("Stub!"); }
public  int checkCallingPermission(java.lang.String permission) { throw new RuntimeException("Stub!"); }
public  int checkCallingOrSelfPermission(java.lang.String permission) { throw new RuntimeException("Stub!"); }
public  int checkSelfPermission(java.lang.String permission) { throw new RuntimeException("Stub!"); }
public  void enforcePermission(java.lang.String permission, int pid, int uid, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  void enforceCallingPermission(java.lang.String permission, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  void enforceCallingOrSelfPermission(java.lang.String permission, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  void grantUriPermission(java.lang.String toPackage, android.net.Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
public  void revokeUriPermission(android.net.Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
public  void revokeUriPermission(java.lang.String targetPackage, android.net.Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
public  int checkUriPermission(android.net.Uri uri, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); }
public  int checkCallingUriPermission(android.net.Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
public  int checkCallingOrSelfUriPermission(android.net.Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
public  int checkUriPermission(android.net.Uri uri, java.lang.String readPermission, java.lang.String writePermission, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); }
public  void enforceUriPermission(android.net.Uri uri, int pid, int uid, int modeFlags, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  void enforceCallingUriPermission(android.net.Uri uri, int modeFlags, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  void enforceCallingOrSelfUriPermission(android.net.Uri uri, int modeFlags, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  void enforceUriPermission(android.net.Uri uri, java.lang.String readPermission, java.lang.String writePermission, int pid, int uid, int modeFlags, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  android.content.Context createPackageContext(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.Context createConfigurationContext(android.content.res.Configuration overrideConfiguration) { throw new RuntimeException("Stub!"); }
public  android.content.Context createDisplayContext(android.view.Display display) { throw new RuntimeException("Stub!"); }
public  boolean isRestricted() { throw new RuntimeException("Stub!"); }
public  android.content.Context createDeviceProtectedStorageContext() { throw new RuntimeException("Stub!"); }
public  boolean isDeviceProtectedStorage() { throw new RuntimeException("Stub!"); }
public  android.content.Context createContextForSplit(java.lang.String splitName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
}
