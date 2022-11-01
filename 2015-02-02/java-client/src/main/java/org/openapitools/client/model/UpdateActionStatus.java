/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
 * Contact: mike.ralphson@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets UpdateActionStatus
 */
@JsonAdapter(UpdateActionStatus.Adapter.class)
public enum UpdateActionStatus {
  
  NOT_APPLIED("not-applied"),
  
  WAITING_TO_START("waiting-to-start"),
  
  IN_PROGRESS("in-progress"),
  
  STOPPING("stopping"),
  
  STOPPED("stopped"),
  
  COMPLETE("complete"),
  
  SCHEDULING("scheduling"),
  
  SCHEDULED("scheduled"),
  
  NOT_APPLICABLE("not-applicable");

  private String value;

  UpdateActionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UpdateActionStatus fromValue(String value) {
    for (UpdateActionStatus b : UpdateActionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UpdateActionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final UpdateActionStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UpdateActionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UpdateActionStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    UpdateActionStatus.fromValue(value);
  }
}

