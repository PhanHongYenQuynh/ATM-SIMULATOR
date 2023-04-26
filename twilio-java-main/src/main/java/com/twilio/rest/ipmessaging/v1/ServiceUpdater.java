/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.ipmessaging.v1;

import com.twilio.base.Updater;
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

import java.util.List;


public class ServiceUpdater extends Updater<Service>{
    private String pathSid;
    private String friendlyName;
    private String defaultServiceRoleSid;
    private String defaultChannelRoleSid;
    private String defaultChannelCreatorRoleSid;
    private Boolean readStatusEnabled;
    private Boolean reachabilityEnabled;
    private Integer typingIndicatorTimeout;
    private Integer consumptionReportInterval;
    private Boolean notificationsNewMessageEnabled;
    private String notificationsNewMessageTemplate;
    private Boolean notificationsAddedToChannelEnabled;
    private String notificationsAddedToChannelTemplate;
    private Boolean notificationsRemovedFromChannelEnabled;
    private String notificationsRemovedFromChannelTemplate;
    private Boolean notificationsInvitedToChannelEnabled;
    private String notificationsInvitedToChannelTemplate;
    private URI preWebhookUrl;
    private URI postWebhookUrl;
    private HttpMethod webhookMethod;
    private List<String> webhookFilters;
    private URI webhooksOnMessageSendUrl;
    private HttpMethod webhooksOnMessageSendMethod;
    private URI webhooksOnMessageUpdateUrl;
    private HttpMethod webhooksOnMessageUpdateMethod;
    private URI webhooksOnMessageRemoveUrl;
    private HttpMethod webhooksOnMessageRemoveMethod;
    private URI webhooksOnChannelAddUrl;
    private HttpMethod webhooksOnChannelAddMethod;
    private URI webhooksOnChannelDestroyUrl;
    private HttpMethod webhooksOnChannelDestroyMethod;
    private URI webhooksOnChannelUpdateUrl;
    private HttpMethod webhooksOnChannelUpdateMethod;
    private URI webhooksOnMemberAddUrl;
    private HttpMethod webhooksOnMemberAddMethod;
    private URI webhooksOnMemberRemoveUrl;
    private HttpMethod webhooksOnMemberRemoveMethod;
    private URI webhooksOnMessageSentUrl;
    private HttpMethod webhooksOnMessageSentMethod;
    private URI webhooksOnMessageUpdatedUrl;
    private HttpMethod webhooksOnMessageUpdatedMethod;
    private URI webhooksOnMessageRemovedUrl;
    private HttpMethod webhooksOnMessageRemovedMethod;
    private URI webhooksOnChannelAddedUrl;
    private HttpMethod webhooksOnChannelAddedMethod;
    private URI webhooksOnChannelDestroyedUrl;
    private HttpMethod webhooksOnChannelDestroyedMethod;
    private URI webhooksOnChannelUpdatedUrl;
    private HttpMethod webhooksOnChannelUpdatedMethod;
    private URI webhooksOnMemberAddedUrl;
    private HttpMethod webhooksOnMemberAddedMethod;
    private URI webhooksOnMemberRemovedUrl;
    private HttpMethod webhooksOnMemberRemovedMethod;
    private Integer limitsChannelMembers;
    private Integer limitsUserChannels;

    public ServiceUpdater(final String pathSid){
        this.pathSid = pathSid;
    }

    public ServiceUpdater setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public ServiceUpdater setDefaultServiceRoleSid(final String defaultServiceRoleSid){
        this.defaultServiceRoleSid = defaultServiceRoleSid;
        return this;
    }
    public ServiceUpdater setDefaultChannelRoleSid(final String defaultChannelRoleSid){
        this.defaultChannelRoleSid = defaultChannelRoleSid;
        return this;
    }
    public ServiceUpdater setDefaultChannelCreatorRoleSid(final String defaultChannelCreatorRoleSid){
        this.defaultChannelCreatorRoleSid = defaultChannelCreatorRoleSid;
        return this;
    }
    public ServiceUpdater setReadStatusEnabled(final Boolean readStatusEnabled){
        this.readStatusEnabled = readStatusEnabled;
        return this;
    }
    public ServiceUpdater setReachabilityEnabled(final Boolean reachabilityEnabled){
        this.reachabilityEnabled = reachabilityEnabled;
        return this;
    }
    public ServiceUpdater setTypingIndicatorTimeout(final Integer typingIndicatorTimeout){
        this.typingIndicatorTimeout = typingIndicatorTimeout;
        return this;
    }
    public ServiceUpdater setConsumptionReportInterval(final Integer consumptionReportInterval){
        this.consumptionReportInterval = consumptionReportInterval;
        return this;
    }
    public ServiceUpdater setNotificationsNewMessageEnabled(final Boolean notificationsNewMessageEnabled){
        this.notificationsNewMessageEnabled = notificationsNewMessageEnabled;
        return this;
    }
    public ServiceUpdater setNotificationsNewMessageTemplate(final String notificationsNewMessageTemplate){
        this.notificationsNewMessageTemplate = notificationsNewMessageTemplate;
        return this;
    }
    public ServiceUpdater setNotificationsAddedToChannelEnabled(final Boolean notificationsAddedToChannelEnabled){
        this.notificationsAddedToChannelEnabled = notificationsAddedToChannelEnabled;
        return this;
    }
    public ServiceUpdater setNotificationsAddedToChannelTemplate(final String notificationsAddedToChannelTemplate){
        this.notificationsAddedToChannelTemplate = notificationsAddedToChannelTemplate;
        return this;
    }
    public ServiceUpdater setNotificationsRemovedFromChannelEnabled(final Boolean notificationsRemovedFromChannelEnabled){
        this.notificationsRemovedFromChannelEnabled = notificationsRemovedFromChannelEnabled;
        return this;
    }
    public ServiceUpdater setNotificationsRemovedFromChannelTemplate(final String notificationsRemovedFromChannelTemplate){
        this.notificationsRemovedFromChannelTemplate = notificationsRemovedFromChannelTemplate;
        return this;
    }
    public ServiceUpdater setNotificationsInvitedToChannelEnabled(final Boolean notificationsInvitedToChannelEnabled){
        this.notificationsInvitedToChannelEnabled = notificationsInvitedToChannelEnabled;
        return this;
    }
    public ServiceUpdater setNotificationsInvitedToChannelTemplate(final String notificationsInvitedToChannelTemplate){
        this.notificationsInvitedToChannelTemplate = notificationsInvitedToChannelTemplate;
        return this;
    }
    public ServiceUpdater setPreWebhookUrl(final URI preWebhookUrl){
        this.preWebhookUrl = preWebhookUrl;
        return this;
    }

    public ServiceUpdater setPreWebhookUrl(final String preWebhookUrl){
        return setPreWebhookUrl(Promoter.uriFromString(preWebhookUrl));
    }
    public ServiceUpdater setPostWebhookUrl(final URI postWebhookUrl){
        this.postWebhookUrl = postWebhookUrl;
        return this;
    }

    public ServiceUpdater setPostWebhookUrl(final String postWebhookUrl){
        return setPostWebhookUrl(Promoter.uriFromString(postWebhookUrl));
    }
    public ServiceUpdater setWebhookMethod(final HttpMethod webhookMethod){
        this.webhookMethod = webhookMethod;
        return this;
    }
    public ServiceUpdater setWebhookFilters(final List<String> webhookFilters){
        this.webhookFilters = webhookFilters;
        return this;
    }
    public ServiceUpdater setWebhookFilters(final String webhookFilters){
        return setWebhookFilters(Promoter.listOfOne(webhookFilters));
    }
    public ServiceUpdater setWebhooksOnMessageSendUrl(final URI webhooksOnMessageSendUrl){
        this.webhooksOnMessageSendUrl = webhooksOnMessageSendUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMessageSendUrl(final String webhooksOnMessageSendUrl){
        return setWebhooksOnMessageSendUrl(Promoter.uriFromString(webhooksOnMessageSendUrl));
    }
    public ServiceUpdater setWebhooksOnMessageSendMethod(final HttpMethod webhooksOnMessageSendMethod){
        this.webhooksOnMessageSendMethod = webhooksOnMessageSendMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnMessageUpdateUrl(final URI webhooksOnMessageUpdateUrl){
        this.webhooksOnMessageUpdateUrl = webhooksOnMessageUpdateUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMessageUpdateUrl(final String webhooksOnMessageUpdateUrl){
        return setWebhooksOnMessageUpdateUrl(Promoter.uriFromString(webhooksOnMessageUpdateUrl));
    }
    public ServiceUpdater setWebhooksOnMessageUpdateMethod(final HttpMethod webhooksOnMessageUpdateMethod){
        this.webhooksOnMessageUpdateMethod = webhooksOnMessageUpdateMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnMessageRemoveUrl(final URI webhooksOnMessageRemoveUrl){
        this.webhooksOnMessageRemoveUrl = webhooksOnMessageRemoveUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMessageRemoveUrl(final String webhooksOnMessageRemoveUrl){
        return setWebhooksOnMessageRemoveUrl(Promoter.uriFromString(webhooksOnMessageRemoveUrl));
    }
    public ServiceUpdater setWebhooksOnMessageRemoveMethod(final HttpMethod webhooksOnMessageRemoveMethod){
        this.webhooksOnMessageRemoveMethod = webhooksOnMessageRemoveMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnChannelAddUrl(final URI webhooksOnChannelAddUrl){
        this.webhooksOnChannelAddUrl = webhooksOnChannelAddUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnChannelAddUrl(final String webhooksOnChannelAddUrl){
        return setWebhooksOnChannelAddUrl(Promoter.uriFromString(webhooksOnChannelAddUrl));
    }
    public ServiceUpdater setWebhooksOnChannelAddMethod(final HttpMethod webhooksOnChannelAddMethod){
        this.webhooksOnChannelAddMethod = webhooksOnChannelAddMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnChannelDestroyUrl(final URI webhooksOnChannelDestroyUrl){
        this.webhooksOnChannelDestroyUrl = webhooksOnChannelDestroyUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnChannelDestroyUrl(final String webhooksOnChannelDestroyUrl){
        return setWebhooksOnChannelDestroyUrl(Promoter.uriFromString(webhooksOnChannelDestroyUrl));
    }
    public ServiceUpdater setWebhooksOnChannelDestroyMethod(final HttpMethod webhooksOnChannelDestroyMethod){
        this.webhooksOnChannelDestroyMethod = webhooksOnChannelDestroyMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnChannelUpdateUrl(final URI webhooksOnChannelUpdateUrl){
        this.webhooksOnChannelUpdateUrl = webhooksOnChannelUpdateUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnChannelUpdateUrl(final String webhooksOnChannelUpdateUrl){
        return setWebhooksOnChannelUpdateUrl(Promoter.uriFromString(webhooksOnChannelUpdateUrl));
    }
    public ServiceUpdater setWebhooksOnChannelUpdateMethod(final HttpMethod webhooksOnChannelUpdateMethod){
        this.webhooksOnChannelUpdateMethod = webhooksOnChannelUpdateMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnMemberAddUrl(final URI webhooksOnMemberAddUrl){
        this.webhooksOnMemberAddUrl = webhooksOnMemberAddUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMemberAddUrl(final String webhooksOnMemberAddUrl){
        return setWebhooksOnMemberAddUrl(Promoter.uriFromString(webhooksOnMemberAddUrl));
    }
    public ServiceUpdater setWebhooksOnMemberAddMethod(final HttpMethod webhooksOnMemberAddMethod){
        this.webhooksOnMemberAddMethod = webhooksOnMemberAddMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnMemberRemoveUrl(final URI webhooksOnMemberRemoveUrl){
        this.webhooksOnMemberRemoveUrl = webhooksOnMemberRemoveUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMemberRemoveUrl(final String webhooksOnMemberRemoveUrl){
        return setWebhooksOnMemberRemoveUrl(Promoter.uriFromString(webhooksOnMemberRemoveUrl));
    }
    public ServiceUpdater setWebhooksOnMemberRemoveMethod(final HttpMethod webhooksOnMemberRemoveMethod){
        this.webhooksOnMemberRemoveMethod = webhooksOnMemberRemoveMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnMessageSentUrl(final URI webhooksOnMessageSentUrl){
        this.webhooksOnMessageSentUrl = webhooksOnMessageSentUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMessageSentUrl(final String webhooksOnMessageSentUrl){
        return setWebhooksOnMessageSentUrl(Promoter.uriFromString(webhooksOnMessageSentUrl));
    }
    public ServiceUpdater setWebhooksOnMessageSentMethod(final HttpMethod webhooksOnMessageSentMethod){
        this.webhooksOnMessageSentMethod = webhooksOnMessageSentMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnMessageUpdatedUrl(final URI webhooksOnMessageUpdatedUrl){
        this.webhooksOnMessageUpdatedUrl = webhooksOnMessageUpdatedUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMessageUpdatedUrl(final String webhooksOnMessageUpdatedUrl){
        return setWebhooksOnMessageUpdatedUrl(Promoter.uriFromString(webhooksOnMessageUpdatedUrl));
    }
    public ServiceUpdater setWebhooksOnMessageUpdatedMethod(final HttpMethod webhooksOnMessageUpdatedMethod){
        this.webhooksOnMessageUpdatedMethod = webhooksOnMessageUpdatedMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnMessageRemovedUrl(final URI webhooksOnMessageRemovedUrl){
        this.webhooksOnMessageRemovedUrl = webhooksOnMessageRemovedUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMessageRemovedUrl(final String webhooksOnMessageRemovedUrl){
        return setWebhooksOnMessageRemovedUrl(Promoter.uriFromString(webhooksOnMessageRemovedUrl));
    }
    public ServiceUpdater setWebhooksOnMessageRemovedMethod(final HttpMethod webhooksOnMessageRemovedMethod){
        this.webhooksOnMessageRemovedMethod = webhooksOnMessageRemovedMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnChannelAddedUrl(final URI webhooksOnChannelAddedUrl){
        this.webhooksOnChannelAddedUrl = webhooksOnChannelAddedUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnChannelAddedUrl(final String webhooksOnChannelAddedUrl){
        return setWebhooksOnChannelAddedUrl(Promoter.uriFromString(webhooksOnChannelAddedUrl));
    }
    public ServiceUpdater setWebhooksOnChannelAddedMethod(final HttpMethod webhooksOnChannelAddedMethod){
        this.webhooksOnChannelAddedMethod = webhooksOnChannelAddedMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnChannelDestroyedUrl(final URI webhooksOnChannelDestroyedUrl){
        this.webhooksOnChannelDestroyedUrl = webhooksOnChannelDestroyedUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnChannelDestroyedUrl(final String webhooksOnChannelDestroyedUrl){
        return setWebhooksOnChannelDestroyedUrl(Promoter.uriFromString(webhooksOnChannelDestroyedUrl));
    }
    public ServiceUpdater setWebhooksOnChannelDestroyedMethod(final HttpMethod webhooksOnChannelDestroyedMethod){
        this.webhooksOnChannelDestroyedMethod = webhooksOnChannelDestroyedMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnChannelUpdatedUrl(final URI webhooksOnChannelUpdatedUrl){
        this.webhooksOnChannelUpdatedUrl = webhooksOnChannelUpdatedUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnChannelUpdatedUrl(final String webhooksOnChannelUpdatedUrl){
        return setWebhooksOnChannelUpdatedUrl(Promoter.uriFromString(webhooksOnChannelUpdatedUrl));
    }
    public ServiceUpdater setWebhooksOnChannelUpdatedMethod(final HttpMethod webhooksOnChannelUpdatedMethod){
        this.webhooksOnChannelUpdatedMethod = webhooksOnChannelUpdatedMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnMemberAddedUrl(final URI webhooksOnMemberAddedUrl){
        this.webhooksOnMemberAddedUrl = webhooksOnMemberAddedUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMemberAddedUrl(final String webhooksOnMemberAddedUrl){
        return setWebhooksOnMemberAddedUrl(Promoter.uriFromString(webhooksOnMemberAddedUrl));
    }
    public ServiceUpdater setWebhooksOnMemberAddedMethod(final HttpMethod webhooksOnMemberAddedMethod){
        this.webhooksOnMemberAddedMethod = webhooksOnMemberAddedMethod;
        return this;
    }
    public ServiceUpdater setWebhooksOnMemberRemovedUrl(final URI webhooksOnMemberRemovedUrl){
        this.webhooksOnMemberRemovedUrl = webhooksOnMemberRemovedUrl;
        return this;
    }

    public ServiceUpdater setWebhooksOnMemberRemovedUrl(final String webhooksOnMemberRemovedUrl){
        return setWebhooksOnMemberRemovedUrl(Promoter.uriFromString(webhooksOnMemberRemovedUrl));
    }
    public ServiceUpdater setWebhooksOnMemberRemovedMethod(final HttpMethod webhooksOnMemberRemovedMethod){
        this.webhooksOnMemberRemovedMethod = webhooksOnMemberRemovedMethod;
        return this;
    }
    public ServiceUpdater setLimitsChannelMembers(final Integer limitsChannelMembers){
        this.limitsChannelMembers = limitsChannelMembers;
        return this;
    }
    public ServiceUpdater setLimitsUserChannels(final Integer limitsUserChannels){
        this.limitsUserChannels = limitsUserChannels;
        return this;
    }

    @Override
    public Service update(final TwilioRestClient client){
        String path = "/v1/Services/{Sid}";

        path = path.replace("{"+"Sid"+"}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.IPMESSAGING.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Service update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Service.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (defaultServiceRoleSid != null) {
            request.addPostParam("DefaultServiceRoleSid", defaultServiceRoleSid);
    
        }
        if (defaultChannelRoleSid != null) {
            request.addPostParam("DefaultChannelRoleSid", defaultChannelRoleSid);
    
        }
        if (defaultChannelCreatorRoleSid != null) {
            request.addPostParam("DefaultChannelCreatorRoleSid", defaultChannelCreatorRoleSid);
    
        }
        if (readStatusEnabled != null) {
            request.addPostParam("ReadStatusEnabled", readStatusEnabled.toString());
    
        }
        if (reachabilityEnabled != null) {
            request.addPostParam("ReachabilityEnabled", reachabilityEnabled.toString());
    
        }
        if (typingIndicatorTimeout != null) {
            request.addPostParam("TypingIndicatorTimeout", typingIndicatorTimeout.toString());
    
        }
        if (consumptionReportInterval != null) {
            request.addPostParam("ConsumptionReportInterval", consumptionReportInterval.toString());
    
        }
        if (notificationsNewMessageEnabled != null) {
            request.addPostParam("Notifications.NewMessage.Enabled", notificationsNewMessageEnabled.toString());
    
        }
        if (notificationsNewMessageTemplate != null) {
            request.addPostParam("Notifications.NewMessage.Template", notificationsNewMessageTemplate);
    
        }
        if (notificationsAddedToChannelEnabled != null) {
            request.addPostParam("Notifications.AddedToChannel.Enabled", notificationsAddedToChannelEnabled.toString());
    
        }
        if (notificationsAddedToChannelTemplate != null) {
            request.addPostParam("Notifications.AddedToChannel.Template", notificationsAddedToChannelTemplate);
    
        }
        if (notificationsRemovedFromChannelEnabled != null) {
            request.addPostParam("Notifications.RemovedFromChannel.Enabled", notificationsRemovedFromChannelEnabled.toString());
    
        }
        if (notificationsRemovedFromChannelTemplate != null) {
            request.addPostParam("Notifications.RemovedFromChannel.Template", notificationsRemovedFromChannelTemplate);
    
        }
        if (notificationsInvitedToChannelEnabled != null) {
            request.addPostParam("Notifications.InvitedToChannel.Enabled", notificationsInvitedToChannelEnabled.toString());
    
        }
        if (notificationsInvitedToChannelTemplate != null) {
            request.addPostParam("Notifications.InvitedToChannel.Template", notificationsInvitedToChannelTemplate);
    
        }
        if (preWebhookUrl != null) {
            request.addPostParam("PreWebhookUrl", preWebhookUrl.toString());
    
        }
        if (postWebhookUrl != null) {
            request.addPostParam("PostWebhookUrl", postWebhookUrl.toString());
    
        }
        if (webhookMethod != null) {
            request.addPostParam("WebhookMethod", webhookMethod.toString());
    
        }
        if (webhookFilters != null) {
            for (String prop : webhookFilters) {
                request.addPostParam("WebhookFilters", prop);
            }
    
        }
        if (webhooksOnMessageSendUrl != null) {
            request.addPostParam("Webhooks.OnMessageSend.Url", webhooksOnMessageSendUrl.toString());
    
        }
        if (webhooksOnMessageSendMethod != null) {
            request.addPostParam("Webhooks.OnMessageSend.Method", webhooksOnMessageSendMethod.toString());
    
        }
        if (webhooksOnMessageUpdateUrl != null) {
            request.addPostParam("Webhooks.OnMessageUpdate.Url", webhooksOnMessageUpdateUrl.toString());
    
        }
        if (webhooksOnMessageUpdateMethod != null) {
            request.addPostParam("Webhooks.OnMessageUpdate.Method", webhooksOnMessageUpdateMethod.toString());
    
        }
        if (webhooksOnMessageRemoveUrl != null) {
            request.addPostParam("Webhooks.OnMessageRemove.Url", webhooksOnMessageRemoveUrl.toString());
    
        }
        if (webhooksOnMessageRemoveMethod != null) {
            request.addPostParam("Webhooks.OnMessageRemove.Method", webhooksOnMessageRemoveMethod.toString());
    
        }
        if (webhooksOnChannelAddUrl != null) {
            request.addPostParam("Webhooks.OnChannelAdd.Url", webhooksOnChannelAddUrl.toString());
    
        }
        if (webhooksOnChannelAddMethod != null) {
            request.addPostParam("Webhooks.OnChannelAdd.Method", webhooksOnChannelAddMethod.toString());
    
        }
        if (webhooksOnChannelDestroyUrl != null) {
            request.addPostParam("Webhooks.OnChannelDestroy.Url", webhooksOnChannelDestroyUrl.toString());
    
        }
        if (webhooksOnChannelDestroyMethod != null) {
            request.addPostParam("Webhooks.OnChannelDestroy.Method", webhooksOnChannelDestroyMethod.toString());
    
        }
        if (webhooksOnChannelUpdateUrl != null) {
            request.addPostParam("Webhooks.OnChannelUpdate.Url", webhooksOnChannelUpdateUrl.toString());
    
        }
        if (webhooksOnChannelUpdateMethod != null) {
            request.addPostParam("Webhooks.OnChannelUpdate.Method", webhooksOnChannelUpdateMethod.toString());
    
        }
        if (webhooksOnMemberAddUrl != null) {
            request.addPostParam("Webhooks.OnMemberAdd.Url", webhooksOnMemberAddUrl.toString());
    
        }
        if (webhooksOnMemberAddMethod != null) {
            request.addPostParam("Webhooks.OnMemberAdd.Method", webhooksOnMemberAddMethod.toString());
    
        }
        if (webhooksOnMemberRemoveUrl != null) {
            request.addPostParam("Webhooks.OnMemberRemove.Url", webhooksOnMemberRemoveUrl.toString());
    
        }
        if (webhooksOnMemberRemoveMethod != null) {
            request.addPostParam("Webhooks.OnMemberRemove.Method", webhooksOnMemberRemoveMethod.toString());
    
        }
        if (webhooksOnMessageSentUrl != null) {
            request.addPostParam("Webhooks.OnMessageSent.Url", webhooksOnMessageSentUrl.toString());
    
        }
        if (webhooksOnMessageSentMethod != null) {
            request.addPostParam("Webhooks.OnMessageSent.Method", webhooksOnMessageSentMethod.toString());
    
        }
        if (webhooksOnMessageUpdatedUrl != null) {
            request.addPostParam("Webhooks.OnMessageUpdated.Url", webhooksOnMessageUpdatedUrl.toString());
    
        }
        if (webhooksOnMessageUpdatedMethod != null) {
            request.addPostParam("Webhooks.OnMessageUpdated.Method", webhooksOnMessageUpdatedMethod.toString());
    
        }
        if (webhooksOnMessageRemovedUrl != null) {
            request.addPostParam("Webhooks.OnMessageRemoved.Url", webhooksOnMessageRemovedUrl.toString());
    
        }
        if (webhooksOnMessageRemovedMethod != null) {
            request.addPostParam("Webhooks.OnMessageRemoved.Method", webhooksOnMessageRemovedMethod.toString());
    
        }
        if (webhooksOnChannelAddedUrl != null) {
            request.addPostParam("Webhooks.OnChannelAdded.Url", webhooksOnChannelAddedUrl.toString());
    
        }
        if (webhooksOnChannelAddedMethod != null) {
            request.addPostParam("Webhooks.OnChannelAdded.Method", webhooksOnChannelAddedMethod.toString());
    
        }
        if (webhooksOnChannelDestroyedUrl != null) {
            request.addPostParam("Webhooks.OnChannelDestroyed.Url", webhooksOnChannelDestroyedUrl.toString());
    
        }
        if (webhooksOnChannelDestroyedMethod != null) {
            request.addPostParam("Webhooks.OnChannelDestroyed.Method", webhooksOnChannelDestroyedMethod.toString());
    
        }
        if (webhooksOnChannelUpdatedUrl != null) {
            request.addPostParam("Webhooks.OnChannelUpdated.Url", webhooksOnChannelUpdatedUrl.toString());
    
        }
        if (webhooksOnChannelUpdatedMethod != null) {
            request.addPostParam("Webhooks.OnChannelUpdated.Method", webhooksOnChannelUpdatedMethod.toString());
    
        }
        if (webhooksOnMemberAddedUrl != null) {
            request.addPostParam("Webhooks.OnMemberAdded.Url", webhooksOnMemberAddedUrl.toString());
    
        }
        if (webhooksOnMemberAddedMethod != null) {
            request.addPostParam("Webhooks.OnMemberAdded.Method", webhooksOnMemberAddedMethod.toString());
    
        }
        if (webhooksOnMemberRemovedUrl != null) {
            request.addPostParam("Webhooks.OnMemberRemoved.Url", webhooksOnMemberRemovedUrl.toString());
    
        }
        if (webhooksOnMemberRemovedMethod != null) {
            request.addPostParam("Webhooks.OnMemberRemoved.Method", webhooksOnMemberRemovedMethod.toString());
    
        }
        if (limitsChannelMembers != null) {
            request.addPostParam("Limits.ChannelMembers", limitsChannelMembers.toString());
    
        }
        if (limitsUserChannels != null) {
            request.addPostParam("Limits.UserChannels", limitsUserChannels.toString());
    
        }
    }
}
