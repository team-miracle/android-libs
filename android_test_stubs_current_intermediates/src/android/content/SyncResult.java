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

package android.content;
public final class SyncResult
  implements android.os.Parcelable
{
public  SyncResult() { throw new RuntimeException("Stub!"); }
public  boolean hasHardError() { throw new RuntimeException("Stub!"); }
public  boolean hasSoftError() { throw new RuntimeException("Stub!"); }
public  boolean hasError() { throw new RuntimeException("Stub!"); }
public  boolean madeSomeProgress() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toDebugString() { throw new RuntimeException("Stub!"); }
public static final android.content.SyncResult ALREADY_IN_PROGRESS;
public static final android.os.Parcelable.Creator<android.content.SyncResult> CREATOR;
public boolean databaseError;
public long delayUntil;
public boolean fullSyncRequested;
public boolean moreRecordsToGet;
public boolean partialSyncUnavailable;
public final android.content.SyncStats stats;
public final boolean syncAlreadyInProgress;
public boolean tooManyDeletions;
public boolean tooManyRetries;
static { ALREADY_IN_PROGRESS = null; CREATOR = null; }
}
