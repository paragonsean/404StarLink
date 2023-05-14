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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.SubnetSubnetAvailabilityZone;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * In response to a request by the &lt;code&gt;DescribeReplicationSubnetGroups&lt;/code&gt; operation, this object identifies a subnet by its given Availability Zone, subnet identifier, and status.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Subnet {
  public static final String SERIALIZED_NAME_SUBNET_IDENTIFIER = "SubnetIdentifier";
  @SerializedName(SERIALIZED_NAME_SUBNET_IDENTIFIER)
  private String subnetIdentifier;

  public static final String SERIALIZED_NAME_SUBNET_AVAILABILITY_ZONE = "SubnetAvailabilityZone";
  @SerializedName(SERIALIZED_NAME_SUBNET_AVAILABILITY_ZONE)
  private SubnetSubnetAvailabilityZone subnetAvailabilityZone;

  public static final String SERIALIZED_NAME_SUBNET_STATUS = "SubnetStatus";
  @SerializedName(SERIALIZED_NAME_SUBNET_STATUS)
  private String subnetStatus;

  public Subnet() {
  }

  public Subnet subnetIdentifier(String subnetIdentifier) {
    this.subnetIdentifier = subnetIdentifier;
    return this;
  }

  /**
   * Get subnetIdentifier
   * @return subnetIdentifier
   */
  @javax.annotation.Nullable
  public String getSubnetIdentifier() {
    return subnetIdentifier;
  }

  public void setSubnetIdentifier(String subnetIdentifier) {
    this.subnetIdentifier = subnetIdentifier;
  }


  public Subnet subnetAvailabilityZone(SubnetSubnetAvailabilityZone subnetAvailabilityZone) {
    this.subnetAvailabilityZone = subnetAvailabilityZone;
    return this;
  }

  /**
   * Get subnetAvailabilityZone
   * @return subnetAvailabilityZone
   */
  @javax.annotation.Nullable
  public SubnetSubnetAvailabilityZone getSubnetAvailabilityZone() {
    return subnetAvailabilityZone;
  }

  public void setSubnetAvailabilityZone(SubnetSubnetAvailabilityZone subnetAvailabilityZone) {
    this.subnetAvailabilityZone = subnetAvailabilityZone;
  }


  public Subnet subnetStatus(String subnetStatus) {
    this.subnetStatus = subnetStatus;
    return this;
  }

  /**
   * Get subnetStatus
   * @return subnetStatus
   */
  @javax.annotation.Nullable
  public String getSubnetStatus() {
    return subnetStatus;
  }

  public void setSubnetStatus(String subnetStatus) {
    this.subnetStatus = subnetStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subnet subnet = (Subnet) o;
    return Objects.equals(this.subnetIdentifier, subnet.subnetIdentifier) &&
        Objects.equals(this.subnetAvailabilityZone, subnet.subnetAvailabilityZone) &&
        Objects.equals(this.subnetStatus, subnet.subnetStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetIdentifier, subnetAvailabilityZone, subnetStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subnet {\n");
    sb.append("    subnetIdentifier: ").append(toIndentedString(subnetIdentifier)).append("\n");
    sb.append("    subnetAvailabilityZone: ").append(toIndentedString(subnetAvailabilityZone)).append("\n");
    sb.append("    subnetStatus: ").append(toIndentedString(subnetStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("SubnetIdentifier");
    openapiFields.add("SubnetAvailabilityZone");
    openapiFields.add("SubnetStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Subnet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Subnet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Subnet is not found in the empty JSON string", Subnet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Subnet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Subnet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `SubnetIdentifier`
      if (jsonObj.get("SubnetIdentifier") != null && !jsonObj.get("SubnetIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SubnetIdentifier"));
      }
      // validate the optional field `SubnetAvailabilityZone`
      if (jsonObj.get("SubnetAvailabilityZone") != null && !jsonObj.get("SubnetAvailabilityZone").isJsonNull()) {
        SubnetSubnetAvailabilityZone.validateJsonElement(jsonObj.get("SubnetAvailabilityZone"));
      }
      // validate the optional field `SubnetStatus`
      if (jsonObj.get("SubnetStatus") != null && !jsonObj.get("SubnetStatus").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SubnetStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Subnet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Subnet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Subnet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Subnet.class));

       return (TypeAdapter<T>) new TypeAdapter<Subnet>() {
           @Override
           public void write(JsonWriter out, Subnet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Subnet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Subnet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Subnet
   * @throws IOException if the JSON string is invalid with respect to Subnet
   */
  public static Subnet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Subnet.class);
  }

  /**
   * Convert an instance of Subnet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

