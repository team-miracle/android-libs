/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.telephony.cdma;
public class CdmaCellLocation
  extends android.telephony.CellLocation
{
public  CdmaCellLocation() { throw new RuntimeException("Stub!"); }
public  CdmaCellLocation(android.os.Bundle bundle) { throw new RuntimeException("Stub!"); }
public  int getBaseStationId() { throw new RuntimeException("Stub!"); }
public  int getBaseStationLatitude() { throw new RuntimeException("Stub!"); }
public  int getBaseStationLongitude() { throw new RuntimeException("Stub!"); }
public  int getSystemId() { throw new RuntimeException("Stub!"); }
public  int getNetworkId() { throw new RuntimeException("Stub!"); }
public  void setStateInvalid() { throw new RuntimeException("Stub!"); }
public  void setCellLocationData(int baseStationId, int baseStationLatitude, int baseStationLongitude) { throw new RuntimeException("Stub!"); }
public  void setCellLocationData(int baseStationId, int baseStationLatitude, int baseStationLongitude, int systemId, int networkId) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void fillInNotifierBundle(android.os.Bundle bundleToFill) { throw new RuntimeException("Stub!"); }
public static  double convertQuartSecToDecDegrees(int quartSec) { throw new RuntimeException("Stub!"); }
}
