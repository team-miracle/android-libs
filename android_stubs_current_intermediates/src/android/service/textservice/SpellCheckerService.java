/*
* Copyright (C) 2011 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.service.textservice;
public abstract class SpellCheckerService
  extends android.app.Service
{
public abstract static class Session
{
public  Session() { throw new RuntimeException("Stub!"); }
public abstract  void onCreate();
public abstract  android.view.textservice.SuggestionsInfo onGetSuggestions(android.view.textservice.TextInfo textInfo, int suggestionsLimit);
public  android.view.textservice.SuggestionsInfo[] onGetSuggestionsMultiple(android.view.textservice.TextInfo[] textInfos, int suggestionsLimit, boolean sequentialWords) { throw new RuntimeException("Stub!"); }
public  android.view.textservice.SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] textInfos, int suggestionsLimit) { throw new RuntimeException("Stub!"); }
public  void onCancel() { throw new RuntimeException("Stub!"); }
public  void onClose() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLocale() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getBundle() { throw new RuntimeException("Stub!"); }
}
public  SpellCheckerService() { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  android.service.textservice.SpellCheckerService.Session createSession();
public static final java.lang.String SERVICE_INTERFACE = "android.service.textservice.SpellCheckerService";
}
