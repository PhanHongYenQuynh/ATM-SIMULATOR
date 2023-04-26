/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.twiml.GenericNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Config}
 */
public class ConfigTest {
    @Test
    public void testEmptyElement() {
        Config elem = new Config.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Config/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Config elem = new Config.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CConfig%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithParams() {
        Config elem = new Config.Builder().name("name").value("value").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Config name=\"name\" value=\"value\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithExtraAttributes() {
        Config elem = new Config.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Config a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithTextNode() {
        Config.Builder builder = new Config.Builder();

        builder.addText("Hey no tags!");

        Config elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Config>" +
            "Hey no tags!" +
            "</Config>",
            elem.toXml()
        );
    }

    @Test
    public void testMixedContent() {
        GenericNode.Builder child = new GenericNode.Builder("Child");
        child.addText("content");

        Config.Builder builder = new Config.Builder();

        builder.addText("before");
        builder.addChild(child.build());
        builder.addText("after");

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Config>" +
            "before" +
            "<Child>content</Child>" +
            "after" +
            "</Config>",
            builder.build().toXml()
        );
    }

    @Test
    public void testElementWithGenericNode() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        genericBuilder.addText("Some text");
        GenericNode node = genericBuilder.build();

        Config.Builder builder = new Config.Builder();
        Config elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Config>" +
            "<genericTag>" +
            "Some text" +
            "</genericTag>" +
            "</Config>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final Config elem = new Config.Builder().name("name").value("value").build();

        Assert.assertEquals(
            Config.Builder.fromXml("<Config name=\"name\" value=\"value\"/>").build().toXml(),
            elem.toXml()
        );
    }
}