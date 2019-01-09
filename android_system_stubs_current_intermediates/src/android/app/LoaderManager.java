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

package android.app;
@java.lang.Deprecated()
public abstract class LoaderManager
{
@java.lang.Deprecated()
public static interface LoaderCallbacks<D>
{
public abstract  android.content.Loader<D> onCreateLoader(int id, android.os.Bundle args);
public abstract  void onLoadFinished(android.content.Loader<D> loader, D data);
public abstract  void onLoaderReset(android.content.Loader<D> loader);
}
public  LoaderManager() { throw new RuntimeException("Stub!"); }
public abstract <D> android.content.Loader<D> initLoader(int id, android.os.Bundle args, android.app.LoaderManager.LoaderCallbacks<D> callback);
public abstract <D> android.content.Loader<D> restartLoader(int id, android.os.Bundle args, android.app.LoaderManager.LoaderCallbacks<D> callback);
public abstract  void destroyLoader(int id);
public abstract <D> android.content.Loader<D> getLoader(int id);
public abstract  void dump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args);
public static  void enableDebugLogging(boolean enabled) { throw new RuntimeException("Stub!"); }
}
