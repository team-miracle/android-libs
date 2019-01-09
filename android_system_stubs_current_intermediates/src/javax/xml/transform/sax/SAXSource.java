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

// $Id: SAXSource.java 446598 2006-09-15 12:55:40Z jeremias $

package javax.xml.transform.sax;
public class SAXSource
  implements javax.xml.transform.Source
{
public  SAXSource() { throw new RuntimeException("Stub!"); }
public  SAXSource(org.xml.sax.XMLReader reader, org.xml.sax.InputSource inputSource) { throw new RuntimeException("Stub!"); }
public  SAXSource(org.xml.sax.InputSource inputSource) { throw new RuntimeException("Stub!"); }
public  void setXMLReader(org.xml.sax.XMLReader reader) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.XMLReader getXMLReader() { throw new RuntimeException("Stub!"); }
public  void setInputSource(org.xml.sax.InputSource inputSource) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.InputSource getInputSource() { throw new RuntimeException("Stub!"); }
public  void setSystemId(java.lang.String systemId) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSystemId() { throw new RuntimeException("Stub!"); }
public static  org.xml.sax.InputSource sourceToInputSource(javax.xml.transform.Source source) { throw new RuntimeException("Stub!"); }
public static final java.lang.String FEATURE = "http://javax.xml.transform.sax.SAXSource/feature";
}
