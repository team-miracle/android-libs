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
public final class Geocoder
{
public  Geocoder(android.content.Context context, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  Geocoder(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  boolean isPresent() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.location.Address> getFromLocation(double latitude, double longitude, int maxResults) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.location.Address> getFromLocationName(java.lang.String locationName, int maxResults) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.location.Address> getFromLocationName(java.lang.String locationName, int maxResults, double lowerLeftLatitude, double lowerLeftLongitude, double upperRightLatitude, double upperRightLongitude) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
