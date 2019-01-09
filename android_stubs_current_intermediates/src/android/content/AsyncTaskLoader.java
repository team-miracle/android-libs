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
public abstract class AsyncTaskLoader<D>
  extends android.content.Loader<D>
{
public  AsyncTaskLoader(android.content.Context context) { super((android.content.Context)null); throw new RuntimeException("Stub!"); }
public  void setUpdateThrottle(long delayMS) { throw new RuntimeException("Stub!"); }
protected  void onForceLoad() { throw new RuntimeException("Stub!"); }
protected  boolean onCancelLoad() { throw new RuntimeException("Stub!"); }
public  void onCanceled(D data) { throw new RuntimeException("Stub!"); }
public abstract  D loadInBackground();
protected  D onLoadInBackground() { throw new RuntimeException("Stub!"); }
public  void cancelLoadInBackground() { throw new RuntimeException("Stub!"); }
public  boolean isLoadInBackgroundCanceled() { throw new RuntimeException("Stub!"); }
public  void dump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
}
