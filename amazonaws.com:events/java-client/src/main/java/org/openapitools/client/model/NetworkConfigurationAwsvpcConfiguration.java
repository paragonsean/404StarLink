/*
 * Amazon CloudWatch Events
 * <p>Amazon EventBridge helps you to respond to state changes in your Amazon Web Services resources. When your resources change state, they automatically send events to an event stream. You can create rules that match selected events in the stream and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For example, you can configure rules to:</p> <ul> <li> <p>Automatically invoke an Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance enters the running state.</p> </li> <li> <p>Direct specific API records from CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential security or availability risks.</p> </li> <li> <p>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</p> </li> </ul> <p>For more information about the features of Amazon EventBridge, see the <a href=\"https://docs.aws.amazon.com/eventbridge/latest/userguide\">Amazon EventBridge User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2015-10-07
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
import java.util.List;
import org.openapitools.client.model.AssignPublicIp;

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
 * NetworkConfigurationAwsvpcConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class NetworkConfigurationAwsvpcConfiguration {
  public static final String SERIALIZED_NAME_SUBNETS = "Subnets";
  @SerializedName(SERIALIZED_NAME_SUBNETS)
  private List subnets;

  public static final String SERIALIZED_NAME_SECURITY_GROUPS = "SecurityGroups";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
  private List securityGroups;

  public static final String SERIALIZED_NAME_ASSIGN_PUBLIC_IP = "AssignPublicIp";
  @SerializedName(SERIALIZED_NAME_ASSIGN_PUBLIC_IP)
  private AssignPublicIp assignPublicIp;

  public NetworkConfigurationAwsvpcConfiguration() {
  }

  public NetworkConfigurationAwsvpcConfiguration subnets(List subnets) {
    this.subnets = subnets;
    return this;
  }

  /**
   * Get subnets
   * @return subnets
   */
  @javax.annotation.Nonnull
  public List getSubnets() {
    return subnets;
  }

  public void setSubnets(List subnets) {
    this.subnets = subnets;
  }


  public NetworkConfigurationAwsvpcConfiguration securityGroups(List securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  /**
   * Get securityGroups
   * @return securityGroups
   */
  @javax.annotation.Nullable
  public List getSecurityGroups() {
    return securityGroups;
  }

  public void setSecurityGroups(List securityGroups) {
    this.securityGroups = securityGroups;
  }


  public NetworkConfigurationAwsvpcConfiguration assignPublicIp(AssignPublicIp assignPublicIp) {
    this.assignPublicIp = assignPublicIp;
    return this;
  }

  /**
   * Get assignPublicIp
   * @return assignPublicIp
   */
  @javax.annotation.Nullable
  public AssignPublicIp getAssignPublicIp() {
    return assignPublicIp;
  }

  public void setAssignPublicIp(AssignPublicIp assignPublicIp) {
    this.assignPublicIp = assignPublicIp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkConfigurationAwsvpcConfiguration networkConfigurationAwsvpcConfiguration = (NetworkConfigurationAwsvpcConfiguration) o;
    return Objects.equals(this.subnets, networkConfigurationAwsvpcConfiguration.subnets) &&
        Objects.equals(this.securityGroups, networkConfigurationAwsvpcConfiguration.securityGroups) &&
        Objects.equals(this.assignPublicIp, networkConfigurationAwsvpcConfiguration.assignPublicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnets, securityGroups, assignPublicIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkConfigurationAwsvpcConfiguration {\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    assignPublicIp: ").append(toIndentedString(assignPublicIp)).append("\n");
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
    openapiFields.add("Subnets");
    openapiFields.add("SecurityGroups");
    openapiFields.add("AssignPublicIp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Subnets");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NetworkConfigurationAwsvpcConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkConfigurationAwsvpcConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkConfigurationAwsvpcConfiguration is not found in the empty JSON string", NetworkConfigurationAwsvpcConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetworkConfigurationAwsvpcConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkConfigurationAwsvpcConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NetworkConfigurationAwsvpcConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Subnets`
      List.validateJsonElement(jsonObj.get("Subnets"));
      // validate the optional field `SecurityGroups`
      if (jsonObj.get("SecurityGroups") != null && !jsonObj.get("SecurityGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SecurityGroups"));
      }
      // validate the optional field `AssignPublicIp`
      if (jsonObj.get("AssignPublicIp") != null && !jsonObj.get("AssignPublicIp").isJsonNull()) {
        AssignPublicIp.validateJsonElement(jsonObj.get("AssignPublicIp"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkConfigurationAwsvpcConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkConfigurationAwsvpcConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkConfigurationAwsvpcConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkConfigurationAwsvpcConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkConfigurationAwsvpcConfiguration>() {
           @Override
           public void write(JsonWriter out, NetworkConfigurationAwsvpcConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkConfigurationAwsvpcConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NetworkConfigurationAwsvpcConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NetworkConfigurationAwsvpcConfiguration
   * @throws IOException if the JSON string is invalid with respect to NetworkConfigurationAwsvpcConfiguration
   */
  public static NetworkConfigurationAwsvpcConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkConfigurationAwsvpcConfiguration.class);
  }

  /**
   * Convert an instance of NetworkConfigurationAwsvpcConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

