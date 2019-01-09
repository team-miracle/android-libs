/*
* Copyright (C) 2008 The Android Open Source Project
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
public class PhoneStateListener
{
public  PhoneStateListener() { throw new RuntimeException("Stub!"); }
public  void onServiceStateChanged(android.telephony.ServiceState serviceState) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onSignalStrengthChanged(int asu) { throw new RuntimeException("Stub!"); }
public  void onMessageWaitingIndicatorChanged(boolean mwi) { throw new RuntimeException("Stub!"); }
public  void onCallForwardingIndicatorChanged(boolean cfi) { throw new RuntimeException("Stub!"); }
public  void onCellLocationChanged(android.telephony.CellLocation location) { throw new RuntimeException("Stub!"); }
public  void onCallStateChanged(int state, java.lang.String phoneNumber) { throw new RuntimeException("Stub!"); }
public  void onDataConnectionStateChanged(int state) { throw new RuntimeException("Stub!"); }
public  void onDataConnectionStateChanged(int state, int networkType) { throw new RuntimeException("Stub!"); }
public  void onDataActivity(int direction) { throw new RuntimeException("Stub!"); }
public  void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) { throw new RuntimeException("Stub!"); }
public  void onCellInfoChanged(java.util.List<android.telephony.CellInfo> cellInfo) { throw new RuntimeException("Stub!"); }
public  void onUserMobileDataStateChanged(boolean enabled) { throw new RuntimeException("Stub!"); }
public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;
public static final int LISTEN_CALL_STATE = 32;
public static final int LISTEN_CELL_INFO = 1024;
public static final int LISTEN_CELL_LOCATION = 16;
public static final int LISTEN_DATA_ACTIVITY = 128;
public static final int LISTEN_DATA_CONNECTION_STATE = 64;
public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;
public static final int LISTEN_NONE = 0;
public static final int LISTEN_SERVICE_STATE = 1;
@java.lang.Deprecated()
public static final int LISTEN_SIGNAL_STRENGTH = 2;
public static final int LISTEN_SIGNAL_STRENGTHS = 256;
public static final int LISTEN_USER_MOBILE_DATA_STATE = 524288;
}
