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

package android.test;
@java.lang.Deprecated()
public interface PerformanceTestCase
{
public static interface Intermediates
{
public abstract  void setInternalIterations(int count);
public abstract  void startTiming(boolean realTime);
public abstract  void addIntermediate(java.lang.String name);
public abstract  void addIntermediate(java.lang.String name, long timeInNS);
public abstract  void finishTiming(boolean realTime);
}
public abstract  int startPerformance(android.test.PerformanceTestCase.Intermediates intermediates);
public abstract  boolean isPerformanceOnly();
}
