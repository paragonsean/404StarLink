/*
 * Google Vault API
 * Retention and eDiscovery for Google Workspace. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege. For example, to download an export, an account needs the **Manage Exports** privilege and the matter shared with them. 
 *
 * The version of the OpenAPI document: v1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Options for Voice holds.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:41.496021-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HeldVoiceQuery {
  /**
   * Gets or Sets coveredData
   */
  @JsonAdapter(CoveredDataEnum.Adapter.class)
  public enum CoveredDataEnum {
    COVERED_DATA_UNSPECIFIED("COVERED_DATA_UNSPECIFIED"),
    
    TEXT_MESSAGES("TEXT_MESSAGES"),
    
    VOICEMAILS("VOICEMAILS"),
    
    CALL_LOGS("CALL_LOGS");

    private String value;

    CoveredDataEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CoveredDataEnum fromValue(String value) {
      for (CoveredDataEnum b : CoveredDataEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CoveredDataEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CoveredDataEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CoveredDataEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CoveredDataEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CoveredDataEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_COVERED_DATA = "coveredData";
  @SerializedName(SERIALIZED_NAME_COVERED_DATA)
  private List<CoveredDataEnum> coveredData = new ArrayList<>();

  public HeldVoiceQuery() {
  }

  public HeldVoiceQuery coveredData(List<CoveredDataEnum> coveredData) {
    this.coveredData = coveredData;
    return this;
  }

  public HeldVoiceQuery addCoveredDataItem(CoveredDataEnum coveredDataItem) {
    if (this.coveredData == null) {
      this.coveredData = new ArrayList<>();
    }
    this.coveredData.add(coveredDataItem);
    return this;
  }

  /**
   * A list of data types covered by the hold. Should be non-empty. Order does not matter and duplicates are ignored.
   * @return coveredData
   */
  @javax.annotation.Nullable
  public List<CoveredDataEnum> getCoveredData() {
    return coveredData;
  }

  public void setCoveredData(List<CoveredDataEnum> coveredData) {
    this.coveredData = coveredData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeldVoiceQuery heldVoiceQuery = (HeldVoiceQuery) o;
    return Objects.equals(this.coveredData, heldVoiceQuery.coveredData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coveredData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeldVoiceQuery {\n");
    sb.append("    coveredData: ").append(toIndentedString(coveredData)).append("\n");
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
    openapiFields.add("coveredData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HeldVoiceQuery
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HeldVoiceQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HeldVoiceQuery is not found in the empty JSON string", HeldVoiceQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HeldVoiceQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HeldVoiceQuery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("coveredData") != null && !jsonObj.get("coveredData").isJsonNull() && !jsonObj.get("coveredData").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `coveredData` to be an array in the JSON string but got `%s`", jsonObj.get("coveredData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HeldVoiceQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HeldVoiceQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HeldVoiceQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HeldVoiceQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<HeldVoiceQuery>() {
           @Override
           public void write(JsonWriter out, HeldVoiceQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HeldVoiceQuery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HeldVoiceQuery given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HeldVoiceQuery
   * @throws IOException if the JSON string is invalid with respect to HeldVoiceQuery
   */
  public static HeldVoiceQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HeldVoiceQuery.class);
  }

  /**
   * Convert an instance of HeldVoiceQuery to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

