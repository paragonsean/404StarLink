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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.LensStatus;

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
 * A lens review summary of a workload.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:51.532398-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LensReviewSummary {
  public static final String SERIALIZED_NAME_LENS_ALIAS = "LensAlias";
  @SerializedName(SERIALIZED_NAME_LENS_ALIAS)
  private String lensAlias;

  public static final String SERIALIZED_NAME_LENS_ARN = "LensArn";
  @SerializedName(SERIALIZED_NAME_LENS_ARN)
  private String lensArn;

  public static final String SERIALIZED_NAME_LENS_VERSION = "LensVersion";
  @SerializedName(SERIALIZED_NAME_LENS_VERSION)
  private String lensVersion;

  public static final String SERIALIZED_NAME_LENS_NAME = "LensName";
  @SerializedName(SERIALIZED_NAME_LENS_NAME)
  private String lensName;

  public static final String SERIALIZED_NAME_LENS_STATUS = "LensStatus";
  @SerializedName(SERIALIZED_NAME_LENS_STATUS)
  private LensStatus lensStatus;

  public static final String SERIALIZED_NAME_UPDATED_AT = "UpdatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_RISK_COUNTS = "RiskCounts";
  @SerializedName(SERIALIZED_NAME_RISK_COUNTS)
  private Map<String, Integer> riskCounts = new HashMap<>();

  public LensReviewSummary() {
  }

  public LensReviewSummary lensAlias(String lensAlias) {
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


  public LensReviewSummary lensArn(String lensArn) {
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


  public LensReviewSummary lensVersion(String lensVersion) {
    this.lensVersion = lensVersion;
    return this;
  }

  /**
   * Get lensVersion
   * @return lensVersion
   */
  @javax.annotation.Nullable
  public String getLensVersion() {
    return lensVersion;
  }

  public void setLensVersion(String lensVersion) {
    this.lensVersion = lensVersion;
  }


  public LensReviewSummary lensName(String lensName) {
    this.lensName = lensName;
    return this;
  }

  /**
   * The full name of the lens.
   * @return lensName
   */
  @javax.annotation.Nullable
  public String getLensName() {
    return lensName;
  }

  public void setLensName(String lensName) {
    this.lensName = lensName;
  }


  public LensReviewSummary lensStatus(LensStatus lensStatus) {
    this.lensStatus = lensStatus;
    return this;
  }

  /**
   * Get lensStatus
   * @return lensStatus
   */
  @javax.annotation.Nullable
  public LensStatus getLensStatus() {
    return lensStatus;
  }

  public void setLensStatus(LensStatus lensStatus) {
    this.lensStatus = lensStatus;
  }


  public LensReviewSummary updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date and time recorded.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public LensReviewSummary riskCounts(Map<String, Integer> riskCounts) {
    this.riskCounts = riskCounts;
    return this;
  }

  public LensReviewSummary putRiskCountsItem(String key, Integer riskCountsItem) {
    if (this.riskCounts == null) {
      this.riskCounts = new HashMap<>();
    }
    this.riskCounts.put(key, riskCountsItem);
    return this;
  }

  /**
   * A map from risk names to the count of how many questions have that rating.
   * @return riskCounts
   */
  @javax.annotation.Nullable
  public Map<String, Integer> getRiskCounts() {
    return riskCounts;
  }

  public void setRiskCounts(Map<String, Integer> riskCounts) {
    this.riskCounts = riskCounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LensReviewSummary lensReviewSummary = (LensReviewSummary) o;
    return Objects.equals(this.lensAlias, lensReviewSummary.lensAlias) &&
        Objects.equals(this.lensArn, lensReviewSummary.lensArn) &&
        Objects.equals(this.lensVersion, lensReviewSummary.lensVersion) &&
        Objects.equals(this.lensName, lensReviewSummary.lensName) &&
        Objects.equals(this.lensStatus, lensReviewSummary.lensStatus) &&
        Objects.equals(this.updatedAt, lensReviewSummary.updatedAt) &&
        Objects.equals(this.riskCounts, lensReviewSummary.riskCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lensAlias, lensArn, lensVersion, lensName, lensStatus, updatedAt, riskCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LensReviewSummary {\n");
    sb.append("    lensAlias: ").append(toIndentedString(lensAlias)).append("\n");
    sb.append("    lensArn: ").append(toIndentedString(lensArn)).append("\n");
    sb.append("    lensVersion: ").append(toIndentedString(lensVersion)).append("\n");
    sb.append("    lensName: ").append(toIndentedString(lensName)).append("\n");
    sb.append("    lensStatus: ").append(toIndentedString(lensStatus)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    riskCounts: ").append(toIndentedString(riskCounts)).append("\n");
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
    openapiFields.add("LensAlias");
    openapiFields.add("LensArn");
    openapiFields.add("LensVersion");
    openapiFields.add("LensName");
    openapiFields.add("LensStatus");
    openapiFields.add("UpdatedAt");
    openapiFields.add("RiskCounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LensReviewSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LensReviewSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LensReviewSummary is not found in the empty JSON string", LensReviewSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LensReviewSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LensReviewSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LensAlias") != null && !jsonObj.get("LensAlias").isJsonNull()) && !jsonObj.get("LensAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LensAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LensAlias").toString()));
      }
      // validate the optional field `LensArn`
      if (jsonObj.get("LensArn") != null && !jsonObj.get("LensArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LensArn"));
      }
      // validate the optional field `LensVersion`
      if (jsonObj.get("LensVersion") != null && !jsonObj.get("LensVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LensVersion"));
      }
      if ((jsonObj.get("LensName") != null && !jsonObj.get("LensName").isJsonNull()) && !jsonObj.get("LensName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LensName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LensName").toString()));
      }
      // validate the optional field `LensStatus`
      if (jsonObj.get("LensStatus") != null && !jsonObj.get("LensStatus").isJsonNull()) {
        LensStatus.validateJsonElement(jsonObj.get("LensStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LensReviewSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LensReviewSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LensReviewSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LensReviewSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<LensReviewSummary>() {
           @Override
           public void write(JsonWriter out, LensReviewSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LensReviewSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LensReviewSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LensReviewSummary
   * @throws IOException if the JSON string is invalid with respect to LensReviewSummary
   */
  public static LensReviewSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LensReviewSummary.class);
  }

  /**
   * Convert an instance of LensReviewSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

