/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.messaging.v1;

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
import java.util.List;

import java.util.List;



public class TollfreeVerificationCreator extends Creator<TollfreeVerification>{
    private String businessName;
    private String businessWebsite;
    private String notificationEmail;
    private List<String> useCaseCategories;
    private String useCaseSummary;
    private String productionMessageSample;
    private List<String> optInImageUrls;
    private TollfreeVerification.OptInType optInType;
    private String messageVolume;
    private String tollfreePhoneNumberSid;
    private String customerProfileSid;
    private String businessStreetAddress;
    private String businessStreetAddress2;
    private String businessCity;
    private String businessStateProvinceRegion;
    private String businessPostalCode;
    private String businessCountry;
    private String additionalInformation;
    private String businessContactFirstName;
    private String businessContactLastName;
    private String businessContactEmail;
    private com.twilio.type.PhoneNumber businessContactPhone;
    private String externalReferenceId;

    public TollfreeVerificationCreator(final String businessName, final String businessWebsite, final String notificationEmail, final List<String> useCaseCategories, final String useCaseSummary, final String productionMessageSample, final List<String> optInImageUrls, final TollfreeVerification.OptInType optInType, final String messageVolume, final String tollfreePhoneNumberSid) {
        this.businessName = businessName;
        this.businessWebsite = businessWebsite;
        this.notificationEmail = notificationEmail;
        this.useCaseCategories = useCaseCategories;
        this.useCaseSummary = useCaseSummary;
        this.productionMessageSample = productionMessageSample;
        this.optInImageUrls = optInImageUrls;
        this.optInType = optInType;
        this.messageVolume = messageVolume;
        this.tollfreePhoneNumberSid = tollfreePhoneNumberSid;
    }

    public TollfreeVerificationCreator setBusinessName(final String businessName){
        this.businessName = businessName;
        return this;
    }
    public TollfreeVerificationCreator setBusinessWebsite(final String businessWebsite){
        this.businessWebsite = businessWebsite;
        return this;
    }
    public TollfreeVerificationCreator setNotificationEmail(final String notificationEmail){
        this.notificationEmail = notificationEmail;
        return this;
    }
    public TollfreeVerificationCreator setUseCaseCategories(final List<String> useCaseCategories){
        this.useCaseCategories = useCaseCategories;
        return this;
    }
    public TollfreeVerificationCreator setUseCaseCategories(final String useCaseCategories){
        return setUseCaseCategories(Promoter.listOfOne(useCaseCategories));
    }
    public TollfreeVerificationCreator setUseCaseSummary(final String useCaseSummary){
        this.useCaseSummary = useCaseSummary;
        return this;
    }
    public TollfreeVerificationCreator setProductionMessageSample(final String productionMessageSample){
        this.productionMessageSample = productionMessageSample;
        return this;
    }
    public TollfreeVerificationCreator setOptInImageUrls(final List<String> optInImageUrls){
        this.optInImageUrls = optInImageUrls;
        return this;
    }
    public TollfreeVerificationCreator setOptInImageUrls(final String optInImageUrls){
        return setOptInImageUrls(Promoter.listOfOne(optInImageUrls));
    }
    public TollfreeVerificationCreator setOptInType(final TollfreeVerification.OptInType optInType){
        this.optInType = optInType;
        return this;
    }
    public TollfreeVerificationCreator setMessageVolume(final String messageVolume){
        this.messageVolume = messageVolume;
        return this;
    }
    public TollfreeVerificationCreator setTollfreePhoneNumberSid(final String tollfreePhoneNumberSid){
        this.tollfreePhoneNumberSid = tollfreePhoneNumberSid;
        return this;
    }
    public TollfreeVerificationCreator setCustomerProfileSid(final String customerProfileSid){
        this.customerProfileSid = customerProfileSid;
        return this;
    }
    public TollfreeVerificationCreator setBusinessStreetAddress(final String businessStreetAddress){
        this.businessStreetAddress = businessStreetAddress;
        return this;
    }
    public TollfreeVerificationCreator setBusinessStreetAddress2(final String businessStreetAddress2){
        this.businessStreetAddress2 = businessStreetAddress2;
        return this;
    }
    public TollfreeVerificationCreator setBusinessCity(final String businessCity){
        this.businessCity = businessCity;
        return this;
    }
    public TollfreeVerificationCreator setBusinessStateProvinceRegion(final String businessStateProvinceRegion){
        this.businessStateProvinceRegion = businessStateProvinceRegion;
        return this;
    }
    public TollfreeVerificationCreator setBusinessPostalCode(final String businessPostalCode){
        this.businessPostalCode = businessPostalCode;
        return this;
    }
    public TollfreeVerificationCreator setBusinessCountry(final String businessCountry){
        this.businessCountry = businessCountry;
        return this;
    }
    public TollfreeVerificationCreator setAdditionalInformation(final String additionalInformation){
        this.additionalInformation = additionalInformation;
        return this;
    }
    public TollfreeVerificationCreator setBusinessContactFirstName(final String businessContactFirstName){
        this.businessContactFirstName = businessContactFirstName;
        return this;
    }
    public TollfreeVerificationCreator setBusinessContactLastName(final String businessContactLastName){
        this.businessContactLastName = businessContactLastName;
        return this;
    }
    public TollfreeVerificationCreator setBusinessContactEmail(final String businessContactEmail){
        this.businessContactEmail = businessContactEmail;
        return this;
    }
    public TollfreeVerificationCreator setBusinessContactPhone(final com.twilio.type.PhoneNumber businessContactPhone){
        this.businessContactPhone = businessContactPhone;
        return this;
    }

    public TollfreeVerificationCreator setBusinessContactPhone(final String businessContactPhone){
        return setBusinessContactPhone(Promoter.phoneNumberFromString(businessContactPhone));
    }
    public TollfreeVerificationCreator setExternalReferenceId(final String externalReferenceId){
        this.externalReferenceId = externalReferenceId;
        return this;
    }

    @Override
    public TollfreeVerification create(final TwilioRestClient client){
        String path = "/v1/Tollfree/Verifications";

        path = path.replace("{"+"BusinessName"+"}", this.businessName.toString());
        path = path.replace("{"+"BusinessWebsite"+"}", this.businessWebsite.toString());
        path = path.replace("{"+"NotificationEmail"+"}", this.notificationEmail.toString());
        path = path.replace("{"+"UseCaseCategories"+"}", this.useCaseCategories.toString());
        path = path.replace("{"+"UseCaseSummary"+"}", this.useCaseSummary.toString());
        path = path.replace("{"+"ProductionMessageSample"+"}", this.productionMessageSample.toString());
        path = path.replace("{"+"OptInImageUrls"+"}", this.optInImageUrls.toString());
        path = path.replace("{"+"OptInType"+"}", this.optInType.toString());
        path = path.replace("{"+"MessageVolume"+"}", this.messageVolume.toString());
        path = path.replace("{"+"TollfreePhoneNumberSid"+"}", this.tollfreePhoneNumberSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.MESSAGING.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("TollfreeVerification creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return TollfreeVerification.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (businessName != null) {
            request.addPostParam("BusinessName", businessName);
    
        }
        if (businessWebsite != null) {
            request.addPostParam("BusinessWebsite", businessWebsite);
    
        }
        if (notificationEmail != null) {
            request.addPostParam("NotificationEmail", notificationEmail);
    
        }
        if (useCaseCategories != null) {
            for (String prop : useCaseCategories) {
                request.addPostParam("UseCaseCategories", prop);
            }
    
        }
        if (useCaseSummary != null) {
            request.addPostParam("UseCaseSummary", useCaseSummary);
    
        }
        if (productionMessageSample != null) {
            request.addPostParam("ProductionMessageSample", productionMessageSample);
    
        }
        if (optInImageUrls != null) {
            for (String prop : optInImageUrls) {
                request.addPostParam("OptInImageUrls", prop);
            }
    
        }
        if (optInType != null) {
            request.addPostParam("OptInType", optInType.toString());
    
        }
        if (messageVolume != null) {
            request.addPostParam("MessageVolume", messageVolume);
    
        }
        if (tollfreePhoneNumberSid != null) {
            request.addPostParam("TollfreePhoneNumberSid", tollfreePhoneNumberSid);
    
        }
        if (customerProfileSid != null) {
            request.addPostParam("CustomerProfileSid", customerProfileSid);
    
        }
        if (businessStreetAddress != null) {
            request.addPostParam("BusinessStreetAddress", businessStreetAddress);
    
        }
        if (businessStreetAddress2 != null) {
            request.addPostParam("BusinessStreetAddress2", businessStreetAddress2);
    
        }
        if (businessCity != null) {
            request.addPostParam("BusinessCity", businessCity);
    
        }
        if (businessStateProvinceRegion != null) {
            request.addPostParam("BusinessStateProvinceRegion", businessStateProvinceRegion);
    
        }
        if (businessPostalCode != null) {
            request.addPostParam("BusinessPostalCode", businessPostalCode);
    
        }
        if (businessCountry != null) {
            request.addPostParam("BusinessCountry", businessCountry);
    
        }
        if (additionalInformation != null) {
            request.addPostParam("AdditionalInformation", additionalInformation);
    
        }
        if (businessContactFirstName != null) {
            request.addPostParam("BusinessContactFirstName", businessContactFirstName);
    
        }
        if (businessContactLastName != null) {
            request.addPostParam("BusinessContactLastName", businessContactLastName);
    
        }
        if (businessContactEmail != null) {
            request.addPostParam("BusinessContactEmail", businessContactEmail);
    
        }
        if (businessContactPhone != null) {
            request.addPostParam("BusinessContactPhone", businessContactPhone.toString());
    
        }
        if (externalReferenceId != null) {
            request.addPostParam("ExternalReferenceId", externalReferenceId);
    
        }
    }
}
