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
 * CustomDataIdentifiersDetectionsOccurrences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CustomDataIdentifiersDetectionsOccurrences {
  public static final String SERIALIZED_NAME_LINE_RANGES = "LineRanges";
  @SerializedName(SERIALIZED_NAME_LINE_RANGES)
  private List lineRanges;

  public static final String SERIALIZED_NAME_OFFSET_RANGES = "OffsetRanges";
  @SerializedName(SERIALIZED_NAME_OFFSET_RANGES)
  private List offsetRanges;

  public static final String SERIALIZED_NAME_PAGES = "Pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private List pages;

  public static final String SERIALIZED_NAME_RECORDS = "Records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List records;

  public static final String SERIALIZED_NAME_CELLS = "Cells";
  @SerializedName(SERIALIZED_NAME_CELLS)
  private List cells;

  public CustomDataIdentifiersDetectionsOccurrences() {
  }

  public CustomDataIdentifiersDetectionsOccurrences lineRanges(List lineRanges) {
    this.lineRanges = lineRanges;
    return this;
  }

  /**
   * Get lineRanges
   * @return lineRanges
   */
  @javax.annotation.Nullable
  public List getLineRanges() {
    return lineRanges;
  }

  public void setLineRanges(List lineRanges) {
    this.lineRanges = lineRanges;
  }


  public CustomDataIdentifiersDetectionsOccurrences offsetRanges(List offsetRanges) {
    this.offsetRanges = offsetRanges;
    return this;
  }

  /**
   * Get offsetRanges
   * @return offsetRanges
   */
  @javax.annotation.Nullable
  public List getOffsetRanges() {
    return offsetRanges;
  }

  public void setOffsetRanges(List offsetRanges) {
    this.offsetRanges = offsetRanges;
  }


  public CustomDataIdentifiersDetectionsOccurrences pages(List pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
   */
  @javax.annotation.Nullable
  public List getPages() {
    return pages;
  }

  public void setPages(List pages) {
    this.pages = pages;
  }


  public CustomDataIdentifiersDetectionsOccurrences records(List records) {
    this.records = records;
    return this;
  }

  /**
   * Get records
   * @return records
   */
  @javax.annotation.Nullable
  public List getRecords() {
    return records;
  }

  public void setRecords(List records) {
    this.records = records;
  }


  public CustomDataIdentifiersDetectionsOccurrences cells(List cells) {
    this.cells = cells;
    return this;
  }

  /**
   * Get cells
   * @return cells
   */
  @javax.annotation.Nullable
  public List getCells() {
    return cells;
  }

  public void setCells(List cells) {
    this.cells = cells;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDataIdentifiersDetectionsOccurrences customDataIdentifiersDetectionsOccurrences = (CustomDataIdentifiersDetectionsOccurrences) o;
    return Objects.equals(this.lineRanges, customDataIdentifiersDetectionsOccurrences.lineRanges) &&
        Objects.equals(this.offsetRanges, customDataIdentifiersDetectionsOccurrences.offsetRanges) &&
        Objects.equals(this.pages, customDataIdentifiersDetectionsOccurrences.pages) &&
        Objects.equals(this.records, customDataIdentifiersDetectionsOccurrences.records) &&
        Objects.equals(this.cells, customDataIdentifiersDetectionsOccurrences.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRanges, offsetRanges, pages, records, cells);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDataIdentifiersDetectionsOccurrences {\n");
    sb.append("    lineRanges: ").append(toIndentedString(lineRanges)).append("\n");
    sb.append("    offsetRanges: ").append(toIndentedString(offsetRanges)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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
    openapiFields.add("LineRanges");
    openapiFields.add("OffsetRanges");
    openapiFields.add("Pages");
    openapiFields.add("Records");
    openapiFields.add("Cells");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomDataIdentifiersDetectionsOccurrences
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomDataIdentifiersDetectionsOccurrences.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomDataIdentifiersDetectionsOccurrences is not found in the empty JSON string", CustomDataIdentifiersDetectionsOccurrences.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomDataIdentifiersDetectionsOccurrences.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomDataIdentifiersDetectionsOccurrences` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LineRanges`
      if (jsonObj.get("LineRanges") != null && !jsonObj.get("LineRanges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("LineRanges"));
      }
      // validate the optional field `OffsetRanges`
      if (jsonObj.get("OffsetRanges") != null && !jsonObj.get("OffsetRanges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("OffsetRanges"));
      }
      // validate the optional field `Pages`
      if (jsonObj.get("Pages") != null && !jsonObj.get("Pages").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Pages"));
      }
      // validate the optional field `Records`
      if (jsonObj.get("Records") != null && !jsonObj.get("Records").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Records"));
      }
      // validate the optional field `Cells`
      if (jsonObj.get("Cells") != null && !jsonObj.get("Cells").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Cells"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomDataIdentifiersDetectionsOccurrences.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomDataIdentifiersDetectionsOccurrences' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomDataIdentifiersDetectionsOccurrences> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomDataIdentifiersDetectionsOccurrences.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomDataIdentifiersDetectionsOccurrences>() {
           @Override
           public void write(JsonWriter out, CustomDataIdentifiersDetectionsOccurrences value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomDataIdentifiersDetectionsOccurrences read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomDataIdentifiersDetectionsOccurrences given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomDataIdentifiersDetectionsOccurrences
   * @throws IOException if the JSON string is invalid with respect to CustomDataIdentifiersDetectionsOccurrences
   */
  public static CustomDataIdentifiersDetectionsOccurrences fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomDataIdentifiersDetectionsOccurrences.class);
  }

  /**
   * Convert an instance of CustomDataIdentifiersDetectionsOccurrences to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

