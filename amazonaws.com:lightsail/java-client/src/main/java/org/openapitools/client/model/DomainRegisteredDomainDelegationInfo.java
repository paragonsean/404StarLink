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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.RegisteredDomainDelegationInfoNameServersUpdateState;
import org.openapitools.client.model.RegisteredDomainDelegationInfoR53HostedZoneDeletionState;

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
 * DomainRegisteredDomainDelegationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:53.071508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DomainRegisteredDomainDelegationInfo {
  public static final String SERIALIZED_NAME_NAME_SERVERS_UPDATE_STATE = "nameServersUpdateState";
  @SerializedName(SERIALIZED_NAME_NAME_SERVERS_UPDATE_STATE)
  private RegisteredDomainDelegationInfoNameServersUpdateState nameServersUpdateState;

  public static final String SERIALIZED_NAME_R53_HOSTED_ZONE_DELETION_STATE = "r53HostedZoneDeletionState";
  @SerializedName(SERIALIZED_NAME_R53_HOSTED_ZONE_DELETION_STATE)
  private RegisteredDomainDelegationInfoR53HostedZoneDeletionState r53HostedZoneDeletionState;

  public DomainRegisteredDomainDelegationInfo() {
  }

  public DomainRegisteredDomainDelegationInfo nameServersUpdateState(RegisteredDomainDelegationInfoNameServersUpdateState nameServersUpdateState) {
    this.nameServersUpdateState = nameServersUpdateState;
    return this;
  }

  /**
   * Get nameServersUpdateState
   * @return nameServersUpdateState
   */
  @javax.annotation.Nullable
  public RegisteredDomainDelegationInfoNameServersUpdateState getNameServersUpdateState() {
    return nameServersUpdateState;
  }

  public void setNameServersUpdateState(RegisteredDomainDelegationInfoNameServersUpdateState nameServersUpdateState) {
    this.nameServersUpdateState = nameServersUpdateState;
  }


  public DomainRegisteredDomainDelegationInfo r53HostedZoneDeletionState(RegisteredDomainDelegationInfoR53HostedZoneDeletionState r53HostedZoneDeletionState) {
    this.r53HostedZoneDeletionState = r53HostedZoneDeletionState;
    return this;
  }

  /**
   * Get r53HostedZoneDeletionState
   * @return r53HostedZoneDeletionState
   */
  @javax.annotation.Nullable
  public RegisteredDomainDelegationInfoR53HostedZoneDeletionState getR53HostedZoneDeletionState() {
    return r53HostedZoneDeletionState;
  }

  public void setR53HostedZoneDeletionState(RegisteredDomainDelegationInfoR53HostedZoneDeletionState r53HostedZoneDeletionState) {
    this.r53HostedZoneDeletionState = r53HostedZoneDeletionState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainRegisteredDomainDelegationInfo domainRegisteredDomainDelegationInfo = (DomainRegisteredDomainDelegationInfo) o;
    return Objects.equals(this.nameServersUpdateState, domainRegisteredDomainDelegationInfo.nameServersUpdateState) &&
        Objects.equals(this.r53HostedZoneDeletionState, domainRegisteredDomainDelegationInfo.r53HostedZoneDeletionState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameServersUpdateState, r53HostedZoneDeletionState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainRegisteredDomainDelegationInfo {\n");
    sb.append("    nameServersUpdateState: ").append(toIndentedString(nameServersUpdateState)).append("\n");
    sb.append("    r53HostedZoneDeletionState: ").append(toIndentedString(r53HostedZoneDeletionState)).append("\n");
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
    openapiFields.add("nameServersUpdateState");
    openapiFields.add("r53HostedZoneDeletionState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainRegisteredDomainDelegationInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DomainRegisteredDomainDelegationInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DomainRegisteredDomainDelegationInfo is not found in the empty JSON string", DomainRegisteredDomainDelegationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DomainRegisteredDomainDelegationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DomainRegisteredDomainDelegationInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `nameServersUpdateState`
      if (jsonObj.get("nameServersUpdateState") != null && !jsonObj.get("nameServersUpdateState").isJsonNull()) {
        RegisteredDomainDelegationInfoNameServersUpdateState.validateJsonElement(jsonObj.get("nameServersUpdateState"));
      }
      // validate the optional field `r53HostedZoneDeletionState`
      if (jsonObj.get("r53HostedZoneDeletionState") != null && !jsonObj.get("r53HostedZoneDeletionState").isJsonNull()) {
        RegisteredDomainDelegationInfoR53HostedZoneDeletionState.validateJsonElement(jsonObj.get("r53HostedZoneDeletionState"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainRegisteredDomainDelegationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainRegisteredDomainDelegationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainRegisteredDomainDelegationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainRegisteredDomainDelegationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainRegisteredDomainDelegationInfo>() {
           @Override
           public void write(JsonWriter out, DomainRegisteredDomainDelegationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DomainRegisteredDomainDelegationInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DomainRegisteredDomainDelegationInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DomainRegisteredDomainDelegationInfo
   * @throws IOException if the JSON string is invalid with respect to DomainRegisteredDomainDelegationInfo
   */
  public static DomainRegisteredDomainDelegationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainRegisteredDomainDelegationInfo.class);
  }

  /**
   * Convert an instance of DomainRegisteredDomainDelegationInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

