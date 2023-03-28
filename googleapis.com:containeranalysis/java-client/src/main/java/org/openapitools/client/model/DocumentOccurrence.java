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
 * DocumentOccurrence represents an SPDX Document Creation Information section: https://spdx.github.io/spdx-spec/v2.3/document-creation-information/
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:05.225194-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DocumentOccurrence {
  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_CREATOR_COMMENT = "creatorComment";
  @SerializedName(SERIALIZED_NAME_CREATOR_COMMENT)
  private String creatorComment;

  public static final String SERIALIZED_NAME_CREATORS = "creators";
  @SerializedName(SERIALIZED_NAME_CREATORS)
  private List<String> creators = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOCUMENT_COMMENT = "documentComment";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_COMMENT)
  private String documentComment;

  public static final String SERIALIZED_NAME_EXTERNAL_DOCUMENT_REFS = "externalDocumentRefs";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_DOCUMENT_REFS)
  private List<String> externalDocumentRefs = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LICENSE_LIST_VERSION = "licenseListVersion";
  @SerializedName(SERIALIZED_NAME_LICENSE_LIST_VERSION)
  private String licenseListVersion;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public DocumentOccurrence() {
  }

  public DocumentOccurrence createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public DocumentOccurrence creatorComment(String creatorComment) {
    this.creatorComment = creatorComment;
    return this;
  }

  /**
   * A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
   * @return creatorComment
   */
  @javax.annotation.Nullable
  public String getCreatorComment() {
    return creatorComment;
  }

  public void setCreatorComment(String creatorComment) {
    this.creatorComment = creatorComment;
  }


  public DocumentOccurrence creators(List<String> creators) {
    this.creators = creators;
    return this;
  }

  public DocumentOccurrence addCreatorsItem(String creatorsItem) {
    if (this.creators == null) {
      this.creators = new ArrayList<>();
    }
    this.creators.add(creatorsItem);
    return this;
  }

  /**
   * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
   * @return creators
   */
  @javax.annotation.Nullable
  public List<String> getCreators() {
    return creators;
  }

  public void setCreators(List<String> creators) {
    this.creators = creators;
  }


  public DocumentOccurrence documentComment(String documentComment) {
    this.documentComment = documentComment;
    return this;
  }

  /**
   * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
   * @return documentComment
   */
  @javax.annotation.Nullable
  public String getDocumentComment() {
    return documentComment;
  }

  public void setDocumentComment(String documentComment) {
    this.documentComment = documentComment;
  }


  public DocumentOccurrence externalDocumentRefs(List<String> externalDocumentRefs) {
    this.externalDocumentRefs = externalDocumentRefs;
    return this;
  }

  public DocumentOccurrence addExternalDocumentRefsItem(String externalDocumentRefsItem) {
    if (this.externalDocumentRefs == null) {
      this.externalDocumentRefs = new ArrayList<>();
    }
    this.externalDocumentRefs.add(externalDocumentRefsItem);
    return this;
  }

  /**
   * Identify any external SPDX documents referenced within this SPDX document
   * @return externalDocumentRefs
   */
  @javax.annotation.Nullable
  public List<String> getExternalDocumentRefs() {
    return externalDocumentRefs;
  }

  public void setExternalDocumentRefs(List<String> externalDocumentRefs) {
    this.externalDocumentRefs = externalDocumentRefs;
  }


  public DocumentOccurrence id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identify the current SPDX document which may be referenced in relationships by other files, packages internally and documents externally
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public DocumentOccurrence licenseListVersion(String licenseListVersion) {
    this.licenseListVersion = licenseListVersion;
    return this;
  }

  /**
   * A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
   * @return licenseListVersion
   */
  @javax.annotation.Nullable
  public String getLicenseListVersion() {
    return licenseListVersion;
  }

  public void setLicenseListVersion(String licenseListVersion) {
    this.licenseListVersion = licenseListVersion;
  }


  public DocumentOccurrence namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public DocumentOccurrence title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Identify name of this document as designated by creator
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
    DocumentOccurrence documentOccurrence = (DocumentOccurrence) o;
    return Objects.equals(this.createTime, documentOccurrence.createTime) &&
        Objects.equals(this.creatorComment, documentOccurrence.creatorComment) &&
        Objects.equals(this.creators, documentOccurrence.creators) &&
        Objects.equals(this.documentComment, documentOccurrence.documentComment) &&
        Objects.equals(this.externalDocumentRefs, documentOccurrence.externalDocumentRefs) &&
        Objects.equals(this.id, documentOccurrence.id) &&
        Objects.equals(this.licenseListVersion, documentOccurrence.licenseListVersion) &&
        Objects.equals(this.namespace, documentOccurrence.namespace) &&
        Objects.equals(this.title, documentOccurrence.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, creatorComment, creators, documentComment, externalDocumentRefs, id, licenseListVersion, namespace, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentOccurrence {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creatorComment: ").append(toIndentedString(creatorComment)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    documentComment: ").append(toIndentedString(documentComment)).append("\n");
    sb.append("    externalDocumentRefs: ").append(toIndentedString(externalDocumentRefs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    licenseListVersion: ").append(toIndentedString(licenseListVersion)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
    openapiFields.add("createTime");
    openapiFields.add("creatorComment");
    openapiFields.add("creators");
    openapiFields.add("documentComment");
    openapiFields.add("externalDocumentRefs");
    openapiFields.add("id");
    openapiFields.add("licenseListVersion");
    openapiFields.add("namespace");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentOccurrence
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentOccurrence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentOccurrence is not found in the empty JSON string", DocumentOccurrence.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentOccurrence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentOccurrence` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("createTime") != null && !jsonObj.get("createTime").isJsonNull()) && !jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      if ((jsonObj.get("creatorComment") != null && !jsonObj.get("creatorComment").isJsonNull()) && !jsonObj.get("creatorComment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creatorComment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creatorComment").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("creators") != null && !jsonObj.get("creators").isJsonNull() && !jsonObj.get("creators").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `creators` to be an array in the JSON string but got `%s`", jsonObj.get("creators").toString()));
      }
      if ((jsonObj.get("documentComment") != null && !jsonObj.get("documentComment").isJsonNull()) && !jsonObj.get("documentComment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentComment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentComment").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("externalDocumentRefs") != null && !jsonObj.get("externalDocumentRefs").isJsonNull() && !jsonObj.get("externalDocumentRefs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalDocumentRefs` to be an array in the JSON string but got `%s`", jsonObj.get("externalDocumentRefs").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("licenseListVersion") != null && !jsonObj.get("licenseListVersion").isJsonNull()) && !jsonObj.get("licenseListVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `licenseListVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("licenseListVersion").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentOccurrence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentOccurrence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentOccurrence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentOccurrence.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentOccurrence>() {
           @Override
           public void write(JsonWriter out, DocumentOccurrence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentOccurrence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentOccurrence given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentOccurrence
   * @throws IOException if the JSON string is invalid with respect to DocumentOccurrence
   */
  public static DocumentOccurrence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentOccurrence.class);
  }

  /**
   * Convert an instance of DocumentOccurrence to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

