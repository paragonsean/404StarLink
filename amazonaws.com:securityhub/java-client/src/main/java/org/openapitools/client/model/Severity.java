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
import org.openapitools.client.model.SeverityLabel;

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
 * &lt;p&gt;The severity of the finding.&lt;/p&gt; &lt;p&gt;The finding provider can provide the initial severity. The finding provider can only update the severity if it hasn&#39;t been updated using &lt;code&gt;BatchUpdateFindings&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;The finding must have either &lt;code&gt;Label&lt;/code&gt; or &lt;code&gt;Normalized&lt;/code&gt; populated. If only one of these attributes is populated, then Security Hub automatically populates the other one. If neither attribute is populated, then the finding is invalid. &lt;code&gt;Label&lt;/code&gt; is the preferred attribute.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Severity {
  public static final String SERIALIZED_NAME_PRODUCT = "Product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private Double product;

  public static final String SERIALIZED_NAME_LABEL = "Label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private SeverityLabel label;

  public static final String SERIALIZED_NAME_NORMALIZED = "Normalized";
  @SerializedName(SERIALIZED_NAME_NORMALIZED)
  private Integer normalized;

  public static final String SERIALIZED_NAME_ORIGINAL = "Original";
  @SerializedName(SERIALIZED_NAME_ORIGINAL)
  private String original;

  public Severity() {
  }

  public Severity product(Double product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
   */
  @javax.annotation.Nullable
  public Double getProduct() {
    return product;
  }

  public void setProduct(Double product) {
    this.product = product;
  }


  public Severity label(SeverityLabel label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public SeverityLabel getLabel() {
    return label;
  }

  public void setLabel(SeverityLabel label) {
    this.label = label;
  }


  public Severity normalized(Integer normalized) {
    this.normalized = normalized;
    return this;
  }

  /**
   * Get normalized
   * @return normalized
   */
  @javax.annotation.Nullable
  public Integer getNormalized() {
    return normalized;
  }

  public void setNormalized(Integer normalized) {
    this.normalized = normalized;
  }


  public Severity original(String original) {
    this.original = original;
    return this;
  }

  /**
   * Get original
   * @return original
   */
  @javax.annotation.Nullable
  public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Severity severity = (Severity) o;
    return Objects.equals(this.product, severity.product) &&
        Objects.equals(this.label, severity.label) &&
        Objects.equals(this.normalized, severity.normalized) &&
        Objects.equals(this.original, severity.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, label, normalized, original);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Severity {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    normalized: ").append(toIndentedString(normalized)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
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
    openapiFields.add("Product");
    openapiFields.add("Label");
    openapiFields.add("Normalized");
    openapiFields.add("Original");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Severity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Severity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Severity is not found in the empty JSON string", Severity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Severity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Severity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Product`
      if (jsonObj.get("Product") != null && !jsonObj.get("Product").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("Product"));
      }
      // validate the optional field `Label`
      if (jsonObj.get("Label") != null && !jsonObj.get("Label").isJsonNull()) {
        SeverityLabel.validateJsonElement(jsonObj.get("Label"));
      }
      // validate the optional field `Normalized`
      if (jsonObj.get("Normalized") != null && !jsonObj.get("Normalized").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Normalized"));
      }
      // validate the optional field `Original`
      if (jsonObj.get("Original") != null && !jsonObj.get("Original").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Original"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Severity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Severity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Severity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Severity.class));

       return (TypeAdapter<T>) new TypeAdapter<Severity>() {
           @Override
           public void write(JsonWriter out, Severity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Severity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Severity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Severity
   * @throws IOException if the JSON string is invalid with respect to Severity
   */
  public static Severity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Severity.class);
  }

  /**
   * Convert an instance of Severity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

