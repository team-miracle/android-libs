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


package android.security.keystore;
public class WrappedKeyEntry
  implements java.security.KeyStore.Entry
{
public  WrappedKeyEntry(byte[] wrappedKeyBytes, java.lang.String wrappingKeyAlias, java.lang.String transformation, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) { throw new RuntimeException("Stub!"); }
public  byte[] getWrappedKeyBytes() { throw new RuntimeException("Stub!"); }
public  java.lang.String getWrappingKeyAlias() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTransformation() { throw new RuntimeException("Stub!"); }
public  java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() { throw new RuntimeException("Stub!"); }
}
