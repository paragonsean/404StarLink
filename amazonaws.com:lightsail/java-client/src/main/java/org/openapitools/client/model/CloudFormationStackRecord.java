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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CloudFormationStackRecordDestinationInfo;
import org.openapitools.client.model.CloudFormationStackRecordLocation;
import org.openapitools.client.model.RecordState;
import org.openapitools.client.model.ResourceType;

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
 * &lt;p&gt;Describes a CloudFormation stack record created as a result of the &lt;code&gt;create cloud formation stack&lt;/code&gt; action.&lt;/p&gt; &lt;p&gt;A CloudFormation stack record provides information about the AWS CloudFormation stack used to create a new Amazon Elastic Compute Cloud instance from an exported Lightsail instance snapshot.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:53.071508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CloudFormationStackRecord {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private CloudFormationStackRecordLocation location;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceType resourceType;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RecordState state;

  public static final String SERIALIZED_NAME_SOURCE_INFO = "sourceInfo";
  @SerializedName(SERIALIZED_NAME_SOURCE_INFO)
  private List sourceInfo;

  public static final String SERIALIZED_NAME_DESTINATION_INFO = "destinationInfo";
  @SerializedName(SERIALIZED_NAME_DESTINATION_INFO)
  private CloudFormationStackRecordDestinationInfo destinationInfo;

  public CloudFormationStackRecord() {
  }

  public CloudFormationStackRecord name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CloudFormationStackRecord arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public CloudFormationStackRecord createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CloudFormationStackRecord location(CloudFormationStackRecordLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public CloudFormationStackRecordLocation getLocation() {
    return location;
  }

  public void setLocation(CloudFormationStackRecordLocation location) {
    this.location = location;
  }


  public CloudFormationStackRecord resourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  @javax.annotation.Nullable
  public ResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public CloudFormationStackRecord state(RecordState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public RecordState getState() {
    return state;
  }

  public void setState(RecordState state) {
    this.state = state;
  }


  public CloudFormationStackRecord sourceInfo(List sourceInfo) {
    this.sourceInfo = sourceInfo;
    return this;
  }

  /**
   * Get sourceInfo
   * @return sourceInfo
   */
  @javax.annotation.Nullable
  public List getSourceInfo() {
    return sourceInfo;
  }

  public void setSourceInfo(List sourceInfo) {
    this.sourceInfo = sourceInfo;
  }


  public CloudFormationStackRecord destinationInfo(CloudFormationStackRecordDestinationInfo destinationInfo) {
    this.destinationInfo = destinationInfo;
    return this;
  }

  /**
   * Get destinationInfo
   * @return destinationInfo
   */
  @javax.annotation.Nullable
  public CloudFormationStackRecordDestinationInfo getDestinationInfo() {
    return destinationInfo;
  }

  public void setDestinationInfo(CloudFormationStackRecordDestinationInfo destinationInfo) {
    this.destinationInfo = destinationInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudFormationStackRecord cloudFormationStackRecord = (CloudFormationStackRecord) o;
    return Objects.equals(this.name, cloudFormationStackRecord.name) &&
        Objects.equals(this.arn, cloudFormationStackRecord.arn) &&
        Objects.equals(this.createdAt, cloudFormationStackRecord.createdAt) &&
        Objects.equals(this.location, cloudFormationStackRecord.location) &&
        Objects.equals(this.resourceType, cloudFormationStackRecord.resourceType) &&
        Objects.equals(this.state, cloudFormationStackRecord.state) &&
        Objects.equals(this.sourceInfo, cloudFormationStackRecord.sourceInfo) &&
        Objects.equals(this.destinationInfo, cloudFormationStackRecord.destinationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, createdAt, location, resourceType, state, sourceInfo, destinationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudFormationStackRecord {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sourceInfo: ").append(toIndentedString(sourceInfo)).append("\n");
    sb.append("    destinationInfo: ").append(toIndentedString(destinationInfo)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("arn");
    openapiFields.add("createdAt");
    openapiFields.add("location");
    openapiFields.add("resourceType");
    openapiFields.add("state");
    openapiFields.add("sourceInfo");
    openapiFields.add("destinationInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudFormationStackRecord
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudFormationStackRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudFormationStackRecord is not found in the empty JSON string", CloudFormationStackRecord.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudFormationStackRecord.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudFormationStackRecord` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `arn`
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("arn"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        CloudFormationStackRecordLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        RecordState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `sourceInfo`
      if (jsonObj.get("sourceInfo") != null && !jsonObj.get("sourceInfo").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("sourceInfo"));
      }
      // validate the optional field `destinationInfo`
      if (jsonObj.get("destinationInfo") != null && !jsonObj.get("destinationInfo").isJsonNull()) {
        CloudFormationStackRecordDestinationInfo.validateJsonElement(jsonObj.get("destinationInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudFormationStackRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudFormationStackRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudFormationStackRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudFormationStackRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudFormationStackRecord>() {
           @Override
           public void write(JsonWriter out, CloudFormationStackRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudFormationStackRecord read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudFormationStackRecord given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudFormationStackRecord
   * @throws IOException if the JSON string is invalid with respect to CloudFormationStackRecord
   */
  public static CloudFormationStackRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudFormationStackRecord.class);
  }

  /**
   * Convert an instance of CloudFormationStackRecord to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

