/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/impl/HttpConnectionMetricsImpl.java $
* $Revision: 548031 $
* $Date: 2007-06-17 04:28:38 -0700 (Sun, 17 Jun 2007) $
*
* ====================================================================
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the Apache Software Foundation.  For more
* information on the Apache Software Foundation, please see
* <http://www.apache.org/>.
*
*/

package org.apache.http.impl;
@java.lang.Deprecated()
public class HttpConnectionMetricsImpl
  implements org.apache.http.HttpConnectionMetrics
{
public  HttpConnectionMetricsImpl(org.apache.http.io.HttpTransportMetrics inTransportMetric, org.apache.http.io.HttpTransportMetrics outTransportMetric) { throw new RuntimeException("Stub!"); }
public  long getReceivedBytesCount() { throw new RuntimeException("Stub!"); }
public  long getSentBytesCount() { throw new RuntimeException("Stub!"); }
public  long getRequestCount() { throw new RuntimeException("Stub!"); }
public  void incrementRequestCount() { throw new RuntimeException("Stub!"); }
public  long getResponseCount() { throw new RuntimeException("Stub!"); }
public  void incrementResponseCount() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getMetric(java.lang.String metricName) { throw new RuntimeException("Stub!"); }
public  void setMetric(java.lang.String metricName, java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public static final java.lang.String RECEIVED_BYTES_COUNT = "http.received-bytes-count";
public static final java.lang.String REQUEST_COUNT = "http.request-count";
public static final java.lang.String RESPONSE_COUNT = "http.response-count";
public static final java.lang.String SENT_BYTES_COUNT = "http.sent-bytes-count";
}
