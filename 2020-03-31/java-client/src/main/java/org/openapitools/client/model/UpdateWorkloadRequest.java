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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CreateWorkloadRequestDiscoveryConfig;

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
 * UpdateWorkloadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:48.152112-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateWorkloadRequest {
  public static final String SERIALIZED_NAME_WORKLOAD_NAME = "WorkloadName";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_NAME)
  private String workloadName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The environment for the workload.
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    PRODUCTION("PRODUCTION"),
    
    PREPRODUCTION("PREPRODUCTION");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EnvironmentEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT = "Environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentEnum environment;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "AccountIds";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_AWS_REGIONS = "AwsRegions";
  @SerializedName(SERIALIZED_NAME_AWS_REGIONS)
  private List<String> awsRegions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NON_AWS_REGIONS = "NonAwsRegions";
  @SerializedName(SERIALIZED_NAME_NON_AWS_REGIONS)
  private List<String> nonAwsRegions = new ArrayList<>();

  public static final String SERIALIZED_NAME_PILLAR_PRIORITIES = "PillarPriorities";
  @SerializedName(SERIALIZED_NAME_PILLAR_PRIORITIES)
  private List<String> pillarPriorities = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARCHITECTURAL_DESIGN = "ArchitecturalDesign";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURAL_DESIGN)
  private String architecturalDesign;

  public static final String SERIALIZED_NAME_REVIEW_OWNER = "ReviewOwner";
  @SerializedName(SERIALIZED_NAME_REVIEW_OWNER)
  private String reviewOwner;

  public static final String SERIALIZED_NAME_IS_REVIEW_OWNER_UPDATE_ACKNOWLEDGED = "IsReviewOwnerUpdateAcknowledged";
  @SerializedName(SERIALIZED_NAME_IS_REVIEW_OWNER_UPDATE_ACKNOWLEDGED)
  private Boolean isReviewOwnerUpdateAcknowledged;

  public static final String SERIALIZED_NAME_INDUSTRY_TYPE = "IndustryType";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_TYPE)
  private String industryType;

  public static final String SERIALIZED_NAME_INDUSTRY = "Industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private String industry;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  /**
   * The improvement status for a workload.
   */
  @JsonAdapter(ImprovementStatusEnum.Adapter.class)
  public enum ImprovementStatusEnum {
    NOT_APPLICABLE("NOT_APPLICABLE"),
    
    NOT_STARTED("NOT_STARTED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    COMPLETE("COMPLETE"),
    
    RISK_ACKNOWLEDGED("RISK_ACKNOWLEDGED");

    private String value;

    ImprovementStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImprovementStatusEnum fromValue(String value) {
      for (ImprovementStatusEnum b : ImprovementStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ImprovementStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImprovementStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImprovementStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ImprovementStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ImprovementStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_IMPROVEMENT_STATUS = "ImprovementStatus";
  @SerializedName(SERIALIZED_NAME_IMPROVEMENT_STATUS)
  private ImprovementStatusEnum improvementStatus;

  public static final String SERIALIZED_NAME_DISCOVERY_CONFIG = "DiscoveryConfig";
  @SerializedName(SERIALIZED_NAME_DISCOVERY_CONFIG)
  private CreateWorkloadRequestDiscoveryConfig discoveryConfig;

  public static final String SERIALIZED_NAME_APPLICATIONS = "Applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<String> applications = new ArrayList<>();

  public UpdateWorkloadRequest() {
  }

  public UpdateWorkloadRequest workloadName(String workloadName) {
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


  public UpdateWorkloadRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description for the workload.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateWorkloadRequest environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * The environment for the workload.
   * @return environment
   */
  @javax.annotation.Nullable
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }


  public UpdateWorkloadRequest accountIds(List<String> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public UpdateWorkloadRequest addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

  /**
   * The list of Amazon Web Services account IDs associated with the workload.
   * @return accountIds
   */
  @javax.annotation.Nullable
  public List<String> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  public UpdateWorkloadRequest awsRegions(List<String> awsRegions) {
    this.awsRegions = awsRegions;
    return this;
  }

  public UpdateWorkloadRequest addAwsRegionsItem(String awsRegionsItem) {
    if (this.awsRegions == null) {
      this.awsRegions = new ArrayList<>();
    }
    this.awsRegions.add(awsRegionsItem);
    return this;
  }

  /**
   * The list of Amazon Web Services Regions associated with the workload, for example, &lt;code&gt;us-east-2&lt;/code&gt;, or &lt;code&gt;ca-central-1&lt;/code&gt;.
   * @return awsRegions
   */
  @javax.annotation.Nullable
  public List<String> getAwsRegions() {
    return awsRegions;
  }

  public void setAwsRegions(List<String> awsRegions) {
    this.awsRegions = awsRegions;
  }


  public UpdateWorkloadRequest nonAwsRegions(List<String> nonAwsRegions) {
    this.nonAwsRegions = nonAwsRegions;
    return this;
  }

  public UpdateWorkloadRequest addNonAwsRegionsItem(String nonAwsRegionsItem) {
    if (this.nonAwsRegions == null) {
      this.nonAwsRegions = new ArrayList<>();
    }
    this.nonAwsRegions.add(nonAwsRegionsItem);
    return this;
  }

  /**
   *  The list of non-Amazon Web Services Regions associated with the workload.
   * @return nonAwsRegions
   */
  @javax.annotation.Nullable
  public List<String> getNonAwsRegions() {
    return nonAwsRegions;
  }

  public void setNonAwsRegions(List<String> nonAwsRegions) {
    this.nonAwsRegions = nonAwsRegions;
  }


  public UpdateWorkloadRequest pillarPriorities(List<String> pillarPriorities) {
    this.pillarPriorities = pillarPriorities;
    return this;
  }

  public UpdateWorkloadRequest addPillarPrioritiesItem(String pillarPrioritiesItem) {
    if (this.pillarPriorities == null) {
      this.pillarPriorities = new ArrayList<>();
    }
    this.pillarPriorities.add(pillarPrioritiesItem);
    return this;
  }

  /**
   * The priorities of the pillars, which are used to order items in the improvement plan. Each pillar is represented by its &lt;a&gt;PillarReviewSummary$PillarId&lt;/a&gt;.
   * @return pillarPriorities
   */
  @javax.annotation.Nullable
  public List<String> getPillarPriorities() {
    return pillarPriorities;
  }

  public void setPillarPriorities(List<String> pillarPriorities) {
    this.pillarPriorities = pillarPriorities;
  }


  public UpdateWorkloadRequest architecturalDesign(String architecturalDesign) {
    this.architecturalDesign = architecturalDesign;
    return this;
  }

  /**
   * The URL of the architectural design for the workload.
   * @return architecturalDesign
   */
  @javax.annotation.Nullable
  public String getArchitecturalDesign() {
    return architecturalDesign;
  }

  public void setArchitecturalDesign(String architecturalDesign) {
    this.architecturalDesign = architecturalDesign;
  }


  public UpdateWorkloadRequest reviewOwner(String reviewOwner) {
    this.reviewOwner = reviewOwner;
    return this;
  }

  /**
   * The review owner of the workload. The name, email address, or identifier for the primary group or individual that owns the workload review process.
   * @return reviewOwner
   */
  @javax.annotation.Nullable
  public String getReviewOwner() {
    return reviewOwner;
  }

  public void setReviewOwner(String reviewOwner) {
    this.reviewOwner = reviewOwner;
  }


  public UpdateWorkloadRequest isReviewOwnerUpdateAcknowledged(Boolean isReviewOwnerUpdateAcknowledged) {
    this.isReviewOwnerUpdateAcknowledged = isReviewOwnerUpdateAcknowledged;
    return this;
  }

  /**
   * &lt;p&gt;Flag indicating whether the workload owner has acknowledged that the &lt;i&gt;Review owner&lt;/i&gt; field is required.&lt;/p&gt; &lt;p&gt;If a &lt;b&gt;Review owner&lt;/b&gt; is not added to the workload within 60 days of acknowledgement, access to the workload is restricted until an owner is added.&lt;/p&gt;
   * @return isReviewOwnerUpdateAcknowledged
   */
  @javax.annotation.Nullable
  public Boolean getIsReviewOwnerUpdateAcknowledged() {
    return isReviewOwnerUpdateAcknowledged;
  }

  public void setIsReviewOwnerUpdateAcknowledged(Boolean isReviewOwnerUpdateAcknowledged) {
    this.isReviewOwnerUpdateAcknowledged = isReviewOwnerUpdateAcknowledged;
  }


  public UpdateWorkloadRequest industryType(String industryType) {
    this.industryType = industryType;
    return this;
  }

  /**
   * &lt;p&gt;The industry type for the workload.&lt;/p&gt; &lt;p&gt;If specified, must be one of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Agriculture&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Automobile&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Defense&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Design and Engineering&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Digital Advertising&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Education&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Environmental Protection&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Financial Services&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Gaming&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;General Public Services&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Healthcare&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Hospitality&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;InfoTech&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Justice and Public Safety&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Life Sciences&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Manufacturing&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Media &amp;amp; Entertainment&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Mining &amp;amp; Resources&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Oil &amp;amp; Gas&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Power &amp;amp; Utilities&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Professional Services&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Real Estate &amp;amp; Construction&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Retail &amp;amp; Wholesale&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Social Protection&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Telecommunications&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Travel, Transportation &amp;amp; Logistics&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;Other&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
   * @return industryType
   */
  @javax.annotation.Nullable
  public String getIndustryType() {
    return industryType;
  }

  public void setIndustryType(String industryType) {
    this.industryType = industryType;
  }


  public UpdateWorkloadRequest industry(String industry) {
    this.industry = industry;
    return this;
  }

  /**
   * The industry for the workload.
   * @return industry
   */
  @javax.annotation.Nullable
  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public UpdateWorkloadRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * The notes associated with the workload.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public UpdateWorkloadRequest improvementStatus(ImprovementStatusEnum improvementStatus) {
    this.improvementStatus = improvementStatus;
    return this;
  }

  /**
   * The improvement status for a workload.
   * @return improvementStatus
   */
  @javax.annotation.Nullable
  public ImprovementStatusEnum getImprovementStatus() {
    return improvementStatus;
  }

  public void setImprovementStatus(ImprovementStatusEnum improvementStatus) {
    this.improvementStatus = improvementStatus;
  }


  public UpdateWorkloadRequest discoveryConfig(CreateWorkloadRequestDiscoveryConfig discoveryConfig) {
    this.discoveryConfig = discoveryConfig;
    return this;
  }

  /**
   * Get discoveryConfig
   * @return discoveryConfig
   */
  @javax.annotation.Nullable
  public CreateWorkloadRequestDiscoveryConfig getDiscoveryConfig() {
    return discoveryConfig;
  }

  public void setDiscoveryConfig(CreateWorkloadRequestDiscoveryConfig discoveryConfig) {
    this.discoveryConfig = discoveryConfig;
  }


  public UpdateWorkloadRequest applications(List<String> applications) {
    this.applications = applications;
    return this;
  }

  public UpdateWorkloadRequest addApplicationsItem(String applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * List of AppRegistry application ARNs to associate to the workload.
   * @return applications
   */
  @javax.annotation.Nullable
  public List<String> getApplications() {
    return applications;
  }

  public void setApplications(List<String> applications) {
    this.applications = applications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkloadRequest updateWorkloadRequest = (UpdateWorkloadRequest) o;
    return Objects.equals(this.workloadName, updateWorkloadRequest.workloadName) &&
        Objects.equals(this.description, updateWorkloadRequest.description) &&
        Objects.equals(this.environment, updateWorkloadRequest.environment) &&
        Objects.equals(this.accountIds, updateWorkloadRequest.accountIds) &&
        Objects.equals(this.awsRegions, updateWorkloadRequest.awsRegions) &&
        Objects.equals(this.nonAwsRegions, updateWorkloadRequest.nonAwsRegions) &&
        Objects.equals(this.pillarPriorities, updateWorkloadRequest.pillarPriorities) &&
        Objects.equals(this.architecturalDesign, updateWorkloadRequest.architecturalDesign) &&
        Objects.equals(this.reviewOwner, updateWorkloadRequest.reviewOwner) &&
        Objects.equals(this.isReviewOwnerUpdateAcknowledged, updateWorkloadRequest.isReviewOwnerUpdateAcknowledged) &&
        Objects.equals(this.industryType, updateWorkloadRequest.industryType) &&
        Objects.equals(this.industry, updateWorkloadRequest.industry) &&
        Objects.equals(this.notes, updateWorkloadRequest.notes) &&
        Objects.equals(this.improvementStatus, updateWorkloadRequest.improvementStatus) &&
        Objects.equals(this.discoveryConfig, updateWorkloadRequest.discoveryConfig) &&
        Objects.equals(this.applications, updateWorkloadRequest.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadName, description, environment, accountIds, awsRegions, nonAwsRegions, pillarPriorities, architecturalDesign, reviewOwner, isReviewOwnerUpdateAcknowledged, industryType, industry, notes, improvementStatus, discoveryConfig, applications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkloadRequest {\n");
    sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    awsRegions: ").append(toIndentedString(awsRegions)).append("\n");
    sb.append("    nonAwsRegions: ").append(toIndentedString(nonAwsRegions)).append("\n");
    sb.append("    pillarPriorities: ").append(toIndentedString(pillarPriorities)).append("\n");
    sb.append("    architecturalDesign: ").append(toIndentedString(architecturalDesign)).append("\n");
    sb.append("    reviewOwner: ").append(toIndentedString(reviewOwner)).append("\n");
    sb.append("    isReviewOwnerUpdateAcknowledged: ").append(toIndentedString(isReviewOwnerUpdateAcknowledged)).append("\n");
    sb.append("    industryType: ").append(toIndentedString(industryType)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    improvementStatus: ").append(toIndentedString(improvementStatus)).append("\n");
    sb.append("    discoveryConfig: ").append(toIndentedString(discoveryConfig)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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
    openapiFields.add("WorkloadName");
    openapiFields.add("Description");
    openapiFields.add("Environment");
    openapiFields.add("AccountIds");
    openapiFields.add("AwsRegions");
    openapiFields.add("NonAwsRegions");
    openapiFields.add("PillarPriorities");
    openapiFields.add("ArchitecturalDesign");
    openapiFields.add("ReviewOwner");
    openapiFields.add("IsReviewOwnerUpdateAcknowledged");
    openapiFields.add("IndustryType");
    openapiFields.add("Industry");
    openapiFields.add("Notes");
    openapiFields.add("ImprovementStatus");
    openapiFields.add("DiscoveryConfig");
    openapiFields.add("Applications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateWorkloadRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateWorkloadRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateWorkloadRequest is not found in the empty JSON string", UpdateWorkloadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateWorkloadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateWorkloadRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("WorkloadName") != null && !jsonObj.get("WorkloadName").isJsonNull()) && !jsonObj.get("WorkloadName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkloadName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkloadName").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("Environment") != null && !jsonObj.get("Environment").isJsonNull()) && !jsonObj.get("Environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Environment").toString()));
      }
      // validate the optional field `Environment`
      if (jsonObj.get("Environment") != null && !jsonObj.get("Environment").isJsonNull()) {
        EnvironmentEnum.validateJsonElement(jsonObj.get("Environment"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("AccountIds") != null && !jsonObj.get("AccountIds").isJsonNull() && !jsonObj.get("AccountIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountIds` to be an array in the JSON string but got `%s`", jsonObj.get("AccountIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("AwsRegions") != null && !jsonObj.get("AwsRegions").isJsonNull() && !jsonObj.get("AwsRegions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AwsRegions` to be an array in the JSON string but got `%s`", jsonObj.get("AwsRegions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("NonAwsRegions") != null && !jsonObj.get("NonAwsRegions").isJsonNull() && !jsonObj.get("NonAwsRegions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `NonAwsRegions` to be an array in the JSON string but got `%s`", jsonObj.get("NonAwsRegions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("PillarPriorities") != null && !jsonObj.get("PillarPriorities").isJsonNull() && !jsonObj.get("PillarPriorities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `PillarPriorities` to be an array in the JSON string but got `%s`", jsonObj.get("PillarPriorities").toString()));
      }
      if ((jsonObj.get("ArchitecturalDesign") != null && !jsonObj.get("ArchitecturalDesign").isJsonNull()) && !jsonObj.get("ArchitecturalDesign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ArchitecturalDesign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ArchitecturalDesign").toString()));
      }
      if ((jsonObj.get("ReviewOwner") != null && !jsonObj.get("ReviewOwner").isJsonNull()) && !jsonObj.get("ReviewOwner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ReviewOwner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ReviewOwner").toString()));
      }
      if ((jsonObj.get("IndustryType") != null && !jsonObj.get("IndustryType").isJsonNull()) && !jsonObj.get("IndustryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IndustryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IndustryType").toString()));
      }
      if ((jsonObj.get("Industry") != null && !jsonObj.get("Industry").isJsonNull()) && !jsonObj.get("Industry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Industry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Industry").toString()));
      }
      if ((jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonNull()) && !jsonObj.get("Notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      if ((jsonObj.get("ImprovementStatus") != null && !jsonObj.get("ImprovementStatus").isJsonNull()) && !jsonObj.get("ImprovementStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImprovementStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImprovementStatus").toString()));
      }
      // validate the optional field `ImprovementStatus`
      if (jsonObj.get("ImprovementStatus") != null && !jsonObj.get("ImprovementStatus").isJsonNull()) {
        ImprovementStatusEnum.validateJsonElement(jsonObj.get("ImprovementStatus"));
      }
      // validate the optional field `DiscoveryConfig`
      if (jsonObj.get("DiscoveryConfig") != null && !jsonObj.get("DiscoveryConfig").isJsonNull()) {
        CreateWorkloadRequestDiscoveryConfig.validateJsonElement(jsonObj.get("DiscoveryConfig"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Applications") != null && !jsonObj.get("Applications").isJsonNull() && !jsonObj.get("Applications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Applications` to be an array in the JSON string but got `%s`", jsonObj.get("Applications").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateWorkloadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateWorkloadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateWorkloadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateWorkloadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateWorkloadRequest>() {
           @Override
           public void write(JsonWriter out, UpdateWorkloadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateWorkloadRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateWorkloadRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateWorkloadRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateWorkloadRequest
   */
  public static UpdateWorkloadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateWorkloadRequest.class);
  }

  /**
   * Convert an instance of UpdateWorkloadRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

