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
 * Lens upgrade summary return object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:47.577947-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LensUpgradeSummary {
  public static final String SERIALIZED_NAME_WORKLOAD_ID = "WorkloadId";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_ID)
  private String workloadId;

  public static final String SERIALIZED_NAME_WORKLOAD_NAME = "WorkloadName";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_NAME)
  private String workloadName;

  public static final String SERIALIZED_NAME_LENS_ALIAS = "LensAlias";
  @SerializedName(SERIALIZED_NAME_LENS_ALIAS)
  private String lensAlias;

  public static final String SERIALIZED_NAME_LENS_ARN = "LensArn";
  @SerializedName(SERIALIZED_NAME_LENS_ARN)
  private String lensArn;

  public static final String SERIALIZED_NAME_CURRENT_LENS_VERSION = "CurrentLensVersion";
  @SerializedName(SERIALIZED_NAME_CURRENT_LENS_VERSION)
  private String currentLensVersion;

  public static final String SERIALIZED_NAME_LATEST_LENS_VERSION = "LatestLensVersion";
  @SerializedName(SERIALIZED_NAME_LATEST_LENS_VERSION)
  private String latestLensVersion;

  public LensUpgradeSummary() {
  }

  public LensUpgradeSummary workloadId(String workloadId) {
    this.workloadId = workloadId;
    return this;
  }

  /**
   * The ID assigned to the workload. This ID is unique within an Amazon Web Services Region.
   * @return workloadId
   */
  @javax.annotation.Nullable
  public String getWorkloadId() {
    return workloadId;
  }

  public void setWorkloadId(String workloadId) {
    this.workloadId = workloadId;
  }


  public LensUpgradeSummary workloadName(String workloadName) {
    this.workloadName = workloadName;
    return this;
  }

  /**
   * &lt;p&gt;The name of the workload.&lt;/p&gt; &lt;p&gt;The name must be unique within an account within an Amazon Web Services Region. Spaces and capitalization are ignored when checking for uniqueness.&lt;/p&gt;
   * @return workloadName
   */
  @javax.annotation.Nullable
  public String getWorkloadName() {
    return workloadName;
  }

  public void setWorkloadName(String workloadName) {
    this.workloadName = workloadName;
  }


  public LensUpgradeSummary lensAlias(String lensAlias) {
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


  public LensUpgradeSummary lensArn(String lensArn) {
    this.lensArn = lensArn;
    return this;
  }

  /**
   * Get lensArn
   * @return lensArn
   */
  @javax.annotation.Nullable
  public String getLensArn() {
    return lensArn;
  }

  public void setLensArn(String lensArn) {
    this.lensArn = lensArn;
  }


  public LensUpgradeSummary currentLensVersion(String currentLensVersion) {
    this.currentLensVersion = currentLensVersion;
    return this;
  }

  /**
   * Get currentLensVersion
   * @return currentLensVersion
   */
  @javax.annotation.Nullable
  public String getCurrentLensVersion() {
    return currentLensVersion;
  }

  public void setCurrentLensVersion(String currentLensVersion) {
    this.currentLensVersion = currentLensVersion;
  }


  public LensUpgradeSummary latestLensVersion(String latestLensVersion) {
    this.latestLensVersion = latestLensVersion;
    return this;
  }

  /**
   * Get latestLensVersion
   * @return latestLensVersion
   */
  @javax.annotation.Nullable
  public String getLatestLensVersion() {
    return latestLensVersion;
  }

  public void setLatestLensVersion(String latestLensVersion) {
    this.latestLensVersion = latestLensVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LensUpgradeSummary lensUpgradeSummary = (LensUpgradeSummary) o;
    return Objects.equals(this.workloadId, lensUpgradeSummary.workloadId) &&
        Objects.equals(this.workloadName, lensUpgradeSummary.workloadName) &&
        Objects.equals(this.lensAlias, lensUpgradeSummary.lensAlias) &&
        Objects.equals(this.lensArn, lensUpgradeSummary.lensArn) &&
        Objects.equals(this.currentLensVersion, lensUpgradeSummary.currentLensVersion) &&
        Objects.equals(this.latestLensVersion, lensUpgradeSummary.latestLensVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadId, workloadName, lensAlias, lensArn, currentLensVersion, latestLensVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LensUpgradeSummary {\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
    sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
    sb.append("    lensAlias: ").append(toIndentedString(lensAlias)).append("\n");
    sb.append("    lensArn: ").append(toIndentedString(lensArn)).append("\n");
    sb.append("    currentLensVersion: ").append(toIndentedString(currentLensVersion)).append("\n");
    sb.append("    latestLensVersion: ").append(toIndentedString(latestLensVersion)).append("\n");
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
    openapiFields.add("WorkloadId");
    openapiFields.add("WorkloadName");
    openapiFields.add("LensAlias");
    openapiFields.add("LensArn");
    openapiFields.add("CurrentLensVersion");
    openapiFields.add("LatestLensVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LensUpgradeSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LensUpgradeSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LensUpgradeSummary is not found in the empty JSON string", LensUpgradeSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LensUpgradeSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LensUpgradeSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("WorkloadId") != null && !jsonObj.get("WorkloadId").isJsonNull()) && !jsonObj.get("WorkloadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkloadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkloadId").toString()));
      }
      if ((jsonObj.get("WorkloadName") != null && !jsonObj.get("WorkloadName").isJsonNull()) && !jsonObj.get("WorkloadName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkloadName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkloadName").toString()));
      }
      if ((jsonObj.get("LensAlias") != null && !jsonObj.get("LensAlias").isJsonNull()) && !jsonObj.get("LensAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LensAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LensAlias").toString()));
      }
      // validate the optional field `LensArn`
      if (jsonObj.get("LensArn") != null && !jsonObj.get("LensArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LensArn"));
      }
      // validate the optional field `CurrentLensVersion`
      if (jsonObj.get("CurrentLensVersion") != null && !jsonObj.get("CurrentLensVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CurrentLensVersion"));
      }
      // validate the optional field `LatestLensVersion`
      if (jsonObj.get("LatestLensVersion") != null && !jsonObj.get("LatestLensVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LatestLensVersion"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LensUpgradeSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LensUpgradeSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LensUpgradeSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LensUpgradeSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<LensUpgradeSummary>() {
           @Override
           public void write(JsonWriter out, LensUpgradeSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LensUpgradeSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LensUpgradeSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LensUpgradeSummary
   * @throws IOException if the JSON string is invalid with respect to LensUpgradeSummary
   */
  public static LensUpgradeSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LensUpgradeSummary.class);
  }

  /**
   * Convert an instance of LensUpgradeSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

