/*
* Copyright (C) 2016 The Android Open Source Project
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

package android.printservice.recommendation;
public final class RecommendationInfo
  implements android.os.Parcelable
{
public  RecommendationInfo(java.lang.CharSequence packageName, java.lang.CharSequence name, java.util.List<java.net.InetAddress> discoveredPrinters, boolean recommendsMultiVendorService) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  RecommendationInfo(java.lang.CharSequence packageName, java.lang.CharSequence name, int numDiscoveredPrinters, boolean recommendsMultiVendorService) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getPackageName() { throw new RuntimeException("Stub!"); }
public  boolean recommendsMultiVendorService() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.net.InetAddress> getDiscoveredPrinters() { throw new RuntimeException("Stub!"); }
public  int getNumDiscoveredPrinters() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getName() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.printservice.recommendation.RecommendationInfo> CREATOR;
static { CREATOR = null; }
}
