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
import org.openapitools.client.model.AwsDynamoDbTableDetailsBillingModeSummary;
import org.openapitools.client.model.AwsDynamoDbTableDetailsProvisionedThroughput;
import org.openapitools.client.model.AwsDynamoDbTableDetailsRestoreSummary;
import org.openapitools.client.model.AwsDynamoDbTableDetailsSseDescription;
import org.openapitools.client.model.AwsDynamoDbTableDetailsStreamSpecification;

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
 * ResourceDetailsAwsDynamoDbTable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsDynamoDbTable {
  public static final String SERIALIZED_NAME_ATTRIBUTE_DEFINITIONS = "AttributeDefinitions";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_DEFINITIONS)
  private List attributeDefinitions;

  public static final String SERIALIZED_NAME_BILLING_MODE_SUMMARY = "BillingModeSummary";
  @SerializedName(SERIALIZED_NAME_BILLING_MODE_SUMMARY)
  private AwsDynamoDbTableDetailsBillingModeSummary billingModeSummary;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "CreationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private String creationDateTime;

  public static final String SERIALIZED_NAME_GLOBAL_SECONDARY_INDEXES = "GlobalSecondaryIndexes";
  @SerializedName(SERIALIZED_NAME_GLOBAL_SECONDARY_INDEXES)
  private List globalSecondaryIndexes;

  public static final String SERIALIZED_NAME_GLOBAL_TABLE_VERSION = "GlobalTableVersion";
  @SerializedName(SERIALIZED_NAME_GLOBAL_TABLE_VERSION)
  private String globalTableVersion;

  public static final String SERIALIZED_NAME_ITEM_COUNT = "ItemCount";
  @SerializedName(SERIALIZED_NAME_ITEM_COUNT)
  private Integer itemCount;

  public static final String SERIALIZED_NAME_KEY_SCHEMA = "KeySchema";
  @SerializedName(SERIALIZED_NAME_KEY_SCHEMA)
  private List keySchema;

  public static final String SERIALIZED_NAME_LATEST_STREAM_ARN = "LatestStreamArn";
  @SerializedName(SERIALIZED_NAME_LATEST_STREAM_ARN)
  private String latestStreamArn;

  public static final String SERIALIZED_NAME_LATEST_STREAM_LABEL = "LatestStreamLabel";
  @SerializedName(SERIALIZED_NAME_LATEST_STREAM_LABEL)
  private String latestStreamLabel;

  public static final String SERIALIZED_NAME_LOCAL_SECONDARY_INDEXES = "LocalSecondaryIndexes";
  @SerializedName(SERIALIZED_NAME_LOCAL_SECONDARY_INDEXES)
  private List localSecondaryIndexes;

  public static final String SERIALIZED_NAME_PROVISIONED_THROUGHPUT = "ProvisionedThroughput";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_THROUGHPUT)
  private AwsDynamoDbTableDetailsProvisionedThroughput provisionedThroughput;

  public static final String SERIALIZED_NAME_REPLICAS = "Replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private List replicas;

  public static final String SERIALIZED_NAME_RESTORE_SUMMARY = "RestoreSummary";
  @SerializedName(SERIALIZED_NAME_RESTORE_SUMMARY)
  private AwsDynamoDbTableDetailsRestoreSummary restoreSummary;

  public static final String SERIALIZED_NAME_SSE_DESCRIPTION = "SseDescription";
  @SerializedName(SERIALIZED_NAME_SSE_DESCRIPTION)
  private AwsDynamoDbTableDetailsSseDescription sseDescription;

  public static final String SERIALIZED_NAME_STREAM_SPECIFICATION = "StreamSpecification";
  @SerializedName(SERIALIZED_NAME_STREAM_SPECIFICATION)
  private AwsDynamoDbTableDetailsStreamSpecification streamSpecification;

  public static final String SERIALIZED_NAME_TABLE_ID = "TableId";
  @SerializedName(SERIALIZED_NAME_TABLE_ID)
  private String tableId;

  public static final String SERIALIZED_NAME_TABLE_NAME = "TableName";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public static final String SERIALIZED_NAME_TABLE_SIZE_BYTES = "TableSizeBytes";
  @SerializedName(SERIALIZED_NAME_TABLE_SIZE_BYTES)
  private Integer tableSizeBytes;

  public static final String SERIALIZED_NAME_TABLE_STATUS = "TableStatus";
  @SerializedName(SERIALIZED_NAME_TABLE_STATUS)
  private String tableStatus;

  public ResourceDetailsAwsDynamoDbTable() {
  }

  public ResourceDetailsAwsDynamoDbTable attributeDefinitions(List attributeDefinitions) {
    this.attributeDefinitions = attributeDefinitions;
    return this;
  }

  /**
   * Get attributeDefinitions
   * @return attributeDefinitions
   */
  @javax.annotation.Nullable
  public List getAttributeDefinitions() {
    return attributeDefinitions;
  }

  public void setAttributeDefinitions(List attributeDefinitions) {
    this.attributeDefinitions = attributeDefinitions;
  }


  public ResourceDetailsAwsDynamoDbTable billingModeSummary(AwsDynamoDbTableDetailsBillingModeSummary billingModeSummary) {
    this.billingModeSummary = billingModeSummary;
    return this;
  }

  /**
   * Get billingModeSummary
   * @return billingModeSummary
   */
  @javax.annotation.Nullable
  public AwsDynamoDbTableDetailsBillingModeSummary getBillingModeSummary() {
    return billingModeSummary;
  }

  public void setBillingModeSummary(AwsDynamoDbTableDetailsBillingModeSummary billingModeSummary) {
    this.billingModeSummary = billingModeSummary;
  }


  public ResourceDetailsAwsDynamoDbTable creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  public ResourceDetailsAwsDynamoDbTable globalSecondaryIndexes(List globalSecondaryIndexes) {
    this.globalSecondaryIndexes = globalSecondaryIndexes;
    return this;
  }

  /**
   * Get globalSecondaryIndexes
   * @return globalSecondaryIndexes
   */
  @javax.annotation.Nullable
  public List getGlobalSecondaryIndexes() {
    return globalSecondaryIndexes;
  }

  public void setGlobalSecondaryIndexes(List globalSecondaryIndexes) {
    this.globalSecondaryIndexes = globalSecondaryIndexes;
  }


  public ResourceDetailsAwsDynamoDbTable globalTableVersion(String globalTableVersion) {
    this.globalTableVersion = globalTableVersion;
    return this;
  }

  /**
   * Get globalTableVersion
   * @return globalTableVersion
   */
  @javax.annotation.Nullable
  public String getGlobalTableVersion() {
    return globalTableVersion;
  }

  public void setGlobalTableVersion(String globalTableVersion) {
    this.globalTableVersion = globalTableVersion;
  }


  public ResourceDetailsAwsDynamoDbTable itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Get itemCount
   * @return itemCount
   */
  @javax.annotation.Nullable
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }


  public ResourceDetailsAwsDynamoDbTable keySchema(List keySchema) {
    this.keySchema = keySchema;
    return this;
  }

  /**
   * Get keySchema
   * @return keySchema
   */
  @javax.annotation.Nullable
  public List getKeySchema() {
    return keySchema;
  }

  public void setKeySchema(List keySchema) {
    this.keySchema = keySchema;
  }


  public ResourceDetailsAwsDynamoDbTable latestStreamArn(String latestStreamArn) {
    this.latestStreamArn = latestStreamArn;
    return this;
  }

  /**
   * Get latestStreamArn
   * @return latestStreamArn
   */
  @javax.annotation.Nullable
  public String getLatestStreamArn() {
    return latestStreamArn;
  }

  public void setLatestStreamArn(String latestStreamArn) {
    this.latestStreamArn = latestStreamArn;
  }


  public ResourceDetailsAwsDynamoDbTable latestStreamLabel(String latestStreamLabel) {
    this.latestStreamLabel = latestStreamLabel;
    return this;
  }

  /**
   * Get latestStreamLabel
   * @return latestStreamLabel
   */
  @javax.annotation.Nullable
  public String getLatestStreamLabel() {
    return latestStreamLabel;
  }

  public void setLatestStreamLabel(String latestStreamLabel) {
    this.latestStreamLabel = latestStreamLabel;
  }


  public ResourceDetailsAwsDynamoDbTable localSecondaryIndexes(List localSecondaryIndexes) {
    this.localSecondaryIndexes = localSecondaryIndexes;
    return this;
  }

  /**
   * Get localSecondaryIndexes
   * @return localSecondaryIndexes
   */
  @javax.annotation.Nullable
  public List getLocalSecondaryIndexes() {
    return localSecondaryIndexes;
  }

  public void setLocalSecondaryIndexes(List localSecondaryIndexes) {
    this.localSecondaryIndexes = localSecondaryIndexes;
  }


  public ResourceDetailsAwsDynamoDbTable provisionedThroughput(AwsDynamoDbTableDetailsProvisionedThroughput provisionedThroughput) {
    this.provisionedThroughput = provisionedThroughput;
    return this;
  }

  /**
   * Get provisionedThroughput
   * @return provisionedThroughput
   */
  @javax.annotation.Nullable
  public AwsDynamoDbTableDetailsProvisionedThroughput getProvisionedThroughput() {
    return provisionedThroughput;
  }

  public void setProvisionedThroughput(AwsDynamoDbTableDetailsProvisionedThroughput provisionedThroughput) {
    this.provisionedThroughput = provisionedThroughput;
  }


  public ResourceDetailsAwsDynamoDbTable replicas(List replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Get replicas
   * @return replicas
   */
  @javax.annotation.Nullable
  public List getReplicas() {
    return replicas;
  }

  public void setReplicas(List replicas) {
    this.replicas = replicas;
  }


  public ResourceDetailsAwsDynamoDbTable restoreSummary(AwsDynamoDbTableDetailsRestoreSummary restoreSummary) {
    this.restoreSummary = restoreSummary;
    return this;
  }

  /**
   * Get restoreSummary
   * @return restoreSummary
   */
  @javax.annotation.Nullable
  public AwsDynamoDbTableDetailsRestoreSummary getRestoreSummary() {
    return restoreSummary;
  }

  public void setRestoreSummary(AwsDynamoDbTableDetailsRestoreSummary restoreSummary) {
    this.restoreSummary = restoreSummary;
  }


  public ResourceDetailsAwsDynamoDbTable sseDescription(AwsDynamoDbTableDetailsSseDescription sseDescription) {
    this.sseDescription = sseDescription;
    return this;
  }

  /**
   * Get sseDescription
   * @return sseDescription
   */
  @javax.annotation.Nullable
  public AwsDynamoDbTableDetailsSseDescription getSseDescription() {
    return sseDescription;
  }

  public void setSseDescription(AwsDynamoDbTableDetailsSseDescription sseDescription) {
    this.sseDescription = sseDescription;
  }


  public ResourceDetailsAwsDynamoDbTable streamSpecification(AwsDynamoDbTableDetailsStreamSpecification streamSpecification) {
    this.streamSpecification = streamSpecification;
    return this;
  }

  /**
   * Get streamSpecification
   * @return streamSpecification
   */
  @javax.annotation.Nullable
  public AwsDynamoDbTableDetailsStreamSpecification getStreamSpecification() {
    return streamSpecification;
  }

  public void setStreamSpecification(AwsDynamoDbTableDetailsStreamSpecification streamSpecification) {
    this.streamSpecification = streamSpecification;
  }


  public ResourceDetailsAwsDynamoDbTable tableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * Get tableId
   * @return tableId
   */
  @javax.annotation.Nullable
  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }


  public ResourceDetailsAwsDynamoDbTable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Get tableName
   * @return tableName
   */
  @javax.annotation.Nullable
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  public ResourceDetailsAwsDynamoDbTable tableSizeBytes(Integer tableSizeBytes) {
    this.tableSizeBytes = tableSizeBytes;
    return this;
  }

  /**
   * Get tableSizeBytes
   * @return tableSizeBytes
   */
  @javax.annotation.Nullable
  public Integer getTableSizeBytes() {
    return tableSizeBytes;
  }

  public void setTableSizeBytes(Integer tableSizeBytes) {
    this.tableSizeBytes = tableSizeBytes;
  }


  public ResourceDetailsAwsDynamoDbTable tableStatus(String tableStatus) {
    this.tableStatus = tableStatus;
    return this;
  }

  /**
   * Get tableStatus
   * @return tableStatus
   */
  @javax.annotation.Nullable
  public String getTableStatus() {
    return tableStatus;
  }

  public void setTableStatus(String tableStatus) {
    this.tableStatus = tableStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsDynamoDbTable resourceDetailsAwsDynamoDbTable = (ResourceDetailsAwsDynamoDbTable) o;
    return Objects.equals(this.attributeDefinitions, resourceDetailsAwsDynamoDbTable.attributeDefinitions) &&
        Objects.equals(this.billingModeSummary, resourceDetailsAwsDynamoDbTable.billingModeSummary) &&
        Objects.equals(this.creationDateTime, resourceDetailsAwsDynamoDbTable.creationDateTime) &&
        Objects.equals(this.globalSecondaryIndexes, resourceDetailsAwsDynamoDbTable.globalSecondaryIndexes) &&
        Objects.equals(this.globalTableVersion, resourceDetailsAwsDynamoDbTable.globalTableVersion) &&
        Objects.equals(this.itemCount, resourceDetailsAwsDynamoDbTable.itemCount) &&
        Objects.equals(this.keySchema, resourceDetailsAwsDynamoDbTable.keySchema) &&
        Objects.equals(this.latestStreamArn, resourceDetailsAwsDynamoDbTable.latestStreamArn) &&
        Objects.equals(this.latestStreamLabel, resourceDetailsAwsDynamoDbTable.latestStreamLabel) &&
        Objects.equals(this.localSecondaryIndexes, resourceDetailsAwsDynamoDbTable.localSecondaryIndexes) &&
        Objects.equals(this.provisionedThroughput, resourceDetailsAwsDynamoDbTable.provisionedThroughput) &&
        Objects.equals(this.replicas, resourceDetailsAwsDynamoDbTable.replicas) &&
        Objects.equals(this.restoreSummary, resourceDetailsAwsDynamoDbTable.restoreSummary) &&
        Objects.equals(this.sseDescription, resourceDetailsAwsDynamoDbTable.sseDescription) &&
        Objects.equals(this.streamSpecification, resourceDetailsAwsDynamoDbTable.streamSpecification) &&
        Objects.equals(this.tableId, resourceDetailsAwsDynamoDbTable.tableId) &&
        Objects.equals(this.tableName, resourceDetailsAwsDynamoDbTable.tableName) &&
        Objects.equals(this.tableSizeBytes, resourceDetailsAwsDynamoDbTable.tableSizeBytes) &&
        Objects.equals(this.tableStatus, resourceDetailsAwsDynamoDbTable.tableStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDefinitions, billingModeSummary, creationDateTime, globalSecondaryIndexes, globalTableVersion, itemCount, keySchema, latestStreamArn, latestStreamLabel, localSecondaryIndexes, provisionedThroughput, replicas, restoreSummary, sseDescription, streamSpecification, tableId, tableName, tableSizeBytes, tableStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsDynamoDbTable {\n");
    sb.append("    attributeDefinitions: ").append(toIndentedString(attributeDefinitions)).append("\n");
    sb.append("    billingModeSummary: ").append(toIndentedString(billingModeSummary)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    globalSecondaryIndexes: ").append(toIndentedString(globalSecondaryIndexes)).append("\n");
    sb.append("    globalTableVersion: ").append(toIndentedString(globalTableVersion)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    keySchema: ").append(toIndentedString(keySchema)).append("\n");
    sb.append("    latestStreamArn: ").append(toIndentedString(latestStreamArn)).append("\n");
    sb.append("    latestStreamLabel: ").append(toIndentedString(latestStreamLabel)).append("\n");
    sb.append("    localSecondaryIndexes: ").append(toIndentedString(localSecondaryIndexes)).append("\n");
    sb.append("    provisionedThroughput: ").append(toIndentedString(provisionedThroughput)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    restoreSummary: ").append(toIndentedString(restoreSummary)).append("\n");
    sb.append("    sseDescription: ").append(toIndentedString(sseDescription)).append("\n");
    sb.append("    streamSpecification: ").append(toIndentedString(streamSpecification)).append("\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    tableSizeBytes: ").append(toIndentedString(tableSizeBytes)).append("\n");
    sb.append("    tableStatus: ").append(toIndentedString(tableStatus)).append("\n");
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
    openapiFields.add("AttributeDefinitions");
    openapiFields.add("BillingModeSummary");
    openapiFields.add("CreationDateTime");
    openapiFields.add("GlobalSecondaryIndexes");
    openapiFields.add("GlobalTableVersion");
    openapiFields.add("ItemCount");
    openapiFields.add("KeySchema");
    openapiFields.add("LatestStreamArn");
    openapiFields.add("LatestStreamLabel");
    openapiFields.add("LocalSecondaryIndexes");
    openapiFields.add("ProvisionedThroughput");
    openapiFields.add("Replicas");
    openapiFields.add("RestoreSummary");
    openapiFields.add("SseDescription");
    openapiFields.add("StreamSpecification");
    openapiFields.add("TableId");
    openapiFields.add("TableName");
    openapiFields.add("TableSizeBytes");
    openapiFields.add("TableStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsDynamoDbTable
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsDynamoDbTable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsDynamoDbTable is not found in the empty JSON string", ResourceDetailsAwsDynamoDbTable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsDynamoDbTable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsDynamoDbTable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AttributeDefinitions`
      if (jsonObj.get("AttributeDefinitions") != null && !jsonObj.get("AttributeDefinitions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AttributeDefinitions"));
      }
      // validate the optional field `BillingModeSummary`
      if (jsonObj.get("BillingModeSummary") != null && !jsonObj.get("BillingModeSummary").isJsonNull()) {
        AwsDynamoDbTableDetailsBillingModeSummary.validateJsonElement(jsonObj.get("BillingModeSummary"));
      }
      // validate the optional field `CreationDateTime`
      if (jsonObj.get("CreationDateTime") != null && !jsonObj.get("CreationDateTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreationDateTime"));
      }
      // validate the optional field `GlobalSecondaryIndexes`
      if (jsonObj.get("GlobalSecondaryIndexes") != null && !jsonObj.get("GlobalSecondaryIndexes").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("GlobalSecondaryIndexes"));
      }
      // validate the optional field `GlobalTableVersion`
      if (jsonObj.get("GlobalTableVersion") != null && !jsonObj.get("GlobalTableVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("GlobalTableVersion"));
      }
      // validate the optional field `ItemCount`
      if (jsonObj.get("ItemCount") != null && !jsonObj.get("ItemCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ItemCount"));
      }
      // validate the optional field `KeySchema`
      if (jsonObj.get("KeySchema") != null && !jsonObj.get("KeySchema").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("KeySchema"));
      }
      // validate the optional field `LatestStreamArn`
      if (jsonObj.get("LatestStreamArn") != null && !jsonObj.get("LatestStreamArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LatestStreamArn"));
      }
      // validate the optional field `LatestStreamLabel`
      if (jsonObj.get("LatestStreamLabel") != null && !jsonObj.get("LatestStreamLabel").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LatestStreamLabel"));
      }
      // validate the optional field `LocalSecondaryIndexes`
      if (jsonObj.get("LocalSecondaryIndexes") != null && !jsonObj.get("LocalSecondaryIndexes").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("LocalSecondaryIndexes"));
      }
      // validate the optional field `ProvisionedThroughput`
      if (jsonObj.get("ProvisionedThroughput") != null && !jsonObj.get("ProvisionedThroughput").isJsonNull()) {
        AwsDynamoDbTableDetailsProvisionedThroughput.validateJsonElement(jsonObj.get("ProvisionedThroughput"));
      }
      // validate the optional field `Replicas`
      if (jsonObj.get("Replicas") != null && !jsonObj.get("Replicas").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Replicas"));
      }
      // validate the optional field `RestoreSummary`
      if (jsonObj.get("RestoreSummary") != null && !jsonObj.get("RestoreSummary").isJsonNull()) {
        AwsDynamoDbTableDetailsRestoreSummary.validateJsonElement(jsonObj.get("RestoreSummary"));
      }
      // validate the optional field `SseDescription`
      if (jsonObj.get("SseDescription") != null && !jsonObj.get("SseDescription").isJsonNull()) {
        AwsDynamoDbTableDetailsSseDescription.validateJsonElement(jsonObj.get("SseDescription"));
      }
      // validate the optional field `StreamSpecification`
      if (jsonObj.get("StreamSpecification") != null && !jsonObj.get("StreamSpecification").isJsonNull()) {
        AwsDynamoDbTableDetailsStreamSpecification.validateJsonElement(jsonObj.get("StreamSpecification"));
      }
      // validate the optional field `TableId`
      if (jsonObj.get("TableId") != null && !jsonObj.get("TableId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TableId"));
      }
      // validate the optional field `TableName`
      if (jsonObj.get("TableName") != null && !jsonObj.get("TableName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TableName"));
      }
      // validate the optional field `TableSizeBytes`
      if (jsonObj.get("TableSizeBytes") != null && !jsonObj.get("TableSizeBytes").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("TableSizeBytes"));
      }
      // validate the optional field `TableStatus`
      if (jsonObj.get("TableStatus") != null && !jsonObj.get("TableStatus").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TableStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsDynamoDbTable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsDynamoDbTable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsDynamoDbTable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsDynamoDbTable.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsDynamoDbTable>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsDynamoDbTable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsDynamoDbTable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsDynamoDbTable given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsDynamoDbTable
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsDynamoDbTable
   */
  public static ResourceDetailsAwsDynamoDbTable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsDynamoDbTable.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsDynamoDbTable to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

