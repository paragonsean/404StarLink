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
 * ImportLensInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:44.124838-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ImportLensInput {
  public static final String SERIALIZED_NAME_LENS_ALIAS = "LensAlias";
  @SerializedName(SERIALIZED_NAME_LENS_ALIAS)
  private String lensAlias;

  public static final String SERIALIZED_NAME_JS_O_N_STRING = "JSONString";
  @SerializedName(SERIALIZED_NAME_JS_O_N_STRING)
  private String jsONString;

  public static final String SERIALIZED_NAME_CLIENT_REQUEST_TOKEN = "ClientRequestToken";
  @SerializedName(SERIALIZED_NAME_CLIENT_REQUEST_TOKEN)
  private String clientRequestToken;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map tags;

  public ImportLensInput() {
  }

  public ImportLensInput lensAlias(String lensAlias) {
    this.lensAlias = lensAlias;
    return this;
  }

  /**
   * &lt;p&gt;The alias of the lens.&lt;/p&gt; &lt;p&gt;For Amazon Web Services official lenses, this is either the lens alias, such as &lt;code&gt;serverless&lt;/code&gt;, or the lens ARN, such as &lt;code&gt;arn:aws:wellarchitected:us-east-1::lens/serverless&lt;/code&gt;. Note that some operations (such as ExportLens and CreateLensShare) are not permitted on Amazon Web Services official lenses.&lt;/p&gt; &lt;p&gt;For custom lenses, this is the lens ARN, such as &lt;code&gt;arn:aws:wellarchitected:us-west-2:123456789012:lens/0123456789abcdef01234567890abcdef&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;Each lens is identified by its &lt;a&gt;LensSummary$LensAlias&lt;/a&gt;.&lt;/p&gt;
   * @return lensAlias
   */
  @javax.annotation.Nullable
  public String getLensAlias() {
    return lensAlias;
  }

  public void setLensAlias(String lensAlias) {
    this.lensAlias = lensAlias;
  }


  public ImportLensInput jsONString(String jsONString) {
    this.jsONString = jsONString;
    return this;
  }

  /**
   * Get jsONString
   * @return jsONString
   */
  @javax.annotation.Nonnull
  public String getJsONString() {
    return jsONString;
  }

  public void setJsONString(String jsONString) {
    this.jsONString = jsONString;
  }


  public ImportLensInput clientRequestToken(String clientRequestToken) {
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


  public ImportLensInput tags(Map tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public Map getTags() {
    return tags;
  }

  public void setTags(Map tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportLensInput importLensInput = (ImportLensInput) o;
    return Objects.equals(this.lensAlias, importLensInput.lensAlias) &&
        Objects.equals(this.jsONString, importLensInput.jsONString) &&
        Objects.equals(this.clientRequestToken, importLensInput.clientRequestToken) &&
        Objects.equals(this.tags, importLensInput.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lensAlias, jsONString, clientRequestToken, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportLensInput {\n");
    sb.append("    lensAlias: ").append(toIndentedString(lensAlias)).append("\n");
    sb.append("    jsONString: ").append(toIndentedString(jsONString)).append("\n");
    sb.append("    clientRequestToken: ").append(toIndentedString(clientRequestToken)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("LensAlias");
    openapiFields.add("JSONString");
    openapiFields.add("ClientRequestToken");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("JSONString");
    openapiRequiredFields.add("ClientRequestToken");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImportLensInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImportLensInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportLensInput is not found in the empty JSON string", ImportLensInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImportLensInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportLensInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportLensInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LensAlias") != null && !jsonObj.get("LensAlias").isJsonNull()) && !jsonObj.get("LensAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LensAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LensAlias").toString()));
      }
      // validate the required field `JSONString`
      String.validateJsonElement(jsonObj.get("JSONString"));
      if (!jsonObj.get("ClientRequestToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientRequestToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientRequestToken").toString()));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportLensInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportLensInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportLensInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportLensInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportLensInput>() {
           @Override
           public void write(JsonWriter out, ImportLensInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportLensInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImportLensInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImportLensInput
   * @throws IOException if the JSON string is invalid with respect to ImportLensInput
   */
  public static ImportLensInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportLensInput.class);
  }

  /**
   * Convert an instance of ImportLensInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

