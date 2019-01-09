/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.database;
public class ContentObservable
  extends android.database.Observable<android.database.ContentObserver>
{
public  ContentObservable() { throw new RuntimeException("Stub!"); }
public  void registerObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void dispatchChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
public  void dispatchChange(boolean selfChange, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void notifyChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
}
