/*
 * AWS Well-Architected Tool
 * <fullname>Well-Architected Tool</fullname> <p>This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a href=\"http://aws.amazon.com/well-architected-tool\">Well-Architected Tool</a> in the <a href=\"https://console.aws.amazon.com/wellarchitected\">Amazon Web Services Management Console</a>. For information about the Well-Architected Tool, see the <a href=\"https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html\">Well-Architected Tool User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2020-03-31
 * Contact: mike.ralphson@gmail.com
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
import java.util.List;
import org.openapitools.client.model.AdditionalResourceType;

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
 * &lt;p&gt;The choice level additional resources for a custom lens.&lt;/p&gt; &lt;p&gt;This field does not apply to Amazon Web Services official lenses.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:55.652547-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AdditionalResources {
  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AdditionalResourceType type;

  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List content;

  public AdditionalResources() {
  }

  public AdditionalResources type(AdditionalResourceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public AdditionalResourceType getType() {
    return type;
  }

  public void setType(AdditionalResourceType type) {
    this.type = type;
  }


  public AdditionalResources content(List content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nullable
  public List getContent() {
    return content;
  }

  public void setContent(List content) {
    this.content = content;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalResources additionalResources = (AdditionalResources) o;
    return Objects.equals(this.type, additionalResources.type) &&
        Objects.equals(this.content, additionalResources.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalResources {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("Content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdditionalResources
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdditionalResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalResources is not found in the empty JSON string", AdditionalResources.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdditionalResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalResources` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        AdditionalResourceType.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `Content`
      if (jsonObj.get("Content") != null && !jsonObj.get("Content").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Content"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalResources.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalResources>() {
           @Override
           public void write(JsonWriter out, AdditionalResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalResources read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdditionalResources given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalResources
   * @throws IOException if the JSON string is invalid with respect to AdditionalResources
   */
  public static AdditionalResources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalResources.class);
  }

  /**
   * Convert an instance of AdditionalResources to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

