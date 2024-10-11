/*
 * Cloud Billing API
 * Allows developers to manage billing for their Google Cloud Platform projects programmatically.
 *
 * The version of the OpenAPI document: v1beta
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
import org.openapitools.client.model.CreditEstimate;
import org.openapitools.client.model.Money;

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
 * An estimated cost.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:37.545354-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CostEstimate {
  public static final String SERIALIZED_NAME_CREDIT_ESTIMATES = "creditEstimates";
  @SerializedName(SERIALIZED_NAME_CREDIT_ESTIMATES)
  private List<CreditEstimate> creditEstimates = new ArrayList<>();

  public static final String SERIALIZED_NAME_NET_COST_ESTIMATE = "netCostEstimate";
  @SerializedName(SERIALIZED_NAME_NET_COST_ESTIMATE)
  private Money netCostEstimate;

  public static final String SERIALIZED_NAME_PRE_CREDIT_COST_ESTIMATE = "preCreditCostEstimate";
  @SerializedName(SERIALIZED_NAME_PRE_CREDIT_COST_ESTIMATE)
  private Money preCreditCostEstimate;

  public CostEstimate() {
  }

  public CostEstimate creditEstimates(List<CreditEstimate> creditEstimates) {
    this.creditEstimates = creditEstimates;
    return this;
  }

  public CostEstimate addCreditEstimatesItem(CreditEstimate creditEstimatesItem) {
    if (this.creditEstimates == null) {
      this.creditEstimates = new ArrayList<>();
    }
    this.creditEstimates.add(creditEstimatesItem);
    return this;
  }

  /**
   * The estimated credits applied.
   * @return creditEstimates
   */
  @javax.annotation.Nullable
  public List<CreditEstimate> getCreditEstimates() {
    return creditEstimates;
  }

  public void setCreditEstimates(List<CreditEstimate> creditEstimates) {
    this.creditEstimates = creditEstimates;
  }


  public CostEstimate netCostEstimate(Money netCostEstimate) {
    this.netCostEstimate = netCostEstimate;
    return this;
  }

  /**
   * Get netCostEstimate
   * @return netCostEstimate
   */
  @javax.annotation.Nullable
  public Money getNetCostEstimate() {
    return netCostEstimate;
  }

  public void setNetCostEstimate(Money netCostEstimate) {
    this.netCostEstimate = netCostEstimate;
  }


  public CostEstimate preCreditCostEstimate(Money preCreditCostEstimate) {
    this.preCreditCostEstimate = preCreditCostEstimate;
    return this;
  }

  /**
   * Get preCreditCostEstimate
   * @return preCreditCostEstimate
   */
  @javax.annotation.Nullable
  public Money getPreCreditCostEstimate() {
    return preCreditCostEstimate;
  }

  public void setPreCreditCostEstimate(Money preCreditCostEstimate) {
    this.preCreditCostEstimate = preCreditCostEstimate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostEstimate costEstimate = (CostEstimate) o;
    return Objects.equals(this.creditEstimates, costEstimate.creditEstimates) &&
        Objects.equals(this.netCostEstimate, costEstimate.netCostEstimate) &&
        Objects.equals(this.preCreditCostEstimate, costEstimate.preCreditCostEstimate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditEstimates, netCostEstimate, preCreditCostEstimate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostEstimate {\n");
    sb.append("    creditEstimates: ").append(toIndentedString(creditEstimates)).append("\n");
    sb.append("    netCostEstimate: ").append(toIndentedString(netCostEstimate)).append("\n");
    sb.append("    preCreditCostEstimate: ").append(toIndentedString(preCreditCostEstimate)).append("\n");
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
    openapiFields.add("creditEstimates");
    openapiFields.add("netCostEstimate");
    openapiFields.add("preCreditCostEstimate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CostEstimate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CostEstimate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CostEstimate is not found in the empty JSON string", CostEstimate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CostEstimate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CostEstimate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("creditEstimates") != null && !jsonObj.get("creditEstimates").isJsonNull()) {
        JsonArray jsonArraycreditEstimates = jsonObj.getAsJsonArray("creditEstimates");
        if (jsonArraycreditEstimates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("creditEstimates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `creditEstimates` to be an array in the JSON string but got `%s`", jsonObj.get("creditEstimates").toString()));
          }

          // validate the optional field `creditEstimates` (array)
          for (int i = 0; i < jsonArraycreditEstimates.size(); i++) {
            CreditEstimate.validateJsonElement(jsonArraycreditEstimates.get(i));
          };
        }
      }
      // validate the optional field `netCostEstimate`
      if (jsonObj.get("netCostEstimate") != null && !jsonObj.get("netCostEstimate").isJsonNull()) {
        Money.validateJsonElement(jsonObj.get("netCostEstimate"));
      }
      // validate the optional field `preCreditCostEstimate`
      if (jsonObj.get("preCreditCostEstimate") != null && !jsonObj.get("preCreditCostEstimate").isJsonNull()) {
        Money.validateJsonElement(jsonObj.get("preCreditCostEstimate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CostEstimate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CostEstimate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CostEstimate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CostEstimate.class));

       return (TypeAdapter<T>) new TypeAdapter<CostEstimate>() {
           @Override
           public void write(JsonWriter out, CostEstimate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CostEstimate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CostEstimate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CostEstimate
   * @throws IOException if the JSON string is invalid with respect to CostEstimate
   */
  public static CostEstimate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CostEstimate.class);
  }

  /**
   * Convert an instance of CostEstimate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

