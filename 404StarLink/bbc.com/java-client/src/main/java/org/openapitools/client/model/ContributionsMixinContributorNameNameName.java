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
 * ContributionsMixinContributorNameNameName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContributionsMixinContributorNameNameName {
  public static final String SERIALIZED_NAME_FAMILY = "family";
  @SerializedName(SERIALIZED_NAME_FAMILY)
  private String family;

  public static final String SERIALIZED_NAME_GIVEN = "given";
  @SerializedName(SERIALIZED_NAME_GIVEN)
  private String given;

  public static final String SERIALIZED_NAME_PRESENTATION = "presentation";
  @SerializedName(SERIALIZED_NAME_PRESENTATION)
  private String presentation;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public ContributionsMixinContributorNameNameName() {
  }

  public ContributionsMixinContributorNameNameName family(String family) {
    this.family = family;
    return this;
  }

  /**
   * Get family
   * @return family
   */
  @javax.annotation.Nullable
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }


  public ContributionsMixinContributorNameNameName given(String given) {
    this.given = given;
    return this;
  }

  /**
   * Get given
   * @return given
   */
  @javax.annotation.Nullable
  public String getGiven() {
    return given;
  }

  public void setGiven(String given) {
    this.given = given;
  }


  public ContributionsMixinContributorNameNameName presentation(String presentation) {
    this.presentation = presentation;
    return this;
  }

  /**
   * Get presentation
   * @return presentation
   */
  @javax.annotation.Nullable
  public String getPresentation() {
    return presentation;
  }

  public void setPresentation(String presentation) {
    this.presentation = presentation;
  }


  public ContributionsMixinContributorNameNameName title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
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
    ContributionsMixinContributorNameNameName contributionsMixinContributorNameNameName = (ContributionsMixinContributorNameNameName) o;
    return Objects.equals(this.family, contributionsMixinContributorNameNameName.family) &&
        Objects.equals(this.given, contributionsMixinContributorNameNameName.given) &&
        Objects.equals(this.presentation, contributionsMixinContributorNameNameName.presentation) &&
        Objects.equals(this.title, contributionsMixinContributorNameNameName.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, given, presentation, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributionsMixinContributorNameNameName {\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    given: ").append(toIndentedString(given)).append("\n");
    sb.append("    presentation: ").append(toIndentedString(presentation)).append("\n");
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
    openapiFields.add("family");
    openapiFields.add("given");
    openapiFields.add("presentation");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContributionsMixinContributorNameNameName
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContributionsMixinContributorNameNameName.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContributionsMixinContributorNameNameName is not found in the empty JSON string", ContributionsMixinContributorNameNameName.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContributionsMixinContributorNameNameName.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContributionsMixinContributorNameNameName` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("family") != null && !jsonObj.get("family").isJsonNull()) && !jsonObj.get("family").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family").toString()));
      }
      if ((jsonObj.get("given") != null && !jsonObj.get("given").isJsonNull()) && !jsonObj.get("given").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `given` to be a primitive type in the JSON string but got `%s`", jsonObj.get("given").toString()));
      }
      if ((jsonObj.get("presentation") != null && !jsonObj.get("presentation").isJsonNull()) && !jsonObj.get("presentation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `presentation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("presentation").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContributionsMixinContributorNameNameName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContributionsMixinContributorNameNameName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContributionsMixinContributorNameNameName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContributionsMixinContributorNameNameName.class));

       return (TypeAdapter<T>) new TypeAdapter<ContributionsMixinContributorNameNameName>() {
           @Override
           public void write(JsonWriter out, ContributionsMixinContributorNameNameName value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContributionsMixinContributorNameNameName read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContributionsMixinContributorNameNameName given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContributionsMixinContributorNameNameName
   * @throws IOException if the JSON string is invalid with respect to ContributionsMixinContributorNameNameName
   */
  public static ContributionsMixinContributorNameNameName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContributionsMixinContributorNameNameName.class);
  }

  /**
   * Convert an instance of ContributionsMixinContributorNameNameName to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

