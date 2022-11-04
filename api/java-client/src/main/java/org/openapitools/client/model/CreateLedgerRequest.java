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
 * CreateLedgerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:48.114688-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateLedgerRequest {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  /**
   * &lt;p&gt;The permissions mode to assign to the ledger that you want to create. This parameter can have one of the following values:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;ALLOW_ALL&lt;/code&gt;: A legacy permissions mode that enables access control with API-level granularity for ledgers.&lt;/p&gt; &lt;p&gt;This mode allows users who have the &lt;code&gt;SendCommand&lt;/code&gt; API permission for this ledger to run all PartiQL commands (hence, &lt;code&gt;ALLOW_ALL&lt;/code&gt;) on any tables in the specified ledger. This mode disregards any table-level or command-level IAM permissions policies that you create for the ledger.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;STANDARD&lt;/code&gt;: (&lt;i&gt;Recommended&lt;/i&gt;) A permissions mode that enables access control with finer granularity for ledgers, tables, and PartiQL commands.&lt;/p&gt; &lt;p&gt;By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL actions, in addition to the &lt;code&gt;SendCommand&lt;/code&gt; API permission for the ledger. For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html\&quot;&gt;Getting started with the standard permissions mode&lt;/a&gt; in the &lt;i&gt;Amazon QLDB Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;We strongly recommend using the &lt;code&gt;STANDARD&lt;/code&gt; permissions mode to maximize the security of your ledger data.&lt;/p&gt; &lt;/note&gt;
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

  public static final String SERIALIZED_NAME_DELETION_PROTECTION = "DeletionProtection";
  @SerializedName(SERIALIZED_NAME_DELETION_PROTECTION)
  private Boolean deletionProtection;

  public static final String SERIALIZED_NAME_KMS_KEY = "KmsKey";
  @SerializedName(SERIALIZED_NAME_KMS_KEY)
  private String kmsKey;

  public CreateLedgerRequest() {
  }

  public CreateLedgerRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * &lt;p&gt;The name of the ledger that you want to create. The name must be unique among all of the ledgers in your Amazon Web Services account in the current Region.&lt;/p&gt; &lt;p&gt;Naming constraints for ledger names are defined in &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming\&quot;&gt;Quotas in Amazon QLDB&lt;/a&gt; in the &lt;i&gt;Amazon QLDB Developer Guide&lt;/i&gt;.&lt;/p&gt;
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateLedgerRequest tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateLedgerRequest putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag values are case sensitive and can be null.
   * @return tags
   */
  @javax.annotation.Nullable
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public CreateLedgerRequest permissionsMode(PermissionsModeEnum permissionsMode) {
    this.permissionsMode = permissionsMode;
    return this;
  }

  /**
   * &lt;p&gt;The permissions mode to assign to the ledger that you want to create. This parameter can have one of the following values:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;ALLOW_ALL&lt;/code&gt;: A legacy permissions mode that enables access control with API-level granularity for ledgers.&lt;/p&gt; &lt;p&gt;This mode allows users who have the &lt;code&gt;SendCommand&lt;/code&gt; API permission for this ledger to run all PartiQL commands (hence, &lt;code&gt;ALLOW_ALL&lt;/code&gt;) on any tables in the specified ledger. This mode disregards any table-level or command-level IAM permissions policies that you create for the ledger.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;STANDARD&lt;/code&gt;: (&lt;i&gt;Recommended&lt;/i&gt;) A permissions mode that enables access control with finer granularity for ledgers, tables, and PartiQL commands.&lt;/p&gt; &lt;p&gt;By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL actions, in addition to the &lt;code&gt;SendCommand&lt;/code&gt; API permission for the ledger. For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html\&quot;&gt;Getting started with the standard permissions mode&lt;/a&gt; in the &lt;i&gt;Amazon QLDB Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;We strongly recommend using the &lt;code&gt;STANDARD&lt;/code&gt; permissions mode to maximize the security of your ledger data.&lt;/p&gt; &lt;/note&gt;
   * @return permissionsMode
   */
  @javax.annotation.Nonnull
  public PermissionsModeEnum getPermissionsMode() {
    return permissionsMode;
  }

  public void setPermissionsMode(PermissionsModeEnum permissionsMode) {
    this.permissionsMode = permissionsMode;
  }


  public CreateLedgerRequest deletionProtection(Boolean deletionProtection) {
    this.deletionProtection = deletionProtection;
    return this;
  }

  /**
   * &lt;p&gt;The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature is enabled (&lt;code&gt;true&lt;/code&gt;) by default.&lt;/p&gt; &lt;p&gt;If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it by calling the &lt;code&gt;UpdateLedger&lt;/code&gt; operation to set the flag to &lt;code&gt;false&lt;/code&gt;.&lt;/p&gt;
   * @return deletionProtection
   */
  @javax.annotation.Nullable
  public Boolean getDeletionProtection() {
    return deletionProtection;
  }

  public void setDeletionProtection(Boolean deletionProtection) {
    this.deletionProtection = deletionProtection;
  }


  public CreateLedgerRequest kmsKey(String kmsKey) {
    this.kmsKey = kmsKey;
    return this;
  }

  /**
   * &lt;p&gt;The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html\&quot;&gt;Encryption at rest&lt;/a&gt; in the &lt;i&gt;Amazon QLDB Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;Use one of the following options to specify this parameter:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;AWS_OWNED_KMS_KEY&lt;/code&gt;: Use an KMS key that is owned and managed by Amazon Web Services on your behalf.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Undefined&lt;/b&gt;: By default, use an Amazon Web Services owned KMS key.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A valid symmetric customer managed KMS key&lt;/b&gt;: Use the specified KMS key in your account that you create, own, and manage.&lt;/p&gt; &lt;p&gt;Amazon QLDB does not support asymmetric keys. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html\&quot;&gt;Using symmetric and asymmetric keys&lt;/a&gt; in the &lt;i&gt;Key Management Service Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with &lt;code&gt;\&quot;alias/\&quot;&lt;/code&gt;. To specify a key in a different Amazon Web Services account, you must use the key ARN or alias ARN.&lt;/p&gt; &lt;p&gt;For example:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Key ID: &lt;code&gt;1234abcd-12ab-34cd-56ef-1234567890ab&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Key ARN: &lt;code&gt;arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Alias name: &lt;code&gt;alias/ExampleAlias&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Alias ARN: &lt;code&gt;arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id\&quot;&gt;Key identifiers (KeyId)&lt;/a&gt; in the &lt;i&gt;Key Management Service Developer Guide&lt;/i&gt;.&lt;/p&gt;
   * @return kmsKey
   */
  @javax.annotation.Nullable
  public String getKmsKey() {
    return kmsKey;
  }

  public void setKmsKey(String kmsKey) {
    this.kmsKey = kmsKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLedgerRequest createLedgerRequest = (CreateLedgerRequest) o;
    return Objects.equals(this.name, createLedgerRequest.name) &&
        Objects.equals(this.tags, createLedgerRequest.tags) &&
        Objects.equals(this.permissionsMode, createLedgerRequest.permissionsMode) &&
        Objects.equals(this.deletionProtection, createLedgerRequest.deletionProtection) &&
        Objects.equals(this.kmsKey, createLedgerRequest.kmsKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tags, permissionsMode, deletionProtection, kmsKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLedgerRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    permissionsMode: ").append(toIndentedString(permissionsMode)).append("\n");
    sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
    sb.append("    kmsKey: ").append(toIndentedString(kmsKey)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Tags");
    openapiFields.add("PermissionsMode");
    openapiFields.add("DeletionProtection");
    openapiFields.add("KmsKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("PermissionsMode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateLedgerRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateLedgerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLedgerRequest is not found in the empty JSON string", CreateLedgerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateLedgerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLedgerRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateLedgerRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (!jsonObj.get("PermissionsMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PermissionsMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PermissionsMode").toString()));
      }
      // validate the required field `PermissionsMode`
      PermissionsModeEnum.validateJsonElement(jsonObj.get("PermissionsMode"));
      if ((jsonObj.get("KmsKey") != null && !jsonObj.get("KmsKey").isJsonNull()) && !jsonObj.get("KmsKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KmsKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KmsKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLedgerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLedgerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLedgerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLedgerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLedgerRequest>() {
           @Override
           public void write(JsonWriter out, CreateLedgerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLedgerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateLedgerRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateLedgerRequest
   * @throws IOException if the JSON string is invalid with respect to CreateLedgerRequest
   */
  public static CreateLedgerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLedgerRequest.class);
  }

  /**
   * Convert an instance of CreateLedgerRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

