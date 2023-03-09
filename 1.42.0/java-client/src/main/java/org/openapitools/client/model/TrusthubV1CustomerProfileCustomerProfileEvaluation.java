/*
 * Twilio - Trusthub
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.42.0
 * Contact: support@twilio.com
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
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CustomerProfileEvaluationEnumStatus;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * TrusthubV1CustomerProfileCustomerProfileEvaluation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:00.928096-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TrusthubV1CustomerProfileCustomerProfileEvaluation {
  public static final String SERIALIZED_NAME_ACCOUNT_SID = "account_sid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_CUSTOMER_PROFILE_SID = "customer_profile_sid";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PROFILE_SID)
  private String customerProfileSid;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_POLICY_SID = "policy_sid";
  @SerializedName(SERIALIZED_NAME_POLICY_SID)
  private String policySid;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<Object> results;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CustomerProfileEvaluationEnumStatus status;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public TrusthubV1CustomerProfileCustomerProfileEvaluation() {
  }

  public TrusthubV1CustomerProfileCustomerProfileEvaluation accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the customer_profile resource.
   * @return accountSid
   */
  @javax.annotation.Nullable
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public TrusthubV1CustomerProfileCustomerProfileEvaluation customerProfileSid(String customerProfileSid) {
    this.customerProfileSid = customerProfileSid;
    return this;
  }

  /**
   * The unique string that we created to identify the customer_profile resource.
   * @return customerProfileSid
   */
  @javax.annotation.Nullable
  public String getCustomerProfileSid() {
    return customerProfileSid;
  }

  public void setCustomerProfileSid(String customerProfileSid) {
    this.customerProfileSid = customerProfileSid;
  }


  public TrusthubV1CustomerProfileCustomerProfileEvaluation dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TrusthubV1CustomerProfileCustomerProfileEvaluation policySid(String policySid) {
    this.policySid = policySid;
    return this;
  }

  /**
   * The unique string of a policy that is associated to the customer_profile resource.
   * @return policySid
   */
  @javax.annotation.Nullable
  public String getPolicySid() {
    return policySid;
  }

  public void setPolicySid(String policySid) {
    this.policySid = policySid;
  }


  public TrusthubV1CustomerProfileCustomerProfileEvaluation results(List<Object> results) {
    this.results = results;
    return this;
  }

  public TrusthubV1CustomerProfileCustomerProfileEvaluation addResultsItem(Object resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The results of the Evaluation which includes the valid and invalid attributes.
   * @return results
   */
  @javax.annotation.Nullable
  public List<Object> getResults() {
    return results;
  }

  public void setResults(List<Object> results) {
    this.results = results;
  }


  public TrusthubV1CustomerProfileCustomerProfileEvaluation sid(String sid) {
    this.sid = sid;
    return this;
  }

  /**
   * The unique string that identifies the Evaluation resource.
   * @return sid
   */
  @javax.annotation.Nullable
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }


  public TrusthubV1CustomerProfileCustomerProfileEvaluation status(CustomerProfileEvaluationEnumStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public CustomerProfileEvaluationEnumStatus getStatus() {
    return status;
  }

  public void setStatus(CustomerProfileEvaluationEnumStatus status) {
    this.status = status;
  }


  public TrusthubV1CustomerProfileCustomerProfileEvaluation url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrusthubV1CustomerProfileCustomerProfileEvaluation trusthubV1CustomerProfileCustomerProfileEvaluation = (TrusthubV1CustomerProfileCustomerProfileEvaluation) o;
    return Objects.equals(this.accountSid, trusthubV1CustomerProfileCustomerProfileEvaluation.accountSid) &&
        Objects.equals(this.customerProfileSid, trusthubV1CustomerProfileCustomerProfileEvaluation.customerProfileSid) &&
        Objects.equals(this.dateCreated, trusthubV1CustomerProfileCustomerProfileEvaluation.dateCreated) &&
        Objects.equals(this.policySid, trusthubV1CustomerProfileCustomerProfileEvaluation.policySid) &&
        Objects.equals(this.results, trusthubV1CustomerProfileCustomerProfileEvaluation.results) &&
        Objects.equals(this.sid, trusthubV1CustomerProfileCustomerProfileEvaluation.sid) &&
        Objects.equals(this.status, trusthubV1CustomerProfileCustomerProfileEvaluation.status) &&
        Objects.equals(this.url, trusthubV1CustomerProfileCustomerProfileEvaluation.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, customerProfileSid, dateCreated, policySid, results, sid, status, url);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrusthubV1CustomerProfileCustomerProfileEvaluation {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    customerProfileSid: ").append(toIndentedString(customerProfileSid)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    policySid: ").append(toIndentedString(policySid)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("account_sid");
    openapiFields.add("customer_profile_sid");
    openapiFields.add("date_created");
    openapiFields.add("policy_sid");
    openapiFields.add("results");
    openapiFields.add("sid");
    openapiFields.add("status");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrusthubV1CustomerProfileCustomerProfileEvaluation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrusthubV1CustomerProfileCustomerProfileEvaluation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrusthubV1CustomerProfileCustomerProfileEvaluation is not found in the empty JSON string", TrusthubV1CustomerProfileCustomerProfileEvaluation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrusthubV1CustomerProfileCustomerProfileEvaluation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrusthubV1CustomerProfileCustomerProfileEvaluation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_sid") != null && !jsonObj.get("account_sid").isJsonNull()) && !jsonObj.get("account_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_sid").toString()));
      }
      if ((jsonObj.get("customer_profile_sid") != null && !jsonObj.get("customer_profile_sid").isJsonNull()) && !jsonObj.get("customer_profile_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_profile_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_profile_sid").toString()));
      }
      if ((jsonObj.get("policy_sid") != null && !jsonObj.get("policy_sid").isJsonNull()) && !jsonObj.get("policy_sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_sid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull() && !jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }
      if ((jsonObj.get("sid") != null && !jsonObj.get("sid").isJsonNull()) && !jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        CustomerProfileEvaluationEnumStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrusthubV1CustomerProfileCustomerProfileEvaluation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrusthubV1CustomerProfileCustomerProfileEvaluation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrusthubV1CustomerProfileCustomerProfileEvaluation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrusthubV1CustomerProfileCustomerProfileEvaluation.class));

       return (TypeAdapter<T>) new TypeAdapter<TrusthubV1CustomerProfileCustomerProfileEvaluation>() {
           @Override
           public void write(JsonWriter out, TrusthubV1CustomerProfileCustomerProfileEvaluation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrusthubV1CustomerProfileCustomerProfileEvaluation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TrusthubV1CustomerProfileCustomerProfileEvaluation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TrusthubV1CustomerProfileCustomerProfileEvaluation
   * @throws IOException if the JSON string is invalid with respect to TrusthubV1CustomerProfileCustomerProfileEvaluation
   */
  public static TrusthubV1CustomerProfileCustomerProfileEvaluation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrusthubV1CustomerProfileCustomerProfileEvaluation.class);
  }

  /**
   * Convert an instance of TrusthubV1CustomerProfileCustomerProfileEvaluation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

