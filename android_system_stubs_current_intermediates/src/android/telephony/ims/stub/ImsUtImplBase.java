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
* limitations under the License
*/

package android.telephony.ims.stub;
public class ImsUtImplBase
{
public  ImsUtImplBase() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  int queryCallBarring(int cbType) { throw new RuntimeException("Stub!"); }
public  int queryCallBarringForServiceClass(int cbType, int serviceClass) { throw new RuntimeException("Stub!"); }
public  int queryCallForward(int condition, java.lang.String number) { throw new RuntimeException("Stub!"); }
public  int queryCallWaiting() { throw new RuntimeException("Stub!"); }
public  int queryClir() { throw new RuntimeException("Stub!"); }
public  int queryClip() { throw new RuntimeException("Stub!"); }
public  int queryColr() { throw new RuntimeException("Stub!"); }
public  int queryColp() { throw new RuntimeException("Stub!"); }
public  int transact(android.os.Bundle ssInfo) { throw new RuntimeException("Stub!"); }
public  int updateCallBarring(int cbType, int action, java.lang.String[] barrList) { throw new RuntimeException("Stub!"); }
public  int updateCallBarringForServiceClass(int cbType, int action, java.lang.String[] barrList, int serviceClass) { throw new RuntimeException("Stub!"); }
public  int updateCallForward(int action, int condition, java.lang.String number, int serviceClass, int timeSeconds) { throw new RuntimeException("Stub!"); }
public  int updateCallWaiting(boolean enable, int serviceClass) { throw new RuntimeException("Stub!"); }
public  int updateClir(int clirMode) { throw new RuntimeException("Stub!"); }
public  int updateClip(boolean enable) { throw new RuntimeException("Stub!"); }
public  int updateColr(int presentation) { throw new RuntimeException("Stub!"); }
public  int updateColp(boolean enable) { throw new RuntimeException("Stub!"); }
public  void setListener(android.telephony.ims.ImsUtListener listener) { throw new RuntimeException("Stub!"); }
}
