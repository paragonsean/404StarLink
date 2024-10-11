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
 * Options for Groups exports.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:41.496021-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GroupsExportOptions {
  /**
   * The file format for exported messages.
   */
  @JsonAdapter(ExportFormatEnum.Adapter.class)
  public enum ExportFormatEnum {
    EXPORT_FORMAT_UNSPECIFIED("EXPORT_FORMAT_UNSPECIFIED"),
    
    MBOX("MBOX"),
    
    PST("PST");

    private String value;

    ExportFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExportFormatEnum fromValue(String value) {
      for (ExportFormatEnum b : ExportFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExportFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExportFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExportFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExportFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ExportFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EXPORT_FORMAT = "exportFormat";
  @SerializedName(SERIALIZED_NAME_EXPORT_FORMAT)
  private ExportFormatEnum exportFormat;

  public GroupsExportOptions() {
  }

  public GroupsExportOptions exportFormat(ExportFormatEnum exportFormat) {
    this.exportFormat = exportFormat;
    return this;
  }

  /**
   * The file format for exported messages.
   * @return exportFormat
   */
  @javax.annotation.Nullable
  public ExportFormatEnum getExportFormat() {
    return exportFormat;
  }

  public void setExportFormat(ExportFormatEnum exportFormat) {
    this.exportFormat = exportFormat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsExportOptions groupsExportOptions = (GroupsExportOptions) o;
    return Objects.equals(this.exportFormat, groupsExportOptions.exportFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsExportOptions {\n");
    sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
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
    openapiFields.add("exportFormat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupsExportOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupsExportOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupsExportOptions is not found in the empty JSON string", GroupsExportOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GroupsExportOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupsExportOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("exportFormat") != null && !jsonObj.get("exportFormat").isJsonNull()) && !jsonObj.get("exportFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exportFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exportFormat").toString()));
      }
      // validate the optional field `exportFormat`
      if (jsonObj.get("exportFormat") != null && !jsonObj.get("exportFormat").isJsonNull()) {
        ExportFormatEnum.validateJsonElement(jsonObj.get("exportFormat"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupsExportOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupsExportOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupsExportOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupsExportOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupsExportOptions>() {
           @Override
           public void write(JsonWriter out, GroupsExportOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupsExportOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GroupsExportOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GroupsExportOptions
   * @throws IOException if the JSON string is invalid with respect to GroupsExportOptions
   */
  public static GroupsExportOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupsExportOptions.class);
  }

  /**
   * Convert an instance of GroupsExportOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

