/*
* Copyright (C) 2015 The Android Open Source Project
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
public abstract class TokenBindingService
{
public abstract static class TokenBindingKey
{
public  TokenBindingKey() { throw new RuntimeException("Stub!"); }
public abstract  java.security.KeyPair getKeyPair();
public abstract  java.lang.String getAlgorithm();
}
public  TokenBindingService() { throw new RuntimeException("Stub!"); }
public static  android.webkit.TokenBindingService getInstance() { throw new RuntimeException("Stub!"); }
public abstract  void enableTokenBinding();
public abstract  void getKey(android.net.Uri origin, java.lang.String[] algorithm, android.webkit.ValueCallback<android.webkit.TokenBindingService.TokenBindingKey> callback);
public abstract  void deleteKey(android.net.Uri origin, android.webkit.ValueCallback<java.lang.Boolean> callback);
public abstract  void deleteAllKeys(android.webkit.ValueCallback<java.lang.Boolean> callback);
public static final java.lang.String KEY_ALGORITHM_ECDSAP256 = "ECDSAP256";
public static final java.lang.String KEY_ALGORITHM_RSA2048_PKCS_1_5 = "RSA2048_PKCS_1.5";
public static final java.lang.String KEY_ALGORITHM_RSA2048_PSS = "RSA2048PSS";
}
