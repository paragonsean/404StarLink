/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
 * Gets or Sets CannedAclForObjectsValue
 */
@JsonAdapter(CannedAclForObjectsValue.Adapter.class)
public enum CannedAclForObjectsValue {
  
  NONE("none"),
  
  PRIVATE("private"),
  
  PUBLIC_READ("public-read"),
  
  PUBLIC_READ_WRITE("public-read-write"),
  
  AUTHENTICATED_READ("authenticated-read"),
  
  AWS_EXEC_READ("aws-exec-read"),
  
  BUCKET_OWNER_READ("bucket-owner-read"),
  
  BUCKET_OWNER_FULL_CONTROL("bucket-owner-full-control");

  private String value;

  CannedAclForObjectsValue(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CannedAclForObjectsValue fromValue(String value) {
    for (CannedAclForObjectsValue b : CannedAclForObjectsValue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CannedAclForObjectsValue> {
    @Override
    public void write(final JsonWriter jsonWriter, final CannedAclForObjectsValue enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CannedAclForObjectsValue read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CannedAclForObjectsValue.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CannedAclForObjectsValue.fromValue(value);
  }
}

