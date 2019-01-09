/*
* Copyright (C) 2010 The Android Open Source Project
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
@java.lang.Deprecated()
public class Loader<D>
{
@java.lang.Deprecated()
public final class ForceLoadContentObserver
  extends android.database.ContentObserver
{
public  ForceLoadContentObserver() { super((android.os.Handler)null); throw new RuntimeException("Stub!"); }
public  boolean deliverSelfNotifications() { throw new RuntimeException("Stub!"); }
public  void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
}
@java.lang.Deprecated()
public static interface OnLoadCompleteListener<D>
{
public abstract  void onLoadComplete(android.content.Loader<D> loader, D data);
}
@java.lang.Deprecated()
public static interface OnLoadCanceledListener<D>
{
public abstract  void onLoadCanceled(android.content.Loader<D> loader);
}
public  Loader(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void deliverResult(D data) { throw new RuntimeException("Stub!"); }
public  void deliverCancellation() { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  void registerListener(int id, android.content.Loader.OnLoadCompleteListener<D> listener) { throw new RuntimeException("Stub!"); }
public  void unregisterListener(android.content.Loader.OnLoadCompleteListener<D> listener) { throw new RuntimeException("Stub!"); }
public  void registerOnLoadCanceledListener(android.content.Loader.OnLoadCanceledListener<D> listener) { throw new RuntimeException("Stub!"); }
public  void unregisterOnLoadCanceledListener(android.content.Loader.OnLoadCanceledListener<D> listener) { throw new RuntimeException("Stub!"); }
public  boolean isStarted() { throw new RuntimeException("Stub!"); }
public  boolean isAbandoned() { throw new RuntimeException("Stub!"); }
public  boolean isReset() { throw new RuntimeException("Stub!"); }
public final  void startLoading() { throw new RuntimeException("Stub!"); }
protected  void onStartLoading() { throw new RuntimeException("Stub!"); }
public  boolean cancelLoad() { throw new RuntimeException("Stub!"); }
protected  boolean onCancelLoad() { throw new RuntimeException("Stub!"); }
public  void forceLoad() { throw new RuntimeException("Stub!"); }
protected  void onForceLoad() { throw new RuntimeException("Stub!"); }
public  void stopLoading() { throw new RuntimeException("Stub!"); }
protected  void onStopLoading() { throw new RuntimeException("Stub!"); }
public  void abandon() { throw new RuntimeException("Stub!"); }
protected  void onAbandon() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
protected  void onReset() { throw new RuntimeException("Stub!"); }
public  boolean takeContentChanged() { throw new RuntimeException("Stub!"); }
public  void commitContentChanged() { throw new RuntimeException("Stub!"); }
public  void rollbackContentChanged() { throw new RuntimeException("Stub!"); }
public  void onContentChanged() { throw new RuntimeException("Stub!"); }
public  java.lang.String dataToString(D data) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void dump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
}
