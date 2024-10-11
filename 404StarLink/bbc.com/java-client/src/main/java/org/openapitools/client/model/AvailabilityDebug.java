/*
 * BBC Nitro API
 * BBC Nitro is the BBC's application programming interface (API) for BBC Programmes Metadata.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: nitro@bbc.co.uk
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
import org.openapitools.client.model.MediaProfileGroups;
import org.openapitools.client.model.PidReference;
import org.openapitools.client.model.ServiceReference;

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
 * AvailabilityDebug
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AvailabilityDebug {
  public static final String SERIALIZED_NAME_AVAILABILITY_OF = "availability_of";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_OF)
  private PidReference availabilityOf;

  public static final String SERIALIZED_NAME_MEDIA_PROFILE_GROUPS = "media_profile_groups";
  @SerializedName(SERIALIZED_NAME_MEDIA_PROFILE_GROUPS)
  private MediaProfileGroups mediaProfileGroups;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private ServiceReference service;

  public static final String SERIALIZED_NAME_TERRITORY = "territory";
  @SerializedName(SERIALIZED_NAME_TERRITORY)
  private String territory;

  public AvailabilityDebug() {
  }

  public AvailabilityDebug availabilityOf(PidReference availabilityOf) {
    this.availabilityOf = availabilityOf;
    return this;
  }

  /**
   * Get availabilityOf
   * @return availabilityOf
   */
  @javax.annotation.Nonnull
  public PidReference getAvailabilityOf() {
    return availabilityOf;
  }

  public void setAvailabilityOf(PidReference availabilityOf) {
    this.availabilityOf = availabilityOf;
  }


  public AvailabilityDebug mediaProfileGroups(MediaProfileGroups mediaProfileGroups) {
    this.mediaProfileGroups = mediaProfileGroups;
    return this;
  }

  /**
   * Get mediaProfileGroups
   * @return mediaProfileGroups
   */
  @javax.annotation.Nullable
  public MediaProfileGroups getMediaProfileGroups() {
    return mediaProfileGroups;
  }

  public void setMediaProfileGroups(MediaProfileGroups mediaProfileGroups) {
    this.mediaProfileGroups = mediaProfileGroups;
  }


  public AvailabilityDebug service(ServiceReference service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @javax.annotation.Nullable
  public ServiceReference getService() {
    return service;
  }

  public void setService(ServiceReference service) {
    this.service = service;
  }


  public AvailabilityDebug territory(String territory) {
    this.territory = territory;
    return this;
  }

  /**
   * Get territory
   * @return territory
   */
  @javax.annotation.Nullable
  public String getTerritory() {
    return territory;
  }

  public void setTerritory(String territory) {
    this.territory = territory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityDebug availabilityDebug = (AvailabilityDebug) o;
    return Objects.equals(this.availabilityOf, availabilityDebug.availabilityOf) &&
        Objects.equals(this.mediaProfileGroups, availabilityDebug.mediaProfileGroups) &&
        Objects.equals(this.service, availabilityDebug.service) &&
        Objects.equals(this.territory, availabilityDebug.territory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityOf, mediaProfileGroups, service, territory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityDebug {\n");
    sb.append("    availabilityOf: ").append(toIndentedString(availabilityOf)).append("\n");
    sb.append("    mediaProfileGroups: ").append(toIndentedString(mediaProfileGroups)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
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
    openapiFields.add("availability_of");
    openapiFields.add("media_profile_groups");
    openapiFields.add("service");
    openapiFields.add("territory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("availability_of");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AvailabilityDebug
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailabilityDebug.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailabilityDebug is not found in the empty JSON string", AvailabilityDebug.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AvailabilityDebug.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailabilityDebug` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailabilityDebug.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `availability_of`
      PidReference.validateJsonElement(jsonObj.get("availability_of"));
      // validate the optional field `media_profile_groups`
      if (jsonObj.get("media_profile_groups") != null && !jsonObj.get("media_profile_groups").isJsonNull()) {
        MediaProfileGroups.validateJsonElement(jsonObj.get("media_profile_groups"));
      }
      // validate the optional field `service`
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) {
        ServiceReference.validateJsonElement(jsonObj.get("service"));
      }
      if ((jsonObj.get("territory") != null && !jsonObj.get("territory").isJsonNull()) && !jsonObj.get("territory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `territory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("territory").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailabilityDebug.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailabilityDebug' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailabilityDebug> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailabilityDebug.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailabilityDebug>() {
           @Override
           public void write(JsonWriter out, AvailabilityDebug value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailabilityDebug read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AvailabilityDebug given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AvailabilityDebug
   * @throws IOException if the JSON string is invalid with respect to AvailabilityDebug
   */
  public static AvailabilityDebug fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailabilityDebug.class);
  }

  /**
   * Convert an instance of AvailabilityDebug to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

