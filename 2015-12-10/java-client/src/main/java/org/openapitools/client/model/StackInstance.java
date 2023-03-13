/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
import org.openapitools.client.model.StackInstanceStatus;

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
 * An CloudFormation stack, in a specific account and Region, that&#39;s part of a stack set operation. A stack instance is a reference to an attempted or actual stack in a given account within a given Region. A stack instance can exist without a stack—for example, if the stack couldn&#39;t be created for some reason. A stack instance is associated with only one stack set. Each stack instance contains the ID of its associated stack set, as well as the ID of the actual stack and the stack status. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:14.779935-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class StackInstance {
  public static final String SERIALIZED_NAME_ACCOUNT = "Account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STACK_INSTANCE_STATUS = "StackInstanceStatus";
  @SerializedName(SERIALIZED_NAME_STACK_INSTANCE_STATUS)
  private StackInstanceStatus stackInstanceStatus;

  public StackInstance() {
  }

  public StackInstance account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @javax.annotation.Nullable
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  public StackInstance region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public StackInstance stackInstanceStatus(StackInstanceStatus stackInstanceStatus) {
    this.stackInstanceStatus = stackInstanceStatus;
    return this;
  }

  /**
   * Get stackInstanceStatus
   * @return stackInstanceStatus
   */
  @javax.annotation.Nullable
  public StackInstanceStatus getStackInstanceStatus() {
    return stackInstanceStatus;
  }

  public void setStackInstanceStatus(StackInstanceStatus stackInstanceStatus) {
    this.stackInstanceStatus = stackInstanceStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackInstance stackInstance = (StackInstance) o;
    return Objects.equals(this.account, stackInstance.account) &&
        Objects.equals(this.region, stackInstance.region) &&
        Objects.equals(this.stackInstanceStatus, stackInstance.stackInstanceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, region, stackInstanceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackInstance {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    stackInstanceStatus: ").append(toIndentedString(stackInstanceStatus)).append("\n");
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
    openapiFields.add("Account");
    openapiFields.add("Region");
    openapiFields.add("StackInstanceStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StackInstance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StackInstance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StackInstance is not found in the empty JSON string", StackInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StackInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StackInstance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Account`
      if (jsonObj.get("Account") != null && !jsonObj.get("Account").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Account"));
      }
      // validate the optional field `Region`
      if (jsonObj.get("Region") != null && !jsonObj.get("Region").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Region"));
      }
      // validate the optional field `StackInstanceStatus`
      if (jsonObj.get("StackInstanceStatus") != null && !jsonObj.get("StackInstanceStatus").isJsonNull()) {
        StackInstanceStatus.validateJsonElement(jsonObj.get("StackInstanceStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StackInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StackInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StackInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StackInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<StackInstance>() {
           @Override
           public void write(JsonWriter out, StackInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StackInstance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StackInstance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StackInstance
   * @throws IOException if the JSON string is invalid with respect to StackInstance
   */
  public static StackInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StackInstance.class);
  }

  /**
   * Convert an instance of StackInstance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

