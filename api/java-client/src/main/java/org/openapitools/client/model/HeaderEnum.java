/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
 * Gets or Sets HeaderEnum
 */
@JsonAdapter(HeaderEnum.Adapter.class)
public enum HeaderEnum {
  
  ACCEPT("Accept"),
  
  ACCEPT_CHARSET("Accept-Charset"),
  
  ACCEPT_DATETIME("Accept-Datetime"),
  
  ACCEPT_ENCODING("Accept-Encoding"),
  
  ACCEPT_LANGUAGE("Accept-Language"),
  
  AUTHORIZATION("Authorization"),
  
  CLOUD_FRONT_FORWARDED_PROTO("CloudFront-Forwarded-Proto"),
  
  CLOUD_FRONT_IS_DESKTOP_VIEWER("CloudFront-Is-Desktop-Viewer"),
  
  CLOUD_FRONT_IS_MOBILE_VIEWER("CloudFront-Is-Mobile-Viewer"),
  
  CLOUD_FRONT_IS_SMART_TV_VIEWER("CloudFront-Is-SmartTV-Viewer"),
  
  CLOUD_FRONT_IS_TABLET_VIEWER("CloudFront-Is-Tablet-Viewer"),
  
  CLOUD_FRONT_VIEWER_COUNTRY("CloudFront-Viewer-Country"),
  
  HOST("Host"),
  
  ORIGIN("Origin"),
  
  REFERER("Referer");

  private String value;

  HeaderEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HeaderEnum fromValue(String value) {
    for (HeaderEnum b : HeaderEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<HeaderEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final HeaderEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HeaderEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return HeaderEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    HeaderEnum.fromValue(value);
  }
}

