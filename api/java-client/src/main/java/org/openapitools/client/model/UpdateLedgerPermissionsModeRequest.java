/*
 * Amazon QLDB
 * The control plane for Amazon QLDB
 *
 * The version of the OpenAPI document: 2019-01-02
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
 * UpdateLedgerPermissionsModeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:23.217080-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateLedgerPermissionsModeRequest {
  /**
   * &lt;p&gt;The permissions mode to assign to the ledger. This parameter can have one of the following values:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;ALLOW_ALL&lt;/code&gt;: A legacy permissions mode that enables access control with API-level granularity for ledgers.&lt;/p&gt; &lt;p&gt;This mode allows users who have the &lt;code&gt;SendCommand&lt;/code&gt; API permission for this ledger to run all PartiQL commands (hence, &lt;code&gt;ALLOW_ALL&lt;/code&gt;) on any tables in the specified ledger. This mode disregards any table-level or command-level IAM permissions policies that you create for the ledger.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;STANDARD&lt;/code&gt;: (&lt;i&gt;Recommended&lt;/i&gt;) A permissions mode that enables access control with finer granularity for ledgers, tables, and PartiQL commands.&lt;/p&gt; &lt;p&gt;By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL actions, in addition to the &lt;code&gt;SendCommand&lt;/code&gt; API permission for the ledger. For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html\&quot;&gt;Getting started with the standard permissions mode&lt;/a&gt; in the &lt;i&gt;Amazon QLDB Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;We strongly recommend using the &lt;code&gt;STANDARD&lt;/code&gt; permissions mode to maximize the security of your ledger data.&lt;/p&gt; &lt;/note&gt;
   */
  @JsonAdapter(PermissionsModeEnum.Adapter.class)
  public enum PermissionsModeEnum {
    ALLOW_ALL("ALLOW_ALL"),
    
    STANDARD("STANDARD");

    private String value;

    PermissionsModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsModeEnum fromValue(String value) {
      for (PermissionsModeEnum b : PermissionsModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PermissionsModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionsModeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PermissionsModeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PERMISSIONS_MODE = "PermissionsMode";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS_MODE)
  private PermissionsModeEnum permissionsMode;

  public UpdateLedgerPermissionsModeRequest() {
  }

  public UpdateLedgerPermissionsModeRequest permissionsMode(PermissionsModeEnum permissionsMode) {
    this.permissionsMode = permissionsMode;
    return this;
  }

  /**
   * &lt;p&gt;The permissions mode to assign to the ledger. This parameter can have one of the following values:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;ALLOW_ALL&lt;/code&gt;: A legacy permissions mode that enables access control with API-level granularity for ledgers.&lt;/p&gt; &lt;p&gt;This mode allows users who have the &lt;code&gt;SendCommand&lt;/code&gt; API permission for this ledger to run all PartiQL commands (hence, &lt;code&gt;ALLOW_ALL&lt;/code&gt;) on any tables in the specified ledger. This mode disregards any table-level or command-level IAM permissions policies that you create for the ledger.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;STANDARD&lt;/code&gt;: (&lt;i&gt;Recommended&lt;/i&gt;) A permissions mode that enables access control with finer granularity for ledgers, tables, and PartiQL commands.&lt;/p&gt; &lt;p&gt;By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL actions, in addition to the &lt;code&gt;SendCommand&lt;/code&gt; API permission for the ledger. For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html\&quot;&gt;Getting started with the standard permissions mode&lt;/a&gt; in the &lt;i&gt;Amazon QLDB Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;We strongly recommend using the &lt;code&gt;STANDARD&lt;/code&gt; permissions mode to maximize the security of your ledger data.&lt;/p&gt; &lt;/note&gt;
   * @return permissionsMode
   */
  @javax.annotation.Nonnull
  public PermissionsModeEnum getPermissionsMode() {
    return permissionsMode;
  }

  public void setPermissionsMode(PermissionsModeEnum permissionsMode) {
    this.permissionsMode = permissionsMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLedgerPermissionsModeRequest updateLedgerPermissionsModeRequest = (UpdateLedgerPermissionsModeRequest) o;
    return Objects.equals(this.permissionsMode, updateLedgerPermissionsModeRequest.permissionsMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionsMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLedgerPermissionsModeRequest {\n");
    sb.append("    permissionsMode: ").append(toIndentedString(permissionsMode)).append("\n");
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
    openapiFields.add("PermissionsMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PermissionsMode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateLedgerPermissionsModeRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateLedgerPermissionsModeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateLedgerPermissionsModeRequest is not found in the empty JSON string", UpdateLedgerPermissionsModeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateLedgerPermissionsModeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateLedgerPermissionsModeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateLedgerPermissionsModeRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("PermissionsMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PermissionsMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PermissionsMode").toString()));
      }
      // validate the required field `PermissionsMode`
      PermissionsModeEnum.validateJsonElement(jsonObj.get("PermissionsMode"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLedgerPermissionsModeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLedgerPermissionsModeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLedgerPermissionsModeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLedgerPermissionsModeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLedgerPermissionsModeRequest>() {
           @Override
           public void write(JsonWriter out, UpdateLedgerPermissionsModeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateLedgerPermissionsModeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateLedgerPermissionsModeRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateLedgerPermissionsModeRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateLedgerPermissionsModeRequest
   */
  public static UpdateLedgerPermissionsModeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLedgerPermissionsModeRequest.class);
  }

  /**
   * Convert an instance of UpdateLedgerPermissionsModeRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

