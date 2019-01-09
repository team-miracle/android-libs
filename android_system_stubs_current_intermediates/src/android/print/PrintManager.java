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
public final class PrintManager
{
public static interface PrintServicesChangeListener
{
public abstract  void onPrintServicesChanged();
}
public static interface PrintServiceRecommendationsChangeListener
{
public abstract  void onPrintServiceRecommendationsChanged();
}
PrintManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.print.PrintJob> getPrintJobs() { throw new RuntimeException("Stub!"); }
public  android.print.PrintJob print(java.lang.String printJobName, android.print.PrintDocumentAdapter documentAdapter, android.print.PrintAttributes attributes) { throw new RuntimeException("Stub!"); }
public  void addPrintServicesChangeListener(android.print.PrintManager.PrintServicesChangeListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void removePrintServicesChangeListener(android.print.PrintManager.PrintServicesChangeListener listener) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.printservice.PrintServiceInfo> getPrintServices(int selectionFlags) { throw new RuntimeException("Stub!"); }
public  void addPrintServiceRecommendationsChangeListener(android.print.PrintManager.PrintServiceRecommendationsChangeListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void removePrintServiceRecommendationsChangeListener(android.print.PrintManager.PrintServiceRecommendationsChangeListener listener) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.printservice.recommendation.RecommendationInfo> getPrintServiceRecommendations() { throw new RuntimeException("Stub!"); }
public static final int ENABLED_SERVICES = 1;
}
