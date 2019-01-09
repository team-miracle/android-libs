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
public abstract class ContentResolver
{
public  ContentResolver(android.content.Context context) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType(android.net.Uri url) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getStreamTypes(android.net.Uri url, java.lang.String mimeTypeFilter) { throw new RuntimeException("Stub!"); }
public final  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) { throw new RuntimeException("Stub!"); }
public final  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public final  android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, android.os.Bundle queryArgs, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public final  android.net.Uri canonicalize(android.net.Uri url) { throw new RuntimeException("Stub!"); }
public final  android.net.Uri uncanonicalize(android.net.Uri url) { throw new RuntimeException("Stub!"); }
public final  boolean refresh(android.net.Uri url, android.os.Bundle args, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
public final  java.io.InputStream openInputStream(android.net.Uri uri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  java.io.OutputStream openOutputStream(android.net.Uri uri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  java.io.OutputStream openOutputStream(android.net.Uri uri, java.lang.String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.os.ParcelFileDescriptor openFileDescriptor(android.net.Uri uri, java.lang.String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.os.ParcelFileDescriptor openFileDescriptor(android.net.Uri uri, java.lang.String mode, android.os.CancellationSignal cancellationSignal) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetFileDescriptor openAssetFileDescriptor(android.net.Uri uri, java.lang.String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetFileDescriptor openAssetFileDescriptor(android.net.Uri uri, java.lang.String mode, android.os.CancellationSignal cancellationSignal) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri uri, java.lang.String mimeType, android.os.Bundle opts) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri uri, java.lang.String mimeType, android.os.Bundle opts, android.os.CancellationSignal cancellationSignal) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public final  android.net.Uri insert(android.net.Uri url, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderResult[] applyBatch(java.lang.String authority, java.util.ArrayList<android.content.ContentProviderOperation> operations) throws android.os.RemoteException, android.content.OperationApplicationException { throw new RuntimeException("Stub!"); }
public final  int bulkInsert(android.net.Uri url, android.content.ContentValues[] values) { throw new RuntimeException("Stub!"); }
public final  int delete(android.net.Uri url, java.lang.String where, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public final  int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String where, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public final  android.os.Bundle call(android.net.Uri uri, java.lang.String method, java.lang.String arg, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public final  android.content.ContentProviderClient acquireContentProviderClient(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public final  android.content.ContentProviderClient acquireContentProviderClient(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final  android.content.ContentProviderClient acquireUnstableContentProviderClient(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public final  android.content.ContentProviderClient acquireUnstableContentProviderClient(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final  void registerContentObserver(android.net.Uri uri, boolean notifyForDescendants, android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public final  void unregisterContentObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void notifyChange(android.net.Uri uri, android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
public  void notifyChange(android.net.Uri uri, android.database.ContentObserver observer, boolean syncToNetwork) { throw new RuntimeException("Stub!"); }
public  void notifyChange(android.net.Uri uri, android.database.ContentObserver observer, int flags) { throw new RuntimeException("Stub!"); }
public  void takePersistableUriPermission(android.net.Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
public  void releasePersistableUriPermission(android.net.Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.UriPermission> getPersistedUriPermissions() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.UriPermission> getOutgoingPersistedUriPermissions() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void startSync(android.net.Uri uri, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public static  void requestSync(android.accounts.Account account, java.lang.String authority, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public static  void requestSync(android.content.SyncRequest request) { throw new RuntimeException("Stub!"); }
public static  void validateSyncExtrasBundle(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void cancelSync(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  void cancelSync(android.accounts.Account account, java.lang.String authority) { throw new RuntimeException("Stub!"); }
public static  android.content.SyncAdapterType[] getSyncAdapterTypes() { throw new RuntimeException("Stub!"); }
public static  boolean getSyncAutomatically(android.accounts.Account account, java.lang.String authority) { throw new RuntimeException("Stub!"); }
public static  void setSyncAutomatically(android.accounts.Account account, java.lang.String authority, boolean sync) { throw new RuntimeException("Stub!"); }
public static  void addPeriodicSync(android.accounts.Account account, java.lang.String authority, android.os.Bundle extras, long pollFrequency) { throw new RuntimeException("Stub!"); }
public static  void removePeriodicSync(android.accounts.Account account, java.lang.String authority, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public static  void cancelSync(android.content.SyncRequest request) { throw new RuntimeException("Stub!"); }
public static  java.util.List<android.content.PeriodicSync> getPeriodicSyncs(android.accounts.Account account, java.lang.String authority) { throw new RuntimeException("Stub!"); }
public static  int getIsSyncable(android.accounts.Account account, java.lang.String authority) { throw new RuntimeException("Stub!"); }
public static  void setIsSyncable(android.accounts.Account account, java.lang.String authority, int syncable) { throw new RuntimeException("Stub!"); }
public static  boolean getMasterSyncAutomatically() { throw new RuntimeException("Stub!"); }
public static  void setMasterSyncAutomatically(boolean sync) { throw new RuntimeException("Stub!"); }
public static  boolean isSyncActive(android.accounts.Account account, java.lang.String authority) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.content.SyncInfo getCurrentSync() { throw new RuntimeException("Stub!"); }
public static  java.util.List<android.content.SyncInfo> getCurrentSyncs() { throw new RuntimeException("Stub!"); }
public static  boolean isSyncPending(android.accounts.Account account, java.lang.String authority) { throw new RuntimeException("Stub!"); }
public static  java.lang.Object addStatusChangeListener(int mask, android.content.SyncStatusObserver callback) { throw new RuntimeException("Stub!"); }
public static  void removeStatusChangeListener(java.lang.Object handle) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ANY_CURSOR_ITEM_TYPE = "vnd.android.cursor.item/*";
public static final java.lang.String CURSOR_DIR_BASE_TYPE = "vnd.android.cursor.dir";
public static final java.lang.String CURSOR_ITEM_BASE_TYPE = "vnd.android.cursor.item";
public static final java.lang.String EXTRA_HONORED_ARGS = "android.content.extra.HONORED_ARGS";
public static final java.lang.String EXTRA_REFRESH_SUPPORTED = "android.content.extra.REFRESH_SUPPORTED";
public static final java.lang.String EXTRA_SIZE = "android.content.extra.SIZE";
public static final java.lang.String EXTRA_TOTAL_COUNT = "android.content.extra.TOTAL_COUNT";
public static final int NOTIFY_SKIP_NOTIFY_FOR_DESCENDANTS = 2;
public static final int NOTIFY_SYNC_TO_NETWORK = 1;
public static final java.lang.String QUERY_ARG_LIMIT = "android:query-arg-limit";
public static final java.lang.String QUERY_ARG_OFFSET = "android:query-arg-offset";
public static final java.lang.String QUERY_ARG_SORT_COLLATION = "android:query-arg-sort-collation";
public static final java.lang.String QUERY_ARG_SORT_COLUMNS = "android:query-arg-sort-columns";
public static final java.lang.String QUERY_ARG_SORT_DIRECTION = "android:query-arg-sort-direction";
public static final java.lang.String QUERY_ARG_SQL_SELECTION = "android:query-arg-sql-selection";
public static final java.lang.String QUERY_ARG_SQL_SELECTION_ARGS = "android:query-arg-sql-selection-args";
public static final java.lang.String QUERY_ARG_SQL_SORT_ORDER = "android:query-arg-sql-sort-order";
public static final int QUERY_SORT_DIRECTION_ASCENDING = 0;
public static final int QUERY_SORT_DIRECTION_DESCENDING = 1;
public static final java.lang.String SCHEME_ANDROID_RESOURCE = "android.resource";
public static final java.lang.String SCHEME_CONTENT = "content";
public static final java.lang.String SCHEME_FILE = "file";
@java.lang.Deprecated()
public static final java.lang.String SYNC_EXTRAS_ACCOUNT = "account";
public static final java.lang.String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = "discard_deletions";
public static final java.lang.String SYNC_EXTRAS_DO_NOT_RETRY = "do_not_retry";
public static final java.lang.String SYNC_EXTRAS_EXPEDITED = "expedited";
@java.lang.Deprecated()
public static final java.lang.String SYNC_EXTRAS_FORCE = "force";
public static final java.lang.String SYNC_EXTRAS_IGNORE_BACKOFF = "ignore_backoff";
public static final java.lang.String SYNC_EXTRAS_IGNORE_SETTINGS = "ignore_settings";
public static final java.lang.String SYNC_EXTRAS_INITIALIZE = "initialize";
public static final java.lang.String SYNC_EXTRAS_MANUAL = "force";
public static final java.lang.String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = "deletions_override";
public static final java.lang.String SYNC_EXTRAS_REQUIRE_CHARGING = "require_charging";
public static final java.lang.String SYNC_EXTRAS_UPLOAD = "upload";
public static final int SYNC_OBSERVER_TYPE_ACTIVE = 4;
public static final int SYNC_OBSERVER_TYPE_PENDING = 2;
public static final int SYNC_OBSERVER_TYPE_SETTINGS = 1;
}
