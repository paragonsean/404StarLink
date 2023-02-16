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
import java.util.Arrays;
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
 * PackageInfoOccurrence represents an SPDX Package Information section: https://spdx.github.io/spdx-spec/3-package-information/
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:03.965307-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PackageInfoOccurrence {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_HOME_PAGE = "homePage";
  @SerializedName(SERIALIZED_NAME_HOME_PAGE)
  private String homePage;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LICENSE_CONCLUDED = "licenseConcluded";
  @SerializedName(SERIALIZED_NAME_LICENSE_CONCLUDED)
  private License licenseConcluded;

  public static final String SERIALIZED_NAME_PACKAGE_TYPE = "packageType";
  @SerializedName(SERIALIZED_NAME_PACKAGE_TYPE)
  private String packageType;

  public static final String SERIALIZED_NAME_SOURCE_INFO = "sourceInfo";
  @SerializedName(SERIALIZED_NAME_SOURCE_INFO)
  private String sourceInfo;

  public static final String SERIALIZED_NAME_SUMMARY_DESCRIPTION = "summaryDescription";
  @SerializedName(SERIALIZED_NAME_SUMMARY_DESCRIPTION)
  private String summaryDescription;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public PackageInfoOccurrence() {
  }

  public PackageInfoOccurrence(
     String homePage, 
     String packageType, 
     String summaryDescription, 
     String title, 
     String version
  ) {
    this();
    this.homePage = homePage;
    this.packageType = packageType;
    this.summaryDescription = summaryDescription;
    this.title = title;
    this.version = version;
  }

  public PackageInfoOccurrence comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * A place for the SPDX file creator to record any general comments about the package being described
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public PackageInfoOccurrence filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Provide the actual file name of the package, or path of the directory being treated as a package
   * @return filename
   */
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }


  /**
   * Output only. Provide a place for the SPDX file creator to record a web site that serves as the package&#39;s home page
   * @return homePage
   */
  @javax.annotation.Nullable
  public String getHomePage() {
    return homePage;
  }



  public PackageInfoOccurrence id(String id) {
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


  public PackageInfoOccurrence licenseConcluded(License licenseConcluded) {
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


  /**
   * Output only. The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
   * @return packageType
   */
  @javax.annotation.Nullable
  public String getPackageType() {
    return packageType;
  }



  public PackageInfoOccurrence sourceInfo(String sourceInfo) {
    this.sourceInfo = sourceInfo;
    return this;
  }

  /**
   * Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
   * @return sourceInfo
   */
  @javax.annotation.Nullable
  public String getSourceInfo() {
    return sourceInfo;
  }

  public void setSourceInfo(String sourceInfo) {
    this.sourceInfo = sourceInfo;
  }


  /**
   * Output only. A short description of the package
   * @return summaryDescription
   */
  @javax.annotation.Nullable
  public String getSummaryDescription() {
    return summaryDescription;
  }



  /**
   * Output only. Identify the full name of the package as given by the Package Originator
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }



  /**
   * Output only. Identify the version of the package
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageInfoOccurrence packageInfoOccurrence = (PackageInfoOccurrence) o;
    return Objects.equals(this.comment, packageInfoOccurrence.comment) &&
        Objects.equals(this.filename, packageInfoOccurrence.filename) &&
        Objects.equals(this.homePage, packageInfoOccurrence.homePage) &&
        Objects.equals(this.id, packageInfoOccurrence.id) &&
        Objects.equals(this.licenseConcluded, packageInfoOccurrence.licenseConcluded) &&
        Objects.equals(this.packageType, packageInfoOccurrence.packageType) &&
        Objects.equals(this.sourceInfo, packageInfoOccurrence.sourceInfo) &&
        Objects.equals(this.summaryDescription, packageInfoOccurrence.summaryDescription) &&
        Objects.equals(this.title, packageInfoOccurrence.title) &&
        Objects.equals(this.version, packageInfoOccurrence.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, filename, homePage, id, licenseConcluded, packageType, sourceInfo, summaryDescription, title, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageInfoOccurrence {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    homePage: ").append(toIndentedString(homePage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    licenseConcluded: ").append(toIndentedString(licenseConcluded)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    sourceInfo: ").append(toIndentedString(sourceInfo)).append("\n");
    sb.append("    summaryDescription: ").append(toIndentedString(summaryDescription)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("filename");
    openapiFields.add("homePage");
    openapiFields.add("id");
    openapiFields.add("licenseConcluded");
    openapiFields.add("packageType");
    openapiFields.add("sourceInfo");
    openapiFields.add("summaryDescription");
    openapiFields.add("title");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PackageInfoOccurrence
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PackageInfoOccurrence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PackageInfoOccurrence is not found in the empty JSON string", PackageInfoOccurrence.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PackageInfoOccurrence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PackageInfoOccurrence` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if ((jsonObj.get("homePage") != null && !jsonObj.get("homePage").isJsonNull()) && !jsonObj.get("homePage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homePage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homePage").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `licenseConcluded`
      if (jsonObj.get("licenseConcluded") != null && !jsonObj.get("licenseConcluded").isJsonNull()) {
        License.validateJsonElement(jsonObj.get("licenseConcluded"));
      }
      if ((jsonObj.get("packageType") != null && !jsonObj.get("packageType").isJsonNull()) && !jsonObj.get("packageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `packageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("packageType").toString()));
      }
      if ((jsonObj.get("sourceInfo") != null && !jsonObj.get("sourceInfo").isJsonNull()) && !jsonObj.get("sourceInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceInfo").toString()));
      }
      if ((jsonObj.get("summaryDescription") != null && !jsonObj.get("summaryDescription").isJsonNull()) && !jsonObj.get("summaryDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summaryDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summaryDescription").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PackageInfoOccurrence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PackageInfoOccurrence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PackageInfoOccurrence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PackageInfoOccurrence.class));

       return (TypeAdapter<T>) new TypeAdapter<PackageInfoOccurrence>() {
           @Override
           public void write(JsonWriter out, PackageInfoOccurrence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PackageInfoOccurrence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PackageInfoOccurrence given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PackageInfoOccurrence
   * @throws IOException if the JSON string is invalid with respect to PackageInfoOccurrence
   */
  public static PackageInfoOccurrence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PackageInfoOccurrence.class);
  }

  /**
   * Convert an instance of PackageInfoOccurrence to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

