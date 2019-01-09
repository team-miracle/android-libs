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

package android.service.textclassifier;
public abstract class TextClassifierService
  extends android.app.Service
{
public static interface Callback<T>
{
public abstract  void onSuccess(T result);
public abstract  void onFailure(java.lang.CharSequence error);
}
public  TextClassifierService() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  void onSuggestSelection(android.view.textclassifier.TextClassificationSessionId sessionId, android.view.textclassifier.TextSelection.Request request, android.os.CancellationSignal cancellationSignal, android.service.textclassifier.TextClassifierService.Callback<android.view.textclassifier.TextSelection> callback);
public abstract  void onClassifyText(android.view.textclassifier.TextClassificationSessionId sessionId, android.view.textclassifier.TextClassification.Request request, android.os.CancellationSignal cancellationSignal, android.service.textclassifier.TextClassifierService.Callback<android.view.textclassifier.TextClassification> callback);
public abstract  void onGenerateLinks(android.view.textclassifier.TextClassificationSessionId sessionId, android.view.textclassifier.TextLinks.Request request, android.os.CancellationSignal cancellationSignal, android.service.textclassifier.TextClassifierService.Callback<android.view.textclassifier.TextLinks> callback);
public  void onSelectionEvent(android.view.textclassifier.TextClassificationSessionId sessionId, android.view.textclassifier.SelectionEvent event) { throw new RuntimeException("Stub!"); }
public  void onCreateTextClassificationSession(android.view.textclassifier.TextClassificationContext context, android.view.textclassifier.TextClassificationSessionId sessionId) { throw new RuntimeException("Stub!"); }
public  void onDestroyTextClassificationSession(android.view.textclassifier.TextClassificationSessionId sessionId) { throw new RuntimeException("Stub!"); }
public final  android.view.textclassifier.TextClassifier getLocalTextClassifier() { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.service.textclassifier.TextClassifierService";
}
