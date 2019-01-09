/**
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

package android.service.voice;
public class VoiceInteractionSession
  implements android.view.KeyEvent.Callback, android.content.ComponentCallbacks2
{
public static class Request
{
Request() { throw new RuntimeException("Stub!"); }
public  int getCallingUid() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCallingPackage() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  boolean isActive() { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static final class ConfirmationRequest
  extends android.service.voice.VoiceInteractionSession.Request
{
ConfirmationRequest() { throw new RuntimeException("Stub!"); }
public  android.app.VoiceInteractor.Prompt getVoicePrompt() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.CharSequence getPrompt() { throw new RuntimeException("Stub!"); }
public  void sendConfirmationResult(boolean confirmed, android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static final class PickOptionRequest
  extends android.service.voice.VoiceInteractionSession.Request
{
PickOptionRequest() { throw new RuntimeException("Stub!"); }
public  android.app.VoiceInteractor.Prompt getVoicePrompt() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.CharSequence getPrompt() { throw new RuntimeException("Stub!"); }
public  android.app.VoiceInteractor.PickOptionRequest.Option[] getOptions() { throw new RuntimeException("Stub!"); }
public  void sendIntermediatePickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] selections, android.os.Bundle result) { throw new RuntimeException("Stub!"); }
public  void sendPickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] selections, android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static final class CompleteVoiceRequest
  extends android.service.voice.VoiceInteractionSession.Request
{
CompleteVoiceRequest() { throw new RuntimeException("Stub!"); }
public  android.app.VoiceInteractor.Prompt getVoicePrompt() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.CharSequence getMessage() { throw new RuntimeException("Stub!"); }
public  void sendCompleteResult(android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static final class AbortVoiceRequest
  extends android.service.voice.VoiceInteractionSession.Request
{
AbortVoiceRequest() { throw new RuntimeException("Stub!"); }
public  android.app.VoiceInteractor.Prompt getVoicePrompt() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.CharSequence getMessage() { throw new RuntimeException("Stub!"); }
public  void sendAbortResult(android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static final class CommandRequest
  extends android.service.voice.VoiceInteractionSession.Request
{
CommandRequest() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCommand() { throw new RuntimeException("Stub!"); }
public  void sendIntermediateResult(android.os.Bundle result) { throw new RuntimeException("Stub!"); }
public  void sendResult(android.os.Bundle result) { throw new RuntimeException("Stub!"); }
}
public static final class Insets
{
public  Insets() { throw new RuntimeException("Stub!"); }
public static final int TOUCHABLE_INSETS_CONTENT = 1;
public static final int TOUCHABLE_INSETS_FRAME = 0;
public static final int TOUCHABLE_INSETS_REGION = 3;
public final android.graphics.Rect contentInsets;
public int touchableInsets;
public final android.graphics.Region touchableRegion;
}
public  VoiceInteractionSession(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  VoiceInteractionSession(android.content.Context context, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public  void setDisabledShowContext(int flags) { throw new RuntimeException("Stub!"); }
public  int getDisabledShowContext() { throw new RuntimeException("Stub!"); }
public  int getUserDisabledShowContext() { throw new RuntimeException("Stub!"); }
public  void show(android.os.Bundle args, int flags) { throw new RuntimeException("Stub!"); }
public  void hide() { throw new RuntimeException("Stub!"); }
public  void setUiEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setTheme(int theme) { throw new RuntimeException("Stub!"); }
public  void startVoiceActivity(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void startAssistantActivity(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void setKeepAwake(boolean keepAwake) { throw new RuntimeException("Stub!"); }
public  void closeSystemDialogs() { throw new RuntimeException("Stub!"); }
public  android.view.LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
public  android.app.Dialog getWindow() { throw new RuntimeException("Stub!"); }
public  void finish() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onPrepareShow(android.os.Bundle args, int showFlags) { throw new RuntimeException("Stub!"); }
public  void onShow(android.os.Bundle args, int showFlags) { throw new RuntimeException("Stub!"); }
public  void onHide() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateContentView() { throw new RuntimeException("Stub!"); }
public  void setContentView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void onAssistStructureFailure(java.lang.Throwable failure) { throw new RuntimeException("Stub!"); }
public  void onHandleAssist(android.os.Bundle data, android.app.assist.AssistStructure structure, android.app.assist.AssistContent content) { throw new RuntimeException("Stub!"); }
public  void onHandleAssistSecondary(android.os.Bundle data, android.app.assist.AssistStructure structure, android.app.assist.AssistContent content, int index, int count) { throw new RuntimeException("Stub!"); }
public  void onHandleScreenshot(android.graphics.Bitmap screenshot) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyLongPress(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int count, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onBackPressed() { throw new RuntimeException("Stub!"); }
public  void onCloseSystemDialogs() { throw new RuntimeException("Stub!"); }
public  void onLockscreenShown() { throw new RuntimeException("Stub!"); }
public  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void onLowMemory() { throw new RuntimeException("Stub!"); }
public  void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
public  void onComputeInsets(android.service.voice.VoiceInteractionSession.Insets outInsets) { throw new RuntimeException("Stub!"); }
public  void onTaskStarted(android.content.Intent intent, int taskId) { throw new RuntimeException("Stub!"); }
public  void onTaskFinished(android.content.Intent intent, int taskId) { throw new RuntimeException("Stub!"); }
public  boolean[] onGetSupportedCommands(java.lang.String[] commands) { throw new RuntimeException("Stub!"); }
public  void onRequestConfirmation(android.service.voice.VoiceInteractionSession.ConfirmationRequest request) { throw new RuntimeException("Stub!"); }
public  void onRequestPickOption(android.service.voice.VoiceInteractionSession.PickOptionRequest request) { throw new RuntimeException("Stub!"); }
public  void onRequestCompleteVoice(android.service.voice.VoiceInteractionSession.CompleteVoiceRequest request) { throw new RuntimeException("Stub!"); }
public  void onRequestAbortVoice(android.service.voice.VoiceInteractionSession.AbortVoiceRequest request) { throw new RuntimeException("Stub!"); }
public  void onRequestCommand(android.service.voice.VoiceInteractionSession.CommandRequest request) { throw new RuntimeException("Stub!"); }
public  void onCancelRequest(android.service.voice.VoiceInteractionSession.Request request) { throw new RuntimeException("Stub!"); }
public  void dump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public static final int SHOW_SOURCE_ACTIVITY = 16;
public static final int SHOW_SOURCE_APPLICATION = 8;
public static final int SHOW_SOURCE_ASSIST_GESTURE = 4;
public static final int SHOW_WITH_ASSIST = 1;
public static final int SHOW_WITH_SCREENSHOT = 2;
}
