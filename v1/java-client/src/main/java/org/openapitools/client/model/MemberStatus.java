/*
 * Members API
 * An API which retrieves Members data.
 *
 * The version of the OpenAPI document: v1
 * Contact: softwareengineering@parliament.uk
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
 * Gets or Sets MemberStatus
 */
@JsonAdapter(MemberStatus.Adapter.class)
public enum MemberStatus {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3);

  private Integer value;

  MemberStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MemberStatus fromValue(Integer value) {
    for (MemberStatus b : MemberStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MemberStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final MemberStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MemberStatus read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return MemberStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    MemberStatus.fromValue(value);
  }
}

