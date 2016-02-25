/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *   * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.apache.synapse.config.xml;

public class RespondMediatorSerializationTest extends AbstractTestCase {
    RespondMediatorFactory respondMediatorFactory;
    RespondMediatorSerializer respondMediatorSerializer;


    public RespondMediatorSerializationTest() {
        super(RespondMediatorSerializationTest.class.getName());
        respondMediatorFactory = new RespondMediatorFactory();
        respondMediatorSerializer = new RespondMediatorSerializer();
    }

    public void testRespondMediatorSerializationOne() throws Exception {
        String inputXml = "<respond xmlns=\"http://ws.apache.org/ns/synapse\" statisticId=\"186104\"/>";
        assertTrue(serialization(inputXml, respondMediatorFactory, respondMediatorSerializer));
        assertTrue(serialization(inputXml, respondMediatorSerializer));
    }
}
