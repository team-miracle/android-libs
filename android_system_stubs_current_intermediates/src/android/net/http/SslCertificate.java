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

package android.net.http;
public class SslCertificate
{
public class DName
{
public  DName(java.lang.String dName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUName() { throw new RuntimeException("Stub!"); }
}
@java.lang.Deprecated()
public  SslCertificate(java.lang.String issuedTo, java.lang.String issuedBy, java.lang.String validNotBefore, java.lang.String validNotAfter) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  SslCertificate(java.lang.String issuedTo, java.lang.String issuedBy, java.util.Date validNotBefore, java.util.Date validNotAfter) { throw new RuntimeException("Stub!"); }
public  SslCertificate(java.security.cert.X509Certificate certificate) { throw new RuntimeException("Stub!"); }
public static  android.os.Bundle saveState(android.net.http.SslCertificate certificate) { throw new RuntimeException("Stub!"); }
public static  android.net.http.SslCertificate restoreState(android.os.Bundle bundle) { throw new RuntimeException("Stub!"); }
public  java.util.Date getValidNotBeforeDate() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getValidNotBefore() { throw new RuntimeException("Stub!"); }
public  java.util.Date getValidNotAfterDate() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getValidNotAfter() { throw new RuntimeException("Stub!"); }
public  android.net.http.SslCertificate.DName getIssuedTo() { throw new RuntimeException("Stub!"); }
public  android.net.http.SslCertificate.DName getIssuedBy() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
