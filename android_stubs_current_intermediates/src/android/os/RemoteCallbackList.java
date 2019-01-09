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

package android.os;
public class RemoteCallbackList<E extends android.os.IInterface>
{
public  RemoteCallbackList() { throw new RuntimeException("Stub!"); }
public  boolean register(E callback) { throw new RuntimeException("Stub!"); }
public  boolean register(E callback, java.lang.Object cookie) { throw new RuntimeException("Stub!"); }
public  boolean unregister(E callback) { throw new RuntimeException("Stub!"); }
public  void kill() { throw new RuntimeException("Stub!"); }
public  void onCallbackDied(E callback) { throw new RuntimeException("Stub!"); }
public  void onCallbackDied(E callback, java.lang.Object cookie) { throw new RuntimeException("Stub!"); }
public  int beginBroadcast() { throw new RuntimeException("Stub!"); }
public  E getBroadcastItem(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getBroadcastCookie(int index) { throw new RuntimeException("Stub!"); }
public  void finishBroadcast() { throw new RuntimeException("Stub!"); }
public  int getRegisteredCallbackCount() { throw new RuntimeException("Stub!"); }
public  E getRegisteredCallbackItem(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getRegisteredCallbackCookie(int index) { throw new RuntimeException("Stub!"); }
}
