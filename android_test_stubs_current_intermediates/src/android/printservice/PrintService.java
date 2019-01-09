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

package android.printservice;
public abstract class PrintService
  extends android.app.Service
{
public  PrintService() { throw new RuntimeException("Stub!"); }
protected final  void attachBaseContext(android.content.Context base) { throw new RuntimeException("Stub!"); }
protected  void onConnected() { throw new RuntimeException("Stub!"); }
protected  void onDisconnected() { throw new RuntimeException("Stub!"); }
protected abstract  android.printservice.PrinterDiscoverySession onCreatePrinterDiscoverySession();
protected abstract  void onRequestCancelPrintJob(android.printservice.PrintJob printJob);
protected abstract  void onPrintJobQueued(android.printservice.PrintJob printJob);
public final  java.util.List<android.printservice.PrintJob> getActivePrintJobs() { throw new RuntimeException("Stub!"); }
public final  android.print.PrinterId generatePrinterId(java.lang.String localId) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_CAN_SELECT_PRINTER = "android.printservice.extra.CAN_SELECT_PRINTER";
public static final java.lang.String EXTRA_PRINTER_INFO = "android.intent.extra.print.EXTRA_PRINTER_INFO";
public static final java.lang.String EXTRA_PRINT_DOCUMENT_INFO = "android.printservice.extra.PRINT_DOCUMENT_INFO";
public static final java.lang.String EXTRA_PRINT_JOB_INFO = "android.intent.extra.print.PRINT_JOB_INFO";
public static final java.lang.String EXTRA_SELECT_PRINTER = "android.printservice.extra.SELECT_PRINTER";
public static final java.lang.String SERVICE_INTERFACE = "android.printservice.PrintService";
public static final java.lang.String SERVICE_META_DATA = "android.printservice";
}
