/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.os;
public class RecoverySystem
{
public static interface ProgressListener
{
public abstract  void onProgress(int progress);
}
RecoverySystem() { throw new RuntimeException("Stub!"); }
public static  void verifyPackage(java.io.File packageFile, android.os.RecoverySystem.ProgressListener listener, java.io.File deviceCertsZipFile) throws java.io.IOException, java.security.GeneralSecurityException { throw new RuntimeException("Stub!"); }
public static  void installPackage(android.content.Context context, java.io.File packageFile) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  void rebootWipeUserData(android.content.Context context) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  void rebootWipeCache(android.content.Context context) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
