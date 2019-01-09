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

// $Id: TransformerException.java 569994 2007-08-27 04:28:57Z mrglavas $

package javax.xml.transform;
public class TransformerException
  extends java.lang.Exception
{
public  TransformerException(java.lang.String message) { throw new RuntimeException("Stub!"); }
public  TransformerException(java.lang.Throwable e) { throw new RuntimeException("Stub!"); }
public  TransformerException(java.lang.String message, java.lang.Throwable e) { throw new RuntimeException("Stub!"); }
public  TransformerException(java.lang.String message, javax.xml.transform.SourceLocator locator) { throw new RuntimeException("Stub!"); }
public  TransformerException(java.lang.String message, javax.xml.transform.SourceLocator locator, java.lang.Throwable e) { throw new RuntimeException("Stub!"); }
public  javax.xml.transform.SourceLocator getLocator() { throw new RuntimeException("Stub!"); }
public  void setLocator(javax.xml.transform.SourceLocator location) { throw new RuntimeException("Stub!"); }
public  java.lang.Throwable getException() { throw new RuntimeException("Stub!"); }
public  java.lang.Throwable getCause() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.Throwable initCause(java.lang.Throwable cause) { throw new RuntimeException("Stub!"); }
public  java.lang.String getMessageAndLocation() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLocationAsString() { throw new RuntimeException("Stub!"); }
public  void printStackTrace() { throw new RuntimeException("Stub!"); }
public  void printStackTrace(java.io.PrintStream s) { throw new RuntimeException("Stub!"); }
public  void printStackTrace(java.io.PrintWriter s) { throw new RuntimeException("Stub!"); }
}
