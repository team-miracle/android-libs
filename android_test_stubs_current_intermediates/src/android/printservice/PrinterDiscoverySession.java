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
public abstract class PrinterDiscoverySession
{
public  PrinterDiscoverySession() { throw new RuntimeException("Stub!"); }
public final  java.util.List<android.print.PrinterInfo> getPrinters() { throw new RuntimeException("Stub!"); }
public final  void addPrinters(java.util.List<android.print.PrinterInfo> printers) { throw new RuntimeException("Stub!"); }
public final  void removePrinters(java.util.List<android.print.PrinterId> printerIds) { throw new RuntimeException("Stub!"); }
public abstract  void onStartPrinterDiscovery(java.util.List<android.print.PrinterId> priorityList);
public abstract  void onStopPrinterDiscovery();
public abstract  void onValidatePrinters(java.util.List<android.print.PrinterId> printerIds);
public abstract  void onStartPrinterStateTracking(android.print.PrinterId printerId);
public  void onRequestCustomPrinterIcon(android.print.PrinterId printerId, android.os.CancellationSignal cancellationSignal, android.printservice.CustomPrinterIconCallback callback) { throw new RuntimeException("Stub!"); }
public abstract  void onStopPrinterStateTracking(android.print.PrinterId printerId);
public final  java.util.List<android.print.PrinterId> getTrackedPrinters() { throw new RuntimeException("Stub!"); }
public abstract  void onDestroy();
public final  boolean isDestroyed() { throw new RuntimeException("Stub!"); }
public final  boolean isPrinterDiscoveryStarted() { throw new RuntimeException("Stub!"); }
}
