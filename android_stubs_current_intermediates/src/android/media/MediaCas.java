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

package android.media;
public final class MediaCas
  implements java.lang.AutoCloseable
{
public static class PluginDescriptor
{
PluginDescriptor() { throw new RuntimeException("Stub!"); }
public  int getSystemId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public final class Session
  implements java.lang.AutoCloseable
{
Session() { throw new RuntimeException("Stub!"); }
public  void setPrivateData(byte[] data) throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  void processEcm(byte[] data, int offset, int length) throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  void processEcm(byte[] data) throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
}
public static interface EventListener
{
public abstract  void onEvent(android.media.MediaCas MediaCas, int event, int arg, byte[] data);
}
public  MediaCas(int CA_system_id) throws android.media.MediaCasException.UnsupportedCasException { throw new RuntimeException("Stub!"); }
public static  boolean isSystemIdSupported(int CA_system_id) { throw new RuntimeException("Stub!"); }
public static  android.media.MediaCas.PluginDescriptor[] enumeratePlugins() { throw new RuntimeException("Stub!"); }
public  void setEventListener(android.media.MediaCas.EventListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setPrivateData(byte[] data) throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  android.media.MediaCas.Session openSession() throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  void processEmm(byte[] data, int offset, int length) throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  void processEmm(byte[] data) throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  void sendEvent(int event, int arg, byte[] data) throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  void provision(java.lang.String provisionString) throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  void refreshEntitlements(int refreshType, byte[] refreshData) throws android.media.MediaCasException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
}
