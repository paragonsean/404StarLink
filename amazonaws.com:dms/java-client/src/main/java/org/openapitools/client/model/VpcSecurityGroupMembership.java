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
 * Describes the status of a security group associated with the virtual private cloud (VPC) hosting your replication and DB instances.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VpcSecurityGroupMembership {
  public static final String SERIALIZED_NAME_VPC_SECURITY_GROUP_ID = "VpcSecurityGroupId";
  @SerializedName(SERIALIZED_NAME_VPC_SECURITY_GROUP_ID)
  private String vpcSecurityGroupId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public VpcSecurityGroupMembership() {
  }

  public VpcSecurityGroupMembership vpcSecurityGroupId(String vpcSecurityGroupId) {
    this.vpcSecurityGroupId = vpcSecurityGroupId;
    return this;
  }

  /**
   * Get vpcSecurityGroupId
   * @return vpcSecurityGroupId
   */
  @javax.annotation.Nullable
  public String getVpcSecurityGroupId() {
    return vpcSecurityGroupId;
  }

  public void setVpcSecurityGroupId(String vpcSecurityGroupId) {
    this.vpcSecurityGroupId = vpcSecurityGroupId;
  }


  public VpcSecurityGroupMembership status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpcSecurityGroupMembership vpcSecurityGroupMembership = (VpcSecurityGroupMembership) o;
    return Objects.equals(this.vpcSecurityGroupId, vpcSecurityGroupMembership.vpcSecurityGroupId) &&
        Objects.equals(this.status, vpcSecurityGroupMembership.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcSecurityGroupId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpcSecurityGroupMembership {\n");
    sb.append("    vpcSecurityGroupId: ").append(toIndentedString(vpcSecurityGroupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("VpcSecurityGroupId");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VpcSecurityGroupMembership
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VpcSecurityGroupMembership.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VpcSecurityGroupMembership is not found in the empty JSON string", VpcSecurityGroupMembership.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VpcSecurityGroupMembership.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VpcSecurityGroupMembership` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `VpcSecurityGroupId`
      if (jsonObj.get("VpcSecurityGroupId") != null && !jsonObj.get("VpcSecurityGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcSecurityGroupId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VpcSecurityGroupMembership.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VpcSecurityGroupMembership' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VpcSecurityGroupMembership> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VpcSecurityGroupMembership.class));

       return (TypeAdapter<T>) new TypeAdapter<VpcSecurityGroupMembership>() {
           @Override
           public void write(JsonWriter out, VpcSecurityGroupMembership value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VpcSecurityGroupMembership read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VpcSecurityGroupMembership given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VpcSecurityGroupMembership
   * @throws IOException if the JSON string is invalid with respect to VpcSecurityGroupMembership
   */
  public static VpcSecurityGroupMembership fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VpcSecurityGroupMembership.class);
  }

  /**
   * Convert an instance of VpcSecurityGroupMembership to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

