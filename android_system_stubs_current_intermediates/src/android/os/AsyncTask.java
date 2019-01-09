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
public abstract class AsyncTask<Params, Progress, Result>
{
public static enum Status
{
FINISHED(),
PENDING(),
RUNNING();
}
public  AsyncTask() { throw new RuntimeException("Stub!"); }
public final  android.os.AsyncTask.Status getStatus() { throw new RuntimeException("Stub!"); }
protected abstract  Result doInBackground(Params... params);
protected  void onPreExecute() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"UnusedDeclaration"})
protected  void onPostExecute(Result result) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"UnusedDeclaration"})
protected  void onProgressUpdate(Progress... values) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"UnusedParameters"})
protected  void onCancelled(Result result) { throw new RuntimeException("Stub!"); }
protected  void onCancelled() { throw new RuntimeException("Stub!"); }
public final  boolean isCancelled() { throw new RuntimeException("Stub!"); }
public final  boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); }
public final  Result get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException { throw new RuntimeException("Stub!"); }
public final  Result get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
public final  android.os.AsyncTask<Params, Progress, Result> execute(Params... params) { throw new RuntimeException("Stub!"); }
public final  android.os.AsyncTask<Params, Progress, Result> executeOnExecutor(java.util.concurrent.Executor exec, Params... params) { throw new RuntimeException("Stub!"); }
public static  void execute(java.lang.Runnable runnable) { throw new RuntimeException("Stub!"); }
protected final  void publishProgress(Progress... values) { throw new RuntimeException("Stub!"); }
public static final java.util.concurrent.Executor SERIAL_EXECUTOR;
public static final java.util.concurrent.Executor THREAD_POOL_EXECUTOR;
static { SERIAL_EXECUTOR = null; THREAD_POOL_EXECUTOR = null; }
}
