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

// $Id: Transformer.java 570103 2007-08-27 13:24:55Z mrglavas $

package javax.xml.transform;
public abstract class Transformer
{
protected  Transformer() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public abstract  void transform(javax.xml.transform.Source xmlSource, javax.xml.transform.Result outputTarget) throws javax.xml.transform.TransformerException;
public abstract  void setParameter(java.lang.String name, java.lang.Object value);
public abstract  java.lang.Object getParameter(java.lang.String name);
public abstract  void clearParameters();
public abstract  void setURIResolver(javax.xml.transform.URIResolver resolver);
public abstract  javax.xml.transform.URIResolver getURIResolver();
public abstract  void setOutputProperties(java.util.Properties oformat);
public abstract  java.util.Properties getOutputProperties();
public abstract  void setOutputProperty(java.lang.String name, java.lang.String value) throws java.lang.IllegalArgumentException;
public abstract  java.lang.String getOutputProperty(java.lang.String name) throws java.lang.IllegalArgumentException;
public abstract  void setErrorListener(javax.xml.transform.ErrorListener listener) throws java.lang.IllegalArgumentException;
public abstract  javax.xml.transform.ErrorListener getErrorListener();
}
