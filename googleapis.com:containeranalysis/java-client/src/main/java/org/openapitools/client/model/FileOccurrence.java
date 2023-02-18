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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.License;

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
 * FileOccurrence represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4-file-information/
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:12.338-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FileOccurrence {
  public static final String SERIALIZED_NAME_ATTRIBUTIONS = "attributions";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTIONS)
  private List<String> attributions = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CONTRIBUTORS = "contributors";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTORS)
  private List<String> contributors = new ArrayList<>();

  public static final String SERIALIZED_NAME_COPYRIGHT = "copyright";
  @SerializedName(SERIALIZED_NAME_COPYRIGHT)
  private String copyright;

  public static final String SERIALIZED_NAME_FILES_LICENSE_INFO = "filesLicenseInfo";
  @SerializedName(SERIALIZED_NAME_FILES_LICENSE_INFO)
  private List<String> filesLicenseInfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LICENSE_CONCLUDED = "licenseConcluded";
  @SerializedName(SERIALIZED_NAME_LICENSE_CONCLUDED)
  private License licenseConcluded;

  public static final String SERIALIZED_NAME_NOTICE = "notice";
  @SerializedName(SERIALIZED_NAME_NOTICE)
  private String notice;

  public FileOccurrence() {
  }

  public FileOccurrence attributions(List<String> attributions) {
    this.attributions = attributions;
    return this;
  }

  public FileOccurrence addAttributionsItem(String attributionsItem) {
    if (this.attributions == null) {
      this.attributions = new ArrayList<>();
    }
    this.attributions.add(attributionsItem);
    return this;
  }

  /**
   * This field provides a place for the SPDX data creator to record, at the file level, acknowledgements that may be needed to be communicated in some contexts
   * @return attributions
   */
  @javax.annotation.Nullable
  public List<String> getAttributions() {
    return attributions;
  }

  public void setAttributions(List<String> attributions) {
    this.attributions = attributions;
  }


  public FileOccurrence comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * This field provides a place for the SPDX file creator to record any general comments about the file
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public FileOccurrence contributors(List<String> contributors) {
    this.contributors = contributors;
    return this;
  }

  public FileOccurrence addContributorsItem(String contributorsItem) {
    if (this.contributors == null) {
      this.contributors = new ArrayList<>();
    }
    this.contributors.add(contributorsItem);
    return this;
  }

  /**
   * This field provides a place for the SPDX file creator to record file contributors
   * @return contributors
   */
  @javax.annotation.Nullable
  public List<String> getContributors() {
    return contributors;
  }

  public void setContributors(List<String> contributors) {
    this.contributors = contributors;
  }


  public FileOccurrence copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

  /**
   * Identify the copyright holder of the file, as well as any dates present
   * @return copyright
   */
  @javax.annotation.Nullable
  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }


  public FileOccurrence filesLicenseInfo(List<String> filesLicenseInfo) {
    this.filesLicenseInfo = filesLicenseInfo;
    return this;
  }

  public FileOccurrence addFilesLicenseInfoItem(String filesLicenseInfoItem) {
    if (this.filesLicenseInfo == null) {
      this.filesLicenseInfo = new ArrayList<>();
    }
    this.filesLicenseInfo.add(filesLicenseInfoItem);
    return this;
  }

  /**
   * This field contains the license information actually found in the file, if any
   * @return filesLicenseInfo
   */
  @javax.annotation.Nullable
  public List<String> getFilesLicenseInfo() {
    return filesLicenseInfo;
  }

  public void setFilesLicenseInfo(List<String> filesLicenseInfo) {
    this.filesLicenseInfo = filesLicenseInfo;
  }


  public FileOccurrence id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Uniquely identify any element in an SPDX document which may be referenced by other elements
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public FileOccurrence licenseConcluded(License licenseConcluded) {
    this.licenseConcluded = licenseConcluded;
    return this;
  }

  /**
   * Get licenseConcluded
   * @return licenseConcluded
   */
  @javax.annotation.Nullable
  public License getLicenseConcluded() {
    return licenseConcluded;
  }

  public void setLicenseConcluded(License licenseConcluded) {
    this.licenseConcluded = licenseConcluded;
  }


  public FileOccurrence notice(String notice) {
    this.notice = notice;
    return this;
  }

  /**
   * This field provides a place for the SPDX file creator to record license notices or other such related notices found in the file
   * @return notice
   */
  @javax.annotation.Nullable
  public String getNotice() {
    return notice;
  }

  public void setNotice(String notice) {
    this.notice = notice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOccurrence fileOccurrence = (FileOccurrence) o;
    return Objects.equals(this.attributions, fileOccurrence.attributions) &&
        Objects.equals(this.comment, fileOccurrence.comment) &&
        Objects.equals(this.contributors, fileOccurrence.contributors) &&
        Objects.equals(this.copyright, fileOccurrence.copyright) &&
        Objects.equals(this.filesLicenseInfo, fileOccurrence.filesLicenseInfo) &&
        Objects.equals(this.id, fileOccurrence.id) &&
        Objects.equals(this.licenseConcluded, fileOccurrence.licenseConcluded) &&
        Objects.equals(this.notice, fileOccurrence.notice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributions, comment, contributors, copyright, filesLicenseInfo, id, licenseConcluded, notice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOccurrence {\n");
    sb.append("    attributions: ").append(toIndentedString(attributions)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    contributors: ").append(toIndentedString(contributors)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    filesLicenseInfo: ").append(toIndentedString(filesLicenseInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    licenseConcluded: ").append(toIndentedString(licenseConcluded)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
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
    openapiFields.add("attributions");
    openapiFields.add("comment");
    openapiFields.add("contributors");
    openapiFields.add("copyright");
    openapiFields.add("filesLicenseInfo");
    openapiFields.add("id");
    openapiFields.add("licenseConcluded");
    openapiFields.add("notice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FileOccurrence
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FileOccurrence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileOccurrence is not found in the empty JSON string", FileOccurrence.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FileOccurrence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileOccurrence` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("attributions") != null && !jsonObj.get("attributions").isJsonNull() && !jsonObj.get("attributions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributions` to be an array in the JSON string but got `%s`", jsonObj.get("attributions").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("contributors") != null && !jsonObj.get("contributors").isJsonNull() && !jsonObj.get("contributors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contributors` to be an array in the JSON string but got `%s`", jsonObj.get("contributors").toString()));
      }
      if ((jsonObj.get("copyright") != null && !jsonObj.get("copyright").isJsonNull()) && !jsonObj.get("copyright").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `copyright` to be a primitive type in the JSON string but got `%s`", jsonObj.get("copyright").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("filesLicenseInfo") != null && !jsonObj.get("filesLicenseInfo").isJsonNull() && !jsonObj.get("filesLicenseInfo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filesLicenseInfo` to be an array in the JSON string but got `%s`", jsonObj.get("filesLicenseInfo").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `licenseConcluded`
      if (jsonObj.get("licenseConcluded") != null && !jsonObj.get("licenseConcluded").isJsonNull()) {
        License.validateJsonElement(jsonObj.get("licenseConcluded"));
      }
      if ((jsonObj.get("notice") != null && !jsonObj.get("notice").isJsonNull()) && !jsonObj.get("notice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notice").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileOccurrence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileOccurrence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileOccurrence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileOccurrence.class));

       return (TypeAdapter<T>) new TypeAdapter<FileOccurrence>() {
           @Override
           public void write(JsonWriter out, FileOccurrence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileOccurrence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FileOccurrence given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FileOccurrence
   * @throws IOException if the JSON string is invalid with respect to FileOccurrence
   */
  public static FileOccurrence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileOccurrence.class);
  }

  /**
   * Convert an instance of FileOccurrence to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

