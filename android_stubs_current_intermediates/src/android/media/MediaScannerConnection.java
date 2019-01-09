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

package android.media;
public class MediaScannerConnection
  implements android.content.ServiceConnection
{
public static interface OnScanCompletedListener
{
public abstract  void onScanCompleted(java.lang.String path, android.net.Uri uri);
}
public static interface MediaScannerConnectionClient
  extends android.media.MediaScannerConnection.OnScanCompletedListener
{
public abstract  void onMediaScannerConnected();
public abstract  void onScanCompleted(java.lang.String path, android.net.Uri uri);
}
public  MediaScannerConnection(android.content.Context context, android.media.MediaScannerConnection.MediaScannerConnectionClient client) { throw new RuntimeException("Stub!"); }
public  void connect() { throw new RuntimeException("Stub!"); }
public  void disconnect() { throw new RuntimeException("Stub!"); }
public synchronized  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  void scanFile(java.lang.String path, java.lang.String mimeType) { throw new RuntimeException("Stub!"); }
public static  void scanFile(android.content.Context context, java.lang.String[] paths, java.lang.String[] mimeTypes, android.media.MediaScannerConnection.OnScanCompletedListener callback) { throw new RuntimeException("Stub!"); }
public  void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) { throw new RuntimeException("Stub!"); }
public  void onServiceDisconnected(android.content.ComponentName className) { throw new RuntimeException("Stub!"); }
}
