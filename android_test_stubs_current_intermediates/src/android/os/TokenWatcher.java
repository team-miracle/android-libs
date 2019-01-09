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

package android.os;
public abstract class TokenWatcher
{
public  TokenWatcher(android.os.Handler h, java.lang.String tag) { throw new RuntimeException("Stub!"); }
public abstract  void acquired();
public abstract  void released();
public  void acquire(android.os.IBinder token, java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  void cleanup(android.os.IBinder token, boolean unlink) { throw new RuntimeException("Stub!"); }
public  void release(android.os.IBinder token) { throw new RuntimeException("Stub!"); }
public  boolean isAcquired() { throw new RuntimeException("Stub!"); }
public  void dump() { throw new RuntimeException("Stub!"); }
public  void dump(java.io.PrintWriter pw) { throw new RuntimeException("Stub!"); }
}
