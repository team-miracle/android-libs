/*
* Copyright (C) 2017 The Android Open Source Project
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
package android.service.autofill;
public abstract class AutofillService
  extends android.app.Service
{
public  AutofillService() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onConnected() { throw new RuntimeException("Stub!"); }
public abstract  void onFillRequest(android.service.autofill.FillRequest request, android.os.CancellationSignal cancellationSignal, android.service.autofill.FillCallback callback);
public abstract  void onSaveRequest(android.service.autofill.SaveRequest request, android.service.autofill.SaveCallback callback);
public  void onDisconnected() { throw new RuntimeException("Stub!"); }
public final  android.service.autofill.FillEventHistory getFillEventHistory() { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.AutofillService";
public static final java.lang.String SERVICE_META_DATA = "android.autofill";
}
