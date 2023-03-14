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
import java.util.Map;
import org.openapitools.client.model.CreateProvisioningArtifactOutputProvisioningArtifactDetail;
import org.openapitools.client.model.Status;

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
 * CreateProvisioningArtifactOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateProvisioningArtifactOutput {
  public static final String SERIALIZED_NAME_PROVISIONING_ARTIFACT_DETAIL = "ProvisioningArtifactDetail";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ARTIFACT_DETAIL)
  private CreateProvisioningArtifactOutputProvisioningArtifactDetail provisioningArtifactDetail;

  public static final String SERIALIZED_NAME_INFO = "Info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private Map info;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public CreateProvisioningArtifactOutput() {
  }

  public CreateProvisioningArtifactOutput provisioningArtifactDetail(CreateProvisioningArtifactOutputProvisioningArtifactDetail provisioningArtifactDetail) {
    this.provisioningArtifactDetail = provisioningArtifactDetail;
    return this;
  }

  /**
   * Get provisioningArtifactDetail
   * @return provisioningArtifactDetail
   */
  @javax.annotation.Nullable
  public CreateProvisioningArtifactOutputProvisioningArtifactDetail getProvisioningArtifactDetail() {
    return provisioningArtifactDetail;
  }

  public void setProvisioningArtifactDetail(CreateProvisioningArtifactOutputProvisioningArtifactDetail provisioningArtifactDetail) {
    this.provisioningArtifactDetail = provisioningArtifactDetail;
  }


  public CreateProvisioningArtifactOutput info(Map info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @javax.annotation.Nullable
  public Map getInfo() {
    return info;
  }

  public void setInfo(Map info) {
    this.info = info;
  }


  public CreateProvisioningArtifactOutput status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
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
    CreateProvisioningArtifactOutput createProvisioningArtifactOutput = (CreateProvisioningArtifactOutput) o;
    return Objects.equals(this.provisioningArtifactDetail, createProvisioningArtifactOutput.provisioningArtifactDetail) &&
        Objects.equals(this.info, createProvisioningArtifactOutput.info) &&
        Objects.equals(this.status, createProvisioningArtifactOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisioningArtifactDetail, info, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProvisioningArtifactOutput {\n");
    sb.append("    provisioningArtifactDetail: ").append(toIndentedString(provisioningArtifactDetail)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
    openapiFields.add("ProvisioningArtifactDetail");
    openapiFields.add("Info");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateProvisioningArtifactOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateProvisioningArtifactOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateProvisioningArtifactOutput is not found in the empty JSON string", CreateProvisioningArtifactOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateProvisioningArtifactOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateProvisioningArtifactOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ProvisioningArtifactDetail`
      if (jsonObj.get("ProvisioningArtifactDetail") != null && !jsonObj.get("ProvisioningArtifactDetail").isJsonNull()) {
        CreateProvisioningArtifactOutputProvisioningArtifactDetail.validateJsonElement(jsonObj.get("ProvisioningArtifactDetail"));
      }
      // validate the optional field `Info`
      if (jsonObj.get("Info") != null && !jsonObj.get("Info").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Info"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        Status.validateJsonElement(jsonObj.get("Status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProvisioningArtifactOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProvisioningArtifactOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProvisioningArtifactOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProvisioningArtifactOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProvisioningArtifactOutput>() {
           @Override
           public void write(JsonWriter out, CreateProvisioningArtifactOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProvisioningArtifactOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateProvisioningArtifactOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateProvisioningArtifactOutput
   * @throws IOException if the JSON string is invalid with respect to CreateProvisioningArtifactOutput
   */
  public static CreateProvisioningArtifactOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProvisioningArtifactOutput.class);
  }

  /**
   * Convert an instance of CreateProvisioningArtifactOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

