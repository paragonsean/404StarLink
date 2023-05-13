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
import org.openapitools.client.model.RecommendationDataRdsEngine;

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
 * RecommendationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RecommendationData {
  public static final String SERIALIZED_NAME_RDS_ENGINE = "RdsEngine";
  @SerializedName(SERIALIZED_NAME_RDS_ENGINE)
  private RecommendationDataRdsEngine rdsEngine;

  public RecommendationData() {
  }

  public RecommendationData rdsEngine(RecommendationDataRdsEngine rdsEngine) {
    this.rdsEngine = rdsEngine;
    return this;
  }

  /**
   * Get rdsEngine
   * @return rdsEngine
   */
  @javax.annotation.Nullable
  public RecommendationDataRdsEngine getRdsEngine() {
    return rdsEngine;
  }

  public void setRdsEngine(RecommendationDataRdsEngine rdsEngine) {
    this.rdsEngine = rdsEngine;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationData recommendationData = (RecommendationData) o;
    return Objects.equals(this.rdsEngine, recommendationData.rdsEngine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rdsEngine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationData {\n");
    sb.append("    rdsEngine: ").append(toIndentedString(rdsEngine)).append("\n");
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
    openapiFields.add("RdsEngine");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecommendationData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecommendationData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecommendationData is not found in the empty JSON string", RecommendationData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecommendationData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecommendationData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `RdsEngine`
      if (jsonObj.get("RdsEngine") != null && !jsonObj.get("RdsEngine").isJsonNull()) {
        RecommendationDataRdsEngine.validateJsonElement(jsonObj.get("RdsEngine"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommendationData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommendationData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommendationData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommendationData.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommendationData>() {
           @Override
           public void write(JsonWriter out, RecommendationData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecommendationData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecommendationData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecommendationData
   * @throws IOException if the JSON string is invalid with respect to RecommendationData
   */
  public static RecommendationData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommendationData.class);
  }

  /**
   * Convert an instance of RecommendationData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

