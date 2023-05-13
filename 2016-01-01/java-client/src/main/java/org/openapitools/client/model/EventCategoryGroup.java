/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
import java.util.List;

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
 * Lists categories of events subscribed to, and generated by, the applicable DMS resource type. This data type appears in response to the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/dms/latest/APIReference/API_EventCategoryGroup.html\&quot;&gt; &lt;code&gt;DescribeEventCategories&lt;/code&gt; &lt;/a&gt; action.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EventCategoryGroup {
  public static final String SERIALIZED_NAME_SOURCE_TYPE = "SourceType";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_EVENT_CATEGORIES = "EventCategories";
  @SerializedName(SERIALIZED_NAME_EVENT_CATEGORIES)
  private List eventCategories;

  public EventCategoryGroup() {
  }

  public EventCategoryGroup sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   */
  @javax.annotation.Nullable
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public EventCategoryGroup eventCategories(List eventCategories) {
    this.eventCategories = eventCategories;
    return this;
  }

  /**
   * Get eventCategories
   * @return eventCategories
   */
  @javax.annotation.Nullable
  public List getEventCategories() {
    return eventCategories;
  }

  public void setEventCategories(List eventCategories) {
    this.eventCategories = eventCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCategoryGroup eventCategoryGroup = (EventCategoryGroup) o;
    return Objects.equals(this.sourceType, eventCategoryGroup.sourceType) &&
        Objects.equals(this.eventCategories, eventCategoryGroup.eventCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, eventCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCategoryGroup {\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    eventCategories: ").append(toIndentedString(eventCategories)).append("\n");
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
    openapiFields.add("SourceType");
    openapiFields.add("EventCategories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventCategoryGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCategoryGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCategoryGroup is not found in the empty JSON string", EventCategoryGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCategoryGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCategoryGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `SourceType`
      if (jsonObj.get("SourceType") != null && !jsonObj.get("SourceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceType"));
      }
      // validate the optional field `EventCategories`
      if (jsonObj.get("EventCategories") != null && !jsonObj.get("EventCategories").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("EventCategories"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCategoryGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCategoryGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCategoryGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCategoryGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCategoryGroup>() {
           @Override
           public void write(JsonWriter out, EventCategoryGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCategoryGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventCategoryGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventCategoryGroup
   * @throws IOException if the JSON string is invalid with respect to EventCategoryGroup
   */
  public static EventCategoryGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCategoryGroup.class);
  }

  /**
   * Convert an instance of EventCategoryGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

