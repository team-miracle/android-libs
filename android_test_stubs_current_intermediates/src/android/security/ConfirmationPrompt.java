/*
* Copyright 2018 The Android Open Source Project
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

package android.security;
public class ConfirmationPrompt
{
public static final class Builder
{
public  Builder(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.security.ConfirmationPrompt.Builder setPromptText(java.lang.CharSequence promptText) { throw new RuntimeException("Stub!"); }
public  android.security.ConfirmationPrompt.Builder setExtraData(byte[] extraData) { throw new RuntimeException("Stub!"); }
public  android.security.ConfirmationPrompt build() { throw new RuntimeException("Stub!"); }
}
ConfirmationPrompt() { throw new RuntimeException("Stub!"); }
public  void presentPrompt(java.util.concurrent.Executor executor, android.security.ConfirmationCallback callback) throws android.security.ConfirmationAlreadyPresentingException, android.security.ConfirmationNotAvailableException { throw new RuntimeException("Stub!"); }
public  void cancelPrompt() { throw new RuntimeException("Stub!"); }
public static  boolean isSupported(android.content.Context context) { throw new RuntimeException("Stub!"); }
}
