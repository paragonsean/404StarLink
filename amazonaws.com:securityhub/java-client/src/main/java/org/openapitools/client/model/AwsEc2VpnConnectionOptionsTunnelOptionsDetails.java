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
 * The VPN tunnel options.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2VpnConnectionOptionsTunnelOptionsDetails {
  public static final String SERIALIZED_NAME_DPD_TIMEOUT_SECONDS = "DpdTimeoutSeconds";
  @SerializedName(SERIALIZED_NAME_DPD_TIMEOUT_SECONDS)
  private Integer dpdTimeoutSeconds;

  public static final String SERIALIZED_NAME_IKE_VERSIONS = "IkeVersions";
  @SerializedName(SERIALIZED_NAME_IKE_VERSIONS)
  private List ikeVersions;

  public static final String SERIALIZED_NAME_OUTSIDE_IP_ADDRESS = "OutsideIpAddress";
  @SerializedName(SERIALIZED_NAME_OUTSIDE_IP_ADDRESS)
  private String outsideIpAddress;

  public static final String SERIALIZED_NAME_PHASE1_DH_GROUP_NUMBERS = "Phase1DhGroupNumbers";
  @SerializedName(SERIALIZED_NAME_PHASE1_DH_GROUP_NUMBERS)
  private List phase1DhGroupNumbers;

  public static final String SERIALIZED_NAME_PHASE1_ENCRYPTION_ALGORITHMS = "Phase1EncryptionAlgorithms";
  @SerializedName(SERIALIZED_NAME_PHASE1_ENCRYPTION_ALGORITHMS)
  private List phase1EncryptionAlgorithms;

  public static final String SERIALIZED_NAME_PHASE1_INTEGRITY_ALGORITHMS = "Phase1IntegrityAlgorithms";
  @SerializedName(SERIALIZED_NAME_PHASE1_INTEGRITY_ALGORITHMS)
  private List phase1IntegrityAlgorithms;

  public static final String SERIALIZED_NAME_PHASE1_LIFETIME_SECONDS = "Phase1LifetimeSeconds";
  @SerializedName(SERIALIZED_NAME_PHASE1_LIFETIME_SECONDS)
  private Integer phase1LifetimeSeconds;

  public static final String SERIALIZED_NAME_PHASE2_DH_GROUP_NUMBERS = "Phase2DhGroupNumbers";
  @SerializedName(SERIALIZED_NAME_PHASE2_DH_GROUP_NUMBERS)
  private List phase2DhGroupNumbers;

  public static final String SERIALIZED_NAME_PHASE2_ENCRYPTION_ALGORITHMS = "Phase2EncryptionAlgorithms";
  @SerializedName(SERIALIZED_NAME_PHASE2_ENCRYPTION_ALGORITHMS)
  private List phase2EncryptionAlgorithms;

  public static final String SERIALIZED_NAME_PHASE2_INTEGRITY_ALGORITHMS = "Phase2IntegrityAlgorithms";
  @SerializedName(SERIALIZED_NAME_PHASE2_INTEGRITY_ALGORITHMS)
  private List phase2IntegrityAlgorithms;

  public static final String SERIALIZED_NAME_PHASE2_LIFETIME_SECONDS = "Phase2LifetimeSeconds";
  @SerializedName(SERIALIZED_NAME_PHASE2_LIFETIME_SECONDS)
  private Integer phase2LifetimeSeconds;

  public static final String SERIALIZED_NAME_PRE_SHARED_KEY = "PreSharedKey";
  @SerializedName(SERIALIZED_NAME_PRE_SHARED_KEY)
  private String preSharedKey;

  public static final String SERIALIZED_NAME_REKEY_FUZZ_PERCENTAGE = "RekeyFuzzPercentage";
  @SerializedName(SERIALIZED_NAME_REKEY_FUZZ_PERCENTAGE)
  private Integer rekeyFuzzPercentage;

  public static final String SERIALIZED_NAME_REKEY_MARGIN_TIME_SECONDS = "RekeyMarginTimeSeconds";
  @SerializedName(SERIALIZED_NAME_REKEY_MARGIN_TIME_SECONDS)
  private Integer rekeyMarginTimeSeconds;

  public static final String SERIALIZED_NAME_REPLAY_WINDOW_SIZE = "ReplayWindowSize";
  @SerializedName(SERIALIZED_NAME_REPLAY_WINDOW_SIZE)
  private Integer replayWindowSize;

  public static final String SERIALIZED_NAME_TUNNEL_INSIDE_CIDR = "TunnelInsideCidr";
  @SerializedName(SERIALIZED_NAME_TUNNEL_INSIDE_CIDR)
  private String tunnelInsideCidr;

  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails() {
  }

  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails dpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
    this.dpdTimeoutSeconds = dpdTimeoutSeconds;
    return this;
  }

  /**
   * Get dpdTimeoutSeconds
   * @return dpdTimeoutSeconds
   */
  @javax.annotation.Nullable
  public Integer getDpdTimeoutSeconds() {
    return dpdTimeoutSeconds;
  }

  public void setDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
    this.dpdTimeoutSeconds = dpdTimeoutSeconds;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails ikeVersions(List ikeVersions) {
    this.ikeVersions = ikeVersions;
    return this;
  }

  /**
   * Get ikeVersions
   * @return ikeVersions
   */
  @javax.annotation.Nullable
  public List getIkeVersions() {
    return ikeVersions;
  }

  public void setIkeVersions(List ikeVersions) {
    this.ikeVersions = ikeVersions;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails outsideIpAddress(String outsideIpAddress) {
    this.outsideIpAddress = outsideIpAddress;
    return this;
  }

  /**
   * Get outsideIpAddress
   * @return outsideIpAddress
   */
  @javax.annotation.Nullable
  public String getOutsideIpAddress() {
    return outsideIpAddress;
  }

  public void setOutsideIpAddress(String outsideIpAddress) {
    this.outsideIpAddress = outsideIpAddress;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails phase1DhGroupNumbers(List phase1DhGroupNumbers) {
    this.phase1DhGroupNumbers = phase1DhGroupNumbers;
    return this;
  }

  /**
   * Get phase1DhGroupNumbers
   * @return phase1DhGroupNumbers
   */
  @javax.annotation.Nullable
  public List getPhase1DhGroupNumbers() {
    return phase1DhGroupNumbers;
  }

  public void setPhase1DhGroupNumbers(List phase1DhGroupNumbers) {
    this.phase1DhGroupNumbers = phase1DhGroupNumbers;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails phase1EncryptionAlgorithms(List phase1EncryptionAlgorithms) {
    this.phase1EncryptionAlgorithms = phase1EncryptionAlgorithms;
    return this;
  }

  /**
   * Get phase1EncryptionAlgorithms
   * @return phase1EncryptionAlgorithms
   */
  @javax.annotation.Nullable
  public List getPhase1EncryptionAlgorithms() {
    return phase1EncryptionAlgorithms;
  }

  public void setPhase1EncryptionAlgorithms(List phase1EncryptionAlgorithms) {
    this.phase1EncryptionAlgorithms = phase1EncryptionAlgorithms;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails phase1IntegrityAlgorithms(List phase1IntegrityAlgorithms) {
    this.phase1IntegrityAlgorithms = phase1IntegrityAlgorithms;
    return this;
  }

  /**
   * Get phase1IntegrityAlgorithms
   * @return phase1IntegrityAlgorithms
   */
  @javax.annotation.Nullable
  public List getPhase1IntegrityAlgorithms() {
    return phase1IntegrityAlgorithms;
  }

  public void setPhase1IntegrityAlgorithms(List phase1IntegrityAlgorithms) {
    this.phase1IntegrityAlgorithms = phase1IntegrityAlgorithms;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails phase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
    this.phase1LifetimeSeconds = phase1LifetimeSeconds;
    return this;
  }

  /**
   * Get phase1LifetimeSeconds
   * @return phase1LifetimeSeconds
   */
  @javax.annotation.Nullable
  public Integer getPhase1LifetimeSeconds() {
    return phase1LifetimeSeconds;
  }

  public void setPhase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
    this.phase1LifetimeSeconds = phase1LifetimeSeconds;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails phase2DhGroupNumbers(List phase2DhGroupNumbers) {
    this.phase2DhGroupNumbers = phase2DhGroupNumbers;
    return this;
  }

  /**
   * Get phase2DhGroupNumbers
   * @return phase2DhGroupNumbers
   */
  @javax.annotation.Nullable
  public List getPhase2DhGroupNumbers() {
    return phase2DhGroupNumbers;
  }

  public void setPhase2DhGroupNumbers(List phase2DhGroupNumbers) {
    this.phase2DhGroupNumbers = phase2DhGroupNumbers;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails phase2EncryptionAlgorithms(List phase2EncryptionAlgorithms) {
    this.phase2EncryptionAlgorithms = phase2EncryptionAlgorithms;
    return this;
  }

  /**
   * Get phase2EncryptionAlgorithms
   * @return phase2EncryptionAlgorithms
   */
  @javax.annotation.Nullable
  public List getPhase2EncryptionAlgorithms() {
    return phase2EncryptionAlgorithms;
  }

  public void setPhase2EncryptionAlgorithms(List phase2EncryptionAlgorithms) {
    this.phase2EncryptionAlgorithms = phase2EncryptionAlgorithms;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails phase2IntegrityAlgorithms(List phase2IntegrityAlgorithms) {
    this.phase2IntegrityAlgorithms = phase2IntegrityAlgorithms;
    return this;
  }

  /**
   * Get phase2IntegrityAlgorithms
   * @return phase2IntegrityAlgorithms
   */
  @javax.annotation.Nullable
  public List getPhase2IntegrityAlgorithms() {
    return phase2IntegrityAlgorithms;
  }

  public void setPhase2IntegrityAlgorithms(List phase2IntegrityAlgorithms) {
    this.phase2IntegrityAlgorithms = phase2IntegrityAlgorithms;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails phase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
    this.phase2LifetimeSeconds = phase2LifetimeSeconds;
    return this;
  }

  /**
   * Get phase2LifetimeSeconds
   * @return phase2LifetimeSeconds
   */
  @javax.annotation.Nullable
  public Integer getPhase2LifetimeSeconds() {
    return phase2LifetimeSeconds;
  }

  public void setPhase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
    this.phase2LifetimeSeconds = phase2LifetimeSeconds;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails preSharedKey(String preSharedKey) {
    this.preSharedKey = preSharedKey;
    return this;
  }

  /**
   * Get preSharedKey
   * @return preSharedKey
   */
  @javax.annotation.Nullable
  public String getPreSharedKey() {
    return preSharedKey;
  }

  public void setPreSharedKey(String preSharedKey) {
    this.preSharedKey = preSharedKey;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails rekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
    this.rekeyFuzzPercentage = rekeyFuzzPercentage;
    return this;
  }

  /**
   * Get rekeyFuzzPercentage
   * @return rekeyFuzzPercentage
   */
  @javax.annotation.Nullable
  public Integer getRekeyFuzzPercentage() {
    return rekeyFuzzPercentage;
  }

  public void setRekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
    this.rekeyFuzzPercentage = rekeyFuzzPercentage;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails rekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
    this.rekeyMarginTimeSeconds = rekeyMarginTimeSeconds;
    return this;
  }

  /**
   * Get rekeyMarginTimeSeconds
   * @return rekeyMarginTimeSeconds
   */
  @javax.annotation.Nullable
  public Integer getRekeyMarginTimeSeconds() {
    return rekeyMarginTimeSeconds;
  }

  public void setRekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
    this.rekeyMarginTimeSeconds = rekeyMarginTimeSeconds;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails replayWindowSize(Integer replayWindowSize) {
    this.replayWindowSize = replayWindowSize;
    return this;
  }

  /**
   * Get replayWindowSize
   * @return replayWindowSize
   */
  @javax.annotation.Nullable
  public Integer getReplayWindowSize() {
    return replayWindowSize;
  }

  public void setReplayWindowSize(Integer replayWindowSize) {
    this.replayWindowSize = replayWindowSize;
  }


  public AwsEc2VpnConnectionOptionsTunnelOptionsDetails tunnelInsideCidr(String tunnelInsideCidr) {
    this.tunnelInsideCidr = tunnelInsideCidr;
    return this;
  }

  /**
   * Get tunnelInsideCidr
   * @return tunnelInsideCidr
   */
  @javax.annotation.Nullable
  public String getTunnelInsideCidr() {
    return tunnelInsideCidr;
  }

  public void setTunnelInsideCidr(String tunnelInsideCidr) {
    this.tunnelInsideCidr = tunnelInsideCidr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2VpnConnectionOptionsTunnelOptionsDetails awsEc2VpnConnectionOptionsTunnelOptionsDetails = (AwsEc2VpnConnectionOptionsTunnelOptionsDetails) o;
    return Objects.equals(this.dpdTimeoutSeconds, awsEc2VpnConnectionOptionsTunnelOptionsDetails.dpdTimeoutSeconds) &&
        Objects.equals(this.ikeVersions, awsEc2VpnConnectionOptionsTunnelOptionsDetails.ikeVersions) &&
        Objects.equals(this.outsideIpAddress, awsEc2VpnConnectionOptionsTunnelOptionsDetails.outsideIpAddress) &&
        Objects.equals(this.phase1DhGroupNumbers, awsEc2VpnConnectionOptionsTunnelOptionsDetails.phase1DhGroupNumbers) &&
        Objects.equals(this.phase1EncryptionAlgorithms, awsEc2VpnConnectionOptionsTunnelOptionsDetails.phase1EncryptionAlgorithms) &&
        Objects.equals(this.phase1IntegrityAlgorithms, awsEc2VpnConnectionOptionsTunnelOptionsDetails.phase1IntegrityAlgorithms) &&
        Objects.equals(this.phase1LifetimeSeconds, awsEc2VpnConnectionOptionsTunnelOptionsDetails.phase1LifetimeSeconds) &&
        Objects.equals(this.phase2DhGroupNumbers, awsEc2VpnConnectionOptionsTunnelOptionsDetails.phase2DhGroupNumbers) &&
        Objects.equals(this.phase2EncryptionAlgorithms, awsEc2VpnConnectionOptionsTunnelOptionsDetails.phase2EncryptionAlgorithms) &&
        Objects.equals(this.phase2IntegrityAlgorithms, awsEc2VpnConnectionOptionsTunnelOptionsDetails.phase2IntegrityAlgorithms) &&
        Objects.equals(this.phase2LifetimeSeconds, awsEc2VpnConnectionOptionsTunnelOptionsDetails.phase2LifetimeSeconds) &&
        Objects.equals(this.preSharedKey, awsEc2VpnConnectionOptionsTunnelOptionsDetails.preSharedKey) &&
        Objects.equals(this.rekeyFuzzPercentage, awsEc2VpnConnectionOptionsTunnelOptionsDetails.rekeyFuzzPercentage) &&
        Objects.equals(this.rekeyMarginTimeSeconds, awsEc2VpnConnectionOptionsTunnelOptionsDetails.rekeyMarginTimeSeconds) &&
        Objects.equals(this.replayWindowSize, awsEc2VpnConnectionOptionsTunnelOptionsDetails.replayWindowSize) &&
        Objects.equals(this.tunnelInsideCidr, awsEc2VpnConnectionOptionsTunnelOptionsDetails.tunnelInsideCidr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpdTimeoutSeconds, ikeVersions, outsideIpAddress, phase1DhGroupNumbers, phase1EncryptionAlgorithms, phase1IntegrityAlgorithms, phase1LifetimeSeconds, phase2DhGroupNumbers, phase2EncryptionAlgorithms, phase2IntegrityAlgorithms, phase2LifetimeSeconds, preSharedKey, rekeyFuzzPercentage, rekeyMarginTimeSeconds, replayWindowSize, tunnelInsideCidr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2VpnConnectionOptionsTunnelOptionsDetails {\n");
    sb.append("    dpdTimeoutSeconds: ").append(toIndentedString(dpdTimeoutSeconds)).append("\n");
    sb.append("    ikeVersions: ").append(toIndentedString(ikeVersions)).append("\n");
    sb.append("    outsideIpAddress: ").append(toIndentedString(outsideIpAddress)).append("\n");
    sb.append("    phase1DhGroupNumbers: ").append(toIndentedString(phase1DhGroupNumbers)).append("\n");
    sb.append("    phase1EncryptionAlgorithms: ").append(toIndentedString(phase1EncryptionAlgorithms)).append("\n");
    sb.append("    phase1IntegrityAlgorithms: ").append(toIndentedString(phase1IntegrityAlgorithms)).append("\n");
    sb.append("    phase1LifetimeSeconds: ").append(toIndentedString(phase1LifetimeSeconds)).append("\n");
    sb.append("    phase2DhGroupNumbers: ").append(toIndentedString(phase2DhGroupNumbers)).append("\n");
    sb.append("    phase2EncryptionAlgorithms: ").append(toIndentedString(phase2EncryptionAlgorithms)).append("\n");
    sb.append("    phase2IntegrityAlgorithms: ").append(toIndentedString(phase2IntegrityAlgorithms)).append("\n");
    sb.append("    phase2LifetimeSeconds: ").append(toIndentedString(phase2LifetimeSeconds)).append("\n");
    sb.append("    preSharedKey: ").append(toIndentedString(preSharedKey)).append("\n");
    sb.append("    rekeyFuzzPercentage: ").append(toIndentedString(rekeyFuzzPercentage)).append("\n");
    sb.append("    rekeyMarginTimeSeconds: ").append(toIndentedString(rekeyMarginTimeSeconds)).append("\n");
    sb.append("    replayWindowSize: ").append(toIndentedString(replayWindowSize)).append("\n");
    sb.append("    tunnelInsideCidr: ").append(toIndentedString(tunnelInsideCidr)).append("\n");
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
    openapiFields.add("DpdTimeoutSeconds");
    openapiFields.add("IkeVersions");
    openapiFields.add("OutsideIpAddress");
    openapiFields.add("Phase1DhGroupNumbers");
    openapiFields.add("Phase1EncryptionAlgorithms");
    openapiFields.add("Phase1IntegrityAlgorithms");
    openapiFields.add("Phase1LifetimeSeconds");
    openapiFields.add("Phase2DhGroupNumbers");
    openapiFields.add("Phase2EncryptionAlgorithms");
    openapiFields.add("Phase2IntegrityAlgorithms");
    openapiFields.add("Phase2LifetimeSeconds");
    openapiFields.add("PreSharedKey");
    openapiFields.add("RekeyFuzzPercentage");
    openapiFields.add("RekeyMarginTimeSeconds");
    openapiFields.add("ReplayWindowSize");
    openapiFields.add("TunnelInsideCidr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2VpnConnectionOptionsTunnelOptionsDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2VpnConnectionOptionsTunnelOptionsDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2VpnConnectionOptionsTunnelOptionsDetails is not found in the empty JSON string", AwsEc2VpnConnectionOptionsTunnelOptionsDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2VpnConnectionOptionsTunnelOptionsDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2VpnConnectionOptionsTunnelOptionsDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DpdTimeoutSeconds`
      if (jsonObj.get("DpdTimeoutSeconds") != null && !jsonObj.get("DpdTimeoutSeconds").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DpdTimeoutSeconds"));
      }
      // validate the optional field `IkeVersions`
      if (jsonObj.get("IkeVersions") != null && !jsonObj.get("IkeVersions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("IkeVersions"));
      }
      // validate the optional field `OutsideIpAddress`
      if (jsonObj.get("OutsideIpAddress") != null && !jsonObj.get("OutsideIpAddress").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OutsideIpAddress"));
      }
      // validate the optional field `Phase1DhGroupNumbers`
      if (jsonObj.get("Phase1DhGroupNumbers") != null && !jsonObj.get("Phase1DhGroupNumbers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Phase1DhGroupNumbers"));
      }
      // validate the optional field `Phase1EncryptionAlgorithms`
      if (jsonObj.get("Phase1EncryptionAlgorithms") != null && !jsonObj.get("Phase1EncryptionAlgorithms").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Phase1EncryptionAlgorithms"));
      }
      // validate the optional field `Phase1IntegrityAlgorithms`
      if (jsonObj.get("Phase1IntegrityAlgorithms") != null && !jsonObj.get("Phase1IntegrityAlgorithms").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Phase1IntegrityAlgorithms"));
      }
      // validate the optional field `Phase1LifetimeSeconds`
      if (jsonObj.get("Phase1LifetimeSeconds") != null && !jsonObj.get("Phase1LifetimeSeconds").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Phase1LifetimeSeconds"));
      }
      // validate the optional field `Phase2DhGroupNumbers`
      if (jsonObj.get("Phase2DhGroupNumbers") != null && !jsonObj.get("Phase2DhGroupNumbers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Phase2DhGroupNumbers"));
      }
      // validate the optional field `Phase2EncryptionAlgorithms`
      if (jsonObj.get("Phase2EncryptionAlgorithms") != null && !jsonObj.get("Phase2EncryptionAlgorithms").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Phase2EncryptionAlgorithms"));
      }
      // validate the optional field `Phase2IntegrityAlgorithms`
      if (jsonObj.get("Phase2IntegrityAlgorithms") != null && !jsonObj.get("Phase2IntegrityAlgorithms").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Phase2IntegrityAlgorithms"));
      }
      // validate the optional field `Phase2LifetimeSeconds`
      if (jsonObj.get("Phase2LifetimeSeconds") != null && !jsonObj.get("Phase2LifetimeSeconds").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Phase2LifetimeSeconds"));
      }
      // validate the optional field `PreSharedKey`
      if (jsonObj.get("PreSharedKey") != null && !jsonObj.get("PreSharedKey").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PreSharedKey"));
      }
      // validate the optional field `RekeyFuzzPercentage`
      if (jsonObj.get("RekeyFuzzPercentage") != null && !jsonObj.get("RekeyFuzzPercentage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("RekeyFuzzPercentage"));
      }
      // validate the optional field `RekeyMarginTimeSeconds`
      if (jsonObj.get("RekeyMarginTimeSeconds") != null && !jsonObj.get("RekeyMarginTimeSeconds").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("RekeyMarginTimeSeconds"));
      }
      // validate the optional field `ReplayWindowSize`
      if (jsonObj.get("ReplayWindowSize") != null && !jsonObj.get("ReplayWindowSize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ReplayWindowSize"));
      }
      // validate the optional field `TunnelInsideCidr`
      if (jsonObj.get("TunnelInsideCidr") != null && !jsonObj.get("TunnelInsideCidr").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TunnelInsideCidr"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2VpnConnectionOptionsTunnelOptionsDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2VpnConnectionOptionsTunnelOptionsDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2VpnConnectionOptionsTunnelOptionsDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2VpnConnectionOptionsTunnelOptionsDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2VpnConnectionOptionsTunnelOptionsDetails>() {
           @Override
           public void write(JsonWriter out, AwsEc2VpnConnectionOptionsTunnelOptionsDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2VpnConnectionOptionsTunnelOptionsDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2VpnConnectionOptionsTunnelOptionsDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2VpnConnectionOptionsTunnelOptionsDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEc2VpnConnectionOptionsTunnelOptionsDetails
   */
  public static AwsEc2VpnConnectionOptionsTunnelOptionsDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2VpnConnectionOptionsTunnelOptionsDetails.class);
  }

  /**
   * Convert an instance of AwsEc2VpnConnectionOptionsTunnelOptionsDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

