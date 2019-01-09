/*
* Copyright 2017 The Android Open Source Project
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

package android.webkit;
public class TracingConfig
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.webkit.TracingConfig build() { throw new RuntimeException("Stub!"); }
public  android.webkit.TracingConfig.Builder addCategories(int... predefinedCategories) { throw new RuntimeException("Stub!"); }
public  android.webkit.TracingConfig.Builder addCategories(java.lang.String... categories) { throw new RuntimeException("Stub!"); }
public  android.webkit.TracingConfig.Builder addCategories(java.util.Collection<java.lang.String> categories) { throw new RuntimeException("Stub!"); }
public  android.webkit.TracingConfig.Builder setTracingMode(int tracingMode) { throw new RuntimeException("Stub!"); }
}
TracingConfig() { throw new RuntimeException("Stub!"); }
public  int getPredefinedCategories() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getCustomIncludedCategories() { throw new RuntimeException("Stub!"); }
public  int getTracingMode() { throw new RuntimeException("Stub!"); }
public static final int CATEGORIES_ALL = 1;
public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
public static final int CATEGORIES_FRAME_VIEWER = 64;
public static final int CATEGORIES_INPUT_LATENCY = 8;
public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
public static final int CATEGORIES_NONE = 0;
public static final int CATEGORIES_RENDERING = 16;
public static final int CATEGORIES_WEB_DEVELOPER = 4;
public static final int RECORD_CONTINUOUSLY = 1;
public static final int RECORD_UNTIL_FULL = 0;
}
