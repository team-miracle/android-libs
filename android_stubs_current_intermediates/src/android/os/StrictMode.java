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
public final class StrictMode
{
public static interface OnThreadViolationListener
{
public abstract  void onThreadViolation(android.os.strictmode.Violation v);
}
public static interface OnVmViolationListener
{
public abstract  void onVmViolation(android.os.strictmode.Violation v);
}
public static final class ThreadPolicy
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.os.StrictMode.ThreadPolicy policy) { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectAll() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitAll() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectNetwork() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitNetwork() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectDiskReads() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitDiskReads() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectCustomSlowCalls() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitCustomSlowCalls() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitResourceMismatches() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectUnbufferedIo() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitUnbufferedIo() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectResourceMismatches() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectDiskWrites() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitDiskWrites() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyDialog() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyDeath() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyDeathOnNetwork() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyFlashScreen() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyLog() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyDropBox() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyListener(java.util.concurrent.Executor executor, android.os.StrictMode.OnThreadViolationListener listener) { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy build() { throw new RuntimeException("Stub!"); }
}
ThreadPolicy() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.StrictMode.ThreadPolicy LAX;
static { LAX = null; }
}
public static final class VmPolicy
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.os.StrictMode.VmPolicy base) { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder setClassInstanceLimit(java.lang.Class klass, int instanceLimit) { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectActivityLeaks() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectNonSdkApiUsage() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder permitNonSdkApiUsage() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectAll() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectLeakedSqlLiteObjects() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectLeakedClosableObjects() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectLeakedRegistrationObjects() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectFileUriExposure() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectCleartextNetwork() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectContentUriWithoutPermission() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectUntaggedSockets() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder penaltyDeath() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder penaltyDeathOnCleartextNetwork() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder penaltyDeathOnFileUriExposure() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder penaltyLog() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder penaltyDropBox() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder penaltyListener(java.util.concurrent.Executor executor, android.os.StrictMode.OnVmViolationListener listener) { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy build() { throw new RuntimeException("Stub!"); }
}
VmPolicy() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.StrictMode.VmPolicy LAX;
static { LAX = null; }
}
StrictMode() { throw new RuntimeException("Stub!"); }
public static  void setThreadPolicy(android.os.StrictMode.ThreadPolicy policy) { throw new RuntimeException("Stub!"); }
public static  android.os.StrictMode.ThreadPolicy getThreadPolicy() { throw new RuntimeException("Stub!"); }
public static  android.os.StrictMode.ThreadPolicy allowThreadDiskWrites() { throw new RuntimeException("Stub!"); }
public static  android.os.StrictMode.ThreadPolicy allowThreadDiskReads() { throw new RuntimeException("Stub!"); }
public static  void setVmPolicy(android.os.StrictMode.VmPolicy policy) { throw new RuntimeException("Stub!"); }
public static  android.os.StrictMode.VmPolicy getVmPolicy() { throw new RuntimeException("Stub!"); }
public static  void enableDefaults() { throw new RuntimeException("Stub!"); }
public static  void noteSlowCall(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
