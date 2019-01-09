/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.transition;
public final class Scene
{
public  Scene(android.view.ViewGroup sceneRoot) { throw new RuntimeException("Stub!"); }
public  Scene(android.view.ViewGroup sceneRoot, android.view.View layout) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  Scene(android.view.ViewGroup sceneRoot, android.view.ViewGroup layout) { throw new RuntimeException("Stub!"); }
public static  android.transition.Scene getSceneForLayout(android.view.ViewGroup sceneRoot, int layoutId, android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.view.ViewGroup getSceneRoot() { throw new RuntimeException("Stub!"); }
public  void exit() { throw new RuntimeException("Stub!"); }
public  void enter() { throw new RuntimeException("Stub!"); }
public  void setEnterAction(java.lang.Runnable action) { throw new RuntimeException("Stub!"); }
public  void setExitAction(java.lang.Runnable action) { throw new RuntimeException("Stub!"); }
}
