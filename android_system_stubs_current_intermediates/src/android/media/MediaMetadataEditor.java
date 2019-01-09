/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.media;
@java.lang.Deprecated()
public abstract class MediaMetadataEditor
{
MediaMetadataEditor() { throw new RuntimeException("Stub!"); }
public abstract  void apply();
public synchronized  void clear() { throw new RuntimeException("Stub!"); }
public synchronized  void addEditableKey(int key) { throw new RuntimeException("Stub!"); }
public synchronized  void removeEditableKeys() { throw new RuntimeException("Stub!"); }
public synchronized  int[] getEditableKeys() { throw new RuntimeException("Stub!"); }
public synchronized  android.media.MediaMetadataEditor putString(int key, java.lang.String value) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  android.media.MediaMetadataEditor putLong(int key, long value) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  android.media.MediaMetadataEditor putBitmap(int key, android.graphics.Bitmap bitmap) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  android.media.MediaMetadataEditor putObject(int key, java.lang.Object value) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  long getLong(int key, long defaultValue) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getString(int key, java.lang.String defaultValue) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  android.graphics.Bitmap getBitmap(int key, android.graphics.Bitmap defaultValue) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.Object getObject(int key, java.lang.Object defaultValue) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public static final int BITMAP_KEY_ARTWORK = 100;
public static final int RATING_KEY_BY_OTHERS = 101;
public static final int RATING_KEY_BY_USER = 268435457;
}
