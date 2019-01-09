/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.location;
public class LocationProvider
{
LocationProvider() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  boolean meetsCriteria(android.location.Criteria criteria) { throw new RuntimeException("Stub!"); }
public  boolean requiresNetwork() { throw new RuntimeException("Stub!"); }
public  boolean requiresSatellite() { throw new RuntimeException("Stub!"); }
public  boolean requiresCell() { throw new RuntimeException("Stub!"); }
public  boolean hasMonetaryCost() { throw new RuntimeException("Stub!"); }
public  boolean supportsAltitude() { throw new RuntimeException("Stub!"); }
public  boolean supportsSpeed() { throw new RuntimeException("Stub!"); }
public  boolean supportsBearing() { throw new RuntimeException("Stub!"); }
public  int getPowerRequirement() { throw new RuntimeException("Stub!"); }
public  int getAccuracy() { throw new RuntimeException("Stub!"); }
public static final int AVAILABLE = 2;
public static final int OUT_OF_SERVICE = 0;
public static final int TEMPORARILY_UNAVAILABLE = 1;
}
