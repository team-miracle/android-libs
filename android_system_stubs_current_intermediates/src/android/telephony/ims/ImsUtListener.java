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
* limitations under the License
*/

package android.telephony.ims;
public class ImsUtListener
{
ImsUtListener() { throw new RuntimeException("Stub!"); }
public  void onUtConfigurationUpdated(int id) { throw new RuntimeException("Stub!"); }
public  void onUtConfigurationUpdateFailed(int id, android.telephony.ims.ImsReasonInfo error) { throw new RuntimeException("Stub!"); }
public  void onUtConfigurationQueried(int id, android.os.Bundle ssInfo) { throw new RuntimeException("Stub!"); }
public  void onUtConfigurationQueryFailed(int id, android.telephony.ims.ImsReasonInfo error) { throw new RuntimeException("Stub!"); }
public  void onUtConfigurationCallBarringQueried(int id, android.telephony.ims.ImsSsInfo[] cbInfo) { throw new RuntimeException("Stub!"); }
public  void onUtConfigurationCallForwardQueried(int id, android.telephony.ims.ImsCallForwardInfo[] cfInfo) { throw new RuntimeException("Stub!"); }
public  void onUtConfigurationCallWaitingQueried(int id, android.telephony.ims.ImsSsInfo[] cwInfo) { throw new RuntimeException("Stub!"); }
public  void onSupplementaryServiceIndication(android.telephony.ims.ImsSsData ssData) { throw new RuntimeException("Stub!"); }
}
