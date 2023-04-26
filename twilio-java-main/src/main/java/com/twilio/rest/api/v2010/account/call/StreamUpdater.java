/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account.call;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class StreamUpdater extends Updater<Stream>{
    private String pathCallSid;
    private String pathSid;
    private Stream.UpdateStatus status;
    private String pathAccountSid;

    public StreamUpdater(final String pathCallSid, final String pathSid, final Stream.UpdateStatus status){
        this.pathCallSid = pathCallSid;
        this.pathSid = pathSid;
        this.status = status;
    }
    public StreamUpdater(final String pathAccountSid, final String pathCallSid, final String pathSid, final Stream.UpdateStatus status){
        this.pathAccountSid = pathAccountSid;
        this.pathCallSid = pathCallSid;
        this.pathSid = pathSid;
        this.status = status;
    }

    public StreamUpdater setStatus(final Stream.UpdateStatus status){
        this.status = status;
        return this;
    }

    @Override
    public Stream update(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/Calls/{CallSid}/Streams/{Sid}.json";

        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        path = path.replace("{"+"AccountSid"+"}", this.pathAccountSid.toString());
        path = path.replace("{"+"CallSid"+"}", this.pathCallSid.toString());
        path = path.replace("{"+"Sid"+"}", this.pathSid.toString());
        path = path.replace("{"+"Status"+"}", this.status.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Stream update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Stream.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (status != null) {
            request.addPostParam("Status", status.toString());
    
        }
    }
}
