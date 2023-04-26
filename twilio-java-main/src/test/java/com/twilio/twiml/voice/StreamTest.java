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
 * Test class for {@link Stream}
 */
public class StreamTest {
    @Test
    public void testEmptyElement() {
        Stream elem = new Stream.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Stream/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Stream elem = new Stream.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CStream%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithParams() {
        Stream elem = new Stream.Builder()
            .name("name")
            .connectorName("connector_name")
            .url("url")
            .track(Stream.Track.INBOUND_TRACK)
            .statusCallback("status_callback")
            .statusCallbackMethod(Stream.StatusCallbackMethod.GET)
            .build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Stream connectorName=\"connector_name\" name=\"name\" statusCallback=\"status_callback\" statusCallbackMethod=\"GET\" track=\"inbound_track\" url=\"url\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithExtraAttributes() {
        Stream elem = new Stream.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Stream a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithChildren() {
        Stream.Builder builder = new Stream.Builder();

        builder.parameter(new Parameter.Builder().name("name").value("value").build());

        Stream elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Stream>" +
                "<Parameter name=\"name\" value=\"value\"/>" +
            "</Stream>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithTextNode() {
        Stream.Builder builder = new Stream.Builder();

        builder.addText("Hey no tags!");

        Stream elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Stream>" +
            "Hey no tags!" +
            "</Stream>",
            elem.toXml()
        );
    }

    @Test
    public void testMixedContent() {
        GenericNode.Builder child = new GenericNode.Builder("Child");
        child.addText("content");

        Stream.Builder builder = new Stream.Builder();

        builder.addText("before");
        builder.addChild(child.build());
        builder.addText("after");

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Stream>" +
            "before" +
            "<Child>content</Child>" +
            "after" +
            "</Stream>",
            builder.build().toXml()
        );
    }

    @Test
    public void testElementWithGenericNode() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        genericBuilder.addText("Some text");
        GenericNode node = genericBuilder.build();

        Stream.Builder builder = new Stream.Builder();
        Stream elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Stream>" +
            "<genericTag>" +
            "Some text" +
            "</genericTag>" +
            "</Stream>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithGenericNodeAttributes() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        GenericNode node = genericBuilder.option("key", "value").addText("someText").build();

        Stream.Builder builder = new Stream.Builder();
        Stream elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Stream>" +
            "<genericTag key=\"value\">" +
            "someText" +
            "</genericTag>" +
            "</Stream>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final Stream elem = new Stream.Builder()
            .name("name")
            .connectorName("connector_name")
            .url("url")
            .track(Stream.Track.INBOUND_TRACK)
            .statusCallback("status_callback")
            .statusCallbackMethod(Stream.StatusCallbackMethod.GET)
            .build();

        Assert.assertEquals(
            Stream.Builder.fromXml("<Stream connectorName=\"connector_name\" name=\"name\" statusCallback=\"status_callback\" statusCallbackMethod=\"GET\" track=\"inbound_track\" url=\"url\"/>").build().toXml(),
            elem.toXml()
        );
    }

    @Test
    public void testXmlChildrenDeserialization() {
        final Stream.Builder builder = new Stream.Builder();

        builder.parameter(new Parameter.Builder().name("name").value("value").build());

        final Stream elem = builder.build();

        Assert.assertEquals(
            Stream.Builder.fromXml("<Stream>" +
                "<Parameter name=\"name\" value=\"value\"/>" +
            "</Stream>").build().toXml(),
            elem.toXml()
        );
    }

    @Test
    public void testXmlEmptyChildrenDeserialization() {
        final Stream.Builder builder = new Stream.Builder();

        builder.parameter(new Parameter.Builder().build());

        final Stream elem = builder.build();

        Assert.assertEquals(
            Stream.Builder.fromXml("<Stream>" +
                "<Parameter/>" +
            "</Stream>").build().toXml(),
            elem.toXml()
        );
    }
}