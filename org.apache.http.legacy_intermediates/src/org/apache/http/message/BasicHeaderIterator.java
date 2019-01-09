/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/BasicHeaderIterator.java $
* $Revision: 581981 $
* $Date: 2007-10-04 11:26:26 -0700 (Thu, 04 Oct 2007) $
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

package org.apache.http.message;
@java.lang.Deprecated()
public class BasicHeaderIterator
  implements org.apache.http.HeaderIterator
{
public  BasicHeaderIterator(org.apache.http.Header[] headers, java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  int findNext(int from) { throw new RuntimeException("Stub!"); }
protected  boolean filterHeader(int index) { throw new RuntimeException("Stub!"); }
public  boolean hasNext() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header nextHeader() throws java.util.NoSuchElementException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object next() throws java.util.NoSuchElementException { throw new RuntimeException("Stub!"); }
public  void remove() throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
protected final org.apache.http.Header[] allHeaders = null;
protected int currentIndex;
protected java.lang.String headerName;
}
