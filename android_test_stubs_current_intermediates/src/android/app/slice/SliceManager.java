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
public class SliceManager
{
SliceManager() { throw new RuntimeException("Stub!"); }
public  void pinSlice(android.net.Uri uri, java.util.Set<android.app.slice.SliceSpec> specs) { throw new RuntimeException("Stub!"); }
public  void unpinSlice(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  java.util.Set<android.app.slice.SliceSpec> getPinnedSpecs(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.net.Uri> getPinnedSlices() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<android.net.Uri> getSliceDescendants(android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice bindSlice(android.net.Uri uri, java.util.Set<android.app.slice.SliceSpec> supportedSpecs) { throw new RuntimeException("Stub!"); }
public  android.net.Uri mapIntentToUri(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  android.app.slice.Slice bindSlice(android.content.Intent intent, java.util.Set<android.app.slice.SliceSpec> supportedSpecs) { throw new RuntimeException("Stub!"); }
public  int checkSlicePermission(android.net.Uri uri, int pid, int uid) { throw new RuntimeException("Stub!"); }
public  void grantSlicePermission(java.lang.String toPackage, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  void revokeSlicePermission(java.lang.String toPackage, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CATEGORY_SLICE = "android.app.slice.category.SLICE";
public static final java.lang.String SLICE_METADATA_KEY = "android.metadata.SLICE_URI";
}
