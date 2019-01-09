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

// $Id: StreamResult.java 829970 2009-10-26 21:15:29Z mrglavas $

package javax.xml.transform.stream;
public class StreamResult
  implements javax.xml.transform.Result
{
public  StreamResult() { throw new RuntimeException("Stub!"); }
public  StreamResult(java.io.OutputStream outputStream) { throw new RuntimeException("Stub!"); }
public  StreamResult(java.io.Writer writer) { throw new RuntimeException("Stub!"); }
public  StreamResult(java.lang.String systemId) { throw new RuntimeException("Stub!"); }
public  StreamResult(java.io.File f) { throw new RuntimeException("Stub!"); }
public  void setOutputStream(java.io.OutputStream outputStream) { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getOutputStream() { throw new RuntimeException("Stub!"); }
public  void setWriter(java.io.Writer writer) { throw new RuntimeException("Stub!"); }
public  java.io.Writer getWriter() { throw new RuntimeException("Stub!"); }
public  void setSystemId(java.lang.String systemId) { throw new RuntimeException("Stub!"); }
public  void setSystemId(java.io.File f) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSystemId() { throw new RuntimeException("Stub!"); }
public static final java.lang.String FEATURE = "http://javax.xml.transform.stream.StreamResult/feature";
}
