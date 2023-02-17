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
import org.openapitools.client.model.KnowledgeBase;

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
 * WindowsDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:08.153528-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class WindowsDetail {
  public static final String SERIALIZED_NAME_CPE_URI = "cpeUri";
  @SerializedName(SERIALIZED_NAME_CPE_URI)
  private String cpeUri;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FIXING_KBS = "fixingKbs";
  @SerializedName(SERIALIZED_NAME_FIXING_KBS)
  private List<KnowledgeBase> fixingKbs = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public WindowsDetail() {
  }

  public WindowsDetail cpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
    return this;
  }

  /**
   * Required. The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar.
   * @return cpeUri
   */
  @javax.annotation.Nullable
  public String getCpeUri() {
    return cpeUri;
  }

  public void setCpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
  }


  public WindowsDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the vulnerability.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public WindowsDetail fixingKbs(List<KnowledgeBase> fixingKbs) {
    this.fixingKbs = fixingKbs;
    return this;
  }

  public WindowsDetail addFixingKbsItem(KnowledgeBase fixingKbsItem) {
    if (this.fixingKbs == null) {
      this.fixingKbs = new ArrayList<>();
    }
    this.fixingKbs.add(fixingKbsItem);
    return this;
  }

  /**
   * Required. The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed kb&#39;s presence is considered a fix.
   * @return fixingKbs
   */
  @javax.annotation.Nullable
  public List<KnowledgeBase> getFixingKbs() {
    return fixingKbs;
  }

  public void setFixingKbs(List<KnowledgeBase> fixingKbs) {
    this.fixingKbs = fixingKbs;
  }


  public WindowsDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The name of the vulnerability.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WindowsDetail windowsDetail = (WindowsDetail) o;
    return Objects.equals(this.cpeUri, windowsDetail.cpeUri) &&
        Objects.equals(this.description, windowsDetail.description) &&
        Objects.equals(this.fixingKbs, windowsDetail.fixingKbs) &&
        Objects.equals(this.name, windowsDetail.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpeUri, description, fixingKbs, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WindowsDetail {\n");
    sb.append("    cpeUri: ").append(toIndentedString(cpeUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fixingKbs: ").append(toIndentedString(fixingKbs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("cpeUri");
    openapiFields.add("description");
    openapiFields.add("fixingKbs");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WindowsDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WindowsDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WindowsDetail is not found in the empty JSON string", WindowsDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WindowsDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WindowsDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cpeUri") != null && !jsonObj.get("cpeUri").isJsonNull()) && !jsonObj.get("cpeUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpeUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpeUri").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("fixingKbs") != null && !jsonObj.get("fixingKbs").isJsonNull()) {
        JsonArray jsonArrayfixingKbs = jsonObj.getAsJsonArray("fixingKbs");
        if (jsonArrayfixingKbs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fixingKbs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fixingKbs` to be an array in the JSON string but got `%s`", jsonObj.get("fixingKbs").toString()));
          }

          // validate the optional field `fixingKbs` (array)
          for (int i = 0; i < jsonArrayfixingKbs.size(); i++) {
            KnowledgeBase.validateJsonElement(jsonArrayfixingKbs.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WindowsDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WindowsDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WindowsDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WindowsDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<WindowsDetail>() {
           @Override
           public void write(JsonWriter out, WindowsDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WindowsDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WindowsDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WindowsDetail
   * @throws IOException if the JSON string is invalid with respect to WindowsDetail
   */
  public static WindowsDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WindowsDetail.class);
  }

  /**
   * Convert an instance of WindowsDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

