/*
 * Amazon CloudFront
 * <fullname>Amazon CloudFront</fullname> <p>This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon CloudFront Developer Guide</i>.</p>
 *
 * The version of the OpenAPI document: 2018-11-05
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
 * Gets or Sets SslProtocol
 */
@JsonAdapter(SslProtocol.Adapter.class)
public enum SslProtocol {
  
  SSLV3("SSLv3"),
  
  TLSV1("TLSv1"),
  
  TLSV1_1("TLSv1.1"),
  
  TLSV1_2("TLSv1.2");

  private String value;

  SslProtocol(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SslProtocol fromValue(String value) {
    for (SslProtocol b : SslProtocol.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SslProtocol> {
    @Override
    public void write(final JsonWriter jsonWriter, final SslProtocol enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SslProtocol read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SslProtocol.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    SslProtocol.fromValue(value);
  }
}

