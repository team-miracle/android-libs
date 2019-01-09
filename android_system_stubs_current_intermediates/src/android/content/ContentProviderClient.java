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

package android.content;
public class ContentProviderClient
  implements java.lang.AutoCloseable
{
ContentProviderClient() { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.net.Uri url, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder, android.os.CancellationSignal cancellationSignal) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, android.os.Bundle queryArgs, android.os.CancellationSignal cancellationSignal) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  java.lang.String getType(android.net.Uri url) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getStreamTypes(android.net.Uri url, java.lang.String mimeTypeFilter) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public final  android.net.Uri canonicalize(android.net.Uri url) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public final  android.net.Uri uncanonicalize(android.net.Uri url) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  boolean refresh(android.net.Uri url, android.os.Bundle args, android.os.CancellationSignal cancellationSignal) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.net.Uri insert(android.net.Uri url, android.content.ContentValues initialValues) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int bulkInsert(android.net.Uri url, android.content.ContentValues[] initialValues) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int delete(android.net.Uri url, java.lang.String selection, java.lang.String[] selectionArgs) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int update(android.net.Uri url, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor openFile(android.net.Uri url, java.lang.String mode) throws android.os.RemoteException, java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  android.os.ParcelFileDescriptor openFile(android.net.Uri url, java.lang.String mode, android.os.CancellationSignal signal) throws android.os.RemoteException, java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri url, java.lang.String mode) throws android.os.RemoteException, java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri url, java.lang.String mode, android.os.CancellationSignal signal) throws android.os.RemoteException, java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri uri, java.lang.String mimeType, android.os.Bundle opts) throws android.os.RemoteException, java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri uri, java.lang.String mimeType, android.os.Bundle opts, android.os.CancellationSignal signal) throws android.os.RemoteException, java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderResult[] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> operations) throws android.os.RemoteException, android.content.OperationApplicationException { throw new RuntimeException("Stub!"); }
public  android.os.Bundle call(java.lang.String method, java.lang.String arg, android.os.Bundle extras) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean release() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  android.content.ContentProvider getLocalContentProvider() { throw new RuntimeException("Stub!"); }
}
