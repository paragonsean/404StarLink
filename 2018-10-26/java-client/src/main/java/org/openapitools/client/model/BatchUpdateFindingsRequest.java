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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.AwsSecurityFindingIdentifier;
import org.openapitools.client.model.BatchUpdateFindingsRequestNote;
import org.openapitools.client.model.BatchUpdateFindingsRequestSeverity;
import org.openapitools.client.model.BatchUpdateFindingsRequestWorkflow;
import org.openapitools.client.model.RelatedFinding;

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
 * BatchUpdateFindingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BatchUpdateFindingsRequest {
  public static final String SERIALIZED_NAME_FINDING_IDENTIFIERS = "FindingIdentifiers";
  @SerializedName(SERIALIZED_NAME_FINDING_IDENTIFIERS)
  private List<AwsSecurityFindingIdentifier> findingIdentifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_NOTE = "Note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private BatchUpdateFindingsRequestNote note;

  public static final String SERIALIZED_NAME_SEVERITY = "Severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private BatchUpdateFindingsRequestSeverity severity;

  /**
   * &lt;p&gt;Indicates the veracity of a finding.&lt;/p&gt; &lt;p&gt;The available values for &lt;code&gt;VerificationState&lt;/code&gt; are as follows.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;UNKNOWN&lt;/code&gt; – The default disposition of a security finding&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;TRUE_POSITIVE&lt;/code&gt; – The security finding is confirmed&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;FALSE_POSITIVE&lt;/code&gt; – The security finding was determined to be a false alarm&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;BENIGN_POSITIVE&lt;/code&gt; – A special case of &lt;code&gt;TRUE_POSITIVE&lt;/code&gt; where the finding doesn&#39;t pose any threat, is expected, or both&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
   */
  @JsonAdapter(VerificationStateEnum.Adapter.class)
  public enum VerificationStateEnum {
    UNKNOWN("UNKNOWN"),
    
    TRUE_POSITIVE("TRUE_POSITIVE"),
    
    FALSE_POSITIVE("FALSE_POSITIVE"),
    
    BENIGN_POSITIVE("BENIGN_POSITIVE");

    private String value;

    VerificationStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationStateEnum fromValue(String value) {
      for (VerificationStateEnum b : VerificationStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerificationStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerificationStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VerificationStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VERIFICATION_STATE = "VerificationState";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATE)
  private VerificationStateEnum verificationState;

  public static final String SERIALIZED_NAME_CONFIDENCE = "Confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Integer confidence;

  public static final String SERIALIZED_NAME_CRITICALITY = "Criticality";
  @SerializedName(SERIALIZED_NAME_CRITICALITY)
  private Integer criticality;

  public static final String SERIALIZED_NAME_TYPES = "Types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<String> types = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_DEFINED_FIELDS = "UserDefinedFields";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED_FIELDS)
  private Map<String, String> userDefinedFields = new HashMap<>();

  public static final String SERIALIZED_NAME_WORKFLOW = "Workflow";
  @SerializedName(SERIALIZED_NAME_WORKFLOW)
  private BatchUpdateFindingsRequestWorkflow workflow;

  public static final String SERIALIZED_NAME_RELATED_FINDINGS = "RelatedFindings";
  @SerializedName(SERIALIZED_NAME_RELATED_FINDINGS)
  private List<RelatedFinding> relatedFindings = new ArrayList<>();

  public BatchUpdateFindingsRequest() {
  }

  public BatchUpdateFindingsRequest findingIdentifiers(List<AwsSecurityFindingIdentifier> findingIdentifiers) {
    this.findingIdentifiers = findingIdentifiers;
    return this;
  }

  public BatchUpdateFindingsRequest addFindingIdentifiersItem(AwsSecurityFindingIdentifier findingIdentifiersItem) {
    if (this.findingIdentifiers == null) {
      this.findingIdentifiers = new ArrayList<>();
    }
    this.findingIdentifiers.add(findingIdentifiersItem);
    return this;
  }

  /**
   * &lt;p&gt;The list of findings to update. &lt;code&gt;BatchUpdateFindings&lt;/code&gt; can be used to update up to 100 findings at a time.&lt;/p&gt; &lt;p&gt;For each finding, the list provides the finding identifier and the ARN of the finding provider.&lt;/p&gt;
   * @return findingIdentifiers
   */
  @javax.annotation.Nonnull
  public List<AwsSecurityFindingIdentifier> getFindingIdentifiers() {
    return findingIdentifiers;
  }

  public void setFindingIdentifiers(List<AwsSecurityFindingIdentifier> findingIdentifiers) {
    this.findingIdentifiers = findingIdentifiers;
  }


  public BatchUpdateFindingsRequest note(BatchUpdateFindingsRequestNote note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
   */
  @javax.annotation.Nullable
  public BatchUpdateFindingsRequestNote getNote() {
    return note;
  }

  public void setNote(BatchUpdateFindingsRequestNote note) {
    this.note = note;
  }


  public BatchUpdateFindingsRequest severity(BatchUpdateFindingsRequestSeverity severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
   */
  @javax.annotation.Nullable
  public BatchUpdateFindingsRequestSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(BatchUpdateFindingsRequestSeverity severity) {
    this.severity = severity;
  }


  public BatchUpdateFindingsRequest verificationState(VerificationStateEnum verificationState) {
    this.verificationState = verificationState;
    return this;
  }

  /**
   * &lt;p&gt;Indicates the veracity of a finding.&lt;/p&gt; &lt;p&gt;The available values for &lt;code&gt;VerificationState&lt;/code&gt; are as follows.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;UNKNOWN&lt;/code&gt; – The default disposition of a security finding&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;TRUE_POSITIVE&lt;/code&gt; – The security finding is confirmed&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;FALSE_POSITIVE&lt;/code&gt; – The security finding was determined to be a false alarm&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;BENIGN_POSITIVE&lt;/code&gt; – A special case of &lt;code&gt;TRUE_POSITIVE&lt;/code&gt; where the finding doesn&#39;t pose any threat, is expected, or both&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
   * @return verificationState
   */
  @javax.annotation.Nullable
  public VerificationStateEnum getVerificationState() {
    return verificationState;
  }

  public void setVerificationState(VerificationStateEnum verificationState) {
    this.verificationState = verificationState;
  }


  public BatchUpdateFindingsRequest confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * &lt;p&gt;The updated value for the finding confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify.&lt;/p&gt; &lt;p&gt;Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.&lt;/p&gt;
   * minimum: 0
   * maximum: 100
   * @return confidence
   */
  @javax.annotation.Nullable
  public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }


  public BatchUpdateFindingsRequest criticality(Integer criticality) {
    this.criticality = criticality;
    return this;
  }

  /**
   * &lt;p&gt;The updated value for the level of importance assigned to the resources associated with the findings.&lt;/p&gt; &lt;p&gt;A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources. &lt;/p&gt;
   * minimum: 0
   * maximum: 100
   * @return criticality
   */
  @javax.annotation.Nullable
  public Integer getCriticality() {
    return criticality;
  }

  public void setCriticality(Integer criticality) {
    this.criticality = criticality;
  }


  public BatchUpdateFindingsRequest types(List<String> types) {
    this.types = types;
    return this;
  }

  public BatchUpdateFindingsRequest addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * &lt;p&gt;One or more finding types in the format of namespace/category/classifier that classify a finding.&lt;/p&gt; &lt;p&gt;Valid namespace values are as follows.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Software and Configuration Checks&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;TTPs&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Effects&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Unusual Behaviors&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Sensitive Data Identifications &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
   * @return types
   */
  @javax.annotation.Nullable
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  public BatchUpdateFindingsRequest userDefinedFields(Map<String, String> userDefinedFields) {
    this.userDefinedFields = userDefinedFields;
    return this;
  }

  public BatchUpdateFindingsRequest putUserDefinedFieldsItem(String key, String userDefinedFieldsItem) {
    if (this.userDefinedFields == null) {
      this.userDefinedFields = new HashMap<>();
    }
    this.userDefinedFields.put(key, userDefinedFieldsItem);
    return this;
  }

  /**
   * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding.
   * @return userDefinedFields
   */
  @javax.annotation.Nullable
  public Map<String, String> getUserDefinedFields() {
    return userDefinedFields;
  }

  public void setUserDefinedFields(Map<String, String> userDefinedFields) {
    this.userDefinedFields = userDefinedFields;
  }


  public BatchUpdateFindingsRequest workflow(BatchUpdateFindingsRequestWorkflow workflow) {
    this.workflow = workflow;
    return this;
  }

  /**
   * Get workflow
   * @return workflow
   */
  @javax.annotation.Nullable
  public BatchUpdateFindingsRequestWorkflow getWorkflow() {
    return workflow;
  }

  public void setWorkflow(BatchUpdateFindingsRequestWorkflow workflow) {
    this.workflow = workflow;
  }


  public BatchUpdateFindingsRequest relatedFindings(List<RelatedFinding> relatedFindings) {
    this.relatedFindings = relatedFindings;
    return this;
  }

  public BatchUpdateFindingsRequest addRelatedFindingsItem(RelatedFinding relatedFindingsItem) {
    if (this.relatedFindings == null) {
      this.relatedFindings = new ArrayList<>();
    }
    this.relatedFindings.add(relatedFindingsItem);
    return this;
  }

  /**
   * A list of findings that are related to the updated findings.
   * @return relatedFindings
   */
  @javax.annotation.Nullable
  public List<RelatedFinding> getRelatedFindings() {
    return relatedFindings;
  }

  public void setRelatedFindings(List<RelatedFinding> relatedFindings) {
    this.relatedFindings = relatedFindings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUpdateFindingsRequest batchUpdateFindingsRequest = (BatchUpdateFindingsRequest) o;
    return Objects.equals(this.findingIdentifiers, batchUpdateFindingsRequest.findingIdentifiers) &&
        Objects.equals(this.note, batchUpdateFindingsRequest.note) &&
        Objects.equals(this.severity, batchUpdateFindingsRequest.severity) &&
        Objects.equals(this.verificationState, batchUpdateFindingsRequest.verificationState) &&
        Objects.equals(this.confidence, batchUpdateFindingsRequest.confidence) &&
        Objects.equals(this.criticality, batchUpdateFindingsRequest.criticality) &&
        Objects.equals(this.types, batchUpdateFindingsRequest.types) &&
        Objects.equals(this.userDefinedFields, batchUpdateFindingsRequest.userDefinedFields) &&
        Objects.equals(this.workflow, batchUpdateFindingsRequest.workflow) &&
        Objects.equals(this.relatedFindings, batchUpdateFindingsRequest.relatedFindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(findingIdentifiers, note, severity, verificationState, confidence, criticality, types, userDefinedFields, workflow, relatedFindings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUpdateFindingsRequest {\n");
    sb.append("    findingIdentifiers: ").append(toIndentedString(findingIdentifiers)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    verificationState: ").append(toIndentedString(verificationState)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    userDefinedFields: ").append(toIndentedString(userDefinedFields)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    relatedFindings: ").append(toIndentedString(relatedFindings)).append("\n");
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
    openapiFields.add("FindingIdentifiers");
    openapiFields.add("Note");
    openapiFields.add("Severity");
    openapiFields.add("VerificationState");
    openapiFields.add("Confidence");
    openapiFields.add("Criticality");
    openapiFields.add("Types");
    openapiFields.add("UserDefinedFields");
    openapiFields.add("Workflow");
    openapiFields.add("RelatedFindings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FindingIdentifiers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BatchUpdateFindingsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchUpdateFindingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchUpdateFindingsRequest is not found in the empty JSON string", BatchUpdateFindingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchUpdateFindingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchUpdateFindingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchUpdateFindingsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("FindingIdentifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FindingIdentifiers` to be an array in the JSON string but got `%s`", jsonObj.get("FindingIdentifiers").toString()));
      }

      JsonArray jsonArrayfindingIdentifiers = jsonObj.getAsJsonArray("FindingIdentifiers");
      // validate the required field `FindingIdentifiers` (array)
      for (int i = 0; i < jsonArrayfindingIdentifiers.size(); i++) {
        AwsSecurityFindingIdentifier.validateJsonElement(jsonArrayfindingIdentifiers.get(i));
      };
      // validate the optional field `Note`
      if (jsonObj.get("Note") != null && !jsonObj.get("Note").isJsonNull()) {
        BatchUpdateFindingsRequestNote.validateJsonElement(jsonObj.get("Note"));
      }
      // validate the optional field `Severity`
      if (jsonObj.get("Severity") != null && !jsonObj.get("Severity").isJsonNull()) {
        BatchUpdateFindingsRequestSeverity.validateJsonElement(jsonObj.get("Severity"));
      }
      if ((jsonObj.get("VerificationState") != null && !jsonObj.get("VerificationState").isJsonNull()) && !jsonObj.get("VerificationState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VerificationState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VerificationState").toString()));
      }
      // validate the optional field `VerificationState`
      if (jsonObj.get("VerificationState") != null && !jsonObj.get("VerificationState").isJsonNull()) {
        VerificationStateEnum.validateJsonElement(jsonObj.get("VerificationState"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Types") != null && !jsonObj.get("Types").isJsonNull() && !jsonObj.get("Types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Types` to be an array in the JSON string but got `%s`", jsonObj.get("Types").toString()));
      }
      // validate the optional field `Workflow`
      if (jsonObj.get("Workflow") != null && !jsonObj.get("Workflow").isJsonNull()) {
        BatchUpdateFindingsRequestWorkflow.validateJsonElement(jsonObj.get("Workflow"));
      }
      if (jsonObj.get("RelatedFindings") != null && !jsonObj.get("RelatedFindings").isJsonNull()) {
        JsonArray jsonArrayrelatedFindings = jsonObj.getAsJsonArray("RelatedFindings");
        if (jsonArrayrelatedFindings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("RelatedFindings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `RelatedFindings` to be an array in the JSON string but got `%s`", jsonObj.get("RelatedFindings").toString()));
          }

          // validate the optional field `RelatedFindings` (array)
          for (int i = 0; i < jsonArrayrelatedFindings.size(); i++) {
            RelatedFinding.validateJsonElement(jsonArrayrelatedFindings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchUpdateFindingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchUpdateFindingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchUpdateFindingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchUpdateFindingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchUpdateFindingsRequest>() {
           @Override
           public void write(JsonWriter out, BatchUpdateFindingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchUpdateFindingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchUpdateFindingsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchUpdateFindingsRequest
   * @throws IOException if the JSON string is invalid with respect to BatchUpdateFindingsRequest
   */
  public static BatchUpdateFindingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchUpdateFindingsRequest.class);
  }

  /**
   * Convert an instance of BatchUpdateFindingsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

