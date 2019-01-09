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
* limitations under the License.
*/

package android.webkit;
public abstract class ClientCertRequest
{
public  ClientCertRequest() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String[] getKeyTypes();
public abstract  java.security.Principal[] getPrincipals();
public abstract  java.lang.String getHost();
public abstract  int getPort();
public abstract  void proceed(java.security.PrivateKey privateKey, java.security.cert.X509Certificate[] chain);
public abstract  void ignore();
public abstract  void cancel();
}
