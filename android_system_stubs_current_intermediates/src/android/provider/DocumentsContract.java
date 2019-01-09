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

package android.provider;
public final class DocumentsContract
{
public static final class Document
{
Document() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_DISPLAY_NAME = "_display_name";
public static final java.lang.String COLUMN_DOCUMENT_ID = "document_id";
public static final java.lang.String COLUMN_FLAGS = "flags";
public static final java.lang.String COLUMN_ICON = "icon";
public static final java.lang.String COLUMN_LAST_MODIFIED = "last_modified";
public static final java.lang.String COLUMN_MIME_TYPE = "mime_type";
public static final java.lang.String COLUMN_SIZE = "_size";
public static final java.lang.String COLUMN_SUMMARY = "summary";
public static final int FLAG_DIR_PREFERS_GRID = 16;
public static final int FLAG_DIR_PREFERS_LAST_MODIFIED = 32;
public static final int FLAG_DIR_SUPPORTS_CREATE = 8;
public static final int FLAG_SUPPORTS_COPY = 128;
public static final int FLAG_SUPPORTS_DELETE = 4;
public static final int FLAG_SUPPORTS_MOVE = 256;
public static final int FLAG_SUPPORTS_REMOVE = 1024;
public static final int FLAG_SUPPORTS_RENAME = 64;
public static final int FLAG_SUPPORTS_SETTINGS = 2048;
public static final int FLAG_SUPPORTS_THUMBNAIL = 1;
public static final int FLAG_SUPPORTS_WRITE = 2;
public static final int FLAG_VIRTUAL_DOCUMENT = 512;
public static final int FLAG_WEB_LINKABLE = 4096;
public static final java.lang.String MIME_TYPE_DIR = "vnd.android.document/directory";
}
public static final class Root
{
Root() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_AVAILABLE_BYTES = "available_bytes";
public static final java.lang.String COLUMN_CAPACITY_BYTES = "capacity_bytes";
public static final java.lang.String COLUMN_DOCUMENT_ID = "document_id";
public static final java.lang.String COLUMN_FLAGS = "flags";
public static final java.lang.String COLUMN_ICON = "icon";
public static final java.lang.String COLUMN_MIME_TYPES = "mime_types";
public static final java.lang.String COLUMN_ROOT_ID = "root_id";
public static final java.lang.String COLUMN_SUMMARY = "summary";
public static final java.lang.String COLUMN_TITLE = "title";
public static final int FLAG_LOCAL_ONLY = 2;
public static final int FLAG_SUPPORTS_CREATE = 1;
public static final int FLAG_SUPPORTS_EJECT = 32;
public static final int FLAG_SUPPORTS_IS_CHILD = 16;
public static final int FLAG_SUPPORTS_RECENTS = 4;
public static final int FLAG_SUPPORTS_SEARCH = 8;
public static final java.lang.String MIME_TYPE_ITEM = "vnd.android.document/root";
}
public static final class Path
  implements android.os.Parcelable
{
public  Path(java.lang.String rootId, java.util.List<java.lang.String> path) { throw new RuntimeException("Stub!"); }
public  java.lang.String getRootId() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getPath() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.provider.DocumentsContract.Path> CREATOR;
static { CREATOR = null; }
}
DocumentsContract() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildRootsUri(java.lang.String authority) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildRootUri(java.lang.String authority, java.lang.String rootId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildRecentDocumentsUri(java.lang.String authority, java.lang.String rootId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildTreeDocumentUri(java.lang.String authority, java.lang.String documentId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildDocumentUri(java.lang.String authority, java.lang.String documentId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildDocumentUriUsingTree(android.net.Uri treeUri, java.lang.String documentId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildChildDocumentsUri(java.lang.String authority, java.lang.String parentDocumentId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildChildDocumentsUriUsingTree(android.net.Uri treeUri, java.lang.String parentDocumentId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri buildSearchDocumentsUri(java.lang.String authority, java.lang.String rootId, java.lang.String query) { throw new RuntimeException("Stub!"); }
public static  boolean isDocumentUri(android.content.Context context, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  boolean isTreeUri(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getRootId(android.net.Uri rootUri) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDocumentId(android.net.Uri documentUri) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getTreeDocumentId(android.net.Uri documentUri) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getSearchDocumentsQuery(android.net.Uri searchDocumentsUri) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap getDocumentThumbnail(android.content.ContentResolver resolver, android.net.Uri documentUri, android.graphics.Point size, android.os.CancellationSignal signal) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  android.net.Uri createDocument(android.content.ContentResolver resolver, android.net.Uri parentDocumentUri, java.lang.String mimeType, java.lang.String displayName) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  android.net.Uri renameDocument(android.content.ContentResolver resolver, android.net.Uri documentUri, java.lang.String displayName) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean deleteDocument(android.content.ContentResolver resolver, android.net.Uri documentUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  android.net.Uri copyDocument(android.content.ContentResolver resolver, android.net.Uri sourceDocumentUri, android.net.Uri targetParentDocumentUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  android.net.Uri moveDocument(android.content.ContentResolver resolver, android.net.Uri sourceDocumentUri, android.net.Uri sourceParentDocumentUri, android.net.Uri targetParentDocumentUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  boolean removeDocument(android.content.ContentResolver resolver, android.net.Uri documentUri, android.net.Uri parentDocumentUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  void ejectRoot(android.content.ContentResolver resolver, android.net.Uri rootUri) { throw new RuntimeException("Stub!"); }
public static  android.provider.DocumentsContract.Path findDocumentPath(android.content.ContentResolver resolver, android.net.Uri treeUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  android.content.IntentSender createWebLinkIntent(android.content.ContentResolver resolver, android.net.Uri uri, android.os.Bundle options) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_DOCUMENT_SETTINGS = "android.provider.action.DOCUMENT_SETTINGS";
public static final java.lang.String EXTRA_ERROR = "error";
public static final java.lang.String EXTRA_EXCLUDE_SELF = "android.provider.extra.EXCLUDE_SELF";
public static final java.lang.String EXTRA_INFO = "info";
public static final java.lang.String EXTRA_INITIAL_URI = "android.provider.extra.INITIAL_URI";
public static final java.lang.String EXTRA_LOADING = "loading";
public static final java.lang.String EXTRA_ORIENTATION = "android.provider.extra.ORIENTATION";
public static final java.lang.String EXTRA_PROMPT = "android.provider.extra.PROMPT";
public static final java.lang.String PROVIDER_INTERFACE = "android.content.action.DOCUMENTS_PROVIDER";
}
