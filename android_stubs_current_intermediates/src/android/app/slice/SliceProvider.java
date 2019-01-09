/*
* Copyright (C) 2017 The Android Open Source Project
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
package android.app.slice;
public abstract class SliceProvider
  extends android.content.ContentProvider
{
public  SliceProvider(java.lang.String... autoGrantPermissions) { throw new RuntimeException("Stub!"); }
public  SliceProvider() { throw new RuntimeException("Stub!"); }
public  void attachInfo(android.content.Context context, android.content.pm.ProviderInfo info) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice onBindSlice(android.net.Uri sliceUri, java.util.Set<android.app.slice.SliceSpec> supportedSpecs) { throw new RuntimeException("Stub!"); }
public  void onSlicePinned(android.net.Uri sliceUri) { throw new RuntimeException("Stub!"); }
public  void onSliceUnpinned(android.net.Uri sliceUri) { throw new RuntimeException("Stub!"); }
public  java.util.Collection<android.net.Uri> onGetSliceDescendants(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.net.Uri onMapIntentToUri(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  android.app.PendingIntent onCreatePermissionRequest(android.net.Uri sliceUri) { throw new RuntimeException("Stub!"); }
public final  int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public final  int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public final  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) { throw new RuntimeException("Stub!"); }
public final  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public final  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, android.os.Bundle queryArgs, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public final  android.net.Uri insert(android.net.Uri uri, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle call(java.lang.String method, java.lang.String arg, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SLICE_TYPE = "vnd.android.slice";
}
