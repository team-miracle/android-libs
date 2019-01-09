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

package android.net;
public class LocalSocketAddress
{
public static enum Namespace
{
ABSTRACT(),
FILESYSTEM(),
RESERVED();
}
public  LocalSocketAddress(java.lang.String name, android.net.LocalSocketAddress.Namespace namespace) { throw new RuntimeException("Stub!"); }
public  LocalSocketAddress(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  android.net.LocalSocketAddress.Namespace getNamespace() { throw new RuntimeException("Stub!"); }
}
