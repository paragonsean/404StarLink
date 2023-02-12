/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import org.openapitools.client.model.CertificateSummaryCertificateDetail;

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
 * Describes an Amazon Lightsail SSL/TLS certificate.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:45.376997-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CertificateSummary {
  public static final String SERIALIZED_NAME_CERTIFICATE_ARN = "certificateArn";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ARN)
  private String certificateArn;

  public static final String SERIALIZED_NAME_CERTIFICATE_NAME = "certificateName";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_NAME)
  private String certificateName;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_CERTIFICATE_DETAIL = "certificateDetail";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DETAIL)
  private CertificateSummaryCertificateDetail certificateDetail;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CertificateSummary() {
  }

  public CertificateSummary certificateArn(String certificateArn) {
    this.certificateArn = certificateArn;
    return this;
  }

  /**
   * Get certificateArn
   * @return certificateArn
   */
  @javax.annotation.Nullable
  public String getCertificateArn() {
    return certificateArn;
  }

  public void setCertificateArn(String certificateArn) {
    this.certificateArn = certificateArn;
  }


  public CertificateSummary certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

  /**
   * Get certificateName
   * @return certificateName
   */
  @javax.annotation.Nullable
  public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }


  public CertificateSummary domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nullable
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public CertificateSummary certificateDetail(CertificateSummaryCertificateDetail certificateDetail) {
    this.certificateDetail = certificateDetail;
    return this;
  }

  /**
   * Get certificateDetail
   * @return certificateDetail
   */
  @javax.annotation.Nullable
  public CertificateSummaryCertificateDetail getCertificateDetail() {
    return certificateDetail;
  }

  public void setCertificateDetail(CertificateSummaryCertificateDetail certificateDetail) {
    this.certificateDetail = certificateDetail;
  }


  public CertificateSummary tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateSummary certificateSummary = (CertificateSummary) o;
    return Objects.equals(this.certificateArn, certificateSummary.certificateArn) &&
        Objects.equals(this.certificateName, certificateSummary.certificateName) &&
        Objects.equals(this.domainName, certificateSummary.domainName) &&
        Objects.equals(this.certificateDetail, certificateSummary.certificateDetail) &&
        Objects.equals(this.tags, certificateSummary.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateArn, certificateName, domainName, certificateDetail, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateSummary {\n");
    sb.append("    certificateArn: ").append(toIndentedString(certificateArn)).append("\n");
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    certificateDetail: ").append(toIndentedString(certificateDetail)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("certificateArn");
    openapiFields.add("certificateName");
    openapiFields.add("domainName");
    openapiFields.add("certificateDetail");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CertificateSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CertificateSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateSummary is not found in the empty JSON string", CertificateSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CertificateSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `certificateArn`
      if (jsonObj.get("certificateArn") != null && !jsonObj.get("certificateArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("certificateArn"));
      }
      // validate the optional field `certificateName`
      if (jsonObj.get("certificateName") != null && !jsonObj.get("certificateName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("certificateName"));
      }
      // validate the optional field `domainName`
      if (jsonObj.get("domainName") != null && !jsonObj.get("domainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("domainName"));
      }
      // validate the optional field `certificateDetail`
      if (jsonObj.get("certificateDetail") != null && !jsonObj.get("certificateDetail").isJsonNull()) {
        CertificateSummaryCertificateDetail.validateJsonElement(jsonObj.get("certificateDetail"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateSummary>() {
           @Override
           public void write(JsonWriter out, CertificateSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CertificateSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CertificateSummary
   * @throws IOException if the JSON string is invalid with respect to CertificateSummary
   */
  public static CertificateSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateSummary.class);
  }

  /**
   * Convert an instance of CertificateSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

