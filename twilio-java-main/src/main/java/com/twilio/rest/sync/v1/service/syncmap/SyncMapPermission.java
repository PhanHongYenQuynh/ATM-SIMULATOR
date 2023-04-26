/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Sync
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.sync.v1.service.syncmap;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class SyncMapPermission extends Resource {
    private static final long serialVersionUID = 55149075645678L;

    public static SyncMapPermissionDeleter deleter(final String pathServiceSid, final String pathMapSid, final String pathIdentity){
        return new SyncMapPermissionDeleter(pathServiceSid, pathMapSid, pathIdentity);
    }

    public static SyncMapPermissionFetcher fetcher(final String pathServiceSid, final String pathMapSid, final String pathIdentity){
        return new SyncMapPermissionFetcher(pathServiceSid, pathMapSid, pathIdentity);
    }

    public static SyncMapPermissionReader reader(final String pathServiceSid, final String pathMapSid){
        return new SyncMapPermissionReader(pathServiceSid, pathMapSid);
    }

    public static SyncMapPermissionUpdater updater(final String pathServiceSid, final String pathMapSid, final String pathIdentity, final Boolean read, final Boolean write, final Boolean manage){
        return new SyncMapPermissionUpdater(pathServiceSid, pathMapSid, pathIdentity, read, write, manage);
    }

    /**
    * Converts a JSON String into a SyncMapPermission object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SyncMapPermission object represented by the provided JSON
    */
    public static SyncMapPermission fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncMapPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SyncMapPermission object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SyncMapPermission object represented by the provided JSON
    */
    public static SyncMapPermission fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncMapPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String serviceSid;
    private final String mapSid;
    private final String identity;
    private final Boolean read;
    private final Boolean write;
    private final Boolean manage;
    private final URI url;

    @JsonCreator
    private SyncMapPermission(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("map_sid")
        final String mapSid,

        @JsonProperty("identity")
        final String identity,

        @JsonProperty("read")
        final Boolean read,

        @JsonProperty("write")
        final Boolean write,

        @JsonProperty("manage")
        final Boolean manage,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.mapSid = mapSid;
        this.identity = identity;
        this.read = read;
        this.write = write;
        this.manage = manage;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final String getMapSid() {
            return this.mapSid;
        }
        public final String getIdentity() {
            return this.identity;
        }
        public final Boolean getRead() {
            return this.read;
        }
        public final Boolean getWrite() {
            return this.write;
        }
        public final Boolean getManage() {
            return this.manage;
        }
        public final URI getUrl() {
            return this.url;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SyncMapPermission other = (SyncMapPermission) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(mapSid, other.mapSid) &&  Objects.equals(identity, other.identity) &&  Objects.equals(read, other.read) &&  Objects.equals(write, other.write) &&  Objects.equals(manage, other.manage) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, serviceSid, mapSid, identity, read, write, manage, url);
    }

}

