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
 * Input for milestone creation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:51.532398-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateMilestoneInput {
  public static final String SERIALIZED_NAME_MILESTONE_NAME = "MilestoneName";
  @SerializedName(SERIALIZED_NAME_MILESTONE_NAME)
  private String milestoneName;

  public static final String SERIALIZED_NAME_CLIENT_REQUEST_TOKEN = "ClientRequestToken";
  @SerializedName(SERIALIZED_NAME_CLIENT_REQUEST_TOKEN)
  private String clientRequestToken;

  public CreateMilestoneInput() {
  }

  public CreateMilestoneInput milestoneName(String milestoneName) {
    this.milestoneName = milestoneName;
    return this;
  }

  /**
   * &lt;p&gt;The name of the milestone in a workload.&lt;/p&gt; &lt;p&gt;Milestone names must be unique within a workload.&lt;/p&gt;
   * @return milestoneName
   */
  @javax.annotation.Nonnull
  public String getMilestoneName() {
    return milestoneName;
  }

  public void setMilestoneName(String milestoneName) {
    this.milestoneName = milestoneName;
  }


  public CreateMilestoneInput clientRequestToken(String clientRequestToken) {
    this.clientRequestToken = clientRequestToken;
    return this;
  }

  /**
   * &lt;p&gt;A unique case-sensitive string used to ensure that this request is idempotent (executes only once).&lt;/p&gt; &lt;p&gt;You should not reuse the same token for other requests. If you retry a request with the same client request token and the same parameters after the original request has completed successfully, the result of the original request is returned.&lt;/p&gt; &lt;important&gt; &lt;p&gt;This token is listed as required, however, if you do not specify it, the Amazon Web Services SDKs automatically generate one for you. If you are not using the Amazon Web Services SDK or the CLI, you must provide this token or the request will fail.&lt;/p&gt; &lt;/important&gt;
   * @return clientRequestToken
   */
  @javax.annotation.Nonnull
  public String getClientRequestToken() {
    return clientRequestToken;
  }

  public void setClientRequestToken(String clientRequestToken) {
    this.clientRequestToken = clientRequestToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMilestoneInput createMilestoneInput = (CreateMilestoneInput) o;
    return Objects.equals(this.milestoneName, createMilestoneInput.milestoneName) &&
        Objects.equals(this.clientRequestToken, createMilestoneInput.clientRequestToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(milestoneName, clientRequestToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMilestoneInput {\n");
    sb.append("    milestoneName: ").append(toIndentedString(milestoneName)).append("\n");
    sb.append("    clientRequestToken: ").append(toIndentedString(clientRequestToken)).append("\n");
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
    openapiFields.add("MilestoneName");
    openapiFields.add("ClientRequestToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MilestoneName");
    openapiRequiredFields.add("ClientRequestToken");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateMilestoneInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateMilestoneInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMilestoneInput is not found in the empty JSON string", CreateMilestoneInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateMilestoneInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateMilestoneInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateMilestoneInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("MilestoneName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MilestoneName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MilestoneName").toString()));
      }
      if (!jsonObj.get("ClientRequestToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientRequestToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientRequestToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMilestoneInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMilestoneInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMilestoneInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMilestoneInput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMilestoneInput>() {
           @Override
           public void write(JsonWriter out, CreateMilestoneInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateMilestoneInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateMilestoneInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateMilestoneInput
   * @throws IOException if the JSON string is invalid with respect to CreateMilestoneInput
   */
  public static CreateMilestoneInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMilestoneInput.class);
  }

  /**
   * Convert an instance of CreateMilestoneInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

