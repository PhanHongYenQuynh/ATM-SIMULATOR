/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.preview.understand.assistant.fieldtype;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class FieldValueFetcher extends Fetcher<FieldValue> {
    private String pathAssistantSid;
    private String pathFieldTypeSid;
    private String pathSid;

    public FieldValueFetcher(final String pathAssistantSid, final String pathFieldTypeSid, final String pathSid){
        this.pathAssistantSid = pathAssistantSid;
        this.pathFieldTypeSid = pathFieldTypeSid;
        this.pathSid = pathSid;
    }


    @Override
    public FieldValue fetch(final TwilioRestClient client) {
        String path = "/understand/Assistants/{AssistantSid}/FieldTypes/{FieldTypeSid}/FieldValues/{Sid}";

        path = path.replace("{"+"AssistantSid"+"}", this.pathAssistantSid.toString());
        path = path.replace("{"+"FieldTypeSid"+"}", this.pathFieldTypeSid.toString());
        path = path.replace("{"+"Sid"+"}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.PREVIEW.toString(),
            path
        );
        Response response = client.request(request);

        if (response == null) {
        throw new ApiConnectionException("FieldValue fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return FieldValue.fromJson(response.getStream(), client.getObjectMapper());
    }
}
