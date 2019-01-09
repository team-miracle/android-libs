/*
* Copyright 2017 The Android Open Source Project
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
package android.hardware.location;
public class ContextHubTransaction<T>
{
public static class Response<R>
{
Response() { throw new RuntimeException("Stub!"); }
public  int getResult() { throw new RuntimeException("Stub!"); }
public  R getContents() { throw new RuntimeException("Stub!"); }
}
@java.lang.FunctionalInterface()
public static interface OnCompleteListener<L>
{
public abstract  void onComplete(android.hardware.location.ContextHubTransaction<L> transaction, android.hardware.location.ContextHubTransaction.Response<L> response);
}
ContextHubTransaction() { throw new RuntimeException("Stub!"); }
public static  java.lang.String typeToString(int type, boolean upperCase) { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  android.hardware.location.ContextHubTransaction.Response<T> waitForResponse(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
public  void setOnCompleteListener(android.hardware.location.ContextHubTransaction.OnCompleteListener<T> listener, java.util.concurrent.Executor executor) { throw new RuntimeException("Stub!"); }
public  void setOnCompleteListener(android.hardware.location.ContextHubTransaction.OnCompleteListener<T> listener) { throw new RuntimeException("Stub!"); }
public static final int RESULT_FAILED_AT_HUB = 5;
public static final int RESULT_FAILED_BAD_PARAMS = 2;
public static final int RESULT_FAILED_BUSY = 4;
public static final int RESULT_FAILED_HAL_UNAVAILABLE = 8;
public static final int RESULT_FAILED_SERVICE_INTERNAL_FAILURE = 7;
public static final int RESULT_FAILED_TIMEOUT = 6;
public static final int RESULT_FAILED_UNINITIALIZED = 3;
public static final int RESULT_FAILED_UNKNOWN = 1;
public static final int RESULT_SUCCESS = 0;
public static final int TYPE_DISABLE_NANOAPP = 3;
public static final int TYPE_ENABLE_NANOAPP = 2;
public static final int TYPE_LOAD_NANOAPP = 0;
public static final int TYPE_QUERY_NANOAPPS = 4;
public static final int TYPE_UNLOAD_NANOAPP = 1;
}
