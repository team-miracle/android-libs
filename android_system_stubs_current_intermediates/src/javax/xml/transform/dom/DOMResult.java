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

// $Id: DOMResult.java 569995 2007-08-27 04:31:06Z mrglavas $

package javax.xml.transform.dom;
public class DOMResult
  implements javax.xml.transform.Result
{
public  DOMResult() { throw new RuntimeException("Stub!"); }
public  DOMResult(org.w3c.dom.Node node) { throw new RuntimeException("Stub!"); }
public  DOMResult(org.w3c.dom.Node node, java.lang.String systemId) { throw new RuntimeException("Stub!"); }
public  DOMResult(org.w3c.dom.Node node, org.w3c.dom.Node nextSibling) { throw new RuntimeException("Stub!"); }
public  DOMResult(org.w3c.dom.Node node, org.w3c.dom.Node nextSibling, java.lang.String systemId) { throw new RuntimeException("Stub!"); }
public  void setNode(org.w3c.dom.Node node) { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Node getNode() { throw new RuntimeException("Stub!"); }
public  void setNextSibling(org.w3c.dom.Node nextSibling) { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Node getNextSibling() { throw new RuntimeException("Stub!"); }
public  void setSystemId(java.lang.String systemId) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSystemId() { throw new RuntimeException("Stub!"); }
public static final java.lang.String FEATURE = "http://javax.xml.transform.dom.DOMResult/feature";
}
