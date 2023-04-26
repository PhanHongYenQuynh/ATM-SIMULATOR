/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.math.BigDecimal;



public class AssessmentsUpdater extends Updater<Assessments>{
    private String pathAssessmentId;
    private BigDecimal offset;
    private String answerText;
    private String answerId;
    private String token;

    public AssessmentsUpdater(final String pathAssessmentId, final BigDecimal offset, final String answerText, final String answerId){
        this.pathAssessmentId = pathAssessmentId;
        this.offset = offset;
        this.answerText = answerText;
        this.answerId = answerId;
    }

    public AssessmentsUpdater setOffset(final BigDecimal offset){
        this.offset = offset;
        return this;
    }
    public AssessmentsUpdater setAnswerText(final String answerText){
        this.answerText = answerText;
        return this;
    }
    public AssessmentsUpdater setAnswerId(final String answerId){
        this.answerId = answerId;
        return this;
    }
    public AssessmentsUpdater setToken(final String token){
        this.token = token;
        return this;
    }

    @Override
    public Assessments update(final TwilioRestClient client){
        String path = "/v1/Insights/QM/Assessments/{AssessmentId}";

        path = path.replace("{"+"AssessmentId"+"}", this.pathAssessmentId.toString());
        path = path.replace("{"+"Offset"+"}", this.offset.toString());
        path = path.replace("{"+"AnswerText"+"}", this.answerText.toString());
        path = path.replace("{"+"AnswerId"+"}", this.answerId.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.FLEXAPI.toString(),
            path
        );
        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Assessments update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Assessments.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (offset != null) {
            request.addPostParam("Offset", offset.toString());
    
        }
        if (answerText != null) {
            request.addPostParam("AnswerText", answerText);
    
        }
        if (answerId != null) {
            request.addPostParam("AnswerId", answerId);
    
        }
    }
    private void addHeaderParams(final Request request) {
        if (token != null) {
            request.addHeaderParam("Token", token);

        }
    }
}