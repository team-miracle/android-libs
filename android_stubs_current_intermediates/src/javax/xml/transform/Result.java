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

//  $Id: Result.java 446598 2006-09-15 12:55:40Z jeremias $

package javax.xml.transform;
public interface Result
{
public abstract  void setSystemId(java.lang.String systemId);
public abstract  java.lang.String getSystemId();
public static final java.lang.String PI_DISABLE_OUTPUT_ESCAPING = "javax.xml.transform.disable-output-escaping";
public static final java.lang.String PI_ENABLE_OUTPUT_ESCAPING = "javax.xml.transform.enable-output-escaping";
}
