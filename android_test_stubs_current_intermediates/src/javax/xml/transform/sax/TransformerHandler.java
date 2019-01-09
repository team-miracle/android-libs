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

// $Id: TransformerHandler.java 446598 2006-09-15 12:55:40Z jeremias $

package javax.xml.transform.sax;
public interface TransformerHandler
  extends org.xml.sax.ContentHandler, org.xml.sax.ext.LexicalHandler, org.xml.sax.DTDHandler
{
public abstract  void setResult(javax.xml.transform.Result result) throws java.lang.IllegalArgumentException;
public abstract  void setSystemId(java.lang.String systemID);
public abstract  java.lang.String getSystemId();
public abstract  javax.xml.transform.Transformer getTransformer();
}
