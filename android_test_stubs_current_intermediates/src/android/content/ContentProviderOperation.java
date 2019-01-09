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
public class ContentProviderOperation
  implements android.os.Parcelable
{
public static class Builder
{
Builder() { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderOperation build() { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderOperation.Builder withValueBackReferences(android.content.ContentValues backReferences) { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderOperation.Builder withValueBackReference(java.lang.String key, int previousResult) { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderOperation.Builder withSelectionBackReference(int selectionArgIndex, int previousResult) { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderOperation.Builder withValues(android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderOperation.Builder withValue(java.lang.String key, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderOperation.Builder withSelection(java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderOperation.Builder withExpectedCount(int count) { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderOperation.Builder withYieldAllowed(boolean yieldAllowed) { throw new RuntimeException("Stub!"); }
}
ContentProviderOperation() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static  android.content.ContentProviderOperation.Builder newInsert(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  android.content.ContentProviderOperation.Builder newUpdate(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  android.content.ContentProviderOperation.Builder newDelete(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  android.content.ContentProviderOperation.Builder newAssertQuery(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.net.Uri getUri() { throw new RuntimeException("Stub!"); }
public  boolean isYieldAllowed() { throw new RuntimeException("Stub!"); }
public  boolean isInsert() { throw new RuntimeException("Stub!"); }
public  boolean isDelete() { throw new RuntimeException("Stub!"); }
public  boolean isUpdate() { throw new RuntimeException("Stub!"); }
public  boolean isAssertQuery() { throw new RuntimeException("Stub!"); }
public  boolean isWriteOperation() { throw new RuntimeException("Stub!"); }
public  boolean isReadOperation() { throw new RuntimeException("Stub!"); }
public  android.content.ContentProviderResult apply(android.content.ContentProvider provider, android.content.ContentProviderResult[] backRefs, int numBackRefs) throws android.content.OperationApplicationException { throw new RuntimeException("Stub!"); }
public  android.content.ContentValues resolveValueBackReferences(android.content.ContentProviderResult[] backRefs, int numBackRefs) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] resolveSelectionArgsBackReferences(android.content.ContentProviderResult[] backRefs, int numBackRefs) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.ContentProviderOperation> CREATOR;
static { CREATOR = null; }
}
