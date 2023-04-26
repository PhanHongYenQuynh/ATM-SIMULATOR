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

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.net.URI;



import java.net.URI;

public class FlexFlowCreator extends Creator<FlexFlow>{
    private String friendlyName;
    private String chatServiceSid;
    private FlexFlow.ChannelType channelType;
    private String contactIdentity;
    private Boolean enabled;
    private FlexFlow.IntegrationType integrationType;
    private String integrationFlowSid;
    private URI integrationUrl;
    private String integrationWorkspaceSid;
    private String integrationWorkflowSid;
    private String integrationChannel;
    private Integer integrationTimeout;
    private Integer integrationPriority;
    private Boolean integrationCreationOnMessage;
    private Boolean longLived;
    private Boolean janitorEnabled;
    private Integer integrationRetryCount;

    public FlexFlowCreator(final String friendlyName, final String chatServiceSid, final FlexFlow.ChannelType channelType) {
        this.friendlyName = friendlyName;
        this.chatServiceSid = chatServiceSid;
        this.channelType = channelType;
    }

    public FlexFlowCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public FlexFlowCreator setChatServiceSid(final String chatServiceSid){
        this.chatServiceSid = chatServiceSid;
        return this;
    }
    public FlexFlowCreator setChannelType(final FlexFlow.ChannelType channelType){
        this.channelType = channelType;
        return this;
    }
    public FlexFlowCreator setContactIdentity(final String contactIdentity){
        this.contactIdentity = contactIdentity;
        return this;
    }
    public FlexFlowCreator setEnabled(final Boolean enabled){
        this.enabled = enabled;
        return this;
    }
    public FlexFlowCreator setIntegrationType(final FlexFlow.IntegrationType integrationType){
        this.integrationType = integrationType;
        return this;
    }
    public FlexFlowCreator setIntegrationFlowSid(final String integrationFlowSid){
        this.integrationFlowSid = integrationFlowSid;
        return this;
    }
    public FlexFlowCreator setIntegrationUrl(final URI integrationUrl){
        this.integrationUrl = integrationUrl;
        return this;
    }

    public FlexFlowCreator setIntegrationUrl(final String integrationUrl){
        return setIntegrationUrl(Promoter.uriFromString(integrationUrl));
    }
    public FlexFlowCreator setIntegrationWorkspaceSid(final String integrationWorkspaceSid){
        this.integrationWorkspaceSid = integrationWorkspaceSid;
        return this;
    }
    public FlexFlowCreator setIntegrationWorkflowSid(final String integrationWorkflowSid){
        this.integrationWorkflowSid = integrationWorkflowSid;
        return this;
    }
    public FlexFlowCreator setIntegrationChannel(final String integrationChannel){
        this.integrationChannel = integrationChannel;
        return this;
    }
    public FlexFlowCreator setIntegrationTimeout(final Integer integrationTimeout){
        this.integrationTimeout = integrationTimeout;
        return this;
    }
    public FlexFlowCreator setIntegrationPriority(final Integer integrationPriority){
        this.integrationPriority = integrationPriority;
        return this;
    }
    public FlexFlowCreator setIntegrationCreationOnMessage(final Boolean integrationCreationOnMessage){
        this.integrationCreationOnMessage = integrationCreationOnMessage;
        return this;
    }
    public FlexFlowCreator setLongLived(final Boolean longLived){
        this.longLived = longLived;
        return this;
    }
    public FlexFlowCreator setJanitorEnabled(final Boolean janitorEnabled){
        this.janitorEnabled = janitorEnabled;
        return this;
    }
    public FlexFlowCreator setIntegrationRetryCount(final Integer integrationRetryCount){
        this.integrationRetryCount = integrationRetryCount;
        return this;
    }

    @Override
    public FlexFlow create(final TwilioRestClient client){
        String path = "/v1/FlexFlows";

        path = path.replace("{"+"FriendlyName"+"}", this.friendlyName.toString());
        path = path.replace("{"+"ChatServiceSid"+"}", this.chatServiceSid.toString());
        path = path.replace("{"+"ChannelType"+"}", this.channelType.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.FLEXAPI.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("FlexFlow creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return FlexFlow.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (chatServiceSid != null) {
            request.addPostParam("ChatServiceSid", chatServiceSid);
    
        }
        if (channelType != null) {
            request.addPostParam("ChannelType", channelType.toString());
    
        }
        if (contactIdentity != null) {
            request.addPostParam("ContactIdentity", contactIdentity);
    
        }
        if (enabled != null) {
            request.addPostParam("Enabled", enabled.toString());
    
        }
        if (integrationType != null) {
            request.addPostParam("IntegrationType", integrationType.toString());
    
        }
        if (integrationFlowSid != null) {
            request.addPostParam("Integration.FlowSid", integrationFlowSid);
    
        }
        if (integrationUrl != null) {
            request.addPostParam("Integration.Url", integrationUrl.toString());
    
        }
        if (integrationWorkspaceSid != null) {
            request.addPostParam("Integration.WorkspaceSid", integrationWorkspaceSid);
    
        }
        if (integrationWorkflowSid != null) {
            request.addPostParam("Integration.WorkflowSid", integrationWorkflowSid);
    
        }
        if (integrationChannel != null) {
            request.addPostParam("Integration.Channel", integrationChannel);
    
        }
        if (integrationTimeout != null) {
            request.addPostParam("Integration.Timeout", integrationTimeout.toString());
    
        }
        if (integrationPriority != null) {
            request.addPostParam("Integration.Priority", integrationPriority.toString());
    
        }
        if (integrationCreationOnMessage != null) {
            request.addPostParam("Integration.CreationOnMessage", integrationCreationOnMessage.toString());
    
        }
        if (longLived != null) {
            request.addPostParam("LongLived", longLived.toString());
    
        }
        if (janitorEnabled != null) {
            request.addPostParam("JanitorEnabled", janitorEnabled.toString());
    
        }
        if (integrationRetryCount != null) {
            request.addPostParam("Integration.RetryCount", integrationRetryCount.toString());
    
        }
    }
}