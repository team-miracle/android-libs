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
public abstract class AbstractThreadedSyncAdapter
{
public  AbstractThreadedSyncAdapter(android.content.Context context, boolean autoInitialize) { throw new RuntimeException("Stub!"); }
public  AbstractThreadedSyncAdapter(android.content.Context context, boolean autoInitialize, boolean allowParallelSyncs) { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder getSyncAdapterBinder() { throw new RuntimeException("Stub!"); }
public  boolean onUnsyncableAccount() { throw new RuntimeException("Stub!"); }
public abstract  void onPerformSync(android.accounts.Account account, android.os.Bundle extras, java.lang.String authority, android.content.ContentProviderClient provider, android.content.SyncResult syncResult);
public  void onSecurityException(android.accounts.Account account, android.os.Bundle extras, java.lang.String authority, android.content.SyncResult syncResult) { throw new RuntimeException("Stub!"); }
public  void onSyncCanceled() { throw new RuntimeException("Stub!"); }
public  void onSyncCanceled(java.lang.Thread thread) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static final int LOG_SYNC_DETAILS = 2743;
}
