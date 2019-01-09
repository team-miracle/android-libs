/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.app;
public final class VoiceInteractor
{
public abstract static class Request
{
Request() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public  android.app.Activity getActivity() { throw new RuntimeException("Stub!"); }
public  void onCancel() { throw new RuntimeException("Stub!"); }
public  void onAttached(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  void onDetached() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static class ConfirmationRequest
  extends android.app.VoiceInteractor.Request
{
public  ConfirmationRequest(android.app.VoiceInteractor.Prompt prompt, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onConfirmationResult(boolean confirmed, android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static class PickOptionRequest
  extends android.app.VoiceInteractor.Request
{
public static final class Option
  implements android.os.Parcelable
{
public  Option(java.lang.CharSequence label, int index) { throw new RuntimeException("Stub!"); }
public  android.app.VoiceInteractor.PickOptionRequest.Option addSynonym(java.lang.CharSequence synonym) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLabel() { throw new RuntimeException("Stub!"); }
public  int getIndex() { throw new RuntimeException("Stub!"); }
public  int countSynonyms() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSynonymAt(int index) { throw new RuntimeException("Stub!"); }
public  void setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.VoiceInteractor.PickOptionRequest.Option> CREATOR;
static { CREATOR = null; }
}
public  PickOptionRequest(android.app.VoiceInteractor.Prompt prompt, android.app.VoiceInteractor.PickOptionRequest.Option[] options, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onPickOptionResult(boolean finished, android.app.VoiceInteractor.PickOptionRequest.Option[] selections, android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static class CompleteVoiceRequest
  extends android.app.VoiceInteractor.Request
{
public  CompleteVoiceRequest(android.app.VoiceInteractor.Prompt prompt, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onCompleteResult(android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static class AbortVoiceRequest
  extends android.app.VoiceInteractor.Request
{
public  AbortVoiceRequest(android.app.VoiceInteractor.Prompt prompt, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void onAbortResult(android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static class CommandRequest
  extends android.app.VoiceInteractor.Request
{
public  CommandRequest(java.lang.String command, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
public  void onCommandResult(boolean isCompleted, android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static class Prompt
  implements android.os.Parcelable
{
public  Prompt(java.lang.CharSequence[] voicePrompts, java.lang.CharSequence visualPrompt) { throw new RuntimeException("Stub!"); }
public  Prompt(java.lang.CharSequence prompt) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getVoicePromptAt(int index) { throw new RuntimeException("Stub!"); }
public  int countVoicePrompts() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getVisualPrompt() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.VoiceInteractor.Prompt> CREATOR;
static { CREATOR = null; }
}
VoiceInteractor() { throw new RuntimeException("Stub!"); }
public  boolean submitRequest(android.app.VoiceInteractor.Request request) { throw new RuntimeException("Stub!"); }
public  boolean submitRequest(android.app.VoiceInteractor.Request request, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.app.VoiceInteractor.Request[] getActiveRequests() { throw new RuntimeException("Stub!"); }
public  android.app.VoiceInteractor.Request getActiveRequest(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean[] supportsCommands(java.lang.String[] commands) { throw new RuntimeException("Stub!"); }
}
