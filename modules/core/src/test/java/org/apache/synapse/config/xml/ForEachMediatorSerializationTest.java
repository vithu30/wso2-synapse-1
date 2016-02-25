/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.synapse.config.xml;

/**
 * Factory and Serializer tests for the ForEach mediator
 */
public class ForEachMediatorSerializationTest extends AbstractTestCase {

    ForEachMediatorFactory foreachMediatorFactory;
    ForEachMediatorSerializer foreachMediatorSerializer;

    public ForEachMediatorSerializationTest() {
        super(ForEachMediatorSerializationTest.class.getName());
        foreachMediatorFactory = new ForEachMediatorFactory();
        foreachMediatorSerializer = new ForEachMediatorSerializer();
    }

    public void testForEachMediatorSerialization_SequenceRef_ID() throws Exception {
        String inputXml = "<foreach expression=\".\" id=\"id\" sequence=\"sequenceRef1\" xmlns=\"http://ws.apache.org/ns/synapse\" statisticId=\"186104\"/>";
        assertTrue(serialization(inputXml, foreachMediatorFactory, foreachMediatorSerializer));
        assertTrue(serialization(inputXml, foreachMediatorSerializer));
    }

    public void testForEachMediatorSerialization_Sequence_ID() throws Exception {
        String inputXml = "<foreach expression=\".\" id=\"id\" xmlns=\"http://ws.apache.org/ns/synapse\" statisticId=\"186104\">" +
                "<sequence  statisticId=\"186104\">" +
                "<log level=\"full\"  statisticId=\"186104\"/>" +
                "</sequence>" +
                "</foreach>";
        assertTrue(serialization(inputXml, foreachMediatorFactory, foreachMediatorSerializer));
        assertTrue(serialization(inputXml, foreachMediatorSerializer));
    }

    public void testForEachMediatorSerialization_Sequence_ID_Comments() throws Exception {
        String inputXml = "<foreach expression=\".\" id=\"id\" xmlns=\"http://ws.apache.org/ns/synapse\" statisticId=\"186104\">" +
                "<sequence statisticId=\"186104\">" +
                "<log level=\"full\" statisticId=\"186104\"/>" +
                "<!--test comment -->" +
                "</sequence>" +
                "</foreach>";
        assertTrue(serialization(inputXml, foreachMediatorFactory, foreachMediatorSerializer));
        assertTrue(serialization(inputXml, foreachMediatorSerializer));
    }
}
