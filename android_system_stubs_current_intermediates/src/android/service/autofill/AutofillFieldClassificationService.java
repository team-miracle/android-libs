/*
* Copyright (C) 2018 The Android Open Source Project
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
public abstract class AutofillFieldClassificationService
  extends android.app.Service
{
AutofillFieldClassificationService() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  float[][] onGetScores(java.lang.String algorithm, android.os.Bundle algorithmOptions, java.util.List<android.view.autofill.AutofillValue> actualValues, java.util.List<java.lang.String> userDataValues) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.AutofillFieldClassificationService";
public static final java.lang.String SERVICE_META_DATA_KEY_AVAILABLE_ALGORITHMS = "android.autofill.field_classification.available_algorithms";
public static final java.lang.String SERVICE_META_DATA_KEY_DEFAULT_ALGORITHM = "android.autofill.field_classification.default_algorithm";
}
