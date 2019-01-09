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
* limitations under the License.
*/

package android.service.resolver;
public abstract class ResolverRankerService
  extends android.app.Service
{
public  ResolverRankerService() { throw new RuntimeException("Stub!"); }
public  void onPredictSharingProbabilities(java.util.List<android.service.resolver.ResolverTarget> targets) { throw new RuntimeException("Stub!"); }
public  void onTrainRankingModel(java.util.List<android.service.resolver.ResolverTarget> targets, int selectedPosition) { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public static final java.lang.String BIND_PERMISSION = "android.permission.BIND_RESOLVER_RANKER_SERVICE";
public static final java.lang.String HOLD_PERMISSION = "android.permission.PROVIDE_RESOLVER_RANKER_SERVICE";
public static final java.lang.String SERVICE_INTERFACE = "android.service.resolver.ResolverRankerService";
}
