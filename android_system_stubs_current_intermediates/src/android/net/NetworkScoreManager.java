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
* limitations under the License
*/

package android.net;
public class NetworkScoreManager
{
NetworkScoreManager() { throw new RuntimeException("Stub!"); }
public  java.lang.String getActiveScorerPackage() { throw new RuntimeException("Stub!"); }
public  boolean updateScores(android.net.ScoredNetwork[] networks) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  boolean clearScores() throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  boolean setActiveScorer(java.lang.String packageName) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  void disableScoring() throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CHANGE_ACTIVE = "android.net.scoring.CHANGE_ACTIVE";
public static final java.lang.String ACTION_CUSTOM_ENABLE = "android.net.scoring.CUSTOM_ENABLE";
public static final java.lang.String ACTION_RECOMMEND_NETWORKS = "android.net.action.RECOMMEND_NETWORKS";
public static final java.lang.String ACTION_SCORER_CHANGED = "android.net.scoring.SCORER_CHANGED";
public static final java.lang.String ACTION_SCORE_NETWORKS = "android.net.scoring.SCORE_NETWORKS";
public static final java.lang.String EXTRA_NETWORKS_TO_SCORE = "networksToScore";
public static final java.lang.String EXTRA_NEW_SCORER = "newScorer";
public static final java.lang.String EXTRA_PACKAGE_NAME = "packageName";
}
