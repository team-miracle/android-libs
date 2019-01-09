/*
* Copyright (C) 2009 The Android Open Source Project
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
public class WallpaperManager
{
public static interface OnColorsChangedListener
{
public abstract  void onColorsChanged(android.app.WallpaperColors colors, int which);
}
WallpaperManager() { throw new RuntimeException("Stub!"); }
public static  android.app.WallpaperManager getInstance(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDrawable() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getBuiltInDrawable() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getBuiltInDrawable(int which) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getBuiltInDrawable(int outWidth, int outHeight, boolean scaleToFit, float horizontalAlignment, float verticalAlignment) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getBuiltInDrawable(int outWidth, int outHeight, boolean scaleToFit, float horizontalAlignment, float verticalAlignment, int which) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable peekDrawable() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getFastDrawable() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable peekFastDrawable() { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor getWallpaperFile(int which) { throw new RuntimeException("Stub!"); }
public  void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener callback) { throw new RuntimeException("Stub!"); }
public  android.app.WallpaperColors getWallpaperColors(int which) { throw new RuntimeException("Stub!"); }
public  void forgetLoadedWallpaper() { throw new RuntimeException("Stub!"); }
public  android.app.WallpaperInfo getWallpaperInfo() { throw new RuntimeException("Stub!"); }
public  int getWallpaperId(int which) { throw new RuntimeException("Stub!"); }
public  android.content.Intent getCropAndSetWallpaperIntent(android.net.Uri imageUri) { throw new RuntimeException("Stub!"); }
public  void setResource(int resid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int setResource(int resid, int which) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setBitmap(android.graphics.Bitmap bitmap) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int setBitmap(android.graphics.Bitmap fullImage, android.graphics.Rect visibleCropHint, boolean allowBackup) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int setBitmap(android.graphics.Bitmap fullImage, android.graphics.Rect visibleCropHint, boolean allowBackup, int which) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setStream(java.io.InputStream bitmapData) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int setStream(java.io.InputStream bitmapData, android.graphics.Rect visibleCropHint, boolean allowBackup) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int setStream(java.io.InputStream bitmapData, android.graphics.Rect visibleCropHint, boolean allowBackup, int which) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean hasResourceWallpaper(int resid) { throw new RuntimeException("Stub!"); }
public  int getDesiredMinimumWidth() { throw new RuntimeException("Stub!"); }
public  int getDesiredMinimumHeight() { throw new RuntimeException("Stub!"); }
public  void suggestDesiredDimensions(int minimumWidth, int minimumHeight) { throw new RuntimeException("Stub!"); }
public  void setDisplayPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  void clearWallpaper() { throw new RuntimeException("Stub!"); }
public  void setWallpaperOffsets(android.os.IBinder windowToken, float xOffset, float yOffset) { throw new RuntimeException("Stub!"); }
public  void setWallpaperOffsetSteps(float xStep, float yStep) { throw new RuntimeException("Stub!"); }
public  void sendWallpaperCommand(android.os.IBinder windowToken, java.lang.String action, int x, int y, int z, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  boolean isWallpaperSupported() { throw new RuntimeException("Stub!"); }
public  boolean isSetWallpaperAllowed() { throw new RuntimeException("Stub!"); }
public  void clearWallpaperOffsets(android.os.IBinder windowToken) { throw new RuntimeException("Stub!"); }
public  void clear() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void clear(int which) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CHANGE_LIVE_WALLPAPER = "android.service.wallpaper.CHANGE_LIVE_WALLPAPER";
public static final java.lang.String ACTION_CROP_AND_SET_WALLPAPER = "android.service.wallpaper.CROP_AND_SET_WALLPAPER";
public static final java.lang.String ACTION_LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";
public static final java.lang.String COMMAND_DROP = "android.home.drop";
public static final java.lang.String COMMAND_SECONDARY_TAP = "android.wallpaper.secondaryTap";
public static final java.lang.String COMMAND_TAP = "android.wallpaper.tap";
public static final java.lang.String EXTRA_LIVE_WALLPAPER_COMPONENT = "android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT";
public static final int FLAG_LOCK = 2;
public static final int FLAG_SYSTEM = 1;
public static final java.lang.String WALLPAPER_PREVIEW_META_DATA = "android.wallpaper.preview";
}
