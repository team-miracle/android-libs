/*
* Copyright (C) 2014 The Android Open Source Project
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
public abstract class SearchIndexableData
{
public  SearchIndexableData() { throw new RuntimeException("Stub!"); }
public  SearchIndexableData(android.content.Context ctx) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public java.lang.String className;
public android.content.Context context;
public boolean enabled;
public int iconResId;
public java.lang.String intentAction;
public java.lang.String intentTargetClass;
public java.lang.String intentTargetPackage;
public java.lang.String key;
public java.util.Locale locale;
public java.lang.String packageName;
public int rank;
public int userId;
}
