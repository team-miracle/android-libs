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
public abstract class RecommendationService
  extends android.app.Service
{
public  RecommendationService() { throw new RuntimeException("Stub!"); }
protected  void attachBaseContext(android.content.Context base) { throw new RuntimeException("Stub!"); }
public final  void updateRecommendations(java.util.List<android.printservice.recommendation.RecommendationInfo> recommendations) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  void onConnected();
public abstract  void onDisconnected();
public static final java.lang.String SERVICE_INTERFACE = "android.printservice.recommendation.RecommendationService";
}
