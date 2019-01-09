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

package android.view;
public class TouchDelegate
{
public  TouchDelegate(android.graphics.Rect bounds, android.view.View delegateView) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public static final int ABOVE = 1;
public static final int BELOW = 2;
public static final int TO_LEFT = 4;
public static final int TO_RIGHT = 8;
}
