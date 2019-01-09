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

package android.telephony;
public final class TelephonyScanManager
{
public abstract static class NetworkScanCallback
{
public  NetworkScanCallback() { throw new RuntimeException("Stub!"); }
public  void onResults(java.util.List<android.telephony.CellInfo> results) { throw new RuntimeException("Stub!"); }
public  void onComplete() { throw new RuntimeException("Stub!"); }
public  void onError(int error) { throw new RuntimeException("Stub!"); }
}
public  TelephonyScanManager() { throw new RuntimeException("Stub!"); }
}
