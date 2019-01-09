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

package android.bluetooth.le;
public final class ScanRecord
{
ScanRecord() { throw new RuntimeException("Stub!"); }
public  int getAdvertiseFlags() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.os.ParcelUuid> getServiceUuids() { throw new RuntimeException("Stub!"); }
public  android.util.SparseArray<byte[]> getManufacturerSpecificData() { throw new RuntimeException("Stub!"); }
public  byte[] getManufacturerSpecificData(int manufacturerId) { throw new RuntimeException("Stub!"); }
public  java.util.Map<android.os.ParcelUuid, byte[]> getServiceData() { throw new RuntimeException("Stub!"); }
public  byte[] getServiceData(android.os.ParcelUuid serviceDataUuid) { throw new RuntimeException("Stub!"); }
public  int getTxPowerLevel() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDeviceName() { throw new RuntimeException("Stub!"); }
public  byte[] getBytes() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
