/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
import org.openapitools.client.model.CreateInsightRequestFilters;

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
 * Contains information about a Security Hub insight.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Insight {
  public static final String SERIALIZED_NAME_INSIGHT_ARN = "InsightArn";
  @SerializedName(SERIALIZED_NAME_INSIGHT_ARN)
  private String insightArn;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private CreateInsightRequestFilters filters;

  public static final String SERIALIZED_NAME_GROUP_BY_ATTRIBUTE = "GroupByAttribute";
  @SerializedName(SERIALIZED_NAME_GROUP_BY_ATTRIBUTE)
  private String groupByAttribute;

  public Insight() {
  }

  public Insight insightArn(String insightArn) {
    this.insightArn = insightArn;
    return this;
  }

  /**
   * Get insightArn
   * @return insightArn
   */
  @javax.annotation.Nonnull
  public String getInsightArn() {
    return insightArn;
  }

  public void setInsightArn(String insightArn) {
    this.insightArn = insightArn;
  }


  public Insight name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Insight filters(CreateInsightRequestFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @javax.annotation.Nonnull
  public CreateInsightRequestFilters getFilters() {
    return filters;
  }

  public void setFilters(CreateInsightRequestFilters filters) {
    this.filters = filters;
  }


  public Insight groupByAttribute(String groupByAttribute) {
    this.groupByAttribute = groupByAttribute;
    return this;
  }

  /**
   * Get groupByAttribute
   * @return groupByAttribute
   */
  @javax.annotation.Nonnull
  public String getGroupByAttribute() {
    return groupByAttribute;
  }

  public void setGroupByAttribute(String groupByAttribute) {
    this.groupByAttribute = groupByAttribute;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Insight insight = (Insight) o;
    return Objects.equals(this.insightArn, insight.insightArn) &&
        Objects.equals(this.name, insight.name) &&
        Objects.equals(this.filters, insight.filters) &&
        Objects.equals(this.groupByAttribute, insight.groupByAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insightArn, name, filters, groupByAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insight {\n");
    sb.append("    insightArn: ").append(toIndentedString(insightArn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    groupByAttribute: ").append(toIndentedString(groupByAttribute)).append("\n");
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
    openapiFields.add("InsightArn");
    openapiFields.add("Name");
    openapiFields.add("Filters");
    openapiFields.add("GroupByAttribute");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("InsightArn");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Filters");
    openapiRequiredFields.add("GroupByAttribute");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Insight
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Insight.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Insight is not found in the empty JSON string", Insight.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Insight.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Insight` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Insight.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `InsightArn`
      String.validateJsonElement(jsonObj.get("InsightArn"));
      // validate the required field `Name`
      String.validateJsonElement(jsonObj.get("Name"));
      // validate the required field `Filters`
      CreateInsightRequestFilters.validateJsonElement(jsonObj.get("Filters"));
      // validate the required field `GroupByAttribute`
      String.validateJsonElement(jsonObj.get("GroupByAttribute"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Insight.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Insight' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Insight> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Insight.class));

       return (TypeAdapter<T>) new TypeAdapter<Insight>() {
           @Override
           public void write(JsonWriter out, Insight value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Insight read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Insight given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Insight
   * @throws IOException if the JSON string is invalid with respect to Insight
   */
  public static Insight fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Insight.class);
  }

  /**
   * Convert an instance of Insight to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

