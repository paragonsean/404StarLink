/*
 * Configuration API
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v1/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v1`.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Amount;
import org.openapitools.client.model.TransactionRuleInterval;

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
 * TransactionRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:10.044537-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TransactionRuleInfo {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_BALANCE_PLATFORM_ID = "balancePlatformId";
  @SerializedName(SERIALIZED_NAME_BALANCE_PLATFORM_ID)
  private String balancePlatformId;

  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<String> countries = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  /**
   * Gets or Sets entryModes
   */
  @JsonAdapter(EntryModesEnum.Adapter.class)
  public enum EntryModesEnum {
    BARCODE("barcode"),
    
    CHIP("chip"),
    
    COF("cof"),
    
    CONTACTLESS("contactless"),
    
    MAGSTRIPE("magstripe"),
    
    MANUAL("manual"),
    
    OCR("ocr"),
    
    SERVER("server"),
    
    UNKNOWN("unknown");

    private String value;

    EntryModesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntryModesEnum fromValue(String value) {
      for (EntryModesEnum b : EntryModesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntryModesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntryModesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntryModesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntryModesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EntryModesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENTRY_MODES = "entryModes";
  @SerializedName(SERIALIZED_NAME_ENTRY_MODES)
  private List<EntryModesEnum> entryModes = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TransactionRuleInterval interval;

  public static final String SERIALIZED_NAME_MAX_TRANSACTIONS = "maxTransactions";
  @SerializedName(SERIALIZED_NAME_MAX_TRANSACTIONS)
  private Integer maxTransactions;

  public static final String SERIALIZED_NAME_MCCS = "mccs";
  @SerializedName(SERIALIZED_NAME_MCCS)
  private List<String> mccs = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_GROUP_ID = "paymentInstrumentGroupId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_GROUP_ID)
  private String paymentInstrumentGroupId;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  /**
   * Gets or Sets processingTypes
   */
  @JsonAdapter(ProcessingTypesEnum.Adapter.class)
  public enum ProcessingTypesEnum {
    ATM_WITHDRAW("atmWithdraw"),
    
    BALANCE_INQUIRY("balanceInquiry"),
    
    ECOMMERCE("ecommerce"),
    
    MOTO("moto"),
    
    POS("pos"),
    
    RECURRING("recurring"),
    
    TOKEN("token"),
    
    UNKNOWN("unknown");

    private String value;

    ProcessingTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProcessingTypesEnum fromValue(String value) {
      for (ProcessingTypesEnum b : ProcessingTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProcessingTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProcessingTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProcessingTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProcessingTypesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProcessingTypesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROCESSING_TYPES = "processingTypes";
  @SerializedName(SERIALIZED_NAME_PROCESSING_TYPES)
  private List<ProcessingTypesEnum> processingTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  /**
   * The status of the transaction rule. If you provide a &#x60;startDate&#x60; in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * Type of conditions provided in the rule.  Possible values:   * **allowList**: The rule provides categories (such as country and MCC) where payments must be allowed.  * **blockList**: The rule provides categories (such as country and MCC) where payments must be blocked.  * **maxUsage**: The rule sets limits for the maximum amount or maximum number of transactions for the lifetime of the payment instrument.  * **velocity**: The rule sets limits for the maximum amount or maximum number of transactions for a given time interval. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ALLOW_LIST("allowList"),
    
    BLOCK_LIST("blockList"),
    
    MAX_USAGE("maxUsage"),
    
    VELOCITY("velocity");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public TransactionRuleInfo() {
  }

  public TransactionRuleInfo amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public TransactionRuleInfo balancePlatformId(String balancePlatformId) {
    this.balancePlatformId = balancePlatformId;
    return this;
  }

  /**
   * The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/get/balancePlatforms/{id}__queryParam_id) to which the rule applies.
   * @return balancePlatformId
   */
  @javax.annotation.Nullable
  public String getBalancePlatformId() {
    return balancePlatformId;
  }

  public void setBalancePlatformId(String balancePlatformId) {
    this.balancePlatformId = balancePlatformId;
  }


  public TransactionRuleInfo countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public TransactionRuleInfo addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * List of countries to which the rule applies. For example: **[\&quot;NL\&quot;,\&quot;US\&quot;]**.
   * @return countries
   */
  @javax.annotation.Nullable
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  public TransactionRuleInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Your description for the transaction rule, maximum 300 characters.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionRuleInfo endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**.
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public TransactionRuleInfo entryModes(List<EntryModesEnum> entryModes) {
    this.entryModes = entryModes;
    return this;
  }

  public TransactionRuleInfo addEntryModesItem(EntryModesEnum entryModesItem) {
    if (this.entryModes == null) {
      this.entryModes = new ArrayList<>();
    }
    this.entryModes.add(entryModesItem);
    return this;
  }

  /**
   * List of point-of-sale entry modes to which the rule applies.  Possible values: **manual**, **chip**, **magstripe**, **contactless**, **cof**, **token**, **server**, **barcode**, **ocr**.
   * @return entryModes
   */
  @javax.annotation.Nullable
  public List<EntryModesEnum> getEntryModes() {
    return entryModes;
  }

  public void setEntryModes(List<EntryModesEnum> entryModes) {
    this.entryModes = entryModes;
  }


  public TransactionRuleInfo interval(TransactionRuleInterval interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @javax.annotation.Nonnull
  public TransactionRuleInterval getInterval() {
    return interval;
  }

  public void setInterval(TransactionRuleInterval interval) {
    this.interval = interval;
  }


  public TransactionRuleInfo maxTransactions(Integer maxTransactions) {
    this.maxTransactions = maxTransactions;
    return this;
  }

  /**
   * The maximum number of transactions that a payment instrument can be used for in the period specified in the &#x60;interval.type&#x60;.
   * @return maxTransactions
   */
  @javax.annotation.Nullable
  public Integer getMaxTransactions() {
    return maxTransactions;
  }

  public void setMaxTransactions(Integer maxTransactions) {
    this.maxTransactions = maxTransactions;
  }


  public TransactionRuleInfo mccs(List<String> mccs) {
    this.mccs = mccs;
    return this;
  }

  public TransactionRuleInfo addMccsItem(String mccsItem) {
    if (this.mccs == null) {
      this.mccs = new ArrayList<>();
    }
    this.mccs.add(mccsItem);
    return this;
  }

  /**
   * List of Merchant Category Codes (MCCs) to which the rule applies.
   * @return mccs
   */
  @javax.annotation.Nullable
  public List<String> getMccs() {
    return mccs;
  }

  public void setMccs(List<String> mccs) {
    this.mccs = mccs;
  }


  public TransactionRuleInfo paymentInstrumentGroupId(String paymentInstrumentGroupId) {
    this.paymentInstrumentGroupId = paymentInstrumentGroupId;
    return this;
  }

  /**
   * The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstrumentGroups__resParam_id) to which the rule applies.
   * @return paymentInstrumentGroupId
   */
  @javax.annotation.Nullable
  public String getPaymentInstrumentGroupId() {
    return paymentInstrumentGroupId;
  }

  public void setPaymentInstrumentGroupId(String paymentInstrumentGroupId) {
    this.paymentInstrumentGroupId = paymentInstrumentGroupId;
  }


  public TransactionRuleInfo paymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

  /**
   * The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstruments__resParam_id) to which the rule applies.
   * @return paymentInstrumentId
   */
  @javax.annotation.Nullable
  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }

  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public TransactionRuleInfo processingTypes(List<ProcessingTypesEnum> processingTypes) {
    this.processingTypes = processingTypes;
    return this;
  }

  public TransactionRuleInfo addProcessingTypesItem(ProcessingTypesEnum processingTypesItem) {
    if (this.processingTypes == null) {
      this.processingTypes = new ArrayList<>();
    }
    this.processingTypes.add(processingTypesItem);
    return this;
  }

  /**
   * List of processing types to which the rule applies.  Possible values: **atmWithdraw**, **pos**, **ecommerce**, **moto**, **recurring**, **balanceInquiry**.
   * @return processingTypes
   */
  @javax.annotation.Nullable
  public List<ProcessingTypesEnum> getProcessingTypes() {
    return processingTypes;
  }

  public void setProcessingTypes(List<ProcessingTypesEnum> processingTypes) {
    this.processingTypes = processingTypes;
  }


  public TransactionRuleInfo reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the transaction rule, maximum 150 characters.
   * @return reference
   */
  @javax.annotation.Nonnull
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  public TransactionRuleInfo startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the &#x60;startDate&#x60; is set to the date when the rule status is set to **active**.   
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public TransactionRuleInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the transaction rule. If you provide a &#x60;startDate&#x60; in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TransactionRuleInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of conditions provided in the rule.  Possible values:   * **allowList**: The rule provides categories (such as country and MCC) where payments must be allowed.  * **blockList**: The rule provides categories (such as country and MCC) where payments must be blocked.  * **maxUsage**: The rule sets limits for the maximum amount or maximum number of transactions for the lifetime of the payment instrument.  * **velocity**: The rule sets limits for the maximum amount or maximum number of transactions for a given time interval. 
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRuleInfo transactionRuleInfo = (TransactionRuleInfo) o;
    return Objects.equals(this.amount, transactionRuleInfo.amount) &&
        Objects.equals(this.balancePlatformId, transactionRuleInfo.balancePlatformId) &&
        Objects.equals(this.countries, transactionRuleInfo.countries) &&
        Objects.equals(this.description, transactionRuleInfo.description) &&
        Objects.equals(this.endDate, transactionRuleInfo.endDate) &&
        Objects.equals(this.entryModes, transactionRuleInfo.entryModes) &&
        Objects.equals(this.interval, transactionRuleInfo.interval) &&
        Objects.equals(this.maxTransactions, transactionRuleInfo.maxTransactions) &&
        Objects.equals(this.mccs, transactionRuleInfo.mccs) &&
        Objects.equals(this.paymentInstrumentGroupId, transactionRuleInfo.paymentInstrumentGroupId) &&
        Objects.equals(this.paymentInstrumentId, transactionRuleInfo.paymentInstrumentId) &&
        Objects.equals(this.processingTypes, transactionRuleInfo.processingTypes) &&
        Objects.equals(this.reference, transactionRuleInfo.reference) &&
        Objects.equals(this.startDate, transactionRuleInfo.startDate) &&
        Objects.equals(this.status, transactionRuleInfo.status) &&
        Objects.equals(this.type, transactionRuleInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, balancePlatformId, countries, description, endDate, entryModes, interval, maxTransactions, mccs, paymentInstrumentGroupId, paymentInstrumentId, processingTypes, reference, startDate, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRuleInfo {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balancePlatformId: ").append(toIndentedString(balancePlatformId)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    entryModes: ").append(toIndentedString(entryModes)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    maxTransactions: ").append(toIndentedString(maxTransactions)).append("\n");
    sb.append("    mccs: ").append(toIndentedString(mccs)).append("\n");
    sb.append("    paymentInstrumentGroupId: ").append(toIndentedString(paymentInstrumentGroupId)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    processingTypes: ").append(toIndentedString(processingTypes)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("balancePlatformId");
    openapiFields.add("countries");
    openapiFields.add("description");
    openapiFields.add("endDate");
    openapiFields.add("entryModes");
    openapiFields.add("interval");
    openapiFields.add("maxTransactions");
    openapiFields.add("mccs");
    openapiFields.add("paymentInstrumentGroupId");
    openapiFields.add("paymentInstrumentId");
    openapiFields.add("processingTypes");
    openapiFields.add("reference");
    openapiFields.add("startDate");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("interval");
    openapiRequiredFields.add("reference");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransactionRuleInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionRuleInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRuleInfo is not found in the empty JSON string", TransactionRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionRuleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionRuleInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionRuleInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        Amount.validateJsonElement(jsonObj.get("amount"));
      }
      if ((jsonObj.get("balancePlatformId") != null && !jsonObj.get("balancePlatformId").isJsonNull()) && !jsonObj.get("balancePlatformId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balancePlatformId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balancePlatformId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("countries") != null && !jsonObj.get("countries").isJsonNull() && !jsonObj.get("countries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countries` to be an array in the JSON string but got `%s`", jsonObj.get("countries").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("entryModes") != null && !jsonObj.get("entryModes").isJsonNull() && !jsonObj.get("entryModes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entryModes` to be an array in the JSON string but got `%s`", jsonObj.get("entryModes").toString()));
      }
      // validate the required field `interval`
      TransactionRuleInterval.validateJsonElement(jsonObj.get("interval"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("mccs") != null && !jsonObj.get("mccs").isJsonNull() && !jsonObj.get("mccs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mccs` to be an array in the JSON string but got `%s`", jsonObj.get("mccs").toString()));
      }
      if ((jsonObj.get("paymentInstrumentGroupId") != null && !jsonObj.get("paymentInstrumentGroupId").isJsonNull()) && !jsonObj.get("paymentInstrumentGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentInstrumentGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentInstrumentGroupId").toString()));
      }
      if ((jsonObj.get("paymentInstrumentId") != null && !jsonObj.get("paymentInstrumentId").isJsonNull()) && !jsonObj.get("paymentInstrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentInstrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentInstrumentId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("processingTypes") != null && !jsonObj.get("processingTypes").isJsonNull() && !jsonObj.get("processingTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `processingTypes` to be an array in the JSON string but got `%s`", jsonObj.get("processingTypes").toString()));
      }
      if (!jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRuleInfo>() {
           @Override
           public void write(JsonWriter out, TransactionRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionRuleInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransactionRuleInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionRuleInfo
   * @throws IOException if the JSON string is invalid with respect to TransactionRuleInfo
   */
  public static TransactionRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRuleInfo.class);
  }

  /**
   * Convert an instance of TransactionRuleInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

