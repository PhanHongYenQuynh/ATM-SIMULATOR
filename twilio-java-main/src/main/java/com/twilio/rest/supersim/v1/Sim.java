/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Supersim
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.supersim.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Sim extends Resource {
    private static final long serialVersionUID = 28875728882839L;

    public static SimCreator creator(final String iccid, final String registrationCode){
        return new SimCreator(iccid, registrationCode);
    }

    public static SimFetcher fetcher(final String pathSid){
        return new SimFetcher(pathSid);
    }

    public static SimReader reader(){
        return new SimReader();
    }

    public static SimUpdater updater(final String pathSid){
        return new SimUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a Sim object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Sim object represented by the provided JSON
    */
    public static Sim fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sim.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Sim object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Sim object represented by the provided JSON
    */
    public static Sim fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sim.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Status {
        NEW("new"),
        READY("ready"),
        ACTIVE("active"),
        INACTIVE("inactive"),
        SCHEDULED("scheduled");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }
    public enum StatusUpdate {
        READY("ready"),
        ACTIVE("active"),
        INACTIVE("inactive");

        private final String value;

        private StatusUpdate(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static StatusUpdate forValue(final String value) {
            return Promoter.enumFromString(value, StatusUpdate.values());
        }
    }

    private final String sid;
    private final String uniqueName;
    private final String accountSid;
    private final String iccid;
    private final Sim.Status status;
    private final String fleetSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Sim(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("iccid")
        final String iccid,

        @JsonProperty("status")
        final Sim.Status status,

        @JsonProperty("fleet_sid")
        final String fleetSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.iccid = iccid;
        this.status = status;
        this.fleetSid = fleetSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getIccid() {
            return this.iccid;
        }
        public final Sim.Status getStatus() {
            return this.status;
        }
        public final String getFleetSid() {
            return this.fleetSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Sim other = (Sim) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(iccid, other.iccid) &&  Objects.equals(status, other.status) &&  Objects.equals(fleetSid, other.fleetSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, uniqueName, accountSid, iccid, status, fleetSid, dateCreated, dateUpdated, url, links);
    }

}

