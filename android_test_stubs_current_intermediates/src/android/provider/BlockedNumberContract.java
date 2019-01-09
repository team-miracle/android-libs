/*
* Copyright (C) 2016 The Android Open Source Project
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
* limitations under the License
*/
package android.provider;
public class BlockedNumberContract
{
public static class BlockedNumbers
{
BlockedNumbers() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_E164_NUMBER = "e164_number";
public static final java.lang.String COLUMN_ID = "_id";
public static final java.lang.String COLUMN_ORIGINAL_NUMBER = "original_number";
public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/blocked_number";
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/blocked_number";
public static final android.net.Uri CONTENT_URI;
static { CONTENT_URI = null; }
}
BlockedNumberContract() { throw new RuntimeException("Stub!"); }
public static  boolean isBlocked(android.content.Context context, java.lang.String phoneNumber) { throw new RuntimeException("Stub!"); }
public static  int unblock(android.content.Context context, java.lang.String phoneNumber) { throw new RuntimeException("Stub!"); }
public static  boolean canCurrentUserBlockNumbers(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUTHORITY = "com.android.blockednumber";
public static final android.net.Uri AUTHORITY_URI;
static { AUTHORITY_URI = null; }
}
