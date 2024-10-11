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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AvailableMixins;
import org.openapitools.client.model.AvailableVersionsElementVersionInnerTypesInner;
import org.openapitools.client.model.GuidanceWarnings;

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
 * AvailableVersionsElementVersionInnerVersionInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AvailableVersionsElementVersionInnerVersionInner {
  public static final String SERIALIZED_NAME_AVAILABLE_MIXINS = "available_mixins";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_MIXINS)
  private AvailableMixins availableMixins;

  public static final String SERIALIZED_NAME_COMPETITION_WARNING = "competition_warning";
  @SerializedName(SERIALIZED_NAME_COMPETITION_WARNING)
  private Boolean competitionWarning;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_GUIDANCE_WARNINGS = "guidance_warnings";
  @SerializedName(SERIALIZED_NAME_GUIDANCE_WARNINGS)
  private GuidanceWarnings guidanceWarnings;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<AvailableVersionsElementVersionInnerTypesInner> types = new ArrayList<>();

  public AvailableVersionsElementVersionInnerVersionInner() {
  }

  public AvailableVersionsElementVersionInnerVersionInner availableMixins(AvailableMixins availableMixins) {
    this.availableMixins = availableMixins;
    return this;
  }

  /**
   * Get availableMixins
   * @return availableMixins
   */
  @javax.annotation.Nullable
  public AvailableMixins getAvailableMixins() {
    return availableMixins;
  }

  public void setAvailableMixins(AvailableMixins availableMixins) {
    this.availableMixins = availableMixins;
  }


  public AvailableVersionsElementVersionInnerVersionInner competitionWarning(Boolean competitionWarning) {
    this.competitionWarning = competitionWarning;
    return this;
  }

  /**
   * Get competitionWarning
   * @return competitionWarning
   */
  @javax.annotation.Nullable
  public Boolean getCompetitionWarning() {
    return competitionWarning;
  }

  public void setCompetitionWarning(Boolean competitionWarning) {
    this.competitionWarning = competitionWarning;
  }


  public AvailableVersionsElementVersionInnerVersionInner duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public AvailableVersionsElementVersionInnerVersionInner guidanceWarnings(GuidanceWarnings guidanceWarnings) {
    this.guidanceWarnings = guidanceWarnings;
    return this;
  }

  /**
   * Get guidanceWarnings
   * @return guidanceWarnings
   */
  @javax.annotation.Nullable
  public GuidanceWarnings getGuidanceWarnings() {
    return guidanceWarnings;
  }

  public void setGuidanceWarnings(GuidanceWarnings guidanceWarnings) {
    this.guidanceWarnings = guidanceWarnings;
  }


  public AvailableVersionsElementVersionInnerVersionInner pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  @javax.annotation.Nullable
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }


  public AvailableVersionsElementVersionInnerVersionInner types(List<AvailableVersionsElementVersionInnerTypesInner> types) {
    this.types = types;
    return this;
  }

  public AvailableVersionsElementVersionInnerVersionInner addTypesItem(AvailableVersionsElementVersionInnerTypesInner typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
   */
  @javax.annotation.Nonnull
  public List<AvailableVersionsElementVersionInnerTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<AvailableVersionsElementVersionInnerTypesInner> types) {
    this.types = types;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableVersionsElementVersionInnerVersionInner availableVersionsElementVersionInnerVersionInner = (AvailableVersionsElementVersionInnerVersionInner) o;
    return Objects.equals(this.availableMixins, availableVersionsElementVersionInnerVersionInner.availableMixins) &&
        Objects.equals(this.competitionWarning, availableVersionsElementVersionInnerVersionInner.competitionWarning) &&
        Objects.equals(this.duration, availableVersionsElementVersionInnerVersionInner.duration) &&
        Objects.equals(this.guidanceWarnings, availableVersionsElementVersionInnerVersionInner.guidanceWarnings) &&
        Objects.equals(this.pid, availableVersionsElementVersionInnerVersionInner.pid) &&
        Objects.equals(this.types, availableVersionsElementVersionInnerVersionInner.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableMixins, competitionWarning, duration, guidanceWarnings, pid, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableVersionsElementVersionInnerVersionInner {\n");
    sb.append("    availableMixins: ").append(toIndentedString(availableMixins)).append("\n");
    sb.append("    competitionWarning: ").append(toIndentedString(competitionWarning)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    guidanceWarnings: ").append(toIndentedString(guidanceWarnings)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
    openapiFields.add("available_mixins");
    openapiFields.add("competition_warning");
    openapiFields.add("duration");
    openapiFields.add("guidance_warnings");
    openapiFields.add("pid");
    openapiFields.add("types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("types");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AvailableVersionsElementVersionInnerVersionInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailableVersionsElementVersionInnerVersionInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailableVersionsElementVersionInnerVersionInner is not found in the empty JSON string", AvailableVersionsElementVersionInnerVersionInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AvailableVersionsElementVersionInnerVersionInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailableVersionsElementVersionInnerVersionInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailableVersionsElementVersionInnerVersionInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `available_mixins`
      if (jsonObj.get("available_mixins") != null && !jsonObj.get("available_mixins").isJsonNull()) {
        AvailableMixins.validateJsonElement(jsonObj.get("available_mixins"));
      }
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      // validate the optional field `guidance_warnings`
      if (jsonObj.get("guidance_warnings") != null && !jsonObj.get("guidance_warnings").isJsonNull()) {
        GuidanceWarnings.validateJsonElement(jsonObj.get("guidance_warnings"));
      }
      if ((jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonNull()) && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }

      JsonArray jsonArraytypes = jsonObj.getAsJsonArray("types");
      // validate the required field `types` (array)
      for (int i = 0; i < jsonArraytypes.size(); i++) {
        AvailableVersionsElementVersionInnerTypesInner.validateJsonElement(jsonArraytypes.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailableVersionsElementVersionInnerVersionInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailableVersionsElementVersionInnerVersionInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailableVersionsElementVersionInnerVersionInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailableVersionsElementVersionInnerVersionInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailableVersionsElementVersionInnerVersionInner>() {
           @Override
           public void write(JsonWriter out, AvailableVersionsElementVersionInnerVersionInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailableVersionsElementVersionInnerVersionInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AvailableVersionsElementVersionInnerVersionInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AvailableVersionsElementVersionInnerVersionInner
   * @throws IOException if the JSON string is invalid with respect to AvailableVersionsElementVersionInnerVersionInner
   */
  public static AvailableVersionsElementVersionInnerVersionInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailableVersionsElementVersionInnerVersionInner.class);
  }

  /**
   * Convert an instance of AvailableVersionsElementVersionInnerVersionInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

