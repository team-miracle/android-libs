/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.print;
public abstract class PrintDocumentAdapter
{
public abstract static class WriteResultCallback
{
WriteResultCallback() { throw new RuntimeException("Stub!"); }
public  void onWriteFinished(android.print.PageRange[] pages) { throw new RuntimeException("Stub!"); }
public  void onWriteFailed(java.lang.CharSequence error) { throw new RuntimeException("Stub!"); }
public  void onWriteCancelled() { throw new RuntimeException("Stub!"); }
}
public abstract static class LayoutResultCallback
{
LayoutResultCallback() { throw new RuntimeException("Stub!"); }
public  void onLayoutFinished(android.print.PrintDocumentInfo info, boolean changed) { throw new RuntimeException("Stub!"); }
public  void onLayoutFailed(java.lang.CharSequence error) { throw new RuntimeException("Stub!"); }
public  void onLayoutCancelled() { throw new RuntimeException("Stub!"); }
}
public  PrintDocumentAdapter() { throw new RuntimeException("Stub!"); }
public  void onStart() { throw new RuntimeException("Stub!"); }
public abstract  void onLayout(android.print.PrintAttributes oldAttributes, android.print.PrintAttributes newAttributes, android.os.CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.LayoutResultCallback callback, android.os.Bundle extras);
public abstract  void onWrite(android.print.PageRange[] pages, android.os.ParcelFileDescriptor destination, android.os.CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.WriteResultCallback callback);
public  void onFinish() { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_PRINT_PREVIEW = "EXTRA_PRINT_PREVIEW";
}
