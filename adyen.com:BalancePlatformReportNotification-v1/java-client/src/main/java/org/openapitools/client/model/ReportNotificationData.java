/*
 * Report webhooks
 * Adyen sends notifications through webhooks to inform your system that reports were generated and are ready to be downloaded.  You can download reports programmatically by making an HTTP GET request, or manually from your [Balance Platform Customer Area](https://balanceplatform-test.adyen.com/balanceplatform).
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
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
import org.openapitools.client.model.ResourceReference;

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
 * ReportNotificationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:06:21.743015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReportNotificationData {
  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER = "accountHolder";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER)
  private ResourceReference accountHolder;

  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT = "balanceAccount";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT)
  private ResourceReference balanceAccount;

  public static final String SERIALIZED_NAME_BALANCE_PLATFORM = "balancePlatform";
  @SerializedName(SERIALIZED_NAME_BALANCE_PLATFORM)
  private String balancePlatform;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "downloadUrl";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_REPORT_TYPE = "reportType";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private String reportType;

  public ReportNotificationData() {
  }

  public ReportNotificationData accountHolder(ResourceReference accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

  /**
   * The account holder related to the report.
   * @return accountHolder
   */
  @javax.annotation.Nullable
  public ResourceReference getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(ResourceReference accountHolder) {
    this.accountHolder = accountHolder;
  }


  public ReportNotificationData balanceAccount(ResourceReference balanceAccount) {
    this.balanceAccount = balanceAccount;
    return this;
  }

  /**
   * The balance account related to the report.
   * @return balanceAccount
   */
  @javax.annotation.Nullable
  public ResourceReference getBalanceAccount() {
    return balanceAccount;
  }

  public void setBalanceAccount(ResourceReference balanceAccount) {
    this.balanceAccount = balanceAccount;
  }


  public ReportNotificationData balancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
    return this;
  }

  /**
   * The unique identifier of the balance platform.
   * @return balancePlatform
   */
  @javax.annotation.Nullable
  public String getBalancePlatform() {
    return balancePlatform;
  }

  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }


  public ReportNotificationData creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
   * @return creationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public ReportNotificationData downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * The URL at which you can download the report. To download, you must authenticate your GET request with your [API credentials](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/overview).
   * @return downloadUrl
   */
  @javax.annotation.Nonnull
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public ReportNotificationData fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The filename of the report.
   * @return fileName
   */
  @javax.annotation.Nonnull
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public ReportNotificationData reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Type of report.
   * @return reportType
   */
  @javax.annotation.Nonnull
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportNotificationData reportNotificationData = (ReportNotificationData) o;
    return Objects.equals(this.accountHolder, reportNotificationData.accountHolder) &&
        Objects.equals(this.balanceAccount, reportNotificationData.balanceAccount) &&
        Objects.equals(this.balancePlatform, reportNotificationData.balancePlatform) &&
        Objects.equals(this.creationDate, reportNotificationData.creationDate) &&
        Objects.equals(this.downloadUrl, reportNotificationData.downloadUrl) &&
        Objects.equals(this.fileName, reportNotificationData.fileName) &&
        Objects.equals(this.reportType, reportNotificationData.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, balanceAccount, balancePlatform, creationDate, downloadUrl, fileName, reportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportNotificationData {\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    balanceAccount: ").append(toIndentedString(balanceAccount)).append("\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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
    openapiFields.add("accountHolder");
    openapiFields.add("balanceAccount");
    openapiFields.add("balancePlatform");
    openapiFields.add("creationDate");
    openapiFields.add("downloadUrl");
    openapiFields.add("fileName");
    openapiFields.add("reportType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("downloadUrl");
    openapiRequiredFields.add("fileName");
    openapiRequiredFields.add("reportType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReportNotificationData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportNotificationData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportNotificationData is not found in the empty JSON string", ReportNotificationData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportNotificationData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportNotificationData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportNotificationData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `accountHolder`
      if (jsonObj.get("accountHolder") != null && !jsonObj.get("accountHolder").isJsonNull()) {
        ResourceReference.validateJsonElement(jsonObj.get("accountHolder"));
      }
      // validate the optional field `balanceAccount`
      if (jsonObj.get("balanceAccount") != null && !jsonObj.get("balanceAccount").isJsonNull()) {
        ResourceReference.validateJsonElement(jsonObj.get("balanceAccount"));
      }
      if ((jsonObj.get("balancePlatform") != null && !jsonObj.get("balancePlatform").isJsonNull()) && !jsonObj.get("balancePlatform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balancePlatform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balancePlatform").toString()));
      }
      if (!jsonObj.get("downloadUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `downloadUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("downloadUrl").toString()));
      }
      if (!jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (!jsonObj.get("reportType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportNotificationData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportNotificationData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportNotificationData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportNotificationData.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportNotificationData>() {
           @Override
           public void write(JsonWriter out, ReportNotificationData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportNotificationData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReportNotificationData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportNotificationData
   * @throws IOException if the JSON string is invalid with respect to ReportNotificationData
   */
  public static ReportNotificationData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportNotificationData.class);
  }

  /**
   * Convert an instance of ReportNotificationData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

