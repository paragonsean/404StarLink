/*
 * Google Vault API
 * Retention and eDiscovery for Google Workspace. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege. For example, to download an export, an account needs the **Manage Exports** privilege and the matter shared with them. 
 *
 * The version of the OpenAPI document: v1
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
import org.openapitools.client.model.CorpusQuery;
import org.openapitools.client.model.HeldAccount;
import org.openapitools.client.model.HeldOrgUnit;

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
 * A hold. A hold prevents the specified Google Workspace service from purging data for specific accounts or all members of an organizational unit. To work with Vault resources, the account must have the [required Vault privileges] (https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:41.496021-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Hold {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<HeldAccount> accounts = new ArrayList<>();

  /**
   * The service to be searched.
   */
  @JsonAdapter(CorpusEnum.Adapter.class)
  public enum CorpusEnum {
    CORPUS_TYPE_UNSPECIFIED("CORPUS_TYPE_UNSPECIFIED"),
    
    DRIVE("DRIVE"),
    
    MAIL("MAIL"),
    
    GROUPS("GROUPS"),
    
    HANGOUTS_CHAT("HANGOUTS_CHAT"),
    
    VOICE("VOICE");

    private String value;

    CorpusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CorpusEnum fromValue(String value) {
      for (CorpusEnum b : CorpusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CorpusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CorpusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CorpusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CorpusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CorpusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CORPUS = "corpus";
  @SerializedName(SERIALIZED_NAME_CORPUS)
  private CorpusEnum corpus;

  public static final String SERIALIZED_NAME_HOLD_ID = "holdId";
  @SerializedName(SERIALIZED_NAME_HOLD_ID)
  private String holdId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORG_UNIT = "orgUnit";
  @SerializedName(SERIALIZED_NAME_ORG_UNIT)
  private HeldOrgUnit orgUnit;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private CorpusQuery query;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public Hold() {
  }

  public Hold accounts(List<HeldAccount> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Hold addAccountsItem(HeldAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * If set, the hold applies to the specified accounts and **orgUnit** must be empty.
   * @return accounts
   */
  @javax.annotation.Nullable
  public List<HeldAccount> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<HeldAccount> accounts) {
    this.accounts = accounts;
  }


  public Hold corpus(CorpusEnum corpus) {
    this.corpus = corpus;
    return this;
  }

  /**
   * The service to be searched.
   * @return corpus
   */
  @javax.annotation.Nullable
  public CorpusEnum getCorpus() {
    return corpus;
  }

  public void setCorpus(CorpusEnum corpus) {
    this.corpus = corpus;
  }


  public Hold holdId(String holdId) {
    this.holdId = holdId;
    return this;
  }

  /**
   * The unique immutable ID of the hold. Assigned during creation.
   * @return holdId
   */
  @javax.annotation.Nullable
  public String getHoldId() {
    return holdId;
  }

  public void setHoldId(String holdId) {
    this.holdId = holdId;
  }


  public Hold name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the hold.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Hold orgUnit(HeldOrgUnit orgUnit) {
    this.orgUnit = orgUnit;
    return this;
  }

  /**
   * Get orgUnit
   * @return orgUnit
   */
  @javax.annotation.Nullable
  public HeldOrgUnit getOrgUnit() {
    return orgUnit;
  }

  public void setOrgUnit(HeldOrgUnit orgUnit) {
    this.orgUnit = orgUnit;
  }


  public Hold query(CorpusQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @javax.annotation.Nullable
  public CorpusQuery getQuery() {
    return query;
  }

  public void setQuery(CorpusQuery query) {
    this.query = query;
  }


  public Hold updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The last time this hold was modified.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hold hold = (Hold) o;
    return Objects.equals(this.accounts, hold.accounts) &&
        Objects.equals(this.corpus, hold.corpus) &&
        Objects.equals(this.holdId, hold.holdId) &&
        Objects.equals(this.name, hold.name) &&
        Objects.equals(this.orgUnit, hold.orgUnit) &&
        Objects.equals(this.query, hold.query) &&
        Objects.equals(this.updateTime, hold.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, corpus, holdId, name, orgUnit, query, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hold {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    corpus: ").append(toIndentedString(corpus)).append("\n");
    sb.append("    holdId: ").append(toIndentedString(holdId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgUnit: ").append(toIndentedString(orgUnit)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("accounts");
    openapiFields.add("corpus");
    openapiFields.add("holdId");
    openapiFields.add("name");
    openapiFields.add("orgUnit");
    openapiFields.add("query");
    openapiFields.add("updateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Hold
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Hold.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Hold is not found in the empty JSON string", Hold.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Hold.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Hold` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("accounts") != null && !jsonObj.get("accounts").isJsonNull()) {
        JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
        if (jsonArrayaccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
          }

          // validate the optional field `accounts` (array)
          for (int i = 0; i < jsonArrayaccounts.size(); i++) {
            HeldAccount.validateJsonElement(jsonArrayaccounts.get(i));
          };
        }
      }
      if ((jsonObj.get("corpus") != null && !jsonObj.get("corpus").isJsonNull()) && !jsonObj.get("corpus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `corpus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("corpus").toString()));
      }
      // validate the optional field `corpus`
      if (jsonObj.get("corpus") != null && !jsonObj.get("corpus").isJsonNull()) {
        CorpusEnum.validateJsonElement(jsonObj.get("corpus"));
      }
      if ((jsonObj.get("holdId") != null && !jsonObj.get("holdId").isJsonNull()) && !jsonObj.get("holdId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holdId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holdId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `orgUnit`
      if (jsonObj.get("orgUnit") != null && !jsonObj.get("orgUnit").isJsonNull()) {
        HeldOrgUnit.validateJsonElement(jsonObj.get("orgUnit"));
      }
      // validate the optional field `query`
      if (jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) {
        CorpusQuery.validateJsonElement(jsonObj.get("query"));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Hold.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Hold' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Hold> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Hold.class));

       return (TypeAdapter<T>) new TypeAdapter<Hold>() {
           @Override
           public void write(JsonWriter out, Hold value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Hold read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Hold given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Hold
   * @throws IOException if the JSON string is invalid with respect to Hold
   */
  public static Hold fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Hold.class);
  }

  /**
   * Convert an instance of Hold to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

