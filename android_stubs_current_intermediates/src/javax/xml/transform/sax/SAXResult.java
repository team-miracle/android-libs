/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

// $Id: SAXResult.java 446598 2006-09-15 12:55:40Z jeremias $

package javax.xml.transform.sax;
public class SAXResult
  implements javax.xml.transform.Result
{
public  SAXResult() { throw new RuntimeException("Stub!"); }
public  SAXResult(org.xml.sax.ContentHandler handler) { throw new RuntimeException("Stub!"); }
public  void setHandler(org.xml.sax.ContentHandler handler) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.ContentHandler getHandler() { throw new RuntimeException("Stub!"); }
public  void setLexicalHandler(org.xml.sax.ext.LexicalHandler handler) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.ext.LexicalHandler getLexicalHandler() { throw new RuntimeException("Stub!"); }
public  void setSystemId(java.lang.String systemId) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSystemId() { throw new RuntimeException("Stub!"); }
public static final java.lang.String FEATURE = "http://javax.xml.transform.sax.SAXResult/feature";
}
