/*
* $HeadURL: http://svn.apache.org/repos/asf/httpcomponents/httpcore/trunk/module-main/src/main/java/org/apache/http/message/BasicTokenIterator.java $
* $Revision: 602520 $
* $Date: 2007-12-08 09:42:26 -0800 (Sat, 08 Dec 2007) $
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
public class BasicTokenIterator
  implements org.apache.http.TokenIterator
{
public  BasicTokenIterator(org.apache.http.HeaderIterator headerIterator) { throw new RuntimeException("Stub!"); }
public  boolean hasNext() { throw new RuntimeException("Stub!"); }
public  java.lang.String nextToken() throws java.util.NoSuchElementException, org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object next() throws java.util.NoSuchElementException, org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public final  void remove() throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
protected  int findNext(int from) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  java.lang.String createToken(java.lang.String value, int start, int end) { throw new RuntimeException("Stub!"); }
protected  int findTokenStart(int from) { throw new RuntimeException("Stub!"); }
protected  int findTokenSeparator(int from) { throw new RuntimeException("Stub!"); }
protected  int findTokenEnd(int from) { throw new RuntimeException("Stub!"); }
protected  boolean isTokenSeparator(char ch) { throw new RuntimeException("Stub!"); }
protected  boolean isWhitespace(char ch) { throw new RuntimeException("Stub!"); }
protected  boolean isTokenChar(char ch) { throw new RuntimeException("Stub!"); }
protected  boolean isHttpSeparator(char ch) { throw new RuntimeException("Stub!"); }
public static final java.lang.String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
protected java.lang.String currentHeader;
protected java.lang.String currentToken;
protected final org.apache.http.HeaderIterator headerIt;
protected int searchPos;
}
