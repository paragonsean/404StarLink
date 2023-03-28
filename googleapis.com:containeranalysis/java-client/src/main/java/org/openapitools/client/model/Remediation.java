/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1beta1
 * 
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
import org.openapitools.client.model.RelatedUrl;

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
 * Specifies details on how to handle (and presumably, fix) a vulnerability.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:05.225194-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Remediation {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  /**
   * The type of remediation that can be applied.
   */
  @JsonAdapter(RemediationTypeEnum.Adapter.class)
  public enum RemediationTypeEnum {
    REMEDIATION_TYPE_UNSPECIFIED("REMEDIATION_TYPE_UNSPECIFIED"),
    
    MITIGATION("MITIGATION"),
    
    NO_FIX_PLANNED("NO_FIX_PLANNED"),
    
    NONE_AVAILABLE("NONE_AVAILABLE"),
    
    VENDOR_FIX("VENDOR_FIX"),
    
    WORKAROUND("WORKAROUND");

    private String value;

    RemediationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RemediationTypeEnum fromValue(String value) {
      for (RemediationTypeEnum b : RemediationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RemediationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RemediationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RemediationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RemediationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RemediationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REMEDIATION_TYPE = "remediationType";
  @SerializedName(SERIALIZED_NAME_REMEDIATION_TYPE)
  private RemediationTypeEnum remediationType;

  public static final String SERIALIZED_NAME_REMEDIATION_URI = "remediationUri";
  @SerializedName(SERIALIZED_NAME_REMEDIATION_URI)
  private RelatedUrl remediationUri;

  public Remediation() {
  }

  public Remediation details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Contains a comprehensive human-readable discussion of the remediation.
   * @return details
   */
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  public Remediation remediationType(RemediationTypeEnum remediationType) {
    this.remediationType = remediationType;
    return this;
  }

  /**
   * The type of remediation that can be applied.
   * @return remediationType
   */
  @javax.annotation.Nullable
  public RemediationTypeEnum getRemediationType() {
    return remediationType;
  }

  public void setRemediationType(RemediationTypeEnum remediationType) {
    this.remediationType = remediationType;
  }


  public Remediation remediationUri(RelatedUrl remediationUri) {
    this.remediationUri = remediationUri;
    return this;
  }

  /**
   * Get remediationUri
   * @return remediationUri
   */
  @javax.annotation.Nullable
  public RelatedUrl getRemediationUri() {
    return remediationUri;
  }

  public void setRemediationUri(RelatedUrl remediationUri) {
    this.remediationUri = remediationUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Remediation remediation = (Remediation) o;
    return Objects.equals(this.details, remediation.details) &&
        Objects.equals(this.remediationType, remediation.remediationType) &&
        Objects.equals(this.remediationUri, remediation.remediationUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, remediationType, remediationUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Remediation {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    remediationType: ").append(toIndentedString(remediationType)).append("\n");
    sb.append("    remediationUri: ").append(toIndentedString(remediationUri)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("remediationType");
    openapiFields.add("remediationUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Remediation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Remediation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Remediation is not found in the empty JSON string", Remediation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Remediation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Remediation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if ((jsonObj.get("remediationType") != null && !jsonObj.get("remediationType").isJsonNull()) && !jsonObj.get("remediationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remediationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remediationType").toString()));
      }
      // validate the optional field `remediationType`
      if (jsonObj.get("remediationType") != null && !jsonObj.get("remediationType").isJsonNull()) {
        RemediationTypeEnum.validateJsonElement(jsonObj.get("remediationType"));
      }
      // validate the optional field `remediationUri`
      if (jsonObj.get("remediationUri") != null && !jsonObj.get("remediationUri").isJsonNull()) {
        RelatedUrl.validateJsonElement(jsonObj.get("remediationUri"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Remediation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Remediation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Remediation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Remediation.class));

       return (TypeAdapter<T>) new TypeAdapter<Remediation>() {
           @Override
           public void write(JsonWriter out, Remediation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Remediation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Remediation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Remediation
   * @throws IOException if the JSON string is invalid with respect to Remediation
   */
  public static Remediation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Remediation.class);
  }

  /**
   * Convert an instance of Remediation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

