/*
* Copyright (C) 2012 The Android Open Source Project
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
public final class CancellationSignal
{
public static interface OnCancelListener
{
public abstract  void onCancel();
}
public  CancellationSignal() { throw new RuntimeException("Stub!"); }
public  boolean isCanceled() { throw new RuntimeException("Stub!"); }
public  void throwIfCanceled() { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void setOnCancelListener(android.os.CancellationSignal.OnCancelListener listener) { throw new RuntimeException("Stub!"); }
}
