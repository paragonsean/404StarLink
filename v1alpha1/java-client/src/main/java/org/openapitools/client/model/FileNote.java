/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
 *
 * The version of the OpenAPI document: v1alpha1
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
 * FileNote represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4-file-information/
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:57.433900-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FileNote {
  public static final String SERIALIZED_NAME_CHECKSUM = "checksum";
  @SerializedName(SERIALIZED_NAME_CHECKSUM)
  private List<String> checksum = new ArrayList<>();

  /**
   * This field provides information about the type of file identified
   */
  @JsonAdapter(FileTypeEnum.Adapter.class)
  public enum FileTypeEnum {
    FILE_TYPE_UNSPECIFIED("FILE_TYPE_UNSPECIFIED"),
    
    SOURCE("SOURCE"),
    
    BINARY("BINARY"),
    
    ARCHIVE("ARCHIVE"),
    
    APPLICATION("APPLICATION"),
    
    AUDIO("AUDIO"),
    
    IMAGE("IMAGE"),
    
    TEXT("TEXT"),
    
    VIDEO("VIDEO"),
    
    DOCUMENTATION("DOCUMENTATION"),
    
    SPDX("SPDX"),
    
    OTHER("OTHER");

    private String value;

    FileTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FileTypeEnum fromValue(String value) {
      for (FileTypeEnum b : FileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FileTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FileTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FileTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FILE_TYPE = "fileType";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private FileTypeEnum fileType;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public FileNote() {
  }

  public FileNote checksum(List<String> checksum) {
    this.checksum = checksum;
    return this;
  }

  public FileNote addChecksumItem(String checksumItem) {
    if (this.checksum == null) {
      this.checksum = new ArrayList<>();
    }
    this.checksum.add(checksumItem);
    return this;
  }

  /**
   * Provide a unique identifier to match analysis information on each specific file in a package
   * @return checksum
   */
  @javax.annotation.Nullable
  public List<String> getChecksum() {
    return checksum;
  }

  public void setChecksum(List<String> checksum) {
    this.checksum = checksum;
  }


  public FileNote fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * This field provides information about the type of file identified
   * @return fileType
   */
  @javax.annotation.Nullable
  public FileTypeEnum getFileType() {
    return fileType;
  }

  public void setFileType(FileTypeEnum fileType) {
    this.fileType = fileType;
  }


  public FileNote title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Identify the full path and filename that corresponds to the file information in this section
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileNote fileNote = (FileNote) o;
    return Objects.equals(this.checksum, fileNote.checksum) &&
        Objects.equals(this.fileType, fileNote.fileType) &&
        Objects.equals(this.title, fileNote.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checksum, fileType, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileNote {\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("checksum");
    openapiFields.add("fileType");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FileNote
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FileNote.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileNote is not found in the empty JSON string", FileNote.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FileNote.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileNote` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("checksum") != null && !jsonObj.get("checksum").isJsonNull() && !jsonObj.get("checksum").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `checksum` to be an array in the JSON string but got `%s`", jsonObj.get("checksum").toString()));
      }
      if ((jsonObj.get("fileType") != null && !jsonObj.get("fileType").isJsonNull()) && !jsonObj.get("fileType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileType").toString()));
      }
      // validate the optional field `fileType`
      if (jsonObj.get("fileType") != null && !jsonObj.get("fileType").isJsonNull()) {
        FileTypeEnum.validateJsonElement(jsonObj.get("fileType"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileNote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileNote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileNote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileNote.class));

       return (TypeAdapter<T>) new TypeAdapter<FileNote>() {
           @Override
           public void write(JsonWriter out, FileNote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileNote read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FileNote given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FileNote
   * @throws IOException if the JSON string is invalid with respect to FileNote
   */
  public static FileNote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileNote.class);
  }

  /**
   * Convert an instance of FileNote to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

