/*
* Copyright (C) 2012 The Android Open Source Project
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

package android.security;
@java.lang.Deprecated()
public final class KeyPairGeneratorSpec
  implements java.security.spec.AlgorithmParameterSpec
{
@java.lang.Deprecated()
public static final class Builder
{
public  Builder(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec.Builder setAlias(java.lang.String alias) { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec.Builder setKeyType(java.lang.String keyType) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec.Builder setKeySize(int keySize) { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec spec) { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec.Builder setSubject(javax.security.auth.x500.X500Principal subject) { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec.Builder setSerialNumber(java.math.BigInteger serialNumber) { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec.Builder setStartDate(java.util.Date startDate) { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec.Builder setEndDate(java.util.Date endDate) { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec.Builder setEncryptionRequired() { throw new RuntimeException("Stub!"); }
public  android.security.KeyPairGeneratorSpec build() { throw new RuntimeException("Stub!"); }
}
KeyPairGeneratorSpec() { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public  java.lang.String getKeystoreAlias() { throw new RuntimeException("Stub!"); }
public  java.lang.String getKeyType() { throw new RuntimeException("Stub!"); }
public  int getKeySize() { throw new RuntimeException("Stub!"); }
public  java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() { throw new RuntimeException("Stub!"); }
public  javax.security.auth.x500.X500Principal getSubjectDN() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger getSerialNumber() { throw new RuntimeException("Stub!"); }
public  java.util.Date getStartDate() { throw new RuntimeException("Stub!"); }
public  java.util.Date getEndDate() { throw new RuntimeException("Stub!"); }
public  boolean isEncryptionRequired() { throw new RuntimeException("Stub!"); }
}
