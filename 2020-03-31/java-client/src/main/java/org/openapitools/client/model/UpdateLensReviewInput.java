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
import java.util.HashMap;
import java.util.Map;

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
 * Input for update lens review.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:55.652547-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateLensReviewInput {
  public static final String SERIALIZED_NAME_LENS_NOTES = "LensNotes";
  @SerializedName(SERIALIZED_NAME_LENS_NOTES)
  private String lensNotes;

  public static final String SERIALIZED_NAME_PILLAR_NOTES = "PillarNotes";
  @SerializedName(SERIALIZED_NAME_PILLAR_NOTES)
  private Map<String, String> pillarNotes = new HashMap<>();

  public UpdateLensReviewInput() {
  }

  public UpdateLensReviewInput lensNotes(String lensNotes) {
    this.lensNotes = lensNotes;
    return this;
  }

  /**
   * The notes associated with the workload.
   * @return lensNotes
   */
  @javax.annotation.Nullable
  public String getLensNotes() {
    return lensNotes;
  }

  public void setLensNotes(String lensNotes) {
    this.lensNotes = lensNotes;
  }


  public UpdateLensReviewInput pillarNotes(Map<String, String> pillarNotes) {
    this.pillarNotes = pillarNotes;
    return this;
  }

  public UpdateLensReviewInput putPillarNotesItem(String key, String pillarNotesItem) {
    if (this.pillarNotes == null) {
      this.pillarNotes = new HashMap<>();
    }
    this.pillarNotes.put(key, pillarNotesItem);
    return this;
  }

  /**
   * List of pillar notes of a lens review in a workload.
   * @return pillarNotes
   */
  @javax.annotation.Nullable
  public Map<String, String> getPillarNotes() {
    return pillarNotes;
  }

  public void setPillarNotes(Map<String, String> pillarNotes) {
    this.pillarNotes = pillarNotes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLensReviewInput updateLensReviewInput = (UpdateLensReviewInput) o;
    return Objects.equals(this.lensNotes, updateLensReviewInput.lensNotes) &&
        Objects.equals(this.pillarNotes, updateLensReviewInput.pillarNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lensNotes, pillarNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLensReviewInput {\n");
    sb.append("    lensNotes: ").append(toIndentedString(lensNotes)).append("\n");
    sb.append("    pillarNotes: ").append(toIndentedString(pillarNotes)).append("\n");
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
    openapiFields.add("LensNotes");
    openapiFields.add("PillarNotes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateLensReviewInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateLensReviewInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateLensReviewInput is not found in the empty JSON string", UpdateLensReviewInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateLensReviewInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateLensReviewInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LensNotes") != null && !jsonObj.get("LensNotes").isJsonNull()) && !jsonObj.get("LensNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LensNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LensNotes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLensReviewInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLensReviewInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLensReviewInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLensReviewInput.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLensReviewInput>() {
           @Override
           public void write(JsonWriter out, UpdateLensReviewInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateLensReviewInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateLensReviewInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateLensReviewInput
   * @throws IOException if the JSON string is invalid with respect to UpdateLensReviewInput
   */
  public static UpdateLensReviewInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLensReviewInput.class);
  }

  /**
   * Convert an instance of UpdateLensReviewInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

