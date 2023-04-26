/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.converter.Promoter;
import com.twilio.http.HttpMethod;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.util.List;

/**
 * Test class for {@link Number}
 */
public class NumberTest {
    @Test
    public void testElementWithParams() {
        Number elem = new Number.Builder(new com.twilio.type.PhoneNumber("+15017122661"))
            .sendDigits("send_digits")
            .url(URI.create("https://example.com"))
            .method(HttpMethod.GET)
            .statusCallbackEvents(Promoter.listOfOne(Number.Event.INITIATED))
            .statusCallback(URI.create("https://example.com"))
            .statusCallbackMethod(HttpMethod.GET)
            .byoc("BYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
            .machineDetection("machine_detection")
            .amdStatusCallbackMethod(HttpMethod.GET)
            .amdStatusCallback("amd_status_callback")
            .machineDetectionTimeout(1)
            .machineDetectionSpeechThreshold(1)
            .machineDetectionSpeechEndThreshold(1)
            .machineDetectionSilenceTimeout(1)
            .build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Number amdStatusCallback=\"amd_status_callback\" amdStatusCallbackMethod=\"GET\" byoc=\"BYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\" machineDetection=\"machine_detection\" machineDetectionSilenceTimeout=\"1\" machineDetectionSpeechEndThreshold=\"1\" machineDetectionSpeechThreshold=\"1\" machineDetectionTimeout=\"1\" method=\"GET\" sendDigits=\"send_digits\" statusCallback=\"https://example.com\" statusCallbackEvent=\"initiated\" statusCallbackMethod=\"GET\" url=\"https://example.com\">+15017122661</Number>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final Number elem = new Number.Builder(new com.twilio.type.PhoneNumber("+15017122661"))
            .sendDigits("send_digits")
            .url(URI.create("https://example.com"))
            .method(HttpMethod.GET)
            .statusCallbackEvents(Promoter.listOfOne(Number.Event.INITIATED))
            .statusCallback(URI.create("https://example.com"))
            .statusCallbackMethod(HttpMethod.GET)
            .byoc("BYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
            .machineDetection("machine_detection")
            .amdStatusCallbackMethod(HttpMethod.GET)
            .amdStatusCallback("amd_status_callback")
            .machineDetectionTimeout(1)
            .machineDetectionSpeechThreshold(1)
            .machineDetectionSpeechEndThreshold(1)
            .machineDetectionSilenceTimeout(1)
            .build();

        Assert.assertEquals(
            Number.Builder.fromXml("<Number amdStatusCallback=\"amd_status_callback\" amdStatusCallbackMethod=\"GET\" byoc=\"BYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\" machineDetection=\"machine_detection\" machineDetectionSilenceTimeout=\"1\" machineDetectionSpeechEndThreshold=\"1\" machineDetectionSpeechThreshold=\"1\" machineDetectionTimeout=\"1\" method=\"GET\" sendDigits=\"send_digits\" statusCallback=\"https://example.com\" statusCallbackEvent=\"initiated\" statusCallbackMethod=\"GET\" url=\"https://example.com\">+15017122661</Number>").build().toXml(),
            elem.toXml()
        );
    }
}