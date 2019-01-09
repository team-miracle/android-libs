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

package android.location;
public interface LocationListener
{
public abstract  void onLocationChanged(android.location.Location location);
public abstract  void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras);
public abstract  void onProviderEnabled(java.lang.String provider);
public abstract  void onProviderDisabled(java.lang.String provider);
}
