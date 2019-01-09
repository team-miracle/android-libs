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

package android.os;
public class DropBoxManager
{
public static class Entry
  implements android.os.Parcelable, java.io.Closeable
{
public  Entry(java.lang.String tag, long millis) { throw new RuntimeException("Stub!"); }
public  Entry(java.lang.String tag, long millis, java.lang.String text) { throw new RuntimeException("Stub!"); }
public  Entry(java.lang.String tag, long millis, byte[] data, int flags) { throw new RuntimeException("Stub!"); }
public  Entry(java.lang.String tag, long millis, android.os.ParcelFileDescriptor data, int flags) { throw new RuntimeException("Stub!"); }
public  Entry(java.lang.String tag, long millis, java.io.File data, int flags) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTag() { throw new RuntimeException("Stub!"); }
public  long getTimeMillis() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  java.lang.String getText(int maxBytes) { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getInputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.DropBoxManager.Entry> CREATOR;
static { CREATOR = null; }
}
protected  DropBoxManager() { throw new RuntimeException("Stub!"); }
public  void addText(java.lang.String tag, java.lang.String data) { throw new RuntimeException("Stub!"); }
public  void addData(java.lang.String tag, byte[] data, int flags) { throw new RuntimeException("Stub!"); }
public  void addFile(java.lang.String tag, java.io.File file, int flags) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isTagEnabled(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  android.os.DropBoxManager.Entry getNextEntry(java.lang.String tag, long msec) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_DROPBOX_ENTRY_ADDED = "android.intent.action.DROPBOX_ENTRY_ADDED";
public static final java.lang.String EXTRA_TAG = "tag";
public static final java.lang.String EXTRA_TIME = "time";
public static final int IS_EMPTY = 1;
public static final int IS_GZIPPED = 4;
public static final int IS_TEXT = 2;
}
